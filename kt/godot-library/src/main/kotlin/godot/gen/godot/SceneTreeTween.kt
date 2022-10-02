// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Lightweight object used for general-purpose animation via script, using [godot.Tweener]s.
 *
 * [godot.SceneTreeTween] is a tween managed by the scene tree. As opposed to [godot.Tween], it does not require the instantiation of a node.
 *
 * [godot.SceneTreeTween]s are more light-weight than [godot.AnimationPlayer], so they are very much suited for simple animations or general tasks that don't require visual tweaking provided by the editor. They can be used in a fire-and-forget manner for some logic that normally would be done by code. You can e.g. make something shoot periodically by using a looped [godot.CallbackTweener] with a delay.
 *
 * A [godot.SceneTreeTween] can be created by using either [godot.SceneTree.createTween] or [godot.Node.createTween]. [godot.SceneTreeTween]s created manually (i.e. by using `Tween.new()`) are invalid. They can't be used for tweening values, but you can do manual interpolation with [interpolateValue].
 *
 * A tween animation is created by adding [godot.Tweener]s to the [godot.SceneTreeTween] object, using [tweenProperty], [tweenInterval], [tweenCallback] or [tweenMethod]:
 *
 * ```
 * 		var tween = get_tree().create_tween()
 * 		tween.tween_property($Sprite, "modulate", Color.red, 1)
 * 		tween.tween_property($Sprite, "scale", Vector2(), 1)
 * 		tween.tween_callback($Sprite, "queue_free")
 * 		```
 *
 * This sequence will make the `$Sprite` node turn red, then shrink, before finally calling [godot.Node.queueFree] to free the sprite. [godot.Tweener]s are executed one after another by default. This behavior can be changed using [parallel] and [setParallel].
 *
 * When a [godot.Tweener] is created with one of the `tween_*` methods, a chained method call can be used to tweak the properties of this [godot.Tweener]. For example, if you want to set a different transition type in the above example, you can use [setTrans]:
 *
 * ```
 * 		var tween = get_tree().create_tween()
 * 		tween.tween_property($Sprite, "modulate", Color.red, 1).set_trans(Tween.TRANS_SINE)
 * 		tween.tween_property($Sprite, "scale", Vector2(), 1).set_trans(Tween.TRANS_BOUNCE)
 * 		tween.tween_callback($Sprite, "queue_free")
 * 		```
 *
 * Most of the [godot.SceneTreeTween] methods can be chained this way too. In the following example the [godot.SceneTreeTween] is bound to the running script's node and a default transition is set for its [godot.Tweener]s:
 *
 * ```
 * 		var tween = get_tree().create_tween().bind_node(self).set_trans(Tween.TRANS_ELASTIC)
 * 		tween.tween_property($Sprite, "modulate", Color.red, 1)
 * 		tween.tween_property($Sprite, "scale", Vector2(), 1)
 * 		tween.tween_callback($Sprite, "queue_free")
 * 		```
 *
 * Another interesting use for [godot.SceneTreeTween]s is animating arbitrary sets of objects:
 *
 * ```
 * 		var tween = create_tween()
 * 		for sprite in get_children():
 * 		    tween.tween_property(sprite, "position", Vector2(0, 0), 1)
 * 		```
 *
 * In the example above, all children of a node are moved one after another to position (0, 0).
 *
 * You should avoid using more than one [godot.SceneTreeTween] per object's property. If two or more tweens animate one property at the same time, the last one created will take priority and assign the final value. If you want to interrupt and restart an animation, consider assigning the [godot.SceneTreeTween] to a variable:
 *
 * ```
 * 		var tween
 * 		func animate():
 * 		    if tween:
 * 		        tween.kill() # Abort the previous animation.
 * 		    tween = create_tween()
 * 		```
 *
 * Some [godot.Tweener]s use transitions and eases. The first accepts a [enum Tween.TransitionType] constant, and refers to the way the timing of the animation is handled (see [easings.net](https://easings.net/) for some examples). The second accepts an [enum Tween.EaseType] constant, and controls where the `trans_type` is applied to the interpolation (in the beginning, the end, or both). If you don't know which transition and easing to pick, you can try different [enum Tween.TransitionType] constants with [godot.Tween.EASE_IN_OUT], and use the one that looks best.
 *
 * [godot.Tween easing and transition types cheatsheet](https://raw.githubusercontent.com/godotengine/godot-docs/master/img/tween_cheatsheet.png)
 *
 * **Note:** All [godot.SceneTreeTween]s will automatically start by default. To prevent a [godot.SceneTreeTween] from autostarting, you can call [stop] immediately after it is created.
 *
 * **Note:** [godot.SceneTreeTween]s are processing after all of nodes in the current frame, i.e. after [godot.Node.Process] or [godot.Node.PhysicsProcess] (depending on [enum Tween.TweenProcessMode]).
 */
@GodotBaseType
public open class SceneTreeTween : Reference() {
  /**
   * Emitted when the [godot.SceneTreeTween] has finished all tweening. Never emitted when the [godot.SceneTreeTween] is set to infinite looping (see [setLoops]).
   *
   * **Note:** The [godot.SceneTreeTween] is removed (invalidated) in the next processing frame after this signal is emitted. Calling [stop] inside the signal callback will prevent the [godot.SceneTreeTween] from being removed.
   */
  public val finished: Signal0 by signal()

  /**
   * Emitted when a full loop is complete (see [setLoops]), providing the loop index. This signal is not emitted after the final loop, use [finished] instead for this case.
   */
  public val loopFinished: Signal1<Long> by signal("loop_count")

  /**
   * Emitted when one step of the [godot.SceneTreeTween] is complete, providing the step index. One step is either a single [godot.Tweener] or a group of [godot.Tweener]s running in parallel.
   */
  public val stepFinished: Signal1<Long> by signal("idx")

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SCENETREETWEEN)
  }

  /**
   * Binds this [godot.SceneTreeTween] with the given `node`. [godot.SceneTreeTween]s are processed directly by the [godot.SceneTree], so they run independently of the animated nodes. When you bind a [godot.Node] with the [godot.SceneTreeTween], the [godot.SceneTreeTween] will halt the animation when the object is not inside tree and the [godot.SceneTreeTween] will be automatically killed when the bound object is freed. Also [TWEEN_PAUSE_BOUND] will make the pausing behavior dependent on the bound node.
   *
   * For a shorter way to create and bind a [godot.SceneTreeTween], you can use [godot.Node.createTween].
   */
  public open fun bindNode(node: Node): SceneTreeTween? {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREETWEEN_BIND_NODE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as SceneTreeTween?
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
  public open fun chain(): SceneTreeTween? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREETWEEN_CHAIN, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as SceneTreeTween?
  }

  /**
   * Processes the [godot.SceneTreeTween] by the given `delta` value, in seconds. This is mostly useful for manual control when the [godot.SceneTreeTween] is paused. It can also be used to end the [godot.SceneTreeTween] animation immediately, by setting `delta` longer than the whole duration of the [godot.SceneTreeTween] animation.
   *
   * Returns `true` if the [godot.SceneTreeTween] still has [godot.Tweener]s that haven't finished.
   *
   * **Note:** The [godot.SceneTreeTween] will become invalid in the next processing frame after its animation finishes. Calling [stop] after performing [customStep] instead keeps and resets the [godot.SceneTreeTween].
   */
  public open fun customStep(delta: Double): Boolean {
    TransferContext.writeArguments(DOUBLE to delta)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREETWEEN_CUSTOM_STEP, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the total time in seconds the [godot.SceneTreeTween] has been animating (i.e. the time since it started, not counting pauses etc.). The time is affected by [setSpeedScale], and [stop] will reset it to `0`.
   *
   * **Note:** As it results from accumulating frame deltas, the time returned after the [godot.SceneTreeTween] has finished animating will be slightly greater than the actual [godot.SceneTreeTween] duration.
   */
  public open fun getTotalElapsedTime(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SCENETREETWEEN_GET_TOTAL_ELAPSED_TIME, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * This method can be used for manual interpolation of a value, when you don't want [godot.SceneTreeTween] to do animating for you. It's similar to [@GDScript.lerp], but with support for custom transition and easing.
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
    initialValue: Any?,
    deltaValue: Any?,
    elapsedTime: Double,
    duration: Double,
    transType: Long,
    easeType: Long
  ): Any? {
    TransferContext.writeArguments(ANY to initialValue, ANY to deltaValue, DOUBLE to elapsedTime,
        DOUBLE to duration, LONG to transType, LONG to easeType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREETWEEN_INTERPOLATE_VALUE,
        ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns whether the [godot.SceneTreeTween] is currently running, i.e. it wasn't paused and it's not finished.
   */
  public open fun isRunning(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREETWEEN_IS_RUNNING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns whether the [godot.SceneTreeTween] is valid. A valid [godot.SceneTreeTween] is a [godot.SceneTreeTween] contained by the scene tree (i.e. the array from [godot.SceneTree.getProcessedTweens] will contain this [godot.SceneTreeTween]). A [godot.SceneTreeTween] might become invalid when it has finished tweening, is killed, or when created with `SceneTreeTween.new()`. Invalid [godot.SceneTreeTween]s can't have [godot.Tweener]s appended. You can however still use [interpolateValue].
   */
  public open fun isValid(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREETWEEN_IS_VALID, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Aborts all tweening operations and invalidates the [godot.SceneTreeTween].
   */
  public open fun kill(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREETWEEN_KILL, NIL)
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
   * You can make the [godot.SceneTreeTween] parallel by default by using [setParallel].
   */
  public open fun parallel(): SceneTreeTween? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREETWEEN_PARALLEL, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as SceneTreeTween?
  }

  /**
   * Pauses the tweening. The animation can be resumed by using [play].
   */
  public open fun pause(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREETWEEN_PAUSE, NIL)
  }

  /**
   * Resumes a paused or stopped [godot.SceneTreeTween].
   */
  public open fun play(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREETWEEN_PLAY, NIL)
  }

  /**
   * Sets the default ease type for [godot.PropertyTweener]s and [godot.MethodTweener]s animated by this [godot.SceneTreeTween].
   */
  public open fun setEase(ease: Long): SceneTreeTween? {
    TransferContext.writeArguments(LONG to ease)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREETWEEN_SET_EASE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as SceneTreeTween?
  }

  /**
   * Sets the number of times the tweening sequence will be repeated, i.e. `set_loops(2)` will run the animation twice.
   *
   * Calling this method without arguments will make the [godot.SceneTreeTween] run infinitely, until either it is killed with [kill], the [godot.SceneTreeTween]'s bound node is freed, or all the animated objects have been freed (which makes further animation impossible).
   *
   * **Warning:** Make sure to always add some duration/delay when using infinite loops. To prevent the game freezing, 0-duration looped animations (e.g. a single [godot.CallbackTweener] with no delay) are stopped after a small number of loops, which may produce unexpected results. If a [godot.SceneTreeTween]'s lifetime depends on some node, always use [bindNode].
   */
  public open fun setLoops(loops: Long = 0): SceneTreeTween? {
    TransferContext.writeArguments(LONG to loops)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREETWEEN_SET_LOOPS, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as SceneTreeTween?
  }

  /**
   * If `parallel` is `true`, the [godot.Tweener]s appended after this method will by default run simultaneously, as opposed to sequentially.
   */
  public open fun setParallel(parallel: Boolean = true): SceneTreeTween? {
    TransferContext.writeArguments(BOOL to parallel)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREETWEEN_SET_PARALLEL, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as SceneTreeTween?
  }

  /**
   * Determines the behavior of the [godot.SceneTreeTween] when the [godot.SceneTree] is paused. Check [enum TweenPauseMode] for options.
   *
   * Default value is [TWEEN_PAUSE_BOUND].
   */
  public open fun setPauseMode(mode: Long): SceneTreeTween? {
    TransferContext.writeArguments(LONG to mode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREETWEEN_SET_PAUSE_MODE,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as SceneTreeTween?
  }

  /**
   * Determines whether the [godot.SceneTreeTween] should run during idle frame (see [godot.Node.Process]) or physics frame (see [godot.Node.PhysicsProcess].
   *
   * Default value is [godot.Tween.TWEEN_PROCESS_IDLE].
   */
  public open fun setProcessMode(mode: Long): SceneTreeTween? {
    TransferContext.writeArguments(LONG to mode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREETWEEN_SET_PROCESS_MODE,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as SceneTreeTween?
  }

  /**
   * Scales the speed of tweening. This affects all [godot.Tweener]s and their delays.
   */
  public open fun setSpeedScale(speed: Double): SceneTreeTween? {
    TransferContext.writeArguments(DOUBLE to speed)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREETWEEN_SET_SPEED_SCALE,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as SceneTreeTween?
  }

  /**
   * Sets the default transition type for [godot.PropertyTweener]s and [godot.MethodTweener]s animated by this [godot.SceneTreeTween].
   */
  public open fun setTrans(trans: Long): SceneTreeTween? {
    TransferContext.writeArguments(LONG to trans)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREETWEEN_SET_TRANS, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as SceneTreeTween?
  }

  /**
   * Stops the tweening and resets the [godot.SceneTreeTween] to its initial state. This will not remove any appended [godot.Tweener]s.
   */
  public open fun stop(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREETWEEN_STOP, NIL)
  }

  /**
   * Creates and appends a [godot.CallbackTweener]. This method can be used to call an arbitrary method in any object. Use `binds` to bind additional arguments for the call.
   *
   * Example: object that keeps shooting every 1 second.
   *
   * ```
   * 				var tween = get_tree().create_tween().set_loops()
   * 				tween.tween_callback(self, "shoot").set_delay(1)
   * 				```
   *
   * Example: turning a sprite red and then blue, with 2 second delay.
   *
   * ```
   * 				var tween = get_tree().create_tween()
   * 				tween.tween_callback($Sprite, "set_modulate", [godot.Color.red]).set_delay(2)
   * 				tween.tween_callback($Sprite, "set_modulate", [godot.Color.blue]).set_delay(2)
   * 				```
   */
  public open fun tweenCallback(
    _object: Object,
    method: String,
    binds: VariantArray<Any?> = VariantArray()
  ): CallbackTweener? {
    TransferContext.writeArguments(OBJECT to _object, STRING to method, ARRAY to binds)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREETWEEN_TWEEN_CALLBACK,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as CallbackTweener?
  }

  /**
   * Creates and appends an [godot.IntervalTweener]. This method can be used to create delays in the tween animation, as an alternative to using the delay in other [godot.Tweener]s, or when there's no animation (in which case the [godot.SceneTreeTween] acts as a timer). `time` is the length of the interval, in seconds.
   *
   * Example: creating an interval in code execution.
   *
   * ```
   * 				# ... some code
   * 				yield(create_tween().tween_interval(2), "finished")
   * 				# ... more code
   * 				```
   *
   * Example: creating an object that moves back and forth and jumps every few seconds.
   *
   * ```
   * 				var tween = create_tween().set_loops()
   * 				tween.tween_property($Sprite, "position:x", 200.0, 1).as_relative()
   * 				tween.tween_callback(self, "jump")
   * 				tween.tween_interval(2)
   * 				tween.tween_property($Sprite, "position:x", -200.0, 1).as_relative()
   * 				tween.tween_callback(self, "jump")
   * 				tween.tween_interval(2)
   * 				```
   */
  public open fun tweenInterval(time: Double): IntervalTweener? {
    TransferContext.writeArguments(DOUBLE to time)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREETWEEN_TWEEN_INTERVAL,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as IntervalTweener?
  }

  /**
   * Creates and appends a [godot.MethodTweener]. This method is similar to a combination of [tweenCallback] and [tweenProperty]. It calls a method over time with a tweened value provided as an argument. The value is tweened between `from` and `to` over the time specified by `duration`, in seconds. Use `binds` to bind additional arguments for the call. You can use [godot.MethodTweener.setEase] and [godot.MethodTweener.setTrans] to tweak the easing and transition of the value or [godot.MethodTweener.setDelay] to delay the tweening.
   *
   * Example: making a 3D object look from one point to another point.
   *
   * ```
   * 				var tween = create_tween()
   * 				tween.tween_method(self, "look_at", Vector3(-1, 0, -1), Vector3(1, 0, -1), 1, [godot.Vector3.UP]) # The look_at() method takes up vector as second argument.
   * 				```
   *
   * Example: setting a text of a [godot.Label], using an intermediate method and after a delay.
   *
   * ```
   * 				func _ready():
   * 				    var tween = create_tween()
   * 				    tween.tween_method(self, "set_label_text", 0, 10, 1).set_delay(1)
   *
   * 				func set_label_text(value: int):
   * 				    $Label.text = "Counting " + str(value)
   * 				```
   */
  public open fun tweenMethod(
    _object: Object,
    method: String,
    from: Any?,
    to: Any?,
    duration: Double,
    binds: VariantArray<Any?> = VariantArray()
  ): MethodTweener? {
    TransferContext.writeArguments(OBJECT to _object, STRING to method, ANY to from, ANY to to,
        DOUBLE to duration, ARRAY to binds)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREETWEEN_TWEEN_METHOD, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as MethodTweener?
  }

  /**
   * Creates and appends a [godot.PropertyTweener]. This method tweens a `property` of an `object` between an initial value and `final_val` in a span of time equal to `duration`, in seconds. The initial value by default is the property's value at the time the tweening of the [godot.PropertyTweener] starts. For example:
   *
   * ```
   * 				var tween = create_tween()
   * 				tween.tween_property($Sprite, "position", Vector2(100, 200), 1)
   * 				tween.tween_property($Sprite, "position", Vector2(200, 300), 1)
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
   * 				tween.tween_property($Sprite, "position", Vector2.RIGHT * 300, 1).as_relative().set_trans(Tween.TRANS_SINE)
   * 				tween.tween_property($Sprite, "position", Vector2.RIGHT * 300, 1).as_relative().from_current().set_trans(Tween.TRANS_EXPO)
   * 				```
   */
  public open fun tweenProperty(
    _object: Object,
    `property`: NodePath,
    finalVal: Any?,
    duration: Double
  ): PropertyTweener? {
    TransferContext.writeArguments(OBJECT to _object, NODE_PATH to property, ANY to finalVal, DOUBLE
        to duration)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENETREETWEEN_TWEEN_PROPERTY,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as PropertyTweener?
  }

  public enum class TweenPauseMode(
    id: Long
  ) {
    /**
     * If the [godot.SceneTreeTween] has a bound node, it will process when that node can process (see [godot.Node.pauseMode]). Otherwise it's the same as [TWEEN_PAUSE_STOP].
     */
    TWEEN_PAUSE_BOUND(0),
    /**
     * If [godot.SceneTree] is paused, the [godot.SceneTreeTween] will also pause.
     */
    TWEEN_PAUSE_STOP(1),
    /**
     * The [godot.SceneTreeTween] will process regardless of whether [godot.SceneTree] is paused.
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

  public companion object {
    /**
     * If the [godot.SceneTreeTween] has a bound node, it will process when that node can process (see [godot.Node.pauseMode]). Otherwise it's the same as [TWEEN_PAUSE_STOP].
     */
    public final const val TWEEN_PAUSE_BOUND: Long = 0

    /**
     * The [godot.SceneTreeTween] will process regardless of whether [godot.SceneTree] is paused.
     */
    public final const val TWEEN_PAUSE_PROCESS: Long = 2

    /**
     * If [godot.SceneTree] is paused, the [godot.SceneTreeTween] will also pause.
     */
    public final const val TWEEN_PAUSE_STOP: Long = 1
  }
}
