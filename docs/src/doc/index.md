---
hide:
  - navigation
---


[![GitHub](https://img.shields.io/github/license/utopia-rise/godot-kotlin-jvm?style=flat-square)](LICENSE)

**Godot Kotlin/JVM** is a Godot module which allows you to write your game or application logic in Kotlin on the JVM.

If you are looking for the documentation for Godot Kotlin/Native; you can find it [here](https://godot-kotlin.readthedocs.io/en/latest/).

## State

This project is in Beta. While you can fully use the binding, please note that there might still be breaking API changes. We welcome any suggestions you have for improving the project and its API.

## Project templates and demos

This is a minimal list to start off with a new Godot Kotlin/JVM project:

- [Minimal project template](https://github.com/utopia-rise/godot-kotlin-project-template)
- [GDQuest 3D demo converted to Kotlin](https://github.com/utopia-rise/godot-kotlin-3d-demo)

### Quick overview

For a quick overview on the bindings, watch our presentation "*Godot Game Development Leveraging Kotlin by Pierre-Thomas Meisels, Tristan Grespinet, and Cedric Hippmann*", live-streamed during the JetBrains GameDev Days 2024.

<iframe width="560" height="315" src="https://www.youtube.com/embed/Td7JbrGGa8o?si=lsmxnOJZmIiqpVk5" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>

!!! info
    Please note that the project is currently under active development. As a result, some code shown in the video may not be functioning, as it may have changed since the video was recorded.

### What's not working

The items in this list are explicitly mentioned here as these will be implemented in future versions.
Also consider the [API Differences](user-guide/api-differences.md) section for general differences
and limitations which will not be or cannot be adressed in the near forseable future or ever.

- Each registered constructor must have a unique number of arguments, constructor overloading is not yet supported.
- No tool mode (you can set it already in the `@RegisterClass` annotation but it has no effect yet).
- No addon support, you cannot use Godot Kotlin/JVM to write plugins and addons yet (you can however [write libraries](develop-libraries/introduction.md) with godot specific code).
- Web is currently not supported. See [Supported platforms](#supported-platforms) to see what platforms we currently support

### Bug reporting and questions

If you find bugs, please report an [issue on GitHub](https://github.com/utopia-rise/godot-kotlin-jvm/issues) - but check for duplicates first. If you have questions or need help, you can ask on [Discord](https://discord.gg/zpb5Ru7v9x) in the `questions` and `help` channels respectively.
If you don't have Discord or you don't want to use it, please file an issue on GitHub.

## Supported languages

The main language supported is Kotlin. We do however support Java experimentally. It should be possible to support other JVM-based languages as well but this is not the focus of this project. If you want to have support for other languages, have a look at [support for other JVM-based languages](contribution/support-for-other-jvm-based-languages.md).

## Supported platforms

While Kotlin and Godot supports a wide range of platforms, this module for the moment only supports the following:

- Windows X64
- Linux X64
- MacOS X64 / arm64
- Android (arm64v8, x86_64)
- iOS (arm64v8)

## Versioning

The module uses semantic versioning for its own versions but adds a suffix for the supported Godot version:

Full version: `0.12.1-4.4`

Module Version: `0.12.1`

Supported Godot Version: `4.4`

This module relies on a Kotlin *compiler plugin* for registering your classes and members to Godot. As the compiler API from Kotlin is not stable yet, at the moment we can only support specific Kotlin version per release.

The current latest release is compatible with Kotlin version `2.0.21`.

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
