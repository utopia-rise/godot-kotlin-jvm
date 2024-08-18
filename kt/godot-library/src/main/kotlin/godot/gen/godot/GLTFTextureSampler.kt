// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Represents a texture sampler as defined by the base GLTF spec. Texture samplers in GLTF specify
 * how to sample data from the texture's base image, when rendering the texture on an object.
 */
@GodotBaseType
public open class GLTFTextureSampler : Resource() {
  /**
   * Texture's magnification filter, used when texture appears larger on screen than the source
   * image.
   */
  public var magFilter: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMagFilterPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setMagFilterPtr, NIL)
    }

  /**
   * Texture's minification filter, used when the texture appears smaller on screen than the source
   * image.
   */
  public var minFilter: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMinFilterPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setMinFilterPtr, NIL)
    }

  /**
   * Wrapping mode to use for S-axis (horizontal) texture coordinates.
   */
  public var wrapS: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getWrapSPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setWrapSPtr, NIL)
    }

  /**
   * Wrapping mode to use for T-axis (vertical) texture coordinates.
   */
  public var wrapT: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getWrapTPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setWrapTPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_GLTFTEXTURESAMPLER, scriptIndex)
  }

  public companion object

  internal object MethodBindings {
    public val getMagFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFTextureSampler", "get_mag_filter")

    public val setMagFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFTextureSampler", "set_mag_filter")

    public val getMinFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFTextureSampler", "get_min_filter")

    public val setMinFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFTextureSampler", "set_min_filter")

    public val getWrapSPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFTextureSampler", "get_wrap_s")

    public val setWrapSPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFTextureSampler", "set_wrap_s")

    public val getWrapTPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFTextureSampler", "get_wrap_t")

    public val setWrapTPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFTextureSampler", "set_wrap_t")
  }
}
