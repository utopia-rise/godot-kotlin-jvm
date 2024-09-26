Signals in Godot are typed generic classes. They must be connected to and emitted using those exact arguments as well.
You have 2 ways to declare your custom signals in scripts: Using a delegate or a backing field.

The delegate is the recommended way, it is lightweight and doesn't store the signal directly, instead it generates a new one each call.
You can opt to directly create a signal and store it in your script, but it uses more memory.
Signals are not stateful so it's usually a waste to store them directly per instance, unless you have a high rate of connection/disconnection.

In both case, you have to provide the name of the signal parameters as strings for the registration to Godot.

```kotlin
@RegisterClass
class MyScript: Node() {
    @RegisterSignal
    val mySignal by signal1<Boolean>("reverse")
    
    @RegisterSignal
    val mySignal = Signal1<Boolean>("mySignal", "reverse")
}
```

!!! warning Signal parameter count
    In GDScript, signals can have any number of arguments, this is not possible in Kotlin as it is a statically typed language. 
    At the moment, you can create signals and expose them to Godot up to 16 parameters.

## Emitting

Every signal has a `emit` method which can be used to emit it in a type-safe way.

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
        mySignal.connect(targetObject, targetObject::onReverseChanged)
    }
}
```

You can also use Kotlin lambdas directly to subscribe to signals

```kt
mySignal.connect {
    println("This message has been written by a Kotlin Lambda")
}
```

## Naming

For consistency with Godot's style, the name of your signal is converted to snake_case.
The signal `helloThere` is known as `hello_there` in GDScript.