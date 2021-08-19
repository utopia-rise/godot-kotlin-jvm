## Disable build failure on kotlin version mismatch
As we're using a kotlin compiler plugin to register your code with godot, we can only support a specific kotlin version per release. This is due to the fact that the kotlin compiler plugin api is not stable yet.

But if you are familiar with the quirks of compiler plugins and their compatibility and you need to use another kotlin version than we officially support, you can disable the version checks we have in place in our gradle plugin. To do this you have to set `godot.jvm.suppressKotlinIncompatibility` to `true` in the `gradle.properties` file:

=== "gradle.properties"
    ```
    godot.jvm.suppressKotlinIncompatibility=true
    ```

!!! warning
    This is an advanced feature! Only use it if you know what you're doing. We cannot guarantee that our compiler plugin is compatible with other kotlin versions than the one we build it for. Setting this property to true can lead to build and/or runtime errors.