// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Captures its surroundings to create fast, accurate reflections from a given point.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/3d/reflection_probes.html]($DOCS_URL/tutorials/3d/reflection_probes.html)
 *
 * Captures its surroundings as a cubemap, and stores versions of it with increasing levels of blur to simulate different material roughnesses.
 *
 * The [godot.ReflectionProbe] is used to create high-quality reflections at a low performance cost (when [updateMode] is [UPDATE_ONCE]). [godot.ReflectionProbe]s can be blended together and with the rest of the scene smoothly. [godot.ReflectionProbe]s can also be combined with [godot.VoxelGI], SDFGI ([godot.Environment.sdfgiEnabled]) and screen-space reflections ([godot.Environment.ssrEnabled]) to get more accurate reflections in specific areas. [godot.ReflectionProbe]s render all objects within their [cullMask], so updating them can be quite expensive. It is best to update them once with the important static objects and then leave them as-is.
 *
 * **Note:** Unlike [godot.VoxelGI] and SDFGI, [godot.ReflectionProbe]s only source their environment from a [godot.WorldEnvironment] node. If you specify an [godot.Environment] resource within a [godot.Camera3D] node, it will be ignored by the [godot.ReflectionProbe]. This can lead to incorrect lighting within the [godot.ReflectionProbe].
 */
@GodotBaseType
public open class ReflectionProbe : VisualInstance3D() {
  /**
   * Sets how frequently the [godot.ReflectionProbe] is updated. Can be [UPDATE_ONCE] or [UPDATE_ALWAYS].
   */
  public var updateMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_GET_UPDATE_MODE,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_UPDATE_MODE,
          NIL.ordinal)
    }

  /**
   * Defines the reflection intensity. Intensity modulates the strength of the reflection.
   */
  public var intensity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_GET_INTENSITY,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_INTENSITY,
          NIL.ordinal)
    }

  /**
   * The maximum distance away from the [godot.ReflectionProbe] an object can be before it is culled. Decrease this to improve performance, especially when using the [UPDATE_ALWAYS] [updateMode].
   *
   * **Note:** The maximum reflection distance is always at least equal to the [extents]. This means that decreasing [maxDistance] will not always cull objects from reflections, especially if the reflection probe's [extents] are already large.
   */
  public var maxDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_GET_MAX_DISTANCE,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_MAX_DISTANCE,
          NIL.ordinal)
    }

  /**
   * The size of the reflection probe. The larger the extents, the more space covered by the probe, which will lower the perceived resolution. It is best to keep the extents only as large as you need them.
   *
   * **Note:** To better fit areas that are not aligned to the grid, you can rotate the [godot.ReflectionProbe] node.
   */
  public var extents: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_GET_EXTENTS,
          VECTOR3.ordinal)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_EXTENTS,
          NIL.ordinal)
    }

  /**
   * Sets the origin offset to be used when this [godot.ReflectionProbe] is in [boxProjection] mode. This can be set to a non-zero value to ensure a reflection fits a rectangle-shaped room, while reducing the amount of objects that "get in the way" of the reflection.
   */
  public var originOffset: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_GET_ORIGIN_OFFSET,
          VECTOR3.ordinal)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_ORIGIN_OFFSET,
          NIL.ordinal)
    }

  /**
   * If `true`, enables box projection. This makes reflections look more correct in rectangle-shaped rooms by offsetting the reflection center depending on the camera's location.
   *
   * **Note:** To better fit rectangle-shaped rooms that are not aligned to the grid, you can rotate the [godot.ReflectionProbe] node.
   */
  public var boxProjection: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_IS_BOX_PROJECTION_ENABLED, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_ENABLE_BOX_PROJECTION, NIL.ordinal)
    }

  /**
   * If `true`, reflections will ignore sky contribution.
   */
  public var interior: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_IS_SET_AS_INTERIOR,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_AS_INTERIOR,
          NIL.ordinal)
    }

  /**
   * If `true`, computes shadows in the reflection probe. This makes the reflection probe slower to render; you may want to disable this if using the [UPDATE_ALWAYS] [updateMode].
   */
  public var enableShadows: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_ARE_SHADOWS_ENABLED,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_ENABLE_SHADOWS,
          NIL.ordinal)
    }

  /**
   * Sets the cull mask which determines what objects are drawn by this probe. Every [godot.VisualInstance3D] with a layer included in this cull mask will be rendered by the probe. To improve performance, it is best to only include large objects which are likely to take up a lot of space in the reflection.
   */
  public var cullMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_GET_CULL_MASK,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_CULL_MASK,
          NIL.ordinal)
    }

  /**
   * The automatic LOD bias to use for meshes rendered within the [godot.ReflectionProbe] (this is analog to [godot.Viewport.meshLodThreshold]). Higher values will use less detailed versions of meshes that have LOD variations generated. If set to `0.0`, automatic LOD is disabled. Increase [meshLodThreshold] to improve performance at the cost of geometry detail, especially when using the [UPDATE_ALWAYS] [updateMode].
   *
   * **Note:** [meshLodThreshold] does not affect [godot.GeometryInstance3D] visibility ranges (also known as "manual" LOD or hierarchical LOD).
   */
  public var meshLodThreshold: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_GET_MESH_LOD_THRESHOLD,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_MESH_LOD_THRESHOLD,
          NIL.ordinal)
    }

  /**
   * The ambient color to use within the [godot.ReflectionProbe]'s [extents]. The ambient color will smoothly blend with other [godot.ReflectionProbe]s and the rest of the scene (outside the [godot.ReflectionProbe]'s [extents]).
   */
  public var ambientMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_GET_AMBIENT_MODE,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_AMBIENT_MODE,
          NIL.ordinal)
    }

  /**
   * The custom ambient color to use within the [godot.ReflectionProbe]'s [extents]. Only effective if [ambientMode] is [AMBIENT_COLOR].
   */
  public var ambientColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_GET_AMBIENT_COLOR,
          COLOR.ordinal)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_AMBIENT_COLOR,
          NIL.ordinal)
    }

  /**
   * The custom ambient color energy to use within the [godot.ReflectionProbe]'s [extents]. Only effective if [ambientMode] is [AMBIENT_COLOR].
   */
  public var ambientColorEnergy: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_GET_AMBIENT_COLOR_ENERGY, DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_AMBIENT_COLOR_ENERGY, NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_REFLECTIONPROBE)
  }

  public enum class AmbientMode(
    id: Long
  ) {
    /**
     * Do not apply any ambient lighting inside the [godot.ReflectionProbe]'s [extents].
     */
    AMBIENT_DISABLED(0),
    /**
     * Apply automatically-sourced environment lighting inside the [godot.ReflectionProbe]'s [extents].
     */
    AMBIENT_ENVIRONMENT(1),
    /**
     * Apply custom ambient lighting inside the [godot.ReflectionProbe]'s [extents]. See [ambientColor] and [ambientColorEnergy].
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

  public enum class UpdateMode(
    id: Long
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

  public companion object
}
