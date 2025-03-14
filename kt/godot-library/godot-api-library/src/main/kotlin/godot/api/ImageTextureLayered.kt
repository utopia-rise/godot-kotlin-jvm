// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Error
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Base class for [Texture2DArray], [Cubemap] and [CubemapArray]. Cannot be used directly, but
 * contains all the functions necessary for accessing the derived resource types. See also [Texture3D].
 */
@GodotBaseType
public open class ImageTextureLayered internal constructor() : TextureLayered() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(287, scriptIndex)
  }

  /**
   * Creates an [ImageTextureLayered] from an array of [Image]s. See [Image.create] for the expected
   * data format. The first image decides the width, height, image format and mipmapping setting. The
   * other images *must* have the same width, height, image format and mipmapping setting.
   * Each [Image] represents one `layer`.
   * [codeblock]
   * # Fill in an array of Images with different colors.
   * var images = []
   * const LAYERS = 6
   * for i in LAYERS:
   *     var image = Image.create_empty(128, 128, false, Image.FORMAT_RGB8)
   *     if i &#37; 3 == 0:
   *         image.fill(Color.RED)
   *     elif i &#37; 3 == 1:
   *         image.fill(Color.GREEN)
   *     else:
   *         image.fill(Color.BLUE)
   *     images.push_back(image)
   *
   * # Create and save a 2D texture array. The array of images must have at least 1 Image.
   * var texture_2d_array = Texture2DArray.new()
   * texture_2d_array.create_from_images(images)
   * ResourceSaver.save(texture_2d_array, "res://texture_2d_array.res", ResourceSaver.FLAG_COMPRESS)
   *
   * # Create and save a cubemap. The array of images must have exactly 6 Images.
   * # The cubemap's images are specified in this order: X+, X-, Y+, Y-, Z+, Z-
   * # (in Godot's coordinate system, so Y+ is "up" and Z- is "forward").
   * var cubemap = Cubemap.new()
   * cubemap.create_from_images(images)
   * ResourceSaver.save(cubemap, "res://cubemap.res", ResourceSaver.FLAG_COMPRESS)
   *
   * # Create and save a cubemap array. The array of images must have a multiple of 6 Images.
   * # Each cubemap's images are specified in this order: X+, X-, Y+, Y-, Z+, Z-
   * # (in Godot's coordinate system, so Y+ is "up" and Z- is "forward").
   * var cubemap_array = CubemapArray.new()
   * cubemap_array.create_from_images(images)
   * ResourceSaver.save(cubemap_array, "res://cubemap_array.res", ResourceSaver.FLAG_COMPRESS)
   * [/codeblock]
   */
  public final fun createFromImages(images: VariantArray<Image>): Error {
    TransferContext.writeArguments(ARRAY to images)
    TransferContext.callMethod(ptr, MethodBindings.createFromImagesPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Replaces the existing [Image] data at the given [layer] with this new image.
   * The given [Image] must have the same width, height, image format, and mipmapping flag as the
   * rest of the referenced images.
   * If the image format is unsupported, it will be decompressed and converted to a similar and
   * supported [Image.Format].
   * The update is immediate: it's synchronized with drawing.
   */
  public final fun updateLayer(image: Image?, layer: Int): Unit {
    TransferContext.writeArguments(OBJECT to image, LONG to layer.toLong())
    TransferContext.callMethod(ptr, MethodBindings.updateLayerPtr, NIL)
  }

  public companion object

  public object MethodBindings {
    internal val createFromImagesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImageTextureLayered", "create_from_images", 2785773503)

    internal val updateLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImageTextureLayered", "update_layer", 3331733361)
  }
}
