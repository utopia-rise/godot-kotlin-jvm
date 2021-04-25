To expose a class written in Kotlin it needs to extend `godot.core.Object` (or any of its subtype) and must be annotated with `@RegisterClass`.

```kt
@RegisterClass
class RotatingCube: Spatial() {
    // ...
}
```

## Naming
Classes need to be registered with a unique name as Godot does not support namespaces (or packages in this case) for script classes. This is why this module registers your classes with the fully qualified name. But as GDScript does not support `.` in the type name, `.` are converted to `_`.  

!!! info "A little example"
    A class with fqname `com.company.game.RotatingCube` will be registered as `com_company_game_RotatingCube`. In GDScript you can use it like:
    ```js
    var instance := com_company_game_RotatingCube.new()
    ```  

As this can get quite long and convoluted, you can register classes with a custom class name. See [customization](#customization) section found on this page for more details.

## Lifecycle
If you want to be notified when initialization and destruction of your class happens, use the `init` block and override the `_onDestroy` function respectively.

```kt
@RegisterClass
class RotatingCube: Spatial() {
    init {
        println("Initializing RotatingCube!")
    }

    override fun _onDestroy() {
        println("Cleaning up RotatingCube!")
    }
}
```

## Instance checks
Checking if an object is an instance of a particular type can be done via the `is` operator.

```kt
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

!!! info
    If you are sure that an object is always an instance of some type, then you can take advantage of Kotlin's [contracts](https://kotlinlang.org/docs/reference/whatsnew13.html#contracts) feature. This allows you to avoid having nested `if`s.

    ```kt
    @RegisterFunction
    override fun _ready() {
        val parent = getParent()
        require(parent is CollisionShape)
        // smart cast works here as well!
        parent.setShape(...)
    }
    ```

## Constructors
Godot requires you to have a default constructor on your classes. You can define additional constructors but you have to register them by annothing them with `@RegisterConstructor`. Default constructors on the other hand are always registered.

Constructors also can have a maximum of 5 arguments and must have a unique argument count as constructor overloading is not yet supported. This limitation is only for registered constructors.

### Instantiate Kotlin script classes in GDScript
Creating an instance using the default constructor can be done by:

```kt
var instance := package_YourClass.new()
```

While for additional constructors, `load` must be used:

```kt
var instance := load("res://package/YourClass").new(oneArg, anotherArg)
```

!!! info
    The limitation of max 5 arguments for constructors is arbitrary. We decided to introduce this limitation to prevent performance bottlenecks for creating objects as each argument passed to a constructor needs to be unpacked by the binding. The more arguments, the more unpacking is needed which means more overhead.


## Customization
You can customize to some extent how your class should be registered in Godot:

The `@RegisterClass` annotation can take two arguments:

- **className**: If set, the class will be registered with the name you provide

!!! warning "Unique class names"
    If you specify the `className` in the annotation, you have to make sure that this name is unique! We implemented compilation checks to make sure the compilation fails if more than two classes are registered with the same name, but we cannot check class names from other scripting languages like GDScript or C#! It is also recommended installing our intellij plugin as it shows duplicated registered class names in the editor as an error.


## Tool mode
Annotate your class with `@Tool` to make it a tool class (note that `@RegisterClass` is required for this annotation to take effect).