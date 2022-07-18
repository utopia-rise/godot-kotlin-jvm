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
import godot.core.VariantType.OBJECT
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Base class for box containers.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/ui/gui_containers.html]($DOCS_URL/tutorials/ui/gui_containers.html)
 *
 * Arranges child [godot.Control] nodes vertically or horizontally, and rearranges them automatically when their minimum size changes.
 */
@GodotBaseType
public open class BoxContainer internal constructor() : Container() {
  /**
   * The alignment of the container's children (must be one of [ALIGNMENT_BEGIN], [ALIGNMENT_CENTER], or [ALIGNMENT_END]).
   */
  public var alignment: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_BOXCONTAINER_GET_ALIGNMENT,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_BOXCONTAINER_SET_ALIGNMENT,
          NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_BOXCONTAINER)
  }

  /**
   * Adds a [godot.Control] node to the box as a spacer. If `begin` is `true`, it will insert the [godot.Control] node in front of all other children.
   */
  public fun addSpacer(begin: Boolean): Control? {
    TransferContext.writeArguments(BOOL to begin)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_BOXCONTAINER_ADD_SPACER, OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as Control?
  }

  public enum class AlignmentMode(
    id: Long
  ) {
    /**
     *
     */
    ALIGNMENT_BEGIN(0),
    /**
     *
     */
    ALIGNMENT_CENTER(1),
    /**
     *
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
