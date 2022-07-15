// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Used with [godot.DynamicFont] to describe the location of a font file.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/676](https://godotengine.org/asset-library/asset/676)
 *
 * Used with [godot.DynamicFont] to describe the location of a vector font file for dynamic rendering at runtime.
 */
@GodotBaseType
public open class DynamicFontData : Resource() {
  /**
   * If `true`, the font is rendered with anti-aliasing. This property applies both to the main font and its outline (if it has one).
   */
  public open var antialiased: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONTDATA_GET_ANTIALIASED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONTDATA_SET_ANTIALIASED,
          NIL)
    }

  /**
   * The path to the vector font file.
   */
  public open var fontPath: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONTDATA_GET_FONT_PATH,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONTDATA_SET_FONT_PATH,
          NIL)
    }

  /**
   * The font hinting mode used by FreeType. See [enum Hinting] for options.
   */
  public open var hinting: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONTDATA_GET_HINTING, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONTDATA_SET_HINTING, NIL)
    }

  /**
   * If set to a value greater than `0.0`, it will override default font oversampling, ignoring [godot.SceneTree.useFontOversampling] value and viewport stretch mode.
   */
  public open var overrideOversampling: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_DYNAMICFONTDATA_GET_OVERRIDE_OVERSAMPLING, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_DYNAMICFONTDATA_SET_OVERRIDE_OVERSAMPLING, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_DYNAMICFONTDATA)
  }

  public enum class Hinting(
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
    HINTING_NORMAL(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * Use the light font hinting mode.
     */
    public final const val HINTING_LIGHT: Long = 1

    /**
     * Disables font hinting (smoother but less crisp).
     */
    public final const val HINTING_NONE: Long = 0

    /**
     * Use the default font hinting mode (crisper but less smooth).
     */
    public final const val HINTING_NORMAL: Long = 2
  }
}
