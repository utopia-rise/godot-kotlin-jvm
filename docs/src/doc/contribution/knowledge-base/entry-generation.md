# Entry generation

## General

To make it more language agnostic, the entry generator provides a set of model classes which represent the needed information about the source code by the entry genenerator.
It expects this information to be gathered and assembled by the calling tool and to be provided in the entry point of the entry generator.

For Kotlin and Java, this tool is `godot-kotlin-symbol-processor` (a Kotlin compiler's plugin), which analyses the source code, and gathers the information needed by the entry generator.
It then calls the entry generator which in turn generates the needed entry files.

## The godot-kotlin-symbol-processor

Previously, we implemented our own compiler plugin based on the [mpapt](https://github.com/Foso/MpApt) project.
Even though it worked very well, the code was far from easy to understand and as the compiler plugin API is not stable yet.
Furthermore, `MpApt` introduced a lot of maintenance work to keep it up to date with the ever evolving Kotlin compiler.

To mitigate that problem we switched to [KSP (Kotlin Symbol Processing API)](https://github.com/google/ksp) which is basically a Kotlin Annotation Processor (KAPT) on steroids.
Meaning it in essence is a compiler plugin which lets you inspect the source code being compiled through a abstracted and simplified API.
This means for us that we can work against a more stable API and the work of keeping it up to date with Kotlin compiler changes is offloaded
to a well maintained open source project with far more people with better knowledge about the internal workings of the Kotlin compiler.

We use our implementation of a Kotlin Symbol Processing to gather all needed information for the entry generator and convert it into the format it understands.
With this it should be more easy to implement additional JVM languages as the entry generator itself can stay the same for all languages. Only the symbol processor has to change per language.

## Default Value Extraction

We extract the default values with the help of JetBrains' [Program Structure Interface (PSI)](https://plugins.jetbrains.com/docs/intellij/psi.html),
that is a language specific AST (Abstract Syntax Tree). But as the simplified API of KSP does not allow the introspection of the source code representation,
we implemented this ourselves in the `godot-kotlin-symbol-processor` as well.

## Debugging

As `godot-kotlin-symbol-processor` is a Kotlin compiler plugin and thus the execution context of the entry generator is as well,
it cannot be debugged traditionally by just clicking the Debug button on the `build` task in IntelliJ IDEA like you would do normally for KAPT annotation processors.

To debug a project, open a terminal, change to project's root directory and type the following command:

```bash
./gradlew kspKotlin -Dkotlin.daemon.jvm.options="-Xdebug,-Xrunjdwp:transport=dt_socket\,address=8765\,server=y\,suspend=y"
```

This will halt the compilation until you attach a remote debugger. You can find a pre-configured run for it in the sample project `tests` called `DebugEntryGenerator`.

!!! note
    Compilation with attached debugger will be way slower. Especially for the initial build. So, please, be patient. It takes some time until it hits your breakpoints.

Keep in mind: As this spawns a new daemon for each build, no incremental build is supported. Each build builds everything. If you need to debug a incremental build issue, the only way atm is to log relevant debug information to a file.
