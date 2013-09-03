import subprocess
from gadget.proto import Application
from time import sleep
from yaml import load
from random import randint,choice

def send_fuzzy_dtmf(iface, count=10):
    for i in range(count):
        # choose a random delay
        delay = randint(1,3)
        # choose a random dtmf char
        dchar = choice('0123456789*#')
        iface.dtmf(dchar)
        sleep(delay)

if __name__ == '__main__':
    # debug
    try:
        app = Application(('127.0.0.1',4444),'fr.virtualabs.dtmfuzz')

        # wait for the activity to show up
        print '[i] Waiting for DTMFuzz to be launched ...'
        while len(app.listActivities()) == 0:
            sleep(1)
        print '[i] Connected to DTMFuzz =)'
        act = app.listActivities()[0]

        # try to call the answering machine
        print '[i] Calling 0660660001 ...'
        act.dial('0660660001')
        act.record('demo.3gp')
        sleep(6)

        print '[i] Starting fuzzing ...'
        send_fuzzy_dtmf(act)

        print '[i] Hanging up ...'
        act.hangup()
        act.stopRecord()

        print '[i] Retrieve conversation record ...'
        subprocess.call(['adb','pull','/sdcard/demo.3gp'])
        print '[i] All done.'

        # find our activity
        act = app.listActivities()[0]
    except Exception, e:
        print e
        print '[!] Unable to connect to Gadget. Please check if Gadget is launched.'
