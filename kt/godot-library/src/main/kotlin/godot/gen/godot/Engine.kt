// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DICTIONARY
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_STRING_ARRAY
import godot.core.VariantParser.STRING
import godot.core.VariantParser.STRING_NAME
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
import kotlin.jvm.JvmStatic

/**
 * The [Engine] singleton allows you to query and modify the project's run-time parameters, such as
 * frames per second, time scale, and others. It also stores information about the current build of
 * Godot, such as the current version.
 */
@GodotBaseType
public object Engine : Object() {
  public override fun new(scriptIndex: Int): Unit {
    getSingleton(ENGINECLASS_ENGINE)
  }

  @JvmStatic
  public final fun setPhysicsTicksPerSecond(physicsTicksPerSecond: Int): Unit {
    TransferContext.writeArguments(LONG to physicsTicksPerSecond.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setPhysicsTicksPerSecondPtr, NIL)
  }

  @JvmStatic
  public final fun getPhysicsTicksPerSecond(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPhysicsTicksPerSecondPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  @JvmStatic
  public final fun setMaxPhysicsStepsPerFrame(maxPhysicsSteps: Int): Unit {
    TransferContext.writeArguments(LONG to maxPhysicsSteps.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setMaxPhysicsStepsPerFramePtr, NIL)
  }

  @JvmStatic
  public final fun getMaxPhysicsStepsPerFrame(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMaxPhysicsStepsPerFramePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  @JvmStatic
  public final fun setPhysicsJitterFix(physicsJitterFix: Double): Unit {
    TransferContext.writeArguments(DOUBLE to physicsJitterFix)
    TransferContext.callMethod(rawPtr, MethodBindings.setPhysicsJitterFixPtr, NIL)
  }

  @JvmStatic
  public final fun getPhysicsJitterFix(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPhysicsJitterFixPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  /**
   * Returns the fraction through the current physics tick we are at the time of rendering the
   * frame. This can be used to implement fixed timestep interpolation.
   */
  @JvmStatic
  public final fun getPhysicsInterpolationFraction(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPhysicsInterpolationFractionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  @JvmStatic
  public final fun setMaxFps(maxFps: Int): Unit {
    TransferContext.writeArguments(LONG to maxFps.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setMaxFpsPtr, NIL)
  }

  @JvmStatic
  public final fun getMaxFps(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMaxFpsPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  @JvmStatic
  public final fun setTimeScale(timeScale: Double): Unit {
    TransferContext.writeArguments(DOUBLE to timeScale)
    TransferContext.callMethod(rawPtr, MethodBindings.setTimeScalePtr, NIL)
  }

  @JvmStatic
  public final fun getTimeScale(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTimeScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  /**
   * Returns the total number of frames drawn since the engine started.
   * **Note:** On headless platforms, or if rendering is disabled with `--disable-render-loop` via
   * command line, this method always returns `0`. See also [getProcessFrames].
   */
  @JvmStatic
  public final fun getFramesDrawn(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFramesDrawnPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the average frames rendered every second (FPS), also known as the framerate.
   */
  @JvmStatic
  public final fun getFramesPerSecond(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFramesPerSecondPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  /**
   * Returns the total number of frames passed since the engine started. This number is increased
   * every **physics frame**. See also [getProcessFrames].
   * This method can be used to run expensive logic less often without relying on a [Timer]:
   *
   * gdscript:
   * ```gdscript
   * func _physics_process(_delta):
   *     if Engine.get_physics_frames() &#37; 2 == 0:
   *         pass # Run expensive logic only once every 2 physics frames here.
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
  @JvmStatic
  public final fun getPhysicsFrames(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPhysicsFramesPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the total number of frames passed since the engine started. This number is increased
   * every **process frame**, regardless of whether the render loop is enabled. See also
   * [getFramesDrawn] and [getPhysicsFrames].
   * This method can be used to run expensive logic less often without relying on a [Timer]:
   *
   * gdscript:
   * ```gdscript
   * func _process(_delta):
   *     if Engine.get_process_frames() &#37; 5 == 0:
   *         pass # Run expensive logic only once every 5 process (render) frames here.
   * ```
   * csharp:
   * ```csharp
   * public override void _Process(double delta)
   * {
   *     base._Process(delta);
   *
   *     if (Engine.GetProcessFrames() &#37; 5 == 0)
   *     {
   *         // Run expensive logic only once every 5 process (render) frames here.
   *     }
   * }
   * ```
   */
  @JvmStatic
  public final fun getProcessFrames(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getProcessFramesPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the instance of the [MainLoop]. This is usually the main [SceneTree] and is the same as
   * [Node.getTree].
   * **Note:** The type instantiated as the main loop can changed with
   * [ProjectSettings.application/run/mainLoopType].
   */
  @JvmStatic
  public final fun getMainLoop(): MainLoop? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMainLoopPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as MainLoop?)
  }

  /**
   * Returns the current engine version information as a [Dictionary] containing the following
   * entries:
   * - `major` - Major version number as an int;
   * - `minor` - Minor version number as an int;
   * - `patch` - Patch version number as an int;
   * - `hex` - Full version encoded as a hexadecimal int with one byte (2 hex digits) per number
   * (see example below);
   * - `status` - Status (such as "beta", "rc1", "rc2", "stable", etc.) as a String;
   * - `build` - Build name (e.g. "custom_build") as a String;
   * - `hash` - Full Git commit hash as a String;
   * - `timestamp` - Holds the Git commit date UNIX timestamp in seconds as an int, or `0` if
   * unavailable;
   * - `string` - `major`, `minor`, `patch`, `status`, and `build` in a single String.
   * The `hex` value is encoded as follows, from left to right: one byte for the major, one byte for
   * the minor, one byte for the patch version. For example, "3.1.12" would be `0x03010C`.
   * **Note:** The `hex` value is still an [int] internally, and printing it will give you its
   * decimal representation, which is not particularly meaningful. Use hexadecimal literals for quick
   * version comparisons from code:
   *
   * gdscript:
   * ```gdscript
   * if Engine.get_version_info().hex >= 0x040100:
   *     pass # Do things specific to version 4.1 or later.
   * else:
   *     pass # Do things specific to versions before 4.1.
   * ```
   * csharp:
   * ```csharp
   * if ((int)Engine.GetVersionInfo()["hex"] >= 0x040100)
   * {
   *     // Do things specific to version 4.1 or later.
   * }
   * else
   * {
   *     // Do things specific to versions before 4.1.
   * }
   * ```
   */
  @JvmStatic
  public final fun getVersionInfo(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVersionInfoPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  /**
   * Returns the engine author information as a [Dictionary], where each entry is an [Array] of
   * strings with the names of notable contributors to the Godot Engine: `lead_developers`, `founders`,
   * `project_managers`, and `developers`.
   */
  @JvmStatic
  public final fun getAuthorInfo(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAuthorInfoPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  /**
   * Returns an [Array] of dictionaries with copyright information for every component of Godot's
   * source code.
   * Every [Dictionary] contains a `name` identifier, and a `parts` array of dictionaries. It
   * describes the component in detail with the following entries:
   * - `files` - [Array] of file paths from the source code affected by this component;
   * - `copyright` - [Array] of owners of this component;
   * - `license` - The license applied to this component (such as
   * "[url=https://en.wikipedia.org/wiki/MIT_License#Ambiguity_and_variants]Expat[/url]" or
   * "[url=https://creativecommons.org/licenses/by/4.0/]CC-BY-4.0[/url]").
   */
  @JvmStatic
  public final fun getCopyrightInfo(): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCopyrightInfoPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Returns a [Dictionary] of categorized donor names. Each entry is an [Array] of strings:
   * {`platinum_sponsors`, `gold_sponsors`, `silver_sponsors`, `bronze_sponsors`, `mini_sponsors`,
   * `gold_donors`, `silver_donors`, `bronze_donors`}
   */
  @JvmStatic
  public final fun getDonorInfo(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDonorInfoPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  /**
   * Returns a [Dictionary] of licenses used by Godot and included third party components. Each
   * entry is a license name (such as
   * "[url=https://en.wikipedia.org/wiki/MIT_License#Ambiguity_and_variants]Expat[/url]") and its
   * associated text.
   */
  @JvmStatic
  public final fun getLicenseInfo(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLicenseInfoPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  /**
   * Returns the full Godot license text.
   */
  @JvmStatic
  public final fun getLicenseText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLicenseTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the name of the CPU architecture the Godot binary was built for. Possible return values
   * include `"x86_64"`, `"x86_32"`, `"arm64"`, `"arm32"`, `"rv64"`, `"riscv"`, `"ppc64"`, `"ppc"`,
   * `"wasm64"`, and `"wasm32"`.
   * To detect whether the current build is 64-bit, you can use the fact that all 64-bit
   * architecture names contain `64` in their name:
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
   * **Note:** This method does *not* return the name of the system's CPU architecture (like
   * [OS.getProcessorName]). For example, when running an `x86_32` Godot binary on an `x86_64` system,
   * the returned value will still be `"x86_32"`.
   */
  @JvmStatic
  public final fun getArchitectureName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getArchitectureNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns `true` if the engine is inside the fixed physics process step of the main loop.
   * [codeblock]
   * func _enter_tree():
   *     # Depending on when the node is added to the tree,
   *     # prints either "true" or "false".
   *     print(Engine.is_in_physics_frame())
   *
   * func _process(delta):
   *     print(Engine.is_in_physics_frame()) # Prints false
   *
   * func _physics_process(delta):
   *     print(Engine.is_in_physics_frame()) # Prints true
   * [/codeblock]
   */
  @JvmStatic
  public final fun isInPhysicsFrame(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isInPhysicsFramePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if a singleton with the given [name] exists in the global scope. See also
   * [getSingleton].
   *
   * gdscript:
   * ```gdscript
   * print(Engine.has_singleton("OS"))          # Prints true
   * print(Engine.has_singleton("Engine"))      # Prints true
   * print(Engine.has_singleton("AudioServer")) # Prints true
   * print(Engine.has_singleton("Unknown"))     # Prints false
   * ```
   * csharp:
   * ```csharp
   * GD.Print(Engine.HasSingleton("OS"));          // Prints true
   * GD.Print(Engine.HasSingleton("Engine"));      // Prints true
   * GD.Print(Engine.HasSingleton("AudioServer")); // Prints true
   * GD.Print(Engine.HasSingleton("Unknown"));     // Prints false
   * ```
   *
   * **Note:** Global singletons are not the same as autoloaded nodes, which are configurable in the
   * project settings.
   */
  @JvmStatic
  public final fun hasSingleton(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.hasSingletonPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the global singleton with the given [name], or `null` if it does not exist. Often used
   * for plugins. See also [hasSingleton] and [getSingletonList].
   * **Note:** Global singletons are not the same as autoloaded nodes, which are configurable in the
   * project settings.
   */
  @JvmStatic
  public final fun getSingleton(name: StringName): Object? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.getSingletonPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Object?)
  }

  /**
   * Registers the given [Object] [instance] as a singleton, available globally under [name]. Useful
   * for plugins.
   */
  @JvmStatic
  public final fun registerSingleton(name: StringName, instance: Object?): Unit {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to instance)
    TransferContext.callMethod(rawPtr, MethodBindings.registerSingletonPtr, NIL)
  }

  /**
   * Removes the singleton registered under [name]. The singleton object is *not* freed. Only works
   * with user-defined singletons registered with [registerSingleton].
   */
  @JvmStatic
  public final fun unregisterSingleton(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.unregisterSingletonPtr, NIL)
  }

  /**
   * Returns a list of names of all available global singletons. See also [getSingleton].
   */
  @JvmStatic
  public final fun getSingletonList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSingletonListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Registers a [ScriptLanguage] instance to be available with `ScriptServer`.
   * Returns:
   * - [OK] on success;
   * - [ERR_UNAVAILABLE] if `ScriptServer` has reached the limit and cannot register any new
   * language;
   * - [ERR_ALREADY_EXISTS] if `ScriptServer` already contains a language with similar
   * extension/name/type.
   */
  @JvmStatic
  public final fun registerScriptLanguage(language: ScriptLanguage?): Error {
    TransferContext.writeArguments(OBJECT to language)
    TransferContext.callMethod(rawPtr, MethodBindings.registerScriptLanguagePtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Unregisters the [ScriptLanguage] instance from `ScriptServer`.
   * Returns:
   * - [OK] on success;
   * - [ERR_DOES_NOT_EXIST] if the language is not registered in `ScriptServer`.
   */
  @JvmStatic
  public final fun unregisterScriptLanguage(language: ScriptLanguage?): Error {
    TransferContext.writeArguments(OBJECT to language)
    TransferContext.callMethod(rawPtr, MethodBindings.unregisterScriptLanguagePtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the number of available script languages. Use with [getScriptLanguage].
   */
  @JvmStatic
  public final fun getScriptLanguageCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getScriptLanguageCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns an instance of a [ScriptLanguage] with the given [index].
   */
  @JvmStatic
  public final fun getScriptLanguage(index: Int): ScriptLanguage? {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getScriptLanguagePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as ScriptLanguage?)
  }

  /**
   * Returns `true` if the script is currently running inside the editor, otherwise returns `false`.
   * This is useful for `@tool` scripts to conditionally draw editor helpers, or prevent accidentally
   * running "game" code that would affect the scene state while in the editor:
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
   * **Note:** To detect whether the script is running on an editor *build* (such as when pressing
   * [kbd]F5[/kbd]), use [OS.hasFeature] with the `"editor"` argument instead.
   * `OS.has_feature("editor")` evaluate to `true` both when the script is running in the editor and
   * when running the project from the editor, but returns `false` when run from an exported project.
   */
  @JvmStatic
  public final fun isEditorHint(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isEditorHintPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the path to the [MovieWriter]'s output file, or an empty string if the engine wasn't
   * started in Movie Maker mode. The default path can be changed in
   * [ProjectSettings.editor/movieWriter/movieFile].
   */
  @JvmStatic
  public final fun getWriteMoviePath(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getWriteMoviePathPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  @JvmStatic
  public final fun setPrintErrorMessages(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setPrintErrorMessagesPtr, NIL)
  }

  @JvmStatic
  public final fun isPrintingErrorMessages(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isPrintingErrorMessagesPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  internal object MethodBindings {
    public val setPhysicsTicksPerSecondPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "set_physics_ticks_per_second", 1286410249)

    public val getPhysicsTicksPerSecondPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_physics_ticks_per_second", 3905245786)

    public val setMaxPhysicsStepsPerFramePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "set_max_physics_steps_per_frame", 1286410249)

    public val getMaxPhysicsStepsPerFramePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_max_physics_steps_per_frame", 3905245786)

    public val setPhysicsJitterFixPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "set_physics_jitter_fix", 373806689)

    public val getPhysicsJitterFixPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_physics_jitter_fix", 1740695150)

    public val getPhysicsInterpolationFractionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_physics_interpolation_fraction", 1740695150)

    public val setMaxFpsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "set_max_fps", 1286410249)

    public val getMaxFpsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_max_fps", 3905245786)

    public val setTimeScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "set_time_scale", 373806689)

    public val getTimeScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_time_scale", 191475506)

    public val getFramesDrawnPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_frames_drawn", 2455072627)

    public val getFramesPerSecondPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_frames_per_second", 1740695150)

    public val getPhysicsFramesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_physics_frames", 3905245786)

    public val getProcessFramesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_process_frames", 3905245786)

    public val getMainLoopPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_main_loop", 1016888095)

    public val getVersionInfoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_version_info", 3102165223)

    public val getAuthorInfoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_author_info", 3102165223)

    public val getCopyrightInfoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_copyright_info", 3995934104)

    public val getDonorInfoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_donor_info", 3102165223)

    public val getLicenseInfoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_license_info", 3102165223)

    public val getLicenseTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_license_text", 201670096)

    public val getArchitectureNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_architecture_name", 201670096)

    public val isInPhysicsFramePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "is_in_physics_frame", 36873697)

    public val hasSingletonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "has_singleton", 2619796661)

    public val getSingletonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_singleton", 1371597918)

    public val registerSingletonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "register_singleton", 965313290)

    public val unregisterSingletonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "unregister_singleton", 3304788590)

    public val getSingletonListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_singleton_list", 1139954409)

    public val registerScriptLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "register_script_language", 1850254898)

    public val unregisterScriptLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "unregister_script_language", 1850254898)

    public val getScriptLanguageCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_script_language_count", 2455072627)

    public val getScriptLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_script_language", 2151255799)

    public val isEditorHintPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "is_editor_hint", 36873697)

    public val getWriteMoviePathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "get_write_movie_path", 201670096)

    public val setPrintErrorMessagesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "set_print_error_messages", 2586408642)

    public val isPrintingErrorMessagesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Engine", "is_printing_error_messages", 36873697)
  }
}
