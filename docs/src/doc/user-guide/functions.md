Any Kotlin function can be registered as long as its parameters and return type can be converted to a `Variant`.
To register a function annotate it with `@GodotMember`.

```kotlin
@GodotScript
class RotatingCube: Node3D() {
    @GodotMember
    fun myFunction() {
        println("Hello")
    }
}
```

## Naming

Function names should follow Kotlin's style which is `camelCase`. For consistency with Godot's style,
your functions are actually registered as `snake_case`.
Therefore, a function called `doSomething()` in Kotlin is usable in GDScript as `do_something()`.

## Virtual functions

Virtual functions (like `_ready`, `_process` and `_physics_process`) are declared as overridable functions.
The default implementation throws a `NotImplementedException`, so you have to override it if you plan to expose
a virtual function to Godot. Virtual functions are registered automatically and do not require an explicit `@GodotMember`
annotation.

## Arguments count

Godot limits the allowed argument count of functions to `16`. Thus, this binding also has this limitation.
If you want to pass more than 16 parameters in a function, you need to wrap them in a container
(like a custom container class or a `VariantArray` or `Dictionary`).
