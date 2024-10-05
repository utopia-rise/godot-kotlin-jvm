# Registration files and attaching scripts

Godot Kotlin/JVM offers two different ways to attach scripts: 

- Source files
- Registration files.

## Source files .kt and .java

Just like you would do with GDScript, you can directly attach your Kotlin/Java files to Nodes as scripts.
This is the most straightforward method to use Kotlin scripts but not the most flexible.

The limitations are the following:

- Your files must be located inside a valid source set defined in your gradle configuration file.
- Scripts written in a location outside the Godot project can't be used as the engine won't be able to find them. This applies to modules and libraries.
- If several script classes are defined inside a single file, only one of them will be usable.
- The script is nameless. You won't be able to write code in GDScript like (doesn't apply to Kotlin code):
    ```kotlin
    var test_script: MyScript = load("res://pathToScript/MyScript.kt").new() // Wrong
    var test_script: Node = load("res://pathToScript/MyScript.kt").new() // Correct
    ```
    The same applies if you use a Godot object with a .kt/.java attached to it

If those limitations don't apply to you, feel free to use Kotlin source files directly.

## Registration files .gdj

For each class you register to Godot, a corresponding registration file is generated (a `gdj` file) during compilation. Like the source files, you can attach them to Nodes.
They have several benefits over source files:

- .gdj can be placed wherever you want in your Godot project, you are not limited to the source set.
- Each script get its own .gdj. This includes scripts in different modules and libraries.
- If a source file contains several scripts. A different .gdj will be generated for each.
- Registration files are language agnostic, they are generated for Kotlin and Java files with no difference.
- When creating a script from code using its registered name. The module is going to use the registration file as the script. Therefore, registration files are treated as the default way to use scripts inside the module.

By default, these files are generated into a folder called `gdj` in the root of your project.

You can however configure the destination folder inside your `build.gradle.kts`:

```kotlin
godot {
    registrationFileBaseDir.set(<folder>)
}
```

!!! Reason
    Contrary to GDScript, Kotlin is a compiled language. Hence, if you use a library which defines scripts you can not attach those to nodes anymore as the source files don't exist. You only have a jar of the library. While in GDScript you still have the sources when using an addon. With our registration files our compiler plugin is able to extract those from the libraries you use and provide them to you, so you can also attach scripts from libraries you use.


## Class and member registration

Contrary to what you might be used to from GDScript or C#, this binding requires you to explicitly define which classes
and which members of those classes should be exposed to Godot.  
This requires a bit more code but enables to properly define visibility across languages and restrict access to values 
which you might not want to expose.  
See the individual sections in the `user-guide` in this documentation to see how to register your classes and members so
you can use them from godot and other scripting languages.

## Instance types and singletons

Creating a new instance of a Godot type can be done like any Kotlin types.

```kotlin
val node3D = Node3D()
val vec = Vector3()
```

Godot's singletons are mapped as Kotlin objects.

```kotlin
Physics2DServer.areaGetTransform(area)
```

## Core types

Godot's built-in types are passed by value (except for `Dictionary` and `VariantArray` - more on this later), so the following snippet won't work as expected.

```kotlin
val node3D = Node3D()
node3D.rotation.y += 10f
```

You are *actually mutating a copy* of the `rotation` property, not a reference to it. To get the desired behaviour you have to re-assign the copy back.

```kotlin
val rotation = node3D.rotation
rotation.y += 10f
node3D.rotation = rotation
``` 

This approach introduces a lot of boilerplate, so this binding provides a concise way of achieving the same behaviour.

```kotlin
node3D.rotationMutate {
  y += 10f
}
```

The snippet above is functionally equivalent to the previous one.

## Collection types

While `VariantArray` and `Dictionary` are passed by reference, the value returned by the retrieval methods (`VariantArray.get(...)` and `Dictionary.get(...)`) are not.

```kotlin
array[index].y += 10f
dictionary["foo"].y += 5f
```

To get the desired behaviour, you can re-assign the copy back or in a similar fashion as before, this binding provides a better alternative.

```kotlin
array.get(index) {
  y += 10f
}

dictionary.get("foo") {
  y += 5f
}
``` 

## Enums and constants

Godot enums are mapped to Kotlin enums, the generated enum exposes a `value` property that represents the value in Godot. Constants in Godot classes that represent an enum value (such as `Node.PAUSE_MODE_INHERIT`) are not present in this module, please use the generated enum instead (`Node.PauseMode.INHERIT`).

## Signals and exposed methods

In GDScript, signals can have any number of arguments, this is not possible in Kotlin as it is a statically typed language.
At the moment, you can create signals and expose them to Godot with at most 10 parameters.

If you need more than 10 parameters, you can either use the not typesafe function `connect(signalAsString, targetObject, targetMethodAsString)` and the corresponding emit function or you can write your own typesafe extension functions like we did, to further increase the supported arg count. Keep in mind that you pass in the converted function and signal names (snake_case) to the above mentioned functions.  

## Renamed symbols

To avoid confusion and conflict with Kotlin types, the following Godot symbol is renamed.

- `Array` -> `VariantArray` (to avoid confusion with a built-in type in Kotlin)
- `PackedXArray::toByteArray` -> `PackedXArray::toPackedByteArray` (to avoid confusion with a built-in type in Kotlin)
- `PackedByteArray::toXArray` -> `PackedByteArray::toPackedXArray` (to avoid confusion with a built-in type in Kotlin)

## Global functions

In GDScript, some functions are always available (such as mathematical or RNG functions).
The complete list can be found on the following [page](https://docs.godotengine.org/en/stable/classes/class_%40gdscript.html) of Godot's documentation.

In Kotlin, global functions are available inside the `GD` object singleton. However, don't forget that some functions couldn't be reproduced in Kotlin.
E.g., the `load()` function is available but `preload()` is not.

## Additional functions

For comfort, some Objects got some additional functions to enjoy some Kotlin syntax sugar.
You can find them all [in this folder](https://github.com/utopia-rise/godot-kotlin-jvm/tree/master/kt/godot-library/src/main/kotlin/godot/extensions).

## Notifications

You can implement [_notification](https://docs.godotengine.org/en/stable/classes/class_object.html#class-object-private-method-notification)
and have class hierarchy notification call without using `super` call, as in GDScript and C++. However, the syntax is a bit different:

```kotlin
@RegisterFunction
override fun _notification() = godotNotification {
  // ...
}
```  
Currently this feature except abstract classes.  

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


## Logging

If you want logs to appear both in CLI and in the Godot Editor you will have to use the print functions inside the `GD` singleton like:

```kt
GD.print("Hello There!")
```

Kotlin's print functions, on the other hand, will only print to CLI! They will print to Godot editor's output panel.
