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
import godot.core.TypeManager
import godot.core.VariantType.ANY
import godot.core.VariantType.COLOR
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Represents a light as defined by the `KHR_lights_punctual` GLTF extension.
 */
@GodotBaseType
public open class GLTFLight : Resource() {
  /**
   * The [Color] of the light. Defaults to white. A black color causes the light to have no effect.
   */
  @CoreTypeLocalCopy
  public var color: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setColorPtr, NIL)
    }

  /**
   * The intensity of the light. This is expressed in candelas (lumens per steradian) for point and
   * spot lights, and lux (lumens per m²) for directional lights. When creating a Godot light, this
   * value is converted to a unitless multiplier.
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
   * The type of the light. The values accepted by Godot are "point", "spot", and "directional",
   * which correspond to Godot's [OmniLight3D], [SpotLight3D], and [DirectionalLight3D] respectively.
   */
  public var lightType: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLightTypePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLightTypePtr, NIL)
    }

  /**
   * The range of the light, beyond which the light has no effect. GLTF lights with no range defined
   * behave like physical lights (which have infinite range). When creating a Godot light, the range is
   * clamped to 4096.
   */
  public var range: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRangePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRangePtr, NIL)
    }

  /**
   * The inner angle of the cone in a spotlight. Must be less than or equal to the outer cone angle.
   * Within this angle, the light is at full brightness. Between the inner and outer cone angles,
   * there is a transition from full brightness to zero brightness. When creating a Godot
   * [SpotLight3D], the ratio between the inner and outer cone angles is used to calculate the
   * attenuation of the light.
   */
  public var innerConeAngle: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getInnerConeAnglePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setInnerConeAnglePtr, NIL)
    }

  /**
   * The outer angle of the cone in a spotlight. Must be greater than or equal to the inner angle.
   * At this angle, the light drops off to zero brightness. Between the inner and outer cone angles,
   * there is a transition from full brightness to zero brightness. If this angle is a half turn, then
   * the spotlight emits in all directions. When creating a Godot [SpotLight3D], the outer cone angle
   * is used as the angle of the spotlight.
   */
  public var outerConeAngle: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOuterConeAnglePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setOuterConeAnglePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_GLTFLIGHT, scriptIndex)
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
  public open fun colorMutate(block: Color.() -> Unit): Color = color.apply{
      block(this)
      color = this
  }


  /**
   * Converts this GLTFLight instance into a Godot [Light3D] node.
   */
  public fun toNode(): Light3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.toNodePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Light3D?)
  }

  /**
   * Serializes this GLTFLight instance into a [Dictionary].
   */
  public fun toDictionary(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.toDictionaryPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public fun getAdditionalData(extensionName: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to extensionName)
    TransferContext.callMethod(rawPtr, MethodBindings.getAdditionalDataPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public fun setAdditionalData(extensionName: StringName, additionalData: Any?): Unit {
    TransferContext.writeArguments(STRING_NAME to extensionName, ANY to additionalData)
    TransferContext.callMethod(rawPtr, MethodBindings.setAdditionalDataPtr, NIL)
  }

  public companion object {
    /**
     * Create a new GLTFLight instance from the given Godot [Light3D] node.
     */
    public fun fromNode(lightNode: Light3D): GLTFLight? {
      TransferContext.writeArguments(OBJECT to lightNode)
      TransferContext.callMethod(0, MethodBindings.fromNodePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as GLTFLight?)
    }

    /**
     * Creates a new GLTFLight instance by parsing the given [Dictionary].
     */
    public fun fromDictionary(dictionary: Dictionary<Any?, Any?>): GLTFLight? {
      TransferContext.writeArguments(DICTIONARY to dictionary)
      TransferContext.callMethod(0, MethodBindings.fromDictionaryPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as GLTFLight?)
    }
  }

  internal object MethodBindings {
    public val fromNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFLight", "from_node", 3907677874)

    public val toNodePtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFLight", "to_node", 2040811672)

    public val fromDictionaryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFLight", "from_dictionary", 4057087208)

    public val toDictionaryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFLight", "to_dictionary", 3102165223)

    public val getColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFLight", "get_color", 3200896285)

    public val setColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFLight", "set_color", 2920490490)

    public val getIntensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFLight", "get_intensity", 191475506)

    public val setIntensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFLight", "set_intensity", 373806689)

    public val getLightTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFLight", "get_light_type", 2841200299)

    public val setLightTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFLight", "set_light_type", 83702148)

    public val getRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFLight", "get_range", 191475506)

    public val setRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFLight", "set_range", 373806689)

    public val getInnerConeAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFLight", "get_inner_cone_angle", 191475506)

    public val setInnerConeAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFLight", "set_inner_cone_angle", 373806689)

    public val getOuterConeAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFLight", "get_outer_cone_angle", 191475506)

    public val setOuterConeAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFLight", "set_outer_cone_angle", 373806689)

    public val getAdditionalDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFLight", "get_additional_data", 2138907829)

    public val setAdditionalDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFLight", "set_additional_data", 3776071444)
  }
}
