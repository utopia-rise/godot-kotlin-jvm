// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedInt32Array
import godot.core.PackedVector2Array
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A node that has methods to draw outlines or use indices of vertices to create navigation polygons.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/117](https://godotengine.org/asset-library/asset/117)
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
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_GET_VERTICES,
          PACKED_VECTOR2_ARRAY)
      return TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_SET_VERTICES,
          NIL)
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
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_ADD_POLYGON, NIL)
  }

  /**
   * Returns the count of all polygons.
   */
  public fun getPolygonCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_GET_POLYGON_COUNT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns a [godot.PackedInt32Array] containing the indices of the vertices of a created polygon.
   */
  public fun getPolygon(idx: Long): PackedInt32Array {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_GET_POLYGON,
        PACKED_INT_32_ARRAY)
    return TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array
  }

  /**
   * Clears the array of polygons, but it doesn't clear the array of outlines and vertices.
   */
  public fun clearPolygons(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_CLEAR_POLYGONS,
        NIL)
  }

  /**
   * Returns the [godot.NavigationMesh] resulting from this navigation polygon. This navigation mesh can be used to update the navigation mesh of a region with the [godot.NavigationServer3D.regionSetNavigationMesh] API directly (as 2D uses the 3D server behind the scene).
   */
  public fun getNavigationMesh(): NavigationMesh? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_GET_NAVIGATION_MESH, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as NavigationMesh?
  }

  /**
   * Appends a [godot.PackedVector2Array] that contains the vertices of an outline to the internal array that contains all the outlines. You have to call [makePolygonsFromOutlines] in order for this array to be converted to polygons that the engine will use.
   */
  public fun addOutline(outline: PackedVector2Array): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to outline)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_ADD_OUTLINE, NIL)
  }

  /**
   * Adds a [godot.PackedVector2Array] that contains the vertices of an outline to the internal array that contains all the outlines at a fixed position. You have to call [makePolygonsFromOutlines] in order for this array to be converted to polygons that the engine will use.
   */
  public fun addOutlineAtIndex(outline: PackedVector2Array, index: Long): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to outline, LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_ADD_OUTLINE_AT_INDEX, NIL)
  }

  /**
   * Returns the number of outlines that were created in the editor or by script.
   */
  public fun getOutlineCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_GET_OUTLINE_COUNT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Changes an outline created in the editor or by script. You have to call [makePolygonsFromOutlines] for the polygons to update.
   */
  public fun setOutline(idx: Long, outline: PackedVector2Array): Unit {
    TransferContext.writeArguments(LONG to idx, PACKED_VECTOR2_ARRAY to outline)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_SET_OUTLINE, NIL)
  }

  /**
   * Returns a [godot.PackedVector2Array] containing the vertices of an outline that was created in the editor or by script.
   */
  public fun getOutline(idx: Long): PackedVector2Array {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_GET_OUTLINE,
        PACKED_VECTOR2_ARRAY)
    return TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array
  }

  /**
   * Removes an outline created in the editor or by script. You have to call [makePolygonsFromOutlines] for the polygons to update.
   */
  public fun removeOutline(idx: Long): Unit {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_REMOVE_OUTLINE,
        NIL)
  }

  /**
   * Clears the array of the outlines, but it doesn't clear the vertices and the polygons that were created by them.
   */
  public fun clearOutlines(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_CLEAR_OUTLINES,
        NIL)
  }

  /**
   * Creates polygons from the outlines added in the editor or by script.
   */
  public fun makePolygonsFromOutlines(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_MAKE_POLYGONS_FROM_OUTLINES, NIL)
  }

  public companion object
}
