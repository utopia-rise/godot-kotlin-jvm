In order to test a change from a specific branch in your own project, you'll need to follow the following steps:

!!! warning
    Before following these steps, make sure you've done a proper backup of your project! Things can and will break! So ensure you can easily rollback all changes applied to your project

!!! info
    The building the project from source, requires that you've setup your system to be able to build godot. [Follow the official documentation](https://docs.godotengine.org/en/stable/contributing/development/compiling/index.html) for the setup of your system! 

1. Check against which godot branch/tag the branch is built against. (the current master is for 4.3-stable)
2. Check out godot: `git clone git@github.com:godotengine/godot.git --branch 4.3-stable --recursive`
3. Move into the godot root: `cd godot`
4. Check out our module: `git submodule add git@github.com:utopia-rise/godot-kotlin-jvm.git modules/kotlin_jvm`
5. Move into the kotlin root of our module: `cd modules/kotlin_jvm/kt`
6. Check out the branch you want: `git checkout <branch_name>`
7. Locally deploy our module: `./gradlew :tools-common:publishToMavenLocal publishToMavenLocal && ./gradlew publishToMavenLocal -Prelease=true`
8. Move back to the godot root: `cd ../../..`
9. Build godot: `scons debug_symbols=yes dev_build=yes`
10. Make sure you have `mavenLocal()` as a repository configured in your gradle build
11. Add the following plugin resolution to your:
    ```kotlin
    pluginManagement {
        // ...
        resolutionStrategy.eachPlugin {
            if (requested.id.id == "com.utopia-rise.godot-kotlin-jvm") {
                useModule("com.utopia-rise:godot-gradle-plugin:${requested.version}")
            }
        }
    }
    ```
12. Check the version name which you've built: `ls ~/.m2/repository/com/utopia-rise/godot-gradle-plugin/`
    It should be something like: `0.9.1-4.3.0-d68f299-SNAPSHOT`
13. Use that version in your project
14. Build your project
15. Run your project with the editor binary you've built in step 9
    You can find that binary in the godot root in the `bin` folder, and it should look something like this: `godot.macos.editor.dev.arm64`
