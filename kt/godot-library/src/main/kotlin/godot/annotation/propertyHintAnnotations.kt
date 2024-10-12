package godot.annotation

import godot.registration.Range

/*
All type checks will happen at the entry-generator at the moment.
We should move that to the idea plugin at some point in time to provide IDE help and not just compilation errors.

The following annotations are implemented based on https://github.com/godotengine/godot/blob/3.2/core/object.h
 */

/**
 * Can only be used on Int properties!
 */
@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
@GodotMember
annotation class IntRange(
    val min: Int,
    val max: Int,
    val step: Int = -1,
    val or: Range = Range.NONE,
    val hideSlider: Boolean = false,
    val isRadians: Boolean = false,
    val isDegrees: Boolean = false,
    val isExp: Boolean = false,
    val suffix: String = "<none>",
)

/**
 * Can only be used on Long properties!
 */
@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
@GodotMember
annotation class LongRange(
    val min: Long,
    val max: Long,
    val step: Long = -1L,
    val or: Range = Range.NONE,
    val hideSlider: Boolean = false,
    val isRadians: Boolean = false,
    val isDegrees: Boolean = false,
    val isExp: Boolean = false,
    val suffix: String = "<none>",
)

/**
 * Can only be used on Float properties!
 */
@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
@GodotMember
annotation class FloatRange(
    val min: Float,
    val max: Float,
    val step: Float = -1f,
    val or: Range = Range.NONE,
    val hideSlider: Boolean = false,
    val isRadians: Boolean = false,
    val isDegrees: Boolean = false,
    val isExp: Boolean = false,
    val suffix: String = "<none>",
)

/**
 * Can only be used on Double properties!
 */
@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
@GodotMember
annotation class DoubleRange(
    val min: Double,
    val max: Double,
    val step: Double = -1.0,
    val or: Range = Range.NONE,
    val hideSlider: Boolean = false,
    val isRadians: Boolean = false,
    val isDegrees: Boolean = false,
    val isExp: Boolean = false,
    val suffix: String = "<none>",
)

/**
 * Can only be used on Enum properties!
 */
@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
@GodotMember
annotation class EnumTypeHint

/**
 * Can only be used on Float and Double properties!
 */
@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
@GodotMember
annotation class ExpEasing(val attenuation: Boolean = false, val isPositiveOnly: Boolean = true)

/**
 * Can only be used on Float and Double properties!
 */
//@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
//@Retention(AnnotationRetention.RUNTIME)
//@GodotMember
//annotation class Lenght(val lenght: Int = -1)

/**
 * Flag Property hint supporting enums
 *
 * Can only be used on Set<Enum> or MutableSet<Enum> properties!
 *
 * **Note:** The used enum can not have more than 32 Entries!
 */
@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
@GodotMember
annotation class EnumFlag

/**
 * Flag Property hint supporting Int's
 *
 * Can only be used on Int properties!
 */
@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
@GodotMember
annotation class IntFlag(vararg val names: String)

/**
 * Can only be used on Int properties!
 */
//@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
//@Retention(AnnotationRetention.RUNTIME)
//@GodotMember
//annotation class Layers2DRender

/**
 * Can only be used on Int properties!
 */
//@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
//@Retention(AnnotationRetention.RUNTIME)
//@GodotMember
//annotation class Layers2DPhysics

/**
 * Can only be used on Int properties!
 */
//@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
//@Retention(AnnotationRetention.RUNTIME)
//@GodotMember
//annotation class Layers3DRender

/**
 * Can only be used on Int properties!
 */
//@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
//@Retention(AnnotationRetention.RUNTIME)
//@GodotMember
//annotation class Layers3DPhysics

/**
 * Can only be used on String properties!
 */
@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
@GodotMember
annotation class File(vararg val extensions: String = [], val global: Boolean = false)

/**
 * Can only be used on String properties!
 */
@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
@GodotMember
annotation class Dir(val global: Boolean = false)

/**
 * Can only be used on String properties!
 */
@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
@GodotMember
annotation class MultilineText

/**
 * Can only be used on String properties!
 */
@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
@GodotMember
annotation class PlaceHolderText

/**
 * Can only be used on Color properties!
 */
@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
@GodotMember
annotation class ColorNoAlpha

/**
 * Can only be used on Image properties!
 */
//@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
//@Retention(AnnotationRetention.RUNTIME)
//@GodotMember
//annotation class ImageCompressLossy

/**
 * Can only be used on Image properties!
 */
//@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
//@Retention(AnnotationRetention.RUNTIME)
//@GodotMember
//annotation class ImageCompressLossLess

/**
 * Can only be used on Int properties!
 */
//@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
//@Retention(AnnotationRetention.RUNTIME)
//@GodotMember
//annotation class ObjectId

/**
 * Can only be used on String properties!
 */
//@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
//@Retention(AnnotationRetention.RUNTIME)
//@GodotMember
//annotation class TypeString(val baseTypeAsString: String)

/**
 * Can only be used on NodePath properties!
 */
//@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
//@Retention(AnnotationRetention.RUNTIME)
//@GodotMember
//annotation class NodePathToEditedNode

/**
 * Can only be used on String properties!
 */
//@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
//@Retention(AnnotationRetention.RUNTIME)
//@GodotMember
//annotation class MethodOfVariantType

/**
 * Can only be used on String properties!
 */
//@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
//@Retention(AnnotationRetention.RUNTIME)
//@GodotMember
//annotation class MethodOfBaseType

/**
 * Can only be used on String properties!
 */
//@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
//@Retention(AnnotationRetention.RUNTIME)
//@GodotMember
//annotation class MethodOfInstance

/**
 * Can only be used on String properties!
 */
//@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
//@Retention(AnnotationRetention.RUNTIME)
//@GodotMember
//annotation class MethodOfScript

/**
 * Can only be used on String properties!
 */
//@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
//@Retention(AnnotationRetention.RUNTIME)
//@GodotMember
//annotation class PropertyOfVariantType

/**
 * Can only be used on String properties!
 */
//@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
//@Retention(AnnotationRetention.RUNTIME)
//@GodotMember
//annotation class PropertyOfBaseType

/**
 * Can only be used on String properties!
 */
//@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
//@Retention(AnnotationRetention.RUNTIME)
//@GodotMember
//annotation class PropertyOfInstance

/**
 * Can only be used on String properties!
 */
//@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
//@Retention(AnnotationRetention.RUNTIME)
//@GodotMember
//annotation class PropertyOfScript

//@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
//@Retention(AnnotationRetention.RUNTIME)
//@GodotMember
//annotation class ObjectTooBig

/**
 * Can only be used on NodePath properties!
 */
//@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
//@Retention(AnnotationRetention.RUNTIME)
//@GodotMember
//annotation class NodePathValidTypes

/**
 * Can only be used on String properties!
 */
//@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
//@Retention(AnnotationRetention.RUNTIME)
//@GodotMember
//annotation class SaveFile(vararg val extensions: String = [])

/**
 * Can only be used on Int properties!
 */
//@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
//@Retention(AnnotationRetention.RUNTIME)
//@GodotMember
//annotation class IntIsObjectId

/**
 * Can only be used on String properties!
 */
//@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
//@Retention(AnnotationRetention.RUNTIME)
//@GodotMember
//annotation class Max
