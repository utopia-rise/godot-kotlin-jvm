Use the delegate `signal` to create a signal and annotate it with `@RegisterSignal`.

!!! warning Signal parameter count
    In GDScript, signals can have any number of arguments, this is not possible in Kotlin as it is a statically typed language. At the moment, you can create signals and expose them to Godot with at most 10 parameters.  
    If you need more than 10 parameters, you can either use the not typesafe function `connect(signalAsString, targetObject, targetMethodAsString)` and the corresponding emit function or you can write your own typesafe extension functions like we did, to further increase the supported arg count. Keep in mind that you pass in the converted function and signal names (snake_case) to the above mentioned functions (see the section [Naming](#naming) below for details).


```kotlin
@RegisterClass
class RotatingCube: Spatial() {
    @RegisterSignal
    val reverseChanged by signal<Boolean>("reverse")
}
```

## Naming
For consistency with Godot's style, the name of your signal is converted to snake_case. The signal `helloThere` is known as `hello_there` in GDScript.

## Emitting
Every signal has a `emit` method which can be used to emit it in a typesafe way.

```kotlin
reverseChanged.emit(false)
```

## Subscribing
A method can be subscribed/connected to a signal via `connect`.

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
        reverseChanged.connect(targetObject, targetObject::onReverseChanged)
    }
}
```
