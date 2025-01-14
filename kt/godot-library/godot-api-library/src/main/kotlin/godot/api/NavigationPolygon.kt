// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.PackedInt32Array
import godot.core.PackedVector2Array
import godot.core.Rect2
import godot.core.StringName
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_INT_32_ARRAY
import godot.core.VariantParser.PACKED_VECTOR2_ARRAY
import godot.core.VariantParser.RECT2
import godot.core.VariantParser.STRING_NAME
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINECLASS_NAVIGATIONPOLYGON: Int = 401

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
  public final inline var vertices: PackedVector2Array
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
  public final inline var parsedGeometryType: ParsedGeometryType
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
  public final inline var parsedCollisionMask: Long
    @JvmName("parsedCollisionMaskProperty")
    get() = getParsedCollisionMask()
    @JvmName("parsedCollisionMaskProperty")
    set(`value`) {
      setParsedCollisionMask(value)
    }

  /**
   * The source of the geometry used when baking. See [SourceGeometryMode] for possible values.
   */
  public final inline var sourceGeometryMode: SourceGeometryMode
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
  public final inline var sourceGeometryGroupName: StringName
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
  public final inline var cellSize: Float
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
  public final inline var borderSize: Float
    @JvmName("borderSizeProperty")
    get() = getBorderSize()
    @JvmName("borderSizeProperty")
    set(`value`) {
      setBorderSize(value)
    }

  /**
   * The distance to erode/shrink the walkable surface when baking the navigation mesh.
   */
  public final inline var agentRadius: Float
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
  public final inline var bakingRect: Rect2
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
  public final inline var bakingRectOffset: Vector2
    @JvmName("bakingRectOffsetProperty")
    get() = getBakingRectOffset()
    @JvmName("bakingRectOffsetProperty")
    set(`value`) {
      setBakingRectOffset(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_NAVIGATIONPOLYGON, scriptIndex)
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
  public final fun bakingRectMutate(block: Rect2.() -> Unit): Rect2 = bakingRect.apply{
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
  public final fun bakingRectOffsetMutate(block: Vector2.() -> Unit): Vector2 =
      bakingRectOffset.apply{
      block(this)
      bakingRectOffset = this
  }


  /**
   * Sets the vertices that can be then indexed to create polygons with the [addPolygon] method.
   */
  public final fun setVertices(vertices: PackedVector2Array): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to vertices)
    TransferContext.callMethod(ptr, MethodBindings.setVerticesPtr, NIL)
  }

  /**
   * Returns a [PackedVector2Array] containing all the vertices being used to create the polygons.
   */
  public final fun getVertices(): PackedVector2Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVerticesPtr, PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY) as PackedVector2Array)
  }

  /**
   * Adds a polygon using the indices of the vertices you get when calling [getVertices].
   */
  public final fun addPolygon(polygon: PackedInt32Array): Unit {
    TransferContext.writeArguments(PACKED_INT_32_ARRAY to polygon)
    TransferContext.callMethod(ptr, MethodBindings.addPolygonPtr, NIL)
  }

  /**
   * Returns the count of all polygons.
   */
  public final fun getPolygonCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPolygonCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns a [PackedInt32Array] containing the indices of the vertices of a created polygon.
   */
  public final fun getPolygon(idx: Int): PackedInt32Array {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getPolygonPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  /**
   * Clears the array of polygons, but it doesn't clear the array of outlines and vertices.
   */
  public final fun clearPolygons(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearPolygonsPtr, NIL)
  }

  /**
   * Returns the [NavigationMesh] resulting from this navigation polygon. This navigation mesh can
   * be used to update the navigation mesh of a region with the
   * [NavigationServer3D.regionSetNavigationMesh] API directly (as 2D uses the 3D server behind the
   * scene).
   */
  public final fun getNavigationMesh(): NavigationMesh? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getNavigationMeshPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as NavigationMesh?)
  }

  /**
   * Appends a [PackedVector2Array] that contains the vertices of an outline to the internal array
   * that contains all the outlines.
   */
  public final fun addOutline(outline: PackedVector2Array): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to outline)
    TransferContext.callMethod(ptr, MethodBindings.addOutlinePtr, NIL)
  }

  /**
   * Adds a [PackedVector2Array] that contains the vertices of an outline to the internal array that
   * contains all the outlines at a fixed position.
   */
  public final fun addOutlineAtIndex(outline: PackedVector2Array, index: Int): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to outline, LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.addOutlineAtIndexPtr, NIL)
  }

  /**
   * Returns the number of outlines that were created in the editor or by script.
   */
  public final fun getOutlineCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOutlineCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Changes an outline created in the editor or by script. You have to call
   * [makePolygonsFromOutlines] for the polygons to update.
   */
  public final fun setOutline(idx: Int, outline: PackedVector2Array): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), PACKED_VECTOR2_ARRAY to outline)
    TransferContext.callMethod(ptr, MethodBindings.setOutlinePtr, NIL)
  }

  /**
   * Returns a [PackedVector2Array] containing the vertices of an outline that was created in the
   * editor or by script.
   */
  public final fun getOutline(idx: Int): PackedVector2Array {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getOutlinePtr, PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY) as PackedVector2Array)
  }

  /**
   * Removes an outline created in the editor or by script. You have to call
   * [makePolygonsFromOutlines] for the polygons to update.
   */
  public final fun removeOutline(idx: Int): Unit {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.removeOutlinePtr, NIL)
  }

  /**
   * Clears the array of the outlines, but it doesn't clear the vertices and the polygons that were
   * created by them.
   */
  public final fun clearOutlines(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearOutlinesPtr, NIL)
  }

  /**
   * Creates polygons from the outlines added in the editor or by script.
   */
  public final fun makePolygonsFromOutlines(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.makePolygonsFromOutlinesPtr, NIL)
  }

  public final fun setCellSize(cellSize: Float): Unit {
    TransferContext.writeArguments(DOUBLE to cellSize.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setCellSizePtr, NIL)
  }

  public final fun getCellSize(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCellSizePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setBorderSize(borderSize: Float): Unit {
    TransferContext.writeArguments(DOUBLE to borderSize.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setBorderSizePtr, NIL)
  }

  public final fun getBorderSize(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBorderSizePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setParsedGeometryType(geometryType: ParsedGeometryType): Unit {
    TransferContext.writeArguments(LONG to geometryType.id)
    TransferContext.callMethod(ptr, MethodBindings.setParsedGeometryTypePtr, NIL)
  }

  public final fun getParsedGeometryType(): ParsedGeometryType {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getParsedGeometryTypePtr, LONG)
    return NavigationPolygon.ParsedGeometryType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setParsedCollisionMask(mask: Long): Unit {
    TransferContext.writeArguments(LONG to mask)
    TransferContext.callMethod(ptr, MethodBindings.setParsedCollisionMaskPtr, NIL)
  }

  public final fun getParsedCollisionMask(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getParsedCollisionMaskPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [parsedCollisionMask], given a
   * [layerNumber] between 1 and 32.
   */
  public final fun setParsedCollisionMaskValue(layerNumber: Int, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(ptr, MethodBindings.setParsedCollisionMaskValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [parsedCollisionMask] is enabled, given a
   * [layerNumber] between 1 and 32.
   */
  public final fun getParsedCollisionMaskValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getParsedCollisionMaskValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setSourceGeometryMode(geometryMode: SourceGeometryMode): Unit {
    TransferContext.writeArguments(LONG to geometryMode.id)
    TransferContext.callMethod(ptr, MethodBindings.setSourceGeometryModePtr, NIL)
  }

  public final fun getSourceGeometryMode(): SourceGeometryMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSourceGeometryModePtr, LONG)
    return NavigationPolygon.SourceGeometryMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setSourceGeometryGroupName(groupName: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to groupName)
    TransferContext.callMethod(ptr, MethodBindings.setSourceGeometryGroupNamePtr, NIL)
  }

  public final fun getSourceGeometryGroupName(): StringName {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSourceGeometryGroupNamePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  public final fun setAgentRadius(agentRadius: Float): Unit {
    TransferContext.writeArguments(DOUBLE to agentRadius.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setAgentRadiusPtr, NIL)
  }

  public final fun getAgentRadius(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAgentRadiusPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setBakingRect(rect: Rect2): Unit {
    TransferContext.writeArguments(RECT2 to rect)
    TransferContext.callMethod(ptr, MethodBindings.setBakingRectPtr, NIL)
  }

  public final fun getBakingRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBakingRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2) as Rect2)
  }

  public final fun setBakingRectOffset(rectOffset: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to rectOffset)
    TransferContext.callMethod(ptr, MethodBindings.setBakingRectOffsetPtr, NIL)
  }

  public final fun getBakingRectOffset(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBakingRectOffsetPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Clears the internal arrays for vertices and polygon indices.
   */
  public final fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearPtr, NIL)
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

  public object MethodBindings {
    internal val setVerticesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "set_vertices", 1509147220)

    internal val getVerticesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_vertices", 2961356807)

    internal val addPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "add_polygon", 3614634198)

    internal val getPolygonCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_polygon_count", 3905245786)

    internal val getPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_polygon", 3668444399)

    internal val clearPolygonsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "clear_polygons", 3218959716)

    internal val getNavigationMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_navigation_mesh", 330232164)

    internal val addOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "add_outline", 1509147220)

    internal val addOutlineAtIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "add_outline_at_index", 1569738947)

    internal val getOutlineCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_outline_count", 3905245786)

    internal val setOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "set_outline", 1201971903)

    internal val getOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_outline", 3946907486)

    internal val removeOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "remove_outline", 1286410249)

    internal val clearOutlinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "clear_outlines", 3218959716)

    internal val makePolygonsFromOutlinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "make_polygons_from_outlines", 3218959716)

    internal val setCellSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "set_cell_size", 373806689)

    internal val getCellSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_cell_size", 1740695150)

    internal val setBorderSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "set_border_size", 373806689)

    internal val getBorderSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_border_size", 1740695150)

    internal val setParsedGeometryTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "set_parsed_geometry_type", 2507971764)

    internal val getParsedGeometryTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_parsed_geometry_type", 1073219508)

    internal val setParsedCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "set_parsed_collision_mask", 1286410249)

    internal val getParsedCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_parsed_collision_mask", 3905245786)

    internal val setParsedCollisionMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "set_parsed_collision_mask_value", 300928843)

    internal val getParsedCollisionMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_parsed_collision_mask_value", 1116898809)

    internal val setSourceGeometryModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "set_source_geometry_mode", 4002316705)

    internal val getSourceGeometryModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_source_geometry_mode", 459686762)

    internal val setSourceGeometryGroupNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "set_source_geometry_group_name", 3304788590)

    internal val getSourceGeometryGroupNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_source_geometry_group_name", 2002593661)

    internal val setAgentRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "set_agent_radius", 373806689)

    internal val getAgentRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_agent_radius", 1740695150)

    internal val setBakingRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "set_baking_rect", 2046264180)

    internal val getBakingRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_baking_rect", 1639390495)

    internal val setBakingRectOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "set_baking_rect_offset", 743155724)

    internal val getBakingRectOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_baking_rect_offset", 3341600327)

    internal val clearPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "clear", 3218959716)
  }
}
