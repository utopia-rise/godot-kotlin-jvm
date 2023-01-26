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
 *
 */
@GodotBaseType
public open class RDTextureFormat : RefCounted() {
  /**
   *
   */
  public var format: RenderingDevice.DataFormat
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDTEXTUREFORMAT_GET_FORMAT, LONG)
      return RenderingDevice.DataFormat.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDTEXTUREFORMAT_SET_FORMAT, NIL)
    }

  /**
   *
   */
  public var width: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDTEXTUREFORMAT_GET_WIDTH, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDTEXTUREFORMAT_SET_WIDTH, NIL)
    }

  /**
   *
   */
  public var height: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDTEXTUREFORMAT_GET_HEIGHT, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDTEXTUREFORMAT_SET_HEIGHT, NIL)
    }

  /**
   *
   */
  public var depth: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDTEXTUREFORMAT_GET_DEPTH, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDTEXTUREFORMAT_SET_DEPTH, NIL)
    }

  /**
   *
   */
  public var arrayLayers: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDTEXTUREFORMAT_GET_ARRAY_LAYERS,
          LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDTEXTUREFORMAT_SET_ARRAY_LAYERS,
          NIL)
    }

  /**
   *
   */
  public var mipmaps: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDTEXTUREFORMAT_GET_MIPMAPS, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDTEXTUREFORMAT_SET_MIPMAPS, NIL)
    }

  /**
   *
   */
  public var textureType: RenderingDevice.TextureType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDTEXTUREFORMAT_GET_TEXTURE_TYPE,
          LONG)
      return RenderingDevice.TextureType.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDTEXTUREFORMAT_SET_TEXTURE_TYPE,
          NIL)
    }

  /**
   *
   */
  public var samples: RenderingDevice.TextureSamples
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDTEXTUREFORMAT_GET_SAMPLES, LONG)
      return RenderingDevice.TextureSamples.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDTEXTUREFORMAT_SET_SAMPLES, NIL)
    }

  /**
   *
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
