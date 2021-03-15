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
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * A directory for the resource filesystem.
 *
 * A more generalized, low-level variation of the directory concept.
 */
@GodotBaseType
open class EditorFileSystemDirectory : Object() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_EDITORFILESYSTEMDIRECTORY,
        ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  /**
   * Returns the index of the directory with name `name` or `-1` if not found.
   */
  open fun findDirIndex(name: String): Long {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_FIND_DIR_INDEX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the index of the file with name `name` or `-1` if not found.
   */
  open fun findFileIndex(name: String): Long {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_FIND_FILE_INDEX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the name of the file at index `idx`.
   */
  open fun getFile(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_GET_FILE,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the number of files in this directory.
   */
  open fun getFileCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_GET_FILE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns `true` if the file at index `idx` imported properly.
   */
  open fun getFileImportIsValid(idx: Long): Boolean {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_GET_FILE_IMPORT_IS_VALID, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the path to the file at index `idx`.
   */
  open fun getFilePath(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_GET_FILE_PATH, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the base class of the script class defined in the file at index `idx`. If the file doesn't define a script class using the `class_name` syntax, this will return an empty string.
   */
  open fun getFileScriptClassExtends(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_GET_FILE_SCRIPT_CLASS_EXTENDS, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the name of the script class defined in the file at index `idx`. If the file doesn't define a script class using the `class_name` syntax, this will return an empty string.
   */
  open fun getFileScriptClassName(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_GET_FILE_SCRIPT_CLASS_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the file extension of the file at index `idx`.
   */
  open fun getFileType(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_GET_FILE_TYPE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the name of this directory.
   */
  open fun getName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_GET_NAME,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the parent directory for this directory or `null` if called on a directory at `res://` or `user://`.
   */
  open fun getParent(): EditorFileSystemDirectory? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_GET_PARENT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as EditorFileSystemDirectory?
  }

  /**
   * Returns the path to this directory.
   */
  open fun getPath(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_GET_PATH,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the subdirectory at index `idx`.
   */
  open fun getSubdir(idx: Long): EditorFileSystemDirectory? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_GET_SUBDIR, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as EditorFileSystemDirectory?
  }

  /**
   * Returns the number of subdirectories in this directory.
   */
  open fun getSubdirCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_GET_SUBDIR_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }
}
