// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Base class for texture types which contain the data of multiple [godot.ImageTexture]s. Each image is of the same size and format.
 *
 * Base class for [godot.Texture2DArray], [godot.Cubemap] and [godot.CubemapArray]. Cannot be used directly, but contains all the functions necessary for accessing the derived resource types. See also [godot.Texture3D].
 */
@GodotBaseType
public open class ImageTextureLayered internal constructor() : TextureLayered() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_IMAGETEXTURELAYERED, scriptIndex)
    return true
  }

  /**
   * Creates an [godot.ImageTextureLayered] from an array of [godot.Image]s. See [godot.Image.create] for the expected data format. The first image decides the width, height, image format and mipmapping setting. The other images *must* have the same width, height, image format and mipmapping setting.
   *
   * Each [godot.Image] represents one `layer`.
   */
  public fun createFromImages(images: VariantArray<Image>): GodotError {
    TransferContext.writeArguments(ARRAY to images)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_IMAGETEXTURELAYERED_CREATE_FROM_IMAGES, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Replaces the existing [godot.Image] data at the given [layer] with this new image.
   *
   * The given [godot.Image] must have the same width, height, image format, and mipmapping flag as the rest of the referenced images.
   *
   * If the image format is unsupported, it will be decompressed and converted to a similar and supported [enum Image.Format].
   *
   * The update is immediate: it's synchronized with drawing.
   */
  public fun updateLayer(image: Image, layer: Int): Unit {
    TransferContext.writeArguments(OBJECT to image, LONG to layer.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGETEXTURELAYERED_UPDATE_LAYER,
        NIL)
  }

  public companion object
}
