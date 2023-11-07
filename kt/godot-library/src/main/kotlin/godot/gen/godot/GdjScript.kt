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
 * MP3 is a lossy audio format, with worse audio quality compared to [ResourceImporterOggVorbis] at
 * a given bitrate.
 * In most cases, it's recommended to use Ogg Vorbis over MP3. However, if you're using a MP3 sound
 * source with no higher quality source available, then it's recommended to use the MP3 file directly
 * to avoid double lossy compression.
 * MP3 requires more CPU to decode than [ResourceImporterWAV]. If you need to play a lot of
 * simultaneous sounds, it's recommended to use WAV for those sounds instead, especially if targeting
 * low-end devices.
 */
@GodotBaseType
public open class GdjScript : JvmScript() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GDJSCRIPT, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings
}
