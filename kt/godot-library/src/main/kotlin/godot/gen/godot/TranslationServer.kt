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
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * The server responsible for language translations.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/i18n/locales.html]($DOCS_URL/tutorials/i18n/locales.html)
 *
 * The server that manages all language translations. Translations can be added to or removed from it.
 */
@GodotBaseType
public object TranslationServer : Object() {
  public override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_TRANSLATIONSERVER)
    return false
  }

  /**
   * Sets the locale of the project. The [locale] string will be standardized to match known locales (e.g. `en-US` would be matched to `en_US`).
   *
   * If translations have been loaded beforehand for the new locale, they will be applied.
   */
  public fun setLocale(locale: String): Unit {
    TransferContext.writeArguments(STRING to locale)
    TransferContext.callMethod(rawPtr, MethodBindings.setLocalePtr, NIL)
  }

  /**
   * Returns the current locale of the project.
   *
   * See also [godot.OS.getLocale] and [godot.OS.getLocaleLanguage] to query the locale of the user system.
   */
  public fun getLocale(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLocalePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the current locale of the editor.
   *
   * **Note:** When called from an exported project returns the same value as [getLocale].
   */
  public fun getToolLocale(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getToolLocalePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Compares two locales and returns a similarity score between `0` (no match) and `10` (full match).
   */
  public fun compareLocales(localeA: String, localeB: String): Int {
    TransferContext.writeArguments(STRING to localeA, STRING to localeB)
    TransferContext.callMethod(rawPtr, MethodBindings.compareLocalesPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns a [locale] string standardized to match known locales (e.g. `en-US` would be matched to `en_US`).
   */
  public fun standardizeLocale(locale: String): String {
    TransferContext.writeArguments(STRING to locale)
    TransferContext.callMethod(rawPtr, MethodBindings.standardizeLocalePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns array of known language codes.
   */
  public fun getAllLanguages(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAllLanguagesPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Returns a readable language name for the [language] code.
   */
  public fun getLanguageName(language: String): String {
    TransferContext.writeArguments(STRING to language)
    TransferContext.callMethod(rawPtr, MethodBindings.getLanguageNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns an array of known script codes.
   */
  public fun getAllScripts(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAllScriptsPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Returns a readable script name for the [script] code.
   */
  public fun getScriptName(script: String): String {
    TransferContext.writeArguments(STRING to script)
    TransferContext.callMethod(rawPtr, MethodBindings.getScriptNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns an array of known country codes.
   */
  public fun getAllCountries(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAllCountriesPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Returns a readable country name for the [country] code.
   */
  public fun getCountryName(country: String): String {
    TransferContext.writeArguments(STRING to country)
    TransferContext.callMethod(rawPtr, MethodBindings.getCountryNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns a locale's language and its variant (e.g. `"en_US"` would return `"English (United States)"`).
   */
  public fun getLocaleName(locale: String): String {
    TransferContext.writeArguments(STRING to locale)
    TransferContext.callMethod(rawPtr, MethodBindings.getLocaleNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the current locale's translation for the given message (key) and context.
   */
  @JvmOverloads
  public fun translate(message: StringName, context: StringName = StringName("")): StringName {
    TransferContext.writeArguments(STRING_NAME to message, STRING_NAME to context)
    TransferContext.callMethod(rawPtr, MethodBindings.translatePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  /**
   * Returns the current locale's translation for the given message (key), plural message and context.
   *
   * The number [n] is the number or quantity of the plural object. It will be used to guide the translation system to fetch the correct plural form for the selected language.
   */
  @JvmOverloads
  public fun translatePlural(
    message: StringName,
    pluralMessage: StringName,
    n: Int,
    context: StringName = StringName(""),
  ): StringName {
    TransferContext.writeArguments(STRING_NAME to message, STRING_NAME to pluralMessage, LONG to n.toLong(), STRING_NAME to context)
    TransferContext.callMethod(rawPtr, MethodBindings.translatePluralPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  /**
   * Adds a [godot.Translation] resource.
   */
  public fun addTranslation(translation: Translation): Unit {
    TransferContext.writeArguments(OBJECT to translation)
    TransferContext.callMethod(rawPtr, MethodBindings.addTranslationPtr, NIL)
  }

  /**
   * Removes the given translation from the server.
   */
  public fun removeTranslation(translation: Translation): Unit {
    TransferContext.writeArguments(OBJECT to translation)
    TransferContext.callMethod(rawPtr, MethodBindings.removeTranslationPtr, NIL)
  }

  /**
   * Returns the [godot.Translation] instance based on the [locale] passed in.
   *
   * It will return `null` if there is no [godot.Translation] instance that matches the [locale].
   */
  public fun getTranslationObject(locale: String): Translation? {
    TransferContext.writeArguments(STRING to locale)
    TransferContext.callMethod(rawPtr, MethodBindings.getTranslationObjectPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Translation?)
  }

  /**
   * Clears the server from all translations.
   */
  public fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  /**
   * Returns an array of all loaded locales of the project.
   */
  public fun getLoadedLocales(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLoadedLocalesPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun isPseudolocalizationEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isPseudolocalizationEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setPseudolocalizationEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setPseudolocalizationEnabledPtr, NIL)
  }

  /**
   * Reparses the pseudolocalization options and reloads the translation.
   */
  public fun reloadPseudolocalization(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.reloadPseudolocalizationPtr, NIL)
  }

  /**
   * Returns the pseudolocalized string based on the [message] passed in.
   */
  public fun pseudolocalize(message: StringName): StringName {
    TransferContext.writeArguments(STRING_NAME to message)
    TransferContext.callMethod(rawPtr, MethodBindings.pseudolocalizePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  internal object MethodBindings {
    public val setLocalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "set_locale")

    public val getLocalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "get_locale")

    public val getToolLocalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "get_tool_locale")

    public val compareLocalesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "compare_locales")

    public val standardizeLocalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "standardize_locale")

    public val getAllLanguagesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "get_all_languages")

    public val getLanguageNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "get_language_name")

    public val getAllScriptsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "get_all_scripts")

    public val getScriptNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "get_script_name")

    public val getAllCountriesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "get_all_countries")

    public val getCountryNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "get_country_name")

    public val getLocaleNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "get_locale_name")

    public val translatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "translate")

    public val translatePluralPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "translate_plural")

    public val addTranslationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "add_translation")

    public val removeTranslationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "remove_translation")

    public val getTranslationObjectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "get_translation_object")

    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("TranslationServer", "clear")

    public val getLoadedLocalesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "get_loaded_locales")

    public val isPseudolocalizationEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "is_pseudolocalization_enabled")

    public val setPseudolocalizationEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "set_pseudolocalization_enabled")

    public val reloadPseudolocalizationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "reload_pseudolocalization")

    public val pseudolocalizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "pseudolocalize")
  }
}
