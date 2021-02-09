Any Kotlin function can be registered as long as its parameters and return type can be converted to a 
`Variant`, additionally the function must be annotated with `@RegisterFunction`. This binding only support 
methods with at most 10 parameters at the moment.

```kotlin
@RegisterClass
class RotatingCube: Spatial() {
    
    @RegisterFunction  
    override fun _ready() {
        GD.print("I am ready!")
    }
}
```

## Virtual methods
Virtual methods (like `_ready`, `_process` and `_physics_process`) are declared as overridable methods. The default implementation throws a `NotImplementedException`, so you have to override it if you plan to expose a virtual method to Godot.  
Remember; just overriding is not enough to use that function. You have to explicitly register it as well with `@RegisterFunction` like you have to with your own methods.

## Registration Configuration
You can customize to some extent how your function should be registered in Godot:

The `@RegisterFunction` annotation takes one argument:

- **rpcMode**: Default: `RPCMode.DISABLED`