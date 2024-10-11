// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING_NAME
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_AUDIOSTREAMPLAYBACKINTERACTIVE_INDEX: Int = 122

/**
 * Playback component of [AudioStreamInteractive]. Contains functions to change the currently played
 * clip.
 */
@GodotBaseType
public open class AudioStreamPlaybackInteractive internal constructor() : AudioStreamPlayback() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_AUDIOSTREAMPLAYBACKINTERACTIVE_INDEX, scriptIndex)
  }

  /**
   * Switch to a clip (by name).
   */
  public final fun switchToClipByName(clipName: StringName): Unit {
    Internals.writeArguments(STRING_NAME to clipName)
    Internals.callMethod(rawPtr, MethodBindings.switchToClipByNamePtr, NIL)
  }

  /**
   * Switch to a clip (by index).
   */
  public final fun switchToClip(clipIndex: Int): Unit {
    Internals.writeArguments(LONG to clipIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.switchToClipPtr, NIL)
  }

  public companion object

  public object MethodBindings {
    internal val switchToClipByNamePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlaybackInteractive", "switch_to_clip_by_name", 3304788590)

    internal val switchToClipPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamPlaybackInteractive", "switch_to_clip", 1286410249)
  }
}
