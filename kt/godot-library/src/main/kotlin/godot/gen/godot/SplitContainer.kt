// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress

/**
 * Container for splitting and adjusting.
 *
 * Container for splitting two [godot.Control]s vertically or horizontally, with a grabber that allows adjusting the split offset or ratio.
 */
@GodotBaseType
open class SplitContainer : Container() {
  /**
   * Emitted when the dragger is dragged by user.
   */
  val dragged: Signal1<Long> by signal("offset")

  /**
   * If `true`, the area of the first [godot.Control] will be collapsed and the dragger will be disabled.
   */
  open var collapsed: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPLITCONTAINER_GET_COLLAPSED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPLITCONTAINER_SET_COLLAPSED, NIL)
    }

  /**
   * Determines the dragger's visibility. See [enum DraggerVisibility] for details.
   */
  open var draggerVisibility: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPLITCONTAINER_GET_DRAGGER_VISIBILITY, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPLITCONTAINER_SET_DRAGGER_VISIBILITY, NIL)
    }

  /**
   * The initial offset of the splitting between the two [godot.Control]s, with `0` being at the end of the first [godot.Control].
   */
  open var splitOffset: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPLITCONTAINER_GET_SPLIT_OFFSET,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPLITCONTAINER_SET_SPLIT_OFFSET,
          NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_SPLITCONTAINER)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  override fun _guiInput(event: InputEvent) {
  }

  /**
   * Clamps the [splitOffset] value to not go outside the currently possible minimal and maximum values.
   */
  open fun clampSplitOffset() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPLITCONTAINER_CLAMP_SPLIT_OFFSET,
        NIL)
  }

  enum class DraggerVisibility(
    id: Long
  ) {
    /**
     * The split dragger is visible when the cursor hovers it.
     */
    DRAGGER_VISIBLE(0),

    /**
     * The split dragger is never visible.
     */
    DRAGGER_HIDDEN(1),

    /**
     * The split dragger is never visible and its space collapsed.
     */
    DRAGGER_HIDDEN_COLLAPSED(2);

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
     * The split dragger is never visible.
     */
    final const val DRAGGER_HIDDEN: Long = 1

    /**
     * The split dragger is never visible and its space collapsed.
     */
    final const val DRAGGER_HIDDEN_COLLAPSED: Long = 2

    /**
     * The split dragger is visible when the cursor hovers it.
     */
    final const val DRAGGER_VISIBLE: Long = 0
  }
}
