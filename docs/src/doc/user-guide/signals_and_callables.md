Unlike GDScript, signals and callables expose a typed API on top of their base dynamic form.

## Safe and unsafe APIs

`Signal` and `Callable` start from a base typeless, arityless interface.
That base layer exposes the dynamic operations:

- `Signal.emitUnsafe(...)`
- `Signal.connectUnsafe(...)`
- `Callable.callUnsafe(...)`
- `Callable.callDeferredUnsafe(...)`
- `Callable.bindUnsafe(...)`

The `Unsafe` variants are the true equivalent to the dynamic GDScript behavior.
They take a `vararg Any?` argument list and defer correctness checks to runtime.

That is useful for interoperability with values coming from Godot, where the exact signature is not always known on the JVM side.
For regular code, they should generally be avoided in favor of the typed APIs.

On top of that base layer, signals and callables are specialized by arity and generic parameter types:

- `Signal0` to `Signal16`
- `Callable0` to `Callable16`

These specialized variants expose the safe equivalents of the base operations:

- `emit(...)` instead of `emitUnsafe(...)`
- `connect(...)` instead of `connectUnsafe(...)`
- `call(...)` and `invoke(...)` instead of `callUnsafe(...)`
- typed `bind(...)` instead of `bindUnsafe(...)`

Those safe methods take a specific number of typed arguments matching the signal or callable arity.
This is where compile-time checking comes from.

One important difference between JVM languages is how much type information can be recovered from the source syntax:

- Kotlin gets the most ergonomic API, with delegates, method references, and lambda helpers such as `signalN`, `methodCallableN`, `lambdaCallableN`, `connectMethod`, and `connectLambda`.
- Java and Scala use the same typed signal and callable families, but usually construct them more explicitly with `SignalN.create(...)`, `MethodCallableN.create(...)`, `MethodStringNameN`, and `LambdaCallableN.create(...)`.

## How this differs from GDScript

In GDScript, signal and callable usage is mostly checked at runtime:

```gdscript
signal health_changed(current, max)

func _ready():
    health_changed.connect(_on_health_changed)

func _on_health_changed(current, max):
    print(current, max)
```

Here, the signal and callable arity is part of the type:

/// tab | Kotlin
```kotlin
@Script
class Player : Node() {
    @Emit("current", "max")
    val healthChanged by signal2<Int, Int>()

    @Register
    override fun _ready() {
        val onHealthChangedCallable = methodCallable2(this, Player::onHealthChanged)
        healthChanged.connect(onHealthChangedCallable)
        healthChanged.emit(24, 100)
    }

    @Register
    fun onHealthChanged(current: Int, max: Int) {
        println("$current / $max")
    }
}
```

///

/// tab | Java
```java
@Script
public class Player extends Node {
    @Emit
    private final Signal0 finished = Signal0.create(this, "finished");

    @Register
    @Override
    public void _ready() {
        AnimatedSprite2D sprite = new AnimatedSprite2D();
        MethodCallable0<Void> pauseCallable = MethodCallable0.create(sprite, AnimatedSprite2D.pauseName);

        finished.connect(pauseCallable);
        finished.emit();
    }
}
```

///

/// tab | Scala
```scala
@Script
class Player extends Node {
  @Emit
  val finished: Signal0 = Signal0.create(this, "finished")

  @Register
  override def _ready(): Unit = {
    val sprite = new AnimatedSprite2D()
    val pauseCallable = MethodCallable0.create(sprite, AnimatedSprite2D.pauseName)

    finished.connect(pauseCallable)
    finished.emit()
  }
}
```
///

`Signal2<Int, Int>` can only emit two `Int`s, and it can only connect to a `Callable2<*, Int, Int>`.
If you call `emitUnsafe` or `connectUnsafe`, you are back to the dynamic style used by GDScript.
That is why the safe typed API is the default recommendation.

!!! warning Signal parameter count
    Typed signal and callable variants currently go up to 16 parameters.

## Declaring signals

The cross-language baseline is the explicit `SignalN.create(...)` form:

/// tab | Kotlin
```kotlin
val ready = Signal0.create(this, "ready")
val healthChanged = Signal2.create<Int, Int>(this, "healthChanged")
```

///

/// tab | Java
```java
Signal0 ready = Signal0.create(this, "ready");
Signal2<Integer, Integer> healthChanged = Signal2.create(this, "healthChanged");
```

///

/// tab | Scala
```scala
val ready: Signal0 = Signal0.create(this, "ready")
val healthChanged: Signal2[Integer, Integer] = Signal2.create(this, "healthChanged")
```
///

For Java and Scala, this is also the normal declaration style inside a class.
Make sure the variable name and the string passed to `SignalN.create(...)` are the same.
Use the source-language name such as `healthChanged`, not a manually converted `snake_case` version.
The signal is registered to Godot from the variable itself, but the signal instance also needs to carry its own name so Godot can identify it correctly.
The conversion to Godot's `snake_case` name happens automatically.

Kotlin also provides a delegate syntax, which is usually the recommended form for Kotlin classes:

```kotlin
@Script
class Player : Node() {
    @Emit("current", "max")
    val healthChanged by signal2<Int, Int>()
}
```

This is lightweight.
The delegate does not store a dedicated `Signal2` instance on the object.
It recreates a wrapper on access from the owning object and the property name.

That delegate syntax is specific to Kotlin.

## Emitting signals

Typed signals expose a typed `emit` function:

/// tab | Kotlin
```kotlin
healthChanged.emit(24, 100)
```

///

/// tab | Java
```java
healthChanged.emit(24, 100);
```

///

/// tab | Scala
```scala
healthChanged.emit(24, 100)
```
///

## Callable kinds

There is one base `Callable` interface, and the most useful concrete variants are:

- `MethodCallableN`: wraps a method on a Godot object.
- `LambdaCallableN`: wraps a JVM lambda.
- `VariantCallable`: wraps Godot's native dynamic callable type.

### Method callables

Use method callables when the callback is an existing registered Godot method.

Kotlin and Java/Scala reach that goal differently:

- Kotlin usually uses method references, so `methodCallableN(target, Type::method)` is the most natural form.
- Java and Scala usually create a `MethodCallableN` explicitly from a method name.
- For built-in Godot API methods, Java and Scala should prefer the pre-made `MethodStringNameN` fields exposed by engine classes.

#### Kotlin

```kotlin
@Script
class UiController : Node() {
    @Register
    fun onHealthChanged(current: Int, max: Int) {
        println("UI update: $current / $max")
    }
}

val controller = UiController()
val callableFromReference: MethodCallable2<Unit, Int, Int> =
    methodCallable2(controller, UiController::onHealthChanged)
```

#### Java and Scala

For built-in Godot API methods, use the pre-made typed method-name fields exposed by engine classes.
If you want the same type-safe path for your own exported methods in Java or Scala, you can create a `MethodStringNameN(...)` explicitly.

/// tab | Java
```java
AnimatedSprite2D sprite = new AnimatedSprite2D();
MethodCallable0<Void> pauseCallable = MethodCallable0.create(sprite, AnimatedSprite2D.pauseName);
MethodCallable3<Void, StringName, Float, Boolean> playCallable =
    MethodCallable3.create(sprite, AnimatedSprite2D.playName);
```

///

/// tab | Scala
```scala
val sprite = new AnimatedSprite2D()

val pauseCallable: MethodCallable0[Void] = MethodCallable0.create(sprite, AnimatedSprite2D.pauseName)
val playCallable: MethodCallable3[Void, StringName, Float, Boolean] =
  MethodCallable3.create(sprite, AnimatedSprite2D.playName)
```
///

The fallback `createUnsafe(target, "methodName")` form still exists, but it drops back to string-based runtime checks.
Use it only when you cannot express the callable with a typed helper.

### Lambda callables

Use lambda callables when the callback only exists on the JVM side and is not a registered Godot method.

The language split is similar here:

- Kotlin usually uses `lambdaCallableN { ... }` or `.asCallable()`.
- Java and Scala use `LambdaCallableN.create(...)` and provide explicit JVM classes for arguments and return values.

#### Kotlin

Create one directly:

```kotlin
val printHealth = lambdaCallable2<Unit, Int, Int> { current, max ->
    println("Lambda saw $current / $max")
}
```

Or convert an existing lambda:

```kotlin
val printHealth = { current: Int, max: Int ->
    println("Lambda saw $current / $max")
}.asCallable()
```

#### Java and Scala

For a no-return callable:

/// tab | Java
```java
LambdaCallable2<Void, Integer, Integer> printHealth = LambdaCallable2.create(
    Integer.class,
    Integer.class,
    (current, max) -> System.out.println("Lambda saw " + current + " / " + max)
);
```

///

/// tab | Scala
```scala
val printHealth = LambdaCallable2.create(
  classOf[Integer],
  classOf[Integer],
  (current: Integer, max: Integer) => println(s"Lambda saw $current / $max")
)
```
///

For a callable with a return value:

/// tab | Java
```java
LambdaCallable2<String, Integer, String> format = LambdaCallable2.create(
    String.class,
    Integer.class,
    String.class,
    (amount, unit) -> amount + " " + unit
);
```

///

/// tab | Scala
```scala
val format = LambdaCallable2.create(
  classOf[String],
  classOf[Integer],
  classOf[String],
  (amount: Integer, unit: String) => s"$amount $unit"
)
```
///

If you expose one of those Java or Scala callables as a registered property, prefer the base `Callable` type for the property itself.
The stored value can still be a `LambdaCallableN`, but the property surface should currently stay at `Callable`.

### Variant callables

`VariantCallable` is the native, fully dynamic callable wrapper.
It is useful when a callable comes from Godot itself and not from the typed APIs shown above.

In user code, prefer the typed families when you know the signature.

## Typed callables

Each typed callable exposes:

- `call(...)`
- `invoke(...)`
- `callDeferred(...)`
- `bind(...)`

Example:

/// tab | Kotlin
```kotlin
val format = lambdaCallable2<String, Int, String> { amount, unit -> "$amount $unit" }

val result = format(24, "HP")
val fixedUnit = format.bind("HP")

println(result)        // 24 HP
println(fixedUnit(10)) // 10 HP
```

///

/// tab | Java
```java
Callable2<String, Integer, String> format = LambdaCallable2.create(
    String.class,
    Integer.class,
    String.class,
    (amount, unit) -> amount + " " + unit
);

String result = format.call(24, "HP");
Callable1<String, Integer> fixedUnit = format.bind("HP");

System.out.println(result);             // 24 HP
System.out.println(fixedUnit.call(10)); // 10 HP
```

///

/// tab | Scala
```scala
val format = LambdaCallable2.create(
  classOf[String],
  classOf[Integer],
  classOf[String],
  (amount: Integer, unit: String) => s"$amount $unit"
)

val result = format.call(24, "HP")
val fixedUnit = format.bind("HP")

println(result)             // 24 HP
println(fixedUnit.call(10)) // 10 HP
```

///

`bind(...)` always binds arguments from the right and returns a callable with a smaller arity.

## Connecting signals

There are two main patterns when connecting a typed signal:

- connect an existing method
- connect an inline lambda

Kotlin has convenience helpers for both.
Java and Scala have arity-specific `SignalConnectors.connectMethodX(...)` and `SignalConnectors.connectLambdaX(...)` helpers that pass the typed method-name or JVM action information explicitly.

### Connect a method

The most explicit form is `signal.connect(callable)`.
That is the default mental model in Java and Scala, and it also works in Kotlin.

/// tab | Kotlin
```kotlin
val callable: Callable2<Unit, Int, Int> = ...

healthChanged.connect(
    callable
)
```

///

/// tab | Java
```java
Callable2<Void, Integer, Integer> callable = ...;

healthChanged.connect(
    callable
);
```

///

/// tab | Scala
```scala
val callable: Callable2[Void, Integer, Integer] = ...

healthChanged.connect(
  callable
)
```
///

### Connect a lambda

For inline subscriptions, connect a lambda callable directly:

/// tab | Kotlin
```kotlin
healthChanged.connect(
    lambdaCallable2<Unit, Int, Int> { current, max ->
        println("Health changed to $current / $max")
    }
)
```

///

/// tab | Java
```java
healthChanged.connect(
    LambdaCallable2.create(
        Integer.class,
        Integer.class,
        (current, max) -> System.out.println("Health changed to " + current + " / " + max)
    )
);
```

///

/// tab | Scala
```scala
healthChanged.connect(
  LambdaCallable2.create(
    classOf[Integer],
    classOf[Integer],
    (current: Integer, max: Integer) => println(s"Health changed to $current / $max")
  )
)
```
///

## SignalConnector

`SignalConnector` is a small helper around one `Signal` plus one `Callable`.

It exists for the cases where you want a reusable connection handle instead of just calling `signal.connect(callable)` directly.
That makes it easy to:

- `connect()`
- `disconnect()`
- `isConnected()`
- `isValid()`

### Create one from a method

Kotlin provides `connectMethod`, which creates the callable, connects it immediately, and returns a `SignalConnector`:

```kotlin
val connector = healthChanged.connectMethod(controller, UiController::onHealthChanged)

connector.isConnected()
connector.disconnect()
```

Java and Scala can use the same `SignalConnector` helper with a pre-made typed method name:

/// tab | Java
```java
Signal0 finished = Signal0.create(this, "finished");
AnimatedSprite2D sprite = new AnimatedSprite2D();

SignalConnector connector = SignalConnectors.connectMethod0(
    finished,
    sprite,
    AnimatedSprite2D.pauseName
);

connector.isConnected();
connector.disconnect();
```

///

/// tab | Scala
```scala
val finished: Signal0 = Signal0.create(this, "finished")
val sprite = new AnimatedSprite2D()

val connector = SignalConnectors.connectMethod0(
  finished,
  sprite,
  AnimatedSprite2D.pauseName
)

connector.isConnected()
connector.disconnect()
```
///

### Create one from a lambda

For inline subscriptions, Kotlin provides `connectLambda`:

```kotlin
val connector = healthChanged.connectLambda { current, max ->
    println("Health changed to $current / $max")
}
```

Under the hood this creates a typed `LambdaCallableN`, connects it, and returns a `SignalConnector`.

Java and Scala can also use a direct connector helper:

/// tab | Java
```java
SignalConnector connector = SignalConnectors.connectLambda2(
    healthChanged,
    Integer.class,
    Integer.class,
    (current, max) -> System.out.println("Health changed to " + current + " / " + max)
);
```

///

/// tab | Scala
```scala
val connector = SignalConnectors.connectLambda2(
  healthChanged,
  classOf[Integer],
  classOf[Integer],
  (current: Integer, max: Integer) => println(s"Health changed to $current / $max")
)
```
///

This avoids having to rebuild the same callable manually later or keep the raw signal/callable pair around yourself.

## A complete example

/// tab | Kotlin
```kotlin
@Script
class Player : Node() {
    @Emit("current", "max")
    val healthChanged by signal2<Int, Int>()

    fun damage(amount: Int) {
        healthChanged.emit(90 - amount, 100)
    }
}

@Script
class UiController : Node() {
    @Register
    fun onHealthChanged(current: Int, max: Int) {
        println("UI update: $current / $max")
    }
}

@Script
class GameScene : Node() {
    private val player = Player()
    private val ui = UiController()

    override fun _ready() {
        player.healthChanged.connectMethod(ui, UiController::onHealthChanged)

        player.healthChanged.connectLambda { current, max ->
            println("Observed from lambda: $current / $max")
        }

        val callable = methodCallable2(ui, UiController::onHealthChanged)
        player.healthChanged.connect(callable)
    }
}
```

///

/// tab | Java
```java
@Script
public class Player extends Node {
    @Emit(parameters = {"current", "max"})
    public final Signal2<Integer, Integer> healthChanged = Signal2.create(this, "healthChanged");

    public void damage(int amount) {
        healthChanged.emit(90 - amount, 100);
    }
}

@Script
public class UiController extends Node {
    @Register
    public void onHealthChanged(int current, int max) {
        System.out.println("UI update: " + current + " / " + max);
    }
}

@Script
public class GameScene extends Node {
    private final Player player = new Player();
    private final AnimatedSprite2D sprite = new AnimatedSprite2D();
    private final Signal0 finished = Signal0.create(this, "finished");

    @Override
    public void _ready() {
        SignalConnectors.connectMethod0(
            finished,
            sprite,
            AnimatedSprite2D.pauseName
        );

        SignalConnectors.connectLambda2(
            player.healthChanged,
            Integer.class,
            Integer.class,
            (current, max) -> System.out.println("Observed from lambda: " + current + " / " + max)
        );
    }
}
```

///

/// tab | Scala
```scala
@Script
class Player extends Node {
  @Emit(parameters = Array("current", "max"))
  val healthChanged: Signal2[Integer, Integer] = Signal2.create(this, "healthChanged")

  def damage(amount: Int): Unit = {
    healthChanged.emit(90 - amount, 100)
  }
}

@Script
class UiController extends Node {
  @Register
  def onHealthChanged(current: Int, max: Int): Unit = {
    println(s"UI update: $current / $max")
  }
}

@Script
class GameScene extends Node {
  private val player = new Player()
  private val sprite = new AnimatedSprite2D()
  private val finished: Signal0 = Signal0.create(this, "finished")

  override def _ready(): Unit = {
    SignalConnectors.connectMethod0(
      finished,
      sprite,
      AnimatedSprite2D.pauseName
    )

    SignalConnectors.connectLambda2(
      player.healthChanged,
      classOf[Integer],
      classOf[Integer],
      (current: Integer, max: Integer) => println(s"Observed from lambda: $current / $max")
    )
  }
}
```
///

The Kotlin example is fully type checked against `Signal2<Int, Int>`.
The Java and Scala versions keep the same explicit signal/callable structure, but their safety depends on which callable construction path you use.

## Naming

For consistency with Godot, signals are registered to Godot in `snake_case`.
For example, a property named `healthChanged` is exposed to Godot as `health_changed`.
When you create a signal wrapper manually with `SignalN.create(...)`, pass the original property name.
The wrapper converts it to the Godot name automatically.


