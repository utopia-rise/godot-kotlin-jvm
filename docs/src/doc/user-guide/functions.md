Any Kotlin, Java, or Scala function can be registered as long as its parameters and return type can be converted to a `Variant`.
To register a function annotate it with `@Register`.

/// tab | Kotlin
```kotlin
@Script
class RotatingCube : Node3D() {
    @Register
    override fun _ready() {
        println("I am ready!")
    }
}
```
///

/// tab | Java
```java
@Script
public class RotatingCube extends Node3D {
    @Register
    @Override
    public void _ready() {
        System.out.println("I am ready!");
    }
}
```
///

/// tab | Scala
```scala
@Script
class RotatingCube extends Node3D {
  @Register
  override def _ready(): Unit = {
    println("I am ready!")
  }
}
```
///

## Naming

Function names should follow the usual style of the language you use. For consistency with Godot's style,
your functions are actually registered as `snake_case`.
Therefore, a function called `doSomething()` is usable in GDScript as `do_something()`.

## Virtual functions

Virtual functions (like `_ready`, `_process` and `_physics_process`) are declared as overridable functions.
The default implementation throws a `NotImplementedException`, so you have to override it if you plan to expose
a virtual function to Godot. Remember, just overriding is not enough to use that function - you have to explicitly
register it as well with `@Register`.

## Arguments count

Godot limits the allowed argument count of functions to `16`. Thus, this binding also has this limitation.
If you want to pass more than 16 parameters in a function, you need to wrap them in a container
(like a custom container class or a `VariantArray` or `Dictionary`).

## Customization

You can customize to some extent how your functions should be registered in Godot. The `@Register` annotation takes one argument:

- **rpcMode**: Default: `RPCMode.DISABLED`


