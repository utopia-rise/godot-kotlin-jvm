// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

/**
 * Imports scenes from third-parties' 3D files.
 */
@GodotBaseType
open class EditorSceneImporter : Reference() {
  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_EDITORSCENEIMPORTER)

  /**
   *
   */
  open fun _getExtensions(): VariantArray<Any?> {
    throw NotImplementedError("_get_extensions is not implemented for EditorSceneImporter")
  }

  /**
   *
   */
  open fun _getImportFlags(): Long {
    throw NotImplementedError("_get_import_flags is not implemented for EditorSceneImporter")
  }

  /**
   *
   */
  open fun _importAnimation(
    path: String,
    flags: Long,
    bakeFps: Long
  ): Animation? {
    throw NotImplementedError("_import_animation is not implemented for EditorSceneImporter")
  }

  /**
   *
   */
  open fun _importScene(
    path: String,
    flags: Long,
    bakeFps: Long
  ): Node? {
    throw NotImplementedError("_import_scene is not implemented for EditorSceneImporter")
  }

  /**
   *
   */
  open fun importAnimationFromOtherImporter(
    path: String,
    flags: Long,
    bakeFps: Long
  ): Animation? {
    TransferContext.writeArguments(STRING to path, LONG to flags, LONG to bakeFps)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORSCENEIMPORTER_IMPORT_ANIMATION_FROM_OTHER_IMPORTER, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Animation?
  }

  /**
   *
   */
  open fun importSceneFromOtherImporter(
    path: String,
    flags: Long,
    bakeFps: Long
  ): Node? {
    TransferContext.writeArguments(STRING to path, LONG to flags, LONG to bakeFps)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORSCENEIMPORTER_IMPORT_SCENE_FROM_OTHER_IMPORTER, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Node?
  }

  companion object {
    /**
     *
     */
    final const val IMPORT_ANIMATION: Long = 2

    /**
     *
     */
    final const val IMPORT_ANIMATION_DETECT_LOOP: Long = 4

    /**
     *
     */
    final const val IMPORT_ANIMATION_FORCE_ALL_TRACKS_IN_ALL_CLIPS: Long = 16

    /**
     *
     */
    final const val IMPORT_ANIMATION_KEEP_VALUE_TRACKS: Long = 32

    /**
     *
     */
    final const val IMPORT_ANIMATION_OPTIMIZE: Long = 8

    /**
     *
     */
    final const val IMPORT_FAIL_ON_MISSING_DEPENDENCIES: Long = 512

    /**
     *
     */
    final const val IMPORT_GENERATE_TANGENT_ARRAYS: Long = 256

    /**
     *
     */
    final const val IMPORT_MATERIALS_IN_INSTANCES: Long = 1024

    /**
     *
     */
    final const val IMPORT_SCENE: Long = 1

    /**
     *
     */
    final const val IMPORT_USE_COMPRESSION: Long = 2048
  }
}
