// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.POOL_STRING_ARRAY
import godot.core.VariantType.STRING
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Language Translation.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/3.4/tutorials/i18n/internationalizing_games.html](https://docs.godotengine.org/en/3.4/tutorials/i18n/internationalizing_games.html)
 * [https://docs.godotengine.org/en/3.4/tutorials/i18n/locales.html](https://docs.godotengine.org/en/3.4/tutorials/i18n/locales.html)
 *
 * Translations are resources that can be loaded and unloaded on demand. They map a string to another string.
 */
@GodotBaseType
public open class Translation : Resource() {
  /**
   * The locale of the translation.
   */
  public open var locale: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATION_GET_LOCALE, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATION_SET_LOCALE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_TRANSLATION)
  }

  /**
   * Virtual method to override [getMessage].
   */
  public open fun _getMessage(srcMessage: String): String {
    throw NotImplementedError("_get_message is not implemented for Translation")
  }

  public open fun _getMessages(): PoolStringArray {
    throw NotImplementedError("_get_messages is not implemented for Translation")
  }

  public open fun _setMessages(arg0: PoolStringArray): Unit {
  }

  /**
   * Adds a message if nonexistent, followed by its translation.
   */
  public open fun addMessage(srcMessage: String, xlatedMessage: String): Unit {
    TransferContext.writeArguments(STRING to srcMessage, STRING to xlatedMessage)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATION_ADD_MESSAGE, NIL)
  }

  /**
   * Erases a message.
   */
  public open fun eraseMessage(srcMessage: String): Unit {
    TransferContext.writeArguments(STRING to srcMessage)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATION_ERASE_MESSAGE, NIL)
  }

  /**
   * Returns a message's translation.
   */
  public open fun getMessage(srcMessage: String): String {
    TransferContext.writeArguments(STRING to srcMessage)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATION_GET_MESSAGE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the number of existing messages.
   */
  public open fun getMessageCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATION_GET_MESSAGE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns all the messages (keys).
   */
  public open fun getMessageList(): PoolStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TRANSLATION_GET_MESSAGE_LIST,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }
}
