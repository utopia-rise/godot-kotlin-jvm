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
 * Imports Autodesk FBX 3D scenes by way of converting them to glTF 2.0 using the FBX2glTF command
 * line tool.
 * The location of the FBX2glTF binary is set via the `filesystem/import/fbx/fbx2gltf_path` editor
 * setting.
 * This importer is only used if [ProjectSettings.filesystem/import/fbx/enabled] is enabled,
 * otherwise `.fbx` files present in the project folder are not imported.
 */
@GodotBaseType
public open class AudioStreamPlaybackOggVorbis : AudioStreamPlaybackResampled() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_AUDIOSTREAMPLAYBACKOGGVORBIS, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings
}
