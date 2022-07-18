// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

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
public open class EditorFileSystemDirectory internal constructor() : Object() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_EDITORFILESYSTEMDIRECTORY)
  }

  /**
   * Returns the number of subdirectories in this directory.
   */
  public fun getSubdirCount(): Long {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_GET_SUBDIR_COUNT, LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the subdirectory at index `idx`.
   */
  public fun getSubdir(idx: Long): EditorFileSystemDirectory? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_GET_SUBDIR,
        OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as EditorFileSystemDirectory?
  }

  /**
   * Returns the number of files in this directory.
   */
  public fun getFileCount(): Long {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_GET_FILE_COUNT,
        LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the name of the file at index `idx`.
   */
  public fun getFile(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_GET_FILE,
        STRING.ordinal)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the path to the file at index `idx`.
   */
  public fun getFilePath(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_GET_FILE_PATH,
        STRING.ordinal)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the resource type of the file at index `idx`. This returns a string such as `"Resource"` or `"GDScript"`, *not* a file extension such as `".gd"`.
   */
  public fun getFileType(idx: Long): StringName {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_GET_FILE_TYPE,
        STRING_NAME.ordinal)
    return TransferContext.readReturnValue(STRING_NAME, false) as StringName
  }

  /**
   * Returns the name of the script class defined in the file at index `idx`. If the file doesn't define a script class using the `class_name` syntax, this will return an empty string.
   */
  public fun getFileScriptClassName(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_GET_FILE_SCRIPT_CLASS_NAME,
        STRING.ordinal)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the base class of the script class defined in the file at index `idx`. If the file doesn't define a script class using the `class_name` syntax, this will return an empty string.
   */
  public fun getFileScriptClassExtends(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_GET_FILE_SCRIPT_CLASS_EXTENDS,
        STRING.ordinal)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns `true` if the file at index `idx` imported properly.
   */
  public fun getFileImportIsValid(idx: Long): Boolean {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_GET_FILE_IMPORT_IS_VALID, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the name of this directory.
   */
  public fun getName(): String {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_GET_NAME,
        STRING.ordinal)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the path to this directory.
   */
  public fun getPath(): String {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_GET_PATH,
        STRING.ordinal)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the parent directory for this directory or `null` if called on a directory at `res://` or `user://`.
   */
  public fun getParent(): EditorFileSystemDirectory? {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_GET_PARENT,
        OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as EditorFileSystemDirectory?
  }

  /**
   * Returns the index of the file with name `name` or `-1` if not found.
   */
  public fun findFileIndex(name: String): Long {
    TransferContext.writeArguments(STRING to name)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_FIND_FILE_INDEX, LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the index of the directory with name `name` or `-1` if not found.
   */
  public fun findDirIndex(name: String): Long {
    TransferContext.writeArguments(STRING to name)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILESYSTEMDIRECTORY_FIND_DIR_INDEX,
        LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public companion object
}
