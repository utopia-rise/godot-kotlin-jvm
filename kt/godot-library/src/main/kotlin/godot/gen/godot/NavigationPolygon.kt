// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PoolIntArray
import godot.core.PoolVector2Array
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.POOL_INT_ARRAY
import godot.core.VariantType.POOL_VECTOR2_ARRAY
import kotlin.Any
import kotlin.Long
import kotlin.NotImplementedError
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
 * ```
 * 		var polygon = NavigationPolygon.new()
 * 		var outline = PoolVector2Array([godot.Vector2(0, 0), Vector2(0, 50), Vector2(50, 50), Vector2(50, 0)])
 * 		polygon.add_outline(outline)
 * 		polygon.make_polygons_from_outlines()
 * 		$NavigationPolygonInstance.navpoly = polygon
 * 		```
 *
 * Using [addPolygon] and indices of the vertices array.
 *
 * ```
 * 		var polygon = NavigationPolygon.new()
 * 		var vertices = PoolVector2Array([godot.Vector2(0, 0), Vector2(0, 50), Vector2(50, 50), Vector2(50, 0)])
 * 		polygon.set_vertices(vertices)
 * 		var indices = PoolIntArray([0, 1, 2, 3])
 * 		polygon.add_polygon(indices)
 * 		$NavigationPolygonInstance.navpoly = polygon
 * 		```
 */
@GodotBaseType
public open class NavigationPolygon : Resource() {
  public open var vertices: PoolVector2Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_GET_VERTICES,
          POOL_VECTOR2_ARRAY)
      return TransferContext.readReturnValue(POOL_VECTOR2_ARRAY, false) as PoolVector2Array
    }
    set(`value`) {
      TransferContext.writeArguments(POOL_VECTOR2_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_SET_VERTICES,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_NAVIGATIONPOLYGON)
  }

  public open fun _getOutlines(): VariantArray<Any?> {
    throw NotImplementedError("_get_outlines is not implemented for NavigationPolygon")
  }

  public open fun _getPolygons(): VariantArray<Any?> {
    throw NotImplementedError("_get_polygons is not implemented for NavigationPolygon")
  }

  public open fun _setOutlines(outlines: VariantArray<Any?>): Unit {
  }

  public open fun _setPolygons(polygons: VariantArray<Any?>): Unit {
  }

  /**
   * Appends a [godot.core.PoolVector2Array] that contains the vertices of an outline to the internal array that contains all the outlines. You have to call [makePolygonsFromOutlines] in order for this array to be converted to polygons that the engine will use.
   */
  public open fun addOutline(outline: PoolVector2Array): Unit {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to outline)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_ADD_OUTLINE, NIL)
  }

  /**
   * Adds a [godot.core.PoolVector2Array] that contains the vertices of an outline to the internal array that contains all the outlines at a fixed position. You have to call [makePolygonsFromOutlines] in order for this array to be converted to polygons that the engine will use.
   */
  public open fun addOutlineAtIndex(outline: PoolVector2Array, index: Long): Unit {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to outline, LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_ADD_OUTLINE_AT_INDEX, NIL)
  }

  /**
   * Adds a polygon using the indices of the vertices you get when calling [getVertices].
   */
  public open fun addPolygon(polygon: PoolIntArray): Unit {
    TransferContext.writeArguments(POOL_INT_ARRAY to polygon)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_ADD_POLYGON, NIL)
  }

  /**
   * Clears the array of the outlines, but it doesn't clear the vertices and the polygons that were created by them.
   */
  public open fun clearOutlines(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_CLEAR_OUTLINES,
        NIL)
  }

  /**
   * Clears the array of polygons, but it doesn't clear the array of outlines and vertices.
   */
  public open fun clearPolygons(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_CLEAR_POLYGONS,
        NIL)
  }

  /**
   * Returns a [godot.core.PoolVector2Array] containing the vertices of an outline that was created in the editor or by script.
   */
  public open fun getOutline(idx: Long): PoolVector2Array {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_GET_OUTLINE,
        POOL_VECTOR2_ARRAY)
    return TransferContext.readReturnValue(POOL_VECTOR2_ARRAY, false) as PoolVector2Array
  }

  /**
   * Returns the number of outlines that were created in the editor or by script.
   */
  public open fun getOutlineCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_GET_OUTLINE_COUNT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns a [godot.core.PoolIntArray] containing the indices of the vertices of a created polygon.
   */
  public open fun getPolygon(idx: Long): PoolIntArray {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_GET_POLYGON,
        POOL_INT_ARRAY)
    return TransferContext.readReturnValue(POOL_INT_ARRAY, false) as PoolIntArray
  }

  /**
   * Returns the count of all polygons.
   */
  public open fun getPolygonCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_GET_POLYGON_COUNT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Creates polygons from the outlines added in the editor or by script.
   */
  public open fun makePolygonsFromOutlines(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_MAKE_POLYGONS_FROM_OUTLINES, NIL)
  }

  /**
   * Removes an outline created in the editor or by script. You have to call [makePolygonsFromOutlines] for the polygons to update.
   */
  public open fun removeOutline(idx: Long): Unit {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_REMOVE_OUTLINE,
        NIL)
  }

  /**
   * Changes an outline created in the editor or by script. You have to call [makePolygonsFromOutlines] for the polygons to update.
   */
  public open fun setOutline(idx: Long, outline: PoolVector2Array): Unit {
    TransferContext.writeArguments(LONG to idx, POOL_VECTOR2_ARRAY to outline)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_SET_OUTLINE, NIL)
  }
}
