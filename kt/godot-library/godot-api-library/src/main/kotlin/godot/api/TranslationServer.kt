// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.addTranslationPtr
import godot.clearPtr
import godot.common.interop.VoidPtr
import godot.compareLocalesPtr
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_STRING_ARRAY
import godot.core.VariantParser.STRING
import godot.core.VariantParser.STRING_NAME
import godot.getAllCountriesPtr
import godot.getAllLanguagesPtr
import godot.getAllScriptsPtr
import godot.getCountryNamePtr
import godot.getLanguageNamePtr
import godot.getLoadedLocalesPtr
import godot.getLocaleNamePtr
import godot.getLocalePtr
import godot.getScriptNamePtr
import godot.getToolLocalePtr
import godot.getTranslationObjectPtr
import godot.isPseudolocalizationEnabledPtr
import godot.pseudolocalizePtr
import godot.reloadPseudolocalizationPtr
import godot.removeTranslationPtr
import godot.setLocalePtr
import godot.setPseudolocalizationEnabledPtr
import godot.standardizeLocalePtr
import godot.translatePluralPtr
import godot.translatePtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

private const val ENGINECLASS_TRANSLATIONSERVER: Int = 17

/**
 * The server that manages all language translations. Translations can be added to or removed from
 * it.
 */
@GodotBaseType
public object TranslationServer : Object() {
  public override fun new(scriptIndex: Int): Unit {
    getSingleton(this, ENGINECLASS_TRANSLATIONSERVER)
  }

  /**
   * Sets the locale of the project. The [locale] string will be standardized to match known locales
   * (e.g. `en-US` would be matched to `en_US`).
   * If translations have been loaded beforehand for the new locale, they will be applied.
   */
  @JvmStatic
  public final fun setLocale(locale: String): Unit {
    TransferContext.writeArguments(STRING to locale)
    TransferContext.callMethod(ptr, MethodBindings.setLocalePtr, NIL)
  }

  /**
   * Returns the current locale of the project.
   * See also [OS.getLocale] and [OS.getLocaleLanguage] to query the locale of the user system.
   */
  @JvmStatic
  public final fun getLocale(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLocalePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the current locale of the editor.
   * **Note:** When called from an exported project returns the same value as [getLocale].
   */
  @JvmStatic
  public final fun getToolLocale(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getToolLocalePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Compares two locales and returns a similarity score between `0` (no match) and `10` (full
   * match).
   */
  @JvmStatic
  public final fun compareLocales(localeA: String, localeB: String): Int {
    TransferContext.writeArguments(STRING to localeA, STRING to localeB)
    TransferContext.callMethod(ptr, MethodBindings.compareLocalesPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns a [locale] string standardized to match known locales (e.g. `en-US` would be matched to
   * `en_US`).
   */
  @JvmStatic
  public final fun standardizeLocale(locale: String): String {
    TransferContext.writeArguments(STRING to locale)
    TransferContext.callMethod(ptr, MethodBindings.standardizeLocalePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns array of known language codes.
   */
  @JvmStatic
  public final fun getAllLanguages(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAllLanguagesPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Returns a readable language name for the [language] code.
   */
  @JvmStatic
  public final fun getLanguageName(language: String): String {
    TransferContext.writeArguments(STRING to language)
    TransferContext.callMethod(ptr, MethodBindings.getLanguageNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns an array of known script codes.
   */
  @JvmStatic
  public final fun getAllScripts(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAllScriptsPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Returns a readable script name for the [script] code.
   */
  @JvmStatic
  public final fun getScriptName(script: String): String {
    TransferContext.writeArguments(STRING to script)
    TransferContext.callMethod(ptr, MethodBindings.getScriptNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns an array of known country codes.
   */
  @JvmStatic
  public final fun getAllCountries(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAllCountriesPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Returns a readable country name for the [country] code.
   */
  @JvmStatic
  public final fun getCountryName(country: String): String {
    TransferContext.writeArguments(STRING to country)
    TransferContext.callMethod(ptr, MethodBindings.getCountryNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns a locale's language and its variant (e.g. `"en_US"` would return `"English (United
   * States)"`).
   */
  @JvmStatic
  public final fun getLocaleName(locale: String): String {
    TransferContext.writeArguments(STRING to locale)
    TransferContext.callMethod(ptr, MethodBindings.getLocaleNamePtr, STRING)
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
    TransferContext.callMethod(ptr, MethodBindings.translatePtr, STRING_NAME)
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
    TransferContext.callMethod(ptr, MethodBindings.translatePluralPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  /**
   * Adds a [Translation] resource.
   */
  @JvmStatic
  public final fun addTranslation(translation: Translation?): Unit {
    TransferContext.writeArguments(OBJECT to translation)
    TransferContext.callMethod(ptr, MethodBindings.addTranslationPtr, NIL)
  }

  /**
   * Removes the given translation from the server.
   */
  @JvmStatic
  public final fun removeTranslation(translation: Translation?): Unit {
    TransferContext.writeArguments(OBJECT to translation)
    TransferContext.callMethod(ptr, MethodBindings.removeTranslationPtr, NIL)
  }

  /**
   * Returns the [Translation] instance based on the [locale] passed in.
   * It will return `null` if there is no [Translation] instance that matches the [locale].
   */
  @JvmStatic
  public final fun getTranslationObject(locale: String): Translation? {
    TransferContext.writeArguments(STRING to locale)
    TransferContext.callMethod(ptr, MethodBindings.getTranslationObjectPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Translation?)
  }

  /**
   * Clears the server from all translations.
   */
  @JvmStatic
  public final fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearPtr, NIL)
  }

  /**
   * Returns an array of all loaded locales of the project.
   */
  @JvmStatic
  public final fun getLoadedLocales(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLoadedLocalesPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  @JvmStatic
  public final fun isPseudolocalizationEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isPseudolocalizationEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  @JvmStatic
  public final fun setPseudolocalizationEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setPseudolocalizationEnabledPtr, NIL)
  }

  /**
   * Reparses the pseudolocalization options and reloads the translation.
   */
  @JvmStatic
  public final fun reloadPseudolocalization(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.reloadPseudolocalizationPtr, NIL)
  }

  /**
   * Returns the pseudolocalized string based on the [message] passed in.
   */
  @JvmStatic
  public final fun pseudolocalize(message: StringName): StringName {
    TransferContext.writeArguments(STRING_NAME to message)
    TransferContext.callMethod(ptr, MethodBindings.pseudolocalizePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  public object MethodBindings {
    internal val setLocalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "set_locale", 83702148)

    internal val getLocalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "get_locale", 201670096)

    internal val getToolLocalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "get_tool_locale", 2841200299)

    internal val compareLocalesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "compare_locales", 2878152881)

    internal val standardizeLocalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "standardize_locale", 3135753539)

    internal val getAllLanguagesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "get_all_languages", 1139954409)

    internal val getLanguageNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "get_language_name", 3135753539)

    internal val getAllScriptsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "get_all_scripts", 1139954409)

    internal val getScriptNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "get_script_name", 3135753539)

    internal val getAllCountriesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "get_all_countries", 1139954409)

    internal val getCountryNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "get_country_name", 3135753539)

    internal val getLocaleNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "get_locale_name", 3135753539)

    internal val translatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "translate", 58037827)

    internal val translatePluralPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "translate_plural", 1333931916)

    internal val addTranslationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "add_translation", 1466479800)

    internal val removeTranslationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "remove_translation", 1466479800)

    internal val getTranslationObjectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "get_translation_object", 2065240175)

    internal val clearPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "clear", 3218959716)

    internal val getLoadedLocalesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "get_loaded_locales", 1139954409)

    internal val isPseudolocalizationEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "is_pseudolocalization_enabled", 36873697)

    internal val setPseudolocalizationEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "set_pseudolocalization_enabled", 2586408642)

    internal val reloadPseudolocalizationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "reload_pseudolocalization", 3218959716)

    internal val pseudolocalizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationServer", "pseudolocalize", 1965194235)
  }
}
