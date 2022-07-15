// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.signals.Signal2
import godot.signals.signal
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Abstract base class for the game's main loop.
 *
 * [godot.MainLoop] is the abstract base class for a Godot project's game loop. It is inherited by [godot.SceneTree], which is the default game loop implementation used in Godot projects, though it is also possible to write and use one's own [godot.MainLoop] subclass instead of the scene tree.
 *
 * Upon the application start, a [godot.MainLoop] implementation must be provided to the OS; otherwise, the application will exit. This happens automatically (and a [godot.SceneTree] is created) unless a [godot.MainLoop] [godot.Script] is provided from the command line (with e.g. `godot -s my_loop.gd` or the "Main Loop Type" project setting is overwritten.
 *
 * Here is an example script implementing a simple [godot.MainLoop]:
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * class_name CustomMainLoop
 *
 * extends MainLoop
 *
 *
 *
 * var time_elapsed = 0
 *
 *
 *
 * func _initialize():
 *
 *     print("Initialized:")
 *
 *     print("  Starting time: %s" % str(time_elapsed))
 *
 *
 *
 * func _process(delta):
 *
 *     time_elapsed += delta
 *
 *     # Return true to end the main loop.
 *
 *     return Input.get_mouse_button_mask() != 0 || Input.is_key_pressed(KEY_ESCAPE)
 *
 *
 *
 * func _finalize():
 *
 *     print("Finalized:")
 *
 *     print("  End time: %s" % str(time_elapsed))
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * using Godot;
 *
 * using System;
 *
 *
 *
 * public class CustomMainLoop : MainLoop
 *
 * {
 *
 *     public float TimeElapsed = 0;
 *
 *
 *
 *     public override void _Initialize()
 *
 *     {
 *
 *         GD.Print("Initialized:");
 *
 *         GD.Print($"  Starting Time: {TimeElapsed}");
 *
 *     }
 *
 *
 *
 *     public override bool _Process(float delta)
 *
 *     {
 *
 *         TimeElapsed += delta;
 *
 *         // Return true to end the main loop.
 *
 *         return Input.GetMouseButtonMask() != 0 || Input.IsKeyPressed((int)KeyList.Escape);
 *
 *     }
 *
 *
 *
 *     private void _Finalize()
 *
 *     {
 *
 *         GD.Print("Finalized:");
 *
 *         GD.Print($"  End Time: {TimeElapsed}");
 *
 *     }
 *
 * }
 *
 * [/csharp]
 *
 * [/codeblocks]
 */
@GodotBaseType
public open class MainLoop : Object() {
  /**
   * Emitted when a user responds to a permission request.
   */
  public val onRequestPermissionsResult: Signal2<String, Boolean> by signal("permission", "granted")

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_MAINLOOP)
  }

  /**
   * Called once during initialization.
   */
  public open fun _initialize(): Unit {
  }

  /**
   * Called each physics frame with the time since the last physics frame as argument (`delta`, in seconds). Equivalent to [godot.Node.PhysicsProcess].
   *
   * If implemented, the method must return a boolean value. `true` ends the main loop, while `false` lets it proceed to the next frame.
   */
  public open fun _physicsProcess(delta: Double): Boolean {
    throw NotImplementedError("_physics_process is not implemented for MainLoop")
  }

  /**
   * Called each process (idle) frame with the time since the last process frame as argument (in seconds). Equivalent to [godot.Node.Process].
   *
   * If implemented, the method must return a boolean value. `true` ends the main loop, while `false` lets it proceed to the next frame.
   */
  public open fun _process(delta: Double): Boolean {
    throw NotImplementedError("_process is not implemented for MainLoop")
  }

  /**
   * Called before the program exits.
   */
  public open fun _finalize(): Unit {
  }

  public companion object {
    /**
     * Notification received from the OS when the application is exceeding its allocated memory.
     *
     * Specific to the iOS platform.
     */
    public final const val NOTIFICATION_OS_MEMORY_WARNING: Long = 2009

    /**
     * Notification received when translations may have changed. Can be triggered by the user changing the locale. Can be used to respond to language changes, for example to change the UI strings on the fly. Useful when working with the built-in translation support, like [godot.Object.tr].
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
     * Notification received from the OS when an update of the Input Method Engine occurs (e.g. change of IME cursor position or composition string).
     *
     * Specific to the macOS platform.
     */
    public final const val NOTIFICATION_OS_IME_UPDATE: Long = 2013

    /**
     * Notification received from the OS when the application is resumed.
     *
     * Specific to the Android platform.
     */
    public final const val NOTIFICATION_APPLICATION_RESUMED: Long = 2014

    /**
     * Notification received from the OS when the application is paused.
     *
     * Specific to the Android platform.
     */
    public final const val NOTIFICATION_APPLICATION_PAUSED: Long = 2015

    /**
     * Notification received from the OS when the application is focused, i.e. when changing the focus from the OS desktop or a thirdparty application to any open window of the Godot instance.
     *
     * Implemented on desktop platforms.
     */
    public final const val NOTIFICATION_APPLICATION_FOCUS_IN: Long = 2016

    /**
     * Notification received from the OS when the application is defocused, i.e. when changing the focus from any open window of the Godot instance to the OS desktop or a thirdparty application.
     *
     * Implemented on desktop platforms.
     */
    public final const val NOTIFICATION_APPLICATION_FOCUS_OUT: Long = 2017

    /**
     * Notification received when text server is changed.
     */
    public final const val NOTIFICATION_TEXT_SERVER_CHANGED: Long = 2018
  }
}
