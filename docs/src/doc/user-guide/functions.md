Any Kotlin function can be registered as long as its parameters and return type can be converted to a
`Variant`, additionally the function must be annotated with `@RegisterFunction`.

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
You can and should name your function kotlin style camelCase. But for a more natural feel and more consistent code in GDScript when using kotlin functions from GDScript, your functions are actually registered as snake_case. So if you want to use your kotlin function `greetTheWorldWithHello()` call it from GDScript with `greet_the_world_with_hello()`.

## Virtual functions
Virtual functions (like `_ready`, `_process` and `_physics_process`) are declared as overridable functions. The default implementation throws a `NotImplementedException`, so you have to override it if you plan to expose a virtual function to Godot. Remember, just overriding is not enough to use that function - you have to explicitly register it as well with `@RegisterFunction` like you have to with your own functions.

## Registration Configuration
You can customize to some extent how your function should be registered in Godot. The `@RegisterFunction` annotation takes one argument:

- **rpcMode**: Default: `RPCMode.DISABLED`

## What's next?
- [Registering classes](classes.md)
- [Registering properties](properties.md)
- [Registering signals](signals.md)
