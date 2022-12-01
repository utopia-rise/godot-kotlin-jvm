// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Container for splitting and adjusting.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/ui/gui_containers.html]($DOCS_URL/tutorials/ui/gui_containers.html)
 *
 * Container for splitting two [godot.Control]s vertically or horizontally, with a grabber that allows adjusting the split offset or ratio.
 */
@GodotBaseType
public open class SplitContainer internal constructor() : Container() {
  /**
   * Emitted when the dragger is dragged by user.
   */
  public val dragged: Signal1<Long> by signal("offset")

  /**
   * The initial offset of the splitting between the two [godot.Control]s, with `0` being at the end of the first [godot.Control].
   */
  public var splitOffset: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPLITCONTAINER_GET_SPLIT_OFFSET,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPLITCONTAINER_SET_SPLIT_OFFSET,
          NIL)
    }

  /**
   * If `true`, the area of the first [godot.Control] will be collapsed and the dragger will be disabled.
   */
  public var collapsed: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPLITCONTAINER_IS_COLLAPSED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPLITCONTAINER_SET_COLLAPSED, NIL)
    }

  /**
   * Determines the dragger's visibility. See [enum DraggerVisibility] for details.
   */
  public var draggerVisibility: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPLITCONTAINER_GET_DRAGGER_VISIBILITY, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPLITCONTAINER_SET_DRAGGER_VISIBILITY, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SPLITCONTAINER, scriptIndex)
    return true
  }

  /**
   * Clamps the [splitOffset] value to not go outside the currently possible minimal and maximum values.
   */
  public fun clampSplitOffset(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPLITCONTAINER_CLAMP_SPLIT_OFFSET,
        NIL)
  }

  public enum class DraggerVisibility(
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
    DRAGGER_HIDDEN_COLLAPSED(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
