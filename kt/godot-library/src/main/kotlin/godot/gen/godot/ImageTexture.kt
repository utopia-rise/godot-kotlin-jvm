// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.Image
import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * A [godot.Texture2D] based on an [godot.Image].
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/assets_pipeline/importing_images.html]($DOCS_URL/tutorials/assets_pipeline/importing_images.html)
 *
 * A [godot.Texture2D] based on an [godot.Image]. For an image to be displayed, an [godot.ImageTexture] has to be created from it using the [createFromImage] method:
 *
 * ```
 * 		var texture = ImageTexture.new()
 * 		var image = Image.new()
 * 		image.load("res://icon.png")
 * 		texture.create_from_image(image)
 * 		$Sprite2D.texture = texture
 * 		```
 *
 * This way, textures can be created at run-time by loading images both from within the editor and externally.
 *
 * **Warning:** Prefer to load imported textures with [@GDScript.load] over loading them from within the filesystem dynamically with [godot.Image.load], as it may not work in exported projects:
 *
 * ```
 * 		var texture = load("res://icon.png")
 * 		$Sprite2D.texture = texture
 * 		```
 *
 * This is because images have to be imported as a [godot.CompressedTexture2D] first to be loaded with [@GDScript.load]. If you'd still like to load an image file just like any other [godot.Resource], import it as an [godot.Image] resource instead, and then load it normally using the [@GDScript.load] method.
 *
 * **Note:** The image can be retrieved from an imported texture using the [godot.Texture2D.getImage] method, which returns a copy of the image:
 *
 * ```
 * 		var texture = load("res://icon.png")
 * 		var image : Image = texture.get_image()
 * 		```
 *
 * An [godot.ImageTexture] is not meant to be operated from within the editor interface directly, and is mostly useful for rendering images on screen dynamically via code. If you need to generate images procedurally from within the editor, consider saving and importing images as custom texture resources implementing a new [godot.EditorImportPlugin].
 *
 * **Note:** The maximum texture size is 16384×16384 pixels due to graphics hardware limitations.
 */
@GodotBaseType
public open class ImageTexture : Texture2D() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_IMAGETEXTURE)
  }

  /**
   * Initializes the texture by allocating and setting the data from an [godot.Image].
   */
  public fun createFromImage(image: Image): Unit {
    TransferContext.writeArguments(OBJECT to image)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGETEXTURE_CREATE_FROM_IMAGE, NIL)
  }

  /**
   * Returns the format of the texture, one of [enum Image.Format].
   */
  public fun getFormat(): Image.Format {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGETEXTURE_GET_FORMAT, LONG)
    return Image.Format.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Replaces the texture's data with a new [godot.Image].
   *
   * **Note:** The texture has to be initialized first with the [createFromImage] method before it can be updated. The new image dimensions, format, and mipmaps configuration should match the existing texture's image configuration, otherwise it has to be re-created with the [createFromImage] method.
   *
   * Use this method over [createFromImage] if you need to update the texture frequently, which is faster than allocating additional memory for a new texture each time.
   */
  public fun update(image: Image): Unit {
    TransferContext.writeArguments(OBJECT to image)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGETEXTURE_UPDATE, NIL)
  }

  /**
   * Resizes the texture to the specified dimensions.
   */
  public fun setSizeOverride(size: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGETEXTURE_SET_SIZE_OVERRIDE, NIL)
  }

  public companion object
}
