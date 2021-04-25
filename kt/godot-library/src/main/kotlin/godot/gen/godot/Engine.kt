// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.Dictionary
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * Access to engine properties.
 *
 * The [godot.Engine] singleton allows you to query and modify the project's run-time parameters, such as frames per second, time scale, and others.
 */
@GodotBaseType
object Engine : Object() {
  /**
   * If `true`, it is running inside the editor. Useful for tool scripts.
   */
  var editorHint: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__ENGINE_GET_EDITOR_HINT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__ENGINE_SET_EDITOR_HINT, NIL)
    }

  /**
   * The number of fixed iterations per second. This controls how often physics simulation and [godot.Node.PhysicsProcess] methods are run. This value should generally always be set to `60` or above, as Godot doesn't interpolate the physics step. As a result, values lower than `60` will look stuttery. This value can be increased to make input more reactive or work around tunneling issues, but keep in mind doing so will increase CPU usage.
   */
  var iterationsPerSecond: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__ENGINE_GET_ITERATIONS_PER_SECOND,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__ENGINE_SET_ITERATIONS_PER_SECOND,
          NIL)
    }

  /**
   * Controls how much physics ticks are synchronized with real time. For 0 or less, the ticks are synchronized. Such values are recommended for network games, where clock synchronization matters. Higher values cause higher deviation of in-game clock and real clock, but allows to smooth out framerate jitters. The default value of 0.5 should be fine for most; values above 2 could cause the game to react to dropped frames with a noticeable delay and are not recommended.
   */
  var physicsJitterFix: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__ENGINE_GET_PHYSICS_JITTER_FIX,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__ENGINE_SET_PHYSICS_JITTER_FIX,
          NIL)
    }

  /**
   * The desired frames per second. If the hardware cannot keep up, this setting may not be respected. A value of 0 means no limit.
   */
  var targetFps: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__ENGINE_GET_TARGET_FPS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__ENGINE_SET_TARGET_FPS, NIL)
    }

  /**
   * Controls how fast or slow the in-game clock ticks versus the real life one. It defaults to 1.0. A value of 2.0 means the game moves twice as fast as real life, whilst a value of 0.5 means the game moves at half the regular speed.
   */
  var timeScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__ENGINE_GET_TIME_SCALE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__ENGINE_SET_TIME_SCALE, NIL)
    }

  override fun __new() {
    rawPtr = TransferContext.getSingleton(ENGINESINGLETON_ENGINE)
  }

  override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  /**
   * Returns engine author information in a Dictionary.
   *
   * `lead_developers`    - Array of Strings, lead developer names
   *
   * `founders`           - Array of Strings, founder names
   *
   * `project_managers`   - Array of Strings, project manager names
   *
   * `developers`         - Array of Strings, developer names
   */
  fun getAuthorInfo(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__ENGINE_GET_AUTHOR_INFO, DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  /**
   * Returns an Array of copyright information Dictionaries.
   *
   * `name`    - String, component name
   *
   * `parts`   - Array of Dictionaries {`files`, `copyright`, `license`} describing subsections of the component
   */
  fun getCopyrightInfo(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__ENGINE_GET_COPYRIGHT_INFO, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns a Dictionary of Arrays of donor names.
   *
   * {`platinum_sponsors`, `gold_sponsors`, `silver_sponsors`, `bronze_sponsors`, `mini_sponsors`, `gold_donors`, `silver_donors`, `bronze_donors`}
   */
  fun getDonorInfo(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__ENGINE_GET_DONOR_INFO, DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  /**
   * Returns the total number of frames drawn. If the render loop is disabled with `--disable-render-loop` via command line, this returns `0`. See also [getIdleFrames].
   */
  fun getFramesDrawn(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__ENGINE_GET_FRAMES_DRAWN, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the frames per second of the running game.
   */
  fun getFramesPerSecond(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__ENGINE_GET_FRAMES_PER_SECOND,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the total number of frames passed since engine initialization which is advanced on each **idle frame**, regardless of whether the render loop is enabled. See also [getFramesDrawn].
   */
  fun getIdleFrames(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__ENGINE_GET_IDLE_FRAMES, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns Dictionary of licenses used by Godot and included third party components.
   */
  fun getLicenseInfo(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__ENGINE_GET_LICENSE_INFO,
        DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  /**
   * Returns Godot license text.
   */
  fun getLicenseText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__ENGINE_GET_LICENSE_TEXT, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the main loop object (see [godot.MainLoop] and [godot.SceneTree]).
   */
  fun getMainLoop(): MainLoop? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__ENGINE_GET_MAIN_LOOP, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as MainLoop?
  }

  /**
   * Returns the total number of frames passed since engine initialization which is advanced on each **physics frame**.
   */
  fun getPhysicsFrames(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__ENGINE_GET_PHYSICS_FRAMES, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the fraction through the current physics tick we are at the time of rendering the frame. This can be used to implement fixed timestep interpolation.
   */
  fun getPhysicsInterpolationFraction(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS__ENGINE_GET_PHYSICS_INTERPOLATION_FRACTION, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns a global singleton with given `name`. Often used for plugins, e.g. `GodotPayment` on Android.
   */
  fun getSingleton(name: String): Object? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__ENGINE_GET_SINGLETON, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Object?
  }

  /**
   * Returns the current engine version information in a Dictionary.
   *
   * `major`    - Holds the major version number as an int
   *
   * `minor`    - Holds the minor version number as an int
   *
   * `patch`    - Holds the patch version number as an int
   *
   * `hex`      - Holds the full version number encoded as a hexadecimal int with one byte (2 places) per number (see example below)
   *
   * `status`   - Holds the status (e.g. "beta", "rc1", "rc2", ... "stable") as a String
   *
   * `build`    - Holds the build name (e.g. "custom_build") as a String
   *
   * `hash`     - Holds the full Git commit hash as a String
   *
   * `year`     - Holds the year the version was released in as an int
   *
   * `string`   - `major` + `minor` + `patch` + `status` + `build` in a single String
   *
   * The `hex` value is encoded as follows, from left to right: one byte for the major, one byte for the minor, one byte for the patch version. For example, "3.1.12" would be `0x03010C`. **Note:** It's still an int internally, and printing it will give you its decimal representation, which is not particularly meaningful. Use hexadecimal literals for easy version comparisons from code:
   *
   * ```
   * 				if Engine.get_version_info().hex >= 0x030200:
   * 				    # Do things specific to version 3.2 or later
   * 				else:
   * 				    # Do things specific to versions before 3.2
   * 				```
   */
  fun getVersionInfo(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__ENGINE_GET_VERSION_INFO,
        DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  /**
   * Returns `true` if a singleton with given `name` exists in global scope.
   */
  fun hasSingleton(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__ENGINE_HAS_SINGLETON, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the game is inside the fixed process and physics phase of the game loop.
   */
  fun isInPhysicsFrame(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__ENGINE_IS_IN_PHYSICS_FRAME, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }
}
