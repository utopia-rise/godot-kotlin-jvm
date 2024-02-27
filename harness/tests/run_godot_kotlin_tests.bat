@echo off
setlocal enabledelayedexpansion

rem start command in background that we want to monitor
(start /b %1 -s --headless --path %cd% addons/gut/gut_cmdln.gd >temp.txt) 2>nul || echo

set tests=0
set passing=0
set jvm_closed=0
set result=0

for /F "delims=" %%l in (temp.txt) do (
    rem Output to the console and capture values
    echo %%l

    echo %%l | findstr /C:"Tests" >nul
    if errorlevel 1 set tests=%%l

    echo %%l | findstr /C:"Passing" >nul
    if errorlevel 1 set passing=%%l

    echo %%l | findstr /C:"Shutting down JVM" >nul
    if errorlevel 1 set jvm_closed=1
)

if %tests% equ 0 (
    echo ERROR: No tests were found.
    set result=1
    goto end
)

if %jvm_closed% equ 0 (
    echo ERROR: JVM has not closed properly !
    set result=1
    goto end
)

if not %tests% equ %passing% (
    echo ERROR: Some assertions failed!
    set result=1
    goto end
)

:end

rem Display the content of temp.txt
type temp.txt

exit %result%