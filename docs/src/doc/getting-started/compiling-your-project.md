To compile your project, run a classic *Gradle build*. By default this creates a `debug` version of your code.

Using the Godot editor:

After this action, all required files should be generated, and you can safely build the project using the `Build` button at the top-right of the editor window.
![Build button](../assets/img/editor-plugin/build_button.png)

Using your IDE:

![Gradle task](../assets/img/build_ide.png)

Using command-line:

```bash
./gradlew build
```

## Targets

We have two targets: `debug` and `release`.
In order to build in release, you should add `release` parameter to your Gradle build command.

Example:

```bash
./gradlew build -Prelease
```

Using debug builds is recommended when developing. It adds some sanity checks that are cut off in `release`.  

Release builds are recommended when distributing to retail.