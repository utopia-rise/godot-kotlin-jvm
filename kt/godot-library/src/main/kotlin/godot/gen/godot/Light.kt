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
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Provides a base class for different kinds of light nodes.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/678](https://godotengine.org/asset-library/asset/678)
 *
 * Light is the *abstract* base class for light nodes. As it can't be instanced, it shouldn't be used directly. Other types of light nodes inherit from it. Light contains the common variables and parameters used for lighting.
 */
@GodotBaseType
open class Light : VisualInstance() {
  /**
   * If `true`, the light only appears in the editor and will not be visible at runtime.
   */
  open var editorOnly: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT_GET_EDITOR_ONLY, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT_SET_EDITOR_ONLY, NIL)
    }

  /**
   * The light's bake mode. See [enum BakeMode].
   */
  open var lightBakeMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT_GET_LIGHT_BAKE_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT_SET_LIGHT_BAKE_MODE, NIL)
    }

  /**
   * The light's color. An *overbright* color can be used to achieve a result equivalent to increasing the light's [lightEnergy].
   */
  open var lightColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT_GET_LIGHT_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(value) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT_SET_LIGHT_COLOR, NIL)
    }

  /**
   * The light will affect objects in the selected layers.
   */
  open var lightCullMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT_GET_LIGHT_CULL_MASK, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT_SET_LIGHT_CULL_MASK, NIL)
    }

  /**
   * The light's strength multiplier (this is not a physical unit). For [godot.OmniLight] and [godot.SpotLight], changing this value will only change the light color's intensity, not the light's radius.
   */
  open var lightEnergy: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT_GET_LIGHT_ENERGY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT_SET_LIGHT_ENERGY, NIL)
    }

  /**
   * Secondary multiplier used with indirect light (light bounces). This works on both [godot.BakedLightmap] and [godot.GIProbe].
   */
  open var lightIndirectEnergy: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT_GET_LIGHT_INDIRECT_ENERGY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT_SET_LIGHT_INDIRECT_ENERGY,
          NIL)
    }

  /**
   * If `true`, the light's effect is reversed, darkening areas and casting bright shadows.
   */
  open var lightNegative: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT_GET_LIGHT_NEGATIVE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT_SET_LIGHT_NEGATIVE, NIL)
    }

  /**
   * The intensity of the specular blob in objects affected by the light. At `0`, the light becomes a pure diffuse light. When not baking emission, this can be used to avoid unrealistic reflections when placing lights above an emissive surface.
   */
  open var lightSpecular: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT_GET_LIGHT_SPECULAR, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT_SET_LIGHT_SPECULAR, NIL)
    }

  /**
   * Used to adjust shadow appearance. Too small a value results in self-shadowing ("shadow acne"), while too large a value causes shadows to separate from casters ("peter-panning"). Adjust as needed.
   */
  open var shadowBias: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT_GET_SHADOW_BIAS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT_SET_SHADOW_BIAS, NIL)
    }

  /**
   * The color of shadows cast by this light.
   */
  open var shadowColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT_GET_SHADOW_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(value) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT_SET_SHADOW_COLOR, NIL)
    }

  /**
   * Attempts to reduce [shadowBias] gap.
   */
  open var shadowContact: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT_GET_SHADOW_CONTACT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT_SET_SHADOW_CONTACT, NIL)
    }

  /**
   * If `true`, the light will cast shadows.
   */
  open var shadowEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT_GET_SHADOW_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT_SET_SHADOW_ENABLED, NIL)
    }

  /**
   * If `true`, reverses the backface culling of the mesh. This can be useful when you have a flat mesh that has a light behind it. If you need to cast a shadow on both sides of the mesh, set the mesh to use double-sided shadows with [godot.GeometryInstance.SHADOW_CASTING_SETTING_DOUBLE_SIDED].
   */
  open var shadowReverseCullFace: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LIGHT_GET_SHADOW_REVERSE_CULL_FACE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LIGHT_SET_SHADOW_REVERSE_CULL_FACE, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_LIGHT)
  }

  @CoreTypeHelper
  open fun lightColor(schedule: Color.() -> Unit): Color = lightColor.apply{
      schedule(this)
      lightColor = this
  }


  @CoreTypeHelper
  open fun shadowColor(schedule: Color.() -> Unit): Color = shadowColor.apply{
      schedule(this)
      shadowColor = this
  }


  enum class BakeMode(
    id: Long
  ) {
    /**
     * Light is ignored when baking.
     *
     * **Note:** Hiding a light does *not* affect baking.
     */
    BAKE_DISABLED(0),

    /**
     * Only indirect lighting will be baked (default).
     */
    BAKE_INDIRECT(1),

    /**
     * Both direct and indirect light will be baked.
     *
     * **Note:** You should hide the light if you don't want it to appear twice (dynamic and baked).
     */
    BAKE_ALL(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Param(
    id: Long
  ) {
    /**
     * Constant for accessing [lightEnergy].
     */
    PARAM_ENERGY(0),

    /**
     * Constant for accessing [lightIndirectEnergy].
     */
    PARAM_INDIRECT_ENERGY(1),

    /**
     * Constant for accessing [lightSpecular].
     */
    PARAM_SPECULAR(2),

    /**
     * Constant for accessing [godot.OmniLight.omniRange] or [godot.SpotLight.spotRange].
     */
    PARAM_RANGE(3),

    /**
     * Constant for accessing [godot.OmniLight.omniAttenuation] or [godot.SpotLight.spotAttenuation].
     */
    PARAM_ATTENUATION(4),

    /**
     * Constant for accessing [godot.SpotLight.spotAngle].
     */
    PARAM_SPOT_ANGLE(5),

    /**
     * Constant for accessing [godot.SpotLight.spotAngleAttenuation].
     */
    PARAM_SPOT_ATTENUATION(6),

    /**
     * Constant for accessing [shadowContact].
     */
    PARAM_CONTACT_SHADOW_SIZE(7),

    /**
     * Constant for accessing [godot.DirectionalLight.directionalShadowMaxDistance].
     */
    PARAM_SHADOW_MAX_DISTANCE(8),

    /**
     * Constant for accessing [godot.DirectionalLight.directionalShadowSplit1].
     */
    PARAM_SHADOW_SPLIT_1_OFFSET(9),

    /**
     * Constant for accessing [godot.DirectionalLight.directionalShadowSplit2].
     */
    PARAM_SHADOW_SPLIT_2_OFFSET(10),

    /**
     * Constant for accessing [godot.DirectionalLight.directionalShadowSplit3].
     */
    PARAM_SHADOW_SPLIT_3_OFFSET(11),

    /**
     * Constant for accessing [godot.DirectionalLight.directionalShadowNormalBias].
     */
    PARAM_SHADOW_NORMAL_BIAS(12),

    /**
     * Constant for accessing [shadowBias].
     */
    PARAM_SHADOW_BIAS(13),

    /**
     * Constant for accessing [godot.DirectionalLight.directionalShadowBiasSplitScale].
     */
    PARAM_SHADOW_BIAS_SPLIT_SCALE(14),

    /**
     * Represents the size of the [enum Param] enum.
     */
    PARAM_MAX(15);

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
     * Both direct and indirect light will be baked.
     *
     * **Note:** You should hide the light if you don't want it to appear twice (dynamic and baked).
     */
    final const val BAKE_ALL: Long = 2

    /**
     * Light is ignored when baking.
     *
     * **Note:** Hiding a light does *not* affect baking.
     */
    final const val BAKE_DISABLED: Long = 0

    /**
     * Only indirect lighting will be baked (default).
     */
    final const val BAKE_INDIRECT: Long = 1

    /**
     * Constant for accessing [godot.OmniLight.omniAttenuation] or [godot.SpotLight.spotAttenuation].
     */
    final const val PARAM_ATTENUATION: Long = 4

    /**
     * Constant for accessing [shadowContact].
     */
    final const val PARAM_CONTACT_SHADOW_SIZE: Long = 7

    /**
     * Constant for accessing [lightEnergy].
     */
    final const val PARAM_ENERGY: Long = 0

    /**
     * Constant for accessing [lightIndirectEnergy].
     */
    final const val PARAM_INDIRECT_ENERGY: Long = 1

    /**
     * Represents the size of the [enum Param] enum.
     */
    final const val PARAM_MAX: Long = 15

    /**
     * Constant for accessing [godot.OmniLight.omniRange] or [godot.SpotLight.spotRange].
     */
    final const val PARAM_RANGE: Long = 3

    /**
     * Constant for accessing [shadowBias].
     */
    final const val PARAM_SHADOW_BIAS: Long = 13

    /**
     * Constant for accessing [godot.DirectionalLight.directionalShadowBiasSplitScale].
     */
    final const val PARAM_SHADOW_BIAS_SPLIT_SCALE: Long = 14

    /**
     * Constant for accessing [godot.DirectionalLight.directionalShadowMaxDistance].
     */
    final const val PARAM_SHADOW_MAX_DISTANCE: Long = 8

    /**
     * Constant for accessing [godot.DirectionalLight.directionalShadowNormalBias].
     */
    final const val PARAM_SHADOW_NORMAL_BIAS: Long = 12

    /**
     * Constant for accessing [godot.DirectionalLight.directionalShadowSplit1].
     */
    final const val PARAM_SHADOW_SPLIT_1_OFFSET: Long = 9

    /**
     * Constant for accessing [godot.DirectionalLight.directionalShadowSplit2].
     */
    final const val PARAM_SHADOW_SPLIT_2_OFFSET: Long = 10

    /**
     * Constant for accessing [godot.DirectionalLight.directionalShadowSplit3].
     */
    final const val PARAM_SHADOW_SPLIT_3_OFFSET: Long = 11

    /**
     * Constant for accessing [lightSpecular].
     */
    final const val PARAM_SPECULAR: Long = 2

    /**
     * Constant for accessing [godot.SpotLight.spotAngle].
     */
    final const val PARAM_SPOT_ANGLE: Long = 5

    /**
     * Constant for accessing [godot.SpotLight.spotAngleAttenuation].
     */
    final const val PARAM_SPOT_ATTENUATION: Long = 6
  }
}
