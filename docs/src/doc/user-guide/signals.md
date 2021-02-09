Use the delegate `signal` to create a signal and annotate it with `@RegisterSignal`. Note that the name of 
the signal must start with a prefix `signal` (see [API differences](../api-differences.md) section for an explanation).
This binding only supports signals with at most 10 parameters at the moment.

```kotlin
@RegisterClass
class RotatingCube: Spatial() {
    @RegisterSignal  
    val signalReverseChanged by signal<Boolean>("reverse")
}
```

## Emitting
Every signal has a `emit` method which can be used to emit it.

```kotlin
signalReverseChanged.emit(false)
```

## Subscribing
A method can be subscribed/connected to a signal via `connect`. The number of parameters of the method and signal must match.

```kotlin
class SomeObject: Object() {
    fun onReverseChanged(reverse: Boolean) {
        GD.print("Value of reverse has changed: $reverse")
    } 
}

val targetObject = SomeObject()
signalReverseChanged.connect(targetObject, targetObject::onReverseChanged)
```