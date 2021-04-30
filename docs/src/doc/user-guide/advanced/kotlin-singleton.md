Sometimes you need to store some Godot objects or references in a Kotlin singleton. This can cause some leaks when the program ends because you have to manually free objects and have the references collected. 
This issue is fixed by using the delegate `godotStatic` on singleton properties. Those properties will be freed once the JVM ends. They automatically handle `Object` and `Reference`. You can also freely set a new value and the previous one will be immediatly freed.

!!! warning
	Only use it on a singleton, otherwise all the properties of all instances are going to be kept alive until the end of the JVM.

```kotlin
object GodotStatic {
    var ref by godotStatic {
        ResourceLoader.load("res://Spatial.tscn") as PackedScene?
    }
    var myScene by godotStatic {
        Node()
    }
}
```
