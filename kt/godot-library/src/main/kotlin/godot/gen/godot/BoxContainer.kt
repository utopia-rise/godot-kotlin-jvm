// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress

/**
 * Base class for box containers.
 *
 * Arranges child controls vertically or horizontally, and rearranges the controls automatically when their minimum size changes.
 */
@GodotBaseType
open class BoxContainer : Container() {
  /**
   * The alignment of the container's children (must be one of [ALIGN_BEGIN], [ALIGN_CENTER] or [ALIGN_END]).
   */
  open var alignment: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BOXCONTAINER_GET_ALIGNMENT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BOXCONTAINER_SET_ALIGNMENT, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_BOXCONTAINER)
  }

  /**
   * Adds a control to the box as a spacer. If `true`, `begin` will insert the spacer control in front of other children.
   */
  open fun addSpacer(begin: Boolean) {
    TransferContext.writeArguments(BOOL to begin)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BOXCONTAINER_ADD_SPACER, NIL)
  }

  enum class AlignMode(
    id: Long
  ) {
    /**
     * Aligns children with the beginning of the container.
     */
    ALIGN_BEGIN(0),

    /**
     * Aligns children with the center of the container.
     */
    ALIGN_CENTER(1),

    /**
     * Aligns children with the end of the container.
     */
    ALIGN_END(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     * Aligns children with the beginning of the container.
     */
    final const val ALIGN_BEGIN: Long = 0

    /**
     * Aligns children with the center of the container.
     */
    final const val ALIGN_CENTER: Long = 1

    /**
     * Aligns children with the end of the container.
     */
    final const val ALIGN_END: Long = 2
  }
}
