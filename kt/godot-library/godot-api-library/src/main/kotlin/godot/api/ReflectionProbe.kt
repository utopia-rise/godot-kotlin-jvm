// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Color
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.VECTOR3
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Captures its surroundings as a cubemap, and stores versions of it with increasing levels of blur
 * to simulate different material roughnesses.
 * The [ReflectionProbe] is used to create high-quality reflections at a low performance cost (when
 * [updateMode] is [UPDATE_ONCE]). [ReflectionProbe]s can be blended together and with the rest of the
 * scene smoothly. [ReflectionProbe]s can also be combined with [VoxelGI], SDFGI
 * ([Environment.sdfgiEnabled]) and screen-space reflections ([Environment.ssrEnabled]) to get more
 * accurate reflections in specific areas. [ReflectionProbe]s render all objects within their
 * [cullMask], so updating them can be quite expensive. It is best to update them once with the
 * important static objects and then leave them as-is.
 * **Note:** Unlike [VoxelGI] and SDFGI, [ReflectionProbe]s only source their environment from a
 * [WorldEnvironment] node. If you specify an [Environment] resource within a [Camera3D] node, it will
 * be ignored by the [ReflectionProbe]. This can lead to incorrect lighting within the
 * [ReflectionProbe].
 * **Note:** Reflection probes are only supported in the Forward+ and Mobile rendering methods, not
 * Compatibility. When using the Mobile rendering method, only 8 reflection probes can be displayed on
 * each mesh resource. Attempting to display more than 8 reflection probes on a single mesh resource
 * will result in reflection probes flickering in and out as the camera moves.
 * **Note:** When using the Mobile rendering method, reflection probes will only correctly affect
 * meshes whose visibility AABB intersects with the reflection probe's AABB. If using a shader to
 * deform the mesh in a way that makes it go outside its AABB, [GeometryInstance3D.extraCullMargin]
 * must be increased on the mesh. Otherwise, the reflection probe may not be visible on the mesh.
 */
@GodotBaseType
public open class ReflectionProbe : VisualInstance3D() {
  /**
   * Sets how frequently the [ReflectionProbe] is updated. Can be [UPDATE_ONCE] or [UPDATE_ALWAYS].
   */
  public final inline var updateMode: UpdateMode
    @JvmName("updateModeProperty")
    get() = getUpdateMode()
    @JvmName("updateModeProperty")
    set(`value`) {
      setUpdateMode(value)
    }

  /**
   * Defines the reflection intensity. Intensity modulates the strength of the reflection.
   */
  public final inline var intensity: Float
    @JvmName("intensityProperty")
    get() = getIntensity()
    @JvmName("intensityProperty")
    set(`value`) {
      setIntensity(value)
    }

  /**
   * The maximum distance away from the [ReflectionProbe] an object can be before it is culled.
   * Decrease this to improve performance, especially when using the [UPDATE_ALWAYS] [updateMode].
   * **Note:** The maximum reflection distance is always at least equal to the probe's extents. This
   * means that decreasing [maxDistance] will not always cull objects from reflections, especially if
   * the reflection probe's box defined by its [size] is already large.
   */
  public final inline var maxDistance: Float
    @JvmName("maxDistanceProperty")
    get() = getMaxDistance()
    @JvmName("maxDistanceProperty")
    set(`value`) {
      setMaxDistance(value)
    }

  /**
   * The size of the reflection probe. The larger the size, the more space covered by the probe,
   * which will lower the perceived resolution. It is best to keep the size only as large as you need
   * it.
   * **Note:** To better fit areas that are not aligned to the grid, you can rotate the
   * [ReflectionProbe] node.
   */
  @CoreTypeLocalCopy
  public final inline var size: Vector3
    @JvmName("sizeProperty")
    get() = getSize()
    @JvmName("sizeProperty")
    set(`value`) {
      setSize(value)
    }

  /**
   * Sets the origin offset to be used when this [ReflectionProbe] is in [boxProjection] mode. This
   * can be set to a non-zero value to ensure a reflection fits a rectangle-shaped room, while reducing
   * the number of objects that "get in the way" of the reflection.
   */
  @CoreTypeLocalCopy
  public final inline var originOffset: Vector3
    @JvmName("originOffsetProperty")
    get() = getOriginOffset()
    @JvmName("originOffsetProperty")
    set(`value`) {
      setOriginOffset(value)
    }

  /**
   * If `true`, enables box projection. This makes reflections look more correct in rectangle-shaped
   * rooms by offsetting the reflection center depending on the camera's location.
   * **Note:** To better fit rectangle-shaped rooms that are not aligned to the grid, you can rotate
   * the [ReflectionProbe] node.
   */
  public final inline var boxProjection: Boolean
    @JvmName("boxProjectionProperty")
    get() = isBoxProjectionEnabled()
    @JvmName("boxProjectionProperty")
    set(`value`) {
      setEnableBoxProjection(value)
    }

  /**
   * If `true`, reflections will ignore sky contribution.
   */
  public final inline var interior: Boolean
    @JvmName("interiorProperty")
    get() = isSetAsInterior()
    @JvmName("interiorProperty")
    set(`value`) {
      setAsInterior(value)
    }

  /**
   * If `true`, computes shadows in the reflection probe. This makes the reflection probe slower to
   * render; you may want to disable this if using the [UPDATE_ALWAYS] [updateMode].
   */
  public final inline var enableShadows: Boolean
    @JvmName("enableShadowsProperty")
    get() = areShadowsEnabled()
    @JvmName("enableShadowsProperty")
    set(`value`) {
      setEnableShadows(value)
    }

  /**
   * Sets the cull mask which determines what objects are drawn by this probe. Every
   * [VisualInstance3D] with a layer included in this cull mask will be rendered by the probe. It is
   * best to only include large objects which are likely to take up a lot of space in the reflection in
   * order to save on rendering cost.
   * This can also be used to prevent an object from reflecting upon itself (for instance, a
   * [ReflectionProbe] centered on a vehicle).
   */
  public final inline var cullMask: Long
    @JvmName("cullMaskProperty")
    get() = getCullMask()
    @JvmName("cullMaskProperty")
    set(`value`) {
      setCullMask(value)
    }

  /**
   * Sets the reflection mask which determines what objects have reflections applied from this
   * probe. Every [VisualInstance3D] with a layer included in this reflection mask will have
   * reflections applied from this probe. See also [cullMask], which can be used to exclude objects
   * from appearing in the reflection while still making them affected by the [ReflectionProbe].
   */
  public final inline var reflectionMask: Long
    @JvmName("reflectionMaskProperty")
    get() = getReflectionMask()
    @JvmName("reflectionMaskProperty")
    set(`value`) {
      setReflectionMask(value)
    }

  /**
   * The automatic LOD bias to use for meshes rendered within the [ReflectionProbe] (this is analog
   * to [Viewport.meshLodThreshold]). Higher values will use less detailed versions of meshes that have
   * LOD variations generated. If set to `0.0`, automatic LOD is disabled. Increase [meshLodThreshold]
   * to improve performance at the cost of geometry detail, especially when using the [UPDATE_ALWAYS]
   * [updateMode].
   * **Note:** [meshLodThreshold] does not affect [GeometryInstance3D] visibility ranges (also known
   * as "manual" LOD or hierarchical LOD).
   */
  public final inline var meshLodThreshold: Float
    @JvmName("meshLodThresholdProperty")
    get() = getMeshLodThreshold()
    @JvmName("meshLodThresholdProperty")
    set(`value`) {
      setMeshLodThreshold(value)
    }

  /**
   * The ambient color to use within the [ReflectionProbe]'s box defined by its [size]. The ambient
   * color will smoothly blend with other [ReflectionProbe]s and the rest of the scene (outside the
   * [ReflectionProbe]'s box defined by its [size]).
   */
  public final inline var ambientMode: AmbientMode
    @JvmName("ambientModeProperty")
    get() = getAmbientMode()
    @JvmName("ambientModeProperty")
    set(`value`) {
      setAmbientMode(value)
    }

  /**
   * The custom ambient color to use within the [ReflectionProbe]'s box defined by its [size]. Only
   * effective if [ambientMode] is [AMBIENT_COLOR].
   */
  @CoreTypeLocalCopy
  public final inline var ambientColor: Color
    @JvmName("ambientColorProperty")
    get() = getAmbientColor()
    @JvmName("ambientColorProperty")
    set(`value`) {
      setAmbientColor(value)
    }

  /**
   * The custom ambient color energy to use within the [ReflectionProbe]'s box defined by its
   * [size]. Only effective if [ambientMode] is [AMBIENT_COLOR].
   */
  public final inline var ambientColorEnergy: Float
    @JvmName("ambientColorEnergyProperty")
    get() = getAmbientColorEnergy()
    @JvmName("ambientColorEnergyProperty")
    set(`value`) {
      setAmbientColorEnergy(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(531, scriptIndex)
  }

  /**
   * The size of the reflection probe. The larger the size, the more space covered by the probe,
   * which will lower the perceived resolution. It is best to keep the size only as large as you need
   * it.
   * **Note:** To better fit areas that are not aligned to the grid, you can rotate the
   * [ReflectionProbe] node.
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
   * val myCoreType = reflectionprobe.size
   * //Your changes
   * reflectionprobe.size = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun sizeMutate(block: Vector3.() -> Unit): Vector3 = size.apply{
      block(this)
      size = this
  }


  /**
   * Sets the origin offset to be used when this [ReflectionProbe] is in [boxProjection] mode. This
   * can be set to a non-zero value to ensure a reflection fits a rectangle-shaped room, while reducing
   * the number of objects that "get in the way" of the reflection.
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
   * val myCoreType = reflectionprobe.originOffset
   * //Your changes
   * reflectionprobe.originOffset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun originOffsetMutate(block: Vector3.() -> Unit): Vector3 = originOffset.apply{
      block(this)
      originOffset = this
  }


  /**
   * The custom ambient color to use within the [ReflectionProbe]'s box defined by its [size]. Only
   * effective if [ambientMode] is [AMBIENT_COLOR].
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
   * val myCoreType = reflectionprobe.ambientColor
   * //Your changes
   * reflectionprobe.ambientColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun ambientColorMutate(block: Color.() -> Unit): Color = ambientColor.apply{
      block(this)
      ambientColor = this
  }


  public final fun setIntensity(intensity: Float): Unit {
    TransferContext.writeArguments(DOUBLE to intensity.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setIntensityPtr, NIL)
  }

  public final fun getIntensity(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getIntensityPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAmbientMode(ambient: AmbientMode): Unit {
    TransferContext.writeArguments(LONG to ambient.id)
    TransferContext.callMethod(ptr, MethodBindings.setAmbientModePtr, NIL)
  }

  public final fun getAmbientMode(): AmbientMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAmbientModePtr, LONG)
    return ReflectionProbe.AmbientMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setAmbientColor(ambient: Color): Unit {
    TransferContext.writeArguments(COLOR to ambient)
    TransferContext.callMethod(ptr, MethodBindings.setAmbientColorPtr, NIL)
  }

  public final fun getAmbientColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAmbientColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setAmbientColorEnergy(ambientEnergy: Float): Unit {
    TransferContext.writeArguments(DOUBLE to ambientEnergy.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setAmbientColorEnergyPtr, NIL)
  }

  public final fun getAmbientColorEnergy(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAmbientColorEnergyPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setMaxDistance(maxDistance: Float): Unit {
    TransferContext.writeArguments(DOUBLE to maxDistance.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setMaxDistancePtr, NIL)
  }

  public final fun getMaxDistance(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMaxDistancePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setMeshLodThreshold(ratio: Float): Unit {
    TransferContext.writeArguments(DOUBLE to ratio.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setMeshLodThresholdPtr, NIL)
  }

  public final fun getMeshLodThreshold(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMeshLodThresholdPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSize(size: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to size)
    TransferContext.callMethod(ptr, MethodBindings.setSizePtr, NIL)
  }

  public final fun getSize(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSizePtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setOriginOffset(originOffset: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to originOffset)
    TransferContext.callMethod(ptr, MethodBindings.setOriginOffsetPtr, NIL)
  }

  public final fun getOriginOffset(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOriginOffsetPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setAsInterior(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setAsInteriorPtr, NIL)
  }

  public final fun isSetAsInterior(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isSetAsInteriorPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setEnableBoxProjection(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setEnableBoxProjectionPtr, NIL)
  }

  public final fun isBoxProjectionEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isBoxProjectionEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setEnableShadows(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setEnableShadowsPtr, NIL)
  }

  public final fun areShadowsEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.areShadowsEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCullMask(layers: Long): Unit {
    TransferContext.writeArguments(LONG to layers)
    TransferContext.callMethod(ptr, MethodBindings.setCullMaskPtr, NIL)
  }

  public final fun getCullMask(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCullMaskPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setReflectionMask(layers: Long): Unit {
    TransferContext.writeArguments(LONG to layers)
    TransferContext.callMethod(ptr, MethodBindings.setReflectionMaskPtr, NIL)
  }

  public final fun getReflectionMask(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getReflectionMaskPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setUpdateMode(mode: UpdateMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setUpdateModePtr, NIL)
  }

  public final fun getUpdateMode(): UpdateMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getUpdateModePtr, LONG)
    return ReflectionProbe.UpdateMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class UpdateMode(
    id: Long,
  ) {
    /**
     * Update the probe once on the next frame (recommended for most objects). The corresponding
     * radiance map will be generated over the following six frames. This takes more time to update
     * than [UPDATE_ALWAYS], but it has a lower performance cost and can result in higher-quality
     * reflections. The ReflectionProbe is updated when its transform changes, but not when nearby
     * geometry changes. You can force a [ReflectionProbe] update by moving the [ReflectionProbe]
     * slightly in any direction.
     */
    UPDATE_ONCE(0),
    /**
     * Update the probe every frame. This provides better results for fast-moving dynamic objects
     * (such as cars). However, it has a significant performance cost. Due to the cost, it's
     * recommended to only use one ReflectionProbe with [UPDATE_ALWAYS] at most per scene. For all
     * other use cases, use [UPDATE_ONCE].
     */
    UPDATE_ALWAYS(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): UpdateMode = entries.single { it.id == `value` }
    }
  }

  public enum class AmbientMode(
    id: Long,
  ) {
    /**
     * Do not apply any ambient lighting inside the [ReflectionProbe]'s box defined by its [size].
     */
    AMBIENT_DISABLED(0),
    /**
     * Apply automatically-sourced environment lighting inside the [ReflectionProbe]'s box defined
     * by its [size].
     */
    AMBIENT_ENVIRONMENT(1),
    /**
     * Apply custom ambient lighting inside the [ReflectionProbe]'s box defined by its [size]. See
     * [ambientColor] and [ambientColorEnergy].
     */
    AMBIENT_COLOR(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): AmbientMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val setIntensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "set_intensity", 373806689)

    internal val getIntensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "get_intensity", 1740695150)

    internal val setAmbientModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "set_ambient_mode", 1748981278)

    internal val getAmbientModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "get_ambient_mode", 1014607621)

    internal val setAmbientColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "set_ambient_color", 2920490490)

    internal val getAmbientColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "get_ambient_color", 3444240500)

    internal val setAmbientColorEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "set_ambient_color_energy", 373806689)

    internal val getAmbientColorEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "get_ambient_color_energy", 1740695150)

    internal val setMaxDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "set_max_distance", 373806689)

    internal val getMaxDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "get_max_distance", 1740695150)

    internal val setMeshLodThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "set_mesh_lod_threshold", 373806689)

    internal val getMeshLodThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "get_mesh_lod_threshold", 1740695150)

    internal val setSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "set_size", 3460891852)

    internal val getSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "get_size", 3360562783)

    internal val setOriginOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "set_origin_offset", 3460891852)

    internal val getOriginOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "get_origin_offset", 3360562783)

    internal val setAsInteriorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "set_as_interior", 2586408642)

    internal val isSetAsInteriorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "is_set_as_interior", 36873697)

    internal val setEnableBoxProjectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "set_enable_box_projection", 2586408642)

    internal val isBoxProjectionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "is_box_projection_enabled", 36873697)

    internal val setEnableShadowsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "set_enable_shadows", 2586408642)

    internal val areShadowsEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "are_shadows_enabled", 36873697)

    internal val setCullMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "set_cull_mask", 1286410249)

    internal val getCullMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "get_cull_mask", 3905245786)

    internal val setReflectionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "set_reflection_mask", 1286410249)

    internal val getReflectionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "get_reflection_mask", 3905245786)

    internal val setUpdateModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "set_update_mode", 4090221187)

    internal val getUpdateModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "get_update_mode", 2367550552)
  }
}
