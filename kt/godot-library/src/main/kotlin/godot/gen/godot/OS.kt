// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

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
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
object OS : Object() {
  final const val DAY_FRIDAY: Long = 5

  final const val DAY_MONDAY: Long = 1

  final const val DAY_SATURDAY: Long = 6

  final const val DAY_SUNDAY: Long = 0

  final const val DAY_THURSDAY: Long = 4

  final const val DAY_TUESDAY: Long = 2

  final const val DAY_WEDNESDAY: Long = 3

  final const val MONTH_APRIL: Long = 4

  final const val MONTH_AUGUST: Long = 8

  final const val MONTH_DECEMBER: Long = 12

  final const val MONTH_FEBRUARY: Long = 2

  final const val MONTH_JANUARY: Long = 1

  final const val MONTH_JULY: Long = 7

  final const val MONTH_JUNE: Long = 6

  final const val MONTH_MARCH: Long = 3

  final const val MONTH_MAY: Long = 5

  final const val MONTH_NOVEMBER: Long = 11

  final const val MONTH_OCTOBER: Long = 10

  final const val MONTH_SEPTEMBER: Long = 9

  final const val POWERSTATE_CHARGED: Long = 4

  final const val POWERSTATE_CHARGING: Long = 3

  final const val POWERSTATE_NO_BATTERY: Long = 2

  final const val POWERSTATE_ON_BATTERY: Long = 1

  final const val POWERSTATE_UNKNOWN: Long = 0

  final const val SCREEN_ORIENTATION_LANDSCAPE: Long = 0

  final const val SCREEN_ORIENTATION_PORTRAIT: Long = 1

  final const val SCREEN_ORIENTATION_REVERSE_LANDSCAPE: Long = 2

  final const val SCREEN_ORIENTATION_REVERSE_PORTRAIT: Long = 3

  final const val SCREEN_ORIENTATION_SENSOR: Long = 6

  final const val SCREEN_ORIENTATION_SENSOR_LANDSCAPE: Long = 4

  final const val SCREEN_ORIENTATION_SENSOR_PORTRAIT: Long = 5

  final const val SYSTEM_DIR_DCIM: Long = 1

  final const val SYSTEM_DIR_DESKTOP: Long = 0

  final const val SYSTEM_DIR_DOCUMENTS: Long = 2

  final const val SYSTEM_DIR_DOWNLOADS: Long = 3

  final const val SYSTEM_DIR_MOVIES: Long = 4

  final const val SYSTEM_DIR_MUSIC: Long = 5

  final const val SYSTEM_DIR_PICTURES: Long = 6

  final const val SYSTEM_DIR_RINGTONES: Long = 7

  final const val VIDEO_DRIVER_GLES2: Long = 1

  final const val VIDEO_DRIVER_GLES3: Long = 0

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

  override fun __new(): VoidPtr = TransferContext.getSingleton(ENGINESINGLETON_OS)

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


  fun alert(text: String, title: String = "Alert!") {
    TransferContext.writeArguments(STRING to text, STRING to title)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_ALERT, NIL)
  }

  fun canDraw(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_CAN_DRAW, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun canUseThreads(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_CAN_USE_THREADS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun centerWindow() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_CENTER_WINDOW, NIL)
  }

  fun closeMidiInputs() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_CLOSE_MIDI_INPUTS, NIL)
  }

  fun delayMsec(msec: Long) {
    TransferContext.writeArguments(LONG to msec)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_DELAY_MSEC, NIL)
  }

  fun delayUsec(usec: Long) {
    TransferContext.writeArguments(LONG to usec)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_DELAY_USEC, NIL)
  }

  fun dumpMemoryToFile(file: String) {
    TransferContext.writeArguments(STRING to file)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_DUMP_MEMORY_TO_FILE, NIL)
  }

  fun dumpResourcesToFile(file: String) {
    TransferContext.writeArguments(STRING to file)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_DUMP_RESOURCES_TO_FILE, NIL)
  }

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

  fun findScancodeFromString(string: String): Long {
    TransferContext.writeArguments(STRING to string)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_FIND_SCANCODE_FROM_STRING, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun getAudioDriverCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_AUDIO_DRIVER_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun getAudioDriverName(driver: Long): String {
    TransferContext.writeArguments(LONG to driver)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_AUDIO_DRIVER_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  fun getCmdlineArgs(): PoolStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_CMDLINE_ARGS,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  fun getConnectedMidiInputs(): PoolStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_CONNECTED_MIDI_INPUTS,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  fun getCurrentVideoDriver(): OS.VideoDriver {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_CURRENT_VIDEO_DRIVER, LONG)
    return OS.VideoDriver.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  fun getDate(utc: Boolean = false): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(BOOL to utc)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_DATE, DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  fun getDatetime(utc: Boolean = false): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(BOOL to utc)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_DATETIME, DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  fun getDatetimeFromUnixTime(unixTimeVal: Long): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(LONG to unixTimeVal)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_DATETIME_FROM_UNIX_TIME,
        DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  fun getDynamicMemoryUsage(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_DYNAMIC_MEMORY_USAGE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun getEnvironment(environment: String): String {
    TransferContext.writeArguments(STRING to environment)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_ENVIRONMENT, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  fun getExecutablePath(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_EXECUTABLE_PATH, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  fun getGrantedPermissions(): PoolStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_GRANTED_PERMISSIONS,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  fun getImeSelection(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_IME_SELECTION, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  fun getImeText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_IME_TEXT, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  fun getLatinKeyboardVariant(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_LATIN_KEYBOARD_VARIANT,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  fun getLocale(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_LOCALE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  fun getModelName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_MODEL_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  fun getName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  fun getPowerPercentLeft(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_POWER_PERCENT_LEFT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun getPowerSecondsLeft(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_POWER_SECONDS_LEFT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun getPowerState(): OS.PowerState {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_POWER_STATE, LONG)
    return OS.PowerState.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  fun getProcessId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_PROCESS_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun getProcessorCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_PROCESSOR_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun getRealWindowSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_REAL_WINDOW_SIZE, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  fun getScancodeString(code: Long): String {
    TransferContext.writeArguments(LONG to code)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_SCANCODE_STRING, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  fun getScreenCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_SCREEN_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun getScreenDpi(screen: Long = -1): Long {
    TransferContext.writeArguments(LONG to screen)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_SCREEN_DPI, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun getScreenPosition(screen: Long = -1): Vector2 {
    TransferContext.writeArguments(LONG to screen)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_SCREEN_POSITION, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  fun getScreenSize(screen: Long = -1): Vector2 {
    TransferContext.writeArguments(LONG to screen)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_SCREEN_SIZE, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  fun getSplashTickMsec(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_SPLASH_TICK_MSEC, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun getStaticMemoryPeakUsage(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_STATIC_MEMORY_PEAK_USAGE,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun getStaticMemoryUsage(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_STATIC_MEMORY_USAGE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun getSystemDir(dir: Long): String {
    TransferContext.writeArguments(LONG to dir)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_SYSTEM_DIR, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  fun getSystemTimeMsecs(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_SYSTEM_TIME_MSECS, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun getSystemTimeSecs(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_SYSTEM_TIME_SECS, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun getTabletDriverCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_TABLET_DRIVER_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun getTabletDriverName(idx: Long): String {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_TABLET_DRIVER_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  fun getTicksMsec(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_TICKS_MSEC, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun getTicksUsec(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_TICKS_USEC, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun getTime(utc: Boolean = false): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(BOOL to utc)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_TIME, DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  fun getTimeZoneInfo(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_TIME_ZONE_INFO, DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  fun getUniqueId(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_UNIQUE_ID, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  fun getUnixTime(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_UNIX_TIME, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun getUnixTimeFromDatetime(datetime: Dictionary<Any?, Any?>): Long {
    TransferContext.writeArguments(DICTIONARY to datetime)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_UNIX_TIME_FROM_DATETIME,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun getUserDataDir(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_USER_DATA_DIR, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  fun getVideoDriverCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_VIDEO_DRIVER_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun getVideoDriverName(driver: Long): String {
    TransferContext.writeArguments(LONG to driver)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_VIDEO_DRIVER_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  fun getVirtualKeyboardHeight(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_VIRTUAL_KEYBOARD_HEIGHT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun getWindowSafeArea(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GET_WINDOW_SAFE_AREA, RECT2)
    return TransferContext.readReturnValue(RECT2, false) as Rect2
  }

  fun globalMenuAddItem(
    menu: String,
    label: String,
    id: Any,
    meta: Any
  ) {
    TransferContext.writeArguments(STRING to menu, STRING to label, ANY to id, ANY to meta)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GLOBAL_MENU_ADD_ITEM, NIL)
  }

  fun globalMenuAddSeparator(menu: String) {
    TransferContext.writeArguments(STRING to menu)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GLOBAL_MENU_ADD_SEPARATOR, NIL)
  }

  fun globalMenuClear(menu: String) {
    TransferContext.writeArguments(STRING to menu)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GLOBAL_MENU_CLEAR, NIL)
  }

  fun globalMenuRemoveItem(menu: String, idx: Long) {
    TransferContext.writeArguments(STRING to menu, LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_GLOBAL_MENU_REMOVE_ITEM, NIL)
  }

  fun hasEnvironment(environment: String): Boolean {
    TransferContext.writeArguments(STRING to environment)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_HAS_ENVIRONMENT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun hasFeature(tagName: String): Boolean {
    TransferContext.writeArguments(STRING to tagName)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_HAS_FEATURE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun hasTouchscreenUiHint(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_HAS_TOUCHSCREEN_UI_HINT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun hasVirtualKeyboard(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_HAS_VIRTUAL_KEYBOARD, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun hideVirtualKeyboard() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_HIDE_VIRTUAL_KEYBOARD, NIL)
  }

  fun isDebugBuild(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_IS_DEBUG_BUILD, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun isOkLeftAndCancelRight(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_IS_OK_LEFT_AND_CANCEL_RIGHT,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun isScancodeUnicode(code: Long): Boolean {
    TransferContext.writeArguments(LONG to code)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_IS_SCANCODE_UNICODE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun isStdoutVerbose(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_IS_STDOUT_VERBOSE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun isUserfsPersistent(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_IS_USERFS_PERSISTENT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun isWindowAlwaysOnTop(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_IS_WINDOW_ALWAYS_ON_TOP, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun isWindowFocused(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_IS_WINDOW_FOCUSED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun kill(pid: Long): GodotError {
    TransferContext.writeArguments(LONG to pid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_KILL, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  fun moveWindowToForeground() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_MOVE_WINDOW_TO_FOREGROUND, NIL)
  }

  fun nativeVideoIsPlaying(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_NATIVE_VIDEO_IS_PLAYING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun nativeVideoPause() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_NATIVE_VIDEO_PAUSE, NIL)
  }

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

  fun nativeVideoStop() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_NATIVE_VIDEO_STOP, NIL)
  }

  fun nativeVideoUnpause() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_NATIVE_VIDEO_UNPAUSE, NIL)
  }

  fun openMidiInputs() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_OPEN_MIDI_INPUTS, NIL)
  }

  fun printAllResources(tofile: String = "") {
    TransferContext.writeArguments(STRING to tofile)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_PRINT_ALL_RESOURCES, NIL)
  }

  fun printAllTexturesBySize() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_PRINT_ALL_TEXTURES_BY_SIZE, NIL)
  }

  fun printResourcesByType(types: PoolStringArray) {
    TransferContext.writeArguments(POOL_STRING_ARRAY to types)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_PRINT_RESOURCES_BY_TYPE, NIL)
  }

  fun printResourcesInUse(short: Boolean = false) {
    TransferContext.writeArguments(BOOL to short)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_PRINT_RESOURCES_IN_USE, NIL)
  }

  fun requestAttention() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_REQUEST_ATTENTION, NIL)
  }

  fun requestPermission(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_REQUEST_PERMISSION, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun requestPermissions(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_REQUEST_PERMISSIONS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun setIcon(icon: Image) {
    TransferContext.writeArguments(OBJECT to icon)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_ICON, NIL)
  }

  fun setImeActive(active: Boolean) {
    TransferContext.writeArguments(BOOL to active)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_IME_ACTIVE, NIL)
  }

  fun setImePosition(position: Vector2) {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_IME_POSITION, NIL)
  }

  fun setNativeIcon(filename: String) {
    TransferContext.writeArguments(STRING to filename)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_NATIVE_ICON, NIL)
  }

  fun setThreadName(name: String): GodotError {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_THREAD_NAME, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  fun setUseFileAccessSaveAndSwap(enabled: Boolean) {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS__OS_SET_USE_FILE_ACCESS_SAVE_AND_SWAP, NIL)
  }

  fun setWindowAlwaysOnTop(enabled: Boolean) {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_WINDOW_ALWAYS_ON_TOP, NIL)
  }

  fun setWindowTitle(title: String) {
    TransferContext.writeArguments(STRING to title)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SET_WINDOW_TITLE, NIL)
  }

  fun shellOpen(uri: String): GodotError {
    TransferContext.writeArguments(STRING to uri)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SHELL_OPEN, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  fun showVirtualKeyboard(existingText: String = "") {
    TransferContext.writeArguments(STRING to existingText)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__OS_SHOW_VIRTUAL_KEYBOARD, NIL)
  }

  enum class VideoDriver(
    id: Long
  ) {
    VIDEO_DRIVER_GLES3(0),

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
    SYSTEM_DIR_DESKTOP(0),

    SYSTEM_DIR_DCIM(1),

    SYSTEM_DIR_DOCUMENTS(2),

    SYSTEM_DIR_DOWNLOADS(3),

    SYSTEM_DIR_MOVIES(4),

    SYSTEM_DIR_MUSIC(5),

    SYSTEM_DIR_PICTURES(6),

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
    SCREEN_ORIENTATION_LANDSCAPE(0),

    SCREEN_ORIENTATION_PORTRAIT(1),

    SCREEN_ORIENTATION_REVERSE_LANDSCAPE(2),

    SCREEN_ORIENTATION_REVERSE_PORTRAIT(3),

    SCREEN_ORIENTATION_SENSOR_LANDSCAPE(4),

    SCREEN_ORIENTATION_SENSOR_PORTRAIT(5),

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
    POWERSTATE_UNKNOWN(0),

    POWERSTATE_ON_BATTERY(1),

    POWERSTATE_NO_BATTERY(2),

    POWERSTATE_CHARGING(3),

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
    MONTH_JANUARY(1),

    MONTH_FEBRUARY(2),

    MONTH_MARCH(3),

    MONTH_APRIL(4),

    MONTH_MAY(5),

    MONTH_JUNE(6),

    MONTH_JULY(7),

    MONTH_AUGUST(8),

    MONTH_SEPTEMBER(9),

    MONTH_OCTOBER(10),

    MONTH_NOVEMBER(11),

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
    DAY_SUNDAY(0),

    DAY_MONDAY(1),

    DAY_TUESDAY(2),

    DAY_WEDNESDAY(3),

    DAY_THURSDAY(4),

    DAY_FRIDAY(5),

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
