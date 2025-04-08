// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.PackedInt32Array
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_INT_32_ARRAY
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * This class contains the list of attachment descriptions for a framebuffer pass. Each points with
 * an index to a previously supplied list of texture attachments.
 *
 * Multipass framebuffers can optimize some configurations in mobile. On desktop, they provide
 * little to no advantage.
 *
 * This object is used by [RenderingDevice].
 */
@GodotBaseType
public open class RDFramebufferPass : RefCounted() {
  /**
   * Color attachments in order starting from 0. If this attachment is not used by the shader, pass
   * ATTACHMENT_UNUSED to skip.
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
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
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
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
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
  public final inline var resolveAttachments: PackedInt32Array
    @JvmName("resolveAttachmentsProperty")
    get() = getResolveAttachments()
    @JvmName("resolveAttachmentsProperty")
    set(`value`) {
      setResolveAttachments(value)
    }

  /**
   * Attachments to preserve in this pass (otherwise they are erased).
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
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
    createNativeObject(524, scriptIndex)
  }

  /**
   * This is a helper function for [colorAttachments] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = rdframebufferpass.colorAttachments
   * //Your changes
   * rdframebufferpass.colorAttachments = myCoreType
   * ``````
   *
   * Color attachments in order starting from 0. If this attachment is not used by the shader, pass
   * ATTACHMENT_UNUSED to skip.
   */
  @CoreTypeHelper
  public final fun colorAttachmentsMutate(block: PackedInt32Array.() -> Unit): PackedInt32Array =
      colorAttachments.apply {
     block(this)
     colorAttachments = this
  }

  /**
   * This is a helper function for [colorAttachments] to make dealing with local copies easier.
   * Allow to directly modify each element of the local copy of the property and assign it back to
   * the Object.
   *
   * Color attachments in order starting from 0. If this attachment is not used by the shader, pass
   * ATTACHMENT_UNUSED to skip.
   */
  @CoreTypeHelper
  public final fun colorAttachmentsMutateEach(block: (index: Int, `value`: Int) -> Unit):
      PackedInt32Array = colorAttachments.apply {
     this.forEachIndexed { index, value ->
         block(index, value)
         this[index] = value
     }
     colorAttachments = this
  }

  /**
   * This is a helper function for [inputAttachments] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = rdframebufferpass.inputAttachments
   * //Your changes
   * rdframebufferpass.inputAttachments = myCoreType
   * ``````
   *
   * Used for multipass framebuffers (more than one render pass). Converts an attachment to an
   * input. Make sure to also supply it properly in the [RDUniform] for the uniform set.
   */
  @CoreTypeHelper
  public final fun inputAttachmentsMutate(block: PackedInt32Array.() -> Unit): PackedInt32Array =
      inputAttachments.apply {
     block(this)
     inputAttachments = this
  }

  /**
   * This is a helper function for [inputAttachments] to make dealing with local copies easier.
   * Allow to directly modify each element of the local copy of the property and assign it back to
   * the Object.
   *
   * Used for multipass framebuffers (more than one render pass). Converts an attachment to an
   * input. Make sure to also supply it properly in the [RDUniform] for the uniform set.
   */
  @CoreTypeHelper
  public final fun inputAttachmentsMutateEach(block: (index: Int, `value`: Int) -> Unit):
      PackedInt32Array = inputAttachments.apply {
     this.forEachIndexed { index, value ->
         block(index, value)
         this[index] = value
     }
     inputAttachments = this
  }

  /**
   * This is a helper function for [resolveAttachments] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = rdframebufferpass.resolveAttachments
   * //Your changes
   * rdframebufferpass.resolveAttachments = myCoreType
   * ``````
   *
   * If the color attachments are multisampled, non-multisampled resolve attachments can be
   * provided.
   */
  @CoreTypeHelper
  public final fun resolveAttachmentsMutate(block: PackedInt32Array.() -> Unit): PackedInt32Array =
      resolveAttachments.apply {
     block(this)
     resolveAttachments = this
  }

  /**
   * This is a helper function for [resolveAttachments] to make dealing with local copies easier.
   * Allow to directly modify each element of the local copy of the property and assign it back to
   * the Object.
   *
   * If the color attachments are multisampled, non-multisampled resolve attachments can be
   * provided.
   */
  @CoreTypeHelper
  public final fun resolveAttachmentsMutateEach(block: (index: Int, `value`: Int) -> Unit):
      PackedInt32Array = resolveAttachments.apply {
     this.forEachIndexed { index, value ->
         block(index, value)
         this[index] = value
     }
     resolveAttachments = this
  }

  /**
   * This is a helper function for [preserveAttachments] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = rdframebufferpass.preserveAttachments
   * //Your changes
   * rdframebufferpass.preserveAttachments = myCoreType
   * ``````
   *
   * Attachments to preserve in this pass (otherwise they are erased).
   */
  @CoreTypeHelper
  public final fun preserveAttachmentsMutate(block: PackedInt32Array.() -> Unit): PackedInt32Array =
      preserveAttachments.apply {
     block(this)
     preserveAttachments = this
  }

  /**
   * This is a helper function for [preserveAttachments] to make dealing with local copies easier.
   * Allow to directly modify each element of the local copy of the property and assign it back to
   * the Object.
   *
   * Attachments to preserve in this pass (otherwise they are erased).
   */
  @CoreTypeHelper
  public final fun preserveAttachmentsMutateEach(block: (index: Int, `value`: Int) -> Unit):
      PackedInt32Array = preserveAttachments.apply {
     this.forEachIndexed { index, value ->
         block(index, value)
         this[index] = value
     }
     preserveAttachments = this
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

  public object MethodBindings {
    internal val setColorAttachmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDFramebufferPass", "set_color_attachments", 3614634198)

    internal val getColorAttachmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDFramebufferPass", "get_color_attachments", 1930428628)

    internal val setInputAttachmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDFramebufferPass", "set_input_attachments", 3614634198)

    internal val getInputAttachmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDFramebufferPass", "get_input_attachments", 1930428628)

    internal val setResolveAttachmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDFramebufferPass", "set_resolve_attachments", 3614634198)

    internal val getResolveAttachmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDFramebufferPass", "get_resolve_attachments", 1930428628)

    internal val setPreserveAttachmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDFramebufferPass", "set_preserve_attachments", 3614634198)

    internal val getPreserveAttachmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDFramebufferPass", "get_preserve_attachments", 1930428628)

    internal val setDepthAttachmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDFramebufferPass", "set_depth_attachment", 1286410249)

    internal val getDepthAttachmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDFramebufferPass", "get_depth_attachment", 3905245786)
  }
}
