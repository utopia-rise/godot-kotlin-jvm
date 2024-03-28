To expose a class written in Kotlin it needs to extend `godot.Object` (or any of its subtype) and must be annotated with `@RegisterClass`.

```kt
@RegisterClass
class RotatingCube: Node3D() {
    // ...
}
```

Each registered classes will generate its own .gdj files. For more information, read [registration files](../user-guide/api-differences.md#registration-files-gdj).

### Naming

Classes need to be registered with a unique name as Godot does not support namespaces (or packages in this case) for script classes.

By default, we register your classes with the name you give them. While beign a simple approach and enough in most cases,
this can lead to naming conflicts if you have classes in different packages with the same name. For example:

- `com.package.a.MyClass`
- `com.package.b.MyClass`

This leads to a conflict on the Godot side as both classes are registered as `MyClass`.

So you are responsible for making sure that classes have a unique name.
We do however provide you with some assistance:

- We have compile time checks in place which should let the *build fail* if classes would end up having the same name.
- The `@RegisterClass` annotation lets you define a custom registration name: `@RegisterClass("CustomRegistrationName")`.
- Register the class names with the fully qualified name: `com.mygame.MyClass` will be registered as: `com_mygame_MyClass`. This can be configured with:
    ```kotlin
    godot {
        isFqNameRegistrationEnabled.set(true)
    }
    ```

!!! warning "Class names from other languages"
    Even with all these checks and helpers in place, we cannot check the names of classes from other languages like GDScript or C#. It's your responsibility to make sure there are no naming conflicts.

### Hierarchy

As mentioned beforehand, Godot does not have the concept of namespaces. So all classes are registered at top level.
It does not matter where in the folder hierarchy a script resides in, it still is accessed the same way.
Hence, it does not matter if the registration files are all in one directory, or scattered across multiple directories.
By default, the registration files are all generated in a folder hierarchy which resembles your package hierarchy:

- `com.mygame.packageA.ClassA`
- `com.mygame.packageB.ClassB`

```
[registrationFileBaseDir]/
└── com/
    └── mygame/
        ├── packageA/
        │   └── ClassA.gdj
        └── packageB/
            └── ClassB.gdj
```

Some do not like this hierarchical structure and especially for small games with not many scripts, this could be undesirable to work with.
Thus, we let you turn of the hierarchical generation in your `build.gradle.kts`:

```kotlin
godot {
    isRegistrationFileHierarchyEnabled.set(false)
}
```

Which would result in a folder structure like the following:

- `com.mygame.packageA.ClassA`
- `com.mygame.packageB.ClassB`

```
[registrationFileBaseDir]/
├── ClassA.gdj
└── ClassB.gdj
```

This could also be useful together with the option `isFqNameRegistrationEnabled` from the [Naming section](#naming) which would result in:

- `com.mygame.packageA.ClassA`
- `com.mygame.packageB.ClassB`

```
[registrationFileBaseDir]/
├── com_mygame_packageA_ClassA.gdj
└── com_mygame_packageA_ClassB.gdj
```

## Lifecycle

If you want to be notified when initialization and destruction of your class' instance happens, use the `init` block
and override the `_onDestroy` function respectively.

```kt
@RegisterClass
class RotatingCube: Node3D() {
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
        // Smart Cast works here as well!
        parent.setShape(...)
    }
    ```

## Constructors

Godot requires you to have a default constructor on your classes.
You can define additional constructors but you have to register them by annothing them with `@RegisterConstructor`.
Default constructors, on the other hand, are always registered automatically.

Constructors can also have **a maximum of 8 arguments** and must have a unique argument count as constructor overloading is not yet supported.
This limitation is only for registered constructors.

### Instantiate Kotlin script classes in GDScript

From GDScript it is possible to create an instance of a Kotlin class using the default constructor:

```kt
var instance := YourKotlinClass.new()
```

Additional constructors must use the `load` function:

```kt
var instance := load("res://gdj/YourClass.gdj").new(oneArg, anotherArg)
```

!!! info
    The limitation of max 8 arguments for constructors is arbitrary. We decided to introduce this limitation to prevent performance bottlenecks for creating objects as each argument passed to a constructor needs to be unpacked by the binding. The more arguments, the more unpacking is needed which means more overhead.


## Customization

You can customize to some extent how your class should be registered in Godot.

The `@RegisterClass` annotation takes only one argument:

- **className**: If set, the class will be registered with the provided name.

!!! warning "Unique class names"
    If you specify the `className` in the annotation, you have to make sure that this name is unique! We implemented compilation checks to make sure the compilation fails if more than two classes are registered with the same name, but we cannot check class names from other scripting languages like GDScript or C#! It is also recommended installing our intellij plugin as it shows duplicated registered class names in the editor as an error.


## Tool Mode

Annotate your class with `@Tool` to make it a tool class (note that `@RegisterClass` is required for this annotation to take effect).

!!! Caution
    This is currently not implemented.