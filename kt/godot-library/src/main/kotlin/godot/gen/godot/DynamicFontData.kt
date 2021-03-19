// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * Used with [godot.DynamicFont] to describe the location of a font file.
 * 
 * Used with [godot.DynamicFont] to describe the location of a vector font file for dynamic rendering at runtime.
 */
@GodotBaseType
open class DynamicFontData : Resource() {
  /**
   * If `true`, the font is rendered with anti-aliasing. This property applies both to the main font and its outline (if it has one).
   */
  open var antialiased: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONTDATA_GET_ANTIALIASED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONTDATA_SET_ANTIALIASED,
          NIL)
    }

  /**
   * The path to the vector font file.
   */
  open var fontPath: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONTDATA_GET_FONT_PATH,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONTDATA_SET_FONT_PATH,
          NIL)
    }

  /**
   * The font hinting mode used by FreeType. See [enum Hinting] for options.
   */
  open var hinting: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONTDATA_GET_HINTING, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONTDATA_SET_HINTING, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_DYNAMICFONTDATA)
  }

  enum class Hinting(
    id: Long
  ) {
    /**
     * Disables font hinting (smoother but less crisp).
     */
    HINTING_NONE(0),

    /**
     * Use the light font hinting mode.
     */
    HINTING_LIGHT(1),

    /**
     * Use the default font hinting mode (crisper but less smooth).
     */
    HINTING_NORMAL(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     * Use the light font hinting mode.
     */
    final const val HINTING_LIGHT: Long = 1

    /**
     * Disables font hinting (smoother but less crisp).
     */
    final const val HINTING_NONE: Long = 0

    /**
     * Use the default font hinting mode (crisper but less smooth).
     */
    final const val HINTING_NORMAL: Long = 2
  }
}
