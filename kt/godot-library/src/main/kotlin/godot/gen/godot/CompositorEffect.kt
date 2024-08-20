// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * This resource defines a custom rendering effect that can be applied to [Viewport]s through the
 * viewports' [Environment]. You can implement a callback that is called during rendering at a given
 * stage of the rendering pipeline and allows you to insert additional passes. Note that this callback
 * happens on the rendering thread. CompositorEffect is an abstract base class and must be extended to
 * implement specific rendering logic.
 */
@GodotBaseType
public open class CompositorEffect : Resource() {
  /**
   * If `true` this rendering effect is applied to any viewport it is added to.
   */
  public var enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEnabledPtr, NIL)
    }

  /**
   * The type of effect that is implemented, determines at what stage of rendering the callback is
   * called.
   */
  public var effectCallbackType: EffectCallbackType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEffectCallbackTypePtr, LONG)
      return CompositorEffect.EffectCallbackType.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setEffectCallbackTypePtr, NIL)
    }

  /**
   * If `true` and MSAA is enabled, this will trigger a color buffer resolve before the effect is
   * run.
   * **Note:** In [_renderCallback], to access the resolved buffer use:
   * [codeblock]
   * var render_scene_buffers : RenderSceneBuffersRD = render_data.get_render_scene_buffers()
   * var color_buffer = render_scene_buffers.get_texture("render_buffers", "color")
   * [/codeblock]
   */
  public var accessResolvedColor: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAccessResolvedColorPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAccessResolvedColorPtr, NIL)
    }

  /**
   * If `true` and MSAA is enabled, this will trigger a depth buffer resolve before the effect is
   * run.
   * **Note:** In [_renderCallback], to access the resolved buffer use:
   * [codeblock]
   * var render_scene_buffers : RenderSceneBuffersRD = render_data.get_render_scene_buffers()
   * var depth_buffer = render_scene_buffers.get_texture("render_buffers", "depth")
   * [/codeblock]
   */
  public var accessResolvedDepth: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAccessResolvedDepthPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAccessResolvedDepthPtr, NIL)
    }

  /**
   * If `true` this triggers motion vectors being calculated during the opaque render state.
   * **Note:** In [_renderCallback], to access the motion vector buffer use:
   * [codeblock]
   * var render_scene_buffers : RenderSceneBuffersRD = render_data.get_render_scene_buffers()
   * var motion_buffer = render_scene_buffers.get_velocity_texture()
   * [/codeblock]
   */
  public var needsMotionVectors: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getNeedsMotionVectorsPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setNeedsMotionVectorsPtr, NIL)
    }

  /**
   * If `true` this triggers normal and roughness data to be output during our depth pre-pass, only
   * applicable for the Forward+ renderer.
   * **Note:** In [_renderCallback], to access the roughness buffer use:
   * [codeblock]
   * var render_scene_buffers : RenderSceneBuffersRD = render_data.get_render_scene_buffers()
   * var roughness_buffer = render_scene_buffers.get_texture("forward_clustered",
   * "normal_roughness")
   * [/codeblock]
   */
  public var needsNormalRoughness: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getNeedsNormalRoughnessPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setNeedsNormalRoughnessPtr, NIL)
    }

  /**
   * If `true` this triggers specular data being rendered to a separate buffer and combined after
   * effects have been applied, only applicable for the Forward+ renderer.
   */
  public var needsSeparateSpecular: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getNeedsSeparateSpecularPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setNeedsSeparateSpecularPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_COMPOSITOREFFECT, scriptIndex)
    return true
  }

  /**
   * Implement this function with your custom rendering code. [effectCallbackType] should always
   * match the effect callback type you've specified in [effectCallbackType]. [renderData] provides
   * access to the rendering state, it is only valid during rendering and should not be stored.
   */
  public open fun _renderCallback(effectCallbackType: Int, renderData: RenderData): Unit {
  }

  public enum class EffectCallbackType(
    id: Long,
  ) {
    /**
     * The callback is called before our opaque rendering pass, but after depth prepass (if
     * applicable).
     */
    EFFECT_CALLBACK_TYPE_PRE_OPAQUE(0),
    /**
     * The callback is called after our opaque rendering pass, but before our sky is rendered.
     */
    EFFECT_CALLBACK_TYPE_POST_OPAQUE(1),
    /**
     * The callback is called after our sky is rendered, but before our back buffers are created
     * (and if enabled, before subsurface scattering and/or screen space reflections).
     */
    EFFECT_CALLBACK_TYPE_POST_SKY(2),
    /**
     * The callback is called before our transparent rendering pass, but after our sky is rendered
     * and we've created our back buffers.
     */
    EFFECT_CALLBACK_TYPE_PRE_TRANSPARENT(3),
    /**
     * The callback is called after our transparent rendering pass, but before any build in post
     * effects and output to our render target.
     */
    EFFECT_CALLBACK_TYPE_POST_TRANSPARENT(4),
    /**
     * Represents the size of the [EffectCallbackType] enum.
     */
    EFFECT_CALLBACK_TYPE_MAX(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val _renderCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CompositorEffect", "_render_callback")

    public val setEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CompositorEffect", "set_enabled")

    public val getEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CompositorEffect", "get_enabled")

    public val setEffectCallbackTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CompositorEffect", "set_effect_callback_type")

    public val getEffectCallbackTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CompositorEffect", "get_effect_callback_type")

    public val setAccessResolvedColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CompositorEffect", "set_access_resolved_color")

    public val getAccessResolvedColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CompositorEffect", "get_access_resolved_color")

    public val setAccessResolvedDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CompositorEffect", "set_access_resolved_depth")

    public val getAccessResolvedDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CompositorEffect", "get_access_resolved_depth")

    public val setNeedsMotionVectorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CompositorEffect", "set_needs_motion_vectors")

    public val getNeedsMotionVectorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CompositorEffect", "get_needs_motion_vectors")

    public val setNeedsNormalRoughnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CompositorEffect", "set_needs_normal_roughness")

    public val getNeedsNormalRoughnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CompositorEffect", "get_needs_normal_roughness")

    public val setNeedsSeparateSpecularPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CompositorEffect", "set_needs_separate_specular")

    public val getNeedsSeparateSpecularPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CompositorEffect", "get_needs_separate_specular")
  }
}
