# Registrar generation

## General

To make it more language agnostic, the registrar generator provides a set of model classes which represent the information about the source code that the registrar generator needs.
It expects this information to be gathered and assembled by the calling tool and provided as input to the registrar generator.

For Kotlin, Java and Scala, this tool is `godot-class-graph-symbol-processor`, which analyses the byte code and gathers the information needed by the registrar generator.
It then calls the registrar generator which in turn generates the needed registrar files.

## The godot-class-graph-symbol-processor

Previously, we implemented our own compiler plugin based on the [mpapt](https://github.com/Foso/MpApt) and [ksp](https://github.com/google/ksp) project.
Even though it worked very well, the code was far from easy to understand and as the compiler plugin API is not stable yet.
Furthermore, `MpApt` introduced a lot of maintenance work to keep it up to date with the ever evolving Kotlin compiler and `Ksp` wasn't able to process Scala files.

To mitigate that problem we switched to [ClassGraph](https://github.com/classgraph/classgraph) which is Bytecode processor.
Meaning it in essence is a compiler plugin which lets you inspect the compiled bytecode with an abstracted and simplified API.
This means for us that we can work against a more stable API and the work of keeping it up to date with the Kotlin language is removed.

We use ClassGraph to gather all needed information for the registrar generator and convert it into the format it understands.
With this it should be far easier to implement additional JVM languages as ClassGraph is language agnostic and only minor tweak are necessary to support additional static languages.

## Debugging

TODO: Write the new way to debug the bytecode processing

As `godot-class-graph-symbol-processor` is a Kotlin compiler plugin and thus the execution context of the registrar generator is as well,
it cannot be debugged traditionally by just clicking the Debug button on the `build` task in IntelliJ IDEA like you would do normally for KAPT annotation processors.

To debug a project, open a terminal, change to project's root directory and type the following command:

```bash
./gradlew kspKotlin -Dkotlin.daemon.jvm.options="-Xdebug,-Xrunjdwp:transport=dt_socket\,address=8765\,server=y\,suspend=y"
```

This will halt the compilation until you attach a remote debugger. You can find a pre-configured run for it in the sample project `tests` called `DebugRegistrarGenerator`.

!!! note
    Compilation with attached debugger will be way slower. Especially for the initial build. So, please, be patient. It takes some time until it hits your breakpoints.

Keep in mind: As this spawns a new daemon for each build, no incremental build is supported. Each build builds everything. If you need to debug a incremental build issue, the only way atm is to log relevant debug information to a file.
