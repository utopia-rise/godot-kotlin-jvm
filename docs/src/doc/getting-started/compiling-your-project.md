To compile your project, run a classic *Gradle build*. By default this creates a `debug` version of your code.

Using the Godot editor:

![Build button](../assets/img/editor-plugin/build_button.png)

Using your IDE:

![Gradle task](../assets/img/build_ide.png)

Using command-line:

/// tab | Windows
```shell
gradlew build
```
///

/// tab | Unix
```bash
./gradlew build
```
///


## Targets

We have two targets: `debug` and `release`.
In order to build in release, you should add `release` parameter to your Gradle build command.

Example:

/// tab | Windows
```shell
gradlew build -Prelease
```
///

/// tab | Unix
```bash
./gradlew build -Prelease
```
///

Using debug builds is recommended when developing. It adds some sanity checks that are cut off in `release`.  

Release builds are recommended when distributing to retail.