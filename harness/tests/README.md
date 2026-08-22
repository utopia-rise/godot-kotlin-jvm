# Unit tests for Godot-JVM

## Setup instructions
### Gradle task
The simplest way to run the tests is to run them via gradle: `gradlew runTests`

The output is written to `test_output.txt`.

### In Editor
Test tasks only run tests; they never build, import, export, or create a native image. Prepare the project explicitly before running one:

```shell
gradlew build
gradlew importResources
gradlew runGDTests
```

Godot currently has some problems with plugin resources so you either need to start the editor twice (only for the first time) before you can start the tests in the editor, or import first using the command above.

The GraalVM Native Image variants use the same test project. After configuring `GRAALVM_HOME`, prepare and run the editor variant explicitly:

```shell
gradlew build
gradlew importResources
gradlew buildGraalNativeImage
gradlew runGraalGDTests
```

For exports, run `buildGraalNativeImage`, then `exportDebug` or `exportRelease`, before `runExportedGraalGDTests`. Export presets include both runtimes.
