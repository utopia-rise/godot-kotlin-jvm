// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import kotlin.Any
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Imports scenes from third-parties' 3D files.
 *
 * [godot.EditorSceneImporter] allows to define an importer script for a third-party 3D format.
 *
 * To use [godot.EditorSceneImporter], register it using the [godot.EditorPlugin.addSceneImportPlugin] method first.
 */
@GodotBaseType
public open class EditorSceneImporter : Reference() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_EDITORSCENEIMPORTER)
  }

  /**
   *
   */
  public open fun _getExtensions(): VariantArray<Any?> {
    throw NotImplementedError("_get_extensions is not implemented for EditorSceneImporter")
  }

  /**
   *
   */
  public open fun _getImportFlags(): Long {
    throw NotImplementedError("_get_import_flags is not implemented for EditorSceneImporter")
  }

  /**
   *
   */
  public open fun _importAnimation(
    path: String,
    flags: Long,
    bakeFps: Long
  ): Animation? {
    throw NotImplementedError("_import_animation is not implemented for EditorSceneImporter")
  }

  /**
   *
   */
  public open fun _importScene(
    path: String,
    flags: Long,
    bakeFps: Long
  ): Node? {
    throw NotImplementedError("_import_scene is not implemented for EditorSceneImporter")
  }

  /**
   *
   */
  public open fun importAnimationFromOtherImporter(
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
  public open fun importSceneFromOtherImporter(
    path: String,
    flags: Long,
    bakeFps: Long,
    compressFlags: Long
  ): Node? {
    TransferContext.writeArguments(STRING to path, LONG to flags, LONG to bakeFps, LONG to
        compressFlags)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORSCENEIMPORTER_IMPORT_SCENE_FROM_OTHER_IMPORTER, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Node?
  }

  public companion object {
    /**
     *
     */
    public final const val IMPORT_ANIMATION: Long = 2

    /**
     *
     */
    public final const val IMPORT_ANIMATION_DETECT_LOOP: Long = 4

    /**
     *
     */
    public final const val IMPORT_ANIMATION_FORCE_ALL_TRACKS_IN_ALL_CLIPS: Long = 16

    /**
     *
     */
    public final const val IMPORT_ANIMATION_KEEP_VALUE_TRACKS: Long = 32

    /**
     *
     */
    public final const val IMPORT_ANIMATION_OPTIMIZE: Long = 8

    /**
     *
     */
    public final const val IMPORT_FAIL_ON_MISSING_DEPENDENCIES: Long = 512

    /**
     *
     */
    public final const val IMPORT_GENERATE_TANGENT_ARRAYS: Long = 256

    /**
     *
     */
    public final const val IMPORT_MATERIALS_IN_INSTANCES: Long = 1024

    /**
     *
     */
    public final const val IMPORT_SCENE: Long = 1
  }
}
