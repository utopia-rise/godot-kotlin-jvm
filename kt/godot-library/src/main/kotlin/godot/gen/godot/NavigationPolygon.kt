// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.PackedInt32Array
import godot.core.PackedVector2Array
import godot.core.Rect2
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A navigation mesh can be created either by baking it with the help of the [NavigationServer2D],
 * or by adding vertices and convex polygon indices arrays manually.
 * To bake a navigation mesh at least one outline needs to be added that defines the outer bounds of
 * the baked area.
 *
 * gdscript:
 * ```gdscript
 * var new_navigation_mesh = NavigationPolygon.new()
 * var bounding_outline = PackedVector2Array([Vector2(0, 0), Vector2(0, 50), Vector2(50, 50),
 * Vector2(50, 0)])
 * new_navigation_mesh.add_outline(bounding_outline)
 * NavigationServer2D.bake_from_source_geometry_data(new_navigation_mesh,
 * NavigationMeshSourceGeometryData2D.new());
 * $NavigationRegion2D.navigation_polygon = new_navigation_mesh
 * ```
 * csharp:
 * ```csharp
 * var newNavigationMesh = new NavigationPolygon();
 * var boundingOutline = new Vector2[] { new Vector2(0, 0), new Vector2(0, 50), new Vector2(50, 50),
 * new Vector2(50, 0) };
 * newNavigationMesh.AddOutline(boundingOutline);
 * NavigationServer2D.BakeFromSourceGeometryData(newNavigationMesh, new
 * NavigationMeshSourceGeometryData2D());
 * GetNode<NavigationRegion2D>("NavigationRegion2D").NavigationPolygon = newNavigationMesh;
 * ```
 *
 * Adding vertices and polygon indices manually.
 *
 * gdscript:
 * ```gdscript
 * var new_navigation_mesh = NavigationPolygon.new()
 * var new_vertices = PackedVector2Array([Vector2(0, 0), Vector2(0, 50), Vector2(50, 50),
 * Vector2(50, 0)])
 * new_navigation_mesh.vertices = new_vertices
 * var new_polygon_indices = PackedInt32Array([0, 1, 2, 3])
 * new_navigation_mesh.add_polygon(new_polygon_indices)
 * $NavigationRegion2D.navigation_polygon = new_navigation_mesh
 * ```
 * csharp:
 * ```csharp
 * var newNavigationMesh = new NavigationPolygon();
 * var newVertices = new Vector2[] { new Vector2(0, 0), new Vector2(0, 50), new Vector2(50, 50), new
 * Vector2(50, 0) };
 * newNavigationMesh.Vertices = newVertices;
 * var newPolygonIndices = new int[] { 0, 1, 2, 3 };
 * newNavigationMesh.AddPolygon(newPolygonIndices);
 * GetNode<NavigationRegion2D>("NavigationRegion2D").NavigationPolygon = newNavigationMesh;
 * ```
 */
@GodotBaseType
public open class NavigationPolygon : Resource() {
  public var vertices: PackedVector2Array
    @JvmName("verticesProperty")
    get() = getVertices()
    @JvmName("verticesProperty")
    set(`value`) {
      setVertices(value)
    }

  /**
   * Determines which type of nodes will be parsed as geometry. See [ParsedGeometryType] for
   * possible values.
   */
  public var parsedGeometryType: ParsedGeometryType
    @JvmName("parsedGeometryTypeProperty")
    get() = getParsedGeometryType()
    @JvmName("parsedGeometryTypeProperty")
    set(`value`) {
      setParsedGeometryType(value)
    }

  /**
   * The physics layers to scan for static colliders.
   * Only used when [parsedGeometryType] is [PARSED_GEOMETRY_STATIC_COLLIDERS] or
   * [PARSED_GEOMETRY_BOTH].
   */
  public var parsedCollisionMask: Long
    @JvmName("parsedCollisionMaskProperty")
    get() = getParsedCollisionMask()
    @JvmName("parsedCollisionMaskProperty")
    set(`value`) {
      setParsedCollisionMask(value)
    }

  /**
   * The source of the geometry used when baking. See [SourceGeometryMode] for possible values.
   */
  public var sourceGeometryMode: SourceGeometryMode
    @JvmName("sourceGeometryModeProperty")
    get() = getSourceGeometryMode()
    @JvmName("sourceGeometryModeProperty")
    set(`value`) {
      setSourceGeometryMode(value)
    }

  /**
   * The group name of nodes that should be parsed for baking source geometry.
   * Only used when [sourceGeometryMode] is [SOURCE_GEOMETRY_GROUPS_WITH_CHILDREN] or
   * [SOURCE_GEOMETRY_GROUPS_EXPLICIT].
   */
  public var sourceGeometryGroupName: StringName
    @JvmName("sourceGeometryGroupNameProperty")
    get() = getSourceGeometryGroupName()
    @JvmName("sourceGeometryGroupNameProperty")
    set(`value`) {
      setSourceGeometryGroupName(value)
    }

  /**
   * The cell size used to rasterize the navigation mesh vertices. Must match with the cell size on
   * the navigation map.
   */
  public var cellSize: Float
    @JvmName("cellSizeProperty")
    get() = getCellSize()
    @JvmName("cellSizeProperty")
    set(`value`) {
      setCellSize(value)
    }

  /**
   * The size of the non-navigable border around the bake bounding area defined by the [bakingRect]
   * [Rect2].
   * In conjunction with the [bakingRect] the border size can be used to bake tile aligned
   * navigation meshes without the tile edges being shrunk by [agentRadius].
   */
  public var borderSize: Float
    @JvmName("borderSizeProperty")
    get() = getBorderSize()
    @JvmName("borderSizeProperty")
    set(`value`) {
      setBorderSize(value)
    }

  /**
   * The distance to erode/shrink the walkable surface when baking the navigation mesh.
   */
  public var agentRadius: Float
    @JvmName("agentRadiusProperty")
    get() = getAgentRadius()
    @JvmName("agentRadiusProperty")
    set(`value`) {
      setAgentRadius(value)
    }

  /**
   * If the baking [Rect2] has an area the navigation mesh baking will be restricted to its
   * enclosing area.
   */
  @CoreTypeLocalCopy
  public var bakingRect: Rect2
    @JvmName("bakingRectProperty")
    get() = getBakingRect()
    @JvmName("bakingRectProperty")
    set(`value`) {
      setBakingRect(value)
    }

  /**
   * The position offset applied to the [bakingRect] [Rect2].
   */
  @CoreTypeLocalCopy
  public var bakingRectOffset: Vector2
    @JvmName("bakingRectOffsetProperty")
    get() = getBakingRectOffset()
    @JvmName("bakingRectOffsetProperty")
    set(`value`) {
      setBakingRectOffset(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_NAVIGATIONPOLYGON, scriptIndex)
  }

  /**
   * If the baking [Rect2] has an area the navigation mesh baking will be restricted to its
   * enclosing area.
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
   * val myCoreType = navigationpolygon.bakingRect
   * //Your changes
   * navigationpolygon.bakingRect = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun bakingRectMutate(block: Rect2.() -> Unit): Rect2 = bakingRect.apply{
      block(this)
      bakingRect = this
  }


  /**
   * The position offset applied to the [bakingRect] [Rect2].
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
   * val myCoreType = navigationpolygon.bakingRectOffset
   * //Your changes
   * navigationpolygon.bakingRectOffset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun bakingRectOffsetMutate(block: Vector2.() -> Unit): Vector2 =
      bakingRectOffset.apply{
      block(this)
      bakingRectOffset = this
  }


  /**
   * Sets the vertices that can be then indexed to create polygons with the [addPolygon] method.
   */
  public fun setVertices(vertices: PackedVector2Array): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to vertices)
    TransferContext.callMethod(rawPtr, MethodBindings.setVerticesPtr, NIL)
  }

  /**
   * Returns a [PackedVector2Array] containing all the vertices being used to create the polygons.
   */
  public fun getVertices(): PackedVector2Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVerticesPtr, PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
  }

  /**
   * Adds a polygon using the indices of the vertices you get when calling [getVertices].
   */
  public fun addPolygon(polygon: PackedInt32Array): Unit {
    TransferContext.writeArguments(PACKED_INT_32_ARRAY to polygon)
    TransferContext.callMethod(rawPtr, MethodBindings.addPolygonPtr, NIL)
  }

  /**
   * Returns the count of all polygons.
   */
  public fun getPolygonCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPolygonCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns a [PackedInt32Array] containing the indices of the vertices of a created polygon.
   */
  public fun getPolygon(idx: Int): PackedInt32Array {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPolygonPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  /**
   * Clears the array of polygons, but it doesn't clear the array of outlines and vertices.
   */
  public fun clearPolygons(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPolygonsPtr, NIL)
  }

  /**
   * Returns the [NavigationMesh] resulting from this navigation polygon. This navigation mesh can
   * be used to update the navigation mesh of a region with the
   * [NavigationServer3D.regionSetNavigationMesh] API directly (as 2D uses the 3D server behind the
   * scene).
   */
  public fun getNavigationMesh(): NavigationMesh? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNavigationMeshPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as NavigationMesh?)
  }

  /**
   * Appends a [PackedVector2Array] that contains the vertices of an outline to the internal array
   * that contains all the outlines.
   */
  public fun addOutline(outline: PackedVector2Array): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to outline)
    TransferContext.callMethod(rawPtr, MethodBindings.addOutlinePtr, NIL)
  }

  /**
   * Adds a [PackedVector2Array] that contains the vertices of an outline to the internal array that
   * contains all the outlines at a fixed position.
   */
  public fun addOutlineAtIndex(outline: PackedVector2Array, index: Int): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to outline, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addOutlineAtIndexPtr, NIL)
  }

  /**
   * Returns the number of outlines that were created in the editor or by script.
   */
  public fun getOutlineCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOutlineCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Changes an outline created in the editor or by script. You have to call
   * [makePolygonsFromOutlines] for the polygons to update.
   */
  public fun setOutline(idx: Int, outline: PackedVector2Array): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), PACKED_VECTOR2_ARRAY to outline)
    TransferContext.callMethod(rawPtr, MethodBindings.setOutlinePtr, NIL)
  }

  /**
   * Returns a [PackedVector2Array] containing the vertices of an outline that was created in the
   * editor or by script.
   */
  public fun getOutline(idx: Int): PackedVector2Array {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getOutlinePtr, PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
  }

  /**
   * Removes an outline created in the editor or by script. You have to call
   * [makePolygonsFromOutlines] for the polygons to update.
   */
  public fun removeOutline(idx: Int): Unit {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeOutlinePtr, NIL)
  }

  /**
   * Clears the array of the outlines, but it doesn't clear the vertices and the polygons that were
   * created by them.
   */
  public fun clearOutlines(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearOutlinesPtr, NIL)
  }

  /**
   * Creates polygons from the outlines added in the editor or by script.
   */
  public fun makePolygonsFromOutlines(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.makePolygonsFromOutlinesPtr, NIL)
  }

  public fun setCellSize(cellSize: Float): Unit {
    TransferContext.writeArguments(DOUBLE to cellSize.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setCellSizePtr, NIL)
  }

  public fun getCellSize(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCellSizePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setBorderSize(borderSize: Float): Unit {
    TransferContext.writeArguments(DOUBLE to borderSize.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setBorderSizePtr, NIL)
  }

  public fun getBorderSize(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBorderSizePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setParsedGeometryType(geometryType: ParsedGeometryType): Unit {
    TransferContext.writeArguments(LONG to geometryType.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setParsedGeometryTypePtr, NIL)
  }

  public fun getParsedGeometryType(): ParsedGeometryType {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getParsedGeometryTypePtr, LONG)
    return NavigationPolygon.ParsedGeometryType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun setParsedCollisionMask(mask: Long): Unit {
    TransferContext.writeArguments(LONG to mask)
    TransferContext.callMethod(rawPtr, MethodBindings.setParsedCollisionMaskPtr, NIL)
  }

  public fun getParsedCollisionMask(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getParsedCollisionMaskPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [parsedCollisionMask], given a
   * [layerNumber] between 1 and 32.
   */
  public fun setParsedCollisionMaskValue(layerNumber: Int, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setParsedCollisionMaskValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [parsedCollisionMask] is enabled, given a
   * [layerNumber] between 1 and 32.
   */
  public fun getParsedCollisionMaskValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getParsedCollisionMaskValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setSourceGeometryMode(geometryMode: SourceGeometryMode): Unit {
    TransferContext.writeArguments(LONG to geometryMode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setSourceGeometryModePtr, NIL)
  }

  public fun getSourceGeometryMode(): SourceGeometryMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSourceGeometryModePtr, LONG)
    return NavigationPolygon.SourceGeometryMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun setSourceGeometryGroupName(groupName: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to groupName)
    TransferContext.callMethod(rawPtr, MethodBindings.setSourceGeometryGroupNamePtr, NIL)
  }

  public fun getSourceGeometryGroupName(): StringName {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSourceGeometryGroupNamePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  public fun setAgentRadius(agentRadius: Float): Unit {
    TransferContext.writeArguments(DOUBLE to agentRadius.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setAgentRadiusPtr, NIL)
  }

  public fun getAgentRadius(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAgentRadiusPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setBakingRect(rect: Rect2): Unit {
    TransferContext.writeArguments(RECT2 to rect)
    TransferContext.callMethod(rawPtr, MethodBindings.setBakingRectPtr, NIL)
  }

  public fun getBakingRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBakingRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2, false) as Rect2)
  }

  public fun setBakingRectOffset(rectOffset: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to rectOffset)
    TransferContext.callMethod(rawPtr, MethodBindings.setBakingRectOffsetPtr, NIL)
  }

  public fun getBakingRectOffset(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBakingRectOffsetPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Clears the internal arrays for vertices and polygon indices.
   */
  public fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  public enum class ParsedGeometryType(
    id: Long,
  ) {
    /**
     * Parses mesh instances as obstruction geometry. This includes [Polygon2D], [MeshInstance2D],
     * [MultiMeshInstance2D], and [TileMap] nodes.
     * Meshes are only parsed when they use a 2D vertices surface format.
     */
    PARSED_GEOMETRY_MESH_INSTANCES(0),
    /**
     * Parses [StaticBody2D] and [TileMap] colliders as obstruction geometry. The collider should be
     * in any of the layers specified by [parsedCollisionMask].
     */
    PARSED_GEOMETRY_STATIC_COLLIDERS(1),
    /**
     * Both [PARSED_GEOMETRY_MESH_INSTANCES] and [PARSED_GEOMETRY_STATIC_COLLIDERS].
     */
    PARSED_GEOMETRY_BOTH(2),
    /**
     * Represents the size of the [ParsedGeometryType] enum.
     */
    PARSED_GEOMETRY_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ParsedGeometryType = entries.single { it.id == `value` }
    }
  }

  public enum class SourceGeometryMode(
    id: Long,
  ) {
    /**
     * Scans the child nodes of the root node recursively for geometry.
     */
    SOURCE_GEOMETRY_ROOT_NODE_CHILDREN(0),
    /**
     * Scans nodes in a group and their child nodes recursively for geometry. The group is specified
     * by [sourceGeometryGroupName].
     */
    SOURCE_GEOMETRY_GROUPS_WITH_CHILDREN(1),
    /**
     * Uses nodes in a group for geometry. The group is specified by [sourceGeometryGroupName].
     */
    SOURCE_GEOMETRY_GROUPS_EXPLICIT(2),
    /**
     * Represents the size of the [SourceGeometryMode] enum.
     */
    SOURCE_GEOMETRY_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): SourceGeometryMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setVerticesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "set_vertices", 1509147220)

    public val getVerticesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_vertices", 2961356807)

    public val addPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "add_polygon", 3614634198)

    public val getPolygonCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_polygon_count", 3905245786)

    public val getPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_polygon", 3668444399)

    public val clearPolygonsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "clear_polygons", 3218959716)

    public val getNavigationMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_navigation_mesh", 330232164)

    public val addOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "add_outline", 1509147220)

    public val addOutlineAtIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "add_outline_at_index", 1569738947)

    public val getOutlineCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_outline_count", 3905245786)

    public val setOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "set_outline", 1201971903)

    public val getOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_outline", 3946907486)

    public val removeOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "remove_outline", 1286410249)

    public val clearOutlinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "clear_outlines", 3218959716)

    public val makePolygonsFromOutlinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "make_polygons_from_outlines", 3218959716)

    public val setCellSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "set_cell_size", 373806689)

    public val getCellSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_cell_size", 1740695150)

    public val setBorderSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "set_border_size", 373806689)

    public val getBorderSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_border_size", 1740695150)

    public val setParsedGeometryTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "set_parsed_geometry_type", 2507971764)

    public val getParsedGeometryTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_parsed_geometry_type", 1073219508)

    public val setParsedCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "set_parsed_collision_mask", 1286410249)

    public val getParsedCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_parsed_collision_mask", 3905245786)

    public val setParsedCollisionMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "set_parsed_collision_mask_value", 300928843)

    public val getParsedCollisionMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_parsed_collision_mask_value", 1116898809)

    public val setSourceGeometryModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "set_source_geometry_mode", 4002316705)

    public val getSourceGeometryModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_source_geometry_mode", 459686762)

    public val setSourceGeometryGroupNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "set_source_geometry_group_name", 3304788590)

    public val getSourceGeometryGroupNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_source_geometry_group_name", 2002593661)

    public val setAgentRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "set_agent_radius", 373806689)

    public val getAgentRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_agent_radius", 1740695150)

    public val setBakingRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "set_baking_rect", 2046264180)

    public val getBakingRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_baking_rect", 1639390495)

    public val setBakingRectOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "set_baking_rect_offset", 743155724)

    public val getBakingRectOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_baking_rect_offset", 3341600327)

    public val clearPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "clear", 3218959716)
  }
}
