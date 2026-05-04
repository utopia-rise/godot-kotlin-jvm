The basic project setup is the same as for regular Godot Kotlin/JVM projects.
Head over to the corresponding [getting started](../getting-started/requirements.md) guide to set up the basics of the project.

## Library specific setup

To build a reusable Godot Kotlin/JVM library, enable library mode:

```kotlin
godot {
    isLibrary.set(true)
}
```

In this mode the plugin:

- keeps the Kotlin/Java/Scala compile setup and Godot dependencies
- skips entry scanning, entry generation, and `.gdj` generation
- skips `main.jar`, `godot-bootstrap.jar`, and the Godot project copy pipeline
- produces a regular library jar named after the Gradle project

The consuming Godot Kotlin/JVM project will scan the library classes from its dependency graph and generate its own entry files and `.gdj` files for them.

The following configuration properties for customizing the behaviour of your library are available to you in the `build.gradle.kts` file:

| Property                              | default value             | usage                                                                                                                                                                                                                                                                                                                         |
|---------------------------------------|---------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `isLibrary`                           | `false`                   | Enables library mode. Use this for artifacts meant to be consumed by another Godot Kotlin/JVM project. It disables the local runtime packaging and registration pipeline and leaves you with a regular publishable library jar.                                                                                             |
| `godotProjectDirectory`               | Gradle project directory  | Points to the Godot project root that contains `project.godot`. Change this when your Gradle project lives in a subdirectory or any non-standard layout. The build fails early if `project.godot` cannot be found there.                                                                                                 |
| `registrationNameMode`                | `SIMPLE_NAME`             | Controls how default registered class names are computed. Use `FQ_NAME` for fully qualified names, or `PROJECT_PREFIX` to prefix classes coming from external projects with their source project name.                                                                                                                       |
| `registrationFilesLayoutMode`         | `FLAT`                    | Controls how `.gdj` files are laid out inside each project directory. `FLAT` writes them directly under the project directory, while `HIERARCHICAL` mirrors the package path.                                                                                                                                               |
| `registrationFilesDirectory`          | `<godotProjectDirectory>/gdj` | Base directory used when a generated `.gdj` file does not already exist somewhere else in the Godot project. Existing `.gdj` files are discovered project-wide and updated in place. New files are copied into this directory while preserving their generated relative path.                                          |

When `isLibrary` is `true`, the `.gdj`-related settings are ignored for that library build itself. They still matter in the consuming Godot project, because that is where the actual `.gdj` files will be generated.
