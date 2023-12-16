// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.jvm.JvmName

/**
 * A 1D texture where the red, green, and blue color channels correspond to points on 3 curves.
 *
 * A 1D texture where the red, green, and blue color channels correspond to points on 3 [godot.Curve] resources. Compared to using separate [godot.CurveTexture]s, this further simplifies the task of saving curves as image files.
 *
 * If you only need to store one curve within a single texture, use [godot.CurveTexture] instead. See also [godot.GradientTexture1D] and [godot.GradientTexture2D].
 */
@GodotBaseType
public open class CurveXYZTexture : Texture2D() {
  /**
   * The width of the texture (in pixels). Higher values make it possible to represent high-frequency data better (such as sudden direction changes), at the cost of increased generation time and memory usage.
   */
  public var width: Int
    @JvmName("getWidth_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.getWidth()
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setWidthPtr, NIL)
    }

  /**
   * The [godot.Curve] that is rendered onto the texture's red channel.
   */
  public var curveX: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCurveXPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCurveXPtr, NIL)
    }

  /**
   * The [godot.Curve] that is rendered onto the texture's green channel.
   */
  public var curveY: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCurveYPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCurveYPtr, NIL)
    }

  /**
   * The [godot.Curve] that is rendered onto the texture's blue channel.
   */
  public var curveZ: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCurveZPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCurveZPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CURVEXYZTEXTURE, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setWidthPtr: VoidPtr = TypeManager.getMethodBindPtr("CurveXYZTexture", "set_width")

    public val setCurveXPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CurveXYZTexture", "set_curve_x")

    public val getCurveXPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CurveXYZTexture", "get_curve_x")

    public val setCurveYPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CurveXYZTexture", "set_curve_y")

    public val getCurveYPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CurveXYZTexture", "get_curve_y")

    public val setCurveZPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CurveXYZTexture", "set_curve_z")

    public val getCurveZPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CurveXYZTexture", "get_curve_z")
  }
}
