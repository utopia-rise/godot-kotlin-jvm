// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Access to engine properties.
 *
 * The [godot.Engine] singleton allows you to query and modify the project's run-time parameters, such as frames per second, time scale, and others.
 */
@GodotBaseType
public object Engine : Object() {
  public override fun __new(): Unit {
    rawPtr = TransferContext.getSingleton(ENGINECLASS_ENGINE)
  }

  public override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  public open fun setPhysicsTicksPerSecond(physicsTicksPerSecond: Long): Unit {
    TransferContext.writeArguments(LONG to physicsTicksPerSecond)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENGINE_SET_PHYSICS_TICKS_PER_SECOND,
        NIL)
  }

  public open fun getPhysicsTicksPerSecond(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENGINE_GET_PHYSICS_TICKS_PER_SECOND,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public open fun setPhysicsJitterFix(physicsJitterFix: Double): Unit {
    TransferContext.writeArguments(DOUBLE to physicsJitterFix)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENGINE_SET_PHYSICS_JITTER_FIX, NIL)
  }

  public open fun getPhysicsJitterFix(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENGINE_GET_PHYSICS_JITTER_FIX,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the fraction through the current physics tick we are at the time of rendering the frame. This can be used to implement fixed timestep interpolation.
   */
  public open fun getPhysicsInterpolationFraction(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ENGINE_GET_PHYSICS_INTERPOLATION_FRACTION, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  public open fun setTargetFps(targetFps: Long): Unit {
    TransferContext.writeArguments(LONG to targetFps)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENGINE_SET_TARGET_FPS, NIL)
  }

  public open fun getTargetFps(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENGINE_GET_TARGET_FPS, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public open fun setTimeScale(timeScale: Double): Unit {
    TransferContext.writeArguments(DOUBLE to timeScale)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENGINE_SET_TIME_SCALE, NIL)
  }

  public open fun getTimeScale(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENGINE_GET_TIME_SCALE, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the total number of frames drawn. On headless platforms, or if the render loop is disabled with `--disable-render-loop` via command line, [getFramesDrawn] always returns `0`. See [getProcessFrames].
   */
  public open fun getFramesDrawn(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENGINE_GET_FRAMES_DRAWN, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the frames per second of the running game.
   */
  public open fun getFramesPerSecond(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENGINE_GET_FRAMES_PER_SECOND,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the total number of frames passed since engine initialization which is advanced on each **physics frame**. See also [getProcessFrames].
   *
   * [getPhysicsFrames] can be used to run expensive logic less often without relying on a [godot.Timer]:
   *
   * ```
   * 				func _physics_process(_delta):
   * 				    if Engine.get_physics_frames() % 2 == 0:
   * 				        pass  # Run expensive logic only once every 2 physics frames here.
   * 				```
   */
  public open fun getPhysicsFrames(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENGINE_GET_PHYSICS_FRAMES, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the total number of frames passed since engine initialization which is advanced on each **process frame**, regardless of whether the render loop is enabled. See also [getFramesDrawn] and [getPhysicsFrames].
   *
   * [getProcessFrames] can be used to run expensive logic less often without relying on a [godot.Timer]:
   *
   * ```
   * 				func _process(_delta):
   * 				    if Engine.get_process_frames() % 2 == 0:
   * 				        pass  # Run expensive logic only once every 2 process (render) frames here.
   * 				```
   */
  public open fun getProcessFrames(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENGINE_GET_PROCESS_FRAMES, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the main loop object (see [godot.MainLoop] and [godot.SceneTree]).
   */
  public open fun getMainLoop(): MainLoop? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENGINE_GET_MAIN_LOOP, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as MainLoop?
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
   * [codeblocks]
   *
   * [gdscript]
   *
   * if Engine.get_version_info().hex >= 0x030200:
   *
   *     # Do things specific to version 3.2 or later
   *
   * else:
   *
   *     # Do things specific to versions before 3.2
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * if ((int)Engine.GetVersionInfo()["hex"] >= 0x030200)
   *
   * {
   *
   *     // Do things specific to version 3.2 or later
   *
   * }
   *
   * else
   *
   * {
   *
   *     // Do things specific to versions before 3.2
   *
   * }
   *
   * [/csharp]
   *
   * [/codeblocks]
   */
  public open fun getVersionInfo(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENGINE_GET_VERSION_INFO, DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

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
  public open fun getAuthorInfo(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENGINE_GET_AUTHOR_INFO, DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  /**
   * Returns an Array of copyright information Dictionaries.
   *
   * `name`    - String, component name
   *
   * `parts`   - Array of Dictionaries {`files`, `copyright`, `license`} describing subsections of the component
   */
  public open fun getCopyrightInfo(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENGINE_GET_COPYRIGHT_INFO, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns a Dictionary of Arrays of donor names.
   *
   * {`platinum_sponsors`, `gold_sponsors`, `silver_sponsors`, `bronze_sponsors`, `mini_sponsors`, `gold_donors`, `silver_donors`, `bronze_donors`}
   */
  public open fun getDonorInfo(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENGINE_GET_DONOR_INFO, DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  /**
   * Returns Dictionary of licenses used by Godot and included third party components.
   */
  public open fun getLicenseInfo(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENGINE_GET_LICENSE_INFO, DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  /**
   * Returns Godot license text.
   */
  public open fun getLicenseText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENGINE_GET_LICENSE_TEXT, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns `true` if the game is inside the fixed process and physics phase of the game loop.
   */
  public open fun isInPhysicsFrame(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENGINE_IS_IN_PHYSICS_FRAME, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if a singleton with given `name` exists in global scope.
   */
  public open fun hasSingleton(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENGINE_HAS_SINGLETON, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns a global singleton with given `name`. Often used for plugins, e.g. GodotPayments.
   */
  public open fun getSingleton(name: StringName): Object? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENGINE_GET_SINGLETON, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Object?
  }

  /**
   *
   */
  public open fun registerSingleton(name: StringName, instance: Object): Unit {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to instance)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENGINE_REGISTER_SINGLETON, NIL)
  }

  /**
   *
   */
  public open fun unregisterSingleton(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENGINE_UNREGISTER_SINGLETON, NIL)
  }

  /**
   *
   */
  public open fun getSingletonList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENGINE_GET_SINGLETON_LIST,
        PACKED_STRING_ARRAY)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  /**
   * Returns `true` if the script is currently running inside the editor, `false` otherwise. This is useful for `@tool` scripts to conditionally draw editor helpers, or prevent accidentally running "game" code that would affect the scene state while in the editor:
   *
   * ```
   * 				if Engine.is_editor_hint():
   * 				    draw_gizmos()
   * 				else:
   * 				    simulate_physics()
   * 				```
   *
   * See [godot.Running code in the editor]($DOCS_URL/tutorials/plugins/running_code_in_the_editor.html) in the documentation for more information.
   *
   * **Note:** To detect whether the script is run from an editor *build* (e.g. when pressing [kbd]F5[/kbd]), use [godot.OS.hasFeature] with the `"editor"` argument instead. `OS.has_feature("editor")` will evaluate to `true` both when the code is running in the editor and when running the project from the editor, but it will evaluate to `false` when the code is run from an exported project.
   */
  public open fun isEditorHint(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENGINE_IS_EDITOR_HINT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public open fun setPrintErrorMessages(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENGINE_SET_PRINT_ERROR_MESSAGES,
        NIL)
  }

  public open fun isPrintingErrorMessages(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENGINE_IS_PRINTING_ERROR_MESSAGES,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }
}
