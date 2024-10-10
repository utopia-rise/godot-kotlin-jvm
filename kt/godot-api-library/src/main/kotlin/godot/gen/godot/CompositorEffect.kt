// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_COMPOSITOREFFECT_INDEX: Int = 196

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
  public final inline var enabled: Boolean
    @JvmName("enabledProperty")
    get() = getEnabled()
    @JvmName("enabledProperty")
    set(`value`) {
      setEnabled(value)
    }

  /**
   * The type of effect that is implemented, determines at what stage of rendering the callback is
   * called.
   */
  public final inline var effectCallbackType: EffectCallbackType
    @JvmName("effectCallbackTypeProperty")
    get() = getEffectCallbackType()
    @JvmName("effectCallbackTypeProperty")
    set(`value`) {
      setEffectCallbackType(value)
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
  public final inline var accessResolvedColor: Boolean
    @JvmName("accessResolvedColorProperty")
    get() = getAccessResolvedColor()
    @JvmName("accessResolvedColorProperty")
    set(`value`) {
      setAccessResolvedColor(value)
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
  public final inline var accessResolvedDepth: Boolean
    @JvmName("accessResolvedDepthProperty")
    get() = getAccessResolvedDepth()
    @JvmName("accessResolvedDepthProperty")
    set(`value`) {
      setAccessResolvedDepth(value)
    }

  /**
   * If `true` this triggers motion vectors being calculated during the opaque render state.
   * **Note:** In [_renderCallback], to access the motion vector buffer use:
   * [codeblock]
   * var render_scene_buffers : RenderSceneBuffersRD = render_data.get_render_scene_buffers()
   * var motion_buffer = render_scene_buffers.get_velocity_texture()
   * [/codeblock]
   */
  public final inline var needsMotionVectors: Boolean
    @JvmName("needsMotionVectorsProperty")
    get() = getNeedsMotionVectors()
    @JvmName("needsMotionVectorsProperty")
    set(`value`) {
      setNeedsMotionVectors(value)
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
  public final inline var needsNormalRoughness: Boolean
    @JvmName("needsNormalRoughnessProperty")
    get() = getNeedsNormalRoughness()
    @JvmName("needsNormalRoughnessProperty")
    set(`value`) {
      setNeedsNormalRoughness(value)
    }

  /**
   * If `true` this triggers specular data being rendered to a separate buffer and combined after
   * effects have been applied, only applicable for the Forward+ renderer.
   */
  public final inline var needsSeparateSpecular: Boolean
    @JvmName("needsSeparateSpecularProperty")
    get() = getNeedsSeparateSpecular()
    @JvmName("needsSeparateSpecularProperty")
    set(`value`) {
      setNeedsSeparateSpecular(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_COMPOSITOREFFECT_INDEX, scriptIndex)
  }

  /**
   * Implement this function with your custom rendering code. [effectCallbackType] should always
   * match the effect callback type you've specified in [effectCallbackType]. [renderData] provides
   * access to the rendering state, it is only valid during rendering and should not be stored.
   */
  public open fun _renderCallback(effectCallbackType: Int, renderData: RenderData?): Unit {
  }

  public final fun setEnabled(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setEnabledPtr, NIL)
  }

  public final fun getEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setEffectCallbackType(effectCallbackType: EffectCallbackType): Unit {
    Internals.writeArguments(LONG to effectCallbackType.id)
    Internals.callMethod(rawPtr, MethodBindings.setEffectCallbackTypePtr, NIL)
  }

  public final fun getEffectCallbackType(): EffectCallbackType {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEffectCallbackTypePtr, LONG)
    return CompositorEffect.EffectCallbackType.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setAccessResolvedColor(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setAccessResolvedColorPtr, NIL)
  }

  public final fun getAccessResolvedColor(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAccessResolvedColorPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setAccessResolvedDepth(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setAccessResolvedDepthPtr, NIL)
  }

  public final fun getAccessResolvedDepth(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAccessResolvedDepthPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setNeedsMotionVectors(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setNeedsMotionVectorsPtr, NIL)
  }

  public final fun getNeedsMotionVectors(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getNeedsMotionVectorsPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setNeedsNormalRoughness(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setNeedsNormalRoughnessPtr, NIL)
  }

  public final fun getNeedsNormalRoughness(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getNeedsNormalRoughnessPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setNeedsSeparateSpecular(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setNeedsSeparateSpecularPtr, NIL)
  }

  public final fun getNeedsSeparateSpecular(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getNeedsSeparateSpecularPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
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
      public fun from(`value`: Long): EffectCallbackType = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("CompositorEffect", "set_enabled", 2586408642)

    public val getEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("CompositorEffect", "get_enabled", 36873697)

    public val setEffectCallbackTypePtr: VoidPtr =
        Internals.getMethodBindPtr("CompositorEffect", "set_effect_callback_type", 1390728419)

    public val getEffectCallbackTypePtr: VoidPtr =
        Internals.getMethodBindPtr("CompositorEffect", "get_effect_callback_type", 1221912590)

    public val setAccessResolvedColorPtr: VoidPtr =
        Internals.getMethodBindPtr("CompositorEffect", "set_access_resolved_color", 2586408642)

    public val getAccessResolvedColorPtr: VoidPtr =
        Internals.getMethodBindPtr("CompositorEffect", "get_access_resolved_color", 36873697)

    public val setAccessResolvedDepthPtr: VoidPtr =
        Internals.getMethodBindPtr("CompositorEffect", "set_access_resolved_depth", 2586408642)

    public val getAccessResolvedDepthPtr: VoidPtr =
        Internals.getMethodBindPtr("CompositorEffect", "get_access_resolved_depth", 36873697)

    public val setNeedsMotionVectorsPtr: VoidPtr =
        Internals.getMethodBindPtr("CompositorEffect", "set_needs_motion_vectors", 2586408642)

    public val getNeedsMotionVectorsPtr: VoidPtr =
        Internals.getMethodBindPtr("CompositorEffect", "get_needs_motion_vectors", 36873697)

    public val setNeedsNormalRoughnessPtr: VoidPtr =
        Internals.getMethodBindPtr("CompositorEffect", "set_needs_normal_roughness", 2586408642)

    public val getNeedsNormalRoughnessPtr: VoidPtr =
        Internals.getMethodBindPtr("CompositorEffect", "get_needs_normal_roughness", 36873697)

    public val setNeedsSeparateSpecularPtr: VoidPtr =
        Internals.getMethodBindPtr("CompositorEffect", "set_needs_separate_specular", 2586408642)

    public val getNeedsSeparateSpecularPtr: VoidPtr =
        Internals.getMethodBindPtr("CompositorEffect", "get_needs_separate_specular", 36873697)
  }
}
