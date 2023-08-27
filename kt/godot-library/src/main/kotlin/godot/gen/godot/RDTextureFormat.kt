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
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Texture format (used by [godot.RenderingDevice]).
 *
 * This object is used by [godot.RenderingDevice].
 */
@GodotBaseType
public open class RDTextureFormat : RefCounted() {
  /**
   * The texture's pixel data format.
   */
  public var format: RenderingDevice.DataFormat
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDTEXTUREFORMAT_GET_FORMAT, LONG)
      return RenderingDevice.DataFormat.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDTEXTUREFORMAT_SET_FORMAT, NIL)
    }

  /**
   * The texture's width (in pixels).
   */
  public var width: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDTEXTUREFORMAT_GET_WIDTH, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDTEXTUREFORMAT_SET_WIDTH, NIL)
    }

  /**
   * The texture's height (in pixels).
   */
  public var height: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDTEXTUREFORMAT_GET_HEIGHT, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDTEXTUREFORMAT_SET_HEIGHT, NIL)
    }

  /**
   * The texture's depth (in pixels). This is always `1` for 2D textures.
   */
  public var depth: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDTEXTUREFORMAT_GET_DEPTH, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDTEXTUREFORMAT_SET_DEPTH, NIL)
    }

  /**
   * The number of layers in the texture. Only relevant for 2D texture arrays.
   */
  public var arrayLayers: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDTEXTUREFORMAT_GET_ARRAY_LAYERS,
          LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDTEXTUREFORMAT_SET_ARRAY_LAYERS,
          NIL)
    }

  /**
   * The number of mipmaps available in the texture.
   */
  public var mipmaps: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDTEXTUREFORMAT_GET_MIPMAPS, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDTEXTUREFORMAT_SET_MIPMAPS, NIL)
    }

  /**
   * The texture type.
   */
  public var textureType: RenderingDevice.TextureType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDTEXTUREFORMAT_GET_TEXTURE_TYPE,
          LONG)
      return RenderingDevice.TextureType.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDTEXTUREFORMAT_SET_TEXTURE_TYPE,
          NIL)
    }

  /**
   * The number of samples used when sampling the texture.
   */
  public var samples: RenderingDevice.TextureSamples
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDTEXTUREFORMAT_GET_SAMPLES, LONG)
      return RenderingDevice.TextureSamples.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDTEXTUREFORMAT_SET_SAMPLES, NIL)
    }

  /**
   * The texture's usage bits, which determine what can be done using the texture.
   */
  public var usageBits: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDTEXTUREFORMAT_GET_USAGE_BITS,
          OBJECT)
      return (TransferContext.readReturnValue(OBJECT, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDTEXTUREFORMAT_SET_USAGE_BITS,
          NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RDTEXTUREFORMAT, scriptIndex)
    return true
  }

  /**
   *
   */
  public fun addShareableFormat(format: RenderingDevice.DataFormat): Unit {
    TransferContext.writeArguments(LONG to format.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RDTEXTUREFORMAT_ADD_SHAREABLE_FORMAT, NIL)
  }

  /**
   *
   */
  public fun removeShareableFormat(format: RenderingDevice.DataFormat): Unit {
    TransferContext.writeArguments(LONG to format.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RDTEXTUREFORMAT_REMOVE_SHAREABLE_FORMAT, NIL)
  }

  public companion object
}
