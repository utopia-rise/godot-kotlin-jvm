// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.jvm.JvmName

@GodotBaseType
public open class NoiseTexture3D : Texture3D() {
  public var width: Int
    @JvmName("getWidth_prop")
    get() = super.getWidth()
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setWidthPtr, NIL)
    }

  public var height: Int
    @JvmName("getHeight_prop")
    get() = super.getHeight()
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setHeightPtr, NIL)
    }

  public var depth: Int
    @JvmName("getDepth_prop")
    get() = super.getDepth()
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setDepthPtr, NIL)
    }

  public var invert: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getInvertPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setInvertPtr, NIL)
    }

  public var seamless: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSeamlessPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSeamlessPtr, NIL)
    }

  public var seamlessBlendSkirt: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSeamlessBlendSkirtPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSeamlessBlendSkirtPtr, NIL)
    }

  public var normalize: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isNormalizedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setNormalizePtr, NIL)
    }

  public var colorRamp: Gradient?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getColorRampPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Gradient?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setColorRampPtr, NIL)
    }

  public var noise: Noise?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getNoisePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Noise?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setNoisePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_NOISETEXTURE3D, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setWidthPtr: VoidPtr = TypeManager.getMethodBindPtr("NoiseTexture3D", "set_width")

    public val setHeightPtr: VoidPtr = TypeManager.getMethodBindPtr("NoiseTexture3D", "set_height")

    public val setDepthPtr: VoidPtr = TypeManager.getMethodBindPtr("NoiseTexture3D", "set_depth")

    public val setInvertPtr: VoidPtr = TypeManager.getMethodBindPtr("NoiseTexture3D", "set_invert")

    public val getInvertPtr: VoidPtr = TypeManager.getMethodBindPtr("NoiseTexture3D", "get_invert")

    public val setSeamlessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NoiseTexture3D", "set_seamless")

    public val getSeamlessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NoiseTexture3D", "get_seamless")

    public val setSeamlessBlendSkirtPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NoiseTexture3D", "set_seamless_blend_skirt")

    public val getSeamlessBlendSkirtPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NoiseTexture3D", "get_seamless_blend_skirt")

    public val setNormalizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NoiseTexture3D", "set_normalize")

    public val isNormalizedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NoiseTexture3D", "is_normalized")

    public val setColorRampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NoiseTexture3D", "set_color_ramp")

    public val getColorRampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NoiseTexture3D", "get_color_ramp")

    public val setNoisePtr: VoidPtr = TypeManager.getMethodBindPtr("NoiseTexture3D", "set_noise")

    public val getNoisePtr: VoidPtr = TypeManager.getMethodBindPtr("NoiseTexture3D", "get_noise")
  }
}
