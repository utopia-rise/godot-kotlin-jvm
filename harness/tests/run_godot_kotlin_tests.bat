@echo off
setlocal enabledelayedexpansion

set tests=0
set passing=0
set isJvmClosed=0

echo %cd%

FOR /F "tokens=* USEBACKQ" %%F IN (`%~dp0 -s --headless --path "%cd%"" addons/gut/gut_cmdln.gd`) DO (
    ECHO %%F

    REM Capture the number of tests
    echo %%F | findstr /C:"Tests" 1>nul
    IF !ERRORLEVEL! EQU 0 (
        FOR /F "tokens=2 USEBACKQ" %%G IN ('echo %%F') DO set tests=%%G
    )

    REM Capture the number of passing tests
    echo %%F | findstr /C:"Passing" 1>nul
    IF !ERRORLEVEL! EQU 0 (
        FOR /F "tokens=2 USEBACKQ" %%G IN ('echo %%F') DO set passing=%%G
    )

    REM Capture if JVM has closed
    echo %%F | findstr /C:"Shutting down JVM ..." 1>nul
    IF !ERRORLEVEL! EQU 0 SET isJvmClosed=1
)

IF %tests% EQU 0 (
    ECHO ERROR: No tests were found.
    exit 1
)

IF !isJvmClosed! EQU 0 (
    ECHO ERROR: JVM has not closed properly!
    exit 1
)

IF !tests! EQU !passing! (
    ECHO Tests passed successfully!
    exit 0
) ELSE (
    ECHO ERROR: Some assertions failed!
    exit 1
)