// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
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

/**
 * A node that has methods to draw outlines or use indices of vertices to create navigation polygons.
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
 * 		var indices = PoolIntArray(0, 3, 1)
 * 		polygon.add_polygon(indices)
 * 		$NavigationPolygonInstance.navpoly = polygon
 * 		```
 */
@GodotBaseType
open class NavigationPolygon : Resource() {
  open var vertices: PoolVector2Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_GET_VERTICES,
          POOL_VECTOR2_ARRAY)
      return TransferContext.readReturnValue(POOL_VECTOR2_ARRAY, false) as PoolVector2Array
    }
    set(value) {
      TransferContext.writeArguments(POOL_VECTOR2_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_SET_VERTICES,
          NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_NAVIGATIONPOLYGON)
  }

  open fun _getOutlines(): VariantArray<Any?> {
    throw NotImplementedError("_get_outlines is not implemented for NavigationPolygon")
  }

  open fun _getPolygons(): VariantArray<Any?> {
    throw NotImplementedError("_get_polygons is not implemented for NavigationPolygon")
  }

  open fun _setOutlines(outlines: VariantArray<Any?>) {
  }

  open fun _setPolygons(polygons: VariantArray<Any?>) {
  }

  /**
   * Appends a [godot.core.PoolVector2Array] that contains the vertices of an outline to the internal array that contains all the outlines. You have to call [makePolygonsFromOutlines] in order for this array to be converted to polygons that the engine will use.
   */
  open fun addOutline(outline: PoolVector2Array) {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to outline)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_ADD_OUTLINE, NIL)
  }

  /**
   * Adds a [godot.core.PoolVector2Array] that contains the vertices of an outline to the internal array that contains all the outlines at a fixed position. You have to call [makePolygonsFromOutlines] in order for this array to be converted to polygons that the engine will use.
   */
  open fun addOutlineAtIndex(outline: PoolVector2Array, index: Long) {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to outline, LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_ADD_OUTLINE_AT_INDEX, NIL)
  }

  /**
   * Adds a polygon using the indices of the vertices you get when calling [getVertices].
   */
  open fun addPolygon(polygon: PoolIntArray) {
    TransferContext.writeArguments(POOL_INT_ARRAY to polygon)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_ADD_POLYGON, NIL)
  }

  /**
   * Clears the array of the outlines, but it doesn't clear the vertices and the polygons that were created by them.
   */
  open fun clearOutlines() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_CLEAR_OUTLINES,
        NIL)
  }

  /**
   * Clears the array of polygons, but it doesn't clear the array of outlines and vertices.
   */
  open fun clearPolygons() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_CLEAR_POLYGONS,
        NIL)
  }

  /**
   * Returns a [godot.core.PoolVector2Array] containing the vertices of an outline that was created in the editor or by script.
   */
  open fun getOutline(idx: Long): PoolVector2Array {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_GET_OUTLINE,
        POOL_VECTOR2_ARRAY)
    return TransferContext.readReturnValue(POOL_VECTOR2_ARRAY, false) as PoolVector2Array
  }

  /**
   * Returns the number of outlines that were created in the editor or by script.
   */
  open fun getOutlineCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_GET_OUTLINE_COUNT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns a [godot.core.PoolIntArray] containing the indices of the vertices of a created polygon.
   */
  open fun getPolygon(idx: Long): PoolIntArray {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_GET_POLYGON,
        POOL_INT_ARRAY)
    return TransferContext.readReturnValue(POOL_INT_ARRAY, false) as PoolIntArray
  }

  /**
   * Returns the count of all polygons.
   */
  open fun getPolygonCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_GET_POLYGON_COUNT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Creates polygons from the outlines added in the editor or by script.
   */
  open fun makePolygonsFromOutlines() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_MAKE_POLYGONS_FROM_OUTLINES, NIL)
  }

  /**
   * Removes an outline created in the editor or by script. You have to call [makePolygonsFromOutlines] for the polygons to update.
   */
  open fun removeOutline(idx: Long) {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_REMOVE_OUTLINE,
        NIL)
  }

  /**
   * Changes an outline created in the editor or by script. You have to call [makePolygonsFromOutlines] for the polygons to update.
   */
  open fun setOutline(idx: Long, outline: PoolVector2Array) {
    TransferContext.writeArguments(LONG to idx, POOL_VECTOR2_ARRAY to outline)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_SET_OUTLINE, NIL)
  }
}
