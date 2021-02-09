// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

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
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress

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

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_NAVIGATIONPOLYGON)

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

  open fun addOutline(outline: PoolVector2Array) {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to outline)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_ADD_OUTLINE, NIL)
  }

  open fun addOutlineAtIndex(outline: PoolVector2Array, index: Long) {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to outline, LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_ADD_OUTLINE_AT_INDEX, NIL)
  }

  open fun addPolygon(polygon: PoolIntArray) {
    TransferContext.writeArguments(POOL_INT_ARRAY to polygon)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_ADD_POLYGON, NIL)
  }

  open fun clearOutlines() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_CLEAR_OUTLINES,
        NIL)
  }

  open fun clearPolygons() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_CLEAR_POLYGONS,
        NIL)
  }

  open fun getOutline(idx: Long): PoolVector2Array {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_GET_OUTLINE,
        POOL_VECTOR2_ARRAY)
    return TransferContext.readReturnValue(POOL_VECTOR2_ARRAY, false) as PoolVector2Array
  }

  open fun getOutlineCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_GET_OUTLINE_COUNT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getPolygon(idx: Long): PoolIntArray {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_GET_POLYGON,
        POOL_INT_ARRAY)
    return TransferContext.readReturnValue(POOL_INT_ARRAY, false) as PoolIntArray
  }

  open fun getPolygonCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_GET_POLYGON_COUNT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun makePolygonsFromOutlines() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_MAKE_POLYGONS_FROM_OUTLINES, NIL)
  }

  open fun removeOutline(idx: Long) {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_REMOVE_OUTLINE,
        NIL)
  }

  open fun setOutline(idx: Long, outline: PoolVector2Array) {
    TransferContext.writeArguments(LONG to idx, POOL_VECTOR2_ARRAY to outline)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGON_SET_OUTLINE, NIL)
  }
}
