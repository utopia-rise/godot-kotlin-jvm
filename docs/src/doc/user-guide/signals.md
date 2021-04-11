Use the delegate `signal` to create a signal and annotate it with `@RegisterSignal`. Note that the name of
the signal must start with a prefix `signal` (see [API differences](../api-differences.md) section for an explanation).
This module only supports signals with at most 10 parameters at the moment.

```kotlin
@RegisterClass
class RotatingCube: Spatial() {
    @RegisterSignal
    val signalReverseChanged by signal<Boolean>("reverse")
}
```

## Naming
For better compatibility the `signal` prefix is dropped during registration, and the name of your signal is converted to snake_case. So to use your signal `signalHelloThere` from GDScript, use it with `hello_there`.

## Emitting
Every signal has a `emit` method which can be used to emit it in a typesafe way.

```kotlin
signalReverseChanged.emit(false)
```

## Subscribing
A method can be subscribed/connected to a signal via `connect`. The number of parameters and their type of the function and signal must match. But the IDE will complain, and the compilation will fail if this is not the case.

```kotlin
@RegisterClass
class SomeObject: Object() {
    @RegisterFunction
    fun onReverseChanged(reverse: Boolean) {
        println("Value of reverse has changed: $reverse")
    }
}

val targetObject = SomeObject()
signalReverseChanged.connect(targetObject, targetObject::onReverseChanged)
```

!!! note ""
    The targetObject you pass in the `connect` function has to be a registered class!
    Also the target function has to be registered!


## What's next?
- [Registering classes](classes.md)
- [Registering properties](properties.md)
- [Registering functions](functions.md)
