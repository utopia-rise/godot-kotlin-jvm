// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * A container that arranges its child controls in a grid layout.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/677](https://godotengine.org/asset-library/asset/677)
 *
 * [godot.GridContainer] arranges its child controls in a grid layout. The number of columns is specified by the [columns] property, whereas the number of rows depends on how many are needed for the child controls. The number of rows and columns is preserved for every size of the container.
 *
 * **Note:** [godot.GridContainer] only works with child nodes inheriting from [godot.Control]. It won't rearrange child nodes inheriting from [godot.Node2D].
 */
@GodotBaseType
public open class GridContainer : Container() {
  /**
   * The number of columns in the [godot.GridContainer]. If modified, [godot.GridContainer] reorders its Control-derived children to accommodate the new layout.
   */
  public var columns: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getColumnsPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setColumnsPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GRIDCONTAINER, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setColumnsPtr: VoidPtr = TypeManager.getMethodBindPtr("GridContainer", "set_columns")

    public val getColumnsPtr: VoidPtr = TypeManager.getMethodBindPtr("GridContainer", "get_columns")
  }
}
