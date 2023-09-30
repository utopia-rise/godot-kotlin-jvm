// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedByteArray
import godot.core.PackedStringArray
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * Helper class to handle INI-style files.
 *
 * This helper class can be used to store [Variant] values on the filesystem using INI-style formatting. The stored values are identified by a section and a key:
 *
 * ```
 * 		[section]
 * 		some_key=42
 * 		string_example="Hello World3D!"
 * 		a_vector=Vector3(1, 0, 2)
 * 		```
 *
 * The stored data can be saved to or parsed from a file, though ConfigFile objects can also be used directly without accessing the filesystem.
 *
 * The following example shows how to create a simple [godot.ConfigFile] and save it on disc:
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * # Create new ConfigFile object.
 *
 * var config = ConfigFile.new()
 *
 *
 *
 * # Store some values.
 *
 * config.set_value("Player1", "player_name", "Steve")
 *
 * config.set_value("Player1", "best_score", 10)
 *
 * config.set_value("Player2", "player_name", "V3geta")
 *
 * config.set_value("Player2", "best_score", 9001)
 *
 *
 *
 * # Save it to a file (overwrite if already exists).
 *
 * config.save("user://scores.cfg")
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * // Create new ConfigFile object.
 *
 * var config = new ConfigFile();
 *
 *
 *
 * // Store some values.
 *
 * config.SetValue("Player1", "player_name", "Steve");
 *
 * config.SetValue("Player1", "best_score", 10);
 *
 * config.SetValue("Player2", "player_name", "V3geta");
 *
 * config.SetValue("Player2", "best_score", 9001);
 *
 *
 *
 * // Save it to a file (overwrite if already exists).
 *
 * config.Save("user://scores.cfg");
 *
 * [/csharp]
 *
 * [/codeblocks]
 *
 * This example shows how the above file could be loaded:
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * var score_data = {}
 *
 * var config = ConfigFile.new()
 *
 *
 *
 * # Load data from a file.
 *
 * var err = config.load("user://scores.cfg")
 *
 *
 *
 * # If the file didn't load, ignore it.
 *
 * if err != OK:
 *
 *     return
 *
 *
 *
 * # Iterate over all sections.
 *
 * for player in config.get_sections():
 *
 *     # Fetch the data for each section.
 *
 *     var player_name = config.get_value(player, "player_name")
 *
 *     var player_score = config.get_value(player, "best_score")
 *
 *     score_data[player_name] = player_score
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * var score_data = new Godot.Collections.Dictionary();
 *
 * var config = new ConfigFile();
 *
 *
 *
 * // Load data from a file.
 *
 * Error err = config.Load("user://scores.cfg");
 *
 *
 *
 * // If the file didn't load, ignore it.
 *
 * if (err != Error.Ok)
 *
 * {
 *
 *     return;
 *
 * }
 *
 *
 *
 * // Iterate over all sections.
 *
 * foreach (String player in config.GetSections())
 *
 * {
 *
 *     // Fetch the data for each section.
 *
 *     var player_name = (String)config.GetValue(player, "player_name");
 *
 *     var player_score = (int)config.GetValue(player, "best_score");
 *
 *     score_data[player_name] = player_score;
 *
 * }
 *
 * [/csharp]
 *
 * [/codeblocks]
 *
 * Any operation that mutates the ConfigFile such as [setValue], [clear], or [eraseSection], only changes what is loaded in memory. If you want to write the change to a file, you have to save the changes with [save], [saveEncrypted], or [saveEncryptedPass].
 *
 * Keep in mind that section and property names can't contain spaces. Anything after a space will be ignored on save and on load.
 *
 * ConfigFiles can also contain manually written comment lines starting with a semicolon (`;`). Those lines will be ignored when parsing the file. Note that comments will be lost when saving the ConfigFile. This can still be useful for dedicated server configuration files, which are typically never overwritten without explicit user action.
 *
 * **Note:** The file extension given to a ConfigFile does not have any impact on its formatting or behavior. By convention, the `.cfg` extension is used here, but any other extension such as `.ini` is also valid. Since neither `.cfg` nor `.ini` are standardized, Godot's ConfigFile formatting may differ from files written by other programs.
 */
@GodotBaseType
public open class ConfigFile : RefCounted() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CONFIGFILE, scriptIndex)
    return true
  }

  /**
   * Assigns a value to the specified key of the specified section. If either the section or the key do not exist, they are created. Passing a `null` value deletes the specified key if it exists, and deletes the section if it ends up empty once the key has been removed.
   */
  public fun setValue(
    section: String,
    key: String,
    `value`: Any,
  ): Unit {
    TransferContext.writeArguments(STRING to section, STRING to key, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIGFILE_SET_VALUE, NIL)
  }

  /**
   * Returns the current value for the specified section and key. If either the section or the key do not exist, the method returns the fallback [default] value. If [default] is not specified or set to `null`, an error is also raised.
   */
  @JvmOverloads
  public fun getValue(
    section: String,
    key: String,
    default: Any? = null,
  ): Any? {
    TransferContext.writeArguments(STRING to section, STRING to key, ANY to default)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIGFILE_GET_VALUE, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Returns `true` if the specified section exists.
   */
  public fun hasSection(section: String): Boolean {
    TransferContext.writeArguments(STRING to section)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIGFILE_HAS_SECTION, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if the specified section-key pair exists.
   */
  public fun hasSectionKey(section: String, key: String): Boolean {
    TransferContext.writeArguments(STRING to section, STRING to key)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIGFILE_HAS_SECTION_KEY, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns an array of all defined section identifiers.
   */
  public fun getSections(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIGFILE_GET_SECTIONS,
        PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Returns an array of all defined key identifiers in the specified section. Raises an error and returns an empty array if the section does not exist.
   */
  public fun getSectionKeys(section: String): PackedStringArray {
    TransferContext.writeArguments(STRING to section)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIGFILE_GET_SECTION_KEYS,
        PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Deletes the specified section along with all the key-value pairs inside. Raises an error if the section does not exist.
   */
  public fun eraseSection(section: String): Unit {
    TransferContext.writeArguments(STRING to section)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIGFILE_ERASE_SECTION, NIL)
  }

  /**
   * Deletes the specified key in a section. Raises an error if either the section or the key do not exist.
   */
  public fun eraseSectionKey(section: String, key: String): Unit {
    TransferContext.writeArguments(STRING to section, STRING to key)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIGFILE_ERASE_SECTION_KEY, NIL)
  }

  /**
   * Loads the config file specified as a parameter. The file's contents are parsed and loaded in the [godot.ConfigFile] object which the method was called on.
   *
   * Returns one of the [enum Error] code constants ([OK] on success).
   */
  public fun load(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIGFILE_LOAD, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Parses the passed string as the contents of a config file. The string is parsed and loaded in the ConfigFile object which the method was called on.
   *
   * Returns one of the [enum Error] code constants ([OK] on success).
   */
  public fun parse(`data`: String): GodotError {
    TransferContext.writeArguments(STRING to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIGFILE_PARSE, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Saves the contents of the [godot.ConfigFile] object to the file specified as a parameter. The output file uses an INI-style structure.
   *
   * Returns one of the [enum Error] code constants ([OK] on success).
   */
  public fun save(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIGFILE_SAVE, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Obtain the text version of this config file (the same text that would be written to a file).
   */
  public fun encodeToText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIGFILE_ENCODE_TO_TEXT, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Loads the encrypted config file specified as a parameter, using the provided [key] to decrypt it. The file's contents are parsed and loaded in the [godot.ConfigFile] object which the method was called on.
   *
   * Returns one of the [enum Error] code constants ([OK] on success).
   */
  public fun loadEncrypted(path: String, key: PackedByteArray): GodotError {
    TransferContext.writeArguments(STRING to path, PACKED_BYTE_ARRAY to key)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIGFILE_LOAD_ENCRYPTED, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Loads the encrypted config file specified as a parameter, using the provided [password] to decrypt it. The file's contents are parsed and loaded in the [godot.ConfigFile] object which the method was called on.
   *
   * Returns one of the [enum Error] code constants ([OK] on success).
   */
  public fun loadEncryptedPass(path: String, password: String): GodotError {
    TransferContext.writeArguments(STRING to path, STRING to password)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIGFILE_LOAD_ENCRYPTED_PASS,
        LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Saves the contents of the [godot.ConfigFile] object to the AES-256 encrypted file specified as a parameter, using the provided [key] to encrypt it. The output file uses an INI-style structure.
   *
   * Returns one of the [enum Error] code constants ([OK] on success).
   */
  public fun saveEncrypted(path: String, key: PackedByteArray): GodotError {
    TransferContext.writeArguments(STRING to path, PACKED_BYTE_ARRAY to key)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIGFILE_SAVE_ENCRYPTED, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Saves the contents of the [godot.ConfigFile] object to the AES-256 encrypted file specified as a parameter, using the provided [password] to encrypt it. The output file uses an INI-style structure.
   *
   * Returns one of the [enum Error] code constants ([OK] on success).
   */
  public fun saveEncryptedPass(path: String, password: String): GodotError {
    TransferContext.writeArguments(STRING to path, STRING to password)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIGFILE_SAVE_ENCRYPTED_PASS,
        LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Removes the entire contents of the config.
   */
  public fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIGFILE_CLEAR, NIL)
  }

  public companion object
}
