# Registering scripts and members

Before Godot can use a JVM class as a script, the class and the members you
want to expose must be registered. In most projects, this only means adding a
few annotations and building the project.

## The usual workflow

The default registration mode is **Inferred**. It is the best starting point
for a new project.

1. Mark a Godot subclass with `@Script`.
2. Use `@Export` for values you want to edit in the Inspector.
3. Use `@Register` for ordinary functions that Godot, another script, or the
   editor needs to call.
4. Build the project after adding or changing a script, an Inspector property,
   a signal, or a function that Godot calls.

For example:

/// tab | Kotlin

```kotlin
package com.example.game

import godot.annotation.Export
import godot.annotation.Register
import godot.annotation.Script
import godot.api.Node
import godot.core.signal1
import godot.global.GD

@Script
class Player : Node() {
    @Export
    var health = 100

    val healthChanged by signal1<Int>()

    @Register
    fun heal(amount: Int) {
        health = (health + amount).coerceAtMost(100)
        healthChanged.emit(health)
    }

    override fun _ready() {
        GD.print("Player is ready")
    }
}
```

///

/// tab | Java

```java
package com.example.game;

import godot.annotation.Export;
import godot.annotation.Register;
import godot.annotation.Script;
import godot.api.Node;
import godot.core.Signal1;
import godot.global.GD;

@Script
public class Player extends Node {
    @Export
    public int health = 100;

    public final Signal1<Integer> healthChanged =
        Signal1.create(this, "health_changed");

    @Register
    public void heal(int amount) {
        health = Math.min(health + amount, 100);
        healthChanged.emit(health);
    }

    @Override
    public void _ready() {
        GD.print("Player is ready");
    }
}
```

///

/// tab | Scala

```scala
package com.example.game

import godot.annotation.{Export, Register, Script}
import godot.api.Node
import godot.core.Signal1
import godot.global.GD

@Script
class Player extends Node {
  @Export
  var health: Int = 100

  val healthChanged: Signal1[Integer] =
    Signal1.create(this, "health_changed")

  @Register
  def heal(amount: Int): Unit = {
    health = Math.min(health + amount, 100)
    healthChanged.emit(health)
  }

  override def _ready(): Unit = {
    GD.print("Player is ready")
  }
}
```

///

After a successful Gradle build, attach the source file to a node in the
editor in the same way that you would attach another script. The `health`
property is available in the Inspector, `heal` is available to Godot, and
`healthChanged` is available as a signal.

You do not need to add `@Register` to Godot callbacks such as `_ready` in the
default mode. Godot recognizes compatible overrides automatically.

## What each annotation is for

| What you want to do | Use |
|---|---|
| Make a class available as a Godot script | `@Script` |
| Give a script class a custom Godot name | `@Script("PlayerCharacter")` |
| Show and edit a property in the Inspector | `@Export` |
| Choose an Inspector control, such as a range or file picker | A property hint such as `@IntRange` |
| Let Godot call an ordinary function | `@Register` |
| Configure a remote procedure call | `@Rpc` |
| Give signal arguments readable names | `@Emit("amount")` |

Property hints also export a property in the default mode. For example, this
creates an Inspector slider without requiring a separate `@Export`:

/// tab | Kotlin

```kotlin
import godot.annotation.IntRange

@IntRange(min = 0, max = 100)
var health = 100
```

///

/// tab | Java

```java
import godot.annotation.IntRange;

@IntRange(min = 0, max = 100)
public int health = 100;
```

///

/// tab | Scala

```scala
import godot.annotation.IntRange

@IntRange(min = 0, max = 100)
var health: Int = 100
```

///

Signals declared with the supported signal helpers are recognized
automatically. Add `@Emit` only when you want to name their arguments:

/// tab | Kotlin

```kotlin
import godot.annotation.Emit
import godot.core.signal1

@Emit("amount")
val damaged by signal1<Int>()
```

///

/// tab | Java

```java
import godot.annotation.Emit;
import godot.core.Signal1;

@Emit(parameters = {"amount"})
public final Signal1<Integer> damaged = Signal1.create(this, "damaged");
```

///

/// tab | Scala

```scala
import godot.annotation.Emit
import godot.core.Signal1

@Emit(parameters = Array("amount"))
val damaged: Signal1[Integer] = Signal1.create(this, "damaged")
```

///

## Functions and Godot overrides

Use `@Register` on an ordinary function when it is part of your script's
Godot-facing API:

/// tab | Kotlin

```kotlin
import godot.annotation.Register

@Register
fun reset() {
    health = 100
}
```

///

/// tab | Java

```java
import godot.annotation.Register;

@Register
public void reset() {
    health = 100;
}
```

///

/// tab | Scala

```scala
import godot.annotation.Register

@Register
def reset(): Unit = {
  health = 100
}
```

///

Godot callbacks are different. When a function overrides a Godot method, such
as `_ready`, `_process`, or `_physicsProcess`, simply override it. Do not call
these methods yourself; Godot calls them at the appropriate time.

/// tab | Kotlin

```kotlin
override fun _process(delta: Double) {
    // Update this node each frame.
}
```

///

/// tab | Java

```java
@Override
public void _process(double delta) {
    // Update this node each frame.
}
```

///

/// tab | Scala

```scala
override def _process(delta: Double): Unit = {
  // Update this node each frame.
}
```

///

Use `@Rpc` when a function is intended for multiplayer. It provides the RPC
settings and makes the function available in the default mode:

/// tab | Kotlin

```kotlin
import godot.annotation.Rpc

@Rpc
fun setHealth(value: Int) {
    health = value
}
```

///

/// tab | Java

```java
import godot.annotation.Rpc;

@Rpc
public void setHealth(int value) {
    health = value;
}
```

///

/// tab | Scala

```scala
import godot.annotation.Rpc

@Rpc
def setHealth(value: Int): Unit = {
  health = value
}
```

///

See [Functions](../functions.md), [Properties](../properties.md), and
[Signals and callables](../signals_and_callables.md) for the available types
and options.

## Changing the registration mode

Most projects should keep the default **Inferred** mode. Choose another mode
only when its behaviour matches how your project is written.

| Mode | When to use it | What to remember |
|---|---|---|
| `Inferred` | The normal choice | Add `@Script` and `@Register` where needed; exports, signals, callbacks, and RPCs are handled naturally. |
| `Explicit` | You want every Godot-facing declaration marked directly | Add every required registration annotation yourself. |
| `Automatic` | You deliberately want public compatible members exposed by default | Public properties and functions can become part of the Godot API without annotations. |

Set a mode in `build.gradle.kts` only if you need a non-default mode. This
configuration is the same for Kotlin, Java, and Scala projects:

/// tab | Kotlin

```kotlin
import godot.annotation.processor.classgraph.AnnotationProcessingMode

godot {
    annotationProcessingMode.set(AnnotationProcessingMode.Explicit)
}
```

///

/// tab | Java

```kotlin
import godot.annotation.processor.classgraph.AnnotationProcessingMode

godot {
    annotationProcessingMode.set(AnnotationProcessingMode.Explicit)
}
```

///

/// tab | Scala

```kotlin
import godot.annotation.processor.classgraph.AnnotationProcessingMode

godot {
    annotationProcessingMode.set(AnnotationProcessingMode.Explicit)
}
```

///

In **Explicit** mode, annotations do not imply one another. An Inspector
property therefore needs both `@Visible` and `@Export`; a range hint still
only controls the Inspector widget:

/// tab | Kotlin

```kotlin
import godot.annotation.Export
import godot.annotation.IntRange
import godot.annotation.Visible

@Visible
@Export
@IntRange(min = 0, max = 100)
var health = 100
```

///

/// tab | Java

```java
import godot.annotation.Export;
import godot.annotation.IntRange;
import godot.annotation.Visible;

@Visible
@Export
@IntRange(min = 0, max = 100)
public int health = 100;
```

///

/// tab | Scala

```scala
import godot.annotation.{Export, IntRange, Visible}

@Visible
@Export
@IntRange(min = 0, max = 100)
var health: Int = 100
```

///

In **Automatic** mode, take care with public members. Prefer `Inferred` if you
want to decide member by member what becomes visible to Godot.

If you use the IntelliJ plugin, set the same mode in **Settings | Godot
Kotlin/JVM | Annotation processing mode**. Gradle controls the actual build;
the IDE setting keeps inspections and highlighting accurate.

## Before building

When registration fails, check the following first:

- The script extends a Godot class such as `Node` or `Resource`.
- A public constructor with no parameters is optional. When present, Godot can
  instantiate the script; constructors with parameters are not exposed to
  Godot.
- Every registered script has a unique Godot name. Use
  `@Script("AUniqueName")` if two classes share the same simple name.
- Exposed properties and function parameters use Godot-supported types.
- Registered classes and functions are not generic.

Build again after adding, removing, renaming, or changing an exported property,
signal, function that Godot calls, or script class. Changing only code inside
an existing method does not require any additional registration steps.

For project-wide settings such as registration names and `.gdj` files from
dependencies, see [Gradle plugin configuration](gradle-plugin-configuration.md).
