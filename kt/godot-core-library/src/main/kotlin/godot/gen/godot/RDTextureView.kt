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

/**
 * This object is used by [RenderingDevice].
 */
@GodotBaseType
public open class RDTextureView : RefCounted() {
  /**
   * Optional override for the data format to return sampled values in. The default value of
   * [RenderingDevice.DATA_FORMAT_MAX] does not override the format.
   */
  public final inline var formatOverride: RenderingDevice.DataFormat
    @JvmName("formatOverrideProperty")
    get() = getFormatOverride()
    @JvmName("formatOverrideProperty")
    set(`value`) {
      setFormatOverride(value)
    }

  /**
   * The channel to sample when sampling the red color channel.
   */
  public final inline var swizzleR: RenderingDevice.TextureSwizzle
    @JvmName("swizzleRProperty")
    get() = getSwizzleR()
    @JvmName("swizzleRProperty")
    set(`value`) {
      setSwizzleR(value)
    }

  /**
   * The channel to sample when sampling the green color channel.
   */
  public final inline var swizzleG: RenderingDevice.TextureSwizzle
    @JvmName("swizzleGProperty")
    get() = getSwizzleG()
    @JvmName("swizzleGProperty")
    set(`value`) {
      setSwizzleG(value)
    }

  /**
   * The channel to sample when sampling the blue color channel.
   */
  public final inline var swizzleB: RenderingDevice.TextureSwizzle
    @JvmName("swizzleBProperty")
    get() = getSwizzleB()
    @JvmName("swizzleBProperty")
    set(`value`) {
      setSwizzleB(value)
    }

  /**
   * The channel to sample when sampling the alpha channel.
   */
  public final inline var swizzleA: RenderingDevice.TextureSwizzle
    @JvmName("swizzleAProperty")
    get() = getSwizzleA()
    @JvmName("swizzleAProperty")
    set(`value`) {
      setSwizzleA(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    MemoryManager.createNativeObject(ENGINECLASS_RDTEXTUREVIEW, this, scriptIndex)
  }

  public final fun setFormatOverride(pMember: RenderingDevice.DataFormat): Unit {
    TransferContext.writeArguments(LONG to pMember.id)
    TransferContext.callMethod(ptr, MethodBindings.setFormatOverridePtr, NIL)
  }

  public final fun getFormatOverride(): RenderingDevice.DataFormat {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFormatOverridePtr, LONG)
    return RenderingDevice.DataFormat.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setSwizzleR(pMember: RenderingDevice.TextureSwizzle): Unit {
    TransferContext.writeArguments(LONG to pMember.id)
    TransferContext.callMethod(ptr, MethodBindings.setSwizzleRPtr, NIL)
  }

  public final fun getSwizzleR(): RenderingDevice.TextureSwizzle {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSwizzleRPtr, LONG)
    return RenderingDevice.TextureSwizzle.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setSwizzleG(pMember: RenderingDevice.TextureSwizzle): Unit {
    TransferContext.writeArguments(LONG to pMember.id)
    TransferContext.callMethod(ptr, MethodBindings.setSwizzleGPtr, NIL)
  }

  public final fun getSwizzleG(): RenderingDevice.TextureSwizzle {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSwizzleGPtr, LONG)
    return RenderingDevice.TextureSwizzle.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setSwizzleB(pMember: RenderingDevice.TextureSwizzle): Unit {
    TransferContext.writeArguments(LONG to pMember.id)
    TransferContext.callMethod(ptr, MethodBindings.setSwizzleBPtr, NIL)
  }

  public final fun getSwizzleB(): RenderingDevice.TextureSwizzle {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSwizzleBPtr, LONG)
    return RenderingDevice.TextureSwizzle.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setSwizzleA(pMember: RenderingDevice.TextureSwizzle): Unit {
    TransferContext.writeArguments(LONG to pMember.id)
    TransferContext.callMethod(ptr, MethodBindings.setSwizzleAPtr, NIL)
  }

  public final fun getSwizzleA(): RenderingDevice.TextureSwizzle {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSwizzleAPtr, LONG)
    return RenderingDevice.TextureSwizzle.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public companion object

  internal object MethodBindings {
    public val setFormatOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureView", "set_format_override", 565531219)

    public val getFormatOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureView", "get_format_override", 2235804183)

    public val setSwizzleRPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureView", "set_swizzle_r", 3833362581)

    public val getSwizzleRPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureView", "get_swizzle_r", 4150792614)

    public val setSwizzleGPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureView", "set_swizzle_g", 3833362581)

    public val getSwizzleGPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureView", "get_swizzle_g", 4150792614)

    public val setSwizzleBPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureView", "set_swizzle_b", 3833362581)

    public val getSwizzleBPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureView", "get_swizzle_b", 4150792614)

    public val setSwizzleAPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureView", "set_swizzle_a", 3833362581)

    public val getSwizzleAPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDTextureView", "get_swizzle_a", 4150792614)
  }
}
