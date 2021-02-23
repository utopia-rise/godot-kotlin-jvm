To be able to use custom source dirs, you just have to configure it for the `main` sourceSet in gradle:

`build.gradle.kts`:
```kotlin
kotlin.sourceSets.main {
    kotlin.srcDirs("scripts")
}
```
