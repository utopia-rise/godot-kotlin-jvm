// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Color
import godot.core.RID
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.VECTOR3
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * This class serves as a default material with a wide variety of rendering features and properties without the need to write shader code. See the tutorial below for details.
 */
@GodotBaseType
public open class BaseMaterial3D internal constructor() : Material() {
  /**
   * The material's transparency mode. Some transparency modes will disable shadow casting. Any transparency mode other than [TRANSPARENCY_DISABLED] has a greater performance impact compared to opaque rendering. See also [blendMode].
   */
  public final inline var transparency: Transparency
    @JvmName("transparencyProperty")
    get() = getTransparency()
    @JvmName("transparencyProperty")
    set(`value`) {
      setTransparency(value)
    }

  /**
   * Threshold at which the alpha scissor will discard values. Higher values will result in more pixels being discarded. If the material becomes too opaque at a distance, try increasing [alphaScissorThreshold]. If the material disappears at a distance, try decreasing [alphaScissorThreshold].
   */
  public final inline var alphaScissorThreshold: Float
    @JvmName("alphaScissorThresholdProperty")
    get() = getAlphaScissorThreshold()
    @JvmName("alphaScissorThresholdProperty")
    set(`value`) {
      setAlphaScissorThreshold(value)
    }

  /**
   * The hashing scale for Alpha Hash. Recommended values between `0` and `2`.
   */
  public final inline var alphaHashScale: Float
    @JvmName("alphaHashScaleProperty")
    get() = getAlphaHashScale()
    @JvmName("alphaHashScaleProperty")
    set(`value`) {
      setAlphaHashScale(value)
    }

  /**
   * The type of alpha antialiasing to apply. See [AlphaAntiAliasing].
   */
  public final inline var alphaAntialiasingMode: AlphaAntiAliasing
    @JvmName("alphaAntialiasingModeProperty")
    get() = getAlphaAntialiasing()
    @JvmName("alphaAntialiasingModeProperty")
    set(`value`) {
      setAlphaAntialiasing(value)
    }

  /**
   * Threshold at which antialiasing will be applied on the alpha channel.
   */
  public final inline var alphaAntialiasingEdge: Float
    @JvmName("alphaAntialiasingEdgeProperty")
    get() = getAlphaAntialiasingEdge()
    @JvmName("alphaAntialiasingEdgeProperty")
    set(`value`) {
      setAlphaAntialiasingEdge(value)
    }

  /**
   * The material's blend mode.
   *
   * **Note:** Values other than `Mix` force the object into the transparent pipeline. See [BlendMode].
   */
  public final inline var blendMode: BlendMode
    @JvmName("blendModeProperty")
    get() = getBlendMode()
    @JvmName("blendModeProperty")
    set(`value`) {
      setBlendMode(value)
    }

  /**
   * Determines which side of the triangle to cull depending on whether the triangle faces towards or away from the camera. See [CullMode].
   */
  public final inline var cullMode: CullMode
    @JvmName("cullModeProperty")
    get() = getCullMode()
    @JvmName("cullModeProperty")
    set(`value`) {
      setCullMode(value)
    }

  /**
   * Determines when depth rendering takes place. See [DepthDrawMode]. See also [transparency].
   */
  public final inline var depthDrawMode: DepthDrawMode
    @JvmName("depthDrawModeProperty")
    get() = getDepthDrawMode()
    @JvmName("depthDrawModeProperty")
    set(`value`) {
      setDepthDrawMode(value)
    }

  /**
   * If `true`, depth testing is disabled and the object will be drawn in render order.
   */
  public final inline var noDepthTest: Boolean
    @JvmName("noDepthTestProperty")
    get() = getFlag(BaseMaterial3D.Flags.DISABLE_DEPTH_TEST)
    @JvmName("noDepthTestProperty")
    set(`value`) {
      setFlag(BaseMaterial3D.Flags.DISABLE_DEPTH_TEST, value)
    }

  /**
   * Sets whether the shading takes place, per-pixel, per-vertex or unshaded. Per-vertex lighting is faster, making it the best choice for mobile applications, however it looks considerably worse than per-pixel. Unshaded rendering is the fastest, but disables all interactions with lights.
   */
  public final inline var shadingMode: ShadingMode
    @JvmName("shadingModeProperty")
    get() = getShadingMode()
    @JvmName("shadingModeProperty")
    set(`value`) {
      setShadingMode(value)
    }

  /**
   * The algorithm used for diffuse light scattering. See [DiffuseMode].
   */
  public final inline var diffuseMode: DiffuseMode
    @JvmName("diffuseModeProperty")
    get() = getDiffuseMode()
    @JvmName("diffuseModeProperty")
    set(`value`) {
      setDiffuseMode(value)
    }

  /**
   * The method for rendering the specular blob. See [SpecularMode].
   *
   * **Note:** [specularMode] only applies to the specular blob. It does not affect specular reflections from the sky, screen-space reflections, [VoxelGI], SDFGI or [ReflectionProbe]s. To disable reflections from these sources as well, set [metallicSpecular] to `0.0` instead.
   */
  public final inline var specularMode: SpecularMode
    @JvmName("specularModeProperty")
    get() = getSpecularMode()
    @JvmName("specularModeProperty")
    set(`value`) {
      setSpecularMode(value)
    }

  /**
   * If `true`, the object receives no ambient light.
   */
  public final inline var disableAmbientLight: Boolean
    @JvmName("disableAmbientLightProperty")
    get() = getFlag(BaseMaterial3D.Flags.DISABLE_AMBIENT_LIGHT)
    @JvmName("disableAmbientLightProperty")
    set(`value`) {
      setFlag(BaseMaterial3D.Flags.DISABLE_AMBIENT_LIGHT, value)
    }

  /**
   * If `true`, the object will not be affected by fog (neither volumetric nor depth fog). This is useful for unshaded or transparent materials (e.g. particles), which without this setting will be affected even if fully transparent.
   */
  public final inline var disableFog: Boolean
    @JvmName("disableFogProperty")
    get() = getFlag(BaseMaterial3D.Flags.DISABLE_FOG)
    @JvmName("disableFogProperty")
    set(`value`) {
      setFlag(BaseMaterial3D.Flags.DISABLE_FOG, value)
    }

  /**
   * If `true`, the vertex color is used as albedo color.
   */
  public final inline var vertexColorUseAsAlbedo: Boolean
    @JvmName("vertexColorUseAsAlbedoProperty")
    get() = getFlag(BaseMaterial3D.Flags.ALBEDO_FROM_VERTEX_COLOR)
    @JvmName("vertexColorUseAsAlbedoProperty")
    set(`value`) {
      setFlag(BaseMaterial3D.Flags.ALBEDO_FROM_VERTEX_COLOR, value)
    }

  /**
   * If `true`, vertex colors are considered to be stored in sRGB color space and are converted to linear color space during rendering. If `false`, vertex colors are considered to be stored in linear color space and are rendered as-is. See also [albedoTextureForceSrgb].
   *
   * **Note:** Only effective when using the Forward+ and Mobile rendering methods, not Compatibility.
   */
  public final inline var vertexColorIsSrgb: Boolean
    @JvmName("vertexColorIsSrgbProperty")
    get() = getFlag(BaseMaterial3D.Flags.SRGB_VERTEX_COLOR)
    @JvmName("vertexColorIsSrgbProperty")
    set(`value`) {
      setFlag(BaseMaterial3D.Flags.SRGB_VERTEX_COLOR, value)
    }

  /**
   * The material's base color.
   *
   * **Note:** If [detailEnabled] is `true` and a [detailAlbedo] texture is specified, [albedoColor] will *not* modulate the detail texture. This can be used to color partial areas of a material by not specifying an albedo texture and using a transparent [detailAlbedo] texture instead.
   *
   * **Warning:**
   * Be careful when trying to modify a local [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again afterward.
   */
  @CoreTypeLocalCopy
  public final inline var albedoColor: Color
    @JvmName("albedoColorProperty")
    get() = getAlbedo()
    @JvmName("albedoColorProperty")
    set(`value`) {
      setAlbedo(value)
    }

  /**
   * Texture to multiply by [albedoColor]. Used for basic texturing of objects.
   *
   * If the texture appears unexpectedly too dark or too bright, check [albedoTextureForceSrgb].
   */
  public final inline var albedoTexture: Texture2D?
    @JvmName("albedoTextureProperty")
    get() = getTexture(BaseMaterial3D.TextureParam.ALBEDO)
    @JvmName("albedoTextureProperty")
    set(`value`) {
      setTexture(BaseMaterial3D.TextureParam.ALBEDO, value)
    }

  /**
   * If `true`, forces a conversion of the [albedoTexture] from sRGB color space to linear color space. See also [vertexColorIsSrgb].
   *
   * This should only be enabled when needed (typically when using a [ViewportTexture] as [albedoTexture]). If [albedoTextureForceSrgb] is `true` when it shouldn't be, the texture will appear to be too dark. If [albedoTextureForceSrgb] is `false` when it shouldn't be, the texture will appear to be too bright.
   */
  public final inline var albedoTextureForceSrgb: Boolean
    @JvmName("albedoTextureForceSrgbProperty")
    get() = getFlag(BaseMaterial3D.Flags.ALBEDO_TEXTURE_FORCE_SRGB)
    @JvmName("albedoTextureForceSrgbProperty")
    set(`value`) {
      setFlag(BaseMaterial3D.Flags.ALBEDO_TEXTURE_FORCE_SRGB, value)
    }

  /**
   * Enables multichannel signed distance field rendering shader. Use [msdfPixelRange] and [msdfOutlineSize] to configure MSDF parameters.
   */
  public final inline var albedoTextureMsdf: Boolean
    @JvmName("albedoTextureMsdfProperty")
    get() = getFlag(BaseMaterial3D.Flags.ALBEDO_TEXTURE_MSDF)
    @JvmName("albedoTextureMsdfProperty")
    set(`value`) {
      setFlag(BaseMaterial3D.Flags.ALBEDO_TEXTURE_MSDF, value)
    }

  /**
   * The Occlusion/Roughness/Metallic texture to use. This is a more efficient replacement of [aoTexture], [roughnessTexture] and [metallicTexture] in [ORMMaterial3D]. Ambient occlusion is stored in the red channel. Roughness map is stored in the green channel. Metallic map is stored in the blue channel. The alpha channel is ignored.
   */
  public final inline var ormTexture: Texture2D?
    @JvmName("ormTextureProperty")
    get() = getTexture(BaseMaterial3D.TextureParam.ORM)
    @JvmName("ormTextureProperty")
    set(`value`) {
      setTexture(BaseMaterial3D.TextureParam.ORM, value)
    }

  /**
   * A high value makes the material appear more like a metal. Non-metals use their albedo as the diffuse color and add diffuse to the specular reflection. With non-metals, the reflection appears on top of the albedo color. Metals use their albedo as a multiplier to the specular reflection and set the diffuse color to black resulting in a tinted reflection. Materials work better when fully metal or fully non-metal, values between `0` and `1` should only be used for blending between metal and non-metal sections. To alter the amount of reflection use [roughness].
   */
  public final inline var metallic: Float
    @JvmName("metallicProperty")
    get() = getMetallic()
    @JvmName("metallicProperty")
    set(`value`) {
      setMetallic(value)
    }

  /**
   * Adjusts the strength of specular reflections. Specular reflections are composed of scene reflections and the specular lobe which is the bright spot that is reflected from light sources. When set to `0.0`, no specular reflections will be visible. This differs from the [SPECULAR_DISABLED] [SpecularMode] as [SPECULAR_DISABLED] only applies to the specular lobe from the light source.
   *
   * **Note:** Unlike [metallic], this is not energy-conserving, so it should be left at `0.5` in most cases. See also [roughness].
   */
  public final inline var metallicSpecular: Float
    @JvmName("metallicSpecularProperty")
    get() = getSpecular()
    @JvmName("metallicSpecularProperty")
    set(`value`) {
      setSpecular(value)
    }

  /**
   * Texture used to specify metallic for an object. This is multiplied by [metallic].
   */
  public final inline var metallicTexture: Texture2D?
    @JvmName("metallicTextureProperty")
    get() = getTexture(BaseMaterial3D.TextureParam.METALLIC)
    @JvmName("metallicTextureProperty")
    set(`value`) {
      setTexture(BaseMaterial3D.TextureParam.METALLIC, value)
    }

  /**
   * Specifies the channel of the [metallicTexture] in which the metallic information is stored. This is useful when you store the information for multiple effects in a single texture. For example if you stored metallic in the red channel, roughness in the blue, and ambient occlusion in the green you could reduce the number of textures you use.
   */
  public final inline var metallicTextureChannel: TextureChannel
    @JvmName("metallicTextureChannelProperty")
    get() = getMetallicTextureChannel()
    @JvmName("metallicTextureChannelProperty")
    set(`value`) {
      setMetallicTextureChannel(value)
    }

  /**
   * Surface reflection. A value of `0` represents a perfect mirror while a value of `1` completely blurs the reflection. See also [metallic].
   */
  public final inline var roughness: Float
    @JvmName("roughnessProperty")
    get() = getRoughness()
    @JvmName("roughnessProperty")
    set(`value`) {
      setRoughness(value)
    }

  /**
   * Texture used to control the roughness per-pixel. Multiplied by [roughness].
   */
  public final inline var roughnessTexture: Texture2D?
    @JvmName("roughnessTextureProperty")
    get() = getTexture(BaseMaterial3D.TextureParam.ROUGHNESS)
    @JvmName("roughnessTextureProperty")
    set(`value`) {
      setTexture(BaseMaterial3D.TextureParam.ROUGHNESS, value)
    }

  /**
   * Specifies the channel of the [roughnessTexture] in which the roughness information is stored. This is useful when you store the information for multiple effects in a single texture. For example if you stored metallic in the red channel, roughness in the blue, and ambient occlusion in the green you could reduce the number of textures you use.
   */
  public final inline var roughnessTextureChannel: TextureChannel
    @JvmName("roughnessTextureChannelProperty")
    get() = getRoughnessTextureChannel()
    @JvmName("roughnessTextureChannelProperty")
    set(`value`) {
      setRoughnessTextureChannel(value)
    }

  /**
   * If `true`, the body emits light. Emitting light makes the object appear brighter. The object can also cast light on other objects if a [VoxelGI], SDFGI, or [LightmapGI] is used and this object is used in baked lighting.
   */
  public final inline var emissionEnabled: Boolean
    @JvmName("emissionEnabledProperty")
    get() = getFeature(BaseMaterial3D.Feature.EMISSION)
    @JvmName("emissionEnabledProperty")
    set(`value`) {
      setFeature(BaseMaterial3D.Feature.EMISSION, value)
    }

  /**
   * The emitted light's color. See [emissionEnabled].
   *
   * **Warning:**
   * Be careful when trying to modify a local [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again afterward.
   */
  @CoreTypeLocalCopy
  public final inline var emission: Color
    @JvmName("emissionProperty")
    get() = getEmission()
    @JvmName("emissionProperty")
    set(`value`) {
      setEmission(value)
    }

  /**
   * Multiplier for emitted light. See [emissionEnabled].
   */
  public final inline var emissionEnergyMultiplier: Float
    @JvmName("emissionEnergyMultiplierProperty")
    get() = getEmissionEnergyMultiplier()
    @JvmName("emissionEnergyMultiplierProperty")
    set(`value`) {
      setEmissionEnergyMultiplier(value)
    }

  /**
   * Luminance of emitted light, measured in nits (candela per square meter). Only available when [ProjectSettings.rendering/lightsAndShadows/usePhysicalLightUnits] is enabled. The default is roughly equivalent to an indoor lightbulb.
   */
  public final inline var emissionIntensity: Float
    @JvmName("emissionIntensityProperty")
    get() = getEmissionIntensity()
    @JvmName("emissionIntensityProperty")
    set(`value`) {
      setEmissionIntensity(value)
    }

  /**
   * Sets how [emission] interacts with [emissionTexture]. Can either add or multiply. See [EmissionOperator] for options.
   */
  public final inline var emissionOperator: EmissionOperator
    @JvmName("emissionOperatorProperty")
    get() = getEmissionOperator()
    @JvmName("emissionOperatorProperty")
    set(`value`) {
      setEmissionOperator(value)
    }

  /**
   * Use `UV2` to read from the [emissionTexture].
   */
  public final inline var emissionOnUv2: Boolean
    @JvmName("emissionOnUv2Property")
    get() = getFlag(BaseMaterial3D.Flags.EMISSION_ON_UV2)
    @JvmName("emissionOnUv2Property")
    set(`value`) {
      setFlag(BaseMaterial3D.Flags.EMISSION_ON_UV2, value)
    }

  /**
   * Texture that specifies how much surface emits light at a given point.
   */
  public final inline var emissionTexture: Texture2D?
    @JvmName("emissionTextureProperty")
    get() = getTexture(BaseMaterial3D.TextureParam.EMISSION)
    @JvmName("emissionTextureProperty")
    set(`value`) {
      setTexture(BaseMaterial3D.TextureParam.EMISSION, value)
    }

  /**
   * If `true`, normal mapping is enabled. This has a slight performance cost, especially on mobile GPUs.
   */
  public final inline var normalEnabled: Boolean
    @JvmName("normalEnabledProperty")
    get() = getFeature(BaseMaterial3D.Feature.NORMAL_MAPPING)
    @JvmName("normalEnabledProperty")
    set(`value`) {
      setFeature(BaseMaterial3D.Feature.NORMAL_MAPPING, value)
    }

  /**
   * The strength of the normal map's effect.
   */
  public final inline var normalScale: Float
    @JvmName("normalScaleProperty")
    get() = getNormalScale()
    @JvmName("normalScaleProperty")
    set(`value`) {
      setNormalScale(value)
    }

  /**
   * Texture used to specify the normal at a given pixel. The [normalTexture] only uses the red and green channels; the blue and alpha channels are ignored. The normal read from [normalTexture] is oriented around the surface normal provided by the [Mesh].
   *
   * **Note:** The mesh must have both normals and tangents defined in its vertex data. Otherwise, the normal map won't render correctly and will only appear to darken the whole surface. If creating geometry with [SurfaceTool], you can use [SurfaceTool.generateNormals] and [SurfaceTool.generateTangents] to automatically generate normals and tangents respectively.
   *
   * **Note:** Godot expects the normal map to use X+, Y+, and Z+ coordinates. See [url=http://wiki.polycount.com/wiki/Normal_Map_Technical_Details#Common_Swizzle_Coordinates]this page[/url] for a comparison of normal map coordinates expected by popular engines.
   *
   * **Note:** If [detailEnabled] is `true`, the [detailAlbedo] texture is drawn *below* the [normalTexture]. To display a normal map *above* the [detailAlbedo] texture, use [detailNormal] instead.
   */
  public final inline var normalTexture: Texture2D?
    @JvmName("normalTextureProperty")
    get() = getTexture(BaseMaterial3D.TextureParam.NORMAL)
    @JvmName("normalTextureProperty")
    set(`value`) {
      setTexture(BaseMaterial3D.TextureParam.NORMAL, value)
    }

  /**
   * If `true`, rim effect is enabled. Rim lighting increases the brightness at glancing angles on an object.
   *
   * **Note:** Rim lighting is not visible if the material's [shadingMode] is [SHADING_MODE_UNSHADED].
   */
  public final inline var rimEnabled: Boolean
    @JvmName("rimEnabledProperty")
    get() = getFeature(BaseMaterial3D.Feature.RIM)
    @JvmName("rimEnabledProperty")
    set(`value`) {
      setFeature(BaseMaterial3D.Feature.RIM, value)
    }

  /**
   * Sets the strength of the rim lighting effect.
   */
  public final inline var rim: Float
    @JvmName("rimProperty")
    get() = getRim()
    @JvmName("rimProperty")
    set(`value`) {
      setRim(value)
    }

  /**
   * The amount of to blend light and albedo color when rendering rim effect. If `0` the light color is used, while `1` means albedo color is used. An intermediate value generally works best.
   */
  public final inline var rimTint: Float
    @JvmName("rimTintProperty")
    get() = getRimTint()
    @JvmName("rimTintProperty")
    set(`value`) {
      setRimTint(value)
    }

  /**
   * Texture used to set the strength of the rim lighting effect per-pixel. Multiplied by [rim].
   */
  public final inline var rimTexture: Texture2D?
    @JvmName("rimTextureProperty")
    get() = getTexture(BaseMaterial3D.TextureParam.RIM)
    @JvmName("rimTextureProperty")
    set(`value`) {
      setTexture(BaseMaterial3D.TextureParam.RIM, value)
    }

  /**
   * If `true`, clearcoat rendering is enabled. Adds a secondary transparent pass to the lighting calculation resulting in an added specular blob. This makes materials appear as if they have a clear layer on them that can be either glossy or rough.
   *
   * **Note:** Clearcoat rendering is not visible if the material's [shadingMode] is [SHADING_MODE_UNSHADED].
   */
  public final inline var clearcoatEnabled: Boolean
    @JvmName("clearcoatEnabledProperty")
    get() = getFeature(BaseMaterial3D.Feature.CLEARCOAT)
    @JvmName("clearcoatEnabledProperty")
    set(`value`) {
      setFeature(BaseMaterial3D.Feature.CLEARCOAT, value)
    }

  /**
   * Sets the strength of the clearcoat effect. Setting to `0` looks the same as disabling the clearcoat effect.
   */
  public final inline var clearcoat: Float
    @JvmName("clearcoatProperty")
    get() = getClearcoat()
    @JvmName("clearcoatProperty")
    set(`value`) {
      setClearcoat(value)
    }

  /**
   * Sets the roughness of the clearcoat pass. A higher value results in a rougher clearcoat while a lower value results in a smoother clearcoat.
   */
  public final inline var clearcoatRoughness: Float
    @JvmName("clearcoatRoughnessProperty")
    get() = getClearcoatRoughness()
    @JvmName("clearcoatRoughnessProperty")
    set(`value`) {
      setClearcoatRoughness(value)
    }

  /**
   * Texture that defines the strength of the clearcoat effect and the glossiness of the clearcoat. Strength is specified in the red channel while glossiness is specified in the green channel.
   */
  public final inline var clearcoatTexture: Texture2D?
    @JvmName("clearcoatTextureProperty")
    get() = getTexture(BaseMaterial3D.TextureParam.CLEARCOAT)
    @JvmName("clearcoatTextureProperty")
    set(`value`) {
      setTexture(BaseMaterial3D.TextureParam.CLEARCOAT, value)
    }

  /**
   * If `true`, anisotropy is enabled. Anisotropy changes the shape of the specular blob and aligns it to tangent space. This is useful for brushed aluminum and hair reflections.
   *
   * **Note:** Mesh tangents are needed for anisotropy to work. If the mesh does not contain tangents, the anisotropy effect will appear broken.
   *
   * **Note:** Material anisotropy should not to be confused with anisotropic texture filtering, which can be enabled by setting [textureFilter] to [TEXTURE_FILTER_LINEAR_WITH_MIPMAPS_ANISOTROPIC].
   */
  public final inline var anisotropyEnabled: Boolean
    @JvmName("anisotropyEnabledProperty")
    get() = getFeature(BaseMaterial3D.Feature.ANISOTROPY)
    @JvmName("anisotropyEnabledProperty")
    set(`value`) {
      setFeature(BaseMaterial3D.Feature.ANISOTROPY, value)
    }

  /**
   * The strength of the anisotropy effect. This is multiplied by [anisotropyFlowmap]'s alpha channel if a texture is defined there and the texture contains an alpha channel.
   */
  public final inline var anisotropy: Float
    @JvmName("anisotropyProperty")
    get() = getAnisotropy()
    @JvmName("anisotropyProperty")
    set(`value`) {
      setAnisotropy(value)
    }

  /**
   * Texture that offsets the tangent map for anisotropy calculations and optionally controls the anisotropy effect (if an alpha channel is present). The flowmap texture is expected to be a derivative map, with the red channel representing distortion on the X axis and green channel representing distortion on the Y axis. Values below 0.5 will result in negative distortion, whereas values above 0.5 will result in positive distortion.
   *
   * If present, the texture's alpha channel will be used to multiply the strength of the [anisotropy] effect. Fully opaque pixels will keep the anisotropy effect's original strength while fully transparent pixels will disable the anisotropy effect entirely. The flowmap texture's blue channel is ignored.
   */
  public final inline var anisotropyFlowmap: Texture2D?
    @JvmName("anisotropyFlowmapProperty")
    get() = getTexture(BaseMaterial3D.TextureParam.FLOWMAP)
    @JvmName("anisotropyFlowmapProperty")
    set(`value`) {
      setTexture(BaseMaterial3D.TextureParam.FLOWMAP, value)
    }

  /**
   * If `true`, ambient occlusion is enabled. Ambient occlusion darkens areas based on the [aoTexture].
   */
  public final inline var aoEnabled: Boolean
    @JvmName("aoEnabledProperty")
    get() = getFeature(BaseMaterial3D.Feature.AMBIENT_OCCLUSION)
    @JvmName("aoEnabledProperty")
    set(`value`) {
      setFeature(BaseMaterial3D.Feature.AMBIENT_OCCLUSION, value)
    }

  /**
   * Amount that ambient occlusion affects lighting from lights. If `0`, ambient occlusion only affects ambient light. If `1`, ambient occlusion affects lights just as much as it affects ambient light. This can be used to impact the strength of the ambient occlusion effect, but typically looks unrealistic.
   */
  public final inline var aoLightAffect: Float
    @JvmName("aoLightAffectProperty")
    get() = getAoLightAffect()
    @JvmName("aoLightAffectProperty")
    set(`value`) {
      setAoLightAffect(value)
    }

  /**
   * Texture that defines the amount of ambient occlusion for a given point on the object.
   */
  public final inline var aoTexture: Texture2D?
    @JvmName("aoTextureProperty")
    get() = getTexture(BaseMaterial3D.TextureParam.AMBIENT_OCCLUSION)
    @JvmName("aoTextureProperty")
    set(`value`) {
      setTexture(BaseMaterial3D.TextureParam.AMBIENT_OCCLUSION, value)
    }

  /**
   * If `true`, use `UV2` coordinates to look up from the [aoTexture].
   */
  public final inline var aoOnUv2: Boolean
    @JvmName("aoOnUv2Property")
    get() = getFlag(BaseMaterial3D.Flags.AO_ON_UV2)
    @JvmName("aoOnUv2Property")
    set(`value`) {
      setFlag(BaseMaterial3D.Flags.AO_ON_UV2, value)
    }

  /**
   * Specifies the channel of the [aoTexture] in which the ambient occlusion information is stored. This is useful when you store the information for multiple effects in a single texture. For example if you stored metallic in the red channel, roughness in the blue, and ambient occlusion in the green you could reduce the number of textures you use.
   */
  public final inline var aoTextureChannel: TextureChannel
    @JvmName("aoTextureChannelProperty")
    get() = getAoTextureChannel()
    @JvmName("aoTextureChannelProperty")
    set(`value`) {
      setAoTextureChannel(value)
    }

  /**
   * If `true`, height mapping is enabled (also called "parallax mapping" or "depth mapping"). See also [normalEnabled]. Height mapping is a demanding feature on the GPU, so it should only be used on materials where it makes a significant visual difference.
   *
   * **Note:** Height mapping is not supported if triplanar mapping is used on the same material. The value of [heightmapEnabled] will be ignored if [uv1Triplanar] is enabled.
   */
  public final inline var heightmapEnabled: Boolean
    @JvmName("heightmapEnabledProperty")
    get() = getFeature(BaseMaterial3D.Feature.HEIGHT_MAPPING)
    @JvmName("heightmapEnabledProperty")
    set(`value`) {
      setFeature(BaseMaterial3D.Feature.HEIGHT_MAPPING, value)
    }

  /**
   * The heightmap scale to use for the parallax effect (see [heightmapEnabled]). The default value is tuned so that the highest point (value = 255) appears to be 5 cm higher than the lowest point (value = 0). Higher values result in a deeper appearance, but may result in artifacts appearing when looking at the material from oblique angles, especially when the camera moves. Negative values can be used to invert the parallax effect, but this is different from inverting the texture using [heightmapFlipTexture] as the material will also appear to be "closer" to the camera. In most cases, [heightmapScale] should be kept to a positive value.
   *
   * **Note:** If the height map effect looks strange regardless of this value, try adjusting [heightmapFlipBinormal] and [heightmapFlipTangent]. See also [heightmapTexture] for recommendations on authoring heightmap textures, as the way the heightmap texture is authored affects how [heightmapScale] behaves.
   */
  public final inline var heightmapScale: Float
    @JvmName("heightmapScaleProperty")
    get() = getHeightmapScale()
    @JvmName("heightmapScaleProperty")
    set(`value`) {
      setHeightmapScale(value)
    }

  /**
   * If `true`, uses parallax occlusion mapping to represent depth in the material instead of simple offset mapping (see [heightmapEnabled]). This results in a more convincing depth effect, but is much more expensive on the GPU. Only enable this on materials where it makes a significant visual difference.
   */
  public final inline var heightmapDeepParallax: Boolean
    @JvmName("heightmapDeepParallaxProperty")
    get() = isHeightmapDeepParallaxEnabled()
    @JvmName("heightmapDeepParallaxProperty")
    set(`value`) {
      setHeightmapDeepParallax(value)
    }

  /**
   * The number of layers to use for parallax occlusion mapping when the camera is far away from the material. Higher values result in a more convincing depth effect, especially in materials that have steep height changes. Higher values have a significant cost on the GPU, so it should only be increased on materials where it makes a significant visual difference.
   *
   * **Note:** Only effective if [heightmapDeepParallax] is `true`.
   */
  public final inline var heightmapMinLayers: Int
    @JvmName("heightmapMinLayersProperty")
    get() = getHeightmapDeepParallaxMinLayers()
    @JvmName("heightmapMinLayersProperty")
    set(`value`) {
      setHeightmapDeepParallaxMinLayers(value)
    }

  /**
   * The number of layers to use for parallax occlusion mapping when the camera is up close to the material. Higher values result in a more convincing depth effect, especially in materials that have steep height changes. Higher values have a significant cost on the GPU, so it should only be increased on materials where it makes a significant visual difference.
   *
   * **Note:** Only effective if [heightmapDeepParallax] is `true`.
   */
  public final inline var heightmapMaxLayers: Int
    @JvmName("heightmapMaxLayersProperty")
    get() = getHeightmapDeepParallaxMaxLayers()
    @JvmName("heightmapMaxLayersProperty")
    set(`value`) {
      setHeightmapDeepParallaxMaxLayers(value)
    }

  /**
   * If `true`, flips the mesh's tangent vectors when interpreting the height map. If the heightmap effect looks strange when the camera moves (even with a reasonable [heightmapScale]), try setting this to `true`.
   */
  public final inline var heightmapFlipTangent: Boolean
    @JvmName("heightmapFlipTangentProperty")
    get() = getHeightmapDeepParallaxFlipTangent()
    @JvmName("heightmapFlipTangentProperty")
    set(`value`) {
      setHeightmapDeepParallaxFlipTangent(value)
    }

  /**
   * If `true`, flips the mesh's binormal vectors when interpreting the height map. If the heightmap effect looks strange when the camera moves (even with a reasonable [heightmapScale]), try setting this to `true`.
   */
  public final inline var heightmapFlipBinormal: Boolean
    @JvmName("heightmapFlipBinormalProperty")
    get() = getHeightmapDeepParallaxFlipBinormal()
    @JvmName("heightmapFlipBinormalProperty")
    set(`value`) {
      setHeightmapDeepParallaxFlipBinormal(value)
    }

  /**
   * The texture to use as a height map. See also [heightmapEnabled].
   *
   * For best results, the texture should be normalized (with [heightmapScale] reduced to compensate). In [url=https://gimp.org]GIMP[/url], this can be done using **Colors > Auto > Equalize**. If the texture only uses a small part of its available range, the parallax effect may look strange, especially when the camera moves.
   *
   * **Note:** To reduce memory usage and improve loading times, you may be able to use a lower-resolution heightmap texture as most heightmaps are only comprised of low-frequency data.
   */
  public final inline var heightmapTexture: Texture2D?
    @JvmName("heightmapTextureProperty")
    get() = getTexture(BaseMaterial3D.TextureParam.HEIGHTMAP)
    @JvmName("heightmapTextureProperty")
    set(`value`) {
      setTexture(BaseMaterial3D.TextureParam.HEIGHTMAP, value)
    }

  /**
   * If `true`, interprets the height map texture as a depth map, with brighter values appearing to be "lower" in altitude compared to darker values.
   *
   * This can be enabled for compatibility with some materials authored for Godot 3.x. This is not necessary if the Invert import option was used to invert the depth map in Godot 3.x, in which case [heightmapFlipTexture] should remain `false`.
   */
  public final inline var heightmapFlipTexture: Boolean
    @JvmName("heightmapFlipTextureProperty")
    get() = getFlag(BaseMaterial3D.Flags.INVERT_HEIGHTMAP)
    @JvmName("heightmapFlipTextureProperty")
    set(`value`) {
      setFlag(BaseMaterial3D.Flags.INVERT_HEIGHTMAP, value)
    }

  /**
   * If `true`, subsurface scattering is enabled. Emulates light that penetrates an object's surface, is scattered, and then emerges. Subsurface scattering quality is controlled by [ProjectSettings.rendering/environment/subsurfaceScattering/subsurfaceScatteringQuality].
   */
  public final inline var subsurfScatterEnabled: Boolean
    @JvmName("subsurfScatterEnabledProperty")
    get() = getFeature(BaseMaterial3D.Feature.SUBSURFACE_SCATTERING)
    @JvmName("subsurfScatterEnabledProperty")
    set(`value`) {
      setFeature(BaseMaterial3D.Feature.SUBSURFACE_SCATTERING, value)
    }

  /**
   * The strength of the subsurface scattering effect. The depth of the effect is also controlled by [ProjectSettings.rendering/environment/subsurfaceScattering/subsurfaceScatteringScale], which is set globally.
   */
  public final inline var subsurfScatterStrength: Float
    @JvmName("subsurfScatterStrengthProperty")
    get() = getSubsurfaceScatteringStrength()
    @JvmName("subsurfScatterStrengthProperty")
    set(`value`) {
      setSubsurfaceScatteringStrength(value)
    }

  /**
   * If `true`, subsurface scattering will use a special mode optimized for the color and density of human skin, such as boosting the intensity of the red channel in subsurface scattering.
   */
  public final inline var subsurfScatterSkinMode: Boolean
    @JvmName("subsurfScatterSkinModeProperty")
    get() = getFlag(BaseMaterial3D.Flags.SUBSURFACE_MODE_SKIN)
    @JvmName("subsurfScatterSkinModeProperty")
    set(`value`) {
      setFlag(BaseMaterial3D.Flags.SUBSURFACE_MODE_SKIN, value)
    }

  /**
   * Texture used to control the subsurface scattering strength. Stored in the red texture channel. Multiplied by [subsurfScatterStrength].
   */
  public final inline var subsurfScatterTexture: Texture2D?
    @JvmName("subsurfScatterTextureProperty")
    get() = getTexture(BaseMaterial3D.TextureParam.SUBSURFACE_SCATTERING)
    @JvmName("subsurfScatterTextureProperty")
    set(`value`) {
      setTexture(BaseMaterial3D.TextureParam.SUBSURFACE_SCATTERING, value)
    }

  /**
   * If `true`, enables subsurface scattering transmittance. Only effective if [subsurfScatterEnabled] is `true`. See also [backlightEnabled].
   */
  public final inline var subsurfScatterTransmittanceEnabled: Boolean
    @JvmName("subsurfScatterTransmittanceEnabledProperty")
    get() = getFeature(BaseMaterial3D.Feature.SUBSURFACE_TRANSMITTANCE)
    @JvmName("subsurfScatterTransmittanceEnabledProperty")
    set(`value`) {
      setFeature(BaseMaterial3D.Feature.SUBSURFACE_TRANSMITTANCE, value)
    }

  /**
   * The color to multiply the subsurface scattering transmittance effect with. Ignored if [subsurfScatterSkinMode] is `true`.
   *
   * **Warning:**
   * Be careful when trying to modify a local [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again afterward.
   */
  @CoreTypeLocalCopy
  public final inline var subsurfScatterTransmittanceColor: Color
    @JvmName("subsurfScatterTransmittanceColorProperty")
    get() = getTransmittanceColor()
    @JvmName("subsurfScatterTransmittanceColorProperty")
    set(`value`) {
      setTransmittanceColor(value)
    }

  /**
   * The texture to use for multiplying the intensity of the subsurface scattering transmittance intensity. See also [subsurfScatterTexture]. Ignored if [subsurfScatterSkinMode] is `true`.
   */
  public final inline var subsurfScatterTransmittanceTexture: Texture2D?
    @JvmName("subsurfScatterTransmittanceTextureProperty")
    get() = getTexture(BaseMaterial3D.TextureParam.SUBSURFACE_TRANSMITTANCE)
    @JvmName("subsurfScatterTransmittanceTextureProperty")
    set(`value`) {
      setTexture(BaseMaterial3D.TextureParam.SUBSURFACE_TRANSMITTANCE, value)
    }

  /**
   * The depth of the subsurface scattering transmittance effect.
   */
  public final inline var subsurfScatterTransmittanceDepth: Float
    @JvmName("subsurfScatterTransmittanceDepthProperty")
    get() = getTransmittanceDepth()
    @JvmName("subsurfScatterTransmittanceDepthProperty")
    set(`value`) {
      setTransmittanceDepth(value)
    }

  /**
   * The intensity of the subsurface scattering transmittance effect.
   */
  public final inline var subsurfScatterTransmittanceBoost: Float
    @JvmName("subsurfScatterTransmittanceBoostProperty")
    get() = getTransmittanceBoost()
    @JvmName("subsurfScatterTransmittanceBoostProperty")
    set(`value`) {
      setTransmittanceBoost(value)
    }

  /**
   * If `true`, the backlight effect is enabled. See also [subsurfScatterTransmittanceEnabled].
   */
  public final inline var backlightEnabled: Boolean
    @JvmName("backlightEnabledProperty")
    get() = getFeature(BaseMaterial3D.Feature.BACKLIGHT)
    @JvmName("backlightEnabledProperty")
    set(`value`) {
      setFeature(BaseMaterial3D.Feature.BACKLIGHT, value)
    }

  /**
   * The color used by the backlight effect. Represents the light passing through an object.
   *
   * **Warning:**
   * Be careful when trying to modify a local [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again afterward.
   */
  @CoreTypeLocalCopy
  public final inline var backlight: Color
    @JvmName("backlightProperty")
    get() = getBacklight()
    @JvmName("backlightProperty")
    set(`value`) {
      setBacklight(value)
    }

  /**
   * Texture used to control the backlight effect per-pixel. Added to [backlight].
   */
  public final inline var backlightTexture: Texture2D?
    @JvmName("backlightTextureProperty")
    get() = getTexture(BaseMaterial3D.TextureParam.BACKLIGHT)
    @JvmName("backlightTextureProperty")
    set(`value`) {
      setTexture(BaseMaterial3D.TextureParam.BACKLIGHT, value)
    }

  /**
   * If `true`, the refraction effect is enabled. Distorts transparency based on light from behind the object.
   *
   * **Note:** Refraction is implemented using the screen texture. Only opaque materials will appear in the refraction, since transparent materials do not appear in the screen texture.
   */
  public final inline var refractionEnabled: Boolean
    @JvmName("refractionEnabledProperty")
    get() = getFeature(BaseMaterial3D.Feature.REFRACTION)
    @JvmName("refractionEnabledProperty")
    set(`value`) {
      setFeature(BaseMaterial3D.Feature.REFRACTION, value)
    }

  /**
   * The strength of the refraction effect.
   */
  public final inline var refractionScale: Float
    @JvmName("refractionScaleProperty")
    get() = getRefraction()
    @JvmName("refractionScaleProperty")
    set(`value`) {
      setRefraction(value)
    }

  /**
   * Texture that controls the strength of the refraction per-pixel. Multiplied by [refractionScale].
   */
  public final inline var refractionTexture: Texture2D?
    @JvmName("refractionTextureProperty")
    get() = getTexture(BaseMaterial3D.TextureParam.REFRACTION)
    @JvmName("refractionTextureProperty")
    set(`value`) {
      setTexture(BaseMaterial3D.TextureParam.REFRACTION, value)
    }

  /**
   * Specifies the channel of the [refractionTexture] in which the refraction information is stored. This is useful when you store the information for multiple effects in a single texture. For example if you stored refraction in the red channel, roughness in the blue, and ambient occlusion in the green you could reduce the number of textures you use.
   */
  public final inline var refractionTextureChannel: TextureChannel
    @JvmName("refractionTextureChannelProperty")
    get() = getRefractionTextureChannel()
    @JvmName("refractionTextureChannelProperty")
    set(`value`) {
      setRefractionTextureChannel(value)
    }

  /**
   * If `true`, enables the detail overlay. Detail is a second texture that gets mixed over the surface of the object based on [detailMask] and [detailAlbedo]'s alpha channel. This can be used to add variation to objects, or to blend between two different albedo/normal textures.
   */
  public final inline var detailEnabled: Boolean
    @JvmName("detailEnabledProperty")
    get() = getFeature(BaseMaterial3D.Feature.DETAIL)
    @JvmName("detailEnabledProperty")
    set(`value`) {
      setFeature(BaseMaterial3D.Feature.DETAIL, value)
    }

  /**
   * Texture used to specify how the detail textures get blended with the base textures. [detailMask] can be used together with [detailAlbedo]'s alpha channel (if any).
   */
  public final inline var detailMask: Texture2D?
    @JvmName("detailMaskProperty")
    get() = getTexture(BaseMaterial3D.TextureParam.DETAIL_MASK)
    @JvmName("detailMaskProperty")
    set(`value`) {
      setTexture(BaseMaterial3D.TextureParam.DETAIL_MASK, value)
    }

  /**
   * Specifies how the [detailAlbedo] should blend with the current `ALBEDO`. See [BlendMode] for options.
   */
  public final inline var detailBlendMode: BlendMode
    @JvmName("detailBlendModeProperty")
    get() = getDetailBlendMode()
    @JvmName("detailBlendModeProperty")
    set(`value`) {
      setDetailBlendMode(value)
    }

  /**
   * Specifies whether to use `UV` or `UV2` for the detail layer. See [DetailUV] for options.
   */
  public final inline var detailUvLayer: DetailUV
    @JvmName("detailUvLayerProperty")
    get() = getDetailUv()
    @JvmName("detailUvLayerProperty")
    set(`value`) {
      setDetailUv(value)
    }

  /**
   * Texture that specifies the color of the detail overlay. [detailAlbedo]'s alpha channel is used as a mask, even when the material is opaque. To use a dedicated texture as a mask, see [detailMask].
   *
   * **Note:** [detailAlbedo] is *not* modulated by [albedoColor].
   */
  public final inline var detailAlbedo: Texture2D?
    @JvmName("detailAlbedoProperty")
    get() = getTexture(BaseMaterial3D.TextureParam.DETAIL_ALBEDO)
    @JvmName("detailAlbedoProperty")
    set(`value`) {
      setTexture(BaseMaterial3D.TextureParam.DETAIL_ALBEDO, value)
    }

  /**
   * Texture that specifies the per-pixel normal of the detail overlay. The [detailNormal] texture only uses the red and green channels; the blue and alpha channels are ignored. The normal read from [detailNormal] is oriented around the surface normal provided by the [Mesh].
   *
   * **Note:** Godot expects the normal map to use X+, Y+, and Z+ coordinates. See [url=http://wiki.polycount.com/wiki/Normal_Map_Technical_Details#Common_Swizzle_Coordinates]this page[/url] for a comparison of normal map coordinates expected by popular engines.
   */
  public final inline var detailNormal: Texture2D?
    @JvmName("detailNormalProperty")
    get() = getTexture(BaseMaterial3D.TextureParam.DETAIL_NORMAL)
    @JvmName("detailNormalProperty")
    set(`value`) {
      setTexture(BaseMaterial3D.TextureParam.DETAIL_NORMAL, value)
    }

  /**
   * How much to scale the `UV` coordinates. This is multiplied by `UV` in the vertex function. The Z component is used when [uv1Triplanar] is enabled, but it is not used anywhere else.
   *
   * **Warning:**
   * Be careful when trying to modify a local [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again afterward.
   */
  @CoreTypeLocalCopy
  public final inline var uv1Scale: Vector3
    @JvmName("uv1ScaleProperty")
    get() = getUv1Scale()
    @JvmName("uv1ScaleProperty")
    set(`value`) {
      setUv1Scale(value)
    }

  /**
   * How much to offset the `UV` coordinates. This amount will be added to `UV` in the vertex function. This can be used to offset a texture. The Z component is used when [uv1Triplanar] is enabled, but it is not used anywhere else.
   *
   * **Warning:**
   * Be careful when trying to modify a local [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again afterward.
   */
  @CoreTypeLocalCopy
  public final inline var uv1Offset: Vector3
    @JvmName("uv1OffsetProperty")
    get() = getUv1Offset()
    @JvmName("uv1OffsetProperty")
    set(`value`) {
      setUv1Offset(value)
    }

  /**
   * If `true`, instead of using `UV` textures will use a triplanar texture lookup to determine how to apply textures. Triplanar uses the orientation of the object's surface to blend between texture coordinates. It reads from the source texture 3 times, once for each axis and then blends between the results based on how closely the pixel aligns with each axis. This is often used for natural features to get a realistic blend of materials. Because triplanar texturing requires many more texture reads per-pixel it is much slower than normal UV texturing. Additionally, because it is blending the texture between the three axes, it is unsuitable when you are trying to achieve crisp texturing.
   */
  public final inline var uv1Triplanar: Boolean
    @JvmName("uv1TriplanarProperty")
    get() = getFlag(BaseMaterial3D.Flags.UV1_USE_TRIPLANAR)
    @JvmName("uv1TriplanarProperty")
    set(`value`) {
      setFlag(BaseMaterial3D.Flags.UV1_USE_TRIPLANAR, value)
    }

  /**
   * A lower number blends the texture more softly while a higher number blends the texture more sharply.
   *
   * **Note:** [uv1TriplanarSharpness] is clamped between `0.0` and `150.0` (inclusive) as values outside that range can look broken depending on the mesh.
   */
  public final inline var uv1TriplanarSharpness: Float
    @JvmName("uv1TriplanarSharpnessProperty")
    get() = getUv1TriplanarBlendSharpness()
    @JvmName("uv1TriplanarSharpnessProperty")
    set(`value`) {
      setUv1TriplanarBlendSharpness(value)
    }

  /**
   * If `true`, triplanar mapping for `UV` is calculated in world space rather than object local space. See also [uv1Triplanar].
   */
  public final inline var uv1WorldTriplanar: Boolean
    @JvmName("uv1WorldTriplanarProperty")
    get() = getFlag(BaseMaterial3D.Flags.UV1_USE_WORLD_TRIPLANAR)
    @JvmName("uv1WorldTriplanarProperty")
    set(`value`) {
      setFlag(BaseMaterial3D.Flags.UV1_USE_WORLD_TRIPLANAR, value)
    }

  /**
   * How much to scale the `UV2` coordinates. This is multiplied by `UV2` in the vertex function. The Z component is used when [uv2Triplanar] is enabled, but it is not used anywhere else.
   *
   * **Warning:**
   * Be careful when trying to modify a local [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again afterward.
   */
  @CoreTypeLocalCopy
  public final inline var uv2Scale: Vector3
    @JvmName("uv2ScaleProperty")
    get() = getUv2Scale()
    @JvmName("uv2ScaleProperty")
    set(`value`) {
      setUv2Scale(value)
    }

  /**
   * How much to offset the `UV2` coordinates. This amount will be added to `UV2` in the vertex function. This can be used to offset a texture. The Z component is used when [uv2Triplanar] is enabled, but it is not used anywhere else.
   *
   * **Warning:**
   * Be careful when trying to modify a local [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again afterward.
   */
  @CoreTypeLocalCopy
  public final inline var uv2Offset: Vector3
    @JvmName("uv2OffsetProperty")
    get() = getUv2Offset()
    @JvmName("uv2OffsetProperty")
    set(`value`) {
      setUv2Offset(value)
    }

  /**
   * If `true`, instead of using `UV2` textures will use a triplanar texture lookup to determine how to apply textures. Triplanar uses the orientation of the object's surface to blend between texture coordinates. It reads from the source texture 3 times, once for each axis and then blends between the results based on how closely the pixel aligns with each axis. This is often used for natural features to get a realistic blend of materials. Because triplanar texturing requires many more texture reads per-pixel it is much slower than normal UV texturing. Additionally, because it is blending the texture between the three axes, it is unsuitable when you are trying to achieve crisp texturing.
   */
  public final inline var uv2Triplanar: Boolean
    @JvmName("uv2TriplanarProperty")
    get() = getFlag(BaseMaterial3D.Flags.UV2_USE_TRIPLANAR)
    @JvmName("uv2TriplanarProperty")
    set(`value`) {
      setFlag(BaseMaterial3D.Flags.UV2_USE_TRIPLANAR, value)
    }

  /**
   * A lower number blends the texture more softly while a higher number blends the texture more sharply.
   *
   * **Note:** [uv2TriplanarSharpness] is clamped between `0.0` and `150.0` (inclusive) as values outside that range can look broken depending on the mesh.
   */
  public final inline var uv2TriplanarSharpness: Float
    @JvmName("uv2TriplanarSharpnessProperty")
    get() = getUv2TriplanarBlendSharpness()
    @JvmName("uv2TriplanarSharpnessProperty")
    set(`value`) {
      setUv2TriplanarBlendSharpness(value)
    }

  /**
   * If `true`, triplanar mapping for `UV2` is calculated in world space rather than object local space. See also [uv2Triplanar].
   */
  public final inline var uv2WorldTriplanar: Boolean
    @JvmName("uv2WorldTriplanarProperty")
    get() = getFlag(BaseMaterial3D.Flags.UV2_USE_WORLD_TRIPLANAR)
    @JvmName("uv2WorldTriplanarProperty")
    set(`value`) {
      setFlag(BaseMaterial3D.Flags.UV2_USE_WORLD_TRIPLANAR, value)
    }

  /**
   * Filter flags for the texture. See [TextureFilter] for options.
   *
   * **Note:** [heightmapTexture] is always sampled with linear filtering, even if nearest-neighbor filtering is selected here. This is to ensure the heightmap effect looks as intended. If you need sharper height transitions between pixels, resize the heightmap texture in an image editor with nearest-neighbor filtering.
   */
  public final inline var textureFilter: TextureFilter
    @JvmName("textureFilterProperty")
    get() = getTextureFilter()
    @JvmName("textureFilterProperty")
    set(`value`) {
      setTextureFilter(value)
    }

  /**
   * Repeat flags for the texture. See [TextureFilter] for options.
   */
  public final inline var textureRepeat: Boolean
    @JvmName("textureRepeatProperty")
    get() = getFlag(BaseMaterial3D.Flags.USE_TEXTURE_REPEAT)
    @JvmName("textureRepeatProperty")
    set(`value`) {
      setFlag(BaseMaterial3D.Flags.USE_TEXTURE_REPEAT, value)
    }

  /**
   * If `true`, the object receives no shadow that would otherwise be cast onto it.
   */
  public final inline var disableReceiveShadows: Boolean
    @JvmName("disableReceiveShadowsProperty")
    get() = getFlag(BaseMaterial3D.Flags.DONT_RECEIVE_SHADOWS)
    @JvmName("disableReceiveShadowsProperty")
    set(`value`) {
      setFlag(BaseMaterial3D.Flags.DONT_RECEIVE_SHADOWS, value)
    }

  /**
   * If `true`, enables the "shadow to opacity" render mode where lighting modifies the alpha so shadowed areas are opaque and non-shadowed areas are transparent. Useful for overlaying shadows onto a camera feed in AR.
   */
  public final inline var shadowToOpacity: Boolean
    @JvmName("shadowToOpacityProperty")
    get() = getFlag(BaseMaterial3D.Flags.USE_SHADOW_TO_OPACITY)
    @JvmName("shadowToOpacityProperty")
    set(`value`) {
      setFlag(BaseMaterial3D.Flags.USE_SHADOW_TO_OPACITY, value)
    }

  /**
   * Controls how the object faces the camera. See [BillboardMode].
   *
   * **Note:** Billboard mode is not suitable for VR because the left-right vector of the camera is not horizontal when the screen is attached to your head instead of on the table. See [url=https://github.com/godotengine/godot/issues/41567]GitHub issue #41567[/url] for details.
   */
  public final inline var billboardMode: BillboardMode
    @JvmName("billboardModeProperty")
    get() = getBillboardMode()
    @JvmName("billboardModeProperty")
    set(`value`) {
      setBillboardMode(value)
    }

  /**
   * If `true`, the shader will keep the scale set for the mesh. Otherwise, the scale is lost when billboarding. Only applies when [billboardMode] is not [BILLBOARD_DISABLED].
   */
  public final inline var billboardKeepScale: Boolean
    @JvmName("billboardKeepScaleProperty")
    get() = getFlag(BaseMaterial3D.Flags.BILLBOARD_KEEP_SCALE)
    @JvmName("billboardKeepScaleProperty")
    set(`value`) {
      setFlag(BaseMaterial3D.Flags.BILLBOARD_KEEP_SCALE, value)
    }

  /**
   * The number of horizontal frames in the particle sprite sheet. Only enabled when using [BILLBOARD_PARTICLES]. See [billboardMode].
   */
  public final inline var particlesAnimHFrames: Int
    @JvmName("particlesAnimHFramesProperty")
    get() = getParticlesAnimHFrames()
    @JvmName("particlesAnimHFramesProperty")
    set(`value`) {
      setParticlesAnimHFrames(value)
    }

  /**
   * The number of vertical frames in the particle sprite sheet. Only enabled when using [BILLBOARD_PARTICLES]. See [billboardMode].
   */
  public final inline var particlesAnimVFrames: Int
    @JvmName("particlesAnimVFramesProperty")
    get() = getParticlesAnimVFrames()
    @JvmName("particlesAnimVFramesProperty")
    set(`value`) {
      setParticlesAnimVFrames(value)
    }

  /**
   * If `true`, particle animations are looped. Only enabled when using [BILLBOARD_PARTICLES]. See [billboardMode].
   */
  public final inline var particlesAnimLoop: Boolean
    @JvmName("particlesAnimLoopProperty")
    get() = getParticlesAnimLoop()
    @JvmName("particlesAnimLoopProperty")
    set(`value`) {
      setParticlesAnimLoop(value)
    }

  /**
   * If `true`, enables the vertex grow setting. This can be used to create mesh-based outlines using a second material pass and its [cullMode] set to [CULL_FRONT]. See also [growAmount].
   *
   * **Note:** Vertex growth cannot create new vertices, which means that visible gaps may occur in sharp corners. This can be alleviated by designing the mesh to use smooth normals exclusively using [url=http://wiki.polycount.com/wiki/Face_weighted_normals]face weighted normals[/url] in the 3D authoring software. In this case, grow will be able to join every outline together, just like in the original mesh.
   */
  public final inline var grow: Boolean
    @JvmName("growProperty")
    get() = isGrowEnabled()
    @JvmName("growProperty")
    set(`value`) {
      setGrowEnabled(value)
    }

  /**
   * Grows object vertices in the direction of their normals. Only effective if [grow] is `true`.
   */
  public final inline var growAmount: Float
    @JvmName("growAmountProperty")
    get() = getGrow()
    @JvmName("growAmountProperty")
    set(`value`) {
      setGrow(value)
    }

  /**
   * If `true`, the object is rendered at the same size regardless of distance.
   */
  public final inline var fixedSize: Boolean
    @JvmName("fixedSizeProperty")
    get() = getFlag(BaseMaterial3D.Flags.FIXED_SIZE)
    @JvmName("fixedSizeProperty")
    set(`value`) {
      setFlag(BaseMaterial3D.Flags.FIXED_SIZE, value)
    }

  /**
   * If `true`, render point size can be changed.
   *
   * **Note:** This is only effective for objects whose geometry is point-based rather than triangle-based. See also [pointSize].
   */
  public final inline var usePointSize: Boolean
    @JvmName("usePointSizeProperty")
    get() = getFlag(BaseMaterial3D.Flags.USE_POINT_SIZE)
    @JvmName("usePointSizeProperty")
    set(`value`) {
      setFlag(BaseMaterial3D.Flags.USE_POINT_SIZE, value)
    }

  /**
   * The point size in pixels. See [usePointSize].
   */
  public final inline var pointSize: Float
    @JvmName("pointSizeProperty")
    get() = getPointSize()
    @JvmName("pointSizeProperty")
    set(`value`) {
      setPointSize(value)
    }

  /**
   * If `true`, enables parts of the shader required for [GPUParticles3D] trails to function. This also requires using a mesh with appropriate skinning, such as [RibbonTrailMesh] or [TubeTrailMesh]. Enabling this feature outside of materials used in [GPUParticles3D] meshes will break material rendering.
   */
  public final inline var useParticleTrails: Boolean
    @JvmName("useParticleTrailsProperty")
    get() = getFlag(BaseMaterial3D.Flags.PARTICLE_TRAILS_MODE)
    @JvmName("useParticleTrailsProperty")
    set(`value`) {
      setFlag(BaseMaterial3D.Flags.PARTICLE_TRAILS_MODE, value)
    }

  /**
   * If `true`, the proximity fade effect is enabled. The proximity fade effect fades out each pixel based on its distance to another object.
   */
  public final inline var proximityFadeEnabled: Boolean
    @JvmName("proximityFadeEnabledProperty")
    get() = isProximityFadeEnabled()
    @JvmName("proximityFadeEnabledProperty")
    set(`value`) {
      setProximityFadeEnabled(value)
    }

  /**
   * Distance over which the fade effect takes place. The larger the distance the longer it takes for an object to fade.
   */
  public final inline var proximityFadeDistance: Float
    @JvmName("proximityFadeDistanceProperty")
    get() = getProximityFadeDistance()
    @JvmName("proximityFadeDistanceProperty")
    set(`value`) {
      setProximityFadeDistance(value)
    }

  /**
   * The width of the range around the shape between the minimum and maximum representable signed distance.
   */
  public final inline var msdfPixelRange: Float
    @JvmName("msdfPixelRangeProperty")
    get() = getMsdfPixelRange()
    @JvmName("msdfPixelRangeProperty")
    set(`value`) {
      setMsdfPixelRange(value)
    }

  /**
   * The width of the shape outline.
   */
  public final inline var msdfOutlineSize: Float
    @JvmName("msdfOutlineSizeProperty")
    get() = getMsdfOutlineSize()
    @JvmName("msdfOutlineSizeProperty")
    set(`value`) {
      setMsdfOutlineSize(value)
    }

  /**
   * Specifies which type of fade to use. Can be any of the [DistanceFadeMode]s.
   */
  public final inline var distanceFadeMode: DistanceFadeMode
    @JvmName("distanceFadeModeProperty")
    get() = getDistanceFade()
    @JvmName("distanceFadeModeProperty")
    set(`value`) {
      setDistanceFade(value)
    }

  /**
   * Distance at which the object starts to become visible. If the object is less than this distance away, it will be invisible.
   *
   * **Note:** If [distanceFadeMinDistance] is greater than [distanceFadeMaxDistance], the behavior will be reversed. The object will start to fade away at [distanceFadeMaxDistance] and will fully disappear once it reaches [distanceFadeMinDistance].
   */
  public final inline var distanceFadeMinDistance: Float
    @JvmName("distanceFadeMinDistanceProperty")
    get() = getDistanceFadeMinDistance()
    @JvmName("distanceFadeMinDistanceProperty")
    set(`value`) {
      setDistanceFadeMinDistance(value)
    }

  /**
   * Distance at which the object appears fully opaque.
   *
   * **Note:** If [distanceFadeMaxDistance] is less than [distanceFadeMinDistance], the behavior will be reversed. The object will start to fade away at [distanceFadeMaxDistance] and will fully disappear once it reaches [distanceFadeMinDistance].
   */
  public final inline var distanceFadeMaxDistance: Float
    @JvmName("distanceFadeMaxDistanceProperty")
    get() = getDistanceFadeMaxDistance()
    @JvmName("distanceFadeMaxDistanceProperty")
    set(`value`) {
      setDistanceFadeMaxDistance(value)
    }

  override fun new(scriptIndex: Int) {
    createNativeObject(104, scriptIndex)
  }

  /**
   * This is a helper function for [albedoColor] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = basematerial3d.albedoColor
   * //Your changes
   * basematerial3d.albedoColor = myCoreType
   * ``````
   *
   * The material's base color.
   *
   * **Note:** If [detailEnabled] is `true` and a [detailAlbedo] texture is specified, [albedoColor] will *not* modulate the detail texture. This can be used to color partial areas of a material by not specifying an albedo texture and using a transparent [detailAlbedo] texture instead.
   */
  @CoreTypeHelper
  public final fun albedoColorMutate(block: Color.() -> Unit): Color = albedoColor.apply {
     block(this)
     albedoColor = this
  }

  /**
   * This is a helper function for [emission] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = basematerial3d.emission
   * //Your changes
   * basematerial3d.emission = myCoreType
   * ``````
   *
   * The emitted light's color. See [emissionEnabled].
   */
  @CoreTypeHelper
  public final fun emissionMutate(block: Color.() -> Unit): Color = emission.apply {
     block(this)
     emission = this
  }

  /**
   * This is a helper function for [subsurfScatterTransmittanceColor] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = basematerial3d.subsurfScatterTransmittanceColor
   * //Your changes
   * basematerial3d.subsurfScatterTransmittanceColor = myCoreType
   * ``````
   *
   * The color to multiply the subsurface scattering transmittance effect with. Ignored if [subsurfScatterSkinMode] is `true`.
   */
  @CoreTypeHelper
  public final fun subsurfScatterTransmittanceColorMutate(block: Color.() -> Unit): Color = subsurfScatterTransmittanceColor.apply {
     block(this)
     subsurfScatterTransmittanceColor = this
  }

  /**
   * This is a helper function for [backlight] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = basematerial3d.backlight
   * //Your changes
   * basematerial3d.backlight = myCoreType
   * ``````
   *
   * The color used by the backlight effect. Represents the light passing through an object.
   */
  @CoreTypeHelper
  public final fun backlightMutate(block: Color.() -> Unit): Color = backlight.apply {
     block(this)
     backlight = this
  }

  /**
   * This is a helper function for [uv1Scale] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = basematerial3d.uv1Scale
   * //Your changes
   * basematerial3d.uv1Scale = myCoreType
   * ``````
   *
   * How much to scale the `UV` coordinates. This is multiplied by `UV` in the vertex function. The Z component is used when [uv1Triplanar] is enabled, but it is not used anywhere else.
   */
  @CoreTypeHelper
  public final fun uv1ScaleMutate(block: Vector3.() -> Unit): Vector3 = uv1Scale.apply {
     block(this)
     uv1Scale = this
  }

  /**
   * This is a helper function for [uv1Offset] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = basematerial3d.uv1Offset
   * //Your changes
   * basematerial3d.uv1Offset = myCoreType
   * ``````
   *
   * How much to offset the `UV` coordinates. This amount will be added to `UV` in the vertex function. This can be used to offset a texture. The Z component is used when [uv1Triplanar] is enabled, but it is not used anywhere else.
   */
  @CoreTypeHelper
  public final fun uv1OffsetMutate(block: Vector3.() -> Unit): Vector3 = uv1Offset.apply {
     block(this)
     uv1Offset = this
  }

  /**
   * This is a helper function for [uv2Scale] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = basematerial3d.uv2Scale
   * //Your changes
   * basematerial3d.uv2Scale = myCoreType
   * ``````
   *
   * How much to scale the `UV2` coordinates. This is multiplied by `UV2` in the vertex function. The Z component is used when [uv2Triplanar] is enabled, but it is not used anywhere else.
   */
  @CoreTypeHelper
  public final fun uv2ScaleMutate(block: Vector3.() -> Unit): Vector3 = uv2Scale.apply {
     block(this)
     uv2Scale = this
  }

  /**
   * This is a helper function for [uv2Offset] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = basematerial3d.uv2Offset
   * //Your changes
   * basematerial3d.uv2Offset = myCoreType
   * ``````
   *
   * How much to offset the `UV2` coordinates. This amount will be added to `UV2` in the vertex function. This can be used to offset a texture. The Z component is used when [uv2Triplanar] is enabled, but it is not used anywhere else.
   */
  @CoreTypeHelper
  public final fun uv2OffsetMutate(block: Vector3.() -> Unit): Vector3 = uv2Offset.apply {
     block(this)
     uv2Offset = this
  }

  public final fun setAlbedo(albedo: Color) {
    TransferContext.writeArguments(COLOR to albedo)
    TransferContext.callMethod(ptr, MethodBindings.setAlbedoPtr, NIL)
  }

  public final fun getAlbedo(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAlbedoPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setTransparency(transparency: Transparency) {
    TransferContext.writeArguments(LONG to transparency.id)
    TransferContext.callMethod(ptr, MethodBindings.setTransparencyPtr, NIL)
  }

  public final fun getTransparency(): Transparency {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTransparencyPtr, LONG)
    return Transparency.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setAlphaAntialiasing(alphaAa: AlphaAntiAliasing) {
    TransferContext.writeArguments(LONG to alphaAa.id)
    TransferContext.callMethod(ptr, MethodBindings.setAlphaAntialiasingPtr, NIL)
  }

  public final fun getAlphaAntialiasing(): AlphaAntiAliasing {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAlphaAntialiasingPtr, LONG)
    return AlphaAntiAliasing.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setAlphaAntialiasingEdge(edge: Float) {
    TransferContext.writeArguments(DOUBLE to edge.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setAlphaAntialiasingEdgePtr, NIL)
  }

  public final fun getAlphaAntialiasingEdge(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAlphaAntialiasingEdgePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setShadingMode(shadingMode: ShadingMode) {
    TransferContext.writeArguments(LONG to shadingMode.id)
    TransferContext.callMethod(ptr, MethodBindings.setShadingModePtr, NIL)
  }

  public final fun getShadingMode(): ShadingMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getShadingModePtr, LONG)
    return ShadingMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setSpecular(specular: Float) {
    TransferContext.writeArguments(DOUBLE to specular.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSpecularPtr, NIL)
  }

  public final fun getSpecular(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSpecularPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setMetallic(metallic: Float) {
    TransferContext.writeArguments(DOUBLE to metallic.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setMetallicPtr, NIL)
  }

  public final fun getMetallic(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMetallicPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setRoughness(roughness: Float) {
    TransferContext.writeArguments(DOUBLE to roughness.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setRoughnessPtr, NIL)
  }

  public final fun getRoughness(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRoughnessPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setEmission(emission: Color) {
    TransferContext.writeArguments(COLOR to emission)
    TransferContext.callMethod(ptr, MethodBindings.setEmissionPtr, NIL)
  }

  public final fun getEmission(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEmissionPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setEmissionEnergyMultiplier(emissionEnergyMultiplier: Float) {
    TransferContext.writeArguments(DOUBLE to emissionEnergyMultiplier.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setEmissionEnergyMultiplierPtr, NIL)
  }

  public final fun getEmissionEnergyMultiplier(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEmissionEnergyMultiplierPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setEmissionIntensity(emissionEnergyMultiplier: Float) {
    TransferContext.writeArguments(DOUBLE to emissionEnergyMultiplier.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setEmissionIntensityPtr, NIL)
  }

  public final fun getEmissionIntensity(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEmissionIntensityPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setNormalScale(normalScale: Float) {
    TransferContext.writeArguments(DOUBLE to normalScale.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setNormalScalePtr, NIL)
  }

  public final fun getNormalScale(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getNormalScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setRim(rim: Float) {
    TransferContext.writeArguments(DOUBLE to rim.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setRimPtr, NIL)
  }

  public final fun getRim(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRimPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setRimTint(rimTint: Float) {
    TransferContext.writeArguments(DOUBLE to rimTint.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setRimTintPtr, NIL)
  }

  public final fun getRimTint(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRimTintPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setClearcoat(clearcoat: Float) {
    TransferContext.writeArguments(DOUBLE to clearcoat.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setClearcoatPtr, NIL)
  }

  public final fun getClearcoat(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getClearcoatPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setClearcoatRoughness(clearcoatRoughness: Float) {
    TransferContext.writeArguments(DOUBLE to clearcoatRoughness.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setClearcoatRoughnessPtr, NIL)
  }

  public final fun getClearcoatRoughness(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getClearcoatRoughnessPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAnisotropy(anisotropy: Float) {
    TransferContext.writeArguments(DOUBLE to anisotropy.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setAnisotropyPtr, NIL)
  }

  public final fun getAnisotropy(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAnisotropyPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setHeightmapScale(heightmapScale: Float) {
    TransferContext.writeArguments(DOUBLE to heightmapScale.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setHeightmapScalePtr, NIL)
  }

  public final fun getHeightmapScale(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getHeightmapScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSubsurfaceScatteringStrength(strength: Float) {
    TransferContext.writeArguments(DOUBLE to strength.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSubsurfaceScatteringStrengthPtr, NIL)
  }

  public final fun getSubsurfaceScatteringStrength(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSubsurfaceScatteringStrengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setTransmittanceColor(color: Color) {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.setTransmittanceColorPtr, NIL)
  }

  public final fun getTransmittanceColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTransmittanceColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setTransmittanceDepth(depth: Float) {
    TransferContext.writeArguments(DOUBLE to depth.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setTransmittanceDepthPtr, NIL)
  }

  public final fun getTransmittanceDepth(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTransmittanceDepthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setTransmittanceBoost(boost: Float) {
    TransferContext.writeArguments(DOUBLE to boost.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setTransmittanceBoostPtr, NIL)
  }

  public final fun getTransmittanceBoost(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTransmittanceBoostPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setBacklight(backlight: Color) {
    TransferContext.writeArguments(COLOR to backlight)
    TransferContext.callMethod(ptr, MethodBindings.setBacklightPtr, NIL)
  }

  public final fun getBacklight(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBacklightPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setRefraction(refraction: Float) {
    TransferContext.writeArguments(DOUBLE to refraction.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setRefractionPtr, NIL)
  }

  public final fun getRefraction(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRefractionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setPointSize(pointSize: Float) {
    TransferContext.writeArguments(DOUBLE to pointSize.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setPointSizePtr, NIL)
  }

  public final fun getPointSize(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPointSizePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDetailUv(detailUv: DetailUV) {
    TransferContext.writeArguments(LONG to detailUv.id)
    TransferContext.callMethod(ptr, MethodBindings.setDetailUvPtr, NIL)
  }

  public final fun getDetailUv(): DetailUV {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDetailUvPtr, LONG)
    return DetailUV.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setBlendMode(blendMode: BlendMode) {
    TransferContext.writeArguments(LONG to blendMode.id)
    TransferContext.callMethod(ptr, MethodBindings.setBlendModePtr, NIL)
  }

  public final fun getBlendMode(): BlendMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBlendModePtr, LONG)
    return BlendMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setDepthDrawMode(depthDrawMode: DepthDrawMode) {
    TransferContext.writeArguments(LONG to depthDrawMode.id)
    TransferContext.callMethod(ptr, MethodBindings.setDepthDrawModePtr, NIL)
  }

  public final fun getDepthDrawMode(): DepthDrawMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDepthDrawModePtr, LONG)
    return DepthDrawMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setCullMode(cullMode: CullMode) {
    TransferContext.writeArguments(LONG to cullMode.id)
    TransferContext.callMethod(ptr, MethodBindings.setCullModePtr, NIL)
  }

  public final fun getCullMode(): CullMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCullModePtr, LONG)
    return CullMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setDiffuseMode(diffuseMode: DiffuseMode) {
    TransferContext.writeArguments(LONG to diffuseMode.id)
    TransferContext.callMethod(ptr, MethodBindings.setDiffuseModePtr, NIL)
  }

  public final fun getDiffuseMode(): DiffuseMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDiffuseModePtr, LONG)
    return DiffuseMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setSpecularMode(specularMode: SpecularMode) {
    TransferContext.writeArguments(LONG to specularMode.id)
    TransferContext.callMethod(ptr, MethodBindings.setSpecularModePtr, NIL)
  }

  public final fun getSpecularMode(): SpecularMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSpecularModePtr, LONG)
    return SpecularMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * If `true`, enables the specified flag. Flags are optional behavior that can be turned on and off. Only one flag can be enabled at a time with this function, the flag enumerators cannot be bit-masked together to enable or disable multiple flags at once. Flags can also be enabled by setting the corresponding member to `true`. See [Flags] enumerator for options.
   */
  public final fun setFlag(flag: Flags, enable: Boolean) {
    TransferContext.writeArguments(LONG to flag.id, BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setFlagPtr, NIL)
  }

  /**
   * Returns `true`, if the specified flag is enabled. See [Flags] enumerator for options.
   */
  public final fun getFlag(flag: Flags): Boolean {
    TransferContext.writeArguments(LONG to flag.id)
    TransferContext.callMethod(ptr, MethodBindings.getFlagPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setTextureFilter(mode: TextureFilter) {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setTextureFilterPtr, NIL)
  }

  public final fun getTextureFilter(): TextureFilter {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTextureFilterPtr, LONG)
    return TextureFilter.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * If `true`, enables the specified [Feature]. Many features that are available in [BaseMaterial3D]s need to be enabled before use. This way the cost for using the feature is only incurred when specified. Features can also be enabled by setting the corresponding member to `true`.
   */
  public final fun setFeature(feature: Feature, enable: Boolean) {
    TransferContext.writeArguments(LONG to feature.id, BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setFeaturePtr, NIL)
  }

  /**
   * Returns `true`, if the specified [Feature] is enabled.
   */
  public final fun getFeature(feature: Feature): Boolean {
    TransferContext.writeArguments(LONG to feature.id)
    TransferContext.callMethod(ptr, MethodBindings.getFeaturePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the texture for the slot specified by [param]. See [TextureParam] for available slots.
   */
  public final fun setTexture(`param`: TextureParam, texture: Texture2D?) {
    TransferContext.writeArguments(LONG to param.id, OBJECT to texture)
    TransferContext.callMethod(ptr, MethodBindings.setTexturePtr, NIL)
  }

  /**
   * Returns the [Texture2D] associated with the specified [TextureParam].
   */
  public final fun getTexture(`param`: TextureParam): Texture2D? {
    TransferContext.writeArguments(LONG to param.id)
    TransferContext.callMethod(ptr, MethodBindings.getTexturePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  public final fun setDetailBlendMode(detailBlendMode: BlendMode) {
    TransferContext.writeArguments(LONG to detailBlendMode.id)
    TransferContext.callMethod(ptr, MethodBindings.setDetailBlendModePtr, NIL)
  }

  public final fun getDetailBlendMode(): BlendMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDetailBlendModePtr, LONG)
    return BlendMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setUv1Scale(scale: Vector3) {
    TransferContext.writeArguments(VECTOR3 to scale)
    TransferContext.callMethod(ptr, MethodBindings.setUv1ScalePtr, NIL)
  }

  public final fun getUv1Scale(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getUv1ScalePtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setUv1Offset(offset: Vector3) {
    TransferContext.writeArguments(VECTOR3 to offset)
    TransferContext.callMethod(ptr, MethodBindings.setUv1OffsetPtr, NIL)
  }

  public final fun getUv1Offset(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getUv1OffsetPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setUv1TriplanarBlendSharpness(sharpness: Float) {
    TransferContext.writeArguments(DOUBLE to sharpness.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setUv1TriplanarBlendSharpnessPtr, NIL)
  }

  public final fun getUv1TriplanarBlendSharpness(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getUv1TriplanarBlendSharpnessPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setUv2Scale(scale: Vector3) {
    TransferContext.writeArguments(VECTOR3 to scale)
    TransferContext.callMethod(ptr, MethodBindings.setUv2ScalePtr, NIL)
  }

  public final fun getUv2Scale(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getUv2ScalePtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setUv2Offset(offset: Vector3) {
    TransferContext.writeArguments(VECTOR3 to offset)
    TransferContext.callMethod(ptr, MethodBindings.setUv2OffsetPtr, NIL)
  }

  public final fun getUv2Offset(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getUv2OffsetPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setUv2TriplanarBlendSharpness(sharpness: Float) {
    TransferContext.writeArguments(DOUBLE to sharpness.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setUv2TriplanarBlendSharpnessPtr, NIL)
  }

  public final fun getUv2TriplanarBlendSharpness(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getUv2TriplanarBlendSharpnessPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setBillboardMode(mode: BillboardMode) {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setBillboardModePtr, NIL)
  }

  public final fun getBillboardMode(): BillboardMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBillboardModePtr, LONG)
    return BillboardMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setParticlesAnimHFrames(frames: Int) {
    TransferContext.writeArguments(LONG to frames.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setParticlesAnimHFramesPtr, NIL)
  }

  public final fun getParticlesAnimHFrames(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getParticlesAnimHFramesPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setParticlesAnimVFrames(frames: Int) {
    TransferContext.writeArguments(LONG to frames.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setParticlesAnimVFramesPtr, NIL)
  }

  public final fun getParticlesAnimVFrames(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getParticlesAnimVFramesPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setParticlesAnimLoop(loop: Boolean) {
    TransferContext.writeArguments(BOOL to loop)
    TransferContext.callMethod(ptr, MethodBindings.setParticlesAnimLoopPtr, NIL)
  }

  public final fun getParticlesAnimLoop(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getParticlesAnimLoopPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setHeightmapDeepParallax(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setHeightmapDeepParallaxPtr, NIL)
  }

  public final fun isHeightmapDeepParallaxEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isHeightmapDeepParallaxEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setHeightmapDeepParallaxMinLayers(layer: Int) {
    TransferContext.writeArguments(LONG to layer.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setHeightmapDeepParallaxMinLayersPtr, NIL)
  }

  public final fun getHeightmapDeepParallaxMinLayers(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getHeightmapDeepParallaxMinLayersPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setHeightmapDeepParallaxMaxLayers(layer: Int) {
    TransferContext.writeArguments(LONG to layer.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setHeightmapDeepParallaxMaxLayersPtr, NIL)
  }

  public final fun getHeightmapDeepParallaxMaxLayers(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getHeightmapDeepParallaxMaxLayersPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setHeightmapDeepParallaxFlipTangent(flip: Boolean) {
    TransferContext.writeArguments(BOOL to flip)
    TransferContext.callMethod(ptr, MethodBindings.setHeightmapDeepParallaxFlipTangentPtr, NIL)
  }

  public final fun getHeightmapDeepParallaxFlipTangent(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getHeightmapDeepParallaxFlipTangentPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setHeightmapDeepParallaxFlipBinormal(flip: Boolean) {
    TransferContext.writeArguments(BOOL to flip)
    TransferContext.callMethod(ptr, MethodBindings.setHeightmapDeepParallaxFlipBinormalPtr, NIL)
  }

  public final fun getHeightmapDeepParallaxFlipBinormal(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getHeightmapDeepParallaxFlipBinormalPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setGrow(amount: Float) {
    TransferContext.writeArguments(DOUBLE to amount.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setGrowPtr, NIL)
  }

  public final fun getGrow(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGrowPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setEmissionOperator(`operator`: EmissionOperator) {
    TransferContext.writeArguments(LONG to `operator`.id)
    TransferContext.callMethod(ptr, MethodBindings.setEmissionOperatorPtr, NIL)
  }

  public final fun getEmissionOperator(): EmissionOperator {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEmissionOperatorPtr, LONG)
    return EmissionOperator.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setAoLightAffect(amount: Float) {
    TransferContext.writeArguments(DOUBLE to amount.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setAoLightAffectPtr, NIL)
  }

  public final fun getAoLightAffect(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAoLightAffectPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAlphaScissorThreshold(threshold: Float) {
    TransferContext.writeArguments(DOUBLE to threshold.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setAlphaScissorThresholdPtr, NIL)
  }

  public final fun getAlphaScissorThreshold(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAlphaScissorThresholdPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAlphaHashScale(threshold: Float) {
    TransferContext.writeArguments(DOUBLE to threshold.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setAlphaHashScalePtr, NIL)
  }

  public final fun getAlphaHashScale(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAlphaHashScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setGrowEnabled(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setGrowEnabledPtr, NIL)
  }

  public final fun isGrowEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isGrowEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setMetallicTextureChannel(channel: TextureChannel) {
    TransferContext.writeArguments(LONG to channel.id)
    TransferContext.callMethod(ptr, MethodBindings.setMetallicTextureChannelPtr, NIL)
  }

  public final fun getMetallicTextureChannel(): TextureChannel {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMetallicTextureChannelPtr, LONG)
    return TextureChannel.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setRoughnessTextureChannel(channel: TextureChannel) {
    TransferContext.writeArguments(LONG to channel.id)
    TransferContext.callMethod(ptr, MethodBindings.setRoughnessTextureChannelPtr, NIL)
  }

  public final fun getRoughnessTextureChannel(): TextureChannel {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRoughnessTextureChannelPtr, LONG)
    return TextureChannel.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setAoTextureChannel(channel: TextureChannel) {
    TransferContext.writeArguments(LONG to channel.id)
    TransferContext.callMethod(ptr, MethodBindings.setAoTextureChannelPtr, NIL)
  }

  public final fun getAoTextureChannel(): TextureChannel {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAoTextureChannelPtr, LONG)
    return TextureChannel.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setRefractionTextureChannel(channel: TextureChannel) {
    TransferContext.writeArguments(LONG to channel.id)
    TransferContext.callMethod(ptr, MethodBindings.setRefractionTextureChannelPtr, NIL)
  }

  public final fun getRefractionTextureChannel(): TextureChannel {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRefractionTextureChannelPtr, LONG)
    return TextureChannel.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setProximityFadeEnabled(enabled: Boolean) {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setProximityFadeEnabledPtr, NIL)
  }

  public final fun isProximityFadeEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isProximityFadeEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setProximityFadeDistance(distance: Float) {
    TransferContext.writeArguments(DOUBLE to distance.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setProximityFadeDistancePtr, NIL)
  }

  public final fun getProximityFadeDistance(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getProximityFadeDistancePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setMsdfPixelRange(range: Float) {
    TransferContext.writeArguments(DOUBLE to range.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setMsdfPixelRangePtr, NIL)
  }

  public final fun getMsdfPixelRange(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMsdfPixelRangePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setMsdfOutlineSize(size: Float) {
    TransferContext.writeArguments(DOUBLE to size.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setMsdfOutlineSizePtr, NIL)
  }

  public final fun getMsdfOutlineSize(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMsdfOutlineSizePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDistanceFade(mode: DistanceFadeMode) {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setDistanceFadePtr, NIL)
  }

  public final fun getDistanceFade(): DistanceFadeMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDistanceFadePtr, LONG)
    return DistanceFadeMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setDistanceFadeMaxDistance(distance: Float) {
    TransferContext.writeArguments(DOUBLE to distance.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setDistanceFadeMaxDistancePtr, NIL)
  }

  public final fun getDistanceFadeMaxDistance(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDistanceFadeMaxDistancePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDistanceFadeMinDistance(distance: Float) {
    TransferContext.writeArguments(DOUBLE to distance.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setDistanceFadeMinDistancePtr, NIL)
  }

  public final fun getDistanceFadeMinDistance(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDistanceFadeMinDistancePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _getShaderRid(): RID {
    throw NotImplementedError("BaseMaterial3D::_getShaderRid can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _getShaderMode(): Shader.Mode {
    throw NotImplementedError("BaseMaterial3D::_getShaderMode can't be called from the JVM.")
  }

  public enum class TextureParam(
    id: Long,
  ) {
    /**
     * Texture specifying per-pixel color.
     */
    ALBEDO(0),
    /**
     * Texture specifying per-pixel metallic value.
     */
    METALLIC(1),
    /**
     * Texture specifying per-pixel roughness value.
     */
    ROUGHNESS(2),
    /**
     * Texture specifying per-pixel emission color.
     */
    EMISSION(3),
    /**
     * Texture specifying per-pixel normal vector.
     */
    NORMAL(4),
    /**
     * Texture specifying per-pixel rim value.
     */
    RIM(5),
    /**
     * Texture specifying per-pixel clearcoat value.
     */
    CLEARCOAT(6),
    /**
     * Texture specifying per-pixel flowmap direction for use with [anisotropy].
     */
    FLOWMAP(7),
    /**
     * Texture specifying per-pixel ambient occlusion value.
     */
    AMBIENT_OCCLUSION(8),
    /**
     * Texture specifying per-pixel height.
     */
    HEIGHTMAP(9),
    /**
     * Texture specifying per-pixel subsurface scattering.
     */
    SUBSURFACE_SCATTERING(10),
    /**
     * Texture specifying per-pixel transmittance for subsurface scattering.
     */
    SUBSURFACE_TRANSMITTANCE(11),
    /**
     * Texture specifying per-pixel backlight color.
     */
    BACKLIGHT(12),
    /**
     * Texture specifying per-pixel refraction strength.
     */
    REFRACTION(13),
    /**
     * Texture specifying per-pixel detail mask blending value.
     */
    DETAIL_MASK(14),
    /**
     * Texture specifying per-pixel detail color.
     */
    DETAIL_ALBEDO(15),
    /**
     * Texture specifying per-pixel detail normal.
     */
    DETAIL_NORMAL(16),
    /**
     * Texture holding ambient occlusion, roughness, and metallic.
     */
    ORM(17),
    /**
     * Represents the size of the [TextureParam] enum.
     */
    MAX(18),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TextureParam = entries.single { it.id == `value` }
    }
  }

  public enum class TextureFilter(
    id: Long,
  ) {
    /**
     * The texture filter reads from the nearest pixel only. This makes the texture look pixelated from up close, and grainy from a distance (due to mipmaps not being sampled).
     */
    NEAREST(0),
    /**
     * The texture filter blends between the nearest 4 pixels. This makes the texture look smooth from up close, and grainy from a distance (due to mipmaps not being sampled).
     */
    LINEAR(1),
    /**
     * The texture filter reads from the nearest pixel and blends between the nearest 2 mipmaps (or uses the nearest mipmap if [ProjectSettings.rendering/textures/defaultFilters/useNearestMipmapFilter] is `true`). This makes the texture look pixelated from up close, and smooth from a distance.
     */
    NEAREST_WITH_MIPMAPS(2),
    /**
     * The texture filter blends between the nearest 4 pixels and between the nearest 2 mipmaps (or uses the nearest mipmap if [ProjectSettings.rendering/textures/defaultFilters/useNearestMipmapFilter] is `true`). This makes the texture look smooth from up close, and smooth from a distance.
     */
    LINEAR_WITH_MIPMAPS(3),
    /**
     * The texture filter reads from the nearest pixel and blends between 2 mipmaps (or uses the nearest mipmap if [ProjectSettings.rendering/textures/defaultFilters/useNearestMipmapFilter] is `true`) based on the angle between the surface and the camera view. This makes the texture look pixelated from up close, and smooth from a distance. Anisotropic filtering improves texture quality on surfaces that are almost in line with the camera, but is slightly slower. The anisotropic filtering level can be changed by adjusting [ProjectSettings.rendering/textures/defaultFilters/anisotropicFilteringLevel].
     */
    NEAREST_WITH_MIPMAPS_ANISOTROPIC(4),
    /**
     * The texture filter blends between the nearest 4 pixels and blends between 2 mipmaps (or uses the nearest mipmap if [ProjectSettings.rendering/textures/defaultFilters/useNearestMipmapFilter] is `true`) based on the angle between the surface and the camera view. This makes the texture look smooth from up close, and smooth from a distance. Anisotropic filtering improves texture quality on surfaces that are almost in line with the camera, but is slightly slower. The anisotropic filtering level can be changed by adjusting [ProjectSettings.rendering/textures/defaultFilters/anisotropicFilteringLevel].
     */
    LINEAR_WITH_MIPMAPS_ANISOTROPIC(5),
    /**
     * Represents the size of the [TextureFilter] enum.
     */
    MAX(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TextureFilter = entries.single { it.id == `value` }
    }
  }

  public enum class DetailUV(
    id: Long,
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
      public fun from(`value`: Long): DetailUV = entries.single { it.id == `value` }
    }
  }

  public enum class Transparency(
    id: Long,
  ) {
    /**
     * The material will not use transparency. This is the fastest to render.
     */
    DISABLED(0),
    /**
     * The material will use the texture's alpha values for transparency. This is the slowest to render, and disables shadow casting.
     */
    ALPHA(1),
    /**
     * The material will cut off all values below a threshold, the rest will remain opaque. The opaque portions will be rendered in the depth prepass. This is faster to render than alpha blending, but slower than opaque rendering. This also supports casting shadows.
     */
    ALPHA_SCISSOR(2),
    /**
     * The material will cut off all values below a spatially-deterministic threshold, the rest will remain opaque. This is faster to render than alpha blending, but slower than opaque rendering. This also supports casting shadows. Alpha hashing is suited for hair rendering.
     */
    ALPHA_HASH(3),
    /**
     * The material will use the texture's alpha value for transparency, but will discard fragments with an alpha of less than 0.99 during the depth prepass and fragments with an alpha less than 0.1 during the shadow pass. This also supports casting shadows.
     */
    ALPHA_DEPTH_PRE_PASS(4),
    /**
     * Represents the size of the [Transparency] enum.
     */
    MAX(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Transparency = entries.single { it.id == `value` }
    }
  }

  public enum class ShadingMode(
    id: Long,
  ) {
    /**
     * The object will not receive shadows. This is the fastest to render, but it disables all interactions with lights.
     */
    UNSHADED(0),
    /**
     * The object will be shaded per pixel. Useful for realistic shading effects.
     */
    PER_PIXEL(1),
    /**
     * The object will be shaded per vertex. Useful when you want cheaper shaders and do not care about visual quality.
     */
    PER_VERTEX(2),
    /**
     * Represents the size of the [ShadingMode] enum.
     */
    MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ShadingMode = entries.single { it.id == `value` }
    }
  }

  public enum class Feature(
    id: Long,
  ) {
    /**
     * Constant for setting [emissionEnabled].
     */
    EMISSION(0),
    /**
     * Constant for setting [normalEnabled].
     */
    NORMAL_MAPPING(1),
    /**
     * Constant for setting [rimEnabled].
     */
    RIM(2),
    /**
     * Constant for setting [clearcoatEnabled].
     */
    CLEARCOAT(3),
    /**
     * Constant for setting [anisotropyEnabled].
     */
    ANISOTROPY(4),
    /**
     * Constant for setting [aoEnabled].
     */
    AMBIENT_OCCLUSION(5),
    /**
     * Constant for setting [heightmapEnabled].
     */
    HEIGHT_MAPPING(6),
    /**
     * Constant for setting [subsurfScatterEnabled].
     */
    SUBSURFACE_SCATTERING(7),
    /**
     * Constant for setting [subsurfScatterTransmittanceEnabled].
     */
    SUBSURFACE_TRANSMITTANCE(8),
    /**
     * Constant for setting [backlightEnabled].
     */
    BACKLIGHT(9),
    /**
     * Constant for setting [refractionEnabled].
     */
    REFRACTION(10),
    /**
     * Constant for setting [detailEnabled].
     */
    DETAIL(11),
    /**
     * Represents the size of the [Feature] enum.
     */
    MAX(12),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Feature = entries.single { it.id == `value` }
    }
  }

  public enum class BlendMode(
    id: Long,
  ) {
    /**
     * Default blend mode. The color of the object is blended over the background based on the object's alpha value.
     */
    MIX(0),
    /**
     * The color of the object is added to the background.
     */
    ADD(1),
    /**
     * The color of the object is subtracted from the background.
     */
    SUB(2),
    /**
     * The color of the object is multiplied by the background.
     */
    MUL(3),
    /**
     * The color of the object is added to the background and the alpha channel is used to mask out the background. This is effectively a hybrid of the blend mix and add modes, useful for effects like fire where you want the flame to add but the smoke to mix. By default, this works with unshaded materials using premultiplied textures. For shaded materials, use the `PREMUL_ALPHA_FACTOR` built-in so that lighting can be modulated as well.
     */
    PREMULT_ALPHA(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): BlendMode = entries.single { it.id == `value` }
    }
  }

  public enum class AlphaAntiAliasing(
    id: Long,
  ) {
    /**
     * Disables Alpha AntiAliasing for the material.
     */
    ANTIALIASING_OFF(0),
    /**
     * Enables AlphaToCoverage. Alpha values in the material are passed to the AntiAliasing sample mask.
     */
    ANTIALIASING_ALPHA_TO_COVERAGE(1),
    /**
     * Enables AlphaToCoverage and forces all non-zero alpha values to `1`. Alpha values in the material are passed to the AntiAliasing sample mask.
     */
    ANTIALIASING_ALPHA_TO_COVERAGE_AND_TO_ONE(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): AlphaAntiAliasing = entries.single { it.id == `value` }
    }
  }

  public enum class DepthDrawMode(
    id: Long,
  ) {
    /**
     * Default depth draw mode. Depth is drawn only for opaque objects during the opaque prepass (if any) and during the opaque pass.
     */
    OPAQUE_ONLY(0),
    /**
     * Objects will write to depth during the opaque and the transparent passes. Transparent objects that are close to the camera may obscure other transparent objects behind them.
     *
     * **Note:** This does not influence whether transparent objects are included in the depth prepass or not. For that, see [Transparency].
     */
    ALWAYS(1),
    /**
     * Objects will not write their depth to the depth buffer, even during the depth prepass (if enabled).
     */
    DISABLED(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DepthDrawMode = entries.single { it.id == `value` }
    }
  }

  public enum class CullMode(
    id: Long,
  ) {
    /**
     * Default cull mode. The back of the object is culled when not visible. Back face triangles will be culled when facing the camera. This results in only the front side of triangles being drawn. For closed-surface meshes, this means that only the exterior of the mesh will be visible.
     */
    BACK(0),
    /**
     * Front face triangles will be culled when facing the camera. This results in only the back side of triangles being drawn. For closed-surface meshes, this means that the interior of the mesh will be drawn instead of the exterior.
     */
    FRONT(1),
    /**
     * No face culling is performed; both the front face and back face will be visible.
     */
    DISABLED(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CullMode = entries.single { it.id == `value` }
    }
  }

  public enum class Flags(
    id: Long,
  ) {
    /**
     * Disables the depth test, so this object is drawn on top of all others drawn before it. This puts the object in the transparent draw pass where it is sorted based on distance to camera. Objects drawn after it in the draw order may cover it. This also disables writing to depth.
     */
    DISABLE_DEPTH_TEST(0),
    /**
     * Set `ALBEDO` to the per-vertex color specified in the mesh.
     */
    ALBEDO_FROM_VERTEX_COLOR(1),
    /**
     * Vertex colors are considered to be stored in sRGB color space and are converted to linear color space during rendering. See also [vertexColorIsSrgb].
     *
     * **Note:** Only effective when using the Forward+ and Mobile rendering methods.
     */
    SRGB_VERTEX_COLOR(2),
    /**
     * Uses point size to alter the size of primitive points. Also changes the albedo texture lookup to use `POINT_COORD` instead of `UV`.
     */
    USE_POINT_SIZE(3),
    /**
     * Object is scaled by depth so that it always appears the same size on screen.
     */
    FIXED_SIZE(4),
    /**
     * Shader will keep the scale set for the mesh. Otherwise the scale is lost when billboarding. Only applies when [billboardMode] is [BILLBOARD_ENABLED].
     */
    BILLBOARD_KEEP_SCALE(5),
    /**
     * Use triplanar texture lookup for all texture lookups that would normally use `UV`.
     */
    UV1_USE_TRIPLANAR(6),
    /**
     * Use triplanar texture lookup for all texture lookups that would normally use `UV2`.
     */
    UV2_USE_TRIPLANAR(7),
    /**
     * Use triplanar texture lookup for all texture lookups that would normally use `UV`.
     */
    UV1_USE_WORLD_TRIPLANAR(8),
    /**
     * Use triplanar texture lookup for all texture lookups that would normally use `UV2`.
     */
    UV2_USE_WORLD_TRIPLANAR(9),
    /**
     * Use `UV2` coordinates to look up from the [aoTexture].
     */
    AO_ON_UV2(10),
    /**
     * Use `UV2` coordinates to look up from the [emissionTexture].
     */
    EMISSION_ON_UV2(11),
    /**
     * Forces the shader to convert albedo from sRGB space to linear space. See also [albedoTextureForceSrgb].
     */
    ALBEDO_TEXTURE_FORCE_SRGB(12),
    /**
     * Disables receiving shadows from other objects.
     */
    DONT_RECEIVE_SHADOWS(13),
    /**
     * Disables receiving ambient light.
     */
    DISABLE_AMBIENT_LIGHT(14),
    /**
     * Enables the shadow to opacity feature.
     */
    USE_SHADOW_TO_OPACITY(15),
    /**
     * Enables the texture to repeat when UV coordinates are outside the 0-1 range. If using one of the linear filtering modes, this can result in artifacts at the edges of a texture when the sampler filters across the edges of the texture.
     */
    USE_TEXTURE_REPEAT(16),
    /**
     * Invert values read from a depth texture to convert them to height values (heightmap).
     */
    INVERT_HEIGHTMAP(17),
    /**
     * Enables the skin mode for subsurface scattering which is used to improve the look of subsurface scattering when used for human skin.
     */
    SUBSURFACE_MODE_SKIN(18),
    /**
     * Enables parts of the shader required for [GPUParticles3D] trails to function. This also requires using a mesh with appropriate skinning, such as [RibbonTrailMesh] or [TubeTrailMesh]. Enabling this feature outside of materials used in [GPUParticles3D] meshes will break material rendering.
     */
    PARTICLE_TRAILS_MODE(19),
    /**
     * Enables multichannel signed distance field rendering shader.
     */
    ALBEDO_TEXTURE_MSDF(20),
    /**
     * Disables receiving depth-based or volumetric fog.
     */
    DISABLE_FOG(21),
    /**
     * Represents the size of the [Flags] enum.
     */
    MAX(22),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Flags = entries.single { it.id == `value` }
    }
  }

  public enum class DiffuseMode(
    id: Long,
  ) {
    /**
     * Default diffuse scattering algorithm.
     */
    BURLEY(0),
    /**
     * Diffuse scattering ignores roughness.
     */
    LAMBERT(1),
    /**
     * Extends Lambert to cover more than 90 degrees when roughness increases.
     */
    LAMBERT_WRAP(2),
    /**
     * Uses a hard cut for lighting, with smoothing affected by roughness.
     */
    TOON(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DiffuseMode = entries.single { it.id == `value` }
    }
  }

  public enum class SpecularMode(
    id: Long,
  ) {
    /**
     * Default specular blob.
     */
    SCHLICK_GGX(0),
    /**
     * Toon blob which changes size based on roughness.
     */
    TOON(1),
    /**
     * No specular blob. This is slightly faster to render than other specular modes.
     */
    DISABLED(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): SpecularMode = entries.single { it.id == `value` }
    }
  }

  public enum class BillboardMode(
    id: Long,
  ) {
    /**
     * Billboard mode is disabled.
     */
    DISABLED(0),
    /**
     * The object's Z axis will always face the camera.
     */
    ENABLED(1),
    /**
     * The object's X axis will always face the camera.
     */
    FIXED_Y(2),
    /**
     * Used for particle systems when assigned to [GPUParticles3D] and [CPUParticles3D] nodes (flipbook animation). Enables `particles_anim_*` properties.
     *
     * The [ParticleProcessMaterial.animSpeedMin] or [CPUParticles3D.animSpeedMin] should also be set to a value bigger than zero for the animation to play.
     */
    PARTICLES(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): BillboardMode = entries.single { it.id == `value` }
    }
  }

  public enum class TextureChannel(
    id: Long,
  ) {
    /**
     * Used to read from the red channel of a texture.
     */
    RED(0),
    /**
     * Used to read from the green channel of a texture.
     */
    GREEN(1),
    /**
     * Used to read from the blue channel of a texture.
     */
    BLUE(2),
    /**
     * Used to read from the alpha channel of a texture.
     */
    ALPHA(3),
    /**
     * Used to read from the linear (non-perceptual) average of the red, green and blue channels of a texture.
     */
    GRAYSCALE(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TextureChannel = entries.single { it.id == `value` }
    }
  }

  public enum class EmissionOperator(
    id: Long,
  ) {
    /**
     * Adds the emission color to the color from the emission texture.
     */
    ADD(0),
    /**
     * Multiplies the emission color by the color from the emission texture.
     */
    MULTIPLY(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): EmissionOperator = entries.single { it.id == `value` }
    }
  }

  public enum class DistanceFadeMode(
    id: Long,
  ) {
    /**
     * Do not use distance fade.
     */
    DISABLED(0),
    /**
     * Smoothly fades the object out based on each pixel's distance from the camera using the alpha channel.
     */
    PIXEL_ALPHA(1),
    /**
     * Smoothly fades the object out based on each pixel's distance from the camera using a dithering approach. Dithering discards pixels based on a set pattern to smoothly fade without enabling transparency. On certain hardware, this can be faster than [DISTANCE_FADE_PIXEL_ALPHA].
     */
    PIXEL_DITHER(2),
    /**
     * Smoothly fades the object out based on the object's distance from the camera using a dithering approach. Dithering discards pixels based on a set pattern to smoothly fade without enabling transparency. On certain hardware, this can be faster than [DISTANCE_FADE_PIXEL_ALPHA] and [DISTANCE_FADE_PIXEL_DITHER].
     */
    OBJECT_DITHER(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DistanceFadeMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val setAlbedoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_albedo", 2_920_490_490)

    internal val getAlbedoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_albedo", 3_444_240_500)

    internal val setTransparencyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_transparency", 3_435_651_667)

    internal val getTransparencyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_transparency", 990_903_061)

    internal val setAlphaAntialiasingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_alpha_antialiasing", 3_212_649_852)

    internal val getAlphaAntialiasingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_alpha_antialiasing", 2_889_939_400)

    internal val setAlphaAntialiasingEdgePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_alpha_antialiasing_edge", 373_806_689)

    internal val getAlphaAntialiasingEdgePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_alpha_antialiasing_edge", 1_740_695_150)

    internal val setShadingModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_shading_mode", 3_368_750_322)

    internal val getShadingModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_shading_mode", 2_132_070_559)

    internal val setSpecularPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_specular", 373_806_689)

    internal val getSpecularPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_specular", 1_740_695_150)

    internal val setMetallicPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_metallic", 373_806_689)

    internal val getMetallicPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_metallic", 1_740_695_150)

    internal val setRoughnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_roughness", 373_806_689)

    internal val getRoughnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_roughness", 1_740_695_150)

    internal val setEmissionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_emission", 2_920_490_490)

    internal val getEmissionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_emission", 3_444_240_500)

    internal val setEmissionEnergyMultiplierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_emission_energy_multiplier", 373_806_689)

    internal val getEmissionEnergyMultiplierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_emission_energy_multiplier", 1_740_695_150)

    internal val setEmissionIntensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_emission_intensity", 373_806_689)

    internal val getEmissionIntensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_emission_intensity", 1_740_695_150)

    internal val setNormalScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_normal_scale", 373_806_689)

    internal val getNormalScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_normal_scale", 1_740_695_150)

    internal val setRimPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_rim", 373_806_689)

    internal val getRimPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_rim", 1_740_695_150)

    internal val setRimTintPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_rim_tint", 373_806_689)

    internal val getRimTintPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_rim_tint", 1_740_695_150)

    internal val setClearcoatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_clearcoat", 373_806_689)

    internal val getClearcoatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_clearcoat", 1_740_695_150)

    internal val setClearcoatRoughnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_clearcoat_roughness", 373_806_689)

    internal val getClearcoatRoughnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_clearcoat_roughness", 1_740_695_150)

    internal val setAnisotropyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_anisotropy", 373_806_689)

    internal val getAnisotropyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_anisotropy", 1_740_695_150)

    internal val setHeightmapScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_heightmap_scale", 373_806_689)

    internal val getHeightmapScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_heightmap_scale", 1_740_695_150)

    internal val setSubsurfaceScatteringStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_subsurface_scattering_strength", 373_806_689)

    internal val getSubsurfaceScatteringStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_subsurface_scattering_strength", 1_740_695_150)

    internal val setTransmittanceColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_transmittance_color", 2_920_490_490)

    internal val getTransmittanceColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_transmittance_color", 3_444_240_500)

    internal val setTransmittanceDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_transmittance_depth", 373_806_689)

    internal val getTransmittanceDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_transmittance_depth", 1_740_695_150)

    internal val setTransmittanceBoostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_transmittance_boost", 373_806_689)

    internal val getTransmittanceBoostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_transmittance_boost", 1_740_695_150)

    internal val setBacklightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_backlight", 2_920_490_490)

    internal val getBacklightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_backlight", 3_444_240_500)

    internal val setRefractionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_refraction", 373_806_689)

    internal val getRefractionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_refraction", 1_740_695_150)

    internal val setPointSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_point_size", 373_806_689)

    internal val getPointSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_point_size", 1_740_695_150)

    internal val setDetailUvPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_detail_uv", 456_801_921)

    internal val getDetailUvPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_detail_uv", 2_306_920_512)

    internal val setBlendModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_blend_mode", 2_830_186_259)

    internal val getBlendModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_blend_mode", 4_022_690_962)

    internal val setDepthDrawModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_depth_draw_mode", 1_456_584_748)

    internal val getDepthDrawModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_depth_draw_mode", 2_578_197_639)

    internal val setCullModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_cull_mode", 2_338_909_218)

    internal val getCullModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_cull_mode", 1_941_499_586)

    internal val setDiffuseModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_diffuse_mode", 1_045_299_638)

    internal val getDiffuseModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_diffuse_mode", 3_973_617_136)

    internal val setSpecularModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_specular_mode", 584_737_147)

    internal val getSpecularModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_specular_mode", 2_569_953_298)

    internal val setFlagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_flag", 3_070_159_527)

    internal val getFlagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_flag", 1_286_410_065)

    internal val setTextureFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_texture_filter", 22_904_437)

    internal val getTextureFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_texture_filter", 3_289_213_076)

    internal val setFeaturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_feature", 2_819_288_693)

    internal val getFeaturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_feature", 1_965_241_794)

    internal val setTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_texture", 464_208_135)

    internal val getTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_texture", 329_605_813)

    internal val setDetailBlendModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_detail_blend_mode", 2_830_186_259)

    internal val getDetailBlendModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_detail_blend_mode", 4_022_690_962)

    internal val setUv1ScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_uv1_scale", 3_460_891_852)

    internal val getUv1ScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_uv1_scale", 3_360_562_783)

    internal val setUv1OffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_uv1_offset", 3_460_891_852)

    internal val getUv1OffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_uv1_offset", 3_360_562_783)

    internal val setUv1TriplanarBlendSharpnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_uv1_triplanar_blend_sharpness", 373_806_689)

    internal val getUv1TriplanarBlendSharpnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_uv1_triplanar_blend_sharpness", 1_740_695_150)

    internal val setUv2ScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_uv2_scale", 3_460_891_852)

    internal val getUv2ScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_uv2_scale", 3_360_562_783)

    internal val setUv2OffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_uv2_offset", 3_460_891_852)

    internal val getUv2OffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_uv2_offset", 3_360_562_783)

    internal val setUv2TriplanarBlendSharpnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_uv2_triplanar_blend_sharpness", 373_806_689)

    internal val getUv2TriplanarBlendSharpnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_uv2_triplanar_blend_sharpness", 1_740_695_150)

    internal val setBillboardModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_billboard_mode", 4_202_036_497)

    internal val getBillboardModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_billboard_mode", 1_283_840_139)

    internal val setParticlesAnimHFramesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_particles_anim_h_frames", 1_286_410_249)

    internal val getParticlesAnimHFramesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_particles_anim_h_frames", 3_905_245_786)

    internal val setParticlesAnimVFramesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_particles_anim_v_frames", 1_286_410_249)

    internal val getParticlesAnimVFramesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_particles_anim_v_frames", 3_905_245_786)

    internal val setParticlesAnimLoopPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_particles_anim_loop", 2_586_408_642)

    internal val getParticlesAnimLoopPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_particles_anim_loop", 36_873_697)

    internal val setHeightmapDeepParallaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_heightmap_deep_parallax", 2_586_408_642)

    internal val isHeightmapDeepParallaxEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "is_heightmap_deep_parallax_enabled", 36_873_697)

    internal val setHeightmapDeepParallaxMinLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_heightmap_deep_parallax_min_layers", 1_286_410_249)

    internal val getHeightmapDeepParallaxMinLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_heightmap_deep_parallax_min_layers", 3_905_245_786)

    internal val setHeightmapDeepParallaxMaxLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_heightmap_deep_parallax_max_layers", 1_286_410_249)

    internal val getHeightmapDeepParallaxMaxLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_heightmap_deep_parallax_max_layers", 3_905_245_786)

    internal val setHeightmapDeepParallaxFlipTangentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_heightmap_deep_parallax_flip_tangent", 2_586_408_642)

    internal val getHeightmapDeepParallaxFlipTangentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_heightmap_deep_parallax_flip_tangent", 36_873_697)

    internal val setHeightmapDeepParallaxFlipBinormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_heightmap_deep_parallax_flip_binormal", 2_586_408_642)

    internal val getHeightmapDeepParallaxFlipBinormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_heightmap_deep_parallax_flip_binormal", 36_873_697)

    internal val setGrowPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_grow", 373_806_689)

    internal val getGrowPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_grow", 1_740_695_150)

    internal val setEmissionOperatorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_emission_operator", 3_825_128_922)

    internal val getEmissionOperatorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_emission_operator", 974_205_018)

    internal val setAoLightAffectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_ao_light_affect", 373_806_689)

    internal val getAoLightAffectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_ao_light_affect", 1_740_695_150)

    internal val setAlphaScissorThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_alpha_scissor_threshold", 373_806_689)

    internal val getAlphaScissorThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_alpha_scissor_threshold", 1_740_695_150)

    internal val setAlphaHashScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_alpha_hash_scale", 373_806_689)

    internal val getAlphaHashScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_alpha_hash_scale", 1_740_695_150)

    internal val setGrowEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_grow_enabled", 2_586_408_642)

    internal val isGrowEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "is_grow_enabled", 36_873_697)

    internal val setMetallicTextureChannelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_metallic_texture_channel", 744_167_988)

    internal val getMetallicTextureChannelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_metallic_texture_channel", 568_133_867)

    internal val setRoughnessTextureChannelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_roughness_texture_channel", 744_167_988)

    internal val getRoughnessTextureChannelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_roughness_texture_channel", 568_133_867)

    internal val setAoTextureChannelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_ao_texture_channel", 744_167_988)

    internal val getAoTextureChannelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_ao_texture_channel", 568_133_867)

    internal val setRefractionTextureChannelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_refraction_texture_channel", 744_167_988)

    internal val getRefractionTextureChannelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_refraction_texture_channel", 568_133_867)

    internal val setProximityFadeEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_proximity_fade_enabled", 2_586_408_642)

    internal val isProximityFadeEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "is_proximity_fade_enabled", 36_873_697)

    internal val setProximityFadeDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_proximity_fade_distance", 373_806_689)

    internal val getProximityFadeDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_proximity_fade_distance", 1_740_695_150)

    internal val setMsdfPixelRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_msdf_pixel_range", 373_806_689)

    internal val getMsdfPixelRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_msdf_pixel_range", 1_740_695_150)

    internal val setMsdfOutlineSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_msdf_outline_size", 373_806_689)

    internal val getMsdfOutlineSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_msdf_outline_size", 1_740_695_150)

    internal val setDistanceFadePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_distance_fade", 1_379_478_617)

    internal val getDistanceFadePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_distance_fade", 2_694_575_734)

    internal val setDistanceFadeMaxDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_distance_fade_max_distance", 373_806_689)

    internal val getDistanceFadeMaxDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_distance_fade_max_distance", 1_740_695_150)

    internal val setDistanceFadeMinDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "set_distance_fade_min_distance", 373_806_689)

    internal val getDistanceFadeMinDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BaseMaterial3D", "get_distance_fade_min_distance", 1_740_695_150)
  }
}
