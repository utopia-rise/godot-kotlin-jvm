// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

private const val ENGINE_CLASS_TILESETSCENESCOLLECTIONSOURCE_INDEX: Int = 669

/**
 * When placed on a [TileMap], tiles from [TileSetScenesCollectionSource] will automatically
 * instantiate an associated scene at the cell's position in the TileMap.
 * Scenes are instantiated as children of the [TileMap] when it enters the tree. If you add/remove a
 * scene tile in the [TileMap] that is already inside the tree, the [TileMap] will automatically
 * instantiate/free the scene accordingly.
 * **Note:** Scene tiles all occupy one tile slot and instead use alternate tile ID to identify
 * scene index. [TileSetSource.getTilesCount] will always return `1`. Use [getSceneTilesCount] to get a
 * number of scenes in a [TileSetScenesCollectionSource].
 * Use this code if you want to find the scene path at a given tile in [TileMapLayer]:
 *
 * gdscript:
 * ```gdscript
 * var source_id = tile_map_layer.get_cell_source_id(Vector2i(x, y))
 * if source_id > -1:
 *     var scene_source = tile_map_layer.tile_set.get_source(source_id)
 *     if scene_source is TileSetScenesCollectionSource:
 *         var alt_id = tile_map_layer.get_cell_alternative_tile(Vector2i(x, y))
 *         # The assigned PackedScene.
 *         var scene = scene_source.get_scene_tile_scene(alt_id)
 * ```
 * csharp:
 * ```csharp
 * int sourceId = tileMapLayer.GetCellSourceId(new Vector2I(x, y));
 * if (sourceId > -1)
 * {
 *     TileSetSource source = tileMapLayer.TileSet.GetSource(sourceId);
 *     if (source is TileSetScenesCollectionSource sceneSource)
 *     {
 *         int altId = tileMapLayer.GetCellAlternativeTile(new Vector2I(x, y));
 *         // The assigned PackedScene.
 *         PackedScene scene = sceneSource.GetSceneTileScene(altId);
 *     }
 * }
 * ```
 */
@GodotBaseType
public open class TileSetScenesCollectionSource : TileSetSource() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_TILESETSCENESCOLLECTIONSOURCE_INDEX, scriptIndex)
  }

  /**
   * Returns the number or scene tiles this TileSet source has.
   */
  public final fun getSceneTilesCount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSceneTilesCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the scene tile ID of the scene tile at [index].
   */
  public final fun getSceneTileId(index: Int): Int {
    Internals.writeArguments(LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getSceneTileIdPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns whether this TileSet source has a scene tile with [id].
   */
  public final fun hasSceneTileId(id: Int): Boolean {
    Internals.writeArguments(LONG to id.toLong())
    Internals.callMethod(rawPtr, MethodBindings.hasSceneTileIdPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Creates a scene-based tile out of the given scene.
   * Returns a newly generated unique ID.
   */
  @JvmOverloads
  public final fun createSceneTile(packedScene: PackedScene?, idOverride: Int = -1): Int {
    Internals.writeArguments(OBJECT to packedScene, LONG to idOverride.toLong())
    Internals.callMethod(rawPtr, MethodBindings.createSceneTilePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Changes a scene tile's ID from [id] to [newId]. This will fail if there is already a tile with
   * an ID equal to [newId].
   */
  public final fun setSceneTileId(id: Int, newId: Int): Unit {
    Internals.writeArguments(LONG to id.toLong(), LONG to newId.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setSceneTileIdPtr, NIL)
  }

  /**
   * Assigns a [PackedScene] resource to the scene tile with [id]. This will fail if the scene does
   * not extend CanvasItem, as positioning properties are needed to place the scene on the TileMap.
   */
  public final fun setSceneTileScene(id: Int, packedScene: PackedScene?): Unit {
    Internals.writeArguments(LONG to id.toLong(), OBJECT to packedScene)
    Internals.callMethod(rawPtr, MethodBindings.setSceneTileScenePtr, NIL)
  }

  /**
   * Returns the [PackedScene] resource of scene tile with [id].
   */
  public final fun getSceneTileScene(id: Int): PackedScene? {
    Internals.writeArguments(LONG to id.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getSceneTileScenePtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as PackedScene?)
  }

  /**
   * Sets whether or not the scene tile with [id] should display a placeholder in the editor. This
   * might be useful for scenes that are not visible.
   */
  public final fun setSceneTileDisplayPlaceholder(id: Int, displayPlaceholder: Boolean): Unit {
    Internals.writeArguments(LONG to id.toLong(), BOOL to displayPlaceholder)
    Internals.callMethod(rawPtr, MethodBindings.setSceneTileDisplayPlaceholderPtr, NIL)
  }

  /**
   * Returns whether the scene tile with [id] displays a placeholder in the editor.
   */
  public final fun getSceneTileDisplayPlaceholder(id: Int): Boolean {
    Internals.writeArguments(LONG to id.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getSceneTileDisplayPlaceholderPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Remove the scene tile with [id].
   */
  public final fun removeSceneTile(id: Int): Unit {
    Internals.writeArguments(LONG to id.toLong())
    Internals.callMethod(rawPtr, MethodBindings.removeSceneTilePtr, NIL)
  }

  /**
   * Returns the scene ID a following call to [createSceneTile] would return.
   */
  public final fun getNextSceneTileId(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getNextSceneTileIdPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public companion object

  public object MethodBindings {
    internal val getSceneTilesCountPtr: VoidPtr =
        Internals.getMethodBindPtr("TileSetScenesCollectionSource", "get_scene_tiles_count", 2455072627)

    internal val getSceneTileIdPtr: VoidPtr =
        Internals.getMethodBindPtr("TileSetScenesCollectionSource", "get_scene_tile_id", 3744713108)

    internal val hasSceneTileIdPtr: VoidPtr =
        Internals.getMethodBindPtr("TileSetScenesCollectionSource", "has_scene_tile_id", 3067735520)

    internal val createSceneTilePtr: VoidPtr =
        Internals.getMethodBindPtr("TileSetScenesCollectionSource", "create_scene_tile", 1117465415)

    internal val setSceneTileIdPtr: VoidPtr =
        Internals.getMethodBindPtr("TileSetScenesCollectionSource", "set_scene_tile_id", 3937882851)

    internal val setSceneTileScenePtr: VoidPtr =
        Internals.getMethodBindPtr("TileSetScenesCollectionSource", "set_scene_tile_scene", 3435852839)

    internal val getSceneTileScenePtr: VoidPtr =
        Internals.getMethodBindPtr("TileSetScenesCollectionSource", "get_scene_tile_scene", 511017218)

    internal val setSceneTileDisplayPlaceholderPtr: VoidPtr =
        Internals.getMethodBindPtr("TileSetScenesCollectionSource", "set_scene_tile_display_placeholder", 300928843)

    internal val getSceneTileDisplayPlaceholderPtr: VoidPtr =
        Internals.getMethodBindPtr("TileSetScenesCollectionSource", "get_scene_tile_display_placeholder", 1116898809)

    internal val removeSceneTilePtr: VoidPtr =
        Internals.getMethodBindPtr("TileSetScenesCollectionSource", "remove_scene_tile", 1286410249)

    internal val getNextSceneTileIdPtr: VoidPtr =
        Internals.getMethodBindPtr("TileSetScenesCollectionSource", "get_next_scene_tile_id", 3905245786)
  }
}
