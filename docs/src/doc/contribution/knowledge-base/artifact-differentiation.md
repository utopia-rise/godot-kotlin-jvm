This document describes what the individual artifacts are for and how they are used.

## godot-library

### Overview

The `godot-library` contains the Godot APIs as Kotlin classes as well as registration code.
It is automatically added as a dependency to the users code by the `godot-gradle-plugin`.
Hence, it is deployed to `mavenCentral`. It is also used as a dependency by `godot-bootstrap` and
thus present in the `godot-bootstrap.jar` which gets shipped alongside the engine.

### Usage

The `godot-library` is primarily used implicitly by the end user. This because the user does not add it manually,
instead, the `godot-gradle-plugin` performs this task. Meanwhile, the `godot-bootstrap.jar` also utilizes it for initial
loading and editor usage. It's crucial to note that during runtime, only the version added to the user's code via
the `godot-gradle-plugin` is used. The version within the `godot-bootstrap` is exclusively for the editor.

## godot-bootstrap

### Overview

The `godot-bootstrap` is a "shadow JAR" (also known as [fat JAR](https://jenkov.com/tutorials/maven/maven-build-fat-jar.html))
which contains the `godot-library` and runtime code to reload usercode in the editor after rebuilds.

### Usage

The `godot-bootstrap` is shipped alongside the engine for editor use and is bundled together with the game executable
during export. It is never used by the user directly nor added as a dependency anywhere.

## main

### Overview

The `main.jar` is built when the user builds his code. It is a shadow JAR containing only the users code as well as all
the dependencies the user has defined recursively. This is needed so they and all dependencies and the dependencies of
the dependencies are present at runtime.

### Usage

This JAR is bundled together with the game executable during export and executed through the `godot-bootstrap` during
runtime. It is nowhere else used.

## usercode

### Overview

The `usercode` artifact is a shared library which is only used on GraalVM native image builds. It contains all code from
the `main.jar` and the `godot-bootstrap.jar`.

### Usage

It replaces the `godot-bootstrap.jar` and the `main.jar` when the game is exported. It is only used when configured
either as a command line argument or through the configuration file (see [GraalVM documentation](../../user-guide/advanced/graal-vm-native-image.md) for more information).
While it is used (either in game or editor) no usercode can be reloaded.