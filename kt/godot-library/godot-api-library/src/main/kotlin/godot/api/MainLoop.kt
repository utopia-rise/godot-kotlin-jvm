// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.core.Signal2
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * [MainLoop] is the abstract base class for a Godot project's game loop. It is inherited by
 * [SceneTree], which is the default game loop implementation used in Godot projects, though it is also
 * possible to write and use one's own [MainLoop] subclass instead of the scene tree.
 *
 * Upon the application start, a [MainLoop] implementation must be provided to the OS; otherwise,
 * the application will exit. This happens automatically (and a [SceneTree] is created) unless a
 * [MainLoop] [Script] is provided from the command line (with e.g. `godot -s my_loop.gd`) or the
 * [ProjectSettings.application/run/mainLoopType] project setting is overwritten.
 *
 * Here is an example script implementing a simple [MainLoop]:
 *
 * ```gdscript
 * //gdscript
 * class_name CustomMainLoop
 * extends MainLoop
 *
 * var time_elapsed = 0
 *
 * func _initialize():
 *     print("Initialized:")
 *     print("  Starting time: &#37;s" &#37; str(time_elapsed))
 *
 * func _process(delta):
 *     time_elapsed += delta
 *     # Return true to end the main loop.
 *     return Input.get_mouse_button_mask() != 0 || Input.is_key_pressed(KEY_ESCAPE)
 *
 * func _finalize():
 *     print("Finalized:")
 *     print("  End time: &#37;s" &#37; str(time_elapsed))
 * ```
 *
 * ```csharp
 * //csharp
 * using Godot;
 *
 * [GlobalClass]
 * public partial class CustomMainLoop : MainLoop
 * {
 *     private double _timeElapsed = 0;
 *
 *     public override void _Initialize()
 *     {
 *         GD.Print("Initialized:");
 *         GD.Print($"  Starting Time: {_timeElapsed}");
 *     }
 *
 *     public override bool _Process(double delta)
 *     {
 *         _timeElapsed += delta;
 *         // Return true to end the main loop.
 *         return Input.GetMouseButtonMask() != 0 || Input.IsKeyPressed(Key.Escape);
 *     }
 *
 *     private void _Finalize()
 *     {
 *         GD.Print("Finalized:");
 *         GD.Print($"  End Time: {_timeElapsed}");
 *     }
 * }
 * ```
 */
@GodotBaseType
public open class MainLoop : Object() {
  /**
   * Emitted when a user responds to a permission request.
   */
  public val onRequestPermissionsResult: Signal2<String, Boolean> by Signal2

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(343, scriptIndex)
  }

  /**
   * Called once during initialization.
   */
  public open fun _initialize(): Unit {
    throw NotImplementedError("_initialize is not implemented for MainLoop")
  }

  /**
   * Called each physics frame with the time since the last physics frame as argument ([delta], in
   * seconds). Equivalent to [Node.PhysicsProcess].
   *
   * If implemented, the method must return a boolean value. `true` ends the main loop, while
   * `false` lets it proceed to the next frame.
   *
   * **Note:** [delta] will be larger than expected if running at a framerate lower than
   * [Engine.physicsTicksPerSecond] / [Engine.maxPhysicsStepsPerFrame] FPS. This is done to avoid
   * "spiral of death" scenarios where performance would plummet due to an ever-increasing number of
   * physics steps per frame. This behavior affects both [_process] and [_physicsProcess]. As a result,
   * avoid using [delta] for time measurements in real-world seconds. Use the [Time] singleton's
   * methods for this purpose instead, such as [Time.getTicksUsec].
   */
  public open fun _physicsProcess(delta: Double): Boolean {
    throw NotImplementedError("_physicsProcess is not implemented for MainLoop")
  }

  /**
   * Called each process (idle) frame with the time since the last process frame as argument (in
   * seconds). Equivalent to [Node.Process].
   *
   * If implemented, the method must return a boolean value. `true` ends the main loop, while
   * `false` lets it proceed to the next frame.
   *
   * **Note:** [delta] will be larger than expected if running at a framerate lower than
   * [Engine.physicsTicksPerSecond] / [Engine.maxPhysicsStepsPerFrame] FPS. This is done to avoid
   * "spiral of death" scenarios where performance would plummet due to an ever-increasing number of
   * physics steps per frame. This behavior affects both [_process] and [_physicsProcess]. As a result,
   * avoid using [delta] for time measurements in real-world seconds. Use the [Time] singleton's
   * methods for this purpose instead, such as [Time.getTicksUsec].
   */
  public open fun _process(delta: Double): Boolean {
    throw NotImplementedError("_process is not implemented for MainLoop")
  }

  /**
   * Called before the program exits.
   */
  public open fun _finalize(): Unit {
    throw NotImplementedError("_finalize is not implemented for MainLoop")
  }

  public companion object {
    /**
     * Notification received from the OS when the application is exceeding its allocated memory.
     *
     * Specific to the iOS platform.
     */
    public final const val NOTIFICATION_OS_MEMORY_WARNING: Long = 2009

    /**
     * Notification received when translations may have changed. Can be triggered by the user
     * changing the locale. Can be used to respond to language changes, for example to change the UI
     * strings on the fly. Useful when working with the built-in translation support, like [Object.tr].
     */
    public final const val NOTIFICATION_TRANSLATION_CHANGED: Long = 2010

    /**
     * Notification received from the OS when a request for "About" information is sent.
     *
     * Specific to the macOS platform.
     */
    public final const val NOTIFICATION_WM_ABOUT: Long = 2011

    /**
     * Notification received from Godot's crash handler when the engine is about to crash.
     *
     * Implemented on desktop platforms if the crash handler is enabled.
     */
    public final const val NOTIFICATION_CRASH: Long = 2012

    /**
     * Notification received from the OS when an update of the Input Method Engine occurs (e.g.
     * change of IME cursor position or composition string).
     *
     * Specific to the macOS platform.
     */
    public final const val NOTIFICATION_OS_IME_UPDATE: Long = 2013

    /**
     * Notification received from the OS when the application is resumed.
     *
     * Specific to the Android and iOS platforms.
     */
    public final const val NOTIFICATION_APPLICATION_RESUMED: Long = 2014

    /**
     * Notification received from the OS when the application is paused.
     *
     * Specific to the Android and iOS platforms.
     *
     * **Note:** On iOS, you only have approximately 5 seconds to finish a task started by this
     * signal. If you go over this allotment, iOS will kill the app instead of pausing it.
     */
    public final const val NOTIFICATION_APPLICATION_PAUSED: Long = 2015

    /**
     * Notification received from the OS when the application is focused, i.e. when changing the
     * focus from the OS desktop or a thirdparty application to any open window of the Godot instance.
     *
     * Implemented on desktop and mobile platforms.
     */
    public final const val NOTIFICATION_APPLICATION_FOCUS_IN: Long = 2016

    /**
     * Notification received from the OS when the application is defocused, i.e. when changing the
     * focus from any open window of the Godot instance to the OS desktop or a thirdparty application.
     *
     * Implemented on desktop and mobile platforms.
     */
    public final const val NOTIFICATION_APPLICATION_FOCUS_OUT: Long = 2017

    /**
     * Notification received when text server is changed.
     */
    public final const val NOTIFICATION_TEXT_SERVER_CHANGED: Long = 2018
  }

  public object MethodBindings
}
