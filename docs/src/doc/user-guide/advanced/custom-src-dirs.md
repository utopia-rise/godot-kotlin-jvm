To be able to use custom source directories, you modify your Gradle build file as it follows:

/// tab | build.gradle.kts
```kt
kotlin.sourceSets.main {
    kotlin.srcDirs("scripts")
}
```
///
