## Class and member registration
Contrary to what you might be used to from GDScript or C#, this binding requires you to explicitly define which classes
and which members of those classes should be exposed to Godot.  
This requires a bit more code but enables to properly define visibility across languages and restrict access to values 
which you might not want to expose.  
See the individual sections in the `user-guide` in this documentation to see how to register your classes and members so
you can use them from godot and other scripting languages.

## Instance types and singletons
Creating a new instance of a Godot type can be done like any Kotlin types.

```kt
val spatial = Spatial()
val vec = Vector3()
```

Godot singletons are mapped as Kotlin objects.

```kt
Physics2DServer.areaGetTransform(area)
```

## Enums and constants
Godot enums are mapped to Kotlin enums, the generated enum exposes a `value` property that represents the value in Godot. Constants in Godot classes that represent an enum value (such as `Node.PAUSE_MODE_INHERIT`) are not present in this module, please use the generated enum instead (`Node.PauseMode.INHERIT`).

## Signals and exposed methods
In GDScript, signals can have any number of arguments, this is not possible in Kotlin as it is a statically typed language. At the moment, you can create signals and expose them to Godot with at most 10 parameters.  

Additionally, signals are mapped to properties of type `Signal` and must start with a prefix `signal` (check [Signals](signals.md) section for more details). The prefix is dropped during registration and converted to snake_case, so the signal `signalReverseChanged` is known in Godot as `reverse_changed`. This is done to avoid naming conflicts with other members of a class. There is no signal type in GDScript, signals are only referenced by name so they can have the same name as methods and/or properties in the same class.  

If you need more than 10 parameters, you can either use the not typesafe function `connect(signalAsString, targetObject, targetMethodAsString)` and the corresponding emit function or you can write your own typesafe extension functions like we did, to further increase the supported arg count. Keep in mind that you pass in the converted function and signal names (snake_case) to the above mentioned functions.  

## Renamed symbols
To avoid confusion and conflict with Kotlin types, the following Godot symbol is renamed.

- `Array` -> `VariantArray` (to avoid confusion with a built-in type in Kotlin)

## Global functions

In GDScript, some functions are always available like mathematical functions or RNG functions. The complete list is here: https://docs.godotengine.org/en/stable/classes/class_%40gdscript.html.

In Kotlin, they are available inside the `GD` singleton. Don't forget that some functions couldn't be reproduced in Kotlin. `load()` is available but `preload()` is not.

## Additiional functions

For comfort, some Objects got some additionnal functions to enjoy some Kotlin sugar syntax. You can find them all in this folder: https://github.com/utopia-rise/godot-kotlin-jvm/tree/master/kt/godot-library/src/main/kotlin/godot/extensions

## Logging
If you want logs to appear both in CLI and in the Godot Editor you will have to use the print functions inside the `GD` singleton like:

```kt
GD.print("Hello There!")
```

Kotlin's print functions on the other hand will only print to CLI! They will print to Godot editor's output panel.