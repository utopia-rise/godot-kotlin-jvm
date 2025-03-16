// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_STRING_ARRAY
import godot.core.VariantParser.STRING
import godot.core.VariantParser.STRING_NAME
import godot.core.asCachedStringName
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * [Translation]s are resources that can be loaded and unloaded on demand. They map a collection of
 * strings to their individual translations, and they also provide convenience methods for
 * pluralization.
 */
@GodotBaseType
public open class Translation : Resource() {
  /**
   * The locale of the translation.
   */
  public final inline var locale: String
    @JvmName("localeProperty")
    get() = getLocale()
    @JvmName("localeProperty")
    set(`value`) {
      setLocale(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(696, scriptIndex)
  }

  /**
   * Virtual method to override [getPluralMessage].
   */
  public open fun _getPluralMessage(
    srcMessage: StringName,
    srcPluralMessage: StringName,
    n: Int,
    context: StringName,
  ): StringName {
    throw NotImplementedError("_getPluralMessage is not implemented for Translation")
  }

  /**
   * Virtual method to override [getMessage].
   */
  public open fun _getMessage(srcMessage: StringName, context: StringName): StringName {
    throw NotImplementedError("_getMessage is not implemented for Translation")
  }

  public final fun setLocale(locale: String): Unit {
    TransferContext.writeArguments(STRING to locale)
    TransferContext.callMethod(ptr, MethodBindings.setLocalePtr, NIL)
  }

  public final fun getLocale(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLocalePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Adds a message if nonexistent, followed by its translation.
   *
   * An additional context could be used to specify the translation context or differentiate
   * polysemic words.
   */
  public final fun addMessage(
    srcMessage: StringName,
    xlatedMessage: StringName,
    context: StringName = StringName(""),
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to srcMessage, STRING_NAME to xlatedMessage, STRING_NAME to context)
    TransferContext.callMethod(ptr, MethodBindings.addMessagePtr, NIL)
  }

  /**
   * Adds a message involving plural translation if nonexistent, followed by its translation.
   *
   * An additional context could be used to specify the translation context or differentiate
   * polysemic words.
   */
  public final fun addPluralMessage(
    srcMessage: StringName,
    xlatedMessages: PackedStringArray,
    context: StringName = StringName(""),
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to srcMessage, PACKED_STRING_ARRAY to xlatedMessages, STRING_NAME to context)
    TransferContext.callMethod(ptr, MethodBindings.addPluralMessagePtr, NIL)
  }

  /**
   * Returns a message's translation.
   */
  public final fun getMessage(srcMessage: StringName, context: StringName = StringName("")):
      StringName {
    TransferContext.writeArguments(STRING_NAME to srcMessage, STRING_NAME to context)
    TransferContext.callMethod(ptr, MethodBindings.getMessagePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  /**
   * Returns a message's translation involving plurals.
   *
   * The number [n] is the number or quantity of the plural object. It will be used to guide the
   * translation system to fetch the correct plural form for the selected language.
   */
  public final fun getPluralMessage(
    srcMessage: StringName,
    srcPluralMessage: StringName,
    n: Int,
    context: StringName = StringName(""),
  ): StringName {
    TransferContext.writeArguments(STRING_NAME to srcMessage, STRING_NAME to srcPluralMessage, LONG to n.toLong(), STRING_NAME to context)
    TransferContext.callMethod(ptr, MethodBindings.getPluralMessagePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  /**
   * Erases a message.
   */
  public final fun eraseMessage(srcMessage: StringName, context: StringName = StringName("")):
      Unit {
    TransferContext.writeArguments(STRING_NAME to srcMessage, STRING_NAME to context)
    TransferContext.callMethod(ptr, MethodBindings.eraseMessagePtr, NIL)
  }

  /**
   * Returns all the messages (keys).
   */
  public final fun getMessageList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMessageListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Returns all the messages (translated text).
   */
  public final fun getTranslatedMessageList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTranslatedMessageListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Returns the number of existing messages.
   */
  public final fun getMessageCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMessageCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Adds a message if nonexistent, followed by its translation.
   *
   * An additional context could be used to specify the translation context or differentiate
   * polysemic words.
   */
  public final fun addMessage(
    srcMessage: String,
    xlatedMessage: String,
    context: String,
  ) =
      addMessage(srcMessage.asCachedStringName(), xlatedMessage.asCachedStringName(), context.asCachedStringName())

  /**
   * Adds a message involving plural translation if nonexistent, followed by its translation.
   *
   * An additional context could be used to specify the translation context or differentiate
   * polysemic words.
   */
  public final fun addPluralMessage(
    srcMessage: String,
    xlatedMessages: PackedStringArray,
    context: String,
  ) =
      addPluralMessage(srcMessage.asCachedStringName(), xlatedMessages, context.asCachedStringName())

  /**
   * Returns a message's translation.
   */
  public final fun getMessage(srcMessage: String, context: String): StringName =
      getMessage(srcMessage.asCachedStringName(), context.asCachedStringName())

  /**
   * Returns a message's translation involving plurals.
   *
   * The number [n] is the number or quantity of the plural object. It will be used to guide the
   * translation system to fetch the correct plural form for the selected language.
   */
  public final fun getPluralMessage(
    srcMessage: String,
    srcPluralMessage: String,
    n: Int,
    context: String,
  ): StringName =
      getPluralMessage(srcMessage.asCachedStringName(), srcPluralMessage.asCachedStringName(), n, context.asCachedStringName())

  /**
   * Erases a message.
   */
  public final fun eraseMessage(srcMessage: String, context: String) =
      eraseMessage(srcMessage.asCachedStringName(), context.asCachedStringName())

  public companion object

  public object MethodBindings {
    internal val setLocalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Translation", "set_locale", 83702148)

    internal val getLocalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Translation", "get_locale", 201670096)

    internal val addMessagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Translation", "add_message", 3898530326)

    internal val addPluralMessagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Translation", "add_plural_message", 2356982266)

    internal val getMessagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Translation", "get_message", 1829228469)

    internal val getPluralMessagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Translation", "get_plural_message", 229954002)

    internal val eraseMessagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Translation", "erase_message", 3959009644)

    internal val getMessageListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Translation", "get_message_list", 1139954409)

    internal val getTranslatedMessageListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Translation", "get_translated_message_list", 1139954409)

    internal val getMessageCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Translation", "get_message_count", 3905245786)
  }
}
