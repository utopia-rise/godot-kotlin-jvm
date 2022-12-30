// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.VariantArray
import godot.core.VariantType
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2I
import godot.core.Vector2i
import godot.core.memory.TransferContext
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Tile library for tilemaps.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/113](https://godotengine.org/asset-library/asset/113)
 *
 * A TileSet is a library of tiles for a [godot.TileMap]. A TileSet handles a list of [godot.TileSetSource], each of them storing a set of tiles.
 *
 * Tiles can either be from a [godot.TileSetAtlasSource], that render tiles out of a texture with support for physics, navigation, etc... or from a [godot.TileSetScenesCollectionSource] which exposes scene-based tiles.
 *
 * Tiles are referenced by using three IDs: their source ID, their atlas coordinates ID and their alternative tile ID.
 *
 * A TileSet can be configured so that its tiles expose more or less properties. To do so, the TileSet resources uses property layers, that you can add or remove depending on your needs.
 *
 * For example, adding a physics layer allows giving collision shapes to your tiles. Each layer having dedicated properties (physics layer an mask), you may add several TileSet physics layers for each type of collision you need.
 *
 * See the functions to add new layers for more information.
 */
@GodotBaseType
public open class TileSet : Resource() {
  /**
   * The tile shape.
   */
  public var tileShape: TileShape
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_GET_TILE_SHAPE, LONG)
      return TileSet.TileShape.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_SET_TILE_SHAPE, NIL)
    }

  /**
   * For all half-offset shapes (Isometric, Hexagonal and Half-Offset square), changes the way tiles are indexed in the TileMap grid.
   */
  public var tileLayout: TileLayout
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_GET_TILE_LAYOUT, LONG)
      return TileSet.TileLayout.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_SET_TILE_LAYOUT, NIL)
    }

  /**
   * For all half-offset shapes (Isometric, Hexagonal and Half-Offset square), determines the offset axis.
   */
  public var tileOffsetAxis: TileOffsetAxis
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_GET_TILE_OFFSET_AXIS,
          LONG)
      return TileSet.TileOffsetAxis.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_SET_TILE_OFFSET_AXIS, NIL)
    }

  /**
   * The tile size, in pixels. For all tile shapes, this size corresponds to the encompassing rectangle of the tile shape. This is thus the minimal cell size required in an atlas.
   */
  public var tileSize: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_GET_TILE_SIZE, VECTOR2I)
      return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_SET_TILE_SIZE, NIL)
    }

  /**
   * Enables/Disable uv clipping when rendering the tiles.
   */
  public var uvClipping: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_IS_UV_CLIPPING, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_SET_UV_CLIPPING, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TILESET, scriptIndex)
    return true
  }

  /**
   * Returns a new unused source ID. This generated ID is the same that a call to `add_source` would return.
   */
  public fun getNextSourceId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_GET_NEXT_SOURCE_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Adds a [godot.TileSetSource] to the TileSet. If [atlasSourceIdOverride] is not -1, also set its source ID. Otherwise, a unique identifier is automatically generated.
   *
   * The function returns the added source source ID or -1 if the source could not be added.
   */
  public fun addSource(source: TileSetSource, atlasSourceIdOverride: Long = -1): Long {
    TransferContext.writeArguments(OBJECT to source, LONG to atlasSourceIdOverride)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_ADD_SOURCE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Removes the source with the given source ID.
   */
  public fun removeSource(sourceId: Long): Unit {
    TransferContext.writeArguments(LONG to sourceId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_REMOVE_SOURCE, NIL)
  }

  /**
   * Changes a source's ID.
   */
  public fun setSourceId(sourceId: Long, newSourceId: Long): Unit {
    TransferContext.writeArguments(LONG to sourceId, LONG to newSourceId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_SET_SOURCE_ID, NIL)
  }

  /**
   * Returns the number of [godot.TileSetSource] in this TileSet.
   */
  public fun getSourceCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_GET_SOURCE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the source ID for source with index [index].
   */
  public fun getSourceId(index: Long): Long {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_GET_SOURCE_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns if this TileSet has a source for the given source ID.
   */
  public fun hasSource(sourceId: Long): Boolean {
    TransferContext.writeArguments(LONG to sourceId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_HAS_SOURCE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the [godot.TileSetSource] with ID [sourceId].
   */
  public fun getSource(sourceId: Long): TileSetSource? {
    TransferContext.writeArguments(LONG to sourceId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_GET_SOURCE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as TileSetSource?
  }

  /**
   * Returns the occlusion layers count.
   */
  public fun getOcclusionLayersCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_GET_OCCLUSION_LAYERS_COUNT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Adds an occlusion layer to the TileSet at the given position [toPosition] in the array. If [toPosition] is -1, adds it at the end of the array.
   *
   * Occlusion layers allow assigning occlusion polygons to atlas tiles.
   */
  public fun addOcclusionLayer(toPosition: Long = -1): Unit {
    TransferContext.writeArguments(LONG to toPosition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_ADD_OCCLUSION_LAYER, NIL)
  }

  /**
   * Moves the occlusion layer at index [layerIndex] to the given position [toPosition] in the array. Also updates the atlas tiles accordingly.
   */
  public fun moveOcclusionLayer(layerIndex: Long, toPosition: Long): Unit {
    TransferContext.writeArguments(LONG to layerIndex, LONG to toPosition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_MOVE_OCCLUSION_LAYER, NIL)
  }

  /**
   * Removes the occlusion layer at index [layerIndex]. Also updates the atlas tiles accordingly.
   */
  public fun removeOcclusionLayer(layerIndex: Long): Unit {
    TransferContext.writeArguments(LONG to layerIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_REMOVE_OCCLUSION_LAYER, NIL)
  }

  /**
   * Sets the occlusion layer (as in the rendering server) for occluders in the given TileSet occlusion layer.
   */
  public fun setOcclusionLayerLightMask(layerIndex: Long, lightMask: Long): Unit {
    TransferContext.writeArguments(LONG to layerIndex, LONG to lightMask)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESET_SET_OCCLUSION_LAYER_LIGHT_MASK, NIL)
  }

  /**
   * Returns the light mask of the occlusion layer.
   */
  public fun getOcclusionLayerLightMask(layerIndex: Long): Long {
    TransferContext.writeArguments(LONG to layerIndex)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESET_GET_OCCLUSION_LAYER_LIGHT_MASK, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Enables or disables sdf collision for occluders in the given TileSet occlusion layer.
   */
  public fun setOcclusionLayerSdfCollision(layerIndex: Long, sdfCollision: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerIndex, BOOL to sdfCollision)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESET_SET_OCCLUSION_LAYER_SDF_COLLISION, NIL)
  }

  /**
   * Returns if the occluders from this layer use `sdf_collision`.
   */
  public fun getOcclusionLayerSdfCollision(layerIndex: Long): Boolean {
    TransferContext.writeArguments(LONG to layerIndex)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESET_GET_OCCLUSION_LAYER_SDF_COLLISION, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the physics layers count.
   */
  public fun getPhysicsLayersCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_GET_PHYSICS_LAYERS_COUNT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Adds a physics layer to the TileSet at the given position [toPosition] in the array. If [toPosition] is -1, adds it at the end of the array.
   *
   * Physics layers allow assigning collision polygons to atlas tiles.
   */
  public fun addPhysicsLayer(toPosition: Long = -1): Unit {
    TransferContext.writeArguments(LONG to toPosition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_ADD_PHYSICS_LAYER, NIL)
  }

  /**
   * Moves the physics layer at index [layerIndex] to the given position [toPosition] in the array. Also updates the atlas tiles accordingly.
   */
  public fun movePhysicsLayer(layerIndex: Long, toPosition: Long): Unit {
    TransferContext.writeArguments(LONG to layerIndex, LONG to toPosition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_MOVE_PHYSICS_LAYER, NIL)
  }

  /**
   * Removes the physics layer at index [layerIndex]. Also updates the atlas tiles accordingly.
   */
  public fun removePhysicsLayer(layerIndex: Long): Unit {
    TransferContext.writeArguments(LONG to layerIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_REMOVE_PHYSICS_LAYER, NIL)
  }

  /**
   * Sets the physics layer (as in the physics server) for bodies in the given TileSet physics layer.
   */
  public fun setPhysicsLayerCollisionLayer(layerIndex: Long, layer: Long): Unit {
    TransferContext.writeArguments(LONG to layerIndex, LONG to layer)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESET_SET_PHYSICS_LAYER_COLLISION_LAYER, NIL)
  }

  /**
   * Returns the collision layer (as in the physics server) bodies on the given TileSet's physics layer are in.
   */
  public fun getPhysicsLayerCollisionLayer(layerIndex: Long): Long {
    TransferContext.writeArguments(LONG to layerIndex)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESET_GET_PHYSICS_LAYER_COLLISION_LAYER, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the physics layer (as in the physics server) for bodies in the given TileSet physics layer.
   */
  public fun setPhysicsLayerCollisionMask(layerIndex: Long, mask: Long): Unit {
    TransferContext.writeArguments(LONG to layerIndex, LONG to mask)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESET_SET_PHYSICS_LAYER_COLLISION_MASK, NIL)
  }

  /**
   * Returns the collision mask of bodies on the given TileSet's physics layer.
   */
  public fun getPhysicsLayerCollisionMask(layerIndex: Long): Long {
    TransferContext.writeArguments(LONG to layerIndex)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESET_GET_PHYSICS_LAYER_COLLISION_MASK, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the physics material for bodies in the given TileSet physics layer.
   */
  public fun setPhysicsLayerPhysicsMaterial(layerIndex: Long, physicsMaterial: PhysicsMaterial):
      Unit {
    TransferContext.writeArguments(LONG to layerIndex, OBJECT to physicsMaterial)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESET_SET_PHYSICS_LAYER_PHYSICS_MATERIAL, NIL)
  }

  /**
   * Returns the physics material of bodies on the given TileSet's physics layer.
   */
  public fun getPhysicsLayerPhysicsMaterial(layerIndex: Long): PhysicsMaterial? {
    TransferContext.writeArguments(LONG to layerIndex)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESET_GET_PHYSICS_LAYER_PHYSICS_MATERIAL, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as PhysicsMaterial?
  }

  /**
   * Returns the terrain sets count.
   */
  public fun getTerrainSetsCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_GET_TERRAIN_SETS_COUNT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Adds a new terrain set at the given position [toPosition] in the array. If [toPosition] is -1, adds it at the end of the array.
   */
  public fun addTerrainSet(toPosition: Long = -1): Unit {
    TransferContext.writeArguments(LONG to toPosition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_ADD_TERRAIN_SET, NIL)
  }

  /**
   * Moves the terrain set at index [terrainSet] to the given position [toPosition] in the array. Also updates the atlas tiles accordingly.
   */
  public fun moveTerrainSet(terrainSet: Long, toPosition: Long): Unit {
    TransferContext.writeArguments(LONG to terrainSet, LONG to toPosition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_MOVE_TERRAIN_SET, NIL)
  }

  /**
   * Removes the terrain set at index [terrainSet]. Also updates the atlas tiles accordingly.
   */
  public fun removeTerrainSet(terrainSet: Long): Unit {
    TransferContext.writeArguments(LONG to terrainSet)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_REMOVE_TERRAIN_SET, NIL)
  }

  /**
   * Sets a terrain mode. Each mode determines which bits of a tile shape is used to match the neighbouring tiles' terrains.
   */
  public fun setTerrainSetMode(terrainSet: Long, mode: TerrainMode): Unit {
    TransferContext.writeArguments(LONG to terrainSet, LONG to mode.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_SET_TERRAIN_SET_MODE, NIL)
  }

  /**
   * Returns a terrain set mode.
   */
  public fun getTerrainSetMode(terrainSet: Long): TerrainMode {
    TransferContext.writeArguments(LONG to terrainSet)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_GET_TERRAIN_SET_MODE, LONG)
    return TileSet.TerrainMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the number of terrains in the given terrain set.
   */
  public fun getTerrainsCount(terrainSet: Long): Long {
    TransferContext.writeArguments(LONG to terrainSet)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_GET_TERRAINS_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Adds a new terrain to the given terrain set [terrainSet] at the given position [toPosition] in the array. If [toPosition] is -1, adds it at the end of the array.
   */
  public fun addTerrain(terrainSet: Long, toPosition: Long = -1): Unit {
    TransferContext.writeArguments(LONG to terrainSet, LONG to toPosition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_ADD_TERRAIN, NIL)
  }

  /**
   * Moves the terrain at index [terrainIndex] for terrain set [terrainSet] to the given position [toPosition] in the array. Also updates the atlas tiles accordingly.
   */
  public fun moveTerrain(
    terrainSet: Long,
    terrainIndex: Long,
    toPosition: Long
  ): Unit {
    TransferContext.writeArguments(LONG to terrainSet, LONG to terrainIndex, LONG to toPosition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_MOVE_TERRAIN, NIL)
  }

  /**
   * Removes the terrain at index [terrainIndex] in the given terrain set [terrainSet]. Also updates the atlas tiles accordingly.
   */
  public fun removeTerrain(terrainSet: Long, terrainIndex: Long): Unit {
    TransferContext.writeArguments(LONG to terrainSet, LONG to terrainIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_REMOVE_TERRAIN, NIL)
  }

  /**
   * Sets a terrain's name.
   */
  public fun setTerrainName(
    terrainSet: Long,
    terrainIndex: Long,
    name: String
  ): Unit {
    TransferContext.writeArguments(LONG to terrainSet, LONG to terrainIndex, STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_SET_TERRAIN_NAME, NIL)
  }

  /**
   * Returns a terrain's name.
   */
  public fun getTerrainName(terrainSet: Long, terrainIndex: Long): String {
    TransferContext.writeArguments(LONG to terrainSet, LONG to terrainIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_GET_TERRAIN_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Sets a terrain's color. This color is used for identifying the different terrains in the TileSet editor.
   */
  public fun setTerrainColor(
    terrainSet: Long,
    terrainIndex: Long,
    color: Color
  ): Unit {
    TransferContext.writeArguments(LONG to terrainSet, LONG to terrainIndex, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_SET_TERRAIN_COLOR, NIL)
  }

  /**
   * Returns a terrain's color.
   */
  public fun getTerrainColor(terrainSet: Long, terrainIndex: Long): Color {
    TransferContext.writeArguments(LONG to terrainSet, LONG to terrainIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_GET_TERRAIN_COLOR, COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Returns the navigation layers count.
   */
  public fun getNavigationLayersCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_GET_NAVIGATION_LAYERS_COUNT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Adds a navigation layer to the TileSet at the given position [toPosition] in the array. If [toPosition] is -1, adds it at the end of the array.
   *
   * Navigation layers allow assigning a navigable area to atlas tiles.
   */
  public fun addNavigationLayer(toPosition: Long = -1): Unit {
    TransferContext.writeArguments(LONG to toPosition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_ADD_NAVIGATION_LAYER, NIL)
  }

  /**
   * Moves the navigation layer at index [layerIndex] to the given position [toPosition] in the array. Also updates the atlas tiles accordingly.
   */
  public fun moveNavigationLayer(layerIndex: Long, toPosition: Long): Unit {
    TransferContext.writeArguments(LONG to layerIndex, LONG to toPosition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_MOVE_NAVIGATION_LAYER, NIL)
  }

  /**
   * Removes the navigation layer at index [layerIndex]. Also updates the atlas tiles accordingly.
   */
  public fun removeNavigationLayer(layerIndex: Long): Unit {
    TransferContext.writeArguments(LONG to layerIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_REMOVE_NAVIGATION_LAYER,
        NIL)
  }

  /**
   * Sets the navigation layers (as in the navigation server) for navigation regions is the given TileSet navigation layer.
   */
  public fun setNavigationLayerLayers(layerIndex: Long, layers: Long): Unit {
    TransferContext.writeArguments(LONG to layerIndex, LONG to layers)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_SET_NAVIGATION_LAYER_LAYERS,
        NIL)
  }

  /**
   * Returns the navigation layers (as in the Navigation server) of the gives TileSet navigation layer.
   */
  public fun getNavigationLayerLayers(layerIndex: Long): Long {
    TransferContext.writeArguments(LONG to layerIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_GET_NAVIGATION_LAYER_LAYERS,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the custom data layers count.
   */
  public fun getCustomDataLayersCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESET_GET_CUSTOM_DATA_LAYERS_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Adds a custom data layer to the TileSet at the given position [toPosition] in the array. If [toPosition] is -1, adds it at the end of the array.
   *
   * Custom data layers allow assigning custom properties to atlas tiles.
   */
  public fun addCustomDataLayer(toPosition: Long = -1): Unit {
    TransferContext.writeArguments(LONG to toPosition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_ADD_CUSTOM_DATA_LAYER, NIL)
  }

  /**
   * Moves the custom data layer at index [layerIndex] to the given position [toPosition] in the array. Also updates the atlas tiles accordingly.
   */
  public fun moveCustomDataLayer(layerIndex: Long, toPosition: Long): Unit {
    TransferContext.writeArguments(LONG to layerIndex, LONG to toPosition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_MOVE_CUSTOM_DATA_LAYER, NIL)
  }

  /**
   * Removes the custom data layer at index [layerIndex]. Also updates the atlas tiles accordingly.
   */
  public fun removeCustomDataLayer(layerIndex: Long): Unit {
    TransferContext.writeArguments(LONG to layerIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_REMOVE_CUSTOM_DATA_LAYER,
        NIL)
  }

  /**
   * Returns the index of the custom data layer identified by the given name.
   */
  public fun getCustomDataLayerByName(layerName: String): Long {
    TransferContext.writeArguments(STRING to layerName)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESET_GET_CUSTOM_DATA_LAYER_BY_NAME, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the name of the custom data layer identified by the given index. Names are identifiers of the layer therefore if the name is already taken it will fail and raise an error.
   */
  public fun setCustomDataLayerName(layerIndex: Long, layerName: String): Unit {
    TransferContext.writeArguments(LONG to layerIndex, STRING to layerName)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_SET_CUSTOM_DATA_LAYER_NAME,
        NIL)
  }

  /**
   * Returns the name of the custom data layer identified by the given index.
   */
  public fun getCustomDataLayerName(layerIndex: Long): String {
    TransferContext.writeArguments(LONG to layerIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_GET_CUSTOM_DATA_LAYER_NAME,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Sets the type of the custom data layer identified by the given index.
   */
  public fun setCustomDataLayerType(layerIndex: Long, layerType: VariantType): Unit {
    TransferContext.writeArguments(LONG to layerIndex, LONG to layerType.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_SET_CUSTOM_DATA_LAYER_TYPE,
        NIL)
  }

  /**
   * Returns the type of the custom data layer identified by the given index.
   */
  public fun getCustomDataLayerType(layerIndex: Long): VariantType {
    TransferContext.writeArguments(LONG to layerIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_GET_CUSTOM_DATA_LAYER_TYPE,
        LONG)
    return VariantType.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Creates a source-level proxy for the given source ID. A proxy will map set of tile identifiers to another set of identifiers. Both the atlac coordinates ID and the alternative tile ID are kept the same when using source-level proxies.
   *
   * This can be used to replace a source in all TileMaps using this TileSet, as TileMap nodes will find and use the proxy's target source when one is available.
   *
   * Proxied tiles can be automatically replaced in TileMap nodes using the editor.
   */
  public fun setSourceLevelTileProxy(sourceFrom: Long, sourceTo: Long): Unit {
    TransferContext.writeArguments(LONG to sourceFrom, LONG to sourceTo)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_SET_SOURCE_LEVEL_TILE_PROXY,
        NIL)
  }

  /**
   * Returns the source-level proxy for the given source identifier.
   *
   * If the TileSet has no proxy for the given identifier, returns -1.
   */
  public fun getSourceLevelTileProxy(sourceFrom: Long): Long {
    TransferContext.writeArguments(LONG to sourceFrom)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_GET_SOURCE_LEVEL_TILE_PROXY,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns if there is a source-level proxy for the given source ID.
   */
  public fun hasSourceLevelTileProxy(sourceFrom: Long): Boolean {
    TransferContext.writeArguments(LONG to sourceFrom)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_HAS_SOURCE_LEVEL_TILE_PROXY,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Removes a source-level tile proxy.
   */
  public fun removeSourceLevelTileProxy(sourceFrom: Long): Unit {
    TransferContext.writeArguments(LONG to sourceFrom)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESET_REMOVE_SOURCE_LEVEL_TILE_PROXY, NIL)
  }

  /**
   * Creates a coordinates-level proxy for the given identifiers. A proxy will map set of tile identifiers to another set of identifiers. The alternative tile ID is kept the same when using coordinates-level proxies.
   *
   * This can be used to replace a tile in all TileMaps using this TileSet, as TileMap nodes will find and use the proxy's target tile when one is available.
   *
   * Proxied tiles can be automatically replaced in TileMap nodes using the editor.
   */
  public fun setCoordsLevelTileProxy(
    pSourceFrom: Long,
    coordsFrom: Vector2i,
    sourceTo: Long,
    coordsTo: Vector2i
  ): Unit {
    TransferContext.writeArguments(LONG to pSourceFrom, VECTOR2I to coordsFrom, LONG to sourceTo, VECTOR2I to coordsTo)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_SET_COORDS_LEVEL_TILE_PROXY,
        NIL)
  }

  /**
   * Returns the coordinate-level proxy for the given identifiers. The returned array contains the two target identifiers of the proxy (source ID and atlas coordinates ID).
   *
   * If the TileSet has no proxy for the given identifiers, returns an empty Array.
   */
  public fun getCoordsLevelTileProxy(sourceFrom: Long, coordsFrom: Vector2i): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to sourceFrom, VECTOR2I to coordsFrom)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_GET_COORDS_LEVEL_TILE_PROXY,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns if there is a coodinates-level proxy for the given identifiers.
   */
  public fun hasCoordsLevelTileProxy(sourceFrom: Long, coordsFrom: Vector2i): Boolean {
    TransferContext.writeArguments(LONG to sourceFrom, VECTOR2I to coordsFrom)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_HAS_COORDS_LEVEL_TILE_PROXY,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Removes a coordinates-level proxy for the given identifiers.
   */
  public fun removeCoordsLevelTileProxy(sourceFrom: Long, coordsFrom: Vector2i): Unit {
    TransferContext.writeArguments(LONG to sourceFrom, VECTOR2I to coordsFrom)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESET_REMOVE_COORDS_LEVEL_TILE_PROXY, NIL)
  }

  /**
   * Create an alternative-level proxy for the given identifiers. A proxy will map set of tile identifiers to another set of identifiers.
   *
   * This can be used to replace a tile in all TileMaps using this TileSet, as TileMap nodes will find and use the proxy's target tile when one is available.
   *
   * Proxied tiles can be automatically replaced in TileMap nodes using the editor.
   */
  public fun setAlternativeLevelTileProxy(
    sourceFrom: Long,
    coordsFrom: Vector2i,
    alternativeFrom: Long,
    sourceTo: Long,
    coordsTo: Vector2i,
    alternativeTo: Long
  ): Unit {
    TransferContext.writeArguments(LONG to sourceFrom, VECTOR2I to coordsFrom, LONG to alternativeFrom, LONG to sourceTo, VECTOR2I to coordsTo, LONG to alternativeTo)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESET_SET_ALTERNATIVE_LEVEL_TILE_PROXY, NIL)
  }

  /**
   * Returns the alternative-level proxy for the given identifiers. The returned array contains the three proxie's target identifiers (source ID, atlas coords ID and alternative tile ID).
   *
   * If the TileSet has no proxy for the given identifiers, returns an empty Array.
   */
  public fun getAlternativeLevelTileProxy(
    sourceFrom: Long,
    coordsFrom: Vector2i,
    alternativeFrom: Long
  ): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to sourceFrom, VECTOR2I to coordsFrom, LONG to alternativeFrom)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESET_GET_ALTERNATIVE_LEVEL_TILE_PROXY, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns if there is and alternative-level proxy for the given identifiers.
   */
  public fun hasAlternativeLevelTileProxy(
    sourceFrom: Long,
    coordsFrom: Vector2i,
    alternativeFrom: Long
  ): Boolean {
    TransferContext.writeArguments(LONG to sourceFrom, VECTOR2I to coordsFrom, LONG to alternativeFrom)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESET_HAS_ALTERNATIVE_LEVEL_TILE_PROXY, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Removes an alternative-level proxy for the given identifiers.
   */
  public fun removeAlternativeLevelTileProxy(
    sourceFrom: Long,
    coordsFrom: Vector2i,
    alternativeFrom: Long
  ): Unit {
    TransferContext.writeArguments(LONG to sourceFrom, VECTOR2I to coordsFrom, LONG to alternativeFrom)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESET_REMOVE_ALTERNATIVE_LEVEL_TILE_PROXY, NIL)
  }

  /**
   * According to the configured proxies, maps the provided indentifiers to a new set of identifiers. The source ID, atlas coordinates ID and alternative tile ID are returned as a 3 elements Array.
   *
   * This function first look for matching alternative-level proxies, then coordinates-level proxies, then source-level proxies.
   *
   * If no proxy corresponding to provided identifiers are found, returns the same values the ones used as arguments.
   */
  public fun mapTileProxy(
    sourceFrom: Long,
    coordsFrom: Vector2i,
    alternativeFrom: Long
  ): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to sourceFrom, VECTOR2I to coordsFrom, LONG to alternativeFrom)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_MAP_TILE_PROXY, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Clears tile proxies pointing to invalid tiles.
   */
  public fun cleanupInvalidTileProxies(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESET_CLEANUP_INVALID_TILE_PROXIES, NIL)
  }

  /**
   * Clears all tile proxies.
   */
  public fun clearTileProxies(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_CLEAR_TILE_PROXIES, NIL)
  }

  /**
   * Adds a [godot.TileMapPattern] to be stored in the TileSet resource. If provided, insert it at the given [index].
   */
  public fun addPattern(pattern: TileMapPattern, index: Long = -1): Long {
    TransferContext.writeArguments(OBJECT to pattern, LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_ADD_PATTERN, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the [godot.TileMapPattern] at the given [index].
   */
  public fun getPattern(index: Long = -1): TileMapPattern? {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_GET_PATTERN, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as TileMapPattern?
  }

  /**
   * Remove the [godot.TileMapPattern] at the given index.
   */
  public fun removePattern(index: Long): Unit {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_REMOVE_PATTERN, NIL)
  }

  /**
   * Returns the number of [godot.TileMapPattern] this tile set handles.
   */
  public fun getPatternsCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_GET_PATTERNS_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public enum class TileShape(
    id: Long
  ) {
    /**
     * Rectangular tile shape.
     */
    TILE_SHAPE_SQUARE(0),
    /**
     * Diamond tile shape (for isometric look).
     *
     * **Note:** Isometric [godot.TileSet] works best if [godot.TileMap] and all its layers have Y-sort enabled.
     */
    TILE_SHAPE_ISOMETRIC(1),
    /**
     * Rectangular tile shape with one row/column out of two offset by half a tile.
     */
    TILE_SHAPE_HALF_OFFSET_SQUARE(2),
    /**
     * Hexagonal tile shape.
     */
    TILE_SHAPE_HEXAGON(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class TileLayout(
    id: Long
  ) {
    /**
     * Tile coordinates layout where both axis stay consistent with their respective local horizontal and vertical axis.
     */
    TILE_LAYOUT_STACKED(0),
    /**
     * Same as [TILE_LAYOUT_STACKED], but the first half-offset is negative instead of positive.
     */
    TILE_LAYOUT_STACKED_OFFSET(1),
    /**
     * Tile coordinates layout where the horizontal axis stay horizontal, and the vertical one goes down-right.
     */
    TILE_LAYOUT_STAIRS_RIGHT(2),
    /**
     * Tile coordinates layout where the vertical axis stay vertical, and the horizontal one goes down-right.
     */
    TILE_LAYOUT_STAIRS_DOWN(3),
    /**
     * Tile coordinates layout where the horizontal axis goes up-right, and the vertical one goes down-right.
     */
    TILE_LAYOUT_DIAMOND_RIGHT(4),
    /**
     * Tile coordinates layout where the horizontal axis goes down-right, and the vertical one goes down-left.
     */
    TILE_LAYOUT_DIAMOND_DOWN(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class TileOffsetAxis(
    id: Long
  ) {
    /**
     * Horizontal half-offset.
     */
    TILE_OFFSET_AXIS_HORIZONTAL(0),
    /**
     * Vertical half-offset.
     */
    TILE_OFFSET_AXIS_VERTICAL(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class CellNeighbor(
    id: Long
  ) {
    /**
     * Neighbor on the right side.
     */
    CELL_NEIGHBOR_RIGHT_SIDE(0),
    /**
     * Neighbor in the right corner.
     */
    CELL_NEIGHBOR_RIGHT_CORNER(1),
    /**
     * Neighbor on the bottom right side.
     */
    CELL_NEIGHBOR_BOTTOM_RIGHT_SIDE(2),
    /**
     * Neighbor in the bottom right corner.
     */
    CELL_NEIGHBOR_BOTTOM_RIGHT_CORNER(3),
    /**
     * Neighbor on the bottom side.
     */
    CELL_NEIGHBOR_BOTTOM_SIDE(4),
    /**
     * Neighbor in the bottom corner.
     */
    CELL_NEIGHBOR_BOTTOM_CORNER(5),
    /**
     * Neighbor on the bottom left side.
     */
    CELL_NEIGHBOR_BOTTOM_LEFT_SIDE(6),
    /**
     * Neighbor in the bottom left corner.
     */
    CELL_NEIGHBOR_BOTTOM_LEFT_CORNER(7),
    /**
     * Neighbor on the left side.
     */
    CELL_NEIGHBOR_LEFT_SIDE(8),
    /**
     * Neighbor in the left corner.
     */
    CELL_NEIGHBOR_LEFT_CORNER(9),
    /**
     * Neighbor on the top left side.
     */
    CELL_NEIGHBOR_TOP_LEFT_SIDE(10),
    /**
     * Neighbor in the top left corner.
     */
    CELL_NEIGHBOR_TOP_LEFT_CORNER(11),
    /**
     * Neighbor on the top side.
     */
    CELL_NEIGHBOR_TOP_SIDE(12),
    /**
     * Neighbor in the top corner.
     */
    CELL_NEIGHBOR_TOP_CORNER(13),
    /**
     * Neighbor on the top right side.
     */
    CELL_NEIGHBOR_TOP_RIGHT_SIDE(14),
    /**
     * Neighbor in the top right corner.
     */
    CELL_NEIGHBOR_TOP_RIGHT_CORNER(15),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class TerrainMode(
    id: Long
  ) {
    /**
     * Requires both corners and side to match with neighboring tiles' terrains.
     */
    TERRAIN_MODE_MATCH_CORNERS_AND_SIDES(0),
    /**
     * Requires corners to match with neighboring tiles' terrains.
     */
    TERRAIN_MODE_MATCH_CORNERS(1),
    /**
     * Requires sides to match with neighboring tiles' terrains.
     */
    TERRAIN_MODE_MATCH_SIDES(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
