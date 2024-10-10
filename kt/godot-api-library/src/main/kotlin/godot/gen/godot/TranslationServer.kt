// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_STRING_ARRAY
import godot.core.VariantParser.STRING
import godot.core.VariantParser.STRING_NAME
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

private const val ENGINE_CLASS_TRANSLATIONSERVER_INDEX: Int = 17

/**
 * The server that manages all language translations. Translations can be added to or removed from
 * it.
 */
@GodotBaseType
public object TranslationServer : Object() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.getSingleton(this, ENGINE_CLASS_TRANSLATIONSERVER_INDEX)
  }

  /**
   * Sets the locale of the project. The [locale] string will be standardized to match known locales
   * (e.g. `en-US` would be matched to `en_US`).
   * If translations have been loaded beforehand for the new locale, they will be applied.
   */
  @JvmStatic
  public final fun setLocale(locale: String): Unit {
    Internals.writeArguments(STRING to locale)
    Internals.callMethod(rawPtr, MethodBindings.setLocalePtr, NIL)
  }

  /**
   * Returns the current locale of the project.
   * See also [OS.getLocale] and [OS.getLocaleLanguage] to query the locale of the user system.
   */
  @JvmStatic
  public final fun getLocale(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLocalePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Returns the current locale of the editor.
   * **Note:** When called from an exported project returns the same value as [getLocale].
   */
  @JvmStatic
  public final fun getToolLocale(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getToolLocalePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Compares two locales and returns a similarity score between `0` (no match) and `10` (full
   * match).
   */
  @JvmStatic
  public final fun compareLocales(localeA: String, localeB: String): Int {
    Internals.writeArguments(STRING to localeA, STRING to localeB)
    Internals.callMethod(rawPtr, MethodBindings.compareLocalesPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns a [locale] string standardized to match known locales (e.g. `en-US` would be matched to
   * `en_US`).
   */
  @JvmStatic
  public final fun standardizeLocale(locale: String): String {
    Internals.writeArguments(STRING to locale)
    Internals.callMethod(rawPtr, MethodBindings.standardizeLocalePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Returns array of known language codes.
   */
  @JvmStatic
  public final fun getAllLanguages(): PackedStringArray {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAllLanguagesPtr, PACKED_STRING_ARRAY)
    return (Internals.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Returns a readable language name for the [language] code.
   */
  @JvmStatic
  public final fun getLanguageName(language: String): String {
    Internals.writeArguments(STRING to language)
    Internals.callMethod(rawPtr, MethodBindings.getLanguageNamePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Returns an array of known script codes.
   */
  @JvmStatic
  public final fun getAllScripts(): PackedStringArray {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAllScriptsPtr, PACKED_STRING_ARRAY)
    return (Internals.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Returns a readable script name for the [script] code.
   */
  @JvmStatic
  public final fun getScriptName(script: String): String {
    Internals.writeArguments(STRING to script)
    Internals.callMethod(rawPtr, MethodBindings.getScriptNamePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Returns an array of known country codes.
   */
  @JvmStatic
  public final fun getAllCountries(): PackedStringArray {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAllCountriesPtr, PACKED_STRING_ARRAY)
    return (Internals.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Returns a readable country name for the [country] code.
   */
  @JvmStatic
  public final fun getCountryName(country: String): String {
    Internals.writeArguments(STRING to country)
    Internals.callMethod(rawPtr, MethodBindings.getCountryNamePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Returns a locale's language and its variant (e.g. `"en_US"` would return `"English (United
   * States)"`).
   */
  @JvmStatic
  public final fun getLocaleName(locale: String): String {
    Internals.writeArguments(STRING to locale)
    Internals.callMethod(rawPtr, MethodBindings.getLocaleNamePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Returns the current locale's translation for the given message (key) and context.
   */
  @JvmOverloads
  @JvmStatic
  public final fun translate(message: StringName, context: StringName = StringName("")):
      StringName {
    Internals.writeArguments(STRING_NAME to message, STRING_NAME to context)
    Internals.callMethod(rawPtr, MethodBindings.translatePtr, STRING_NAME)
    return (Internals.readReturnValue(STRING_NAME) as StringName)
  }

  /**
   * Returns the current locale's translation for the given message (key), plural message and
   * context.
   * The number [n] is the number or quantity of the plural object. It will be used to guide the
   * translation system to fetch the correct plural form for the selected language.
   */
  @JvmOverloads
  @JvmStatic
  public final fun translatePlural(
    message: StringName,
    pluralMessage: StringName,
    n: Int,
    context: StringName = StringName(""),
  ): StringName {
    Internals.writeArguments(STRING_NAME to message, STRING_NAME to pluralMessage, LONG to n.toLong(), STRING_NAME to context)
    Internals.callMethod(rawPtr, MethodBindings.translatePluralPtr, STRING_NAME)
    return (Internals.readReturnValue(STRING_NAME) as StringName)
  }

  /**
   * Adds a [Translation] resource.
   */
  @JvmStatic
  public final fun addTranslation(translation: Translation?): Unit {
    Internals.writeArguments(OBJECT to translation)
    Internals.callMethod(rawPtr, MethodBindings.addTranslationPtr, NIL)
  }

  /**
   * Removes the given translation from the server.
   */
  @JvmStatic
  public final fun removeTranslation(translation: Translation?): Unit {
    Internals.writeArguments(OBJECT to translation)
    Internals.callMethod(rawPtr, MethodBindings.removeTranslationPtr, NIL)
  }

  /**
   * Returns the [Translation] instance based on the [locale] passed in.
   * It will return `null` if there is no [Translation] instance that matches the [locale].
   */
  @JvmStatic
  public final fun getTranslationObject(locale: String): Translation? {
    Internals.writeArguments(STRING to locale)
    Internals.callMethod(rawPtr, MethodBindings.getTranslationObjectPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Translation?)
  }

  /**
   * Clears the server from all translations.
   */
  @JvmStatic
  public final fun clear(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  /**
   * Returns an array of all loaded locales of the project.
   */
  @JvmStatic
  public final fun getLoadedLocales(): PackedStringArray {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLoadedLocalesPtr, PACKED_STRING_ARRAY)
    return (Internals.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  @JvmStatic
  public final fun isPseudolocalizationEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isPseudolocalizationEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  @JvmStatic
  public final fun setPseudolocalizationEnabled(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setPseudolocalizationEnabledPtr, NIL)
  }

  /**
   * Reparses the pseudolocalization options and reloads the translation.
   */
  @JvmStatic
  public final fun reloadPseudolocalization(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.reloadPseudolocalizationPtr, NIL)
  }

  /**
   * Returns the pseudolocalized string based on the [message] passed in.
   */
  @JvmStatic
  public final fun pseudolocalize(message: StringName): StringName {
    Internals.writeArguments(STRING_NAME to message)
    Internals.callMethod(rawPtr, MethodBindings.pseudolocalizePtr, STRING_NAME)
    return (Internals.readReturnValue(STRING_NAME) as StringName)
  }

  internal object MethodBindings {
    public val setLocalePtr: VoidPtr =
        Internals.getMethodBindPtr("TranslationServer", "set_locale", 83702148)

    public val getLocalePtr: VoidPtr =
        Internals.getMethodBindPtr("TranslationServer", "get_locale", 201670096)

    public val getToolLocalePtr: VoidPtr =
        Internals.getMethodBindPtr("TranslationServer", "get_tool_locale", 2841200299)

    public val compareLocalesPtr: VoidPtr =
        Internals.getMethodBindPtr("TranslationServer", "compare_locales", 2878152881)

    public val standardizeLocalePtr: VoidPtr =
        Internals.getMethodBindPtr("TranslationServer", "standardize_locale", 3135753539)

    public val getAllLanguagesPtr: VoidPtr =
        Internals.getMethodBindPtr("TranslationServer", "get_all_languages", 1139954409)

    public val getLanguageNamePtr: VoidPtr =
        Internals.getMethodBindPtr("TranslationServer", "get_language_name", 3135753539)

    public val getAllScriptsPtr: VoidPtr =
        Internals.getMethodBindPtr("TranslationServer", "get_all_scripts", 1139954409)

    public val getScriptNamePtr: VoidPtr =
        Internals.getMethodBindPtr("TranslationServer", "get_script_name", 3135753539)

    public val getAllCountriesPtr: VoidPtr =
        Internals.getMethodBindPtr("TranslationServer", "get_all_countries", 1139954409)

    public val getCountryNamePtr: VoidPtr =
        Internals.getMethodBindPtr("TranslationServer", "get_country_name", 3135753539)

    public val getLocaleNamePtr: VoidPtr =
        Internals.getMethodBindPtr("TranslationServer", "get_locale_name", 3135753539)

    public val translatePtr: VoidPtr =
        Internals.getMethodBindPtr("TranslationServer", "translate", 58037827)

    public val translatePluralPtr: VoidPtr =
        Internals.getMethodBindPtr("TranslationServer", "translate_plural", 1333931916)

    public val addTranslationPtr: VoidPtr =
        Internals.getMethodBindPtr("TranslationServer", "add_translation", 1466479800)

    public val removeTranslationPtr: VoidPtr =
        Internals.getMethodBindPtr("TranslationServer", "remove_translation", 1466479800)

    public val getTranslationObjectPtr: VoidPtr =
        Internals.getMethodBindPtr("TranslationServer", "get_translation_object", 2065240175)

    public val clearPtr: VoidPtr =
        Internals.getMethodBindPtr("TranslationServer", "clear", 3218959716)

    public val getLoadedLocalesPtr: VoidPtr =
        Internals.getMethodBindPtr("TranslationServer", "get_loaded_locales", 1139954409)

    public val isPseudolocalizationEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("TranslationServer", "is_pseudolocalization_enabled", 36873697)

    public val setPseudolocalizationEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("TranslationServer", "set_pseudolocalization_enabled", 2586408642)

    public val reloadPseudolocalizationPtr: VoidPtr =
        Internals.getMethodBindPtr("TranslationServer", "reload_pseudolocalization", 3218959716)

    public val pseudolocalizePtr: VoidPtr =
        Internals.getMethodBindPtr("TranslationServer", "pseudolocalize", 1965194235)
  }
}
