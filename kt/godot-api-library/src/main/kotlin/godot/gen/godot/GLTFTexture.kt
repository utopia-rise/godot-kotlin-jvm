// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_GLTFTEXTURE_INDEX: Int = 266

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
    Internals.callConstructor(this, ENGINE_CLASS_GLTFTEXTURE_INDEX, scriptIndex)
  }

  public final fun getSrcImage(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSrcImagePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setSrcImage(srcImage: Int): Unit {
    Internals.writeArguments(LONG to srcImage.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setSrcImagePtr, NIL)
  }

  public final fun getSampler(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSamplerPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setSampler(sampler: Int): Unit {
    Internals.writeArguments(LONG to sampler.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setSamplerPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val getSrcImagePtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFTexture", "get_src_image", 3905245786)

    public val setSrcImagePtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFTexture", "set_src_image", 1286410249)

    public val getSamplerPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFTexture", "get_sampler", 3905245786)

    public val setSamplerPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFTexture", "set_sampler", 1286410249)
  }
}
