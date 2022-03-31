// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Default 3D rendering material.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/3d/standard_material_3d.html]($DOCS_URL/tutorials/3d/standard_material_3d.html)
 *
 * This provides a default material with a wide variety of rendering features and properties without the need to write shader code. See the tutorial below for details.
 */
@GodotBaseType
public open class BaseMaterial3D internal constructor() : Material() {
  /**
   * If `true`, transparency is enabled on the body. See also [blendMode].
   */
  public open var transparency: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_TRANSPARENCY,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_TRANSPARENCY,
          NIL)
    }

  /**
   * Threshold at which the alpha scissor will discard values.
   */
  public open var alphaScissorThreshold: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_ALPHA_SCISSOR_THRESHOLD, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_ALPHA_SCISSOR_THRESHOLD, NIL)
    }

  /**
   * The hashing scale for Alpha Hash. Recommended values between `0` and `2`.
   */
  public open var alphaHashScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_ALPHA_HASH_SCALE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_ALPHA_HASH_SCALE, NIL)
    }

  /**
   * The type of alpha antialiasing to apply. See [enum AlphaAntiAliasing].
   */
  public open var alphaAntialiasingMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_ALPHA_ANTIALIASING, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_ALPHA_ANTIALIASING, NIL)
    }

  /**
   * Threshold at which antialiasing will be applied on the alpha channel.
   */
  public open var alphaAntialiasingEdge: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_ALPHA_ANTIALIASING_EDGE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_ALPHA_ANTIALIASING_EDGE, NIL)
    }

  /**
   * The material's blend mode.
   *
   * **Note:** Values other than `Mix` force the object into the transparent pipeline. See [enum BlendMode].
   */
  public open var blendMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_BLEND_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_BLEND_MODE,
          NIL)
    }

  /**
   * Determines which side of the triangle to cull depending on whether the triangle faces towards or away from the camera. See [enum CullMode].
   */
  public open var cullMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_CULL_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_CULL_MODE, NIL)
    }

  /**
   * Determines when depth rendering takes place. See [enum DepthDrawMode]. See also [transparency].
   */
  public open var depthDrawMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_DEPTH_DRAW_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_DEPTH_DRAW_MODE, NIL)
    }

  /**
   * Sets whether the shading takes place per-pixel or per-vertex. Per-vertex lighting is faster, making it the best choice for mobile applications, however it looks considerably worse than per-pixel.
   */
  public open var shadingMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_SHADING_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_SHADING_MODE,
          NIL)
    }

  /**
   * The algorithm used for diffuse light scattering. See [enum DiffuseMode].
   */
  public open var diffuseMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_DIFFUSE_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_DIFFUSE_MODE,
          NIL)
    }

  /**
   * The method for rendering the specular blob. See [enum SpecularMode].
   *
   * **Note:** Only applies to the specular blob. Does not affect specular reflections from the Sky, SSR, or ReflectionProbes.
   */
  public open var specularMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_SPECULAR_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_SPECULAR_MODE,
          NIL)
    }

  /**
   * The material's base color.
   */
  public open var albedoColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_ALBEDO, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_ALBEDO, NIL)
    }

  /**
   * A high value makes the material appear more like a metal. Non-metals use their albedo as the diffuse color and add diffuse to the specular reflection. With non-metals, the reflection appears on top of the albedo color. Metals use their albedo as a multiplier to the specular reflection and set the diffuse color to black resulting in a tinted reflection. Materials work better when fully metal or fully non-metal, values between `0` and `1` should only be used for blending between metal and non-metal sections. To alter the amount of reflection use [roughness].
   */
  public open var metallic: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_METALLIC,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_METALLIC, NIL)
    }

  /**
   * Sets the size of the specular lobe. The specular lobe is the bright spot that is reflected from light sources.
   *
   * **Note:** Unlike [metallic], this is not energy-conserving, so it should be left at `0.5` in most cases. See also [roughness].
   */
  public open var metallicSpecular: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_SPECULAR,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_SPECULAR, NIL)
    }

  /**
   * Specifies the channel of the [metallicTexture] in which the metallic information is stored. This is useful when you store the information for multiple effects in a single texture. For example if you stored metallic in the red channel, roughness in the blue, and ambient occlusion in the green you could reduce the number of textures you use.
   */
  public open var metallicTextureChannel: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_METALLIC_TEXTURE_CHANNEL, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_METALLIC_TEXTURE_CHANNEL, NIL)
    }

  /**
   * Surface reflection. A value of `0` represents a perfect mirror while a value of `1` completely blurs the reflection. See also [metallic].
   */
  public open var roughness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_ROUGHNESS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_ROUGHNESS, NIL)
    }

  /**
   * Specifies the channel of the [aoTexture] in which the ambient occlusion information is stored. This is useful when you store the information for multiple effects in a single texture. For example if you stored metallic in the red channel, roughness in the blue, and ambient occlusion in the green you could reduce the number of textures you use.
   */
  public open var roughnessTextureChannel: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_ROUGHNESS_TEXTURE_CHANNEL, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_ROUGHNESS_TEXTURE_CHANNEL, NIL)
    }

  /**
   * The emitted light's color. See [emissionEnabled].
   */
  public open var emission: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_EMISSION,
          COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_EMISSION, NIL)
    }

  /**
   * The emitted light's strength. See [emissionEnabled].
   */
  public open var emissionEnergy: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_EMISSION_ENERGY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_EMISSION_ENERGY, NIL)
    }

  /**
   * Sets how [emission] interacts with [emissionTexture]. Can either add or multiply. See [enum EmissionOperator] for options.
   */
  public open var emissionOperator: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_EMISSION_OPERATOR, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_EMISSION_OPERATOR, NIL)
    }

  /**
   * The strength of the normal map's effect.
   */
  public open var normalScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_NORMAL_SCALE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_NORMAL_SCALE,
          NIL)
    }

  /**
   * Sets the strength of the rim lighting effect.
   */
  public open var rim: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_RIM, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_RIM, NIL)
    }

  /**
   * The amount of to blend light and albedo color when rendering rim effect. If `0` the light color is used, while `1` means albedo color is used. An intermediate value generally works best.
   */
  public open var rimTint: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_RIM_TINT,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_RIM_TINT, NIL)
    }

  /**
   * Sets the strength of the clearcoat effect. Setting to `0` looks the same as disabling the clearcoat effect.
   */
  public open var clearcoat: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_CLEARCOAT,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_CLEARCOAT, NIL)
    }

  /**
   * Sets the roughness of the clearcoat pass. A higher value results in a rougher clearcoat while a lower value results in a smoother clearcoat.
   */
  public open var clearcoatRoughness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_CLEARCOAT_ROUGHNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_CLEARCOAT_ROUGHNESS, NIL)
    }

  /**
   * The strength of the anisotropy effect. This is multiplied by [anisotropyFlowmap]'s alpha channel if a texture is defined there and the texture contains an alpha channel.
   */
  public open var anisotropy: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_ANISOTROPY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_ANISOTROPY,
          NIL)
    }

  /**
   * Amount that ambient occlusion affects lighting from lights. If `0`, ambient occlusion only affects ambient light. If `1`, ambient occlusion affects lights just as much as it affects ambient light. This can be used to impact the strength of the ambient occlusion effect, but typically looks unrealistic.
   */
  public open var aoLightAffect: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_AO_LIGHT_AFFECT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_AO_LIGHT_AFFECT, NIL)
    }

  /**
   * Specifies the channel of the [aoTexture] in which the ambient occlusion information is stored. This is useful when you store the information for multiple effects in a single texture. For example if you stored metallic in the red channel, roughness in the blue, and ambient occlusion in the green you could reduce the number of textures you use.
   */
  public open var aoTextureChannel: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_AO_TEXTURE_CHANNEL, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_AO_TEXTURE_CHANNEL, NIL)
    }

  /**
   *
   */
  public open var heightmapScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_HEIGHTMAP_SCALE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_HEIGHTMAP_SCALE, NIL)
    }

  /**
   *
   */
  public open var heightmapDeepParallax: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_IS_HEIGHTMAP_DEEP_PARALLAX_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_HEIGHTMAP_DEEP_PARALLAX, NIL)
    }

  /**
   *
   */
  public open var heightmapMinLayers: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_HEIGHTMAP_DEEP_PARALLAX_MIN_LAYERS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_HEIGHTMAP_DEEP_PARALLAX_MIN_LAYERS, NIL)
    }

  /**
   *
   */
  public open var heightmapMaxLayers: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_HEIGHTMAP_DEEP_PARALLAX_MAX_LAYERS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_HEIGHTMAP_DEEP_PARALLAX_MAX_LAYERS, NIL)
    }

  /**
   *
   */
  public open var heightmapFlipTangent: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_HEIGHTMAP_DEEP_PARALLAX_FLIP_TANGENT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_HEIGHTMAP_DEEP_PARALLAX_FLIP_TANGENT, NIL)
    }

  /**
   *
   */
  public open var heightmapFlipBinormal: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_HEIGHTMAP_DEEP_PARALLAX_FLIP_BINORMAL, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_HEIGHTMAP_DEEP_PARALLAX_FLIP_BINORMAL, NIL)
    }

  /**
   * The strength of the subsurface scattering effect.
   */
  public open var subsurfScatterStrength: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_SUBSURFACE_SCATTERING_STRENGTH, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_SUBSURFACE_SCATTERING_STRENGTH, NIL)
    }

  /**
   *
   */
  public open var subsurfScatterTransmittanceColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_TRANSMITTANCE_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_TRANSMITTANCE_COLOR, NIL)
    }

  /**
   *
   */
  public open var subsurfScatterTransmittanceDepth: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_TRANSMITTANCE_DEPTH, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_TRANSMITTANCE_DEPTH, NIL)
    }

  /**
   *
   */
  public open var subsurfScatterTransmittanceBoost: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_TRANSMITTANCE_BOOST, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_TRANSMITTANCE_BOOST, NIL)
    }

  /**
   * The color used by the backlight effect. Represents the light passing through an object.
   */
  public open var backlight: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_BACKLIGHT,
          COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_BACKLIGHT, NIL)
    }

  /**
   * The strength of the refraction effect.
   */
  public open var refractionScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_REFRACTION,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_REFRACTION,
          NIL)
    }

  /**
   * Specifies the channel of the [aoTexture] in which the ambient occlusion information is stored. This is useful when you store the information for multiple effects in a single texture. For example if you stored metallic in the red channel, roughness in the blue, and ambient occlusion in the green you could reduce the number of textures you use.
   */
  public open var refractionTextureChannel: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_REFRACTION_TEXTURE_CHANNEL, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_REFRACTION_TEXTURE_CHANNEL, NIL)
    }

  /**
   * Specifies how the [detailAlbedo] should blend with the current `ALBEDO`. See [enum BlendMode] for options.
   */
  public open var detailBlendMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_DETAIL_BLEND_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_DETAIL_BLEND_MODE, NIL)
    }

  /**
   * Specifies whether to use `UV` or `UV2` for the detail layer. See [enum DetailUV] for options.
   */
  public open var detailUvLayer: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_DETAIL_UV,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_DETAIL_UV, NIL)
    }

  /**
   * How much to scale the `UV` coordinates. This is multiplied by `UV` in the vertex function.
   */
  public open var uv1Scale: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_UV1_SCALE,
          VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_UV1_SCALE, NIL)
    }

  /**
   * How much to offset the `UV` coordinates. This amount will be added to `UV` in the vertex function. This can be used to offset a texture.
   */
  public open var uv1Offset: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_UV1_OFFSET,
          VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_UV1_OFFSET,
          NIL)
    }

  /**
   * A lower number blends the texture more softly while a higher number blends the texture more sharply.
   */
  public open var uv1TriplanarSharpness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_UV1_TRIPLANAR_BLEND_SHARPNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_UV1_TRIPLANAR_BLEND_SHARPNESS, NIL)
    }

  /**
   * How much to scale the `UV2` coordinates. This is multiplied by `UV2` in the vertex function.
   */
  public open var uv2Scale: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_UV2_SCALE,
          VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_UV2_SCALE, NIL)
    }

  /**
   * How much to offset the `UV2` coordinates. This amount will be added to `UV2` in the vertex function. This can be used to offset a texture.
   */
  public open var uv2Offset: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_UV2_OFFSET,
          VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_UV2_OFFSET,
          NIL)
    }

  /**
   * A lower number blends the texture more softly while a higher number blends the texture more sharply.
   */
  public open var uv2TriplanarSharpness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_UV2_TRIPLANAR_BLEND_SHARPNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_UV2_TRIPLANAR_BLEND_SHARPNESS, NIL)
    }

  /**
   * Filter flags for the texture. See [enum TextureFilter] for options.
   */
  public open var textureFilter: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_TEXTURE_FILTER,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_TEXTURE_FILTER,
          NIL)
    }

  /**
   * Controls how the object faces the camera. See [enum BillboardMode].
   *
   * **Note:** Billboard mode is not suitable for VR because the left-right vector of the camera is not horizontal when the screen is attached to your head instead of on the table. See [godot.GitHub issue #41567](https://github.com/godotengine/godot/issues/41567) for details.
   */
  public open var billboardMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_BILLBOARD_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_BILLBOARD_MODE,
          NIL)
    }

  /**
   * The number of horizontal frames in the particle sprite sheet. Only enabled when using [BILLBOARD_PARTICLES]. See [billboardMode].
   */
  public open var particlesAnimHFrames: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_PARTICLES_ANIM_H_FRAMES, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_PARTICLES_ANIM_H_FRAMES, NIL)
    }

  /**
   * The number of vertical frames in the particle sprite sheet. Only enabled when using [BILLBOARD_PARTICLES]. See [billboardMode].
   */
  public open var particlesAnimVFrames: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_PARTICLES_ANIM_V_FRAMES, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_PARTICLES_ANIM_V_FRAMES, NIL)
    }

  /**
   * If `true`, particle animations are looped. Only enabled when using [BILLBOARD_PARTICLES]. See [billboardMode].
   */
  public open var particlesAnimLoop: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_PARTICLES_ANIM_LOOP, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_PARTICLES_ANIM_LOOP, NIL)
    }

  /**
   * If `true`, enables the vertex grow setting. See [growAmount].
   */
  public open var grow: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_IS_GROW_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_GROW_ENABLED,
          NIL)
    }

  /**
   * Grows object vertices in the direction of their normals.
   */
  public open var growAmount: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_GROW, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_GROW, NIL)
    }

  /**
   * The point size in pixels. See [usePointSize].
   */
  public open var pointSize: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_POINT_SIZE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_POINT_SIZE,
          NIL)
    }

  /**
   * If `true`, the proximity fade effect is enabled. The proximity fade effect fades out each pixel based on its distance to another object.
   */
  public open var proximityFadeEnable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_IS_PROXIMITY_FADE_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_PROXIMITY_FADE,
          NIL)
    }

  /**
   * Distance over which the fade effect takes place. The larger the distance the longer it takes for an object to fade.
   */
  public open var proximityFadeDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_PROXIMITY_FADE_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_PROXIMITY_FADE_DISTANCE, NIL)
    }

  /**
   * Specifies which type of fade to use. Can be any of the [enum DistanceFadeMode]s.
   */
  public open var distanceFadeMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_DISTANCE_FADE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_DISTANCE_FADE,
          NIL)
    }

  /**
   * Distance at which the object starts to become visible. If the object is less than this distance away, it will be invisible.
   *
   * **Note:** If `distance_fade_min_distance` is greater than `distance_fade_max_distance`, the behavior will be reversed. The object will start to fade away at `distance_fade_max_distance` and will fully disappear once it reaches `distance_fade_min_distance`.
   */
  public open var distanceFadeMinDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_DISTANCE_FADE_MIN_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_DISTANCE_FADE_MIN_DISTANCE, NIL)
    }

  /**
   * Distance at which the object appears fully opaque.
   *
   * **Note:** If `distance_fade_max_distance` is less than `distance_fade_min_distance`, the behavior will be reversed. The object will start to fade away at `distance_fade_max_distance` and will fully disappear once it reaches `distance_fade_min_distance`.
   */
  public open var distanceFadeMaxDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_DISTANCE_FADE_MAX_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_DISTANCE_FADE_MAX_DISTANCE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_BASEMATERIAL3D)
  }

  /**
   * If `true`, enables the specified flag. Flags are optional behavior that can be turned on and off. Only one flag can be enabled at a time with this function, the flag enumerators cannot be bit-masked together to enable or disable multiple flags at once. Flags can also be enabled by setting the corresponding member to `true`. See [enum Flags] enumerator for options.
   */
  public open fun setFlag(flag: BaseMaterial3D.Flags, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to flag.id, BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_FLAG, NIL)
  }

  /**
   * Returns `true`, if the specified flag is enabled. See [enum Flags] enumerator for options.
   */
  public open fun getFlag(flag: BaseMaterial3D.Flags): Boolean {
    TransferContext.writeArguments(LONG to flag.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_FLAG, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * If `true`, enables the specified [enum Feature]. Many features that are available in [godot.BaseMaterial3D]s need to be enabled before use. This way the cost for using the feature is only incurred when specified. Features can also be enabled by setting the corresponding member to `true`.
   */
  public open fun setFeature(feature: BaseMaterial3D.Feature, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to feature.id, BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_FEATURE, NIL)
  }

  /**
   * Returns `true`, if the specified [enum Feature] is enabled.
   */
  public open fun getFeature(feature: BaseMaterial3D.Feature): Boolean {
    TransferContext.writeArguments(LONG to feature.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_FEATURE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the texture for the slot specified by `param`. See [enum TextureParam] for available slots.
   */
  public open fun setTexture(`param`: BaseMaterial3D.TextureParam, texture: Texture2D): Unit {
    TransferContext.writeArguments(LONG to param.id, OBJECT to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_TEXTURE, NIL)
  }

  /**
   * Returns the [godot.Texture] associated with the specified [enum TextureParam].
   */
  public open fun getTexture(`param`: BaseMaterial3D.TextureParam): Texture2D? {
    TransferContext.writeArguments(LONG to param.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_TEXTURE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
  }

  public enum class EmissionOperator(
    id: Long
  ) {
    /**
     * Adds the emission color to the color from the emission texture.
     */
    EMISSION_OP_ADD(0),
    /**
     * Multiplies the emission color by the color from the emission texture.
     */
    EMISSION_OP_MULTIPLY(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class DiffuseMode(
    id: Long
  ) {
    /**
     * Default diffuse scattering algorithm.
     */
    DIFFUSE_BURLEY(0),
    /**
     * Diffuse scattering ignores roughness.
     */
    DIFFUSE_LAMBERT(1),
    /**
     * Extends Lambert to cover more than 90 degrees when roughness increases.
     */
    DIFFUSE_LAMBERT_WRAP(2),
    /**
     * Uses a hard cut for lighting, with smoothing affected by roughness.
     */
    DIFFUSE_TOON(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ShadingMode(
    id: Long
  ) {
    /**
     * The object will not receive shadows.
     */
    SHADING_MODE_UNSHADED(0),
    /**
     * The object will be shaded per pixel. Useful for realistic shading effect.
     */
    SHADING_MODE_PER_PIXEL(1),
    /**
     * The object will be shaded per vertex. Useful when you want cheaper shaders and do not care about visual quality.
     */
    SHADING_MODE_PER_VERTEX(2),
    /**
     * Represents the size of the [enum ShadingMode] enum.
     */
    SHADING_MODE_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class SpecularMode(
    id: Long
  ) {
    /**
     * Default specular blob.
     */
    SPECULAR_SCHLICK_GGX(0),
    /**
     * Toon blob which changes size based on roughness.
     */
    SPECULAR_TOON(1),
    /**
     * No specular blob.
     */
    SPECULAR_DISABLED(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class Feature(
    id: Long
  ) {
    /**
     * Constant for setting [emissionEnabled].
     */
    FEATURE_EMISSION(0),
    /**
     * Constant for setting [normalEnabled].
     */
    FEATURE_NORMAL_MAPPING(1),
    /**
     * Constant for setting [rimEnabled].
     */
    FEATURE_RIM(2),
    /**
     * Constant for setting [clearcoatEnabled].
     */
    FEATURE_CLEARCOAT(3),
    /**
     * Constant for setting [anisotropyEnabled].
     */
    FEATURE_ANISOTROPY(4),
    /**
     * Constant for setting [aoEnabled].
     */
    FEATURE_AMBIENT_OCCLUSION(5),
    /**
     * Constant for setting [heightmapEnabled].
     */
    FEATURE_HEIGHT_MAPPING(6),
    /**
     * Constant for setting [subsurfScatterEnabled].
     */
    FEATURE_SUBSURFACE_SCATTERING(7),
    /**
     * Constant for setting [subsurfScatterTransmittanceEnabled].
     */
    FEATURE_SUBSURFACE_TRANSMITTANCE(8),
    /**
     * Constant for setting [backlightEnabled].
     */
    FEATURE_BACKLIGHT(9),
    /**
     * Constant for setting [refractionEnabled].
     */
    FEATURE_REFRACTION(10),
    /**
     * Constant for setting [detailEnabled].
     */
    FEATURE_DETAIL(11),
    /**
     * Represents the size of the [enum Feature] enum.
     */
    FEATURE_MAX(12),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class Flags(
    id: Long
  ) {
    /**
     * Disables the depth test, so this object is drawn on top of all others. However, objects drawn after it in the draw order may cover it.
     */
    FLAG_DISABLE_DEPTH_TEST(0),
    /**
     * Set `ALBEDO` to the per-vertex color specified in the mesh.
     */
    FLAG_ALBEDO_FROM_VERTEX_COLOR(1),
    /**
     * Vertex color is in sRGB space and needs to be converted to linear. Only applies in the Vulkan renderer.
     */
    FLAG_SRGB_VERTEX_COLOR(2),
    /**
     * Uses point size to alter the size of primitive points. Also changes the albedo texture lookup to use `POINT_COORD` instead of `UV`.
     */
    FLAG_USE_POINT_SIZE(3),
    /**
     * Object is scaled by depth so that it always appears the same size on screen.
     */
    FLAG_FIXED_SIZE(4),
    /**
     * Shader will keep the scale set for the mesh. Otherwise the scale is lost when billboarding. Only applies when [billboardMode] is [BILLBOARD_ENABLED].
     */
    FLAG_BILLBOARD_KEEP_SCALE(5),
    /**
     * Use triplanar texture lookup for all texture lookups that would normally use `UV`.
     */
    FLAG_UV1_USE_TRIPLANAR(6),
    /**
     * Use triplanar texture lookup for all texture lookups that would normally use `UV2`.
     */
    FLAG_UV2_USE_TRIPLANAR(7),
    /**
     * Use triplanar texture lookup for all texture lookups that would normally use `UV`.
     */
    FLAG_UV1_USE_WORLD_TRIPLANAR(8),
    /**
     * Use triplanar texture lookup for all texture lookups that would normally use `UV2`.
     */
    FLAG_UV2_USE_WORLD_TRIPLANAR(9),
    /**
     * Use `UV2` coordinates to look up from the [aoTexture].
     */
    FLAG_AO_ON_UV2(10),
    /**
     * Use `UV2` coordinates to look up from the [emissionTexture].
     */
    FLAG_EMISSION_ON_UV2(11),
    /**
     * Forces the shader to convert albedo from sRGB space to linear space.
     */
    FLAG_ALBEDO_TEXTURE_FORCE_SRGB(12),
    /**
     * Disables receiving shadows from other objects.
     */
    FLAG_DONT_RECEIVE_SHADOWS(13),
    /**
     * Disables receiving ambient light.
     */
    FLAG_DISABLE_AMBIENT_LIGHT(14),
    /**
     * Enables the shadow to opacity feature.
     */
    FLAG_USE_SHADOW_TO_OPACITY(15),
    /**
     * Enables the texture to repeat when UV coordinates are outside the 0-1 range. If using one of the linear filtering modes, this can result in artifacts at the edges of a texture when the sampler filters across the edges of the texture.
     */
    FLAG_USE_TEXTURE_REPEAT(16),
    /**
     * Invert values read from a depth texture to convert them to height values (heightmap).
     */
    FLAG_INVERT_HEIGHTMAP(17),
    /**
     * Enables the skin mode for subsurface scattering which is used to improve the look of subsurface scattering when used for human skin.
     */
    FLAG_SUBSURFACE_MODE_SKIN(18),
    /**
     *
     */
    FLAG_PARTICLE_TRAILS_MODE(19),
    /**
     * Represents the size of the [enum Flags] enum.
     */
    FLAG_MAX(20),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class CullMode(
    id: Long
  ) {
    /**
     * Default cull mode. The back of the object is culled when not visible. Back face triangles will be culled when facing the camera. This results in only the front side of triangles being drawn. For closed-surface meshes this means that only the exterior of the mesh will be visible.
     */
    CULL_BACK(0),
    /**
     * Front face triangles will be culled when facing the camera. This results in only the back side of triangles being drawn. For closed-surface meshes this means that the interior of the mesh will be drawn instead of the exterior.
     */
    CULL_FRONT(1),
    /**
     * No culling is performed.
     */
    CULL_DISABLED(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class DetailUV(
    id: Long
  ) {
    /**
     * Use `UV` with the detail texture.
     */
    DETAIL_UV_1(0),
    /**
     * Use `UV2` with the detail texture.
     */
    DETAIL_UV_2(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class TextureFilter(
    id: Long
  ) {
    /**
     * The texture filter reads from the nearest pixel only. The simplest and fastest method of filtering, but the texture will look pixelized.
     */
    TEXTURE_FILTER_NEAREST(0),
    /**
     * The texture filter blends between the nearest 4 pixels. Use this when you want to avoid a pixelated style, but do not want mipmaps.
     */
    TEXTURE_FILTER_LINEAR(1),
    /**
     * The texture filter reads from the nearest pixel in the nearest mipmap. The fastest way to read from textures with mipmaps.
     */
    TEXTURE_FILTER_NEAREST_WITH_MIPMAPS(2),
    /**
     * The texture filter blends between the nearest 4 pixels and between the nearest 2 mipmaps. Use this for most cases as mipmaps are important to smooth out pixels that are far from the camera.
     */
    TEXTURE_FILTER_LINEAR_WITH_MIPMAPS(3),
    /**
     * The texture filter reads from the nearest pixel, but selects a mipmap based on the angle between the surface and the camera view. This reduces artifacts on surfaces that are almost in line with the camera.
     */
    TEXTURE_FILTER_NEAREST_WITH_MIPMAPS_ANISOTROPIC(4),
    /**
     * The texture filter blends between the nearest 4 pixels and selects a mipmap based on the angle between the surface and the camera view. This reduces artifacts on surfaces that are almost in line with the camera. This is the slowest of the filtering options, but results in the highest quality texturing.
     */
    TEXTURE_FILTER_LINEAR_WITH_MIPMAPS_ANISOTROPIC(5),
    /**
     * Represents the size of the [enum TextureFilter] enum.
     */
    TEXTURE_FILTER_MAX(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class DistanceFadeMode(
    id: Long
  ) {
    /**
     * Do not use distance fade.
     */
    DISTANCE_FADE_DISABLED(0),
    /**
     * Smoothly fades the object out based on each pixel's distance from the camera using the alpha channel.
     */
    DISTANCE_FADE_PIXEL_ALPHA(1),
    /**
     * Smoothly fades the object out based on each pixel's distance from the camera using a dither approach. Dithering discards pixels based on a set pattern to smoothly fade without enabling transparency. On certain hardware this can be faster than [DISTANCE_FADE_PIXEL_ALPHA].
     */
    DISTANCE_FADE_PIXEL_DITHER(2),
    /**
     * Smoothly fades the object out based on the object's distance from the camera using a dither approach. Dithering discards pixels based on a set pattern to smoothly fade without enabling transparency. On certain hardware this can be faster than [DISTANCE_FADE_PIXEL_ALPHA].
     */
    DISTANCE_FADE_OBJECT_DITHER(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class BillboardMode(
    id: Long
  ) {
    /**
     * Billboard mode is disabled.
     */
    BILLBOARD_DISABLED(0),
    /**
     * The object's Z axis will always face the camera.
     */
    BILLBOARD_ENABLED(1),
    /**
     * The object's X axis will always face the camera.
     */
    BILLBOARD_FIXED_Y(2),
    /**
     * Used for particle systems when assigned to [godot.GPUParticles3D] and [godot.CPUParticles3D] nodes. Enables `particles_anim_*` properties.
     *
     * The [godot.ParticlesMaterial.animSpeedMin] or [godot.CPUParticles3D.animSpeedMin] should also be set to a value bigger than zero for the animation to play.
     */
    BILLBOARD_PARTICLES(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class DepthDrawMode(
    id: Long
  ) {
    /**
     * Default depth draw mode. Depth is drawn only for opaque objects.
     */
    DEPTH_DRAW_OPAQUE_ONLY(0),
    /**
     * Depth draw is calculated for both opaque and transparent objects.
     */
    DEPTH_DRAW_ALWAYS(1),
    /**
     * No depth draw.
     */
    DEPTH_DRAW_DISABLED(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class TextureChannel(
    id: Long
  ) {
    /**
     * Used to read from the red channel of a texture.
     */
    TEXTURE_CHANNEL_RED(0),
    /**
     * Used to read from the green channel of a texture.
     */
    TEXTURE_CHANNEL_GREEN(1),
    /**
     * Used to read from the blue channel of a texture.
     */
    TEXTURE_CHANNEL_BLUE(2),
    /**
     * Used to read from the alpha channel of a texture.
     */
    TEXTURE_CHANNEL_ALPHA(3),
    /**
     * Currently unused.
     */
    TEXTURE_CHANNEL_GRAYSCALE(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class AlphaAntiAliasing(
    id: Long
  ) {
    /**
     * Disables Alpha AntiAliasing for the material.
     */
    ALPHA_ANTIALIASING_OFF(0),
    /**
     * Enables AlphaToCoverage. Alpha values in the material are passed to the AntiAliasing sample mask.
     */
    ALPHA_ANTIALIASING_ALPHA_TO_COVERAGE(1),
    /**
     * Enables AlphaToCoverage and forces all non-zero alpha values to `1`. Alpha values in the material are passed to the AntiAliasing sample mask.
     */
    ALPHA_ANTIALIASING_ALPHA_TO_COVERAGE_AND_TO_ONE(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class BlendMode(
    id: Long
  ) {
    /**
     * Default blend mode. The color of the object is blended over the background based on the object's alpha value.
     */
    BLEND_MODE_MIX(0),
    /**
     * The color of the object is added to the background.
     */
    BLEND_MODE_ADD(1),
    /**
     * The color of the object is subtracted from the background.
     */
    BLEND_MODE_SUB(2),
    /**
     * The color of the object is multiplied by the background.
     */
    BLEND_MODE_MUL(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class Transparency(
    id: Long
  ) {
    /**
     * The material will not use transparency.
     */
    TRANSPARENCY_DISABLED(0),
    /**
     * The material will use the texture's alpha values for transparency.
     */
    TRANSPARENCY_ALPHA(1),
    /**
     * The material will cut off all values below a threshold, the rest will remain opaque.
     */
    TRANSPARENCY_ALPHA_SCISSOR(2),
    /**
     * The material will cut off all values below a spatially-deterministic threshold, the rest will remain opaque.
     */
    TRANSPARENCY_ALPHA_HASH(3),
    /**
     * The material will use the texture's alpha value for transparency, but will still be rendered in the pre-pass.
     */
    TRANSPARENCY_ALPHA_DEPTH_PRE_PASS(4),
    /**
     * Represents the size of the [enum Transparency] enum.
     */
    TRANSPARENCY_MAX(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class TextureParam(
    id: Long
  ) {
    /**
     * Texture specifying per-pixel color.
     */
    TEXTURE_ALBEDO(0),
    /**
     * Texture specifying per-pixel metallic value.
     */
    TEXTURE_METALLIC(1),
    /**
     * Texture specifying per-pixel roughness value.
     */
    TEXTURE_ROUGHNESS(2),
    /**
     * Texture specifying per-pixel emission color.
     */
    TEXTURE_EMISSION(3),
    /**
     * Texture specifying per-pixel normal vector.
     */
    TEXTURE_NORMAL(4),
    /**
     * Texture specifying per-pixel rim value.
     */
    TEXTURE_RIM(5),
    /**
     * Texture specifying per-pixel clearcoat value.
     */
    TEXTURE_CLEARCOAT(6),
    /**
     * Texture specifying per-pixel flowmap direction for use with [anisotropy].
     */
    TEXTURE_FLOWMAP(7),
    /**
     * Texture specifying per-pixel ambient occlusion value.
     */
    TEXTURE_AMBIENT_OCCLUSION(8),
    /**
     * Texture specifying per-pixel height.
     */
    TEXTURE_HEIGHTMAP(9),
    /**
     * Texture specifying per-pixel subsurface scattering.
     */
    TEXTURE_SUBSURFACE_SCATTERING(10),
    /**
     * Texture specifying per-pixel transmittance for subsurface scattering.
     */
    TEXTURE_SUBSURFACE_TRANSMITTANCE(11),
    /**
     * Texture specifying per-pixel backlight color.
     */
    TEXTURE_BACKLIGHT(12),
    /**
     * Texture specifying per-pixel refraction strength.
     */
    TEXTURE_REFRACTION(13),
    /**
     * Texture specifying per-pixel detail mask blending value.
     */
    TEXTURE_DETAIL_MASK(14),
    /**
     * Texture specifying per-pixel detail color.
     */
    TEXTURE_DETAIL_ALBEDO(15),
    /**
     * Texture specifying per-pixel detail normal.
     */
    TEXTURE_DETAIL_NORMAL(16),
    /**
     * Texture holding ambient occlusion, roughness, and metallic.
     */
    TEXTURE_ORM(17),
    /**
     * Represents the size of the [enum TextureParam] enum.
     */
    TEXTURE_MAX(18),
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
