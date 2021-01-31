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

@GodotBaseType
open class EditorFileSystem : Node() {
  val filesystemChanged: Signal0 by signal()

  val resourcesReimported: Signal1<PoolStringArray> by signal("resources")

  val resourcesReload: Signal1<PoolStringArray> by signal("resources")

  val sourcesChanged: Signal1<Boolean> by signal("exist")

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_EDITORFILESYSTEM)

  open fun getFileType(path: String): String {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEM_GET_FILE_TYPE,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getFilesystem(): EditorFileSystemDirectory? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEM_GET_FILESYSTEM,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as EditorFileSystemDirectory?
  }

  open fun getFilesystemPath(path: String): EditorFileSystemDirectory? {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEM_GET_FILESYSTEM_PATH, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as EditorFileSystemDirectory?
  }

  open fun getScanningProgress(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEM_GET_SCANNING_PROGRESS, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  open fun isScanning(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEM_IS_SCANNING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun scan() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEM_SCAN, NIL)
  }

  open fun scanSources() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEM_SCAN_SOURCES, NIL)
  }

  open fun updateFile(path: String) {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEM_UPDATE_FILE, NIL)
  }

  open fun updateScriptClasses() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEM_UPDATE_SCRIPT_CLASSES, NIL)
  }

  companion object
}
