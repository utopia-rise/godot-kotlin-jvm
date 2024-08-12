// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * When placed on a [TileMap], tiles from [TileSetScenesCollectionSource] will automatically
 * instantiate an associated scene at the cell's position in the TileMap.
 * Scenes are instantiated as children of the [TileMap] when it enters the tree. If you add/remove a
 * scene tile in the [TileMap] that is already inside the tree, the [TileMap] will automatically
 * instantiate/free the scene accordingly.
 */
@GodotBaseType
public open class TileSetScenesCollectionSource : TileSetSource() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TILESETSCENESCOLLECTIONSOURCE, scriptIndex)
    return true
  }

  /**
   * Returns the number or scene tiles this TileSet source has.
   */
  public fun getSceneTilesCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSceneTilesCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the scene tile ID of the scene tile at [index].
   */
  public fun getSceneTileId(index: Int): Int {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSceneTileIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns whether this TileSet source has a scene tile with [id].
   */
  public fun hasSceneTileId(id: Int): Boolean {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.hasSceneTileIdPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Creates a scene-based tile out of the given scene.
   * Returns a newly generated unique ID.
   */
  @JvmOverloads
  public fun createSceneTile(packedScene: PackedScene, idOverride: Int = -1): Int {
    TransferContext.writeArguments(OBJECT to packedScene, LONG to idOverride.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.createSceneTilePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Changes a scene tile's ID from [id] to [newId]. This will fail if there is already a tile with
   * an ID equal to [newId].
   */
  public fun setSceneTileId(id: Int, newId: Int): Unit {
    TransferContext.writeArguments(LONG to id.toLong(), LONG to newId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setSceneTileIdPtr, NIL)
  }

  /**
   * Assigns a [PackedScene] resource to the scene tile with [id]. This will fail if the scene does
   * not extend CanvasItem, as positioning properties are needed to place the scene on the TileMap.
   */
  public fun setSceneTileScene(id: Int, packedScene: PackedScene): Unit {
    TransferContext.writeArguments(LONG to id.toLong(), OBJECT to packedScene)
    TransferContext.callMethod(rawPtr, MethodBindings.setSceneTileScenePtr, NIL)
  }

  /**
   * Returns the [PackedScene] resource of scene tile with [id].
   */
  public fun getSceneTileScene(id: Int): PackedScene? {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSceneTileScenePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as PackedScene?)
  }

  /**
   * Sets whether or not the scene tile with [id] should display a placeholder in the editor. This
   * might be useful for scenes that are not visible.
   */
  public fun setSceneTileDisplayPlaceholder(id: Int, displayPlaceholder: Boolean): Unit {
    TransferContext.writeArguments(LONG to id.toLong(), BOOL to displayPlaceholder)
    TransferContext.callMethod(rawPtr, MethodBindings.setSceneTileDisplayPlaceholderPtr, NIL)
  }

  /**
   * Returns whether the scene tile with [id] displays a placeholder in the editor.
   */
  public fun getSceneTileDisplayPlaceholder(id: Int): Boolean {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSceneTileDisplayPlaceholderPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Remove the scene tile with [id].
   */
  public fun removeSceneTile(id: Int): Unit {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeSceneTilePtr, NIL)
  }

  /**
   * Returns the scene ID a following call to [createSceneTile] would return.
   */
  public fun getNextSceneTileId(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNextSceneTileIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public companion object

  internal object MethodBindings {
    public val getSceneTilesCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetScenesCollectionSource", "get_scene_tiles_count")

    public val getSceneTileIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetScenesCollectionSource", "get_scene_tile_id")

    public val hasSceneTileIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetScenesCollectionSource", "has_scene_tile_id")

    public val createSceneTilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetScenesCollectionSource", "create_scene_tile")

    public val setSceneTileIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetScenesCollectionSource", "set_scene_tile_id")

    public val setSceneTileScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetScenesCollectionSource", "set_scene_tile_scene")

    public val getSceneTileScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetScenesCollectionSource", "get_scene_tile_scene")

    public val setSceneTileDisplayPlaceholderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetScenesCollectionSource", "set_scene_tile_display_placeholder")

    public val getSceneTileDisplayPlaceholderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetScenesCollectionSource", "get_scene_tile_display_placeholder")

    public val removeSceneTilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetScenesCollectionSource", "remove_scene_tile")

    public val getNextSceneTileIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetScenesCollectionSource", "get_next_scene_tile_id")
  }
}
