---
hide:
  - navigation
---


[![GitHub](https://img.shields.io/github/license/utopia-rise/godot-kotlin-jvm?style=flat-square)](LICENSE)

Godot Kotlin/JVM is a Godot module which allows you to write your game or application logic in Kotlin on the JVM.

If you are looking for the documentation for Godot Kotlin/Native; you can find it [here](https://godot-kotlin.readthedocs.io/en/latest/).

## State
This project is in alpha, it is by no means production ready.

### What's not working
The items in this list are explicitly mentioned here as these will be implemented in future versions. Also consider the [Api Differences](user-guide/api-differences.md) section for general differences and limitations which will not be or cannot be adressed in the near forseable future or ever.

- Each registered constructor must have a unique number of arguments, constructor overloading is not yet supported
- No tool mode (you can set it already in the `@RegisterClass` annotation but it has no effect yet)
- No plugin support, you cannot use Godot Kotlin/JVM to write plugins and addons yet
- We support desktop OS (Linux, MacOS, Windows), Android and iOS.

### Bug reporting and Questions
If you find bugs, please report an [issue on github](https://github.com/utopia-rise/godot-kotlin-jvm/issues) - but check for duplicates first. If you have questions or need help, you can ask on [discord](https://discord.gg/zpb5Ru7v9x) in the channels `questions` and `help` respectively. If you don't have discord or don't want to use it, make a issue on github.

## Supported languages
The main language supported is Kotlin. We do however support Java experimentally. It should be possible to support other jvm base languages as well but this is not the focus of this project. If you want to have support for other languages, have a look at [support for other jvm based languages](contribution/support_for_other_jvm_based_languages.md).

## Supported kotlin version
This module relies on a kotlin compiler plugin for registering your classes and members to godot. As the compiler api from kotlin is not yet stable, we can only support specific kotlin version per release for now. 

The current latest release is compatible with kotlin version `1.7.20`.

## Custom engine builds
Get our pre built engine builds and export templates from the latest [GitHub release](https://github.com/utopia-rise/godot-kotlin-jvm/releases).

## Developer discussion
Ask questions and collaborate on [Discord](https://discord.gg/zpb5Ru7v9x)