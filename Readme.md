Fino compatible DTMF Fuzzer
===========================

This software is a DTMF fuzzer for Android and requires Fino/Gadget to work properly.

The software is splitted in two parts:
* an Android system application compatible with CyanogenMod ROMs
* a python script using gadget-client library and interfacing with the Android app

Both are required to run the demo shown at Hack In Paris 2013.

How to try it
-------------

* Make sure to have Gadget installed on your smartphone (see our Gadget repository for the APK)
* Install the DTMF fuzzer APK trough ADB in /system/app/ and check if it appears in the list of the installed applications

  # adb remount
  # adb push dtmf-fuzzer.apk /system/app/

* Run gadget
* Forward TCP port 4444 through ADB: adb forward tcp:4444 tcp:4444

  # adb forward tcp:4444 tcp:4444

* Make sure to have the gadget-client library installed (or present in the same directory)
* Change the dialed number in script/dtmfuzz.py and save
* Launch script/dtmfuzz.py and see the magic

If you have trouble testing this PoC, feel free to contact us at:
* Twitter: @virtualabs
* Email: d.cauquil -at- sysdream -dot- com


Hack In Paris 2013 slides: http://kaiyou.fr/files/2013/06/main.pdf
Hack In Paris 2013 video: https://www.youtube.com/watch?v=Tv5bmlPXyFU
