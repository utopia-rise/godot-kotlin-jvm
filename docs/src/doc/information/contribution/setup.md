To build our module, you need to same dependencies as the ones described in the [official Godot documentation](https://docs.godotengine.org/en/stable/development/compiling/index.html).

Make sure that Java is installed and its PATH set in your system as well (at least Java 9 is needed!).

1. Clone godot repo with the stable tag you want do deveop for (3.2.3-stable in this example). `git clone git@github.com:godotengine/godot.git 3.2.3-stable --recursive`

2. In the `godot-root` dir, run the following command: `git submodule add git@github.com:utopia-rise/godot-kotlin-jvm.git modules/kotlin_jvm`

3. Pull submodules of our project: 
    - `cd modules/kotlin_jvm`
    - `git submodule update --init --recursive`

4. From the `godot-root` dir, build the engine with our module: `scons -j$(nproc) platform=x11 # your target platform`

5. Build sample
    - navigate to `<module-root>/harness/tests`
    - create embedded JVM: `jlink --add-modules java.base,java.logging --output jre`
        - If you want to remote debug add module `jdk.jdwp.agent` to command.
        - If you want to enable jmx, add `jdk.management.agent` to command.
    - Windows: `gradlew build`
	- Unix: `./gradlew build`

6. In order to run the engine, run `godot.x11.tools.64` located in the `bin` folder of `godot-root`

7. In order to debug your JVM code, you should start Godot with command line `--jvm-debug-port=XXXX`, where `XXXX`
stands for the JMX port of you choice. You can then setup remote debug configuration in Intellij' IDEA.

## Important things to note:
When you build a sample, it generates a `godot-bootstrap.jar` in `build/libs`. This jar is needed by the engine to function correctly.  
You need to copy this jar to `<godot-root>/bin`.  
If you want to automate that, consider using the following gradle task in the samples `build.gradle.kts`. But don't commit it!:

```kotlin
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