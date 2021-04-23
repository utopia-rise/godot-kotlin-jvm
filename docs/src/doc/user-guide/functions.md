Any Kotlin function can be registered as long as its parameters and return type can be converted to a `Variant`. To register a function annotate it with `@RegisterFunction`.

```kotlin
@RegisterClass
class RotatingCube: Spatial() {
    @RegisterFunction
    override fun _ready() {
        println("I am ready!")
    }
}
```

## Naming
Function names should follow Kotlin's style which is camelCase. For consistency with GDScript's style, your properties are actually registered as snake_case. So a function `doSomething()` in Kotlin is usable in GDScript as `do_something()`.

## Virtual functions
Virtual functions (like `_ready`, `_process` and `_physics_process`) are declared as overridable functions. The default implementation throws a `NotImplementedException`, so you have to override it if you plan to expose a virtual function to Godot. Remember, just overriding is not enough to use that function - you have to explicitly register it as well with `@RegisterFunction` like you have to with your own functions.

## Customization
You can customize to some extent how your function should be registered in Godot. The `@RegisterFunction` annotation takes one argument:

- **rpcMode**: Default: `RPCMode.DISABLED`
