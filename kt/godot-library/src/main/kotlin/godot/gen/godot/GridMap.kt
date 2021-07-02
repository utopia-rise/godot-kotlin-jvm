// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
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
public open class GridMap : Spatial() {
  public val cellSizeChanged: Signal1<Vector3> by signal("cell_size")

  public open var cellCenterX: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_CELL_CENTER_X, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_CELL_CENTER_X, NIL)
    }

  public open var cellCenterY: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_CELL_CENTER_Y, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_CELL_CENTER_Y, NIL)
    }

  public open var cellCenterZ: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_CELL_CENTER_Z, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_CELL_CENTER_Z, NIL)
    }

  public open var cellOctantSize: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_CELL_OCTANT_SIZE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_CELL_OCTANT_SIZE, NIL)
    }

  public open var cellScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_CELL_SCALE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_CELL_SCALE, NIL)
    }

  public open var cellSize: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_CELL_SIZE, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_CELL_SIZE, NIL)
    }

  public open var collisionLayer: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_COLLISION_LAYER, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_COLLISION_LAYER, NIL)
    }

  public open var collisionMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_COLLISION_MASK, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_COLLISION_MASK, NIL)
    }

  public open var meshLibrary: MeshLibrary?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_MESH_LIBRARY, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as MeshLibrary?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_MESH_LIBRARY, NIL)
    }

  public open var useInBakedLight: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_USE_IN_BAKED_LIGHT,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_USE_IN_BAKED_LIGHT,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_GRIDMAP)
  }

  @CoreTypeHelper
  public open fun cellSize(schedule: Vector3.() -> Unit): Vector3 = cellSize.apply{
      schedule(this)
      cellSize = this
  }


  public open fun _updateOctantsCallback(): Unit {
  }

  public open fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_CLEAR, NIL)
  }

  public open fun clearBakedMeshes(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_CLEAR_BAKED_MESHES, NIL)
  }

  public open fun getBakeMeshInstance(idx: Long): RID {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_BAKE_MESH_INSTANCE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  public open fun getBakeMeshes(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_BAKE_MESHES, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  public open fun getCellItem(
    x: Long,
    y: Long,
    z: Long
  ): Long {
    TransferContext.writeArguments(LONG to x, LONG to y, LONG to z)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_CELL_ITEM, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public open fun getCellItemOrientation(
    x: Long,
    y: Long,
    z: Long
  ): Long {
    TransferContext.writeArguments(LONG to x, LONG to y, LONG to z)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_CELL_ITEM_ORIENTATION,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public open fun getCollisionLayerBit(bit: Long): Boolean {
    TransferContext.writeArguments(LONG to bit)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_COLLISION_LAYER_BIT,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public open fun getCollisionMaskBit(bit: Long): Boolean {
    TransferContext.writeArguments(LONG to bit)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_COLLISION_MASK_BIT,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public open fun getMeshes(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_MESHES, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  public open fun getUsedCells(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_USED_CELLS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  public open fun makeBakedMeshes(genLightmapUv: Boolean = false, lightmapUvTexelSize: Double =
      0.1): Unit {
    TransferContext.writeArguments(BOOL to genLightmapUv, DOUBLE to lightmapUvTexelSize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_MAKE_BAKED_MESHES, NIL)
  }

  public open fun mapToWorld(
    x: Long,
    y: Long,
    z: Long
  ): Vector3 {
    TransferContext.writeArguments(LONG to x, LONG to y, LONG to z)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_MAP_TO_WORLD, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  public open fun resourceChanged(resource: Resource): Unit {
    TransferContext.writeArguments(OBJECT to resource)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_RESOURCE_CHANGED, NIL)
  }

  public open fun setCellItem(
    x: Long,
    y: Long,
    z: Long,
    item: Long,
    orientation: Long = 0
  ): Unit {
    TransferContext.writeArguments(LONG to x, LONG to y, LONG to z, LONG to item, LONG to
        orientation)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_CELL_ITEM, NIL)
  }

  public open fun setClip(
    enabled: Boolean,
    clipabove: Boolean = true,
    floor: Long = 0,
    axis: Long = 0
  ): Unit {
    TransferContext.writeArguments(BOOL to enabled, BOOL to clipabove, LONG to floor, LONG to axis)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_CLIP, NIL)
  }

  public open fun setCollisionLayerBit(bit: Long, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to bit, BOOL to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_COLLISION_LAYER_BIT,
        NIL)
  }

  public open fun setCollisionMaskBit(bit: Long, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to bit, BOOL to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_COLLISION_MASK_BIT, NIL)
  }

  public open fun worldToMap(pos: Vector3): Vector3 {
    TransferContext.writeArguments(VECTOR3 to pos)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_WORLD_TO_MAP, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  public companion object {
    public final const val INVALID_CELL_ITEM: Long = -1
  }
}
