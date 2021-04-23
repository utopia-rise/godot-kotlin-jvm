Use the delegate `signal` to create a signal and annotate it with `@RegisterSignal`. Note that the name of the signal must start with `signal` (see [API differences](api-differences.md) section for an explanation). This module only supports signals with at most 10 parameters at the moment.

```kotlin
@RegisterClass
class RotatingCube: Spatial() {
    @RegisterSignal
    val signalReverseChanged by signal<Boolean>("reverse")
}
```

## Naming
For consistency with GDScript's style, the `signal` prefix is dropped during registration and the name of your signal is converted to snake_case. The signal `signalHelloThere` is known as `hello_there` in GDScript.

## Emitting
Every signal has a `emit` method which can be used to emit it in a typesafe way.

```kotlin
signalReverseChanged.emit(false)
```

## Subscribing
A method can be subscribed/connected to a signal via `connect`. The number of parameters and the type of each parameter of the function must match the signal.

```kt
@RegisterClass
class SomeObject: Object() {
    @RegisterFunction
    fun onReverseChanged(reverse: Boolean) {
        println("Value of reverse has changed: $reverse")
    }
}

@RegisterClass
class AnotherObject: Object() {
    val targetObject = SomeObject()

    init {
        signalReverseChanged.connect(targetObject, targetObject::onReverseChanged)
    }
}
```