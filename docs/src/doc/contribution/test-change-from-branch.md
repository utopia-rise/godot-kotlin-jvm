To test a branch in your own project, build its Gradle artifacts locally and replace the native library in the project's Godot-JVM addon.

!!! warning
    Back up your project before testing unreleased changes.

!!! warning
    If you republish changes locally under the same snapshot version, Gradle may keep using cached plugin artifacts. Rerun your project build with `--refresh-dependencies` (for example, `./gradlew --refresh-dependencies build`) to use the republished artifacts.

1. Ensure `JAVA_HOME` is set. JDK 17 or newer is required.
2. Download the Godot-JVM addon release for the branch's minimum supported Godot version and extract it into your project's root. Confirm that `addons/jvm/jvm.gdextension` exists.
3. Clone this repository and switch to the branch you want to test:

    ```bash
    git clone --recurse-submodules git@github.com:utopia-rise/godot-jvm.git
    cd godot-jvm
    git checkout <branch-name>
    ```

4. Publish the branch's Gradle artifacts locally:

    ```bash
    cd kt
    ./gradlew publishArtifactsToMavenLocal
    ```

5. Build the native GDExtension directly into your project's addon. Run this from the repository root and replace the platform and absolute project path as needed:

    ```bash
    scons platform=linux target=editor target_path=/absolute/path/to/your-project/addons/jvm/libs/
    ```

6. Configure your project's `settings.gradle.kts` to use `mavenLocal()`:

    ```kotlin
    pluginManagement {
        repositories {
            mavenLocal()
            mavenCentral()
            gradlePluginPortal()
            google()
        }
    }

    rootProject.name = "your-project-name"
    ```

7. Find the published snapshot version in `~/.m2/repository/com/utopia-rise/godot-gradle-plugin/` and use that exact version in your project.
8. Build the project, then open or run it with the official Godot editor version supported by the branch.
