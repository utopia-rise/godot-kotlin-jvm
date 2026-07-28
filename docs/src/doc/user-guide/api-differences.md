# Registration files and attaching scripts

Godot Kotlin/JVM uses source files for classes declared in the current Godot project and registration files for classes contributed by external dependencies.

- Project classes are attached through their `.kt`, `.java`, or `.scala` source file.
- Dependency classes have no source file inside the Godot project. The Gradle plugin generates a `.gdj` registration file for each usable registered dependency class so it can be attached in the editor.

## Source files .kt, .java and .scala

Just like GDScript, you can directly attach Kotlin, Java, and Scala files from the current Godot project to Nodes as scripts. This is the default representation for project classes.

The limitations are the following:

- The source file must be inside both the Godot project and a configured Gradle source set.
- Only the first registered class in a source file is usable as that file's script resource.
- The registered class information is available after a successful build. Before then, Godot keeps a best-effort source placeholder.

Use the source file directly for project classes.

## Registration files .gdj

For each non-abstract registered class discovered in an external dependency, the build generates a corresponding `.gdj` registration file. Like source files, these files can be attached to Nodes.
They make dependency classes available when their source files are not part of the Godot project:

- Each dependency class gets its own `.gdj`, including classes from different modules and libraries.
- A dependency source file can contribute a separate `.gdj` for each registered class it contains.
- Registration files are language agnostic: Kotlin, Java, and Scala dependencies use the same format.

By default, dependency registration files are generated into a folder called `gdj` in the root of your Godot project.

You can however configure the Godot root and the base directory used for newly created registration files inside your `build.gradle.kts`:

```kotlin
import godot.gradle.GodotLanguage

godot {
    // Optional: limit the initial compile pass to the JVM languages your project actually uses.
    languages.set(setOf(GodotLanguage.KOTLIN, GodotLanguage.JAVA))

    // Only needed when the Gradle project directory is not the Godot project root.
    godotProjectDirectory.set(file(".."))

    registrationFilesDirectory.set(<folder>)
}
```

During the sync step, the Gradle plugin scans the configured Godot project for existing dependency `.gdj` files. Matching files are updated in place, obsolete ones are deleted, and only newly discovered dependency registrations are copied into `registrationFilesDirectory`.

!!! Reason
    Contrary to GDScript, Kotlin is a compiled language. Hence, if you use a library which defines scripts you can not attach those to nodes anymore as the source files don't exist. You only have a jar of the library. While in GDScript you still have the sources when using an addon. With our registration files our compiler plugin is able to extract those from the libraries you use and provide them to you, so you can also attach scripts from libraries you use.


## Class and member registration

Unlike GDScript or C#, JVM declarations pass through a registration step
before Godot can use them. The default behavior follows registration
annotations and their implied meaning, which keeps the Godot-facing boundary
intentional without requiring every annotation to be repeated.

See the [registration reference](advanced/registration-logic.md) for the
complete rules, or continue with the guides for
[classes](classes.md), [properties](properties.md), and
[functions](functions.md).

## Instance types and singletons

Creating a new instance of a Godot type can be done like any JVM object.

/// tab | Kotlin
```kotlin
val node3D = Node3D()
val vec = Vector3()
```
///

/// tab | Java
```java
Node3D node3D = new Node3D();
Vector3 vec = new Vector3();
```
///

/// tab | Scala
```scala
val node3D = new Node3D()
val vec = new Vector3()
```
///

Godot's singletons are exposed as static access points.

/// tab | Kotlin
```kotlin
Physics2DServer.areaGetTransform(area)
```
///

/// tab | Java
```java
Physics2DServer.areaGetTransform(area);
```
///

/// tab | Scala
```scala
Physics2DServer.areaGetTransform(area)
```
///

## Core types

Godot's built-in types are passed by value (except for `Dictionary` and `VariantArray` - more on this later), so the following snippet won't work as expected.

/// tab | Kotlin
```kotlin
val node3D = Node3D()
node3D.rotation.y += 10f
```
///

/// tab | Java
```java
Node3D node3D = new Node3D();
node3D.getRotation().setY(node3D.getRotation().getY() + 10f);
```
///

/// tab | Scala
```scala
val node3D = new Node3D()
node3D.getRotation.setY(node3D.getRotation.getY + 10f)
```
///

You are *actually mutating a copy* of the `rotation` property, not a reference to it. To get the desired behaviour you have to re-assign the copy back.

/// tab | Kotlin
```kotlin
val rotation = node3D.rotation
rotation.y += 10f
node3D.rotation = rotation
```
///

/// tab | Java
```java
Vector3 rotation = node3D.getRotation();
rotation.setY(rotation.getY() + 10f);
node3D.setRotation(rotation);
```
///

/// tab | Scala
```scala
val rotation = node3D.getRotation
rotation.setY(rotation.getY + 10f)
node3D.setRotation(rotation)
```
///

This approach introduces a lot of boilerplate, so this binding provides a concise way of achieving the same behaviour.
Only in Kotlin

/// tab | Kotlin
```kotlin
node3D.rotationMutate {
  y += 10f
}
```
///

The snippet above is functionally equivalent to the previous one.

## Collection types

While `VariantArray` and `Dictionary` are passed by reference, the value returned by the retrieval methods (`VariantArray.get(...)` and `Dictionary.get(...)`) are not.

/// tab | Kotlin
```kotlin
array[index].y += 10f
dictionary["foo"].y += 5f
```
///

/// tab | Java
```java
array.get(index).setY(array.get(index).getY() + 10f);
dictionary.get("foo").setY(dictionary.get("foo").getY() + 5f);
```
///

/// tab | Scala
```scala
array.get(index).setY(array.get(index).getY + 10f)
dictionary.get("foo").setY(dictionary.get("foo").getY + 5f)
```
///

To get the desired behaviour, you can re-assign the copy back or in a similar fashion as before, this binding provides a better alternative.

/// tab | Kotlin
```kotlin
array.get(index) {
  y += 10f
}

dictionary.get("foo") {
  y += 5f
}
```
///

/// tab | Java
```java
Vector3 arrayValue = array.get(index);
arrayValue.setY(arrayValue.getY() + 10f);
array.set(index, arrayValue);

Vector3 dictionaryValue = dictionary.get("foo");
dictionaryValue.setY(dictionaryValue.getY() + 5f);
dictionary.set("foo", dictionaryValue);
```
///

/// tab | Scala
```scala
val arrayValue = array.get(index)
arrayValue.setY(arrayValue.getY + 10f)
array.set(index, arrayValue)

val dictionaryValue = dictionary.get("foo")
dictionaryValue.setY(dictionaryValue.getY + 5f)
dictionary.set("foo", dictionaryValue)
```
///

## Enums and constants

Godot enums are mapped to Kotlin enums, the generated enum exposes a `value` property that represents the value in Godot. Constants in Godot classes that represent an enum value (such as `Node.PAUSE_MODE_INHERIT`) are not present in this module, please use the generated enum instead (`Node.PauseMode.INHERIT`).

## Renamed symbols

To avoid confusion and conflict with Kotlin types, the following Godot symbol is renamed.

- `Array` -> `VariantArray` (to avoid confusion with a built-in type in Kotlin)
- `PackedXArray::toByteArray` -> `PackedXArray::toPackedByteArray` (to avoid confusion with a built-in type in Kotlin)
- `PackedByteArray::toXArray` -> `PackedByteArray::toPackedXArray` (to avoid confusion with a built-in type in Kotlin)
- All enum values are shortened, the name of the enum itself has been removed. Here are some examples:
  - `Error.ERR_PARAMETER_RANGE_ERROR` -> `Error.PARAMETER_RANGE`
  - `MethodFlags.METHOD_FLAG_NORMAL` -> `MethodFlags.NORMAL`
  - `ProcessThreadMessages.FLAG_PROCESS_THREAD_MESSAGES_PHYSICS` -> `Error.FLAG_PHYSICS`

## Global functions

In GDScript, some functions are always available (such as mathematical or RNG functions).
The complete list can be found on the following [page](https://docs.godotengine.org/en/stable/classes/class_%40gdscript.html) of Godot's documentation.

In Kotlin, Java, and Scala, global functions are available through the `GD` singleton helpers. However, don't forget that some functions couldn't be reproduced exactly on the JVM side.
For example, `load()` is available but `preload()` is not.

## Additional functions

For comfort, some objects got some additional functions to enjoy some Kotlin syntax sugar.
You can find them all [in this folder](https://github.com/utopia-rise/godot-kotlin-jvm/tree/master/kt/godot-library/src/main/kotlin/godot/extensions).

## Notifications

Register notification handlers with `@Notification`.

Unlike GDScript and C++, you do not override
[_notification](https://docs.godotengine.org/en/stable/classes/class_object.html#class-object-private-method-notification)
directly. Instead, each handled notification is a regular zero-argument method annotated with the notification
number it handles.

If several methods in the class hierarchy handle the same notification, they are all called. Normal notification
delivery follows Godot's inheritance order, from parent to child. Reversed notification delivery calls them from
child to parent.

/// tab | Kotlin
```kotlin
import godot.annotation.Notification
import godot.api.Node

@Notification(Node.NOTIFICATION_READY.toInt())
fun onReadyNotification() {
    // ...
}
```
///

/// tab | Java
```java
import godot.annotation.Notification;
import godot.api.Node;

@Notification((int) Node.NOTIFICATION_READY)
public void onReadyNotification() {
    // ...
}
```
///

/// tab | Scala
```scala
import godot.annotation.Notification
import godot.api.Node

@Notification(Node.NOTIFICATION_READY.toInt)
def onReadyNotification(): Unit = {
    // ...
}
```
///

Notification handlers are not registered as callable Godot methods. In explicit and inferred registration modes,
`@Notification` is enough to select the method. In automatic mode, a method only becomes a notification handler when
the annotation is present.

## StringName and NodePath

Several Godot functions take `StringName` or `NodePath` as a parameter. 
It's often more convenient to directly use a String and convert it.

This kind of operation can be costly so we provide extension functions which cache the result of the conversion for later calls:

/// tab | Kotlin
```kotlin
    val stringName = "myString".asCachedStringName() // Cache the string for faster future calls.
    val nodePath = "myNode/myChildNode".asCachedNodePath() // Cache the string for faster future calls.
    val snakeCaseStringName = "myString".toGodotName() // Convert the string to snake_case and cache it for faster future calls.
```
///

/// tab | Java
```java
    StringName stringName = StringNames.asCachedStringName("myString");
    NodePath nodePath = NodePaths.asCachedNodePath("myNode/myChildNode");
    StringName snakeCaseStringName = StringNames.toGodotName("myString");
```
///

/// tab | Scala
```scala
    val stringName = StringNames.asCachedStringName("myString")
    val nodePath = NodePaths.asCachedNodePath("myNode/myChildNode")
    val snakeCaseStringName = StringNames.toGodotName("myString")
```
///

You can also use the non-cached version of them if you simply want ease of conversion:

/// tab | Kotlin
```kotlin
    val stringName = "myString".asStringName()
    val nodePath = "myNode/myChildNode".asNodePath()
```
///

/// tab | Java
```java
    StringName stringName = StringNames.asStringName("myString");
    NodePath nodePath = NodePaths.asNodePath("myNode/myChildNode");
```
///

/// tab | Scala
```scala
    val stringName = StringNames.asStringName("myString")
    val nodePath = NodePaths.asNodePath("myNode/myChildNode")
```
///


## Logging

If you want logs to appear both in CLI and in the Godot Editor you will have to use the print functions inside the `GD` singleton like:

/// tab | Kotlin
```kotlin
GD.print("Hello There!")
```
///

/// tab | Java
```java
GD.print("Hello There!");
```
///

/// tab | Scala
```scala
GD.print("Hello There!")
```
///

Kotlin's print functions, on the other hand, will only print to CLI! They won't print to Godot editor's output panel.

