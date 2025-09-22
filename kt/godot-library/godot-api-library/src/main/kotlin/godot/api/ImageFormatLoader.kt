// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmField

public infix fun Long.or(other: ImageFormatLoader.LoaderFlags): Long = this.or(other.flag)

public infix fun Long.xor(other: ImageFormatLoader.LoaderFlags): Long = this.xor(other.flag)

public infix fun Long.and(other: ImageFormatLoader.LoaderFlags): Long = this.and(other.flag)

/**
 * The engine supports multiple image formats out of the box (PNG, SVG, JPEG, WebP to name a few),
 * but you can choose to implement support for additional image formats by extending
 * [ImageFormatLoaderExtension].
 */
@GodotBaseType
public open class ImageFormatLoader internal constructor() : RefCounted() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(290, scriptIndex)
  }

  public class LoaderFlags(
    public val flag: Long,
  ) {
    public infix fun or(other: LoaderFlags): LoaderFlags = LoaderFlags(flag.or(other.flag))

    public infix fun or(other: Long): LoaderFlags = LoaderFlags(flag.or(other))

    public infix fun xor(other: LoaderFlags): LoaderFlags = LoaderFlags(flag.xor(other.flag))

    public infix fun xor(other: Long): LoaderFlags = LoaderFlags(flag.xor(other))

    public infix fun and(other: LoaderFlags): LoaderFlags = LoaderFlags(flag.and(other.flag))

    public infix fun and(other: Long): LoaderFlags = LoaderFlags(flag.and(other))

    public fun unaryPlus(): LoaderFlags = LoaderFlags(flag.unaryPlus())

    public fun unaryMinus(): LoaderFlags = LoaderFlags(flag.unaryMinus())

    public fun inv(): LoaderFlags = LoaderFlags(flag.inv())

    public infix fun shl(bits: Int): LoaderFlags = LoaderFlags(flag shl bits)

    public infix fun shr(bits: Int): LoaderFlags = LoaderFlags(flag shr bits)

    public infix fun ushr(bits: Int): LoaderFlags = LoaderFlags(flag ushr bits)

    public companion object {
      @JvmField
      public val FLAG_NONE: LoaderFlags = LoaderFlags(0)

      @JvmField
      public val FLAG_FORCE_LINEAR: LoaderFlags = LoaderFlags(1)

      @JvmField
      public val FLAG_CONVERT_COLORS: LoaderFlags = LoaderFlags(2)
    }
  }

  public companion object

  public object MethodBindings
}
