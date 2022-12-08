// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.PackedVector2Array
import godot.core.TransferContext
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
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public open class TileData : Object() {
  /**
   *
   */
  public val changed: Signal0 by signal()

  /**
   *
   */
  public var flipH: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_GET_FLIP_H, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_SET_FLIP_H, NIL)
    }

  /**
   *
   */
  public var flipV: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_GET_FLIP_V, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_SET_FLIP_V, NIL)
    }

  /**
   *
   */
  public var transpose: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_GET_TRANSPOSE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_SET_TRANSPOSE, NIL)
    }

  /**
   *
   */
  public var textureOffset: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_GET_TEXTURE_OFFSET,
          VECTOR2I)
      return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_SET_TEXTURE_OFFSET, NIL)
    }

  /**
   *
   */
  public var modulate: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_GET_MODULATE, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_SET_MODULATE, NIL)
    }

  /**
   * The [godot.Material] to use for this [godot.TileData]. This can be a [godot.CanvasItemMaterial] to use the default shader, or a [godot.ShaderMaterial] to use a custom shader.
   */
  public var material: ShaderMaterial?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_GET_MATERIAL, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as ShaderMaterial?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_SET_MATERIAL, NIL)
    }

  /**
   *
   */
  public var zIndex: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_GET_Z_INDEX, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_SET_Z_INDEX, NIL)
    }

  /**
   *
   */
  public var ySortOrigin: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_GET_Y_SORT_ORIGIN, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_SET_Y_SORT_ORIGIN, NIL)
    }

  /**
   *
   */
  public var terrainSet: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_GET_TERRAIN_SET, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_SET_TERRAIN_SET, NIL)
    }

  /**
   *
   */
  public var probability: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_GET_PROBABILITY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_SET_PROBABILITY, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TILEDATA, scriptIndex)
    return true
  }

  /**
   * Sets the occluder for the TileSet occlusion layer with index [layerId].
   */
  public fun setOccluder(layerId: Long, occluderPolygon: OccluderPolygon2D): Unit {
    TransferContext.writeArguments(LONG to layerId, OBJECT to occluderPolygon)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_SET_OCCLUDER, NIL)
  }

  /**
   * Returns the occluder polygon of the tile for the TileSet occlusion layer with index [layerId].
   */
  public fun getOccluder(layerId: Long): OccluderPolygon2D? {
    TransferContext.writeArguments(LONG to layerId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_GET_OCCLUDER, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as OccluderPolygon2D?
  }

  /**
   * Sets the constant linear velocity. This does not move the tile. This linear velocity is applied to objects colliding with this tile. This is useful to create conveyor belts.
   */
  public fun setConstantLinearVelocity(layerId: Long, velocity: Vector2): Unit {
    TransferContext.writeArguments(LONG to layerId, VECTOR2 to velocity)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILEDATA_SET_CONSTANT_LINEAR_VELOCITY, NIL)
  }

  /**
   * Returns the constant linear velocity applied to objects colliding with this tile.
   */
  public fun getConstantLinearVelocity(layerId: Long): Vector2 {
    TransferContext.writeArguments(LONG to layerId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILEDATA_GET_CONSTANT_LINEAR_VELOCITY, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Sets the constant angular velocity. This does not rotate the tile. This angular velocity is applied to objects colliding with this tile.
   */
  public fun setConstantAngularVelocity(layerId: Long, velocity: Double): Unit {
    TransferContext.writeArguments(LONG to layerId, DOUBLE to velocity)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILEDATA_SET_CONSTANT_ANGULAR_VELOCITY, NIL)
  }

  /**
   * Returns the constant angular velocity applied to objects colliding with this tile.
   */
  public fun getConstantAngularVelocity(layerId: Long): Double {
    TransferContext.writeArguments(LONG to layerId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILEDATA_GET_CONSTANT_ANGULAR_VELOCITY, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sets the polygons count for TileSet physics layer with index [layerId].
   */
  public fun setCollisionPolygonsCount(layerId: Long, polygonsCount: Long): Unit {
    TransferContext.writeArguments(LONG to layerId, LONG to polygonsCount)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILEDATA_SET_COLLISION_POLYGONS_COUNT, NIL)
  }

  /**
   * Returns how many polygons the tile has for TileSet physics layer with index [layerId].
   */
  public fun getCollisionPolygonsCount(layerId: Long): Long {
    TransferContext.writeArguments(LONG to layerId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILEDATA_GET_COLLISION_POLYGONS_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Adds a collision polygon to the tile on the given TileSet physics layer.
   */
  public fun addCollisionPolygon(layerId: Long): Unit {
    TransferContext.writeArguments(LONG to layerId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_ADD_COLLISION_POLYGON, NIL)
  }

  /**
   * Removes the polygon at index [polygonIndex] for TileSet physics layer with index [layerId].
   */
  public fun removeCollisionPolygon(layerId: Long, polygonIndex: Long): Unit {
    TransferContext.writeArguments(LONG to layerId, LONG to polygonIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_REMOVE_COLLISION_POLYGON,
        NIL)
  }

  /**
   * Sets the points of the polygon at index [polygonIndex] for TileSet physics layer with index [layerId].
   */
  public fun setCollisionPolygonPoints(
    layerId: Long,
    polygonIndex: Long,
    polygon: PackedVector2Array
  ): Unit {
    TransferContext.writeArguments(LONG to layerId, LONG to polygonIndex, PACKED_VECTOR2_ARRAY to polygon)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILEDATA_SET_COLLISION_POLYGON_POINTS, NIL)
  }

  /**
   * Returns the points of the polygon at index [polygonIndex] for TileSet physics layer with index [layerId].
   */
  public fun getCollisionPolygonPoints(layerId: Long, polygonIndex: Long): PackedVector2Array {
    TransferContext.writeArguments(LONG to layerId, LONG to polygonIndex)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILEDATA_GET_COLLISION_POLYGON_POINTS, PACKED_VECTOR2_ARRAY)
    return TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array
  }

  /**
   * Enables/disables one-way collisions on the polygon at index [polygonIndex] for TileSet physics layer with index [layerId].
   */
  public fun setCollisionPolygonOneWay(
    layerId: Long,
    polygonIndex: Long,
    oneWay: Boolean
  ): Unit {
    TransferContext.writeArguments(LONG to layerId, LONG to polygonIndex, BOOL to oneWay)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILEDATA_SET_COLLISION_POLYGON_ONE_WAY, NIL)
  }

  /**
   * Returns whether one-way collisions are enabled for the polygon at index [polygonIndex] for TileSet physics layer with index [layerId].
   */
  public fun isCollisionPolygonOneWay(layerId: Long, polygonIndex: Long): Boolean {
    TransferContext.writeArguments(LONG to layerId, LONG to polygonIndex)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILEDATA_IS_COLLISION_POLYGON_ONE_WAY, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Enables/disables one-way collisions on the polygon at index [polygonIndex] for TileSet physics layer with index [layerId].
   */
  public fun setCollisionPolygonOneWayMargin(
    layerId: Long,
    polygonIndex: Long,
    oneWayMargin: Double
  ): Unit {
    TransferContext.writeArguments(LONG to layerId, LONG to polygonIndex, DOUBLE to oneWayMargin)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILEDATA_SET_COLLISION_POLYGON_ONE_WAY_MARGIN, NIL)
  }

  /**
   * Returns the one-way margin (for one-way platforms) of the polygon at index [polygonIndex] for TileSet physics layer with index [layerId].
   */
  public fun getCollisionPolygonOneWayMargin(layerId: Long, polygonIndex: Long): Double {
    TransferContext.writeArguments(LONG to layerId, LONG to polygonIndex)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILEDATA_GET_COLLISION_POLYGON_ONE_WAY_MARGIN, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  public fun setPeeringBitTerrain(peeringBit: TileSet.CellNeighbor, terrain: Long): Unit {
    TransferContext.writeArguments(LONG to peeringBit.id, LONG to terrain)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_SET_PEERING_BIT_TERRAIN,
        NIL)
  }

  public fun getPeeringBitTerrain(peeringBit: TileSet.CellNeighbor): Long {
    TransferContext.writeArguments(LONG to peeringBit.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_GET_PEERING_BIT_TERRAIN,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the navigation polygon for the TileSet navigation layer with index [layerId].
   */
  public fun setNavigationPolygon(layerId: Long, navigationPolygon: NavigationPolygon): Unit {
    TransferContext.writeArguments(LONG to layerId, OBJECT to navigationPolygon)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_SET_NAVIGATION_POLYGON,
        NIL)
  }

  /**
   * Returns the navigation polygon of the tile for the TileSet navigation layer with index [layerId].
   */
  public fun getNavigationPolygon(layerId: Long): NavigationPolygon? {
    TransferContext.writeArguments(LONG to layerId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_GET_NAVIGATION_POLYGON,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as NavigationPolygon?
  }

  /**
   * Sets the tile's custom data value for the TileSet custom data layer with name [layerName].
   */
  public fun setCustomData(layerName: String, `value`: Any): Unit {
    TransferContext.writeArguments(STRING to layerName, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_SET_CUSTOM_DATA, NIL)
  }

  /**
   * Returns the custom data value for custom data layer named [layerName].
   */
  public fun getCustomData(layerName: String): Any? {
    TransferContext.writeArguments(STRING to layerName)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEDATA_GET_CUSTOM_DATA, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Sets the tile's custom data value for the TileSet custom data layer with index [layerId].
   */
  public fun setCustomDataByLayerId(layerId: Long, `value`: Any): Unit {
    TransferContext.writeArguments(LONG to layerId, ANY to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILEDATA_SET_CUSTOM_DATA_BY_LAYER_ID, NIL)
  }

  /**
   * Returns the custom data value for custom data layer with index [layerId].
   */
  public fun getCustomDataByLayerId(layerId: Long): Any? {
    TransferContext.writeArguments(LONG to layerId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILEDATA_GET_CUSTOM_DATA_BY_LAYER_ID, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  public companion object
}
