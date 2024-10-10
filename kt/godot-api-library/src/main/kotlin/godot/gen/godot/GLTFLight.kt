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
import godot.core.Dictionary
import godot.core.StringName
import godot.core.VariantCaster.ANY
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DICTIONARY
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.core.VariantParser.STRING_NAME
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_GLTFLIGHT_INDEX: Int = 239

/**
 * Represents a light as defined by the `KHR_lights_punctual` GLTF extension.
 */
@GodotBaseType
public open class GLTFLight : Resource() {
  /**
   * The [Color] of the light. Defaults to white. A black color causes the light to have no effect.
   */
  @CoreTypeLocalCopy
  public final inline var color: Color
    @JvmName("colorProperty")
    get() = getColor()
    @JvmName("colorProperty")
    set(`value`) {
      setColor(value)
    }

  /**
   * The intensity of the light. This is expressed in candelas (lumens per steradian) for point and
   * spot lights, and lux (lumens per m²) for directional lights. When creating a Godot light, this
   * value is converted to a unitless multiplier.
   */
  public final inline var intensity: Float
    @JvmName("intensityProperty")
    get() = getIntensity()
    @JvmName("intensityProperty")
    set(`value`) {
      setIntensity(value)
    }

  /**
   * The type of the light. The values accepted by Godot are "point", "spot", and "directional",
   * which correspond to Godot's [OmniLight3D], [SpotLight3D], and [DirectionalLight3D] respectively.
   */
  public final inline var lightType: String
    @JvmName("lightTypeProperty")
    get() = getLightType()
    @JvmName("lightTypeProperty")
    set(`value`) {
      setLightType(value)
    }

  /**
   * The range of the light, beyond which the light has no effect. GLTF lights with no range defined
   * behave like physical lights (which have infinite range). When creating a Godot light, the range is
   * clamped to 4096.
   */
  public final inline var range: Float
    @JvmName("rangeProperty")
    get() = getRange()
    @JvmName("rangeProperty")
    set(`value`) {
      setRange(value)
    }

  /**
   * The inner angle of the cone in a spotlight. Must be less than or equal to the outer cone angle.
   * Within this angle, the light is at full brightness. Between the inner and outer cone angles,
   * there is a transition from full brightness to zero brightness. When creating a Godot
   * [SpotLight3D], the ratio between the inner and outer cone angles is used to calculate the
   * attenuation of the light.
   */
  public final inline var innerConeAngle: Float
    @JvmName("innerConeAngleProperty")
    get() = getInnerConeAngle()
    @JvmName("innerConeAngleProperty")
    set(`value`) {
      setInnerConeAngle(value)
    }

  /**
   * The outer angle of the cone in a spotlight. Must be greater than or equal to the inner angle.
   * At this angle, the light drops off to zero brightness. Between the inner and outer cone angles,
   * there is a transition from full brightness to zero brightness. If this angle is a half turn, then
   * the spotlight emits in all directions. When creating a Godot [SpotLight3D], the outer cone angle
   * is used as the angle of the spotlight.
   */
  public final inline var outerConeAngle: Float
    @JvmName("outerConeAngleProperty")
    get() = getOuterConeAngle()
    @JvmName("outerConeAngleProperty")
    set(`value`) {
      setOuterConeAngle(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_GLTFLIGHT_INDEX, scriptIndex)
  }

  /**
   * The [Color] of the light. Defaults to white. A black color causes the light to have no effect.
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
   * val myCoreType = gltflight.color
   * //Your changes
   * gltflight.color = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun colorMutate(block: Color.() -> Unit): Color = color.apply{
      block(this)
      color = this
  }


  /**
   * Converts this GLTFLight instance into a Godot [Light3D] node.
   */
  public final fun toNode(): Light3D? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.toNodePtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Light3D?)
  }

  /**
   * Serializes this GLTFLight instance into a [Dictionary].
   */
  public final fun toDictionary(): Dictionary<Any?, Any?> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.toDictionaryPtr, DICTIONARY)
    return (Internals.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  public final fun getColor(): Color {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getColorPtr, COLOR)
    return (Internals.readReturnValue(COLOR) as Color)
  }

  public final fun setColor(color: Color): Unit {
    Internals.writeArguments(COLOR to color)
    Internals.callMethod(rawPtr, MethodBindings.setColorPtr, NIL)
  }

  public final fun getIntensity(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getIntensityPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setIntensity(intensity: Float): Unit {
    Internals.writeArguments(DOUBLE to intensity.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setIntensityPtr, NIL)
  }

  public final fun getLightType(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLightTypePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  public final fun setLightType(lightType: String): Unit {
    Internals.writeArguments(STRING to lightType)
    Internals.callMethod(rawPtr, MethodBindings.setLightTypePtr, NIL)
  }

  public final fun getRange(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRangePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setRange(range: Float): Unit {
    Internals.writeArguments(DOUBLE to range.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setRangePtr, NIL)
  }

  public final fun getInnerConeAngle(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getInnerConeAnglePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setInnerConeAngle(innerConeAngle: Float): Unit {
    Internals.writeArguments(DOUBLE to innerConeAngle.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setInnerConeAnglePtr, NIL)
  }

  public final fun getOuterConeAngle(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getOuterConeAnglePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setOuterConeAngle(outerConeAngle: Float): Unit {
    Internals.writeArguments(DOUBLE to outerConeAngle.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setOuterConeAnglePtr, NIL)
  }

  public final fun getAdditionalData(extensionName: StringName): Any? {
    Internals.writeArguments(STRING_NAME to extensionName)
    Internals.callMethod(rawPtr, MethodBindings.getAdditionalDataPtr, ANY)
    return (Internals.readReturnValue(ANY) as Any?)
  }

  public final fun setAdditionalData(extensionName: StringName, additionalData: Any?): Unit {
    Internals.writeArguments(STRING_NAME to extensionName, ANY to additionalData)
    Internals.callMethod(rawPtr, MethodBindings.setAdditionalDataPtr, NIL)
  }

  public companion object {
    /**
     * Create a new GLTFLight instance from the given Godot [Light3D] node.
     */
    public final fun fromNode(lightNode: Light3D?): GLTFLight? {
      Internals.writeArguments(OBJECT to lightNode)
      Internals.callMethod(0, MethodBindings.fromNodePtr, OBJECT)
      return (Internals.readReturnValue(OBJECT) as GLTFLight?)
    }

    /**
     * Creates a new GLTFLight instance by parsing the given [Dictionary].
     */
    public final fun fromDictionary(dictionary: Dictionary<Any?, Any?>): GLTFLight? {
      Internals.writeArguments(DICTIONARY to dictionary)
      Internals.callMethod(0, MethodBindings.fromDictionaryPtr, OBJECT)
      return (Internals.readReturnValue(OBJECT) as GLTFLight?)
    }
  }

  internal object MethodBindings {
    public val fromNodePtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFLight", "from_node", 3907677874)

    public val toNodePtr: VoidPtr = Internals.getMethodBindPtr("GLTFLight", "to_node", 2040811672)

    public val fromDictionaryPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFLight", "from_dictionary", 4057087208)

    public val toDictionaryPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFLight", "to_dictionary", 3102165223)

    public val getColorPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFLight", "get_color", 3200896285)

    public val setColorPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFLight", "set_color", 2920490490)

    public val getIntensityPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFLight", "get_intensity", 191475506)

    public val setIntensityPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFLight", "set_intensity", 373806689)

    public val getLightTypePtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFLight", "get_light_type", 2841200299)

    public val setLightTypePtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFLight", "set_light_type", 83702148)

    public val getRangePtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFLight", "get_range", 191475506)

    public val setRangePtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFLight", "set_range", 373806689)

    public val getInnerConeAnglePtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFLight", "get_inner_cone_angle", 191475506)

    public val setInnerConeAnglePtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFLight", "set_inner_cone_angle", 373806689)

    public val getOuterConeAnglePtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFLight", "get_outer_cone_angle", 191475506)

    public val setOuterConeAnglePtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFLight", "set_outer_cone_angle", 373806689)

    public val getAdditionalDataPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFLight", "get_additional_data", 2138907829)

    public val setAdditionalDataPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFLight", "set_additional_data", 3776071444)
  }
}
