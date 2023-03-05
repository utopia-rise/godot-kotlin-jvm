// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Basis
import godot.core.RID
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BASIS
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
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class GridMap : Node3D() {
  public val cellSizeChanged: Signal1<Vector3> by signal("cellSize")

  public var meshLibrary: MeshLibrary?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_MESH_LIBRARY, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as MeshLibrary?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_MESH_LIBRARY, NIL)
    }

  public var physicsMaterial: PhysicsMaterial?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_PHYSICS_MATERIAL,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as PhysicsMaterial?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_PHYSICS_MATERIAL, NIL)
    }

  public var cellSize: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_CELL_SIZE, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_CELL_SIZE, NIL)
    }

  public var cellOctantSize: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_OCTANT_SIZE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_OCTANT_SIZE, NIL)
    }

  public var cellCenterX: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_CENTER_X, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_CENTER_X, NIL)
    }

  public var cellCenterY: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_CENTER_Y, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_CENTER_Y, NIL)
    }

  public var cellCenterZ: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_CENTER_Z, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_CENTER_Z, NIL)
    }

  public var cellScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_CELL_SCALE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_CELL_SCALE, NIL)
    }

  public var collisionLayer: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_COLLISION_LAYER, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_COLLISION_LAYER, NIL)
    }

  public var collisionMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_COLLISION_MASK, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_COLLISION_MASK, NIL)
    }

  public var collisionPriority: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_COLLISION_PRIORITY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_COLLISION_PRIORITY,
          NIL)
    }

  public var bakeNavigation: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_IS_BAKING_NAVIGATION,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_BAKE_NAVIGATION, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GRIDMAP, scriptIndex)
    return true
  }

  public fun setCollisionMaskValue(layerNumber: Long, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber, BOOL to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_COLLISION_MASK_VALUE,
        NIL)
  }

  public fun getCollisionMaskValue(layerNumber: Long): Boolean {
    TransferContext.writeArguments(LONG to layerNumber)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_COLLISION_MASK_VALUE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public fun setCollisionLayerValue(layerNumber: Long, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber, BOOL to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_COLLISION_LAYER_VALUE,
        NIL)
  }

  public fun getCollisionLayerValue(layerNumber: Long): Boolean {
    TransferContext.writeArguments(LONG to layerNumber)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_COLLISION_LAYER_VALUE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public fun setNavigationMap(navigationMap: RID): Unit {
    TransferContext.writeArguments(_RID to navigationMap)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_NAVIGATION_MAP, NIL)
  }

  public fun getNavigationMap(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_NAVIGATION_MAP, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  public fun setCellItem(
    position: Vector3i,
    item: Long,
    orientation: Long = 0,
  ): Unit {
    TransferContext.writeArguments(VECTOR3I to position, LONG to item, LONG to orientation)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_SET_CELL_ITEM, NIL)
  }

  public fun getCellItem(position: Vector3i): Long {
    TransferContext.writeArguments(VECTOR3I to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_CELL_ITEM, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public fun getCellItemOrientation(position: Vector3i): Long {
    TransferContext.writeArguments(VECTOR3I to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_CELL_ITEM_ORIENTATION,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public fun getCellItemBasis(position: Vector3i): Basis {
    TransferContext.writeArguments(VECTOR3I to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_CELL_ITEM_BASIS, BASIS)
    return TransferContext.readReturnValue(BASIS, false) as Basis
  }

  public fun getBasisWithOrthogonalIndex(index: Long): Basis {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_BASIS_WITH_ORTHOGONAL_INDEX, BASIS)
    return TransferContext.readReturnValue(BASIS, false) as Basis
  }

  public fun getOrthogonalIndexFromBasis(basis: Basis): Long {
    TransferContext.writeArguments(BASIS to basis)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_ORTHOGONAL_INDEX_FROM_BASIS, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public fun localToMap(localPosition: Vector3): Vector3i {
    TransferContext.writeArguments(VECTOR3 to localPosition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_LOCAL_TO_MAP, VECTOR3I)
    return TransferContext.readReturnValue(VECTOR3I, false) as Vector3i
  }

  public fun mapToLocal(mapPosition: Vector3i): Vector3 {
    TransferContext.writeArguments(VECTOR3I to mapPosition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_MAP_TO_LOCAL, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  public fun resourceChanged(resource: Resource): Unit {
    TransferContext.writeArguments(OBJECT to resource)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_RESOURCE_CHANGED, NIL)
  }

  public fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_CLEAR, NIL)
  }

  public fun getUsedCells(): VariantArray<Vector3i> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_USED_CELLS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Vector3i>
  }

  public fun getUsedCellsByItem(item: Long): VariantArray<Vector3i> {
    TransferContext.writeArguments(LONG to item)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_USED_CELLS_BY_ITEM,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Vector3i>
  }

  public fun getMeshes(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_MESHES, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  public fun getBakeMeshes(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_BAKE_MESHES, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  public fun getBakeMeshInstance(idx: Long): RID {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_GET_BAKE_MESH_INSTANCE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  public fun clearBakedMeshes(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_CLEAR_BAKED_MESHES, NIL)
  }

  public fun makeBakedMeshes(genLightmapUv: Boolean = false, lightmapUvTexelSize: Double = 0.1):
      Unit {
    TransferContext.writeArguments(BOOL to genLightmapUv, DOUBLE to lightmapUvTexelSize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRIDMAP_MAKE_BAKED_MESHES, NIL)
  }

  public companion object {
    public final const val INVALID_CELL_ITEM: Long = -1
  }
}
