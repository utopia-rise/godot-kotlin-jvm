// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedInt32Array
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Framebuffer pass attachment description (used by [godot.RenderingDevice]).
 *
 * This class contains the list of attachment descriptions for a framebuffer pass. Each points with an index to a previously supplied list of texture attachments.
 *
 * Multipass framebuffers can optimize some configurations in mobile. On desktop, they provide little to no advantage.
 *
 * This object is used by [godot.RenderingDevice].
 */
@GodotBaseType
public open class RDFramebufferPass : RefCounted() {
  /**
   * Color attachments in order starting from 0. If this attachment is not used by the shader, pass ATTACHMENT_UNUSED to skip.
   */
  public var colorAttachments: PackedInt32Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getColorAttachmentsPtr, PACKED_INT_32_ARRAY)
      return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_INT_32_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setColorAttachmentsPtr, NIL)
    }

  /**
   * Used for multipass framebuffers (more than one render pass). Converts an attachment to an input. Make sure to also supply it properly in the [godot.RDUniform] for the uniform set.
   */
  public var inputAttachments: PackedInt32Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getInputAttachmentsPtr, PACKED_INT_32_ARRAY)
      return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_INT_32_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setInputAttachmentsPtr, NIL)
    }

  /**
   * If the color attachments are multisampled, non-multisampled resolve attachments can be provided.
   */
  public var resolveAttachments: PackedInt32Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getResolveAttachmentsPtr,
          PACKED_INT_32_ARRAY)
      return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_INT_32_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setResolveAttachmentsPtr, NIL)
    }

  /**
   * Attachments to preserve in this pass (otherwise they are erased).
   */
  public var preserveAttachments: PackedInt32Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPreserveAttachmentsPtr,
          PACKED_INT_32_ARRAY)
      return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_INT_32_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPreserveAttachmentsPtr, NIL)
    }

  /**
   * Depth attachment. ATTACHMENT_UNUSED should be used if no depth buffer is required for this pass.
   */
  public var depthAttachment: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDepthAttachmentPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setDepthAttachmentPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RDFRAMEBUFFERPASS, scriptIndex)
    return true
  }

  public companion object {
    /**
     * Attachment is unused.
     */
    public final const val ATTACHMENT_UNUSED: Long = -1
  }

  internal object MethodBindings {
    public val setColorAttachmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDFramebufferPass", "set_color_attachments")

    public val getColorAttachmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDFramebufferPass", "get_color_attachments")

    public val setInputAttachmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDFramebufferPass", "set_input_attachments")

    public val getInputAttachmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDFramebufferPass", "get_input_attachments")

    public val setResolveAttachmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDFramebufferPass", "set_resolve_attachments")

    public val getResolveAttachmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDFramebufferPass", "get_resolve_attachments")

    public val setPreserveAttachmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDFramebufferPass", "set_preserve_attachments")

    public val getPreserveAttachmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDFramebufferPass", "get_preserve_attachments")

    public val setDepthAttachmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDFramebufferPass", "set_depth_attachment")

    public val getDepthAttachmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDFramebufferPass", "get_depth_attachment")
  }
}
