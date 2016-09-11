echo off
cls
set /p userinput="Enter IP address: " %=%
cd "C:\Program Files\Android\android-sdk\platform-tools"
adb connect %userinput%
PAUSE
