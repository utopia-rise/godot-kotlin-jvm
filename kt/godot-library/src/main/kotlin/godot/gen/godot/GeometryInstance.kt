// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.AABB
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress

/**
 * Base node for geometry-based visual instances.
 *
 * Base node for geometry-based visual instances. Shares some common functionality like visibility and custom materials.
 */
@GodotBaseType
open class GeometryInstance : VisualInstance() {
  /**
   * The selected shadow casting flag. See [enum ShadowCastingSetting] for possible values.
   */
  open var castShadow: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE_GET_CAST_SHADOW,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE_SET_CAST_SHADOW,
          NIL)
    }

  /**
   * The extra distance added to the GeometryInstance's bounding box ([AABB]) to increase its cull box.
   */
  open var extraCullMargin: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE_GET_EXTRA_CULL_MARGIN, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE_SET_EXTRA_CULL_MARGIN, NIL)
    }

  /**
   * When disabled, the mesh will be taken into account when computing indirect lighting, but the resulting lightmap will not be saved. Useful for emissive only materials or shadow casters.
   */
  open var generateLightmap: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE_GET_GENERATE_LIGHTMAP, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE_SET_GENERATE_LIGHTMAP, NIL)
    }

  /**
   * Scale factor for the generated baked lightmap. Useful for adding detail to certain mesh instances.
   */
  open var lightmapScale: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE_GET_LIGHTMAP_SCALE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE_SET_LIGHTMAP_SCALE, NIL)
    }

  /**
   * The GeometryInstance's max LOD distance.
   *
   * **Note:** This property currently has no effect.
   */
  open var lodMaxDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE_GET_LOD_MAX_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE_SET_LOD_MAX_DISTANCE, NIL)
    }

  /**
   * The GeometryInstance's max LOD margin.
   *
   * **Note:** This property currently has no effect.
   */
  open var lodMaxHysteresis: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE_GET_LOD_MAX_HYSTERESIS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE_SET_LOD_MAX_HYSTERESIS, NIL)
    }

  /**
   * The GeometryInstance's min LOD distance.
   *
   * **Note:** This property currently has no effect.
   */
  open var lodMinDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE_GET_LOD_MIN_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE_SET_LOD_MIN_DISTANCE, NIL)
    }

  /**
   * The GeometryInstance's min LOD margin.
   *
   * **Note:** This property currently has no effect.
   */
  open var lodMinHysteresis: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE_GET_LOD_MIN_HYSTERESIS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE_SET_LOD_MIN_HYSTERESIS, NIL)
    }

  /**
   * The material override for the whole geometry.
   *
   * If a material is assigned to this property, it will be used instead of any material set in any material slot of the mesh.
   */
  open var materialOverride: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE_GET_MATERIAL_OVERRIDE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Material?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE_SET_MATERIAL_OVERRIDE, NIL)
    }

  /**
   * If `true`, this GeometryInstance will be used when baking lights using a [godot.GIProbe] or [godot.BakedLightmap].
   */
  open var useInBakedLight: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE_GET_USE_IN_BAKED_LIGHT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE_SET_USE_IN_BAKED_LIGHT, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_GEOMETRYINSTANCE)
  }

  /**
   * Overrides the bounding box of this node with a custom one. To remove it, set an [AABB] with all fields set to zero.
   */
  open fun setCustomAabb(aabb: AABB) {
    TransferContext.writeArguments(godot.core.VariantType.AABB to aabb)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GEOMETRYINSTANCE_SET_CUSTOM_AABB,
        NIL)
  }

  enum class Flags(
    id: Long
  ) {
    /**
     * Will allow the GeometryInstance to be used when baking lights using a [godot.GIProbe] or [godot.BakedLightmap].
     */
    FLAG_USE_BAKED_LIGHT(0),

    /**
     * Unused in this class, exposed for consistency with [enum VisualServer.InstanceFlags].
     */
    FLAG_DRAW_NEXT_FRAME_IF_VISIBLE(1),

    /**
     * Represents the size of the [enum Flags] enum.
     */
    FLAG_MAX(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ShadowCastingSetting(
    id: Long
  ) {
    /**
     * Will not cast any shadows.
     */
    SHADOW_CASTING_SETTING_OFF(0),

    /**
     * Will cast shadows from all visible faces in the GeometryInstance.
     *
     * Will take culling into account, so faces not being rendered will not be taken into account when shadow casting.
     */
    SHADOW_CASTING_SETTING_ON(1),

    /**
     * Will cast shadows from all visible faces in the GeometryInstance.
     *
     * Will not take culling into account, so all faces will be taken into account when shadow casting.
     */
    SHADOW_CASTING_SETTING_DOUBLE_SIDED(2),

    /**
     * Will only show the shadows casted from this object.
     *
     * In other words, the actual mesh will not be visible, only the shadows casted from the mesh will be.
     */
    SHADOW_CASTING_SETTING_SHADOWS_ONLY(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class LightmapScale(
    id: Long
  ) {
    /**
     * The generated lightmap texture will have the original size.
     */
    LIGHTMAP_SCALE_1X(0),

    /**
     * The generated lightmap texture will be twice as large, on each axis.
     */
    LIGHTMAP_SCALE_2X(1),

    /**
     * The generated lightmap texture will be 4 times as large, on each axis.
     */
    LIGHTMAP_SCALE_4X(2),

    /**
     * The generated lightmap texture will be 8 times as large, on each axis.
     */
    LIGHTMAP_SCALE_8X(3),

    /**
     *
     */
    LIGHTMAP_SCALE_MAX(4);

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
     * Unused in this class, exposed for consistency with [enum VisualServer.InstanceFlags].
     */
    final const val FLAG_DRAW_NEXT_FRAME_IF_VISIBLE: Long = 1

    /**
     * Represents the size of the [enum Flags] enum.
     */
    final const val FLAG_MAX: Long = 2

    /**
     * Will allow the GeometryInstance to be used when baking lights using a [godot.GIProbe] or [godot.BakedLightmap].
     */
    final const val FLAG_USE_BAKED_LIGHT: Long = 0

    /**
     * The generated lightmap texture will have the original size.
     */
    final const val LIGHTMAP_SCALE_1X: Long = 0

    /**
     * The generated lightmap texture will be twice as large, on each axis.
     */
    final const val LIGHTMAP_SCALE_2X: Long = 1

    /**
     * The generated lightmap texture will be 4 times as large, on each axis.
     */
    final const val LIGHTMAP_SCALE_4X: Long = 2

    /**
     * The generated lightmap texture will be 8 times as large, on each axis.
     */
    final const val LIGHTMAP_SCALE_8X: Long = 3

    /**
     *
     */
    final const val LIGHTMAP_SCALE_MAX: Long = 4

    /**
     * Will cast shadows from all visible faces in the GeometryInstance.
     *
     * Will not take culling into account, so all faces will be taken into account when shadow casting.
     */
    final const val SHADOW_CASTING_SETTING_DOUBLE_SIDED: Long = 2

    /**
     * Will not cast any shadows.
     */
    final const val SHADOW_CASTING_SETTING_OFF: Long = 0

    /**
     * Will cast shadows from all visible faces in the GeometryInstance.
     *
     * Will take culling into account, so faces not being rendered will not be taken into account when shadow casting.
     */
    final const val SHADOW_CASTING_SETTING_ON: Long = 1

    /**
     * Will only show the shadows casted from this object.
     *
     * In other words, the actual mesh will not be visible, only the shadows casted from the mesh will be.
     */
    final const val SHADOW_CASTING_SETTING_SHADOWS_ONLY: Long = 3
  }
}
