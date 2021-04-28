Sometimes you need to store some Godot objects or references in a Kotlin singleton. This can cause some leaks when the program ends because you have to manually free objects and have the references collected. The `BaseGodotStatic` abstract class lets you implement the function `collect` so you can write the appropriate cleanup code.

Warning: Don't use `queueFree()`. As the engine is closing, the queue won't be flushed.

```kotlin
object MySingleton : GodotStatic() {
    var ref: MyReference? = MyReference()
    var obj: MyObject = MyObject()

    override fun collect(){
        obj.free()
        ref = null
    }
}
```

You can also directly implement the interface `IGodotStatic` but you need to do the registering yourself. You just need to use the `registerAsSingleton` so it will be hooked to the Garbage Collector. 

```kotlin
object MySingleton : IGodotStatic {
    var ref: MyReference? = MyReference()
    var obj: MyObject = MyObject()

    init{
        registerAsSingleton()
    }

    override fun collect(){
        obj.free()
        ref = null
    }
}
```

You can also have a more fine-grained control by using the delegate `godotStatic`. Those properties will be freed once the JVM ends. They automatically handle `Object` and `Reference`. You can also freely set a new value and the previous one will be immediatly freed.
Warning: Only use it on a singleton, otherwise all the properties of all instances are going to be kept alive until the end of the JVM.

```kotlin
object GodotStaticDelegateTest {
    var ref by godotStatic {
        ResourceLoader.load("res://Spatial.tscn") as PackedScene?
    }
    var myScene by godotStatic {
        Node()
    }
}
```
