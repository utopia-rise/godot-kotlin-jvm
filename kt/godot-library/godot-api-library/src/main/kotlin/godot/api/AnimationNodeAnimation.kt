// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.StringName
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING_NAME
import godot.core.asCachedStringName
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A resource to add to an [AnimationNodeBlendTree]. Only has one output port using the [animation]
 * property. Used as an input for [AnimationNode]s that blend animations together.
 */
@GodotBaseType
public open class AnimationNodeAnimation : AnimationRootNode() {
  /**
   * Animation to use as an output. It is one of the animations provided by
   * [AnimationTree.animPlayer].
   */
  public final inline var animation: StringName
    @JvmName("animationProperty")
    get() = getAnimation()
    @JvmName("animationProperty")
    set(`value`) {
      setAnimation(value)
    }

  /**
   * Determines the playback direction of the animation.
   */
  public final inline var playMode: PlayMode
    @JvmName("playModeProperty")
    get() = getPlayMode()
    @JvmName("playModeProperty")
    set(`value`) {
      setPlayMode(value)
    }

  /**
   * If `true`, on receiving a request to play an animation from the start, the first frame is not
   * drawn, but only processed, and playback starts from the next frame.
   *
   * See also the notes of [AnimationPlayer.play].
   */
  public final inline var advanceOnStart: Boolean
    @JvmName("advanceOnStartProperty")
    get() = isAdvanceOnStart()
    @JvmName("advanceOnStartProperty")
    set(`value`) {
      setAdvanceOnStart(value)
    }

  /**
   * If `true`, [AnimationNode] provides an animation based on the [Animation] resource with some
   * parameters adjusted.
   */
  public final inline var useCustomTimeline: Boolean
    @JvmName("useCustomTimelineProperty")
    get() = isUsingCustomTimeline()
    @JvmName("useCustomTimelineProperty")
    set(`value`) {
      setUseCustomTimeline(value)
    }

  /**
   * If [useCustomTimeline] is `true`, offset the start position of the animation.
   */
  public final inline var timelineLength: Double
    @JvmName("timelineLengthProperty")
    get() = getTimelineLength()
    @JvmName("timelineLengthProperty")
    set(`value`) {
      setTimelineLength(value)
    }

  /**
   * If `true`, scales the time so that the length specified in [timelineLength] is one cycle.
   *
   * This is useful for matching the periods of walking and running animations.
   *
   * If `false`, the original animation length is respected. If you set the loop to [loopMode], the
   * animation will loop in [timelineLength].
   */
  public final inline var stretchTimeScale: Boolean
    @JvmName("stretchTimeScaleProperty")
    get() = isStretchingTimeScale()
    @JvmName("stretchTimeScaleProperty")
    set(`value`) {
      setStretchTimeScale(value)
    }

  /**
   * If [useCustomTimeline] is `true`, offset the start position of the animation.
   *
   * This is useful for adjusting which foot steps first in 3D walking animations.
   */
  public final inline var startOffset: Double
    @JvmName("startOffsetProperty")
    get() = getStartOffset()
    @JvmName("startOffsetProperty")
    set(`value`) {
      setStartOffset(value)
    }

  /**
   * If [useCustomTimeline] is `true`, override the loop settings of the original [Animation]
   * resource with the value.
   *
   * **Note:** If the [Animation.loopMode] isn't set to looping, the
   * [Animation.trackSetInterpolationLoopWrap] option will not be respected. If you cannot get the
   * expected behavior, consider duplicating the [Animation] resource and changing the loop settings.
   */
  public final inline var loopMode: Animation.LoopMode
    @JvmName("loopModeProperty")
    get() = getLoopMode()
    @JvmName("loopModeProperty")
    set(`value`) {
      setLoopMode(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(18, scriptIndex)
  }

  public final fun setAnimation(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(ptr, MethodBindings.setAnimationPtr, NIL)
  }

  public final fun getAnimation(): StringName {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAnimationPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  public final fun setPlayMode(mode: PlayMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setPlayModePtr, NIL)
  }

  public final fun getPlayMode(): PlayMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPlayModePtr, LONG)
    return PlayMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setAdvanceOnStart(advanceOnStart: Boolean): Unit {
    TransferContext.writeArguments(BOOL to advanceOnStart)
    TransferContext.callMethod(ptr, MethodBindings.setAdvanceOnStartPtr, NIL)
  }

  public final fun isAdvanceOnStart(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isAdvanceOnStartPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setUseCustomTimeline(useCustomTimeline: Boolean): Unit {
    TransferContext.writeArguments(BOOL to useCustomTimeline)
    TransferContext.callMethod(ptr, MethodBindings.setUseCustomTimelinePtr, NIL)
  }

  public final fun isUsingCustomTimeline(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isUsingCustomTimelinePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setTimelineLength(timelineLength: Double): Unit {
    TransferContext.writeArguments(DOUBLE to timelineLength)
    TransferContext.callMethod(ptr, MethodBindings.setTimelineLengthPtr, NIL)
  }

  public final fun getTimelineLength(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTimelineLengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun setStretchTimeScale(stretchTimeScale: Boolean): Unit {
    TransferContext.writeArguments(BOOL to stretchTimeScale)
    TransferContext.callMethod(ptr, MethodBindings.setStretchTimeScalePtr, NIL)
  }

  public final fun isStretchingTimeScale(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isStretchingTimeScalePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setStartOffset(startOffset: Double): Unit {
    TransferContext.writeArguments(DOUBLE to startOffset)
    TransferContext.callMethod(ptr, MethodBindings.setStartOffsetPtr, NIL)
  }

  public final fun getStartOffset(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getStartOffsetPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun setLoopMode(loopMode: Animation.LoopMode): Unit {
    TransferContext.writeArguments(LONG to loopMode.id)
    TransferContext.callMethod(ptr, MethodBindings.setLoopModePtr, NIL)
  }

  public final fun getLoopMode(): Animation.LoopMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLoopModePtr, LONG)
    return Animation.LoopMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setAnimation(name: String) = setAnimation(name.asCachedStringName())

  public enum class PlayMode(
    id: Long,
  ) {
    /**
     * Plays animation in forward direction.
     */
    FORWARD(0),
    /**
     * Plays animation in backward direction.
     */
    BACKWARD(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): PlayMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val setAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeAnimation", "set_animation", 3304788590)

    internal val getAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeAnimation", "get_animation", 2002593661)

    internal val setPlayModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeAnimation", "set_play_mode", 3347718873)

    internal val getPlayModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeAnimation", "get_play_mode", 2061244637)

    internal val setAdvanceOnStartPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeAnimation", "set_advance_on_start", 2586408642)

    internal val isAdvanceOnStartPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeAnimation", "is_advance_on_start", 36873697)

    internal val setUseCustomTimelinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeAnimation", "set_use_custom_timeline", 2586408642)

    internal val isUsingCustomTimelinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeAnimation", "is_using_custom_timeline", 36873697)

    internal val setTimelineLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeAnimation", "set_timeline_length", 373806689)

    internal val getTimelineLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeAnimation", "get_timeline_length", 1740695150)

    internal val setStretchTimeScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeAnimation", "set_stretch_time_scale", 2586408642)

    internal val isStretchingTimeScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeAnimation", "is_stretching_time_scale", 36873697)

    internal val setStartOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeAnimation", "set_start_offset", 373806689)

    internal val getStartOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeAnimation", "get_start_offset", 1740695150)

    internal val setLoopModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeAnimation", "set_loop_mode", 3155355575)

    internal val getLoopModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeAnimation", "get_loop_mode", 1988889481)
  }
}
