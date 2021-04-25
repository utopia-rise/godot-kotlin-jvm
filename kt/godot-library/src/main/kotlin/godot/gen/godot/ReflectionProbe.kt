// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.CoreTypeHelper
import godot.annotation.GodotBaseType
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
 * Captures its surroundings to create reflections.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/3d/reflection_probes.html](https://docs.godotengine.org/en/latest/tutorials/3d/reflection_probes.html)
 *
 * Capture its surroundings as a dual paraboloid image, and stores versions of it with increasing levels of blur to simulate different material roughnesses.
 *
 * The [godot.ReflectionProbe] is used to create high-quality reflections at the cost of performance. It can be combined with [godot.GIProbe]s and Screen Space Reflections to achieve high quality reflections. [godot.ReflectionProbe]s render all objects within their [cullMask], so updating them can be quite expensive. It is best to update them once with the important static objects and then leave them.
 *
 * Note: By default Godot will only render 16 reflection probes. If you need more, increase the number of atlas subdivisions. This setting can be found in [godot.ProjectSettings.rendering/quality/reflections/atlasSubdiv].
 */
@GodotBaseType
open class ReflectionProbe : VisualInstance() {
  /**
   * If `true`, enables box projection. This makes reflections look more correct in rectangle-shaped rooms by offsetting the reflection center depending on the camera's location.
   */
  open var boxProjection: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_GET_BOX_PROJECTION, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_BOX_PROJECTION, NIL)
    }

  /**
   * Sets the cull mask which determines what objects are drawn by this probe. Every [godot.VisualInstance] with a layer included in this cull mask will be rendered by the probe. It is best to only include large objects which are likely to take up a lot of space in the reflection in order to save on rendering cost.
   */
  open var cullMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_GET_CULL_MASK,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_CULL_MASK,
          NIL)
    }

  /**
   * If `true`, computes shadows in the reflection probe. This makes the reflection probe slower to render; you may want to disable this if using the [UPDATE_ALWAYS] [updateMode].
   */
  open var enableShadows: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_GET_ENABLE_SHADOWS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_ENABLE_SHADOWS, NIL)
    }

  /**
   * The size of the reflection probe. The larger the extents the more space covered by the probe which will lower the perceived resolution. It is best to keep the extents only as large as you need them.
   */
  open var extents: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_GET_EXTENTS,
          VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(value) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_EXTENTS, NIL)
    }

  /**
   * Defines the reflection intensity. Intensity modulates the strength of the reflection.
   */
  open var intensity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_GET_INTENSITY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_INTENSITY,
          NIL)
    }

  /**
   * Sets the ambient light color to be used when this probe is set to [interiorEnable].
   */
  open var interiorAmbientColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_GET_INTERIOR_AMBIENT_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(value) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_INTERIOR_AMBIENT_COLOR, NIL)
    }

  /**
   * Sets the contribution value for how much the reflection affects the ambient light for this reflection probe when set to [interiorEnable]. Useful so that ambient light matches the color of the room.
   */
  open var interiorAmbientContrib: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_GET_INTERIOR_AMBIENT_CONTRIB, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_INTERIOR_AMBIENT_CONTRIB, NIL)
    }

  /**
   * Sets the energy multiplier for this reflection probe's ambient light contribution when set to [interiorEnable].
   */
  open var interiorAmbientEnergy: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_GET_INTERIOR_AMBIENT_ENERGY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_INTERIOR_AMBIENT_ENERGY, NIL)
    }

  /**
   * If `true`, reflections will ignore sky contribution. Ambient lighting is then controlled by the `interior_ambient_*` properties.
   */
  open var interiorEnable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_GET_INTERIOR_ENABLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_INTERIOR_ENABLE, NIL)
    }

  /**
   * Sets the max distance away from the probe an object can be before it is culled.
   */
  open var maxDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_GET_MAX_DISTANCE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_MAX_DISTANCE,
          NIL)
    }

  /**
   * Sets the origin offset to be used when this reflection probe is in box project mode.
   */
  open var originOffset: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_GET_ORIGIN_OFFSET,
          VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(value) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_ORIGIN_OFFSET,
          NIL)
    }

  /**
   * Sets how frequently the probe is updated. Can be [UPDATE_ONCE] or [UPDATE_ALWAYS].
   */
  open var updateMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_GET_UPDATE_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFLECTIONPROBE_SET_UPDATE_MODE,
          NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_REFLECTIONPROBE)
  }

  @CoreTypeHelper
  open fun extents(schedule: Vector3.() -> Unit): Vector3 = extents.apply{
      schedule(this)
      extents = this
  }


  @CoreTypeHelper
  open fun interiorAmbientColor(schedule: Color.() -> Unit): Color = interiorAmbientColor.apply{
      schedule(this)
      interiorAmbientColor = this
  }


  @CoreTypeHelper
  open fun originOffset(schedule: Vector3.() -> Unit): Vector3 = originOffset.apply{
      schedule(this)
      originOffset = this
  }


  enum class UpdateMode(
    id: Long
  ) {
    /**
     * Update the probe once on the next frame.
     */
    UPDATE_ONCE(0),

    /**
     * Update the probe every frame. This is needed when you want to capture dynamic objects. However, it results in an increased render time. Use [UPDATE_ONCE] whenever possible.
     */
    UPDATE_ALWAYS(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     * Update the probe every frame. This is needed when you want to capture dynamic objects. However, it results in an increased render time. Use [UPDATE_ONCE] whenever possible.
     */
    final const val UPDATE_ALWAYS: Long = 1

    /**
     * Update the probe once on the next frame.
     */
    final const val UPDATE_ONCE: Long = 0
  }
}
