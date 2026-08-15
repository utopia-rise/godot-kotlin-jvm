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
