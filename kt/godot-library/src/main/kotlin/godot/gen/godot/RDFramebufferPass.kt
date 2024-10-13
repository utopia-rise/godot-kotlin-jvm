// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.core.PackedInt32Array
import godot.core.TypeManager
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_INT_32_ARRAY
import godot.core.memory.TransferContext
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * This class contains the list of attachment descriptions for a framebuffer pass. Each points with
 * an index to a previously supplied list of texture attachments.
 * Multipass framebuffers can optimize some configurations in mobile. On desktop, they provide
 * little to no advantage.
 * This object is used by [RenderingDevice].
 */
@GodotBaseType
public open class RDFramebufferPass : RefCounted() {
  /**
   * Color attachments in order starting from 0. If this attachment is not used by the shader, pass
   * ATTACHMENT_UNUSED to skip.
   */
  public final inline var colorAttachments: PackedInt32Array
    @JvmName("colorAttachmentsProperty")
    get() = getColorAttachments()
    @JvmName("colorAttachmentsProperty")
    set(`value`) {
      setColorAttachments(value)
    }

  /**
   * Used for multipass framebuffers (more than one render pass). Converts an attachment to an
   * input. Make sure to also supply it properly in the [RDUniform] for the uniform set.
   */
  public final inline var inputAttachments: PackedInt32Array
    @JvmName("inputAttachmentsProperty")
    get() = getInputAttachments()
    @JvmName("inputAttachmentsProperty")
    set(`value`) {
      setInputAttachments(value)
    }

  /**
   * If the color attachments are multisampled, non-multisampled resolve attachments can be
   * provided.
   */
  public final inline var resolveAttachments: PackedInt32Array
    @JvmName("resolveAttachmentsProperty")
    get() = getResolveAttachments()
    @JvmName("resolveAttachmentsProperty")
    set(`value`) {
      setResolveAttachments(value)
    }

  /**
   * Attachments to preserve in this pass (otherwise they are erased).
   */
  public final inline var preserveAttachments: PackedInt32Array
    @JvmName("preserveAttachmentsProperty")
    get() = getPreserveAttachments()
    @JvmName("preserveAttachmentsProperty")
    set(`value`) {
      setPreserveAttachments(value)
    }

  /**
   * Depth attachment. ATTACHMENT_UNUSED should be used if no depth buffer is required for this
   * pass.
   */
  public final inline var depthAttachment: Int
    @JvmName("depthAttachmentProperty")
    get() = getDepthAttachment()
    @JvmName("depthAttachmentProperty")
    set(`value`) {
      setDepthAttachment(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_RDFRAMEBUFFERPASS, scriptIndex)
  }

  public final fun setColorAttachments(pMember: PackedInt32Array): Unit {
    TransferContext.writeArguments(PACKED_INT_32_ARRAY to pMember)
    TransferContext.callMethod(ptr, MethodBindings.setColorAttachmentsPtr, NIL)
  }

  public final fun getColorAttachments(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getColorAttachmentsPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  public final fun setInputAttachments(pMember: PackedInt32Array): Unit {
    TransferContext.writeArguments(PACKED_INT_32_ARRAY to pMember)
    TransferContext.callMethod(ptr, MethodBindings.setInputAttachmentsPtr, NIL)
  }

  public final fun getInputAttachments(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getInputAttachmentsPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  public final fun setResolveAttachments(pMember: PackedInt32Array): Unit {
    TransferContext.writeArguments(PACKED_INT_32_ARRAY to pMember)
    TransferContext.callMethod(ptr, MethodBindings.setResolveAttachmentsPtr, NIL)
  }

  public final fun getResolveAttachments(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getResolveAttachmentsPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  public final fun setPreserveAttachments(pMember: PackedInt32Array): Unit {
    TransferContext.writeArguments(PACKED_INT_32_ARRAY to pMember)
    TransferContext.callMethod(ptr, MethodBindings.setPreserveAttachmentsPtr, NIL)
  }

  public final fun getPreserveAttachments(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPreserveAttachmentsPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  public final fun setDepthAttachment(pMember: Int): Unit {
    TransferContext.writeArguments(LONG to pMember.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setDepthAttachmentPtr, NIL)
  }

  public final fun getDepthAttachment(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDepthAttachmentPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public companion object {
    /**
     * Attachment is unused.
     */
    public final const val ATTACHMENT_UNUSED: Long = -1
  }

  internal object MethodBindings {
    public val setColorAttachmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDFramebufferPass", "set_color_attachments", 3614634198)

    public val getColorAttachmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDFramebufferPass", "get_color_attachments", 1930428628)

    public val setInputAttachmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDFramebufferPass", "set_input_attachments", 3614634198)

    public val getInputAttachmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDFramebufferPass", "get_input_attachments", 1930428628)

    public val setResolveAttachmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDFramebufferPass", "set_resolve_attachments", 3614634198)

    public val getResolveAttachmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDFramebufferPass", "get_resolve_attachments", 1930428628)

    public val setPreserveAttachmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDFramebufferPass", "set_preserve_attachments", 3614634198)

    public val getPreserveAttachmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDFramebufferPass", "get_preserve_attachments", 1930428628)

    public val setDepthAttachmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDFramebufferPass", "set_depth_attachment", 1286410249)

    public val getDepthAttachmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDFramebufferPass", "get_depth_attachment", 3905245786)
  }
}
