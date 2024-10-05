## Disable build failure on Kotlin version mismatch

As we're using a Kotlin compiler plugin to register your code with Godot, we can only support a specific Kotlin version per release.
This is due to the fact that the Kotlin compiler plugin API is not stable yet. This should change in the future with the new release of K2 compiler.

But if you are familiar with the quirks of compiler plugins and their compatibility and you need to use another Kotlin version than we officially support,
you can disable the version checks we have in place in our Gradle plugin. To do this you have to set `godot.jvm.suppressKotlinIncompatibility` to `true` in the `gradle.properties` file:

/// tab | gradle.properties
```kotlin
godot.jvm.suppressKotlinIncompatibility=true
```
///

!!! warning
    This is an advanced feature! Only use it if you know what you're doing. We cannot guarantee that our compiler plugin is compatible with other kotlin versions than the one we build it for. Setting this property to true can lead to build and/or runtime errors.