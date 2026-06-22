Godot Kotlin/JVM libraries are basically the equivalent of Godot Addons,
but specifically for the use in other Godot Kotlin/JVM projects like Games or Applications.

!!!Relevance
    If you build a library which does not register any classes to Godot, you can just create a regular JVM library, and you will have no need for this documentation.

## Overview

A Godot Kotlin/JVM library is a regular JVM library built with the Godot Gradle plugin in library mode.

Library mode keeps the Godot Kotlin/JVM compile setup, but skips:

- registrar scanning
- registrar generation
- `.gdj` generation and synchronization
- runtime jar packaging for a standalone Godot project

Registered classes can still live inside the library. The important difference is that the consuming Godot Kotlin/JVM project scans its dependencies and generates the needed registrar files and `.gdj` files itself.
