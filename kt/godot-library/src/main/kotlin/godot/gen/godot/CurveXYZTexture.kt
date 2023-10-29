// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
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
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVEXYZTEXTURE_SET_WIDTH, NIL)
    }

  /**
   * The [godot.Curve] that is rendered onto the texture's red channel.
   */
  public var curveX: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVEXYZTEXTURE_GET_CURVE_X,
          OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVEXYZTEXTURE_SET_CURVE_X, NIL)
    }

  /**
   * The [godot.Curve] that is rendered onto the texture's green channel.
   */
  public var curveY: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVEXYZTEXTURE_GET_CURVE_Y,
          OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVEXYZTEXTURE_SET_CURVE_Y, NIL)
    }

  /**
   * The [godot.Curve] that is rendered onto the texture's blue channel.
   */
  public var curveZ: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVEXYZTEXTURE_GET_CURVE_Z,
          OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CURVEXYZTEXTURE_SET_CURVE_Z, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CURVEXYZTEXTURE, scriptIndex)
    return true
  }

  public companion object
}
