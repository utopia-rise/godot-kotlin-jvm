// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
package godot.core

import kotlin.Long

public enum class Error(
  id: Long,
) {
  /**
   * Methods that return [Error] return [OK] when no error occurred.
   * Since [OK] has value 0, and all other error constants are positive integers, it can also be
   * used in boolean checks.
   * **Example:**
   * [codeblock]
   * var error = method_that_returns_error()
   * if error != OK:
   *     printerr("Failure!")
   *
   * # Or, alternatively:
   * if error:
   *     printerr("Still failing!")
   * [/codeblock]
   * **Note:** Many functions do not return an error code, but will print error messages to standard
   * output.
   */
  OK(0),
  /**
   * Generic error.
   */
  FAILED(1),
  /**
   * Unavailable error.
   */
  ERR_UNAVAILABLE(2),
  /**
   * Unconfigured error.
   */
  ERR_UNCONFIGURED(3),
  /**
   * Unauthorized error.
   */
  ERR_UNAUTHORIZED(4),
  /**
   * Parameter range error.
   */
  ERR_PARAMETER_RANGE_ERROR(5),
  /**
   * Out of memory (OOM) error.
   */
  ERR_OUT_OF_MEMORY(6),
  /**
   * File: Not found error.
   */
  ERR_FILE_NOT_FOUND(7),
  /**
   * File: Bad drive error.
   */
  ERR_FILE_BAD_DRIVE(8),
  /**
   * File: Bad path error.
   */
  ERR_FILE_BAD_PATH(9),
  /**
   * File: No permission error.
   */
  ERR_FILE_NO_PERMISSION(10),
  /**
   * File: Already in use error.
   */
  ERR_FILE_ALREADY_IN_USE(11),
  /**
   * File: Can't open error.
   */
  ERR_FILE_CANT_OPEN(12),
  /**
   * File: Can't write error.
   */
  ERR_FILE_CANT_WRITE(13),
  /**
   * File: Can't read error.
   */
  ERR_FILE_CANT_READ(14),
  /**
   * File: Unrecognized error.
   */
  ERR_FILE_UNRECOGNIZED(15),
  /**
   * File: Corrupt error.
   */
  ERR_FILE_CORRUPT(16),
  /**
   * File: Missing dependencies error.
   */
  ERR_FILE_MISSING_DEPENDENCIES(17),
  /**
   * File: End of file (EOF) error.
   */
  ERR_FILE_EOF(18),
  /**
   * Can't open error.
   */
  ERR_CANT_OPEN(19),
  /**
   * Can't create error.
   */
  ERR_CANT_CREATE(20),
  /**
   * Query failed error.
   */
  ERR_QUERY_FAILED(21),
  /**
   * Already in use error.
   */
  ERR_ALREADY_IN_USE(22),
  /**
   * Locked error.
   */
  ERR_LOCKED(23),
  /**
   * Timeout error.
   */
  ERR_TIMEOUT(24),
  /**
   * Can't connect error.
   */
  ERR_CANT_CONNECT(25),
  /**
   * Can't resolve error.
   */
  ERR_CANT_RESOLVE(26),
  /**
   * Connection error.
   */
  ERR_CONNECTION_ERROR(27),
  /**
   * Can't acquire resource error.
   */
  ERR_CANT_ACQUIRE_RESOURCE(28),
  /**
   * Can't fork process error.
   */
  ERR_CANT_FORK(29),
  /**
   * Invalid data error.
   */
  ERR_INVALID_DATA(30),
  /**
   * Invalid parameter error.
   */
  ERR_INVALID_PARAMETER(31),
  /**
   * Already exists error.
   */
  ERR_ALREADY_EXISTS(32),
  /**
   * Does not exist error.
   */
  ERR_DOES_NOT_EXIST(33),
  /**
   * Database: Read error.
   */
  ERR_DATABASE_CANT_READ(34),
  /**
   * Database: Write error.
   */
  ERR_DATABASE_CANT_WRITE(35),
  /**
   * Compilation failed error.
   */
  ERR_COMPILATION_FAILED(36),
  /**
   * Method not found error.
   */
  ERR_METHOD_NOT_FOUND(37),
  /**
   * Linking failed error.
   */
  ERR_LINK_FAILED(38),
  /**
   * Script failed error.
   */
  ERR_SCRIPT_FAILED(39),
  /**
   * Cycling link (import cycle) error.
   */
  ERR_CYCLIC_LINK(40),
  /**
   * Invalid declaration error.
   */
  ERR_INVALID_DECLARATION(41),
  /**
   * Duplicate symbol error.
   */
  ERR_DUPLICATE_SYMBOL(42),
  /**
   * Parse error.
   */
  ERR_PARSE_ERROR(43),
  /**
   * Busy error.
   */
  ERR_BUSY(44),
  /**
   * Skip error.
   */
  ERR_SKIP(45),
  /**
   * Help error. Used internally when passing `--version` or `--help` as executable options.
   */
  ERR_HELP(46),
  /**
   * Bug error, caused by an implementation issue in the method.
   * **Note:** If a built-in method returns this code, please open an issue on
   * [url=https://github.com/godotengine/godot/issues]the GitHub Issue Tracker[/url].
   */
  ERR_BUG(47),
  /**
   * Printer on fire error (This is an easter egg, no built-in methods return this error code).
   */
  ERR_PRINTER_ON_FIRE(48),
  ;

  public val id: Long
  init {
    this.id = id
  }

  public companion object {
    public fun from(`value`: Long): Error = entries.single { it.id == `value` }
  }
}
