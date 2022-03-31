// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedStringArray
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Boolean
import kotlin.Double
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Resource filesystem, as the editor sees it.
 *
 * This object holds information of all resources in the filesystem, their types, etc.
 *
 * **Note:** This class shouldn't be instantiated directly. Instead, access the singleton using [godot.EditorInterface.getResourceFilesystem].
 */
@GodotBaseType
public open class EditorFileSystem internal constructor() : Node() {
  /**
   * Emitted if a resource is reimported.
   */
  public val resourcesReimported: Signal1<PackedStringArray> by signal("resources")

  /**
   * Emitted if the source of any imported file changed.
   */
  public val sourcesChanged: Signal1<Boolean> by signal("exist")

  /**
   * Emitted if the filesystem changed.
   */
  public val filesystemChanged: Signal0 by signal()

  /**
   * Emitted if at least one resource is reloaded when the filesystem is scanned.
   */
  public val resourcesReload: Signal1<PackedStringArray> by signal("resources")

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_EDITORFILESYSTEM)
  }

  /**
   * Gets the root directory object.
   */
  public open fun getFilesystem(): EditorFileSystemDirectory? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEM_GET_FILESYSTEM,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as EditorFileSystemDirectory?
  }

  /**
   * Returns `true` of the filesystem is being scanned.
   */
  public open fun isScanning(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEM_IS_SCANNING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the scan progress for 0 to 1 if the FS is being scanned.
   */
  public open fun getScanningProgress(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEM_GET_SCANNING_PROGRESS, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Scan the filesystem for changes.
   */
  public open fun scan(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEM_SCAN, NIL)
  }

  /**
   * Check if the source of any imported resource changed.
   */
  public open fun scanSources(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEM_SCAN_SOURCES, NIL)
  }

  /**
   * Update a file information. Call this if an external program (not Godot) modified the file.
   */
  public open fun updateFile(path: String): Unit {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEM_UPDATE_FILE, NIL)
  }

  /**
   * Returns a view into the filesystem at `path`.
   */
  public open fun getFilesystemPath(path: String): EditorFileSystemDirectory? {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEM_GET_FILESYSTEM_PATH, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as EditorFileSystemDirectory?
  }

  /**
   * Returns the resource type of the file, given the full path. This returns a string such as `"Resource"` or `"GDScript"`, *not* a file extension such as `".gd"`.
   */
  public open fun getFileType(path: String): String {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEM_GET_FILE_TYPE,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Scans the script files and updates the list of custom class names.
   */
  public open fun updateScriptClasses(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEM_UPDATE_SCRIPT_CLASSES, NIL)
  }

  public companion object
}
