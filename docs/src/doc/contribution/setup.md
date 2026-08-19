To build the Godot-JVM GDExtension, install the standard native build dependencies for your platform: SCons, Python, a C++ compiler, and a JDK. You do not need a Godot source checkout to build or test the extension.

Make sure Java is installed and that `JAVA_HOME` is set (**JDK 17 or newer is required for project development**).

!!! note
    To check whether `JAVA_HOME` is set, open a terminal and run:

    ```bash
    echo $JAVA_HOME
    ```

!!! warning
    The Microsoft JDK is known to cause issues when building the IDE plugin on Windows. Use [Adoptium Temurin](https://adoptium.net/temurin/releases/) or create the `Packages` directory in `JAVA_HOME`, for example `C:\Program Files\Microsoft\jdk-21.0.6.7-hotspot\Packages`.

## Build the native library

1. Clone the repository and its `godot-cpp` submodule:

    ```bash
    git clone --recurse-submodules git@github.com:utopia-rise/godot-jvm.git
    cd godot-jvm
    ```

2. Build the native library for the editor. This writes it to the harness addon's `libs` directory by default:

    ```bash
    scons platform=linux target=editor
    ```

    Replace `linux` with your target platform. Use `target=template_release` to build the release library used by exported projects.

3. Build the Kotlin artifacts:

    ```bash
    cd kt
    ./gradlew build
    ```

## Build Android

Android uses a Godot Android v2 plugin AAR because a GDExtension cannot access Godot's engine-internal JNI helpers. The Java plugin loads the native library and passes Android's existing `JavaVM` to the extension.

Install the Android SDK and NDK, then set `ANDROID_HOME` or `ANDROID_NDK_ROOT`. Build both targets for every supported ABI:

```bash
scons platform=android target=template_debug arch=arm64
scons platform=android target=template_release arch=arm64
scons platform=android target=template_debug arch=x86_64
scons platform=android target=template_release arch=x86_64
```

The libraries are written under `build/android/<debug|release>/<android-abi>`. Package them into the debug and release AARs with:

```bash
./kt/gradlew -p kt :android-plugin:assemble
```

The AARs are written to `kt/android-plugin/build/outputs/aar`. For a device test, copy them to `harness/tests/addons/jvm/libs/android/debug` and `harness/tests/addons/jvm/libs/android/release`, install Godot's Android build template, and enable **Use Gradle Build** in the export preset.

The harness has a `tests_android` export preset. After placing the debug AAR in the addon and installing the Android build template, export it with `./gradlew -p harness/tests exportAndroidDebug`, then install `harness/tests/export/tests.apk` on an emulator or device. The exported test runner reports `GODOT_JVM_TEST_RESULT:PASS` or `FAIL` to logcat.

## Run the harness project

The harness is an ordinary Godot project. Its addon is located at `harness/tests/addons/jvm` and its `jvm.gdextension` manifest loads the library built in the previous section.

1. Download the official Godot editor version supported by the branch and place it in `harness/tests/bin`.
2. Create an embedded JRE for the host platform:

    ```bash
    cd harness/tests
    jlink --add-modules java.base,java.logging --output jvm/jre-amd64-linux
    ```

3. Build and run the tests:

    ```bash
    ./gradlew build
    ./gradlew runGDTests
    ```

Use the official Godot editor to open the harness project when testing in the editor.
