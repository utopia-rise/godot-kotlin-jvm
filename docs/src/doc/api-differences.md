## Instance types and singletons
Creating a new instance of a Godot type can be done like any Kotlin types.

```kotlin
val spatial = Spatial()
val vec = Vector3()
```

Godot singletons are mapped as Kotlin objects.

```kotlin
Physics2DServer.areaGetTransform(area)
```

## Instantiation limitations
You cannot interact with the Godot Api from within your constructors!  
This limitation is present because we need a pointer to your object which we only have once it's instanced.

So this won't work and will crash:
```kotlin
constructor() {
    val tree = getTree()
    //...
}
```

Do such things inside the `_onInit()` function:
```kotlin
constructor() {
    //...
}

override fun _onInit() {
    val tree = getTree()
}
```

The same applies of course for `init {}`.

## Enums and constants
Godot enums are mapped to Kotlin enums, the generated enum exposes a `value` property that represents the value in Godot. Constants in Godot classes that represent an enum value (such as `Node.PAUSE_MODE_INHERIT`) are not present in this module, please use the generated enum instead (`Node.PauseMode.INHERIT`).

## Signals and exposed methods
In GDScript, signals can have any number of arguments, this is not possible in Kotlin as it is a statically typed language. At the moment, you can create signals and expose them to Godot with at most 10 parameters.  

Additionally, signals are mapped to properties of type `Signal` and must start with a prefix `signal` (check [Signals](user-guide/signals.md) section for more details). The prefix is dropped during registration and converted to snake_case, so the signal `signalReverseChanged` is known in Godot as `reverse_changed`. This is done to avoid naming conflicts with other members of a class. There is no signal type in GDScript, signals are only referenced by name so they can have the same name as methods and/or properties in the same class.  

If you need more than 10 parameters, you can either use the not typesafe function `connect(signalAsString, targetObject, targetMethodAsString)` and the corresponding emit function or you can write your own typesafe extension functions like we did, to further increase the supported arg count. Keep in mind that you pass in the converted function and signal names (snake_case) to the above mentioned functions.  

## Renamed symbols
To avoid confusion and conflict with Kotlin types, the following Godot symbols are renamed.

- `Array` -> `VariantArray` (to avoid confusion with a built-in type in Kotlin)
- `PoolRealArray` -> `PoolFloatArray` (for naming consistency)
- `Variant.asReal()` -> `Variant.asFloat()` (for naming consistency)
