// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_STRING_ARRAY
import godot.core.VariantParser.STRING
import godot.core.VariantParser.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * The server that manages all language translations. Translations can be added to or removed from
 * it.
 */
@GodotBaseType
public object TranslationServer : Object() {
  public override fun new(scriptIndex: Int): Unit {
    getSingleton(ENGINECLASS_TRANSLATIONSERVER)
  }

  /**
   * Sets the locale of the project. The [locale] string will be standardized to match known locales
   * (e.g. `en-US` would be matched to `en_US`).
   * If translations have been loaded beforehand for the new locale, they will be applied.
   */
  @JvmStatic
  public final fun setLocale(locale: String): Unit {
    TransferContext.writeArguments(STRING to locale)
    TransferContext.callMethod(rawPtr, MethodBindings.setLocalePtr, NIL)
  }

  /**
   * Returns the current locale of the project.
   * See also [OS.getLocale] and [OS.getLocaleLanguage] to query the locale of the user system.
   */
  @JvmStatic
  public final fun getLocale(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLocalePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the current locale of the editor.
   * **Note:** When called from an exported project returns the same value as [getLocale].
   */
  @JvmStatic
  public final fun getToolLocale(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getToolLocalePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Compares two locales and returns a similarity score between `0` (no match) and `10` (full
   * match).
   */
  @JvmStatic
  public final fun compareLocales(localeA: String, localeB: String): Int {
    TransferContext.writeArguments(STRING to localeA, STRING to localeB)
    TransferContext.callMethod(rawPtr, MethodBindings.compareLocalesPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns a [locale] string standardized to match known locales (e.g. `en-US` would be matched to
   * `en_US`).
   */
  @JvmStatic
  public final fun standardizeLocale(locale: String): String {
    TransferContext.writeArguments(STRING to locale)
    TransferContext.callMethod(rawPtr, MethodBindings.standardizeLocalePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns array of known language codes.
   */
  @JvmStatic
  public final fun getAllLanguages(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAllLanguagesPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Returns a readable language name for the [language] code.
   */
  @JvmStatic
  public final fun getLanguageName(language: String): String {
    TransferContext.writeArguments(STRING to language)
    TransferContext.callMethod(rawPtr, MethodBindings.getLanguageNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns an array of known script codes.
   */
  @JvmStatic
  public final fun getAllScripts(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAllScriptsPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Returns a readable script name for the [script] code.
   */
  @JvmStatic
  public final fun getScriptName(script: String): String {
    TransferContext.writeArguments(STRING to script)
    TransferContext.callMethod(rawPtr, MethodBindings.getScriptNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns an array of known country codes.
   */
  @JvmStatic
  public final fun getAllCountries(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAllCountriesPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Returns a readable country name for the [country] code.
   */
  @JvmStatic
  public final fun getCountryName(country: String): String {
    TransferContext.writeArguments(STRING to country)
    TransferContext.callMethod(rawPtr, MethodBindings.getCountryNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns a locale's language and its variant (e.g. `"en_US"` would return `"English (United
   * States)"`).
   */
  @JvmStatic
  public final fun getLocaleName(locale: String): String {
    TransferContext.writeArguments(STRING to locale)
    TransferContext.callMethod(rawPtr, MethodBindings.getLocaleNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the current locale's translation for the given message (key) and context.
   */
  @JvmOverloads
  @JvmStatic
  public final fun translate(message: StringName, context: StringName = StringName("")):
      StringName {
    TransferContext.writeArguments(STRING_NAME to message, STRING_NAME to context)
    TransferContext.callMethod(rawPtr, MethodBindings.translatePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
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
    TransferContext.writeArguments(STRING_NAME to message, STRING_NAME to pluralMessage, LONG to n.toLong(), STRING_NAME to context)
    TransferContext.callMethod(rawPtr, MethodBindings.translatePluralPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  /**
   * Adds a [Translation] resource.
   */
  @JvmStatic
  public final fun addTranslation(translation: Translation?): Unit {
    TransferContext.writeArguments(OBJECT to translation)
    TransferContext.callMethod(rawPtr, MethodBindings.addTranslationPtr, NIL)
  }

  /**
   * Removes the given translation from the server.
   */
  @JvmStatic
  public final fun removeTranslation(translation: Translation?): Unit {
    TransferContext.writeArguments(OBJECT to translation)
    TransferContext.callMethod(rawPtr, MethodBindings.removeTranslationPtr, NIL)
  }

  /**
   * Returns the [Translation] instance based on the [locale] passed in.
   * It will return `null` if there is no [Translation] instance that matches the [locale].
   */
  @JvmStatic
  public final fun getTranslationObject(locale: String): Translation? {
    TransferContext.writeArguments(STRING to locale)
    TransferContext.callMethod(rawPtr, MethodBindings.getTranslationObjectPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Translation?)
  }

  /**
   * Clears the server from all translations.
   */
  @JvmStatic
  public final fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  /**
   * Returns an array of all loaded locales of the project.
   */
  @JvmStatic
  public final fun getLoadedLocales(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLoadedLocalesPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  @JvmStatic
  public final fun isPseudolocalizationEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isPseudolocalizationEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  @JvmStatic
  public final fun setPseudolocalizationEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setPseudolocalizationEnabledPtr, NIL)
  }

  /**
   * Reparses the pseudolocalization options and reloads the translation.
   */
  @JvmStatic
  public final fun reloadPseudolocalization(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.reloadPseudolocalizationPtr, NIL)
  }

  /**
   * Returns the pseudolocalized string based on the [message] passed in.
   */
  @JvmStatic
  public final fun pseudolocalize(message: StringName): StringName {
    TransferContext.writeArguments(STRING_NAME to message)
    TransferContext.callMethod(rawPtr, MethodBindings.pseudolocalizePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  internal object MethodBindings {
    public val setLocalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "set_locale", 83702148)

    public val getLocalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "get_locale", 201670096)

    public val getToolLocalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "get_tool_locale", 2841200299)

    public val compareLocalesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "compare_locales", 2878152881)

    public val standardizeLocalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "standardize_locale", 3135753539)

    public val getAllLanguagesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "get_all_languages", 1139954409)

    public val getLanguageNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "get_language_name", 3135753539)

    public val getAllScriptsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "get_all_scripts", 1139954409)

    public val getScriptNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "get_script_name", 3135753539)

    public val getAllCountriesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "get_all_countries", 1139954409)

    public val getCountryNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "get_country_name", 3135753539)

    public val getLocaleNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "get_locale_name", 3135753539)

    public val translatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "translate", 58037827)

    public val translatePluralPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "translate_plural", 1333931916)

    public val addTranslationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "add_translation", 1466479800)

    public val removeTranslationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "remove_translation", 1466479800)

    public val getTranslationObjectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "get_translation_object", 2065240175)

    public val clearPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "clear", 3218959716)

    public val getLoadedLocalesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "get_loaded_locales", 1139954409)

    public val isPseudolocalizationEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "is_pseudolocalization_enabled", 36873697)

    public val setPseudolocalizationEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "set_pseudolocalization_enabled", 2586408642)

    public val reloadPseudolocalizationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "reload_pseudolocalization", 3218959716)

    public val pseudolocalizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "pseudolocalize", 1965194235)
  }
}
