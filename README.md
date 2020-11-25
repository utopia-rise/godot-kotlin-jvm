# Godot JVM

# Kotlin/Jvm binding for the Godot Game Engine

## Overview

This is a **Kotlin** language binding for the [**Godot**](https://godotengine.org/) game engine. It is built as a module (like the C# binding) to interact with **Godot**'s core internally. The binding provides you Godot API's as Kotlin classes, so you can write your game logic completely in Kotlin. Your code will be compiled into a jar which is then executed by an embedded jvm so you don't have to worry that your users (gamers) have java installed. It's already embedded in your games executable.
You also don't have to worry about any binding logic. Just write your game scripts like you would for [GDScript](https://docs.godotengine.org/en/3.1/getting_started/scripting/gdscript/gdscript_basics.html) or [C#](https://docs.godotengine.org/en/3.1/getting_started/scripting/c_sharp/) but with all the syntactic sugar of kotlin.

[![GitHub](https://img.shields.io/github/license/utopia-rise/godot-jvm?style=flat-square)](LICENSE)

## Important notes

This version of the binding is currently **WIP**! It cannot be used to build games yet.  
For a more stable, yet much less performant binding using Kotlin Native instead of Kotlin on the JVM, visit [godot-kotlin](https://github.com/utopia-rise/godot-kotlin).  

## Documentation

Documentation will be added once the binding reaches the **Alpha** state.

## Developer discussion

Ask questions and collaborate on Discord:
https://discord.gg/qSU2EQs

## Contribution Guidelines:
- **CodeStyle:**  
We enforce the code style to match the official kotlin [coding conventions](https://kotlinlang.org/docs/reference/coding-conventions.html). Read there on how to set those up for your IDE.  
We will enforce this later on through CI and linting.  
- **Branching:**  
Once we reach Alpha state, we'll do branching like described in `git-flow`.

Each Issue has a Maintainer that is the "supervisor" for the general topic the issue belongs to. Discuss implementation details with this maintainer.

## Setting up the project for local development
1. Clone godot repo with 3.2 branch. `git clone git@github.com:godotengine/godot.git -b 3.2 --recursive`

2. In `godot/`, run the following command: `git submodule add git@github.com:utopia-rise/godot-jvm.git modules/kotlin_jvm`

3. Pull submodules of our project (currently only the entry generator): 
    - `cd modules/kotlin_jvm`
    - `git submodule update --init --recursive`

4. Build the engine with our module: `scons -j8 platform=x11 # your platform`

5. Build sample
    - navigate to `harness/tests`
    - create embedded jvm (at least Java 9 is needed!): `jlink --add-modules java.base,java.logging --output jre`
        - If you want to remote debug add module `jdk.jdwp.agent` to command.
        - If you want to enable jmx, add `jdk.management.agent` to command.
    - `./gradlew build`

6. In order to run the samples run `../../../../bin/godot.x11.tools.64`
    - To run the editor append `-e`: `../../../../bin/godot.x11.tools.64 -e`
    - You have to be in the folder of the sample you want to run for this to work otherwise the embedded jvm will not be detected correctly! This will of course change in the future but for now our priorities lie elsewhere.

7. In order to debug your jvm code, you should start godot with command line `--jvm-debug-port=XXXX`, where `XXXX`
stands for the jmx port of you choice. You can then setup remote debug configuration in Intellij' Idea.


## Debug entry generation (KotlinCompilerPlugin in general)
- Build sample project with `./gradlew build --no-daemon -Dorg.gradle.debug=true -Dkotlin.compiler.execution.strategy="in-process" -Dkotlin.daemon.jvm.options="-Xdebug,-Xrunjdwp:transport=dt_socket,address=5005,server=y,suspend=n"`
- Attach remote debugger to process (a preconfigured run configuration for it is present in the sample project `tests` called `DebugEntryGenerator`)

Note: Compilation with attached debugger will be way slower. Especially for the initial build. So be patient. It takes some time until it hits your breakpoints.

## Increment shared buffer capacity

Godot-jvm is using a shared buffer between JVM and engine to share methods parameters and returns. Default shared buffer
size is `20 000 000` bytes for each threads.  
If you'd like to change this buffer size, add `--jvm-to-engine-shared-buffer-size=XXXX` command line argument to
godot, where `XXXX` stands for the desired size.


## Build engine for C# and Kotlin/JVM
1. Fulfill requirements mentioned here: https://docs.godotengine.org/en/stable/development/compiling/compiling_with_mono.html
2. scons p=<platform> tools=yes module_mono_enabled=yes mono_glue=no
3. <godot_binary> --generate-mono-glue modules/mono/glue
    - For this step to work you need a jre in the root `godot` folder
    - And a `godot-bootstrap.jar` in `build/libs` of the root `godot` folder
4. export LD_PRELOAD=<path_to_sample_project>/jre/lib/libjsig.so
5. scons -j20 platform=<platform> module_mono_enabled=yes
6. run with `../../../../bin/godot.x11.tools.64.mono`