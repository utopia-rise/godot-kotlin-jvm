// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Base class for box containers.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/ui/gui_containers.html]($DOCS_URL/tutorials/ui/gui_containers.html)
 *
 * Arranges child [godot.Control] nodes vertically or horizontally, and rearranges them automatically when their minimum size changes.
 */
@GodotBaseType
public open class BoxContainer : Container() {
  /**
   * The alignment of the container's children (must be one of [ALIGNMENT_BEGIN], [ALIGNMENT_CENTER], or [ALIGNMENT_END]).
   */
  public var alignment: BoxContainer.AlignmentMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BOXCONTAINER_GET_ALIGNMENT, LONG)
      return BoxContainer.AlignmentMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BOXCONTAINER_SET_ALIGNMENT, NIL)
    }

  /**
   * If `true`, the [godot.BoxContainer] will arrange its children vertically, rather than horizontally.
   *
   * Can't be changed when using [godot.HBoxContainer] and [godot.VBoxContainer].
   */
  public var vertical: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BOXCONTAINER_IS_VERTICAL, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BOXCONTAINER_SET_VERTICAL, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_BOXCONTAINER, scriptIndex)
    return true
  }

  /**
   * Adds a [godot.Control] node to the box as a spacer. If [begin] is `true`, it will insert the [godot.Control] node in front of all other children.
   */
  public fun addSpacer(begin: Boolean): Control? {
    TransferContext.writeArguments(BOOL to begin)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BOXCONTAINER_ADD_SPACER, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Control?
  }

  public enum class AlignmentMode(
    id: Long
  ) {
    /**
     * The child controls will be arranged at the beginning of the container, i.e. top if orientation is vertical, left if orientation is horizontal (right for RTL layout).
     */
    ALIGNMENT_BEGIN(0),
    /**
     * The child controls will be centered in the container.
     */
    ALIGNMENT_CENTER(1),
    /**
     * The child controls will be arranged at the end of the container, i.e. bottom if orientation is vertical, right if orientation is horizontal (left for RTL layout).
     */
    ALIGNMENT_END(2),
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
