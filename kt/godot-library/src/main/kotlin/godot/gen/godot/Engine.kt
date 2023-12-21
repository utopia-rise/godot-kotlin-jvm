// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.TypeManager
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
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * The [Engine] singleton allows you to query and modify the project's run-time parameters, such as
 * frames per second, time scale, and others.
 */
@GodotBaseType
public object Engine : Object() {
  public override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_ENGINE)
    return false
  }

  public fun setPhysicsTicksPerSecond(physicsTicksPerSecond: Int): Unit {
    TransferContext.writeArguments(LONG to physicsTicksPerSecond.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setPhysicsTicksPerSecondPtr, NIL)
  }

  public fun getPhysicsTicksPerSecond(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPhysicsTicksPerSecondPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setMaxPhysicsStepsPerFrame(maxPhysicsSteps: Int): Unit {
    TransferContext.writeArguments(LONG to maxPhysicsSteps.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setMaxPhysicsStepsPerFramePtr, NIL)
  }

  public fun getMaxPhysicsStepsPerFrame(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMaxPhysicsStepsPerFramePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setPhysicsJitterFix(physicsJitterFix: Double): Unit {
    TransferContext.writeArguments(DOUBLE to physicsJitterFix)
    TransferContext.callMethod(rawPtr, MethodBindings.setPhysicsJitterFixPtr, NIL)
  }

  public fun getPhysicsJitterFix(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPhysicsJitterFixPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  /**
   * Returns the fraction through the current physics tick we are at the time of rendering the
   * frame. This can be used to implement fixed timestep interpolation.
   */
  public fun getPhysicsInterpolationFraction(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPhysicsInterpolationFractionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  public fun setMaxFps(maxFps: Int): Unit {
    TransferContext.writeArguments(LONG to maxFps.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setMaxFpsPtr, NIL)
  }

  public fun getMaxFps(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMaxFpsPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setTimeScale(timeScale: Double): Unit {
    TransferContext.writeArguments(DOUBLE to timeScale)
    TransferContext.callMethod(rawPtr, MethodBindings.setTimeScalePtr, NIL)
  }

  public fun getTimeScale(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTimeScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  /**
   * Returns the total number of frames drawn. On headless platforms, or if the render loop is
   * disabled with `--disable-render-loop` via command line, [getFramesDrawn] always returns `0`. See
   * [getProcessFrames].
   */
  public fun getFramesDrawn(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFramesDrawnPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the frames per second of the running game.
   */
  public fun getFramesPerSecond(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFramesPerSecondPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  /**
   * Returns the total number of frames passed since engine initialization which is advanced on each
   * **physics frame**. See also [getProcessFrames].
   * [getPhysicsFrames] can be used to run expensive logic less often without relying on a [Timer]:
   *
   * gdscript:
   * ```gdscript
   * func _physics_process(_delta):
   *     if Engine.get_physics_frames() &#37; 2 == 0:
   *         pass  # Run expensive logic only once every 2 physics frames here.
   * ```
   * csharp:
   * ```csharp
   * public override void _PhysicsProcess(double delta)
   * {
   *     base._PhysicsProcess(delta);
   *
   *     if (Engine.GetPhysicsFrames() &#37; 2 == 0)
   *     {
   *         // Run expensive logic only once every 2 physics frames here.
   *     }
   * }
   * ```
   */
  public fun getPhysicsFrames(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPhysicsFramesPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns the total number of frames passed since engine initialization which is advanced on each
   * **process frame**, regardless of whether the render loop is enabled. See also [getFramesDrawn] and
   * [getPhysicsFrames].
   * [getProcessFrames] can be used to run expensive logic less often without relying on a [Timer]:
   *
   * gdscript:
   * ```gdscript
   * func _process(_delta):
   *     if Engine.get_process_frames() &#37; 2 == 0:
   *         pass  # Run expensive logic only once every 2 process (render) frames here.
   * ```
   * csharp:
   * ```csharp
   * public override void _Process(double delta)
   * {
   *     base._Process(delta);
   *
   *     if (Engine.GetProcessFrames() &#37; 2 == 0)
   *     {
   *         // Run expensive logic only once every 2 physics frames here.
   *     }
   * }
   * ```
   */
  public fun getProcessFrames(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getProcessFramesPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns the main loop object (see [MainLoop] and [SceneTree]).
   */
  public fun getMainLoop(): MainLoop? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMainLoopPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as MainLoop?)
  }

  /**
   * Returns the current engine version information in a Dictionary.
   * `major`    - Holds the major version number as an int
   * `minor`    - Holds the minor version number as an int
   * `patch`    - Holds the patch version number as an int
   * `hex`      - Holds the full version number encoded as a hexadecimal int with one byte (2
   * places) per number (see example below)
   * `status`   - Holds the status (e.g. "beta", "rc1", "rc2", ... "stable") as a String
   * `build`    - Holds the build name (e.g. "custom_build") as a String
   * `hash`     - Holds the full Git commit hash as a String
   * `year`     - Holds the year the version was released in as an int
   * `string`   - `major` + `minor` + `patch` + `status` + `build` in a single String
   * The `hex` value is encoded as follows, from left to right: one byte for the major, one byte for
   * the minor, one byte for the patch version. For example, "3.1.12" would be `0x03010C`. **Note:**
   * It's still an int internally, and printing it will give you its decimal representation, which is
   * not particularly meaningful. Use hexadecimal literals for easy version comparisons from code:
   *
   * gdscript:
   * ```gdscript
   * if Engine.get_version_info().hex >= 0x030200:
   *     # Do things specific to version 3.2 or later
   * else:
   *     # Do things specific to versions before 3.2
   * ```
   * csharp:
   * ```csharp
   * if ((int)Engine.GetVersionInfo()["hex"] >= 0x030200)
   * {
   *     // Do things specific to version 3.2 or later
   * }
   * else
   * {
   *     // Do things specific to versions before 3.2
   * }
   * ```
   */
  public fun getVersionInfo(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVersionInfoPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Returns engine author information in a Dictionary.
   * `lead_developers`    - Array of Strings, lead developer names
   * `founders`           - Array of Strings, founder names
   * `project_managers`   - Array of Strings, project manager names
   * `developers`         - Array of Strings, developer names
   */
  public fun getAuthorInfo(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAuthorInfoPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Returns an Array of copyright information Dictionaries.
   * `name`    - String, component name
   * `parts`   - Array of Dictionaries {`files`, `copyright`, `license`} describing subsections of
   * the component
   */
  public fun getCopyrightInfo(): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCopyrightInfoPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Returns a Dictionary of Arrays of donor names.
   * {`platinum_sponsors`, `gold_sponsors`, `silver_sponsors`, `bronze_sponsors`, `mini_sponsors`,
   * `gold_donors`, `silver_donors`, `bronze_donors`}
   */
  public fun getDonorInfo(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDonorInfoPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Returns Dictionary of licenses used by Godot and included third party components.
   */
  public fun getLicenseInfo(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLicenseInfoPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Returns Godot license text.
   */
  public fun getLicenseText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLicenseTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the name of the CPU architecture the Godot binary was built for. Possible return values
   * are `x86_64`, `x86_32`, `arm64`, `arm32`, `rv64`, `riscv`, `ppc64`, `ppc`, `wasm64` and `wasm32`.
   * To detect whether the current CPU architecture is 64-bit, you can use the fact that all 64-bit
   * architecture names have `64` in their name:
   *
   * gdscript:
   * ```gdscript
   * if "64" in Engine.get_architecture_name():
   *     print("Running a 64-bit build of Godot.")
   * else:
   *     print("Running a 32-bit build of Godot.")
   * ```
   * csharp:
   * ```csharp
   * if (Engine.GetArchitectureName().Contains("64"))
   *     GD.Print("Running a 64-bit build of Godot.");
   * else
   *     GD.Print("Running a 32-bit build of Godot.");
   * ```
   *
   * **Note:** [getArchitectureName] does *not* return the name of the host CPU architecture. For
   * example, if running an x86_32 Godot binary on a x86_64 system, the returned value will be
   * `x86_32`.
   */
  public fun getArchitectureName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getArchitectureNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns `true` if the game is inside the fixed process and physics phase of the game loop.
   */
  public fun isInPhysicsFrame(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isInPhysicsFramePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if a singleton with given [name] exists in global scope.
   */
  public fun hasSingleton(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.hasSingletonPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns a global singleton with given [name]. Often used for plugins, e.g. GodotPayments.
   */
  public fun getSingleton(name: StringName): Object? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.getSingletonPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Object?)
  }

  /**
   * Registers the given object as a singleton, globally available under [name].
   */
  public fun registerSingleton(name: StringName, instance: Object): Unit {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to instance)
    TransferContext.callMethod(rawPtr, MethodBindings.registerSingletonPtr, NIL)
  }

  /**
   * Unregisters the singleton registered under [name]. The singleton object is not freed. Only
   * works with user-defined singletons created with [registerSingleton].
   */
  public fun unregisterSingleton(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.unregisterSingletonPtr, NIL)
  }

  /**
   * Returns a list of available global singletons.
   */
  public fun getSingletonList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSingletonListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Registers a [ScriptLanguage] instance to be available with `ScriptServer`.
   * Returns:
   * - [OK] on success
   * - [ERRUNAVAILABLE] if `ScriptServer` has reached it limit and cannot register any new language
   * - [ERRALREADYEXISTS] if `ScriptServer` already contains a language with similar
   * extension/name/type
   */
  public fun registerScriptLanguage(language: ScriptLanguage): GodotError {
    TransferContext.writeArguments(OBJECT to language)
    TransferContext.callMethod(rawPtr, MethodBindings.registerScriptLanguagePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Unregisters the [ScriptLanguage] instance from `ScriptServer`.
   * Returns:
   * - [OK] on success
   * - [ERRDOESNOTEXIST] if the language is already not registered in `ScriptServer`
   */
  public fun unregisterScriptLanguage(language: ScriptLanguage): GodotError {
    TransferContext.writeArguments(OBJECT to language)
    TransferContext.callMethod(rawPtr, MethodBindings.unregisterScriptLanguagePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the number of available script languages. Use with [getScriptLanguage].
   */
  public fun getScriptLanguageCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getScriptLanguageCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns an instance of a [ScriptLanguage] with the given index.
   */
  public fun getScriptLanguage(index: Int): ScriptLanguage? {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getScriptLanguagePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as ScriptLanguage?)
  }

  /**
   * Returns `true` if the script is currently running inside the editor, `false` otherwise. This is
   * useful for `@tool` scripts to conditionally draw editor helpers, or prevent accidentally running
   * "game" code that would affect the scene state while in the editor:
   *
   * gdscript:
   * ```gdscript
   * if Engine.is_editor_hint():
   *     draw_gizmos()
   * else:
   *     simulate_physics()
   * ```
   * csharp:
   * ```csharp
   * if (Engine.IsEditorHint())
   *     DrawGizmos();
   * else
   *     SimulatePhysics();
   * ```
   *
   * See [url=$DOCS_URL/tutorials/plugins/running_code_in_the_editor.html]Running code in the
   * editor[/url] in the documentation for more information.
   * **Note:** To detect whether the script is run from an editor *build* (e.g. when pressing
   * [kbd]F5[/kbd]), use [OS.hasFeature] with the `"editor"` argument instead.
   * `OS.has_feature("editor")` will evaluate to `true` both when the code is running in the editor and
   * when running the project from the editor, but it will evaluate to `false` when the code is run
   * from an exported project.
   */
  public fun isEditorHint(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isEditorHintPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the path to the [MovieWriter]'s output file, or an empty string if the engine wasn't
   * started in Movie Maker mode. This path can be absolute or relative depending on how the user
   * specified it.
   */
  public fun getWriteMoviePath(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getWriteMoviePathPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun setPrintErrorMessages(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setPrintErrorMessagesPtr, NIL)
  }

  public fun isPrintingErrorMessages(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isPrintingErrorMessagesPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  internal object MethodBindings {
    public val setPhysicsTicksPerSecondPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "set_physics_ticks_per_second")

    public val getPhysicsTicksPerSecondPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_physics_ticks_per_second")

    public val setMaxPhysicsStepsPerFramePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "set_max_physics_steps_per_frame")

    public val getMaxPhysicsStepsPerFramePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_max_physics_steps_per_frame")

    public val setPhysicsJitterFixPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "set_physics_jitter_fix")

    public val getPhysicsJitterFixPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_physics_jitter_fix")

    public val getPhysicsInterpolationFractionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_physics_interpolation_fraction")

    public val setMaxFpsPtr: VoidPtr = TypeManager.getMethodBindPtr("Engine", "set_max_fps")

    public val getMaxFpsPtr: VoidPtr = TypeManager.getMethodBindPtr("Engine", "get_max_fps")

    public val setTimeScalePtr: VoidPtr = TypeManager.getMethodBindPtr("Engine", "set_time_scale")

    public val getTimeScalePtr: VoidPtr = TypeManager.getMethodBindPtr("Engine", "get_time_scale")

    public val getFramesDrawnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_frames_drawn")

    public val getFramesPerSecondPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_frames_per_second")

    public val getPhysicsFramesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_physics_frames")

    public val getProcessFramesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_process_frames")

    public val getMainLoopPtr: VoidPtr = TypeManager.getMethodBindPtr("Engine", "get_main_loop")

    public val getVersionInfoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_version_info")

    public val getAuthorInfoPtr: VoidPtr = TypeManager.getMethodBindPtr("Engine", "get_author_info")

    public val getCopyrightInfoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_copyright_info")

    public val getDonorInfoPtr: VoidPtr = TypeManager.getMethodBindPtr("Engine", "get_donor_info")

    public val getLicenseInfoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_license_info")

    public val getLicenseTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_license_text")

    public val getArchitectureNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_architecture_name")

    public val isInPhysicsFramePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "is_in_physics_frame")

    public val hasSingletonPtr: VoidPtr = TypeManager.getMethodBindPtr("Engine", "has_singleton")

    public val getSingletonPtr: VoidPtr = TypeManager.getMethodBindPtr("Engine", "get_singleton")

    public val registerSingletonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "register_singleton")

    public val unregisterSingletonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "unregister_singleton")

    public val getSingletonListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_singleton_list")

    public val registerScriptLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "register_script_language")

    public val unregisterScriptLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "unregister_script_language")

    public val getScriptLanguageCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_script_language_count")

    public val getScriptLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_script_language")

    public val isEditorHintPtr: VoidPtr = TypeManager.getMethodBindPtr("Engine", "is_editor_hint")

    public val getWriteMoviePathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_write_movie_path")

    public val setPrintErrorMessagesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "set_print_error_messages")

    public val isPrintingErrorMessagesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "is_printing_error_messages")
  }
}
