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
import godot.core.Vector3
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 * This class allows for a RenderSceneData implementation to be made in GDExtension.
 */
@GodotBaseType
public open class RenderSceneDataExtension : RenderSceneData() {
  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_RENDERSCENEDATAEXTENSION, scriptIndex)
  }

  /**
   * Implement this in GDExtension to return the camera [Transform3D].
   */
  public open fun _getCamTransform(): Transform3D {
    throw NotImplementedError("_get_cam_transform is not implemented for RenderSceneDataExtension")
  }

  /**
   * Implement this in GDExtension to return the camera [Projection].
   */
  public open fun _getCamProjection(): Projection {
    throw NotImplementedError("_get_cam_projection is not implemented for RenderSceneDataExtension")
  }

  /**
   * Implement this in GDExtension to return the view count.
   */
  public open fun _getViewCount(): Long {
    throw NotImplementedError("_get_view_count is not implemented for RenderSceneDataExtension")
  }

  /**
   * Implement this in GDExtension to return the eye offset for the given [view].
   */
  public open fun _getViewEyeOffset(view: Long): Vector3 {
    throw NotImplementedError("_get_view_eye_offset is not implemented for RenderSceneDataExtension")
  }

  /**
   * Implement this in GDExtension to return the view [Projection] for the given [view].
   */
  public open fun _getViewProjection(view: Long): Projection {
    throw NotImplementedError("_get_view_projection is not implemented for RenderSceneDataExtension")
  }

  /**
   * Implement this in GDExtension to return the [RID] of the uniform buffer containing the scene
   * data as a UBO.
   */
  public open fun _getUniformBuffer(): RID {
    throw NotImplementedError("_get_uniform_buffer is not implemented for RenderSceneDataExtension")
  }

  public companion object

  internal object MethodBindings {
    public val _getCamTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneDataExtension", "_get_cam_transform")

    public val _getCamProjectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneDataExtension", "_get_cam_projection")

    public val _getViewCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneDataExtension", "_get_view_count")

    public val _getViewEyeOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneDataExtension", "_get_view_eye_offset")

    public val _getViewProjectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneDataExtension", "_get_view_projection")

    public val _getUniformBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneDataExtension", "_get_uniform_buffer")
  }
}
