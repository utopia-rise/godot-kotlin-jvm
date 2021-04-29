## Java
To use this module at least JDK 11 is needed, note you will need the JDK not just the JRE, and the environment variable `JAVA_HOME` to be present before being able to run the custom godot editor.

### Mac & Linux

You can install Java via [SDKMAN!](https://sdkman.io/). Once you installed it, you can run `sdk install java 11.0.11.hs-adpt` to install the LTS version of Java from [AdoptOpenJDK](https://adoptopenjdk.net/). If you want to pick a different version, you can run `sdk list java`.

### Windows

You can install Java via [Chocolatey](https://community.chocolatey.org/). For example, to install [AdoptOpenJDK](https://adoptopenjdk.net/) you can run `choco install adoptopenjdk11`.

## IDE
There is currently no plan to support the built-in Godot editor, using [IntelliJ IDEA](https://jetbrains.com/idea) is strongly recommended (the community edition is free). Editors such as VSCode can be used, however, we only provide first class support for IntelliJ IDEA. You can install it via [JetBrains Toolbox](https://www.jetbrains.com/toolbox-app/) app.

### Intellij IDEA plugin
We also recommend installing our [IntelliJ IDEA plugin](https://plugins.jetbrains.com/plugin/16505-godot-jvm) as it provides you with a lot of useful checks and helpers to detect errors during development.

## Godot Editor
You can download our custom engine build and export templates from the latest [github release](https://github.com/utopia-rise/godot-kotlin-jvm/releases). If you need other modules you can also [build it yourself](../contribution/setup.md).
