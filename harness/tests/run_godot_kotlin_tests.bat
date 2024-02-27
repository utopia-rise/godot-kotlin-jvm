@echo off
setlocal enabledelayedexpansion

rem start command in background that we want to monitor
(%1 -s --headless --path %cd% addons/gut/gut_cmdln.gd >temp.txt) 2>nul || echo

set /a test_count=0
set /a passed_test_count=0
set jvm_closed=false

for /f "delims=" %%i in (temp.txt) do (
    echo %%i | findstr /C:"Tests" 1>nul && set /a test_count+=1
    echo %%i | findstr /C:"Passing" 1>nul && set /a passed_test_count+=1
    echo %%i | findstr /C:"Shutting down JVM" 1>nul && set jvm_closed=true
)

if !test_count!==0 (
    echo No tests found
    exit /b 1
)

if not !test_count!==!passed_test_count! (
    echo Some assertions failed
    exit /b 1
)

if !jvm_closed!==false (
    echo JVM did not close properly
    exit /b 1
)

echo All tests passed
exit /b 0
Endlocal