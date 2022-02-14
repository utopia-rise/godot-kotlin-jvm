// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Server that manages all translations.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/i18n/locales.html]($DOCS_URL/tutorials/i18n/locales.html)
 *
 * Server that manages all translations. Translations can be set to it and removed from it.
 */
@GodotBaseType
public object TranslationServer : Object() {
  public override fun __new(): Unit {
    rawPtr = TransferContext.getSingleton(ENGINECLASS_TRANSLATIONSERVER)
  }

  public override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  /**
   * Sets the locale of the project. The `locale` string will be standardized to match known locales (e.g. `en-US` would be matched to `en_US`).
   *
   * If translations have been loaded beforehand for the new locale, they will be applied.
   */
  public open fun setLocale(locale: String): Unit {
    TransferContext.writeArguments(STRING to locale)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATIONSERVER_SET_LOCALE, NIL)
  }

  /**
   * Returns the current locale of the project.
   *
   * See also [godot.OS.getLocale] and [godot.OS.getLocaleLanguage] to query the locale of the user system.
   */
  public open fun getLocale(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATIONSERVER_GET_LOCALE,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the current locale of the editor.
   *
   * **Note:** When called from an exported project returns the same value as [getLocale].
   */
  public open fun getToolLocale(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATIONSERVER_GET_TOOL_LOCALE,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Compares two locales and return similarity score between `0`(no match) and `10`(full match).
   */
  public open fun compareLocales(localeA: String, localeB: String): Long {
    TransferContext.writeArguments(STRING to localeA, STRING to localeB)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATIONSERVER_COMPARE_LOCALES,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Retunrs `locale` string standardized to match known locales (e.g. `en-US` would be matched to `en_US`).
   */
  public open fun standardizeLocale(locale: String): String {
    TransferContext.writeArguments(STRING to locale)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TRANSLATIONSERVER_STANDARDIZE_LOCALE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns array of known language codes.
   */
  public open fun getAllLanguages(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATIONSERVER_GET_ALL_LANGUAGES,
        PACKED_STRING_ARRAY)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  /**
   * Returns readable language name for the `language` code.
   */
  public open fun getLanguageName(language: String): String {
    TransferContext.writeArguments(STRING to language)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATIONSERVER_GET_LANGUAGE_NAME,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns array of known script codes.
   */
  public open fun getAllScripts(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATIONSERVER_GET_ALL_SCRIPTS,
        PACKED_STRING_ARRAY)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  /**
   * Returns readable script name for the `script` code.
   */
  public open fun getScriptName(script: String): String {
    TransferContext.writeArguments(STRING to script)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATIONSERVER_GET_SCRIPT_NAME,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns array of known country codes.
   */
  public open fun getAllCountries(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATIONSERVER_GET_ALL_COUNTRIES,
        PACKED_STRING_ARRAY)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  /**
   * Returns readable country name for the `country` code.
   */
  public open fun getCountryName(country: String): String {
    TransferContext.writeArguments(STRING to country)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATIONSERVER_GET_COUNTRY_NAME,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns a locale's language and its variant (e.g. `"en_US"` would return `"English (United States)"`).
   */
  public open fun getLocaleName(locale: String): String {
    TransferContext.writeArguments(STRING to locale)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATIONSERVER_GET_LOCALE_NAME,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the current locale's translation for the given message (key) and context.
   */
  public open fun translate(message: StringName, context: StringName = ""): StringName {
    TransferContext.writeArguments(STRING_NAME to message, STRING_NAME to context)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATIONSERVER_TRANSLATE,
        STRING_NAME)
    return TransferContext.readReturnValue(STRING_NAME, false) as StringName
  }

  /**
   * Returns the current locale's translation for the given message (key), plural_message and context.
   *
   * The number `n` is the number or quantity of the plural object. It will be used to guide the translation system to fetch the correct plural form for the selected language.
   */
  public open fun translatePlural(
    message: StringName,
    pluralMessage: StringName,
    n: Long,
    context: StringName = ""
  ): StringName {
    TransferContext.writeArguments(STRING_NAME to message, STRING_NAME to pluralMessage, LONG to n,
        STRING_NAME to context)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATIONSERVER_TRANSLATE_PLURAL,
        STRING_NAME)
    return TransferContext.readReturnValue(STRING_NAME, false) as StringName
  }

  /**
   * Adds a [godot.Translation] resource.
   */
  public open fun addTranslation(translation: Translation): Unit {
    TransferContext.writeArguments(OBJECT to translation)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATIONSERVER_ADD_TRANSLATION,
        NIL)
  }

  /**
   * Removes the given translation from the server.
   */
  public open fun removeTranslation(translation: Translation): Unit {
    TransferContext.writeArguments(OBJECT to translation)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TRANSLATIONSERVER_REMOVE_TRANSLATION, NIL)
  }

  /**
   * Returns the [godot.Translation] instance based on the `locale` passed in.
   *
   * It will return `null` if there is no [godot.Translation] instance that matches the `locale`.
   */
  public open fun getTranslationObject(locale: String): Translation? {
    TransferContext.writeArguments(STRING to locale)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TRANSLATIONSERVER_GET_TRANSLATION_OBJECT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Translation?
  }

  /**
   * Clears the server from all translations.
   */
  public open fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATIONSERVER_CLEAR, NIL)
  }

  /**
   * Returns an array of all loaded locales of the project.
   */
  public open fun getLoadedLocales(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TRANSLATIONSERVER_GET_LOADED_LOCALES, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  public open fun isPseudolocalizationEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TRANSLATIONSERVER_IS_PSEUDOLOCALIZATION_ENABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public open fun setPseudolocalizationEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TRANSLATIONSERVER_SET_PSEUDOLOCALIZATION_ENABLED, NIL)
  }

  /**
   * Reparses the pseudolocalization options and reloads the translation.
   */
  public open fun reloadPseudolocalization(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TRANSLATIONSERVER_RELOAD_PSEUDOLOCALIZATION, NIL)
  }

  /**
   * Returns the pseudolocalized string based on the `p_message` passed in.
   */
  public open fun pseudolocalize(message: StringName): StringName {
    TransferContext.writeArguments(STRING_NAME to message)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATIONSERVER_PSEUDOLOCALIZE,
        STRING_NAME)
    return TransferContext.readReturnValue(STRING_NAME, false) as StringName
  }
}
