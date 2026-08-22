---
hide:
  - navigation
description: Build Godot games and applications with Kotlin, Java, or Scala using Godot-JVM, a JVM GDExtension binding.
---


[![GitHub](https://img.shields.io/github/license/utopia-rise/godot-jvm?style=flat-square)](https://github.com/utopia-rise/godot-jvm/blob/master/LICENSE)

# Godot-JVM: Kotlin, Java, and Scala bindings for Godot

Godot-JVM is a GDExtension JVM binding that lets you write game or application logic in Kotlin, Java, or Scala. To get started, [set up a Godot-JVM project](getting-started/setting-up.md).

## State

Godot-JVM 1.0.0 is the first stable release. We welcome suggestions for improving the project and its API.

## Project templates and demos

This is a minimal list to start off with a new Godot-JVM project:

- [Minimal project template](https://github.com/utopia-rise/godot-kotlin-project-template)
- [GDQuest 3D demo converted to Kotlin](https://github.com/utopia-rise/godot-kotlin-3d-demo)

### Quick overview

For a quick overview on the bindings, watch our presentation "*Godot Game Development Leveraging Kotlin by Pierre-Thomas Meisels, Tristan Grespinet, and Cedric Hippmann*", live-streamed during the JetBrains GameDev Days 2024.

<iframe width="560" height="315" src="https://www.youtube.com/embed/Td7JbrGGa8o?si=lsmxnOJZmIiqpVk5" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>

!!! info
    This video is vastly outdated. Its setup instructions and code do not reflect the current Godot-JVM project. Follow the current documentation when creating a project or writing code.

### What's not working

The items in this list are explicitly mentioned here as these will be implemented in future versions.
Also consider the [API Differences](user-guide/api-differences.md) section for general differences
and limitations which will not be or cannot be adressed in the near forseable future or ever.

- No tool mode (you can set it already in the `@Script` annotation but it has no effect yet).
- No addon support, you cannot use Godot-JVM to write plugins and addons yet (you can however [write libraries](develop-libraries/introduction.md) with godot specific code).
- Web is currently not supported. See [Supported platforms](#supported-platforms) to see what platforms we currently support

### Bug reporting and questions

If you find bugs, please report an [issue on GitHub](https://github.com/utopia-rise/godot-jvm/issues) - but check for duplicates first. If you have questions or need help, you can ask on [Discord](https://discord.gg/zpb5Ru7v9x) in the `questions` and `help` channels respectively.
If you don't have Discord or you don't want to use it, please file an issue on GitHub.

## Supported languages

Godot-JVM supports Kotlin, Java, and Scala. Other JVM-based languages are outside the current scope; see [support for other JVM-based languages](contribution/support-for-other-jvm-based-languages.md) if you want to add one.

## Supported platforms

While Kotlin and Godot support a wide range of platforms, Godot-JVM currently supports the following:

- Windows X64
- Linux X64
- MacOS X64 / arm64
- Android (arm64v8, x86_64)
- iOS (arm64v8)

## Versioning

Godot-JVM uses semantic versioning. Godot is versioned independently as a minimum supported version.

Version: `1.0.0-dev3`

Minimum Godot Version: `4.7.2`

Godot-JVM relies on a Kotlin *compiler plugin* for registering your classes and members with Godot. As the compiler API from Kotlin is not stable yet, each release defines a minimum supported Kotlin version.

The current latest release requires at least Kotlin version `2.3.20`.

!!! info
    It is possible to use Godot-JVM with other Kotlin versions as well, but we do not provide guarantees for them. Find more information in the [Gradle Plugin configuration](user-guide/advanced/gradle-plugin-configuration.md#kotlinversion) section.

## Install the addon

Download the `godot-jvm-addon-<version>.zip` archive for your release from [GitHub releases](https://github.com/utopia-rise/godot-jvm/releases) and extract it into your project's root directory. The archive provides `addons/jvm`, including the `jvm.gdextension` manifest and native libraries for supported platforms.

Open the project with Godot `4.7.2` or newer. Use the matching official export templates when exporting your project.

## Developer discussion

Please feel free to ask questions and collaborate on our [Discord](https://discord.gg/zpb5Ru7v9x) server.


