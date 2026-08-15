# Unit tests for Godot-JVM

## Setup instructions
### Gradle task
The simplest way to run the tests is to run them via gradle: `gradlew runTests`

The output is written to `test_output.txt`.

### In Editor
In order to run the tests in the editor, you first need to reimport the assets. Godot currently has some problems with plugin resources so you either need to start the editor twice (only for the first time) before you can start the tests in the editor, or you need to import first using this command: `godot --headless --import` before opening the godot editor.
