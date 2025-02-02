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
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
  public final inline var magFilter: Int
    @JvmName("magFilterProperty")
    get() = getMagFilter()
    @JvmName("magFilterProperty")
    set(`value`) {
      setMagFilter(value)
    }

  /**
   * Texture's minification filter, used when the texture appears smaller on screen than the source
   * image.
   */
  public final inline var minFilter: Int
    @JvmName("minFilterProperty")
    get() = getMinFilter()
    @JvmName("minFilterProperty")
    set(`value`) {
      setMinFilter(value)
    }

  /**
   * Wrapping mode to use for S-axis (horizontal) texture coordinates.
   */
  public final inline var wrapS: Int
    @JvmName("wrapSProperty")
    get() = getWrapS()
    @JvmName("wrapSProperty")
    set(`value`) {
      setWrapS(value)
    }

  /**
   * Wrapping mode to use for T-axis (vertical) texture coordinates.
   */
  public final inline var wrapT: Int
    @JvmName("wrapTProperty")
    get() = getWrapT()
    @JvmName("wrapTProperty")
    set(`value`) {
      setWrapT(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(267, scriptIndex)
  }

  public final fun getMagFilter(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMagFilterPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setMagFilter(filterMode: Int): Unit {
    TransferContext.writeArguments(LONG to filterMode.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setMagFilterPtr, NIL)
  }

  public final fun getMinFilter(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMinFilterPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setMinFilter(filterMode: Int): Unit {
    TransferContext.writeArguments(LONG to filterMode.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setMinFilterPtr, NIL)
  }

  public final fun getWrapS(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getWrapSPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setWrapS(wrapMode: Int): Unit {
    TransferContext.writeArguments(LONG to wrapMode.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setWrapSPtr, NIL)
  }

  public final fun getWrapT(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getWrapTPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setWrapT(wrapMode: Int): Unit {
    TransferContext.writeArguments(LONG to wrapMode.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setWrapTPtr, NIL)
  }

  public companion object

  public object MethodBindings {
    internal val getMagFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFTextureSampler", "get_mag_filter", 3905245786)

    internal val setMagFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFTextureSampler", "set_mag_filter", 1286410249)

    internal val getMinFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFTextureSampler", "get_min_filter", 3905245786)

    internal val setMinFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFTextureSampler", "set_min_filter", 1286410249)

    internal val getWrapSPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFTextureSampler", "get_wrap_s", 3905245786)

    internal val setWrapSPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFTextureSampler", "set_wrap_s", 1286410249)

    internal val getWrapTPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFTextureSampler", "get_wrap_t", 3905245786)

    internal val setWrapTPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFTextureSampler", "set_wrap_t", 1286410249)
  }
}
