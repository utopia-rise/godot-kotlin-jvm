// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.OS
import godot.annotation.GodotBaseType
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.PoolStringArray
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
 * Operating System functions. OS wraps the most common functionality to communicate with the host operating system, such as the clipboard, video driver, date and time, timers, environment variables, execution of binaries, command line, etc.
 */
@GodotBaseType
object OS : Object() {
  /**
   * Friday.
   */
  final const val DAY_FRIDAY: Long = 5

  /**
   * Monday.
   */
  final const val DAY_MONDAY: Long = 1

  /**
   * Saturday.
   */
  final const val DAY_SATURDAY: Long = 6

  /**
   * Sunday.
   */
  final const val DAY_SUNDAY: Long = 0

  /**
   * Thursday.
   */
  final const val DAY_THURSDAY: Long = 4

  /**
   * Tuesday.
   */
  final const val DAY_TUESDAY: Long = 2

  /**
   * Wednesday.
   */
  final const val DAY_WEDNESDAY: Long = 3

  /**
   * April.
   */
  final const val MONTH_APRIL: Long = 4

  /**
   * August.
   */
  final const val MONTH_AUGUST: Long = 8

  /**
   * December.
   */
  final const val MONTH_DECEMBER: Long = 12

  /**
   * February.
   */
  final const val MONTH_FEBRUARY: Long = 2

  /**
   * January.
   */
  final const val MONTH_JANUARY: Long = 1

  /**
   * July.
   */
  final const val MONTH_JULY: Long = 7

  /**
   * June.
   */
  final const val MONTH_JUNE: Long = 6

  /**
   * March.
   */
  final const val MONTH_MARCH: Long = 3

  /**
   * May.
   */
  final const val MONTH_MAY: Long = 5

  /**
   * November.
   */
  final const val MONTH_NOVEMBER: Long = 11

  /**
   * October.
   */
  final const val MONTH_OCTOBER: Long = 10

  /**
   * September.
   */
  final const val MONTH_SEPTEMBER: Long = 9

  /**
   * Plugged in, battery fully charged.
   */
  final const val POWERSTATE_CHARGED: Long = 4

  /**
   * Plugged in, battery charging.
   */
  final const val POWERSTATE_CHARGING: Long = 3

  /**
   * Plugged in, no battery available.
   */
  final const val POWERSTATE_NO_BATTERY: Long = 2

  /**
   * Unplugged, running on battery.
   */
  final const val POWERSTATE_ON_BATTERY: Long = 1

  /**
   * Unknown powerstate.
   */
  final const val POWERSTATE_UNKNOWN: Long = 0

  /**
   * Landscape screen orientation.
   */
  final const val SCREEN_ORIENTATION_LANDSCAPE: Long = 0

  /**
   * Portrait screen orientation.
   */
  final const val SCREEN_ORIENTATION_PORTRAIT: Long = 1

  /**
   * Reverse landscape screen orientation.
   */
  final const val SCREEN_ORIENTATION_REVERSE_LANDSCAPE: Long = 2

  /**
   * Reverse portrait screen orientation.
   */
  final const val SCREEN_ORIENTATION_REVERSE_PORTRAIT: Long = 3

  /**
   * Uses most suitable orientation based on the hardware sensor.
   */
  final const val SCREEN_ORIENTATION_SENSOR: Long = 6

  /**
   * Uses landscape or reverse landscape based on the hardware sensor.
   */
  final const val SCREEN_ORIENTATION_SENSOR_LANDSCAPE: Long = 4

  /**
   * Uses portrait or reverse portrait based on the hardware sensor.
   */
  final const val SCREEN_ORIENTATION_SENSOR_PORTRAIT: Long = 5

  /**
   * DCIM (Digital Camera Images) directory path.
   */
  final const val SYSTEM_DIR_DCIM: Long = 1

  /**
   * Desktop directory path.
   */
  final const val SYSTEM_DIR_DESKTOP: Long = 0

  /**
   * Documents directory path.
   */
  final const val SYSTEM_DIR_DOCUMENTS: Long = 2

  /**
   * Downloads directory path.
   */
  final const val SYSTEM_DIR_DOWNLOADS: Long = 3

  /**
   * Movies directory path.
   */
  final const val SYSTEM_DIR_MOVIES: Long = 4

  /**
   * Music directory path.
   */
  final const val SYSTEM_DIR_MUSIC: Long = 5

  /**
   * Pictures directory path.
   */
  final const val SYSTEM_DIR_PICTURES: Long = 6

  /**
   * Ringtones directory path.
   */
  final const val SYSTEM_DIR_RINGTONES: Long = 7

  /**
   * The GLES2 rendering backend. It uses OpenGL ES 2.0 on mobile devices, OpenGL 2.1 on desktop platforms and WebGL 1.0 on the web.
   */
  final const val VIDEO_DRIVER_GLES2: Long = 1

  /**
   * The GLES3 rendering backend. It uses OpenGL ES 3.0 on mobile devices, OpenGL 3.3 on desktop platforms and WebGL 2.0 on the web.
   */
  final const val VIDEO_DRIVER_GLES3: Long = 0

  /**
   * The clipboard from the host OS. Might be unavailable on some platforms.
   */
  var clipboard: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_CLIPBOARD, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_CLIPBOARD, NIL)
    }

  /**
   * The current screen index (starting from 0).
   */
  var currentScreen: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_CURRENT_SCREEN, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_CURRENT_SCREEN, NIL)
    }

  /**
   * The exit code passed to the OS when the main loop exits. By convention, an exit code of `0` indicates success whereas a non-zero exit code indicates an error. For portability reasons, the exit code should be set between 0 and 125 (inclusive).
   *
   * **Note:** This value will be ignored if using [godot.SceneTree.quit] with an `exit_code` argument passed.
   */
  var exitCode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_EXIT_CODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_EXIT_CODE, NIL)
    }

  /**
   * If `true`, the engine tries to keep the screen on while the game is running. Useful on mobile.
   */
  var keepScreenOn: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_KEEP_SCREEN_ON, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_KEEP_SCREEN_ON, NIL)
    }

  /**
   * If `true`, the engine optimizes for low processor usage by only refreshing the screen if needed. Can improve battery consumption on mobile.
   */
  var lowProcessorUsageMode: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_LOW_PROCESSOR_USAGE_MODE,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_LOW_PROCESSOR_USAGE_MODE,
          NIL)
    }

  /**
   * The amount of sleeping between frames when the low-processor usage mode is enabled (in microseconds). Higher values will result in lower CPU usage.
   */
  var lowProcessorUsageModeSleepUsec: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS__OS_GET_LOW_PROCESSOR_USAGE_MODE_SLEEP_USEC, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS__OS_SET_LOW_PROCESSOR_USAGE_MODE_SLEEP_USEC, NIL)
    }

  /**
   * The maximum size of the window (without counting window manager decorations). Does not affect fullscreen mode. Set to `(0, 0)` to reset to the system default value.
   */
  var maxWindowSize: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_MAX_WINDOW_SIZE, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_MAX_WINDOW_SIZE, NIL)
    }

  /**
   * The minimum size of the window (without counting window manager decorations). Does not affect fullscreen mode. Set to `(0, 0)` to reset to the system default value.
   */
  var minWindowSize: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_MIN_WINDOW_SIZE, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_MIN_WINDOW_SIZE, NIL)
    }

  /**
   * The current screen orientation.
   */
  var screenOrientation: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_SCREEN_ORIENTATION, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_SCREEN_ORIENTATION, NIL)
    }

  /**
   * The current tablet drvier in use.
   */
  var tabletDriver: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_TABLET_DRIVER, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_TABLET_DRIVER, NIL)
    }

  /**
   * If `true`, vertical synchronization (Vsync) is enabled.
   */
  var vsyncEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_VSYNC_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
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
  var vsyncViaCompositor: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_VSYNC_VIA_COMPOSITOR,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_VSYNC_VIA_COMPOSITOR, NIL)
    }

  /**
   * If `true`, removes the window frame.
   *
   * **Note:** Setting `window_borderless` to `false` disables per-pixel transparency.
   */
  var windowBorderless: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_WINDOW_BORDERLESS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_WINDOW_BORDERLESS, NIL)
    }

  /**
   * If `true`, the window is fullscreen.
   */
  var windowFullscreen: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_WINDOW_FULLSCREEN, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_WINDOW_FULLSCREEN, NIL)
    }

  /**
   * If `true`, the window is maximized.
   */
  var windowMaximized: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_WINDOW_MAXIMIZED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_WINDOW_MAXIMIZED, NIL)
    }

  /**
   * If `true`, the window is minimized.
   */
  var windowMinimized: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_WINDOW_MINIMIZED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_WINDOW_MINIMIZED, NIL)
    }

  /**
   * If `true`, the window background is transparent and window frame is removed.
   *
   * Use `get_tree().get_root().set_transparent_background(true)` to disable main viewport background rendering.
   *
   * **Note:** This property has no effect if **Project > Project Settings > Display > Window > Per-pixel transparency > Allowed** setting is disabled.
   *
   * **Note:** This property is implemented on HTML5, Linux, macOS and Windows.
   */
  var windowPerPixelTransparencyEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS__OS_GET_WINDOW_PER_PIXEL_TRANSPARENCY_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS__OS_SET_WINDOW_PER_PIXEL_TRANSPARENCY_ENABLED, NIL)
    }

  /**
   * The window position relative to the screen, the origin is the top left corner, +Y axis goes to the bottom and +X axis goes to the right.
   */
  var windowPosition: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_WINDOW_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_WINDOW_POSITION, NIL)
    }

  /**
   * If `true`, the window is resizable by the user.
   */
  var windowResizable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_WINDOW_RESIZABLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_WINDOW_RESIZABLE, NIL)
    }

  /**
   * The size of the window (without counting window manager decorations).
   */
  var windowSize: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_WINDOW_SIZE, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_WINDOW_SIZE, NIL)
    }

  override fun __new() {
    rawPtr = TransferContext.getSingleton(ENGINESINGLETON_OS)
  }

  override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  fun maxWindowSize(schedule: Vector2.() -> Unit): Vector2 = maxWindowSize.apply{
      schedule(this)
      maxWindowSize = this
  }


  fun minWindowSize(schedule: Vector2.() -> Unit): Vector2 = minWindowSize.apply{
      schedule(this)
      minWindowSize = this
  }


  fun windowPosition(schedule: Vector2.() -> Unit): Vector2 = windowPosition.apply{
      schedule(this)
      windowPosition = this
  }


  fun windowSize(schedule: Vector2.() -> Unit): Vector2 = windowSize.apply{
      schedule(this)
      windowSize = this
  }


  /**
   * Displays a modal dialog box using the host OS' facilities. Execution is blocked until the dialog is closed.
   */
  fun alert(text: String, title: String = "Alert!") {
    TransferContext.writeArguments(STRING to text, STRING to title)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_ALERT, NIL)
  }

  /**
   * Returns `true` if the host OS allows drawing.
   */
  fun canDraw(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_CAN_DRAW, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the current host platform is using multiple threads.
   */
  fun canUseThreads(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_CAN_USE_THREADS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Centers the window on the screen if in windowed mode.
   */
  fun centerWindow() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_CENTER_WINDOW, NIL)
  }

  /**
   * Shuts down system MIDI driver.
   *
   * **Note:** This method is implemented on Linux, macOS and Windows.
   */
  fun closeMidiInputs() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_CLOSE_MIDI_INPUTS, NIL)
  }

  /**
   * Delay execution of the current thread by `msec` milliseconds.
   */
  fun delayMsec(msec: Long) {
    TransferContext.writeArguments(LONG to msec)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_DELAY_MSEC, NIL)
  }

  /**
   * Delay execution of the current thread by `usec` microseconds.
   */
  fun delayUsec(usec: Long) {
    TransferContext.writeArguments(LONG to usec)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_DELAY_USEC, NIL)
  }

  /**
   * Dumps the memory allocation ringlist to a file (only works in debug).
   *
   * Entry format per line: "Address - Size - Description".
   */
  fun dumpMemoryToFile(file: String) {
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
  fun dumpResourcesToFile(file: String) {
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
   */
  fun execute(
    path: String,
    arguments: PoolStringArray,
    blocking: Boolean = true,
    output: VariantArray<Any?> = VariantArray(),
    readStderr: Boolean = false
  ): Long {
    TransferContext.writeArguments(STRING to path, POOL_STRING_ARRAY to arguments, BOOL to blocking,
        ARRAY to output, BOOL to readStderr)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_EXECUTE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the scancode of the given string (e.g. "Escape").
   */
  fun findScancodeFromString(string: String): Long {
    TransferContext.writeArguments(STRING to string)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_FIND_SCANCODE_FROM_STRING, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the total number of available audio drivers.
   */
  fun getAudioDriverCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_AUDIO_DRIVER_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the audio driver name for the given index.
   */
  fun getAudioDriverName(driver: Long): String {
    TransferContext.writeArguments(LONG to driver)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_AUDIO_DRIVER_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the command-line arguments passed to the engine.
   *
   * Command-line arguments can be written in any form, including both `--key value` and `--key=value` forms so they can be properly parsed, as long as custom command-line arguments do not conflict with engine arguments.
   *
   * You can also incorporate environment variables using the [getEnvironment] method.
   *
   * You can set `editor/main_run_args` in the Project Settings to define command-line arguments to be passed by the editor when running the project.
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
  fun getCmdlineArgs(): PoolStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_CMDLINE_ARGS,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * Returns an array of MIDI device names.
   *
   * The returned array will be empty if the system MIDI driver has not previously been initialised with [openMidiInputs].
   *
   * **Note:** This method is implemented on Linux, macOS and Windows.
   */
  fun getConnectedMidiInputs(): PoolStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_CONNECTED_MIDI_INPUTS,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * Returns the currently used video driver, using one of the values from [enum VideoDriver].
   */
  fun getCurrentVideoDriver(): OS.VideoDriver {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_CURRENT_VIDEO_DRIVER, LONG)
    return OS.VideoDriver.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns current date as a dictionary of keys: `year`, `month`, `day`, `weekday`, `dst` (Daylight Savings Time).
   */
  fun getDate(utc: Boolean = false): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(BOOL to utc)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_DATE, DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  /**
   * Returns current datetime as a dictionary of keys: `year`, `month`, `day`, `weekday`, `dst` (Daylight Savings Time), `hour`, `minute`, `second`.
   */
  fun getDatetime(utc: Boolean = false): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(BOOL to utc)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_DATETIME, DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  /**
   * Gets a dictionary of time values corresponding to the given UNIX epoch time (in seconds).
   *
   * The returned Dictionary's values will be the same as [getDatetime], with the exception of Daylight Savings Time as it cannot be determined from the epoch.
   */
  fun getDatetimeFromUnixTime(unixTimeVal: Long): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(LONG to unixTimeVal)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_DATETIME_FROM_UNIX_TIME,
        DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  /**
   * Returns the total amount of dynamic memory used (only works in debug).
   */
  fun getDynamicMemoryUsage(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_DYNAMIC_MEMORY_USAGE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns an environment variable.
   */
  fun getEnvironment(environment: String): String {
    TransferContext.writeArguments(STRING to environment)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_ENVIRONMENT, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the path to the current engine executable.
   */
  fun getExecutablePath(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_EXECUTABLE_PATH, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * With this function you can get the list of dangerous permissions that have been granted to the Android application.
   *
   * **Note:** This method is implemented on Android.
   */
  fun getGrantedPermissions(): PoolStringArray {
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
  fun getImeSelection(): Vector2 {
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
  fun getImeText(): String {
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
  fun getLatinKeyboardVariant(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_LATIN_KEYBOARD_VARIANT,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the host OS locale.
   */
  fun getLocale(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_LOCALE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the model name of the current device.
   *
   * **Note:** This method is implemented on Android and iOS. Returns `"GenericDevice"` on unsupported platforms.
   */
  fun getModelName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_MODEL_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the name of the host OS. Possible values are: `"Android"`, `"iOS"`, `"HTML5"`, `"OSX"`, `"Server"`, `"Windows"`, `"UWP"`, `"X11"`.
   */
  fun getName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the amount of battery left in the device as a percentage. Returns `-1` if power state is unknown.
   *
   * **Note:** This method is implemented on Linux, macOS and Windows.
   */
  fun getPowerPercentLeft(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_POWER_PERCENT_LEFT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns an estimate of the time left in seconds before the device runs out of battery. Returns `-1` if power state is unknown.
   *
   * **Note:** This method is implemented on Linux, macOS and Windows.
   */
  fun getPowerSecondsLeft(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_POWER_SECONDS_LEFT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the current state of the device regarding battery and power. See [enum PowerState] constants.
   *
   * **Note:** This method is implemented on Linux, macOS and Windows.
   */
  fun getPowerState(): OS.PowerState {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_POWER_STATE, LONG)
    return OS.PowerState.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the project's process ID.
   *
   * **Note:** This method is implemented on Android, iOS, Linux, macOS and Windows.
   */
  fun getProcessId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_PROCESS_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the number of threads available on the host machine.
   */
  fun getProcessorCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_PROCESSOR_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the window size including decorations like window borders.
   */
  fun getRealWindowSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_REAL_WINDOW_SIZE, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the given scancode as a string (e.g. Return values: `"Escape"`, `"Shift+Escape"`).
   *
   * See also [godot.InputEventKey.scancode] and [godot.InputEventKey.getScancodeWithModifiers].
   */
  fun getScancodeString(code: Long): String {
    TransferContext.writeArguments(LONG to code)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_SCANCODE_STRING, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the number of displays attached to the host machine.
   */
  fun getScreenCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_SCREEN_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the dots per inch density of the specified screen. If `screen` is `-1` (the default value), the current screen will be used.
   *
   * On Android devices, the actual screen densities are grouped into six generalized densities:
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
  fun getScreenDpi(screen: Long = -1): Long {
    TransferContext.writeArguments(LONG to screen)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_SCREEN_DPI, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the position of the specified screen by index. If `screen` is `-1` (the default value), the current screen will be used.
   */
  fun getScreenPosition(screen: Long = -1): Vector2 {
    TransferContext.writeArguments(LONG to screen)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_SCREEN_POSITION, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the dimensions in pixels of the specified screen. If `screen` is `-1` (the default value), the current screen will be used.
   */
  fun getScreenSize(screen: Long = -1): Vector2 {
    TransferContext.writeArguments(LONG to screen)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_SCREEN_SIZE, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the amount of time in milliseconds it took for the boot logo to appear.
   */
  fun getSplashTickMsec(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_SPLASH_TICK_MSEC, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the maximum amount of static memory used (only works in debug).
   */
  fun getStaticMemoryPeakUsage(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_STATIC_MEMORY_PEAK_USAGE,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the amount of static memory being used by the program in bytes.
   */
  fun getStaticMemoryUsage(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_STATIC_MEMORY_USAGE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the actual path to commonly used folders across different platforms. Available locations are specified in [enum SystemDir].
   *
   * **Note:** This method is implemented on Android, Linux, macOS and Windows.
   */
  fun getSystemDir(dir: Long): String {
    TransferContext.writeArguments(LONG to dir)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_SYSTEM_DIR, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the epoch time of the operating system in milliseconds.
   */
  fun getSystemTimeMsecs(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_SYSTEM_TIME_MSECS, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the epoch time of the operating system in seconds.
   */
  fun getSystemTimeSecs(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_SYSTEM_TIME_SECS, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the total number of available tablet drivers.
   *
   * **Note:** This method is implemented on Windows.
   */
  fun getTabletDriverCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_TABLET_DRIVER_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the tablet driver name for the given index.
   *
   * **Note:** This method is implemented on Windows.
   */
  fun getTabletDriverName(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_TABLET_DRIVER_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the amount of time passed in milliseconds since the engine started.
   */
  fun getTicksMsec(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_TICKS_MSEC, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the amount of time passed in microseconds since the engine started.
   */
  fun getTicksUsec(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_TICKS_USEC, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns current time as a dictionary of keys: hour, minute, second.
   */
  fun getTime(utc: Boolean = false): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(BOOL to utc)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_TIME, DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  /**
   * Returns the current time zone as a dictionary with the keys: bias and name.
   */
  fun getTimeZoneInfo(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_TIME_ZONE_INFO, DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  /**
   * Returns a string that is unique to the device.
   *
   * **Note:** Returns an empty string on HTML5 and UWP, as this method isn't implemented on those platforms yet.
   */
  fun getUniqueId(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_UNIQUE_ID, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the current UNIX epoch timestamp.
   */
  fun getUnixTime(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_UNIX_TIME, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Gets an epoch time value from a dictionary of time values.
   *
   * `datetime` must be populated with the following keys: `year`, `month`, `day`, `hour`, `minute`, `second`.
   *
   * You can pass the output from [getDatetimeFromUnixTime] directly into this function. Daylight Savings Time (`dst`), if present, is ignored.
   */
  fun getUnixTimeFromDatetime(datetime: Dictionary<Any?, Any?>): Long {
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
   */
  fun getUserDataDir(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_USER_DATA_DIR, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the number of video drivers supported on the current platform.
   */
  fun getVideoDriverCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_VIDEO_DRIVER_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the name of the video driver matching the given `driver` index. This index is a value from [enum VideoDriver], and you can use [getCurrentVideoDriver] to get the current backend's index.
   */
  fun getVideoDriverName(driver: Long): String {
    TransferContext.writeArguments(LONG to driver)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_VIDEO_DRIVER_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the on-screen keyboard's height in pixels. Returns 0 if there is no keyboard or if it is currently hidden.
   */
  fun getVirtualKeyboardHeight(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_VIRTUAL_KEYBOARD_HEIGHT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns unobscured area of the window where interactive controls should be rendered.
   */
  fun getWindowSafeArea(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_WINDOW_SAFE_AREA, RECT2)
    return TransferContext.readReturnValue(RECT2, false) as Rect2
  }

  /**
   * Add a new item with text "label" to global menu. Use "_dock" menu to add item to the macOS dock icon menu.
   *
   * **Note:** This method is implemented on macOS.
   */
  fun globalMenuAddItem(
    menu: String,
    label: String,
    id: Any?,
    meta: Any?
  ) {
    TransferContext.writeArguments(STRING to menu, STRING to label, ANY to id, ANY to meta)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GLOBAL_MENU_ADD_ITEM, NIL)
  }

  /**
   * Add a separator between items. Separators also occupy an index.
   *
   * **Note:** This method is implemented on macOS.
   */
  fun globalMenuAddSeparator(menu: String) {
    TransferContext.writeArguments(STRING to menu)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GLOBAL_MENU_ADD_SEPARATOR, NIL)
  }

  /**
   * Clear the global menu, in effect removing all items.
   *
   * **Note:** This method is implemented on macOS.
   */
  fun globalMenuClear(menu: String) {
    TransferContext.writeArguments(STRING to menu)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GLOBAL_MENU_CLEAR, NIL)
  }

  /**
   * Removes the item at index "idx" from the global menu. Note that the indexes of items after the removed item are going to be shifted by one.
   *
   * **Note:** This method is implemented on macOS.
   */
  fun globalMenuRemoveItem(menu: String, idx: Long) {
    TransferContext.writeArguments(STRING to menu, LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GLOBAL_MENU_REMOVE_ITEM, NIL)
  }

  /**
   * Returns `true` if an environment variable exists.
   */
  fun hasEnvironment(environment: String): Boolean {
    TransferContext.writeArguments(STRING to environment)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_HAS_ENVIRONMENT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the feature for the given feature tag is supported in the currently running instance, depending on platform, build etc. Can be used to check whether you're currently running a debug build, on a certain platform or arch, etc. Refer to the [godot.Feature Tags](https://docs.godotengine.org/en/latest/getting_started/workflow/export/feature_tags.html) documentation for more details.
   *
   * **Note:** Tag names are case-sensitive.
   */
  fun hasFeature(tagName: String): Boolean {
    TransferContext.writeArguments(STRING to tagName)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_HAS_FEATURE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the device has a touchscreen or emulates one.
   */
  fun hasTouchscreenUiHint(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_HAS_TOUCHSCREEN_UI_HINT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the platform has a virtual keyboard, `false` otherwise.
   */
  fun hasVirtualKeyboard(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_HAS_VIRTUAL_KEYBOARD, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Hides the virtual keyboard if it is shown, does nothing otherwise.
   */
  fun hideVirtualKeyboard() {
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
  fun isDebugBuild(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_IS_DEBUG_BUILD, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the **OK** button should appear on the left and **Cancel** on the right.
   */
  fun isOkLeftAndCancelRight(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_IS_OK_LEFT_AND_CANCEL_RIGHT,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the input scancode corresponds to a Unicode character.
   */
  fun isScancodeUnicode(code: Long): Boolean {
    TransferContext.writeArguments(LONG to code)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_IS_SCANCODE_UNICODE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the engine was executed with `-v` (verbose stdout).
   */
  fun isStdoutVerbose(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_IS_STDOUT_VERBOSE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * If `true`, the `user://` file system is persistent, so that its state is the same after a player quits and starts the game again. Relevant to the HTML5 platform, where this persistence may be unavailable.
   */
  fun isUserfsPersistent(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_IS_USERFS_PERSISTENT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the window should always be on top of other windows.
   */
  fun isWindowAlwaysOnTop(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_IS_WINDOW_ALWAYS_ON_TOP, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the window is currently focused.
   *
   * **Note:** Only implemented on desktop platforms. On other platforms, it will always return `true`.
   */
  fun isWindowFocused(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_IS_WINDOW_FOCUSED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Kill (terminate) the process identified by the given process ID (`pid`), e.g. the one returned by [execute] in non-blocking mode.
   *
   * **Note:** This method can also be used to kill processes that were not spawned by the game.
   *
   * **Note:** This method is implemented on Android, iOS, Linux, macOS and Windows.
   */
  fun kill(pid: Long): GodotError {
    TransferContext.writeArguments(LONG to pid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_KILL, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Moves the window to the front.
   *
   * **Note:** This method is implemented on Linux, macOS and Windows.
   */
  fun moveWindowToForeground() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_MOVE_WINDOW_TO_FOREGROUND, NIL)
  }

  /**
   * Returns `true` if native video is playing.
   *
   * **Note:** This method is implemented on Android and iOS.
   */
  fun nativeVideoIsPlaying(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_NATIVE_VIDEO_IS_PLAYING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Pauses native video playback.
   *
   * **Note:** This method is implemented on Android and iOS.
   */
  fun nativeVideoPause() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_NATIVE_VIDEO_PAUSE, NIL)
  }

  /**
   * Plays native video from the specified path, at the given volume and with audio and subtitle tracks.
   *
   * **Note:** This method is implemented on Android and iOS, and the current Android implementation does not support the `volume`, `audio_track` and `subtitle_track` options.
   */
  fun nativeVideoPlay(
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
   * **Note:** This method is implemented on Android and iOS.
   */
  fun nativeVideoStop() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_NATIVE_VIDEO_STOP, NIL)
  }

  /**
   * Resumes native video playback.
   *
   * **Note:** This method is implemented on Android and iOS.
   */
  fun nativeVideoUnpause() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_NATIVE_VIDEO_UNPAUSE, NIL)
  }

  /**
   * Initialises the singleton for the system MIDI driver.
   *
   * **Note:** This method is implemented on Linux, macOS and Windows.
   */
  fun openMidiInputs() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_OPEN_MIDI_INPUTS, NIL)
  }

  /**
   * Shows all resources in the game. Optionally, the list can be written to a file by specifying a file path in `tofile`.
   */
  fun printAllResources(tofile: String = "") {
    TransferContext.writeArguments(STRING to tofile)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_PRINT_ALL_RESOURCES, NIL)
  }

  /**
   * Shows the list of loaded textures sorted by size in memory.
   */
  fun printAllTexturesBySize() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_PRINT_ALL_TEXTURES_BY_SIZE, NIL)
  }

  /**
   * Shows the number of resources loaded by the game of the given types.
   */
  fun printResourcesByType(types: PoolStringArray) {
    TransferContext.writeArguments(POOL_STRING_ARRAY to types)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_PRINT_RESOURCES_BY_TYPE, NIL)
  }

  /**
   * Shows all resources currently used by the game.
   */
  fun printResourcesInUse(short: Boolean = false) {
    TransferContext.writeArguments(BOOL to short)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_PRINT_RESOURCES_IN_USE, NIL)
  }

  /**
   * Request the user attention to the window. It'll flash the taskbar button on Windows or bounce the dock icon on OSX.
   *
   * **Note:** This method is implemented on Linux, macOS and Windows.
   */
  fun requestAttention() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_REQUEST_ATTENTION, NIL)
  }

  /**
   * At the moment this function is only used by `AudioDriverOpenSL` to request permission for `RECORD_AUDIO` on Android.
   */
  fun requestPermission(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_REQUEST_PERMISSION, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * With this function you can request dangerous permissions since normal permissions are automatically granted at install time in Android application.
   *
   * **Note:** This method is implemented on Android.
   */
  fun requestPermissions(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_REQUEST_PERMISSIONS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the game's icon using an [godot.Image] resource.
   *
   * The same image is used for window caption, taskbar/dock and window selection dialog. Image is scaled as needed.
   *
   * **Note:** This method is implemented on HTML5, Linux, macOS and Windows.
   */
  fun setIcon(icon: Image) {
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
  fun setImeActive(active: Boolean) {
    TransferContext.writeArguments(BOOL to active)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_IME_ACTIVE, NIL)
  }

  /**
   * Sets position of IME suggestion list popup (in window coordinates).
   *
   * **Note:** This method is implemented on Linux, macOS and Windows.
   */
  fun setImePosition(position: Vector2) {
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
  fun setNativeIcon(filename: String) {
    TransferContext.writeArguments(STRING to filename)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_NATIVE_ICON, NIL)
  }

  /**
   * Sets the name of the current thread.
   */
  fun setThreadName(name: String): GodotError {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_THREAD_NAME, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Enables backup saves if `enabled` is `true`.
   */
  fun setUseFileAccessSaveAndSwap(enabled: Boolean) {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS__OS_SET_USE_FILE_ACCESS_SAVE_AND_SWAP, NIL)
  }

  /**
   * Sets whether the window should always be on top.
   *
   * **Note:** This method is implemented on Linux, macOS and Windows.
   */
  fun setWindowAlwaysOnTop(enabled: Boolean) {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_WINDOW_ALWAYS_ON_TOP, NIL)
  }

  /**
   * Sets the window title to the specified string.
   *
   * **Note:** This should be used sporadically. Don't set this every frame, as that will negatively affect performance on some window managers.
   *
   * **Note:** This method is implemented on HTML5, Linux, macOS and Windows.
   */
  fun setWindowTitle(title: String) {
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
  fun shellOpen(uri: String): GodotError {
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
  fun showVirtualKeyboard(existingText: String = "") {
    TransferContext.writeArguments(STRING to existingText)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SHOW_VIRTUAL_KEYBOARD, NIL)
  }

  enum class VideoDriver(
    id: Long
  ) {
    /**
     * The GLES3 rendering backend. It uses OpenGL ES 3.0 on mobile devices, OpenGL 3.3 on desktop platforms and WebGL 2.0 on the web.
     */
    VIDEO_DRIVER_GLES3(0),

    /**
     * The GLES2 rendering backend. It uses OpenGL ES 2.0 on mobile devices, OpenGL 2.1 on desktop platforms and WebGL 1.0 on the web.
     */
    VIDEO_DRIVER_GLES2(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class SystemDir(
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
    SYSTEM_DIR_RINGTONES(7);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ScreenOrientation(
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
    SCREEN_ORIENTATION_SENSOR(6);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class PowerState(
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
    POWERSTATE_CHARGED(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Month(
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
    MONTH_DECEMBER(12);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Weekday(
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
    DAY_SATURDAY(6);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }
}
