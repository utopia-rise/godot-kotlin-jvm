// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * When placed on a [TileMap], tiles from [TileSetScenesCollectionSource] will automatically
 * instantiate an associated scene at the cell's position in the TileMap.
 *
 * Scenes are instantiated as children of the [TileMap] when it enters the tree. If you add/remove a
 * scene tile in the [TileMap] that is already inside the tree, the [TileMap] will automatically
 * instantiate/free the scene accordingly.
 *
 * **Note:** Scene tiles all occupy one tile slot and instead use alternate tile ID to identify
 * scene index. [TileSetSource.getTilesCount] will always return `1`. Use [getSceneTilesCount] to get a
 * number of scenes in a [TileSetScenesCollectionSource].
 *
 * Use this code if you want to find the scene path at a given tile in [TileMapLayer]:
 *
 * ```gdscript
 * //gdscript
 * var source_id = tile_map_layer.get_cell_source_id(Vector2i(x, y))
 * if source_id > -1:
 *     var scene_source = tile_map_layer.tile_set.get_source(source_id)
 *     if scene_source is TileSetScenesCollectionSource:
 *         var alt_id = tile_map_layer.get_cell_alternative_tile(Vector2i(x, y))
 *         # The assigned PackedScene.
 *         var scene = scene_source.get_scene_tile_scene(alt_id)
 * ```
 *
 * ```csharp
 * //csharp
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
    createNativeObject(688, scriptIndex)
  }

  /**
   * Returns the number or scene tiles this TileSet source has.
   */
  public final fun getSceneTilesCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSceneTilesCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the scene tile ID of the scene tile at [index].
   */
  public final fun getSceneTileId(index: Int): Int {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getSceneTileIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns whether this TileSet source has a scene tile with [id].
   */
  public final fun hasSceneTileId(id: Int): Boolean {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(ptr, MethodBindings.hasSceneTileIdPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Creates a scene-based tile out of the given scene.
   *
   * Returns a newly generated unique ID.
   */
  @JvmOverloads
  public final fun createSceneTile(packedScene: PackedScene?, idOverride: Int = -1): Int {
    TransferContext.writeArguments(OBJECT to packedScene, LONG to idOverride.toLong())
    TransferContext.callMethod(ptr, MethodBindings.createSceneTilePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Changes a scene tile's ID from [id] to [newId]. This will fail if there is already a tile with
   * an ID equal to [newId].
   */
  public final fun setSceneTileId(id: Int, newId: Int): Unit {
    TransferContext.writeArguments(LONG to id.toLong(), LONG to newId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setSceneTileIdPtr, NIL)
  }

  /**
   * Assigns a [PackedScene] resource to the scene tile with [id]. This will fail if the scene does
   * not extend CanvasItem, as positioning properties are needed to place the scene on the TileMap.
   */
  public final fun setSceneTileScene(id: Int, packedScene: PackedScene?): Unit {
    TransferContext.writeArguments(LONG to id.toLong(), OBJECT to packedScene)
    TransferContext.callMethod(ptr, MethodBindings.setSceneTileScenePtr, NIL)
  }

  /**
   * Returns the [PackedScene] resource of scene tile with [id].
   */
  public final fun getSceneTileScene(id: Int): PackedScene? {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getSceneTileScenePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as PackedScene?)
  }

  /**
   * Sets whether or not the scene tile with [id] should display a placeholder in the editor. This
   * might be useful for scenes that are not visible.
   */
  public final fun setSceneTileDisplayPlaceholder(id: Int, displayPlaceholder: Boolean): Unit {
    TransferContext.writeArguments(LONG to id.toLong(), BOOL to displayPlaceholder)
    TransferContext.callMethod(ptr, MethodBindings.setSceneTileDisplayPlaceholderPtr, NIL)
  }

  /**
   * Returns whether the scene tile with [id] displays a placeholder in the editor.
   */
  public final fun getSceneTileDisplayPlaceholder(id: Int): Boolean {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getSceneTileDisplayPlaceholderPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Remove the scene tile with [id].
   */
  public final fun removeSceneTile(id: Int): Unit {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(ptr, MethodBindings.removeSceneTilePtr, NIL)
  }

  /**
   * Returns the scene ID a following call to [createSceneTile] would return.
   */
  public final fun getNextSceneTileId(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getNextSceneTileIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public companion object

  public object MethodBindings {
    internal val getSceneTilesCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetScenesCollectionSource", "get_scene_tiles_count", 2455072627)

    internal val getSceneTileIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetScenesCollectionSource", "get_scene_tile_id", 3744713108)

    internal val hasSceneTileIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetScenesCollectionSource", "has_scene_tile_id", 3067735520)

    internal val createSceneTilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetScenesCollectionSource", "create_scene_tile", 1117465415)

    internal val setSceneTileIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetScenesCollectionSource", "set_scene_tile_id", 3937882851)

    internal val setSceneTileScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetScenesCollectionSource", "set_scene_tile_scene", 3435852839)

    internal val getSceneTileScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetScenesCollectionSource", "get_scene_tile_scene", 511017218)

    internal val setSceneTileDisplayPlaceholderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetScenesCollectionSource", "set_scene_tile_display_placeholder", 300928843)

    internal val getSceneTileDisplayPlaceholderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetScenesCollectionSource", "get_scene_tile_display_placeholder", 1116898809)

    internal val removeSceneTilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetScenesCollectionSource", "remove_scene_tile", 1286410249)

    internal val getNextSceneTileIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetScenesCollectionSource", "get_next_scene_tile_id", 3905245786)
  }
}
