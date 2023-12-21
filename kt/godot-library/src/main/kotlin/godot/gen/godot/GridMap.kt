// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Basis
import godot.core.RID
import godot.core.TypeManager
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
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * GridMap lets you place meshes on a grid interactively. It works both from the editor and from
 * scripts, which can help you create in-game level editors.
 * GridMaps use a [MeshLibrary] which contains a list of tiles. Each tile is a mesh with materials
 * plus optional collision and navigation shapes.
 * A GridMap contains a collection of cells. Each grid cell refers to a tile in the [MeshLibrary].
 * All cells in the map have the same dimensions.
 * Internally, a GridMap is split into a sparse collection of octants for efficient rendering and
 * physics processing. Every octant has the same dimensions and can contain several cells.
 * **Note:** GridMap doesn't extend [VisualInstance3D] and therefore can't be hidden or cull masked
 * based on [VisualInstance3D.layers]. If you make a light not affect the first layer, the whole
 * GridMap won't be lit by the light in question.
 */
@GodotBaseType
public open class GridMap : Node3D() {
  /**
   * Emitted when [cellSize] changes.
   */
  public val cellSizeChanged: Signal1<Vector3> by signal("cellSize")

  /**
   * Emitted when the [MeshLibrary] of this GridMap changes.
   */
  public val changed: Signal0 by signal()

  /**
   * The assigned [MeshLibrary].
   */
  public var meshLibrary: MeshLibrary?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMeshLibraryPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as MeshLibrary?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMeshLibraryPtr, NIL)
    }

  /**
   * Overrides the default friction and bounce physics properties for the whole [GridMap].
   */
  public var physicsMaterial: PhysicsMaterial?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPhysicsMaterialPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as PhysicsMaterial?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPhysicsMaterialPtr, NIL)
    }

  /**
   * The dimensions of the grid's cells.
   * This does not affect the size of the meshes. See [cellScale].
   */
  @CoreTypeLocalCopy
  public var cellSize: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCellSizePtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCellSizePtr, NIL)
    }

  /**
   * The size of each octant measured in number of cells. This applies to all three axis.
   */
  public var cellOctantSize: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOctantSizePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setOctantSizePtr, NIL)
    }

  /**
   * If `true`, grid items are centered on the X axis.
   */
  public var cellCenterX: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCenterXPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCenterXPtr, NIL)
    }

  /**
   * If `true`, grid items are centered on the Y axis.
   */
  public var cellCenterY: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCenterYPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCenterYPtr, NIL)
    }

  /**
   * If `true`, grid items are centered on the Z axis.
   */
  public var cellCenterZ: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCenterZPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCenterZPtr, NIL)
    }

  /**
   * The scale of the cell items.
   * This does not affect the size of the grid cells themselves, only the items in them. This can be
   * used to make cell items overlap their neighbors.
   */
  public var cellScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCellScalePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setCellScalePtr, NIL)
    }

  /**
   * The physics layers this GridMap is in.
   * GridMaps act as static bodies, meaning they aren't affected by gravity or other forces. They
   * only affect other physics bodies that collide with them.
   */
  public var collisionLayer: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCollisionLayerPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCollisionLayerPtr, NIL)
    }

  /**
   * The physics layers this GridMap detects collisions in. See
   * [url=$DOCS_URL/tutorials/physics/physics_introduction.html#collision-layers-and-masks]Collision
   * layers and masks[/url] in the documentation for more information.
   */
  public var collisionMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCollisionMaskPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCollisionMaskPtr, NIL)
    }

  /**
   * The priority used to solve colliding when occurring penetration. The higher the priority is,
   * the lower the penetration into the object will be. This can for example be used to prevent the
   * player from breaking through the boundaries of a level.
   */
  public var collisionPriority: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCollisionPriorityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setCollisionPriorityPtr, NIL)
    }

  /**
   * If `true`, this GridMap creates a navigation region for each cell that uses a [meshLibrary]
   * item with a navigation mesh. The created navigation region will use the navigation layers bitmask
   * assigned to the [MeshLibrary]'s item.
   */
  public var bakeNavigation: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isBakingNavigationPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBakeNavigationPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GRIDMAP, scriptIndex)
    return true
  }

  /**
   * The dimensions of the grid's cells.
   * This does not affect the size of the meshes. See [cellScale].
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = gridmap.cellSize
   * //Your changes
   * gridmap.cellSize = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun cellSizeMutate(block: Vector3.() -> Unit): Vector3 = cellSize.apply{
      block(this)
      cellSize = this
  }


  /**
   * Based on [value], enables or disables the specified layer in the [collisionMask], given a
   * [layerNumber] between 1 and 32.
   */
  public fun setCollisionMaskValue(layerNumber: Int, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setCollisionMaskValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [collisionMask] is enabled, given a
   * [layerNumber] between 1 and 32.
   */
  public fun getCollisionMaskValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCollisionMaskValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [collisionLayer], given a
   * [layerNumber] between 1 and 32.
   */
  public fun setCollisionLayerValue(layerNumber: Int, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setCollisionLayerValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [collisionLayer] is enabled, given a
   * [layerNumber] between 1 and 32.
   */
  public fun getCollisionLayerValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCollisionLayerValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the [RID] of the navigation map this GridMap node should use for its cell baked navigation
   * meshes.
   */
  public fun setNavigationMap(navigationMap: RID): Unit {
    TransferContext.writeArguments(_RID to navigationMap)
    TransferContext.callMethod(rawPtr, MethodBindings.setNavigationMapPtr, NIL)
  }

  /**
   * Returns the [RID] of the navigation map this GridMap node uses for its cell baked navigation
   * meshes.
   * This function returns always the map set on the GridMap node and not the map on the
   * NavigationServer. If the map is changed directly with the NavigationServer API the GridMap node
   * will not be aware of the map change.
   */
  public fun getNavigationMap(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNavigationMapPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets the mesh index for the cell referenced by its grid coordinates.
   * A negative item index such as [INVALIDCELLITEM] will clear the cell.
   * Optionally, the item's orientation can be passed. For valid orientation values, see
   * [getOrthogonalIndexFromBasis].
   */
  @JvmOverloads
  public fun setCellItem(
    position: Vector3i,
    item: Int,
    orientation: Int = 0,
  ): Unit {
    TransferContext.writeArguments(VECTOR3I to position, LONG to item.toLong(), LONG to orientation.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setCellItemPtr, NIL)
  }

  /**
   * The [MeshLibrary] item index located at the given grid coordinates. If the cell is empty,
   * [INVALIDCELLITEM] will be returned.
   */
  public fun getCellItem(position: Vector3i): Int {
    TransferContext.writeArguments(VECTOR3I to position)
    TransferContext.callMethod(rawPtr, MethodBindings.getCellItemPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * The orientation of the cell at the given grid coordinates. `-1` is returned if the cell is
   * empty.
   */
  public fun getCellItemOrientation(position: Vector3i): Int {
    TransferContext.writeArguments(VECTOR3I to position)
    TransferContext.callMethod(rawPtr, MethodBindings.getCellItemOrientationPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the basis that gives the specified cell its orientation.
   */
  public fun getCellItemBasis(position: Vector3i): Basis {
    TransferContext.writeArguments(VECTOR3I to position)
    TransferContext.callMethod(rawPtr, MethodBindings.getCellItemBasisPtr, BASIS)
    return (TransferContext.readReturnValue(BASIS, false) as Basis)
  }

  /**
   * Returns one of 24 possible rotations that lie along the vectors (x,y,z) with each component
   * being either -1, 0, or 1. For further details, refer to the Godot source code.
   */
  public fun getBasisWithOrthogonalIndex(index: Int): Basis {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBasisWithOrthogonalIndexPtr, BASIS)
    return (TransferContext.readReturnValue(BASIS, false) as Basis)
  }

  /**
   * This function considers a discretization of rotations into 24 points on unit sphere, lying
   * along the vectors (x,y,z) with each component being either -1, 0, or 1, and returns the index (in
   * the range from 0 to 23) of the point best representing the orientation of the object. For further
   * details, refer to the Godot source code.
   */
  public fun getOrthogonalIndexFromBasis(basis: Basis): Int {
    TransferContext.writeArguments(BASIS to basis)
    TransferContext.callMethod(rawPtr, MethodBindings.getOrthogonalIndexFromBasisPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the map coordinates of the cell containing the given [localPosition]. If
   * [localPosition] is in global coordinates, consider using [Node3D.toLocal] before passing it to
   * this method. See also [mapToLocal].
   */
  public fun localToMap(localPosition: Vector3): Vector3i {
    TransferContext.writeArguments(VECTOR3 to localPosition)
    TransferContext.callMethod(rawPtr, MethodBindings.localToMapPtr, VECTOR3I)
    return (TransferContext.readReturnValue(VECTOR3I, false) as Vector3i)
  }

  /**
   * Returns the position of a grid cell in the GridMap's local coordinate space. To convert the
   * returned value into global coordinates, use [Node3D.toGlobal]. See also [mapToLocal].
   */
  public fun mapToLocal(mapPosition: Vector3i): Vector3 {
    TransferContext.writeArguments(VECTOR3I to mapPosition)
    TransferContext.callMethod(rawPtr, MethodBindings.mapToLocalPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * *Obsoleted.* Use [signal Resource.changed] instead.
   */
  public fun resourceChanged(resource: Resource): Unit {
    TransferContext.writeArguments(OBJECT to resource)
    TransferContext.callMethod(rawPtr, MethodBindings.resourceChangedPtr, NIL)
  }

  /**
   * Clear all cells.
   */
  public fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  /**
   * Returns an array of [Vector3] with the non-empty cell coordinates in the grid map.
   */
  public fun getUsedCells(): VariantArray<Vector3i> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getUsedCellsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Vector3i>)
  }

  /**
   * Returns an array of all cells with the given item index specified in [item].
   */
  public fun getUsedCellsByItem(item: Int): VariantArray<Vector3i> {
    TransferContext.writeArguments(LONG to item.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getUsedCellsByItemPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Vector3i>)
  }

  /**
   * Returns an array of [Transform3D] and [Mesh] references corresponding to the non-empty cells in
   * the grid. The transforms are specified in local space.
   */
  public fun getMeshes(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMeshesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  /**
   * Returns an array of [ArrayMesh]es and [Transform3D] references of all bake meshes that exist
   * within the current GridMap.
   */
  public fun getBakeMeshes(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBakeMeshesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  /**
   * Returns [RID] of a baked mesh with the given [idx].
   */
  public fun getBakeMeshInstance(idx: Int): RID {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBakeMeshInstancePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Clears all baked meshes. See [makeBakedMeshes].
   */
  public fun clearBakedMeshes(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearBakedMeshesPtr, NIL)
  }

  /**
   * Bakes lightmap data for all meshes in the assigned [MeshLibrary].
   */
  @JvmOverloads
  public fun makeBakedMeshes(genLightmapUv: Boolean = false, lightmapUvTexelSize: Float = 0.1f):
      Unit {
    TransferContext.writeArguments(BOOL to genLightmapUv, DOUBLE to lightmapUvTexelSize.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.makeBakedMeshesPtr, NIL)
  }

  public companion object {
    /**
     * Invalid cell item that can be used in [setCellItem] to clear cells (or represent an empty
     * cell in [getCellItem]).
     */
    public final const val INVALID_CELL_ITEM: Long = -1
  }

  internal object MethodBindings {
    public val setCollisionLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "set_collision_layer")

    public val getCollisionLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "get_collision_layer")

    public val setCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "set_collision_mask")

    public val getCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "get_collision_mask")

    public val setCollisionMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "set_collision_mask_value")

    public val getCollisionMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "get_collision_mask_value")

    public val setCollisionLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "set_collision_layer_value")

    public val getCollisionLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "get_collision_layer_value")

    public val setCollisionPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "set_collision_priority")

    public val getCollisionPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "get_collision_priority")

    public val setPhysicsMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "set_physics_material")

    public val getPhysicsMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "get_physics_material")

    public val setBakeNavigationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "set_bake_navigation")

    public val isBakingNavigationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "is_baking_navigation")

    public val setNavigationMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "set_navigation_map")

    public val getNavigationMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "get_navigation_map")

    public val setMeshLibraryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "set_mesh_library")

    public val getMeshLibraryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "get_mesh_library")

    public val setCellSizePtr: VoidPtr = TypeManager.getMethodBindPtr("GridMap", "set_cell_size")

    public val getCellSizePtr: VoidPtr = TypeManager.getMethodBindPtr("GridMap", "get_cell_size")

    public val setCellScalePtr: VoidPtr = TypeManager.getMethodBindPtr("GridMap", "set_cell_scale")

    public val getCellScalePtr: VoidPtr = TypeManager.getMethodBindPtr("GridMap", "get_cell_scale")

    public val setOctantSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "set_octant_size")

    public val getOctantSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "get_octant_size")

    public val setCellItemPtr: VoidPtr = TypeManager.getMethodBindPtr("GridMap", "set_cell_item")

    public val getCellItemPtr: VoidPtr = TypeManager.getMethodBindPtr("GridMap", "get_cell_item")

    public val getCellItemOrientationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "get_cell_item_orientation")

    public val getCellItemBasisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "get_cell_item_basis")

    public val getBasisWithOrthogonalIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "get_basis_with_orthogonal_index")

    public val getOrthogonalIndexFromBasisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "get_orthogonal_index_from_basis")

    public val localToMapPtr: VoidPtr = TypeManager.getMethodBindPtr("GridMap", "local_to_map")

    public val mapToLocalPtr: VoidPtr = TypeManager.getMethodBindPtr("GridMap", "map_to_local")

    public val resourceChangedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "resource_changed")

    public val setCenterXPtr: VoidPtr = TypeManager.getMethodBindPtr("GridMap", "set_center_x")

    public val getCenterXPtr: VoidPtr = TypeManager.getMethodBindPtr("GridMap", "get_center_x")

    public val setCenterYPtr: VoidPtr = TypeManager.getMethodBindPtr("GridMap", "set_center_y")

    public val getCenterYPtr: VoidPtr = TypeManager.getMethodBindPtr("GridMap", "get_center_y")

    public val setCenterZPtr: VoidPtr = TypeManager.getMethodBindPtr("GridMap", "set_center_z")

    public val getCenterZPtr: VoidPtr = TypeManager.getMethodBindPtr("GridMap", "get_center_z")

    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("GridMap", "clear")

    public val getUsedCellsPtr: VoidPtr = TypeManager.getMethodBindPtr("GridMap", "get_used_cells")

    public val getUsedCellsByItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "get_used_cells_by_item")

    public val getMeshesPtr: VoidPtr = TypeManager.getMethodBindPtr("GridMap", "get_meshes")

    public val getBakeMeshesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "get_bake_meshes")

    public val getBakeMeshInstancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "get_bake_mesh_instance")

    public val clearBakedMeshesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "clear_baked_meshes")

    public val makeBakedMeshesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "make_baked_meshes")
  }
}
