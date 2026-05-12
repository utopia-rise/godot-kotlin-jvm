Let's create a first class that prints a simple hello world message when the node enters the scene tree.

/// tab | Kotlin
Create `src/main/kotlin/com/yourcompany/game/Player.kt` with:

```kotlin
package com.yourcompany.game

import godot.Node
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.global.GD

@RegisterClass
class Player : Node() {
    @RegisterFunction
    override fun _ready() {
        GD.print("Hello from Kotlin")
    }
}
```

///

/// tab | Java
Create `src/main/java/com/yourcompany/game/Player.java` with:

```java
package com.yourcompany.game;

import godot.annotation.RegisterClass;
import godot.annotation.RegisterFunction;
import godot.api.Node;
import godot.global.GD;

@RegisterClass
public class Player extends Node {
    @RegisterFunction
    @Override
    public void _ready() {
        GD.print("Hello from Java");
    }
}
```

///

/// tab | Scala
Create `src/main/scala/com/yourcompany/game/Player.scala` with:

```scala
package com.yourcompany.game

import godot.annotation.{RegisterClass, RegisterFunction}
import godot.api.Node
import godot.global.GD

@RegisterClass
class Player extends Node {
  @RegisterFunction
  override def _ready(): Unit = {
    GD.print("Hello from Scala")
  }
}
```

///

This small example already shows the main building blocks:

- `@RegisterClass` makes the class visible to Godot.
- `@RegisterFunction` exposes `_ready()` to Godot.
- `GD.print(...)` writes to the Godot output.

The [signals and callables](../user-guide/signals_and_callables.md) guide is a good next step once you have this basic class working.

Now trigger a build:

```shell
./gradlew build
```

Once the build completes, you will be able to use your class in Godot. Simply attach the generated `gdj` file (by default, generated in the `gdj/` directory at the root of the project; for more details, read the [user guide](../user-guide/api-differences.md#registration-files-gdj)) to a node like you would in GDScript. If you rebuild the project while the editor is open, your classes will be reloaded automatically in Godot and you can use them.

![Attach Node Script](../assets/img/attach.png)

!!! info
    As the JVM languages are compiled, you can only use newly created classes after you have built them. Otherwise, Godot will not be able to find them.

## Final project structure

Depending on the language you picked, the final project should include one of these source roots:

/// tab | Kotlin
```text
src/
  main/
    kotlin/
      com/
        yourcompany/
          game/
            Player.kt
```

///

/// tab | Java
```text
src/
  main/
    java/
      com/
        yourcompany/
          game/
            Player.java
```

///

/// tab | Scala
```text
src/
  main/
    scala/
      com/
        yourcompany/
          game/
            Player.scala
```

///
