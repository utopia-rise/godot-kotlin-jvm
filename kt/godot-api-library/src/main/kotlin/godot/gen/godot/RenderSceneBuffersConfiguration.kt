// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.TypeManager
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.VECTOR2I
import godot.core.VariantParser._RID
import godot.core.Vector2i
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * This configuration object is created and populated by the render engine on a viewport change and
 * used to (re)configure a [RenderSceneBuffers] object.
 */
@GodotBaseType
public open class RenderSceneBuffersConfiguration : RefCounted() {
  /**
   * The render target associated with these buffer.
   */
  public final inline var renderTarget: RID
    @JvmName("renderTargetProperty")
    get() = getRenderTarget()
    @JvmName("renderTargetProperty")
    set(`value`) {
      setRenderTarget(value)
    }

  /**
   * The size of the 3D render buffer used for rendering.
   */
  @CoreTypeLocalCopy
  public final inline var internalSize: Vector2i
    @JvmName("internalSizeProperty")
    get() = getInternalSize()
    @JvmName("internalSizeProperty")
    set(`value`) {
      setInternalSize(value)
    }

  /**
   * The target (upscale) size if scaling is used.
   */
  @CoreTypeLocalCopy
  public final inline var targetSize: Vector2i
    @JvmName("targetSizeProperty")
    get() = getTargetSize()
    @JvmName("targetSizeProperty")
    set(`value`) {
      setTargetSize(value)
    }

  /**
   * The number of views we're rendering.
   */
  public final inline var viewCount: Long
    @JvmName("viewCountProperty")
    get() = getViewCount()
    @JvmName("viewCountProperty")
    set(`value`) {
      setViewCount(value)
    }

  /**
   * The requested scaling mode with which we upscale/downscale if [internalSize] and [targetSize]
   * are not equal.
   */
  public final inline var scaling3dMode: RenderingServer.ViewportScaling3DMode
    @JvmName("scaling3dModeProperty")
    get() = getScaling3dMode()
    @JvmName("scaling3dModeProperty")
    set(`value`) {
      setScaling3dMode(value)
    }

  /**
   * The MSAA mode we're using for 3D rendering.
   */
  public final inline var msaa3d: RenderingServer.ViewportMSAA
    @JvmName("msaa3dProperty")
    get() = getMsaa3d()
    @JvmName("msaa3dProperty")
    set(`value`) {
      setMsaa3d(value)
    }

  /**
   * The requested screen space AA applied in post processing.
   */
  public final inline var screenSpaceAa: RenderingServer.ViewportScreenSpaceAA
    @JvmName("screenSpaceAaProperty")
    get() = getScreenSpaceAa()
    @JvmName("screenSpaceAaProperty")
    set(`value`) {
      setScreenSpaceAa(value)
    }

  /**
   * FSR Sharpness applicable if FSR upscaling is used.
   */
  public final inline var fsrSharpness: Float
    @JvmName("fsrSharpnessProperty")
    get() = getFsrSharpness()
    @JvmName("fsrSharpnessProperty")
    set(`value`) {
      setFsrSharpness(value)
    }

  /**
   * Bias applied to mipmaps.
   */
  public final inline var textureMipmapBias: Float
    @JvmName("textureMipmapBiasProperty")
    get() = getTextureMipmapBias()
    @JvmName("textureMipmapBiasProperty")
    set(`value`) {
      setTextureMipmapBias(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_RENDERSCENEBUFFERSCONFIGURATION, scriptIndex)
  }

  /**
   * The size of the 3D render buffer used for rendering.
   *
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = renderscenebuffersconfiguration.internalSize
   * //Your changes
   * renderscenebuffersconfiguration.internalSize = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun internalSizeMutate(block: Vector2i.() -> Unit): Vector2i = internalSize.apply{
      block(this)
      internalSize = this
  }


  /**
   * The target (upscale) size if scaling is used.
   *
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = renderscenebuffersconfiguration.targetSize
   * //Your changes
   * renderscenebuffersconfiguration.targetSize = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun targetSizeMutate(block: Vector2i.() -> Unit): Vector2i = targetSize.apply{
      block(this)
      targetSize = this
  }


  public final fun getRenderTarget(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRenderTargetPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  public final fun setRenderTarget(renderTarget: RID): Unit {
    TransferContext.writeArguments(_RID to renderTarget)
    TransferContext.callMethod(rawPtr, MethodBindings.setRenderTargetPtr, NIL)
  }

  public final fun getInternalSize(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getInternalSizePtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  public final fun setInternalSize(internalSize: Vector2i): Unit {
    TransferContext.writeArguments(VECTOR2I to internalSize)
    TransferContext.callMethod(rawPtr, MethodBindings.setInternalSizePtr, NIL)
  }

  public final fun getTargetSize(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTargetSizePtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  public final fun setTargetSize(targetSize: Vector2i): Unit {
    TransferContext.writeArguments(VECTOR2I to targetSize)
    TransferContext.callMethod(rawPtr, MethodBindings.setTargetSizePtr, NIL)
  }

  public final fun getViewCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getViewCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setViewCount(viewCount: Long): Unit {
    TransferContext.writeArguments(LONG to viewCount)
    TransferContext.callMethod(rawPtr, MethodBindings.setViewCountPtr, NIL)
  }

  public final fun getScaling3dMode(): RenderingServer.ViewportScaling3DMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getScaling3dModePtr, LONG)
    return RenderingServer.ViewportScaling3DMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setScaling3dMode(scaling3dMode: RenderingServer.ViewportScaling3DMode): Unit {
    TransferContext.writeArguments(LONG to scaling3dMode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setScaling3dModePtr, NIL)
  }

  public final fun getMsaa3d(): RenderingServer.ViewportMSAA {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMsaa3dPtr, LONG)
    return RenderingServer.ViewportMSAA.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setMsaa3d(msaa3d: RenderingServer.ViewportMSAA): Unit {
    TransferContext.writeArguments(LONG to msaa3d.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setMsaa3dPtr, NIL)
  }

  public final fun getScreenSpaceAa(): RenderingServer.ViewportScreenSpaceAA {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getScreenSpaceAaPtr, LONG)
    return RenderingServer.ViewportScreenSpaceAA.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setScreenSpaceAa(screenSpaceAa: RenderingServer.ViewportScreenSpaceAA): Unit {
    TransferContext.writeArguments(LONG to screenSpaceAa.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setScreenSpaceAaPtr, NIL)
  }

  public final fun getFsrSharpness(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFsrSharpnessPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setFsrSharpness(fsrSharpness: Float): Unit {
    TransferContext.writeArguments(DOUBLE to fsrSharpness.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setFsrSharpnessPtr, NIL)
  }

  public final fun getTextureMipmapBias(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTextureMipmapBiasPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setTextureMipmapBias(textureMipmapBias: Float): Unit {
    TransferContext.writeArguments(DOUBLE to textureMipmapBias.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setTextureMipmapBiasPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val getRenderTargetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneBuffersConfiguration", "get_render_target", 2944877500)

    public val setRenderTargetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneBuffersConfiguration", "set_render_target", 2722037293)

    public val getInternalSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneBuffersConfiguration", "get_internal_size", 3690982128)

    public val setInternalSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneBuffersConfiguration", "set_internal_size", 1130785943)

    public val getTargetSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneBuffersConfiguration", "get_target_size", 3690982128)

    public val setTargetSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneBuffersConfiguration", "set_target_size", 1130785943)

    public val getViewCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneBuffersConfiguration", "get_view_count", 3905245786)

    public val setViewCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneBuffersConfiguration", "set_view_count", 1286410249)

    public val getScaling3dModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneBuffersConfiguration", "get_scaling_3d_mode", 976778074)

    public val setScaling3dModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneBuffersConfiguration", "set_scaling_3d_mode", 447477857)

    public val getMsaa3dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneBuffersConfiguration", "get_msaa_3d", 3109158617)

    public val setMsaa3dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneBuffersConfiguration", "set_msaa_3d", 3952630748)

    public val getScreenSpaceAaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneBuffersConfiguration", "get_screen_space_aa", 641513172)

    public val setScreenSpaceAaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneBuffersConfiguration", "set_screen_space_aa", 139543108)

    public val getFsrSharpnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneBuffersConfiguration", "get_fsr_sharpness", 1740695150)

    public val setFsrSharpnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneBuffersConfiguration", "set_fsr_sharpness", 373806689)

    public val getTextureMipmapBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneBuffersConfiguration", "get_texture_mipmap_bias", 1740695150)

    public val setTextureMipmapBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneBuffersConfiguration", "set_texture_mipmap_bias", 373806689)
  }
}
