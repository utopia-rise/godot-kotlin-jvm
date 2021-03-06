// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.String
import kotlin.Suppress

/**
 * Resource filesystem, as the editor sees it.
 *
 * This object holds information of all resources in the filesystem, their types, etc.
 *
 * **Note:** This class shouldn't be instantiated directly. Instead, access the singleton using [godot.EditorInterface.getResourceFilesystem].
 */
@GodotBaseType
open class EditorFileSystem : Node() {
  /**
   * Emitted if the filesystem changed.
   */
  val filesystemChanged: Signal0 by signal()

  /**
   * Remitted if a resource is reimported.
   */
  val resourcesReimported: Signal1<PoolStringArray> by signal("resources")

  /**
   * Emitted if at least one resource is reloaded when the filesystem is scanned.
   */
  val resourcesReload: Signal1<PoolStringArray> by signal("resources")

  /**
   * Emitted if the source of any imported file changed.
   */
  val sourcesChanged: Signal1<Boolean> by signal("exist")

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_EDITORFILESYSTEM)

  /**
   * Gets the type of the file, given the full path.
   */
  open fun getFileType(path: String): String {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEM_GET_FILE_TYPE,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Gets the root directory object.
   */
  open fun getFilesystem(): EditorFileSystemDirectory? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEM_GET_FILESYSTEM,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as EditorFileSystemDirectory?
  }

  /**
   * Returns a view into the filesystem at `path`.
   */
  open fun getFilesystemPath(path: String): EditorFileSystemDirectory? {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEM_GET_FILESYSTEM_PATH, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as EditorFileSystemDirectory?
  }

  /**
   * Returns the scan progress for 0 to 1 if the FS is being scanned.
   */
  open fun getScanningProgress(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEM_GET_SCANNING_PROGRESS, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns `true` of the filesystem is being scanned.
   */
  open fun isScanning(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEM_IS_SCANNING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Scan the filesystem for changes.
   */
  open fun scan() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEM_SCAN, NIL)
  }

  /**
   * Check if the source of any imported resource changed.
   */
  open fun scanSources() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEM_SCAN_SOURCES, NIL)
  }

  /**
   * Update a file information. Call this if an external program (not Godot) modified the file.
   */
  open fun updateFile(path: String) {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEM_UPDATE_FILE, NIL)
  }

  /**
   * Scans the script files and updates the list of custom class names.
   */
  open fun updateScriptClasses() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEM_UPDATE_SCRIPT_CLASSES, NIL)
  }
}
