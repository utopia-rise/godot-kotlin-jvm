# Entry generation

## General
The entry generator is included as a git submodule in this project as it is used by both the [godot-kotlin-native](https://github.com/utopia-rise/godot-kotlin-native) and [godot-kotlin-jvm](https://github.com/utopia-rise/godot-kotlin-jvm) projects.  
It's github project can be found [here](https://github.com/utopia-rise/godot-kotlin-entry-generator).  

The entry generator project on it's own is useless. It needs kotlin compiler information about the source code being compiled to do its work.  So the entry generator is in essence a kotlin compiler plugin. But the actual compiler plugin bits are implemented per project. In both projects these modules are in the `entry-generation` folder and use `godot-annotation-processor` as entry point which is the "actual" compiler plugin. It leverages the [mpapt](https://github.com/Foso/MpApt) project to gather all descriptors annotated with godot annotations and passes them to the entry generator to generate the entry files.

## Additional compilation targets
As we need sophisticated compiler information about the classes being compiled, we are actually too late in the compilation process to include our generated files in the current compilation round.  
We could of course directly generate kotlin IR to still include our sources in the current compilation run, but this has many other drawbacks of which the biggest one is maintainability.  
Hence we create a additional compilation target called `game` in the `godot-gradle-plugin` which contains all sources of the `main` compilation target and adds the generated sources from the compilation round of `main` to it. So we are to late for the compilation round of `main` but not for `game`. And we have almost no additional compilation time as the sources of `main` are already compiled and do not have to be recompiled for `game`.

## Debugging
As the entry generator is a kotlin compiler plugin, it cannot be debugged traditionally by just clicking debug on the `build` task in intellij like you would do normally for kapt annotation processors.

To debug it you have to execute the following command in the terminal: `./gradlew build --no-daemon -Dorg.gradle.debug=true -Dkotlin.compiler.execution.strategy="in-process" -Dkotlin.daemon.jvm.options="-Xdebug,-Xrunjdwp:transport=dt_socket,address=5005,server=y,suspend=n"` from within a sample project.

This will halt the compilation until you attach a remote debugger. You can find a preconfigured run configuration for it in the sample project `tests` called `DebugEntryGenerator`.

!!! note ""
    Compilation with attached debugger will be way slower. Especially for the initial build. So be patient. It takes some time until it hits your breakpoints.

Keep in mind: As this spawns a new daemon for each build, no incemental build is supported. Each build builds everything.  
If you need to debug a incremental build issue, the only way atm is to log relevant debug information to a file.