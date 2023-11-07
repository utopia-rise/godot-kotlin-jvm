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
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * This object is used by [RenderingDevice].
 */
@GodotBaseType
public open class RDTextureView : RefCounted() {
  /**
   * Optional override for the data format to return sampled values in. The default value of
   * [constant RenderingDevice.DATA_FORMAT_MAX] does not override the format.
   */
  public var formatOverride: RenderingDevice.DataFormat
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFormatOverridePtr, LONG)
      return RenderingDevice.DataFormat.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setFormatOverridePtr, NIL)
    }

  /**
   * The channel to sample when sampling the red color channel.
   */
  public var swizzleR: RenderingDevice.TextureSwizzle
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSwizzleRPtr, LONG)
      return RenderingDevice.TextureSwizzle.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setSwizzleRPtr, NIL)
    }

  /**
   * The channel to sample when sampling the green color channel.
   */
  public var swizzleG: RenderingDevice.TextureSwizzle
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSwizzleGPtr, LONG)
      return RenderingDevice.TextureSwizzle.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setSwizzleGPtr, NIL)
    }

  /**
   * The channel to sample when sampling the blue color channel.
   */
  public var swizzleB: RenderingDevice.TextureSwizzle
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSwizzleBPtr, LONG)
      return RenderingDevice.TextureSwizzle.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setSwizzleBPtr, NIL)
    }

  /**
   * The channel to sample when sampling the alpha channel.
   */
  public var swizzleA: RenderingDevice.TextureSwizzle
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSwizzleAPtr, LONG)
      return RenderingDevice.TextureSwizzle.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setSwizzleAPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RDTEXTUREVIEW, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setFormatOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureView", "set_format_override")

    public val getFormatOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureView", "get_format_override")

    public val setSwizzleRPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureView", "set_swizzle_r")

    public val getSwizzleRPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureView", "get_swizzle_r")

    public val setSwizzleGPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureView", "set_swizzle_g")

    public val getSwizzleGPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureView", "get_swizzle_g")

    public val setSwizzleBPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureView", "set_swizzle_b")

    public val getSwizzleBPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureView", "get_swizzle_b")

    public val setSwizzleAPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureView", "set_swizzle_a")

    public val getSwizzleAPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureView", "get_swizzle_a")
  }
}
