// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser._RID
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_RENDERDATA_INDEX: Int = 536

/**
 * Abstract render data object, exists for the duration of rendering a single viewport.
 * **Note:** This is an internal rendering server object, do not instantiate this from script.
 */
@GodotBaseType
public open class RenderData internal constructor() : Object() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_RENDERDATA_INDEX, scriptIndex)
  }

  /**
   * Returns the [RenderSceneBuffers] object managing the scene buffers for rendering this viewport.
   */
  public final fun getRenderSceneBuffers(): RenderSceneBuffers? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRenderSceneBuffersPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as RenderSceneBuffers?)
  }

  /**
   * Returns the [RenderSceneData] object managing this frames scene data.
   */
  public final fun getRenderSceneData(): RenderSceneData? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRenderSceneDataPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as RenderSceneData?)
  }

  /**
   * Returns the [RID] of the environments object in the [RenderingServer] being used to render this
   * viewport.
   */
  public final fun getEnvironment(): RID {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEnvironmentPtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  /**
   * Returns the [RID] of the camera attributes object in the [RenderingServer] being used to render
   * this viewport.
   */
  public final fun getCameraAttributes(): RID {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCameraAttributesPtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  public companion object

  internal object MethodBindings {
    public val getRenderSceneBuffersPtr: VoidPtr =
        Internals.getMethodBindPtr("RenderData", "get_render_scene_buffers", 2793216201)

    public val getRenderSceneDataPtr: VoidPtr =
        Internals.getMethodBindPtr("RenderData", "get_render_scene_data", 1288715698)

    public val getEnvironmentPtr: VoidPtr =
        Internals.getMethodBindPtr("RenderData", "get_environment", 2944877500)

    public val getCameraAttributesPtr: VoidPtr =
        Internals.getMethodBindPtr("RenderData", "get_camera_attributes", 2944877500)
  }
}
