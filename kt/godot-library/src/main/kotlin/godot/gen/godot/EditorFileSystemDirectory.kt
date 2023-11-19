// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * A directory for the resource filesystem.
 *
 * A more generalized, low-level variation of the directory concept.
 */
@GodotBaseType
public open class EditorFileSystemDirectory internal constructor() : Object() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORFILESYSTEMDIRECTORY, scriptIndex)
    return true
  }

  /**
   * Returns the number of subdirectories in this directory.
   */
  public fun getSubdirCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSubdirCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the subdirectory at index [idx].
   */
  public fun getSubdir(idx: Int): EditorFileSystemDirectory? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSubdirPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as EditorFileSystemDirectory?)
  }

  /**
   * Returns the number of files in this directory.
   */
  public fun getFileCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFileCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the name of the file at index [idx].
   */
  public fun getFile(idx: Int): String {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getFilePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the path to the file at index [idx].
   */
  public fun getFilePath(idx: Int): String {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getFilePathPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the resource type of the file at index [idx]. This returns a string such as `"Resource"` or `"GDScript"`, *not* a file extension such as `".gd"`.
   */
  public fun getFileType(idx: Int): StringName {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getFileTypePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  /**
   * Returns the name of the script class defined in the file at index [idx]. If the file doesn't define a script class using the `class_name` syntax, this will return an empty string.
   */
  public fun getFileScriptClassName(idx: Int): String {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getFileScriptClassNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the base class of the script class defined in the file at index [idx]. If the file doesn't define a script class using the `class_name` syntax, this will return an empty string.
   */
  public fun getFileScriptClassExtends(idx: Int): String {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getFileScriptClassExtendsPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns `true` if the file at index [idx] imported properly.
   */
  public fun getFileImportIsValid(idx: Int): Boolean {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getFileImportIsValidPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the name of this directory.
   */
  public fun getName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the path to this directory.
   */
  public fun getPath(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPathPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the parent directory for this directory or `null` if called on a directory at `res://` or `user://`.
   */
  public fun getParent(): EditorFileSystemDirectory? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getParentPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as EditorFileSystemDirectory?)
  }

  /**
   * Returns the index of the file with name [name] or `-1` if not found.
   */
  public fun findFileIndex(name: String): Int {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.findFileIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the index of the directory with name [name] or `-1` if not found.
   */
  public fun findDirIndex(name: String): Int {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.findDirIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public companion object

  internal object MethodBindings {
    public val getSubdirCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileSystemDirectory", "get_subdir_count")

    public val getSubdirPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileSystemDirectory", "get_subdir")

    public val getFileCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileSystemDirectory", "get_file_count")

    public val getFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileSystemDirectory", "get_file")

    public val getFilePathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileSystemDirectory", "get_file_path")

    public val getFileTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileSystemDirectory", "get_file_type")

    public val getFileScriptClassNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileSystemDirectory", "get_file_script_class_name")

    public val getFileScriptClassExtendsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileSystemDirectory", "get_file_script_class_extends")

    public val getFileImportIsValidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileSystemDirectory", "get_file_import_is_valid")

    public val getNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileSystemDirectory", "get_name")

    public val getPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileSystemDirectory", "get_path")

    public val getParentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileSystemDirectory", "get_parent")

    public val findFileIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileSystemDirectory", "find_file_index")

    public val findDirIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFileSystemDirectory", "find_dir_index")
  }
}
