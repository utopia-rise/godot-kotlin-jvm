// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import kotlin.Boolean
import kotlin.Suppress
import kotlin.Unit

/**
 * Keeps children controls centered.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/ui/gui_containers.html]($DOCS_URL/tutorials/ui/gui_containers.html)
 *
 * CenterContainer keeps children controls centered. This container keeps all children to their minimum size, in the center.
 */
@GodotBaseType
public open class CenterContainer : Container() {
  /**
   * If `true`, centers children relative to the [godot.CenterContainer]'s top left corner.
   */
  public open var useTopLeft: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CENTERCONTAINER_GET_USE_TOP_LEFT,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CENTERCONTAINER_SET_USE_TOP_LEFT,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_CENTERCONTAINER)
  }
}
