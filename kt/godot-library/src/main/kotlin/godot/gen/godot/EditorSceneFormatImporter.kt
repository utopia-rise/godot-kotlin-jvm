// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.PackedStringArray
import godot.core.TypeManager
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Imports scenes from third-parties' 3D files.
 *
 * [godot.EditorSceneFormatImporter] allows to define an importer script for a third-party 3D format.
 *
 * To use [godot.EditorSceneFormatImporter], register it using the [godot.EditorPlugin.addSceneFormatImporterPlugin] method first.
 */
@GodotBaseType
public open class EditorSceneFormatImporter internal constructor() : RefCounted() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORSCENEFORMATIMPORTER, scriptIndex)
    return true
  }

  /**
   *
   */
  public open fun _getImportFlags(): Long {
    throw NotImplementedError("_get_import_flags is not implemented for EditorSceneFormatImporter")
  }

  /**
   *
   */
  public open fun _getExtensions(): PackedStringArray {
    throw NotImplementedError("_get_extensions is not implemented for EditorSceneFormatImporter")
  }

  /**
   *
   */
  public open fun _importScene(
    path: String,
    flags: Long,
    options: Dictionary<Any?, Any?>,
  ): Object? {
    throw NotImplementedError("_import_scene is not implemented for EditorSceneFormatImporter")
  }

  /**
   *
   */
  public open fun _getImportOptions(path: String): Unit {
  }

  /**
   *
   */
  public open fun _getOptionVisibility(
    path: String,
    forAnimation: Boolean,
    option: String,
  ): Any? {
    throw NotImplementedError("_get_option_visibility is not implemented for EditorSceneFormatImporter")
  }

  public companion object {
    /**
     *
     */
    public final const val IMPORT_SCENE: Long = 1

    /**
     *
     */
    public final const val IMPORT_ANIMATION: Long = 2

    /**
     *
     */
    public final const val IMPORT_FAIL_ON_MISSING_DEPENDENCIES: Long = 4

    /**
     *
     */
    public final const val IMPORT_GENERATE_TANGENT_ARRAYS: Long = 8

    /**
     *
     */
    public final const val IMPORT_USE_NAMED_SKIN_BINDS: Long = 16

    /**
     *
     */
    public final const val IMPORT_DISCARD_MESHES_AND_MATERIALS: Long = 32

    /**
     *
     */
    public final const val IMPORT_FORCE_DISABLE_MESH_COMPRESSION: Long = 64
  }

  internal object MethodBindings {
    public val _getImportFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSceneFormatImporter", "_get_import_flags")

    public val _getExtensionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSceneFormatImporter", "_get_extensions")

    public val _importScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSceneFormatImporter", "_import_scene")

    public val _getImportOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSceneFormatImporter", "_get_import_options")

    public val _getOptionVisibilityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorSceneFormatImporter", "_get_option_visibility")
  }
}
