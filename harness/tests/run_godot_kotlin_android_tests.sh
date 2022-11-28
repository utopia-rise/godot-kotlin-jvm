#!/bin/sh

echo "INFO: Uninstalling old app"
adb uninstall org.godotengine.godotkotlintests

echo "INFO: Installing android application"
adb install tests.apk

echo "INFO: Deleting old test results"
adb shell run-as org.godotengine.godotkotlintests rm files/test_results.xml

echo "INFO: Starting tests"
adb shell am start -n org.godotengine.godotkotlintests/com.godot.game.GodotApp

# 5 minutes
MAX_WAIT_TIME_SECONDS=300

SECONDS_PASSED=0

while [[ ! $(adb shell run-as org.godotengine.godotkotlintests ls files/test_results.xml 2> /dev/null) ]]
do
  echo "INFO: Tests not yet done"
  sleep 1
  SECONDS_PASSED=$(($SECONDS_PASSED + 1))

  if [ "$SECONDS_PASSED" -gt "$MAX_WAIT_TIME_SECONDS" ]; then
      echo "INFO: Waiting for test results timed out"
      exit 1
  fi
done

adb exec-out run-as org.godotengine.godotkotlintests cat files/test_results.xml > android_test_results.xml
echo "INFO: Got tests results"

if [[ ! $(grep '<testsuites name="GutTests" failures="0"' android_test_results.xml 2> /dev/null) ]]; then
  echo "ERROR: There were failing tests"
  exit 1
else
  echo "INFO: All tests passed"
fi
