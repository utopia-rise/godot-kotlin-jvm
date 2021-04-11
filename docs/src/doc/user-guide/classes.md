To expose a class written in Kotlin it needs to extend `godot.core.Object` (or any type that extends it) and annotate it with `@RegisterClass`.

```kotlin
@RegisterClass
class RotatingCube: Spatial() {
    // ...
}
```

## Naming
Classes need to be registered with a unique name as Godot does not support namespaces (or packages in this case) for script classes.
This is why this module registers your classes with the fully qualified name. But as GDScript does not support `.` in the type name, `.` are converted to `_`.

A little example:

A class with fqname `com.company.game.RotatingCube` will be registered as `com_company_game_RotatingCube` and can be used from with that name from GDScript as well: `var instance := com_company_game_RotatingCube.new()`. As this can get quite long and convoluted, you can register classes with a custom class name. See the section [Registration Configuration](#registration-configuration) in this page for more information's about that.

## Lifecycle
If you want to be notified when initialization and destruction of your class happens, override `_onInit` and `_onDestroy` functions, respectively.

```kotlin
@RegisterClass
class RotatingCube: Spatial() {
    override fun _onInit() {
        println("Initializing RotatingCube!")
    }

    override fun _onDestroy() {
        println("Cleaning up RotatingCube!")
    }
}
```

`_onInit` is equivalent to GDScript's constructor `_init`, however, `_onInit` and `_onDestroy` are handled directly by this module, not Godot. Hence these are the only functions you don't need to register to make them work.

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

## Constructors
Godot requires to have a default constructor on your classes.
You can define additional constructors but for them to be registered, you have to annotate them with `@RegisterConstructor`.
Default constructors on the other hand are always registered, regardless of the annotation. But we recommend to add it anyways, if you have multiple constructors, so it serves a documentation purpose in your scripts and it's consistent.

Constructors also can have a maximum of 5 arguments.
Each constructor must have a unique argument count. Constructor overloading is not yet supported.
This limitation is only valid for registered constructor's though. If you have two constructors with 3 args and only one of them is registered, it's valid and will work.

If you call your constructors from GDScript note this limitation:
You can only call the default constructor with the named syntax: `package_YourClass.new()`
Constructors with arguments you have to call using the `load` function: `load("res://package/YourClass").new(oneArg, anotherArg)`

!!! note ""
    The limitation of max 5 arguments for constructors is arbitrary. We decided to introduce this limitation to prevent performance bottlenecks for creating objects as each argument passed to a constructor needs to be unpacked in the binding. The more arguments, the more unpacking is needed so the performance cost increases.


## Registration Configuration
You can customize to some extent how your class should be registered in Godot:

The `@RegisterClass` annotation can take two arguments:

- **className**: If set, the class will be registered with the name you provide
- **isTool**: If set to true, this class is treated as a tool class. Similar to the `tool` of GDScript. **Default:** false

!!! warning "Unique class names"
    If you specify the `className` in the annotation, you have to make sure that this name is unique!
    We implemented compilation checks to make sure the compilation fails if more than two classes are registered with the same name, but we cannot check class names from other scripting languages like GDScript or C#!
    It is also recommended installing our intellij plugin as it shows duplicated registered class names in the editor as an error. See the section [IDE](../getting-started/ide.md) for more information about the plugin.

## What's next?
 - [Registering properties](properties.md)
 - [Registering functions](functions.md)
 - [Registering signals](signals.md)
