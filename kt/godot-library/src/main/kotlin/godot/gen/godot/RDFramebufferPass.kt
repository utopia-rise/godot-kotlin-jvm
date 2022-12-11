// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedInt32Array
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Framebuffer pass attachment description.
 *
 * This class contains the list of attachment descriptions for a framebuffer pass. Each points with an index to a previously supplied list of texture attachments.
 *
 * Multipass framebuffers can optimize some configurations in mobile, on desktop they provide little to no advantage.
 */
@GodotBaseType
public open class RDFramebufferPass : RefCounted() {
  /**
   * Color attachments in order starting from 0. If this attachment is not used by the shader, pass ATTACHMENT_UNUSED to skip.
   */
  public var colorAttachments: PackedInt32Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDFRAMEBUFFERPASS_GET_COLOR_ATTACHMENTS, PACKED_INT_32_ARRAY)
      return TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_INT_32_ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDFRAMEBUFFERPASS_SET_COLOR_ATTACHMENTS, NIL)
    }

  /**
   * Used for multipass framebuffers (more than one render pass). Converts an attachment to an input. Make sure to also supply it properly in the [godot.RDUniform] for the uniform set.
   */
  public var inputAttachments: PackedInt32Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDFRAMEBUFFERPASS_GET_INPUT_ATTACHMENTS, PACKED_INT_32_ARRAY)
      return TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_INT_32_ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDFRAMEBUFFERPASS_SET_INPUT_ATTACHMENTS, NIL)
    }

  /**
   * If the color attachments are multisampled, non-multisampled resolve attachments can be provided.
   */
  public var resolveAttachments: PackedInt32Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDFRAMEBUFFERPASS_GET_RESOLVE_ATTACHMENTS, PACKED_INT_32_ARRAY)
      return TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_INT_32_ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDFRAMEBUFFERPASS_SET_RESOLVE_ATTACHMENTS, NIL)
    }

  /**
   * Attachments to preserve in this pass (otherwise they are erased).
   */
  public var preserveAttachments: PackedInt32Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDFRAMEBUFFERPASS_GET_PRESERVE_ATTACHMENTS, PACKED_INT_32_ARRAY)
      return TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_INT_32_ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDFRAMEBUFFERPASS_SET_PRESERVE_ATTACHMENTS, NIL)
    }

  /**
   * Depth attachment. ATTACHMENT_UNUSED should be used if no depth buffer is required for this pass.
   */
  public var depthAttachment: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDFRAMEBUFFERPASS_GET_DEPTH_ATTACHMENT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDFRAMEBUFFERPASS_SET_DEPTH_ATTACHMENT, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RDFRAMEBUFFERPASS, scriptIndex)
    return true
  }

  public companion object {
    /**
     *
     */
    public final const val ATTACHMENT_UNUSED: Long = -1
  }
}
