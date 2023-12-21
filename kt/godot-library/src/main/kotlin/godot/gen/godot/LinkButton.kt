// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

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
  public var text: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextPtr, NIL)
    }

  /**
   * The underline mode to use for the text. See [LinkButton.UnderlineMode] for the available modes.
   */
  public var underline: UnderlineMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUnderlineModePtr, LONG)
      return LinkButton.UnderlineMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setUnderlineModePtr, NIL)
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
  public var uri: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUriPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUriPtr, NIL)
    }

  /**
   * Base text writing direction.
   */
  public var textDirection: Control.TextDirection
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextDirectionPtr, LONG)
      return Control.TextDirection.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextDirectionPtr, NIL)
    }

  /**
   * Language code used for line-breaking and text shaping algorithms, if left empty current locale
   * is used instead.
   */
  public var language: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLanguagePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLanguagePtr, NIL)
    }

  /**
   * Set BiDi algorithm override for the structured text.
   */
  public var structuredTextBidiOverride: TextServer.StructuredTextParser
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStructuredTextBidiOverridePtr, LONG)
      return TextServer.StructuredTextParser.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setStructuredTextBidiOverridePtr, NIL)
    }

  /**
   * Set additional options for BiDi override.
   */
  public var structuredTextBidiOverrideOptions: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStructuredTextBidiOverrideOptionsPtr,
          ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStructuredTextBidiOverrideOptionsPtr,
          NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_LINKBUTTON, scriptIndex)
    return true
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setTextPtr: VoidPtr = TypeManager.getMethodBindPtr("LinkButton", "set_text")

    public val getTextPtr: VoidPtr = TypeManager.getMethodBindPtr("LinkButton", "get_text")

    public val setTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LinkButton", "set_text_direction")

    public val getTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LinkButton", "get_text_direction")

    public val setLanguagePtr: VoidPtr = TypeManager.getMethodBindPtr("LinkButton", "set_language")

    public val getLanguagePtr: VoidPtr = TypeManager.getMethodBindPtr("LinkButton", "get_language")

    public val setUriPtr: VoidPtr = TypeManager.getMethodBindPtr("LinkButton", "set_uri")

    public val getUriPtr: VoidPtr = TypeManager.getMethodBindPtr("LinkButton", "get_uri")

    public val setUnderlineModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LinkButton", "set_underline_mode")

    public val getUnderlineModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LinkButton", "get_underline_mode")

    public val setStructuredTextBidiOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LinkButton", "set_structured_text_bidi_override")

    public val getStructuredTextBidiOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LinkButton", "get_structured_text_bidi_override")

    public val setStructuredTextBidiOverrideOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LinkButton", "set_structured_text_bidi_override_options")

    public val getStructuredTextBidiOverrideOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LinkButton", "get_structured_text_bidi_override_options")
  }
}
