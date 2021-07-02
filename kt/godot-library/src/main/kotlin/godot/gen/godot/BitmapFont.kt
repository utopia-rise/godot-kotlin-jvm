// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PoolIntArray
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Renders text using fonts under the [godot.BMFont](https://www.angelcode.com/products/bmfont/) format.
 *
 * Handles files with the `.fnt` extension.
 *
 * Renders text using `*.fnt` fonts containing texture atlases. Supports distance fields. For using vector font files like TTF directly, see [godot.DynamicFont].
 */
@GodotBaseType
public open class BitmapFont : Font() {
  /**
   * Ascent (number of pixels above the baseline).
   */
  public open var ascent: Double
    @JvmName("getAscent_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.getAscent()
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAPFONT_SET_ASCENT, NIL)
    }

  /**
   * If `true`, distance field hint is enabled.
   */
  public open var distanceField: Boolean
    @JvmName("isDistanceFieldHint_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.isDistanceFieldHint()
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAPFONT_SET_DISTANCE_FIELD,
          NIL)
    }

  /**
   * The fallback font.
   */
  public open var fallback: BitmapFont?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAPFONT_GET_FALLBACK, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as BitmapFont?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAPFONT_SET_FALLBACK, NIL)
    }

  /**
   * Total font height (ascent plus descent) in pixels.
   */
  public open var height: Double
    @JvmName("getHeight_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.getHeight()
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAPFONT_SET_HEIGHT, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_BITMAPFONT)
  }

  public open fun _getChars(): PoolIntArray {
    throw NotImplementedError("_get_chars is not implemented for BitmapFont")
  }

  public open fun _getKernings(): PoolIntArray {
    throw NotImplementedError("_get_kernings is not implemented for BitmapFont")
  }

  public open fun _getTextures(): VariantArray<Any?> {
    throw NotImplementedError("_get_textures is not implemented for BitmapFont")
  }

  public open fun _setChars(arg0: PoolIntArray): Unit {
  }

  public open fun _setKernings(arg0: PoolIntArray): Unit {
  }

  public open fun _setTextures(arg0: VariantArray<Any?>): Unit {
  }

  /**
   * Adds a character to the font, where `character` is the Unicode value, `texture` is the texture index, `rect` is the region in the texture (in pixels!), `align` is the (optional) alignment for the character and `advance` is the (optional) advance.
   */
  public open fun addChar(
    character: Long,
    texture: Long,
    rect: Rect2,
    align: Vector2 = Vector2(0.0, 0.0),
    advance: Double = -1.0
  ): Unit {
    TransferContext.writeArguments(LONG to character, LONG to texture, RECT2 to rect, VECTOR2 to
        align, DOUBLE to advance)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAPFONT_ADD_CHAR, NIL)
  }

  /**
   * Adds a kerning pair to the [godot.BitmapFont] as a difference. Kerning pairs are special cases where a typeface advance is determined by the next character.
   */
  public open fun addKerningPair(
    charA: Long,
    charB: Long,
    kerning: Long
  ): Unit {
    TransferContext.writeArguments(LONG to charA, LONG to charB, LONG to kerning)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAPFONT_ADD_KERNING_PAIR, NIL)
  }

  /**
   * Adds a texture to the [godot.BitmapFont].
   */
  public open fun addTexture(texture: Texture): Unit {
    TransferContext.writeArguments(OBJECT to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAPFONT_ADD_TEXTURE, NIL)
  }

  /**
   * Clears all the font data and settings.
   */
  public open fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAPFONT_CLEAR, NIL)
  }

  /**
   * Creates a BitmapFont from the `*.fnt` file at `path`.
   */
  public open fun createFromFnt(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAPFONT_CREATE_FROM_FNT, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns a kerning pair as a difference.
   */
  public open fun getKerningPair(charA: Long, charB: Long): Long {
    TransferContext.writeArguments(LONG to charA, LONG to charB)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAPFONT_GET_KERNING_PAIR, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the font atlas texture at index `idx`.
   */
  public open fun getTexture(idx: Long): Texture? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAPFONT_GET_TEXTURE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture?
  }

  /**
   * Returns the number of textures in the BitmapFont atlas.
   */
  public open fun getTextureCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAPFONT_GET_TEXTURE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }
}
