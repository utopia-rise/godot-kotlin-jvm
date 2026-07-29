Any Kotlin, Java, or Scala function can be registered as long as its
parameters and return type can be converted to a `Variant`. Annotate ordinary
project functions with `@Register`. Compatible overrides of Godot functions
are recognized from the base class.

/// tab | Kotlin
```kotlin
@Script
class RotatingCube : Node3D() {
    @Register
    fun announceReady() {
        println("I am ready!")
    }

    override fun _ready() {
        announceReady()
    }
}
```
///

/// tab | Java
```java
@Script
public class RotatingCube extends Node3D {
    @Register
    public void announceReady() {
        System.out.println("I am ready!");
    }

    @Override
    public void _ready() {
        announceReady();
    }
}
```
///

/// tab | Scala
```scala
@Script
class RotatingCube extends Node3D {
  @Register
  def announceReady(): Unit = {
    println("I am ready!")
  }

  override def _ready(): Unit = {
    announceReady()
  }
}
```
///

## Naming

Function names should follow the usual style of the language you use. For consistency with Godot's style,
your functions are actually registered as `snake_case`.
Therefore, a function called `doSomething()` is usable in GDScript as `do_something()`.

## Virtual functions

Virtual functions such as `_ready`, `_process`, and `_physics_process` are
declared as overridable functions. Override one to provide its behavior.
Because it is already a Godot function, the inherited declaration identifies
it without an additional `@Register`.

## Arguments count

Godot limits the allowed argument count of functions to `16`. Thus, this binding also has this limitation.
If you want to pass more than 16 parameters in a function, you need to wrap them in a container
(like a custom container class or a `VariantArray` or `Dictionary`).

## Customization

`@Register` only selects an ordinary function. Add a more specific annotation
when the function has additional behavior. For example, `@Rpc` selects the
function through its registration meta-annotation and configures its
networking behavior at the same time.

See the [registration guide](advanced/registration-logic.md#functions-and-godot-overrides)
for how function selection changes between modes.


