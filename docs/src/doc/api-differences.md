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

## Core types
Godot's built-in types are passed by value (except for `Dictionary` and `VariantArray` - more on this later), so the following snippet won't work as expected.

```kotlin
val spatial = Spatial()
spatial.rotation.y += 10f
```

You are actually mutating a copy of the `rotation` property, not a reference to it. To get the desired behaviour you have to re-assign the copy back. 

```kotlin
val rotation = spatial.rotation
rotation.y += 10f
spatial.rotation = rotation
``` 

This approach introduces a lot of boilerplate, so this binding provides a concise way of achieving the same behaviour.

```kotlin
spatial.rotation {
  y += 10f
}
```

The snippet above is functionally equivalent to the previous one.

## Collection types
While `VariantArray` and `Dictionary` are passed by reference, the value returned by the retrieval methods (`VariantArray.get(...)` and `Dictionary.get(...)`) are not.

```kotlin
array.get(index).asVector3().y += 10f
dictionary.get("foo").asVector3().y += 5f
```

To get the desired behaviour, you can re-assign the copy back or in a similar fashion as before, this binding provides a better alternative.

```kotlin
array.get<Vector3>(index) {
  y += 10f
}

dictionary.get<Vector3>(index) {
  y += 5f
}
``` 

## Enums and constants
Godot enums are mapped to Kotlin enums, the generated enum exposes a `value` property that represents the value in Godot. Constants in Godot classes that represent an enum value (such as `Node.PAUSE_MODE_INHERIT`) are not present in this binding, please use the generated enum instead (`Node.PauseMode.INHERIT`).

## Signals and exposed methods
In GDScript, signals and methods can have any number of arguments, this is not possible in Kotlin as it is a statically typed language. At the moment, you can create signals and expose methods to Godot with at most 10 parameters.

Additionally, signals are mapped to properties of type `Signal` and must start with a prefix `signal` (check [Signals](user-guide/signals.md) section for more details). The prefix is dropped during registration, so the signal `signalReverseChanged` is known in Godot as `reverseChanged`. This is done to avoid naming conflicts with other members of a class. There is no signal type in GDScript, signals are only referenced by name so they can have the same name as methods and/or properties in the same class. 

## Renamed symbols
To avoid confusion and conflict with Kotlin types, the following Godot symbols are renamed.

- `Array` -> `VariantArray` (to avoid confusion with a built-in type in Kotlin)
- `PoolRealArray` -> `PoolFloatArray` (for naming consistency)
- `Variant.asReal()` -> `Variant.asFloat()` (for naming consistency)