// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.core.RID
import godot.core.TypeManager
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser._RID
import godot.core.memory.TransferContext
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * Abstract render data object, exists for the duration of rendering a single viewport.
 * **Note:** This is an internal rendering server object, do not instantiate this from script.
 */
@GodotBaseType
public open class RenderData internal constructor() : Object() {
  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_RENDERDATA, scriptIndex)
  }

  /**
   * Returns the [RenderSceneBuffers] object managing the scene buffers for rendering this viewport.
   */
  public final fun getRenderSceneBuffers(): RenderSceneBuffers? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRenderSceneBuffersPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as RenderSceneBuffers?)
  }

  /**
   * Returns the [RenderSceneData] object managing this frames scene data.
   */
  public final fun getRenderSceneData(): RenderSceneData? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRenderSceneDataPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as RenderSceneData?)
  }

  /**
   * Returns the [RID] of the environments object in the [RenderingServer] being used to render this
   * viewport.
   */
  public final fun getEnvironment(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEnvironmentPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Returns the [RID] of the camera attributes object in the [RenderingServer] being used to render
   * this viewport.
   */
  public final fun getCameraAttributes(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCameraAttributesPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  public companion object

  internal object MethodBindings {
    public val getRenderSceneBuffersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderData", "get_render_scene_buffers", 2793216201)

    public val getRenderSceneDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderData", "get_render_scene_data", 1288715698)

    public val getEnvironmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderData", "get_environment", 2944877500)

    public val getCameraAttributesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderData", "get_camera_attributes", 2944877500)
  }
}
