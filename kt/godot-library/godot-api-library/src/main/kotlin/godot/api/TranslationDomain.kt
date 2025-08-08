// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.StringName
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.core.VariantParser.STRING_NAME
import godot.core.asCachedStringName
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmName

/**
 * [TranslationDomain] is a self-contained collection of [Translation] resources. Translations can be added to or removed from it.
 *
 * If you're working with the main translation domain, it is more convenient to use the wrap methods on [TranslationServer].
 */
@GodotBaseType
public open class TranslationDomain : RefCounted() {
  /**
   * If `true`, enables pseudolocalization for the project. This can be used to spot untranslatable strings or layout issues that may occur once the project is localized to languages that have longer strings than the source language.
   *
   * **Note:** Updating this property does not automatically update texts in the scene tree. Please propagate the [MainLoop.NOTIFICATION_TRANSLATION_CHANGED] notification manually after you have finished modifying pseudolocalization related options.
   */
  public final inline var pseudolocalizationEnabled: Boolean
    @JvmName("pseudolocalizationEnabledProperty")
    get() = isPseudolocalizationEnabled()
    @JvmName("pseudolocalizationEnabledProperty")
    set(`value`) {
      setPseudolocalizationEnabled(value)
    }

  /**
   * Replace all characters with their accented variants during pseudolocalization.
   *
   * **Note:** Updating this property does not automatically update texts in the scene tree. Please propagate the [MainLoop.NOTIFICATION_TRANSLATION_CHANGED] notification manually after you have finished modifying pseudolocalization related options.
   */
  public final inline var pseudolocalizationAccentsEnabled: Boolean
    @JvmName("pseudolocalizationAccentsEnabledProperty")
    get() = isPseudolocalizationAccentsEnabled()
    @JvmName("pseudolocalizationAccentsEnabledProperty")
    set(`value`) {
      setPseudolocalizationAccentsEnabled(value)
    }

  /**
   * Double vowels in strings during pseudolocalization to simulate the lengthening of text due to localization.
   *
   * **Note:** Updating this property does not automatically update texts in the scene tree. Please propagate the [MainLoop.NOTIFICATION_TRANSLATION_CHANGED] notification manually after you have finished modifying pseudolocalization related options.
   */
  public final inline var pseudolocalizationDoubleVowelsEnabled: Boolean
    @JvmName("pseudolocalizationDoubleVowelsEnabledProperty")
    get() = isPseudolocalizationDoubleVowelsEnabled()
    @JvmName("pseudolocalizationDoubleVowelsEnabledProperty")
    set(`value`) {
      setPseudolocalizationDoubleVowelsEnabled(value)
    }

  /**
   * If `true`, emulate bidirectional (right-to-left) text when pseudolocalization is enabled. This can be used to spot issues with RTL layout and UI mirroring that will crop up if the project is localized to RTL languages such as Arabic or Hebrew.
   *
   * **Note:** Updating this property does not automatically update texts in the scene tree. Please propagate the [MainLoop.NOTIFICATION_TRANSLATION_CHANGED] notification manually after you have finished modifying pseudolocalization related options.
   */
  public final inline var pseudolocalizationFakeBidiEnabled: Boolean
    @JvmName("pseudolocalizationFakeBidiEnabledProperty")
    get() = isPseudolocalizationFakeBidiEnabled()
    @JvmName("pseudolocalizationFakeBidiEnabledProperty")
    set(`value`) {
      setPseudolocalizationFakeBidiEnabled(value)
    }

  /**
   * Replace all characters in the string with `*`. Useful for finding non-localizable strings.
   *
   * **Note:** Updating this property does not automatically update texts in the scene tree. Please propagate the [MainLoop.NOTIFICATION_TRANSLATION_CHANGED] notification manually after you have finished modifying pseudolocalization related options.
   */
  public final inline var pseudolocalizationOverrideEnabled: Boolean
    @JvmName("pseudolocalizationOverrideEnabledProperty")
    get() = isPseudolocalizationOverrideEnabled()
    @JvmName("pseudolocalizationOverrideEnabledProperty")
    set(`value`) {
      setPseudolocalizationOverrideEnabled(value)
    }

  /**
   * Skip placeholders for string formatting like `&#37;s` or `&#37;f` during pseudolocalization. Useful to identify strings which need additional control characters to display correctly.
   *
   * **Note:** Updating this property does not automatically update texts in the scene tree. Please propagate the [MainLoop.NOTIFICATION_TRANSLATION_CHANGED] notification manually after you have finished modifying pseudolocalization related options.
   */
  public final inline var pseudolocalizationSkipPlaceholdersEnabled: Boolean
    @JvmName("pseudolocalizationSkipPlaceholdersEnabledProperty")
    get() = isPseudolocalizationSkipPlaceholdersEnabled()
    @JvmName("pseudolocalizationSkipPlaceholdersEnabledProperty")
    set(`value`) {
      setPseudolocalizationSkipPlaceholdersEnabled(value)
    }

  /**
   * The expansion ratio to use during pseudolocalization. A value of `0.3` is sufficient for most practical purposes, and will increase the length of each string by 30&#37;.
   *
   * **Note:** Updating this property does not automatically update texts in the scene tree. Please propagate the [MainLoop.NOTIFICATION_TRANSLATION_CHANGED] notification manually after you have finished modifying pseudolocalization related options.
   */
  public final inline var pseudolocalizationExpansionRatio: Float
    @JvmName("pseudolocalizationExpansionRatioProperty")
    get() = getPseudolocalizationExpansionRatio()
    @JvmName("pseudolocalizationExpansionRatioProperty")
    set(`value`) {
      setPseudolocalizationExpansionRatio(value)
    }

  /**
   * Prefix that will be prepended to the pseudolocalized string.
   *
   * **Note:** Updating this property does not automatically update texts in the scene tree. Please propagate the [MainLoop.NOTIFICATION_TRANSLATION_CHANGED] notification manually after you have finished modifying pseudolocalization related options.
   */
  public final inline var pseudolocalizationPrefix: String
    @JvmName("pseudolocalizationPrefixProperty")
    get() = getPseudolocalizationPrefix()
    @JvmName("pseudolocalizationPrefixProperty")
    set(`value`) {
      setPseudolocalizationPrefix(value)
    }

  /**
   * Suffix that will be appended to the pseudolocalized string.
   *
   * **Note:** Updating this property does not automatically update texts in the scene tree. Please propagate the [MainLoop.NOTIFICATION_TRANSLATION_CHANGED] notification manually after you have finished modifying pseudolocalization related options.
   */
  public final inline var pseudolocalizationSuffix: String
    @JvmName("pseudolocalizationSuffixProperty")
    get() = getPseudolocalizationSuffix()
    @JvmName("pseudolocalizationSuffixProperty")
    set(`value`) {
      setPseudolocalizationSuffix(value)
    }

  override fun new(scriptIndex: Int) {
    createNativeObject(694, scriptIndex)
  }

  /**
   * Returns the [Translation] instance that best matches [locale]. Returns `null` if there are no matches.
   */
  public final fun getTranslationObject(locale: String): Translation? {
    TransferContext.writeArguments(STRING to locale)
    TransferContext.callMethod(ptr, MethodBindings.getTranslationObjectPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Translation?)
  }

  /**
   * Adds a translation.
   */
  public final fun addTranslation(translation: Translation?) {
    TransferContext.writeArguments(OBJECT to translation)
    TransferContext.callMethod(ptr, MethodBindings.addTranslationPtr, NIL)
  }

  /**
   * Removes the given translation.
   */
  public final fun removeTranslation(translation: Translation?) {
    TransferContext.writeArguments(OBJECT to translation)
    TransferContext.callMethod(ptr, MethodBindings.removeTranslationPtr, NIL)
  }

  /**
   * Removes all translations.
   */
  public final fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearPtr, NIL)
  }

  /**
   * Returns the current locale's translation for the given message and context.
   */
  public final fun translate(message: StringName, context: StringName = StringName("")): StringName {
    TransferContext.writeArguments(STRING_NAME to message, STRING_NAME to context)
    TransferContext.callMethod(ptr, MethodBindings.translatePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  /**
   * Returns the current locale's translation for the given message, plural message and context.
   *
   * The number [n] is the number or quantity of the plural object. It will be used to guide the translation system to fetch the correct plural form for the selected language.
   */
  public final fun translatePlural(
    message: StringName,
    messagePlural: StringName,
    n: Int,
    context: StringName = StringName(""),
  ): StringName {
    TransferContext.writeArguments(STRING_NAME to message, STRING_NAME to messagePlural, LONG to n.toLong(), STRING_NAME to context)
    TransferContext.callMethod(ptr, MethodBindings.translatePluralPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  public final fun isPseudolocalizationEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isPseudolocalizationEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setPseudolocalizationEnabled(enabled: Boolean) {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setPseudolocalizationEnabledPtr, NIL)
  }

  public final fun isPseudolocalizationAccentsEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isPseudolocalizationAccentsEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setPseudolocalizationAccentsEnabled(enabled: Boolean) {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setPseudolocalizationAccentsEnabledPtr, NIL)
  }

  public final fun isPseudolocalizationDoubleVowelsEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isPseudolocalizationDoubleVowelsEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setPseudolocalizationDoubleVowelsEnabled(enabled: Boolean) {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setPseudolocalizationDoubleVowelsEnabledPtr, NIL)
  }

  public final fun isPseudolocalizationFakeBidiEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isPseudolocalizationFakeBidiEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setPseudolocalizationFakeBidiEnabled(enabled: Boolean) {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setPseudolocalizationFakeBidiEnabledPtr, NIL)
  }

  public final fun isPseudolocalizationOverrideEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isPseudolocalizationOverrideEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setPseudolocalizationOverrideEnabled(enabled: Boolean) {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setPseudolocalizationOverrideEnabledPtr, NIL)
  }

  public final fun isPseudolocalizationSkipPlaceholdersEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isPseudolocalizationSkipPlaceholdersEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setPseudolocalizationSkipPlaceholdersEnabled(enabled: Boolean) {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setPseudolocalizationSkipPlaceholdersEnabledPtr, NIL)
  }

  public final fun getPseudolocalizationExpansionRatio(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPseudolocalizationExpansionRatioPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setPseudolocalizationExpansionRatio(ratio: Float) {
    TransferContext.writeArguments(DOUBLE to ratio.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setPseudolocalizationExpansionRatioPtr, NIL)
  }

  public final fun getPseudolocalizationPrefix(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPseudolocalizationPrefixPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setPseudolocalizationPrefix(prefix: String) {
    TransferContext.writeArguments(STRING to prefix)
    TransferContext.callMethod(ptr, MethodBindings.setPseudolocalizationPrefixPtr, NIL)
  }

  public final fun getPseudolocalizationSuffix(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPseudolocalizationSuffixPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setPseudolocalizationSuffix(suffix: String) {
    TransferContext.writeArguments(STRING to suffix)
    TransferContext.callMethod(ptr, MethodBindings.setPseudolocalizationSuffixPtr, NIL)
  }

  /**
   * Returns the pseudolocalized string based on the [message] passed in.
   */
  public final fun pseudolocalize(message: StringName): StringName {
    TransferContext.writeArguments(STRING_NAME to message)
    TransferContext.callMethod(ptr, MethodBindings.pseudolocalizePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  /**
   * Returns the current locale's translation for the given message and context.
   */
  public final fun translate(message: String, context: String): StringName = translate(message.asCachedStringName(), context.asCachedStringName())

  /**
   * Returns the current locale's translation for the given message, plural message and context.
   *
   * The number [n] is the number or quantity of the plural object. It will be used to guide the translation system to fetch the correct plural form for the selected language.
   */
  public final fun translatePlural(
    message: String,
    messagePlural: String,
    n: Int,
    context: String,
  ): StringName = translatePlural(message.asCachedStringName(), messagePlural.asCachedStringName(), n, context.asCachedStringName())

  /**
   * Returns the pseudolocalized string based on the [message] passed in.
   */
  public final fun pseudolocalize(message: String): StringName = pseudolocalize(message.asCachedStringName())

  public companion object

  public object MethodBindings {
    internal val getTranslationObjectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationDomain", "get_translation_object", 606_768_082)

    internal val addTranslationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationDomain", "add_translation", 1_466_479_800)

    internal val removeTranslationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationDomain", "remove_translation", 1_466_479_800)

    internal val clearPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationDomain", "clear", 3_218_959_716)

    internal val translatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationDomain", "translate", 1_829_228_469)

    internal val translatePluralPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationDomain", "translate_plural", 229_954_002)

    internal val isPseudolocalizationEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationDomain", "is_pseudolocalization_enabled", 36_873_697)

    internal val setPseudolocalizationEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationDomain", "set_pseudolocalization_enabled", 2_586_408_642)

    internal val isPseudolocalizationAccentsEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationDomain", "is_pseudolocalization_accents_enabled", 36_873_697)

    internal val setPseudolocalizationAccentsEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationDomain", "set_pseudolocalization_accents_enabled", 2_586_408_642)

    internal val isPseudolocalizationDoubleVowelsEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationDomain", "is_pseudolocalization_double_vowels_enabled", 36_873_697)

    internal val setPseudolocalizationDoubleVowelsEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationDomain", "set_pseudolocalization_double_vowels_enabled", 2_586_408_642)

    internal val isPseudolocalizationFakeBidiEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationDomain", "is_pseudolocalization_fake_bidi_enabled", 36_873_697)

    internal val setPseudolocalizationFakeBidiEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationDomain", "set_pseudolocalization_fake_bidi_enabled", 2_586_408_642)

    internal val isPseudolocalizationOverrideEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationDomain", "is_pseudolocalization_override_enabled", 36_873_697)

    internal val setPseudolocalizationOverrideEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationDomain", "set_pseudolocalization_override_enabled", 2_586_408_642)

    internal val isPseudolocalizationSkipPlaceholdersEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationDomain", "is_pseudolocalization_skip_placeholders_enabled", 36_873_697)

    internal val setPseudolocalizationSkipPlaceholdersEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationDomain", "set_pseudolocalization_skip_placeholders_enabled", 2_586_408_642)

    internal val getPseudolocalizationExpansionRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationDomain", "get_pseudolocalization_expansion_ratio", 1_740_695_150)

    internal val setPseudolocalizationExpansionRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationDomain", "set_pseudolocalization_expansion_ratio", 373_806_689)

    internal val getPseudolocalizationPrefixPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationDomain", "get_pseudolocalization_prefix", 201_670_096)

    internal val setPseudolocalizationPrefixPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationDomain", "set_pseudolocalization_prefix", 83_702_148)

    internal val getPseudolocalizationSuffixPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationDomain", "get_pseudolocalization_suffix", 201_670_096)

    internal val setPseudolocalizationSuffixPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationDomain", "set_pseudolocalization_suffix", 83_702_148)

    internal val pseudolocalizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TranslationDomain", "pseudolocalize", 1_965_194_235)
  }
}
