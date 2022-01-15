// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.OS
import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.PoolStringArray
import godot.core.PoolVector2Array
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_STRING_ARRAY
import godot.core.VariantType.POOL_VECTOR2_ARRAY
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Operating System functions.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/677](https://godotengine.org/asset-library/asset/677)
 *
 * Operating System functions. OS wraps the most common functionality to communicate with the host operating system, such as the clipboard, video driver, date and time, timers, environment variables, execution of binaries, command line, etc.
 */
@GodotBaseType
public object OS : Object() {
  /**
   * Application handle:
   *
   * - Windows: `HINSTANCE` of the application
   *
   * - MacOS: `NSApplication*` of the application (not yet implemented)
   *
   * - Android: `JNIEnv*` of the application (not yet implemented)
   */
  public final const val APPLICATION_HANDLE: Long = 0

  /**
   * Friday.
   */
  public final const val DAY_FRIDAY: Long = 5

  /**
   * Monday.
   */
  public final const val DAY_MONDAY: Long = 1

  /**
   * Saturday.
   */
  public final const val DAY_SATURDAY: Long = 6

  /**
   * Sunday.
   */
  public final const val DAY_SUNDAY: Long = 0

  /**
   * Thursday.
   */
  public final const val DAY_THURSDAY: Long = 4

  /**
   * Tuesday.
   */
  public final const val DAY_TUESDAY: Long = 2

  /**
   * Wednesday.
   */
  public final const val DAY_WEDNESDAY: Long = 3

  /**
   * Display handle:
   *
   * - Linux: `X11::Display*` for the display
   */
  public final const val DISPLAY_HANDLE: Long = 1

  /**
   * April.
   */
  public final const val MONTH_APRIL: Long = 4

  /**
   * August.
   */
  public final const val MONTH_AUGUST: Long = 8

  /**
   * December.
   */
  public final const val MONTH_DECEMBER: Long = 12

  /**
   * February.
   */
  public final const val MONTH_FEBRUARY: Long = 2

  /**
   * January.
   */
  public final const val MONTH_JANUARY: Long = 1

  /**
   * July.
   */
  public final const val MONTH_JULY: Long = 7

  /**
   * June.
   */
  public final const val MONTH_JUNE: Long = 6

  /**
   * March.
   */
  public final const val MONTH_MARCH: Long = 3

  /**
   * May.
   */
  public final const val MONTH_MAY: Long = 5

  /**
   * November.
   */
  public final const val MONTH_NOVEMBER: Long = 11

  /**
   * October.
   */
  public final const val MONTH_OCTOBER: Long = 10

  /**
   * September.
   */
  public final const val MONTH_SEPTEMBER: Long = 9

  /**
   * OpenGL Context:
   *
   * - Windows: `HGLRC`
   *
   * - Linux: `X11::GLXContext`
   *
   * - MacOS: `NSOpenGLContext*` (not yet implemented)
   */
  public final const val OPENGL_CONTEXT: Long = 4

  /**
   * Plugged in, battery fully charged.
   */
  public final const val POWERSTATE_CHARGED: Long = 4

  /**
   * Plugged in, battery charging.
   */
  public final const val POWERSTATE_CHARGING: Long = 3

  /**
   * Plugged in, no battery available.
   */
  public final const val POWERSTATE_NO_BATTERY: Long = 2

  /**
   * Unplugged, running on battery.
   */
  public final const val POWERSTATE_ON_BATTERY: Long = 1

  /**
   * Unknown powerstate.
   */
  public final const val POWERSTATE_UNKNOWN: Long = 0

  /**
   * Landscape screen orientation.
   */
  public final const val SCREEN_ORIENTATION_LANDSCAPE: Long = 0

  /**
   * Portrait screen orientation.
   */
  public final const val SCREEN_ORIENTATION_PORTRAIT: Long = 1

  /**
   * Reverse landscape screen orientation.
   */
  public final const val SCREEN_ORIENTATION_REVERSE_LANDSCAPE: Long = 2

  /**
   * Reverse portrait screen orientation.
   */
  public final const val SCREEN_ORIENTATION_REVERSE_PORTRAIT: Long = 3

  /**
   * Uses most suitable orientation based on the hardware sensor.
   */
  public final const val SCREEN_ORIENTATION_SENSOR: Long = 6

  /**
   * Uses landscape or reverse landscape based on the hardware sensor.
   */
  public final const val SCREEN_ORIENTATION_SENSOR_LANDSCAPE: Long = 4

  /**
   * Uses portrait or reverse portrait based on the hardware sensor.
   */
  public final const val SCREEN_ORIENTATION_SENSOR_PORTRAIT: Long = 5

  /**
   * DCIM (Digital Camera Images) directory path.
   */
  public final const val SYSTEM_DIR_DCIM: Long = 1

  /**
   * Desktop directory path.
   */
  public final const val SYSTEM_DIR_DESKTOP: Long = 0

  /**
   * Documents directory path.
   */
  public final const val SYSTEM_DIR_DOCUMENTS: Long = 2

  /**
   * Downloads directory path.
   */
  public final const val SYSTEM_DIR_DOWNLOADS: Long = 3

  /**
   * Movies directory path.
   */
  public final const val SYSTEM_DIR_MOVIES: Long = 4

  /**
   * Music directory path.
   */
  public final const val SYSTEM_DIR_MUSIC: Long = 5

  /**
   * Pictures directory path.
   */
  public final const val SYSTEM_DIR_PICTURES: Long = 6

  /**
   * Ringtones directory path.
   */
  public final const val SYSTEM_DIR_RINGTONES: Long = 7

  /**
   * The GLES2 rendering backend. It uses OpenGL ES 2.0 on mobile devices, OpenGL 2.1 on desktop platforms and WebGL 1.0 on the web.
   */
  public final const val VIDEO_DRIVER_GLES2: Long = 1

  /**
   * The GLES3 rendering backend. It uses OpenGL ES 3.0 on mobile devices, OpenGL 3.3 on desktop platforms and WebGL 2.0 on the web.
   */
  public final const val VIDEO_DRIVER_GLES3: Long = 0

  /**
   * Window handle:
   *
   * - Windows: `HWND` of the main window
   *
   * - Linux: `X11::Window*` of the main window
   *
   * - MacOS: `NSWindow*` of the main window (not yet implemented)
   *
   * - Android: `jObject` the main android activity (not yet implemented)
   */
  public final const val WINDOW_HANDLE: Long = 2

  /**
   * Window view:
   *
   * - Windows: `HDC` of the main window drawing context
   *
   * - MacOS: `NSView*` of the main windows view (not yet implemented)
   */
  public final const val WINDOW_VIEW: Long = 3

  /**
   * The clipboard from the host OS. Might be unavailable on some platforms.
   */
  public var clipboard: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_CLIPBOARD, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_CLIPBOARD, NIL)
    }

  /**
   * The current screen index (starting from 0).
   */
  public var currentScreen: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_CURRENT_SCREEN, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_CURRENT_SCREEN, NIL)
    }

  /**
   * If `true`, the engine filters the time delta measured between each frame, and attempts to compensate for random variation. This will only operate on systems where V-Sync is active.
   */
  public var deltaSmoothing: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_DELTA_SMOOTHING, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_DELTA_SMOOTHING, NIL)
    }

  /**
   * The exit code passed to the OS when the main loop exits. By convention, an exit code of `0` indicates success whereas a non-zero exit code indicates an error. For portability reasons, the exit code should be set between 0 and 125 (inclusive).
   *
   * **Note:** This value will be ignored if using [godot.SceneTree.quit] with an `exit_code` argument passed.
   */
  public var exitCode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_EXIT_CODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_EXIT_CODE, NIL)
    }

  /**
   * If `true`, the engine tries to keep the screen on while the game is running. Useful on mobile.
   */
  public var keepScreenOn: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_KEEP_SCREEN_ON, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_KEEP_SCREEN_ON, NIL)
    }

  /**
   * If `true`, the engine optimizes for low processor usage by only refreshing the screen if needed. Can improve battery consumption on mobile.
   */
  public var lowProcessorUsageMode: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_LOW_PROCESSOR_USAGE_MODE,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_LOW_PROCESSOR_USAGE_MODE,
          NIL)
    }

  /**
   * The amount of sleeping between frames when the low-processor usage mode is enabled (in microseconds). Higher values will result in lower CPU usage.
   */
  public var lowProcessorUsageModeSleepUsec: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS__OS_GET_LOW_PROCESSOR_USAGE_MODE_SLEEP_USEC, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS__OS_SET_LOW_PROCESSOR_USAGE_MODE_SLEEP_USEC, NIL)
    }

  /**
   * The maximum size of the window (without counting window manager decorations). Does not affect fullscreen mode. Set to `(0, 0)` to reset to the system default value.
   */
  public var maxWindowSize: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_MAX_WINDOW_SIZE, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_MAX_WINDOW_SIZE, NIL)
    }

  /**
   * The minimum size of the window in pixels (without counting window manager decorations). Does not affect fullscreen mode. Set to `(0, 0)` to reset to the system's default value.
   *
   * **Note:** By default, the project window has a minimum size of `Vector2(64, 64)`. This prevents issues that can arise when the window is resized to a near-zero size.
   */
  public var minWindowSize: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_MIN_WINDOW_SIZE, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_MIN_WINDOW_SIZE, NIL)
    }

  /**
   * The current screen orientation.
   */
  public var screenOrientation: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_SCREEN_ORIENTATION, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_SCREEN_ORIENTATION, NIL)
    }

  /**
   * The current tablet driver in use.
   */
  public var tabletDriver: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_TABLET_DRIVER, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_TABLET_DRIVER, NIL)
    }

  /**
   * If `true`, vertical synchronization (Vsync) is enabled.
   */
  public var vsyncEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_VSYNC_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_VSYNC_ENABLED, NIL)
    }

  /**
   * If `true` and `vsync_enabled` is true, the operating system's window compositor will be used for vsync when the compositor is enabled and the game is in windowed mode.
   *
   * **Note:** This option is experimental and meant to alleviate stutter experienced by some users. However, some users have experienced a Vsync framerate halving (e.g. from 60 FPS to 30 FPS) when using it.
   *
   * **Note:** This property is only implemented on Windows.
   */
  public var vsyncViaCompositor: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_VSYNC_VIA_COMPOSITOR,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_VSYNC_VIA_COMPOSITOR, NIL)
    }

  /**
   * If `true`, removes the window frame.
   *
   * **Note:** Setting `window_borderless` to `false` disables per-pixel transparency.
   */
  public var windowBorderless: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_WINDOW_BORDERLESS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_WINDOW_BORDERLESS, NIL)
    }

  /**
   * If `true`, the window is fullscreen.
   */
  public var windowFullscreen: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_WINDOW_FULLSCREEN, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_WINDOW_FULLSCREEN, NIL)
    }

  /**
   * If `true`, the window is maximized.
   */
  public var windowMaximized: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_WINDOW_MAXIMIZED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_WINDOW_MAXIMIZED, NIL)
    }

  /**
   * If `true`, the window is minimized.
   */
  public var windowMinimized: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_WINDOW_MINIMIZED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_WINDOW_MINIMIZED, NIL)
    }

  /**
   * If `true`, the window background is transparent and the window frame is removed.
   *
   * Use `get_tree().get_root().set_transparent_background(true)` to disable main viewport background rendering.
   *
   * **Note:** This property has no effect if [godot.ProjectSettings.display/window/perPixelTransparency/allowed] setting is disabled.
   *
   * **Note:** This property is implemented on HTML5, Linux, macOS, Windows, and Android. It can't be changed at runtime for Android. Use [godot.ProjectSettings.display/window/perPixelTransparency/enabled] to set it at startup instead.
   */
  public var windowPerPixelTransparencyEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS__OS_GET_WINDOW_PER_PIXEL_TRANSPARENCY_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS__OS_SET_WINDOW_PER_PIXEL_TRANSPARENCY_ENABLED, NIL)
    }

  /**
   * The window position relative to the screen, the origin is the top left corner, +Y axis goes to the bottom and +X axis goes to the right.
   */
  public var windowPosition: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_WINDOW_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_WINDOW_POSITION, NIL)
    }

  /**
   * If `true`, the window is resizable by the user.
   */
  public var windowResizable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_WINDOW_RESIZABLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_WINDOW_RESIZABLE, NIL)
    }

  /**
   * The size of the window (without counting window manager decorations).
   */
  public var windowSize: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_WINDOW_SIZE, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_WINDOW_SIZE, NIL)
    }

  public override fun __new(): Unit {
    rawPtr = TransferContext.getSingleton(ENGINESINGLETON_OS)
  }

  public override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  @CoreTypeHelper
  public fun maxWindowSize(schedule: Vector2.() -> Unit): Vector2 = maxWindowSize.apply{
      schedule(this)
      maxWindowSize = this
  }


  @CoreTypeHelper
  public fun minWindowSize(schedule: Vector2.() -> Unit): Vector2 = minWindowSize.apply{
      schedule(this)
      minWindowSize = this
  }


  @CoreTypeHelper
  public fun windowPosition(schedule: Vector2.() -> Unit): Vector2 = windowPosition.apply{
      schedule(this)
      windowPosition = this
  }


  @CoreTypeHelper
  public fun windowSize(schedule: Vector2.() -> Unit): Vector2 = windowSize.apply{
      schedule(this)
      windowSize = this
  }


  /**
   * Displays a modal dialog box using the host OS' facilities. Execution is blocked until the dialog is closed.
   */
  public fun alert(text: String, title: String = "Alert!"): Unit {
    TransferContext.writeArguments(STRING to text, STRING to title)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_ALERT, NIL)
  }

  /**
   * Returns `true` if the host OS allows drawing.
   */
  public fun canDraw(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_CAN_DRAW, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the current host platform is using multiple threads.
   */
  public fun canUseThreads(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_CAN_USE_THREADS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Centers the window on the screen if in windowed mode.
   */
  public fun centerWindow(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_CENTER_WINDOW, NIL)
  }

  /**
   * Shuts down system MIDI driver.
   *
   * **Note:** This method is implemented on Linux, macOS and Windows.
   */
  public fun closeMidiInputs(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_CLOSE_MIDI_INPUTS, NIL)
  }

  /**
   * Crashes the engine (or the editor if called within a `tool` script). This should *only* be used for testing the system's crash handler, not for any other purpose. For general error reporting, use (in order of preference) [@GDScript.assert], [@GDScript.pushError] or [alert]. See also [kill].
   */
  public fun crash(message: String): Unit {
    TransferContext.writeArguments(STRING to message)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_CRASH, NIL)
  }

  /**
   * Delays execution of the current thread by `msec` milliseconds. `msec` must be greater than or equal to `0`. Otherwise, [delayMsec] will do nothing and will print an error message.
   *
   * **Note:** [delayMsec] is a *blocking* way to delay code execution. To delay code execution in a non-blocking way, see [godot.SceneTree.createTimer]. Yielding with [godot.SceneTree.createTimer] will delay the execution of code placed below the `yield` without affecting the rest of the project (or editor, for [godot.EditorPlugin]s and [godot.EditorScript]s).
   *
   * **Note:** When [delayMsec] is called on the main thread, it will freeze the project and will prevent it from redrawing and registering input until the delay has passed. When using [delayMsec] as part of an [godot.EditorPlugin] or [godot.EditorScript], it will freeze the editor but won't freeze the project if it is currently running (since the project is an independent child process).
   */
  public fun delayMsec(msec: Long): Unit {
    TransferContext.writeArguments(LONG to msec)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_DELAY_MSEC, NIL)
  }

  /**
   * Delays execution of the current thread by `usec` microseconds. `usec` must be greater than or equal to `0`. Otherwise, [delayUsec] will do nothing and will print an error message.
   *
   * **Note:** [delayUsec] is a *blocking* way to delay code execution. To delay code execution in a non-blocking way, see [godot.SceneTree.createTimer]. Yielding with [godot.SceneTree.createTimer] will delay the execution of code placed below the `yield` without affecting the rest of the project (or editor, for [godot.EditorPlugin]s and [godot.EditorScript]s).
   *
   * **Note:** When [delayUsec] is called on the main thread, it will freeze the project and will prevent it from redrawing and registering input until the delay has passed. When using [delayUsec] as part of an [godot.EditorPlugin] or [godot.EditorScript], it will freeze the editor but won't freeze the project if it is currently running (since the project is an independent child process).
   */
  public fun delayUsec(usec: Long): Unit {
    TransferContext.writeArguments(LONG to usec)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_DELAY_USEC, NIL)
  }

  /**
   * Dumps the memory allocation ringlist to a file (only works in debug).
   *
   * Entry format per line: "Address - Size - Description".
   */
  public fun dumpMemoryToFile(`file`: String): Unit {
    TransferContext.writeArguments(STRING to file)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_DUMP_MEMORY_TO_FILE, NIL)
  }

  /**
   * Dumps all used resources to file (only works in debug).
   *
   * Entry format per line: "Resource Type : Resource Location".
   *
   * At the end of the file is a statistic of all used Resource Types.
   */
  public fun dumpResourcesToFile(`file`: String): Unit {
    TransferContext.writeArguments(STRING to file)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_DUMP_RESOURCES_TO_FILE, NIL)
  }

  /**
   * Execute the file at the given path with the arguments passed as an array of strings. Platform path resolution will take place. The resolved file must exist and be executable.
   *
   * The arguments are used in the given order and separated by a space, so `OS.execute("ping", ["-w", "3", "godotengine.org"], false)` will resolve to `ping -w 3 godotengine.org` in the system's shell.
   *
   * This method has slightly different behavior based on whether the `blocking` mode is enabled.
   *
   * If `blocking` is `true`, the Godot thread will pause its execution while waiting for the process to terminate. The shell output of the process will be written to the `output` array as a single string. When the process terminates, the Godot thread will resume execution.
   *
   * If `blocking` is `false`, the Godot thread will continue while the new process runs. It is not possible to retrieve the shell output in non-blocking mode, so `output` will be empty.
   *
   * On Windows, if `open_console` is `true` and process is console app, new terminal window will be opened, it's ignored on other platforms.
   *
   * The return value also depends on the blocking mode. When blocking, the method will return an exit code of the process. When non-blocking, the method returns a process ID, which you can use to monitor the process (and potentially terminate it with [kill]). If the process forking (non-blocking) or opening (blocking) fails, the method will return `-1` or another exit code.
   *
   * Example of blocking mode and retrieving the shell output:
   *
   * ```
   * 				var output = []
   * 				var exit_code = OS.execute("ls", ["-l", "/tmp"], true, output)
   * 				```
   *
   * Example of non-blocking mode, running another instance of the project and storing its process ID:
   *
   * ```
   * 				var pid = OS.execute(OS.get_executable_path(), [], false)
   * 				```
   *
   * If you wish to access a shell built-in or perform a composite command, a platform-specific shell can be invoked. For example:
   *
   * ```
   * 				OS.execute("CMD.exe", ["/C", "cd %TEMP% && dir"], true, output)
   * 				```
   *
   * **Note:** This method is implemented on Android, iOS, Linux, macOS and Windows.
   *
   * **Note:** To execute a Windows command interpreter built-in command, specify `cmd.exe` in `path`, `/c` as the first argument, and the desired command as the second argument.
   *
   * **Note:** To execute a PowerShell built-in command, specify `powershell.exe` in `path`, `-Command` as the first argument, and the desired command as the second argument.
   *
   * **Note:** To execute a Unix shell built-in command, specify shell executable name in `path`, `-c` as the first argument, and the desired command as the second argument.
   */
  public fun execute(
    path: String,
    arguments: PoolStringArray,
    blocking: Boolean = true,
    output: VariantArray<Any?> = VariantArray(),
    readStderr: Boolean = false,
    openConsole: Boolean = false
  ): Long {
    TransferContext.writeArguments(STRING to path, POOL_STRING_ARRAY to arguments, BOOL to blocking,
        ARRAY to output, BOOL to readStderr, BOOL to openConsole)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_EXECUTE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the scancode of the given string (e.g. "Escape").
   */
  public fun findScancodeFromString(string: String): Long {
    TransferContext.writeArguments(STRING to string)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_FIND_SCANCODE_FROM_STRING, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the total number of available audio drivers.
   */
  public fun getAudioDriverCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_AUDIO_DRIVER_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the audio driver name for the given index.
   */
  public fun getAudioDriverName(driver: Long): String {
    TransferContext.writeArguments(LONG to driver)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_AUDIO_DRIVER_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the *global* cache data directory according to the operating system's standards. On desktop platforms, this path can be overridden by setting the `XDG_CACHE_HOME` environment variable before starting the project. See [godot.File paths in Godot projects]($DOCS_URL/tutorials/io/data_paths.html) in the documentation for more information. See also [getConfigDir] and [getDataDir].
   *
   * Not to be confused with [getUserDataDir], which returns the *project-specific* user data path.
   */
  public fun getCacheDir(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_CACHE_DIR, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the command-line arguments passed to the engine.
   *
   * Command-line arguments can be written in any form, including both `--key value` and `--key=value` forms so they can be properly parsed, as long as custom command-line arguments do not conflict with engine arguments.
   *
   * You can also incorporate environment variables using the [getEnvironment] method.
   *
   * You can set [godot.ProjectSettings.editor/mainRunArgs] to define command-line arguments to be passed by the editor when running the project.
   *
   * Here's a minimal example on how to parse command-line arguments into a dictionary using the `--key=value` form for arguments:
   *
   * ```
   * 				var arguments = {}
   * 				for argument in OS.get_cmdline_args():
   * 				    if argument.find("=") > -1:
   * 				        var key_value = argument.split("=")
   * 				        arguments[key_value[0].lstrip("--")] = key_value[1]
   * 				```
   */
  public fun getCmdlineArgs(): PoolStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_CMDLINE_ARGS,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * Returns the *global* user configuration directory according to the operating system's standards. On desktop platforms, this path can be overridden by setting the `XDG_CONFIG_HOME` environment variable before starting the project. See [godot.File paths in Godot projects]($DOCS_URL/tutorials/io/data_paths.html) in the documentation for more information. See also [getCacheDir] and [getDataDir].
   *
   * Not to be confused with [getUserDataDir], which returns the *project-specific* user data path.
   */
  public fun getConfigDir(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_CONFIG_DIR, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns an array of MIDI device names.
   *
   * The returned array will be empty if the system MIDI driver has not previously been initialised with [openMidiInputs].
   *
   * **Note:** This method is implemented on Linux, macOS and Windows.
   */
  public fun getConnectedMidiInputs(): PoolStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_CONNECTED_MIDI_INPUTS,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * Returns the currently used video driver, using one of the values from [enum VideoDriver].
   */
  public fun getCurrentVideoDriver(): OS.VideoDriver {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_CURRENT_VIDEO_DRIVER, LONG)
    return OS.VideoDriver.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the *global* user data directory according to the operating system's standards. On desktop platforms, this path can be overridden by setting the `XDG_DATA_HOME` environment variable before starting the project. See [godot.File paths in Godot projects]($DOCS_URL/tutorials/io/data_paths.html) in the documentation for more information. See also [getCacheDir] and [getConfigDir].
   *
   * Not to be confused with [getUserDataDir], which returns the *project-specific* user data path.
   */
  public fun getDataDir(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_DATA_DIR, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Deprecated, use [godot.Time.getDateDictFromSystem] instead.
   *
   * Returns current date as a dictionary of keys: `year`, `month`, `day`, `weekday`, `dst` (Daylight Savings Time).
   */
  public fun getDate(utc: Boolean = false): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(BOOL to utc)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_DATE, DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  /**
   * Deprecated, use [godot.Time.getDatetimeDictFromSystem] instead.
   *
   * Returns current datetime as a dictionary of keys: `year`, `month`, `day`, `weekday`, `dst` (Daylight Savings Time), `hour`, `minute`, `second`.
   */
  public fun getDatetime(utc: Boolean = false): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(BOOL to utc)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_DATETIME, DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  /**
   * Deprecated, use [godot.Time.getDatetimeDictFromUnixTime] instead.
   *
   * Gets a dictionary of time values corresponding to the given UNIX epoch time (in seconds).
   *
   * The returned Dictionary's values will be the same as [getDatetime], with the exception of Daylight Savings Time as it cannot be determined from the epoch.
   */
  public fun getDatetimeFromUnixTime(unixTimeVal: Long): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(LONG to unixTimeVal)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_DATETIME_FROM_UNIX_TIME,
        DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  /**
   * Returns the total amount of dynamic memory used (only works in debug).
   */
  public fun getDynamicMemoryUsage(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_DYNAMIC_MEMORY_USAGE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the value of an environment variable. Returns an empty string if the environment variable doesn't exist.
   *
   * **Note:** Double-check the casing of `variable`. Environment variable names are case-sensitive on all platforms except Windows.
   */
  public fun getEnvironment(variable: String): String {
    TransferContext.writeArguments(STRING to variable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_ENVIRONMENT, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the path to the current engine executable.
   */
  public fun getExecutablePath(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_EXECUTABLE_PATH, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * With this function, you can get the list of dangerous permissions that have been granted to the Android application.
   *
   * **Note:** This method is implemented on Android.
   */
  public fun getGrantedPermissions(): PoolStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_GRANTED_PERMISSIONS,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * Returns the IME cursor position (the currently-edited portion of the string) relative to the characters in the composition string.
   *
   * [godot.MainLoop.NOTIFICATION_OS_IME_UPDATE] is sent to the application to notify it of changes to the IME cursor position.
   *
   * **Note:** This method is implemented on macOS.
   */
  public fun getImeSelection(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_IME_SELECTION, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the IME intermediate composition string.
   *
   * [godot.MainLoop.NOTIFICATION_OS_IME_UPDATE] is sent to the application to notify it of changes to the IME composition string.
   *
   * **Note:** This method is implemented on macOS.
   */
  public fun getImeText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_IME_TEXT, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the current latin keyboard variant as a String.
   *
   * Possible return values are: `"QWERTY"`, `"AZERTY"`, `"QZERTY"`, `"DVORAK"`, `"NEO"`, `"COLEMAK"` or `"ERROR"`.
   *
   * **Note:** This method is implemented on Linux, macOS and Windows. Returns `"QWERTY"` on unsupported platforms.
   */
  public fun getLatinKeyboardVariant(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_LATIN_KEYBOARD_VARIANT,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the host OS locale as a string of the form `language_Script_COUNTRY_VARIANT@extra`. If you want only the language code and not the fully specified locale from the OS, you can use [getLocaleLanguage].
   *
   * `language` - 2 or 3-letter [language code](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes), in lower case.
   *
   * `Script` - optional, 4-letter [script code](https://en.wikipedia.org/wiki/ISO_15924), in title case.
   *
   * `COUNTRY` - optional, 2 or 3-letter [country code](https://en.wikipedia.org/wiki/ISO_3166-1), in upper case.
   *
   * `VARIANT` - optional, language variant, region and sort order. Variant can have any number of underscored keywords.
   *
   * `extra` - optional, semicolon separated list of additional key words. Currency, calendar, sort order and numbering system information.
   */
  public fun getLocale(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_LOCALE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the host OS locale's 2 or 3-letter [language code](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) as a string which should be consistent on all platforms. This is equivalent to extracting the `language` part of the [getLocale] string.
   *
   * This can be used to narrow down fully specified locale strings to only the "common" language code, when you don't need the additional information about country code or variants. For example, for a French Canadian user with `fr_CA` locale, this would return `fr`.
   */
  public fun getLocaleLanguage(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_LOCALE_LANGUAGE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the ID of the main thread. See [getThreadCallerId].
   *
   * **Note:** Thread IDs are not deterministic and may be reused across application restarts.
   */
  public fun getMainThreadId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_MAIN_THREAD_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the model name of the current device.
   *
   * **Note:** This method is implemented on Android and iOS. Returns `"GenericDevice"` on unsupported platforms.
   */
  public fun getModelName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_MODEL_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the name of the host OS. Possible values are: `"Android"`, `"iOS"`, `"HTML5"`, `"OSX"`, `"Server"`, `"Windows"`, `"UWP"`, `"X11"`.
   */
  public fun getName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns internal structure pointers for use in GDNative plugins.
   *
   * **Note:** This method is implemented on Linux and Windows (other OSs will soon be supported).
   */
  public fun getNativeHandle(handleType: Long): Long {
    TransferContext.writeArguments(LONG to handleType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_NATIVE_HANDLE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the amount of battery left in the device as a percentage. Returns `-1` if power state is unknown.
   *
   * **Note:** This method is implemented on Linux, macOS and Windows.
   */
  public fun getPowerPercentLeft(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_POWER_PERCENT_LEFT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns an estimate of the time left in seconds before the device runs out of battery. Returns `-1` if power state is unknown.
   *
   * **Note:** This method is implemented on Linux, macOS and Windows.
   */
  public fun getPowerSecondsLeft(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_POWER_SECONDS_LEFT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the current state of the device regarding battery and power. See [enum PowerState] constants.
   *
   * **Note:** This method is implemented on Linux, macOS and Windows.
   */
  public fun getPowerState(): OS.PowerState {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_POWER_STATE, LONG)
    return OS.PowerState.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the project's process ID.
   *
   * **Note:** This method is implemented on Android, iOS, Linux, macOS and Windows.
   */
  public fun getProcessId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_PROCESS_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the number of threads available on the host machine.
   */
  public fun getProcessorCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_PROCESSOR_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the window size including decorations like window borders.
   */
  public fun getRealWindowSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_REAL_WINDOW_SIZE, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the given scancode as a string (e.g. Return values: `"Escape"`, `"Shift+Escape"`).
   *
   * See also [godot.InputEventKey.scancode] and [godot.InputEventKey.getScancodeWithModifiers].
   */
  public fun getScancodeString(code: Long): String {
    TransferContext.writeArguments(LONG to code)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_SCANCODE_STRING, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the number of displays attached to the host machine.
   */
  public fun getScreenCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_SCREEN_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the dots per inch density of the specified screen. If `screen` is `-1` (the default value), the current screen will be used.
   *
   * **Note:** On macOS, returned value is inaccurate if fractional display scaling mode is used.
   *
   * **Note:** On Android devices, the actual screen densities are grouped into six generalized densities:
   *
   * ```
   * 				   ldpi - 120 dpi
   * 				   mdpi - 160 dpi
   * 				   hdpi - 240 dpi
   * 				  xhdpi - 320 dpi
   * 				 xxhdpi - 480 dpi
   * 				xxxhdpi - 640 dpi
   * 				```
   *
   * **Note:** This method is implemented on Android, Linux, macOS and Windows. Returns `72` on unsupported platforms.
   */
  public fun getScreenDpi(screen: Long = -1): Long {
    TransferContext.writeArguments(LONG to screen)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_SCREEN_DPI, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Return the greatest scale factor of all screens.
   *
   * **Note:** On macOS returned value is `2.0` if there is at least one hiDPI (Retina) screen in the system, and `1.0` in all other cases.
   *
   * **Note:** This method is implemented on macOS.
   */
  public fun getScreenMaxScale(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_SCREEN_MAX_SCALE, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the position of the specified screen by index. If `screen` is `-1` (the default value), the current screen will be used.
   */
  public fun getScreenPosition(screen: Long = -1): Vector2 {
    TransferContext.writeArguments(LONG to screen)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_SCREEN_POSITION, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Return the scale factor of the specified screen by index. If `screen` is `-1` (the default value), the current screen will be used.
   *
   * **Note:** On macOS returned value is `2.0` for hiDPI (Retina) screen, and `1.0` for all other cases.
   *
   * **Note:** This method is implemented on macOS.
   */
  public fun getScreenScale(screen: Long = -1): Double {
    TransferContext.writeArguments(LONG to screen)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_SCREEN_SCALE, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the dimensions in pixels of the specified screen. If `screen` is `-1` (the default value), the current screen will be used.
   */
  public fun getScreenSize(screen: Long = -1): Vector2 {
    TransferContext.writeArguments(LONG to screen)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_SCREEN_SIZE, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the amount of time in milliseconds it took for the boot logo to appear.
   */
  public fun getSplashTickMsec(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_SPLASH_TICK_MSEC, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the maximum amount of static memory used (only works in debug).
   */
  public fun getStaticMemoryPeakUsage(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_STATIC_MEMORY_PEAK_USAGE,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the amount of static memory being used by the program in bytes (only works in debug).
   */
  public fun getStaticMemoryUsage(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_STATIC_MEMORY_USAGE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the actual path to commonly used folders across different platforms. Available locations are specified in [enum SystemDir].
   *
   * **Note:** This method is implemented on Android, Linux, macOS and Windows.
   *
   * **Note:** Shared storage is implemented on Android and allows to differentiate between app specific and shared directories. Shared directories have additional restrictions on Android.
   */
  public fun getSystemDir(dir: Long, sharedStorage: Boolean = true): String {
    TransferContext.writeArguments(LONG to dir, BOOL to sharedStorage)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_SYSTEM_DIR, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the epoch time of the operating system in milliseconds.
   */
  public fun getSystemTimeMsecs(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_SYSTEM_TIME_MSECS, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the epoch time of the operating system in seconds.
   */
  public fun getSystemTimeSecs(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_SYSTEM_TIME_SECS, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the total number of available tablet drivers.
   *
   * **Note:** This method is implemented on Windows.
   */
  public fun getTabletDriverCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_TABLET_DRIVER_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the tablet driver name for the given index.
   *
   * **Note:** This method is implemented on Windows.
   */
  public fun getTabletDriverName(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_TABLET_DRIVER_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the ID of the current thread. This can be used in logs to ease debugging of multi-threaded applications.
   *
   * **Note:** Thread IDs are not deterministic and may be reused across application restarts.
   */
  public fun getThreadCallerId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_THREAD_CALLER_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Deprecated, use [godot.Time.getTicksMsec] instead.
   *
   * Returns the amount of time passed in milliseconds since the engine started.
   */
  public fun getTicksMsec(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_TICKS_MSEC, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Deprecated, use [godot.Time.getTicksUsec] instead.
   *
   * Returns the amount of time passed in microseconds since the engine started.
   */
  public fun getTicksUsec(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_TICKS_USEC, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Deprecated, use [godot.Time.getTimeDictFromSystem] instead.
   *
   * Returns current time as a dictionary of keys: hour, minute, second.
   */
  public fun getTime(utc: Boolean = false): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(BOOL to utc)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_TIME, DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  /**
   * Returns the current time zone as a dictionary with the keys: bias and name.
   */
  public fun getTimeZoneInfo(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_TIME_ZONE_INFO, DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  /**
   * Returns a string that is unique to the device.
   *
   * **Note:** This string may change without notice if the user reinstalls/upgrades their operating system or changes their hardware. This means it should generally not be used to encrypt persistent data as the data saved before an unexpected ID change would become inaccessible. The returned string may also be falsified using external programs, so do not rely on the string returned by [getUniqueId] for security purposes.
   *
   * **Note:** Returns an empty string on HTML5 and UWP, as this method isn't implemented on those platforms yet.
   */
  public fun getUniqueId(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_UNIQUE_ID, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the current UNIX epoch timestamp in seconds.
   *
   * **Important:** This is the system clock that the user can manually set. **Never use** this method for precise time calculation since its results are also subject to automatic adjustments by the operating system. **Always use** [getTicksUsec] or [getTicksMsec] for precise time calculation instead, since they are guaranteed to be monotonic (i.e. never decrease).
   */
  public fun getUnixTime(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_UNIX_TIME, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Gets an epoch time value from a dictionary of time values.
   *
   * `datetime` must be populated with the following keys: `year`, `month`, `day`, `hour`, `minute`, `second`.
   *
   * If the dictionary is empty `0` is returned. If some keys are omitted, they default to the equivalent values for the UNIX epoch timestamp 0 (1970-01-01 at 00:00:00 UTC).
   *
   * You can pass the output from [getDatetimeFromUnixTime] directly into this function. Daylight Savings Time (`dst`), if present, is ignored.
   */
  public fun getUnixTimeFromDatetime(datetime: Dictionary<Any?, Any?>): Long {
    TransferContext.writeArguments(DICTIONARY to datetime)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_UNIX_TIME_FROM_DATETIME,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the absolute directory path where user data is written (`user://`).
   *
   * On Linux, this is `~/.local/share/godot/app_userdata/[project_name]`, or `~/.local/share/[custom_name]` if `use_custom_user_dir` is set.
   *
   * On macOS, this is `~/Library/Application Support/Godot/app_userdata/[project_name]`, or `~/Library/Application Support/[custom_name]` if `use_custom_user_dir` is set.
   *
   * On Windows, this is `%APPDATA%\Godot\app_userdata\[project_name]`, or `%APPDATA%\[custom_name]` if `use_custom_user_dir` is set. `%APPDATA%` expands to `%USERPROFILE%\AppData\Roaming`.
   *
   * If the project name is empty, `user://` falls back to `res://`.
   *
   * Not to be confused with [getDataDir], which returns the *global* (non-project-specific) user data directory.
   */
  public fun getUserDataDir(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_USER_DATA_DIR, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the number of video drivers supported on the current platform.
   */
  public fun getVideoDriverCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_VIDEO_DRIVER_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the name of the video driver matching the given `driver` index. This index is a value from [enum VideoDriver], and you can use [getCurrentVideoDriver] to get the current backend's index.
   */
  public fun getVideoDriverName(driver: Long): String {
    TransferContext.writeArguments(LONG to driver)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_VIDEO_DRIVER_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the on-screen keyboard's height in pixels. Returns 0 if there is no keyboard or if it is currently hidden.
   */
  public fun getVirtualKeyboardHeight(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_VIRTUAL_KEYBOARD_HEIGHT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns unobscured area of the window where interactive controls should be rendered.
   */
  public fun getWindowSafeArea(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_WINDOW_SAFE_AREA, RECT2)
    return TransferContext.readReturnValue(RECT2, false) as Rect2
  }

  /**
   * Add a new item with text "label" to global menu. Use "_dock" menu to add item to the macOS dock icon menu.
   *
   * **Note:** This method is implemented on macOS.
   */
  public fun globalMenuAddItem(
    menu: String,
    label: String,
    id: Any?,
    meta: Any?
  ): Unit {
    TransferContext.writeArguments(STRING to menu, STRING to label, ANY to id, ANY to meta)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GLOBAL_MENU_ADD_ITEM, NIL)
  }

  /**
   * Add a separator between items. Separators also occupy an index.
   *
   * **Note:** This method is implemented on macOS.
   */
  public fun globalMenuAddSeparator(menu: String): Unit {
    TransferContext.writeArguments(STRING to menu)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GLOBAL_MENU_ADD_SEPARATOR, NIL)
  }

  /**
   * Clear the global menu, in effect removing all items.
   *
   * **Note:** This method is implemented on macOS.
   */
  public fun globalMenuClear(menu: String): Unit {
    TransferContext.writeArguments(STRING to menu)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GLOBAL_MENU_CLEAR, NIL)
  }

  /**
   * Removes the item at index "idx" from the global menu. Note that the indexes of items after the removed item are going to be shifted by one.
   *
   * **Note:** This method is implemented on macOS.
   */
  public fun globalMenuRemoveItem(menu: String, idx: Long): Unit {
    TransferContext.writeArguments(STRING to menu, LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GLOBAL_MENU_REMOVE_ITEM, NIL)
  }

  /**
   * Returns `true` if the environment variable with the name `variable` exists.
   *
   * **Note:** Double-check the casing of `variable`. Environment variable names are case-sensitive on all platforms except Windows.
   */
  public fun hasEnvironment(variable: String): Boolean {
    TransferContext.writeArguments(STRING to variable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_HAS_ENVIRONMENT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the feature for the given feature tag is supported in the currently running instance, depending on the platform, build etc. Can be used to check whether you're currently running a debug build, on a certain platform or arch, etc. Refer to the [godot.Feature Tags]($DOCS_URL/tutorials/export/feature_tags.html) documentation for more details.
   *
   * **Note:** Tag names are case-sensitive.
   */
  public fun hasFeature(tagName: String): Boolean {
    TransferContext.writeArguments(STRING to tagName)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_HAS_FEATURE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the device has a touchscreen or emulates one.
   */
  public fun hasTouchscreenUiHint(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_HAS_TOUCHSCREEN_UI_HINT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the platform has a virtual keyboard, `false` otherwise.
   */
  public fun hasVirtualKeyboard(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_HAS_VIRTUAL_KEYBOARD, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Hides the virtual keyboard if it is shown, does nothing otherwise.
   */
  public fun hideVirtualKeyboard(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_HIDE_VIRTUAL_KEYBOARD, NIL)
  }

  /**
   * Returns `true` if the Godot binary used to run the project is a *debug* export template, or when running in the editor.
   *
   * Returns `false` if the Godot binary used to run the project is a *release* export template.
   *
   * To check whether the Godot binary used to run the project is an export template (debug or release), use `OS.has_feature("standalone")` instead.
   */
  public fun isDebugBuild(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_IS_DEBUG_BUILD, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the **OK** button should appear on the left and **Cancel** on the right.
   */
  public fun isOkLeftAndCancelRight(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_IS_OK_LEFT_AND_CANCEL_RIGHT,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the input scancode corresponds to a Unicode character.
   */
  public fun isScancodeUnicode(code: Long): Boolean {
    TransferContext.writeArguments(LONG to code)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_IS_SCANCODE_UNICODE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the engine was executed with `-v` (verbose stdout).
   */
  public fun isStdoutVerbose(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_IS_STDOUT_VERBOSE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * If `true`, the `user://` file system is persistent, so that its state is the same after a player quits and starts the game again. Relevant to the HTML5 platform, where this persistence may be unavailable.
   */
  public fun isUserfsPersistent(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_IS_USERFS_PERSISTENT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the window should always be on top of other windows.
   */
  public fun isWindowAlwaysOnTop(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_IS_WINDOW_ALWAYS_ON_TOP, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the window is currently focused.
   *
   * **Note:** Only implemented on desktop platforms. On other platforms, it will always return `true`.
   */
  public fun isWindowFocused(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_IS_WINDOW_FOCUSED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns active keyboard layout index.
   *
   * **Note:** This method is implemented on Linux, macOS and Windows.
   */
  public fun keyboardGetCurrentLayout(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_KEYBOARD_GET_CURRENT_LAYOUT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the number of keyboard layouts.
   *
   * **Note:** This method is implemented on Linux, macOS and Windows.
   */
  public fun keyboardGetLayoutCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_KEYBOARD_GET_LAYOUT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the ISO-639/BCP-47 language code of the keyboard layout at position `index`.
   *
   * **Note:** This method is implemented on Linux, macOS and Windows.
   */
  public fun keyboardGetLayoutLanguage(index: Long): String {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_KEYBOARD_GET_LAYOUT_LANGUAGE,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the localized name of the keyboard layout at position `index`.
   *
   * **Note:** This method is implemented on Linux, macOS and Windows.
   */
  public fun keyboardGetLayoutName(index: Long): String {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_KEYBOARD_GET_LAYOUT_NAME,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Sets active keyboard layout.
   *
   * **Note:** This method is implemented on Linux, macOS and Windows.
   */
  public fun keyboardSetCurrentLayout(index: Long): Unit {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_KEYBOARD_SET_CURRENT_LAYOUT,
        NIL)
  }

  /**
   * Kill (terminate) the process identified by the given process ID (`pid`), e.g. the one returned by [execute] in non-blocking mode. See also [crash].
   *
   * **Note:** This method can also be used to kill processes that were not spawned by the game.
   *
   * **Note:** This method is implemented on Android, iOS, Linux, macOS and Windows.
   */
  public fun kill(pid: Long): GodotError {
    TransferContext.writeArguments(LONG to pid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_KILL, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Moves the window to the front.
   *
   * **Note:** This method is implemented on Linux, macOS and Windows.
   */
  public fun moveWindowToForeground(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_MOVE_WINDOW_TO_FOREGROUND, NIL)
  }

  /**
   * Returns `true` if native video is playing.
   *
   * **Note:** This method is only implemented on iOS.
   */
  public fun nativeVideoIsPlaying(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_NATIVE_VIDEO_IS_PLAYING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Pauses native video playback.
   *
   * **Note:** This method is only implemented on iOS.
   */
  public fun nativeVideoPause(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_NATIVE_VIDEO_PAUSE, NIL)
  }

  /**
   * Plays native video from the specified path, at the given volume and with audio and subtitle tracks.
   *
   * **Note:** This method is only implemented on iOS.
   */
  public fun nativeVideoPlay(
    path: String,
    volume: Double,
    audioTrack: String,
    subtitleTrack: String
  ): GodotError {
    TransferContext.writeArguments(STRING to path, DOUBLE to volume, STRING to audioTrack, STRING to
        subtitleTrack)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_NATIVE_VIDEO_PLAY, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Stops native video playback.
   *
   * **Note:** This method is implemented on iOS.
   */
  public fun nativeVideoStop(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_NATIVE_VIDEO_STOP, NIL)
  }

  /**
   * Resumes native video playback.
   *
   * **Note:** This method is implemented on iOS.
   */
  public fun nativeVideoUnpause(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_NATIVE_VIDEO_UNPAUSE, NIL)
  }

  /**
   * Initialises the singleton for the system MIDI driver.
   *
   * **Note:** This method is implemented on Linux, macOS and Windows.
   */
  public fun openMidiInputs(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_OPEN_MIDI_INPUTS, NIL)
  }

  /**
   * Shows all resources in the game. Optionally, the list can be written to a file by specifying a file path in `tofile`.
   */
  public fun printAllResources(tofile: String = ""): Unit {
    TransferContext.writeArguments(STRING to tofile)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_PRINT_ALL_RESOURCES, NIL)
  }

  /**
   * Shows the list of loaded textures sorted by size in memory.
   */
  public fun printAllTexturesBySize(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_PRINT_ALL_TEXTURES_BY_SIZE, NIL)
  }

  /**
   * Shows the number of resources loaded by the game of the given types.
   */
  public fun printResourcesByType(types: PoolStringArray): Unit {
    TransferContext.writeArguments(POOL_STRING_ARRAY to types)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_PRINT_RESOURCES_BY_TYPE, NIL)
  }

  /**
   * Shows all resources currently used by the game.
   */
  public fun printResourcesInUse(short: Boolean = false): Unit {
    TransferContext.writeArguments(BOOL to short)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_PRINT_RESOURCES_IN_USE, NIL)
  }

  /**
   * Request the user attention to the window. It'll flash the taskbar button on Windows or bounce the dock icon on OSX.
   *
   * **Note:** This method is implemented on Linux, macOS and Windows.
   */
  public fun requestAttention(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_REQUEST_ATTENTION, NIL)
  }

  /**
   * At the moment this function is only used by `AudioDriverOpenSL` to request permission for `RECORD_AUDIO` on Android.
   */
  public fun requestPermission(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_REQUEST_PERMISSION, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * With this function, you can request dangerous permissions since normal permissions are automatically granted at install time in Android applications.
   *
   * **Note:** This method is implemented on Android.
   */
  public fun requestPermissions(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_REQUEST_PERMISSIONS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the value of the environment variable `variable` to `value`. The environment variable will be set for the Godot process and any process executed with [execute] after running [setEnvironment]. The environment variable will *not* persist to processes run after the Godot process was terminated.
   *
   * **Note:** Double-check the casing of `variable`. Environment variable names are case-sensitive on all platforms except Windows.
   */
  public fun setEnvironment(variable: String, `value`: String): Boolean {
    TransferContext.writeArguments(STRING to variable, STRING to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_ENVIRONMENT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the game's icon using an [godot.Image] resource.
   *
   * The same image is used for window caption, taskbar/dock and window selection dialog. Image is scaled as needed.
   *
   * **Note:** This method is implemented on HTML5, Linux, macOS and Windows.
   */
  public fun setIcon(icon: Image): Unit {
    TransferContext.writeArguments(OBJECT to icon)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_ICON, NIL)
  }

  /**
   * Sets whether IME input mode should be enabled.
   *
   * If active IME handles key events before the application and creates an composition string and suggestion list.
   *
   * Application can retrieve the composition status by using [getImeSelection] and [getImeText] functions.
   *
   * Completed composition string is committed when input is finished.
   *
   * **Note:** This method is implemented on Linux, macOS and Windows.
   */
  public fun setImeActive(active: Boolean): Unit {
    TransferContext.writeArguments(BOOL to active)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_IME_ACTIVE, NIL)
  }

  /**
   * Sets position of IME suggestion list popup (in window coordinates).
   *
   * **Note:** This method is implemented on Linux, macOS and Windows.
   */
  public fun setImePosition(position: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_IME_POSITION, NIL)
  }

  /**
   * Sets the game's icon using a multi-size platform-specific icon file (`*.ico` on Windows and `*.icns` on macOS).
   *
   * Appropriate size sub-icons are used for window caption, taskbar/dock and window selection dialog.
   *
   * **Note:** This method is implemented on macOS and Windows.
   */
  public fun setNativeIcon(filename: String): Unit {
    TransferContext.writeArguments(STRING to filename)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_NATIVE_ICON, NIL)
  }

  /**
   * Sets the name of the current thread.
   */
  public fun setThreadName(name: String): GodotError {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_THREAD_NAME, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Enables backup saves if `enabled` is `true`.
   */
  public fun setUseFileAccessSaveAndSwap(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS__OS_SET_USE_FILE_ACCESS_SAVE_AND_SWAP, NIL)
  }

  /**
   * Sets whether the window should always be on top.
   *
   * **Note:** This method is implemented on Linux, macOS and Windows.
   */
  public fun setWindowAlwaysOnTop(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_WINDOW_ALWAYS_ON_TOP, NIL)
  }

  /**
   * Sets a polygonal region of the window which accepts mouse events. Mouse events outside the region will be passed through.
   *
   * Passing an empty array will disable passthrough support (all mouse events will be intercepted by the window, which is the default behavior).
   *
   * ```
   * 				# Set region, using Path2D node.
   * 				OS.set_window_mouse_passthrough($Path2D.curve.get_baked_points())
   *
   * 				# Set region, using Polygon2D node.
   * 				OS.set_window_mouse_passthrough($Polygon2D.polygon)
   *
   * 				# Reset region to default.
   * 				OS.set_window_mouse_passthrough([])
   * 				```
   *
   * **Note:** On Windows, the portion of a window that lies outside the region is not drawn, while on Linux and macOS it is.
   *
   * **Note:** This method is implemented on Linux, macOS and Windows.
   */
  public fun setWindowMousePassthrough(region: PoolVector2Array): Unit {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to region)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_WINDOW_MOUSE_PASSTHROUGH,
        NIL)
  }

  /**
   * Sets the window title to the specified string.
   *
   * **Note:** This should be used sporadically. Don't set this every frame, as that will negatively affect performance on some window managers.
   *
   * **Note:** This method is implemented on HTML5, Linux, macOS and Windows.
   */
  public fun setWindowTitle(title: String): Unit {
    TransferContext.writeArguments(STRING to title)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_WINDOW_TITLE, NIL)
  }

  /**
   * Requests the OS to open a resource with the most appropriate program. For example:
   *
   * - `OS.shell_open("C:\\Users\name\Downloads")` on Windows opens the file explorer at the user's Downloads folder.
   *
   * - `OS.shell_open("https://godotengine.org")` opens the default web browser on the official Godot website.
   *
   * - `OS.shell_open("mailto:example@example.com")` opens the default email client with the "To" field set to `example@example.com`. See [godot.Customizing `mailto:` Links](https://blog.escapecreative.com/customizing-mailto-links/) for a list of fields that can be added.
   *
   * Use [godot.ProjectSettings.globalizePath] to convert a `res://` or `user://` path into a system path for use with this method.
   *
   * **Note:** This method is implemented on Android, iOS, HTML5, Linux, macOS and Windows.
   */
  public fun shellOpen(uri: String): GodotError {
    TransferContext.writeArguments(STRING to uri)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SHELL_OPEN, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Shows the virtual keyboard if the platform has one.
   *
   * The `existing_text` parameter is useful for implementing your own [godot.LineEdit] or [godot.TextEdit], as it tells the virtual keyboard what text has already been typed (the virtual keyboard uses it for auto-correct and predictions).
   *
   * The `multiline` parameter needs to be set to `true` to be able to enter multiple lines of text, as in [godot.TextEdit].
   *
   * **Note:** This method is implemented on Android, iOS and UWP.
   */
  public fun showVirtualKeyboard(existingText: String = "", multiline: Boolean = false): Unit {
    TransferContext.writeArguments(STRING to existingText, BOOL to multiline)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SHOW_VIRTUAL_KEYBOARD, NIL)
  }

  public enum class VideoDriver(
    id: Long
  ) {
    /**
     * The GLES3 rendering backend. It uses OpenGL ES 3.0 on mobile devices, OpenGL 3.3 on desktop platforms and WebGL 2.0 on the web.
     */
    VIDEO_DRIVER_GLES3(0),
    /**
     * The GLES2 rendering backend. It uses OpenGL ES 2.0 on mobile devices, OpenGL 2.1 on desktop platforms and WebGL 1.0 on the web.
     */
    VIDEO_DRIVER_GLES2(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class SystemDir(
    id: Long
  ) {
    /**
     * Desktop directory path.
     */
    SYSTEM_DIR_DESKTOP(0),
    /**
     * DCIM (Digital Camera Images) directory path.
     */
    SYSTEM_DIR_DCIM(1),
    /**
     * Documents directory path.
     */
    SYSTEM_DIR_DOCUMENTS(2),
    /**
     * Downloads directory path.
     */
    SYSTEM_DIR_DOWNLOADS(3),
    /**
     * Movies directory path.
     */
    SYSTEM_DIR_MOVIES(4),
    /**
     * Music directory path.
     */
    SYSTEM_DIR_MUSIC(5),
    /**
     * Pictures directory path.
     */
    SYSTEM_DIR_PICTURES(6),
    /**
     * Ringtones directory path.
     */
    SYSTEM_DIR_RINGTONES(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ScreenOrientation(
    id: Long
  ) {
    /**
     * Landscape screen orientation.
     */
    SCREEN_ORIENTATION_LANDSCAPE(0),
    /**
     * Portrait screen orientation.
     */
    SCREEN_ORIENTATION_PORTRAIT(1),
    /**
     * Reverse landscape screen orientation.
     */
    SCREEN_ORIENTATION_REVERSE_LANDSCAPE(2),
    /**
     * Reverse portrait screen orientation.
     */
    SCREEN_ORIENTATION_REVERSE_PORTRAIT(3),
    /**
     * Uses landscape or reverse landscape based on the hardware sensor.
     */
    SCREEN_ORIENTATION_SENSOR_LANDSCAPE(4),
    /**
     * Uses portrait or reverse portrait based on the hardware sensor.
     */
    SCREEN_ORIENTATION_SENSOR_PORTRAIT(5),
    /**
     * Uses most suitable orientation based on the hardware sensor.
     */
    SCREEN_ORIENTATION_SENSOR(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class PowerState(
    id: Long
  ) {
    /**
     * Unknown powerstate.
     */
    POWERSTATE_UNKNOWN(0),
    /**
     * Unplugged, running on battery.
     */
    POWERSTATE_ON_BATTERY(1),
    /**
     * Plugged in, no battery available.
     */
    POWERSTATE_NO_BATTERY(2),
    /**
     * Plugged in, battery charging.
     */
    POWERSTATE_CHARGING(3),
    /**
     * Plugged in, battery fully charged.
     */
    POWERSTATE_CHARGED(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class HandleType(
    id: Long
  ) {
    /**
     * Application handle:
     *
     * - Windows: `HINSTANCE` of the application
     *
     * - MacOS: `NSApplication*` of the application (not yet implemented)
     *
     * - Android: `JNIEnv*` of the application (not yet implemented)
     */
    APPLICATION_HANDLE(0),
    /**
     * Display handle:
     *
     * - Linux: `X11::Display*` for the display
     */
    DISPLAY_HANDLE(1),
    /**
     * Window handle:
     *
     * - Windows: `HWND` of the main window
     *
     * - Linux: `X11::Window*` of the main window
     *
     * - MacOS: `NSWindow*` of the main window (not yet implemented)
     *
     * - Android: `jObject` the main android activity (not yet implemented)
     */
    WINDOW_HANDLE(2),
    /**
     * Window view:
     *
     * - Windows: `HDC` of the main window drawing context
     *
     * - MacOS: `NSView*` of the main windows view (not yet implemented)
     */
    WINDOW_VIEW(3),
    /**
     * OpenGL Context:
     *
     * - Windows: `HGLRC`
     *
     * - Linux: `X11::GLXContext`
     *
     * - MacOS: `NSOpenGLContext*` (not yet implemented)
     */
    OPENGL_CONTEXT(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class Month(
    id: Long
  ) {
    /**
     * January.
     */
    MONTH_JANUARY(1),
    /**
     * February.
     */
    MONTH_FEBRUARY(2),
    /**
     * March.
     */
    MONTH_MARCH(3),
    /**
     * April.
     */
    MONTH_APRIL(4),
    /**
     * May.
     */
    MONTH_MAY(5),
    /**
     * June.
     */
    MONTH_JUNE(6),
    /**
     * July.
     */
    MONTH_JULY(7),
    /**
     * August.
     */
    MONTH_AUGUST(8),
    /**
     * September.
     */
    MONTH_SEPTEMBER(9),
    /**
     * October.
     */
    MONTH_OCTOBER(10),
    /**
     * November.
     */
    MONTH_NOVEMBER(11),
    /**
     * December.
     */
    MONTH_DECEMBER(12),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class Weekday(
    id: Long
  ) {
    /**
     * Sunday.
     */
    DAY_SUNDAY(0),
    /**
     * Monday.
     */
    DAY_MONDAY(1),
    /**
     * Tuesday.
     */
    DAY_TUESDAY(2),
    /**
     * Wednesday.
     */
    DAY_WEDNESDAY(3),
    /**
     * Thursday.
     */
    DAY_THURSDAY(4),
    /**
     * Friday.
     */
    DAY_FRIDAY(5),
    /**
     * Saturday.
     */
    DAY_SATURDAY(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }
}
