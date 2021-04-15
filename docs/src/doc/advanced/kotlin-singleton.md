Sometimes, you need to store some Godot objects or references in a Kotlin singleton.
This can cause some leaks when the program ends because you have to manually free objects and have the references collected.
The GodotStatic interface lets you implement the function "collect" so you can write the appropriate cleanup code.
Then you just need to use the "registerAsSingleton" so it will be hooked to the Garbage Collector. 

```kotlin
object MySingleton : GodotStatic {
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
