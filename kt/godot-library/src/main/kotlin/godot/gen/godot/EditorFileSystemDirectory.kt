// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class EditorFileSystemDirectory : Object() {
  override fun __new(): VoidPtr =
      TransferContext.invokeConstructor(ENGINECLASS_EDITORFILESYSTEMDIRECTORY)

  open fun findDirIndex(name: String): Long {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_FIND_DIR_INDEX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun findFileIndex(name: String): Long {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_FIND_FILE_INDEX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getFile(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_GET_FILE,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getFileCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_GET_FILE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getFileImportIsValid(idx: Long): Boolean {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_GET_FILE_IMPORT_IS_VALID, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun getFilePath(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_GET_FILE_PATH, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getFileScriptClassExtends(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_GET_FILE_SCRIPT_CLASS_EXTENDS, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getFileScriptClassName(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_GET_FILE_SCRIPT_CLASS_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getFileType(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_GET_FILE_TYPE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_GET_NAME,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getParent(): EditorFileSystemDirectory? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_GET_PARENT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as EditorFileSystemDirectory?
  }

  open fun getPath(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_GET_PATH,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getSubdir(idx: Long): EditorFileSystemDirectory? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_GET_SUBDIR, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as EditorFileSystemDirectory?
  }

  open fun getSubdirCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_GET_SUBDIR_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }
}
