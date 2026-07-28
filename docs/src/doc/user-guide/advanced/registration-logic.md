# Registration reference

Registration defines the part of your JVM code that Godot can see. During the
build, the registration processor selects compatible classes and members,
validates them, and generates the glue code used by Godot.

The registration mode changes **how declarations are selected**. It does not
change which types and declaration shapes Godot supports.

## The mental model

Think of registration in three steps:

1. **Candidate:** could this declaration be represented by Godot?
2. **Selection:** does the current registration mode select it?
3. **Configuration:** do annotations change how the selected declaration is
   exposed?

For example, a public `Int` property is a valid candidate. `@Visible`,
`@Export`, or automatic selection can make it registered, depending on the
mode. `@IntRange` additionally configures its inspector widget.

The same annotation can carry both selection and configuration meaning.
`@Rpc`, for example, configures networking and is itself annotated with
`@Register`, so inferred registration also selects the function.

## Choosing a registration mode

Configure the build in `build.gradle.kts`:

```kotlin
import godot.annotation.processor.classgraph.AnnotationProcessingMode

godot {
    annotationProcessingMode.set(AnnotationProcessingMode.Inferred)
}
```

The default is `Inferred`. Replace it with `Explicit` or `Automatic` when
needed.

If you use the IntelliJ plugin, choose the same mode under
**Settings | Godot Kotlin/JVM | Annotation processing mode**. The Gradle
setting controls the build. The IDE setting controls inspections and
registration highlighting, so the two should match.

| Mode | Selection rule | Best fit |
|---|---|---|
| `Explicit` | Only direct registration annotations count | A fully annotated Godot-facing boundary |
| `Inferred` | Direct and implied annotations count; signals and Godot overrides are recognized | Intentional registration without repetitive annotations |
| `Automatic` | Every compatible declaration in a Godot script candidate is selected | Convention-based projects with minimal annotations |

## What the registration annotations mean

The main selection annotations are:

| Declaration | Direct annotation |
|---|---|
| Class | `@Script` |
| Property | `@Visible` |
| Signal | `@Emit` |
| Function | `@Register` |

Other annotations build on them:

- `@Export` is annotated with `@Visible`.
- Property hints such as `@IntRange` are annotated with `@Export`.
- `@Rpc` and `@Notification` are annotated with `@Register`.
- Project-defined annotations can carry the same meta-annotations.

Explicit mode only looks at annotations written directly on the declaration.
Inferred mode follows this annotation chain recursively. Automatic mode
selects compatible declarations by shape, while annotations still configure
the result.

## Explicit mode

Explicit mode requires every selection annotation to be written directly:

- `@Script` selects the class.
- `@Visible` selects the property.
- `@Export` exports the selected property to the inspector.
- `@Emit` selects the signal.
- `@Register` selects ordinary functions, lifecycle overrides, and RPC
  functions.
- `@IntRange` and `@Rpc` configure their declarations but do not select them
  through their meta-annotations.

These examples expose a script, an exported property, a signal, an ordinary
function, a lifecycle callback, and an RPC function.

/// tab | Kotlin

```kotlin
package com.yourcompany.game

import godot.annotation.Emit
import godot.annotation.Export
import godot.annotation.IntRange
import godot.annotation.Register
import godot.annotation.Rpc
import godot.annotation.RpcMode
import godot.annotation.Script
import godot.annotation.Visible
import godot.api.Node
import godot.core.signal1
import godot.global.GD

@Script
class Player : Node() {
    @Export
    @Visible
    @IntRange(min = 0, max = 100)
    var health = 100

    @Emit("amount")
    val damaged by signal1<Int>()

    @Register
    fun heal(amount: Int) {
        health = (health + amount).coerceAtMost(100)
    }

    @Register
    override fun _ready() {
        GD.print("Player is ready")
    }

    @Rpc(rpcMode = RpcMode.ANY)
    @Register
    fun synchronizeHealth(value: Int) {
        health = value
    }
}
```

///

/// tab | Java

```java
package com.yourcompany.game;

import godot.annotation.Emit;
import godot.annotation.Export;
import godot.annotation.IntRange;
import godot.annotation.Register;
import godot.annotation.Rpc;
import godot.annotation.RpcMode;
import godot.annotation.Script;
import godot.annotation.Visible;
import godot.api.Node;
import godot.core.Signal1;
import godot.global.GD;

@Script
public class Player extends Node {
    @Export
    @Visible
    @IntRange(min = 0, max = 100)
    public int health = 100;

    @Emit
    public final Signal1<Integer> damaged =
        Signal1.create(this, "damaged");

    @Register
    public void heal(int amount) {
        health = Math.min(health + amount, 100);
    }

    @Register
    @Override
    public void _ready() {
        GD.print("Player is ready");
    }

    @Rpc(rpcMode = RpcMode.ANY)
    @Register
    public void synchronizeHealth(int value) {
        health = value;
    }
}
```

///

/// tab | Scala

```scala
package com.yourcompany.game

import godot.annotation.{
  Emit, Export, IntRange, Register, Rpc, RpcMode, Script, Visible
}
import godot.api.Node
import godot.core.Signal1
import godot.global.GD

@Script
class Player extends Node {
  @Export
  @Visible
  @IntRange(min = 0, max = 100)
  var health: Int = 100

  @Emit
  val damaged: Signal1[Integer] = Signal1.create(this, "damaged")

  @Register
  def heal(amount: Int): Unit = {
    health = Math.min(health + amount, 100)
  }

  @Register
  override def _ready(): Unit = {
    GD.print("Player is ready")
  }

  @Rpc(rpcMode = RpcMode.ANY)
  @Register
  def synchronizeHealth(value: Int): Unit = {
    health = value
  }
}
```

///

## Inferred mode

Inferred mode keeps registration intentional while removing annotations whose
meaning is already implied:

- `@Script` selects the class.
- `@IntRange` implies `@Export`, which implies `@Visible`.
- signal-shaped properties are recognized without `@Emit`.
- ordinary project functions still need an effective `@Register`.
- compatible Godot lifecycle overrides are recognized without `@Register`.
- `@Rpc` implies `@Register`.

Custom meta-annotations work the same way. An annotation carrying
`@Register`, for example, selects a function without requiring a second
annotation on that function.

/// tab | Kotlin

```kotlin
package com.yourcompany.game

import godot.annotation.IntRange
import godot.annotation.Register
import godot.annotation.Rpc
import godot.annotation.RpcMode
import godot.annotation.Script
import godot.api.Node
import godot.core.signal1
import godot.global.GD

@Script
class Player : Node() {
    @IntRange(min = 0, max = 100)
    var health = 100

    val damaged by signal1<Int>()

    @Register
    fun heal(amount: Int) {
        health = (health + amount).coerceAtMost(100)
    }

    override fun _ready() {
        GD.print("Player is ready")
    }

    @Rpc(rpcMode = RpcMode.ANY)
    fun synchronizeHealth(value: Int) {
        health = value
    }
}
```

///

/// tab | Java

```java
package com.yourcompany.game;

import godot.annotation.IntRange;
import godot.annotation.Register;
import godot.annotation.Rpc;
import godot.annotation.RpcMode;
import godot.annotation.Script;
import godot.api.Node;
import godot.core.Signal1;
import godot.global.GD;

@Script
public class Player extends Node {
    @IntRange(min = 0, max = 100)
    public int health = 100;

    public final Signal1<Integer> damaged =
        Signal1.create(this, "damaged");

    @Register
    public void heal(int amount) {
        health = Math.min(health + amount, 100);
    }

    @Override
    public void _ready() {
        GD.print("Player is ready");
    }

    @Rpc(rpcMode = RpcMode.ANY)
    public void synchronizeHealth(int value) {
        health = value;
    }
}
```

///

/// tab | Scala

```scala
package com.yourcompany.game

import godot.annotation.{IntRange, Register, Rpc, RpcMode, Script}
import godot.api.Node
import godot.core.Signal1
import godot.global.GD

@Script
class Player extends Node {
  @IntRange(min = 0, max = 100)
  var health: Int = 100

  val damaged: Signal1[Integer] = Signal1.create(this, "damaged")

  @Register
  def heal(amount: Int): Unit = {
    health = Math.min(health + amount, 100)
  }

  override def _ready(): Unit = {
    GD.print("Player is ready")
  }

  @Rpc(rpcMode = RpcMode.ANY)
  def synchronizeHealth(value: Int): Unit = {
    health = value
  }
}
```

///

## Automatic mode

Automatic mode selects compatible declarations inside Godot script
candidates:

- a compatible concrete Godot subclass needs no `@Script`.
- compatible public properties are registered and exported.
- signal-shaped properties are registered.
- compatible public functions are registered.
- Godot lifecycle overrides are registered.

Annotations still configure behavior. Here `@IntRange` changes the inspector
widget, while `@Rpc` configures networking.

/// tab | Kotlin

```kotlin
package com.yourcompany.game

import godot.annotation.IntRange
import godot.annotation.Rpc
import godot.annotation.RpcMode
import godot.api.Node
import godot.core.signal1
import godot.global.GD

class Player : Node() {
    var displayName = "Player"

    @IntRange(min = 0, max = 100)
    var health = 100

    val damaged by signal1<Int>()

    fun heal(amount: Int) {
        health = (health + amount).coerceAtMost(100)
    }

    override fun _ready() {
        GD.print("Player is ready")
    }

    @Rpc(rpcMode = RpcMode.ANY)
    fun synchronizeHealth(value: Int) {
        health = value
    }
}
```

///

/// tab | Java

```java
package com.yourcompany.game;

import godot.annotation.IntRange;
import godot.annotation.Rpc;
import godot.annotation.RpcMode;
import godot.api.Node;
import godot.core.Signal1;
import godot.global.GD;

public class Player extends Node {
    public String displayName = "Player";

    @IntRange(min = 0, max = 100)
    public int health = 100;

    public final Signal1<Integer> damaged =
        Signal1.create(this, "damaged");

    public void heal(int amount) {
        health = Math.min(health + amount, 100);
    }

    @Override
    public void _ready() {
        GD.print("Player is ready");
    }

    @Rpc(rpcMode = RpcMode.ANY)
    public void synchronizeHealth(int value) {
        health = value;
    }
}
```

///

/// tab | Scala

```scala
package com.yourcompany.game

import godot.annotation.{IntRange, Rpc, RpcMode}
import godot.api.Node
import godot.core.Signal1
import godot.global.GD

class Player extends Node {
  var displayName: String = "Player"

  @IntRange(min = 0, max = 100)
  var health: Int = 100

  val damaged: Signal1[Integer] = Signal1.create(this, "damaged")

  def heal(amount: Int): Unit = {
    health = Math.min(health + amount, 100)
  }

  override def _ready(): Unit = {
    GD.print("Player is ready")
  }

  @Rpc(rpcMode = RpcMode.ANY)
  def synchronizeHealth(value: Int): Unit = {
    health = value
  }
}
```

///

## Rules shared by every mode

The mode changes selection, not validity. A selected declaration must still
follow the same registration rules:

- A script must inherit a Godot type.
- A concrete registered class needs exactly one public parameterless
  constructor.
- Registered class names must be unique.
- Generic classes and generic registered functions are not supported.
- Registered property and function types must be convertible to Godot
  variants.
- Registered functions can have at most 16 parameters.
- Signal declarations must use a supported signal type.
- Property hints must match the property type.

Abstract Godot subclasses can form part of a script hierarchy without a
parameterless constructor because Godot does not instantiate them directly.

## Properties

Registration and inspector export are related but distinct:

- Registration exposes a property to Godot.
- Export makes it editable in the inspector.
- A property hint configures how the inspector edits it.

In Explicit mode, write each required role directly:

```kotlin
@Visible
@Export
@IntRange(min = 0, max = 100)
var health = 100
```

In Inferred mode, the hint supplies the whole annotation chain:

```kotlin
@IntRange(min = 0, max = 100)
var health = 100
```

In Automatic mode, a compatible property is registered and exported even
without an annotation. A hint is only needed when you want its editor
behavior.

## Signals

Signal-shaped declarations are selected directly with `@Emit` in Explicit
mode and recognized by their type in Inferred and Automatic modes.

`@Emit` remains useful in every mode when you want to provide signal parameter
names:

```kotlin
@Emit("amount")
val damaged by signal1<Int>()
```

## Functions and Godot overrides

An ordinary project function needs `@Register` in Explicit and Inferred
modes. Automatic mode selects compatible public functions.

Godot lifecycle and virtual overrides are different: Inferred and Automatic
modes recognize them from the inherited Godot method. Explicit mode requires
`@Register` directly on the override.

`@Rpc` and `@Notification` carry function intent. Their meta-annotation
selects the function in Inferred mode. Automatic mode still requires
`@Notification` to identify a notification handler; an arbitrary compatible
method is not treated as one merely because it was selected automatically.

## Inheritance and overrides

Registered parent members remain available in registered child classes. A
child does not need to repeat an inherited declaration just to preserve it.

```kotlin
@Script
open class Actor : Node() {
    @Register
    open fun takeDamage(amount: Int) {
    }
}

@Script
class Player : Actor() {
    override fun takeDamage(amount: Int) {
        GD.print("Player took $amount damage")
    }
}
```

The closest declaration in the hierarchy wins:

- a child override wins over its parent
- a class member wins over an interface member
- an inherited declaration is reused only when nothing closer replaces it

## Related documentation

- [Classes](../classes.md)
- [Properties](../properties.md)
- [Signals and callables](../signals_and_callables.md)
- [Functions](../functions.md)
- [Gradle plugin configuration](gradle-plugin-configuration.md)
- [Registration process knowledge base](../../contribution/knowledge-base/registration-process.md)
