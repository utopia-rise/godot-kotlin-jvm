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
import godot.core.PackedVector2Array
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_VECTOR2_ARRAY
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Container for parsed source geometry data used in navigation mesh baking.
 */
@GodotBaseType
public open class NavigationMeshSourceGeometryData2D : Resource() {
  public final inline var traversableOutlines: VariantArray<PackedVector2Array>
    @JvmName("traversableOutlinesProperty")
    get() = getTraversableOutlines()
    @JvmName("traversableOutlinesProperty")
    set(`value`) {
      setTraversableOutlines(value)
    }

  public final inline var obstructionOutlines: VariantArray<PackedVector2Array>
    @JvmName("obstructionOutlinesProperty")
    get() = getObstructionOutlines()
    @JvmName("obstructionOutlinesProperty")
    set(`value`) {
      setObstructionOutlines(value)
    }

  public final inline var projectedObstructions: VariantArray<Any?>
    @JvmName("projectedObstructionsProperty")
    get() = getProjectedObstructions()
    @JvmName("projectedObstructionsProperty")
    set(`value`) {
      setProjectedObstructions(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(393, scriptIndex)
  }

  /**
   * Clears the internal data.
   */
  public final fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearPtr, NIL)
  }

  /**
   * Returns `true` when parsed source geometry data exists.
   */
  public final fun hasData(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.hasDataPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets all the traversable area outlines arrays.
   */
  public final fun setTraversableOutlines(traversableOutlines: VariantArray<PackedVector2Array>):
      Unit {
    TransferContext.writeArguments(ARRAY to traversableOutlines)
    TransferContext.callMethod(ptr, MethodBindings.setTraversableOutlinesPtr, NIL)
  }

  /**
   * Returns all the traversable area outlines arrays.
   */
  public final fun getTraversableOutlines(): VariantArray<PackedVector2Array> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTraversableOutlinesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<PackedVector2Array>)
  }

  /**
   * Sets all the obstructed area outlines arrays.
   */
  public final fun setObstructionOutlines(obstructionOutlines: VariantArray<PackedVector2Array>):
      Unit {
    TransferContext.writeArguments(ARRAY to obstructionOutlines)
    TransferContext.callMethod(ptr, MethodBindings.setObstructionOutlinesPtr, NIL)
  }

  /**
   * Returns all the obstructed area outlines arrays.
   */
  public final fun getObstructionOutlines(): VariantArray<PackedVector2Array> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getObstructionOutlinesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<PackedVector2Array>)
  }

  /**
   * Appends another array of [traversableOutlines] at the end of the existing traversable outlines
   * array.
   */
  public final fun appendTraversableOutlines(traversableOutlines: VariantArray<PackedVector2Array>):
      Unit {
    TransferContext.writeArguments(ARRAY to traversableOutlines)
    TransferContext.callMethod(ptr, MethodBindings.appendTraversableOutlinesPtr, NIL)
  }

  /**
   * Appends another array of [obstructionOutlines] at the end of the existing obstruction outlines
   * array.
   */
  public final fun appendObstructionOutlines(obstructionOutlines: VariantArray<PackedVector2Array>):
      Unit {
    TransferContext.writeArguments(ARRAY to obstructionOutlines)
    TransferContext.callMethod(ptr, MethodBindings.appendObstructionOutlinesPtr, NIL)
  }

  /**
   * Adds the outline points of a shape as traversable area.
   */
  public final fun addTraversableOutline(shapeOutline: PackedVector2Array): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to shapeOutline)
    TransferContext.callMethod(ptr, MethodBindings.addTraversableOutlinePtr, NIL)
  }

  /**
   * Adds the outline points of a shape as obstructed area.
   */
  public final fun addObstructionOutline(shapeOutline: PackedVector2Array): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to shapeOutline)
    TransferContext.callMethod(ptr, MethodBindings.addObstructionOutlinePtr, NIL)
  }

  /**
   * Adds the geometry data of another [NavigationMeshSourceGeometryData2D] to the navigation mesh
   * baking data.
   */
  public final fun merge(otherGeometry: NavigationMeshSourceGeometryData2D?): Unit {
    TransferContext.writeArguments(OBJECT to otherGeometry)
    TransferContext.callMethod(ptr, MethodBindings.mergePtr, NIL)
  }

  /**
   * Adds a projected obstruction shape to the source geometry. If [carve] is `true` the carved
   * shape will not be affected by additional offsets (e.g. agent radius) of the navigation mesh baking
   * process.
   */
  public final fun addProjectedObstruction(vertices: PackedVector2Array, carve: Boolean): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to vertices, BOOL to carve)
    TransferContext.callMethod(ptr, MethodBindings.addProjectedObstructionPtr, NIL)
  }

  /**
   * Clears all projected obstructions.
   */
  public final fun clearProjectedObstructions(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearProjectedObstructionsPtr, NIL)
  }

  /**
   * Sets the projected obstructions with an Array of Dictionaries with the following key value
   * pairs:
   *
   * gdscript:
   * ```gdscript
   * "vertices" : PackedFloat32Array
   * "carve" : bool
   * ```
   */
  public final fun setProjectedObstructions(projectedObstructions: VariantArray<Any?>): Unit {
    TransferContext.writeArguments(ARRAY to projectedObstructions)
    TransferContext.callMethod(ptr, MethodBindings.setProjectedObstructionsPtr, NIL)
  }

  /**
   * Returns the projected obstructions as an [Array] of dictionaries. Each [Dictionary] contains
   * the following entries:
   * - `vertices` - A [PackedFloat32Array] that defines the outline points of the projected shape.
   * - `carve` - A [bool] that defines how the projected shape affects the navigation mesh baking.
   * If `true` the projected shape will not be affected by addition offsets, e.g. agent radius.
   */
  public final fun getProjectedObstructions(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getProjectedObstructionsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  public companion object

  public object MethodBindings {
    internal val clearPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "clear", 3218959716)

    internal val hasDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "has_data", 2240911060)

    internal val setTraversableOutlinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "set_traversable_outlines", 381264803)

    internal val getTraversableOutlinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "get_traversable_outlines", 3995934104)

    internal val setObstructionOutlinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "set_obstruction_outlines", 381264803)

    internal val getObstructionOutlinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "get_obstruction_outlines", 3995934104)

    internal val appendTraversableOutlinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "append_traversable_outlines", 381264803)

    internal val appendObstructionOutlinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "append_obstruction_outlines", 381264803)

    internal val addTraversableOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "add_traversable_outline", 1509147220)

    internal val addObstructionOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "add_obstruction_outline", 1509147220)

    internal val mergePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "merge", 742424872)

    internal val addProjectedObstructionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "add_projected_obstruction", 3882407395)

    internal val clearProjectedObstructionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "clear_projected_obstructions", 3218959716)

    internal val setProjectedObstructionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "set_projected_obstructions", 381264803)

    internal val getProjectedObstructionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "get_projected_obstructions", 3995934104)
  }
}
