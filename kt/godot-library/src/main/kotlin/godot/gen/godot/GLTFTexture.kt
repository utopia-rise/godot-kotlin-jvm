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
import kotlin.jvm.JvmName

@GodotBaseType
public open class GLTFTexture : Resource() {
  /**
   * The index of the image associated with this texture, see [GLTFState.getImages]. If -1, then
   * this texture does not have an image assigned.
   */
  public final inline var srcImage: Int
    @JvmName("srcImageProperty")
    get() = getSrcImage()
    @JvmName("srcImageProperty")
    set(`value`) {
      setSrcImage(value)
    }

  /**
   * ID of the texture sampler to use when sampling the image. If -1, then the default texture
   * sampler is used (linear filtering, and repeat wrapping in both axes).
   */
  public final inline var sampler: Int
    @JvmName("samplerProperty")
    get() = getSampler()
    @JvmName("samplerProperty")
    set(`value`) {
      setSampler(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_GLTFTEXTURE, scriptIndex)
  }

  public final fun getSrcImage(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSrcImagePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public final fun setSrcImage(srcImage: Int): Unit {
    TransferContext.writeArguments(LONG to srcImage.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setSrcImagePtr, NIL)
  }

  public final fun getSampler(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSamplerPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public final fun setSampler(sampler: Int): Unit {
    TransferContext.writeArguments(LONG to sampler.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setSamplerPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val getSrcImagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFTexture", "get_src_image", 3905245786)

    public val setSrcImagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFTexture", "set_src_image", 1286410249)

    public val getSamplerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFTexture", "get_sampler", 3905245786)

    public val setSamplerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFTexture", "set_sampler", 1286410249)
  }
}
