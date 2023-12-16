// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

/**
 * A singleton for working with time data.
 *
 * The Time singleton allows converting time between various formats and also getting time information from the system.
 *
 * This class conforms with as many of the ISO 8601 standards as possible. All dates follow the Proleptic Gregorian calendar. As such, the day before `1582-10-15` is `1582-10-14`, not `1582-10-04`. The year before 1 AD (aka 1 BC) is number `0`, with the year before that (2 BC) being `-1`, etc.
 *
 * Conversion methods assume "the same timezone", and do not handle timezone conversions or DST automatically. Leap seconds are also not handled, they must be done manually if desired. Suffixes such as "Z" are not handled, you need to strip them away manually.
 *
 * When getting time information from the system, the time can either be in the local timezone or UTC depending on the `utc` parameter. However, the [getUnixTimeFromSystem] method always returns the time in UTC.
 *
 * **Important:** The `_from_system` methods use the system clock that the user can manually set. **Never use** this method for precise time calculation since its results are subject to automatic adjustments by the user or the operating system. **Always use** [getTicksUsec] or [getTicksMsec] for precise time calculation instead, since they are guaranteed to be monotonic (i.e. never decrease).
 */
@GodotBaseType
public object Time : Object() {
  public override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_TIME)
    return false
  }

  /**
   * Converts the given Unix timestamp to a dictionary of keys: `year`, `month`, `day`, `weekday`, `hour`, `minute`, and `second`.
   *
   * The returned Dictionary's values will be the same as the [getDatetimeDictFromSystem] if the Unix timestamp is the current time, with the exception of Daylight Savings Time as it cannot be determined from the epoch.
   */
  public fun getDatetimeDictFromUnixTime(unixTimeVal: Long): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(LONG to unixTimeVal)
    TransferContext.callMethod(rawPtr, MethodBindings.getDatetimeDictFromUnixTimePtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Converts the given Unix timestamp to a dictionary of keys: `year`, `month`, `day`, and `weekday`.
   */
  public fun getDateDictFromUnixTime(unixTimeVal: Long): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(LONG to unixTimeVal)
    TransferContext.callMethod(rawPtr, MethodBindings.getDateDictFromUnixTimePtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Converts the given time to a dictionary of keys: `hour`, `minute`, and `second`.
   */
  public fun getTimeDictFromUnixTime(unixTimeVal: Long): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(LONG to unixTimeVal)
    TransferContext.callMethod(rawPtr, MethodBindings.getTimeDictFromUnixTimePtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Converts the given Unix timestamp to an ISO 8601 date and time string (YYYY-MM-DDTHH:MM:SS).
   *
   * If [useSpace] is `true`, the date and time bits are separated by an empty space character instead of the letter T.
   */
  @JvmOverloads
  public fun getDatetimeStringFromUnixTime(unixTimeVal: Long, useSpace: Boolean = false): String {
    TransferContext.writeArguments(LONG to unixTimeVal, BOOL to useSpace)
    TransferContext.callMethod(rawPtr, MethodBindings.getDatetimeStringFromUnixTimePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Converts the given Unix timestamp to an ISO 8601 date string (YYYY-MM-DD).
   */
  public fun getDateStringFromUnixTime(unixTimeVal: Long): String {
    TransferContext.writeArguments(LONG to unixTimeVal)
    TransferContext.callMethod(rawPtr, MethodBindings.getDateStringFromUnixTimePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Converts the given Unix timestamp to an ISO 8601 time string (HH:MM:SS).
   */
  public fun getTimeStringFromUnixTime(unixTimeVal: Long): String {
    TransferContext.writeArguments(LONG to unixTimeVal)
    TransferContext.callMethod(rawPtr, MethodBindings.getTimeStringFromUnixTimePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Converts the given ISO 8601 date and time string (YYYY-MM-DDTHH:MM:SS) to a dictionary of keys: `year`, `month`, `day`, [code skip-lint]weekday`, `hour`, `minute`, and `second`.
   *
   * If [weekday] is `false`, then the [code skip-lint]weekday` entry is excluded (the calculation is relatively expensive).
   *
   * **Note:** Any decimal fraction in the time string will be ignored silently.
   */
  public fun getDatetimeDictFromDatetimeString(datetime: String, weekday: Boolean):
      Dictionary<Any?, Any?> {
    TransferContext.writeArguments(STRING to datetime, BOOL to weekday)
    TransferContext.callMethod(rawPtr, MethodBindings.getDatetimeDictFromDatetimeStringPtr,
        DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Converts the given dictionary of keys to an ISO 8601 date and time string (YYYY-MM-DDTHH:MM:SS).
   *
   * The given dictionary can be populated with the following keys: `year`, `month`, `day`, `hour`, `minute`, and `second`. Any other entries (including `dst`) are ignored.
   *
   * If the dictionary is empty, `0` is returned. If some keys are omitted, they default to the equivalent values for the Unix epoch timestamp 0 (1970-01-01 at 00:00:00).
   *
   * If [useSpace] is `true`, the date and time bits are separated by an empty space character instead of the letter T.
   */
  public fun getDatetimeStringFromDatetimeDict(datetime: Dictionary<Any?, Any?>, useSpace: Boolean):
      String {
    TransferContext.writeArguments(DICTIONARY to datetime, BOOL to useSpace)
    TransferContext.callMethod(rawPtr, MethodBindings.getDatetimeStringFromDatetimeDictPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Converts a dictionary of time values to a Unix timestamp.
   *
   * The given dictionary can be populated with the following keys: `year`, `month`, `day`, `hour`, `minute`, and `second`. Any other entries (including `dst`) are ignored.
   *
   * If the dictionary is empty, `0` is returned. If some keys are omitted, they default to the equivalent values for the Unix epoch timestamp 0 (1970-01-01 at 00:00:00).
   *
   * You can pass the output from [getDatetimeDictFromUnixTime] directly into this function and get the same as what was put in.
   *
   * **Note:** Unix timestamps are often in UTC. This method does not do any timezone conversion, so the timestamp will be in the same timezone as the given datetime dictionary.
   */
  public fun getUnixTimeFromDatetimeDict(datetime: Dictionary<Any?, Any?>): Long {
    TransferContext.writeArguments(DICTIONARY to datetime)
    TransferContext.callMethod(rawPtr, MethodBindings.getUnixTimeFromDatetimeDictPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Converts the given ISO 8601 date and/or time string to a Unix timestamp. The string can contain a date only, a time only, or both.
   *
   * **Note:** Unix timestamps are often in UTC. This method does not do any timezone conversion, so the timestamp will be in the same timezone as the given datetime string.
   *
   * **Note:** Any decimal fraction in the time string will be ignored silently.
   */
  public fun getUnixTimeFromDatetimeString(datetime: String): Long {
    TransferContext.writeArguments(STRING to datetime)
    TransferContext.callMethod(rawPtr, MethodBindings.getUnixTimeFromDatetimeStringPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Converts the given timezone offset in minutes to a timezone offset string. For example, -480 returns "-08:00", 345 returns "+05:45", and 0 returns "+00:00".
   */
  public fun getOffsetStringFromOffsetMinutes(offsetMinutes: Long): String {
    TransferContext.writeArguments(LONG to offsetMinutes)
    TransferContext.callMethod(rawPtr, MethodBindings.getOffsetStringFromOffsetMinutesPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the current date as a dictionary of keys: `year`, `month`, `day`, `weekday`, `hour`, `minute`, `second`, and `dst` (Daylight Savings Time).
   */
  @JvmOverloads
  public fun getDatetimeDictFromSystem(utc: Boolean = false): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(BOOL to utc)
    TransferContext.callMethod(rawPtr, MethodBindings.getDatetimeDictFromSystemPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Returns the current date as a dictionary of keys: `year`, `month`, `day`, and `weekday`.
   *
   * The returned values are in the system's local time when [utc] is `false`, otherwise they are in UTC.
   */
  @JvmOverloads
  public fun getDateDictFromSystem(utc: Boolean = false): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(BOOL to utc)
    TransferContext.callMethod(rawPtr, MethodBindings.getDateDictFromSystemPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Returns the current time as a dictionary of keys: `hour`, `minute`, and `second`.
   *
   * The returned values are in the system's local time when [utc] is `false`, otherwise they are in UTC.
   */
  @JvmOverloads
  public fun getTimeDictFromSystem(utc: Boolean = false): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(BOOL to utc)
    TransferContext.callMethod(rawPtr, MethodBindings.getTimeDictFromSystemPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Returns the current date and time as an ISO 8601 date and time string (YYYY-MM-DDTHH:MM:SS).
   *
   * The returned values are in the system's local time when [utc] is `false`, otherwise they are in UTC.
   *
   * If [useSpace] is `true`, the date and time bits are separated by an empty space character instead of the letter T.
   */
  @JvmOverloads
  public fun getDatetimeStringFromSystem(utc: Boolean = false, useSpace: Boolean = false): String {
    TransferContext.writeArguments(BOOL to utc, BOOL to useSpace)
    TransferContext.callMethod(rawPtr, MethodBindings.getDatetimeStringFromSystemPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the current date as an ISO 8601 date string (YYYY-MM-DD).
   *
   * The returned values are in the system's local time when [utc] is `false`, otherwise they are in UTC.
   */
  @JvmOverloads
  public fun getDateStringFromSystem(utc: Boolean = false): String {
    TransferContext.writeArguments(BOOL to utc)
    TransferContext.callMethod(rawPtr, MethodBindings.getDateStringFromSystemPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the current time as an ISO 8601 time string (HH:MM:SS).
   *
   * The returned values are in the system's local time when [utc] is `false`, otherwise they are in UTC.
   */
  @JvmOverloads
  public fun getTimeStringFromSystem(utc: Boolean = false): String {
    TransferContext.writeArguments(BOOL to utc)
    TransferContext.callMethod(rawPtr, MethodBindings.getTimeStringFromSystemPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the current time zone as a dictionary of keys: `bias` and `name`. 
   *
   * - `bias` is the offset from UTC in minutes, since not all time zones are multiples of an hour from UTC.
   *
   * - `name` is the localized name of the time zone, according to the OS locale settings of the current user.
   */
  public fun getTimeZoneFromSystem(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTimeZoneFromSystemPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Returns the current Unix timestamp in seconds based on the system time in UTC. This method is implemented by the operating system and always returns the time in UTC.
   *
   * **Note:** Unlike other methods that use integer timestamps, this method returns the timestamp as a [float] for sub-second precision.
   */
  public fun getUnixTimeFromSystem(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getUnixTimeFromSystemPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  /**
   * Returns the amount of time passed in milliseconds since the engine started.
   *
   * Will always be positive or 0 and uses a 64-bit value (it will wrap after roughly 500 million years).
   */
  public fun getTicksMsec(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTicksMsecPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns the amount of time passed in microseconds since the engine started.
   *
   * Will always be positive or 0 and uses a 64-bit value (it will wrap after roughly half a million years).
   */
  public fun getTicksUsec(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTicksUsecPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public enum class Month(
    id: Long,
  ) {
    /**
     * The month of January, represented numerically as `01`.
     */
    MONTH_JANUARY(1),
    /**
     * The month of February, represented numerically as `02`.
     */
    MONTH_FEBRUARY(2),
    /**
     * The month of March, represented numerically as `03`.
     */
    MONTH_MARCH(3),
    /**
     * The month of April, represented numerically as `04`.
     */
    MONTH_APRIL(4),
    /**
     * The month of May, represented numerically as `05`.
     */
    MONTH_MAY(5),
    /**
     * The month of June, represented numerically as `06`.
     */
    MONTH_JUNE(6),
    /**
     * The month of July, represented numerically as `07`.
     */
    MONTH_JULY(7),
    /**
     * The month of August, represented numerically as `08`.
     */
    MONTH_AUGUST(8),
    /**
     * The month of September, represented numerically as `09`.
     */
    MONTH_SEPTEMBER(9),
    /**
     * The month of October, represented numerically as `10`.
     */
    MONTH_OCTOBER(10),
    /**
     * The month of November, represented numerically as `11`.
     */
    MONTH_NOVEMBER(11),
    /**
     * The month of December, represented numerically as `12`.
     */
    MONTH_DECEMBER(12),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class Weekday(
    id: Long,
  ) {
    /**
     * The day of the week Sunday, represented numerically as `0`.
     */
    WEEKDAY_SUNDAY(0),
    /**
     * The day of the week Monday, represented numerically as `1`.
     */
    WEEKDAY_MONDAY(1),
    /**
     * The day of the week Tuesday, represented numerically as `2`.
     */
    WEEKDAY_TUESDAY(2),
    /**
     * The day of the week Wednesday, represented numerically as `3`.
     */
    WEEKDAY_WEDNESDAY(3),
    /**
     * The day of the week Thursday, represented numerically as `4`.
     */
    WEEKDAY_THURSDAY(4),
    /**
     * The day of the week Friday, represented numerically as `5`.
     */
    WEEKDAY_FRIDAY(5),
    /**
     * The day of the week Saturday, represented numerically as `6`.
     */
    WEEKDAY_SATURDAY(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  internal object MethodBindings {
    public val getDatetimeDictFromUnixTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Time", "get_datetime_dict_from_unix_time")

    public val getDateDictFromUnixTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Time", "get_date_dict_from_unix_time")

    public val getTimeDictFromUnixTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Time", "get_time_dict_from_unix_time")

    public val getDatetimeStringFromUnixTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Time", "get_datetime_string_from_unix_time")

    public val getDateStringFromUnixTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Time", "get_date_string_from_unix_time")

    public val getTimeStringFromUnixTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Time", "get_time_string_from_unix_time")

    public val getDatetimeDictFromDatetimeStringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Time", "get_datetime_dict_from_datetime_string")

    public val getDatetimeStringFromDatetimeDictPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Time", "get_datetime_string_from_datetime_dict")

    public val getUnixTimeFromDatetimeDictPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Time", "get_unix_time_from_datetime_dict")

    public val getUnixTimeFromDatetimeStringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Time", "get_unix_time_from_datetime_string")

    public val getOffsetStringFromOffsetMinutesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Time", "get_offset_string_from_offset_minutes")

    public val getDatetimeDictFromSystemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Time", "get_datetime_dict_from_system")

    public val getDateDictFromSystemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Time", "get_date_dict_from_system")

    public val getTimeDictFromSystemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Time", "get_time_dict_from_system")

    public val getDatetimeStringFromSystemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Time", "get_datetime_string_from_system")

    public val getDateStringFromSystemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Time", "get_date_string_from_system")

    public val getTimeStringFromSystemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Time", "get_time_string_from_system")

    public val getTimeZoneFromSystemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Time", "get_time_zone_from_system")

    public val getUnixTimeFromSystemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Time", "get_unix_time_from_system")

    public val getTicksMsecPtr: VoidPtr = TypeManager.getMethodBindPtr("Time", "get_ticks_msec")

    public val getTicksUsecPtr: VoidPtr = TypeManager.getMethodBindPtr("Time", "get_ticks_usec")
  }
}
