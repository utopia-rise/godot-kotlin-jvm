// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINECLASS_GRIDCONTAINER: Int = 289

/**
 * [GridContainer] arranges its child controls in a grid layout. The number of columns is specified
 * by the [columns] property, whereas the number of rows depends on how many are needed for the child
 * controls. The number of rows and columns is preserved for every size of the container.
 * **Note:** [GridContainer] only works with child nodes inheriting from [Control]. It won't
 * rearrange child nodes inheriting from [Node2D].
 */
@GodotBaseType
public open class GridContainer : Container() {
  /**
   * The number of columns in the [GridContainer]. If modified, [GridContainer] reorders its
   * Control-derived children to accommodate the new layout.
   */
  public final inline var columns: Int
    @JvmName("columnsProperty")
    get() = getColumns()
    @JvmName("columnsProperty")
    set(`value`) {
      setColumns(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_GRIDCONTAINER, scriptIndex)
  }

  public final fun setColumns(columns: Int): Unit {
    TransferContext.writeArguments(LONG to columns.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setColumnsPtr, NIL)
  }

  public final fun getColumns(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getColumnsPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public companion object

  public object MethodBindings {
    internal val setColumnsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridContainer", "set_columns", 1286410249)

    internal val getColumnsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridContainer", "get_columns", 3905245786)
  }
}
