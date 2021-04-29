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
 * [https://docs.godotengine.org/en/3.3/tutorials/3d/spatial_material.html](https://docs.godotengine.org/en/3.3/tutorials/3d/spatial_material.html)
 *
 * This provides a default material with a wide variety of rendering features and properties without the need to write shader code. See the tutorial below for details.
 */
@GodotBaseType
open class SpatialMaterial : Material() {
  /**
   * The material's base color.
   */
  open var albedoColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_ALBEDO_COLOR,
          COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(value) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_ALBEDO_COLOR,
          NIL)
    }

  /**
   * Texture to multiply by [albedoColor]. Used for basic texturing of objects.
   */
  open var albedoTexture: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_ALBEDO_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_ALBEDO_TEXTURE, NIL)
    }

  /**
   * The strength of the anisotropy effect.
   */
  open var anisotropy: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_ANISOTROPY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_ANISOTROPY,
          NIL)
    }

  /**
   * If `true`, anisotropy is enabled. Changes the shape of the specular blob and aligns it to tangent space. Mesh tangents are needed for this to work. If the mesh does not contain tangents the anisotropy effect will appear broken.
   */
  open var anisotropyEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_ANISOTROPY_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_ANISOTROPY_ENABLED, NIL)
    }

  /**
   * Texture that offsets the tangent map for anisotropy calculations.
   */
  open var anisotropyFlowmap: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_ANISOTROPY_FLOWMAP, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_ANISOTROPY_FLOWMAP, NIL)
    }

  /**
   * If `true`, ambient occlusion is enabled. Ambient occlusion darkens areas based on the [aoTexture].
   */
  open var aoEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_AO_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_AO_ENABLED,
          NIL)
    }

  /**
   * Amount that ambient occlusion affects lighting from lights. If `0`, ambient occlusion only affects ambient light. If `1`, ambient occlusion affects lights just as much as it affects ambient light. This can be used to impact the strength of the ambient occlusion effect, but typically looks unrealistic.
   */
  open var aoLightAffect: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_AO_LIGHT_AFFECT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_AO_LIGHT_AFFECT, NIL)
    }

  /**
   * If `true`, use `UV2` coordinates to look up from the [aoTexture].
   */
  open var aoOnUv2: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_AO_ON_UV2,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_AO_ON_UV2,
          NIL)
    }

  /**
   * Texture that defines the amount of ambient occlusion for a given point on the object.
   */
  open var aoTexture: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_AO_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_AO_TEXTURE,
          NIL)
    }

  /**
   * Specifies the channel of the [aoTexture] in which the ambient occlusion information is stored. This is useful when you store the information for multiple effects in a single texture. For example if you stored metallic in the red channel, roughness in the blue, and ambient occlusion in the green you could reduce the number of textures you use.
   */
  open var aoTextureChannel: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_AO_TEXTURE_CHANNEL, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_AO_TEXTURE_CHANNEL, NIL)
    }

  /**
   * Sets the strength of the clearcoat effect. Setting to `0` looks the same as disabling the clearcoat effect.
   */
  open var clearcoat: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_CLEARCOAT,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_CLEARCOAT,
          NIL)
    }

  /**
   * If `true`, clearcoat rendering is enabled. Adds a secondary transparent pass to the lighting calculation resulting in an added specular blob. This makes materials appear as if they have a clear layer on them that can be either glossy or rough.
   */
  open var clearcoatEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_CLEARCOAT_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_CLEARCOAT_ENABLED, NIL)
    }

  /**
   * Sets the roughness of the clearcoat pass. A higher value results in a smoother clearcoat while a lower value results in a rougher clearcoat.
   */
  open var clearcoatGloss: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_CLEARCOAT_GLOSS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_CLEARCOAT_GLOSS, NIL)
    }

  /**
   * Texture that defines the strength of the clearcoat effect and the glossiness of the clearcoat. Strength is specified in the red channel while glossiness is specified in the green channel.
   */
  open var clearcoatTexture: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_CLEARCOAT_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_CLEARCOAT_TEXTURE, NIL)
    }

  /**
   * If `true`, the shader will read depth texture at multiple points along the view ray to determine occlusion and parrallax. This can be very performance demanding, but results in more realistic looking depth mapping.
   */
  open var depthDeepParallax: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_DEPTH_DEEP_PARALLAX, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_DEPTH_DEEP_PARALLAX, NIL)
    }

  /**
   * If `true`, depth mapping is enabled (also called "parallax mapping" or "height mapping"). See also [normalEnabled].
   *
   * **Note:** Depth mapping is not supported if triplanar mapping is used on the same material. The value of [depthEnabled] will be ignored if [uv1Triplanar] is enabled.
   */
  open var depthEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_DEPTH_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_DEPTH_ENABLED,
          NIL)
    }

  /**
   * If `true`, direction of the binormal is flipped before using in the depth effect. This may be necessary if you have encoded your binormals in a way that is conflicting with the depth effect.
   */
  open var depthFlipBinormal: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_DEPTH_FLIP_BINORMAL, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_DEPTH_FLIP_BINORMAL, NIL)
    }

  /**
   * If `true`, direction of the tangent is flipped before using in the depth effect. This may be necessary if you have encoded your tangents in a way that is conflicting with the depth effect.
   */
  open var depthFlipTangent: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_DEPTH_FLIP_TANGENT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_DEPTH_FLIP_TANGENT, NIL)
    }

  /**
   * Number of layers to use when using [depthDeepParallax] and the view direction is perpendicular to the surface of the object. A higher number will be more performance demanding while a lower number may not look as crisp.
   */
  open var depthMaxLayers: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_DEPTH_MAX_LAYERS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_DEPTH_MAX_LAYERS, NIL)
    }

  /**
   * Number of layers to use when using [depthDeepParallax] and the view direction is parallel to the surface of the object. A higher number will be more performance demanding while a lower number may not look as crisp.
   */
  open var depthMinLayers: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_DEPTH_MIN_LAYERS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_DEPTH_MIN_LAYERS, NIL)
    }

  /**
   * Scales the depth offset effect. A higher number will create a larger depth.
   */
  open var depthScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_DEPTH_SCALE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_DEPTH_SCALE,
          NIL)
    }

  /**
   * Texture used to determine depth at a given pixel. Depth is always stored in the red channel.
   */
  open var depthTexture: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_DEPTH_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_DEPTH_TEXTURE,
          NIL)
    }

  /**
   * Texture that specifies the color of the detail overlay.
   */
  open var detailAlbedo: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_DETAIL_ALBEDO,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_DETAIL_ALBEDO,
          NIL)
    }

  /**
   * Specifies how the [detailAlbedo] should blend with the current `ALBEDO`. See [enum BlendMode] for options.
   */
  open var detailBlendMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_DETAIL_BLEND_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_DETAIL_BLEND_MODE, NIL)
    }

  /**
   * If `true`, enables the detail overlay. Detail is a second texture that gets mixed over the surface of the object based on [detailMask]. This can be used to add variation to objects, or to blend between two different albedo/normal textures.
   */
  open var detailEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_DETAIL_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_DETAIL_ENABLED, NIL)
    }

  /**
   * Texture used to specify how the detail textures get blended with the base textures.
   */
  open var detailMask: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_DETAIL_MASK,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_DETAIL_MASK,
          NIL)
    }

  /**
   * Texture that specifies the per-pixel normal of the detail overlay.
   *
   * **Note:** Godot expects the normal map to use X+, Y-, and Z+ coordinates. See [this page](http://wiki.polycount.com/wiki/Normal_Map_Technical_Details#Common_Swizzle_Coordinates) for a comparison of normal map coordinates expected by popular engines.
   */
  open var detailNormal: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_DETAIL_NORMAL,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_DETAIL_NORMAL,
          NIL)
    }

  /**
   * Specifies whether to use `UV` or `UV2` for the detail layer. See [enum DetailUV] for options.
   */
  open var detailUvLayer: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_DETAIL_UV_LAYER, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_DETAIL_UV_LAYER, NIL)
    }

  /**
   * Distance at which the object appears fully opaque.
   *
   * **Note:** If `distance_fade_max_distance` is less than `distance_fade_min_distance`, the behavior will be reversed. The object will start to fade away at `distance_fade_max_distance` and will fully disappear once it reaches `distance_fade_min_distance`.
   */
  open var distanceFadeMaxDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_DISTANCE_FADE_MAX_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_DISTANCE_FADE_MAX_DISTANCE, NIL)
    }

  /**
   * Distance at which the object starts to become visible. If the object is less than this distance away, it will be invisible.
   *
   * **Note:** If `distance_fade_min_distance` is greater than `distance_fade_max_distance`, the behavior will be reversed. The object will start to fade away at `distance_fade_max_distance` and will fully disappear once it reaches `distance_fade_min_distance`.
   */
  open var distanceFadeMinDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_DISTANCE_FADE_MIN_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_DISTANCE_FADE_MIN_DISTANCE, NIL)
    }

  /**
   * Specifies which type of fade to use. Can be any of the [enum DistanceFadeMode]s.
   */
  open var distanceFadeMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_DISTANCE_FADE_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_DISTANCE_FADE_MODE, NIL)
    }

  /**
   * The emitted light's color. See [emissionEnabled].
   */
  open var emission: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_EMISSION,
          COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(value) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_EMISSION, NIL)
    }

  /**
   * If `true`, the body emits light. Emitting light makes the object appear brighter. The object can also cast light on other objects if a [godot.GIProbe] or [godot.BakedLightmap] is used and this object is used in baked lighting.
   */
  open var emissionEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_EMISSION_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_EMISSION_ENABLED, NIL)
    }

  /**
   * The emitted light's strength. See [emissionEnabled].
   */
  open var emissionEnergy: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_EMISSION_ENERGY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_EMISSION_ENERGY, NIL)
    }

  /**
   * Use `UV2` to read from the [emissionTexture].
   */
  open var emissionOnUv2: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_EMISSION_ON_UV2, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_EMISSION_ON_UV2, NIL)
    }

  /**
   * Sets how [emission] interacts with [emissionTexture]. Can either add or multiply. See [enum EmissionOperator] for options.
   */
  open var emissionOperator: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_EMISSION_OPERATOR, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_EMISSION_OPERATOR, NIL)
    }

  /**
   * Texture that specifies how much surface emits light at a given point.
   */
  open var emissionTexture: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_EMISSION_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_EMISSION_TEXTURE, NIL)
    }

  /**
   * Forces a conversion of the [albedoTexture] from sRGB space to linear space.
   */
  open var flagsAlbedoTexForceSrgb: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_FLAGS_ALBEDO_TEX_FORCE_SRGB, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_FLAGS_ALBEDO_TEX_FORCE_SRGB, NIL)
    }

  /**
   * If `true`, the object receives no ambient light.
   */
  open var flagsDisableAmbientLight: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_FLAGS_DISABLE_AMBIENT_LIGHT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_FLAGS_DISABLE_AMBIENT_LIGHT, NIL)
    }

  /**
   * If `true`, the object receives no shadow that would otherwise be cast onto it.
   */
  open var flagsDoNotReceiveShadows: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_FLAGS_DO_NOT_RECEIVE_SHADOWS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_FLAGS_DO_NOT_RECEIVE_SHADOWS, NIL)
    }

  /**
   * If `true`, the shader will compute extra operations to make sure the normal stays correct when using a non-uniform scale. Only enable if using non-uniform scaling.
   */
  open var flagsEnsureCorrectNormals: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_FLAGS_ENSURE_CORRECT_NORMALS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_FLAGS_ENSURE_CORRECT_NORMALS, NIL)
    }

  /**
   * If `true`, the object is rendered at the same size regardless of distance.
   */
  open var flagsFixedSize: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_FLAGS_FIXED_SIZE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_FLAGS_FIXED_SIZE, NIL)
    }

  /**
   * If `true`, depth testing is disabled and the object will be drawn in render order.
   */
  open var flagsNoDepthTest: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_FLAGS_NO_DEPTH_TEST, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_FLAGS_NO_DEPTH_TEST, NIL)
    }

  /**
   * If `true`, transparency is enabled on the body. See also [paramsBlendMode].
   */
  open var flagsTransparent: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_FLAGS_TRANSPARENT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_FLAGS_TRANSPARENT, NIL)
    }

  /**
   * If `true`, the object is unaffected by lighting.
   */
  open var flagsUnshaded: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_FLAGS_UNSHADED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_FLAGS_UNSHADED, NIL)
    }

  /**
   * If `true`, render point size can be changed.
   *
   * **Note:** this is only effective for objects whose geometry is point-based rather than triangle-based. See also [paramsPointSize].
   */
  open var flagsUsePointSize: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_FLAGS_USE_POINT_SIZE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_FLAGS_USE_POINT_SIZE, NIL)
    }

  /**
   * If `true`, enables the "shadow to opacity" render mode where lighting modifies the alpha so shadowed areas are opaque and non-shadowed areas are transparent. Useful for overlaying shadows onto a camera feed in AR.
   */
  open var flagsUseShadowToOpacity: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_FLAGS_USE_SHADOW_TO_OPACITY, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_FLAGS_USE_SHADOW_TO_OPACITY, NIL)
    }

  /**
   * If `true`, lighting is calculated per vertex rather than per pixel. This may increase performance on low-end devices.
   */
  open var flagsVertexLighting: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_FLAGS_VERTEX_LIGHTING, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_FLAGS_VERTEX_LIGHTING, NIL)
    }

  /**
   * If `true`, triplanar mapping is calculated in world space rather than object local space. See also [uv1Triplanar].
   */
  open var flagsWorldTriplanar: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_FLAGS_WORLD_TRIPLANAR, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_FLAGS_WORLD_TRIPLANAR, NIL)
    }

  /**
   * A high value makes the material appear more like a metal. Non-metals use their albedo as the diffuse color and add diffuse to the specular reflection. With non-metals, the reflection appears on top of the albedo color. Metals use their albedo as a multiplier to the specular reflection and set the diffuse color to black resulting in a tinted reflection. Materials work better when fully metal or fully non-metal, values between `0` and `1` should only be used for blending between metal and non-metal sections. To alter the amount of reflection use [roughness].
   */
  open var metallic: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_METALLIC,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_METALLIC, NIL)
    }

  /**
   * Sets the size of the specular lobe. The specular lobe is the bright spot that is reflected from light sources.
   *
   * **Note:** unlike [metallic], this is not energy-conserving, so it should be left at `0.5` in most cases. See also [roughness].
   */
  open var metallicSpecular: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_METALLIC_SPECULAR, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_METALLIC_SPECULAR, NIL)
    }

  /**
   * Texture used to specify metallic for an object. This is multiplied by [metallic].
   */
  open var metallicTexture: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_METALLIC_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_METALLIC_TEXTURE, NIL)
    }

  /**
   * Specifies the channel of the [metallicTexture] in which the metallic information is stored. This is useful when you store the information for multiple effects in a single texture. For example if you stored metallic in the red channel, roughness in the blue, and ambient occlusion in the green you could reduce the number of textures you use.
   */
  open var metallicTextureChannel: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_METALLIC_TEXTURE_CHANNEL, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_METALLIC_TEXTURE_CHANNEL, NIL)
    }

  /**
   * If `true`, normal mapping is enabled.
   */
  open var normalEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_NORMAL_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_NORMAL_ENABLED, NIL)
    }

  /**
   * The strength of the normal map's effect.
   */
  open var normalScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_NORMAL_SCALE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_NORMAL_SCALE,
          NIL)
    }

  /**
   * Texture used to specify the normal at a given pixel. The `normal_texture` only uses the red and green channels. The normal read from `normal_texture` is oriented around the surface normal provided by the [godot.Mesh].
   *
   * **Note:** Godot expects the normal map to use X+, Y-, and Z+ coordinates. See [this page](http://wiki.polycount.com/wiki/Normal_Map_Technical_Details#Common_Swizzle_Coordinates) for a comparison of normal map coordinates expected by popular engines.
   */
  open var normalTexture: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_NORMAL_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_NORMAL_TEXTURE, NIL)
    }

  /**
   * Threshold at which the alpha scissor will discard values.
   */
  open var paramsAlphaScissorThreshold: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_PARAMS_ALPHA_SCISSOR_THRESHOLD, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_PARAMS_ALPHA_SCISSOR_THRESHOLD, NIL)
    }

  /**
   * If `true`, the shader will keep the scale set for the mesh. Otherwise the scale is lost when billboarding. Only applies when [paramsBillboardMode] is [BILLBOARD_ENABLED].
   */
  open var paramsBillboardKeepScale: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_PARAMS_BILLBOARD_KEEP_SCALE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_PARAMS_BILLBOARD_KEEP_SCALE, NIL)
    }

  /**
   * Controls how the object faces the camera. See [enum BillboardMode].
   *
   * **Note:** Billboard mode is not suitable for VR because the left-right vector of the camera is not horizontal when the screen is attached to your head instead of on the table. See [godot.GitHub issue #41567](https://github.com/godotengine/godot/issues/41567) for details.
   */
  open var paramsBillboardMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_PARAMS_BILLBOARD_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_PARAMS_BILLBOARD_MODE, NIL)
    }

  /**
   * The material's blend mode.
   *
   * **Note:** Values other than `Mix` force the object into the transparent pipeline. See [enum BlendMode].
   */
  open var paramsBlendMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_PARAMS_BLEND_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_PARAMS_BLEND_MODE, NIL)
    }

  /**
   * Which side of the object is not drawn when backfaces are rendered. See [enum CullMode].
   */
  open var paramsCullMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_PARAMS_CULL_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_PARAMS_CULL_MODE, NIL)
    }

  /**
   * Determines when depth rendering takes place. See [enum DepthDrawMode]. See also [flagsTransparent].
   */
  open var paramsDepthDrawMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_PARAMS_DEPTH_DRAW_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_PARAMS_DEPTH_DRAW_MODE, NIL)
    }

  /**
   * The algorithm used for diffuse light scattering. See [enum DiffuseMode].
   */
  open var paramsDiffuseMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_PARAMS_DIFFUSE_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_PARAMS_DIFFUSE_MODE, NIL)
    }

  /**
   * If `true`, enables the vertex grow setting. See [paramsGrowAmount].
   */
  open var paramsGrow: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_PARAMS_GROW,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_PARAMS_GROW,
          NIL)
    }

  /**
   * Grows object vertices in the direction of their normals.
   */
  open var paramsGrowAmount: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_PARAMS_GROW_AMOUNT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_PARAMS_GROW_AMOUNT, NIL)
    }

  /**
   * Currently unimplemented in Godot.
   */
  open var paramsLineWidth: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_PARAMS_LINE_WIDTH, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_PARAMS_LINE_WIDTH, NIL)
    }

  /**
   * The point size in pixels. See [flagsUsePointSize].
   */
  open var paramsPointSize: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_PARAMS_POINT_SIZE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_PARAMS_POINT_SIZE, NIL)
    }

  /**
   * The method for rendering the specular blob. See [enum SpecularMode].
   */
  open var paramsSpecularMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_PARAMS_SPECULAR_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_PARAMS_SPECULAR_MODE, NIL)
    }

  /**
   * If `true`, the shader will discard all pixels that have an alpha value less than [paramsAlphaScissorThreshold].
   */
  open var paramsUseAlphaScissor: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_PARAMS_USE_ALPHA_SCISSOR, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_PARAMS_USE_ALPHA_SCISSOR, NIL)
    }

  /**
   * The number of horizontal frames in the particle sprite sheet. Only enabled when using [BILLBOARD_PARTICLES]. See [paramsBillboardMode].
   */
  open var particlesAnimHFrames: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_PARTICLES_ANIM_H_FRAMES, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_PARTICLES_ANIM_H_FRAMES, NIL)
    }

  /**
   * If `true`, particle animations are looped. Only enabled when using [BILLBOARD_PARTICLES]. See [paramsBillboardMode].
   */
  open var particlesAnimLoop: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_PARTICLES_ANIM_LOOP, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_PARTICLES_ANIM_LOOP, NIL)
    }

  /**
   * The number of vertical frames in the particle sprite sheet. Only enabled when using [BILLBOARD_PARTICLES]. See [paramsBillboardMode].
   */
  open var particlesAnimVFrames: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_PARTICLES_ANIM_V_FRAMES, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_PARTICLES_ANIM_V_FRAMES, NIL)
    }

  /**
   * Distance over which the fade effect takes place. The larger the distance the longer it takes for an object to fade.
   */
  open var proximityFadeDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_PROXIMITY_FADE_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_PROXIMITY_FADE_DISTANCE, NIL)
    }

  /**
   * If `true`, the proximity fade effect is enabled. The proximity fade effect fades out each pixel based on its distance to another object.
   */
  open var proximityFadeEnable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_PROXIMITY_FADE_ENABLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_PROXIMITY_FADE_ENABLE, NIL)
    }

  /**
   * If `true`, the refraction effect is enabled. Distorts transparency based on light from behind the object.
   */
  open var refractionEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_REFRACTION_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_REFRACTION_ENABLED, NIL)
    }

  /**
   * The strength of the refraction effect.
   */
  open var refractionScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_REFRACTION_SCALE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_REFRACTION_SCALE, NIL)
    }

  /**
   * Texture that controls the strength of the refraction per-pixel. Multiplied by [refractionScale].
   */
  open var refractionTexture: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_REFRACTION_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_REFRACTION_TEXTURE, NIL)
    }

  /**
   * Specifies the channel of the [aoTexture] in which the ambient occlusion information is stored. This is useful when you store the information for multiple effects in a single texture. For example if you stored metallic in the red channel, roughness in the blue, and ambient occlusion in the green you could reduce the number of textures you use.
   */
  open var refractionTextureChannel: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_REFRACTION_TEXTURE_CHANNEL, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_REFRACTION_TEXTURE_CHANNEL, NIL)
    }

  /**
   * Sets the strength of the rim lighting effect.
   */
  open var rim: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_RIM, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_RIM, NIL)
    }

  /**
   * If `true`, rim effect is enabled. Rim lighting increases the brightness at glancing angles on an object.
   */
  open var rimEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_RIM_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_RIM_ENABLED,
          NIL)
    }

  /**
   * Texture used to set the strength of the rim lighting effect per-pixel. Multiplied by [rim].
   */
  open var rimTexture: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_RIM_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_RIM_TEXTURE,
          NIL)
    }

  /**
   * The amount of to blend light and albedo color when rendering rim effect. If `0` the light color is used, while `1` means albedo color is used. An intermediate value generally works best.
   */
  open var rimTint: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_RIM_TINT,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_RIM_TINT, NIL)
    }

  /**
   * Surface reflection. A value of `0` represents a perfect mirror while a value of `1` completely blurs the reflection. See also [metallic].
   */
  open var roughness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_ROUGHNESS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_ROUGHNESS,
          NIL)
    }

  /**
   * Texture used to control the roughness per-pixel. Multiplied by [roughness].
   */
  open var roughnessTexture: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_ROUGHNESS_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_ROUGHNESS_TEXTURE, NIL)
    }

  /**
   * Specifies the channel of the [aoTexture] in which the ambient occlusion information is stored. This is useful when you store the information for multiple effects in a single texture. For example if you stored metallic in the red channel, roughness in the blue, and ambient occlusion in the green you could reduce the number of textures you use.
   */
  open var roughnessTextureChannel: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_ROUGHNESS_TEXTURE_CHANNEL, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_ROUGHNESS_TEXTURE_CHANNEL, NIL)
    }

  /**
   * If `true`, subsurface scattering is enabled. Emulates light that penetrates an object's surface, is scattered, and then emerges.
   */
  open var subsurfScatterEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_SUBSURF_SCATTER_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_SUBSURF_SCATTER_ENABLED, NIL)
    }

  /**
   * The strength of the subsurface scattering effect.
   */
  open var subsurfScatterStrength: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_SUBSURF_SCATTER_STRENGTH, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_SUBSURF_SCATTER_STRENGTH, NIL)
    }

  /**
   * Texture used to control the subsurface scattering strength. Stored in the red texture channel. Multiplied by [subsurfScatterStrength].
   */
  open var subsurfScatterTexture: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_SUBSURF_SCATTER_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_SUBSURF_SCATTER_TEXTURE, NIL)
    }

  /**
   * The color used by the transmission effect. Represents the light passing through an object.
   */
  open var transmission: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_TRANSMISSION,
          COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(value) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_TRANSMISSION,
          NIL)
    }

  /**
   * If `true`, the transmission effect is enabled.
   */
  open var transmissionEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_TRANSMISSION_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_TRANSMISSION_ENABLED, NIL)
    }

  /**
   * Texture used to control the transmission effect per-pixel. Added to [transmission].
   */
  open var transmissionTexture: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_TRANSMISSION_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_TRANSMISSION_TEXTURE, NIL)
    }

  /**
   * How much to offset the `UV` coordinates. This amount will be added to `UV` in the vertex function. This can be used to offset a texture.
   */
  open var uv1Offset: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_UV1_OFFSET,
          VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(value) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_UV1_OFFSET,
          NIL)
    }

  /**
   * How much to scale the `UV` coordinates. This is multiplied by `UV` in the vertex function.
   */
  open var uv1Scale: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_UV1_SCALE,
          VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(value) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_UV1_SCALE,
          NIL)
    }

  /**
   * If `true`, instead of using `UV` textures will use a triplanar texture lookup to determine how to apply textures. Triplanar uses the orientation of the object's surface to blend between texture coordinates. It reads from the source texture 3 times, once for each axis and then blends between the results based on how closely the pixel aligns with each axis. This is often used for natural features to get a realistic blend of materials. Because triplanar texturing requires many more texture reads per-pixel it is much slower than normal UV texturing. Additionally, because it is blending the texture between the three axes, it is unsuitable when you are trying to achieve crisp texturing.
   */
  open var uv1Triplanar: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_UV1_TRIPLANAR,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_UV1_TRIPLANAR,
          NIL)
    }

  /**
   * A lower number blends the texture more softly while a higher number blends the texture more sharply.
   */
  open var uv1TriplanarSharpness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_UV1_TRIPLANAR_SHARPNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_UV1_TRIPLANAR_SHARPNESS, NIL)
    }

  /**
   * How much to offset the `UV2` coordinates. This amount will be added to `UV2` in the vertex function. This can be used to offset a texture.
   */
  open var uv2Offset: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_UV2_OFFSET,
          VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(value) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_UV2_OFFSET,
          NIL)
    }

  /**
   * How much to scale the `UV2` coordinates. This is multiplied by `UV2` in the vertex function.
   */
  open var uv2Scale: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_UV2_SCALE,
          VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(value) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_UV2_SCALE,
          NIL)
    }

  /**
   * If `true`, instead of using `UV2` textures will use a triplanar texture lookup to determine how to apply textures. Triplanar uses the orientation of the object's surface to blend between texture coordinates. It reads from the source texture 3 times, once for each axis and then blends between the results based on how closely the pixel aligns with each axis. This is often used for natural features to get a realistic blend of materials. Because triplanar texturing requires many more texture reads per-pixel it is much slower than normal UV texturing. Additionally, because it is blending the texture between the three axes, it is unsuitable when you are trying to achieve crisp texturing.
   */
  open var uv2Triplanar: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_UV2_TRIPLANAR,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_UV2_TRIPLANAR,
          NIL)
    }

  /**
   * A lower number blends the texture more softly while a higher number blends the texture more sharply.
   */
  open var uv2TriplanarSharpness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_UV2_TRIPLANAR_SHARPNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_UV2_TRIPLANAR_SHARPNESS, NIL)
    }

  /**
   * If `true`, the model's vertex colors are processed as sRGB mode.
   */
  open var vertexColorIsSrgb: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_VERTEX_COLOR_IS_SRGB, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_VERTEX_COLOR_IS_SRGB, NIL)
    }

  /**
   * If `true`, the vertex color is used as albedo color.
   */
  open var vertexColorUseAsAlbedo: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_GET_VERTEX_COLOR_USE_AS_ALBEDO, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALMATERIAL_SET_VERTEX_COLOR_USE_AS_ALBEDO, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_SPATIALMATERIAL)
  }

  @CoreTypeHelper
  open fun albedoColor(schedule: Color.() -> Unit): Color = albedoColor.apply{
      schedule(this)
      albedoColor = this
  }


  @CoreTypeHelper
  open fun emission(schedule: Color.() -> Unit): Color = emission.apply{
      schedule(this)
      emission = this
  }


  @CoreTypeHelper
  open fun transmission(schedule: Color.() -> Unit): Color = transmission.apply{
      schedule(this)
      transmission = this
  }


  @CoreTypeHelper
  open fun uv1Offset(schedule: Vector3.() -> Unit): Vector3 = uv1Offset.apply{
      schedule(this)
      uv1Offset = this
  }


  @CoreTypeHelper
  open fun uv1Scale(schedule: Vector3.() -> Unit): Vector3 = uv1Scale.apply{
      schedule(this)
      uv1Scale = this
  }


  @CoreTypeHelper
  open fun uv2Offset(schedule: Vector3.() -> Unit): Vector3 = uv2Offset.apply{
      schedule(this)
      uv2Offset = this
  }


  @CoreTypeHelper
  open fun uv2Scale(schedule: Vector3.() -> Unit): Vector3 = uv2Scale.apply{
      schedule(this)
      uv2Scale = this
  }


  enum class EmissionOperator(
    id: Long
  ) {
    /**
     * Adds the emission color to the color from the emission texture.
     */
    EMISSION_OP_ADD(0),

    /**
     * Multiplies the emission color by the color from the emission texture.
     */
    EMISSION_OP_MULTIPLY(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class DiffuseMode(
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
     * Attempts to use roughness to emulate microsurfacing.
     */
    DIFFUSE_OREN_NAYAR(3),

    /**
     * Uses a hard cut for lighting, with smoothing affected by roughness.
     */
    DIFFUSE_TOON(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class SpecularMode(
    id: Long
  ) {
    /**
     * Default specular blob.
     */
    SPECULAR_SCHLICK_GGX(0),

    /**
     * Older specular algorithm, included for compatibility.
     */
    SPECULAR_BLINN(1),

    /**
     * Older specular algorithm, included for compatibility.
     */
    SPECULAR_PHONG(2),

    /**
     * Toon blob which changes size based on roughness.
     */
    SPECULAR_TOON(3),

    /**
     * No specular blob.
     */
    SPECULAR_DISABLED(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Feature(
    id: Long
  ) {
    /**
     * Constant for setting [flagsTransparent].
     */
    FEATURE_TRANSPARENT(0),

    /**
     * Constant for setting [emissionEnabled].
     */
    FEATURE_EMISSION(1),

    /**
     * Constant for setting [normalEnabled].
     */
    FEATURE_NORMAL_MAPPING(2),

    /**
     * Constant for setting [rimEnabled].
     */
    FEATURE_RIM(3),

    /**
     * Constant for setting [clearcoatEnabled].
     */
    FEATURE_CLEARCOAT(4),

    /**
     * Constant for setting [anisotropyEnabled].
     */
    FEATURE_ANISOTROPY(5),

    /**
     * Constant for setting [aoEnabled].
     */
    FEATURE_AMBIENT_OCCLUSION(6),

    /**
     * Constant for setting [depthEnabled].
     */
    FEATURE_DEPTH_MAPPING(7),

    /**
     * Constant for setting [subsurfScatterEnabled].
     */
    FEATURE_SUBSURACE_SCATTERING(8),

    /**
     * Constant for setting [transmissionEnabled].
     */
    FEATURE_TRANSMISSION(9),

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
    FEATURE_MAX(12);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Flags(
    id: Long
  ) {
    /**
     * No lighting is used on the object. Color comes directly from `ALBEDO`.
     */
    FLAG_UNSHADED(0),

    /**
     * Lighting is calculated per-vertex rather than per-pixel. This can be used to increase the speed of the shader at the cost of quality.
     */
    FLAG_USE_VERTEX_LIGHTING(1),

    /**
     * Disables the depth test, so this object is drawn on top of all others. However, objects drawn after it in the draw order may cover it.
     */
    FLAG_DISABLE_DEPTH_TEST(2),

    /**
     * Set `ALBEDO` to the per-vertex color specified in the mesh.
     */
    FLAG_ALBEDO_FROM_VERTEX_COLOR(3),

    /**
     * Vertex color is in sRGB space and needs to be converted to linear. Only applies in the GLES3 renderer.
     */
    FLAG_SRGB_VERTEX_COLOR(4),

    /**
     * Uses point size to alter the size of primitive points. Also changes the albedo texture lookup to use `POINT_COORD` instead of `UV`.
     */
    FLAG_USE_POINT_SIZE(5),

    /**
     * Object is scaled by depth so that it always appears the same size on screen.
     */
    FLAG_FIXED_SIZE(6),

    /**
     * Shader will keep the scale set for the mesh. Otherwise the scale is lost when billboarding. Only applies when [paramsBillboardMode] is [BILLBOARD_ENABLED].
     */
    FLAG_BILLBOARD_KEEP_SCALE(7),

    /**
     * Use triplanar texture lookup for all texture lookups that would normally use `UV`.
     */
    FLAG_UV1_USE_TRIPLANAR(8),

    /**
     * Use triplanar texture lookup for all texture lookups that would normally use `UV2`.
     */
    FLAG_UV2_USE_TRIPLANAR(9),

    /**
     * Use world coordinates in the triplanar texture lookup instead of local coordinates.
     */
    FLAG_TRIPLANAR_USE_WORLD(10),

    /**
     * Use `UV2` coordinates to look up from the [aoTexture].
     */
    FLAG_AO_ON_UV2(11),

    /**
     * Use `UV2` coordinates to look up from the [emissionTexture].
     */
    FLAG_EMISSION_ON_UV2(12),

    /**
     * Use alpha scissor. Set by [paramsUseAlphaScissor].
     */
    FLAG_USE_ALPHA_SCISSOR(13),

    /**
     * Forces the shader to convert albedo from sRGB space to linear space.
     */
    FLAG_ALBEDO_TEXTURE_FORCE_SRGB(14),

    /**
     * Disables receiving shadows from other objects.
     */
    FLAG_DONT_RECEIVE_SHADOWS(15),

    /**
     * Ensures that normals appear correct, even with non-uniform scaling.
     */
    FLAG_ENSURE_CORRECT_NORMALS(16),

    /**
     * Disables receiving ambient light.
     */
    FLAG_DISABLE_AMBIENT_LIGHT(17),

    /**
     * Enables the shadow to opacity feature.
     */
    FLAG_USE_SHADOW_TO_OPACITY(18),

    /**
     * Represents the size of the [enum Flags] enum.
     */
    FLAG_MAX(19);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class CullMode(
    id: Long
  ) {
    /**
     * Default cull mode. The back of the object is culled when not visible.
     */
    CULL_BACK(0),

    /**
     * The front of the object is culled when not visible.
     */
    CULL_FRONT(1),

    /**
     * No culling is performed.
     */
    CULL_DISABLED(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class DetailUV(
    id: Long
  ) {
    /**
     * Use `UV` with the detail texture.
     */
    DETAIL_UV_1(0),

    /**
     * Use `UV2` with the detail texture.
     */
    DETAIL_UV_2(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class DistanceFadeMode(
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
    DISTANCE_FADE_OBJECT_DITHER(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class BillboardMode(
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
     * Used for particle systems when assigned to [godot.Particles] and [godot.CPUParticles] nodes. Enables `particles_anim_*` properties.
     *
     * The [godot.ParticlesMaterial.animSpeed] or [godot.CPUParticles.animSpeed] should also be set to a positive value for the animation to play.
     */
    BILLBOARD_PARTICLES(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class DepthDrawMode(
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

    /**
     * For transparent objects, an opaque pass is made first with the opaque parts, then transparency is drawn.
     */
    DEPTH_DRAW_ALPHA_OPAQUE_PREPASS(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class TextureChannel(
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
    TEXTURE_CHANNEL_GRAYSCALE(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class BlendMode(
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
    BLEND_MODE_MUL(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class TextureParam(
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
     * Texture specifying per-pixel depth.
     */
    TEXTURE_DEPTH(9),

    /**
     * Texture specifying per-pixel subsurface scattering.
     */
    TEXTURE_SUBSURFACE_SCATTERING(10),

    /**
     * Texture specifying per-pixel transmission color.
     */
    TEXTURE_TRANSMISSION(11),

    /**
     * Texture specifying per-pixel refraction strength.
     */
    TEXTURE_REFRACTION(12),

    /**
     * Texture specifying per-pixel detail mask blending value.
     */
    TEXTURE_DETAIL_MASK(13),

    /**
     * Texture specifying per-pixel detail color.
     */
    TEXTURE_DETAIL_ALBEDO(14),

    /**
     * Texture specifying per-pixel detail normal.
     */
    TEXTURE_DETAIL_NORMAL(15),

    /**
     * Represents the size of the [enum TextureParam] enum.
     */
    TEXTURE_MAX(16);

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
     * Billboard mode is disabled.
     */
    final const val BILLBOARD_DISABLED: Long = 0

    /**
     * The object's Z axis will always face the camera.
     */
    final const val BILLBOARD_ENABLED: Long = 1

    /**
     * The object's X axis will always face the camera.
     */
    final const val BILLBOARD_FIXED_Y: Long = 2

    /**
     * Used for particle systems when assigned to [godot.Particles] and [godot.CPUParticles] nodes. Enables `particles_anim_*` properties.
     *
     * The [godot.ParticlesMaterial.animSpeed] or [godot.CPUParticles.animSpeed] should also be set to a positive value for the animation to play.
     */
    final const val BILLBOARD_PARTICLES: Long = 3

    /**
     * The color of the object is added to the background.
     */
    final const val BLEND_MODE_ADD: Long = 1

    /**
     * Default blend mode. The color of the object is blended over the background based on the object's alpha value.
     */
    final const val BLEND_MODE_MIX: Long = 0

    /**
     * The color of the object is multiplied by the background.
     */
    final const val BLEND_MODE_MUL: Long = 3

    /**
     * The color of the object is subtracted from the background.
     */
    final const val BLEND_MODE_SUB: Long = 2

    /**
     * Default cull mode. The back of the object is culled when not visible.
     */
    final const val CULL_BACK: Long = 0

    /**
     * No culling is performed.
     */
    final const val CULL_DISABLED: Long = 2

    /**
     * The front of the object is culled when not visible.
     */
    final const val CULL_FRONT: Long = 1

    /**
     * For transparent objects, an opaque pass is made first with the opaque parts, then transparency is drawn.
     */
    final const val DEPTH_DRAW_ALPHA_OPAQUE_PREPASS: Long = 3

    /**
     * Depth draw is calculated for both opaque and transparent objects.
     */
    final const val DEPTH_DRAW_ALWAYS: Long = 1

    /**
     * No depth draw.
     */
    final const val DEPTH_DRAW_DISABLED: Long = 2

    /**
     * Default depth draw mode. Depth is drawn only for opaque objects.
     */
    final const val DEPTH_DRAW_OPAQUE_ONLY: Long = 0

    /**
     * Use `UV` with the detail texture.
     */
    final const val DETAIL_UV_1: Long = 0

    /**
     * Use `UV2` with the detail texture.
     */
    final const val DETAIL_UV_2: Long = 1

    /**
     * Default diffuse scattering algorithm.
     */
    final const val DIFFUSE_BURLEY: Long = 0

    /**
     * Diffuse scattering ignores roughness.
     */
    final const val DIFFUSE_LAMBERT: Long = 1

    /**
     * Extends Lambert to cover more than 90 degrees when roughness increases.
     */
    final const val DIFFUSE_LAMBERT_WRAP: Long = 2

    /**
     * Attempts to use roughness to emulate microsurfacing.
     */
    final const val DIFFUSE_OREN_NAYAR: Long = 3

    /**
     * Uses a hard cut for lighting, with smoothing affected by roughness.
     */
    final const val DIFFUSE_TOON: Long = 4

    /**
     * Do not use distance fade.
     */
    final const val DISTANCE_FADE_DISABLED: Long = 0

    /**
     * Smoothly fades the object out based on the object's distance from the camera using a dither approach. Dithering discards pixels based on a set pattern to smoothly fade without enabling transparency. On certain hardware this can be faster than [DISTANCE_FADE_PIXEL_ALPHA].
     */
    final const val DISTANCE_FADE_OBJECT_DITHER: Long = 3

    /**
     * Smoothly fades the object out based on each pixel's distance from the camera using the alpha channel.
     */
    final const val DISTANCE_FADE_PIXEL_ALPHA: Long = 1

    /**
     * Smoothly fades the object out based on each pixel's distance from the camera using a dither approach. Dithering discards pixels based on a set pattern to smoothly fade without enabling transparency. On certain hardware this can be faster than [DISTANCE_FADE_PIXEL_ALPHA].
     */
    final const val DISTANCE_FADE_PIXEL_DITHER: Long = 2

    /**
     * Adds the emission color to the color from the emission texture.
     */
    final const val EMISSION_OP_ADD: Long = 0

    /**
     * Multiplies the emission color by the color from the emission texture.
     */
    final const val EMISSION_OP_MULTIPLY: Long = 1

    /**
     * Constant for setting [aoEnabled].
     */
    final const val FEATURE_AMBIENT_OCCLUSION: Long = 6

    /**
     * Constant for setting [anisotropyEnabled].
     */
    final const val FEATURE_ANISOTROPY: Long = 5

    /**
     * Constant for setting [clearcoatEnabled].
     */
    final const val FEATURE_CLEARCOAT: Long = 4

    /**
     * Constant for setting [depthEnabled].
     */
    final const val FEATURE_DEPTH_MAPPING: Long = 7

    /**
     * Constant for setting [detailEnabled].
     */
    final const val FEATURE_DETAIL: Long = 11

    /**
     * Constant for setting [emissionEnabled].
     */
    final const val FEATURE_EMISSION: Long = 1

    /**
     * Represents the size of the [enum Feature] enum.
     */
    final const val FEATURE_MAX: Long = 12

    /**
     * Constant for setting [normalEnabled].
     */
    final const val FEATURE_NORMAL_MAPPING: Long = 2

    /**
     * Constant for setting [refractionEnabled].
     */
    final const val FEATURE_REFRACTION: Long = 10

    /**
     * Constant for setting [rimEnabled].
     */
    final const val FEATURE_RIM: Long = 3

    /**
     * Constant for setting [subsurfScatterEnabled].
     */
    final const val FEATURE_SUBSURACE_SCATTERING: Long = 8

    /**
     * Constant for setting [transmissionEnabled].
     */
    final const val FEATURE_TRANSMISSION: Long = 9

    /**
     * Constant for setting [flagsTransparent].
     */
    final const val FEATURE_TRANSPARENT: Long = 0

    /**
     * Set `ALBEDO` to the per-vertex color specified in the mesh.
     */
    final const val FLAG_ALBEDO_FROM_VERTEX_COLOR: Long = 3

    /**
     * Forces the shader to convert albedo from sRGB space to linear space.
     */
    final const val FLAG_ALBEDO_TEXTURE_FORCE_SRGB: Long = 14

    /**
     * Use `UV2` coordinates to look up from the [aoTexture].
     */
    final const val FLAG_AO_ON_UV2: Long = 11

    /**
     * Shader will keep the scale set for the mesh. Otherwise the scale is lost when billboarding. Only applies when [paramsBillboardMode] is [BILLBOARD_ENABLED].
     */
    final const val FLAG_BILLBOARD_KEEP_SCALE: Long = 7

    /**
     * Disables receiving ambient light.
     */
    final const val FLAG_DISABLE_AMBIENT_LIGHT: Long = 17

    /**
     * Disables the depth test, so this object is drawn on top of all others. However, objects drawn after it in the draw order may cover it.
     */
    final const val FLAG_DISABLE_DEPTH_TEST: Long = 2

    /**
     * Disables receiving shadows from other objects.
     */
    final const val FLAG_DONT_RECEIVE_SHADOWS: Long = 15

    /**
     * Use `UV2` coordinates to look up from the [emissionTexture].
     */
    final const val FLAG_EMISSION_ON_UV2: Long = 12

    /**
     * Ensures that normals appear correct, even with non-uniform scaling.
     */
    final const val FLAG_ENSURE_CORRECT_NORMALS: Long = 16

    /**
     * Object is scaled by depth so that it always appears the same size on screen.
     */
    final const val FLAG_FIXED_SIZE: Long = 6

    /**
     * Represents the size of the [enum Flags] enum.
     */
    final const val FLAG_MAX: Long = 19

    /**
     * Vertex color is in sRGB space and needs to be converted to linear. Only applies in the GLES3 renderer.
     */
    final const val FLAG_SRGB_VERTEX_COLOR: Long = 4

    /**
     * Use world coordinates in the triplanar texture lookup instead of local coordinates.
     */
    final const val FLAG_TRIPLANAR_USE_WORLD: Long = 10

    /**
     * No lighting is used on the object. Color comes directly from `ALBEDO`.
     */
    final const val FLAG_UNSHADED: Long = 0

    /**
     * Use alpha scissor. Set by [paramsUseAlphaScissor].
     */
    final const val FLAG_USE_ALPHA_SCISSOR: Long = 13

    /**
     * Uses point size to alter the size of primitive points. Also changes the albedo texture lookup to use `POINT_COORD` instead of `UV`.
     */
    final const val FLAG_USE_POINT_SIZE: Long = 5

    /**
     * Enables the shadow to opacity feature.
     */
    final const val FLAG_USE_SHADOW_TO_OPACITY: Long = 18

    /**
     * Lighting is calculated per-vertex rather than per-pixel. This can be used to increase the speed of the shader at the cost of quality.
     */
    final const val FLAG_USE_VERTEX_LIGHTING: Long = 1

    /**
     * Use triplanar texture lookup for all texture lookups that would normally use `UV`.
     */
    final const val FLAG_UV1_USE_TRIPLANAR: Long = 8

    /**
     * Use triplanar texture lookup for all texture lookups that would normally use `UV2`.
     */
    final const val FLAG_UV2_USE_TRIPLANAR: Long = 9

    /**
     * Older specular algorithm, included for compatibility.
     */
    final const val SPECULAR_BLINN: Long = 1

    /**
     * No specular blob.
     */
    final const val SPECULAR_DISABLED: Long = 4

    /**
     * Older specular algorithm, included for compatibility.
     */
    final const val SPECULAR_PHONG: Long = 2

    /**
     * Default specular blob.
     */
    final const val SPECULAR_SCHLICK_GGX: Long = 0

    /**
     * Toon blob which changes size based on roughness.
     */
    final const val SPECULAR_TOON: Long = 3

    /**
     * Texture specifying per-pixel color.
     */
    final const val TEXTURE_ALBEDO: Long = 0

    /**
     * Texture specifying per-pixel ambient occlusion value.
     */
    final const val TEXTURE_AMBIENT_OCCLUSION: Long = 8

    /**
     * Used to read from the alpha channel of a texture.
     */
    final const val TEXTURE_CHANNEL_ALPHA: Long = 3

    /**
     * Used to read from the blue channel of a texture.
     */
    final const val TEXTURE_CHANNEL_BLUE: Long = 2

    /**
     * Currently unused.
     */
    final const val TEXTURE_CHANNEL_GRAYSCALE: Long = 4

    /**
     * Used to read from the green channel of a texture.
     */
    final const val TEXTURE_CHANNEL_GREEN: Long = 1

    /**
     * Used to read from the red channel of a texture.
     */
    final const val TEXTURE_CHANNEL_RED: Long = 0

    /**
     * Texture specifying per-pixel clearcoat value.
     */
    final const val TEXTURE_CLEARCOAT: Long = 6

    /**
     * Texture specifying per-pixel depth.
     */
    final const val TEXTURE_DEPTH: Long = 9

    /**
     * Texture specifying per-pixel detail color.
     */
    final const val TEXTURE_DETAIL_ALBEDO: Long = 14

    /**
     * Texture specifying per-pixel detail mask blending value.
     */
    final const val TEXTURE_DETAIL_MASK: Long = 13

    /**
     * Texture specifying per-pixel detail normal.
     */
    final const val TEXTURE_DETAIL_NORMAL: Long = 15

    /**
     * Texture specifying per-pixel emission color.
     */
    final const val TEXTURE_EMISSION: Long = 3

    /**
     * Texture specifying per-pixel flowmap direction for use with [anisotropy].
     */
    final const val TEXTURE_FLOWMAP: Long = 7

    /**
     * Represents the size of the [enum TextureParam] enum.
     */
    final const val TEXTURE_MAX: Long = 16

    /**
     * Texture specifying per-pixel metallic value.
     */
    final const val TEXTURE_METALLIC: Long = 1

    /**
     * Texture specifying per-pixel normal vector.
     */
    final const val TEXTURE_NORMAL: Long = 4

    /**
     * Texture specifying per-pixel refraction strength.
     */
    final const val TEXTURE_REFRACTION: Long = 12

    /**
     * Texture specifying per-pixel rim value.
     */
    final const val TEXTURE_RIM: Long = 5

    /**
     * Texture specifying per-pixel roughness value.
     */
    final const val TEXTURE_ROUGHNESS: Long = 2

    /**
     * Texture specifying per-pixel subsurface scattering.
     */
    final const val TEXTURE_SUBSURFACE_SCATTERING: Long = 10

    /**
     * Texture specifying per-pixel transmission color.
     */
    final const val TEXTURE_TRANSMISSION: Long = 11
  }
}
