// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_CURVEXYZTEXTURE_INDEX: Int = 206

/**
 * A 1D texture where the red, green, and blue color channels correspond to points on 3 [Curve]
 * resources. Compared to using separate [CurveTexture]s, this further simplifies the task of saving
 * curves as image files.
 * If you only need to store one curve within a single texture, use [CurveTexture] instead. See also
 * [GradientTexture1D] and [GradientTexture2D].
 */
@GodotBaseType
public open class CurveXYZTexture : Texture2D() {
  /**
   * The width of the texture (in pixels). Higher values make it possible to represent
   * high-frequency data better (such as sudden direction changes), at the cost of increased generation
   * time and memory usage.
   */
  public final inline var width: Int
    @JvmName("widthProperty")
    get() = getWidth()
    @JvmName("widthProperty")
    set(`value`) {
      setWidth(value)
    }

  /**
   * The [Curve] that is rendered onto the texture's red channel.
   */
  public final inline var curveX: Curve?
    @JvmName("curveXProperty")
    get() = getCurveX()
    @JvmName("curveXProperty")
    set(`value`) {
      setCurveX(value)
    }

  /**
   * The [Curve] that is rendered onto the texture's green channel.
   */
  public final inline var curveY: Curve?
    @JvmName("curveYProperty")
    get() = getCurveY()
    @JvmName("curveYProperty")
    set(`value`) {
      setCurveY(value)
    }

  /**
   * The [Curve] that is rendered onto the texture's blue channel.
   */
  public final inline var curveZ: Curve?
    @JvmName("curveZProperty")
    get() = getCurveZ()
    @JvmName("curveZProperty")
    set(`value`) {
      setCurveZ(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_CURVEXYZTEXTURE_INDEX, scriptIndex)
  }

  public final fun setWidth(width: Int): Unit {
    Internals.writeArguments(LONG to width.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setWidthPtr, NIL)
  }

  public final fun setCurveX(curve: Curve?): Unit {
    Internals.writeArguments(OBJECT to curve)
    Internals.callMethod(rawPtr, MethodBindings.setCurveXPtr, NIL)
  }

  public final fun getCurveX(): Curve? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCurveXPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Curve?)
  }

  public final fun setCurveY(curve: Curve?): Unit {
    Internals.writeArguments(OBJECT to curve)
    Internals.callMethod(rawPtr, MethodBindings.setCurveYPtr, NIL)
  }

  public final fun getCurveY(): Curve? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCurveYPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Curve?)
  }

  public final fun setCurveZ(curve: Curve?): Unit {
    Internals.writeArguments(OBJECT to curve)
    Internals.callMethod(rawPtr, MethodBindings.setCurveZPtr, NIL)
  }

  public final fun getCurveZ(): Curve? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCurveZPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Curve?)
  }

  public companion object

  internal object MethodBindings {
    public val setWidthPtr: VoidPtr =
        Internals.getMethodBindPtr("CurveXYZTexture", "set_width", 1286410249)

    public val setCurveXPtr: VoidPtr =
        Internals.getMethodBindPtr("CurveXYZTexture", "set_curve_x", 270443179)

    public val getCurveXPtr: VoidPtr =
        Internals.getMethodBindPtr("CurveXYZTexture", "get_curve_x", 2460114913)

    public val setCurveYPtr: VoidPtr =
        Internals.getMethodBindPtr("CurveXYZTexture", "set_curve_y", 270443179)

    public val getCurveYPtr: VoidPtr =
        Internals.getMethodBindPtr("CurveXYZTexture", "get_curve_y", 2460114913)

    public val setCurveZPtr: VoidPtr =
        Internals.getMethodBindPtr("CurveXYZTexture", "set_curve_z", 270443179)

    public val getCurveZPtr: VoidPtr =
        Internals.getMethodBindPtr("CurveXYZTexture", "get_curve_z", 2460114913)
  }
}
