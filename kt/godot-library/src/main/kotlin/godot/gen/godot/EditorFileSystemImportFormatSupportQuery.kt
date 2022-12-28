// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedStringArray
import kotlin.Boolean
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.Suppress

/**
 * Used to query and configure import format support.
 *
 * This class is used to query and configure a certain import format. It is used in conjunction with asset format import plugins.
 */
@GodotBaseType
public open class EditorFileSystemImportFormatSupportQuery internal constructor() : RefCounted() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORFILESYSTEMIMPORTFORMATSUPPORTQUERY, scriptIndex)
    return true
  }

  /**
   * Return whether this importer is active.
   */
  public open fun _isActive(): Boolean {
    throw NotImplementedError("_is_active is not implemented for EditorFileSystemImportFormatSupportQuery")
  }

  /**
   * Return the file extensions supported.
   */
  public open fun _getFileExtensions(): PackedStringArray {
    throw NotImplementedError("_get_file_extensions is not implemented for EditorFileSystemImportFormatSupportQuery")
  }

  /**
   * Query support. Return false if import must not continue.
   */
  public open fun _query(): Boolean {
    throw NotImplementedError("_query is not implemented for EditorFileSystemImportFormatSupportQuery")
  }

  public companion object
}
