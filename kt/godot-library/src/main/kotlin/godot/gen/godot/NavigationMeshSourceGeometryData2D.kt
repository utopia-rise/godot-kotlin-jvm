// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedVector2Array
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * Container for parsed source geometry data used in navigation mesh baking.
 */
@GodotBaseType
public open class NavigationMeshSourceGeometryData2D : Resource() {
  public var traversableOutlines: VariantArray<PackedVector2Array>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTraversableOutlinesPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<PackedVector2Array>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTraversableOutlinesPtr, NIL)
    }

  public var obstructionOutlines: VariantArray<PackedVector2Array>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getObstructionOutlinesPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<PackedVector2Array>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setObstructionOutlinesPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_NAVIGATIONMESHSOURCEGEOMETRYDATA2D, scriptIndex)
    return true
  }

  /**
   * Clears the internal data.
   */
  public fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  /**
   * Returns `true` when parsed source geometry data exists.
   */
  public fun hasData(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasDataPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Adds the outline points of a shape as traversable area.
   */
  public fun addTraversableOutline(shapeOutline: PackedVector2Array): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to shapeOutline)
    TransferContext.callMethod(rawPtr, MethodBindings.addTraversableOutlinePtr, NIL)
  }

  /**
   * Adds the outline points of a shape as obstructed area.
   */
  public fun addObstructionOutline(shapeOutline: PackedVector2Array): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to shapeOutline)
    TransferContext.callMethod(rawPtr, MethodBindings.addObstructionOutlinePtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val clearPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "clear")

    public val hasDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "has_data")

    public val setTraversableOutlinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "set_traversable_outlines")

    public val getTraversableOutlinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "get_traversable_outlines")

    public val setObstructionOutlinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "set_obstruction_outlines")

    public val getObstructionOutlinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "get_obstruction_outlines")

    public val addTraversableOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "add_traversable_outline")

    public val addObstructionOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "add_obstruction_outline")
  }
}
