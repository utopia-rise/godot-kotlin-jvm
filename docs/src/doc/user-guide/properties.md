Any property of a registered class can be registered as long as it is public, mutable and can be converted to a `Variant`.
To register a property annotate it with `@RegisterProperty`.

```kotlin
@RegisterClass
class RotatingCube: Node3D() {
    @RegisterProperty
    lateinit var lateInitProperty: NodePath

    @RegisterProperty
    var propertyWithDefaultValue: Float = 2f
}
```

## Naming

Property names should follow Kotlin's style which is `camelCase`. For consistency with Godot's style,
your properties are actually registered as `snake_case`. So a property `someFlag` in Kotlin is usable in GDScript as `some_flag`.

## Core type specifics

Godot core type always need to have a value. Hence you cannot register properties of core types (like `Vector3`) with lateinit.

## Exporting properties

A registered property can be exported (a.k.a make it visible in the Godot editor) by annotating it with `@Export`.
A property can be exported if it is a core type, a primitive or inherits from `godot.RefCounted`.

```kotlin
@RegisterClass
class RotatingCube: Node3D() {
    @Export
    @RegisterProperty
    var speed: Float = 2f
}
```

Exported properties can have default values (`2f` in the example above) which will be used as a default value by the `inspector`.
A default value can **only** contain compile time constants and only references to compile time constants.

!!! danger
    If you set a default value in code and a different value in the `inspector` the value of the latter will override the value in code after `init` and before `_enter_tree`.

## Type hint registration

This module provides a plethora of annotations for defining property type hints.
These annotations controls how Godot display the property in the inspector.
Each property hint annotation can only be added to certain types of properties.
Using the wrong annotation will make the compilation fail. These will only take effect if the property is exported.

!!! note
    If you are using IntelliJ IDEA and have our plugin installed, you will get a warning about wrong annotation usages.

Below is a list of currently implemented type hints:

| Annotation        | Type of Property           | Arguments                                                             | Short Description                                                                                                                                |
|-------------------|----------------------------|-----------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------|
| `IntRange`        | Int                        | start: Int, end: Int, step: Int = -1, or: Range = Range.NONE          | Provides a range of ints from start to end, with optional steps, and optional `lesser or greater`                                                |
| `FloatRange`      | Float                      | start: Float, end: Float, step: Float = -1, or: Range = Range.NONE    | Provides a range of floats from start to end, with optional steps, and optional `lesser or greater`                                              |
| `DoubleRange`     | Double                     | start: Double, end: Double, step: Double = -1, or: Range = Range.NONE | Provides a range of doubles from start to end, with optional steps, and optional `lesser or greater`                                             |
| `ExpRange`        | Float Double               | start: Float, end: Float, step: Float = -1, or: Range = Range.NONE    | Provides a exponential range of doubles or floats from start to end, with optional steps, and optional `lesser or greater`                       |
| `EnumTypeHint`    | Enum                       |                                                                       | Registers an enum. The editor then provides a selection of the possible enum values                                                              |
| `ExpEasing`       | Float Double               | attenuation: Boolean = false, inOut: Boolean = true                   | N/A                                                                                                                                              |
| `EnumFlag`        | Set<Enum> MutableSet<Enum> |                                                                       | Registers a flag with the enum names set as the flag names. The values in the set define which flags are set.                                    |
| `IntFlag`         | Int                        | names: vararg String                                                  | Same as enum flag but the `names` set which values can be set in the inspector and no automatic conversion to the individual flag values happen. |
| `File`            | String                     | extensions: Array<String> = [], global: Boolean = false               | The inspector will show a File dialog in which you can select a File. The Path of the file will be stored in the property.                       |
| `Dir`             | String                     | global: Boolean = false                                               | The inspector will show a File dialog in which you can select a directory. The Path of the directory will be stored in the property.             |
| `MultilineText`   | String                     |                                                                       | The inspector shows a multiline text input.                                                                                                      |
| `PlaceHolderText` | String                     |                                                                       | N/A                                                                                                                                              |
| `ColorNoAlpha`    | Color                      |                                                                       | The inspector shows a color selection dialog without Alpha                                                                                       |

!!! note
    It's not easy to track changes to these property hints on the Godot project. If one is missing or not working as expected, please file an [issue on GitHub](https://github.com/utopia-rise/godot-kotlin-jvm/issues).