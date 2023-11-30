// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedStringArray
import godot.core.TypeManager
import godot.core.VariantArray
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Plugin for adding custom parsers to extract strings that are to be translated from custom files (.csv, .json etc.).
 *
 * [godot.EditorTranslationParserPlugin] is invoked when a file is being parsed to extract strings that require translation. To define the parsing and string extraction logic, override the [_parseFile] method in script.
 *
 * Add the extracted strings to argument `msgids` or `msgids_context_plural` if context or plural is used.
 *
 * When adding to `msgids_context_plural`, you must add the data using the format `["A", "B", "C"]`, where `A` represents the extracted string, `B` represents the context, and `C` represents the plural version of the extracted string. If you want to add only context but not plural, put `""` for the plural slot. The idea is the same if you only want to add plural but not context. See the code below for concrete examples.
 *
 * The extracted strings will be written into a POT file selected by user under "POT Generation" in "Localization" tab in "Project Settings" menu.
 *
 * Below shows an example of a custom parser that extracts strings from a CSV file to write into a POT.
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * @tool
 *
 * extends EditorTranslationParserPlugin
 *
 *
 *
 * func _parse_file(path, msgids, msgids_context_plural):
 *
 *     var file = FileAccess.open(path, FileAccess.READ)
 *
 *     var text = file.get_as_text()
 *
 *     var split_strs = text.split(",", false)
 *
 *     for s in split_strs:
 *
 *         msgids.append(s)
 *
 *         #print("Extracted string: " + s)
 *
 *
 *
 * func _get_recognized_extensions():
 *
 *     return ["csv"]
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * using Godot;
 *
 *
 *
 * [godot.Tool]
 *
 * public partial class CustomParser : EditorTranslationParserPlugin
 *
 * {
 *
 *     public override void _ParseFile(string path, Godot.Collections.Array<string> msgids, Godot.Collections.Array<Godot.Collections.Array> msgidsContextPlural)
 *
 *     {
 *
 *         using var file = FileAccess.Open(path, FileAccess.ModeFlags.Read);
 *
 *         string text = file.GetAsText();
 *
 *         string[] splitStrs = text.Split(",", allowEmpty: false);
 *
 *         foreach (string s in splitStrs)
 *
 *         {
 *
 *             msgids.Add(s);
 *
 *             //GD.Print($"Extracted string: {s}");
 *
 *         }
 *
 *     }
 *
 *
 *
 *     public override string[] _GetRecognizedExtensions()
 *
 *     {
 *
 *         return new string[] { "csv" };
 *
 *     }
 *
 * }
 *
 * [/csharp]
 *
 * [/codeblocks]
 *
 * To add a translatable string associated with context or plural, add it to `msgids_context_plural`:
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * # This will add a message with msgid "Test 1", msgctxt "context", and msgid_plural "test 1 plurals".
 *
 * msgids_context_plural.append(["Test 1", "context", "test 1 plurals"])
 *
 * # This will add a message with msgid "A test without context" and msgid_plural "plurals".
 *
 * msgids_context_plural.append(["A test without context", "", "plurals"])
 *
 * # This will add a message with msgid "Only with context" and msgctxt "a friendly context".
 *
 * msgids_context_plural.append(["Only with context", "a friendly context", ""])
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * // This will add a message with msgid "Test 1", msgctxt "context", and msgid_plural "test 1 plurals".
 *
 * msgidsContextPlural.Add(new Godot.Collections.Array{"Test 1", "context", "test 1 Plurals"});
 *
 * // This will add a message with msgid "A test without context" and msgid_plural "plurals".
 *
 * msgidsContextPlural.Add(new Godot.Collections.Array{"A test without context", "", "plurals"});
 *
 * // This will add a message with msgid "Only with context" and msgctxt "a friendly context".
 *
 * msgidsContextPlural.Add(new Godot.Collections.Array{"Only with context", "a friendly context", ""});
 *
 * [/csharp]
 *
 * [/codeblocks]
 *
 * **Note:** If you override parsing logic for standard script types (GDScript, C#, etc.), it would be better to load the `path` argument using [godot.ResourceLoader.load]. This is because built-in scripts are loaded as [godot.Resource] type, not [godot.FileAccess] type.
 *
 * For example:
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * func _parse_file(path, msgids, msgids_context_plural):
 *
 *     var res = ResourceLoader.load(path, "Script")
 *
 *     var text = res.source_code
 *
 *     # Parsing logic.
 *
 *
 *
 * func _get_recognized_extensions():
 *
 *     return ["gd"]
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * public override void _ParseFile(string path, Godot.Collections.Array<string> msgids, Godot.Collections.Array<Godot.Collections.Array> msgidsContextPlural)
 *
 * {
 *
 *     var res = ResourceLoader.Load<Script>(path, "Script");
 *
 *     string text = res.SourceCode;
 *
 *     // Parsing logic.
 *
 * }
 *
 *
 *
 * public override string[] _GetRecognizedExtensions()
 *
 * {
 *
 *     return new string[] { "gd" };
 *
 * }
 *
 * [/csharp]
 *
 * [/codeblocks]
 *
 * To use [godot.EditorTranslationParserPlugin], register it using the [godot.EditorPlugin.addTranslationParserPlugin] method first.
 */
@GodotBaseType
public open class EditorTranslationParserPlugin : RefCounted() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORTRANSLATIONPARSERPLUGIN, scriptIndex)
    return true
  }

  /**
   * Override this method to define a custom parsing logic to extract the translatable strings.
   */
  public open fun _parseFile(
    path: String,
    msgids: VariantArray<String>,
    msgidsContextPlural: VariantArray<VariantArray<Any?>>,
  ): Unit {
  }

  /**
   * Gets the list of file extensions to associate with this parser, e.g. `["csv"]`.
   */
  public open fun _getRecognizedExtensions(): PackedStringArray {
    throw NotImplementedError("_get_recognized_extensions is not implemented for EditorTranslationParserPlugin")
  }

  public companion object

  internal object MethodBindings {
    public val _parseFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorTranslationParserPlugin", "_parse_file")

    public val _getRecognizedExtensionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorTranslationParserPlugin", "_get_recognized_extensions")
  }
}
