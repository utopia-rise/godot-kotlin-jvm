// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.RID
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR3
import godot.core.VariantType._RID
import godot.core.Vector3
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
open class GridMap : Spatial() {
  val cellSizeChanged: Signal1<Vector3> by signal("cell_size")

  open var cellCenterX: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_CELL_CENTER_X, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_CELL_CENTER_X, NIL)
    }

  open var cellCenterY: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_CELL_CENTER_Y, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_CELL_CENTER_Y, NIL)
    }

  open var cellCenterZ: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_CELL_CENTER_Z, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_CELL_CENTER_Z, NIL)
    }

  open var cellOctantSize: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_CELL_OCTANT_SIZE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_CELL_OCTANT_SIZE, NIL)
    }

  open var cellScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_CELL_SCALE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_CELL_SCALE, NIL)
    }

  open var cellSize: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_CELL_SIZE, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(value) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_CELL_SIZE, NIL)
    }

  open var collisionLayer: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_COLLISION_LAYER, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_COLLISION_LAYER, NIL)
    }

  open var collisionMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_COLLISION_MASK, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_COLLISION_MASK, NIL)
    }

  open var meshLibrary: MeshLibrary?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_MESH_LIBRARY, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as MeshLibrary?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_MESH_LIBRARY, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_GRIDMAP)
  }

  open fun cellSize(schedule: Vector3.() -> Unit): Vector3 = cellSize.apply{
      schedule(this)
      cellSize = this
  }


  open fun _updateOctantsCallback() {
  }

  open fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_CLEAR, NIL)
  }

  open fun clearBakedMeshes() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_CLEAR_BAKED_MESHES, NIL)
  }

  open fun getBakeMeshInstance(idx: Long): RID {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_BAKE_MESH_INSTANCE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  open fun getBakeMeshes(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_BAKE_MESHES, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  open fun getCellItem(
    x: Long,
    y: Long,
    z: Long
  ): Long {
    TransferContext.writeArguments(LONG to x, LONG to y, LONG to z)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_CELL_ITEM, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getCellItemOrientation(
    x: Long,
    y: Long,
    z: Long
  ): Long {
    TransferContext.writeArguments(LONG to x, LONG to y, LONG to z)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_CELL_ITEM_ORIENTATION,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getCollisionLayerBit(bit: Long): Boolean {
    TransferContext.writeArguments(LONG to bit)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_COLLISION_LAYER_BIT,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun getCollisionMaskBit(bit: Long): Boolean {
    TransferContext.writeArguments(LONG to bit)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_COLLISION_MASK_BIT,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun getMeshes(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_MESHES, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  open fun getUsedCells(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_USED_CELLS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  open fun makeBakedMeshes(genLightmapUv: Boolean = false, lightmapUvTexelSize: Double = 0.1) {
    TransferContext.writeArguments(BOOL to genLightmapUv, DOUBLE to lightmapUvTexelSize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_MAKE_BAKED_MESHES, NIL)
  }

  open fun mapToWorld(
    x: Long,
    y: Long,
    z: Long
  ): Vector3 {
    TransferContext.writeArguments(LONG to x, LONG to y, LONG to z)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_MAP_TO_WORLD, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  open fun resourceChanged(resource: Resource) {
    TransferContext.writeArguments(OBJECT to resource)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_RESOURCE_CHANGED, NIL)
  }

  open fun setCellItem(
    x: Long,
    y: Long,
    z: Long,
    item: Long,
    orientation: Long = 0
  ) {
    TransferContext.writeArguments(LONG to x, LONG to y, LONG to z, LONG to item, LONG to
        orientation)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_CELL_ITEM, NIL)
  }

  open fun setClip(
    enabled: Boolean,
    clipabove: Boolean = true,
    floor: Long = 0,
    axis: Long = 0
  ) {
    TransferContext.writeArguments(BOOL to enabled, BOOL to clipabove, LONG to floor, LONG to axis)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_CLIP, NIL)
  }

  open fun setCollisionLayerBit(bit: Long, value: Boolean) {
    TransferContext.writeArguments(LONG to bit, BOOL to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_COLLISION_LAYER_BIT,
        NIL)
  }

  open fun setCollisionMaskBit(bit: Long, value: Boolean) {
    TransferContext.writeArguments(LONG to bit, BOOL to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_COLLISION_MASK_BIT, NIL)
  }

  open fun worldToMap(pos: Vector3): Vector3 {
    TransferContext.writeArguments(VECTOR3 to pos)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_WORLD_TO_MAP, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  companion object {
    final const val INVALID_CELL_ITEM: Long = -1
  }
}
