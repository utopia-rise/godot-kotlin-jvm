Unlike GDScript, Signals and Callables in Godot-Kotlin are typed and numbered generic classes. 
Instead of taking a vararg of any kind of arguments, type Safety is enforced here. 
The classic vararg Signal::emit() and Callable::call() are still implemented but seen as unsafe, we need them because it's not always possible to know their exact types (e.g. when obtained from Godot).
It means that Signals must be connected to Callable that perfectly matches their signatures.

## Signals
You have 2 ways to declare your custom signals in scripts: Using a delegate or a backing field.

The delegate is the recommended way, it is lightweight and doesn't store the signal directly, instead it generates a new one each call.
You can opt to directly create a signal and store it in your script, but it uses more memory.
Signals are not stateful so it's usually a waste to store them directly per instance, unless you have a high rate of connection/disconnection.

In both case, you have to provide the name of the signal parameters as strings for the registration to Godot.

/// tab | Kotlin
```kotlin
@RegisterClass
class MyScript: Node() {
    @RegisterSignal
    val mySignal by signal1<Boolean>("reverse")
    
    @RegisterSignal
    val mySignal = Signal1<Boolean>("mySignal", "reverse")
}
```
///

/// tab | Java
```java
@RegisterClass
public MyScript extends Node {
    @RegisterSignal
    public Signal1<Boolean> mySignal = Signal1.create(this, "mySignal", "reverse"); // Only one way to do it in Java.
}
```
///

!!! warning Signal parameter count
    In GDScript, signals can have any number of arguments, this is not possible in Kotlin as it is a statically typed language. 
    At the moment, you can create signals and expose them to Godot up to 16 parameters.

### Emitting

Every signal has a `emit` method which can be used to emit it in a type-safe way.

/// tab | Kotlin
```kotlin
reverseChanged.emit(false)
```
///

/// tab | Java
```java
reverseChanged.emit(false);
```
///

## Callables

You can use a classic Callable referencing a Godot Object and one of its method or conveniently use to avoid to creating a separate function.


/// tab | Kotlin
```kotlin
    val regularCallable = NativeCallable(myObject, MyObject::myMethod)
    val customCallable = callable1<String> { println(it) }
```
///

/// tab | Java
```java
    NativeCallable regularCallable = Callable.create(myObject, "myMethod".toGodotName());
    LambdaCallable1<Void, String> customCallable = LambdaCallable1.create(
            Void.class,
            String.class,
            (string) -> {
                System.out.println(string);
            }
    );
```
///

### Signals and Callables together

Kotlin and Java already have ways to pass functions around as References. 
In that context and unlike GDScript, the only reason you want to use a Callable in your scripts is either to pass them as an argument to a Godot method or, most likely, to connect to signal. 

A method can be subscribed/connected to a signal via `connect` using a function reference or a StringName of the method you want to call.
Note that the connected method has to be a registered to Godot.

/// tab | Kotlin
```kotlin
@RegisterClass
class SomeObject: Object() {
    @RegisterFunction
    fun onReverseChanged(reverse: Boolean) {
        println("Value of reverse has changed: $reverse")
    }
}

@RegisterClass
class AnotherObject: Object() { 
    @RegisterSignal
    val mySignal by signal1<Boolean>("reverse")
    
    private val targetObject = SomeObject()

    init {
        // Here are 4 different ways to connect a signal to a registered method
        mySignal.connect(targetObject, targetObject::onReverseChanged) // The recommanded way. Create a Callable behind the hood.
        mySignal.connect(Callable(targetObject, "onReverseChanged".toGodotName()) // Second pick, use it if you can't have a function reference.
        mySignal.connect(Callable(targetObject, "on_reverse_changed") // Unsafe, try to use snake_case in your code as least as possible.
        connect("my_signal", Callable(targetObject, "on_reverse_changed") // Really, don't do that.
    }
}
```
///

/// tab | Java
```java
@RegisterClass
public class SomeObject extends Object {
    @RegisterFunction
    public void onReverseChanged(boolean reverse) {
        System.out.println("Value of reverse has changed: " + reverse);
    }
}

@RegisterClass
public class AnotherObject extends Object {
    @RegisterSignal
    public Signal1<Boolean> mySignal = Signal1.create(this, "mySignal", "reverse");

    private SomeObject targetObject = new SomeObject();

    public AnotherObject() {
        // Here are 3 different ways to connect a signal to a registered method. The method reference syntax is not implemented for Java.
        mySignal.connect(Callable.create(targetObject, StringNames.toGodotName("onReverseChanged"))); // The recommanded way.
        mySignal.connect(Callable.create(targetObject, "on_reverse_changed")); // Unsafe, try to use snake_case in your code as least as possible.
        connect("my_signal", Callable.create(targetObject, "on_reverse_changed")); // Really, don't do that.
    }
}
```
///

You can also use Kotlin lambdas directly to subscribe to signals

```kt
mySignal.connect {
    println("This message has been written by a Kotlin Lambda")
}
```

## Naming

For consistency with Godot's style, the name of your signal is registered to Godot as snake_case.
The signal `helloThere` is known as `hello_there` in GDScript.