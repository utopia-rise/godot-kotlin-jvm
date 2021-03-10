// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import kotlin.Any
import kotlin.String
import kotlin.Suppress

/**
 * Server that manages all translations.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/i18n/internationalizing_games.html](https://docs.godotengine.org/en/latest/tutorials/i18n/internationalizing_games.html)
 * [https://docs.godotengine.org/en/latest/tutorials/i18n/locales.html](https://docs.godotengine.org/en/latest/tutorials/i18n/locales.html)
 *
 * Server that manages all translations. Translations can be set to it and removed from it.
 */
@GodotBaseType
object TranslationServer : Object() {
  override fun __new() {
    rawPtr = TransferContext.getSingleton(ENGINESINGLETON_TRANSLATIONSERVER)
  }

  override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  /**
   * Adds a [godot.Translation] resource.
   */
  fun addTranslation(translation: Translation) {
    TransferContext.writeArguments(OBJECT to translation)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATIONSERVER_ADD_TRANSLATION,
        NIL)
  }

  /**
   * Clears the server from all translations.
   */
  fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATIONSERVER_CLEAR, NIL)
  }

  /**
   * Returns an Array of all loaded locales of the game.
   */
  fun getLoadedLocales(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TRANSLATIONSERVER_GET_LOADED_LOCALES, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns the current locale of the game.
   */
  fun getLocale(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATIONSERVER_GET_LOCALE,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns a locale's language and its variant (e.g. `"en_US"` would return `"English (United States)"`).
   */
  fun getLocaleName(locale: String): String {
    TransferContext.writeArguments(STRING to locale)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATIONSERVER_GET_LOCALE_NAME,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Removes the given translation from the server.
   */
  fun removeTranslation(translation: Translation) {
    TransferContext.writeArguments(OBJECT to translation)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TRANSLATIONSERVER_REMOVE_TRANSLATION, NIL)
  }

  /**
   * Sets the locale of the game.
   */
  fun setLocale(locale: String) {
    TransferContext.writeArguments(STRING to locale)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATIONSERVER_SET_LOCALE, NIL)
  }

  /**
   * Returns the current locale's translation for the given message (key).
   */
  fun translate(message: String): String {
    TransferContext.writeArguments(STRING to message)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATIONSERVER_TRANSLATE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }
}
