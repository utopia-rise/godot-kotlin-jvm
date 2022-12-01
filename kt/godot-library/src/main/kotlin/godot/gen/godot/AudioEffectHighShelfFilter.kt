// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * Adds a high-shelf filter to the audio bus.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/audio/audio_buses.html]($DOCS_URL/tutorials/audio/audio_buses.html)
 *
 * Reduces all frequencies above the [godot.AudioEffectFilter.cutoffHz].
 */
@GodotBaseType
public open class AudioEffectHighShelfFilter : AudioEffectFilter() {
  public override fun __new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_AUDIOEFFECTHIGHSHELFFILTER, scriptIndex)
  }

  public companion object
}
