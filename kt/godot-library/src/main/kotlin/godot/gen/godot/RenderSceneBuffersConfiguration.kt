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
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2I
import godot.core.VariantType._RID
import godot.core.Vector2i
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Configuration object used to setup a [godot.RenderSceneBuffers] object.
 *
 * This configuration object is created and populated by the render engine on a viewport change and used to (re)configure a [godot.RenderSceneBuffers] object.
 */
@GodotBaseType
public open class RenderSceneBuffersConfiguration : RefCounted() {
  /**
   * The render target associated with these buffer.
   */
  public var renderTarget: RID
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RENDERSCENEBUFFERSCONFIGURATION_GET_RENDER_TARGET, _RID)
      return (TransferContext.readReturnValue(_RID, false) as RID)
    }
    set(`value`) {
      TransferContext.writeArguments(_RID to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RENDERSCENEBUFFERSCONFIGURATION_SET_RENDER_TARGET, NIL)
    }

  /**
   * The size of the 3D render buffer used for rendering.
   */
  @CoreTypeLocalCopy
  public var internalSize: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RENDERSCENEBUFFERSCONFIGURATION_GET_INTERNAL_SIZE, VECTOR2I)
      return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RENDERSCENEBUFFERSCONFIGURATION_SET_INTERNAL_SIZE, NIL)
    }

  /**
   * The target (upscale) size if scaling is used.
   */
  @CoreTypeLocalCopy
  public var targetSize: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RENDERSCENEBUFFERSCONFIGURATION_GET_TARGET_SIZE, VECTOR2I)
      return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RENDERSCENEBUFFERSCONFIGURATION_SET_TARGET_SIZE, NIL)
    }

  /**
   * The number of views we're rendering.
   */
  public var viewCount: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RENDERSCENEBUFFERSCONFIGURATION_GET_VIEW_COUNT, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RENDERSCENEBUFFERSCONFIGURATION_SET_VIEW_COUNT, NIL)
    }

  /**
   * The requested scaling mode with which we upscale/downscale if [internalSize] and [targetSize] are not equal.
   */
  public var scaling3dMode: RenderingServer.ViewportScaling3DMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RENDERSCENEBUFFERSCONFIGURATION_GET_SCALING_3D_MODE, LONG)
      return RenderingServer.ViewportScaling3DMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RENDERSCENEBUFFERSCONFIGURATION_SET_SCALING_3D_MODE, NIL)
    }

  /**
   * The MSAA mode we're using for 3D rendering.
   */
  public var msaa3d: RenderingServer.ViewportMSAA
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RENDERSCENEBUFFERSCONFIGURATION_GET_MSAA_3D, LONG)
      return RenderingServer.ViewportMSAA.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RENDERSCENEBUFFERSCONFIGURATION_SET_MSAA_3D, NIL)
    }

  /**
   * The requested screen space AA applied in post processing.
   */
  public var screenSpaceAa: RenderingServer.ViewportScreenSpaceAA
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RENDERSCENEBUFFERSCONFIGURATION_GET_SCREEN_SPACE_AA, LONG)
      return RenderingServer.ViewportScreenSpaceAA.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RENDERSCENEBUFFERSCONFIGURATION_SET_SCREEN_SPACE_AA, NIL)
    }

  /**
   * FSR Sharpness applicable if FSR upscaling is used.
   */
  public var fsrSharpness: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RENDERSCENEBUFFERSCONFIGURATION_GET_FSR_SHARPNESS, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RENDERSCENEBUFFERSCONFIGURATION_SET_FSR_SHARPNESS, NIL)
    }

  /**
   * Bias applied to mipmaps.
   */
  public var textureMipmapBias: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RENDERSCENEBUFFERSCONFIGURATION_GET_TEXTURE_MIPMAP_BIAS, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RENDERSCENEBUFFERSCONFIGURATION_SET_TEXTURE_MIPMAP_BIAS, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RENDERSCENEBUFFERSCONFIGURATION, scriptIndex)
    return true
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
}
