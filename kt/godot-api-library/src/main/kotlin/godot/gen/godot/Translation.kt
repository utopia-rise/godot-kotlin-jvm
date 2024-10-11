// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_STRING_ARRAY
import godot.core.VariantParser.STRING
import godot.core.VariantParser.STRING_NAME
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

private const val ENGINE_CLASS_TRANSLATION_INDEX: Int = 674

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
    Internals.callConstructor(this, ENGINE_CLASS_TRANSLATION_INDEX, scriptIndex)
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
    throw NotImplementedError("_get_plural_message is not implemented for Translation")
  }

  /**
   * Virtual method to override [getMessage].
   */
  public open fun _getMessage(srcMessage: StringName, context: StringName): StringName {
    throw NotImplementedError("_get_message is not implemented for Translation")
  }

  public final fun setLocale(locale: String): Unit {
    Internals.writeArguments(STRING to locale)
    Internals.callMethod(rawPtr, MethodBindings.setLocalePtr, NIL)
  }

  public final fun getLocale(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLocalePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Adds a message if nonexistent, followed by its translation.
   * An additional context could be used to specify the translation context or differentiate
   * polysemic words.
   */
  @JvmOverloads
  public final fun addMessage(
    srcMessage: StringName,
    xlatedMessage: StringName,
    context: StringName = StringName(""),
  ): Unit {
    Internals.writeArguments(STRING_NAME to srcMessage, STRING_NAME to xlatedMessage, STRING_NAME to context)
    Internals.callMethod(rawPtr, MethodBindings.addMessagePtr, NIL)
  }

  /**
   * Adds a message involving plural translation if nonexistent, followed by its translation.
   * An additional context could be used to specify the translation context or differentiate
   * polysemic words.
   */
  @JvmOverloads
  public final fun addPluralMessage(
    srcMessage: StringName,
    xlatedMessages: PackedStringArray,
    context: StringName = StringName(""),
  ): Unit {
    Internals.writeArguments(STRING_NAME to srcMessage, PACKED_STRING_ARRAY to xlatedMessages, STRING_NAME to context)
    Internals.callMethod(rawPtr, MethodBindings.addPluralMessagePtr, NIL)
  }

  /**
   * Returns a message's translation.
   */
  @JvmOverloads
  public final fun getMessage(srcMessage: StringName, context: StringName = StringName("")):
      StringName {
    Internals.writeArguments(STRING_NAME to srcMessage, STRING_NAME to context)
    Internals.callMethod(rawPtr, MethodBindings.getMessagePtr, STRING_NAME)
    return (Internals.readReturnValue(STRING_NAME) as StringName)
  }

  /**
   * Returns a message's translation involving plurals.
   * The number [n] is the number or quantity of the plural object. It will be used to guide the
   * translation system to fetch the correct plural form for the selected language.
   */
  @JvmOverloads
  public final fun getPluralMessage(
    srcMessage: StringName,
    srcPluralMessage: StringName,
    n: Int,
    context: StringName = StringName(""),
  ): StringName {
    Internals.writeArguments(STRING_NAME to srcMessage, STRING_NAME to srcPluralMessage, LONG to n.toLong(), STRING_NAME to context)
    Internals.callMethod(rawPtr, MethodBindings.getPluralMessagePtr, STRING_NAME)
    return (Internals.readReturnValue(STRING_NAME) as StringName)
  }

  /**
   * Erases a message.
   */
  @JvmOverloads
  public final fun eraseMessage(srcMessage: StringName, context: StringName = StringName("")):
      Unit {
    Internals.writeArguments(STRING_NAME to srcMessage, STRING_NAME to context)
    Internals.callMethod(rawPtr, MethodBindings.eraseMessagePtr, NIL)
  }

  /**
   * Returns all the messages (keys).
   */
  public final fun getMessageList(): PackedStringArray {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMessageListPtr, PACKED_STRING_ARRAY)
    return (Internals.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Returns all the messages (translated text).
   */
  public final fun getTranslatedMessageList(): PackedStringArray {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTranslatedMessageListPtr, PACKED_STRING_ARRAY)
    return (Internals.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Returns the number of existing messages.
   */
  public final fun getMessageCount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMessageCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public companion object

  public object MethodBindings {
    internal val setLocalePtr: VoidPtr =
        Internals.getMethodBindPtr("Translation", "set_locale", 83702148)

    internal val getLocalePtr: VoidPtr =
        Internals.getMethodBindPtr("Translation", "get_locale", 201670096)

    internal val addMessagePtr: VoidPtr =
        Internals.getMethodBindPtr("Translation", "add_message", 971803314)

    internal val addPluralMessagePtr: VoidPtr =
        Internals.getMethodBindPtr("Translation", "add_plural_message", 360316719)

    internal val getMessagePtr: VoidPtr =
        Internals.getMethodBindPtr("Translation", "get_message", 58037827)

    internal val getPluralMessagePtr: VoidPtr =
        Internals.getMethodBindPtr("Translation", "get_plural_message", 1333931916)

    internal val eraseMessagePtr: VoidPtr =
        Internals.getMethodBindPtr("Translation", "erase_message", 3919944288)

    internal val getMessageListPtr: VoidPtr =
        Internals.getMethodBindPtr("Translation", "get_message_list", 1139954409)

    internal val getTranslatedMessageListPtr: VoidPtr =
        Internals.getMethodBindPtr("Translation", "get_translated_message_list", 1139954409)

    internal val getMessageCountPtr: VoidPtr =
        Internals.getMethodBindPtr("Translation", "get_message_count", 3905245786)
  }
}
