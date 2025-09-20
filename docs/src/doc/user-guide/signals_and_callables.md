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
@RegisterClass
class Player : Node() {
    @RegisterSignal("current", "max")
    val healthChanged by signal2<Int, Int>()

    @RegisterFunction
    fun onHealthChanged(current: Int, max: Int) {
        println("$current / $max")
    }
}
```

///

/// tab | Java
```java
@RegisterClass
public class Player extends Node {
    @RegisterSignal({"current", "max"})
    private final Signal2<Integer, Integer> healthChanged = Signal2.create(this, "healthChanged");

    @RegisterFunction
    public void onHealthChanged(int current, int max) {
        System.out.println(current + " / " + max);
    }
}
```

///

/// tab | Scala
```scala
@RegisterClass
class Player extends Node {
  @RegisterSignal(Array("current", "max"))
  val healthChanged: Signal2[Integer, Integer] = Signal2.create(this, "healthChanged")

  @RegisterFunction
  def onHealthChanged(current: Int, max: Int): Unit = {
    println(s"$current / $max")
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

For Kotlin, the recommended way to declare a signal is the delegate form:

/// tab | Kotlin
```kotlin
@RegisterClass
class Player : Node() {
    @RegisterSignal("current", "max")
    val healthChanged by signal2<Int, Int>()
}
```

///

/// tab | Java
```java
@RegisterClass
public class Player extends Node {
    @RegisterSignal({"current", "max"})
    private final Signal2<Integer, Integer> healthChanged = Signal2.create(this, "healthChanged");
}
```

///

/// tab | Scala
```scala
@RegisterClass
class Player extends Node {
  @RegisterSignal(Array("current", "max"))
  val healthChanged: Signal2[Integer, Integer] = Signal2.create(this, "healthChanged")
}
```
///

This is lightweight.
The delegate does not store a dedicated `Signal2` instance on the object.
It recreates a wrapper on access from the owning object and the property name.

That delegate syntax is specific to Kotlin.
Java and Scala use the explicit `SignalN.create(...)` form.

For Java and Scala, make sure the variable name and the string passed to `SignalN.create(...)` are the same.
The signal is registered to Godot from the variable itself, but the signal instance also needs to carry its own name so Godot can identify it correctly.

If you need to create a typed wrapper for an existing signal name manually, you can also use:

/// tab | Kotlin
```kotlin
val ready = Signal0.create(this, "ready")
val healthChanged = Signal2.create<Int, Int>(this, "health_changed")
```

///

/// tab | Java
```java
Signal0 ready = Signal0.create(this, "ready");
Signal2<Integer, Integer> healthChanged = Signal2.create(this, "health_changed");
```

///

/// tab | Scala
```scala
val ready: Signal0 = Signal0.create(this, "ready")
val healthChanged: Signal2[Integer, Integer] = Signal2.create(this, "health_changed")
```
///

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
- `LambdaCallableN`: wraps a Kotlin lambda.
- `VariantCallable`: wraps Godot's native dynamic callable type.

### Method callables

Use method callables when you want to point to a registered Godot method.

/// tab | Kotlin
```kotlin
@RegisterClass
class UiController : Node() {
    @RegisterFunction
    fun onHealthChanged(current: Int, max: Int) {
        println("UI update: $current / $max")
    }
}

val controller = UiController()

val callableFromReference: MethodCallable2<Unit, Int, Int> =
    callable2(controller, UiController::onHealthChanged)
```

///

/// tab | Java
```java
AnimatedSprite2D sprite = new AnimatedSprite2D();

// Safe direct method references are not available here.
MethodCallable3<Unit, StringName, Float, Boolean> playCallable = MethodCallable3.createUnsafe(
    sprite,
    "play"
);
```

///

/// tab | Scala
```scala
val sprite = new AnimatedSprite2D()

// Safe direct method references are not available here.
val playCallable = MethodCallable3.createUnsafe(
  sprite,
  "play"
)
```
///

The method-reference shortcut is usually the nicest API when you can reference the method directly.
That Kotlin style is not available in Java and Scala here, because the method reference does not expose the needed method information at runtime.
For those languages, the fallback is the explicit unsafe string-based form, and `MethodStringNameN` is the helper that improves on it.

## Pre-made method names

For Java and Scala, built-in Godot API classes already expose many pre-made `MethodStringNameN` values.
They are attached to the class itself and can be passed directly to `MethodCallableN.create(...)`.

///

/// tab | Java
```java
AnimatedSprite2D sprite = new AnimatedSprite2D();

MethodCallable0<Unit> pauseCallable = MethodCallable0.create(sprite, AnimatedSprite2D.pauseName);
MethodCallable3<Unit, StringName, Float, Boolean> playCallable =
    MethodCallable3.create(sprite, AnimatedSprite2D.playName);
```

///

/// tab | Scala
```scala
val sprite = new AnimatedSprite2D()

val pauseCallable = MethodCallable0.create(sprite, AnimatedSprite2D.pauseName)
val playCallable = MethodCallable3.create(sprite, AnimatedSprite2D.playName)
```
///

This is usually the most convenient option when you want a typed method callable for an existing Godot API method from Java or Scala.
This helper is mainly useful for existing Godot API methods, because those pre-made fields already carry the expected types.

For your own exported functions, or when no pre-made field exists, you can still build a `MethodStringNameN` manually.
That stays explicit, but it does not really give Java or Scala type safety by itself since you are the one choosing the generic shape.

The type arguments usually do not need to be repeated on both sides.
Inference from the target object and the `MethodStringNameN` value is generally enough.

The string-name form is the cross-language way to build a typed method callable from a method name.
The method-reference shortcut is available in Kotlin because Kotlin method references expose the needed metadata.

### Lambda callables

Use lambda callables when the callback only exists on the JVM side.

/// tab | Kotlin
```kotlin
val printHealth = callable2<Unit, Int, Int> { current, max ->
    println("Lambda saw $current / $max")
}
```

///

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

You can also convert a lambda with `asCallable()`:

/// tab | Kotlin
```kotlin
val printHealth = { current: Int, max: Int ->
    println("Lambda saw $current / $max")
}.asCallable()
```

///

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

The `callableN { ... }` and `asCallable()` shortcuts are the Kotlin-facing API.
Java and Scala use `LambdaCallableN.create(...)`, because they need explicit JVM classes for argument and return conversion.
Those `create(...)` helpers are meant for Java and Scala.
From Kotlin they intentionally show up under JVM-oriented helper names and are not the recommended path.

If you expose one of those Java or Scala callables as a registered property, prefer the base `Callable` type for the property itself.
The stored value can still be a `LambdaCallableN`, but the property surface should currently stay at `Callable`.

For no-return lambdas, Java and Scala can use the action overloads.
Those helpers avoid both `Void.class` in the argument list and a manual `return null`.

///

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

```kotlin
val format = callable2<String, Int, String> { amount, unit -> "$amount $unit" }

val result = format(24, "HP")
val fixedUnit = format.bind("HP")

println(result)        // 24 HP
println(fixedUnit(10)) // 10 HP
```

`bind(...)` always binds arguments from the right and returns a callable with a smaller arity.

## Connecting signals

There are three common ways to connect a typed signal.

In practice, Java and Scala usually connect signals by building an explicit callable first.
Kotlin can do that too, but it also has convenience shortcuts on top.

### 1. Connect a typed callable directly

/// tab | Kotlin
```kotlin
healthChanged.connect(
    callable2(controller, UiController::onHealthChanged)
)
```

///

/// tab | Java
```java
healthChanged.connect(
    MethodCallable2.create(
        controller,
        new MethodStringName2<UiController, Unit, Integer, Integer>("onHealthChanged")
    )
);
```

///

/// tab | Scala
```scala
healthChanged.connect(
  MethodCallable2.create(
    controller,
    new MethodStringName2[UiController, Unit, Integer, Integer]("onHealthChanged")
  )
)
```
///

This is explicit and keeps the signal/callable types visible.
It is also the most direct mental model for Java and Scala.

### 2. Use the signal connector method syntax

`connectMethod` creates the callable for you, connects it immediately, and returns a `SignalConnector`.

/// tab | Kotlin
```kotlin
val connector = healthChanged.connectMethod(controller, UiController::onHealthChanged)

connector.isConnected()
connector.disconnect()
```

///

/// tab | Java
```java
SignalConnector connector = SignalConnector.createUnsafe(
    healthChanged,
    MethodCallable2.create(
        controller,
        new MethodStringName2<UiController, Unit, Integer, Integer>("onHealthChanged")
    )
);

connector.connect();
connector.isConnected();
connector.disconnect();
```

///

/// tab | Scala
```scala
val connector = SignalConnector.createUnsafe(
  healthChanged,
  MethodCallable2.create(
    controller,
    new MethodStringName2[UiController, Unit, Integer, Integer]("onHealthChanged")
  )
)

connector.connect()
connector.isConnected()
connector.disconnect()
```
///

`connectMethod` is the Kotlin shortcut.
Java and Scala use the same `SignalConnector` type, but build it explicitly from a `MethodCallable`.

### 3. Connect a lambda

`connectLambda` is the shortcut for inline signal subscriptions:

/// tab | Kotlin
```kotlin
val connector = healthChanged.connectLambda { current, max ->
    println("Health changed to $current / $max")
}
```

///

/// tab | Java
```java
SignalConnector connector = SignalConnector.createUnsafe(
    healthChanged,
    LambdaCallable2.create(
        Integer.class,
        Integer.class,
        (current, max) -> System.out.println("Health changed to " + current + " / " + max)
    )
);

connector.connect();
```

///

/// tab | Scala
```scala
val connector = SignalConnector.createUnsafe(
  healthChanged,
  LambdaCallable2.create(
    classOf[Integer],
    classOf[Integer],
    (current: Integer, max: Integer) => println(s"Health changed to $current / $max")
  )
)

connector.connect()
```
///

Under the hood this creates a typed `LambdaCallableN`, connects it, and returns a `SignalConnector`.

## Why `SignalConnector` exists

`connectMethod` and `connectLambda` both return a `SignalConnector`.
It is a small helper around one `Signal` plus one `Callable`.

That makes it easy to:

- `disconnect()`
- `isConnected()`
- `isValid()`

without having to rebuild the same callable manually later or keep the reference around.

## A complete example

/// tab | Kotlin
```kotlin
@RegisterClass
class Player : Node() {
    @RegisterSignal("current", "max")
    val healthChanged by signal2<Int, Int>()

    fun damage(amount: Int) {
        healthChanged.emit(90 - amount, 100)
    }
}

@RegisterClass
class UiController : Node() {
    @RegisterFunction
    fun onHealthChanged(current: Int, max: Int) {
        println("UI update: $current / $max")
    }
}

@RegisterClass
class GameScene : Node() {
    private val player = Player()
    private val ui = UiController()

    override fun _ready() {
        player.healthChanged.connectMethod(ui, UiController::onHealthChanged)

        player.healthChanged.connectLambda { current, max ->
            println("Observed from lambda: $current / $max")
        }

        val callable = callable2(ui, UiController::onHealthChanged)
        player.healthChanged.connect(callable)
    }
}
```

///

/// tab | Java
```java
@RegisterClass
public class Player extends Node {
    @RegisterSignal({"current", "max"})
    public final Signal2<Integer, Integer> healthChanged = Signal2.create(this, "healthChanged");

    public void damage(int amount) {
        healthChanged.emit(90 - amount, 100);
    }
}

@RegisterClass
public class UiController extends Node {
    @RegisterFunction
    public void onHealthChanged(int current, int max) {
        System.out.println("UI update: " + current + " / " + max);
    }
}

@RegisterClass
public class GameScene extends Node {
    private final Player player = new Player();
    private final UiController ui = new UiController();

    @Override
    public void _ready() {
        player.healthChanged.connect(
            MethodCallable2.create(
                ui,
                new MethodStringName2<UiController, Unit, Integer, Integer>("onHealthChanged")
            )
        );

        SignalConnector.createUnsafe(
            player.healthChanged,
            LambdaCallable2.create(
                Integer.class,
                Integer.class,
                (current, max) -> System.out.println("Observed from lambda: " + current + " / " + max)
            )
        ).connect();
    }
}
```

///

/// tab | Scala
```scala
@RegisterClass
class Player extends Node {
  @RegisterSignal(Array("current", "max"))
  val healthChanged: Signal2[Integer, Integer] = Signal2.create(this, "healthChanged")

  def damage(amount: Int): Unit = {
    healthChanged.emit(90 - amount, 100)
  }
}

@RegisterClass
class UiController extends Node {
  @RegisterFunction
  def onHealthChanged(current: Int, max: Int): Unit = {
    println(s"UI update: $current / $max")
  }
}

@RegisterClass
class GameScene extends Node {
  private val player = new Player()
  private val ui = new UiController()

  override def _ready(): Unit = {
    player.healthChanged.connect(
      MethodCallable2.create(
        ui,
        new MethodStringName2[UiController, Unit, Integer, Integer]("onHealthChanged")
      )
    )

    SignalConnector.createUnsafe(
      player.healthChanged,
      LambdaCallable2.create(
        classOf[Integer],
        classOf[Integer],
        (current: Integer, max: Integer) => println(s"Observed from lambda: $current / $max")
      )
    ).connect()
  }
}
```
///

The Kotlin example is fully type checked against `Signal2<Int, Int>`.
The Java and Scala versions keep the same explicit signal/callable structure, but their safety depends on which callable construction path you use.

## Naming

For consistency with Godot, signal names are registered to Godot in `snake_case`.
For example, a Kotlin property named `healthChanged` is exposed to Godot as `health_changed`.
