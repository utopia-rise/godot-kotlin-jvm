// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedVector2Array
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_VECTOR2_ARRAY
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_NAVIGATIONMESHSOURCEGEOMETRYDATA2D_INDEX: Int = 393

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
    Internals.callConstructor(this, ENGINE_CLASS_NAVIGATIONMESHSOURCEGEOMETRYDATA2D_INDEX,
        scriptIndex)
  }

  /**
   * Clears the internal data.
   */
  public final fun clear(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  /**
   * Returns `true` when parsed source geometry data exists.
   */
  public final fun hasData(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.hasDataPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets all the traversable area outlines arrays.
   */
  public final fun setTraversableOutlines(traversableOutlines: VariantArray<PackedVector2Array>):
      Unit {
    Internals.writeArguments(ARRAY to traversableOutlines)
    Internals.callMethod(rawPtr, MethodBindings.setTraversableOutlinesPtr, NIL)
  }

  /**
   * Returns all the traversable area outlines arrays.
   */
  public final fun getTraversableOutlines(): VariantArray<PackedVector2Array> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTraversableOutlinesPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<PackedVector2Array>)
  }

  /**
   * Sets all the obstructed area outlines arrays.
   */
  public final fun setObstructionOutlines(obstructionOutlines: VariantArray<PackedVector2Array>):
      Unit {
    Internals.writeArguments(ARRAY to obstructionOutlines)
    Internals.callMethod(rawPtr, MethodBindings.setObstructionOutlinesPtr, NIL)
  }

  /**
   * Returns all the obstructed area outlines arrays.
   */
  public final fun getObstructionOutlines(): VariantArray<PackedVector2Array> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getObstructionOutlinesPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<PackedVector2Array>)
  }

  /**
   * Appends another array of [traversableOutlines] at the end of the existing traversable outlines
   * array.
   */
  public final fun appendTraversableOutlines(traversableOutlines: VariantArray<PackedVector2Array>):
      Unit {
    Internals.writeArguments(ARRAY to traversableOutlines)
    Internals.callMethod(rawPtr, MethodBindings.appendTraversableOutlinesPtr, NIL)
  }

  /**
   * Appends another array of [obstructionOutlines] at the end of the existing obstruction outlines
   * array.
   */
  public final fun appendObstructionOutlines(obstructionOutlines: VariantArray<PackedVector2Array>):
      Unit {
    Internals.writeArguments(ARRAY to obstructionOutlines)
    Internals.callMethod(rawPtr, MethodBindings.appendObstructionOutlinesPtr, NIL)
  }

  /**
   * Adds the outline points of a shape as traversable area.
   */
  public final fun addTraversableOutline(shapeOutline: PackedVector2Array): Unit {
    Internals.writeArguments(PACKED_VECTOR2_ARRAY to shapeOutline)
    Internals.callMethod(rawPtr, MethodBindings.addTraversableOutlinePtr, NIL)
  }

  /**
   * Adds the outline points of a shape as obstructed area.
   */
  public final fun addObstructionOutline(shapeOutline: PackedVector2Array): Unit {
    Internals.writeArguments(PACKED_VECTOR2_ARRAY to shapeOutline)
    Internals.callMethod(rawPtr, MethodBindings.addObstructionOutlinePtr, NIL)
  }

  /**
   * Adds the geometry data of another [NavigationMeshSourceGeometryData2D] to the navigation mesh
   * baking data.
   */
  public final fun merge(otherGeometry: NavigationMeshSourceGeometryData2D?): Unit {
    Internals.writeArguments(OBJECT to otherGeometry)
    Internals.callMethod(rawPtr, MethodBindings.mergePtr, NIL)
  }

  /**
   * Adds a projected obstruction shape to the source geometry. If [carve] is `true` the carved
   * shape will not be affected by additional offsets (e.g. agent radius) of the navigation mesh baking
   * process.
   */
  public final fun addProjectedObstruction(vertices: PackedVector2Array, carve: Boolean): Unit {
    Internals.writeArguments(PACKED_VECTOR2_ARRAY to vertices, BOOL to carve)
    Internals.callMethod(rawPtr, MethodBindings.addProjectedObstructionPtr, NIL)
  }

  /**
   * Clears all projected obstructions.
   */
  public final fun clearProjectedObstructions(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.clearProjectedObstructionsPtr, NIL)
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
    Internals.writeArguments(ARRAY to projectedObstructions)
    Internals.callMethod(rawPtr, MethodBindings.setProjectedObstructionsPtr, NIL)
  }

  /**
   * Returns the projected obstructions as an [Array] of dictionaries. Each [Dictionary] contains
   * the following entries:
   * - `vertices` - A [PackedFloat32Array] that defines the outline points of the projected shape.
   * - `carve` - A [bool] that defines how the projected shape affects the navigation mesh baking.
   * If `true` the projected shape will not be affected by addition offsets, e.g. agent radius.
   */
  public final fun getProjectedObstructions(): VariantArray<Any?> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getProjectedObstructionsPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  public companion object

  internal object MethodBindings {
    public val clearPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "clear", 3218959716)

    public val hasDataPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "has_data", 2240911060)

    public val setTraversableOutlinesPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "set_traversable_outlines", 381264803)

    public val getTraversableOutlinesPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "get_traversable_outlines", 3995934104)

    public val setObstructionOutlinesPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "set_obstruction_outlines", 381264803)

    public val getObstructionOutlinesPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "get_obstruction_outlines", 3995934104)

    public val appendTraversableOutlinesPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "append_traversable_outlines", 381264803)

    public val appendObstructionOutlinesPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "append_obstruction_outlines", 381264803)

    public val addTraversableOutlinePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "add_traversable_outline", 1509147220)

    public val addObstructionOutlinePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "add_obstruction_outline", 1509147220)

    public val mergePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "merge", 742424872)

    public val addProjectedObstructionPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "add_projected_obstruction", 3882407395)

    public val clearProjectedObstructionsPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "clear_projected_obstructions", 3218959716)

    public val setProjectedObstructionsPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "set_projected_obstructions", 381264803)

    public val getProjectedObstructionsPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "get_projected_obstructions", 3995934104)
  }
}
