package fr.virtualabs.dtmfuzz;

import com.android.internal.telephony.Call;
import com.android.internal.telephony.CallStateException;
import com.android.internal.telephony.Phone;
import com.android.internal.telephony.PhoneFactory;
import fr.virtualabs.dtmfuzz.R;

import java.io.File;
import java.io.IOException;


import android.media.MediaRecorder;
import android.os.Bundle;
import android.os.Environment;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

@SuppressLint("NewApi")
public class DTMFuzz extends Activity {

	private String TAG = "DTMFuzz";
	private MediaRecorder m_recorder = new MediaRecorder();
	private boolean m_recording = false;
	private TextView m_log = null;
	private TextView m_status = null;
	private ScrollView m_status_scroll = null;
	private Phone m_phone = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dtmfuzz);

		this.m_log = (TextView)this.findViewById(R.id.log);
		this.m_status = (TextView)this.findViewById(R.id.status);
		this.m_status.setText("Awaiting orders ...");
		this.m_status_scroll = (ScrollView)this.findViewById(R.id.scroll);
	}

	private void log(String msg) {
		this.m_log.setText(this.m_log.getText()+"\n"+msg);
		this.m_status_scroll.fullScroll(View.FOCUS_DOWN);
	}

	private void status(String msg) {
		this.m_status.setText(msg);
	}

    /**
     * Make phone dial a number
     */

	public boolean dial(String number) {
		Phone phone = PhoneFactory.getDefaultPhone();
		if (phone.getState() == Phone.State.IDLE) {
			try {
				status("Dialing "+number+" ...");
				log("[i] Dialing "+number);
				phone.dial(number);
			} catch (CallStateException e) {
				Log.e(TAG, "Cannot dial (CallStateException)");
				return false;
			}
			return true;
		}

		return false;
	}

    /**
     * Hangup
     */

	public boolean hangup() {
		Phone phone = PhoneFactory.getDefaultPhone();
		Call call = phone.getForegroundCall();
		if ((call!=null) && (call.getState() == call.state.ACTIVE)) {
			try {
				status("Hanging up");
				log("[i] Call hang up");
				call.hangup();
			} catch (CallStateException e) {
				return false;
			}
			return true;
		}
		else
			return false;
	}

    /**
     * Retrieve default phone instance. The application must be a system app
     * and run inside the com.android.phone process to access this instance.
     */

	public Phone getPhone() {
		m_phone = PhoneFactory.getDefaultPhone();
		return m_phone;
	}

	public boolean isActive() {
		Phone phone = PhoneFactory.getDefaultPhone();
		Call call = phone.getForegroundCall();
		return (call.getState() == call.state.ACTIVE);
	}

    /**
     * Send a DTMF charcode
     */

	public boolean dtmf(String code) {
		Phone phone = PhoneFactory.getDefaultPhone();
		Call call = phone.getForegroundCall();

		if ((call.getState() == call.state.ACTIVE) && (code.length()>=1)) {
			status("Sending DTMF: "+code);
			call.getPhone().sendDtmf(code.charAt(0));
			log("+ DTMF: "+code);
			status("Waiting DTMF");
			Log.d(TAG, "DTMF sent:" + code.charAt(0));
		}
		else
		{
			status("No active call !");
			Log.d(TAG, "No active call");
			return false;
		}
		return true;
	}

    /**
     * Conversation recording routine.
     * Stores data on the SD card (no check since it is a PoC, you
     * should add one here.
     *
     * Note that only the downlink is recorded (not the DTMF tones
     * sent to the remote service).
     */

	private void record(String filename) {
		if (!m_recording) {
			try {
		        String state = android.os.Environment.getExternalStorageState();
		        if (!state.equals(android.os.Environment.MEDIA_MOUNTED)) {
		            throw new IOException("SD Card is not mounted.  It is " + state
		                    + ".");
		        }

		        // make sure the directory we plan to store the recording in exists
		        File directory = new File(Environment.getExternalStorageDirectory().getAbsolutePath()
		                + "/sam.wav").getParentFile();
		        if (!directory.exists() && !directory.mkdirs()) {
		            throw new IOException("Path to file could not be created.");
		        }

		        log("[i] Starting recording to file "+filename+" ...");
		        m_recorder.setAudioSource(MediaRecorder.AudioSource.VOICE_DOWNLINK );
		        m_recorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
		        m_recorder.setAudioEncoder(MediaRecorder.AudioEncoder.DEFAULT);
		        m_recorder.setOutputFile(Environment.getExternalStorageDirectory().getAbsolutePath()
		                + "/"+filename);
		        m_recorder.prepare();
		        m_recorder.start();

		        m_recording = true;

		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		}
		else
		{
			Log.d(TAG, "Already recording !");
		}
	}

    /**
     * Stop conversation recording.
     */

	public void stopRecord() {
		if (m_recording) {
			log("[i] Stopping recording.");
			m_recorder.stop();
			m_recorder.reset();
			m_recorder.release();
			m_recording = false;
		}
	}
}
