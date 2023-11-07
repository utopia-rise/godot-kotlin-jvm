// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * Imports Blender scenes in the `.blend` file format through the glTF 2.0 3D import pipeline. This
 * importer requires Blender to be installed by the user, so that it can be used to export the scene as
 * glTF 2.0.
 * The location of the Blender binary is set via the `filesystem/import/blender/blender3_path`
 * editor setting.
 * This importer is only used if [ProjectSettings.filesystem/import/blender/enabled] is enabled,
 * otherwise `.blend` files present in the project folder are not imported.
 * Blend import requires Blender 3.0.
 * Internally, the EditorSceneFormatImporterBlend uses the Blender glTF "Use Original" mode to
 * reference external textures.
 */
@GodotBaseType
public open class OggPacketSequencePlayback : RefCounted() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_OGGPACKETSEQUENCEPLAYBACK, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings
}
