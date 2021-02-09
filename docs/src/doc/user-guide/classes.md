To expose a class written in Kotlin it needs to extend `godot.core.KtObject` (or any type that extends it) and annotate it with `@RegisterClass`.

```kotlin
@RegisterClass
class RotatingCube: Spatial() {
    // ...
}
```

## Lifecycle
If you want to be notified when initialization and destruction of your class happens, override `_onInit` and `_onDestroy` functions, respectively.

```kotlin
@RegisterClass
class RotatingCube: Spatial() {
    override fun _onInit() {
        GD.print("Initializing RotatingCube!")
    }
    
    override fun _onDestroy() {
        GD.print("Cleaning up RotatingCube!")
    }
}
```

`_onInit` is equivalent to GDScript's constructor `_init`, however, `_onInit` and `_onDestroy` are handled directly by this binding, not Godot hence these are the only functions you don't need to register to make them work.

## Instance checks
Checking if an object is an instance of a particular type can be done via the `is` operator.

```kotlin
@RegisterFunction
override fun _ready() {
    val parent = getParent()
    if (parent is CollisionShape) {
        // smart cast works!
        parent.setShape(...)
    } else {
        throw AssertionError("Unexpected parent!")
    }
}
```

This also works for any type you define. 

If you are sure that an object is always an instance of some type, then you can take advantage of Kotlin's [contracts](https://kotlinlang.org/docs/reference/whatsnew13.html#contracts) feature.

```kotlin
@RegisterFunction
override fun _ready() {
    val parent = getParent()
    require(parent is CollisionShape)
    // smart cast works here as well!
    parent.setShape(...)
}
```


## Registration Configuration
You can customize to some extent how your class should be registered in Godot:

The `@RegisterClass` annotation can take one argument:

- **isTool**: If set to true, this class is treated as a tool class. Similar to the `tool` of GDScript. **Default:** false



## What's next?
 - [Registering properties](properties.md)
 - [Registering functions](methods.md)
 - [Registering signals](signals.md)
