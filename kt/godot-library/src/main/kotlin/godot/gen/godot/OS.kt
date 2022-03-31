// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedStringArray
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import kotlin.Any
import kotlin.Boolean
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
  public override fun __new(): Unit {
    rawPtr = TransferContext.getSingleton(ENGINECLASS_OS)
  }

  public override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  /**
   * Returns an array of MIDI device names.
   *
   * The returned array will be empty if the system MIDI driver has not previously been initialised with [openMidiInputs].
   *
   * **Note:** This method is implemented on Linux, macOS and Windows.
   */
  public open fun getConnectedMidiInputs(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_GET_CONNECTED_MIDI_INPUTS,
        PACKED_STRING_ARRAY)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  /**
   * Initialises the singleton for the system MIDI driver.
   *
   * **Note:** This method is implemented on Linux, macOS and Windows.
   */
  public open fun openMidiInputs(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_OPEN_MIDI_INPUTS, NIL)
  }

  /**
   * Shuts down system MIDI driver.
   *
   * **Note:** This method is implemented on Linux, macOS and Windows.
   */
  public open fun closeMidiInputs(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_CLOSE_MIDI_INPUTS, NIL)
  }

  /**
   * Displays a modal dialog box using the host OS' facilities. Execution is blocked until the dialog is closed.
   */
  public open fun alert(text: String, title: String = "Alert!"): Unit {
    TransferContext.writeArguments(STRING to text, STRING to title)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_ALERT, NIL)
  }

  /**
   * Crashes the engine (or the editor if called within a `@tool` script). This should *only* be used for testing the system's crash handler, not for any other purpose. For general error reporting, use (in order of preference) [@GDScript.assert], [@GlobalScope.pushError] or [alert]. See also [kill].
   */
  public open fun crash(message: String): Unit {
    TransferContext.writeArguments(STRING to message)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_CRASH, NIL)
  }

  public open fun setLowProcessorUsageMode(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_SET_LOW_PROCESSOR_USAGE_MODE,
        NIL)
  }

  public open fun isInLowProcessorUsageMode(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_IS_IN_LOW_PROCESSOR_USAGE_MODE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public open fun setLowProcessorUsageModeSleepUsec(usec: Long): Unit {
    TransferContext.writeArguments(LONG to usec)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_OS_SET_LOW_PROCESSOR_USAGE_MODE_SLEEP_USEC, NIL)
  }

  public open fun getLowProcessorUsageModeSleepUsec(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_OS_GET_LOW_PROCESSOR_USAGE_MODE_SLEEP_USEC, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the number of *logical* CPU cores available on the host machine. On CPUs with HyperThreading enabled, this number will be greater than the number of *physical* CPU cores.
   */
  public open fun getProcessorCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_GET_PROCESSOR_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the name of the CPU model on the host machine (e.g. "Intel(R) Core(TM) i7-6700K CPU @ 4.00GHz").
   *
   * **Note:** This method is only implemented on Windows, macOS, Linux and iOS. On Android, HTML5 and UWP, [getProcessorName] returns an empty string.
   */
  public open fun getProcessorName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_GET_PROCESSOR_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the path to the current engine executable.
   *
   * **Note:** On macOS, always use [createInstance] instead of relying on executable path.
   */
  public open fun getExecutablePath(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_GET_EXECUTABLE_PATH, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Executes a command. The file specified in `path` must exist and be executable. Platform path resolution will be used. The `arguments` are used in the given order and separated by a space. If an `output` [godot.Array] is provided, the complete shell output of the process will be appended as a single [godot.String] element in `output`. If `read_stderr` is `true`, the output to the standard error stream will be included too.
   *
   * On Windows, if `open_console` is `true` and the process is a console app, a new terminal window will be opened. This is ignored on other platforms.
   *
   * If the command is successfully executed, the method will return the exit code of the command, or `-1` if it fails.
   *
   * **Note:** The Godot thread will pause its execution until the executed command terminates. Use [godot.Thread] to create a separate thread that will not pause the Godot thread, or use [createProcess] to create a completely independent process.
   *
   * For example, to retrieve a list of the working directory's contents:
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * var output = []
   *
   * var exit_code = OS.execute("ls", ["-l", "/tmp"], output)
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * var output = new Godot.Collections.Array();
   *
   * int exitCode = OS.Execute("ls", new string[] {"-l", "/tmp"}, output);
   *
   * [/csharp]
   *
   * [/codeblocks]
   *
   * If you wish to access a shell built-in or execute a composite command, a platform-specific shell can be invoked. For example:
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * var output = []
   *
   * OS.execute("CMD.exe", ["/C", "cd %TEMP% && dir"], output)
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * var output = new Godot.Collections.Array();
   *
   * OS.Execute("CMD.exe", new string[] {"/C", "cd %TEMP% && dir"}, output);
   *
   * [/csharp]
   *
   * [/codeblocks]
   *
   * **Note:** This method is implemented on Android, iOS, Linux, macOS and Windows.
   *
   * **Note:** To execute a Windows command interpreter built-in command, specify `cmd.exe` in `path`, `/c` as the first argument, and the desired command as the second argument.
   *
   * **Note:** To execute a PowerShell built-in command, specify `powershell.exe` in `path`, `-Command` as the first argument, and the desired command as the second argument.
   *
   * **Note:** To execute a Unix shell built-in command, specify shell executable name in `path`, `-c` as the first argument, and the desired command as the second argument.
   *
   * **Note:** On macOS, sandboxed applications are limited to run only embedded helper executables, specified during export.
   */
  public open fun execute(
    path: String,
    arguments: PackedStringArray,
    output: VariantArray<Any?> = godot.core.variantArrayOf(),
    readStderr: Boolean = false,
    openConsole: Boolean = false
  ): Long {
    TransferContext.writeArguments(STRING to path, PACKED_STRING_ARRAY to arguments, ARRAY to
        output, BOOL to readStderr, BOOL to openConsole)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_EXECUTE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Creates a new process that runs independently of Godot. It will not terminate if Godot terminates. The path specified in `path` must exist and be executable file or macOS .app bundle. Platform path resolution will be used. The `arguments` are used in the given order and separated by a space.
   *
   * On Windows, if `open_console` is `true` and the process is a console app, a new terminal window will be opened. This is ignored on other platforms.
   *
   * If the process creation succeeds, the method will return the new process ID, which you can use to monitor the process (and potentially terminate it with [kill]). If the process creation fails, the method will return `-1`.
   *
   * For example, running another instance of the project:
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * var pid = OS.create_process(OS.get_executable_path(), [])
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * var pid = OS.CreateProcess(OS.GetExecutablePath(), new string[] {});
   *
   * [/csharp]
   *
   * [/codeblocks]
   *
   * See [execute] if you wish to run an external command and retrieve the results.
   *
   * **Note:** This method is implemented on Android, iOS, Linux, macOS and Windows.
   *
   * **Note:** On macOS, sandboxed applications are limited to run only embedded helper executables, specified during export or system .app bundle, system .app bundles will ignore arguments.
   */
  public open fun createProcess(
    path: String,
    arguments: PackedStringArray,
    openConsole: Boolean = false
  ): Long {
    TransferContext.writeArguments(STRING to path, PACKED_STRING_ARRAY to arguments, BOOL to
        openConsole)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_CREATE_PROCESS, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Creates a new instance of Godot that runs independently. The `arguments` are used in the given order and separated by a space.
   *
   * If the process creation succeeds, the method will return the new process ID, which you can use to monitor the process (and potentially terminate it with [kill]). If the process creation fails, the method will return `-1`.
   *
   * **Note:** This method is implemented on Android, iOS, Linux, macOS and Windows.
   */
  public open fun createInstance(arguments: PackedStringArray): Long {
    TransferContext.writeArguments(PACKED_STRING_ARRAY to arguments)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_CREATE_INSTANCE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Kill (terminate) the process identified by the given process ID (`pid`), e.g. the one returned by [execute] in non-blocking mode. See also [crash].
   *
   * **Note:** This method can also be used to kill processes that were not spawned by the game.
   *
   * **Note:** This method is implemented on Android, iOS, Linux, macOS and Windows.
   */
  public open fun kill(pid: Long): GodotError {
    TransferContext.writeArguments(LONG to pid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_KILL, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
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
  public open fun shellOpen(uri: String): GodotError {
    TransferContext.writeArguments(STRING to uri)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_SHELL_OPEN, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the project's process ID.
   *
   * **Note:** This method is implemented on Android, iOS, Linux, macOS and Windows.
   */
  public open fun getProcessId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_GET_PROCESS_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the value of an environment variable. Returns an empty string if the environment variable doesn't exist.
   *
   * **Note:** Double-check the casing of `variable`. Environment variable names are case-sensitive on all platforms except Windows.
   */
  public open fun getEnvironment(variable: String): String {
    TransferContext.writeArguments(STRING to variable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_GET_ENVIRONMENT, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Sets the value of the environment variable `variable` to `value`. The environment variable will be set for the Godot process and any process executed with [execute] after running [setEnvironment]. The environment variable will *not* persist to processes run after the Godot process was terminated.
   *
   * **Note:** Double-check the casing of `variable`. Environment variable names are case-sensitive on all platforms except Windows.
   */
  public open fun setEnvironment(variable: String, `value`: String): Boolean {
    TransferContext.writeArguments(STRING to variable, STRING to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_SET_ENVIRONMENT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the environment variable with the name `variable` exists.
   *
   * **Note:** Double-check the casing of `variable`. Environment variable names are case-sensitive on all platforms except Windows.
   */
  public open fun hasEnvironment(variable: String): Boolean {
    TransferContext.writeArguments(STRING to variable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_HAS_ENVIRONMENT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the name of the host OS.
   *
   * On Windows, this is `"Windows"` or `"UWP"` (Universal Windows Platform) if exported thereon.
   *
   * On macOS, this is `"macOS"`.
   *
   * On Linux-based operating systems, this is `"Linux"`.
   *
   * On BSD-based operating systems, this is `"FreeBSD"`, `"NetBSD"`, `"OpenBSD"`, or `"BSD"` as a fallback.
   *
   * On Android, this is `"Android"`.
   *
   * On iOS, this is `"iOS"`.
   *
   * On the web, this is `"HTML5"`.
   *
   * **Note:** Custom builds of the engine may support additional platforms, such as consoles, yielding other return values.
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * match OS.get_name():
   *
   *     "Windows", "UWP":
   *
   *         print("Windows")
   *
   *     "macOS":
   *
   *         print("macOS")
   *
   *     "Linux", "FreeBSD", "NetBSD", "OpenBSD", "BSD":
   *
   *         print("Linux/BSD")
   *
   *     "Android":
   *
   *         print("Android")
   *
   *     "iOS":
   *
   *         print("iOS")
   *
   *     "HTML5":
   *
   *         print("Web")
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * switch (OS.GetName())
   *
   * {
   *
   *     case "Windows":
   *
   *     case "UWP":
   *
   *         GD.Print("Windows");
   *
   *         break;
   *
   *     case "macOS":
   *
   *         GD.Print("macOS");
   *
   *         break;
   *
   *     case "Linux":
   *
   *     case "FreeBSD":
   *
   *     case "NetBSD":
   *
   *     case "OpenBSD"
   *
   *     case "BSD":
   *
   *         GD.Print("Linux/BSD");
   *
   *         break;
   *
   *     case "Android":
   *
   *         GD.Print("Android");
   *
   *         break;
   *
   *     case "iOS":
   *
   *         GD.Print("iOS");
   *
   *         break;
   *
   *     case "HTML5":
   *
   *         GD.Print("Web");
   *
   *         break;
   *
   * }
   *
   * [/csharp]
   *
   * [/codeblocks]
   */
  public open fun getName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_GET_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the command-line arguments passed to the engine.
   *
   * Command-line arguments can be written in any form, including both `--key value` and `--key=value` forms so they can be properly parsed, as long as custom command-line arguments do not conflict with engine arguments.
   *
   * You can also incorporate environment variables using the [getEnvironment] method.
   *
   * You can set [godot.ProjectSettings.editor/run/mainRunArgs] to define command-line arguments to be passed by the editor when running the project.
   *
   * Here's a minimal example on how to parse command-line arguments into a dictionary using the `--key=value` form for arguments:
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * var arguments = {}
   *
   * for argument in OS.get_cmdline_args():
   *
   *     if argument.find("=") > -1:
   *
   *         var key_value = argument.split("=")
   *
   *         arguments[key_value[0].lstrip("--")] = key_value[1]
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * var arguments = new Godot.Collections.Dictionary();
   *
   * foreach (var argument in OS.GetCmdlineArgs())
   *
   * {
   *
   *     if (argument.Find("=") > -1)
   *
   *     {
   *
   *         string[] keyValue = argument.Split("=");
   *
   *         arguments[keyValue[0].LStrip("--")] = keyValue[1];
   *
   *     }
   *
   * }
   *
   * [/csharp]
   *
   * [/codeblocks]
   */
  public open fun getCmdlineArgs(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_GET_CMDLINE_ARGS,
        PACKED_STRING_ARRAY)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  /**
   * Delays execution of the current thread by `usec` microseconds. `usec` must be greater than or equal to `0`. Otherwise, [delayUsec] will do nothing and will print an error message.
   *
   * **Note:** [delayUsec] is a *blocking* way to delay code execution. To delay code execution in a non-blocking way, see [godot.SceneTree.createTimer]. Awaiting with [godot.SceneTree.createTimer] will delay the execution of code placed below the `await` without affecting the rest of the project (or editor, for [godot.EditorPlugin]s and [godot.EditorScript]s).
   *
   * **Note:** When [delayUsec] is called on the main thread, it will freeze the project and will prevent it from redrawing and registering input until the delay has passed. When using [delayUsec] as part of an [godot.EditorPlugin] or [godot.EditorScript], it will freeze the editor but won't freeze the project if it is currently running (since the project is an independent child process).
   */
  public open fun delayUsec(usec: Long): Unit {
    TransferContext.writeArguments(LONG to usec)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_DELAY_USEC, NIL)
  }

  /**
   * Delays execution of the current thread by `msec` milliseconds. `msec` must be greater than or equal to `0`. Otherwise, [delayMsec] will do nothing and will print an error message.
   *
   * **Note:** [delayMsec] is a *blocking* way to delay code execution. To delay code execution in a non-blocking way, see [godot.SceneTree.createTimer]. Awaiting with [godot.SceneTree.createTimer] will delay the execution of code placed below the `await` without affecting the rest of the project (or editor, for [godot.EditorPlugin]s and [godot.EditorScript]s).
   *
   * **Note:** When [delayMsec] is called on the main thread, it will freeze the project and will prevent it from redrawing and registering input until the delay has passed. When using [delayMsec] as part of an [godot.EditorPlugin] or [godot.EditorScript], it will freeze the editor but won't freeze the project if it is currently running (since the project is an independent child process).
   */
  public open fun delayMsec(msec: Long): Unit {
    TransferContext.writeArguments(LONG to msec)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_DELAY_MSEC, NIL)
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
  public open fun getLocale(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_GET_LOCALE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the host OS locale's 2 or 3-letter [language code](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) as a string which should be consistent on all platforms. This is equivalent to extracting the `language` part of the [getLocale] string.
   *
   * This can be used to narrow down fully specified locale strings to only the "common" language code, when you don't need the additional information about country code or variants. For example, for a French Canadian user with `fr_CA` locale, this would return `fr`.
   */
  public open fun getLocaleLanguage(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_GET_LOCALE_LANGUAGE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the model name of the current device.
   *
   * **Note:** This method is implemented on Android and iOS. Returns `"GenericDevice"` on unsupported platforms.
   */
  public open fun getModelName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_GET_MODEL_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * If `true`, the `user://` file system is persistent, so that its state is the same after a player quits and starts the game again. Relevant to the HTML5 platform, where this persistence may be unavailable.
   */
  public open fun isUserfsPersistent(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_IS_USERFS_PERSISTENT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the engine was executed with the `--verbose` or `-v` command line argument, or if [godot.ProjectSettings.debug/settings/stdout/verboseStdout] is `true`. See also [@GlobalScope.printVerbose].
   */
  public open fun isStdoutVerbose(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_IS_STDOUT_VERBOSE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the current host platform is using multiple threads.
   */
  public open fun canUseThreads(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_CAN_USE_THREADS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the Godot binary used to run the project is a *debug* export template, or when running in the editor.
   *
   * Returns `false` if the Godot binary used to run the project is a *release* export template.
   *
   * To check whether the Godot binary used to run the project is an export template (debug or release), use `OS.has_feature("standalone")` instead.
   */
  public open fun isDebugBuild(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_IS_DEBUG_BUILD, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Dumps the memory allocation ringlist to a file (only works in debug).
   *
   * Entry format per line: "Address - Size - Description".
   */
  public open fun dumpMemoryToFile(`file`: String): Unit {
    TransferContext.writeArguments(STRING to file)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_DUMP_MEMORY_TO_FILE, NIL)
  }

  /**
   * Dumps all used resources to file (only works in debug).
   *
   * Entry format per line: "Resource Type : Resource Location".
   *
   * At the end of the file is a statistic of all used Resource Types.
   */
  public open fun dumpResourcesToFile(`file`: String): Unit {
    TransferContext.writeArguments(STRING to file)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_DUMP_RESOURCES_TO_FILE, NIL)
  }

  /**
   * Shows all resources currently used by the game.
   */
  public open fun printResourcesInUse(short: Boolean = false): Unit {
    TransferContext.writeArguments(BOOL to short)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_PRINT_RESOURCES_IN_USE, NIL)
  }

  /**
   * Shows all resources in the game. Optionally, the list can be written to a file by specifying a file path in `tofile`.
   */
  public open fun printAllResources(tofile: String = ""): Unit {
    TransferContext.writeArguments(STRING to tofile)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_PRINT_ALL_RESOURCES, NIL)
  }

  /**
   * Returns the amount of static memory being used by the program in bytes (only works in debug).
   */
  public open fun getStaticMemoryUsage(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_GET_STATIC_MEMORY_USAGE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the maximum amount of static memory used (only works in debug).
   */
  public open fun getStaticMemoryPeakUsage(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_GET_STATIC_MEMORY_PEAK_USAGE,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the absolute directory path where user data is written (`user://`).
   *
   * On Windows, this is `%AppData%\Godot\app_userdata\[project_name]`, or `%AppData%\[custom_name]` if `use_custom_user_dir` is set. `%AppData%` expands to `%UserProfile%\AppData\Roaming`.
   *
   * On macOS, this is `~/Library/Application Support/Godot/app_userdata/[project_name]`, or `~/Library/Application Support/[custom_name]` if `use_custom_user_dir` is set.
   *
   * On Linux and BSD, this is `~/.local/share/godot/app_userdata/[project_name]`, or `~/.local/share/[custom_name]` if `use_custom_user_dir` is set.
   *
   * On Android and iOS, this is a sandboxed directory in either internal or external storage, depending on the user's configuration.
   *
   * On the web, this is a virtual directory managed by the browser.
   *
   * If the project name is empty, `[project_name]` falls back to `[unnamed project]`.
   *
   * Not to be confused with [getDataDir], which returns the *global* (non-project-specific) user home directory.
   */
  public open fun getUserDataDir(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_GET_USER_DATA_DIR, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the actual path to commonly used folders across different platforms. Available locations are specified in [enum SystemDir].
   *
   * **Note:** This method is implemented on Android, Linux, macOS and Windows.
   *
   * **Note:** Shared storage is implemented on Android and allows to differentiate between app specific and shared directories. Shared directories have additional restrictions on Android.
   */
  public open fun getSystemDir(dir: OS.SystemDir, sharedStorage: Boolean = true): String {
    TransferContext.writeArguments(LONG to dir.id, BOOL to sharedStorage)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_GET_SYSTEM_DIR, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the *global* user configuration directory according to the operating system's standards. On desktop platforms, this path can be overridden by setting the `XDG_CONFIG_HOME` environment variable before starting the project. See [godot.File paths in Godot projects]($DOCS_URL/tutorials/io/data_paths.html) in the documentation for more information. See also [getCacheDir] and [getDataDir].
   *
   * Not to be confused with [getUserDataDir], which returns the *project-specific* user data path.
   */
  public open fun getConfigDir(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_GET_CONFIG_DIR, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the *global* user data directory according to the operating system's standards. On desktop platforms, this path can be overridden by setting the `XDG_DATA_HOME` environment variable before starting the project. See [godot.File paths in Godot projects]($DOCS_URL/tutorials/io/data_paths.html) in the documentation for more information. See also [getCacheDir] and [getConfigDir].
   *
   * Not to be confused with [getUserDataDir], which returns the *project-specific* user data path.
   */
  public open fun getDataDir(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_GET_DATA_DIR, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the *global* cache data directory according to the operating system's standards. On desktop platforms, this path can be overridden by setting the `XDG_CACHE_HOME` environment variable before starting the project. See [godot.File paths in Godot projects]($DOCS_URL/tutorials/io/data_paths.html) in the documentation for more information. See also [getConfigDir] and [getDataDir].
   *
   * Not to be confused with [getUserDataDir], which returns the *project-specific* user data path.
   */
  public open fun getCacheDir(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_GET_CACHE_DIR, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns a string that is unique to the device.
   *
   * **Note:** This string may change without notice if the user reinstalls/upgrades their operating system or changes their hardware. This means it should generally not be used to encrypt persistent data as the data saved before an unexpected ID change would become inaccessible. The returned string may also be falsified using external programs, so do not rely on the string returned by [getUniqueId] for security purposes.
   *
   * **Note:** Returns an empty string on HTML5 and UWP, as this method isn't implemented on those platforms yet.
   */
  public open fun getUniqueId(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_GET_UNIQUE_ID, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Shows the list of loaded textures sorted by size in memory.
   */
  public open fun printAllTexturesBySize(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_PRINT_ALL_TEXTURES_BY_SIZE, NIL)
  }

  /**
   * Shows the number of resources loaded by the game of the given types.
   */
  public open fun printResourcesByType(types: PackedStringArray): Unit {
    TransferContext.writeArguments(PACKED_STRING_ARRAY to types)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_PRINT_RESOURCES_BY_TYPE, NIL)
  }

  /**
   * Returns the given keycode as a string (e.g. Return values: `"Escape"`, `"Shift+Escape"`).
   *
   * See also [godot.InputEventKey.keycode] and [godot.InputEventKey.getKeycodeWithModifiers].
   */
  public open fun getKeycodeString(code: Key): String {
    TransferContext.writeArguments(LONG to code.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_GET_KEYCODE_STRING, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns `true` if the input keycode corresponds to a Unicode character.
   */
  public open fun isKeycodeUnicode(code: Long): Boolean {
    TransferContext.writeArguments(LONG to code)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_IS_KEYCODE_UNICODE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the keycode of the given string (e.g. "Escape").
   */
  public open fun findKeycodeFromString(string: String): Key {
    TransferContext.writeArguments(STRING to string)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_FIND_KEYCODE_FROM_STRING, LONG)
    return Key.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Enables backup saves if `enabled` is `true`.
   */
  public open fun setUseFileAccessSaveAndSwap(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_OS_SET_USE_FILE_ACCESS_SAVE_AND_SWAP, NIL)
  }

  /**
   * Sets the name of the current thread.
   */
  public open fun setThreadName(name: String): GodotError {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_SET_THREAD_NAME, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the ID of the current thread. This can be used in logs to ease debugging of multi-threaded applications.
   *
   * **Note:** Thread IDs are not deterministic and may be reused across application restarts.
   */
  public open fun getThreadCallerId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_GET_THREAD_CALLER_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the ID of the main thread. See [getThreadCallerId].
   *
   * **Note:** Thread IDs are not deterministic and may be reused across application restarts.
   */
  public open fun getMainThreadId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_GET_MAIN_THREAD_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns `true` if the feature for the given feature tag is supported in the currently running instance, depending on the platform, build, etc. Can be used to check whether you're currently running a debug build, on a certain platform or arch, etc. Refer to the [godot.Feature Tags]($DOCS_URL/getting_started/workflow/export/feature_tags.html) documentation for more details.
   *
   * **Note:** Tag names are case-sensitive.
   */
  public open fun hasFeature(tagName: String): Boolean {
    TransferContext.writeArguments(STRING to tagName)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_HAS_FEATURE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * At the moment this function is only used by `AudioDriverOpenSL` to request permission for `RECORD_AUDIO` on Android.
   */
  public open fun requestPermission(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_REQUEST_PERMISSION, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * With this function, you can request dangerous permissions since normal permissions are automatically granted at install time in Android applications.
   *
   * **Note:** This method is implemented on Android.
   */
  public open fun requestPermissions(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_REQUEST_PERMISSIONS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * With this function, you can get the list of dangerous permissions that have been granted to the Android application.
   *
   * **Note:** This method is implemented on Android.
   */
  public open fun getGrantedPermissions(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OS_GET_GRANTED_PERMISSIONS,
        PACKED_STRING_ARRAY)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  public enum class VideoDriver(
    id: Long
  ) {
    /**
     * The Vulkan rendering backend. It requires Vulkan 1.0 support and automatically uses features from Vulkan 1.1 and 1.2 if available.
     */
    VIDEO_DRIVER_VULKAN(0),
    /**
     * The OpenGL 3 rendering backend. It uses OpenGL 3.3 Core Profile on desktop platforms, OpenGL ES 3.0 on mobile devices, and WebGL 2.0 on HTML5.
     */
    VIDEO_DRIVER_OPENGL_3(1),
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
