// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.PackedByteArray
import godot.core.PackedStringArray
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * The [OS] class wraps the most common functionalities for communicating with the host operating
 * system, such as the video driver, delays, environment variables, execution of binaries, command
 * line, etc.
 * **Note:** In Godot 4, [OS] functions related to window management, clipboard, and TTS were moved
 * to the [DisplayServer] singleton (and the [Window] class). Functions related to time were removed
 * and are only available in the [Time] class.
 */
@GodotBaseType
public object OS : Object() {
  public override fun new(scriptIndex: Int): Unit {
    getSingleton(ENGINECLASS_OS)
  }

  /**
   * Generates a [PackedByteArray] of cryptographically secure random bytes with given [size].
   * **Note:** Generating large quantities of bytes using this method can result in locking and
   * entropy of lower quality on most platforms. Using [Crypto.generateRandomBytes] is preferred in
   * most cases.
   */
  public final fun getEntropy(size: Int): PackedByteArray {
    TransferContext.writeArguments(LONG to size.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getEntropyPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY) as PackedByteArray)
  }

  /**
   * Returns the list of certification authorities trusted by the operating system as a string of
   * concatenated certificates in PEM format.
   */
  public final fun getSystemCaCertificates(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSystemCaCertificatesPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns an array of connected MIDI device names, if they exist. Returns an empty array if the
   * system MIDI driver has not previously been initialized with [openMidiInputs]. See also
   * [closeMidiInputs].
   * **Note:** This method is implemented on Linux, macOS and Windows.
   */
  public final fun getConnectedMidiInputs(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectedMidiInputsPtr,
        PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Initializes the singleton for the system MIDI driver, allowing Godot to receive
   * [InputEventMIDI]. See also [getConnectedMidiInputs] and [closeMidiInputs].
   * **Note:** This method is implemented on Linux, macOS and Windows.
   */
  public final fun openMidiInputs(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.openMidiInputsPtr, NIL)
  }

  /**
   * Shuts down the system MIDI driver. Godot will no longer receive [InputEventMIDI]. See also
   * [openMidiInputs] and [getConnectedMidiInputs].
   * **Note:** This method is implemented on Linux, macOS and Windows.
   */
  public final fun closeMidiInputs(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.closeMidiInputsPtr, NIL)
  }

  /**
   * Displays a modal dialog box using the host platform's implementation. The engine execution is
   * blocked until the dialog is closed.
   */
  @JvmOverloads
  public final fun alert(text: String, title: String = "Alert!"): Unit {
    TransferContext.writeArguments(STRING to text, STRING to title)
    TransferContext.callMethod(rawPtr, MethodBindings.alertPtr, NIL)
  }

  /**
   * Crashes the engine (or the editor if called within a `@tool` script). See also [kill].
   * **Note:** This method should *only* be used for testing the system's crash handler, not for any
   * other purpose. For general error reporting, use (in order of preference) [@GDScript.assert],
   * [@GlobalScope.pushError], or [alert].
   */
  public final fun crash(message: String): Unit {
    TransferContext.writeArguments(STRING to message)
    TransferContext.callMethod(rawPtr, MethodBindings.crashPtr, NIL)
  }

  public final fun setLowProcessorUsageMode(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setLowProcessorUsageModePtr, NIL)
  }

  public final fun isInLowProcessorUsageMode(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isInLowProcessorUsageModePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setLowProcessorUsageModeSleepUsec(usec: Int): Unit {
    TransferContext.writeArguments(LONG to usec.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setLowProcessorUsageModeSleepUsecPtr, NIL)
  }

  public final fun getLowProcessorUsageModeSleepUsec(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLowProcessorUsageModeSleepUsecPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setDeltaSmoothing(deltaSmoothingEnabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to deltaSmoothingEnabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setDeltaSmoothingPtr, NIL)
  }

  public final fun isDeltaSmoothingEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isDeltaSmoothingEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the number of *logical* CPU cores available on the host machine. On CPUs with
   * HyperThreading enabled, this number will be greater than the number of *physical* CPU cores.
   */
  public final fun getProcessorCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getProcessorCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the full name of the CPU model on the host machine (e.g. `"Intel(R) Core(TM) i7-6700K
   * CPU @ 4.00GHz"`).
   * **Note:** This method is only implemented on Windows, macOS, Linux and iOS. On Android and Web,
   * [getProcessorName] returns an empty string.
   */
  public final fun getProcessorName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getProcessorNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the list of font family names available.
   * **Note:** This method is implemented on Android, iOS, Linux, macOS and Windows.
   */
  public final fun getSystemFonts(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSystemFontsPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Returns the path to the system font file with [fontName] and style. Returns an empty string if
   * no matching fonts found.
   * The following aliases can be used to request default fonts: "sans-serif", "serif", "monospace",
   * "cursive", and "fantasy".
   * **Note:** Returned font might have different style if the requested style is not available.
   * **Note:** This method is implemented on Android, iOS, Linux, macOS and Windows.
   */
  @JvmOverloads
  public final fun getSystemFontPath(
    fontName: String,
    weight: Int = 400,
    stretch: Int = 100,
    italic: Boolean = false,
  ): String {
    TransferContext.writeArguments(STRING to fontName, LONG to weight.toLong(), LONG to stretch.toLong(), BOOL to italic)
    TransferContext.callMethod(rawPtr, MethodBindings.getSystemFontPathPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns an array of the system substitute font file paths, which are similar to the font with
   * [fontName] and style for the specified text, locale, and script. Returns an empty array if no
   * matching fonts found.
   * The following aliases can be used to request default fonts: "sans-serif", "serif", "monospace",
   * "cursive", and "fantasy".
   * **Note:** Depending on OS, it's not guaranteed that any of the returned fonts will be suitable
   * for rendering specified text. Fonts should be loaded and checked in the order they are returned,
   * and the first suitable one used.
   * **Note:** Returned fonts might have different style if the requested style is not available or
   * belong to a different font family.
   * **Note:** This method is implemented on Android, iOS, Linux, macOS and Windows.
   */
  @JvmOverloads
  public final fun getSystemFontPathForText(
    fontName: String,
    text: String,
    locale: String = "",
    script: String = "",
    weight: Int = 400,
    stretch: Int = 100,
    italic: Boolean = false,
  ): PackedStringArray {
    TransferContext.writeArguments(STRING to fontName, STRING to text, STRING to locale, STRING to script, LONG to weight.toLong(), LONG to stretch.toLong(), BOOL to italic)
    TransferContext.callMethod(rawPtr, MethodBindings.getSystemFontPathForTextPtr,
        PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Returns the file path to the current engine executable.
   * **Note:** On macOS, if you want to launch another instance of Godot, always use
   * [createInstance] instead of relying on the executable path.
   */
  public final fun getExecutablePath(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getExecutablePathPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Reads a user input string from the standard input (usually the terminal). This operation is
   * *blocking*, which causes the window to freeze if [readStringFromStdin] is called on the main
   * thread. The thread calling [readStringFromStdin] will block until the program receives a line
   * break in standard input (usually by the user pressing [kbd]Enter[/kbd]).
   * **Note:** This method is implemented on Linux, macOS and Windows.
   * **Note:** On exported Windows builds, run the console wrapper executable to access the
   * terminal. Otherwise, the standard input will not work correctly. If you need a single executable
   * with console support, use a custom build compiled with the `windows_subsystem=console` flag.
   */
  public final fun readStringFromStdin(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.readStringFromStdinPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Executes the given process in a *blocking* way. The file specified in [path] must exist and be
   * executable. The system path resolution will be used. The [arguments] are used in the given order,
   * separated by spaces, and wrapped in quotes.
   * If an [output] array is provided, the complete shell output of the process is appended to
   * [output] as a single [String] element. If [readStderr] is `true`, the output to the standard error
   * stream is also appended to the array.
   * On Windows, if [openConsole] is `true` and the process is a console app, a new terminal window
   * is opened.
   * This method returns the exit code of the command, or `-1` if the process fails to execute.
   * **Note:** The main thread will be blocked until the executed command terminates. Use [Thread]
   * to create a separate thread that will not block the main thread, or use [createProcess] to create
   * a completely independent process.
   * For example, to retrieve a list of the working directory's contents:
   *
   * gdscript:
   * ```gdscript
   * var output = []
   * var exit_code = OS.execute("ls", ["-l", "/tmp"], output)
   * ```
   * csharp:
   * ```csharp
   * var output = new Godot.Collections.Array();
   * int exitCode = OS.Execute("ls", new string[] {"-l", "/tmp"}, output);
   * ```
   *
   * If you wish to access a shell built-in or execute a composite command, a platform-specific
   * shell can be invoked. For example:
   *
   * gdscript:
   * ```gdscript
   * var output = []
   * OS.execute("CMD.exe", ["/C", "cd &#37;TEMP&#37; && dir"], output)
   * ```
   * csharp:
   * ```csharp
   * var output = new Godot.Collections.Array();
   * OS.Execute("CMD.exe", new string[] {"/C", "cd &#37;TEMP&#37; && dir"}, output);
   * ```
   *
   * **Note:** This method is implemented on Android, Linux, macOS, and Windows.
   * **Note:** To execute a Windows command interpreter built-in command, specify `cmd.exe` in
   * [path], `/c` as the first argument, and the desired command as the second argument.
   * **Note:** To execute a PowerShell built-in command, specify `powershell.exe` in [path],
   * `-Command` as the first argument, and the desired command as the second argument.
   * **Note:** To execute a Unix shell built-in command, specify shell executable name in [path],
   * `-c` as the first argument, and the desired command as the second argument.
   * **Note:** On macOS, sandboxed applications are limited to run only embedded helper executables,
   * specified during export.
   * **Note:** On Android, system commands such as `dumpsys` can only be run on a rooted device.
   */
  @JvmOverloads
  public final fun execute(
    path: String,
    arguments: PackedStringArray,
    output: VariantArray<Any?> = godot.core.variantArrayOf(),
    readStderr: Boolean = false,
    openConsole: Boolean = false,
  ): Int {
    TransferContext.writeArguments(STRING to path, PACKED_STRING_ARRAY to arguments, ARRAY to output, BOOL to readStderr, BOOL to openConsole)
    TransferContext.callMethod(rawPtr, MethodBindings.executePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Creates a new process that runs independently of Godot with redirected IO. It will not
   * terminate when Godot terminates. The path specified in [path] must exist and be an executable file
   * or macOS `.app` bundle. The path is resolved based on the current platform. The [arguments] are
   * used in the given order and separated by a space.
   * If the process cannot be created, this method returns an empty [Dictionary]. Otherwise, this
   * method returns a [Dictionary] with the following keys:
   * - `"stdio"` - [FileAccess] to access the process stdin and stdout pipes (read/write).
   * - `"stderr"` - [FileAccess] to access the process stderr pipe (read only).
   * - `"pid"` - Process ID as an [int], which you can use to monitor the process (and potentially
   * terminate it with [kill]).
   * **Note:** This method is implemented on Android, Linux, macOS, and Windows.
   * **Note:** To execute a Windows command interpreter built-in command, specify `cmd.exe` in
   * [path], `/c` as the first argument, and the desired command as the second argument.
   * **Note:** To execute a PowerShell built-in command, specify `powershell.exe` in [path],
   * `-Command` as the first argument, and the desired command as the second argument.
   * **Note:** To execute a Unix shell built-in command, specify shell executable name in [path],
   * `-c` as the first argument, and the desired command as the second argument.
   * **Note:** On macOS, sandboxed applications are limited to run only embedded helper executables,
   * specified during export or system .app bundle, system .app bundles will ignore arguments.
   */
  public final fun executeWithPipe(path: String, arguments: PackedStringArray):
      Dictionary<Any?, Any?> {
    TransferContext.writeArguments(STRING to path, PACKED_STRING_ARRAY to arguments)
    TransferContext.callMethod(rawPtr, MethodBindings.executeWithPipePtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  /**
   * Creates a new process that runs independently of Godot. It will not terminate when Godot
   * terminates. The path specified in [path] must exist and be an executable file or macOS `.app`
   * bundle. The path is resolved based on the current platform. The [arguments] are used in the given
   * order and separated by a space.
   * On Windows, if [openConsole] is `true` and the process is a console app, a new terminal window
   * will be opened.
   * If the process is successfully created, this method returns its process ID, which you can use
   * to monitor the process (and potentially terminate it with [kill]). Otherwise, this method returns
   * `-1`.
   * For example, running another instance of the project:
   *
   * gdscript:
   * ```gdscript
   * var pid = OS.create_process(OS.get_executable_path(), [])
   * ```
   * csharp:
   * ```csharp
   * var pid = OS.CreateProcess(OS.GetExecutablePath(), new string[] {});
   * ```
   *
   * See [execute] if you wish to run an external command and retrieve the results.
   * **Note:** This method is implemented on Android, Linux, macOS, and Windows.
   * **Note:** On macOS, sandboxed applications are limited to run only embedded helper executables,
   * specified during export or system .app bundle, system .app bundles will ignore arguments.
   */
  @JvmOverloads
  public final fun createProcess(
    path: String,
    arguments: PackedStringArray,
    openConsole: Boolean = false,
  ): Int {
    TransferContext.writeArguments(STRING to path, PACKED_STRING_ARRAY to arguments, BOOL to openConsole)
    TransferContext.callMethod(rawPtr, MethodBindings.createProcessPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Creates a new instance of Godot that runs independently. The [arguments] are used in the given
   * order and separated by a space.
   * If the process is successfully created, this method returns the new process' ID, which you can
   * use to monitor the process (and potentially terminate it with [kill]). If the process cannot be
   * created, this method returns `-1`.
   * See [createProcess] if you wish to run a different process.
   * **Note:** This method is implemented on Android, Linux, macOS and Windows.
   */
  public final fun createInstance(arguments: PackedStringArray): Int {
    TransferContext.writeArguments(PACKED_STRING_ARRAY to arguments)
    TransferContext.callMethod(rawPtr, MethodBindings.createInstancePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Kill (terminate) the process identified by the given process ID ([pid]), such as the ID
   * returned by [execute] in non-blocking mode. See also [crash].
   * **Note:** This method can also be used to kill processes that were not spawned by the engine.
   * **Note:** This method is implemented on Android, iOS, Linux, macOS and Windows.
   */
  public final fun kill(pid: Int): Error {
    TransferContext.writeArguments(LONG to pid.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.killPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Requests the OS to open a resource identified by [uri] with the most appropriate program. For
   * example:
   * - `OS.shell_open("C:\\Users\name\Downloads")` on Windows opens the file explorer at the user's
   * Downloads folder.
   * - `OS.shell_open("https://godotengine.org")` opens the default web browser on the official
   * Godot website.
   * - `OS.shell_open("mailto:example@example.com")` opens the default email client with the "To"
   * field set to `example@example.com`. See [url=https://datatracker.ietf.org/doc/html/rfc2368]RFC
   * 2368 - The `mailto` URL scheme[/url] for a list of fields that can be added.
   * Use [ProjectSettings.globalizePath] to convert a `res://` or `user://` project path into a
   * system path for use with this method.
   * **Note:** Use [String.uriEncode] to encode characters within URLs in a URL-safe, portable way.
   * This is especially required for line breaks. Otherwise, [shellOpen] may not work correctly in a
   * project exported to the Web platform.
   * **Note:** This method is implemented on Android, iOS, Web, Linux, macOS and Windows.
   */
  public final fun shellOpen(uri: String): Error {
    TransferContext.writeArguments(STRING to uri)
    TransferContext.callMethod(rawPtr, MethodBindings.shellOpenPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Requests the OS to open the file manager, navigate to the given [fileOrDirPath] and select the
   * target file or folder.
   * If [openFolder] is `true` and [fileOrDirPath] is a valid directory path, the OS will open the
   * file manager and navigate to the target folder without selecting anything.
   * Use [ProjectSettings.globalizePath] to convert a `res://` or `user://` project path into a
   * system path to use with this method.
   * **Note:** This method is currently only implemented on Windows and macOS. On other platforms,
   * it will fallback to [shellOpen] with a directory path of [fileOrDirPath] prefixed with `file://`.
   */
  @JvmOverloads
  public final fun shellShowInFileManager(fileOrDirPath: String, openFolder: Boolean = true):
      Error {
    TransferContext.writeArguments(STRING to fileOrDirPath, BOOL to openFolder)
    TransferContext.callMethod(rawPtr, MethodBindings.shellShowInFileManagerPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns `true` if the child process ID ([pid]) is still running or `false` if it has
   * terminated. [pid] must be a valid ID generated from [createProcess].
   * **Note:** This method is implemented on Android, iOS, Linux, macOS, and Windows.
   */
  public final fun isProcessRunning(pid: Int): Boolean {
    TransferContext.writeArguments(LONG to pid.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isProcessRunningPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the exit code of a spawned process once it has finished running (see
   * [isProcessRunning]).
   * Returns `-1` if the [pid] is not a PID of a spawned child process, the process is still
   * running, or the method is not implemented for the current platform.
   * **Note:** Returns `-1` if the [pid] is a macOS bundled app process.
   * **Note:** This method is implemented on Android, Linux, macOS and Windows.
   */
  public final fun getProcessExitCode(pid: Int): Int {
    TransferContext.writeArguments(LONG to pid.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getProcessExitCodePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the number used by the host machine to uniquely identify this application.
   * **Note:** This method is implemented on Android, iOS, Linux, macOS, and Windows.
   */
  public final fun getProcessId(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getProcessIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns `true` if the environment variable with the name [variable] exists.
   * **Note:** Double-check the casing of [variable]. Environment variable names are case-sensitive
   * on all platforms except Windows.
   */
  public final fun hasEnvironment(variable: String): Boolean {
    TransferContext.writeArguments(STRING to variable)
    TransferContext.callMethod(rawPtr, MethodBindings.hasEnvironmentPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the value of the given environment variable, or an empty string if [variable] doesn't
   * exist.
   * **Note:** Double-check the casing of [variable]. Environment variable names are case-sensitive
   * on all platforms except Windows.
   * **Note:** On macOS, applications do not have access to shell environment variables.
   */
  public final fun getEnvironment(variable: String): String {
    TransferContext.writeArguments(STRING to variable)
    TransferContext.callMethod(rawPtr, MethodBindings.getEnvironmentPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Sets the value of the environment variable [variable] to [value]. The environment variable will
   * be set for the Godot process and any process executed with [execute] after running
   * [setEnvironment]. The environment variable will *not* persist to processes run after the Godot
   * process was terminated.
   * **Note:** Environment variable names are case-sensitive on all platforms except Windows. The
   * [variable] name cannot be empty or include the `=` character. On Windows, there is a 32767
   * characters limit for the combined length of [variable], [value], and the `=` and null terminator
   * characters that will be registered in the environment block.
   */
  public final fun setEnvironment(variable: String, `value`: String): Unit {
    TransferContext.writeArguments(STRING to variable, STRING to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setEnvironmentPtr, NIL)
  }

  /**
   * Removes the given environment variable from the current environment, if it exists. The
   * [variable] name cannot be empty or include the `=` character. The environment variable will be
   * removed for the Godot process and any process executed with [execute] after running
   * [unsetEnvironment]. The removal of the environment variable will *not* persist to processes run
   * after the Godot process was terminated.
   * **Note:** Environment variable names are case-sensitive on all platforms except Windows.
   */
  public final fun unsetEnvironment(variable: String): Unit {
    TransferContext.writeArguments(STRING to variable)
    TransferContext.callMethod(rawPtr, MethodBindings.unsetEnvironmentPtr, NIL)
  }

  /**
   * Returns the name of the host platform.
   * - On Windows, this is `"Windows"`.
   * - On macOS, this is `"macOS"`.
   * - On Linux-based operating systems, this is `"Linux"`.
   * - On BSD-based operating systems, this is `"FreeBSD"`, `"NetBSD"`, `"OpenBSD"`, or `"BSD"` as a
   * fallback.
   * - On Android, this is `"Android"`.
   * - On iOS, this is `"iOS"`.
   * - On Web, this is `"Web"`.
   * **Note:** Custom builds of the engine may support additional platforms, such as consoles,
   * possibly returning other names.
   *
   * gdscript:
   * ```gdscript
   * match OS.get_name():
   *     "Windows":
   *         print("Welcome to Windows!")
   *     "macOS":
   *         print("Welcome to macOS!")
   *     "Linux", "FreeBSD", "NetBSD", "OpenBSD", "BSD":
   *         print("Welcome to Linux/BSD!")
   *     "Android":
   *         print("Welcome to Android!")
   *     "iOS":
   *         print("Welcome to iOS!")
   *     "Web":
   *         print("Welcome to the Web!")
   * ```
   * csharp:
   * ```csharp
   * switch (OS.GetName())
   * {
   *     case "Windows":
   *         GD.Print("Welcome to Windows");
   *         break;
   *     case "macOS":
   *         GD.Print("Welcome to macOS!");
   *         break;
   *     case "Linux":
   *     case "FreeBSD":
   *     case "NetBSD":
   *     case "OpenBSD":
   *     case "BSD":
   *         GD.Print("Welcome to Linux/BSD!");
   *         break;
   *     case "Android":
   *         GD.Print("Welcome to Android!");
   *         break;
   *     case "iOS":
   *         GD.Print("Welcome to iOS!");
   *         break;
   *     case "Web":
   *         GD.Print("Welcome to the Web!");
   *         break;
   * }
   * ```
   *
   * **Note:** On Web platforms, it is still possible to determine the host platform's OS with
   * feature tags. See [hasFeature].
   */
  public final fun getName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the name of the distribution for Linux and BSD platforms (e.g. "Ubuntu", "Manjaro",
   * "OpenBSD", etc.).
   * Returns the same value as [getName] for stock Android ROMs, but attempts to return the custom
   * ROM name for popular Android derivatives such as "LineageOS".
   * Returns the same value as [getName] for other platforms.
   * **Note:** This method is not supported on the Web platform. It returns an empty string.
   */
  public final fun getDistributionName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDistributionNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the exact production and build version of the operating system. This is different from
   * the branded version used in marketing. This helps to distinguish between different releases of
   * operating systems, including minor versions, and insider and custom builds.
   * - For Windows, the major and minor version are returned, as well as the build number. For
   * example, the returned string may look like `10.0.9926` for a build of Windows 10, and it may look
   * like `6.1.7601` for a build of Windows 7 SP1.
   * - For rolling distributions, such as Arch Linux, an empty string is returned.
   * - For macOS and iOS, the major and minor version are returned, as well as the patch number.
   * - For Android, the SDK version and the incremental build number are returned. If it's a custom
   * ROM, it attempts to return its version instead.
   * **Note:** This method is not supported on the Web platform. It returns an empty string.
   */
  public final fun getVersion(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVersionPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the command-line arguments passed to the engine.
   * Command-line arguments can be written in any form, including both `--key value` and
   * `--key=value` forms so they can be properly parsed, as long as custom command-line arguments do
   * not conflict with engine arguments.
   * You can also incorporate environment variables using the [getEnvironment] method.
   * You can set [ProjectSettings.editor/run/mainRunArgs] to define command-line arguments to be
   * passed by the editor when running the project.
   * Here's a minimal example on how to parse command-line arguments into a [Dictionary] using the
   * `--key=value` form for arguments:
   *
   * gdscript:
   * ```gdscript
   * var arguments = {}
   * for argument in OS.get_cmdline_args():
   *     if argument.contains("="):
   *         var key_value = argument.split("=")
   *         arguments[key_value[0].trim_prefix("--")] = key_value[1]
   *     else:
   *         # Options without an argument will be present in the dictionary,
   *         # with the value set to an empty string.
   *         arguments[argument.trim_prefix("--")] = ""
   * ```
   * csharp:
   * ```csharp
   * var arguments = new Dictionary<string, string>();
   * foreach (var argument in OS.GetCmdlineArgs())
   * {
   *     if (argument.Contains('='))
   *     {
   *         string[] keyValue = argument.Split("=");
   *         arguments[keyValue[0].TrimPrefix("--")] = keyValue[1];
   *     }
   *     else
   *     {
   *         // Options without an argument will be present in the dictionary,
   *         // with the value set to an empty string.
   *         arguments[argument.TrimPrefix("--")] = "";
   *     }
   * }
   * ```
   *
   * **Note:** Passing custom user arguments directly is not recommended, as the engine may discard
   * or modify them. Instead, pass the standard UNIX double dash (`--`) and then the custom arguments,
   * which the engine will ignore by design. These can be read via [getCmdlineUserArgs].
   */
  public final fun getCmdlineArgs(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCmdlineArgsPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Returns the command-line user arguments passed to the engine. User arguments are ignored by the
   * engine and reserved for the user. They are passed after the double dash `--` argument. `++` may be
   * used when `--` is intercepted by another program (such as `startx`).
   * [codeblock]
   * # Godot has been executed with the following command:
   * # godot --fullscreen -- --level=2 --hardcore
   *
   * OS.get_cmdline_args()      # Returns ["--fullscreen", "--level=2", "--hardcore"]
   * OS.get_cmdline_user_args() # Returns ["--level=2", "--hardcore"]
   * [/codeblock]
   * To get all passed arguments, use [getCmdlineArgs].
   */
  public final fun getCmdlineUserArgs(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCmdlineUserArgsPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Returns the video adapter driver name and version for the user's currently active graphics
   * card, as a [PackedStringArray]. See also [RenderingServer.getVideoAdapterApiVersion].
   * The first element holds the driver name, such as `nvidia`, `amdgpu`, etc.
   * The second element holds the driver version. For example, on the `nvidia` driver on a Linux/BSD
   * platform, the version is in the format `510.85.02`. For Windows, the driver's format is
   * `31.0.15.1659`.
   * **Note:** This method is only supported on Linux/BSD and Windows when not running in headless
   * mode. On other platforms, it returns an empty array.
   */
  public final fun getVideoAdapterDriverInfo(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVideoAdapterDriverInfoPtr,
        PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * If [restart] is `true`, restarts the project automatically when it is exited with
   * [SceneTree.quit] or [Node.NOTIFICATION_WM_CLOSE_REQUEST]. Command-line [arguments] can be
   * supplied. To restart the project with the same command line arguments as originally used to run
   * the project, pass [getCmdlineArgs] as the value for [arguments].
   * This method can be used to apply setting changes that require a restart. See also
   * [isRestartOnExitSet] and [getRestartOnExitArguments].
   * **Note:** This method is only effective on desktop platforms, and only when the project isn't
   * started from the editor. It will have no effect on mobile and Web platforms, or when the project
   * is started from the editor.
   * **Note:** If the project process crashes or is *killed* by the user (by sending `SIGKILL`
   * instead of the usual `SIGTERM`), the project won't restart automatically.
   */
  @JvmOverloads
  public final fun setRestartOnExit(restart: Boolean, arguments: PackedStringArray =
      PackedStringArray()): Unit {
    TransferContext.writeArguments(BOOL to restart, PACKED_STRING_ARRAY to arguments)
    TransferContext.callMethod(rawPtr, MethodBindings.setRestartOnExitPtr, NIL)
  }

  /**
   * Returns `true` if the project will automatically restart when it exits for any reason, `false`
   * otherwise. See also [setRestartOnExit] and [getRestartOnExitArguments].
   */
  public final fun isRestartOnExitSet(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isRestartOnExitSetPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the list of command line arguments that will be used when the project automatically
   * restarts using [setRestartOnExit]. See also [isRestartOnExitSet].
   */
  public final fun getRestartOnExitArguments(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRestartOnExitArgumentsPtr,
        PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Delays execution of the current thread by [usec] microseconds. [usec] must be greater than or
   * equal to `0`. Otherwise, [delayUsec] does nothing and prints an error message.
   * **Note:** [delayUsec] is a *blocking* way to delay code execution. To delay code execution in a
   * non-blocking way, you may use [SceneTree.createTimer]. Awaiting with a [SceneTreeTimer] delays the
   * execution of code placed below the `await` without affecting the rest of the project (or editor,
   * for [EditorPlugin]s and [EditorScript]s).
   * **Note:** When [delayUsec] is called on the main thread, it will freeze the project and will
   * prevent it from redrawing and registering input until the delay has passed. When using [delayUsec]
   * as part of an [EditorPlugin] or [EditorScript], it will freeze the editor but won't freeze the
   * project if it is currently running (since the project is an independent child process).
   */
  public final fun delayUsec(usec: Int): Unit {
    TransferContext.writeArguments(LONG to usec.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.delayUsecPtr, NIL)
  }

  /**
   * Delays execution of the current thread by [msec] milliseconds. [msec] must be greater than or
   * equal to `0`. Otherwise, [delayMsec] does nothing and prints an error message.
   * **Note:** [delayMsec] is a *blocking* way to delay code execution. To delay code execution in a
   * non-blocking way, you may use [SceneTree.createTimer]. Awaiting with [SceneTreeTimer] delays the
   * execution of code placed below the `await` without affecting the rest of the project (or editor,
   * for [EditorPlugin]s and [EditorScript]s).
   * **Note:** When [delayMsec] is called on the main thread, it will freeze the project and will
   * prevent it from redrawing and registering input until the delay has passed. When using [delayMsec]
   * as part of an [EditorPlugin] or [EditorScript], it will freeze the editor but won't freeze the
   * project if it is currently running (since the project is an independent child process).
   */
  public final fun delayMsec(msec: Int): Unit {
    TransferContext.writeArguments(LONG to msec.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.delayMsecPtr, NIL)
  }

  /**
   * Returns the host OS locale as a [String] of the form `language_Script_COUNTRY_VARIANT@extra`.
   * Every substring after `language` is optional and may not exist.
   * - `language` - 2 or 3-letter
   * [url=https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes]language code[/url], in lower case.
   * - [code skip-lint]Script[/code] - 4-letter [url=https://en.wikipedia.org/wiki/ISO_15924]script
   * code[/url], in title case.
   * - `COUNTRY` - 2 or 3-letter [url=https://en.wikipedia.org/wiki/ISO_3166-1]country code[/url],
   * in upper case.
   * - `VARIANT` - language variant, region and sort order. The variant can have any number of
   * underscored keywords.
   * - `extra` - semicolon separated list of additional key words. This may include currency,
   * calendar, sort order and numbering system information.
   * If you want only the language code and not the fully specified locale from the OS, you can use
   * [getLocaleLanguage].
   */
  public final fun getLocale(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLocalePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the host OS locale's 2 or 3-letter
   * [url=https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes]language code[/url] as a string which
   * should be consistent on all platforms. This is equivalent to extracting the `language` part of the
   * [getLocale] string.
   * This can be used to narrow down fully specified locale strings to only the "common" language
   * code, when you don't need the additional information about country code or variants. For example,
   * for a French Canadian user with `fr_CA` locale, this would return `fr`.
   */
  public final fun getLocaleLanguage(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLocaleLanguagePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the model name of the current device.
   * **Note:** This method is implemented on Android and iOS. Returns `"GenericDevice"` on
   * unsupported platforms.
   */
  public final fun getModelName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getModelNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns `true` if the `user://` file system is persistent, that is, its state is the same after
   * a player quits and starts the game again. Relevant to the Web platform, where this persistence may
   * be unavailable.
   */
  public final fun isUserfsPersistent(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isUserfsPersistentPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the engine was executed with the `--verbose` or `-v` command line argument,
   * or if [ProjectSettings.debug/settings/stdout/verboseStdout] is `true`. See also
   * [@GlobalScope.printVerbose].
   */
  public final fun isStdoutVerbose(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isStdoutVerbosePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the Godot binary used to run the project is a *debug* export template, or
   * when running in the editor.
   * Returns `false` if the Godot binary used to run the project is a *release* export template.
   * **Note:** To check whether the Godot binary used to run the project is an export template
   * (debug or release), use `OS.has_feature("template")` instead.
   */
  public final fun isDebugBuild(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isDebugBuildPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the amount of static memory being used by the program in bytes. Only works in debug
   * builds.
   */
  public final fun getStaticMemoryUsage(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getStaticMemoryUsagePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the maximum amount of static memory used. Only works in debug builds.
   */
  public final fun getStaticMemoryPeakUsage(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getStaticMemoryPeakUsagePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns a [Dictionary] containing information about the current memory with the following
   * entries:
   * - `"physical"` - total amount of usable physical memory in bytes. This value can be slightly
   * less than the actual physical memory amount, since it does not include memory reserved by the
   * kernel and devices.
   * - `"free"` - amount of physical memory, that can be immediately allocated without disk access
   * or other costly operations, in bytes. The process might be able to allocate more physical memory,
   * but this action will require moving inactive pages to disk, which can be expensive.
   * - `"available"` - amount of memory that can be allocated without extending the swap file(s), in
   * bytes. This value includes both physical memory and swap.
   * - `"stack"` - size of the current thread stack in bytes.
   * **Note:** Each entry's value may be `-1` if it is unknown.
   */
  public final fun getMemoryInfo(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMemoryInfoPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  /**
   * Moves the file or directory at the given [path] to the system's recycle bin. See also
   * [DirAccess.remove].
   * The method takes only global paths, so you may need to use [ProjectSettings.globalizePath]. Do
   * not use it for files in `res://` as it will not work in exported projects.
   * Returns [FAILED] if the file or directory cannot be found, or the system does not support this
   * method.
   *
   * gdscript:
   * ```gdscript
   * var file_to_remove = "user://slot1.save"
   * OS.move_to_trash(ProjectSettings.globalize_path(file_to_remove))
   * ```
   * csharp:
   * ```csharp
   * var fileToRemove = "user://slot1.save";
   * OS.MoveToTrash(ProjectSettings.GlobalizePath(fileToRemove));
   * ```
   *
   * **Note:** This method is implemented on Android, Linux, macOS and Windows.
   * **Note:** If the user has disabled the recycle bin on their system, the file will be
   * permanently deleted instead.
   */
  public final fun moveToTrash(path: String): Error {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.moveToTrashPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the absolute directory path where user data is written (the `user://` directory in
   * Godot). The path depends on the project name and
   * [ProjectSettings.application/config/useCustomUserDir].
   * - On Windows, this is `&#37;AppData&#37;\Godot\app_userdata\[project_name]`, or
   * `&#37;AppData&#37;\[custom_name]` if `use_custom_user_dir` is set. `&#37;AppData&#37;` expands to
   * `&#37;UserProfile&#37;\AppData\Roaming`.
   * - On macOS, this is `~/Library/Application Support/Godot/app_userdata/[project_name]`, or
   * `~/Library/Application Support/[custom_name]` if `use_custom_user_dir` is set.
   * - On Linux and BSD, this is `~/.local/share/godot/app_userdata/[project_name]`, or
   * `~/.local/share/[custom_name]` if `use_custom_user_dir` is set.
   * - On Android and iOS, this is a sandboxed directory in either internal or external storage,
   * depending on the user's configuration.
   * - On Web, this is a virtual directory managed by the browser.
   * If the project name is empty, `[project_name]` falls back to `[unnamed project]`.
   * Not to be confused with [getDataDir], which returns the *global* (non-project-specific) user
   * home directory.
   */
  public final fun getUserDataDir(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getUserDataDirPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the path to commonly used folders across different platforms, as defined by [dir]. See
   * the [SystemDir] constants for available locations.
   * **Note:** This method is implemented on Android, Linux, macOS and Windows.
   * **Note:** Shared storage is implemented on Android and allows to differentiate between app
   * specific and shared directories, if [sharedStorage] is `true`. Shared directories have additional
   * restrictions on Android.
   */
  @JvmOverloads
  public final fun getSystemDir(dir: SystemDir, sharedStorage: Boolean = true): String {
    TransferContext.writeArguments(LONG to dir.id, BOOL to sharedStorage)
    TransferContext.callMethod(rawPtr, MethodBindings.getSystemDirPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the *global* user configuration directory according to the operating system's
   * standards.
   * On the Linux/BSD platform, this path can be overridden by setting the `XDG_CONFIG_HOME`
   * environment variable before starting the project. See
   * [url=$DOCS_URL/tutorials/io/data_paths.html]File paths in Godot projects[/url] in the
   * documentation for more information. See also [getCacheDir] and [getDataDir].
   * Not to be confused with [getUserDataDir], which returns the *project-specific* user data path.
   */
  public final fun getConfigDir(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getConfigDirPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the *global* user data directory according to the operating system's standards.
   * On the Linux/BSD platform, this path can be overridden by setting the `XDG_DATA_HOME`
   * environment variable before starting the project. See
   * [url=$DOCS_URL/tutorials/io/data_paths.html]File paths in Godot projects[/url] in the
   * documentation for more information. See also [getCacheDir] and [getConfigDir].
   * Not to be confused with [getUserDataDir], which returns the *project-specific* user data path.
   */
  public final fun getDataDir(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDataDirPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the *global* cache data directory according to the operating system's standards.
   * On the Linux/BSD platform, this path can be overridden by setting the `XDG_CACHE_HOME`
   * environment variable before starting the project. See
   * [url=$DOCS_URL/tutorials/io/data_paths.html]File paths in Godot projects[/url] in the
   * documentation for more information. See also [getConfigDir] and [getDataDir].
   * Not to be confused with [getUserDataDir], which returns the *project-specific* user data path.
   */
  public final fun getCacheDir(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCacheDirPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns a string that is unique to the device.
   * **Note:** This string may change without notice if the user reinstalls their operating system,
   * upgrades it, or modifies their hardware. This means it should generally not be used to encrypt
   * persistent data, as the data saved before an unexpected ID change would become inaccessible. The
   * returned string may also be falsified using external programs, so do not rely on the string
   * returned by this method for security purposes.
   * **Note:** On Web, returns an empty string and generates an error, as this method cannot be
   * implemented for security reasons.
   */
  public final fun getUniqueId(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getUniqueIdPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the given keycode as a [String].
   *
   * gdscript:
   * ```gdscript
   * print(OS.get_keycode_string(KEY_C))                    # Prints "C"
   * print(OS.get_keycode_string(KEY_ESCAPE))               # Prints "Escape"
   * print(OS.get_keycode_string(KEY_MASK_SHIFT | KEY_TAB)) # Prints "Shift+Tab"
   * ```
   * csharp:
   * ```csharp
   * GD.Print(OS.GetKeycodeString(Key.C));                                    // Prints "C"
   * GD.Print(OS.GetKeycodeString(Key.Escape));                               // Prints "Escape"
   * GD.Print(OS.GetKeycodeString((Key)KeyModifierMask.MaskShift | Key.Tab)); // Prints "Shift+Tab"
   * ```
   *
   * See also [findKeycodeFromString], [InputEventKey.keycode], and
   * [InputEventKey.getKeycodeWithModifiers].
   */
  public final fun getKeycodeString(code: Key): String {
    TransferContext.writeArguments(LONG to code.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getKeycodeStringPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns `true` if the input keycode corresponds to a Unicode character. For a list of codes,
   * see the [Key] constants.
   *
   * gdscript:
   * ```gdscript
   * print(OS.is_keycode_unicode(KEY_G))      # Prints true
   * print(OS.is_keycode_unicode(KEY_KP_4))   # Prints true
   * print(OS.is_keycode_unicode(KEY_TAB))    # Prints false
   * print(OS.is_keycode_unicode(KEY_ESCAPE)) # Prints false
   * ```
   * csharp:
   * ```csharp
   * GD.Print(OS.IsKeycodeUnicode((long)Key.G));      // Prints true
   * GD.Print(OS.IsKeycodeUnicode((long)Key.Kp4));    // Prints true
   * GD.Print(OS.IsKeycodeUnicode((long)Key.Tab));    // Prints false
   * GD.Print(OS.IsKeycodeUnicode((long)Key.Escape)); // Prints false
   * ```
   */
  public final fun isKeycodeUnicode(code: Long): Boolean {
    TransferContext.writeArguments(LONG to code)
    TransferContext.callMethod(rawPtr, MethodBindings.isKeycodeUnicodePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Finds the keycode for the given string. The returned values are equivalent to the [Key]
   * constants.
   *
   * gdscript:
   * ```gdscript
   * print(OS.find_keycode_from_string("C"))         # Prints 67 (KEY_C)
   * print(OS.find_keycode_from_string("Escape"))    # Prints 4194305 (KEY_ESCAPE)
   * print(OS.find_keycode_from_string("Shift+Tab")) # Prints 37748738 (KEY_MASK_SHIFT | KEY_TAB)
   * print(OS.find_keycode_from_string("Unknown"))   # Prints 0 (KEY_NONE)
   * ```
   * csharp:
   * ```csharp
   * GD.Print(OS.FindKeycodeFromString("C"));         // Prints C (Key.C)
   * GD.Print(OS.FindKeycodeFromString("Escape"));    // Prints Escape (Key.Escape)
   * GD.Print(OS.FindKeycodeFromString("Shift+Tab")); // Prints 37748738 (KeyModifierMask.MaskShift
   * | Key.Tab)
   * GD.Print(OS.FindKeycodeFromString("Unknown"));   // Prints None (Key.None)
   * ```
   *
   * See also [getKeycodeString].
   */
  public final fun findKeycodeFromString(string: String): Key {
    TransferContext.writeArguments(STRING to string)
    TransferContext.callMethod(rawPtr, MethodBindings.findKeycodeFromStringPtr, LONG)
    return Key.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * If [enabled] is `true`, when opening a file for writing, a temporary file is used in its place.
   * When closed, it is automatically applied to the target file.
   * This can useful when files may be opened by other applications, such as antiviruses, text
   * editors, or even the Godot editor itself.
   */
  public final fun setUseFileAccessSaveAndSwap(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setUseFileAccessSaveAndSwapPtr, NIL)
  }

  /**
   * Assigns the given name to the current thread. Returns [ERR_UNAVAILABLE] if unavailable on the
   * current platform.
   */
  public final fun setThreadName(name: String): Error {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.setThreadNamePtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the ID of the current thread. This can be used in logs to ease debugging of
   * multi-threaded applications.
   * **Note:** Thread IDs are not deterministic and may be reused across application restarts.
   */
  public final fun getThreadCallerId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getThreadCallerIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the ID of the main thread. See [getThreadCallerId].
   * **Note:** Thread IDs are not deterministic and may be reused across application restarts.
   */
  public final fun getMainThreadId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMainThreadIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns `true` if the feature for the given feature tag is supported in the currently running
   * instance, depending on the platform, build, etc. Can be used to check whether you're currently
   * running a debug build, on a certain platform or arch, etc. Refer to the
   * [url=$DOCS_URL/tutorials/export/feature_tags.html]Feature Tags[/url] documentation for more
   * details.
   * **Note:** Tag names are case-sensitive.
   * **Note:** On the Web platform, one of the following additional tags is defined to indicate the
   * host platform: `web_android`, `web_ios`, `web_linuxbsd`, `web_macos`, or `web_windows`.
   */
  public final fun hasFeature(tagName: String): Boolean {
    TransferContext.writeArguments(STRING to tagName)
    TransferContext.callMethod(rawPtr, MethodBindings.hasFeaturePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the application is running in the sandbox.
   * **Note:** This method is only implemented on macOS and Linux.
   */
  public final fun isSandboxed(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isSandboxedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Requests permission from the OS for the given [name]. Returns `true` if the permission has been
   * successfully granted.
   * **Note:** This method is currently only implemented on Android, to specifically request
   * permission for `"RECORD_AUDIO"` by `AudioDriverOpenSL`.
   */
  public final fun requestPermission(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.requestPermissionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Requests *dangerous* permissions from the OS. Returns `true` if permissions have been
   * successfully granted.
   * **Note:** This method is only implemented on Android. Normal permissions are automatically
   * granted at install time in Android applications.
   */
  public final fun requestPermissions(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.requestPermissionsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * On Android devices: Returns the list of dangerous permissions that have been granted.
   * On macOS: Returns the list of user selected folders accessible to the application (sandboxed
   * applications only). Use the native file dialog to request folder access permission.
   */
  public final fun getGrantedPermissions(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getGrantedPermissionsPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * On macOS (sandboxed applications only), this function clears list of user selected folders
   * accessible to the application.
   */
  public final fun revokeGrantedPermissions(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.revokeGrantedPermissionsPtr, NIL)
  }

  public enum class RenderingDriver(
    id: Long,
  ) {
    /**
     * The Vulkan rendering driver. It requires Vulkan 1.0 support and automatically uses features
     * from Vulkan 1.1 and 1.2 if available.
     */
    RENDERING_DRIVER_VULKAN(0),
    /**
     * The OpenGL 3 rendering driver. It uses OpenGL 3.3 Core Profile on desktop platforms, OpenGL
     * ES 3.0 on mobile devices, and WebGL 2.0 on Web.
     */
    RENDERING_DRIVER_OPENGL3(1),
    /**
     * The Direct3D 12 rendering driver.
     */
    RENDERING_DRIVER_D3D12(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): RenderingDriver = entries.single { it.id == `value` }
    }
  }

  public enum class SystemDir(
    id: Long,
  ) {
    /**
     * Refers to the Desktop directory path.
     */
    SYSTEM_DIR_DESKTOP(0),
    /**
     * Refers to the DCIM (Digital Camera Images) directory path.
     */
    SYSTEM_DIR_DCIM(1),
    /**
     * Refers to the Documents directory path.
     */
    SYSTEM_DIR_DOCUMENTS(2),
    /**
     * Refers to the Downloads directory path.
     */
    SYSTEM_DIR_DOWNLOADS(3),
    /**
     * Refers to the Movies (or Videos) directory path.
     */
    SYSTEM_DIR_MOVIES(4),
    /**
     * Refers to the Music directory path.
     */
    SYSTEM_DIR_MUSIC(5),
    /**
     * Refers to the Pictures directory path.
     */
    SYSTEM_DIR_PICTURES(6),
    /**
     * Refers to the Ringtones directory path.
     */
    SYSTEM_DIR_RINGTONES(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): SystemDir = entries.single { it.id == `value` }
    }
  }

  internal object MethodBindings {
    public val getEntropyPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "get_entropy", 47165747)

    public val getSystemCaCertificatesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_system_ca_certificates", 2841200299)

    public val getConnectedMidiInputsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_connected_midi_inputs", 2981934095)

    public val openMidiInputsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "open_midi_inputs", 3218959716)

    public val closeMidiInputsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "close_midi_inputs", 3218959716)

    public val alertPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "alert", 1783970740)

    public val crashPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "crash", 83702148)

    public val setLowProcessorUsageModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "set_low_processor_usage_mode", 2586408642)

    public val isInLowProcessorUsageModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "is_in_low_processor_usage_mode", 36873697)

    public val setLowProcessorUsageModeSleepUsecPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "set_low_processor_usage_mode_sleep_usec", 1286410249)

    public val getLowProcessorUsageModeSleepUsecPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_low_processor_usage_mode_sleep_usec", 3905245786)

    public val setDeltaSmoothingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "set_delta_smoothing", 2586408642)

    public val isDeltaSmoothingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "is_delta_smoothing_enabled", 36873697)

    public val getProcessorCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_processor_count", 3905245786)

    public val getProcessorNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_processor_name", 201670096)

    public val getSystemFontsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_system_fonts", 1139954409)

    public val getSystemFontPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_system_font_path", 626580860)

    public val getSystemFontPathForTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_system_font_path_for_text", 197317981)

    public val getExecutablePathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_executable_path", 201670096)

    public val readStringFromStdinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "read_string_from_stdin", 2841200299)

    public val executePtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "execute", 1488299882)

    public val executeWithPipePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "execute_with_pipe", 3845631403)

    public val createProcessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "create_process", 2903767230)

    public val createInstancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "create_instance", 1080601263)

    public val killPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "kill", 844576869)

    public val shellOpenPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "shell_open", 166001499)

    public val shellShowInFileManagerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "shell_show_in_file_manager", 3565188097)

    public val isProcessRunningPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "is_process_running", 1116898809)

    public val getProcessExitCodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_process_exit_code", 923996154)

    public val getProcessIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_process_id", 3905245786)

    public val hasEnvironmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "has_environment", 3927539163)

    public val getEnvironmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_environment", 3135753539)

    public val setEnvironmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "set_environment", 3605043004)

    public val unsetEnvironmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "unset_environment", 3089850668)

    public val getNamePtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "get_name", 201670096)

    public val getDistributionNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_distribution_name", 201670096)

    public val getVersionPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "get_version", 201670096)

    public val getCmdlineArgsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_cmdline_args", 2981934095)

    public val getCmdlineUserArgsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_cmdline_user_args", 2981934095)

    public val getVideoAdapterDriverInfoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_video_adapter_driver_info", 1139954409)

    public val setRestartOnExitPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "set_restart_on_exit", 3331453935)

    public val isRestartOnExitSetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "is_restart_on_exit_set", 36873697)

    public val getRestartOnExitArgumentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_restart_on_exit_arguments", 1139954409)

    public val delayUsecPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "delay_usec", 998575451)

    public val delayMsecPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "delay_msec", 998575451)

    public val getLocalePtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "get_locale", 201670096)

    public val getLocaleLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_locale_language", 201670096)

    public val getModelNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_model_name", 201670096)

    public val isUserfsPersistentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "is_userfs_persistent", 36873697)

    public val isStdoutVerbosePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "is_stdout_verbose", 36873697)

    public val isDebugBuildPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "is_debug_build", 36873697)

    public val getStaticMemoryUsagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_static_memory_usage", 3905245786)

    public val getStaticMemoryPeakUsagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_static_memory_peak_usage", 3905245786)

    public val getMemoryInfoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_memory_info", 3102165223)

    public val moveToTrashPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "move_to_trash", 2113323047)

    public val getUserDataDirPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_user_data_dir", 201670096)

    public val getSystemDirPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_system_dir", 3073895123)

    public val getConfigDirPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_config_dir", 201670096)

    public val getDataDirPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_data_dir", 201670096)

    public val getCacheDirPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_cache_dir", 201670096)

    public val getUniqueIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_unique_id", 201670096)

    public val getKeycodeStringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_keycode_string", 2261993717)

    public val isKeycodeUnicodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "is_keycode_unicode", 1116898809)

    public val findKeycodeFromStringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "find_keycode_from_string", 1084858572)

    public val setUseFileAccessSaveAndSwapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "set_use_file_access_save_and_swap", 2586408642)

    public val setThreadNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "set_thread_name", 166001499)

    public val getThreadCallerIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_thread_caller_id", 3905245786)

    public val getMainThreadIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_main_thread_id", 3905245786)

    public val hasFeaturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "has_feature", 3927539163)

    public val isSandboxedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "is_sandboxed", 36873697)

    public val requestPermissionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "request_permission", 2323990056)

    public val requestPermissionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "request_permissions", 2240911060)

    public val getGrantedPermissionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_granted_permissions", 1139954409)

    public val revokeGrantedPermissionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "revoke_granted_permissions", 3218959716)
  }
}
