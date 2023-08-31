// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Captures its surroundings to create fast, accurate reflections from a given point.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/3d/global_illumination/reflection_probes.html]($DOCS_URL/tutorials/3d/global_illumination/reflection_probes.html)
 *
 * Captures its surroundings as a cubemap, and stores versions of it with increasing levels of blur to simulate different material roughnesses.
 *
 * The [godot.ReflectionProbe] is used to create high-quality reflections at a low performance cost (when [updateMode] is [UPDATE_ONCE]). [godot.ReflectionProbe]s can be blended together and with the rest of the scene smoothly. [godot.ReflectionProbe]s can also be combined with [godot.VoxelGI], SDFGI ([godot.Environment.sdfgiEnabled]) and screen-space reflections ([godot.Environment.ssrEnabled]) to get more accurate reflections in specific areas. [godot.ReflectionProbe]s render all objects within their [cullMask], so updating them can be quite expensive. It is best to update them once with the important static objects and then leave them as-is.
 *
 * **Note:** Unlike [godot.VoxelGI] and SDFGI, [godot.ReflectionProbe]s only source their environment from a [godot.WorldEnvironment] node. If you specify an [godot.Environment] resource within a [godot.Camera3D] node, it will be ignored by the [godot.ReflectionProbe]. This can lead to incorrect lighting within the [godot.ReflectionProbe].
 *
 * **Note:** Reflection probes are only supported in the Forward+ and Mobile rendering methods, not Compatibility. When using the Mobile rendering method, only 8 reflection probes can be displayed on each mesh resource. Attempting to display more than 8 reflection probes on a single mesh resource will result in reflection probes flickering in and out as the camera moves.
 *
 * **Note:** When using the Mobile rendering method, reflection probes will only correctly affect meshes whose visibility AABB intersects with the reflection probe's AABB. If using a shader to deform the mesh in a way that makes it go outside its AABB, [godot.GeometryInstance3D.extraCullMargin] must be increased on the mesh. Otherwise, the reflection probe may not be visible on the mesh.
 */
@GodotBaseType
public open class ReflectionProbe : VisualInstance3D() {
  /**
   * Sets how frequently the [godot.ReflectionProbe] is updated. Can be [UPDATE_ONCE] or [UPDATE_ALWAYS].
   */
  public var updateMode: UpdateMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_GET_UPDATE_MODE,
          LONG)
      return ReflectionProbe.UpdateMode.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_UPDATE_MODE,
          NIL)
    }

  /**
   * Defines the reflection intensity. Intensity modulates the strength of the reflection.
   */
  public var intensity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_GET_INTENSITY,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_INTENSITY,
          NIL)
    }

  /**
   * The maximum distance away from the [godot.ReflectionProbe] an object can be before it is culled. Decrease this to improve performance, especially when using the [UPDATE_ALWAYS] [updateMode].
   *
   * **Note:** The maximum reflection distance is always at least equal to the probe's extents. This means that decreasing [maxDistance] will not always cull objects from reflections, especially if the reflection probe's box defined by its [size] is already large.
   */
  public var maxDistance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_GET_MAX_DISTANCE,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_MAX_DISTANCE,
          NIL)
    }

  /**
   * The size of the reflection probe. The larger the size, the more space covered by the probe, which will lower the perceived resolution. It is best to keep the size only as large as you need it.
   *
   * **Note:** To better fit areas that are not aligned to the grid, you can rotate the [godot.ReflectionProbe] node.
   */
  public var size: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_GET_SIZE, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_SIZE, NIL)
    }

  /**
   * Sets the origin offset to be used when this [godot.ReflectionProbe] is in [boxProjection] mode. This can be set to a non-zero value to ensure a reflection fits a rectangle-shaped room, while reducing the number of objects that "get in the way" of the reflection.
   */
  public var originOffset: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_GET_ORIGIN_OFFSET,
          VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_ORIGIN_OFFSET,
          NIL)
    }

  /**
   * If `true`, enables box projection. This makes reflections look more correct in rectangle-shaped rooms by offsetting the reflection center depending on the camera's location.
   *
   * **Note:** To better fit rectangle-shaped rooms that are not aligned to the grid, you can rotate the [godot.ReflectionProbe] node.
   */
  public var boxProjection: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_IS_BOX_PROJECTION_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_ENABLE_BOX_PROJECTION, NIL)
    }

  /**
   * If `true`, reflections will ignore sky contribution.
   */
  public var interior: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_IS_SET_AS_INTERIOR, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_AS_INTERIOR,
          NIL)
    }

  /**
   * If `true`, computes shadows in the reflection probe. This makes the reflection probe slower to render; you may want to disable this if using the [UPDATE_ALWAYS] [updateMode].
   */
  public var enableShadows: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_ARE_SHADOWS_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_ENABLE_SHADOWS, NIL)
    }

  /**
   * Sets the cull mask which determines what objects are drawn by this probe. Every [godot.VisualInstance3D] with a layer included in this cull mask will be rendered by the probe. To improve performance, it is best to only include large objects which are likely to take up a lot of space in the reflection.
   */
  public var cullMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_GET_CULL_MASK,
          LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_CULL_MASK,
          NIL)
    }

  /**
   * The automatic LOD bias to use for meshes rendered within the [godot.ReflectionProbe] (this is analog to [godot.Viewport.meshLodThreshold]). Higher values will use less detailed versions of meshes that have LOD variations generated. If set to `0.0`, automatic LOD is disabled. Increase [meshLodThreshold] to improve performance at the cost of geometry detail, especially when using the [UPDATE_ALWAYS] [updateMode].
   *
   * **Note:** [meshLodThreshold] does not affect [godot.GeometryInstance3D] visibility ranges (also known as "manual" LOD or hierarchical LOD).
   */
  public var meshLodThreshold: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_GET_MESH_LOD_THRESHOLD, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_MESH_LOD_THRESHOLD, NIL)
    }

  /**
   * The ambient color to use within the [godot.ReflectionProbe]'s box defined by its [size]. The ambient color will smoothly blend with other [godot.ReflectionProbe]s and the rest of the scene (outside the [godot.ReflectionProbe]'s box defined by its [size]).
   */
  public var ambientMode: AmbientMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_GET_AMBIENT_MODE,
          LONG)
      return ReflectionProbe.AmbientMode.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_AMBIENT_MODE,
          NIL)
    }

  /**
   * The custom ambient color to use within the [godot.ReflectionProbe]'s box defined by its [size]. Only effective if [ambientMode] is [AMBIENT_COLOR].
   */
  public var ambientColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_GET_AMBIENT_COLOR,
          COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_AMBIENT_COLOR,
          NIL)
    }

  /**
   * The custom ambient color energy to use within the [godot.ReflectionProbe]'s box defined by its [size]. Only effective if [ambientMode] is [AMBIENT_COLOR].
   */
  public var ambientColorEnergy: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_GET_AMBIENT_COLOR_ENERGY, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_AMBIENT_COLOR_ENERGY, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_REFLECTIONPROBE, scriptIndex)
    return true
  }

  public enum class UpdateMode(
    id: Long,
  ) {
    /**
     * Update the probe once on the next frame (recommended for most objects). The corresponding radiance map will be generated over the following six frames. This takes more time to update than [UPDATE_ALWAYS], but it has a lower performance cost and can result in higher-quality reflections. The ReflectionProbe is updated when its transform changes, but not when nearby geometry changes. You can force a [godot.ReflectionProbe] update by moving the [godot.ReflectionProbe] slightly in any direction.
     */
    UPDATE_ONCE(0),
    /**
     * Update the probe every frame. This provides better results for fast-moving dynamic objects (such as cars). However, it has a significant performance cost. Due to the cost, it's recommended to only use one ReflectionProbe with [UPDATE_ALWAYS] at most per scene. For all other use cases, use [UPDATE_ONCE].
     */
    UPDATE_ALWAYS(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class AmbientMode(
    id: Long,
  ) {
    /**
     * Do not apply any ambient lighting inside the [godot.ReflectionProbe]'s box defined by its [size].
     */
    AMBIENT_DISABLED(0),
    /**
     * Apply automatically-sourced environment lighting inside the [godot.ReflectionProbe]'s box defined by its [size].
     */
    AMBIENT_ENVIRONMENT(1),
    /**
     * Apply custom ambient lighting inside the [godot.ReflectionProbe]'s box defined by its [size]. See [ambientColor] and [ambientColorEnergy].
     */
    AMBIENT_COLOR(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
