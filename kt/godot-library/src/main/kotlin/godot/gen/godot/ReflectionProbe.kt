// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.CoreTypeHelper
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
 * [https://docs.godotengine.org/en/3.4/tutorials/3d/reflection_probes.html](https://docs.godotengine.org/en/3.4/tutorials/3d/reflection_probes.html)
 *
 * Capture its surroundings as a dual paraboloid image, and stores versions of it with increasing levels of blur to simulate different material roughnesses.
 *
 * The [godot.ReflectionProbe] is used to create high-quality reflections at a low performance cost (when [updateMode] is [UPDATE_ONCE]). [godot.ReflectionProbe]s can be blended together and with the rest of the scene smoothly. [godot.ReflectionProbe]s can also be combined with [godot.GIProbe] and screen-space reflections ([godot.Environment.ssReflectionsEnabled]) to get more accurate reflections in specific areas. [godot.ReflectionProbe]s render all objects within their [cullMask], so updating them can be quite expensive. It is best to update them once with the important static objects and then leave them as-is.
 *
 * **Note:** Unlike [godot.GIProbe], [godot.ReflectionProbe]s only source their environment from a [godot.WorldEnvironment] node. If you specify an [godot.Environment] resource within a [godot.Camera] node, it will be ignored by the [godot.ReflectionProbe]. This can lead to incorrect lighting within the [godot.ReflectionProbe].
 *
 * **Note:** By default, Godot will only render 16 reflection probes. If you need more, increase the number of atlas subdivisions. This setting can be found in [godot.ProjectSettings.rendering/quality/reflections/atlasSubdiv].
 *
 * **Note:** The GLES2 backend will only display two reflection probes at the same time for a single mesh. If possible, split up large meshes that span over multiple reflection probes into smaller ones.
 */
@GodotBaseType
public open class ReflectionProbe : VisualInstance() {
  /**
   * If `true`, enables box projection. This makes reflections look more correct in rectangle-shaped rooms by offsetting the reflection center depending on the camera's location.
   *
   * **Note:** To better fit rectangle-shaped rooms that are not aligned to the grid, you can rotate the [godot.ReflectionProbe] node.
   */
  public open var boxProjection: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_GET_BOX_PROJECTION, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_BOX_PROJECTION, NIL)
    }

  /**
   * Sets the cull mask which determines what objects are drawn by this probe. Every [godot.VisualInstance] with a layer included in this cull mask will be rendered by the probe. To improve performance, it is best to only include large objects which are likely to take up a lot of space in the reflection.
   */
  public open var cullMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_GET_CULL_MASK,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_CULL_MASK,
          NIL)
    }

  /**
   * If `true`, computes shadows in the reflection probe. This makes the reflection probe slower to render; you may want to disable this if using the [UPDATE_ALWAYS] [updateMode].
   */
  public open var enableShadows: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_GET_ENABLE_SHADOWS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_ENABLE_SHADOWS, NIL)
    }

  /**
   * The size of the reflection probe. The larger the extents the more space covered by the probe which will lower the perceived resolution. It is best to keep the extents only as large as you need them.
   *
   * **Note:** To better fit areas that are not aligned to the grid, you can rotate the [godot.ReflectionProbe] node.
   */
  public open var extents: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_GET_EXTENTS,
          VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_EXTENTS, NIL)
    }

  /**
   * Defines the reflection intensity. Intensity modulates the strength of the reflection.
   */
  public open var intensity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_GET_INTENSITY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_INTENSITY,
          NIL)
    }

  /**
   * Sets the ambient light color to be used when this probe is set to [interiorEnable].
   */
  public open var interiorAmbientColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_GET_INTERIOR_AMBIENT_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_INTERIOR_AMBIENT_COLOR, NIL)
    }

  /**
   * Sets the contribution value for how much the reflection affects the ambient light for this reflection probe when set to [interiorEnable]. Useful so that ambient light matches the color of the room.
   */
  public open var interiorAmbientContrib: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_GET_INTERIOR_AMBIENT_CONTRIB, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_INTERIOR_AMBIENT_CONTRIB, NIL)
    }

  /**
   * Sets the energy multiplier for this reflection probe's ambient light contribution when set to [interiorEnable].
   */
  public open var interiorAmbientEnergy: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_GET_INTERIOR_AMBIENT_ENERGY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_INTERIOR_AMBIENT_ENERGY, NIL)
    }

  /**
   * If `true`, reflections will ignore sky contribution. Ambient lighting is then controlled by the `interior_ambient_*` properties.
   */
  public open var interiorEnable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_GET_INTERIOR_ENABLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_INTERIOR_ENABLE, NIL)
    }

  /**
   * The maximum distance away from the [godot.ReflectionProbe] an object can be before it is culled. Decrease this to improve performance, especially when using the [UPDATE_ALWAYS] [updateMode].
   */
  public open var maxDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_GET_MAX_DISTANCE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_MAX_DISTANCE,
          NIL)
    }

  /**
   * Sets the origin offset to be used when this [godot.ReflectionProbe] is in [boxProjection] mode. This can be set to a non-zero value to ensure a reflection fits a rectangle-shaped room, while reducing the amount of objects that "get in the way" of the reflection.
   */
  public open var originOffset: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_GET_ORIGIN_OFFSET,
          VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_ORIGIN_OFFSET,
          NIL)
    }

  /**
   * Sets how frequently the [godot.ReflectionProbe] is updated. Can be [UPDATE_ONCE] or [UPDATE_ALWAYS].
   */
  public open var updateMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_GET_UPDATE_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_UPDATE_MODE,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_REFLECTIONPROBE)
  }

  @CoreTypeHelper
  public open fun extents(schedule: Vector3.() -> Unit): Vector3 = extents.apply{
      schedule(this)
      extents = this
  }


  @CoreTypeHelper
  public open fun interiorAmbientColor(schedule: Color.() -> Unit): Color =
      interiorAmbientColor.apply{
      schedule(this)
      interiorAmbientColor = this
  }


  @CoreTypeHelper
  public open fun originOffset(schedule: Vector3.() -> Unit): Vector3 = originOffset.apply{
      schedule(this)
      originOffset = this
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

  public companion object {
    /**
     * Update the probe every frame. This provides better results for fast-moving dynamic objects (such as cars). However, it has a significant performance cost. Due to the cost, it's recommended to only use one ReflectionProbe with [UPDATE_ALWAYS] at most per scene. For all other use cases, use [UPDATE_ONCE].
     */
    public final const val UPDATE_ALWAYS: Long = 1

    /**
     * Update the probe once on the next frame (recommended for most objects). The corresponding radiance map will be generated over the following six frames. This takes more time to update than [UPDATE_ALWAYS], but it has a lower performance cost and can result in higher-quality reflections. The ReflectionProbe is updated when its transform changes, but not when nearby geometry changes. You can force a [godot.ReflectionProbe] update by moving the [godot.ReflectionProbe] slightly in any direction.
     */
    public final const val UPDATE_ONCE: Long = 0
  }
}
