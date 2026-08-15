The basic project setup is the same as for regular Godot-JVM projects.
Head over to the corresponding [getting started](../getting-started/requirements.md) guide to set up the basics of the project.

## Library specific setup

To build a reusable Godot-JVM library, enable library mode:

```kotlin
godot {
    isLibrary.set(true)
}
```

In this mode the plugin:

- keeps the enabled language compile setup and Godot dependencies
- skips registrar scanning, registrar generation, and `.gdj` generation
- skips `main.jar`, `godot-bootstrap.jar`, and the Godot project copy pipeline
- produces a regular library jar named after the Gradle project

The consuming Godot-JVM project will scan the library classes from its dependency graph and generate its own registrar files and `.gdj` files for them.

The main library-specific Gradle setting is `isLibrary`:

- `isLibrary = true` tells the plugin to build a reusable Godot-JVM library jar instead of running the local runtime packaging and registration pipeline

All registration-related settings only matter in the consuming Godot project, because that is where registrar files and `.gdj` files are actually generated.
