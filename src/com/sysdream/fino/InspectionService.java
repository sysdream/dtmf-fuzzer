package com.sysdream.fino;

import java.util.ArrayList;
import java.io.File;

import android.app.Service;
import android.content.Intent;
import android.content.Context;
import android.os.IBinder;
import android.os.Bundle;
import android.util.Log;
import android.app.Activity;

import dalvik.system.DexClassLoader;

/**
 * Provide a full featured remote inspection interface as specified in the
 * <code>IInspectionService</code> interface.
 *
 * @author <a href="mailto:p.jaury@sysdream.com">Pierre Jaury</a>
 * @version 1.0
 */
public class InspectionService
    extends Service
{
    /**
     * Entry points list
     */
    private ArrayList<Object> entryPoints = new ArrayList<Object>();


    /**
     * Prepare the inspection by registering first entry points.
     *
     */
    public void onCreate
	()
    {
    File dex_dir = null;
    File outdex_dir = null;

	super.onCreate();
	
    /*
     * Flush macro files and optimized dex files
     */
	try {
		dex_dir = new File(getDir("dex", Context.MODE_PRIVATE).getAbsolutePath());
		for (File f : dex_dir.listFiles()) {
			if (f.isFile())
				f.delete();
		}
		outdex_dir = new File(this.getDir("outdex", Context.MODE_PRIVATE).getAbsolutePath());
		for (File f : outdex_dir.listFiles()) {
			if (f.isFile())
				f.delete();
		}
	} catch (Exception e) {
		Log.e("Fino", "Unable to flush macro files and odex files");
	}

    /*
     * Add the default entry points to the list
     */
    if(!entryPoints.contains(true)) {
        entryPoints.add(this.getApplication());
    }
    }

    /**
     * Bind to the service.
     *
     * @param e the binding intent
     * @return a binder instance
     */
    public IBinder onBind
	(final Intent e)
    {
	/*
	 * Initializing the actual service
	 */
	return new InspectionStub
	    (entryPoints,
	     getApplicationContext());
    }
}
