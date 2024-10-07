When running Kotlin/Java code, the JVM is embedded and managed directly by Godot, which offer little control when the game is closing. 
If you use third-party library that needs resources to be freed/saved or threads to be closed. 
To that end, we provide a simple method that allows you to register callbacks that will be called when the JVM is shutdown.

```kotlin
fun foo() {
    val resource = AcquireSomeThirdPartyResource()
    GD.callWhenClosing {
        resource.close()
    }
}
```

!!! warning
    Be mindful that this operation happens when Godot has already been partially closed.
    The SceneTree is no longer present and a part of the Godot API has been unregistered.
    The order of execution is not guaranteed. Make sure that those callbacks don't depend on each other.


Sometimes you need to store some Godot objects or references in a Kotlin singleton.
This can cause some memory leak warnings when the program ends because they are kept alive by the singleton.
This issue is fixed by using the method `asStatic()` on singleton properties. Those properties will be freed once the running JVM ends.
They automatically handle `Object` and `Reference`.

!!! warning
    Only use it on a singleton, otherwise all the properties of all instances are going to be kept alive until the end of the JVM.

```kotlin
object GodotStatic {
    var ref = (ResourceLoader.load("res://Spatial.tscn") as PackedScene?).asStatic()
    var myScene = Node().asStatic()
}
```