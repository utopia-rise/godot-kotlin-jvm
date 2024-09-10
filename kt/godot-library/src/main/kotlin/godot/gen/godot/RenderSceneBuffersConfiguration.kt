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
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2I
import godot.core.VariantType._RID
import godot.core.Vector2i
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * This configuration object is created and populated by the render engine on a viewport change and
 * used to (re)configure a [RenderSceneBuffers] object.
 */
@GodotBaseType
public open class RenderSceneBuffersConfiguration : RefCounted() {
  /**
   * The render target associated with these buffer.
   */
  public var renderTarget: RID
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRenderTargetPtr, _RID)
      return (TransferContext.readReturnValue(_RID, false) as RID)
    }
    set(`value`) {
      TransferContext.writeArguments(_RID to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRenderTargetPtr, NIL)
    }

  /**
   * The size of the 3D render buffer used for rendering.
   */
  @CoreTypeLocalCopy
  public var internalSize: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getInternalSizePtr, VECTOR2I)
      return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setInternalSizePtr, NIL)
    }

  /**
   * The target (upscale) size if scaling is used.
   */
  @CoreTypeLocalCopy
  public var targetSize: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTargetSizePtr, VECTOR2I)
      return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTargetSizePtr, NIL)
    }

  /**
   * The number of views we're rendering.
   */
  public var viewCount: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getViewCountPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setViewCountPtr, NIL)
    }

  /**
   * The requested scaling mode with which we upscale/downscale if [internalSize] and [targetSize]
   * are not equal.
   */
  public var scaling3dMode: RenderingServer.ViewportScaling3DMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getScaling3dModePtr, LONG)
      return RenderingServer.ViewportScaling3DMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setScaling3dModePtr, NIL)
    }

  /**
   * The MSAA mode we're using for 3D rendering.
   */
  public var msaa3d: RenderingServer.ViewportMSAA
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMsaa3dPtr, LONG)
      return RenderingServer.ViewportMSAA.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setMsaa3dPtr, NIL)
    }

  /**
   * The requested screen space AA applied in post processing.
   */
  public var screenSpaceAa: RenderingServer.ViewportScreenSpaceAA
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getScreenSpaceAaPtr, LONG)
      return RenderingServer.ViewportScreenSpaceAA.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setScreenSpaceAaPtr, NIL)
    }

  /**
   * FSR Sharpness applicable if FSR upscaling is used.
   */
  public var fsrSharpness: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFsrSharpnessPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFsrSharpnessPtr, NIL)
    }

  /**
   * Bias applied to mipmaps.
   */
  public var textureMipmapBias: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextureMipmapBiasPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTextureMipmapBiasPtr, NIL)
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
  public open fun internalSizeMutate(block: Vector2i.() -> Unit): Vector2i = internalSize.apply{
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
  public open fun targetSizeMutate(block: Vector2i.() -> Unit): Vector2i = targetSize.apply{
      block(this)
      targetSize = this
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
