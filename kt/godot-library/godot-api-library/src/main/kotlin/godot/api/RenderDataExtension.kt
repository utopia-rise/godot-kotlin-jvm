// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.core.RID
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 * This class allows for a RenderData implementation to be made in GDExtension.
 */
@GodotBaseType
public open class RenderDataExtension : RenderData() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(537, scriptIndex)
  }

  /**
   * Implement this in GDExtension to return the implementation's [RenderSceneBuffers] object.
   */
  public open fun _getRenderSceneBuffers(): RenderSceneBuffers? {
    throw NotImplementedError("_get_render_scene_buffers is not implemented for RenderDataExtension")
  }

  /**
   * Implement this in GDExtension to return the implementation's [RenderSceneDataExtension] object.
   */
  public open fun _getRenderSceneData(): RenderSceneData? {
    throw NotImplementedError("_get_render_scene_data is not implemented for RenderDataExtension")
  }

  /**
   * Implement this in GDExtension to return the [RID] of the implementation's environment object.
   */
  public open fun _getEnvironment(): RID {
    throw NotImplementedError("_get_environment is not implemented for RenderDataExtension")
  }

  /**
   * Implement this in GDExtension to return the [RID] for the implementation's camera attributes
   * object.
   */
  public open fun _getCameraAttributes(): RID {
    throw NotImplementedError("_get_camera_attributes is not implemented for RenderDataExtension")
  }

  public companion object

  public object MethodBindings
}
