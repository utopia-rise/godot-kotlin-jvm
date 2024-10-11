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
import godot.core.Signal0
import godot.core.Signal1
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
import godot.util.Internals
import godot.util.VoidPtr
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

private const val ENGINE_CLASS_GRIDMAP_INDEX: Int = 290

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
    Internals.callConstructor(this, ENGINE_CLASS_GRIDMAP_INDEX, scriptIndex)
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
    Internals.writeArguments(LONG to layer)
    Internals.callMethod(rawPtr, MethodBindings.setCollisionLayerPtr, NIL)
  }

  public final fun getCollisionLayer(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCollisionLayerPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  public final fun setCollisionMask(mask: Long): Unit {
    Internals.writeArguments(LONG to mask)
    Internals.callMethod(rawPtr, MethodBindings.setCollisionMaskPtr, NIL)
  }

  public final fun getCollisionMask(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCollisionMaskPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [collisionMask], given a
   * [layerNumber] between 1 and 32.
   */
  public final fun setCollisionMaskValue(layerNumber: Int, `value`: Boolean): Unit {
    Internals.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    Internals.callMethod(rawPtr, MethodBindings.setCollisionMaskValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [collisionMask] is enabled, given a
   * [layerNumber] between 1 and 32.
   */
  public final fun getCollisionMaskValue(layerNumber: Int): Boolean {
    Internals.writeArguments(LONG to layerNumber.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getCollisionMaskValuePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [collisionLayer], given a
   * [layerNumber] between 1 and 32.
   */
  public final fun setCollisionLayerValue(layerNumber: Int, `value`: Boolean): Unit {
    Internals.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    Internals.callMethod(rawPtr, MethodBindings.setCollisionLayerValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [collisionLayer] is enabled, given a
   * [layerNumber] between 1 and 32.
   */
  public final fun getCollisionLayerValue(layerNumber: Int): Boolean {
    Internals.writeArguments(LONG to layerNumber.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getCollisionLayerValuePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCollisionPriority(priority: Float): Unit {
    Internals.writeArguments(DOUBLE to priority.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setCollisionPriorityPtr, NIL)
  }

  public final fun getCollisionPriority(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCollisionPriorityPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setPhysicsMaterial(material: PhysicsMaterial?): Unit {
    Internals.writeArguments(OBJECT to material)
    Internals.callMethod(rawPtr, MethodBindings.setPhysicsMaterialPtr, NIL)
  }

  public final fun getPhysicsMaterial(): PhysicsMaterial? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPhysicsMaterialPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as PhysicsMaterial?)
  }

  public final fun setBakeNavigation(bakeNavigation: Boolean): Unit {
    Internals.writeArguments(BOOL to bakeNavigation)
    Internals.callMethod(rawPtr, MethodBindings.setBakeNavigationPtr, NIL)
  }

  public final fun isBakingNavigation(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isBakingNavigationPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the [RID] of the navigation map this GridMap node should use for its cell baked navigation
   * meshes.
   */
  public final fun setNavigationMap(navigationMap: RID): Unit {
    Internals.writeArguments(_RID to navigationMap)
    Internals.callMethod(rawPtr, MethodBindings.setNavigationMapPtr, NIL)
  }

  /**
   * Returns the [RID] of the navigation map this GridMap node uses for its cell baked navigation
   * meshes.
   * This function returns always the map set on the GridMap node and not the map on the
   * NavigationServer. If the map is changed directly with the NavigationServer API the GridMap node
   * will not be aware of the map change.
   */
  public final fun getNavigationMap(): RID {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getNavigationMapPtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  public final fun setMeshLibrary(meshLibrary: MeshLibrary?): Unit {
    Internals.writeArguments(OBJECT to meshLibrary)
    Internals.callMethod(rawPtr, MethodBindings.setMeshLibraryPtr, NIL)
  }

  public final fun getMeshLibrary(): MeshLibrary? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMeshLibraryPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as MeshLibrary?)
  }

  public final fun setCellSize(size: Vector3): Unit {
    Internals.writeArguments(VECTOR3 to size)
    Internals.callMethod(rawPtr, MethodBindings.setCellSizePtr, NIL)
  }

  public final fun getCellSize(): Vector3 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCellSizePtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setCellScale(scale: Float): Unit {
    Internals.writeArguments(DOUBLE to scale.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setCellScalePtr, NIL)
  }

  public final fun getCellScale(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCellScalePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setOctantSize(size: Int): Unit {
    Internals.writeArguments(LONG to size.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setOctantSizePtr, NIL)
  }

  public final fun getOctantSize(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getOctantSizePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
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
    Internals.writeArguments(VECTOR3I to position, LONG to item.toLong(), LONG to orientation.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setCellItemPtr, NIL)
  }

  /**
   * The [MeshLibrary] item index located at the given grid coordinates. If the cell is empty,
   * [INVALID_CELL_ITEM] will be returned.
   */
  public final fun getCellItem(position: Vector3i): Int {
    Internals.writeArguments(VECTOR3I to position)
    Internals.callMethod(rawPtr, MethodBindings.getCellItemPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * The orientation of the cell at the given grid coordinates. `-1` is returned if the cell is
   * empty.
   */
  public final fun getCellItemOrientation(position: Vector3i): Int {
    Internals.writeArguments(VECTOR3I to position)
    Internals.callMethod(rawPtr, MethodBindings.getCellItemOrientationPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the basis that gives the specified cell its orientation.
   */
  public final fun getCellItemBasis(position: Vector3i): Basis {
    Internals.writeArguments(VECTOR3I to position)
    Internals.callMethod(rawPtr, MethodBindings.getCellItemBasisPtr, BASIS)
    return (Internals.readReturnValue(BASIS) as Basis)
  }

  /**
   * Returns one of 24 possible rotations that lie along the vectors (x,y,z) with each component
   * being either -1, 0, or 1. For further details, refer to the Godot source code.
   */
  public final fun getBasisWithOrthogonalIndex(index: Int): Basis {
    Internals.writeArguments(LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getBasisWithOrthogonalIndexPtr, BASIS)
    return (Internals.readReturnValue(BASIS) as Basis)
  }

  /**
   * This function considers a discretization of rotations into 24 points on unit sphere, lying
   * along the vectors (x,y,z) with each component being either -1, 0, or 1, and returns the index (in
   * the range from 0 to 23) of the point best representing the orientation of the object. For further
   * details, refer to the Godot source code.
   */
  public final fun getOrthogonalIndexFromBasis(basis: Basis): Int {
    Internals.writeArguments(BASIS to basis)
    Internals.callMethod(rawPtr, MethodBindings.getOrthogonalIndexFromBasisPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the map coordinates of the cell containing the given [localPosition]. If
   * [localPosition] is in global coordinates, consider using [Node3D.toLocal] before passing it to
   * this method. See also [mapToLocal].
   */
  public final fun localToMap(localPosition: Vector3): Vector3i {
    Internals.writeArguments(VECTOR3 to localPosition)
    Internals.callMethod(rawPtr, MethodBindings.localToMapPtr, VECTOR3I)
    return (Internals.readReturnValue(VECTOR3I) as Vector3i)
  }

  /**
   * Returns the position of a grid cell in the GridMap's local coordinate space. To convert the
   * returned value into global coordinates, use [Node3D.toGlobal]. See also [localToMap].
   */
  public final fun mapToLocal(mapPosition: Vector3i): Vector3 {
    Internals.writeArguments(VECTOR3I to mapPosition)
    Internals.callMethod(rawPtr, MethodBindings.mapToLocalPtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * This method does nothing.
   */
  public final fun resourceChanged(resource: Resource?): Unit {
    Internals.writeArguments(OBJECT to resource)
    Internals.callMethod(rawPtr, MethodBindings.resourceChangedPtr, NIL)
  }

  public final fun setCenterX(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setCenterXPtr, NIL)
  }

  public final fun getCenterX(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCenterXPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCenterY(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setCenterYPtr, NIL)
  }

  public final fun getCenterY(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCenterYPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCenterZ(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setCenterZPtr, NIL)
  }

  public final fun getCenterZ(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCenterZPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Clear all cells.
   */
  public final fun clear(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  /**
   * Returns an array of [Vector3] with the non-empty cell coordinates in the grid map.
   */
  public final fun getUsedCells(): VariantArray<Vector3i> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getUsedCellsPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<Vector3i>)
  }

  /**
   * Returns an array of all cells with the given item index specified in [item].
   */
  public final fun getUsedCellsByItem(item: Int): VariantArray<Vector3i> {
    Internals.writeArguments(LONG to item.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getUsedCellsByItemPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<Vector3i>)
  }

  /**
   * Returns an array of [Transform3D] and [Mesh] references corresponding to the non-empty cells in
   * the grid. The transforms are specified in local space.
   */
  public final fun getMeshes(): VariantArray<Any?> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMeshesPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  /**
   * Returns an array of [ArrayMesh]es and [Transform3D] references of all bake meshes that exist
   * within the current GridMap.
   */
  public final fun getBakeMeshes(): VariantArray<Any?> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBakeMeshesPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  /**
   * Returns [RID] of a baked mesh with the given [idx].
   */
  public final fun getBakeMeshInstance(idx: Int): RID {
    Internals.writeArguments(LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getBakeMeshInstancePtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  /**
   * Clears all baked meshes. See [makeBakedMeshes].
   */
  public final fun clearBakedMeshes(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.clearBakedMeshesPtr, NIL)
  }

  /**
   * Bakes lightmap data for all meshes in the assigned [MeshLibrary].
   */
  @JvmOverloads
  public final fun makeBakedMeshes(genLightmapUv: Boolean = false, lightmapUvTexelSize: Float =
      0.1f): Unit {
    Internals.writeArguments(BOOL to genLightmapUv, DOUBLE to lightmapUvTexelSize.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.makeBakedMeshesPtr, NIL)
  }

  public companion object {
    /**
     * Invalid cell item that can be used in [setCellItem] to clear cells (or represent an empty
     * cell in [getCellItem]).
     */
    public final const val INVALID_CELL_ITEM: Long = -1
  }

  public object MethodBindings {
    internal val setCollisionLayerPtr: VoidPtr =
        Internals.getMethodBindPtr("GridMap", "set_collision_layer", 1286410249)

    internal val getCollisionLayerPtr: VoidPtr =
        Internals.getMethodBindPtr("GridMap", "get_collision_layer", 3905245786)

    internal val setCollisionMaskPtr: VoidPtr =
        Internals.getMethodBindPtr("GridMap", "set_collision_mask", 1286410249)

    internal val getCollisionMaskPtr: VoidPtr =
        Internals.getMethodBindPtr("GridMap", "get_collision_mask", 3905245786)

    internal val setCollisionMaskValuePtr: VoidPtr =
        Internals.getMethodBindPtr("GridMap", "set_collision_mask_value", 300928843)

    internal val getCollisionMaskValuePtr: VoidPtr =
        Internals.getMethodBindPtr("GridMap", "get_collision_mask_value", 1116898809)

    internal val setCollisionLayerValuePtr: VoidPtr =
        Internals.getMethodBindPtr("GridMap", "set_collision_layer_value", 300928843)

    internal val getCollisionLayerValuePtr: VoidPtr =
        Internals.getMethodBindPtr("GridMap", "get_collision_layer_value", 1116898809)

    internal val setCollisionPriorityPtr: VoidPtr =
        Internals.getMethodBindPtr("GridMap", "set_collision_priority", 373806689)

    internal val getCollisionPriorityPtr: VoidPtr =
        Internals.getMethodBindPtr("GridMap", "get_collision_priority", 1740695150)

    internal val setPhysicsMaterialPtr: VoidPtr =
        Internals.getMethodBindPtr("GridMap", "set_physics_material", 1784508650)

    internal val getPhysicsMaterialPtr: VoidPtr =
        Internals.getMethodBindPtr("GridMap", "get_physics_material", 2521850424)

    internal val setBakeNavigationPtr: VoidPtr =
        Internals.getMethodBindPtr("GridMap", "set_bake_navigation", 2586408642)

    internal val isBakingNavigationPtr: VoidPtr =
        Internals.getMethodBindPtr("GridMap", "is_baking_navigation", 2240911060)

    internal val setNavigationMapPtr: VoidPtr =
        Internals.getMethodBindPtr("GridMap", "set_navigation_map", 2722037293)

    internal val getNavigationMapPtr: VoidPtr =
        Internals.getMethodBindPtr("GridMap", "get_navigation_map", 2944877500)

    internal val setMeshLibraryPtr: VoidPtr =
        Internals.getMethodBindPtr("GridMap", "set_mesh_library", 1488083439)

    internal val getMeshLibraryPtr: VoidPtr =
        Internals.getMethodBindPtr("GridMap", "get_mesh_library", 3350993772)

    internal val setCellSizePtr: VoidPtr =
        Internals.getMethodBindPtr("GridMap", "set_cell_size", 3460891852)

    internal val getCellSizePtr: VoidPtr =
        Internals.getMethodBindPtr("GridMap", "get_cell_size", 3360562783)

    internal val setCellScalePtr: VoidPtr =
        Internals.getMethodBindPtr("GridMap", "set_cell_scale", 373806689)

    internal val getCellScalePtr: VoidPtr =
        Internals.getMethodBindPtr("GridMap", "get_cell_scale", 1740695150)

    internal val setOctantSizePtr: VoidPtr =
        Internals.getMethodBindPtr("GridMap", "set_octant_size", 1286410249)

    internal val getOctantSizePtr: VoidPtr =
        Internals.getMethodBindPtr("GridMap", "get_octant_size", 3905245786)

    internal val setCellItemPtr: VoidPtr =
        Internals.getMethodBindPtr("GridMap", "set_cell_item", 3449088946)

    internal val getCellItemPtr: VoidPtr =
        Internals.getMethodBindPtr("GridMap", "get_cell_item", 3724960147)

    internal val getCellItemOrientationPtr: VoidPtr =
        Internals.getMethodBindPtr("GridMap", "get_cell_item_orientation", 3724960147)

    internal val getCellItemBasisPtr: VoidPtr =
        Internals.getMethodBindPtr("GridMap", "get_cell_item_basis", 3493604918)

    internal val getBasisWithOrthogonalIndexPtr: VoidPtr =
        Internals.getMethodBindPtr("GridMap", "get_basis_with_orthogonal_index", 2816196998)

    internal val getOrthogonalIndexFromBasisPtr: VoidPtr =
        Internals.getMethodBindPtr("GridMap", "get_orthogonal_index_from_basis", 4210359952)

    internal val localToMapPtr: VoidPtr =
        Internals.getMethodBindPtr("GridMap", "local_to_map", 1257687843)

    internal val mapToLocalPtr: VoidPtr =
        Internals.getMethodBindPtr("GridMap", "map_to_local", 1088329196)

    internal val resourceChangedPtr: VoidPtr =
        Internals.getMethodBindPtr("GridMap", "resource_changed", 968641751)

    internal val setCenterXPtr: VoidPtr =
        Internals.getMethodBindPtr("GridMap", "set_center_x", 2586408642)

    internal val getCenterXPtr: VoidPtr =
        Internals.getMethodBindPtr("GridMap", "get_center_x", 36873697)

    internal val setCenterYPtr: VoidPtr =
        Internals.getMethodBindPtr("GridMap", "set_center_y", 2586408642)

    internal val getCenterYPtr: VoidPtr =
        Internals.getMethodBindPtr("GridMap", "get_center_y", 36873697)

    internal val setCenterZPtr: VoidPtr =
        Internals.getMethodBindPtr("GridMap", "set_center_z", 2586408642)

    internal val getCenterZPtr: VoidPtr =
        Internals.getMethodBindPtr("GridMap", "get_center_z", 36873697)

    internal val clearPtr: VoidPtr = Internals.getMethodBindPtr("GridMap", "clear", 3218959716)

    internal val getUsedCellsPtr: VoidPtr =
        Internals.getMethodBindPtr("GridMap", "get_used_cells", 3995934104)

    internal val getUsedCellsByItemPtr: VoidPtr =
        Internals.getMethodBindPtr("GridMap", "get_used_cells_by_item", 663333327)

    internal val getMeshesPtr: VoidPtr =
        Internals.getMethodBindPtr("GridMap", "get_meshes", 3995934104)

    internal val getBakeMeshesPtr: VoidPtr =
        Internals.getMethodBindPtr("GridMap", "get_bake_meshes", 2915620761)

    internal val getBakeMeshInstancePtr: VoidPtr =
        Internals.getMethodBindPtr("GridMap", "get_bake_mesh_instance", 937000113)

    internal val clearBakedMeshesPtr: VoidPtr =
        Internals.getMethodBindPtr("GridMap", "clear_baked_meshes", 3218959716)

    internal val makeBakedMeshesPtr: VoidPtr =
        Internals.getMethodBindPtr("GridMap", "make_baked_meshes", 3609286057)
  }
}
