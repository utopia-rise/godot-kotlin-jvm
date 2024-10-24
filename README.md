# Godot Kotlin/JVM
## Kotlin/JVM binding for the Godot Game Engine

<p align="center">
<img src=".README/logo.png" width="30%" height="30%">
</p>

[![GitHub](https://img.shields.io/github/license/utopia-rise/godot-kotlin-jvm?style=for-the-badge)](LICENSE)
[![Discord](https://img.shields.io/discord/675058327088136212?style=for-the-badge&label=Discord)](https://discord.gg/zpb5Ru7v9x)
[![Website](https://img.shields.io/website?url=https%3A%2F%2Fgodot-kotl.in%2Fen%2Fstable%2F&style=for-the-badge&label=Documentation)](https://godot-kotl.in/en/stable/)

## Overview

This is a [**Kotlin**](https://kotlinlang.org) language binding for the [**Godot**](https://godotengine.org/) game engine.
It is built as a module (like the C# binding) to interact with **Godot**'s core internally.

The binding provides you Godot API's as [Kotlin classes](https://godot-kotl.in/en/stable/getting-started/your-first-class/),
so you can write your game logic completely in Kotlin.

You can find project examples in those repositories:

- [Minimal project template](https://github.com/utopia-rise/godot-kotlin-project-template)
- [GDQuest 3D demo converted to Kotlin](https://github.com/utopia-rise/godot-kotlin-3d-demo)

### Code Distribution

There are two methods for distributing JVM bytecode produced by the Kotlin compiler:

1.  A classic JAR file: your code will be packed into a `.jar` file, which is then executed by an embedded JVM.
    So the developer does not have to worry about their user installing a JRE. The JVM is already embedded in your game executable.
2.  Dynamic Library using GraalVM Native Image: please read more about this in our [documentation page](https://godot-kotl.in/en/stable/user-guide/advanced/graal-vm-native-image/).

Just write your game scripts like you would for [GDScript](https://docs.godotengine.org/en/4.2/getting_started/scripting/gdscript/gdscript_basics.html)
or for [C#](https://docs.godotengine.org/en/3.1/getting_started/scripting/c_sharp/) but with all the syntactic sugar of Kotlin.

## Important Notes

This version of the binding is currently in **Beta**! While you can fully use the binding, please note that there might still be breaking API changes. We welcome any suggestions you have for improving the project and its API.

To be able to use this binding, you need to download our custom editor build and export templates from the [GitHub releases page](https://github.com/utopia-rise/godot-kotlin-jvm/releases)! The official godot binaries will NOT work!

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

<a href="https://jetbrains.com">
    <img width="256" alt="JetBrains logo" src="https://resources.jetbrains.com/storage/products/company/brand/logos/jetbrains.png" />
</a>

## Special thanks

We'd like to give a special thanks to [MOE](https://multi-os-engine.org/) community. They helped us a lot to get iOS
platform working. If you intend to create a multi platform mobile app (not game), check out their project.
