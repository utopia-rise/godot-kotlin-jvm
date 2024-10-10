// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_GRIDCONTAINER_INDEX: Int = 269

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
    Internals.callConstructor(this, ENGINE_CLASS_GRIDCONTAINER_INDEX, scriptIndex)
  }

  public final fun setColumns(columns: Int): Unit {
    Internals.writeArguments(LONG to columns.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setColumnsPtr, NIL)
  }

  public final fun getColumns(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getColumnsPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public companion object

  internal object MethodBindings {
    public val setColumnsPtr: VoidPtr =
        Internals.getMethodBindPtr("GridContainer", "set_columns", 1286410249)

    public val getColumnsPtr: VoidPtr =
        Internals.getMethodBindPtr("GridContainer", "get_columns", 3905245786)
  }
}
