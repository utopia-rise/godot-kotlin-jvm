// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Long
import kotlin.Suppress

/**
 * Grid container used to arrange Control-derived children in a grid like layout.
 *
 * GridContainer will arrange its Control-derived children in a grid like structure, the grid columns are specified using the [columns] property and the number of rows will be equal to the number of children in the container divided by the number of columns. For example, if the container has 5 children, and 2 columns, there will be 3 rows in the container.
 *
 * Notice that grid layout will preserve the columns and rows for every size of the container, and that empty columns will be expanded automatically.
 *
 * **Note:** GridContainer only works with child nodes inheriting from Control. It won't rearrange child nodes inheriting from Node2D.
 */
@GodotBaseType
open class GridContainer : Container() {
  /**
   * The number of columns in the [godot.GridContainer]. If modified, [godot.GridContainer] reorders its Control-derived children to accommodate the new layout.
   */
  open var columns: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDCONTAINER_GET_COLUMNS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDCONTAINER_SET_COLUMNS, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_GRIDCONTAINER)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }
}
