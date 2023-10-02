// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.AABB
import godot.core.StringName
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Base node for geometry-based visual instances.
 *
 * Base node for geometry-based visual instances. Shares some common functionality like visibility and custom materials.
 */
@GodotBaseType
public open class GeometryInstance3D : VisualInstance3D() {
  /**
   * The material override for the whole geometry.
   *
   * If a material is assigned to this property, it will be used instead of any material set in any material slot of the mesh.
   */
  public var materialOverride: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE3D_GET_MATERIAL_OVERRIDE, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Material?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE3D_SET_MATERIAL_OVERRIDE, NIL)
    }

  /**
   * The material overlay for the whole geometry.
   *
   * If a material is assigned to this property, it will be rendered on top of any other active material for all the surfaces.
   */
  public var materialOverlay: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE3D_GET_MATERIAL_OVERLAY, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Material?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE3D_SET_MATERIAL_OVERLAY, NIL)
    }

  /**
   * The transparency applied to the whole geometry (as a multiplier of the materials' existing transparency). `0.0` is fully opaque, while `1.0` is fully transparent. Values greater than `0.0` (exclusive) will force the geometry's materials to go through the transparent pipeline, which is slower to render and can exhibit rendering issues due to incorrect transparency sorting. However, unlike using a transparent material, setting [transparency] to a value greater than `0.0` (exclusive) will *not* disable shadow rendering.
   *
   * In spatial shaders, `1.0 - transparency` is set as the default value of the `ALPHA` built-in.
   *
   * **Note:** [transparency] is clamped between `0.0` and `1.0`, so this property cannot be used to make transparent materials more opaque than they originally are.
   */
  public var transparency: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE3D_GET_TRANSPARENCY, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE3D_SET_TRANSPARENCY, NIL)
    }

  /**
   * The selected shadow casting flag. See [enum ShadowCastingSetting] for possible values.
   */
  public var castShadow: ShadowCastingSetting
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE3D_GET_CAST_SHADOWS_SETTING, LONG)
      return GeometryInstance3D.ShadowCastingSetting.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE3D_SET_CAST_SHADOWS_SETTING, NIL)
    }

  /**
   * The extra distance added to the GeometryInstance3D's bounding box ([AABB]) to increase its cull box.
   */
  public var extraCullMargin: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE3D_GET_EXTRA_CULL_MARGIN, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE3D_SET_EXTRA_CULL_MARGIN, NIL)
    }

  /**
   * Overrides the bounding box of this node with a custom one. This can be used to avoid the expensive [AABB] recalculation that happens when a skeleton is used with a [godot.MeshInstance3D] or to have fine control over the [godot.MeshInstance3D]'s bounding box. To use the default AABB, set value to an [AABB] with all fields set to `0.0`. To avoid frustum culling, set [customAabb] to a very large AABB that covers your entire game world such as `AABB(-10000, -10000, -10000, 20000, 20000, 20000)`. To disable all forms of culling (including occlusion culling), call [godot.RenderingServer.instanceSetIgnoreCulling] on the [godot.GeometryInstance3D]'s [RID].
   */
  public var customAabb: AABB
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE3D_GET_CUSTOM_AABB, godot.core.VariantType.AABB)
      return (TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB)
    }
    set(`value`) {
      TransferContext.writeArguments(godot.core.VariantType.AABB to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE3D_SET_CUSTOM_AABB, NIL)
    }

  /**
   * Changes how quickly the mesh transitions to a lower level of detail. A value of 0 will force the mesh to its lowest level of detail, a value of 1 will use the default settings, and larger values will keep the mesh in a higher level of detail at farther distances.
   *
   * Useful for testing level of detail transitions in the editor.
   */
  public var lodBias: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE3D_GET_LOD_BIAS,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE3D_SET_LOD_BIAS,
          NIL)
    }

  /**
   * If `true`, disables occlusion culling for this instance. Useful for gizmos that must be rendered even when occlusion culling is in use.
   *
   * **Note:** [ignoreOcclusionCulling] does not affect frustum culling (which is what happens when an object is not visible given the camera's angle). To avoid frustum culling, set [customAabb] to a very large AABB that covers your entire game world such as `AABB(-10000, -10000, -10000, 20000, 20000, 20000)`.
   */
  public var ignoreOcclusionCulling: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE3D_IS_IGNORING_OCCLUSION_CULLING, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE3D_SET_IGNORE_OCCLUSION_CULLING, NIL)
    }

  /**
   * The global illumination mode to use for the whole geometry. To avoid inconsistent results, use a mode that matches the purpose of the mesh during gameplay (static/dynamic).
   *
   * **Note:** Lights' bake mode will also affect the global illumination rendering. See [godot.Light3D.lightBakeMode].
   */
  public var giMode: GIMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE3D_GET_GI_MODE,
          LONG)
      return GeometryInstance3D.GIMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE3D_SET_GI_MODE,
          NIL)
    }

  /**
   * The texel density to use for lightmapping in [godot.LightmapGI]. Greater scale values provide higher resolution in the lightmap, which can result in sharper shadows for lights that have both direct and indirect light baked. However, greater scale values will also increase the space taken by the mesh in the lightmap texture, which increases the memory, storage, and bake time requirements. When using a single mesh at different scales, consider adjusting this value to keep the lightmap texel density consistent across meshes.
   */
  public var giLightmapScale: LightmapScale
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE3D_GET_LIGHTMAP_SCALE, LONG)
      return GeometryInstance3D.LightmapScale.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE3D_SET_LIGHTMAP_SCALE, NIL)
    }

  /**
   * Starting distance from which the GeometryInstance3D will be visible, taking [visibilityRangeBeginMargin] into account as well. The default value of 0 is used to disable the range check.
   */
  public var visibilityRangeBegin: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE3D_GET_VISIBILITY_RANGE_BEGIN, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE3D_SET_VISIBILITY_RANGE_BEGIN, NIL)
    }

  /**
   * Margin for the [visibilityRangeBegin] threshold. The GeometryInstance3D will only change its visibility state when it goes over or under the [visibilityRangeBegin] threshold by this amount.
   *
   * If [visibilityRangeFadeMode] is [VISIBILITY_RANGE_FADE_DISABLED], this acts as a hysteresis distance. If [visibilityRangeFadeMode] is [VISIBILITY_RANGE_FADE_SELF] or [VISIBILITY_RANGE_FADE_DEPENDENCIES], this acts as a fade transition distance and must be set to a value greater than `0.0` for the effect to be noticeable.
   */
  public var visibilityRangeBeginMargin: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE3D_GET_VISIBILITY_RANGE_BEGIN_MARGIN, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE3D_SET_VISIBILITY_RANGE_BEGIN_MARGIN, NIL)
    }

  /**
   * Distance from which the GeometryInstance3D will be hidden, taking [visibilityRangeEndMargin] into account as well. The default value of 0 is used to disable the range check.
   */
  public var visibilityRangeEnd: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE3D_GET_VISIBILITY_RANGE_END, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE3D_SET_VISIBILITY_RANGE_END, NIL)
    }

  /**
   * Margin for the [visibilityRangeEnd] threshold. The GeometryInstance3D will only change its visibility state when it goes over or under the [visibilityRangeEnd] threshold by this amount.
   *
   * If [visibilityRangeFadeMode] is [VISIBILITY_RANGE_FADE_DISABLED], this acts as a hysteresis distance. If [visibilityRangeFadeMode] is [VISIBILITY_RANGE_FADE_SELF] or [VISIBILITY_RANGE_FADE_DEPENDENCIES], this acts as a fade transition distance and must be set to a value greater than `0.0` for the effect to be noticeable.
   */
  public var visibilityRangeEndMargin: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE3D_GET_VISIBILITY_RANGE_END_MARGIN, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE3D_SET_VISIBILITY_RANGE_END_MARGIN, NIL)
    }

  /**
   * Controls which instances will be faded when approaching the limits of the visibility range. See [enum VisibilityRangeFadeMode] for possible values.
   */
  public var visibilityRangeFadeMode: VisibilityRangeFadeMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE3D_GET_VISIBILITY_RANGE_FADE_MODE, LONG)
      return GeometryInstance3D.VisibilityRangeFadeMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE3D_SET_VISIBILITY_RANGE_FADE_MODE, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GEOMETRYINSTANCE3D, scriptIndex)
    return true
  }

  /**
   * Overrides the bounding box of this node with a custom one. This can be used to avoid the expensive [AABB] recalculation that happens when a skeleton is used with a [godot.MeshInstance3D] or to have fine control over the [godot.MeshInstance3D]'s bounding box. To use the default AABB, set value to an [AABB] with all fields set to `0.0`. To avoid frustum culling, set [customAabb] to a very large AABB that covers your entire game world such as `AABB(-10000, -10000, -10000, 20000, 20000, 20000)`. To disable all forms of culling (including occlusion culling), call [godot.RenderingServer.instanceSetIgnoreCulling] on the [godot.GeometryInstance3D]'s [RID].
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = geometryinstance3d.customAabb
   * //Your changes
   * geometryinstance3d.customAabb = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun customAabbMutate(block: AABB.() -> Unit): AABB = customAabb.apply{
      block(this)
      customAabb = this
  }


  /**
   * Set the value of a shader uniform for this instance only ([per-instance uniform]($DOCS_URL/tutorials/shaders/shader_reference/shading_language.html#per-instance-uniforms)). See also [godot.ShaderMaterial.setShaderParameter] to assign a uniform on all instances using the same [godot.ShaderMaterial].
   *
   * **Note:** For a shader uniform to be assignable on a per-instance basis, it *must* be defined with `instance uniform ...` rather than `uniform ...` in the shader code.
   *
   * **Note:** [name] is case-sensitive and must match the name of the uniform in the code exactly (not the capitalized name in the inspector).
   *
   * **Note:** Per-instance shader uniforms are currently only available in 3D, so there is no 2D equivalent of this method.
   */
  public fun setInstanceShaderParameter(name: StringName, `value`: Any?): Unit {
    TransferContext.writeArguments(STRING_NAME to name, ANY to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE3D_SET_INSTANCE_SHADER_PARAMETER, NIL)
  }

  /**
   * Get the value of a shader parameter as set on this instance.
   */
  public fun getInstanceShaderParameter(name: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE3D_GET_INSTANCE_SHADER_PARAMETER, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public enum class ShadowCastingSetting(
    id: Long,
  ) {
    /**
     * Will not cast any shadows. Use this to improve performance for small geometry that is unlikely to cast noticeable shadows (such as debris).
     */
    SHADOW_CASTING_SETTING_OFF(0),
    /**
     * Will cast shadows from all visible faces in the GeometryInstance3D.
     *
     * Will take culling into account, so faces not being rendered will not be taken into account when shadow casting.
     */
    SHADOW_CASTING_SETTING_ON(1),
    /**
     * Will cast shadows from all visible faces in the GeometryInstance3D.
     *
     * Will not take culling into account, so all faces will be taken into account when shadow casting.
     */
    SHADOW_CASTING_SETTING_DOUBLE_SIDED(2),
    /**
     * Will only show the shadows casted from this object.
     *
     * In other words, the actual mesh will not be visible, only the shadows casted from the mesh will be.
     */
    SHADOW_CASTING_SETTING_SHADOWS_ONLY(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class GIMode(
    id: Long,
  ) {
    /**
     * Disabled global illumination mode. Use for dynamic objects that do not contribute to global illumination (such as characters). When using [godot.VoxelGI] and SDFGI, the geometry will *receive* indirect lighting and reflections but the geometry will not be considered in GI baking. When using [godot.LightmapGI], the object will receive indirect lighting using lightmap probes instead of using the baked lightmap texture.
     */
    GI_MODE_DISABLED(0),
    /**
     * Baked global illumination mode. Use for static objects that contribute to global illumination (such as level geometry). This GI mode is effective when using [godot.VoxelGI], SDFGI and [godot.LightmapGI].
     */
    GI_MODE_STATIC(1),
    /**
     * Dynamic global illumination mode. Use for dynamic objects that contribute to global illumination. This GI mode is only effective when using [godot.VoxelGI], but it has a higher performance impact than [GI_MODE_STATIC]. When using other GI methods, this will act the same as [GI_MODE_DISABLED].
     */
    GI_MODE_DYNAMIC(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class LightmapScale(
    id: Long,
  ) {
    /**
     * The standard texel density for lightmapping with [godot.LightmapGI].
     */
    LIGHTMAP_SCALE_1X(0),
    /**
     * Multiplies texel density by 2× for lightmapping with [godot.LightmapGI]. To ensure consistency in texel density, use this when scaling a mesh by a factor between 1.5 and 3.0.
     */
    LIGHTMAP_SCALE_2X(1),
    /**
     * Multiplies texel density by 4× for lightmapping with [godot.LightmapGI]. To ensure consistency in texel density, use this when scaling a mesh by a factor between 3.0 and 6.0.
     */
    LIGHTMAP_SCALE_4X(2),
    /**
     * Multiplies texel density by 8× for lightmapping with [godot.LightmapGI]. To ensure consistency in texel density, use this when scaling a mesh by a factor greater than 6.0.
     */
    LIGHTMAP_SCALE_8X(3),
    /**
     * Represents the size of the [enum LightmapScale] enum.
     */
    LIGHTMAP_SCALE_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class VisibilityRangeFadeMode(
    id: Long,
  ) {
    /**
     * Will not fade itself nor its visibility dependencies, hysteresis will be used instead. This is the fastest approach to manual LOD, but it can result in noticeable LOD transitions depending on how the LOD meshes are authored. See [visibilityRangeBegin] and [godot.Node3D.visibilityParent] for more information.
     */
    VISIBILITY_RANGE_FADE_DISABLED(0),
    /**
     * Will fade-out itself when reaching the limits of its own visibility range. This is slower than [VISIBILITY_RANGE_FADE_DISABLED], but it can provide smoother transitions. The fading range is determined by [visibilityRangeBeginMargin] and [visibilityRangeEndMargin].
     */
    VISIBILITY_RANGE_FADE_SELF(1),
    /**
     * Will fade-in its visibility dependencies (see [godot.Node3D.visibilityParent]) when reaching the limits of its own visibility range. This is slower than [VISIBILITY_RANGE_FADE_DISABLED], but it can provide smoother transitions. The fading range is determined by [visibilityRangeBeginMargin] and [visibilityRangeEndMargin].
     */
    VISIBILITY_RANGE_FADE_DEPENDENCIES(2),
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
}
