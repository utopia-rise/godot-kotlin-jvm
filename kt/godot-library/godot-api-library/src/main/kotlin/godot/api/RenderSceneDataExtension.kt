// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.core.Projection
import godot.core.RID
import godot.core.Transform3D
import godot.core.Vector3
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
    createNativeObject(564, scriptIndex)
  }

  /**
   * Implement this in GDExtension to return the camera [Transform3D].
   */
  public open fun _getCamTransform(): Transform3D {
    throw NotImplementedError("RenderSceneDataExtension::_getCamTransform is not implemented.")
  }

  /**
   * Implement this in GDExtension to return the camera [Projection].
   */
  public open fun _getCamProjection(): Projection {
    throw NotImplementedError("RenderSceneDataExtension::_getCamProjection is not implemented.")
  }

  /**
   * Implement this in GDExtension to return the view count.
   */
  public open fun _getViewCount(): Long {
    throw NotImplementedError("RenderSceneDataExtension::_getViewCount is not implemented.")
  }

  /**
   * Implement this in GDExtension to return the eye offset for the given [view].
   */
  public open fun _getViewEyeOffset(view: Long): Vector3 {
    throw NotImplementedError("RenderSceneDataExtension::_getViewEyeOffset is not implemented.")
  }

  /**
   * Implement this in GDExtension to return the view [Projection] for the given [view].
   */
  public open fun _getViewProjection(view: Long): Projection {
    throw NotImplementedError("RenderSceneDataExtension::_getViewProjection is not implemented.")
  }

  /**
   * Implement this in GDExtension to return the [RID] of the uniform buffer containing the scene
   * data as a UBO.
   */
  public open fun _getUniformBuffer(): RID {
    throw NotImplementedError("RenderSceneDataExtension::_getUniformBuffer is not implemented.")
  }

  public companion object

  public object MethodBindings
}
