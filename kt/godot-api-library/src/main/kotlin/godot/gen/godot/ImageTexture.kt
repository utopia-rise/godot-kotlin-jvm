// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.VECTOR2I
import godot.core.Vector2i
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_IMAGETEXTURE_INDEX: Int = 307

/**
 * A [Texture2D] based on an [Image]. For an image to be displayed, an [ImageTexture] has to be
 * created from it using the [createFromImage] method:
 * [codeblock]
 * var image = Image.load_from_file("res://icon.svg")
 * var texture = ImageTexture.create_from_image(image)
 * $Sprite2D.texture = texture
 * [/codeblock]
 * This way, textures can be created at run-time by loading images both from within the editor and
 * externally.
 * **Warning:** Prefer to load imported textures with [@GDScript.load] over loading them from within
 * the filesystem dynamically with [Image.load], as it may not work in exported projects:
 * [codeblock]
 * var texture = load("res://icon.svg")
 * $Sprite2D.texture = texture
 * [/codeblock]
 * This is because images have to be imported as a [CompressedTexture2D] first to be loaded with
 * [@GDScript.load]. If you'd still like to load an image file just like any other [Resource], import
 * it as an [Image] resource instead, and then load it normally using the [@GDScript.load] method.
 * **Note:** The image can be retrieved from an imported texture using the [Texture2D.getImage]
 * method, which returns a copy of the image:
 * [codeblock]
 * var texture = load("res://icon.svg")
 * var image: Image = texture.get_image()
 * [/codeblock]
 * An [ImageTexture] is not meant to be operated from within the editor interface directly, and is
 * mostly useful for rendering images on screen dynamically via code. If you need to generate images
 * procedurally from within the editor, consider saving and importing images as custom texture
 * resources implementing a new [EditorImportPlugin].
 * **Note:** The maximum texture size is 16384×16384 pixels due to graphics hardware limitations.
 */
@GodotBaseType
public open class ImageTexture : Texture2D() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_IMAGETEXTURE_INDEX, scriptIndex)
  }

  /**
   * Returns the format of the texture, one of [Image.Format].
   */
  public final fun getFormat(): Image.Format {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFormatPtr, LONG)
    return Image.Format.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Replaces the texture's data with a new [Image]. This will re-allocate new memory for the
   * texture.
   * If you want to update the image, but don't need to change its parameters (format, size), use
   * [update] instead for better performance.
   */
  public final fun setImage(image: Image?): Unit {
    Internals.writeArguments(OBJECT to image)
    Internals.callMethod(rawPtr, MethodBindings.setImagePtr, NIL)
  }

  /**
   * Replaces the texture's data with a new [Image].
   * **Note:** The texture has to be created using [createFromImage] or initialized first with the
   * [setImage] method before it can be updated. The new image dimensions, format, and mipmaps
   * configuration should match the existing texture's image configuration.
   * Use this method over [setImage] if you need to update the texture frequently, which is faster
   * than allocating additional memory for a new texture each time.
   */
  public final fun update(image: Image?): Unit {
    Internals.writeArguments(OBJECT to image)
    Internals.callMethod(rawPtr, MethodBindings.updatePtr, NIL)
  }

  /**
   * Resizes the texture to the specified dimensions.
   */
  public final fun setSizeOverride(size: Vector2i): Unit {
    Internals.writeArguments(VECTOR2I to size)
    Internals.callMethod(rawPtr, MethodBindings.setSizeOverridePtr, NIL)
  }

  public companion object {
    /**
     * Creates a new [ImageTexture] and initializes it by allocating and setting the data from an
     * [Image].
     */
    public final fun createFromImage(image: Image?): ImageTexture? {
      Internals.writeArguments(OBJECT to image)
      Internals.callMethod(0, MethodBindings.createFromImagePtr, OBJECT)
      return (Internals.readReturnValue(OBJECT) as ImageTexture?)
    }
  }

  internal object MethodBindings {
    public val createFromImagePtr: VoidPtr =
        Internals.getMethodBindPtr("ImageTexture", "create_from_image", 2775144163)

    public val getFormatPtr: VoidPtr =
        Internals.getMethodBindPtr("ImageTexture", "get_format", 3847873762)

    public val setImagePtr: VoidPtr =
        Internals.getMethodBindPtr("ImageTexture", "set_image", 532598488)

    public val updatePtr: VoidPtr = Internals.getMethodBindPtr("ImageTexture", "update", 532598488)

    public val setSizeOverridePtr: VoidPtr =
        Internals.getMethodBindPtr("ImageTexture", "set_size_override", 1130785943)
  }
}
