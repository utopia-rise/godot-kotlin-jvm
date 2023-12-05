// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedInt32Array
import godot.core.PackedVector2Array
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A navigation polygon that defines traversable areas and obstacles.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/navigation/navigation_using_navigationmeshes.html]($DOCS_URL/tutorials/navigation/navigation_using_navigationmeshes.html)
 *
 * There are two ways to create polygons. Either by using the [addOutline] method, or using the [addPolygon] method.
 *
 * Using [addOutline]:
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * var polygon = NavigationPolygon.new()
 *
 * var outline = PackedVector2Array([godot.Vector2(0, 0), Vector2(0, 50), Vector2(50, 50), Vector2(50, 0)])
 *
 * polygon.add_outline(outline)
 *
 * polygon.make_polygons_from_outlines()
 *
 * $NavigationRegion2D.navigation_polygon = polygon
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * var polygon = new NavigationPolygon();
 *
 * var outline = new Vector2[] { new Vector2(0, 0), new Vector2(0, 50), new Vector2(50, 50), new Vector2(50, 0) };
 *
 * polygon.AddOutline(outline);
 *
 * polygon.MakePolygonsFromOutlines();
 *
 * GetNode<NavigationRegion2D>("NavigationRegion2D").NavigationPolygon = polygon;
 *
 * [/csharp]
 *
 * [/codeblocks]
 *
 * Using [addPolygon] and indices of the vertices array.
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * var polygon = NavigationPolygon.new()
 *
 * var vertices = PackedVector2Array([godot.Vector2(0, 0), Vector2(0, 50), Vector2(50, 50), Vector2(50, 0)])
 *
 * polygon.vertices = vertices
 *
 * var indices = PackedInt32Array([0, 1, 2, 3])
 *
 * polygon.add_polygon(indices)
 *
 * $NavigationRegion2D.navigation_polygon = polygon
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * var polygon = new NavigationPolygon();
 *
 * var vertices = new Vector2[] { new Vector2(0, 0), new Vector2(0, 50), new Vector2(50, 50), new Vector2(50, 0) };
 *
 * polygon.Vertices = vertices;
 *
 * var indices = new int[] { 0, 1, 2, 3 };
 *
 * polygon.AddPolygon(indices);
 *
 * GetNode<NavigationRegion2D>("NavigationRegion2D").NavigationPolygon = polygon;
 *
 * [/csharp]
 *
 * [/codeblocks]
 */
@GodotBaseType
public open class NavigationPolygon : Resource() {
  public var vertices: PackedVector2Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVerticesPtr, PACKED_VECTOR2_ARRAY)
      return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVerticesPtr, NIL)
    }

  /**
   * The cell size used to rasterize the navigation mesh vertices. Must match with the cell size on the navigation map.
   */
  public var cellSize: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCellSizePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setCellSizePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_NAVIGATIONPOLYGON, scriptIndex)
    return true
  }

  /**
   * Adds a polygon using the indices of the vertices you get when calling [getVertices].
   */
  public fun addPolygon(polygon: PackedInt32Array): Unit {
    TransferContext.writeArguments(PACKED_INT_32_ARRAY to polygon)
    TransferContext.callMethod(rawPtr, MethodBindings.addPolygonPtr, NIL)
  }

  /**
   * Returns the count of all polygons.
   */
  public fun getPolygonCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPolygonCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns a [godot.PackedInt32Array] containing the indices of the vertices of a created polygon.
   */
  public fun getPolygon(idx: Int): PackedInt32Array {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPolygonPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  /**
   * Clears the array of polygons, but it doesn't clear the array of outlines and vertices.
   */
  public fun clearPolygons(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPolygonsPtr, NIL)
  }

  /**
   * Returns the [godot.NavigationMesh] resulting from this navigation polygon. This navigation mesh can be used to update the navigation mesh of a region with the [godot.NavigationServer3D.regionSetNavigationMesh] API directly (as 2D uses the 3D server behind the scene).
   */
  public fun getNavigationMesh(): NavigationMesh? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNavigationMeshPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as NavigationMesh?)
  }

  /**
   * Appends a [godot.PackedVector2Array] that contains the vertices of an outline to the internal array that contains all the outlines. You have to call [makePolygonsFromOutlines] in order for this array to be converted to polygons that the engine will use.
   */
  public fun addOutline(outline: PackedVector2Array): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to outline)
    TransferContext.callMethod(rawPtr, MethodBindings.addOutlinePtr, NIL)
  }

  /**
   * Adds a [godot.PackedVector2Array] that contains the vertices of an outline to the internal array that contains all the outlines at a fixed position. You have to call [makePolygonsFromOutlines] in order for this array to be converted to polygons that the engine will use.
   */
  public fun addOutlineAtIndex(outline: PackedVector2Array, index: Int): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to outline, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addOutlineAtIndexPtr, NIL)
  }

  /**
   * Returns the number of outlines that were created in the editor or by script.
   */
  public fun getOutlineCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOutlineCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Changes an outline created in the editor or by script. You have to call [makePolygonsFromOutlines] for the polygons to update.
   */
  public fun setOutline(idx: Int, outline: PackedVector2Array): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), PACKED_VECTOR2_ARRAY to outline)
    TransferContext.callMethod(rawPtr, MethodBindings.setOutlinePtr, NIL)
  }

  /**
   * Returns a [godot.PackedVector2Array] containing the vertices of an outline that was created in the editor or by script.
   */
  public fun getOutline(idx: Int): PackedVector2Array {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getOutlinePtr, PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
  }

  /**
   * Removes an outline created in the editor or by script. You have to call [makePolygonsFromOutlines] for the polygons to update.
   */
  public fun removeOutline(idx: Int): Unit {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeOutlinePtr, NIL)
  }

  /**
   * Clears the array of the outlines, but it doesn't clear the vertices and the polygons that were created by them.
   */
  public fun clearOutlines(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearOutlinesPtr, NIL)
  }

  /**
   * Creates polygons from the outlines added in the editor or by script.
   */
  public fun makePolygonsFromOutlines(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.makePolygonsFromOutlinesPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val setVerticesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "set_vertices")

    public val getVerticesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_vertices")

    public val addPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "add_polygon")

    public val getPolygonCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_polygon_count")

    public val getPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_polygon")

    public val clearPolygonsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "clear_polygons")

    public val getNavigationMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_navigation_mesh")

    public val addOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "add_outline")

    public val addOutlineAtIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "add_outline_at_index")

    public val getOutlineCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_outline_count")

    public val setOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "set_outline")

    public val getOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_outline")

    public val removeOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "remove_outline")

    public val clearOutlinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "clear_outlines")

    public val makePolygonsFromOutlinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "make_polygons_from_outlines")

    public val setCellSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "set_cell_size")

    public val getCellSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_cell_size")
  }
}
