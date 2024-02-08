Any Kotlin function can be registered as long as its parameters and return type can be converted to a `Variant`.
To register a function annotate it with `@RegisterFunction`.

```kotlin
@RegisterClass
class RotatingCube: Node3D() {
    @RegisterFunction
    override fun _ready() {
        println("I am ready!")
    }
}
```

## Naming

Function names should follow Kotlin's style which is `camelCase`. For consistency with Godot's style,
your functions are actually registered as `snake_case`.
Therefore, a function called `doSomething()` in Kotlin is usable in GDScript as `do_something()`.

## Virtual Functions

Virtual functions (like `_ready`, `_process` and `_physics_process`) are declared as overridable functions.
The default implementation throws a `NotImplementedException`, so you have to override it if you plan to expose
a virtual function to Godot. Remember, just overriding is not enough to use that function - you have to explicitly
register it as well with `@RegisterFunction`.

## Arguments Count

Godot limits the allowed argument count of functions to `8`. Thus, this binding also has this limitation.
If you want to pass more than 8 parameters in a function, you need to wrap them in a container
(like a custom container class or a `VariantArray` or `Dictionary`).

## Customization

You can customize to some extent how your functions should be registered in Godot. The `@RegisterFunction` annotation takes one argument:

- **rpcMode**: Default: `RPCMode.DISABLED`
