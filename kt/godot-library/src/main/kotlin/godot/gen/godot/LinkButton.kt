// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import kotlin.Any
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Simple button used to represent a link to some resource.
 *
 * This kind of button is primarily used when the interaction with the button causes a context change (like linking to a web page).
 *
 * See also [godot.BaseButton] which contains common properties and methods associated with this node.
 */
@GodotBaseType
public open class LinkButton : BaseButton() {
  /**
   * The button's text that will be displayed inside the button's area.
   */
  public var text: String
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_LINKBUTTON_GET_TEXT, STRING.ordinal)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_LINKBUTTON_SET_TEXT, NIL.ordinal)
    }

  /**
   * Base text writing direction.
   */
  public var textDirection: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_LINKBUTTON_GET_TEXT_DIRECTION,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_LINKBUTTON_SET_TEXT_DIRECTION,
          NIL.ordinal)
    }

  /**
   * Language code used for line-breaking and text shaping algorithms, if left empty current locale is used instead.
   */
  public var language: String
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_LINKBUTTON_GET_LANGUAGE,
          STRING.ordinal)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_LINKBUTTON_SET_LANGUAGE, NIL.ordinal)
    }

  /**
   * Determines when to show the underline. See [enum UnderlineMode] for options.
   */
  public var underline: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_LINKBUTTON_GET_UNDERLINE_MODE,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_LINKBUTTON_SET_UNDERLINE_MODE,
          NIL.ordinal)
    }

  /**
   * Set BiDi algorithm override for the structured text.
   */
  public var structuredTextBidiOverride: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LINKBUTTON_GET_STRUCTURED_TEXT_BIDI_OVERRIDE, LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LINKBUTTON_SET_STRUCTURED_TEXT_BIDI_OVERRIDE, NIL.ordinal)
    }

  /**
   * Set additional options for BiDi override.
   */
  public var structuredTextBidiOverrideOptions: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LINKBUTTON_GET_STRUCTURED_TEXT_BIDI_OVERRIDE_OPTIONS,
          ARRAY.ordinal)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LINKBUTTON_SET_STRUCTURED_TEXT_BIDI_OVERRIDE_OPTIONS,
          NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_LINKBUTTON)
  }

  public fun setOpentypeFeature(tag: String, `value`: Long): Unit {
    TransferContext.writeArguments(STRING to tag, LONG to value)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_LINKBUTTON_SET_OPENTYPE_FEATURE,
        NIL.ordinal)
  }

  public fun getOpentypeFeature(tag: String): Long {
    TransferContext.writeArguments(STRING to tag)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_LINKBUTTON_GET_OPENTYPE_FEATURE,
        LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public fun clearOpentypeFeatures(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_LINKBUTTON_CLEAR_OPENTYPE_FEATURES,
        NIL.ordinal)
  }

  public enum class UnderlineMode(
    id: Long
  ) {
    /**
     * The LinkButton will always show an underline at the bottom of its text.
     */
    UNDERLINE_MODE_ALWAYS(0),
    /**
     * The LinkButton will show an underline at the bottom of its text when the mouse cursor is over it.
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
