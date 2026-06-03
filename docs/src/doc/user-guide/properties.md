Any property of a registered class can be registered as long as it is public, mutable and can be converted to a `Variant`.
To register a property annotate it with `@RegisterProperty`.

/// tab | Kotlin
```kotlin
@RegisterClass
class RotatingCube : Node3D() {
    @RegisterProperty
    var someString: String = "Hello there :-)"

    @RegisterProperty
    var propertyWithDefaultValue: Float = 2f
}
```
///

/// tab | Java
```java
@RegisterClass
public class RotatingCube extends Node3D {
    @RegisterProperty
    public String someString = "Hello there :-)";

    @RegisterProperty
    public float propertyWithDefaultValue = 2f;
}
```
///

/// tab | Scala
```scala
@RegisterClass
class RotatingCube extends Node3D {
  @RegisterProperty
  var someString: String = "Hello there :-)"

  @RegisterProperty
  var propertyWithDefaultValue: Float = 2f
}
```
///

## Naming

Property names should follow the usual style of the language you use. For consistency with Godot's style,
your properties are actually registered as `snake_case`. So a property `someFlag` is usable in GDScript as `some_flag`.

## Core type specifics

Godot core type always need to have a value. Hence you cannot register properties of core types (like `Vector3`) with lateinit.

## Exporting properties

A registered property can be exported (a.k.a make it visible in the Godot editor) by annotating it with `@Export`.
A property can be exported if it is a core type, a primitive or inherits from `godot.RefCounted`.

/// tab | Kotlin
```kotlin
@RegisterClass
class RotatingCube : Node3D() {
    @Export
    @RegisterProperty
    var speed: Float = 2f
}
```
///

/// tab | Java
```java
@RegisterClass
public class RotatingCube extends Node3D {
    @Export
    @RegisterProperty
    public float speed = 2f;
}
```
///

/// tab | Scala
```scala
@RegisterClass
class RotatingCube extends Node3D {
  @Export
  @RegisterProperty
  var speed: Float = 2f
}
```
///

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
| `EnumTypeHint`    | Enum                       |                                                                       | Optional. Enums are registered automatically from their type (see [Enums, bitfields and enum lists](#enums-bitfields-and-enum-lists)).            |
| `ExpEasing`       | Float Double               | attenuation: Boolean = false, inOut: Boolean = true                   | N/A                                                                                                                                              |
| `IntFlag`         | Int                        | names: vararg String                                                  | Registers a raw `Int` bitmask with the given flag names. For type-safe flags backed by an enum, use `BitField` instead (see below).              |
| `File`            | String                     | extensions: Array<String> = [], global: Boolean = false               | The inspector will show a File dialog in which you can select a File. The Path of the file will be stored in the property.                       |
| `Dir`             | String                     | global: Boolean = false                                               | The inspector will show a File dialog in which you can select a directory. The Path of the directory will be stored in the property.             |
| `MultilineText`   | String                     |                                                                       | The inspector shows a multiline text input.                                                                                                      |
| `PlaceHolderText` | String                     |                                                                       | N/A                                                                                                                                              |
| `ColorNoAlpha`    | Color                      |                                                                       | The inspector shows a color selection dialog without Alpha                                                                                       |

!!! note
    It's not easy to track changes to these property hints on the Godot project. If one is missing or not working as expected, please file an [issue on GitHub](https://github.com/utopia-rise/godot-kotlin-jvm/issues).

## Enums, bitfields and enum lists

Enums and flags are registered **from the property type** — you usually don't need any hint annotation.


| Property type            | Inspector widget                       |
|--------------------------|----------------------------------------|
| `MyEnum`                 | a dropdown to pick a single value      |
| `BitField<MyEnum>`       | a checkbox grid (bitmask / flags)      |
| any `Collection<MyEnum>` | a resizable list of enum dropdowns     |

This works the same in Kotlin, Java and Scala.

!!! warning "Scala enums"
    Plain Scala 3 `enum` types are not recognized.
    For registration and `BitField`, use a Scala enum that extends `java.lang.Enum[YourEnum]`.

### Single enum (dropdown)

Declare a property whose type is an enum:

/// tab | Kotlin
```kotlin
enum class Element { FIRE, WATER, EARTH }

@RegisterClass
class Spell : Node() {
    @Export
    @RegisterProperty
    var element = Element.FIRE
}
```
///
/// tab | Java
```java
public enum Element { FIRE, WATER, EARTH }

@RegisterClass
public class Spell extends Node {
    @Export
    @RegisterProperty
    public Element element = Element.FIRE;
}
```
///
/// tab | Scala
```scala
enum Element extends java.lang.Enum[Element] {
  case FIRE, WATER, EARTH
}

@RegisterClass
class Spell extends Node {
  @Export
  @RegisterProperty
  var element: Element = Element.FIRE
}
```
///

### Bitfield (flags)

Use `BitField<MyEnum>` (from `godot.core`) when several enum values can be selected at once:

/// tab | Kotlin
```kotlin
@Export
@RegisterProperty
var elements: BitField<Element> = BitField.of(Element.FIRE, Element.WATER)
```
///
/// tab | Java
```java
@Export
@RegisterProperty
public BitField<Element> elements = BitField.of(Element.FIRE, Element.WATER);
```
///
/// tab | Scala
```scala
@Export
@RegisterProperty
var elements: BitField[Element] = BitField.of(Element.FIRE, Element.WATER)
```
///

Regular enums use `1 shl ordinal`. A [`GodotEnum`](#custom-values) uses its explicit value as the mask.

### List of enums

Any `Collection<MyEnum>` (`List`, `Set`, …) becomes a resizable list where each element is a dropdown:

/// tab | Kotlin
```kotlin
@Export
@RegisterProperty
var elements = listOf(Element.FIRE)
```
///
/// tab | Java
```java
@Export
@RegisterProperty
public java.util.List<Element> elements = new java.util.ArrayList<>(java.util.List.of(Element.FIRE));
```
///
/// tab | Scala
```scala
@Export
@RegisterProperty
var elements: java.util.List[Element] = new java.util.ArrayList(java.util.List.of(Element.FIRE))
```
///

### Custom values

By default an enum constant's inspector value is its ordinal. To control the exact integers — to match a
Godot engine enum, or to choose specific flag bits — implement `GodotEnum` (from `godot.core`):

/// tab | Kotlin
```kotlin
enum class Element(override val value: Long) : GodotEnum {
    FIRE(2), WATER(8), EARTH(16)
}
```
///
/// tab | Java
```java
public enum Element implements GodotEnum {
    FIRE(2), WATER(8), EARTH(16);

    private final long value;

    Element(long value) {
        this.value = value;
    }

    @Override
    public long getValue() {
        return value;
    }
}
```
///
/// tab | Scala
```scala
enum Element(val v: Long) extends java.lang.Enum[Element], GodotEnum {
  case FIRE  extends Element(2)
  case WATER extends Element(8)
  case EARTH extends Element(16)

  override def getValue(): Long = v
}
```
///

The dropdown, enum list, and `BitField` then use those exact values.
