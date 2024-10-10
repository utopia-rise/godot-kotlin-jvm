// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmInline

/**
 * The engine supports multiple image formats out of the box (PNG, SVG, JPEG, WebP to name a few),
 * but you can choose to implement support for additional image formats by extending
 * [ImageFormatLoaderExtension].
 */
@GodotBaseType
public open class ImageFormatLoader internal constructor() : RefCounted() {
  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_IMAGEFORMATLOADER, scriptIndex)
  }

  public sealed interface LoaderFlags {
    public val flag: Long

    public infix fun or(other: LoaderFlags): LoaderFlags = LoaderFlagsValue(flag.or(other.flag))

    public infix fun or(other: Long): LoaderFlags = LoaderFlagsValue(flag.or(other))

    public infix fun xor(other: LoaderFlags): LoaderFlags = LoaderFlagsValue(flag.xor(other.flag))

    public infix fun xor(other: Long): LoaderFlags = LoaderFlagsValue(flag.xor(other))

    public infix fun and(other: LoaderFlags): LoaderFlags = LoaderFlagsValue(flag.and(other.flag))

    public infix fun and(other: Long): LoaderFlags = LoaderFlagsValue(flag.and(other))

    public operator fun plus(other: LoaderFlags): LoaderFlags =
        LoaderFlagsValue(flag.plus(other.flag))

    public operator fun plus(other: Long): LoaderFlags = LoaderFlagsValue(flag.plus(other))

    public operator fun minus(other: LoaderFlags): LoaderFlags =
        LoaderFlagsValue(flag.minus(other.flag))

    public operator fun minus(other: Long): LoaderFlags = LoaderFlagsValue(flag.minus(other))

    public operator fun times(other: LoaderFlags): LoaderFlags =
        LoaderFlagsValue(flag.times(other.flag))

    public operator fun times(other: Long): LoaderFlags = LoaderFlagsValue(flag.times(other))

    public operator fun div(other: LoaderFlags): LoaderFlags =
        LoaderFlagsValue(flag.div(other.flag))

    public operator fun div(other: Long): LoaderFlags = LoaderFlagsValue(flag.div(other))

    public operator fun rem(other: LoaderFlags): LoaderFlags =
        LoaderFlagsValue(flag.rem(other.flag))

    public operator fun rem(other: Long): LoaderFlags = LoaderFlagsValue(flag.rem(other))

    public fun unaryPlus(): LoaderFlags = LoaderFlagsValue(flag.unaryPlus())

    public fun unaryMinus(): LoaderFlags = LoaderFlagsValue(flag.unaryMinus())

    public fun inv(): LoaderFlags = LoaderFlagsValue(flag.inv())

    public infix fun shl(bits: Int): LoaderFlags = LoaderFlagsValue(flag shl bits)

    public infix fun shr(bits: Int): LoaderFlags = LoaderFlagsValue(flag shr bits)

    public infix fun ushr(bits: Int): LoaderFlags = LoaderFlagsValue(flag ushr bits)

    public companion object {
      public val FLAG_NONE: LoaderFlags = LoaderFlagsValue(0)

      public val FLAG_FORCE_LINEAR: LoaderFlags = LoaderFlagsValue(1)

      public val FLAG_CONVERT_COLORS: LoaderFlags = LoaderFlagsValue(2)
    }
  }

  @JvmInline
  internal value class LoaderFlagsValue internal constructor(
    public override val flag: Long,
  ) : LoaderFlags

  public companion object

  internal object MethodBindings
}

public infix fun Long.or(other: godot.ImageFormatLoader.LoaderFlags): Long = this.or(other.flag)

public infix fun Long.xor(other: godot.ImageFormatLoader.LoaderFlags): Long = this.xor(other.flag)

public infix fun Long.and(other: godot.ImageFormatLoader.LoaderFlags): Long = this.and(other.flag)

public operator fun Long.plus(other: godot.ImageFormatLoader.LoaderFlags): Long =
    this.plus(other.flag)

public operator fun Long.minus(other: godot.ImageFormatLoader.LoaderFlags): Long =
    this.minus(other.flag)

public operator fun Long.times(other: godot.ImageFormatLoader.LoaderFlags): Long =
    this.times(other.flag)

public operator fun Long.div(other: godot.ImageFormatLoader.LoaderFlags): Long =
    this.div(other.flag)

public operator fun Long.rem(other: godot.ImageFormatLoader.LoaderFlags): Long =
    this.rem(other.flag)
