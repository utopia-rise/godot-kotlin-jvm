## Registration files and attaching scripts
Contrary to GDScript and C# you cannot attach scripts (aka source files) directly to nodes. Godot Kotlin JVM uses a different approach: registration files. These files have the extension `gdj` and are generated during compilation. These are the files you attach to nodes.

Have a look at the [classes](classes.md) documentation for more information. 

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
val Node3D = Node3D()
val vec = Vector3()
```

Godot singletons are mapped as Kotlin objects.

```kotlin
Physics2DServer.areaGetTransform(area)
```

## Core types
Godot's built-in types are passed by value (except for `Dictionary` and `VariantArray` - more on this later), so the following snippet won't work as expected.

```kotlin
val Node3D = Node3D()
Node3D.rotation.y += 10f
```

You are actually mutating a copy of the `rotation` property, not a reference to it. To get the desired behaviour you have to re-assign the copy back.

```kotlin
val rotation = Node3D.rotation
rotation.y += 10f
Node3D.rotation = rotation
``` 

This approach introduces a lot of boilerplate, so this binding provides a concise way of achieving the same behaviour.

```kotlin
Node3D.rotationMutate {
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
In GDScript, signals can have any number of arguments, this is not possible in Kotlin as it is a statically typed language. At the moment, you can create signals and expose them to Godot with at most 10 parameters.  

If you need more than 10 parameters, you can either use the not typesafe function `connect(signalAsString, targetObject, targetMethodAsString)` and the corresponding emit function or you can write your own typesafe extension functions like we did, to further increase the supported arg count. Keep in mind that you pass in the converted function and signal names (snake_case) to the above mentioned functions.  

## Renamed symbols
To avoid confusion and conflict with Kotlin types, the following Godot symbol is renamed.

- `Array` -> `VariantArray` (to avoid confusion with a built-in type in Kotlin)

## Global functions

In GDScript, some functions are always available like mathematical functions or RNG functions. The complete list is here: https://docs.godotengine.org/en/stable/classes/class_%40gdscript.html.

In Kotlin, they are available inside the `GD` singleton. Don't forget that some functions couldn't be reproduced in Kotlin. `load()` is available but `preload()` is not.

## Additional functions

For comfort, some Objects got some additional functions to enjoy some Kotlin syntax sugar. You can find them all [in this folder](https://github.com/utopia-rise/godot-kotlin-jvm/tree/master/kt/godot-library/src/main/kotlin/godot/extensions)

## Caching

Several Godot functions take `StringName` or `NodePath` as a parameter. Extension functions have been provided to allow for the easy creation of these from a `String`. As an optimisation, these `StringName` and `NodePath` instances are cached to reduce the amount of memory used, and to reduce the overhead of creating new instances unnecessarily.

## Logging
If you want logs to appear both in CLI and in the Godot Editor you will have to use the print functions inside the `GD` singleton like:

```kt
GD.print("Hello There!")
```

Kotlin's print functions on the other hand will only print to CLI! They will print to Godot editor's output panel.
