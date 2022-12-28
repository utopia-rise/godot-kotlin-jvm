// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Language Translation.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/i18n/locales.html]($DOCS_URL/tutorials/i18n/locales.html)
 *
 * Translations are resources that can be loaded and unloaded on demand. They map a string to another string.
 */
@GodotBaseType
public open class Translation : Resource() {
  /**
   * The locale of the translation.
   */
  public var locale: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATION_GET_LOCALE, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATION_SET_LOCALE, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TRANSLATION, scriptIndex)
    return true
  }

  /**
   * Virtual method to override [getPluralMessage].
   */
  public open fun _getPluralMessage(
    srcMessage: StringName,
    srcPluralMessage: StringName,
    n: Long,
    context: StringName
  ): StringName {
    throw NotImplementedError("_get_plural_message is not implemented for Translation")
  }

  /**
   * Virtual method to override [getMessage].
   */
  public open fun _getMessage(srcMessage: StringName, context: StringName): StringName {
    throw NotImplementedError("_get_message is not implemented for Translation")
  }

  /**
   * Adds a message if nonexistent, followed by its translation.
   *
   * An additional context could be used to specify the translation context or differentiate polysemic words.
   */
  public fun addMessage(
    srcMessage: StringName,
    xlatedMessage: StringName,
    context: StringName = StringName("")
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to srcMessage, STRING_NAME to xlatedMessage, STRING_NAME to context)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATION_ADD_MESSAGE, NIL)
  }

  /**
   * Adds a message involving plural translation if nonexistent, followed by its translation.
   *
   * An additional context could be used to specify the translation context or differentiate polysemic words.
   */
  public fun addPluralMessage(
    srcMessage: StringName,
    xlatedMessages: PackedStringArray,
    context: StringName = StringName("")
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to srcMessage, PACKED_STRING_ARRAY to xlatedMessages, STRING_NAME to context)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATION_ADD_PLURAL_MESSAGE, NIL)
  }

  /**
   * Returns a message's translation.
   */
  public fun getMessage(srcMessage: StringName, context: StringName = StringName("")): StringName {
    TransferContext.writeArguments(STRING_NAME to srcMessage, STRING_NAME to context)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATION_GET_MESSAGE,
        STRING_NAME)
    return TransferContext.readReturnValue(STRING_NAME, false) as StringName
  }

  /**
   * Returns a message's translation involving plurals.
   *
   * The number [n] is the number or quantity of the plural object. It will be used to guide the translation system to fetch the correct plural form for the selected language.
   */
  public fun getPluralMessage(
    srcMessage: StringName,
    srcPluralMessage: StringName,
    n: Long,
    context: StringName = StringName("")
  ): StringName {
    TransferContext.writeArguments(STRING_NAME to srcMessage, STRING_NAME to srcPluralMessage, LONG to n, STRING_NAME to context)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATION_GET_PLURAL_MESSAGE,
        STRING_NAME)
    return TransferContext.readReturnValue(STRING_NAME, false) as StringName
  }

  /**
   * Erases a message.
   */
  public fun eraseMessage(srcMessage: StringName, context: StringName = StringName("")): Unit {
    TransferContext.writeArguments(STRING_NAME to srcMessage, STRING_NAME to context)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATION_ERASE_MESSAGE, NIL)
  }

  /**
   * Returns all the messages (keys).
   */
  public fun getMessageList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATION_GET_MESSAGE_LIST,
        PACKED_STRING_ARRAY)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  /**
   * Returns all the messages (translated text).
   */
  public fun getTranslatedMessageList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TRANSLATION_GET_TRANSLATED_MESSAGE_LIST, PACKED_STRING_ARRAY)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  /**
   * Returns the number of existing messages.
   */
  public fun getMessageCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATION_GET_MESSAGE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public companion object
}
