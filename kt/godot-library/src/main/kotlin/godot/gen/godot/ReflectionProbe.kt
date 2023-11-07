// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Captures its surroundings as a cubemap, and stores versions of it with increasing levels of blur
 * to simulate different material roughnesses.
 * The [ReflectionProbe] is used to create high-quality reflections at a low performance cost (when
 * [updateMode] is [constant UPDATE_ONCE]). [ReflectionProbe]s can be blended together and with the
 * rest of the scene smoothly. [ReflectionProbe]s can also be combined with [VoxelGI], SDFGI
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
   * Sets how frequently the [ReflectionProbe] is updated. Can be [constant UPDATE_ONCE] or
   * [constant UPDATE_ALWAYS].
   */
  public var updateMode: UpdateMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUpdateModePtr, LONG)
      return ReflectionProbe.UpdateMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setUpdateModePtr, NIL)
    }

  /**
   * Defines the reflection intensity. Intensity modulates the strength of the reflection.
   */
  public var intensity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getIntensityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setIntensityPtr, NIL)
    }

  /**
   * The maximum distance away from the [ReflectionProbe] an object can be before it is culled.
   * Decrease this to improve performance, especially when using the [constant UPDATE_ALWAYS]
   * [updateMode].
   * **Note:** The maximum reflection distance is always at least equal to the probe's extents. This
   * means that decreasing [maxDistance] will not always cull objects from reflections, especially if
   * the reflection probe's box defined by its [size] is already large.
   */
  public var maxDistance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxDistancePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxDistancePtr, NIL)
    }

  /**
   * The size of the reflection probe. The larger the size, the more space covered by the probe,
   * which will lower the perceived resolution. It is best to keep the size only as large as you need
   * it.
   * **Note:** To better fit areas that are not aligned to the grid, you can rotate the
   * [ReflectionProbe] node.
   */
  @CoreTypeLocalCopy
  public var size: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSizePtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSizePtr, NIL)
    }

  /**
   * Sets the origin offset to be used when this [ReflectionProbe] is in [boxProjection] mode. This
   * can be set to a non-zero value to ensure a reflection fits a rectangle-shaped room, while reducing
   * the number of objects that "get in the way" of the reflection.
   */
  @CoreTypeLocalCopy
  public var originOffset: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOriginOffsetPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOriginOffsetPtr, NIL)
    }

  /**
   * If `true`, enables box projection. This makes reflections look more correct in rectangle-shaped
   * rooms by offsetting the reflection center depending on the camera's location.
   * **Note:** To better fit rectangle-shaped rooms that are not aligned to the grid, you can rotate
   * the [ReflectionProbe] node.
   */
  public var boxProjection: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isBoxProjectionEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEnableBoxProjectionPtr, NIL)
    }

  /**
   * If `true`, reflections will ignore sky contribution.
   */
  public var interior: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSetAsInteriorPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAsInteriorPtr, NIL)
    }

  /**
   * If `true`, computes shadows in the reflection probe. This makes the reflection probe slower to
   * render; you may want to disable this if using the [constant UPDATE_ALWAYS] [updateMode].
   */
  public var enableShadows: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.areShadowsEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEnableShadowsPtr, NIL)
    }

  /**
   * Sets the cull mask which determines what objects are drawn by this probe. Every
   * [VisualInstance3D] with a layer included in this cull mask will be rendered by the probe. To
   * improve performance, it is best to only include large objects which are likely to take up a lot of
   * space in the reflection.
   */
  public var cullMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCullMaskPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCullMaskPtr, NIL)
    }

  /**
   * The automatic LOD bias to use for meshes rendered within the [ReflectionProbe] (this is analog
   * to [Viewport.meshLodThreshold]). Higher values will use less detailed versions of meshes that have
   * LOD variations generated. If set to `0.0`, automatic LOD is disabled. Increase [meshLodThreshold]
   * to improve performance at the cost of geometry detail, especially when using the [constant
   * UPDATE_ALWAYS] [updateMode].
   * **Note:** [meshLodThreshold] does not affect [GeometryInstance3D] visibility ranges (also known
   * as "manual" LOD or hierarchical LOD).
   */
  public var meshLodThreshold: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMeshLodThresholdPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMeshLodThresholdPtr, NIL)
    }

  /**
   * The ambient color to use within the [ReflectionProbe]'s box defined by its [size]. The ambient
   * color will smoothly blend with other [ReflectionProbe]s and the rest of the scene (outside the
   * [ReflectionProbe]'s box defined by its [size]).
   */
  public var ambientMode: AmbientMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAmbientModePtr, LONG)
      return ReflectionProbe.AmbientMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setAmbientModePtr, NIL)
    }

  /**
   * The custom ambient color to use within the [ReflectionProbe]'s box defined by its [size]. Only
   * effective if [ambientMode] is [constant AMBIENT_COLOR].
   */
  @CoreTypeLocalCopy
  public var ambientColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAmbientColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAmbientColorPtr, NIL)
    }

  /**
   * The custom ambient color energy to use within the [ReflectionProbe]'s box defined by its
   * [size]. Only effective if [ambientMode] is [constant AMBIENT_COLOR].
   */
  public var ambientColorEnergy: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAmbientColorEnergyPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAmbientColorEnergyPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_REFLECTIONPROBE, scriptIndex)
    return true
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
  public open fun sizeMutate(block: Vector3.() -> Unit): Vector3 = size.apply{
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
  public open fun originOffsetMutate(block: Vector3.() -> Unit): Vector3 = originOffset.apply{
      block(this)
      originOffset = this
  }


  /**
   * The custom ambient color to use within the [ReflectionProbe]'s box defined by its [size]. Only
   * effective if [ambientMode] is [constant AMBIENT_COLOR].
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
  public open fun ambientColorMutate(block: Color.() -> Unit): Color = ambientColor.apply{
      block(this)
      ambientColor = this
  }


  public enum class UpdateMode(
    id: Long,
  ) {
    /**
     * Update the probe once on the next frame (recommended for most objects). The corresponding
     * radiance map will be generated over the following six frames. This takes more time to update
     * than [constant UPDATE_ALWAYS], but it has a lower performance cost and can result in
     * higher-quality reflections. The ReflectionProbe is updated when its transform changes, but not
     * when nearby geometry changes. You can force a [ReflectionProbe] update by moving the
     * [ReflectionProbe] slightly in any direction.
     */
    UPDATE_ONCE(0),
    /**
     * Update the probe every frame. This provides better results for fast-moving dynamic objects
     * (such as cars). However, it has a significant performance cost. Due to the cost, it's
     * recommended to only use one ReflectionProbe with [constant UPDATE_ALWAYS] at most per scene. For
     * all other use cases, use [constant UPDATE_ONCE].
     */
    UPDATE_ALWAYS(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setIntensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "set_intensity")

    public val getIntensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "get_intensity")

    public val setAmbientModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "set_ambient_mode")

    public val getAmbientModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "get_ambient_mode")

    public val setAmbientColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "set_ambient_color")

    public val getAmbientColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "get_ambient_color")

    public val setAmbientColorEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "set_ambient_color_energy")

    public val getAmbientColorEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "get_ambient_color_energy")

    public val setMaxDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "set_max_distance")

    public val getMaxDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "get_max_distance")

    public val setMeshLodThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "set_mesh_lod_threshold")

    public val getMeshLodThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "get_mesh_lod_threshold")

    public val setSizePtr: VoidPtr = TypeManager.getMethodBindPtr("ReflectionProbe", "set_size")

    public val getSizePtr: VoidPtr = TypeManager.getMethodBindPtr("ReflectionProbe", "get_size")

    public val setOriginOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "set_origin_offset")

    public val getOriginOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "get_origin_offset")

    public val setAsInteriorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "set_as_interior")

    public val isSetAsInteriorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "is_set_as_interior")

    public val setEnableBoxProjectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "set_enable_box_projection")

    public val isBoxProjectionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "is_box_projection_enabled")

    public val setEnableShadowsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "set_enable_shadows")

    public val areShadowsEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "are_shadows_enabled")

    public val setCullMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "set_cull_mask")

    public val getCullMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "get_cull_mask")

    public val setUpdateModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "set_update_mode")

    public val getUpdateModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReflectionProbe", "get_update_mode")
  }
}
