// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * A directory for the resource filesystem.
 *
 * A more generalized, low-level variation of the directory concept.
 */
@GodotBaseType
public open class EditorFileSystemDirectory : Object() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_EDITORFILESYSTEMDIRECTORY)
  }

  /**
   * Returns the number of subdirectories in this directory.
   */
  public open fun getSubdirCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_GET_SUBDIR_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the subdirectory at index `idx`.
   */
  public open fun getSubdir(idx: Long): EditorFileSystemDirectory? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_GET_SUBDIR, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as EditorFileSystemDirectory?
  }

  /**
   * Returns the number of files in this directory.
   */
  public open fun getFileCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_GET_FILE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the name of the file at index `idx`.
   */
  public open fun getFile(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_GET_FILE,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the path to the file at index `idx`.
   */
  public open fun getFilePath(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_GET_FILE_PATH, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the resource type of the file at index `idx`. This returns a string such as `"Resource"` or `"GDScript"`, *not* a file extension such as `".gd"`.
   */
  public open fun getFileType(idx: Long): StringName {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_GET_FILE_TYPE, STRING_NAME)
    return TransferContext.readReturnValue(STRING_NAME, false) as StringName
  }

  /**
   * Returns the name of the script class defined in the file at index `idx`. If the file doesn't define a script class using the `class_name` syntax, this will return an empty string.
   */
  public open fun getFileScriptClassName(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_GET_FILE_SCRIPT_CLASS_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the base class of the script class defined in the file at index `idx`. If the file doesn't define a script class using the `class_name` syntax, this will return an empty string.
   */
  public open fun getFileScriptClassExtends(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_GET_FILE_SCRIPT_CLASS_EXTENDS, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns `true` if the file at index `idx` imported properly.
   */
  public open fun getFileImportIsValid(idx: Long): Boolean {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_GET_FILE_IMPORT_IS_VALID, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the name of this directory.
   */
  public open fun getName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_GET_NAME,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the path to this directory.
   */
  public open fun getPath(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_GET_PATH,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the parent directory for this directory or `null` if called on a directory at `res://` or `user://`.
   */
  public open fun getParent(): EditorFileSystemDirectory? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_GET_PARENT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as EditorFileSystemDirectory?
  }

  /**
   * Returns the index of the file with name `name` or `-1` if not found.
   */
  public open fun findFileIndex(name: String): Long {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_FIND_FILE_INDEX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the index of the directory with name `name` or `-1` if not found.
   */
  public open fun findDirIndex(name: String): Long {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_FIND_DIR_INDEX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public companion object
}
