Sometimes you need to store some Godot objects or references in a Kotlin singleton, this can cause some leaks when the program ends because you have to manually free objects and have the references collected. The `GodotStatic` abstract class lets you implement the function `collect` so you can write the appropriate cleanup code.

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
