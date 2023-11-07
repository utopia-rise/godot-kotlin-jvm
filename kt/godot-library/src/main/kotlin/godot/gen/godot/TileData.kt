// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.PackedVector2Array
import godot.core.TypeManager
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR2I
import godot.core.Vector2
import godot.core.Vector2i
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * [TileData] object represents a single tile in a [TileSet]. It is usually edited using the tileset
 * editor, but it can be modified at runtime using [TileMap.TileDataRuntimeUpdate].
 */
@GodotBaseType
public open class TileData : Object() {
  /**
   * Emitted when any of the properties are changed.
   */
  public val changed: Signal0 by signal()

  /**
   * If `true`, the tile will have its texture flipped horizontally.
   */
  public var flipH: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFlipHPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlipHPtr, NIL)
    }

  /**
   * If `true`, the tile will have its texture flipped vertically.
   */
  public var flipV: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFlipVPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlipVPtr, NIL)
    }

  /**
   * If `true`, the tile will display transposed, i.e. with horizontal and vertical texture UVs
   * swapped.
   */
  public var transpose: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTransposePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTransposePtr, NIL)
    }

  /**
   * Offsets the position of where the tile is drawn.
   */
  @CoreTypeLocalCopy
  public var textureOrigin: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextureOriginPtr, VECTOR2I)
      return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextureOriginPtr, NIL)
    }

  /**
   * Color modulation of the tile.
   */
  @CoreTypeLocalCopy
  public var modulate: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getModulatePtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setModulatePtr, NIL)
    }

  /**
   * The [Material] to use for this [TileData]. This can be a [CanvasItemMaterial] to use the
   * default shader, or a [ShaderMaterial] to use a custom shader.
   */
  public var material: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaterialPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Material?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMaterialPtr, NIL)
    }

  /**
   * Ordering index of this tile, relative to [TileMap].
   */
  public var zIndex: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getZIndexPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setZIndexPtr, NIL)
    }

  /**
   * Vertical point of the tile used for determining y-sorted order.
   */
  public var ySortOrigin: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getYSortOriginPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setYSortOriginPtr, NIL)
    }

  /**
   * ID of the terrain set that the tile uses.
   */
  public var terrainSet: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTerrainSetPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setTerrainSetPtr, NIL)
    }

  /**
   * ID of the terrain from the terrain set that the tile uses.
   */
  public var terrain: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTerrainPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setTerrainPtr, NIL)
    }

  /**
   * Relative probability of this tile being selected when drawing a pattern of random tiles.
   */
  public var probability: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getProbabilityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setProbabilityPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TILEDATA, scriptIndex)
    return true
  }

  /**
   * Offsets the position of where the tile is drawn.
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
   * val myCoreType = tiledata.textureOrigin
   * //Your changes
   * tiledata.textureOrigin = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun textureOriginMutate(block: Vector2i.() -> Unit): Vector2i = textureOrigin.apply{
      block(this)
      textureOrigin = this
  }


  /**
   * Color modulation of the tile.
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
   * val myCoreType = tiledata.modulate
   * //Your changes
   * tiledata.modulate = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun modulateMutate(block: Color.() -> Unit): Color = modulate.apply{
      block(this)
      modulate = this
  }


  /**
   * Sets the occluder for the TileSet occlusion layer with index [param layer_id].
   */
  public fun setOccluder(layerId: Int, occluderPolygon: OccluderPolygon2D): Unit {
    TransferContext.writeArguments(LONG to layerId.toLong(), OBJECT to occluderPolygon)
    TransferContext.callMethod(rawPtr, MethodBindings.setOccluderPtr, NIL)
  }

  /**
   * Returns the occluder polygon of the tile for the TileSet occlusion layer with index [param
   * layer_id].
   */
  public fun getOccluder(layerId: Int): OccluderPolygon2D? {
    TransferContext.writeArguments(LONG to layerId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getOccluderPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as OccluderPolygon2D?)
  }

  /**
   * Sets the constant linear velocity. This does not move the tile. This linear velocity is applied
   * to objects colliding with this tile. This is useful to create conveyor belts.
   */
  public fun setConstantLinearVelocity(layerId: Int, velocity: Vector2): Unit {
    TransferContext.writeArguments(LONG to layerId.toLong(), VECTOR2 to velocity)
    TransferContext.callMethod(rawPtr, MethodBindings.setConstantLinearVelocityPtr, NIL)
  }

  /**
   * Returns the constant linear velocity applied to objects colliding with this tile.
   */
  public fun getConstantLinearVelocity(layerId: Int): Vector2 {
    TransferContext.writeArguments(LONG to layerId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getConstantLinearVelocityPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Sets the constant angular velocity. This does not rotate the tile. This angular velocity is
   * applied to objects colliding with this tile.
   */
  public fun setConstantAngularVelocity(layerId: Int, velocity: Float): Unit {
    TransferContext.writeArguments(LONG to layerId.toLong(), DOUBLE to velocity.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setConstantAngularVelocityPtr, NIL)
  }

  /**
   * Returns the constant angular velocity applied to objects colliding with this tile.
   */
  public fun getConstantAngularVelocity(layerId: Int): Float {
    TransferContext.writeArguments(LONG to layerId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getConstantAngularVelocityPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Sets the polygons count for TileSet physics layer with index [param layer_id].
   */
  public fun setCollisionPolygonsCount(layerId: Int, polygonsCount: Int): Unit {
    TransferContext.writeArguments(LONG to layerId.toLong(), LONG to polygonsCount.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setCollisionPolygonsCountPtr, NIL)
  }

  /**
   * Returns how many polygons the tile has for TileSet physics layer with index [param layer_id].
   */
  public fun getCollisionPolygonsCount(layerId: Int): Int {
    TransferContext.writeArguments(LONG to layerId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCollisionPolygonsCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Adds a collision polygon to the tile on the given TileSet physics layer.
   */
  public fun addCollisionPolygon(layerId: Int): Unit {
    TransferContext.writeArguments(LONG to layerId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addCollisionPolygonPtr, NIL)
  }

  /**
   * Removes the polygon at index [param polygon_index] for TileSet physics layer with index [param
   * layer_id].
   */
  public fun removeCollisionPolygon(layerId: Int, polygonIndex: Int): Unit {
    TransferContext.writeArguments(LONG to layerId.toLong(), LONG to polygonIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeCollisionPolygonPtr, NIL)
  }

  /**
   * Sets the points of the polygon at index [param polygon_index] for TileSet physics layer with
   * index [param layer_id].
   */
  public fun setCollisionPolygonPoints(
    layerId: Int,
    polygonIndex: Int,
    polygon: PackedVector2Array,
  ): Unit {
    TransferContext.writeArguments(LONG to layerId.toLong(), LONG to polygonIndex.toLong(), PACKED_VECTOR2_ARRAY to polygon)
    TransferContext.callMethod(rawPtr, MethodBindings.setCollisionPolygonPointsPtr, NIL)
  }

  /**
   * Returns the points of the polygon at index [param polygon_index] for TileSet physics layer with
   * index [param layer_id].
   */
  public fun getCollisionPolygonPoints(layerId: Int, polygonIndex: Int): PackedVector2Array {
    TransferContext.writeArguments(LONG to layerId.toLong(), LONG to polygonIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCollisionPolygonPointsPtr,
        PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
  }

  /**
   * Enables/disables one-way collisions on the polygon at index [param polygon_index] for TileSet
   * physics layer with index [param layer_id].
   */
  public fun setCollisionPolygonOneWay(
    layerId: Int,
    polygonIndex: Int,
    oneWay: Boolean,
  ): Unit {
    TransferContext.writeArguments(LONG to layerId.toLong(), LONG to polygonIndex.toLong(), BOOL to oneWay)
    TransferContext.callMethod(rawPtr, MethodBindings.setCollisionPolygonOneWayPtr, NIL)
  }

  /**
   * Returns whether one-way collisions are enabled for the polygon at index [param polygon_index]
   * for TileSet physics layer with index [param layer_id].
   */
  public fun isCollisionPolygonOneWay(layerId: Int, polygonIndex: Int): Boolean {
    TransferContext.writeArguments(LONG to layerId.toLong(), LONG to polygonIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isCollisionPolygonOneWayPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Enables/disables one-way collisions on the polygon at index [param polygon_index] for TileSet
   * physics layer with index [param layer_id].
   */
  public fun setCollisionPolygonOneWayMargin(
    layerId: Int,
    polygonIndex: Int,
    oneWayMargin: Float,
  ): Unit {
    TransferContext.writeArguments(LONG to layerId.toLong(), LONG to polygonIndex.toLong(), DOUBLE to oneWayMargin.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setCollisionPolygonOneWayMarginPtr, NIL)
  }

  /**
   * Returns the one-way margin (for one-way platforms) of the polygon at index [param
   * polygon_index] for TileSet physics layer with index [param layer_id].
   */
  public fun getCollisionPolygonOneWayMargin(layerId: Int, polygonIndex: Int): Float {
    TransferContext.writeArguments(LONG to layerId.toLong(), LONG to polygonIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCollisionPolygonOneWayMarginPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Sets the tile's terrain bit for the given [param peering_bit] direction.
   */
  public fun setTerrainPeeringBit(peeringBit: TileSet.CellNeighbor, terrain: Int): Unit {
    TransferContext.writeArguments(LONG to peeringBit.id, LONG to terrain.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setTerrainPeeringBitPtr, NIL)
  }

  /**
   * Returns the tile's terrain bit for the given [param peering_bit] direction.
   */
  public fun getTerrainPeeringBit(peeringBit: TileSet.CellNeighbor): Int {
    TransferContext.writeArguments(LONG to peeringBit.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getTerrainPeeringBitPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the navigation polygon for the TileSet navigation layer with index [param layer_id].
   */
  public fun setNavigationPolygon(layerId: Int, navigationPolygon: NavigationPolygon): Unit {
    TransferContext.writeArguments(LONG to layerId.toLong(), OBJECT to navigationPolygon)
    TransferContext.callMethod(rawPtr, MethodBindings.setNavigationPolygonPtr, NIL)
  }

  /**
   * Returns the navigation polygon of the tile for the TileSet navigation layer with index [param
   * layer_id].
   */
  public fun getNavigationPolygon(layerId: Int): NavigationPolygon? {
    TransferContext.writeArguments(LONG to layerId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getNavigationPolygonPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as NavigationPolygon?)
  }

  /**
   * Sets the tile's custom data value for the TileSet custom data layer with name [param
   * layer_name].
   */
  public fun setCustomData(layerName: String, `value`: Any?): Unit {
    TransferContext.writeArguments(STRING to layerName, ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setCustomDataPtr, NIL)
  }

  /**
   * Returns the custom data value for custom data layer named [param layer_name].
   */
  public fun getCustomData(layerName: String): Any? {
    TransferContext.writeArguments(STRING to layerName)
    TransferContext.callMethod(rawPtr, MethodBindings.getCustomDataPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Sets the tile's custom data value for the TileSet custom data layer with index [param
   * layer_id].
   */
  public fun setCustomDataByLayerId(layerId: Int, `value`: Any?): Unit {
    TransferContext.writeArguments(LONG to layerId.toLong(), ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setCustomDataByLayerIdPtr, NIL)
  }

  /**
   * Returns the custom data value for custom data layer with index [param layer_id].
   */
  public fun getCustomDataByLayerId(layerId: Int): Any? {
    TransferContext.writeArguments(LONG to layerId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCustomDataByLayerIdPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public companion object

  internal object MethodBindings {
    public val setFlipHPtr: VoidPtr = TypeManager.getMethodBindPtr("TileData", "set_flip_h")

    public val getFlipHPtr: VoidPtr = TypeManager.getMethodBindPtr("TileData", "get_flip_h")

    public val setFlipVPtr: VoidPtr = TypeManager.getMethodBindPtr("TileData", "set_flip_v")

    public val getFlipVPtr: VoidPtr = TypeManager.getMethodBindPtr("TileData", "get_flip_v")

    public val setTransposePtr: VoidPtr = TypeManager.getMethodBindPtr("TileData", "set_transpose")

    public val getTransposePtr: VoidPtr = TypeManager.getMethodBindPtr("TileData", "get_transpose")

    public val setMaterialPtr: VoidPtr = TypeManager.getMethodBindPtr("TileData", "set_material")

    public val getMaterialPtr: VoidPtr = TypeManager.getMethodBindPtr("TileData", "get_material")

    public val setTextureOriginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "set_texture_origin")

    public val getTextureOriginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "get_texture_origin")

    public val setModulatePtr: VoidPtr = TypeManager.getMethodBindPtr("TileData", "set_modulate")

    public val getModulatePtr: VoidPtr = TypeManager.getMethodBindPtr("TileData", "get_modulate")

    public val setZIndexPtr: VoidPtr = TypeManager.getMethodBindPtr("TileData", "set_z_index")

    public val getZIndexPtr: VoidPtr = TypeManager.getMethodBindPtr("TileData", "get_z_index")

    public val setYSortOriginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "set_y_sort_origin")

    public val getYSortOriginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "get_y_sort_origin")

    public val setOccluderPtr: VoidPtr = TypeManager.getMethodBindPtr("TileData", "set_occluder")

    public val getOccluderPtr: VoidPtr = TypeManager.getMethodBindPtr("TileData", "get_occluder")

    public val setConstantLinearVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "set_constant_linear_velocity")

    public val getConstantLinearVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "get_constant_linear_velocity")

    public val setConstantAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "set_constant_angular_velocity")

    public val getConstantAngularVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "get_constant_angular_velocity")

    public val setCollisionPolygonsCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "set_collision_polygons_count")

    public val getCollisionPolygonsCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "get_collision_polygons_count")

    public val addCollisionPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "add_collision_polygon")

    public val removeCollisionPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "remove_collision_polygon")

    public val setCollisionPolygonPointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "set_collision_polygon_points")

    public val getCollisionPolygonPointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "get_collision_polygon_points")

    public val setCollisionPolygonOneWayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "set_collision_polygon_one_way")

    public val isCollisionPolygonOneWayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "is_collision_polygon_one_way")

    public val setCollisionPolygonOneWayMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "set_collision_polygon_one_way_margin")

    public val getCollisionPolygonOneWayMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "get_collision_polygon_one_way_margin")

    public val setTerrainSetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "set_terrain_set")

    public val getTerrainSetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "get_terrain_set")

    public val setTerrainPtr: VoidPtr = TypeManager.getMethodBindPtr("TileData", "set_terrain")

    public val getTerrainPtr: VoidPtr = TypeManager.getMethodBindPtr("TileData", "get_terrain")

    public val setTerrainPeeringBitPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "set_terrain_peering_bit")

    public val getTerrainPeeringBitPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "get_terrain_peering_bit")

    public val setNavigationPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "set_navigation_polygon")

    public val getNavigationPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "get_navigation_polygon")

    public val setProbabilityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "set_probability")

    public val getProbabilityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "get_probability")

    public val setCustomDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "set_custom_data")

    public val getCustomDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "get_custom_data")

    public val setCustomDataByLayerIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "set_custom_data_by_layer_id")

    public val getCustomDataByLayerIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileData", "get_custom_data_by_layer_id")
  }
}
