// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.core.Basis
import godot.core.RID
import godot.core.Signal0
import godot.core.Signal1
import godot.internal.reflection.TypeManager
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BASIS
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.VECTOR3
import godot.core.VariantParser.VECTOR3I
import godot.core.VariantParser._RID
import godot.core.Vector3
import godot.core.Vector3i
import godot.internal.memory.TransferContext
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
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
  public val cellSizeChanged: Signal1<Vector3> by Signal1

  /**
   * Emitted when the [MeshLibrary] of this GridMap changes.
   */
  public val changed: Signal0 by Signal0

  /**
   * The assigned [MeshLibrary].
   */
  public final inline var meshLibrary: MeshLibrary?
    @JvmName("meshLibraryProperty")
    get() = getMeshLibrary()
    @JvmName("meshLibraryProperty")
    set(`value`) {
      setMeshLibrary(value)
    }

  /**
   * Overrides the default friction and bounce physics properties for the whole [GridMap].
   */
  public final inline var physicsMaterial: PhysicsMaterial?
    @JvmName("physicsMaterialProperty")
    get() = getPhysicsMaterial()
    @JvmName("physicsMaterialProperty")
    set(`value`) {
      setPhysicsMaterial(value)
    }

  /**
   * The dimensions of the grid's cells.
   * This does not affect the size of the meshes. See [cellScale].
   */
  @CoreTypeLocalCopy
  public final inline var cellSize: Vector3
    @JvmName("cellSizeProperty")
    get() = getCellSize()
    @JvmName("cellSizeProperty")
    set(`value`) {
      setCellSize(value)
    }

  /**
   * The size of each octant measured in number of cells. This applies to all three axis.
   */
  public final inline var cellOctantSize: Int
    @JvmName("cellOctantSizeProperty")
    get() = getOctantSize()
    @JvmName("cellOctantSizeProperty")
    set(`value`) {
      setOctantSize(value)
    }

  /**
   * If `true`, grid items are centered on the X axis.
   */
  public final inline var cellCenterX: Boolean
    @JvmName("cellCenterXProperty")
    get() = getCenterX()
    @JvmName("cellCenterXProperty")
    set(`value`) {
      setCenterX(value)
    }

  /**
   * If `true`, grid items are centered on the Y axis.
   */
  public final inline var cellCenterY: Boolean
    @JvmName("cellCenterYProperty")
    get() = getCenterY()
    @JvmName("cellCenterYProperty")
    set(`value`) {
      setCenterY(value)
    }

  /**
   * If `true`, grid items are centered on the Z axis.
   */
  public final inline var cellCenterZ: Boolean
    @JvmName("cellCenterZProperty")
    get() = getCenterZ()
    @JvmName("cellCenterZProperty")
    set(`value`) {
      setCenterZ(value)
    }

  /**
   * The scale of the cell items.
   * This does not affect the size of the grid cells themselves, only the items in them. This can be
   * used to make cell items overlap their neighbors.
   */
  public final inline var cellScale: Float
    @JvmName("cellScaleProperty")
    get() = getCellScale()
    @JvmName("cellScaleProperty")
    set(`value`) {
      setCellScale(value)
    }

  /**
   * The physics layers this GridMap is in.
   * GridMaps act as static bodies, meaning they aren't affected by gravity or other forces. They
   * only affect other physics bodies that collide with them.
   */
  public final inline var collisionLayer: Long
    @JvmName("collisionLayerProperty")
    get() = getCollisionLayer()
    @JvmName("collisionLayerProperty")
    set(`value`) {
      setCollisionLayer(value)
    }

  /**
   * The physics layers this GridMap detects collisions in. See
   * [url=$DOCS_URL/tutorials/physics/physics_introduction.html#collision-layers-and-masks]Collision
   * layers and masks[/url] in the documentation for more information.
   */
  public final inline var collisionMask: Long
    @JvmName("collisionMaskProperty")
    get() = getCollisionMask()
    @JvmName("collisionMaskProperty")
    set(`value`) {
      setCollisionMask(value)
    }

  /**
   * The priority used to solve colliding when occurring penetration. The higher the priority is,
   * the lower the penetration into the object will be. This can for example be used to prevent the
   * player from breaking through the boundaries of a level.
   */
  public final inline var collisionPriority: Float
    @JvmName("collisionPriorityProperty")
    get() = getCollisionPriority()
    @JvmName("collisionPriorityProperty")
    set(`value`) {
      setCollisionPriority(value)
    }

  /**
   * If `true`, this GridMap creates a navigation region for each cell that uses a [meshLibrary]
   * item with a navigation mesh. The created navigation region will use the navigation layers bitmask
   * assigned to the [MeshLibrary]'s item.
   */
  public final inline var bakeNavigation: Boolean
    @JvmName("bakeNavigationProperty")
    get() = isBakingNavigation()
    @JvmName("bakeNavigationProperty")
    set(`value`) {
      setBakeNavigation(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_GRIDMAP, scriptIndex)
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
  public final fun cellSizeMutate(block: Vector3.() -> Unit): Vector3 = cellSize.apply{
      block(this)
      cellSize = this
  }


  public final fun setCollisionLayer(layer: Long): Unit {
    TransferContext.writeArguments(LONG to layer)
    TransferContext.callMethod(ptr, MethodBindings.setCollisionLayerPtr, NIL)
  }

  public final fun getCollisionLayer(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCollisionLayerPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setCollisionMask(mask: Long): Unit {
    TransferContext.writeArguments(LONG to mask)
    TransferContext.callMethod(ptr, MethodBindings.setCollisionMaskPtr, NIL)
  }

  public final fun getCollisionMask(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCollisionMaskPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [collisionMask], given a
   * [layerNumber] between 1 and 32.
   */
  public final fun setCollisionMaskValue(layerNumber: Int, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(ptr, MethodBindings.setCollisionMaskValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [collisionMask] is enabled, given a
   * [layerNumber] between 1 and 32.
   */
  public final fun getCollisionMaskValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getCollisionMaskValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [collisionLayer], given a
   * [layerNumber] between 1 and 32.
   */
  public final fun setCollisionLayerValue(layerNumber: Int, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(ptr, MethodBindings.setCollisionLayerValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [collisionLayer] is enabled, given a
   * [layerNumber] between 1 and 32.
   */
  public final fun getCollisionLayerValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getCollisionLayerValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCollisionPriority(priority: Float): Unit {
    TransferContext.writeArguments(DOUBLE to priority.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setCollisionPriorityPtr, NIL)
  }

  public final fun getCollisionPriority(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCollisionPriorityPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setPhysicsMaterial(material: PhysicsMaterial?): Unit {
    TransferContext.writeArguments(OBJECT to material)
    TransferContext.callMethod(ptr, MethodBindings.setPhysicsMaterialPtr, NIL)
  }

  public final fun getPhysicsMaterial(): PhysicsMaterial? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPhysicsMaterialPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as PhysicsMaterial?)
  }

  public final fun setBakeNavigation(bakeNavigation: Boolean): Unit {
    TransferContext.writeArguments(BOOL to bakeNavigation)
    TransferContext.callMethod(ptr, MethodBindings.setBakeNavigationPtr, NIL)
  }

  public final fun isBakingNavigation(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isBakingNavigationPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the [RID] of the navigation map this GridMap node should use for its cell baked navigation
   * meshes.
   */
  public final fun setNavigationMap(navigationMap: RID): Unit {
    TransferContext.writeArguments(_RID to navigationMap)
    TransferContext.callMethod(ptr, MethodBindings.setNavigationMapPtr, NIL)
  }

  /**
   * Returns the [RID] of the navigation map this GridMap node uses for its cell baked navigation
   * meshes.
   * This function returns always the map set on the GridMap node and not the map on the
   * NavigationServer. If the map is changed directly with the NavigationServer API the GridMap node
   * will not be aware of the map change.
   */
  public final fun getNavigationMap(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getNavigationMapPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  public final fun setMeshLibrary(meshLibrary: MeshLibrary?): Unit {
    TransferContext.writeArguments(OBJECT to meshLibrary)
    TransferContext.callMethod(ptr, MethodBindings.setMeshLibraryPtr, NIL)
  }

  public final fun getMeshLibrary(): MeshLibrary? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMeshLibraryPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as MeshLibrary?)
  }

  public final fun setCellSize(size: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to size)
    TransferContext.callMethod(ptr, MethodBindings.setCellSizePtr, NIL)
  }

  public final fun getCellSize(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCellSizePtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setCellScale(scale: Float): Unit {
    TransferContext.writeArguments(DOUBLE to scale.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setCellScalePtr, NIL)
  }

  public final fun getCellScale(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCellScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setOctantSize(size: Int): Unit {
    TransferContext.writeArguments(LONG to size.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setOctantSizePtr, NIL)
  }

  public final fun getOctantSize(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOctantSizePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the mesh index for the cell referenced by its grid coordinates.
   * A negative item index such as [INVALID_CELL_ITEM] will clear the cell.
   * Optionally, the item's orientation can be passed. For valid orientation values, see
   * [getOrthogonalIndexFromBasis].
   */
  @JvmOverloads
  public final fun setCellItem(
    position: Vector3i,
    item: Int,
    orientation: Int = 0,
  ): Unit {
    TransferContext.writeArguments(VECTOR3I to position, LONG to item.toLong(), LONG to orientation.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setCellItemPtr, NIL)
  }

  /**
   * The [MeshLibrary] item index located at the given grid coordinates. If the cell is empty,
   * [INVALID_CELL_ITEM] will be returned.
   */
  public final fun getCellItem(position: Vector3i): Int {
    TransferContext.writeArguments(VECTOR3I to position)
    TransferContext.callMethod(ptr, MethodBindings.getCellItemPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * The orientation of the cell at the given grid coordinates. `-1` is returned if the cell is
   * empty.
   */
  public final fun getCellItemOrientation(position: Vector3i): Int {
    TransferContext.writeArguments(VECTOR3I to position)
    TransferContext.callMethod(ptr, MethodBindings.getCellItemOrientationPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the basis that gives the specified cell its orientation.
   */
  public final fun getCellItemBasis(position: Vector3i): Basis {
    TransferContext.writeArguments(VECTOR3I to position)
    TransferContext.callMethod(ptr, MethodBindings.getCellItemBasisPtr, BASIS)
    return (TransferContext.readReturnValue(BASIS) as Basis)
  }

  /**
   * Returns one of 24 possible rotations that lie along the vectors (x,y,z) with each component
   * being either -1, 0, or 1. For further details, refer to the Godot source code.
   */
  public final fun getBasisWithOrthogonalIndex(index: Int): Basis {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getBasisWithOrthogonalIndexPtr, BASIS)
    return (TransferContext.readReturnValue(BASIS) as Basis)
  }

  /**
   * This function considers a discretization of rotations into 24 points on unit sphere, lying
   * along the vectors (x,y,z) with each component being either -1, 0, or 1, and returns the index (in
   * the range from 0 to 23) of the point best representing the orientation of the object. For further
   * details, refer to the Godot source code.
   */
  public final fun getOrthogonalIndexFromBasis(basis: Basis): Int {
    TransferContext.writeArguments(BASIS to basis)
    TransferContext.callMethod(ptr, MethodBindings.getOrthogonalIndexFromBasisPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the map coordinates of the cell containing the given [localPosition]. If
   * [localPosition] is in global coordinates, consider using [Node3D.toLocal] before passing it to
   * this method. See also [mapToLocal].
   */
  public final fun localToMap(localPosition: Vector3): Vector3i {
    TransferContext.writeArguments(VECTOR3 to localPosition)
    TransferContext.callMethod(ptr, MethodBindings.localToMapPtr, VECTOR3I)
    return (TransferContext.readReturnValue(VECTOR3I) as Vector3i)
  }

  /**
   * Returns the position of a grid cell in the GridMap's local coordinate space. To convert the
   * returned value into global coordinates, use [Node3D.toGlobal]. See also [localToMap].
   */
  public final fun mapToLocal(mapPosition: Vector3i): Vector3 {
    TransferContext.writeArguments(VECTOR3I to mapPosition)
    TransferContext.callMethod(ptr, MethodBindings.mapToLocalPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * This method does nothing.
   */
  public final fun resourceChanged(resource: Resource?): Unit {
    TransferContext.writeArguments(OBJECT to resource)
    TransferContext.callMethod(ptr, MethodBindings.resourceChangedPtr, NIL)
  }

  public final fun setCenterX(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setCenterXPtr, NIL)
  }

  public final fun getCenterX(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCenterXPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCenterY(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setCenterYPtr, NIL)
  }

  public final fun getCenterY(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCenterYPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCenterZ(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setCenterZPtr, NIL)
  }

  public final fun getCenterZ(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCenterZPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Clear all cells.
   */
  public final fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearPtr, NIL)
  }

  /**
   * Returns an array of [Vector3] with the non-empty cell coordinates in the grid map.
   */
  public final fun getUsedCells(): VariantArray<Vector3i> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getUsedCellsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Vector3i>)
  }

  /**
   * Returns an array of all cells with the given item index specified in [item].
   */
  public final fun getUsedCellsByItem(item: Int): VariantArray<Vector3i> {
    TransferContext.writeArguments(LONG to item.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getUsedCellsByItemPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Vector3i>)
  }

  /**
   * Returns an array of [Transform3D] and [Mesh] references corresponding to the non-empty cells in
   * the grid. The transforms are specified in local space.
   */
  public final fun getMeshes(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMeshesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  /**
   * Returns an array of [ArrayMesh]es and [Transform3D] references of all bake meshes that exist
   * within the current GridMap.
   */
  public final fun getBakeMeshes(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBakeMeshesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  /**
   * Returns [RID] of a baked mesh with the given [idx].
   */
  public final fun getBakeMeshInstance(idx: Int): RID {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getBakeMeshInstancePtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Clears all baked meshes. See [makeBakedMeshes].
   */
  public final fun clearBakedMeshes(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearBakedMeshesPtr, NIL)
  }

  /**
   * Bakes lightmap data for all meshes in the assigned [MeshLibrary].
   */
  @JvmOverloads
  public final fun makeBakedMeshes(genLightmapUv: Boolean = false, lightmapUvTexelSize: Float =
      0.1f): Unit {
    TransferContext.writeArguments(BOOL to genLightmapUv, DOUBLE to lightmapUvTexelSize.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.makeBakedMeshesPtr, NIL)
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
        TypeManager.getMethodBindPtr("GridMap", "set_collision_layer", 1286410249)

    public val getCollisionLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "get_collision_layer", 3905245786)

    public val setCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "set_collision_mask", 1286410249)

    public val getCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "get_collision_mask", 3905245786)

    public val setCollisionMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "set_collision_mask_value", 300928843)

    public val getCollisionMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "get_collision_mask_value", 1116898809)

    public val setCollisionLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "set_collision_layer_value", 300928843)

    public val getCollisionLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "get_collision_layer_value", 1116898809)

    public val setCollisionPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "set_collision_priority", 373806689)

    public val getCollisionPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "get_collision_priority", 1740695150)

    public val setPhysicsMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "set_physics_material", 1784508650)

    public val getPhysicsMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "get_physics_material", 2521850424)

    public val setBakeNavigationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "set_bake_navigation", 2586408642)

    public val isBakingNavigationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "is_baking_navigation", 2240911060)

    public val setNavigationMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "set_navigation_map", 2722037293)

    public val getNavigationMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "get_navigation_map", 2944877500)

    public val setMeshLibraryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "set_mesh_library", 1488083439)

    public val getMeshLibraryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "get_mesh_library", 3350993772)

    public val setCellSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "set_cell_size", 3460891852)

    public val getCellSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "get_cell_size", 3360562783)

    public val setCellScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "set_cell_scale", 373806689)

    public val getCellScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "get_cell_scale", 1740695150)

    public val setOctantSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "set_octant_size", 1286410249)

    public val getOctantSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "get_octant_size", 3905245786)

    public val setCellItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "set_cell_item", 3449088946)

    public val getCellItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "get_cell_item", 3724960147)

    public val getCellItemOrientationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "get_cell_item_orientation", 3724960147)

    public val getCellItemBasisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "get_cell_item_basis", 3493604918)

    public val getBasisWithOrthogonalIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "get_basis_with_orthogonal_index", 2816196998)

    public val getOrthogonalIndexFromBasisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "get_orthogonal_index_from_basis", 4210359952)

    public val localToMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "local_to_map", 1257687843)

    public val mapToLocalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "map_to_local", 1088329196)

    public val resourceChangedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "resource_changed", 968641751)

    public val setCenterXPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "set_center_x", 2586408642)

    public val getCenterXPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "get_center_x", 36873697)

    public val setCenterYPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "set_center_y", 2586408642)

    public val getCenterYPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "get_center_y", 36873697)

    public val setCenterZPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "set_center_z", 2586408642)

    public val getCenterZPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "get_center_z", 36873697)

    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("GridMap", "clear", 3218959716)

    public val getUsedCellsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "get_used_cells", 3995934104)

    public val getUsedCellsByItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "get_used_cells_by_item", 663333327)

    public val getMeshesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "get_meshes", 3995934104)

    public val getBakeMeshesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "get_bake_meshes", 2915620761)

    public val getBakeMeshInstancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "get_bake_mesh_instance", 937000113)

    public val clearBakedMeshesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "clear_baked_meshes", 3218959716)

    public val makeBakedMeshesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GridMap", "make_baked_meshes", 3609286057)
  }
}
