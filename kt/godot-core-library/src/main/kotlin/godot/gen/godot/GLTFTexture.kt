// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.MemoryManager
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
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
    MemoryManager.createNativeObject(ENGINECLASS_GLTFTEXTURE, this, scriptIndex)
  }

  public final fun getSrcImage(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSrcImagePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setSrcImage(srcImage: Int): Unit {
    TransferContext.writeArguments(LONG to srcImage.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setSrcImagePtr, NIL)
  }

  public final fun getSampler(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSamplerPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setSampler(sampler: Int): Unit {
    TransferContext.writeArguments(LONG to sampler.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setSamplerPtr, NIL)
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
