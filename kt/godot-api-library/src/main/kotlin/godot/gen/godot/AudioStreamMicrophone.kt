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

private const val ENGINE_CLASS_AUDIOSTREAMMICROPHONE_INDEX: Int = 116

/**
 * When used directly in an [AudioStreamPlayer] node, [AudioStreamMicrophone] plays back microphone
 * input in real-time. This can be used in conjunction with [AudioEffectCapture] to process the data or
 * save it.
 * **Note:** [ProjectSettings.audio/driver/enableInput] must be `true` for audio input to work. See
 * also that setting's description for caveats related to permissions and operating system privacy
 * settings.
 */
@GodotBaseType
public open class AudioStreamMicrophone : AudioStream() {
  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINE_CLASS_AUDIOSTREAMMICROPHONE_INDEX, scriptIndex)
  }

  public companion object

  internal object MethodBindings
}
