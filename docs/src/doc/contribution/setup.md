To build our module, you need to same dependencies as the ones described in the [official Godot documentation](https://docs.godotengine.org/en/stable/development/compiling/index.html).

Make sure that Java is installed and its PATH set in your system as well (at least Java 11 is needed!).

1. Clone godot repo with the stable tag you want to develop for: `git clone git@github.com:godotengine/godot.git 4.1-stable --recursive`

2. In the `godot-root` dir, run the following command: `git submodule add git@github.com:utopia-rise/godot-kotlin-jvm.git modules/kotlin_jvm`

3. From the `godot-root` dir, build the engine with our module: `scons platform=linuxbsd # your target platform`

4. Build sample
    - navigate to `<module-root>/harness/tests`
    - create embedded JVM:
        - For amd64 systems:
          - `jlink --add-modules java.base,java.logging --output jre-amd64`
        - For arm64 systems:
          - `jlink --add-modules java.base,java.logging --output jre-arm64`
        - If you want to remote debug add module `jdk.jdwp.agent` to command.
        - If you want to enable jmx, add `jdk.management.agent` to command.
    - Windows: `gradlew build`
    - Unix: `./gradlew build`

5. In order to run the engine, run `godot.linuxbsd.editor.x86_64` (or the equivalent of your platform) located in the `bin` folder of `godot-root`

6. In order to debug your JVM code, you should start Godot with command line `--jvm-debug-port=XXXX`, where `XXXX`
stands for the JMX port of you choice. You can then set up remote debug configuration in Intellij IDEA.

## Important things to note:
When you build a sample, it generates a `godot-bootstrap.jar` in `build/libs`. This jar is needed by the engine to function correctly. You need to copy this jar to `<godot-root>/bin`. If you want to automate that, consider using the following gradle task in the samples `build.gradle.kts`- but don't commit it!

```kt
afterEvaluate {
    tasks {
        val bootstrapJar = getByName("bootstrapJar")
        val copyBootstrapJar by creating(Copy::class.java) {
            group = "godot-jvm"
            from(bootstrapJar)
            destinationDir = File("${projectDir.absolutePath}/../../../../bin/")
            dependsOn(bootstrapJar)
            println(File("${projectDir.absolutePath}/../../../../bin/").absolutePath)
        }
        build.get().dependsOn(copyBootstrapJar)
    }
}
```

If you build the libs from `<module-root>/kt` then this copy task is already present and executed automatically for you.