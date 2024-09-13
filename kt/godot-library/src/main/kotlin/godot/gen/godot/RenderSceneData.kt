// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Projection
import godot.core.RID
import godot.core.Transform3D
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.PROJECTION
import godot.core.VariantType.TRANSFORM3D
import godot.core.VariantType.VECTOR3
import godot.core.VariantType._RID
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Abstract scene data object, exists for the duration of rendering a single viewport.
 * **Note:** This is an internal rendering server object, do not instantiate this from script.
 */
@GodotBaseType
public open class RenderSceneData internal constructor() : Object() {
  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_RENDERSCENEDATA, scriptIndex)
  }

  /**
   * Returns the camera transform used to render this frame.
   * **Note:** If more than one view is rendered, this will return a centered transform.
   */
  public final fun getCamTransform(): Transform3D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCamTransformPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D) as Transform3D)
  }

  /**
   * Returns the camera projection used to render this frame.
   * **Note:** If more than one view is rendered, this will return a combined projection.
   */
  public final fun getCamProjection(): Projection {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCamProjectionPtr, PROJECTION)
    return (TransferContext.readReturnValue(PROJECTION) as Projection)
  }

  /**
   * Returns the number of views being rendered.
   */
  public final fun getViewCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getViewCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the eye offset per view used to render this frame. This is the offset between our
   * camera transform and the eye transform.
   */
  public final fun getViewEyeOffset(view: Long): Vector3 {
    TransferContext.writeArguments(LONG to view)
    TransferContext.callMethod(rawPtr, MethodBindings.getViewEyeOffsetPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns the view projection per view used to render this frame.
   * **Note:** If a single view is rendered, this returns the camera projection. If more than one
   * view is rendered, this will return a projection for the given view including the eye offset.
   */
  public final fun getViewProjection(view: Long): Projection {
    TransferContext.writeArguments(LONG to view)
    TransferContext.callMethod(rawPtr, MethodBindings.getViewProjectionPtr, PROJECTION)
    return (TransferContext.readReturnValue(PROJECTION) as Projection)
  }

  /**
   * Return the [RID] of the uniform buffer containing the scene data as a UBO.
   */
  public final fun getUniformBuffer(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getUniformBufferPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  public companion object

  internal object MethodBindings {
    public val getCamTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneData", "get_cam_transform", 3229777777)

    public val getCamProjectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneData", "get_cam_projection", 2910717950)

    public val getViewCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneData", "get_view_count", 3905245786)

    public val getViewEyeOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneData", "get_view_eye_offset", 711720468)

    public val getViewProjectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneData", "get_view_projection", 3179846605)

    public val getUniformBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneData", "get_uniform_buffer", 2944877500)
  }
}
