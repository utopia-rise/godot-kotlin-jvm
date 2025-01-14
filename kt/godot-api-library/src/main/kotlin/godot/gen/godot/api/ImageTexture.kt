// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.VECTOR2I
import godot.core.Vector2i
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

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
    createNativeObject(ENGINECLASS_IMAGETEXTURE, scriptIndex)
  }

  /**
   * Returns the format of the texture, one of [Image.Format].
   */
  public final fun getFormat(): Image.Format {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFormatPtr, LONG)
    return Image.Format.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Replaces the texture's data with a new [Image]. This will re-allocate new memory for the
   * texture.
   * If you want to update the image, but don't need to change its parameters (format, size), use
   * [update] instead for better performance.
   */
  public final fun setImage(image: Image?): Unit {
    TransferContext.writeArguments(OBJECT to image)
    TransferContext.callMethod(ptr, MethodBindings.setImagePtr, NIL)
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
    TransferContext.writeArguments(OBJECT to image)
    TransferContext.callMethod(ptr, MethodBindings.updatePtr, NIL)
  }

  /**
   * Resizes the texture to the specified dimensions.
   */
  public final fun setSizeOverride(size: Vector2i): Unit {
    TransferContext.writeArguments(VECTOR2I to size)
    TransferContext.callMethod(ptr, MethodBindings.setSizeOverridePtr, NIL)
  }

  public companion object {
    /**
     * Creates a new [ImageTexture] and initializes it by allocating and setting the data from an
     * [Image].
     */
    public final fun createFromImage(image: Image?): ImageTexture? {
      TransferContext.writeArguments(OBJECT to image)
      TransferContext.callMethod(0, MethodBindings.createFromImagePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT) as ImageTexture?)
    }
  }

  internal object MethodBindings {
    public val createFromImagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImageTexture", "create_from_image", 2775144163)

    public val getFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImageTexture", "get_format", 3847873762)

    public val setImagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImageTexture", "set_image", 532598488)

    public val updatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImageTexture", "update", 532598488)

    public val setSizeOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImageTexture", "set_size_override", 1130785943)
  }
}
