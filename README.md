# Godot Kotlin/JVM
## Kotlin/JVM binding for the Godot Game Engine

<p align="center">
<img src=".README/logo.png" width="30%" height="30%">
</p>

## Overview

This is a [**Kotlin**](https://kotlinlang.org) language binding for the [**Godot**](https://godotengine.org/) game engine.
It is built as a module (like the C# binding) to interact with **Godot**'s core internally.

The binding provides you Godot API's as [Kotlin classes](https://godot-kotl.in/en/stable/getting-started/your-first-class/),
so you can write your game logic completely in Kotlin.

### Code Distribution

There are two methods for distributing JVM bytecode produced by the Kotlin compiler:

1.  A classic JAR file: your code will be packed into a `.jar` file, which is then executed by an embedded JVM.
    So the developer does not have to worry about their user installing a JRE. The JVM is already embedded in your game executable.
2.  Dynamic Library using GraalVM Native Image: please read more about this in our [documentation page](https://godot-kotl.in/en/stable/user-guide/advanced/graal-vm-native-image/).

Just write your game scripts like you would for [GDScript](https://docs.godotengine.org/en/4.2/getting_started/scripting/gdscript/gdscript_basics.html)
or for [C#](https://docs.godotengine.org/en/3.1/getting_started/scripting/c_sharp/) but with all the syntactic sugar of Kotlin.

[![GitHub](https://img.shields.io/github/license/utopia-rise/godot-kotlin-jvm?style=flat-square)](LICENSE)

## Important Notes

This version of the binding is currently **Alpha**! This means that the bindings are not
production-ready. However, if you are curious in using Kotlin in Godot, this is a good opportunity
to help us in improving the project!

## Documentation

The documentation can be found [here](https://godot-kotl.in). It's a work in progress, and we would love your input to
make it even better!

## Developer Discussion & Contribution

Join us on our [Discord](https://discord.gg/zpb5Ru7v9x) server to ask questions and work together
with a friendly community.

If you want to contribute to the project, please read through the [contribution guidelines](https://godot-kotl.in/en/stable/contribution/guidelines/)
and the [setup](https://godot-kotl.in/en/stable/contribution/setup/) sections.

## Partners

JetBrains is helping us to develop this project by providing development tools to maintainers.
Intellij IDEA is our IDE of choice for Kotlin development and we strongly recommend using it.

[![jblogo](.README/jetbrains.svg)](https://www.jetbrains.com/)
