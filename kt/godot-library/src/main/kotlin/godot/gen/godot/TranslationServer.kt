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
import godot.util.VoidPtr
import kotlin.Any
import kotlin.String
import kotlin.Suppress

@GodotBaseType
object TranslationServer : Object() {
  override fun __new(): VoidPtr = TransferContext.getSingleton(ENGINECLASS_TRANSLATIONSERVER)

  override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  fun addTranslation(translation: Translation) {
    TransferContext.writeArguments(OBJECT to translation)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATIONSERVER_ADD_TRANSLATION,
        NIL)
  }

  fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATIONSERVER_CLEAR, NIL)
  }

  fun getLoadedLocales(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TRANSLATIONSERVER_GET_LOADED_LOCALES, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  fun getLocale(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATIONSERVER_GET_LOCALE,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  fun getLocaleName(locale: String): String {
    TransferContext.writeArguments(STRING to locale)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATIONSERVER_GET_LOCALE_NAME,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  fun removeTranslation(translation: Translation) {
    TransferContext.writeArguments(OBJECT to translation)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TRANSLATIONSERVER_REMOVE_TRANSLATION, NIL)
  }

  fun setLocale(locale: String) {
    TransferContext.writeArguments(STRING to locale)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATIONSERVER_SET_LOCALE, NIL)
  }

  fun translate(message: String): String {
    TransferContext.writeArguments(STRING to message)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATIONSERVER_TRANSLATE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }
}
