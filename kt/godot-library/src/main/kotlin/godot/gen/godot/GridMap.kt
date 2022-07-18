// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

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
import godot.core.VariantType.VECTOR3I
import godot.core.VariantType._RID
import godot.core.Vector3
import godot.core.Vector3i
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class GridMap : Node3D() {
  public val cellSizeChanged: Signal1<Vector3> by signal("cellSize")

  public var meshLibrary: MeshLibrary?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_MESH_LIBRARY,
          OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as MeshLibrary?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_MESH_LIBRARY, NIL.ordinal)
    }

  public var physicsMaterial: PhysicsMaterial?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_PHYSICS_MATERIAL,
          OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as PhysicsMaterial?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_PHYSICS_MATERIAL,
          NIL.ordinal)
    }

  public var cellSize: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_CELL_SIZE, VECTOR3.ordinal)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_CELL_SIZE, NIL.ordinal)
    }

  public var cellOctantSize: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_OCTANT_SIZE, LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_OCTANT_SIZE, NIL.ordinal)
    }

  public var cellCenterX: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_CENTER_X, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_CENTER_X, NIL.ordinal)
    }

  public var cellCenterY: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_CENTER_Y, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_CENTER_Y, NIL.ordinal)
    }

  public var cellCenterZ: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_CENTER_Z, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_CENTER_Z, NIL.ordinal)
    }

  public var cellScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_CELL_SCALE, DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_CELL_SCALE, NIL.ordinal)
    }

  public var collisionLayer: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_COLLISION_LAYER,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_COLLISION_LAYER,
          NIL.ordinal)
    }

  public var collisionMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_COLLISION_MASK,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_COLLISION_MASK,
          NIL.ordinal)
    }

  public var bakeNavigation: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_IS_BAKING_NAVIGATION,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_BAKE_NAVIGATION,
          NIL.ordinal)
    }

  public var navigationLayers: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_NAVIGATION_LAYERS,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_NAVIGATION_LAYERS,
          NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_GRIDMAP)
  }

  public fun setCollisionMaskValue(layerNumber: Long, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber, BOOL to value)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_COLLISION_MASK_VALUE,
        NIL.ordinal)
  }

  public fun getCollisionMaskValue(layerNumber: Long): Boolean {
    TransferContext.writeArguments(LONG to layerNumber)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_COLLISION_MASK_VALUE,
        BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public fun setCollisionLayerValue(layerNumber: Long, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber, BOOL to value)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_COLLISION_LAYER_VALUE,
        NIL.ordinal)
  }

  public fun getCollisionLayerValue(layerNumber: Long): Boolean {
    TransferContext.writeArguments(LONG to layerNumber)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_COLLISION_LAYER_VALUE,
        BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public fun setCellItem(
    position: Vector3i,
    item: Long,
    orientation: Long = 0
  ): Unit {
    TransferContext.writeArguments(VECTOR3I to position, LONG to item, LONG to orientation)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_CELL_ITEM, NIL.ordinal)
  }

  public fun getCellItem(position: Vector3i): Long {
    TransferContext.writeArguments(VECTOR3I to position)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_CELL_ITEM, LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public fun getCellItemOrientation(position: Vector3i): Long {
    TransferContext.writeArguments(VECTOR3I to position)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_CELL_ITEM_ORIENTATION,
        LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public fun worldToMap(worldPosition: Vector3): Vector3i {
    TransferContext.writeArguments(VECTOR3 to worldPosition)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_WORLD_TO_MAP, VECTOR3I.ordinal)
    return TransferContext.readReturnValue(VECTOR3I, false) as Vector3i
  }

  public fun mapToWorld(mapPosition: Vector3i): Vector3 {
    TransferContext.writeArguments(VECTOR3I to mapPosition)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_MAP_TO_WORLD, VECTOR3.ordinal)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  public fun resourceChanged(resource: Resource): Unit {
    TransferContext.writeArguments(OBJECT to resource)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_RESOURCE_CHANGED, NIL.ordinal)
  }

  public fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_CLEAR, NIL.ordinal)
  }

  public fun getUsedCells(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_USED_CELLS, ARRAY.ordinal)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  public fun getUsedCellsByItem(item: Long): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to item)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_USED_CELLS_BY_ITEM,
        ARRAY.ordinal)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  public fun getMeshes(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_MESHES, ARRAY.ordinal)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  public fun getBakeMeshes(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_BAKE_MESHES, ARRAY.ordinal)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  public fun getBakeMeshInstance(idx: Long): RID {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_BAKE_MESH_INSTANCE,
        _RID.ordinal)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  public fun clearBakedMeshes(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_CLEAR_BAKED_MESHES, NIL.ordinal)
  }

  public fun makeBakedMeshes(genLightmapUv: Boolean = false, lightmapUvTexelSize: Double = 0.1):
      Unit {
    TransferContext.writeArguments(BOOL to genLightmapUv, DOUBLE to lightmapUvTexelSize)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_MAKE_BAKED_MESHES, NIL.ordinal)
  }

  public companion object {
    public final const val INVALID_CELL_ITEM: Long = -1
  }
}
