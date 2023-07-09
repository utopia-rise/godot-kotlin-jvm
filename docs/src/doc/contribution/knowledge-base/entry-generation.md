# Entry generation

## General
To make it more language agnostic, the entry gen provides a set of model classes which represent the needed information about the source code by the entry gen. It expects this information to be gathered and assembled by the calling tool and to be provided in the entry point of the entry gen.

For kotlin and java, this tool is `godot-kotlin-symbol-processor` which in essence is a compiler plugin, which analyses the source code, and gathers the information needed by the entry gen. It then calls the entry gen which in turn generates the needed entry files.

## godot-kotlin-symbol-processor
Previously, we implemented our own compiler plugin based on the [mpapt](https://github.com/Foso/MpApt) project. Even though it worked very well, the code was far from easy to understand and as the compiler plugin api is not stable, it also introduced a lot of maintenance work to keep it up to date with the ever evolving kotlin compiler.

To mitigate that problem we switched to [KSP (Kotlin Symbol Processing API)](https://github.com/google/ksp) which is basically a kotlin annotation processor (kapt) on steroids. Meaning it in essence is a compiler plugin which lets you inspect the source code being compiled through a abstracted and simplified api. This means for us that we can work against a more stable api and the work of keeping it up to date with kotlin compiler changes is offloaded to a well maintained open source project with far more people with better knowledge about the internal workings of the kotlin compiler.

We use our implementation of a kotlin symbol processor to gather all needed information for the entry gen and convert it into the format it understands. With this it should be more easy to implement additional jvm languages as the entry gen itself can stay the same for all languages. Only the symbol processor has to change per language.

## Default value extraction
We extract the default values with the help of Jetbrain's [Program Structure Interface (PSI)](https://plugins.jetbrains.com/docs/intellij/psi.html), which is basically a language specific AST (Abstract Syntax Tree). But as the simplified API of KSP does not allow the introspection of the source code representation, we implemented this ourselves in the `godot-kotlin-symbol-processor` as well.

## Debugging
As `godot-kotlin-symbol-processor` is a kotlin compiler plugin and thus the execution context of the entry gen is as well, it cannot be debugged traditionally by just clicking debug on the `build` task in intellij like you would do normally for kapt annotation processors.

To debug it you have to execute the following command in the terminal: `./gradlew build --no-daemon -Dorg.gradle.debug=true -Dkotlin.compiler.execution.strategy="in-process" -Dkotlin.daemon.jvm.options="-Xdebug,-Xrunjdwp:transport=dt_socket,address=5005,server=y,suspend=n"` from within a sample project.

This will halt the compilation until you attach a remote debugger. You can find a preconfigured run configuration for it in the sample project `tests` called `DebugEntryGenerator`.

!!! note
    Compilation with attached debugger will be way slower. Especially for the initial build. So be patient. It takes some time until it hits your breakpoints.

Keep in mind: As this spawns a new daemon for each build, no incremental build is supported. Each build builds everything. If you need to debug a incremental build issue, the only way atm is to log relevant debug information to a file.