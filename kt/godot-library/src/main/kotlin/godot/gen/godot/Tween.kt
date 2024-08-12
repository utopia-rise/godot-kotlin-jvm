// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.NodePath
import godot.core.TypeManager
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * Tweens are mostly useful for animations requiring a numerical property to be interpolated over a
 * range of values. The name *tween* comes from *in-betweening*, an animation technique where you
 * specify *keyframes* and the computer interpolates the frames that appear between them. Animating
 * something with a [Tween] is called tweening.
 * [Tween] is more suited than [AnimationPlayer] for animations where you don't know the final
 * values in advance. For example, interpolating a dynamically-chosen camera zoom value is best done
 * with a [Tween]; it would be difficult to do the same thing with an [AnimationPlayer] node. Tweens
 * are also more light-weight than [AnimationPlayer], so they are very much suited for simple
 * animations or general tasks that don't require visual tweaking provided by the editor. They can be
 * used in a "fire-and-forget" manner for some logic that normally would be done by code. You can e.g.
 * make something shoot periodically by using a looped [CallbackTweener] with a delay.
 * A [Tween] can be created by using either [SceneTree.createTween] or [Node.createTween]. [Tween]s
 * created manually (i.e. by using `Tween.new()`) are invalid and can't be used for tweening values.
 * A tween animation is created by adding [Tweener]s to the [Tween] object, using [tweenProperty],
 * [tweenInterval], [tweenCallback] or [tweenMethod]:
 *
 * gdscript:
 * ```gdscript
 * var tween = get_tree().create_tween()
 * tween.tween_property($Sprite, "modulate", Color.RED, 1)
 * tween.tween_property($Sprite, "scale", Vector2(), 1)
 * tween.tween_callback($Sprite.queue_free)
 * ```
 * csharp:
 * ```csharp
 * Tween tween = GetTree().CreateTween();
 * tween.TweenProperty(GetNode("Sprite"), "modulate", Colors.Red, 1.0f);
 * tween.TweenProperty(GetNode("Sprite"), "scale", Vector2.Zero, 1.0f);
 * tween.TweenCallback(Callable.From(GetNode("Sprite").QueueFree));
 * ```
 *
 * This sequence will make the `$Sprite` node turn red, then shrink, before finally calling
 * [Node.queueFree] to free the sprite. [Tweener]s are executed one after another by default. This
 * behavior can be changed using [parallel] and [setParallel].
 * When a [Tweener] is created with one of the `tween_*` methods, a chained method call can be used
 * to tweak the properties of this [Tweener]. For example, if you want to set a different transition
 * type in the above example, you can use [setTrans]:
 *
 * gdscript:
 * ```gdscript
 * var tween = get_tree().create_tween()
 * tween.tween_property($Sprite, "modulate", Color.RED, 1).set_trans(Tween.TRANS_SINE)
 * tween.tween_property($Sprite, "scale", Vector2(), 1).set_trans(Tween.TRANS_BOUNCE)
 * tween.tween_callback($Sprite.queue_free)
 * ```
 * csharp:
 * ```csharp
 * Tween tween = GetTree().CreateTween();
 * tween.TweenProperty(GetNode("Sprite"), "modulate", Colors.Red,
 * 1.0f).SetTrans(Tween.TransitionType.Sine);
 * tween.TweenProperty(GetNode("Sprite"), "scale", Vector2.Zero,
 * 1.0f).SetTrans(Tween.TransitionType.Bounce);
 * tween.TweenCallback(Callable.From(GetNode("Sprite").QueueFree));
 * ```
 *
 * Most of the [Tween] methods can be chained this way too. In the following example the [Tween] is
 * bound to the running script's node and a default transition is set for its [Tweener]s:
 *
 * gdscript:
 * ```gdscript
 * var tween = get_tree().create_tween().bind_node(self).set_trans(Tween.TRANS_ELASTIC)
 * tween.tween_property($Sprite, "modulate", Color.RED, 1)
 * tween.tween_property($Sprite, "scale", Vector2(), 1)
 * tween.tween_callback($Sprite.queue_free)
 * ```
 * csharp:
 * ```csharp
 * var tween = GetTree().CreateTween().BindNode(this).SetTrans(Tween.TransitionType.Elastic);
 * tween.TweenProperty(GetNode("Sprite"), "modulate", Colors.Red, 1.0f);
 * tween.TweenProperty(GetNode("Sprite"), "scale", Vector2.Zero, 1.0f);
 * tween.TweenCallback(Callable.From(GetNode("Sprite").QueueFree));
 * ```
 *
 * Another interesting use for [Tween]s is animating arbitrary sets of objects:
 *
 * gdscript:
 * ```gdscript
 * var tween = create_tween()
 * for sprite in get_children():
 *     tween.tween_property(sprite, "position", Vector2(0, 0), 1)
 * ```
 * csharp:
 * ```csharp
 * Tween tween = CreateTween();
 * foreach (Node sprite in GetChildren())
 *     tween.TweenProperty(sprite, "position", Vector2.Zero, 1.0f);
 * ```
 *
 * In the example above, all children of a node are moved one after another to position (0, 0).
 * You should avoid using more than one [Tween] per object's property. If two or more tweens animate
 * one property at the same time, the last one created will take priority and assign the final value.
 * If you want to interrupt and restart an animation, consider assigning the [Tween] to a variable:
 *
 * gdscript:
 * ```gdscript
 * var tween
 * func animate():
 *     if tween:
 *         tween.kill() # Abort the previous animation.
 *     tween = create_tween()
 * ```
 * csharp:
 * ```csharp
 * private Tween _tween;
 *
 * public void Animate()
 * {
 *     if (_tween != null)
 *         _tween.Kill(); // Abort the previous animation
 *     _tween = CreateTween();
 * }
 * ```
 *
 * Some [Tweener]s use transitions and eases. The first accepts a [TransitionType] constant, and
 * refers to the way the timing of the animation is handled (see
 * [url=https://easings.net/]easings.net[/url] for some examples). The second accepts an [EaseType]
 * constant, and controls where the `trans_type` is applied to the interpolation (in the beginning, the
 * end, or both). If you don't know which transition and easing to pick, you can try different
 * [TransitionType] constants with [EASE_IN_OUT], and use the one that looks best.
 * [url=https://raw.githubusercontent.com/godotengine/godot-docs/master/img/tween_cheatsheet.webp]Tween
 * easing and transition types cheatsheet[/url]
 * **Note:** Tweens are not designed to be re-used and trying to do so results in an undefined
 * behavior. Create a new Tween for each animation and every time you replay an animation from start.
 * Keep in mind that Tweens start immediately, so only create a Tween when you want to start animating.
 * **Note:** The tween is processed after all of the nodes in the current frame, i.e. node's
 * [Node.Process] method would be called before the tween (or [Node.PhysicsProcess] depending on the
 * value passed to [setProcessMode]).
 */
@GodotBaseType
public open class Tween : RefCounted() {
  /**
   * Emitted when one step of the [Tween] is complete, providing the step index. One step is either
   * a single [Tweener] or a group of [Tweener]s running in parallel.
   */
  public val stepFinished: Signal1<Long> by signal("idx")

  /**
   * Emitted when a full loop is complete (see [setLoops]), providing the loop index. This signal is
   * not emitted after the final loop, use [signal finished] instead for this case.
   */
  public val loopFinished: Signal1<Long> by signal("loopCount")

  /**
   * Emitted when the [Tween] has finished all tweening. Never emitted when the [Tween] is set to
   * infinite looping (see [setLoops]).
   */
  public val finished: Signal0 by signal()

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TWEEN, scriptIndex)
    return true
  }

  /**
   * Creates and appends a [PropertyTweener]. This method tweens a [property] of an [object] between
   * an initial value and [finalVal] in a span of time equal to [duration], in seconds. The initial
   * value by default is the property's value at the time the tweening of the [PropertyTweener] starts.
   * **Example:**
   *
   * gdscript:
   * ```gdscript
   * var tween = create_tween()
   * tween.tween_property($Sprite, "position", Vector2(100, 200), 1)
   * tween.tween_property($Sprite, "position", Vector2(200, 300), 1)
   * ```
   * csharp:
   * ```csharp
   * Tween tween = CreateTween();
   * tween.TweenProperty(GetNode("Sprite"), "position", new Vector2(100.0f, 200.0f), 1.0f);
   * tween.TweenProperty(GetNode("Sprite"), "position", new Vector2(200.0f, 300.0f), 1.0f);
   * ```
   *
   * will move the sprite to position (100, 200) and then to (200, 300). If you use
   * [PropertyTweener.from] or [PropertyTweener.fromCurrent], the starting position will be overwritten
   * by the given value instead. See other methods in [PropertyTweener] to see how the tweening can be
   * tweaked further.
   * **Note:** You can find the correct property name by hovering over the property in the
   * Inspector. You can also provide the components of a property directly by using
   * `"property:component"` (eg. `position:x`), where it would only apply to that particular component.
   * **Example:** Moving an object twice from the same position, with different transition types:
   *
   * gdscript:
   * ```gdscript
   * var tween = create_tween()
   * tween.tween_property($Sprite, "position", Vector2.RIGHT * 300,
   * 1).as_relative().set_trans(Tween.TRANS_SINE)
   * tween.tween_property($Sprite, "position", Vector2.RIGHT * 300,
   * 1).as_relative().from_current().set_trans(Tween.TRANS_EXPO)
   * ```
   * csharp:
   * ```csharp
   * Tween tween = CreateTween();
   * tween.TweenProperty(GetNode("Sprite"), "position", Vector2.Right * 300.0f,
   * 1.0f).AsRelative().SetTrans(Tween.TransitionType.Sine);
   * tween.TweenProperty(GetNode("Sprite"), "position", Vector2.Right * 300.0f,
   * 1.0f).AsRelative().FromCurrent().SetTrans(Tween.TransitionType.Expo);
   * ```
   */
  public fun tweenProperty(
    _object: Object,
    `property`: NodePath,
    finalVal: Any?,
    duration: Double,
  ): PropertyTweener? {
    TransferContext.writeArguments(OBJECT to _object, NODE_PATH to property, ANY to finalVal, DOUBLE to duration)
    TransferContext.callMethod(rawPtr, MethodBindings.tweenPropertyPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as PropertyTweener?)
  }

  /**
   * Creates and appends an [IntervalTweener]. This method can be used to create delays in the tween
   * animation, as an alternative to using the delay in other [Tweener]s, or when there's no animation
   * (in which case the [Tween] acts as a timer). [time] is the length of the interval, in seconds.
   * **Example:** Creating an interval in code execution:
   *
   * gdscript:
   * ```gdscript
   * # ... some code
   * await create_tween().tween_interval(2).finished
   * # ... more code
   * ```
   * csharp:
   * ```csharp
   * // ... some code
   * await ToSignal(CreateTween().TweenInterval(2.0f), Tween.SignalName.Finished);
   * // ... more code
   * ```
   *
   * **Example:** Creating an object that moves back and forth and jumps every few seconds:
   *
   * gdscript:
   * ```gdscript
   * var tween = create_tween().set_loops()
   * tween.tween_property($Sprite, "position:x", 200.0, 1).as_relative()
   * tween.tween_callback(jump)
   * tween.tween_interval(2)
   * tween.tween_property($Sprite, "position:x", -200.0, 1).as_relative()
   * tween.tween_callback(jump)
   * tween.tween_interval(2)
   * ```
   * csharp:
   * ```csharp
   * Tween tween = CreateTween().SetLoops();
   * tween.TweenProperty(GetNode("Sprite"), "position:x", 200.0f, 1.0f).AsRelative();
   * tween.TweenCallback(Callable.From(Jump));
   * tween.TweenInterval(2.0f);
   * tween.TweenProperty(GetNode("Sprite"), "position:x", -200.0f, 1.0f).AsRelative();
   * tween.TweenCallback(Callable.From(Jump));
   * tween.TweenInterval(2.0f);
   * ```
   */
  public fun tweenInterval(time: Double): IntervalTweener? {
    TransferContext.writeArguments(DOUBLE to time)
    TransferContext.callMethod(rawPtr, MethodBindings.tweenIntervalPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as IntervalTweener?)
  }

  /**
   * Creates and appends a [CallbackTweener]. This method can be used to call an arbitrary method in
   * any object. Use [Callable.bind] to bind additional arguments for the call.
   * **Example:** Object that keeps shooting every 1 second:
   *
   * gdscript:
   * ```gdscript
   * var tween = get_tree().create_tween().set_loops()
   * tween.tween_callback(shoot).set_delay(1)
   * ```
   * csharp:
   * ```csharp
   * Tween tween = GetTree().CreateTween().SetLoops();
   * tween.TweenCallback(Callable.From(Shoot)).SetDelay(1.0f);
   * ```
   *
   * **Example:** Turning a sprite red and then blue, with 2 second delay:
   *
   * gdscript:
   * ```gdscript
   * var tween = get_tree().create_tween()
   * tween.tween_callback($Sprite.set_modulate.bind(Color.RED)).set_delay(2)
   * tween.tween_callback($Sprite.set_modulate.bind(Color.BLUE)).set_delay(2)
   * ```
   * csharp:
   * ```csharp
   * Tween tween = GetTree().CreateTween();
   * Sprite2D sprite = GetNode<Sprite2D>("Sprite");
   * tween.TweenCallback(Callable.From(() => sprite.Modulate = Colors.Red)).SetDelay(2.0f);
   * tween.TweenCallback(Callable.From(() => sprite.Modulate = Colors.Blue)).SetDelay(2.0f);
   * ```
   */
  public fun tweenCallback(callback: Callable): CallbackTweener? {
    TransferContext.writeArguments(CALLABLE to callback)
    TransferContext.callMethod(rawPtr, MethodBindings.tweenCallbackPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as CallbackTweener?)
  }

  /**
   * Creates and appends a [MethodTweener]. This method is similar to a combination of
   * [tweenCallback] and [tweenProperty]. It calls a method over time with a tweened value provided as
   * an argument. The value is tweened between [from] and [to] over the time specified by [duration],
   * in seconds. Use [Callable.bind] to bind additional arguments for the call. You can use
   * [MethodTweener.setEase] and [MethodTweener.setTrans] to tweak the easing and transition of the
   * value or [MethodTweener.setDelay] to delay the tweening.
   * **Example:** Making a 3D object look from one point to another point:
   *
   * gdscript:
   * ```gdscript
   * var tween = create_tween()
   * tween.tween_method(look_at.bind(Vector3.UP), Vector3(-1, 0, -1), Vector3(1, 0, -1), 1) # The
   * look_at() method takes up vector as second argument.
   * ```
   * csharp:
   * ```csharp
   * Tween tween = CreateTween();
   * tween.TweenMethod(Callable.From((Vector3 target) => LookAt(target, Vector3.Up)), new
   * Vector3(-1.0f, 0.0f, -1.0f), new Vector3(1.0f, 0.0f, -1.0f), 1.0f); // Use lambdas to bind
   * additional arguments for the call.
   * ```
   *
   * **Example:** Setting the text of a [Label], using an intermediate method and after a delay:
   *
   * gdscript:
   * ```gdscript
   * func _ready():
   *     var tween = create_tween()
   *     tween.tween_method(set_label_text, 0, 10, 1).set_delay(1)
   *
   * func set_label_text(value: int):
   *     $Label.text = "Counting " + str(value)
   * ```
   * csharp:
   * ```csharp
   * public override void _Ready()
   * {
   *     base._Ready();
   *
   *     Tween tween = CreateTween();
   *     tween.TweenMethod(Callable.From<int>(SetLabelText), 0.0f, 10.0f, 1.0f).SetDelay(1.0f);
   * }
   *
   * private void SetLabelText(int value)
   * {
   *     GetNode<Label>("Label").Text = $"Counting {value}";
   * }
   * ```
   */
  public fun tweenMethod(
    method: Callable,
    from: Any?,
    to: Any?,
    duration: Double,
  ): MethodTweener? {
    TransferContext.writeArguments(CALLABLE to method, ANY to from, ANY to to, DOUBLE to duration)
    TransferContext.callMethod(rawPtr, MethodBindings.tweenMethodPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as MethodTweener?)
  }

  /**
   * Processes the [Tween] by the given [delta] value, in seconds. This is mostly useful for manual
   * control when the [Tween] is paused. It can also be used to end the [Tween] animation immediately,
   * by setting [delta] longer than the whole duration of the [Tween] animation.
   * Returns `true` if the [Tween] still has [Tweener]s that haven't finished.
   */
  public fun customStep(delta: Double): Boolean {
    TransferContext.writeArguments(DOUBLE to delta)
    TransferContext.callMethod(rawPtr, MethodBindings.customStepPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Stops the tweening and resets the [Tween] to its initial state. This will not remove any
   * appended [Tweener]s.
   * **Note:** If a Tween is stopped and not bound to any node, it will exist indefinitely until
   * manually started or invalidated. If you lose a reference to such Tween, you can retrieve it using
   * [SceneTree.getProcessedTweens].
   */
  public fun stop(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.stopPtr, NIL)
  }

  /**
   * Pauses the tweening. The animation can be resumed by using [play].
   * **Note:** If a Tween is paused and not bound to any node, it will exist indefinitely until
   * manually started or invalidated. If you lose a reference to such Tween, you can retrieve it using
   * [SceneTree.getProcessedTweens].
   */
  public fun pause(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.pausePtr, NIL)
  }

  /**
   * Resumes a paused or stopped [Tween].
   */
  public fun play(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.playPtr, NIL)
  }

  /**
   * Aborts all tweening operations and invalidates the [Tween].
   */
  public fun kill(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.killPtr, NIL)
  }

  /**
   * Returns the total time in seconds the [Tween] has been animating (i.e. the time since it
   * started, not counting pauses etc.). The time is affected by [setSpeedScale], and [stop] will reset
   * it to `0`.
   * **Note:** As it results from accumulating frame deltas, the time returned after the [Tween] has
   * finished animating will be slightly greater than the actual [Tween] duration.
   */
  public fun getTotalElapsedTime(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTotalElapsedTimePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  /**
   * Returns whether the [Tween] is currently running, i.e. it wasn't paused and it's not finished.
   */
  public fun isRunning(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isRunningPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns whether the [Tween] is valid. A valid [Tween] is a [Tween] contained by the scene tree
   * (i.e. the array from [SceneTree.getProcessedTweens] will contain this [Tween]). A [Tween] might
   * become invalid when it has finished tweening, is killed, or when created with `Tween.new()`.
   * Invalid [Tween]s can't have [Tweener]s appended.
   */
  public fun isValid(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isValidPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Binds this [Tween] with the given [node]. [Tween]s are processed directly by the [SceneTree],
   * so they run independently of the animated nodes. When you bind a [Node] with the [Tween], the
   * [Tween] will halt the animation when the object is not inside tree and the [Tween] will be
   * automatically killed when the bound object is freed. Also [TWEEN_PAUSE_BOUND] will make the
   * pausing behavior dependent on the bound node.
   * For a shorter way to create and bind a [Tween], you can use [Node.createTween].
   */
  public fun bindNode(node: Node): Tween? {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, MethodBindings.bindNodePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Tween?)
  }

  /**
   * Determines whether the [Tween] should run after process frames (see [Node.Process]) or physics
   * frames (see [Node.PhysicsProcess]).
   * Default value is [TWEEN_PROCESS_IDLE].
   */
  public fun setProcessMode(mode: TweenProcessMode): Tween? {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setProcessModePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Tween?)
  }

  /**
   * Determines the behavior of the [Tween] when the [SceneTree] is paused. Check [TweenPauseMode]
   * for options.
   * Default value is [TWEEN_PAUSE_BOUND].
   */
  public fun setPauseMode(mode: TweenPauseMode): Tween? {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setPauseModePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Tween?)
  }

  /**
   * If [parallel] is `true`, the [Tweener]s appended after this method will by default run
   * simultaneously, as opposed to sequentially.
   * **Note:** Just like with [parallel], the tweener added right before this method will also be
   * part of the parallel step.
   * [codeblock]
   * tween.tween_property(self, "position", Vector2(300, 0), 0.5)
   * tween.set_parallel()
   * tween.tween_property(self, "modulate", Color.GREEN, 0.5) # Runs together with the position
   * tweener.
   * [/codeblock]
   */
  @JvmOverloads
  public fun setParallel(parallel: Boolean = true): Tween? {
    TransferContext.writeArguments(BOOL to parallel)
    TransferContext.callMethod(rawPtr, MethodBindings.setParallelPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Tween?)
  }

  /**
   * Sets the number of times the tweening sequence will be repeated, i.e. `set_loops(2)` will run
   * the animation twice.
   * Calling this method without arguments will make the [Tween] run infinitely, until either it is
   * killed with [kill], the [Tween]'s bound node is freed, or all the animated objects have been freed
   * (which makes further animation impossible).
   * **Warning:** Make sure to always add some duration/delay when using infinite loops. To prevent
   * the game freezing, 0-duration looped animations (e.g. a single [CallbackTweener] with no delay)
   * are stopped after a small number of loops, which may produce unexpected results. If a [Tween]'s
   * lifetime depends on some node, always use [bindNode].
   */
  @JvmOverloads
  public fun setLoops(loops: Int = 0): Tween? {
    TransferContext.writeArguments(LONG to loops.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setLoopsPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Tween?)
  }

  /**
   * Returns the number of remaining loops for this [Tween] (see [setLoops]). A return value of `-1`
   * indicates an infinitely looping [Tween], and a return value of `0` indicates that the [Tween] has
   * already finished.
   */
  public fun getLoopsLeft(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLoopsLeftPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Scales the speed of tweening. This affects all [Tweener]s and their delays.
   */
  public fun setSpeedScale(speed: Float): Tween? {
    TransferContext.writeArguments(DOUBLE to speed.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setSpeedScalePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Tween?)
  }

  /**
   * Sets the default transition type for [PropertyTweener]s and [MethodTweener]s animated by this
   * [Tween].
   * If not specified, the default value is [TRANS_LINEAR].
   */
  public fun setTrans(trans: TransitionType): Tween? {
    TransferContext.writeArguments(LONG to trans.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setTransPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Tween?)
  }

  /**
   * Sets the default ease type for [PropertyTweener]s and [MethodTweener]s animated by this
   * [Tween].
   * If not specified, the default value is [EASE_IN_OUT].
   */
  public fun setEase(ease: EaseType): Tween? {
    TransferContext.writeArguments(LONG to ease.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setEasePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Tween?)
  }

  /**
   * Makes the next [Tweener] run parallelly to the previous one.
   * **Example:**
   *
   * gdscript:
   * ```gdscript
   * var tween = create_tween()
   * tween.tween_property(...)
   * tween.parallel().tween_property(...)
   * tween.parallel().tween_property(...)
   * ```
   * csharp:
   * ```csharp
   * Tween tween = CreateTween();
   * tween.TweenProperty(...);
   * tween.Parallel().TweenProperty(...);
   * tween.Parallel().TweenProperty(...);
   * ```
   *
   * All [Tweener]s in the example will run at the same time.
   * You can make the [Tween] parallel by default by using [setParallel].
   */
  public fun parallel(): Tween? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.parallelPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Tween?)
  }

  /**
   * Used to chain two [Tweener]s after [setParallel] is called with `true`.
   *
   * gdscript:
   * ```gdscript
   * var tween = create_tween().set_parallel(true)
   * tween.tween_property(...)
   * tween.tween_property(...) # Will run parallelly with above.
   * tween.chain().tween_property(...) # Will run after two above are finished.
   * ```
   * csharp:
   * ```csharp
   * Tween tween = CreateTween().SetParallel(true);
   * tween.TweenProperty(...);
   * tween.TweenProperty(...); // Will run parallelly with above.
   * tween.Chain().TweenProperty(...); // Will run after two above are finished.
   * ```
   */
  public fun chain(): Tween? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.chainPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Tween?)
  }

  public enum class TweenProcessMode(
    id: Long,
  ) {
    /**
     * The [Tween] updates after each physics frame (see [Node.PhysicsProcess]).
     */
    TWEEN_PROCESS_PHYSICS(0),
    /**
     * The [Tween] updates after each process frame (see [Node.Process]).
     */
    TWEEN_PROCESS_IDLE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class TweenPauseMode(
    id: Long,
  ) {
    /**
     * If the [Tween] has a bound node, it will process when that node can process (see
     * [Node.processMode]). Otherwise it's the same as [TWEEN_PAUSE_STOP].
     */
    TWEEN_PAUSE_BOUND(0),
    /**
     * If [SceneTree] is paused, the [Tween] will also pause.
     */
    TWEEN_PAUSE_STOP(1),
    /**
     * The [Tween] will process regardless of whether [SceneTree] is paused.
     */
    TWEEN_PAUSE_PROCESS(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class TransitionType(
    id: Long,
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
    /**
     * The animation is interpolated like a spring towards the end.
     */
    TRANS_SPRING(11),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class EaseType(
    id: Long,
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * This method can be used for manual interpolation of a value, when you don't want [Tween] to
     * do animating for you. It's similar to [@GlobalScope.lerp], but with support for custom
     * transition and easing.
     * [initialValue] is the starting value of the interpolation.
     * [deltaValue] is the change of the value in the interpolation, i.e. it's equal to
     * `final_value - initial_value`.
     * [elapsedTime] is the time in seconds that passed after the interpolation started and it's
     * used to control the position of the interpolation. E.g. when it's equal to half of the
     * [duration], the interpolated value will be halfway between initial and final values. This value
     * can also be greater than [duration] or lower than 0, which will extrapolate the value.
     * [duration] is the total time of the interpolation.
     * **Note:** If [duration] is equal to `0`, the method will always return the final value,
     * regardless of [elapsedTime] provided.
     */
    public fun interpolateValue(
      initialValue: Any?,
      deltaValue: Any?,
      elapsedTime: Double,
      duration: Double,
      transType: TransitionType,
      easeType: EaseType,
    ): Any? {
      TransferContext.writeArguments(ANY to initialValue, ANY to deltaValue, DOUBLE to elapsedTime, DOUBLE to duration, LONG to transType.id, LONG to easeType.id)
      TransferContext.callMethod(0, MethodBindings.interpolateValuePtr, ANY)
      return (TransferContext.readReturnValue(ANY, true) as Any?)
    }
  }

  internal object MethodBindings {
    public val tweenPropertyPtr: VoidPtr = TypeManager.getMethodBindPtr("Tween", "tween_property")

    public val tweenIntervalPtr: VoidPtr = TypeManager.getMethodBindPtr("Tween", "tween_interval")

    public val tweenCallbackPtr: VoidPtr = TypeManager.getMethodBindPtr("Tween", "tween_callback")

    public val tweenMethodPtr: VoidPtr = TypeManager.getMethodBindPtr("Tween", "tween_method")

    public val customStepPtr: VoidPtr = TypeManager.getMethodBindPtr("Tween", "custom_step")

    public val stopPtr: VoidPtr = TypeManager.getMethodBindPtr("Tween", "stop")

    public val pausePtr: VoidPtr = TypeManager.getMethodBindPtr("Tween", "pause")

    public val playPtr: VoidPtr = TypeManager.getMethodBindPtr("Tween", "play")

    public val killPtr: VoidPtr = TypeManager.getMethodBindPtr("Tween", "kill")

    public val getTotalElapsedTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tween", "get_total_elapsed_time")

    public val isRunningPtr: VoidPtr = TypeManager.getMethodBindPtr("Tween", "is_running")

    public val isValidPtr: VoidPtr = TypeManager.getMethodBindPtr("Tween", "is_valid")

    public val bindNodePtr: VoidPtr = TypeManager.getMethodBindPtr("Tween", "bind_node")

    public val setProcessModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tween", "set_process_mode")

    public val setPauseModePtr: VoidPtr = TypeManager.getMethodBindPtr("Tween", "set_pause_mode")

    public val setParallelPtr: VoidPtr = TypeManager.getMethodBindPtr("Tween", "set_parallel")

    public val setLoopsPtr: VoidPtr = TypeManager.getMethodBindPtr("Tween", "set_loops")

    public val getLoopsLeftPtr: VoidPtr = TypeManager.getMethodBindPtr("Tween", "get_loops_left")

    public val setSpeedScalePtr: VoidPtr = TypeManager.getMethodBindPtr("Tween", "set_speed_scale")

    public val setTransPtr: VoidPtr = TypeManager.getMethodBindPtr("Tween", "set_trans")

    public val setEasePtr: VoidPtr = TypeManager.getMethodBindPtr("Tween", "set_ease")

    public val parallelPtr: VoidPtr = TypeManager.getMethodBindPtr("Tween", "parallel")

    public val chainPtr: VoidPtr = TypeManager.getMethodBindPtr("Tween", "chain")

    public val interpolateValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Tween", "interpolate_value")
  }
}
