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
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
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
    callConstructor(ENGINECLASS_IMAGETEXTURELAYERED, scriptIndex)
  }

  /**
   * Creates an [ImageTextureLayered] from an array of [Image]s. See [Image.create] for the expected
   * data format. The first image decides the width, height, image format and mipmapping setting. The
   * other images *must* have the same width, height, image format and mipmapping setting.
   * Each [Image] represents one `layer`.
   */
  public final fun createFromImages(images: VariantArray<Image>): Error {
    TransferContext.writeArguments(ARRAY to images)
    TransferContext.callMethod(rawPtr, MethodBindings.createFromImagesPtr, LONG)
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
    TransferContext.callMethod(rawPtr, MethodBindings.updateLayerPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val createFromImagesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImageTextureLayered", "create_from_images", 2785773503)

    public val updateLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImageTextureLayered", "update_layer", 3331733361)
  }
}
