// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * Texture view (used by [godot.RenderingDevice]).
 *
 * This object is used by [godot.RenderingDevice].
 */
@GodotBaseType
public open class RDTextureView : RefCounted() {
  /**
   * Optional override for the data format to return sampled values in. The default value of [godot.RenderingDevice.DATA_FORMAT_MAX] does not override the format.
   */
  public var formatOverride: RenderingDevice.DataFormat
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDTEXTUREVIEW_GET_FORMAT_OVERRIDE,
          LONG)
      return RenderingDevice.DataFormat.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDTEXTUREVIEW_SET_FORMAT_OVERRIDE,
          NIL)
    }

  /**
   * The channel to sample when sampling the red color channel.
   */
  public var swizzleR: RenderingDevice.TextureSwizzle
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDTEXTUREVIEW_GET_SWIZZLE_R, LONG)
      return RenderingDevice.TextureSwizzle.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDTEXTUREVIEW_SET_SWIZZLE_R, NIL)
    }

  /**
   * The channel to sample when sampling the green color channel.
   */
  public var swizzleG: RenderingDevice.TextureSwizzle
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDTEXTUREVIEW_GET_SWIZZLE_G, LONG)
      return RenderingDevice.TextureSwizzle.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDTEXTUREVIEW_SET_SWIZZLE_G, NIL)
    }

  /**
   * The channel to sample when sampling the blue color channel.
   */
  public var swizzleB: RenderingDevice.TextureSwizzle
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDTEXTUREVIEW_GET_SWIZZLE_B, LONG)
      return RenderingDevice.TextureSwizzle.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDTEXTUREVIEW_SET_SWIZZLE_B, NIL)
    }

  /**
   * The channel to sample when sampling the alpha channel.
   */
  public var swizzleA: RenderingDevice.TextureSwizzle
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDTEXTUREVIEW_GET_SWIZZLE_A, LONG)
      return RenderingDevice.TextureSwizzle.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDTEXTUREVIEW_SET_SWIZZLE_A, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RDTEXTUREVIEW, scriptIndex)
    return true
  }

  public companion object
}
