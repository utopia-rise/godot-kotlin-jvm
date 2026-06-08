To expose a class written in Kotlin, Java, or Scala, it needs to extend `godot.Object` (or any of its subtype) and must be annotated with `@Script`.

/// tab | Kotlin
```kotlin
@Script
class RotatingCube : Node3D() {
    // ...
}
```
///

/// tab | Java
```java
@Script
public class RotatingCube extends Node3D {
    // ...
}
```
///

/// tab | Scala
```scala
@Script
class RotatingCube extends Node3D {
  // ...
}
```
///

Each registered class generates its own `.gdj` file. For more information, read [registration files](../user-guide/api-differences.md#registration-files-gdj).

### Naming

Classes need to be registered with a unique name as Godot does not support namespaces (or packages in this case) for script classes.

By default, classes are registered with their simple Kotlin class name. This is enough in many cases, but it can lead to conflicts if different packages contain classes with the same name. For example:

- `com.package.a.MyClass`
- `com.package.b.MyClass`

Both would be registered as `MyClass`.

So you are responsible for making sure that classes have a unique name.
We do however provide you with some assistance:

- We have compile time checks in place which should let the *build fail* if classes would end up having the same name.
- The `@Script` annotation lets you define a custom registration name: `@Script("CustomRegistrationName")`.
- You can configure how default registration names are computed:

```kotlin
import godot.registrar.generator.settings.RegisteredNameMode

godot {
    registrationNameMode.set(RegisteredNameMode.FQ_NAME)
}
```

The available modes are:

- `RegisteredNameMode.SIMPLE_NAME`: default. Uses the custom name if present, otherwise the Kotlin class name.
- `RegisteredNameMode.FQ_NAME`: uses the custom name if present, otherwise the fully qualified class name.
- `RegisteredNameMode.PROJECT_PREFIX`: uses the custom name if present, otherwise the Kotlin class name. Classes from external projects are prefixed with their source project name.

!!! warning "Class names from other languages"
    Even with all these checks and helpers in place, we cannot check the names of classes from other languages like GDScript or C#. It's your responsibility to make sure there are no naming conflicts.

### Hierarchy

As mentioned beforehand, Godot does not have the concept of namespaces. So all classes are registered at top level.
It does not matter where in the folder hierarchy a script resides in, it still is accessed the same way.
Hence, it does not matter if the registration files are all in one directory, or scattered across multiple directories.

By default, new registration files are generated flat inside the configured base directory:

- `com.mygame.packageA.ClassA`
- `com.mygame.packageB.ClassB`

```
[registrationFilesDirectory]/
|- ClassA.gdj
`- ClassB.gdj
```

If you prefer the `.gdj` files to mirror the package hierarchy, you can switch to hierarchical layout in your `build.gradle.kts`:

```kotlin
import godot.registrar.generator.settings.RegistrationFileLayoutMode

godot {
    registrationFilesLayoutMode.set(RegistrationFileLayoutMode.HIERARCHICAL)
}
```

Which would result in a folder structure like the following:

- `com.mygame.packageA.ClassA`
- `com.mygame.packageB.ClassB`

```
[registrationFilesDirectory]/
`- com/
   `- mygame/
      |- packageA/
      |  `- ClassA.gdj
      `- packageB/
         `- ClassB.gdj
```

When registration files come from external projects, they are always grouped by project name first. For example, if `registrationFilesDirectory` is `scripts` and an external library named `sharedlib` contributes a class, its `.gdj` file is generated under:

- `scripts/sharedlib/MyExternalClass.gdj` in flat mode
- `scripts/sharedlib/com/example/MyExternalClass.gdj` in hierarchical mode

The Gradle plugin updates existing `.gdj` files in place wherever they already live inside the configured Godot project. `registrationFilesDirectory` is therefore the default home for new `.gdj` files, not the only directory the sync task considers.

## Lifecycle

If you want to be notified when initialization and destruction of your class' instance happens, use the `init` block
and override the `_onDestroy` function respectively.

/// tab | Kotlin
```kotlin
@Script
class RotatingCube : Node3D() {
    init {
        println("Initializing RotatingCube!")
    }

    override fun _onDestroy() {
        println("Cleaning up RotatingCube!")
    }
}
```
///

/// tab | Java
```java
@Script
public class RotatingCube extends Node3D {
    public RotatingCube() {
        System.out.println("Initializing RotatingCube!");
    }

    @Override
    public void _onDestroy() {
        System.out.println("Cleaning up RotatingCube!");
    }
}
```
///

/// tab | Scala
```scala
@Script
class RotatingCube extends Node3D {
  println("Initializing RotatingCube!")

  override def _onDestroy(): Unit = {
    println("Cleaning up RotatingCube!")
  }
}
```
///

## Instance checks

Checking if an object is an instance of a particular type can be done via the `is` operator.

/// tab | Kotlin
```kotlin
@Register
override fun _ready() {
    val parent = getParent()
    if (parent is CollisionShape) {
        // smart cast works!
        parent.setShape(...)
    } else {
        throw AssertionError("Unexpected parent!")
    }
}
```
///

/// tab | Java
```java
@Register
@Override
public void _ready() {
    Node parent = getParent();
    if (parent instanceof CollisionShape collisionShape) {
        collisionShape.setShape(...);
    } else {
        throw new AssertionError("Unexpected parent!");
    }
}
```
///

/// tab | Scala
```scala
@Register
override def _ready(): Unit = {
  getParent() match {
    case collisionShape: CollisionShape =>
      collisionShape.setShape(...)
    case _ =>
      throw new AssertionError("Unexpected parent!")
  }
}
```
///

This also works for any type you define.

!!! info
    If you are sure that an object is always an instance of some type, then you can take advantage of Kotlin's [contracts](https://kotlinlang.org/docs/reference/whatsnew13.html#contracts) feature. This allows you to avoid having nested `if`s.

    ```kotlin
    @Register
    override fun _ready() {
        val parent = getParent()
        require(parent is CollisionShape)
        // Smart Cast works here as well!
        parent.setShape(...)
    }
    ```

## Constructors

Godot requires you to have a default constructor on your classes. These are automatically registered for you.  
Registering constructor with arguments is currently not supported. But you can freely use them from Kotlin/Java/Scala
just not from GDScript or any other non Godot Kotlin/JVM language.

### Instantiate script classes in GDScript

From GDScript it is possible to create an instance of a registered JVM class using the default constructor:

```gdscript
var instance := YourJvmClass.new()
```

Using other constructors is not possible. Only the default no arg constructor is registered.  
But you can create the object and set the required properties after instantiation.

## Customization

You can customize to some extent how your class should be registered in Godot.

The `@Script` annotation takes only one argument:

- **className**: If set, the class will be registered with the provided name.

!!! warning "Unique class names"
    If you specify the `className` in the annotation, you have to make sure that this name is unique! We implemented compilation checks to make sure the compilation fails if more than two classes are registered with the same name, but we cannot check class names from other scripting languages like GDScript or C#! It is also recommended installing our intellij plugin as it shows duplicated registered class names in the editor as an error.


## Tool Mode

Annotate your class with `@Tool` to make it a tool class (note that `@Script` is required for this annotation to take effect).

!!! Caution
    This is currently not implemented.


