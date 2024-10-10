// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedInt32Array
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_INT_32_ARRAY
import godot.core.VariantParser.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

/**
 * This is an audio stream that can playback music interactively, combining clips and a transition
 * table. Clips must be added first, and the transition rules via the [addTransition]. Additionally,
 * this stream export a property parameter to control the playback via [AudioStreamPlayer],
 * [AudioStreamPlayer2D], or [AudioStreamPlayer3D].
 * The way this is used is by filling a number of clips, then configuring the transition table. From
 * there, clips are selected for playback and the music will smoothly go from the current to the new
 * one while using the corresponding transition rule defined in the transition table.
 */
@GodotBaseType
public open class AudioStreamInteractive : AudioStream() {
  /**
   * Index of the initial clip, which will be played first when this stream is played.
   */
  public final inline var initialClip: Int
    @JvmName("initialClipProperty")
    get() = getInitialClip()
    @JvmName("initialClipProperty")
    set(`value`) {
      setInitialClip(value)
    }

  /**
   * Amount of clips contained in this interactive player.
   */
  public final inline var clipCount: Int
    @JvmName("clipCountProperty")
    get() = getClipCount()
    @JvmName("clipCountProperty")
    set(`value`) {
      setClipCount(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_AUDIOSTREAMINTERACTIVE, scriptIndex)
  }

  public final fun setClipCount(clipCount: Int): Unit {
    TransferContext.writeArguments(LONG to clipCount.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setClipCountPtr, NIL)
  }

  public final fun getClipCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getClipCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setInitialClip(clipIndex: Int): Unit {
    TransferContext.writeArguments(LONG to clipIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setInitialClipPtr, NIL)
  }

  public final fun getInitialClip(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getInitialClipPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Set the name of the current clip (for easier identification).
   */
  public final fun setClipName(clipIndex: Int, name: StringName): Unit {
    TransferContext.writeArguments(LONG to clipIndex.toLong(), STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.setClipNamePtr, NIL)
  }

  /**
   * Return the name of a clip.
   */
  public final fun getClipName(clipIndex: Int): StringName {
    TransferContext.writeArguments(LONG to clipIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getClipNamePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  /**
   * Set the [AudioStream] associated with the current clip.
   */
  public final fun setClipStream(clipIndex: Int, stream: AudioStream?): Unit {
    TransferContext.writeArguments(LONG to clipIndex.toLong(), OBJECT to stream)
    TransferContext.callMethod(rawPtr, MethodBindings.setClipStreamPtr, NIL)
  }

  /**
   * Return the [AudioStream] associated with a clip.
   */
  public final fun getClipStream(clipIndex: Int): AudioStream? {
    TransferContext.writeArguments(LONG to clipIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getClipStreamPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as AudioStream?)
  }

  /**
   * Set whether a clip will auto-advance by changing the auto-advance mode.
   */
  public final fun setClipAutoAdvance(clipIndex: Int, mode: AutoAdvanceMode): Unit {
    TransferContext.writeArguments(LONG to clipIndex.toLong(), LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setClipAutoAdvancePtr, NIL)
  }

  /**
   * Return whether a clip has auto-advance enabled. See [setClipAutoAdvance].
   */
  public final fun getClipAutoAdvance(clipIndex: Int): AutoAdvanceMode {
    TransferContext.writeArguments(LONG to clipIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getClipAutoAdvancePtr, LONG)
    return AudioStreamInteractive.AutoAdvanceMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Set the index of the next clip towards which this clip will auto advance to when finished. If
   * the clip being played loops, then auto-advance will be ignored.
   */
  public final fun setClipAutoAdvanceNextClip(clipIndex: Int, autoAdvanceNextClip: Int): Unit {
    TransferContext.writeArguments(LONG to clipIndex.toLong(), LONG to autoAdvanceNextClip.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setClipAutoAdvanceNextClipPtr, NIL)
  }

  /**
   * Return the clip towards which the clip referenced by [clipIndex] will auto-advance to.
   */
  public final fun getClipAutoAdvanceNextClip(clipIndex: Int): Int {
    TransferContext.writeArguments(LONG to clipIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getClipAutoAdvanceNextClipPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Add a transition between two clips. Provide the indices of the source and destination clips, or
   * use the [CLIP_ANY] constant to indicate that transition happens to/from any clip to this one.
   * * [fromTime] indicates the moment in the current clip the transition will begin after
   * triggered.
   * * [toTime] indicates the time in the next clip that the playback will start from.
   * * [fadeMode] indicates how the fade will happen between clips. If unsure, just use
   * [FADE_AUTOMATIC] which uses the most common type of fade for each situation.
   * * [fadeBeats] indicates how many beats the fade will take. Using decimals is allowed.
   * * [useFillerClip] indicates that there will be a filler clip used between the source and
   * destination clips.
   * * [fillerClip] the index of the filler clip.
   * * If [holdPrevious] is used, then this clip will be remembered. This can be used together with
   * [AUTO_ADVANCE_RETURN_TO_HOLD] to return to this clip after another is done playing.
   */
  @JvmOverloads
  public final fun addTransition(
    fromClip: Int,
    toClip: Int,
    fromTime: TransitionFromTime,
    toTime: TransitionToTime,
    fadeMode: FadeMode,
    fadeBeats: Float,
    useFillerClip: Boolean = false,
    fillerClip: Int = -1,
    holdPrevious: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(LONG to fromClip.toLong(), LONG to toClip.toLong(), LONG to fromTime.id, LONG to toTime.id, LONG to fadeMode.id, DOUBLE to fadeBeats.toDouble(), BOOL to useFillerClip, LONG to fillerClip.toLong(), BOOL to holdPrevious)
    TransferContext.callMethod(rawPtr, MethodBindings.addTransitionPtr, NIL)
  }

  /**
   * Return true if a given transition exists (was added via [addTransition]).
   */
  public final fun hasTransition(fromClip: Int, toClip: Int): Boolean {
    TransferContext.writeArguments(LONG to fromClip.toLong(), LONG to toClip.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.hasTransitionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Erase a transition by providing [fromClip] and [toClip] clip indices. [CLIP_ANY] can be used
   * for either argument or both.
   */
  public final fun eraseTransition(fromClip: Int, toClip: Int): Unit {
    TransferContext.writeArguments(LONG to fromClip.toLong(), LONG to toClip.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.eraseTransitionPtr, NIL)
  }

  /**
   * Return the list of transitions (from, to interleaved).
   */
  public final fun getTransitionList(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTransitionListPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  /**
   * Return the source time position for a transition (see [addTransition]).
   */
  public final fun getTransitionFromTime(fromClip: Int, toClip: Int): TransitionFromTime {
    TransferContext.writeArguments(LONG to fromClip.toLong(), LONG to toClip.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTransitionFromTimePtr, LONG)
    return AudioStreamInteractive.TransitionFromTime.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Return the destination time position for a transition (see [addTransition]).
   */
  public final fun getTransitionToTime(fromClip: Int, toClip: Int): TransitionToTime {
    TransferContext.writeArguments(LONG to fromClip.toLong(), LONG to toClip.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTransitionToTimePtr, LONG)
    return AudioStreamInteractive.TransitionToTime.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Return the mode for a transition (see [addTransition]).
   */
  public final fun getTransitionFadeMode(fromClip: Int, toClip: Int): FadeMode {
    TransferContext.writeArguments(LONG to fromClip.toLong(), LONG to toClip.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTransitionFadeModePtr, LONG)
    return AudioStreamInteractive.FadeMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Return the time (in beats) for a transition (see [addTransition]).
   */
  public final fun getTransitionFadeBeats(fromClip: Int, toClip: Int): Float {
    TransferContext.writeArguments(LONG to fromClip.toLong(), LONG to toClip.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTransitionFadeBeatsPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Return whether a transition uses the *filler clip* functionality (see [addTransition]).
   */
  public final fun isTransitionUsingFillerClip(fromClip: Int, toClip: Int): Boolean {
    TransferContext.writeArguments(LONG to fromClip.toLong(), LONG to toClip.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isTransitionUsingFillerClipPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Return the filler clip for a transition (see [addTransition]).
   */
  public final fun getTransitionFillerClip(fromClip: Int, toClip: Int): Int {
    TransferContext.writeArguments(LONG to fromClip.toLong(), LONG to toClip.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTransitionFillerClipPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Return whether a transition uses the *hold previous* functionality (see [addTransition]).
   */
  public final fun isTransitionHoldingPrevious(fromClip: Int, toClip: Int): Boolean {
    TransferContext.writeArguments(LONG to fromClip.toLong(), LONG to toClip.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isTransitionHoldingPreviousPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public enum class TransitionFromTime(
    id: Long,
  ) {
    /**
     * Start transition as soon as possible, don't wait for any specific time position.
     */
    TRANSITION_FROM_TIME_IMMEDIATE(0),
    /**
     * Transition when the clip playback position reaches the next beat.
     */
    TRANSITION_FROM_TIME_NEXT_BEAT(1),
    /**
     * Transition when the clip playback position reaches the next bar.
     */
    TRANSITION_FROM_TIME_NEXT_BAR(2),
    /**
     * Transition when the current clip finished playing.
     */
    TRANSITION_FROM_TIME_END(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TransitionFromTime = entries.single { it.id == `value` }
    }
  }

  public enum class TransitionToTime(
    id: Long,
  ) {
    /**
     * Transition to the same position in the destination clip. This is useful when both clips have
     * exactly the same length and the music should fade between them.
     */
    TRANSITION_TO_TIME_SAME_POSITION(0),
    /**
     * Transition to the start of the destination clip.
     */
    TRANSITION_TO_TIME_START(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TransitionToTime = entries.single { it.id == `value` }
    }
  }

  public enum class FadeMode(
    id: Long,
  ) {
    /**
     * Do not use fade for the transition. This is useful when transitioning from a clip-end to
     * clip-beginning, and each clip has their begin/end.
     */
    FADE_DISABLED(0),
    /**
     * Use a fade-in in the next clip, let the current clip finish.
     */
    FADE_IN(1),
    /**
     * Use a fade-out in the current clip, the next clip will start by itself.
     */
    FADE_OUT(2),
    /**
     * Use a cross-fade between clips.
     */
    FADE_CROSS(3),
    /**
     * Use automatic fade logic depending on the transition from/to. It is recommended to use this
     * by default.
     */
    FADE_AUTOMATIC(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): FadeMode = entries.single { it.id == `value` }
    }
  }

  public enum class AutoAdvanceMode(
    id: Long,
  ) {
    /**
     * Disable auto-advance (default).
     */
    AUTO_ADVANCE_DISABLED(0),
    /**
     * Enable auto-advance, a clip must be specified.
     */
    AUTO_ADVANCE_ENABLED(1),
    /**
     * Enable auto-advance, but instead of specifying a clip, the playback will return to hold (see
     * [addTransition]).
     */
    AUTO_ADVANCE_RETURN_TO_HOLD(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): AutoAdvanceMode = entries.single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * This constant describes that any clip is valid for a specific transition as either source or
     * destination.
     */
    public final const val CLIP_ANY: Long = -1
  }

  internal object MethodBindings {
    public val setClipCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamInteractive", "set_clip_count", 1286410249)

    public val getClipCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamInteractive", "get_clip_count", 3905245786)

    public val setInitialClipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamInteractive", "set_initial_clip", 1286410249)

    public val getInitialClipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamInteractive", "get_initial_clip", 3905245786)

    public val setClipNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamInteractive", "set_clip_name", 3780747571)

    public val getClipNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamInteractive", "get_clip_name", 659327637)

    public val setClipStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamInteractive", "set_clip_stream", 111075094)

    public val getClipStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamInteractive", "get_clip_stream", 2739380747)

    public val setClipAutoAdvancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamInteractive", "set_clip_auto_advance", 57217598)

    public val getClipAutoAdvancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamInteractive", "get_clip_auto_advance", 1778634807)

    public val setClipAutoAdvanceNextClipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamInteractive", "set_clip_auto_advance_next_clip", 3937882851)

    public val getClipAutoAdvanceNextClipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamInteractive", "get_clip_auto_advance_next_clip", 923996154)

    public val addTransitionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamInteractive", "add_transition", 1630280552)

    public val hasTransitionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamInteractive", "has_transition", 2522259332)

    public val eraseTransitionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamInteractive", "erase_transition", 3937882851)

    public val getTransitionListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamInteractive", "get_transition_list", 1930428628)

    public val getTransitionFromTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamInteractive", "get_transition_from_time", 3453338158)

    public val getTransitionToTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamInteractive", "get_transition_to_time", 1369651373)

    public val getTransitionFadeModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamInteractive", "get_transition_fade_mode", 4065396087)

    public val getTransitionFadeBeatsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamInteractive", "get_transition_fade_beats", 3085491603)

    public val isTransitionUsingFillerClipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamInteractive", "is_transition_using_filler_clip", 2522259332)

    public val getTransitionFillerClipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamInteractive", "get_transition_filler_clip", 3175239445)

    public val isTransitionHoldingPreviousPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamInteractive", "is_transition_holding_previous", 2522259332)
  }
}
