// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A button that represents a link. This type of button is primarily used for interactions that
 * cause a context change (like linking to a web page).
 * See also [BaseButton] which contains common properties and methods associated with this node.
 */
@GodotBaseType
public open class LinkButton : BaseButton() {
  /**
   * The button's text that will be displayed inside the button's area.
   */
  public final inline var text: String
    @JvmName("textProperty")
    get() = getText()
    @JvmName("textProperty")
    set(`value`) {
      setText(value)
    }

  /**
   * The underline mode to use for the text. See [LinkButton.UnderlineMode] for the available modes.
   */
  public final inline var underline: UnderlineMode
    @JvmName("underlineProperty")
    get() = getUnderlineMode()
    @JvmName("underlineProperty")
    set(`value`) {
      setUnderlineMode(value)
    }

  /**
   * The [url=https://en.wikipedia.org/wiki/Uniform_Resource_Identifier]URI[/url] for this
   * [LinkButton]. If set to a valid URI, pressing the button opens the URI using the operating
   * system's default program for the protocol (via [OS.shellOpen]). HTTP and HTTPS URLs open the
   * default web browser.
   * **Examples:**
   *
   * gdscript:
   * ```gdscript
   * uri = "https://godotengine.org"  # Opens the URL in the default web browser.
   * uri = "C:\SomeFolder"  # Opens the file explorer at the given path.
   * uri = "C:\SomeImage.png"  # Opens the given image in the default viewing app.
   * ```
   * csharp:
   * ```csharp
   * Uri = "https://godotengine.org"; // Opens the URL in the default web browser.
   * Uri = "C:\SomeFolder"; // Opens the file explorer at the given path.
   * Uri = "C:\SomeImage.png"; // Opens the given image in the default viewing app.
   * ```
   */
  public final inline var uri: String
    @JvmName("uriProperty")
    get() = getUri()
    @JvmName("uriProperty")
    set(`value`) {
      setUri(value)
    }

  /**
   * Base text writing direction.
   */
  public final inline var textDirection: Control.TextDirection
    @JvmName("textDirectionProperty")
    get() = getTextDirection()
    @JvmName("textDirectionProperty")
    set(`value`) {
      setTextDirection(value)
    }

  /**
   * Language code used for line-breaking and text shaping algorithms, if left empty current locale
   * is used instead.
   */
  public final inline var language: String
    @JvmName("languageProperty")
    get() = getLanguage()
    @JvmName("languageProperty")
    set(`value`) {
      setLanguage(value)
    }

  /**
   * Set BiDi algorithm override for the structured text.
   */
  public final inline var structuredTextBidiOverride: TextServer.StructuredTextParser
    @JvmName("structuredTextBidiOverrideProperty")
    get() = getStructuredTextBidiOverride()
    @JvmName("structuredTextBidiOverrideProperty")
    set(`value`) {
      setStructuredTextBidiOverride(value)
    }

  /**
   * Set additional options for BiDi override.
   */
  public final inline var structuredTextBidiOverrideOptions: VariantArray<Any?>
    @JvmName("structuredTextBidiOverrideOptionsProperty")
    get() = getStructuredTextBidiOverrideOptions()
    @JvmName("structuredTextBidiOverrideOptionsProperty")
    set(`value`) {
      setStructuredTextBidiOverrideOptions(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_LINKBUTTON, scriptIndex)
  }

  public final fun setText(text: String): Unit {
    TransferContext.writeArguments(STRING to text)
    TransferContext.callMethod(rawPtr, MethodBindings.setTextPtr, NIL)
  }

  public final fun getText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setTextDirection(direction: Control.TextDirection): Unit {
    TransferContext.writeArguments(LONG to direction.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setTextDirectionPtr, NIL)
  }

  public final fun getTextDirection(): Control.TextDirection {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTextDirectionPtr, LONG)
    return Control.TextDirection.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setLanguage(language: String): Unit {
    TransferContext.writeArguments(STRING to language)
    TransferContext.callMethod(rawPtr, MethodBindings.setLanguagePtr, NIL)
  }

  public final fun getLanguage(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLanguagePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setUri(uri: String): Unit {
    TransferContext.writeArguments(STRING to uri)
    TransferContext.callMethod(rawPtr, MethodBindings.setUriPtr, NIL)
  }

  public final fun getUri(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getUriPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setUnderlineMode(underlineMode: UnderlineMode): Unit {
    TransferContext.writeArguments(LONG to underlineMode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setUnderlineModePtr, NIL)
  }

  public final fun getUnderlineMode(): UnderlineMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getUnderlineModePtr, LONG)
    return LinkButton.UnderlineMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setStructuredTextBidiOverride(parser: TextServer.StructuredTextParser): Unit {
    TransferContext.writeArguments(LONG to parser.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setStructuredTextBidiOverridePtr, NIL)
  }

  public final fun getStructuredTextBidiOverride(): TextServer.StructuredTextParser {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getStructuredTextBidiOverridePtr, LONG)
    return TextServer.StructuredTextParser.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setStructuredTextBidiOverrideOptions(args: VariantArray<Any?>): Unit {
    TransferContext.writeArguments(ARRAY to args)
    TransferContext.callMethod(rawPtr, MethodBindings.setStructuredTextBidiOverrideOptionsPtr, NIL)
  }

  public final fun getStructuredTextBidiOverrideOptions(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getStructuredTextBidiOverrideOptionsPtr,
        ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  public enum class UnderlineMode(
    id: Long,
  ) {
    /**
     * The LinkButton will always show an underline at the bottom of its text.
     */
    UNDERLINE_MODE_ALWAYS(0),
    /**
     * The LinkButton will show an underline at the bottom of its text when the mouse cursor is over
     * it.
     */
    UNDERLINE_MODE_ON_HOVER(1),
    /**
     * The LinkButton will never show an underline at the bottom of its text.
     */
    UNDERLINE_MODE_NEVER(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): UnderlineMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LinkButton", "set_text", 83702148)

    public val getTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LinkButton", "get_text", 201670096)

    public val setTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LinkButton", "set_text_direction", 119160795)

    public val getTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LinkButton", "get_text_direction", 797257663)

    public val setLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LinkButton", "set_language", 83702148)

    public val getLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LinkButton", "get_language", 201670096)

    public val setUriPtr: VoidPtr = TypeManager.getMethodBindPtr("LinkButton", "set_uri", 83702148)

    public val getUriPtr: VoidPtr = TypeManager.getMethodBindPtr("LinkButton", "get_uri", 201670096)

    public val setUnderlineModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LinkButton", "set_underline_mode", 4032947085)

    public val getUnderlineModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LinkButton", "get_underline_mode", 568343738)

    public val setStructuredTextBidiOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LinkButton", "set_structured_text_bidi_override", 55961453)

    public val getStructuredTextBidiOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LinkButton", "get_structured_text_bidi_override", 3385126229)

    public val setStructuredTextBidiOverrideOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LinkButton", "set_structured_text_bidi_override_options", 381264803)

    public val getStructuredTextBidiOverrideOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LinkButton", "get_structured_text_bidi_override_options", 3995934104)
  }
}
