Before everything else, you need to install [SDKMAN!](https://sdkman.io) as we will use it the next sections. Installation instructions can be found [here](https://sdkman.io/install). When you are done, open up your terminal.

## Java
To use this module, at least Java 1.8 is required. Install it by running the following in your terminal:

```sh
sdk install java 1.12.0-zulu
```

## Gradle
[Gradle](https://gradle.org) is used to build your code and manage your dependencies. In your terminal run the following to install it:

```sh
sdk install gradle 7.0
```

## IDE
There is currently no plan to support the built-in Godot editor, using [IntelliJ IDEA](https://jetbrains.com/idea) is strongly recommended (the community edition is free). Editors such as VSCode can be used, however, we only provide first class support for IntelliJ IDEA. You can install it via [JetBrains Toolbox](https://www.jetbrains.com/toolbox-app/) app.

### Intellij IDEA plugin
We also recommend installing our [IntelliJ IDEA plugin](https://plugins.jetbrains.com/plugin/16505-godot-jvm) as it provides you with a lot of useful checks and helpers to detect errors during development.

## Godot Editor
You can download our custom engine build and export templates from the latest [github release](https://github.com/utopia-rise/godot-kotlin-jvm/releases). If you need other modules you can also [build it yourself]((../contribution/setup.md)).