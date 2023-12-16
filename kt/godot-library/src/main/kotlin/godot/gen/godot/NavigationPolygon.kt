// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedInt32Array
import godot.core.PackedVector2Array
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A 2D navigation mesh that describes a traversable surface for pathfinding.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/navigation/navigation_using_navigationmeshes.html]($DOCS_URL/tutorials/navigation/navigation_using_navigationmeshes.html)
 *
 * A navigation mesh can be created either by baking it with the help of the [godot.NavigationServer2D], or by adding vertices and convex polygon indices arrays manually.
 *
 * To bake a navigation mesh at least one outline needs to be added that defines the outer bounds of the baked area.
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * var new_navigation_mesh = NavigationPolygon.new()
 *
 * var bounding_outline = PackedVector2Array([godot.Vector2(0, 0), Vector2(0, 50), Vector2(50, 50), Vector2(50, 0)])
 *
 * new_navigation_mesh.add_outline(bounding_outline)
 *
 * NavigationServer2D.bake_from_source_geometry_data(new_navigation_mesh, NavigationMeshSourceGeometryData2D.new());
 *
 * $NavigationRegion2D.navigation_polygon = new_navigation_mesh
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * var newNavigationMesh = new NavigationPolygon();
 *
 * var boundingOutline = new Vector2[] { new Vector2(0, 0), new Vector2(0, 50), new Vector2(50, 50), new Vector2(50, 0) };
 *
 * newNavigationMesh.AddOutline(boundingOutline);
 *
 * NavigationServer2D.BakeFromSourceGeometryData(newNavigationMesh, new NavigationMeshSourceGeometryData2D());
 *
 * GetNode<NavigationRegion2D>("NavigationRegion2D").NavigationPolygon = newNavigationMesh;
 *
 * [/csharp]
 *
 * [/codeblocks]
 *
 * Adding vertices and polygon indices manually.
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * var new_navigation_mesh = NavigationPolygon.new()
 *
 * var new_vertices = PackedVector2Array([godot.Vector2(0, 0), Vector2(0, 50), Vector2(50, 50), Vector2(50, 0)])
 *
 * new_navigation_mesh.vertices = new_vertices
 *
 * var new_polygon_indices = PackedInt32Array([0, 1, 2, 3])
 *
 * new_navigation_mesh.add_polygon(new_polygon_indices)
 *
 * $NavigationRegion2D.navigation_polygon = new_navigation_mesh
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * var newNavigationMesh = new NavigationPolygon();
 *
 * var newVertices = new Vector2[] { new Vector2(0, 0), new Vector2(0, 50), new Vector2(50, 50), new Vector2(50, 0) };
 *
 * newNavigationMesh.Vertices = newVertices;
 *
 * var newPolygonIndices = new int[] { 0, 1, 2, 3 };
 *
 * newNavigationMesh.AddPolygon(newPolygonIndices);
 *
 * GetNode<NavigationRegion2D>("NavigationRegion2D").NavigationPolygon = newNavigationMesh;
 *
 * [/csharp]
 *
 * [/codeblocks]
 */
@GodotBaseType
public open class NavigationPolygon : Resource() {
  public var vertices: PackedVector2Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVerticesPtr, PACKED_VECTOR2_ARRAY)
      return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVerticesPtr, NIL)
    }

  /**
   * Determines which type of nodes will be parsed as geometry. See [enum ParsedGeometryType] for possible values.
   */
  public var parsedGeometryType: ParsedGeometryType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getParsedGeometryTypePtr, LONG)
      return NavigationPolygon.ParsedGeometryType.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setParsedGeometryTypePtr, NIL)
    }

  /**
   * The physics layers to scan for static colliders.
   *
   * Only used when [parsedGeometryType] is [PARSED_GEOMETRY_STATIC_COLLIDERS] or [PARSED_GEOMETRY_BOTH].
   */
  public var parsedCollisionMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getParsedCollisionMaskPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParsedCollisionMaskPtr, NIL)
    }

  /**
   * The source of the geometry used when baking. See [enum SourceGeometryMode] for possible values.
   */
  public var sourceGeometryMode: SourceGeometryMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSourceGeometryModePtr, LONG)
      return NavigationPolygon.SourceGeometryMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setSourceGeometryModePtr, NIL)
    }

  /**
   * The group name of nodes that should be parsed for baking source geometry.
   *
   * Only used when [sourceGeometryMode] is [SOURCE_GEOMETRY_GROUPS_WITH_CHILDREN] or [SOURCE_GEOMETRY_GROUPS_EXPLICIT].
   */
  public var sourceGeometryGroupName: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSourceGeometryGroupNamePtr, STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSourceGeometryGroupNamePtr, NIL)
    }

  /**
   * The cell size used to rasterize the navigation mesh vertices. Must match with the cell size on the navigation map.
   */
  public var cellSize: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCellSizePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setCellSizePtr, NIL)
    }

  /**
   * The distance to erode/shrink the walkable surface when baking the navigation mesh.
   */
  public var agentRadius: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAgentRadiusPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAgentRadiusPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_NAVIGATIONPOLYGON, scriptIndex)
    return true
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
   * Returns a [godot.PackedInt32Array] containing the indices of the vertices of a created polygon.
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
   * Returns the [godot.NavigationMesh] resulting from this navigation polygon. This navigation mesh can be used to update the navigation mesh of a region with the [godot.NavigationServer3D.regionSetNavigationMesh] API directly (as 2D uses the 3D server behind the scene).
   */
  public fun getNavigationMesh(): NavigationMesh? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNavigationMeshPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as NavigationMesh?)
  }

  /**
   * Appends a [godot.PackedVector2Array] that contains the vertices of an outline to the internal array that contains all the outlines.
   */
  public fun addOutline(outline: PackedVector2Array): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to outline)
    TransferContext.callMethod(rawPtr, MethodBindings.addOutlinePtr, NIL)
  }

  /**
   * Adds a [godot.PackedVector2Array] that contains the vertices of an outline to the internal array that contains all the outlines at a fixed position.
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
   * Changes an outline created in the editor or by script. You have to call [makePolygonsFromOutlines] for the polygons to update.
   */
  public fun setOutline(idx: Int, outline: PackedVector2Array): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), PACKED_VECTOR2_ARRAY to outline)
    TransferContext.callMethod(rawPtr, MethodBindings.setOutlinePtr, NIL)
  }

  /**
   * Returns a [godot.PackedVector2Array] containing the vertices of an outline that was created in the editor or by script.
   */
  public fun getOutline(idx: Int): PackedVector2Array {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getOutlinePtr, PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
  }

  /**
   * Removes an outline created in the editor or by script. You have to call [makePolygonsFromOutlines] for the polygons to update.
   */
  public fun removeOutline(idx: Int): Unit {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeOutlinePtr, NIL)
  }

  /**
   * Clears the array of the outlines, but it doesn't clear the vertices and the polygons that were created by them.
   */
  public fun clearOutlines(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearOutlinesPtr, NIL)
  }

  /**
   * Creates polygons from the outlines added in the editor or by script.
   *
   * *Deprecated.* This function is deprecated, and might be removed in a future release. Use [godot.NavigationServer2D.parseSourceGeometryData] and [godot.NavigationServer2D.bakeFromSourceGeometryData] instead.
   */
  public fun makePolygonsFromOutlines(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.makePolygonsFromOutlinesPtr, NIL)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [parsedCollisionMask], given a [layerNumber] between 1 and 32.
   */
  public fun setParsedCollisionMaskValue(layerNumber: Int, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setParsedCollisionMaskValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [parsedCollisionMask] is enabled, given a [layerNumber] between 1 and 32.
   */
  public fun getParsedCollisionMaskValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getParsedCollisionMaskValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
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
     * Parses mesh instances as obstruction geometry. This includes [godot.Polygon2D], [godot.MeshInstance2D], [godot.MultiMeshInstance2D], and [godot.TileMap] nodes.
     *
     * Meshes are only parsed when they use a 2D vertices surface format.
     */
    PARSED_GEOMETRY_MESH_INSTANCES(0),
    /**
     * Parses [godot.StaticBody2D] and [godot.TileMap] colliders as obstruction geometry. The collider should be in any of the layers specified by [parsedCollisionMask].
     */
    PARSED_GEOMETRY_STATIC_COLLIDERS(1),
    /**
     * Both [PARSED_GEOMETRY_MESH_INSTANCES] and [PARSED_GEOMETRY_STATIC_COLLIDERS].
     */
    PARSED_GEOMETRY_BOTH(2),
    /**
     * Represents the size of the [enum ParsedGeometryType] enum.
     */
    PARSED_GEOMETRY_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
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
     * Scans nodes in a group and their child nodes recursively for geometry. The group is specified by [sourceGeometryGroupName].
     */
    SOURCE_GEOMETRY_GROUPS_WITH_CHILDREN(1),
    /**
     * Uses nodes in a group for geometry. The group is specified by [sourceGeometryGroupName].
     */
    SOURCE_GEOMETRY_GROUPS_EXPLICIT(2),
    /**
     * Represents the size of the [enum SourceGeometryMode] enum.
     */
    SOURCE_GEOMETRY_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setVerticesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "set_vertices")

    public val getVerticesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_vertices")

    public val addPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "add_polygon")

    public val getPolygonCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_polygon_count")

    public val getPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_polygon")

    public val clearPolygonsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "clear_polygons")

    public val getNavigationMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_navigation_mesh")

    public val addOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "add_outline")

    public val addOutlineAtIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "add_outline_at_index")

    public val getOutlineCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_outline_count")

    public val setOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "set_outline")

    public val getOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_outline")

    public val removeOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "remove_outline")

    public val clearOutlinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "clear_outlines")

    public val makePolygonsFromOutlinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "make_polygons_from_outlines")

    public val setCellSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "set_cell_size")

    public val getCellSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_cell_size")

    public val setParsedGeometryTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "set_parsed_geometry_type")

    public val getParsedGeometryTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_parsed_geometry_type")

    public val setParsedCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "set_parsed_collision_mask")

    public val getParsedCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_parsed_collision_mask")

    public val setParsedCollisionMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "set_parsed_collision_mask_value")

    public val getParsedCollisionMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_parsed_collision_mask_value")

    public val setSourceGeometryModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "set_source_geometry_mode")

    public val getSourceGeometryModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_source_geometry_mode")

    public val setSourceGeometryGroupNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "set_source_geometry_group_name")

    public val getSourceGeometryGroupNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_source_geometry_group_name")

    public val setAgentRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "set_agent_radius")

    public val getAgentRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPolygon", "get_agent_radius")

    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("NavigationPolygon", "clear")
  }
}
