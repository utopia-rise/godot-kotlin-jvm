// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A 1D texture where the red, green, and blue color channels correspond to points on 3 unit [Curve]
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
   * The [Curve] that is rendered onto the texture's red channel. Should be a unit [Curve].
   */
  public final inline var curveX: Curve?
    @JvmName("curveXProperty")
    get() = getCurveX()
    @JvmName("curveXProperty")
    set(`value`) {
      setCurveX(value)
    }

  /**
   * The [Curve] that is rendered onto the texture's green channel. Should be a unit [Curve].
   */
  public final inline var curveY: Curve?
    @JvmName("curveYProperty")
    get() = getCurveY()
    @JvmName("curveYProperty")
    set(`value`) {
      setCurveY(value)
    }

  /**
   * The [Curve] that is rendered onto the texture's blue channel. Should be a unit [Curve].
   */
  public final inline var curveZ: Curve?
    @JvmName("curveZProperty")
    get() = getCurveZ()
    @JvmName("curveZProperty")
    set(`value`) {
      setCurveZ(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(189, scriptIndex)
  }

  public final fun setWidth(width: Int): Unit {
    TransferContext.writeArguments(LONG to width.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setWidthPtr, NIL)
  }

  public final fun setCurveX(curve: Curve?): Unit {
    TransferContext.writeArguments(OBJECT to curve)
    TransferContext.callMethod(ptr, MethodBindings.setCurveXPtr, NIL)
  }

  public final fun getCurveX(): Curve? {
    TransferContext.callMethod(ptr, MethodBindings.getCurveXPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Curve?)
  }

  public final fun setCurveY(curve: Curve?): Unit {
    TransferContext.writeArguments(OBJECT to curve)
    TransferContext.callMethod(ptr, MethodBindings.setCurveYPtr, NIL)
  }

  public final fun getCurveY(): Curve? {
    TransferContext.callMethod(ptr, MethodBindings.getCurveYPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Curve?)
  }

  public final fun setCurveZ(curve: Curve?): Unit {
    TransferContext.writeArguments(OBJECT to curve)
    TransferContext.callMethod(ptr, MethodBindings.setCurveZPtr, NIL)
  }

  public final fun getCurveZ(): Curve? {
    TransferContext.callMethod(ptr, MethodBindings.getCurveZPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Curve?)
  }

  public companion object

  public object MethodBindings {
    internal val setWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CurveXYZTexture", "set_width", 1286410249)

    internal val setCurveXPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CurveXYZTexture", "set_curve_x", 270443179)

    internal val getCurveXPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CurveXYZTexture", "get_curve_x", 2460114913)

    internal val setCurveYPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CurveXYZTexture", "set_curve_y", 270443179)

    internal val getCurveYPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CurveXYZTexture", "get_curve_y", 2460114913)

    internal val setCurveZPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CurveXYZTexture", "set_curve_z", 270443179)

    internal val getCurveZPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CurveXYZTexture", "get_curve_z", 2460114913)
  }
}
