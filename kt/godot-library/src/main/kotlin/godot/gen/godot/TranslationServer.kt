// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Server that manages all translations.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/i18n/internationalizing_games.html]($DOCS_URL/tutorials/i18n/internationalizing_games.html)
 * [$DOCS_URL/tutorials/i18n/locales.html]($DOCS_URL/tutorials/i18n/locales.html)
 *
 * Server that manages all translations. Translations can be set to it and removed from it.
 */
@GodotBaseType
public object TranslationServer : Object() {
  public override fun __new(): Unit {
    rawPtr = TransferContext.getSingleton(ENGINESINGLETON_TRANSLATIONSERVER)
  }

  public override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  /**
   * Adds a [godot.Translation] resource.
   */
  public fun addTranslation(translation: Translation): Unit {
    TransferContext.writeArguments(OBJECT to translation)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATIONSERVER_ADD_TRANSLATION,
        NIL)
  }

  /**
   * Clears the server from all translations.
   */
  public fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATIONSERVER_CLEAR, NIL)
  }

  /**
   * Returns an array of all loaded locales of the project.
   */
  public fun getLoadedLocales(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TRANSLATIONSERVER_GET_LOADED_LOCALES, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns the current locale of the project.
   *
   * See also [godot.OS.getLocale] and [godot.OS.getLocaleLanguage] to query the locale of the user system.
   */
  public fun getLocale(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATIONSERVER_GET_LOCALE,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns a locale's language and its variant (e.g. `"en_US"` would return `"English (United States)"`).
   */
  public fun getLocaleName(locale: String): String {
    TransferContext.writeArguments(STRING to locale)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATIONSERVER_GET_LOCALE_NAME,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Removes the given translation from the server.
   */
  public fun removeTranslation(translation: Translation): Unit {
    TransferContext.writeArguments(OBJECT to translation)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TRANSLATIONSERVER_REMOVE_TRANSLATION, NIL)
  }

  /**
   * Sets the locale of the project. The `locale` string will be standardized to match known locales (e.g. `en-US` would be matched to `en_US`).
   *
   * If translations have been loaded beforehand for the new locale, they will be applied.
   */
  public fun setLocale(locale: String): Unit {
    TransferContext.writeArguments(STRING to locale)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATIONSERVER_SET_LOCALE, NIL)
  }

  /**
   * Returns the current locale's translation for the given message (key).
   */
  public fun translate(message: String): String {
    TransferContext.writeArguments(STRING to message)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATIONSERVER_TRANSLATE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }
}
