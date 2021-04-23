To be able to use custom source dirs, you can do the following:

=== "build.gradle.kts"
    ```kt
    kotlin.sourceSets.main {
        kotlin.srcDirs("scripts")
    }
    ```
