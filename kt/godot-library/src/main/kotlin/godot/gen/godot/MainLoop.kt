// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.signals.Signal2
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

/**
 * Abstract base class for the game's main loop.
 *
 * [godot.MainLoop] is the abstract base class for a Godot project's game loop. It is inherited by [godot.SceneTree], which is the default game loop implementation used in Godot projects, though it is also possible to write and use one's own [godot.MainLoop] subclass instead of the scene tree.
 *
 * Upon the application start, a [godot.MainLoop] implementation must be provided to the OS; otherwise, the application will exit. This happens automatically (and a [godot.SceneTree] is created) unless a main [godot.Script] is provided from the command line (with e.g. `godot -s my_loop.gd`, which should then be a [godot.MainLoop] implementation.
 *
 * Here is an example script implementing a simple [godot.MainLoop]:
 *
 * ```
 * 		extends MainLoop
 *
 * 		var time_elapsed = 0
 * 		var keys_typed = []
 * 		var quit = false
 *
 * 		func _initialize():
 * 		    print("Initialized:")
 * 		    print("  Starting time: %s" % str(time_elapsed))
 *
 * 		func _idle(delta):
 * 		    time_elapsed += delta
 * 		    # Return true to end the main loop.
 * 		    return quit
 *
 * 		func _input_event(event):
 * 		    # Record keys.
 * 		    if event is InputEventKey and event.pressed and !event.echo:
 * 		        keys_typed.append(OS.get_scancode_string(event.scancode))
 * 		        # Quit on Escape press.
 * 		        if event.scancode == KEY_ESCAPE:
 * 		            quit = true
 * 		    # Quit on any mouse click.
 * 		    if event is InputEventMouseButton:
 * 		        quit = true
 *
 * 		func _finalize():
 * 		    print("Finalized:")
 * 		    print("  End time: %s" % str(time_elapsed))
 * 		    print("  Keys typed: %s" % var2str(keys_typed))
 * 		```
 */
@GodotBaseType
open class MainLoop : Object() {
  /**
   * Emitted when a user responds to a permission request.
   */
  val onRequestPermissionsResult: Signal2<String, Boolean> by signal("permission", "granted")

  override fun __new() {
    callConstructor(ENGINECLASS_MAINLOOP)
  }

  /**
   * Called when files are dragged from the OS file manager and dropped in the game window. The arguments are a list of file paths and the identifier of the screen where the drag originated.
   */
  open fun _dropFiles(files: PoolStringArray, fromScreen: Long) {
  }

  /**
   * Called before the program exits.
   */
  open fun _finalize() {
  }

  /**
   * Called when the user performs an action in the system global menu (e.g. the Mac OS menu bar).
   */
  open fun _globalMenuAction(id: Any?, meta: Any?) {
  }

  /**
   * Called each idle frame with the time since the last idle frame as argument (in seconds). Equivalent to [godot.Node.Process].
   *
   * If implemented, the method must return a boolean value. `true` ends the main loop, while `false` lets it proceed to the next frame.
   */
  open fun _idle(delta: Double): Boolean {
    throw NotImplementedError("_idle is not implemented for MainLoop")
  }

  /**
   * Called once during initialization.
   */
  open fun _initialize() {
  }

  /**
   * Called whenever an [godot.InputEvent] is received by the main loop.
   */
  open fun _inputEvent(event: InputEvent) {
  }

  /**
   * Deprecated callback, does not do anything. Use [_inputEvent] to parse text input. Will be removed in Godot 4.0.
   */
  open fun _inputText(text: String) {
  }

  /**
   * Called each physics frame with the time since the last physics frame as argument (`delta`, in seconds). Equivalent to [godot.Node.PhysicsProcess].
   *
   * If implemented, the method must return a boolean value. `true` ends the main loop, while `false` lets it proceed to the next frame.
   */
  open fun _iteration(delta: Double): Boolean {
    throw NotImplementedError("_iteration is not implemented for MainLoop")
  }

  /**
   * Should not be called manually, override [_finalize] instead. Will be removed in Godot 4.0.
   */
  open fun finish() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MAINLOOP_FINISH, NIL)
  }

  /**
   * Should not be called manually, override [_idle] instead. Will be removed in Godot 4.0.
   */
  open fun idle(delta: Double): Boolean {
    TransferContext.writeArguments(DOUBLE to delta)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MAINLOOP_IDLE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Should not be called manually, override [_initialize] instead. Will be removed in Godot 4.0.
   */
  open fun init() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MAINLOOP_INIT, NIL)
  }

  /**
   * Should not be called manually, override [_inputEvent] instead. Will be removed in Godot 4.0.
   */
  open fun inputEvent(event: InputEvent) {
    TransferContext.writeArguments(OBJECT to event)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MAINLOOP_INPUT_EVENT, NIL)
  }

  /**
   * Should not be called manually, override [_inputText] instead. Will be removed in Godot 4.0.
   */
  open fun inputText(text: String) {
    TransferContext.writeArguments(STRING to text)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MAINLOOP_INPUT_TEXT, NIL)
  }

  /**
   * Should not be called manually, override [_iteration] instead. Will be removed in Godot 4.0.
   */
  open fun iteration(delta: Double): Boolean {
    TransferContext.writeArguments(DOUBLE to delta)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MAINLOOP_ITERATION, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  companion object {
    /**
     * Notification received from the OS when the app is paused.
     *
     * Specific to the Android platform.
     */
    final const val NOTIFICATION_APP_PAUSED: Long = 1015

    /**
     * Notification received from the OS when the app is resumed.
     *
     * Specific to the Android platform.
     */
    final const val NOTIFICATION_APP_RESUMED: Long = 1014

    /**
     * Notification received from Godot's crash handler when the engine is about to crash.
     *
     * Implemented on desktop platforms if the crash handler is enabled.
     */
    final const val NOTIFICATION_CRASH: Long = 1012

    /**
     * Notification received from the OS when an update of the Input Method Engine occurs (e.g. change of IME cursor position or composition string).
     *
     * Specific to the macOS platform.
     */
    final const val NOTIFICATION_OS_IME_UPDATE: Long = 1013

    /**
     * Notification received from the OS when the application is exceeding its allocated memory.
     *
     * Specific to the iOS platform.
     */
    final const val NOTIFICATION_OS_MEMORY_WARNING: Long = 1009

    /**
     * Notification received when translations may have changed. Can be triggered by the user changing the locale. Can be used to respond to language changes, for example to change the UI strings on the fly. Useful when working with the built-in translation support, like [godot.Object.tr].
     */
    final const val NOTIFICATION_TRANSLATION_CHANGED: Long = 1010

    /**
     * Notification received from the OS when a request for "About" information is sent.
     *
     * Specific to the macOS platform.
     */
    final const val NOTIFICATION_WM_ABOUT: Long = 1011

    /**
     * Notification received from the OS when the game window is focused.
     *
     * Implemented on all platforms.
     */
    final const val NOTIFICATION_WM_FOCUS_IN: Long = 1004

    /**
     * Notification received from the OS when the game window is unfocused.
     *
     * Implemented on all platforms.
     */
    final const val NOTIFICATION_WM_FOCUS_OUT: Long = 1005

    /**
     * Notification received from the OS when a go back request is sent (e.g. pressing the "Back" button on Android).
     *
     * Specific to the Android platform.
     */
    final const val NOTIFICATION_WM_GO_BACK_REQUEST: Long = 1007

    /**
     * Notification received from the OS when the mouse enters the game window.
     *
     * Implemented on desktop and web platforms.
     */
    final const val NOTIFICATION_WM_MOUSE_ENTER: Long = 1002

    /**
     * Notification received from the OS when the mouse leaves the game window.
     *
     * Implemented on desktop and web platforms.
     */
    final const val NOTIFICATION_WM_MOUSE_EXIT: Long = 1003

    /**
     * Notification received from the OS when a quit request is sent (e.g. closing the window with a "Close" button or Alt+F4).
     *
     * Implemented on desktop platforms.
     */
    final const val NOTIFICATION_WM_QUIT_REQUEST: Long = 1006

    /**
     * Notification received from the OS when an unfocus request is sent (e.g. another OS window wants to take the focus).
     *
     * No supported platforms currently send this notification.
     */
    final const val NOTIFICATION_WM_UNFOCUS_REQUEST: Long = 1008
  }
}
