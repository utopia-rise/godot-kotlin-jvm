---
hide:
  - navigation
---


[![GitHub](https://img.shields.io/github/license/utopia-rise/godot-kotlin-jvm?style=flat-square)](LICENSE)

**Godot Kotlin/JVM** is a Godot module which allows you to write your game or application logic in Kotlin on the JVM.

If you are looking for the documentation for Godot Kotlin/Native; you can find it [here](https://godot-kotlin.readthedocs.io/en/latest/).

## State

This project is in alpha, it is by no means production ready.

### What's not working

The items in this list are explicitly mentioned here as these will be implemented in future versions.
Also consider the [API Differences](user-guide/api-differences.md) section for general differences
and limitations which will not be or cannot be adressed in the near forseable future or ever.

- Each registered constructor must have a unique number of arguments, constructor overloading is not yet supported.
- No tool mode (you can set it already in the `@RegisterClass` annotation but it has no effect yet).
- No plugin support, you cannot use Godot Kotlin/JVM to write plugins and addons yet.
- We support desktop OS (Linux, MacOS, Windows), Android and iOS.

### Bug reporting and questions

If you find bugs, please report an [issue on GitHub](https://github.com/utopia-rise/godot-kotlin-jvm/issues) - but check for duplicates first. If you have questions or need help, you can ask on [Discord](https://discord.gg/zpb5Ru7v9x) in the `questions` and `help` channels respectively.
If you don't have Discord or you don't want to use it, please file an issue on GitHub.

## Supported languages

The main language supported is Kotlin. We do however support Java experimentally. It should be possible to support other JVM-based languages as well but this is not the focus of this project. If you want to have support for other languages, have a look at [support for other JVM-based languages](contribution/support-for-other-jvm-based-languages.md).

## Supported Kotlin version

This module relies on a Kotlin *compiler plugin* for registering your classes and members to Godot. As the compiler API from Kotlin is not stable yet, at the moment we can only support specific Kotlin version per release.

The current latest release is compatible with Kotlin version `1.9.23`.

!!! info
    It is possible to use this module with other Kotlin versions as well but we do not provide any guarantees for it. You find more infos in the [Gradle Plugin configuration](user-guide/advanced/gradle-plugin-configuration.md#disable-build-failure-on-kotlin-version-mismatch) section.

## Custom engine builds

Get our pre-built engine builds and export templates from the latest [GitHub releases](https://github.com/utopia-rise/godot-kotlin-jvm/releases).

Contrary to the official binaries, there are two builds of the editor per Platform: debug and release.
`release` editors are the editors you use normally. `debug` editors provide debug symbols and are intended to provide better stacktraces in case of crashes of the editor. Please use those when submitting bugreports. 

!!! warning
    This module will NOT work with the official Godot Editor and Export Templates! To be able to use Kotlin and Java scripts in Godot, you need our Editor and Export Templates builds.

## Developer discussion

Please feel free to ask questions and collaborate on our [Discord](https://discord.gg/zpb5Ru7v9x) server.