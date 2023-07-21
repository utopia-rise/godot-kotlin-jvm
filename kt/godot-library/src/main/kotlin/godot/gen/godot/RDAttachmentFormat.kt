// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Attachment format (used by [godot.RenderingDevice]).
 *
 * This object is used by [godot.RenderingDevice].
 */
@GodotBaseType
public open class RDAttachmentFormat : RefCounted() {
  /**
   * The attachment's data format.
   */
  public var format: RenderingDevice.DataFormat
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDATTACHMENTFORMAT_GET_FORMAT,
          LONG)
      return RenderingDevice.DataFormat.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDATTACHMENTFORMAT_SET_FORMAT,
          NIL)
    }

  /**
   * The number of samples used when sampling the attachment.
   */
  public var samples: RenderingDevice.TextureSamples
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDATTACHMENTFORMAT_GET_SAMPLES,
          LONG)
      return RenderingDevice.TextureSamples.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDATTACHMENTFORMAT_SET_SAMPLES,
          NIL)
    }

  /**
   * The attachment's usage flags, which determine what can be done with it.
   */
  public var usageFlags: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDATTACHMENTFORMAT_GET_USAGE_FLAGS, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDATTACHMENTFORMAT_SET_USAGE_FLAGS, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RDATTACHMENTFORMAT, scriptIndex)
    return true
  }

  public companion object
}
