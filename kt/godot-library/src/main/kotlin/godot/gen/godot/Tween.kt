// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.NodePath
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.signals.Signal0
import godot.signals.Signal2
import godot.signals.Signal4
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * Smoothly animates a node's properties over time.
 *
 * Tweens are useful for animations requiring a numerical property to be interpolated over a range of values. The name *tween* comes from *in-betweening*, an animation technique where you specify *keyframes* and the computer interpolates the frames that appear between them.
 *
 * [godot.Tween] is more suited than [godot.AnimationPlayer] for animations where you don't know the final values in advance. For example, interpolating a dynamically-chosen camera zoom value is best done with a [godot.Tween] node; it would be difficult to do the same thing with an [godot.AnimationPlayer] node.
 *
 * Here is a brief usage example that makes a 2D node move smoothly between two positions:
 *
 * ```
 * 		var tween = get_node("Tween")
 * 		tween.interpolate_property($Node2D, "position",
 * 		        Vector2(0, 0), Vector2(100, 100), 1,
 * 		        Tween.TRANS_LINEAR, Tween.EASE_IN_OUT)
 * 		tween.start()
 * 		```
 *
 * Many methods require a property name, such as `"position"` above. You can find the correct property name by hovering over the property in the Inspector. You can also provide the components of a property directly by using `"property:component"` (eg. `position:x`), where it would only apply to that particular component.
 *
 * Many of the methods accept `trans_type` and `ease_type`. The first accepts an [enum TransitionType] constant, and refers to the way the timing of the animation is handled (see [easings.net](https://easings.net/) for some examples). The second accepts an [enum EaseType] constant, and controls where the `trans_type` is applied to the interpolation (in the beginning, the end, or both). If you don't know which transition and easing to pick, you can try different [enum TransitionType] constants with [EASE_IN_OUT], and use the one that looks best.
 *
 * [godot.Tween easing and transition types cheatsheet](https://raw.githubusercontent.com/godotengine/godot-docs/master/img/tween_cheatsheet.png)
 */
@GodotBaseType
open class Tween : Node() {
  /**
   * Emitted when all processes in a tween end.
   */
  val tweenAllCompleted: Signal0 by signal()

  /**
   * Emitted when a tween ends.
   */
  val tweenCompleted: Signal2<Object, NodePath> by signal("object", "key")

  /**
   * Emitted when a tween starts.
   */
  val tweenStarted: Signal2<Object, NodePath> by signal("object", "key")

  /**
   * Emitted at each step of the animation.
   */
  val tweenStep: Signal4<Object, NodePath, Double, Object> by signal("object", "key", "elapsed",
      "value")

  /**
   * The tween's animation process thread. See [enum TweenProcessMode].
   */
  open var playbackProcessMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_GET_PLAYBACK_PROCESS_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_SET_PLAYBACK_PROCESS_MODE,
          NIL)
    }

  /**
   * The tween's speed multiplier. For example, set it to `1.0` for normal speed, `2.0` for two times normal speed, or `0.5` for half of the normal speed. A value of `0` pauses the animation, but see also [setActive] or [stopAll] for this.
   */
  open var playbackSpeed: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_GET_PLAYBACK_SPEED, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_SET_PLAYBACK_SPEED, NIL)
    }

  /**
   * If `true`, the tween loops.
   */
  open var repeat: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_GET_REPEAT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_SET_REPEAT, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_TWEEN, ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun _removeByUid(uid: Long) {
  }

  /**
   * Follows `method` of `object` and applies the returned value on `target_method` of `target`, beginning from `initial_val` for `duration` seconds, `delay` later. Methods are called with consecutive values.
   *
   * Use [enum TransitionType] for `trans_type` and [enum EaseType] for `ease_type` parameters. These values control the timing and direction of the interpolation. See the class description for more information.
   */
  open fun followMethod(
    _object: Object,
    method: String,
    initialVal: Any?,
    target: Object,
    targetMethod: String,
    duration: Double,
    transType: Long = 0,
    easeType: Long = 2,
    delay: Double = 0.0
  ): Boolean {
    TransferContext.writeArguments(OBJECT to _object, STRING to method, ANY to initialVal, OBJECT to
        target, STRING to targetMethod, DOUBLE to duration, LONG to transType, LONG to easeType,
        DOUBLE to delay)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_FOLLOW_METHOD, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Follows `property` of `object` and applies it on `target_property` of `target`, beginning from `initial_val` for `duration` seconds, `delay` seconds later.
   *
   * Use [enum TransitionType] for `trans_type` and [enum EaseType] for `ease_type` parameters. These values control the timing and direction of the interpolation. See the class description for more information.
   */
  open fun followProperty(
    _object: Object,
    property: NodePath,
    initialVal: Any?,
    target: Object,
    targetProperty: NodePath,
    duration: Double,
    transType: Long = 0,
    easeType: Long = 2,
    delay: Double = 0.0
  ): Boolean {
    TransferContext.writeArguments(OBJECT to _object, NODE_PATH to property, ANY to initialVal,
        OBJECT to target, NODE_PATH to targetProperty, DOUBLE to duration, LONG to transType, LONG
        to easeType, DOUBLE to delay)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_FOLLOW_PROPERTY, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the total time needed for all tweens to end. If you have two tweens, one lasting 10 seconds and the other 20 seconds, it would return 20 seconds, as by that time all tweens would have finished.
   */
  open fun getRuntime(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_GET_RUNTIME, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Calls `callback` of `object` after `duration`. `arg1`-`arg5` are arguments to be passed to the callback.
   */
  open fun interpolateCallback(
    _object: Object,
    duration: Double,
    callback: String,
    arg1: Any? = null,
    arg2: Any? = null,
    arg3: Any? = null,
    arg4: Any? = null,
    arg5: Any? = null
  ): Boolean {
    TransferContext.writeArguments(OBJECT to _object, DOUBLE to duration, STRING to callback, ANY to
        arg1, ANY to arg2, ANY to arg3, ANY to arg4, ANY to arg5)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_INTERPOLATE_CALLBACK, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Calls `callback` of `object` after `duration` on the main thread (similar to [godot.Object.callDeferred]). `arg1`-`arg5` are arguments to be passed to the callback.
   */
  open fun interpolateDeferredCallback(
    _object: Object,
    duration: Double,
    callback: String,
    arg1: Any? = null,
    arg2: Any? = null,
    arg3: Any? = null,
    arg4: Any? = null,
    arg5: Any? = null
  ): Boolean {
    TransferContext.writeArguments(OBJECT to _object, DOUBLE to duration, STRING to callback, ANY to
        arg1, ANY to arg2, ANY to arg3, ANY to arg4, ANY to arg5)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_INTERPOLATE_DEFERRED_CALLBACK,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Animates `method` of `object` from `initial_val` to `final_val` for `duration` seconds, `delay` seconds later. Methods are called with consecutive values.
   *
   * Use [enum TransitionType] for `trans_type` and [enum EaseType] for `ease_type` parameters. These values control the timing and direction of the interpolation. See the class description for more information.
   */
  open fun interpolateMethod(
    _object: Object,
    method: String,
    initialVal: Any?,
    finalVal: Any?,
    duration: Double,
    transType: Long = 0,
    easeType: Long = 2,
    delay: Double = 0.0
  ): Boolean {
    TransferContext.writeArguments(OBJECT to _object, STRING to method, ANY to initialVal, ANY to
        finalVal, DOUBLE to duration, LONG to transType, LONG to easeType, DOUBLE to delay)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_INTERPOLATE_METHOD, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Animates `property` of `object` from `initial_val` to `final_val` for `duration` seconds, `delay` seconds later. Setting the initial value to `null` uses the current value of the property.
   *
   * Use [enum TransitionType] for `trans_type` and [enum EaseType] for `ease_type` parameters. These values control the timing and direction of the interpolation. See the class description for more information.
   */
  open fun interpolateProperty(
    _object: Object,
    property: NodePath,
    initialVal: Any?,
    finalVal: Any?,
    duration: Double,
    transType: Long = 0,
    easeType: Long = 2,
    delay: Double = 0.0
  ): Boolean {
    TransferContext.writeArguments(OBJECT to _object, NODE_PATH to property, ANY to initialVal, ANY
        to finalVal, DOUBLE to duration, LONG to transType, LONG to easeType, DOUBLE to delay)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_INTERPOLATE_PROPERTY, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if any tweens are currently running.
   *
   * **Note:** This method doesn't consider tweens that have ended.
   */
  open fun isActive(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_IS_ACTIVE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Stops animation and removes a tween, given its object and property/method pair. By default, all tweens are removed, unless `key` is specified.
   */
  open fun remove(_object: Object, key: String = ""): Boolean {
    TransferContext.writeArguments(OBJECT to _object, STRING to key)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_REMOVE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Stops animation and removes all tweens.
   */
  open fun removeAll(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_REMOVE_ALL, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Resets a tween to its initial value (the one given, not the one before the tween), given its object and property/method pair. By default, all tweens are removed, unless `key` is specified.
   */
  open fun reset(_object: Object, key: String = ""): Boolean {
    TransferContext.writeArguments(OBJECT to _object, STRING to key)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_RESET, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Resets all tweens to their initial values (the ones given, not those before the tween).
   */
  open fun resetAll(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_RESET_ALL, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Continues animating a stopped tween, given its object and property/method pair. By default, all tweens are resumed, unless `key` is specified.
   */
  open fun resume(_object: Object, key: String = ""): Boolean {
    TransferContext.writeArguments(OBJECT to _object, STRING to key)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_RESUME, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Continues animating all stopped tweens.
   */
  open fun resumeAll(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_RESUME_ALL, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the interpolation to the given `time` in seconds.
   */
  open fun seek(time: Double): Boolean {
    TransferContext.writeArguments(DOUBLE to time)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_SEEK, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Activates/deactivates the tween. See also [stopAll] and [resumeAll].
   */
  open fun setActive(active: Boolean) {
    TransferContext.writeArguments(BOOL to active)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_SET_ACTIVE, NIL)
  }

  /**
   * Starts the tween. You can define animations both before and after this.
   */
  open fun start(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_START, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Stops a tween, given its object and property/method pair. By default, all tweens are stopped, unless `key` is specified.
   */
  open fun stop(_object: Object, key: String = ""): Boolean {
    TransferContext.writeArguments(OBJECT to _object, STRING to key)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_STOP, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Stops animating all tweens.
   */
  open fun stopAll(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_STOP_ALL, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Animates `method` of `object` from the value returned by `initial_method` to `final_val` for `duration` seconds, `delay` seconds later. Methods are animated by calling them with consecutive values.
   *
   * Use [enum TransitionType] for `trans_type` and [enum EaseType] for `ease_type` parameters. These values control the timing and direction of the interpolation. See the class description for more information.
   */
  open fun targetingMethod(
    _object: Object,
    method: String,
    initial: Object,
    initialMethod: String,
    finalVal: Any?,
    duration: Double,
    transType: Long = 0,
    easeType: Long = 2,
    delay: Double = 0.0
  ): Boolean {
    TransferContext.writeArguments(OBJECT to _object, STRING to method, OBJECT to initial, STRING to
        initialMethod, ANY to finalVal, DOUBLE to duration, LONG to transType, LONG to easeType,
        DOUBLE to delay)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_TARGETING_METHOD, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Animates `property` of `object` from the current value of the `initial_val` property of `initial` to `final_val` for `duration` seconds, `delay` seconds later.
   *
   * Use [enum TransitionType] for `trans_type` and [enum EaseType] for `ease_type` parameters. These values control the timing and direction of the interpolation. See the class description for more information.
   */
  open fun targetingProperty(
    _object: Object,
    property: NodePath,
    initial: Object,
    initialVal: NodePath,
    finalVal: Any?,
    duration: Double,
    transType: Long = 0,
    easeType: Long = 2,
    delay: Double = 0.0
  ): Boolean {
    TransferContext.writeArguments(OBJECT to _object, NODE_PATH to property, OBJECT to initial,
        NODE_PATH to initialVal, ANY to finalVal, DOUBLE to duration, LONG to transType, LONG to
        easeType, DOUBLE to delay)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_TARGETING_PROPERTY, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the current time of the tween.
   */
  open fun tell(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_TELL, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  enum class TransitionType(
    id: Long
  ) {
    /**
     * The animation is interpolated linearly.
     */
    TRANS_LINEAR(0),

    /**
     * The animation is interpolated using a sine function.
     */
    TRANS_SINE(1),

    /**
     * The animation is interpolated with a quintic (to the power of 5) function.
     */
    TRANS_QUINT(2),

    /**
     * The animation is interpolated with a quartic (to the power of 4) function.
     */
    TRANS_QUART(3),

    /**
     * The animation is interpolated with a quadratic (to the power of 2) function.
     */
    TRANS_QUAD(4),

    /**
     * The animation is interpolated with an exponential (to the power of x) function.
     */
    TRANS_EXPO(5),

    /**
     * The animation is interpolated with elasticity, wiggling around the edges.
     */
    TRANS_ELASTIC(6),

    /**
     * The animation is interpolated with a cubic (to the power of 3) function.
     */
    TRANS_CUBIC(7),

    /**
     * The animation is interpolated with a function using square roots.
     */
    TRANS_CIRC(8),

    /**
     * The animation is interpolated by bouncing at the end.
     */
    TRANS_BOUNCE(9),

    /**
     * The animation is interpolated backing out at ends.
     */
    TRANS_BACK(10);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class TweenProcessMode(
    id: Long
  ) {
    /**
     * The tween updates with the `_physics_process` callback.
     */
    TWEEN_PROCESS_PHYSICS(0),

    /**
     * The tween updates with the `_process` callback.
     */
    TWEEN_PROCESS_IDLE(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class EaseType(
    id: Long
  ) {
    /**
     * The interpolation starts slowly and speeds up towards the end.
     */
    EASE_IN(0),

    /**
     * The interpolation starts quickly and slows down towards the end.
     */
    EASE_OUT(1),

    /**
     * A combination of [EASE_IN] and [EASE_OUT]. The interpolation is slowest at both ends.
     */
    EASE_IN_OUT(2),

    /**
     * A combination of [EASE_IN] and [EASE_OUT]. The interpolation is fastest at both ends.
     */
    EASE_OUT_IN(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     * The interpolation starts slowly and speeds up towards the end.
     */
    final const val EASE_IN: Long = 0

    /**
     * A combination of [EASE_IN] and [EASE_OUT]. The interpolation is slowest at both ends.
     */
    final const val EASE_IN_OUT: Long = 2

    /**
     * The interpolation starts quickly and slows down towards the end.
     */
    final const val EASE_OUT: Long = 1

    /**
     * A combination of [EASE_IN] and [EASE_OUT]. The interpolation is fastest at both ends.
     */
    final const val EASE_OUT_IN: Long = 3

    /**
     * The animation is interpolated backing out at ends.
     */
    final const val TRANS_BACK: Long = 10

    /**
     * The animation is interpolated by bouncing at the end.
     */
    final const val TRANS_BOUNCE: Long = 9

    /**
     * The animation is interpolated with a function using square roots.
     */
    final const val TRANS_CIRC: Long = 8

    /**
     * The animation is interpolated with a cubic (to the power of 3) function.
     */
    final const val TRANS_CUBIC: Long = 7

    /**
     * The animation is interpolated with elasticity, wiggling around the edges.
     */
    final const val TRANS_ELASTIC: Long = 6

    /**
     * The animation is interpolated with an exponential (to the power of x) function.
     */
    final const val TRANS_EXPO: Long = 5

    /**
     * The animation is interpolated linearly.
     */
    final const val TRANS_LINEAR: Long = 0

    /**
     * The animation is interpolated with a quadratic (to the power of 2) function.
     */
    final const val TRANS_QUAD: Long = 4

    /**
     * The animation is interpolated with a quartic (to the power of 4) function.
     */
    final const val TRANS_QUART: Long = 3

    /**
     * The animation is interpolated with a quintic (to the power of 5) function.
     */
    final const val TRANS_QUINT: Long = 2

    /**
     * The animation is interpolated using a sine function.
     */
    final const val TRANS_SINE: Long = 1

    /**
     * The tween updates with the `_process` callback.
     */
    final const val TWEEN_PROCESS_IDLE: Long = 1

    /**
     * The tween updates with the `_physics_process` callback.
     */
    final const val TWEEN_PROCESS_PHYSICS: Long = 0
  }
}
