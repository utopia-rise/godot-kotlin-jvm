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
import godot.core.VariantParser.LONG
import godot.core.VariantParser.PROJECTION
import godot.core.VariantParser.TRANSFORM3D
import godot.core.VariantParser.VECTOR3
import godot.core.VariantParser._RID
import godot.core.Vector3
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_RENDERSCENEDATA_INDEX: Int = 543

/**
 * Abstract scene data object, exists for the duration of rendering a single viewport.
 * **Note:** This is an internal rendering server object, do not instantiate this from script.
 */
@GodotBaseType
public open class RenderSceneData internal constructor() : Object() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_RENDERSCENEDATA_INDEX, scriptIndex)
  }

  /**
   * Returns the camera transform used to render this frame.
   * **Note:** If more than one view is rendered, this will return a centered transform.
   */
  public final fun getCamTransform(): Transform3D {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCamTransformPtr, TRANSFORM3D)
    return (Internals.readReturnValue(TRANSFORM3D) as Transform3D)
  }

  /**
   * Returns the camera projection used to render this frame.
   * **Note:** If more than one view is rendered, this will return a combined projection.
   */
  public final fun getCamProjection(): Projection {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCamProjectionPtr, PROJECTION)
    return (Internals.readReturnValue(PROJECTION) as Projection)
  }

  /**
   * Returns the number of views being rendered.
   */
  public final fun getViewCount(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getViewCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the eye offset per view used to render this frame. This is the offset between our
   * camera transform and the eye transform.
   */
  public final fun getViewEyeOffset(view: Long): Vector3 {
    Internals.writeArguments(LONG to view)
    Internals.callMethod(rawPtr, MethodBindings.getViewEyeOffsetPtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns the view projection per view used to render this frame.
   * **Note:** If a single view is rendered, this returns the camera projection. If more than one
   * view is rendered, this will return a projection for the given view including the eye offset.
   */
  public final fun getViewProjection(view: Long): Projection {
    Internals.writeArguments(LONG to view)
    Internals.callMethod(rawPtr, MethodBindings.getViewProjectionPtr, PROJECTION)
    return (Internals.readReturnValue(PROJECTION) as Projection)
  }

  /**
   * Return the [RID] of the uniform buffer containing the scene data as a UBO.
   */
  public final fun getUniformBuffer(): RID {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getUniformBufferPtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  public companion object

  public object MethodBindings {
    internal val getCamTransformPtr: VoidPtr =
        Internals.getMethodBindPtr("RenderSceneData", "get_cam_transform", 3229777777)

    internal val getCamProjectionPtr: VoidPtr =
        Internals.getMethodBindPtr("RenderSceneData", "get_cam_projection", 2910717950)

    internal val getViewCountPtr: VoidPtr =
        Internals.getMethodBindPtr("RenderSceneData", "get_view_count", 3905245786)

    internal val getViewEyeOffsetPtr: VoidPtr =
        Internals.getMethodBindPtr("RenderSceneData", "get_view_eye_offset", 711720468)

    internal val getViewProjectionPtr: VoidPtr =
        Internals.getMethodBindPtr("RenderSceneData", "get_view_projection", 3179846605)

    internal val getUniformBufferPtr: VoidPtr =
        Internals.getMethodBindPtr("RenderSceneData", "get_uniform_buffer", 2944877500)
  }
}
