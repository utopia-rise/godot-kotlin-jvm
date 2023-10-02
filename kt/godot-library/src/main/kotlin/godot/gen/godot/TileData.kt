// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.PackedVector2Array
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
 * Settings for a single tile in a [godot.TileSet].
 *
 * [godot.TileData] object represents a single tile in a [godot.TileSet]. It is usually edited using the tileset editor, but it can be modified at runtime using [godot.TileMap.TileDataRuntimeUpdate].
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
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_GET_FLIP_H, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_SET_FLIP_H, NIL)
    }

  /**
   * If `true`, the tile will have its texture flipped vertically.
   */
  public var flipV: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_GET_FLIP_V, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_SET_FLIP_V, NIL)
    }

  /**
   * If `true`, the tile will display transposed, i.e. with horizontal and vertical texture UVs swapped.
   */
  public var transpose: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_GET_TRANSPOSE, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_SET_TRANSPOSE, NIL)
    }

  /**
   * Offsets the position of where the tile is drawn.
   */
  public var textureOrigin: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_GET_TEXTURE_ORIGIN,
          VECTOR2I)
      return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_SET_TEXTURE_ORIGIN, NIL)
    }

  /**
   * Color modulation of the tile.
   */
  public var modulate: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_GET_MODULATE, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_SET_MODULATE, NIL)
    }

  /**
   * The [godot.Material] to use for this [godot.TileData]. This can be a [godot.CanvasItemMaterial] to use the default shader, or a [godot.ShaderMaterial] to use a custom shader.
   */
  public var material: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_GET_MATERIAL, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Material?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_SET_MATERIAL, NIL)
    }

  /**
   * Ordering index of this tile, relative to [godot.TileMap].
   */
  public var zIndex: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_GET_Z_INDEX, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_SET_Z_INDEX, NIL)
    }

  /**
   * Vertical point of the tile used for determining y-sorted order.
   */
  public var ySortOrigin: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_GET_Y_SORT_ORIGIN, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_SET_Y_SORT_ORIGIN, NIL)
    }

  /**
   * ID of the terrain set that the tile uses.
   */
  public var terrainSet: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_GET_TERRAIN_SET, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_SET_TERRAIN_SET, NIL)
    }

  /**
   * ID of the terrain from the terrain set that the tile uses.
   */
  public var terrain: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_GET_TERRAIN, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_SET_TERRAIN, NIL)
    }

  /**
   * Relative probability of this tile being selected when drawing a pattern of random tiles.
   */
  public var probability: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_GET_PROBABILITY, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_SET_PROBABILITY, NIL)
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
   * Sets the occluder for the TileSet occlusion layer with index [layerId].
   */
  public fun setOccluder(layerId: Int, occluderPolygon: OccluderPolygon2D): Unit {
    TransferContext.writeArguments(LONG to layerId.toLong(), OBJECT to occluderPolygon)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_SET_OCCLUDER, NIL)
  }

  /**
   * Returns the occluder polygon of the tile for the TileSet occlusion layer with index [layerId].
   */
  public fun getOccluder(layerId: Int): OccluderPolygon2D? {
    TransferContext.writeArguments(LONG to layerId.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_GET_OCCLUDER, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as OccluderPolygon2D?)
  }

  /**
   * Sets the constant linear velocity. This does not move the tile. This linear velocity is applied to objects colliding with this tile. This is useful to create conveyor belts.
   */
  public fun setConstantLinearVelocity(layerId: Int, velocity: Vector2): Unit {
    TransferContext.writeArguments(LONG to layerId.toLong(), VECTOR2 to velocity)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILEDATA_SET_CONSTANT_LINEAR_VELOCITY, NIL)
  }

  /**
   * Returns the constant linear velocity applied to objects colliding with this tile.
   */
  public fun getConstantLinearVelocity(layerId: Int): Vector2 {
    TransferContext.writeArguments(LONG to layerId.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILEDATA_GET_CONSTANT_LINEAR_VELOCITY, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Sets the constant angular velocity. This does not rotate the tile. This angular velocity is applied to objects colliding with this tile.
   */
  public fun setConstantAngularVelocity(layerId: Int, velocity: Float): Unit {
    TransferContext.writeArguments(LONG to layerId.toLong(), DOUBLE to velocity.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILEDATA_SET_CONSTANT_ANGULAR_VELOCITY, NIL)
  }

  /**
   * Returns the constant angular velocity applied to objects colliding with this tile.
   */
  public fun getConstantAngularVelocity(layerId: Int): Float {
    TransferContext.writeArguments(LONG to layerId.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILEDATA_GET_CONSTANT_ANGULAR_VELOCITY, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Sets the polygons count for TileSet physics layer with index [layerId].
   */
  public fun setCollisionPolygonsCount(layerId: Int, polygonsCount: Int): Unit {
    TransferContext.writeArguments(LONG to layerId.toLong(), LONG to polygonsCount.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILEDATA_SET_COLLISION_POLYGONS_COUNT, NIL)
  }

  /**
   * Returns how many polygons the tile has for TileSet physics layer with index [layerId].
   */
  public fun getCollisionPolygonsCount(layerId: Int): Int {
    TransferContext.writeArguments(LONG to layerId.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILEDATA_GET_COLLISION_POLYGONS_COUNT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Adds a collision polygon to the tile on the given TileSet physics layer.
   */
  public fun addCollisionPolygon(layerId: Int): Unit {
    TransferContext.writeArguments(LONG to layerId.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_ADD_COLLISION_POLYGON, NIL)
  }

  /**
   * Removes the polygon at index [polygonIndex] for TileSet physics layer with index [layerId].
   */
  public fun removeCollisionPolygon(layerId: Int, polygonIndex: Int): Unit {
    TransferContext.writeArguments(LONG to layerId.toLong(), LONG to polygonIndex.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_REMOVE_COLLISION_POLYGON,
        NIL)
  }

  /**
   * Sets the points of the polygon at index [polygonIndex] for TileSet physics layer with index [layerId].
   */
  public fun setCollisionPolygonPoints(
    layerId: Int,
    polygonIndex: Int,
    polygon: PackedVector2Array,
  ): Unit {
    TransferContext.writeArguments(LONG to layerId.toLong(), LONG to polygonIndex.toLong(), PACKED_VECTOR2_ARRAY to polygon)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILEDATA_SET_COLLISION_POLYGON_POINTS, NIL)
  }

  /**
   * Returns the points of the polygon at index [polygonIndex] for TileSet physics layer with index [layerId].
   */
  public fun getCollisionPolygonPoints(layerId: Int, polygonIndex: Int): PackedVector2Array {
    TransferContext.writeArguments(LONG to layerId.toLong(), LONG to polygonIndex.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILEDATA_GET_COLLISION_POLYGON_POINTS, PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
  }

  /**
   * Enables/disables one-way collisions on the polygon at index [polygonIndex] for TileSet physics layer with index [layerId].
   */
  public fun setCollisionPolygonOneWay(
    layerId: Int,
    polygonIndex: Int,
    oneWay: Boolean,
  ): Unit {
    TransferContext.writeArguments(LONG to layerId.toLong(), LONG to polygonIndex.toLong(), BOOL to oneWay)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILEDATA_SET_COLLISION_POLYGON_ONE_WAY, NIL)
  }

  /**
   * Returns whether one-way collisions are enabled for the polygon at index [polygonIndex] for TileSet physics layer with index [layerId].
   */
  public fun isCollisionPolygonOneWay(layerId: Int, polygonIndex: Int): Boolean {
    TransferContext.writeArguments(LONG to layerId.toLong(), LONG to polygonIndex.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILEDATA_IS_COLLISION_POLYGON_ONE_WAY, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Enables/disables one-way collisions on the polygon at index [polygonIndex] for TileSet physics layer with index [layerId].
   */
  public fun setCollisionPolygonOneWayMargin(
    layerId: Int,
    polygonIndex: Int,
    oneWayMargin: Float,
  ): Unit {
    TransferContext.writeArguments(LONG to layerId.toLong(), LONG to polygonIndex.toLong(), DOUBLE to oneWayMargin.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILEDATA_SET_COLLISION_POLYGON_ONE_WAY_MARGIN, NIL)
  }

  /**
   * Returns the one-way margin (for one-way platforms) of the polygon at index [polygonIndex] for TileSet physics layer with index [layerId].
   */
  public fun getCollisionPolygonOneWayMargin(layerId: Int, polygonIndex: Int): Float {
    TransferContext.writeArguments(LONG to layerId.toLong(), LONG to polygonIndex.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILEDATA_GET_COLLISION_POLYGON_ONE_WAY_MARGIN, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Sets the tile's terrain bit for the given [peeringBit] direction.
   */
  public fun setTerrainPeeringBit(peeringBit: TileSet.CellNeighbor, terrain: Int): Unit {
    TransferContext.writeArguments(LONG to peeringBit.id, LONG to terrain.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_SET_TERRAIN_PEERING_BIT,
        NIL)
  }

  /**
   * Returns the tile's terrain bit for the given [peeringBit] direction.
   */
  public fun getTerrainPeeringBit(peeringBit: TileSet.CellNeighbor): Int {
    TransferContext.writeArguments(LONG to peeringBit.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_GET_TERRAIN_PEERING_BIT,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the navigation polygon for the TileSet navigation layer with index [layerId].
   */
  public fun setNavigationPolygon(layerId: Int, navigationPolygon: NavigationPolygon): Unit {
    TransferContext.writeArguments(LONG to layerId.toLong(), OBJECT to navigationPolygon)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_SET_NAVIGATION_POLYGON,
        NIL)
  }

  /**
   * Returns the navigation polygon of the tile for the TileSet navigation layer with index [layerId].
   */
  public fun getNavigationPolygon(layerId: Int): NavigationPolygon? {
    TransferContext.writeArguments(LONG to layerId.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_GET_NAVIGATION_POLYGON,
        OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as NavigationPolygon?)
  }

  /**
   * Sets the tile's custom data value for the TileSet custom data layer with name [layerName].
   */
  public fun setCustomData(layerName: String, `value`: Any?): Unit {
    TransferContext.writeArguments(STRING to layerName, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_SET_CUSTOM_DATA, NIL)
  }

  /**
   * Returns the custom data value for custom data layer named [layerName].
   */
  public fun getCustomData(layerName: String): Any? {
    TransferContext.writeArguments(STRING to layerName)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_GET_CUSTOM_DATA, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Sets the tile's custom data value for the TileSet custom data layer with index [layerId].
   */
  public fun setCustomDataByLayerId(layerId: Int, `value`: Any?): Unit {
    TransferContext.writeArguments(LONG to layerId.toLong(), ANY to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILEDATA_SET_CUSTOM_DATA_BY_LAYER_ID, NIL)
  }

  /**
   * Returns the custom data value for custom data layer with index [layerId].
   */
  public fun getCustomDataByLayerId(layerId: Int): Any? {
    TransferContext.writeArguments(LONG to layerId.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILEDATA_GET_CUSTOM_DATA_BY_LAYER_ID, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public companion object
}
