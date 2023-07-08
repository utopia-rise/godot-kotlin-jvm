// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedStringArray
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.signal
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Godot editor's dock for managing files in the project.
 *
 * This class is available only in [godot.EditorPlugin]s and can't be instantiated. You can access it using [godot.EditorInterface.getFileSystemDock].
 *
 * While [godot.FileSystemDock] doesn't expose any methods for file manipulation, it can listen for various file-related signals.
 */
@GodotBaseType
public open class FileSystemDock internal constructor() : VBoxContainer() {
  /**
   * Emitted when a new scene is created that inherits the scene at [file] path.
   */
  public val inherit: Signal1<String> by signal("file")

  /**
   * Emitted when the given scenes are being instantiated in the editor.
   */
  public val instantiate: Signal1<PackedStringArray> by signal("files")

  /**
   * Emitted when an external [resource] had its file removed.
   */
  public val resourceRemoved: Signal1<Resource> by signal("resource")

  /**
   * Emitted when the given [file] was removed.
   */
  public val fileRemoved: Signal1<String> by signal("file")

  /**
   * Emitted when the given [folder] was removed.
   */
  public val folderRemoved: Signal1<String> by signal("folder")

  /**
   * Emitted when a file is moved from [oldFile] path to [newFile] path.
   */
  public val filesMoved: Signal2<String, String> by signal("oldFile", "newFile")

  /**
   * Emitted when a folder is moved from [oldFolder] path to [newFolder] path.
   */
  public val folderMoved: Signal2<String, String> by signal("oldFolder", "newFolder")

  /**
   * Emitted when the user switches file display mode or split mode.
   */
  public val displayModeChanged: Signal0 by signal()

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_FILESYSTEMDOCK, scriptIndex)
    return true
  }

  /**
   * Sets the given [path] as currently selected, ensuring that the selected file/directory is visible.
   */
  public fun navigateToPath(path: String): Unit {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FILESYSTEMDOCK_NAVIGATE_TO_PATH,
        NIL)
  }

  /**
   * Registers a new [godot.EditorResourceTooltipPlugin].
   */
  public fun addResourceTooltipPlugin(plugin: EditorResourceTooltipPlugin): Unit {
    TransferContext.writeArguments(OBJECT to plugin)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_FILESYSTEMDOCK_ADD_RESOURCE_TOOLTIP_PLUGIN, NIL)
  }

  /**
   * Removes an [godot.EditorResourceTooltipPlugin]. Fails if the plugin wasn't previously added.
   */
  public fun removeResourceTooltipPlugin(plugin: EditorResourceTooltipPlugin): Unit {
    TransferContext.writeArguments(OBJECT to plugin)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_FILESYSTEMDOCK_REMOVE_RESOURCE_TOOLTIP_PLUGIN, NIL)
  }

  public companion object
}
