// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 * Meta class for playing back audio.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/526](https://godotengine.org/asset-library/asset/526)
 *
 * Can play, loop, pause a scroll through audio. See [godot.AudioStream] and [godot.AudioStreamOggVorbis] for usage.
 */
@GodotBaseType
public open class AudioStreamPlayback : RefCounted() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_AUDIOSTREAMPLAYBACK, scriptIndex)
    return true
  }

  /**
   * Override this method to customize what happens when the playback starts at the given position, such as by calling [godot.AudioStreamPlayer.play].
   */
  public open fun _start(fromPos: Double): Unit {
  }

  /**
   * Override this method to customize what happens when the playback is stopped, such as by calling [godot.AudioStreamPlayer.stop].
   */
  public open fun _stop(): Unit {
  }

  /**
   * Overridable method. Should return `true` if this playback is active and playing its audio stream.
   */
  public open fun _isPlaying(): Boolean {
    throw NotImplementedError("_is_playing is not implemented for AudioStreamPlayback")
  }

  /**
   * Overridable method. Should return how many times this audio stream has looped. Most built-in playbacks always return `0`.
   */
  public open fun _getLoopCount(): Int {
    throw NotImplementedError("_get_loop_count is not implemented for AudioStreamPlayback")
  }

  /**
   * Overridable method. Should return the current progress along the audio stream, in seconds.
   */
  public open fun _getPlaybackPosition(): Double {
    throw NotImplementedError("_get_playback_position is not implemented for AudioStreamPlayback")
  }

  /**
   * Override this method to customize what happens when seeking this audio stream at the given [position], such as by calling [godot.AudioStreamPlayer.seek].
   */
  public open fun _seek(position: Double): Unit {
  }

  /**
   * Overridable method. Called whenever the audio stream is mixed if the playback is active and [godot.AudioServer.setEnableTaggingUsedAudioStreams] has been set to `true`. Editor plugins may use this method to "tag" the current position along the audio stream and display it in a preview.
   */
  public open fun _tagUsedStreams(): Unit {
  }

  public companion object

  internal object MethodBindings {
    public val _startPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioStreamPlayback", "_start")

    public val _stopPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioStreamPlayback", "_stop")

    public val _isPlayingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayback", "_is_playing")

    public val _getLoopCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayback", "_get_loop_count")

    public val _getPlaybackPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayback", "_get_playback_position")

    public val _seekPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioStreamPlayback", "_seek")

    public val _mixPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioStreamPlayback", "_mix")

    public val _tagUsedStreamsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayback", "_tag_used_streams")
  }
}
