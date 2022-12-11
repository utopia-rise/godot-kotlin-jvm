// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Grid container used to arrange Control-derived children in a grid like layout.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/677](https://godotengine.org/asset-library/asset/677)
 *
 * GridContainer will arrange its Control-derived children in a grid like structure, the grid columns are specified using the [columns] property and the number of rows will be equal to the number of children in the container divided by the number of columns. For example, if the container has 5 children, and 2 columns, there will be 3 rows in the container.
 *
 * Notice that grid layout will preserve the columns and rows for every size of the container, and that empty columns will be expanded automatically.
 *
 * **Note:** GridContainer only works with child nodes inheriting from Control. It won't rearrange child nodes inheriting from Node2D.
 */
@GodotBaseType
public open class GridContainer : Container() {
  /**
   * The number of columns in the [godot.GridContainer]. If modified, [godot.GridContainer] reorders its Control-derived children to accommodate the new layout.
   */
  public var columns: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDCONTAINER_GET_COLUMNS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDCONTAINER_SET_COLUMNS, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GRIDCONTAINER, scriptIndex)
    return true
  }

  public companion object
}
