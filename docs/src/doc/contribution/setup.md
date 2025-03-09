To build our module, you need the same dependencies as the ones described in the
[official Godot documentation](https://docs.godotengine.org/en/stable/development/compiling/index.html).
Before building the engine, we invite you to read this document until the end.

Make sure that Java is installed and its `PATH` set in your system as well (**at least Java 11 is needed**).

!!! note
    To check if Java is installed on your platform, open a terminal and type the following command:
    ```bash
    echo $JAVA_HOME
    ```
    If the command outputs a directory path, then Java is installed on your system. Otherwise, we strongly suggest you
    to install the JDK using [winget](https://learn.microsoft.com/en-us/windows/package-manager/winget/), [chocolatey](https://chocolatey.org/), [SDKMAN!](https://sdkman.io/), or another package manager for windows.

!!! warning
    The microsoft jdk is known for causing issues on windows while building code for our IDE plugin. The issue is the same as described in [this issue](https://github.com/microsoft/openjdk/issues/339).    
    Either use a different jvm vendor like [Adoptium temurin](https://adoptium.net/temurin/releases/) or create the folder `Packages` manually in the `JAVA_HOME` folder: `'C:\Program Files\Microsoft\jdk-21.0.6.7-hotspot\Packages` in order to build our module.

Once you have all the necessary dependencies, proceed to do the following:

1. Clone Godot's repository with the stable tag you want to develop for. Notice that the branch tag must be
aligned to the current binding's version (e.g., current version `0.10.0-4.3.0`, we need Godot at `4.3.0` version).

```bash
git clone git@github.com:godotengine/godot.git --branch 4.3-stable --recursive
```

2. In the `godot` directory, run the following command:
```bash
git submodule add git@github.com:utopia-rise/godot-kotlin-jvm.git modules/kotlin_jvm
```

3. Once the [git submodule](https://git-scm.com/book/en/v2/Git-Tools-Submodules) is added, change your directory to `godot`, and build the engine with our module:
```bash
scons platform=linuxbsd # your target platform (windows, macos, ...)
```

4. Build the sample following these steps:
    1. Navigate to `<module-root>/harness/tests`
    2. Create an embedded Java Virtual Machine:
        - For `amd64` systems:
          - `jlink --add-modules java.base,java.logging --output jvm/jre-amd64-<platform ex. linux>`
        - For `arm64` (macOS with **Apple Silicon** chips) systems:
          - `jlink --add-modules java.base,java.logging --output jvm/jre-arm64-<platform ex. macos>`
        - If you want to remote debug add module `jdk.jdwp.agent` to command.
        - If you want to enable `jmx`, add `jdk.management.agent` to command.
    3. Then build the project using the Gradle wrapper.
        - Windows: `gradlew build`
        - Unix: `./gradlew build`

5. To run the engine, run `godot.linuxbsd.editor.x86_64` (or the equivalent of your platform) located in the `bin` folder of `godot`.

6. To debug your JVM code, you should start Godot with command line `--jvm-debug-port=XXXX`, where `XXXX`
stands for the JMX port of you choice.
You can then set up [remote debug configuration in Intellij IDEA](https://www.jetbrains.com/help/idea/tutorial-remote-debug.html).


## Publishing locally

To publish our artifacts locally, you'll need to run the following command:
```bash
./gradlew :tools-common:publishToMavenLocal publishToMavenLocal && ./gradlew publishToMavenLocal -Prelease=true
```

Check in you maven local repository what is the version you've just published, doing the following:

```bash
ls ~/.m2/repository/com/utopia-rise/godot-gradle-plugin
```

The version should look something like this: `0.7.2-4.1.2-c8df371-SNAPSHOT`.

Your test project should use `mavenLocal()` in the repositories block in `build.gradle.kts` and the following in `settings.gradle.kts`:

```kotlin
pluginManagement {
    repositories {
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
        google()
    }

    resolutionStrategy.eachPlugin {
        if (requested.id.id == "com.utopia-rise.godot-kotlin-jvm") {
            useModule("com.utopia-rise:godot-gradle-plugin:${requested.version}")
        }
    }
}
```

## Important notes

When you build a sample, it generates a `godot-bootstrap.jar` in `build/libs`.
This JAR is needed by the engine to function correctly. You need to copy this jar to `<godot-root>/bin`.
If you want to automate that, consider using the following Gradle task in the samples `build.gradle.kts` - but, please,
**don't commit it**!

```kt
afterEvaluate {
    tasks {
        val bootstrapJar = getByName("bootstrapJar")
        val copyBootstrapJar by creating(Copy::class.java) {
            group = "godot-jvm"
            from(bootstrapJar)
            destinationDir = File("${projectDir.absolutePath}/../../../../bin/")
            dependsOn(bootstrapJar)
            println(File("${projectDir.absolutePath}/../../../../bin/").absolutePath)
        }
        build.get().dependsOn(copyBootstrapJar)
    }
}
```

If you build the libs from `<module-root>/kt` then this copy task is already present and executed automatically for you.
