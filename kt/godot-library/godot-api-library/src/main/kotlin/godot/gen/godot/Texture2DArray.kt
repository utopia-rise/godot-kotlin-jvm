// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.OBJECT
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_TEXTURE2DARRAY_INDEX: Int = 649

/**
 * A Texture2DArray is different from a Texture3D: The Texture2DArray does not support trilinear
 * interpolation between the [Image]s, i.e. no blending. See also [Cubemap] and [CubemapArray], which
 * are texture arrays with specialized cubemap functions.
 * A Texture2DArray is also different from an [AtlasTexture]: In a Texture2DArray, all images are
 * treated separately. In an atlas, the regions (i.e. the single images) can be of different sizes.
 * Furthermore, you usually need to add a padding around the regions, to prevent accidental UV mapping
 * to more than one region. The same goes for mipmapping: Mipmap chains are handled separately for each
 * layer. In an atlas, the slicing has to be done manually in the fragment shader.
 * To create such a texture file yourself, reimport your image files using the Godot Editor import
 * presets.
 */
@GodotBaseType
public open class Texture2DArray : ImageTextureLayered() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_TEXTURE2DARRAY_INDEX, scriptIndex)
  }

  /**
   * Creates a placeholder version of this resource ([PlaceholderTexture2DArray]).
   */
  public final fun createPlaceholder(): Resource? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.createPlaceholderPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Resource?)
  }

  public companion object

  public object MethodBindings {
    internal val createPlaceholderPtr: VoidPtr =
        Internals.getMethodBindPtr("Texture2DArray", "create_placeholder", 121922552)
  }
}
