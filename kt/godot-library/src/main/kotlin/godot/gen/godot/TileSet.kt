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
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2I
import godot.core.Vector2i
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * Tile library for tilemaps.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/113](https://godotengine.org/asset-library/asset/113)
 *
 * A TileSet is a library of tiles for a [godot.TileMap]. A TileSet handles a list of [godot.TileSetSource], each of them storing a set of tiles.
 *
 * Tiles can either be from a [godot.TileSetAtlasSource], which renders tiles out of a texture with support for physics, navigation, etc., or from a [godot.TileSetScenesCollectionSource], which exposes scene-based tiles.
 *
 * Tiles are referenced by using three IDs: their source ID, their atlas coordinates ID, and their alternative tile ID.
 *
 * A TileSet can be configured so that its tiles expose more or fewer properties. To do so, the TileSet resources use property layers, which you can add or remove depending on your needs.
 *
 * For example, adding a physics layer allows giving collision shapes to your tiles. Each layer has dedicated properties (physics layer and mask), so you may add several TileSet physics layers for each type of collision you need.
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
      TransferContext.callMethod(rawPtr, MethodBindings.getTileShapePtr, LONG)
      return TileSet.TileShape.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTileShapePtr, NIL)
    }

  /**
   * For all half-offset shapes (Isometric, Hexagonal and Half-Offset square), changes the way tiles are indexed in the TileMap grid.
   */
  public var tileLayout: TileLayout
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTileLayoutPtr, LONG)
      return TileSet.TileLayout.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTileLayoutPtr, NIL)
    }

  /**
   * For all half-offset shapes (Isometric, Hexagonal and Half-Offset square), determines the offset axis.
   */
  public var tileOffsetAxis: TileOffsetAxis
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTileOffsetAxisPtr, LONG)
      return TileSet.TileOffsetAxis.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTileOffsetAxisPtr, NIL)
    }

  /**
   * The tile size, in pixels. For all tile shapes, this size corresponds to the encompassing rectangle of the tile shape. This is thus the minimal cell size required in an atlas.
   */
  @CoreTypeLocalCopy
  public var tileSize: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTileSizePtr, VECTOR2I)
      return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTileSizePtr, NIL)
    }

  /**
   * Enables/Disable uv clipping when rendering the tiles.
   */
  public var uvClipping: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUvClippingPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUvClippingPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TILESET, scriptIndex)
    return true
  }

  /**
   * The tile size, in pixels. For all tile shapes, this size corresponds to the encompassing rectangle of the tile shape. This is thus the minimal cell size required in an atlas.
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
   * val myCoreType = tileset.tileSize
   * //Your changes
   * tileset.tileSize = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun tileSizeMutate(block: Vector2i.() -> Unit): Vector2i = tileSize.apply{
      block(this)
      tileSize = this
  }


  /**
   * Returns a new unused source ID. This generated ID is the same that a call to [addSource] would return.
   */
  public fun getNextSourceId(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNextSourceIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Adds a [godot.TileSetSource] to the TileSet. If [atlasSourceIdOverride] is not -1, also set its source ID. Otherwise, a unique identifier is automatically generated.
   *
   * The function returns the added source ID or -1 if the source could not be added.
   *
   * **Warning:** A source cannot belong to two TileSets at the same time. If the added source was attached to another [godot.TileSet], it will be removed from that one.
   */
  @JvmOverloads
  public fun addSource(source: TileSetSource, atlasSourceIdOverride: Int = -1): Int {
    TransferContext.writeArguments(OBJECT to source, LONG to atlasSourceIdOverride.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addSourcePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Removes the source with the given source ID.
   */
  public fun removeSource(sourceId: Int): Unit {
    TransferContext.writeArguments(LONG to sourceId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeSourcePtr, NIL)
  }

  /**
   * Changes a source's ID.
   */
  public fun setSourceId(sourceId: Int, newSourceId: Int): Unit {
    TransferContext.writeArguments(LONG to sourceId.toLong(), LONG to newSourceId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setSourceIdPtr, NIL)
  }

  /**
   * Returns the number of [godot.TileSetSource] in this TileSet.
   */
  public fun getSourceCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSourceCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the source ID for source with index [index].
   */
  public fun getSourceId(index: Int): Int {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSourceIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns if this TileSet has a source for the given source ID.
   */
  public fun hasSource(sourceId: Int): Boolean {
    TransferContext.writeArguments(LONG to sourceId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.hasSourcePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the [godot.TileSetSource] with ID [sourceId].
   */
  public fun getSource(sourceId: Int): TileSetSource? {
    TransferContext.writeArguments(LONG to sourceId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSourcePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TileSetSource?)
  }

  /**
   * Returns the occlusion layers count.
   */
  public fun getOcclusionLayersCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOcclusionLayersCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Adds an occlusion layer to the TileSet at the given position [toPosition] in the array. If [toPosition] is -1, adds it at the end of the array.
   *
   * Occlusion layers allow assigning occlusion polygons to atlas tiles.
   */
  @JvmOverloads
  public fun addOcclusionLayer(toPosition: Int = -1): Unit {
    TransferContext.writeArguments(LONG to toPosition.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addOcclusionLayerPtr, NIL)
  }

  /**
   * Moves the occlusion layer at index [layerIndex] to the given position [toPosition] in the array. Also updates the atlas tiles accordingly.
   */
  public fun moveOcclusionLayer(layerIndex: Int, toPosition: Int): Unit {
    TransferContext.writeArguments(LONG to layerIndex.toLong(), LONG to toPosition.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.moveOcclusionLayerPtr, NIL)
  }

  /**
   * Removes the occlusion layer at index [layerIndex]. Also updates the atlas tiles accordingly.
   */
  public fun removeOcclusionLayer(layerIndex: Int): Unit {
    TransferContext.writeArguments(LONG to layerIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeOcclusionLayerPtr, NIL)
  }

  /**
   * Sets the occlusion layer (as in the rendering server) for occluders in the given TileSet occlusion layer.
   */
  public fun setOcclusionLayerLightMask(layerIndex: Int, lightMask: Int): Unit {
    TransferContext.writeArguments(LONG to layerIndex.toLong(), LONG to lightMask.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setOcclusionLayerLightMaskPtr, NIL)
  }

  /**
   * Returns the light mask of the occlusion layer.
   */
  public fun getOcclusionLayerLightMask(layerIndex: Int): Int {
    TransferContext.writeArguments(LONG to layerIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getOcclusionLayerLightMaskPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Enables or disables SDF collision for occluders in the given TileSet occlusion layer.
   */
  public fun setOcclusionLayerSdfCollision(layerIndex: Int, sdfCollision: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerIndex.toLong(), BOOL to sdfCollision)
    TransferContext.callMethod(rawPtr, MethodBindings.setOcclusionLayerSdfCollisionPtr, NIL)
  }

  /**
   * Returns if the occluders from this layer use `sdf_collision`.
   */
  public fun getOcclusionLayerSdfCollision(layerIndex: Int): Boolean {
    TransferContext.writeArguments(LONG to layerIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getOcclusionLayerSdfCollisionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the physics layers count.
   */
  public fun getPhysicsLayersCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPhysicsLayersCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Adds a physics layer to the TileSet at the given position [toPosition] in the array. If [toPosition] is -1, adds it at the end of the array.
   *
   * Physics layers allow assigning collision polygons to atlas tiles.
   */
  @JvmOverloads
  public fun addPhysicsLayer(toPosition: Int = -1): Unit {
    TransferContext.writeArguments(LONG to toPosition.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addPhysicsLayerPtr, NIL)
  }

  /**
   * Moves the physics layer at index [layerIndex] to the given position [toPosition] in the array. Also updates the atlas tiles accordingly.
   */
  public fun movePhysicsLayer(layerIndex: Int, toPosition: Int): Unit {
    TransferContext.writeArguments(LONG to layerIndex.toLong(), LONG to toPosition.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.movePhysicsLayerPtr, NIL)
  }

  /**
   * Removes the physics layer at index [layerIndex]. Also updates the atlas tiles accordingly.
   */
  public fun removePhysicsLayer(layerIndex: Int): Unit {
    TransferContext.writeArguments(LONG to layerIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removePhysicsLayerPtr, NIL)
  }

  /**
   * Sets the physics layer (as in the physics server) for bodies in the given TileSet physics layer.
   */
  public fun setPhysicsLayerCollisionLayer(layerIndex: Int, layer: Long): Unit {
    TransferContext.writeArguments(LONG to layerIndex.toLong(), LONG to layer)
    TransferContext.callMethod(rawPtr, MethodBindings.setPhysicsLayerCollisionLayerPtr, NIL)
  }

  /**
   * Returns the collision layer (as in the physics server) bodies on the given TileSet's physics layer are in.
   */
  public fun getPhysicsLayerCollisionLayer(layerIndex: Int): Long {
    TransferContext.writeArguments(LONG to layerIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPhysicsLayerCollisionLayerPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Sets the physics layer (as in the physics server) for bodies in the given TileSet physics layer.
   */
  public fun setPhysicsLayerCollisionMask(layerIndex: Int, mask: Long): Unit {
    TransferContext.writeArguments(LONG to layerIndex.toLong(), LONG to mask)
    TransferContext.callMethod(rawPtr, MethodBindings.setPhysicsLayerCollisionMaskPtr, NIL)
  }

  /**
   * Returns the collision mask of bodies on the given TileSet's physics layer.
   */
  public fun getPhysicsLayerCollisionMask(layerIndex: Int): Long {
    TransferContext.writeArguments(LONG to layerIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPhysicsLayerCollisionMaskPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Sets the physics material for bodies in the given TileSet physics layer.
   */
  public fun setPhysicsLayerPhysicsMaterial(layerIndex: Int, physicsMaterial: PhysicsMaterial):
      Unit {
    TransferContext.writeArguments(LONG to layerIndex.toLong(), OBJECT to physicsMaterial)
    TransferContext.callMethod(rawPtr, MethodBindings.setPhysicsLayerPhysicsMaterialPtr, NIL)
  }

  /**
   * Returns the physics material of bodies on the given TileSet's physics layer.
   */
  public fun getPhysicsLayerPhysicsMaterial(layerIndex: Int): PhysicsMaterial? {
    TransferContext.writeArguments(LONG to layerIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPhysicsLayerPhysicsMaterialPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as PhysicsMaterial?)
  }

  /**
   * Returns the terrain sets count.
   */
  public fun getTerrainSetsCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTerrainSetsCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Adds a new terrain set at the given position [toPosition] in the array. If [toPosition] is -1, adds it at the end of the array.
   */
  @JvmOverloads
  public fun addTerrainSet(toPosition: Int = -1): Unit {
    TransferContext.writeArguments(LONG to toPosition.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addTerrainSetPtr, NIL)
  }

  /**
   * Moves the terrain set at index [terrainSet] to the given position [toPosition] in the array. Also updates the atlas tiles accordingly.
   */
  public fun moveTerrainSet(terrainSet: Int, toPosition: Int): Unit {
    TransferContext.writeArguments(LONG to terrainSet.toLong(), LONG to toPosition.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.moveTerrainSetPtr, NIL)
  }

  /**
   * Removes the terrain set at index [terrainSet]. Also updates the atlas tiles accordingly.
   */
  public fun removeTerrainSet(terrainSet: Int): Unit {
    TransferContext.writeArguments(LONG to terrainSet.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeTerrainSetPtr, NIL)
  }

  /**
   * Sets a terrain mode. Each mode determines which bits of a tile shape is used to match the neighboring tiles' terrains.
   */
  public fun setTerrainSetMode(terrainSet: Int, mode: TerrainMode): Unit {
    TransferContext.writeArguments(LONG to terrainSet.toLong(), LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setTerrainSetModePtr, NIL)
  }

  /**
   * Returns a terrain set mode.
   */
  public fun getTerrainSetMode(terrainSet: Int): TerrainMode {
    TransferContext.writeArguments(LONG to terrainSet.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTerrainSetModePtr, LONG)
    return TileSet.TerrainMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the number of terrains in the given terrain set.
   */
  public fun getTerrainsCount(terrainSet: Int): Int {
    TransferContext.writeArguments(LONG to terrainSet.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTerrainsCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Adds a new terrain to the given terrain set [terrainSet] at the given position [toPosition] in the array. If [toPosition] is -1, adds it at the end of the array.
   */
  @JvmOverloads
  public fun addTerrain(terrainSet: Int, toPosition: Int = -1): Unit {
    TransferContext.writeArguments(LONG to terrainSet.toLong(), LONG to toPosition.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addTerrainPtr, NIL)
  }

  /**
   * Moves the terrain at index [terrainIndex] for terrain set [terrainSet] to the given position [toPosition] in the array. Also updates the atlas tiles accordingly.
   */
  public fun moveTerrain(
    terrainSet: Int,
    terrainIndex: Int,
    toPosition: Int,
  ): Unit {
    TransferContext.writeArguments(LONG to terrainSet.toLong(), LONG to terrainIndex.toLong(), LONG to toPosition.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.moveTerrainPtr, NIL)
  }

  /**
   * Removes the terrain at index [terrainIndex] in the given terrain set [terrainSet]. Also updates the atlas tiles accordingly.
   */
  public fun removeTerrain(terrainSet: Int, terrainIndex: Int): Unit {
    TransferContext.writeArguments(LONG to terrainSet.toLong(), LONG to terrainIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeTerrainPtr, NIL)
  }

  /**
   * Sets a terrain's name.
   */
  public fun setTerrainName(
    terrainSet: Int,
    terrainIndex: Int,
    name: String,
  ): Unit {
    TransferContext.writeArguments(LONG to terrainSet.toLong(), LONG to terrainIndex.toLong(), STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.setTerrainNamePtr, NIL)
  }

  /**
   * Returns a terrain's name.
   */
  public fun getTerrainName(terrainSet: Int, terrainIndex: Int): String {
    TransferContext.writeArguments(LONG to terrainSet.toLong(), LONG to terrainIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTerrainNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Sets a terrain's color. This color is used for identifying the different terrains in the TileSet editor.
   */
  public fun setTerrainColor(
    terrainSet: Int,
    terrainIndex: Int,
    color: Color,
  ): Unit {
    TransferContext.writeArguments(LONG to terrainSet.toLong(), LONG to terrainIndex.toLong(), COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.setTerrainColorPtr, NIL)
  }

  /**
   * Returns a terrain's color.
   */
  public fun getTerrainColor(terrainSet: Int, terrainIndex: Int): Color {
    TransferContext.writeArguments(LONG to terrainSet.toLong(), LONG to terrainIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTerrainColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  /**
   * Returns the navigation layers count.
   */
  public fun getNavigationLayersCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNavigationLayersCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Adds a navigation layer to the TileSet at the given position [toPosition] in the array. If [toPosition] is -1, adds it at the end of the array.
   *
   * Navigation layers allow assigning a navigable area to atlas tiles.
   */
  @JvmOverloads
  public fun addNavigationLayer(toPosition: Int = -1): Unit {
    TransferContext.writeArguments(LONG to toPosition.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addNavigationLayerPtr, NIL)
  }

  /**
   * Moves the navigation layer at index [layerIndex] to the given position [toPosition] in the array. Also updates the atlas tiles accordingly.
   */
  public fun moveNavigationLayer(layerIndex: Int, toPosition: Int): Unit {
    TransferContext.writeArguments(LONG to layerIndex.toLong(), LONG to toPosition.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.moveNavigationLayerPtr, NIL)
  }

  /**
   * Removes the navigation layer at index [layerIndex]. Also updates the atlas tiles accordingly.
   */
  public fun removeNavigationLayer(layerIndex: Int): Unit {
    TransferContext.writeArguments(LONG to layerIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeNavigationLayerPtr, NIL)
  }

  /**
   * Sets the navigation layers (as in the navigation server) for navigation regions in the given TileSet navigation layer.
   */
  public fun setNavigationLayerLayers(layerIndex: Int, layers: Long): Unit {
    TransferContext.writeArguments(LONG to layerIndex.toLong(), LONG to layers)
    TransferContext.callMethod(rawPtr, MethodBindings.setNavigationLayerLayersPtr, NIL)
  }

  /**
   * Returns the navigation layers (as in the Navigation server) of the given TileSet navigation layer.
   */
  public fun getNavigationLayerLayers(layerIndex: Int): Long {
    TransferContext.writeArguments(LONG to layerIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getNavigationLayerLayersPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Based on [value], enables or disables the specified navigation layer of the TileSet navigation data layer identified by the given [layerIndex], given a navigation_layers [layerNumber] between 1 and 32.
   */
  public fun setNavigationLayerLayerValue(
    layerIndex: Int,
    layerNumber: Int,
    `value`: Boolean,
  ): Unit {
    TransferContext.writeArguments(LONG to layerIndex.toLong(), LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setNavigationLayerLayerValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified navigation layer of the TileSet navigation data layer identified by the given [layerIndex] is enabled, given a navigation_layers [layerNumber] between 1 and 32.
   */
  public fun getNavigationLayerLayerValue(layerIndex: Int, layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerIndex.toLong(), LONG to layerNumber.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getNavigationLayerLayerValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the custom data layers count.
   */
  public fun getCustomDataLayersCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCustomDataLayersCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Adds a custom data layer to the TileSet at the given position [toPosition] in the array. If [toPosition] is -1, adds it at the end of the array.
   *
   * Custom data layers allow assigning custom properties to atlas tiles.
   */
  @JvmOverloads
  public fun addCustomDataLayer(toPosition: Int = -1): Unit {
    TransferContext.writeArguments(LONG to toPosition.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addCustomDataLayerPtr, NIL)
  }

  /**
   * Moves the custom data layer at index [layerIndex] to the given position [toPosition] in the array. Also updates the atlas tiles accordingly.
   */
  public fun moveCustomDataLayer(layerIndex: Int, toPosition: Int): Unit {
    TransferContext.writeArguments(LONG to layerIndex.toLong(), LONG to toPosition.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.moveCustomDataLayerPtr, NIL)
  }

  /**
   * Removes the custom data layer at index [layerIndex]. Also updates the atlas tiles accordingly.
   */
  public fun removeCustomDataLayer(layerIndex: Int): Unit {
    TransferContext.writeArguments(LONG to layerIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeCustomDataLayerPtr, NIL)
  }

  /**
   * Returns the index of the custom data layer identified by the given name.
   */
  public fun getCustomDataLayerByName(layerName: String): Int {
    TransferContext.writeArguments(STRING to layerName)
    TransferContext.callMethod(rawPtr, MethodBindings.getCustomDataLayerByNamePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the name of the custom data layer identified by the given index. Names are identifiers of the layer therefore if the name is already taken it will fail and raise an error.
   */
  public fun setCustomDataLayerName(layerIndex: Int, layerName: String): Unit {
    TransferContext.writeArguments(LONG to layerIndex.toLong(), STRING to layerName)
    TransferContext.callMethod(rawPtr, MethodBindings.setCustomDataLayerNamePtr, NIL)
  }

  /**
   * Returns the name of the custom data layer identified by the given index.
   */
  public fun getCustomDataLayerName(layerIndex: Int): String {
    TransferContext.writeArguments(LONG to layerIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCustomDataLayerNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Sets the type of the custom data layer identified by the given index.
   */
  public fun setCustomDataLayerType(layerIndex: Int, layerType: VariantType): Unit {
    TransferContext.writeArguments(LONG to layerIndex.toLong(), LONG to layerType.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setCustomDataLayerTypePtr, NIL)
  }

  /**
   * Returns the type of the custom data layer identified by the given index.
   */
  public fun getCustomDataLayerType(layerIndex: Int): VariantType {
    TransferContext.writeArguments(LONG to layerIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCustomDataLayerTypePtr, LONG)
    return VariantType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Creates a source-level proxy for the given source ID. A proxy will map set of tile identifiers to another set of identifiers. Both the atlas coordinates ID and the alternative tile ID are kept the same when using source-level proxies.
   *
   * This can be used to replace a source in all TileMaps using this TileSet, as TileMap nodes will find and use the proxy's target source when one is available.
   *
   * Proxied tiles can be automatically replaced in TileMap nodes using the editor.
   */
  public fun setSourceLevelTileProxy(sourceFrom: Int, sourceTo: Int): Unit {
    TransferContext.writeArguments(LONG to sourceFrom.toLong(), LONG to sourceTo.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setSourceLevelTileProxyPtr, NIL)
  }

  /**
   * Returns the source-level proxy for the given source identifier.
   *
   * If the TileSet has no proxy for the given identifier, returns -1.
   */
  public fun getSourceLevelTileProxy(sourceFrom: Int): Int {
    TransferContext.writeArguments(LONG to sourceFrom.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSourceLevelTileProxyPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns if there is a source-level proxy for the given source ID.
   */
  public fun hasSourceLevelTileProxy(sourceFrom: Int): Boolean {
    TransferContext.writeArguments(LONG to sourceFrom.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.hasSourceLevelTileProxyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Removes a source-level tile proxy.
   */
  public fun removeSourceLevelTileProxy(sourceFrom: Int): Unit {
    TransferContext.writeArguments(LONG to sourceFrom.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeSourceLevelTileProxyPtr, NIL)
  }

  /**
   * Creates a coordinates-level proxy for the given identifiers. A proxy will map set of tile identifiers to another set of identifiers. The alternative tile ID is kept the same when using coordinates-level proxies.
   *
   * This can be used to replace a tile in all TileMaps using this TileSet, as TileMap nodes will find and use the proxy's target tile when one is available.
   *
   * Proxied tiles can be automatically replaced in TileMap nodes using the editor.
   */
  public fun setCoordsLevelTileProxy(
    pSourceFrom: Int,
    coordsFrom: Vector2i,
    sourceTo: Int,
    coordsTo: Vector2i,
  ): Unit {
    TransferContext.writeArguments(LONG to pSourceFrom.toLong(), VECTOR2I to coordsFrom, LONG to sourceTo.toLong(), VECTOR2I to coordsTo)
    TransferContext.callMethod(rawPtr, MethodBindings.setCoordsLevelTileProxyPtr, NIL)
  }

  /**
   * Returns the coordinate-level proxy for the given identifiers. The returned array contains the two target identifiers of the proxy (source ID and atlas coordinates ID).
   *
   * If the TileSet has no proxy for the given identifiers, returns an empty Array.
   */
  public fun getCoordsLevelTileProxy(sourceFrom: Int, coordsFrom: Vector2i): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to sourceFrom.toLong(), VECTOR2I to coordsFrom)
    TransferContext.callMethod(rawPtr, MethodBindings.getCoordsLevelTileProxyPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  /**
   * Returns if there is a coodinates-level proxy for the given identifiers.
   */
  public fun hasCoordsLevelTileProxy(sourceFrom: Int, coordsFrom: Vector2i): Boolean {
    TransferContext.writeArguments(LONG to sourceFrom.toLong(), VECTOR2I to coordsFrom)
    TransferContext.callMethod(rawPtr, MethodBindings.hasCoordsLevelTileProxyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Removes a coordinates-level proxy for the given identifiers.
   */
  public fun removeCoordsLevelTileProxy(sourceFrom: Int, coordsFrom: Vector2i): Unit {
    TransferContext.writeArguments(LONG to sourceFrom.toLong(), VECTOR2I to coordsFrom)
    TransferContext.callMethod(rawPtr, MethodBindings.removeCoordsLevelTileProxyPtr, NIL)
  }

  /**
   * Create an alternative-level proxy for the given identifiers. A proxy will map set of tile identifiers to another set of identifiers.
   *
   * This can be used to replace a tile in all TileMaps using this TileSet, as TileMap nodes will find and use the proxy's target tile when one is available.
   *
   * Proxied tiles can be automatically replaced in TileMap nodes using the editor.
   */
  public fun setAlternativeLevelTileProxy(
    sourceFrom: Int,
    coordsFrom: Vector2i,
    alternativeFrom: Int,
    sourceTo: Int,
    coordsTo: Vector2i,
    alternativeTo: Int,
  ): Unit {
    TransferContext.writeArguments(LONG to sourceFrom.toLong(), VECTOR2I to coordsFrom, LONG to alternativeFrom.toLong(), LONG to sourceTo.toLong(), VECTOR2I to coordsTo, LONG to alternativeTo.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setAlternativeLevelTileProxyPtr, NIL)
  }

  /**
   * Returns the alternative-level proxy for the given identifiers. The returned array contains the three proxie's target identifiers (source ID, atlas coords ID and alternative tile ID).
   *
   * If the TileSet has no proxy for the given identifiers, returns an empty Array.
   */
  public fun getAlternativeLevelTileProxy(
    sourceFrom: Int,
    coordsFrom: Vector2i,
    alternativeFrom: Int,
  ): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to sourceFrom.toLong(), VECTOR2I to coordsFrom, LONG to alternativeFrom.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getAlternativeLevelTileProxyPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  /**
   * Returns if there is an alternative-level proxy for the given identifiers.
   */
  public fun hasAlternativeLevelTileProxy(
    sourceFrom: Int,
    coordsFrom: Vector2i,
    alternativeFrom: Int,
  ): Boolean {
    TransferContext.writeArguments(LONG to sourceFrom.toLong(), VECTOR2I to coordsFrom, LONG to alternativeFrom.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.hasAlternativeLevelTileProxyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Removes an alternative-level proxy for the given identifiers.
   */
  public fun removeAlternativeLevelTileProxy(
    sourceFrom: Int,
    coordsFrom: Vector2i,
    alternativeFrom: Int,
  ): Unit {
    TransferContext.writeArguments(LONG to sourceFrom.toLong(), VECTOR2I to coordsFrom, LONG to alternativeFrom.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeAlternativeLevelTileProxyPtr, NIL)
  }

  /**
   * According to the configured proxies, maps the provided identifiers to a new set of identifiers. The source ID, atlas coordinates ID and alternative tile ID are returned as a 3 elements Array.
   *
   * This function first look for matching alternative-level proxies, then coordinates-level proxies, then source-level proxies.
   *
   * If no proxy corresponding to provided identifiers are found, returns the same values the ones used as arguments.
   */
  public fun mapTileProxy(
    sourceFrom: Int,
    coordsFrom: Vector2i,
    alternativeFrom: Int,
  ): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to sourceFrom.toLong(), VECTOR2I to coordsFrom, LONG to alternativeFrom.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.mapTileProxyPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  /**
   * Clears tile proxies pointing to invalid tiles.
   */
  public fun cleanupInvalidTileProxies(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.cleanupInvalidTileProxiesPtr, NIL)
  }

  /**
   * Clears all tile proxies.
   */
  public fun clearTileProxies(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearTileProxiesPtr, NIL)
  }

  /**
   * Adds a [godot.TileMapPattern] to be stored in the TileSet resource. If provided, insert it at the given [index].
   */
  @JvmOverloads
  public fun addPattern(pattern: TileMapPattern, index: Int = -1): Int {
    TransferContext.writeArguments(OBJECT to pattern, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addPatternPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the [godot.TileMapPattern] at the given [index].
   */
  @JvmOverloads
  public fun getPattern(index: Int = -1): TileMapPattern? {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPatternPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TileMapPattern?)
  }

  /**
   * Remove the [godot.TileMapPattern] at the given index.
   */
  public fun removePattern(index: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removePatternPtr, NIL)
  }

  /**
   * Returns the number of [godot.TileMapPattern] this tile set handles.
   */
  public fun getPatternsCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPatternsCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public enum class TileShape(
    id: Long,
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class TileLayout(
    id: Long,
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class TileOffsetAxis(
    id: Long,
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class CellNeighbor(
    id: Long,
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class TerrainMode(
    id: Long,
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val getNextSourceIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_next_source_id")

    public val addSourcePtr: VoidPtr = TypeManager.getMethodBindPtr("TileSet", "add_source")

    public val removeSourcePtr: VoidPtr = TypeManager.getMethodBindPtr("TileSet", "remove_source")

    public val setSourceIdPtr: VoidPtr = TypeManager.getMethodBindPtr("TileSet", "set_source_id")

    public val getSourceCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_source_count")

    public val getSourceIdPtr: VoidPtr = TypeManager.getMethodBindPtr("TileSet", "get_source_id")

    public val hasSourcePtr: VoidPtr = TypeManager.getMethodBindPtr("TileSet", "has_source")

    public val getSourcePtr: VoidPtr = TypeManager.getMethodBindPtr("TileSet", "get_source")

    public val setTileShapePtr: VoidPtr = TypeManager.getMethodBindPtr("TileSet", "set_tile_shape")

    public val getTileShapePtr: VoidPtr = TypeManager.getMethodBindPtr("TileSet", "get_tile_shape")

    public val setTileLayoutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "set_tile_layout")

    public val getTileLayoutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_tile_layout")

    public val setTileOffsetAxisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "set_tile_offset_axis")

    public val getTileOffsetAxisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_tile_offset_axis")

    public val setTileSizePtr: VoidPtr = TypeManager.getMethodBindPtr("TileSet", "set_tile_size")

    public val getTileSizePtr: VoidPtr = TypeManager.getMethodBindPtr("TileSet", "get_tile_size")

    public val setUvClippingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "set_uv_clipping")

    public val isUvClippingPtr: VoidPtr = TypeManager.getMethodBindPtr("TileSet", "is_uv_clipping")

    public val getOcclusionLayersCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_occlusion_layers_count")

    public val addOcclusionLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "add_occlusion_layer")

    public val moveOcclusionLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "move_occlusion_layer")

    public val removeOcclusionLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "remove_occlusion_layer")

    public val setOcclusionLayerLightMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "set_occlusion_layer_light_mask")

    public val getOcclusionLayerLightMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_occlusion_layer_light_mask")

    public val setOcclusionLayerSdfCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "set_occlusion_layer_sdf_collision")

    public val getOcclusionLayerSdfCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_occlusion_layer_sdf_collision")

    public val getPhysicsLayersCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_physics_layers_count")

    public val addPhysicsLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "add_physics_layer")

    public val movePhysicsLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "move_physics_layer")

    public val removePhysicsLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "remove_physics_layer")

    public val setPhysicsLayerCollisionLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "set_physics_layer_collision_layer")

    public val getPhysicsLayerCollisionLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_physics_layer_collision_layer")

    public val setPhysicsLayerCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "set_physics_layer_collision_mask")

    public val getPhysicsLayerCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_physics_layer_collision_mask")

    public val setPhysicsLayerPhysicsMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "set_physics_layer_physics_material")

    public val getPhysicsLayerPhysicsMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_physics_layer_physics_material")

    public val getTerrainSetsCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_terrain_sets_count")

    public val addTerrainSetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "add_terrain_set")

    public val moveTerrainSetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "move_terrain_set")

    public val removeTerrainSetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "remove_terrain_set")

    public val setTerrainSetModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "set_terrain_set_mode")

    public val getTerrainSetModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_terrain_set_mode")

    public val getTerrainsCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_terrains_count")

    public val addTerrainPtr: VoidPtr = TypeManager.getMethodBindPtr("TileSet", "add_terrain")

    public val moveTerrainPtr: VoidPtr = TypeManager.getMethodBindPtr("TileSet", "move_terrain")

    public val removeTerrainPtr: VoidPtr = TypeManager.getMethodBindPtr("TileSet", "remove_terrain")

    public val setTerrainNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "set_terrain_name")

    public val getTerrainNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_terrain_name")

    public val setTerrainColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "set_terrain_color")

    public val getTerrainColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_terrain_color")

    public val getNavigationLayersCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_navigation_layers_count")

    public val addNavigationLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "add_navigation_layer")

    public val moveNavigationLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "move_navigation_layer")

    public val removeNavigationLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "remove_navigation_layer")

    public val setNavigationLayerLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "set_navigation_layer_layers")

    public val getNavigationLayerLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_navigation_layer_layers")

    public val setNavigationLayerLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "set_navigation_layer_layer_value")

    public val getNavigationLayerLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_navigation_layer_layer_value")

    public val getCustomDataLayersCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_custom_data_layers_count")

    public val addCustomDataLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "add_custom_data_layer")

    public val moveCustomDataLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "move_custom_data_layer")

    public val removeCustomDataLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "remove_custom_data_layer")

    public val getCustomDataLayerByNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_custom_data_layer_by_name")

    public val setCustomDataLayerNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "set_custom_data_layer_name")

    public val getCustomDataLayerNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_custom_data_layer_name")

    public val setCustomDataLayerTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "set_custom_data_layer_type")

    public val getCustomDataLayerTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_custom_data_layer_type")

    public val setSourceLevelTileProxyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "set_source_level_tile_proxy")

    public val getSourceLevelTileProxyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_source_level_tile_proxy")

    public val hasSourceLevelTileProxyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "has_source_level_tile_proxy")

    public val removeSourceLevelTileProxyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "remove_source_level_tile_proxy")

    public val setCoordsLevelTileProxyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "set_coords_level_tile_proxy")

    public val getCoordsLevelTileProxyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_coords_level_tile_proxy")

    public val hasCoordsLevelTileProxyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "has_coords_level_tile_proxy")

    public val removeCoordsLevelTileProxyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "remove_coords_level_tile_proxy")

    public val setAlternativeLevelTileProxyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "set_alternative_level_tile_proxy")

    public val getAlternativeLevelTileProxyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_alternative_level_tile_proxy")

    public val hasAlternativeLevelTileProxyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "has_alternative_level_tile_proxy")

    public val removeAlternativeLevelTileProxyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "remove_alternative_level_tile_proxy")

    public val mapTileProxyPtr: VoidPtr = TypeManager.getMethodBindPtr("TileSet", "map_tile_proxy")

    public val cleanupInvalidTileProxiesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "cleanup_invalid_tile_proxies")

    public val clearTileProxiesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "clear_tile_proxies")

    public val addPatternPtr: VoidPtr = TypeManager.getMethodBindPtr("TileSet", "add_pattern")

    public val getPatternPtr: VoidPtr = TypeManager.getMethodBindPtr("TileSet", "get_pattern")

    public val removePatternPtr: VoidPtr = TypeManager.getMethodBindPtr("TileSet", "remove_pattern")

    public val getPatternsCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSet", "get_patterns_count")
  }
}
