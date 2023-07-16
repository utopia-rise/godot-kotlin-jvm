// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * A container that keeps child controls in its center.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/ui/gui_containers.html]($DOCS_URL/tutorials/ui/gui_containers.html)
 *
 * [godot.CenterContainer] is a container that keeps all of its child controls in its center at their minimum size.
 */
@GodotBaseType
public open class CenterContainer : Container() {
  /**
   * If `true`, centers children relative to the [godot.CenterContainer]'s top left corner.
   */
  public var useTopLeft: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CENTERCONTAINER_IS_USING_TOP_LEFT,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CENTERCONTAINER_SET_USE_TOP_LEFT,
          NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CENTERCONTAINER, scriptIndex)
    return true
  }

  public companion object
}
