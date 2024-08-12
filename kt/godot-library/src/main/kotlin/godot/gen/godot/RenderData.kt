// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.TypeManager
import godot.core.VariantType.OBJECT
import godot.core.VariantType._RID
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * Abstract render data object, exists for the duration of rendering a single viewport.
 * **Note:** This is an internal rendering server object, do not instantiate this from script.
 */
@GodotBaseType
public open class RenderData internal constructor() : Object() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RENDERDATA, scriptIndex)
    return true
  }

  /**
   * Returns the [RenderSceneBuffers] object managing the scene buffers for rendering this viewport.
   */
  public fun getRenderSceneBuffers(): RenderSceneBuffers? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRenderSceneBuffersPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as RenderSceneBuffers?)
  }

  /**
   * Returns the [RenderSceneData] object managing this frames scene data.
   */
  public fun getRenderSceneData(): RenderSceneData? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRenderSceneDataPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as RenderSceneData?)
  }

  /**
   * Returns the [RID] of the environments object in the [RenderingServer] being used to render this
   * viewport.
   */
  public fun getEnvironment(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getEnvironmentPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns the [RID] of the camera attributes object in the [RenderingServer] being used to render
   * this viewport.
   */
  public fun getCameraAttributes(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCameraAttributesPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public companion object

  internal object MethodBindings {
    public val getRenderSceneBuffersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderData", "get_render_scene_buffers")

    public val getRenderSceneDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderData", "get_render_scene_data")

    public val getEnvironmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderData", "get_environment")

    public val getCameraAttributesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderData", "get_camera_attributes")
  }
}
