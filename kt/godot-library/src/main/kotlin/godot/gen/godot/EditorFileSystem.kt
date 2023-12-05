// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedStringArray
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
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
   * Emitted if the filesystem changed.
   */
  public val filesystemChanged: Signal0 by signal()

  /**
   * Emitted when the list of global script classes gets updated.
   */
  public val scriptClassesUpdated: Signal0 by signal()

  /**
   * Emitted if the source of any imported file changed.
   */
  public val sourcesChanged: Signal1<Boolean> by signal("exist")

  /**
   * Emitted if a resource is reimported.
   */
  public val resourcesReimported: Signal1<PackedStringArray> by signal("resources")

  /**
   * Emitted if at least one resource is reloaded when the filesystem is scanned.
   */
  public val resourcesReload: Signal1<PackedStringArray> by signal("resources")

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORFILESYSTEM, scriptIndex)
    return true
  }

  /**
   * Gets the root directory object.
   */
  public fun getFilesystem(): EditorFileSystemDirectory? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFilesystemPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as EditorFileSystemDirectory?)
  }

  /**
   * Returns `true` if the filesystem is being scanned.
   */
  public fun isScanning(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isScanningPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the scan progress for 0 to 1 if the FS is being scanned.
   */
  public fun getScanningProgress(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getScanningProgressPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Scan the filesystem for changes.
   */
  public fun scan(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.scanPtr, NIL)
  }

  /**
   * Check if the source of any imported resource changed.
   */
  public fun scanSources(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.scanSourcesPtr, NIL)
  }

  /**
   * Add a file in an existing directory, or schedule file information to be updated on editor restart. Can be used to update text files saved by an external program.
   *
   * This will not import the file. To reimport, call [reimportFiles] or [scan] methods.
   */
  public fun updateFile(path: String): Unit {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.updateFilePtr, NIL)
  }

  /**
   * Returns a view into the filesystem at [path].
   */
  public fun getFilesystemPath(path: String): EditorFileSystemDirectory? {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.getFilesystemPathPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as EditorFileSystemDirectory?)
  }

  /**
   * Returns the resource type of the file, given the full path. This returns a string such as `"Resource"` or `"GDScript"`, *not* a file extension such as `".gd"`.
   */
  public fun getFileType(path: String): String {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.getFileTypePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Reimports a set of files. Call this if these files or their `.import` files were directly edited by script or an external program.
   *
   * If the file type changed or the file was newly created, use [updateFile] or [scan].
   *
   * **Note:** This function blocks until the import is finished. However, the main loop iteration, including timers and [godot.Node.Process], will occur during the import process due to progress bar updates. Avoid calls to [reimportFiles] or [scan] while an import is in progress.
   */
  public fun reimportFiles(files: PackedStringArray): Unit {
    TransferContext.writeArguments(PACKED_STRING_ARRAY to files)
    TransferContext.callMethod(rawPtr, MethodBindings.reimportFilesPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val getFilesystemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileSystem", "get_filesystem")

    public val isScanningPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileSystem", "is_scanning")

    public val getScanningProgressPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileSystem", "get_scanning_progress")

    public val scanPtr: VoidPtr = TypeManager.getMethodBindPtr("EditorFileSystem", "scan")

    public val scanSourcesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileSystem", "scan_sources")

    public val updateFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileSystem", "update_file")

    public val getFilesystemPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileSystem", "get_filesystem_path")

    public val getFileTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileSystem", "get_file_type")

    public val reimportFilesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileSystem", "reimport_files")
  }
}
