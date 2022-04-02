// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.NodePath
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Lightweight object used for general-purpose animation via script, using [godot.Tweener]s.
 *
 * Tweens are mostly useful for animations requiring a numerical property to be interpolated over a range of values. The name *tween* comes from *in-betweening*, an animation technique where you specify *keyframes* and the computer interpolates the frames that appear between them.
 *
 * [godot.Tween] is more suited than [godot.AnimationPlayer] for animations where you don't know the final values in advance. For example, interpolating a dynamically-chosen camera zoom value is best done with a [godot.Tween]; it would be difficult to do the same thing with an [godot.AnimationPlayer] node. Tweens are also more light-weight than [godot.AnimationPlayer], so they are very much suited for simple animations or general tasks that don't require visual tweaking provided by the editor. They can be used in a fire-and-forget manner for some logic that normally would be done by code. You can e.g. make something shoot periodically by using a looped [godot.CallbackTweener] with a delay.
 *
 * A [godot.Tween] can be created by using either [godot.SceneTree.createTween] or [godot.Node.createTween]. [godot.Tween]s created manually (i.e. by using `Tween.new()`) are invalid. They can't be used for tweening values, but you can do manual interpolation with [interpolateValue].
 *
 * A [godot.Tween] animation is composed of a sequence of [godot.Tweener]s, which by default are executed one after another. You can create a sequence by appending [godot.Tweener]s to the [godot.Tween]. Animating something with a [godot.Tweener] is called tweening. Example tweening sequence looks like this:
 *
 * ```
 * 		var tween = get_tree().create_tween()
 * 		tween.tween_property($Sprite, "modulate", Color.red, 1)
 * 		tween.tween_property($Sprite, "scale", Vector2(), 1)
 * 		tween.tween_callback($Sprite.queue_free)
 * 		```
 *
 * This sequence will make the `$Sprite` node turn red, then shrink and finally the [godot.Node.queueFree] is called to remove the sprite. See methods [tweenProperty], [tweenInterval], [tweenCallback] and [tweenMethod] for more usage information.
 *
 * When a [godot.Tweener] is created with one of the `tween_*` methods, a chained method call can be used to tweak the properties of this [godot.Tweener]. For example, if you want to set different transition type in the above example, you can do:
 *
 * ```
 * 		var tween = get_tree().create_tween()
 * 		tween.tween_property($Sprite, "modulate", Color.red, 1).set_trans(Tween.TRANS_SINE)
 * 		tween.tween_property($Sprite, "scale", Vector2(), 1).set_trans(Tween.TRANS_BOUNCE)
 * 		tween.tween_callback($Sprite.queue_free)
 * 		```
 *
 * Most of the [godot.Tween] methods can be chained this way too. In this example the [godot.Tween] is bound and have set a default transition:
 *
 * ```
 * 		var tween = get_tree().create_tween().bind_node(self).set_trans(Tween.TRANS_ELASTIC)
 * 		tween.tween_property($Sprite, "modulate", Color.red, 1)
 * 		tween.tween_property($Sprite, "scale", Vector2(), 1)
 * 		tween.tween_callback($Sprite.queue_free)
 * 		```
 *
 * Another interesting use for [godot.Tween]s is animating arbitrary set of objects:
 *
 * ```
 * 		var tween = create_tween()
 * 		for sprite in get_children():
 * 		    tween.tween_property(sprite, "position", Vector2(), 1)
 * 		```
 *
 * In the example above, all children of a node are moved one after another to position (0, 0).
 *
 * Some [godot.Tweener]s use transitions and eases. The first accepts an [enum TransitionType] constant, and refers to the way the timing of the animation is handled (see [easings.net](https://easings.net/) for some examples). The second accepts an [enum EaseType] constant, and controls where the `trans_type` is applied to the interpolation (in the beginning, the end, or both). If you don't know which transition and easing to pick, you can try different [enum TransitionType] constants with [EASE_IN_OUT], and use the one that looks best.
 *
 * [godot.Tween easing and transition types cheatsheet](https://raw.githubusercontent.com/godotengine/godot-docs/master/img/tween_cheatsheet.png)
 *
 * **Note:** All [godot.Tween]s will automatically start by default. To prevent a [godot.Tween] from autostarting, you can call [stop] immediately after it was created.
 */
@GodotBaseType
public open class Tween : RefCounted() {
  /**
   * Emitted when a full loop is complete (see [setLoops]), providing the loop index. This signal is not emitted after final loop, use [finished] instead for this case.
   */
  public val loopFinished: Signal1<Long> by signal("loopCount")

  /**
   * Emitted when one step of the [godot.Tween] is complete, providing the step index. One step is either a single [godot.Tweener] or a group of [godot.Tweener]s running parallelly.
   */
  public val stepFinished: Signal1<Long> by signal("idx")

  /**
   * Emitted when the [godot.Tween] has finished all tweening. Never emitted when the [godot.Tween] is set to infinite looping (see [setLoops]).
   *
   * **Note:** The [godot.Tween] is removed (invalidated) after this signal is emitted, but it doesn't happen immediately, but on the next processing frame. Calling [stop] inside the signal callback will preserve the [godot.Tween].
   */
  public val finished: Signal0 by signal()

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_TWEEN)
  }

  /**
   * Creates and appends a [godot.PropertyTweener]. This method tweens a `property` of an `object` between an initial value and `final_val` in a span of time equal to `duration`, in seconds. The initial value by default is a value at the time the tweening of the [godot.PropertyTweener] start. For example:
   *
   * ```
   * 				var tween = create_tween()
   * 				tween.tween_property($Sprite, "position", Vector2(100, 200)
   * 				tween.tween_property($Sprite, "position", Vector2(200, 300)
   * 				```
   *
   * will move the sprite to position (100, 200) and then to (200, 300). If you use [godot.PropertyTweener.from] or [godot.PropertyTweener.fromCurrent], the starting position will be overwritten by the given value instead. See other methods in [godot.PropertyTweener] to see how the tweening can be tweaked further.
   *
   * **Note:** You can find the correct property name by hovering over the property in the Inspector. You can also provide the components of a property directly by using `"property:component"` (eg. `position:x`), where it would only apply to that particular component.
   *
   * Example: moving object twice from the same position, with different transition types.
   *
   * ```
   * 				var tween = create_tween()
   * 				tween.tween_property($Sprite, "position", Vector2.RIGHT * 300).as_relative().set_trans(Tween.TRANS_SINE)
   * 				tween.tween_property($Sprite, "position", Vector2.RIGHT * 300).as_relative().from_current().set_trans(Tween.TRANS_EXPO)
   * 				```
   */
  public open fun tweenProperty(
    _object: Object,
    `property`: NodePath,
    finalVal: Any,
    duration: Double
  ): PropertyTweener? {
    TransferContext.writeArguments(OBJECT to _object, NODE_PATH to property, ANY to finalVal, DOUBLE to duration)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_TWEEN_PROPERTY, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as PropertyTweener?
  }

  /**
   * Creates and appends an [godot.IntervalTweener]. This method can be used to create delays in the tween animation, as an alternative for using the delay in other [godot.Tweener]s or when there's no animation (in which case the [godot.Tween] acts as a timer). `time` is the length of the interval, in seconds.
   *
   * Example: creating an interval in code execution.
   *
   * ```
   * 				# ... some code
   * 				await create_tween().tween_interval(2).finished
   * 				# ... more code
   * 				```
   *
   * Example: creating an object that moves back and forth and jumps every few seconds.
   *
   * ```
   * 				var tween = create_tween().set_loops()
   * 				tween.tween_property("position:x", 200, 1).as_relative()
   * 				tween.tween_callback(jump)
   * 				tween.tween_interval(2)
   * 				tween.tween_property("position:x", -200, 1).as_relative()
   * 				tween.tween_callback(jump)
   * 				tween.tween_interval(2)
   * 				```
   */
  public open fun tweenInterval(time: Double): IntervalTweener? {
    TransferContext.writeArguments(DOUBLE to time)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_TWEEN_INTERVAL, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as IntervalTweener?
  }

  /**
   * Creates and appends a [godot.CallbackTweener]. This method can be used to call an arbitrary method in any object. Use [godot.Callable.bind] to bind additional arguments for the call.
   *
   * Example: object that keeps shooting every 1 second.
   *
   * ```
   * 				var tween = get_tree().create_tween().set_loops()
   * 				tween.tween_callback(shoot).set_delay(1)
   * 				```
   *
   * Example: turning a sprite red and then blue, with 2 second delay.
   *
   * ```
   * 				var tween = get_tree().create_tween()
   * 				tween.tween_callback($Sprite.set_modulate.bind(Color.red)).set_delay(2)
   * 				tween.tween_callback($Sprite.set_modulate.bind(Color.blue)).set_delay(2)
   * 				```
   */
  public open fun tweenCallback(callback: Callable): CallbackTweener? {
    TransferContext.writeArguments(CALLABLE to callback)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_TWEEN_CALLBACK, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as CallbackTweener?
  }

  /**
   * Creates and appends a [godot.MethodTweener]. This method is similar to a combination of [tweenCallback] and [tweenProperty]. It calls a method over time with a tweened value provided as an argument. The value is tweened between `from` and `to` over the time specified by `duration`, in seconds. Use [godot.Callable.bind] to bind additional arguments for the call. You can use [godot.MethodTweener.setEase] and [godot.MethodTweener.setTrans] to tweak the easing and transition of the value or [godot.MethodTweener.setDelay] to delay the tweening.
   *
   * Example: making a 3D object look from one point to another point.
   *
   * ```
   * 				var tween = create_tween()
   * 				tween.tween_method(look_at.bind(Vector3.UP), Vector3(-1, 0, -1), Vector3(1, 0, -1), 1) # The look_at() method takes up vector as second argument.
   * 				```
   *
   * Example: setting a text of a [godot.Label], using an intermediate method and after a delay.
   *
   * ```
   * 				func _ready():
   * 				    var tween = create_tween()
   * 				    tween.tween_method(set_label_text, 0, 10, 1).set_delay(1)
   *
   * 				func set_label_text(value: int):
   * 				    $Label.text = "Counting " + str(value)
   * 				```
   */
  public open fun tweenMethod(
    method: Callable,
    from: Any,
    to: Any,
    duration: Double
  ): MethodTweener? {
    TransferContext.writeArguments(CALLABLE to method, ANY to from, ANY to to, DOUBLE to duration)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_TWEEN_METHOD, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as MethodTweener?
  }

  /**
   * Processes the [godot.Tween] by given `delta` value, in seconds. Mostly useful when the [godot.Tween] is paused, for controlling it manually. Can also be used to end the [godot.Tween] animation immediately, by using `delta` longer than the whole duration.
   *
   * Returns `true` if the [godot.Tween] still has [godot.Tweener]s that haven't finished.
   *
   * **Note:** The [godot.Tween] will become invalid after finished, but you can call [stop] after the step, to keep it and reset.
   */
  public open fun customStep(delta: Double): Boolean {
    TransferContext.writeArguments(DOUBLE to delta)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_CUSTOM_STEP, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Stops the tweening and resets the [godot.Tween] to its initial state. This will not remove any appended [godot.Tweener]s.
   */
  public open fun stop(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_STOP, NIL)
  }

  /**
   * Pauses the tweening. The animation can be resumed by using [play].
   */
  public open fun pause(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_PAUSE, NIL)
  }

  /**
   * Resumes a paused or stopped [godot.Tween].
   */
  public open fun play(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_PLAY, NIL)
  }

  /**
   * Aborts all tweening operations and invalidates the [godot.Tween].
   */
  public open fun kill(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_KILL, NIL)
  }

  /**
   * Returns whether the [godot.Tween] is currently running, i.e. it wasn't paused and it's not finished.
   */
  public open fun isRunning(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_IS_RUNNING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns whether the [godot.Tween] is valid. A valid [godot.Tween] is a [godot.Tween] contained by the scene tree (i.e. the array from [godot.SceneTree.getProcessedTweens] will contain this [godot.Tween]). [godot.Tween] might become invalid when it has finished tweening or was killed, also when created with `Tween.new()`. Invalid [godot.Tween] can't have [godot.Tweener]s appended, because it can't animate them. You can however still use [interpolateValue].
   */
  public open fun isValid(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_IS_VALID, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Binds this [godot.Tween] with the given `node`. [godot.Tween]s are processed directly by the [godot.SceneTree], so they run independently of the animated nodes. When you bind a [godot.Node] with the [godot.Tween], the [godot.Tween] will halt the animation when the object is not inside tree and the [godot.Tween] will be automatically killed when the bound object is freed. Also [TWEEN_PAUSE_BOUND] will make the pausing behavior dependent on the bound node.
   *
   * For a shorter way to create and bind a [godot.Tween], you can use [godot.Node.createTween].
   */
  public open fun bindNode(node: Node): Tween? {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_BIND_NODE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Tween?
  }

  /**
   * Determines whether the [godot.Tween] should run during idle frame (see [godot.Node.Process]) or physics frame (see [godot.Node.PhysicsProcess].
   *
   * Default value is [TWEEN_PROCESS_IDLE].
   */
  public open fun setProcessMode(mode: Tween.TweenProcessMode): Tween? {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_SET_PROCESS_MODE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Tween?
  }

  /**
   * Determines the behavior of the [godot.Tween] when the [godot.SceneTree] is paused. Check [enum TweenPauseMode] for options.
   *
   * Default value is [TWEEN_PAUSE_BOUND].
   */
  public open fun setPauseMode(mode: Tween.TweenPauseMode): Tween? {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_SET_PAUSE_MODE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Tween?
  }

  /**
   * If `parallel` is `true`, the [godot.Tweener]s appended after this method will by default run simultaneously, as opposed to sequentially.
   */
  public open fun setParallel(parallel: Boolean = true): Tween? {
    TransferContext.writeArguments(BOOL to parallel)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_SET_PARALLEL, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Tween?
  }

  /**
   * Sets the number of times the tweening sequence will be repeated, i.e. `set_loops(2)` will run the animation twice.
   *
   * Calling this method without arguments will make the [godot.Tween] run infinitely, until it is either killed by [kill] or by freeing bound node, or all the animated objects have been freed (which makes further animation impossible).
   *
   * **Warning:** Make sure to always add some duration/delay when using infinite loops. 0-duration looped animations (e.g. single [godot.CallbackTweener] with no delay or [godot.PropertyTweener] with invalid node) are equivalent to infinite `while` loops and will freeze your game. If a [godot.Tween]'s lifetime depends on some node, always use [bindNode].
   */
  public open fun setLoops(loops: Long = 0): Tween? {
    TransferContext.writeArguments(LONG to loops)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_SET_LOOPS, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Tween?
  }

  /**
   * Scales the speed of tweening. This affects all [godot.Tweener]s and their delays.
   */
  public open fun setSpeedScale(speed: Double): Tween? {
    TransferContext.writeArguments(DOUBLE to speed)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_SET_SPEED_SCALE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Tween?
  }

  /**
   * Sets the default transition type for [godot.PropertyTweener]s and [godot.MethodTweener]s animated by this [godot.Tween].
   */
  public open fun setTrans(trans: Tween.TransitionType): Tween? {
    TransferContext.writeArguments(LONG to trans.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_SET_TRANS, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Tween?
  }

  /**
   * Sets the default ease type for [godot.PropertyTweener]s and [godot.MethodTweener]s animated by this [godot.Tween].
   */
  public open fun setEase(ease: Tween.EaseType): Tween? {
    TransferContext.writeArguments(LONG to ease.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_SET_EASE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Tween?
  }

  /**
   * Makes the next [godot.Tweener] run parallelly to the previous one. Example:
   *
   * ```
   * 				var tween = create_tween()
   * 				tween.tween_property(...)
   * 				tween.parallel().tween_property(...)
   * 				tween.parallel().tween_property(...)
   * 				```
   *
   * All [godot.Tweener]s in the example will run at the same time.
   *
   * You can make the [godot.Tween] parallel by default by using [setParallel].
   */
  public open fun parallel(): Tween? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_PARALLEL, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Tween?
  }

  /**
   * Used to chain two [godot.Tweener]s after [setParallel] is called with `true`.
   *
   * ```
   * 				var tween = create_tween().set_parallel(true)
   * 				tween.tween_property(...)
   * 				tween.tween_property(...) # Will run parallelly with above.
   * 				tween.chain().tween_property(...) # Will run after two above are finished.
   * 				```
   */
  public open fun chain(): Tween? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_CHAIN, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Tween?
  }

  /**
   * This method can be used for manual interpolation of a value, when you don't want [godot.Tween] to do animating for you. It's similar to [@GlobalScope.lerp], but with support for custom transition and easing.
   *
   * `initial_value` is the starting value of the interpolation.
   *
   * `delta_value` is the change of the value in the interpolation, i.e. it's equal to `final_value - initial_value`.
   *
   * `elapsed_time` is the time in seconds that passed after the interpolation started and it's used to control the position of the interpolation. E.g. when it's equal to half of the `duration`, the interpolated value will be halfway between initial and final values. This value can also be greater than `duration` or lower than 0, which will extrapolate the value.
   *
   * `duration` is the total time of the interpolation.
   *
   * **Note:** If `duration` is equal to `0`, the method will always return the final value, regardless of `elapsed_time` provided.
   */
  public open fun interpolateValue(
    initialValue: Any,
    deltaValue: Any,
    elapsedTime: Double,
    duration: Double,
    transType: Tween.TransitionType,
    easeType: Tween.EaseType
  ): Any? {
    TransferContext.writeArguments(ANY to initialValue, ANY to deltaValue, DOUBLE to elapsedTime, DOUBLE to duration, LONG to transType.id, LONG to easeType.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TWEEN_INTERPOLATE_VALUE, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  public enum class TransitionType(
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
    TRANS_BACK(10),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class TweenPauseMode(
    id: Long
  ) {
    /**
     * If the [godot.Tween] has a bound node, it will process when that node can process (see [godot.Node.processMode]). Otherwise it's the same as [TWEEN_PAUSE_STOP].
     */
    TWEEN_PAUSE_BOUND(0),
    /**
     * If [godot.SceneTree] is paused, the [godot.Tween] will also pause.
     */
    TWEEN_PAUSE_STOP(1),
    /**
     * The [godot.Tween] will process regardless of whether [godot.SceneTree] is paused.
     */
    TWEEN_PAUSE_PROCESS(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class TweenProcessMode(
    id: Long
  ) {
    /**
     * The [godot.Tween] updates during the physics frame.
     */
    TWEEN_PROCESS_PHYSICS(0),
    /**
     * The [godot.Tween] updates during the idle frame.
     */
    TWEEN_PROCESS_IDLE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class EaseType(
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
    EASE_OUT_IN(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
