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
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.VECTOR3
import godot.core.Vector3
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * This class serves as a default material with a wide variety of rendering features and properties
 * without the need to write shader code. See the tutorial below for details.
 */
@GodotBaseType
public open class BaseMaterial3D internal constructor() : Material() {
  /**
   * The material's transparency mode. Some transparency modes will disable shadow casting. Any
   * transparency mode other than [TRANSPARENCY_DISABLED] has a greater performance impact compared to
   * opaque rendering. See also [blendMode].
   */
  public final inline var transparency: Transparency
    @JvmName("transparencyProperty")
    get() = getTransparency()
    @JvmName("transparencyProperty")
    set(`value`) {
      setTransparency(value)
    }

  /**
   * Threshold at which the alpha scissor will discard values. Higher values will result in more
   * pixels being discarded. If the material becomes too opaque at a distance, try increasing
   * [alphaScissorThreshold]. If the material disappears at a distance, try decreasing
   * [alphaScissorThreshold].
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
   * **Note:** Values other than `Mix` force the object into the transparent pipeline. See
   * [BlendMode].
   */
  public final inline var blendMode: BlendMode
    @JvmName("blendModeProperty")
    get() = getBlendMode()
    @JvmName("blendModeProperty")
    set(`value`) {
      setBlendMode(value)
    }

  /**
   * Determines which side of the triangle to cull depending on whether the triangle faces towards
   * or away from the camera. See [CullMode].
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
    get() = getFlag(BaseMaterial3D.Flags.FLAG_DISABLE_DEPTH_TEST)
    @JvmName("noDepthTestProperty")
    set(`value`) {
      setFlag(BaseMaterial3D.Flags.FLAG_DISABLE_DEPTH_TEST, value)
    }

  /**
   * Sets whether the shading takes place, per-pixel, per-vertex or unshaded. Per-vertex lighting is
   * faster, making it the best choice for mobile applications, however it looks considerably worse
   * than per-pixel. Unshaded rendering is the fastest, but disables all interactions with lights.
   * **Note:** Setting the shading mode vertex shading currently has no effect, as vertex shading is
   * not implemented yet.
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
   * **Note:** [specularMode] only applies to the specular blob. It does not affect specular
   * reflections from the sky, screen-space reflections, [VoxelGI], SDFGI or [ReflectionProbe]s. To
   * disable reflections from these sources as well, set [metallicSpecular] to `0.0` instead.
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
    get() = getFlag(BaseMaterial3D.Flags.FLAG_DISABLE_AMBIENT_LIGHT)
    @JvmName("disableAmbientLightProperty")
    set(`value`) {
      setFlag(BaseMaterial3D.Flags.FLAG_DISABLE_AMBIENT_LIGHT, value)
    }

  /**
   * If `true`, the object will not be affected by fog (neither volumetric nor depth fog). This is
   * useful for unshaded or transparent materials (e.g. particles), which without this setting will be
   * affected even if fully transparent.
   */
  public final inline var disableFog: Boolean
    @JvmName("disableFogProperty")
    get() = getFlag(BaseMaterial3D.Flags.FLAG_DISABLE_FOG)
    @JvmName("disableFogProperty")
    set(`value`) {
      setFlag(BaseMaterial3D.Flags.FLAG_DISABLE_FOG, value)
    }

  /**
   * If `true`, the vertex color is used as albedo color.
   */
  public final inline var vertexColorUseAsAlbedo: Boolean
    @JvmName("vertexColorUseAsAlbedoProperty")
    get() = getFlag(BaseMaterial3D.Flags.FLAG_ALBEDO_FROM_VERTEX_COLOR)
    @JvmName("vertexColorUseAsAlbedoProperty")
    set(`value`) {
      setFlag(BaseMaterial3D.Flags.FLAG_ALBEDO_FROM_VERTEX_COLOR, value)
    }

  /**
   * If `true`, vertex colors are considered to be stored in sRGB color space and are converted to
   * linear color space during rendering. If `false`, vertex colors are considered to be stored in
   * linear color space and are rendered as-is. See also [albedoTextureForceSrgb].
   * **Note:** Only effective when using the Forward+ and Mobile rendering methods, not
   * Compatibility.
   */
  public final inline var vertexColorIsSrgb: Boolean
    @JvmName("vertexColorIsSrgbProperty")
    get() = getFlag(BaseMaterial3D.Flags.FLAG_SRGB_VERTEX_COLOR)
    @JvmName("vertexColorIsSrgbProperty")
    set(`value`) {
      setFlag(BaseMaterial3D.Flags.FLAG_SRGB_VERTEX_COLOR, value)
    }

  /**
   * The material's base color.
   * **Note:** If [detailEnabled] is `true` and a [detailAlbedo] texture is specified, [albedoColor]
   * will *not* modulate the detail texture. This can be used to color partial areas of a material by
   * not specifying an albedo texture and using a transparent [detailAlbedo] texture instead.
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
   * If the texture appears unexpectedly too dark or too bright, check [albedoTextureForceSrgb].
   */
  public final inline var albedoTexture: Texture2D?
    @JvmName("albedoTextureProperty")
    get() = getTexture(BaseMaterial3D.TextureParam.TEXTURE_ALBEDO)
    @JvmName("albedoTextureProperty")
    set(`value`) {
      setTexture(BaseMaterial3D.TextureParam.TEXTURE_ALBEDO, value)
    }

  /**
   * If `true`, forces a conversion of the [albedoTexture] from sRGB color space to linear color
   * space. See also [vertexColorIsSrgb].
   * This should only be enabled when needed (typically when using a [ViewportTexture] as
   * [albedoTexture]). If [albedoTextureForceSrgb] is `true` when it shouldn't be, the texture will
   * appear to be too dark. If [albedoTextureForceSrgb] is `false` when it shouldn't be, the texture
   * will appear to be too bright.
   */
  public final inline var albedoTextureForceSrgb: Boolean
    @JvmName("albedoTextureForceSrgbProperty")
    get() = getFlag(BaseMaterial3D.Flags.FLAG_ALBEDO_TEXTURE_FORCE_SRGB)
    @JvmName("albedoTextureForceSrgbProperty")
    set(`value`) {
      setFlag(BaseMaterial3D.Flags.FLAG_ALBEDO_TEXTURE_FORCE_SRGB, value)
    }

  /**
   * Enables multichannel signed distance field rendering shader. Use [msdfPixelRange] and
   * [msdfOutlineSize] to configure MSDF parameters.
   */
  public final inline var albedoTextureMsdf: Boolean
    @JvmName("albedoTextureMsdfProperty")
    get() = getFlag(BaseMaterial3D.Flags.FLAG_ALBEDO_TEXTURE_MSDF)
    @JvmName("albedoTextureMsdfProperty")
    set(`value`) {
      setFlag(BaseMaterial3D.Flags.FLAG_ALBEDO_TEXTURE_MSDF, value)
    }

  /**
   * The Occlusion/Roughness/Metallic texture to use. This is a more efficient replacement of
   * [aoTexture], [roughnessTexture] and [metallicTexture] in [ORMMaterial3D]. Ambient occlusion is
   * stored in the red channel. Roughness map is stored in the green channel. Metallic map is stored in
   * the blue channel. The alpha channel is ignored.
   */
  public final inline var ormTexture: Texture2D?
    @JvmName("ormTextureProperty")
    get() = getTexture(BaseMaterial3D.TextureParam.TEXTURE_ORM)
    @JvmName("ormTextureProperty")
    set(`value`) {
      setTexture(BaseMaterial3D.TextureParam.TEXTURE_ORM, value)
    }

  /**
   * A high value makes the material appear more like a metal. Non-metals use their albedo as the
   * diffuse color and add diffuse to the specular reflection. With non-metals, the reflection appears
   * on top of the albedo color. Metals use their albedo as a multiplier to the specular reflection and
   * set the diffuse color to black resulting in a tinted reflection. Materials work better when fully
   * metal or fully non-metal, values between `0` and `1` should only be used for blending between
   * metal and non-metal sections. To alter the amount of reflection use [roughness].
   */
  public final inline var metallic: Float
    @JvmName("metallicProperty")
    get() = getMetallic()
    @JvmName("metallicProperty")
    set(`value`) {
      setMetallic(value)
    }

  /**
   * Adjusts the strength of specular reflections. Specular reflections are composed of scene
   * reflections and the specular lobe which is the bright spot that is reflected from light sources.
   * When set to `0.0`, no specular reflections will be visible. This differs from the
   * [SPECULAR_DISABLED] [SpecularMode] as [SPECULAR_DISABLED] only applies to the specular lobe from
   * the light source.
   * **Note:** Unlike [metallic], this is not energy-conserving, so it should be left at `0.5` in
   * most cases. See also [roughness].
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
    get() = getTexture(BaseMaterial3D.TextureParam.TEXTURE_METALLIC)
    @JvmName("metallicTextureProperty")
    set(`value`) {
      setTexture(BaseMaterial3D.TextureParam.TEXTURE_METALLIC, value)
    }

  /**
   * Specifies the channel of the [metallicTexture] in which the metallic information is stored.
   * This is useful when you store the information for multiple effects in a single texture. For
   * example if you stored metallic in the red channel, roughness in the blue, and ambient occlusion in
   * the green you could reduce the number of textures you use.
   */
  public final inline var metallicTextureChannel: TextureChannel
    @JvmName("metallicTextureChannelProperty")
    get() = getMetallicTextureChannel()
    @JvmName("metallicTextureChannelProperty")
    set(`value`) {
      setMetallicTextureChannel(value)
    }

  /**
   * Surface reflection. A value of `0` represents a perfect mirror while a value of `1` completely
   * blurs the reflection. See also [metallic].
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
    get() = getTexture(BaseMaterial3D.TextureParam.TEXTURE_ROUGHNESS)
    @JvmName("roughnessTextureProperty")
    set(`value`) {
      setTexture(BaseMaterial3D.TextureParam.TEXTURE_ROUGHNESS, value)
    }

  /**
   * Specifies the channel of the [roughnessTexture] in which the roughness information is stored.
   * This is useful when you store the information for multiple effects in a single texture. For
   * example if you stored metallic in the red channel, roughness in the blue, and ambient occlusion in
   * the green you could reduce the number of textures you use.
   */
  public final inline var roughnessTextureChannel: TextureChannel
    @JvmName("roughnessTextureChannelProperty")
    get() = getRoughnessTextureChannel()
    @JvmName("roughnessTextureChannelProperty")
    set(`value`) {
      setRoughnessTextureChannel(value)
    }

  /**
   * If `true`, the body emits light. Emitting light makes the object appear brighter. The object
   * can also cast light on other objects if a [VoxelGI], SDFGI, or [LightmapGI] is used and this
   * object is used in baked lighting.
   */
  public final inline var emissionEnabled: Boolean
    @JvmName("emissionEnabledProperty")
    get() = getFeature(BaseMaterial3D.Feature.FEATURE_EMISSION)
    @JvmName("emissionEnabledProperty")
    set(`value`) {
      setFeature(BaseMaterial3D.Feature.FEATURE_EMISSION, value)
    }

  /**
   * The emitted light's color. See [emissionEnabled].
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
   * Luminance of emitted light, measured in nits (candela per square meter). Only available when
   * [ProjectSettings.rendering/lightsAndShadows/usePhysicalLightUnits] is enabled. The default is
   * roughly equivalent to an indoor lightbulb.
   */
  public final inline var emissionIntensity: Float
    @JvmName("emissionIntensityProperty")
    get() = getEmissionIntensity()
    @JvmName("emissionIntensityProperty")
    set(`value`) {
      setEmissionIntensity(value)
    }

  /**
   * Sets how [emission] interacts with [emissionTexture]. Can either add or multiply. See
   * [EmissionOperator] for options.
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
    get() = getFlag(BaseMaterial3D.Flags.FLAG_EMISSION_ON_UV2)
    @JvmName("emissionOnUv2Property")
    set(`value`) {
      setFlag(BaseMaterial3D.Flags.FLAG_EMISSION_ON_UV2, value)
    }

  /**
   * Texture that specifies how much surface emits light at a given point.
   */
  public final inline var emissionTexture: Texture2D?
    @JvmName("emissionTextureProperty")
    get() = getTexture(BaseMaterial3D.TextureParam.TEXTURE_EMISSION)
    @JvmName("emissionTextureProperty")
    set(`value`) {
      setTexture(BaseMaterial3D.TextureParam.TEXTURE_EMISSION, value)
    }

  /**
   * If `true`, normal mapping is enabled. This has a slight performance cost, especially on mobile
   * GPUs.
   */
  public final inline var normalEnabled: Boolean
    @JvmName("normalEnabledProperty")
    get() = getFeature(BaseMaterial3D.Feature.FEATURE_NORMAL_MAPPING)
    @JvmName("normalEnabledProperty")
    set(`value`) {
      setFeature(BaseMaterial3D.Feature.FEATURE_NORMAL_MAPPING, value)
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
   * Texture used to specify the normal at a given pixel. The [normalTexture] only uses the red and
   * green channels; the blue and alpha channels are ignored. The normal read from [normalTexture] is
   * oriented around the surface normal provided by the [Mesh].
   * **Note:** The mesh must have both normals and tangents defined in its vertex data. Otherwise,
   * the normal map won't render correctly and will only appear to darken the whole surface. If
   * creating geometry with [SurfaceTool], you can use [SurfaceTool.generateNormals] and
   * [SurfaceTool.generateTangents] to automatically generate normals and tangents respectively.
   * **Note:** Godot expects the normal map to use X+, Y+, and Z+ coordinates. See
   * [url=http://wiki.polycount.com/wiki/Normal_Map_Technical_Details#Common_Swizzle_Coordinates]this
   * page[/url] for a comparison of normal map coordinates expected by popular engines.
   * **Note:** If [detailEnabled] is `true`, the [detailAlbedo] texture is drawn *below* the
   * [normalTexture]. To display a normal map *above* the [detailAlbedo] texture, use [detailNormal]
   * instead.
   */
  public final inline var normalTexture: Texture2D?
    @JvmName("normalTextureProperty")
    get() = getTexture(BaseMaterial3D.TextureParam.TEXTURE_NORMAL)
    @JvmName("normalTextureProperty")
    set(`value`) {
      setTexture(BaseMaterial3D.TextureParam.TEXTURE_NORMAL, value)
    }

  /**
   * If `true`, rim effect is enabled. Rim lighting increases the brightness at glancing angles on
   * an object.
   * **Note:** Rim lighting is not visible if the material's [shadingMode] is
   * [SHADING_MODE_UNSHADED].
   */
  public final inline var rimEnabled: Boolean
    @JvmName("rimEnabledProperty")
    get() = getFeature(BaseMaterial3D.Feature.FEATURE_RIM)
    @JvmName("rimEnabledProperty")
    set(`value`) {
      setFeature(BaseMaterial3D.Feature.FEATURE_RIM, value)
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
   * The amount of to blend light and albedo color when rendering rim effect. If `0` the light color
   * is used, while `1` means albedo color is used. An intermediate value generally works best.
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
    get() = getTexture(BaseMaterial3D.TextureParam.TEXTURE_RIM)
    @JvmName("rimTextureProperty")
    set(`value`) {
      setTexture(BaseMaterial3D.TextureParam.TEXTURE_RIM, value)
    }

  /**
   * If `true`, clearcoat rendering is enabled. Adds a secondary transparent pass to the lighting
   * calculation resulting in an added specular blob. This makes materials appear as if they have a
   * clear layer on them that can be either glossy or rough.
   * **Note:** Clearcoat rendering is not visible if the material's [shadingMode] is
   * [SHADING_MODE_UNSHADED].
   */
  public final inline var clearcoatEnabled: Boolean
    @JvmName("clearcoatEnabledProperty")
    get() = getFeature(BaseMaterial3D.Feature.FEATURE_CLEARCOAT)
    @JvmName("clearcoatEnabledProperty")
    set(`value`) {
      setFeature(BaseMaterial3D.Feature.FEATURE_CLEARCOAT, value)
    }

  /**
   * Sets the strength of the clearcoat effect. Setting to `0` looks the same as disabling the
   * clearcoat effect.
   */
  public final inline var clearcoat: Float
    @JvmName("clearcoatProperty")
    get() = getClearcoat()
    @JvmName("clearcoatProperty")
    set(`value`) {
      setClearcoat(value)
    }

  /**
   * Sets the roughness of the clearcoat pass. A higher value results in a rougher clearcoat while a
   * lower value results in a smoother clearcoat.
   */
  public final inline var clearcoatRoughness: Float
    @JvmName("clearcoatRoughnessProperty")
    get() = getClearcoatRoughness()
    @JvmName("clearcoatRoughnessProperty")
    set(`value`) {
      setClearcoatRoughness(value)
    }

  /**
   * Texture that defines the strength of the clearcoat effect and the glossiness of the clearcoat.
   * Strength is specified in the red channel while glossiness is specified in the green channel.
   */
  public final inline var clearcoatTexture: Texture2D?
    @JvmName("clearcoatTextureProperty")
    get() = getTexture(BaseMaterial3D.TextureParam.TEXTURE_CLEARCOAT)
    @JvmName("clearcoatTextureProperty")
    set(`value`) {
      setTexture(BaseMaterial3D.TextureParam.TEXTURE_CLEARCOAT, value)
    }

  /**
   * If `true`, anisotropy is enabled. Anisotropy changes the shape of the specular blob and aligns
   * it to tangent space. This is useful for brushed aluminium and hair reflections.
   * **Note:** Mesh tangents are needed for anisotropy to work. If the mesh does not contain
   * tangents, the anisotropy effect will appear broken.
   * **Note:** Material anisotropy should not to be confused with anisotropic texture filtering,
   * which can be enabled by setting [textureFilter] to
   * [TEXTURE_FILTER_LINEAR_WITH_MIPMAPS_ANISOTROPIC].
   */
  public final inline var anisotropyEnabled: Boolean
    @JvmName("anisotropyEnabledProperty")
    get() = getFeature(BaseMaterial3D.Feature.FEATURE_ANISOTROPY)
    @JvmName("anisotropyEnabledProperty")
    set(`value`) {
      setFeature(BaseMaterial3D.Feature.FEATURE_ANISOTROPY, value)
    }

  /**
   * The strength of the anisotropy effect. This is multiplied by [anisotropyFlowmap]'s alpha
   * channel if a texture is defined there and the texture contains an alpha channel.
   */
  public final inline var anisotropy: Float
    @JvmName("anisotropyProperty")
    get() = getAnisotropy()
    @JvmName("anisotropyProperty")
    set(`value`) {
      setAnisotropy(value)
    }

  /**
   * Texture that offsets the tangent map for anisotropy calculations and optionally controls the
   * anisotropy effect (if an alpha channel is present). The flowmap texture is expected to be a
   * derivative map, with the red channel representing distortion on the X axis and green channel
   * representing distortion on the Y axis. Values below 0.5 will result in negative distortion,
   * whereas values above 0.5 will result in positive distortion.
   * If present, the texture's alpha channel will be used to multiply the strength of the
   * [anisotropy] effect. Fully opaque pixels will keep the anisotropy effect's original strength while
   * fully transparent pixels will disable the anisotropy effect entirely. The flowmap texture's blue
   * channel is ignored.
   */
  public final inline var anisotropyFlowmap: Texture2D?
    @JvmName("anisotropyFlowmapProperty")
    get() = getTexture(BaseMaterial3D.TextureParam.TEXTURE_FLOWMAP)
    @JvmName("anisotropyFlowmapProperty")
    set(`value`) {
      setTexture(BaseMaterial3D.TextureParam.TEXTURE_FLOWMAP, value)
    }

  /**
   * If `true`, ambient occlusion is enabled. Ambient occlusion darkens areas based on the
   * [aoTexture].
   */
  public final inline var aoEnabled: Boolean
    @JvmName("aoEnabledProperty")
    get() = getFeature(BaseMaterial3D.Feature.FEATURE_AMBIENT_OCCLUSION)
    @JvmName("aoEnabledProperty")
    set(`value`) {
      setFeature(BaseMaterial3D.Feature.FEATURE_AMBIENT_OCCLUSION, value)
    }

  /**
   * Amount that ambient occlusion affects lighting from lights. If `0`, ambient occlusion only
   * affects ambient light. If `1`, ambient occlusion affects lights just as much as it affects ambient
   * light. This can be used to impact the strength of the ambient occlusion effect, but typically
   * looks unrealistic.
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
    get() = getTexture(BaseMaterial3D.TextureParam.TEXTURE_AMBIENT_OCCLUSION)
    @JvmName("aoTextureProperty")
    set(`value`) {
      setTexture(BaseMaterial3D.TextureParam.TEXTURE_AMBIENT_OCCLUSION, value)
    }

  /**
   * If `true`, use `UV2` coordinates to look up from the [aoTexture].
   */
  public final inline var aoOnUv2: Boolean
    @JvmName("aoOnUv2Property")
    get() = getFlag(BaseMaterial3D.Flags.FLAG_AO_ON_UV2)
    @JvmName("aoOnUv2Property")
    set(`value`) {
      setFlag(BaseMaterial3D.Flags.FLAG_AO_ON_UV2, value)
    }

  /**
   * Specifies the channel of the [aoTexture] in which the ambient occlusion information is stored.
   * This is useful when you store the information for multiple effects in a single texture. For
   * example if you stored metallic in the red channel, roughness in the blue, and ambient occlusion in
   * the green you could reduce the number of textures you use.
   */
  public final inline var aoTextureChannel: TextureChannel
    @JvmName("aoTextureChannelProperty")
    get() = getAoTextureChannel()
    @JvmName("aoTextureChannelProperty")
    set(`value`) {
      setAoTextureChannel(value)
    }

  /**
   * If `true`, height mapping is enabled (also called "parallax mapping" or "depth mapping"). See
   * also [normalEnabled]. Height mapping is a demanding feature on the GPU, so it should only be used
   * on materials where it makes a significant visual difference.
   * **Note:** Height mapping is not supported if triplanar mapping is used on the same material.
   * The value of [heightmapEnabled] will be ignored if [uv1Triplanar] is enabled.
   */
  public final inline var heightmapEnabled: Boolean
    @JvmName("heightmapEnabledProperty")
    get() = getFeature(BaseMaterial3D.Feature.FEATURE_HEIGHT_MAPPING)
    @JvmName("heightmapEnabledProperty")
    set(`value`) {
      setFeature(BaseMaterial3D.Feature.FEATURE_HEIGHT_MAPPING, value)
    }

  /**
   * The heightmap scale to use for the parallax effect (see [heightmapEnabled]). The default value
   * is tuned so that the highest point (value = 255) appears to be 5 cm higher than the lowest point
   * (value = 0). Higher values result in a deeper appearance, but may result in artifacts appearing
   * when looking at the material from oblique angles, especially when the camera moves. Negative
   * values can be used to invert the parallax effect, but this is different from inverting the texture
   * using [heightmapFlipTexture] as the material will also appear to be "closer" to the camera. In
   * most cases, [heightmapScale] should be kept to a positive value.
   * **Note:** If the height map effect looks strange regardless of this value, try adjusting
   * [heightmapFlipBinormal] and [heightmapFlipTangent]. See also [heightmapTexture] for
   * recommendations on authoring heightmap textures, as the way the heightmap texture is authored
   * affects how [heightmapScale] behaves.
   */
  public final inline var heightmapScale: Float
    @JvmName("heightmapScaleProperty")
    get() = getHeightmapScale()
    @JvmName("heightmapScaleProperty")
    set(`value`) {
      setHeightmapScale(value)
    }

  /**
   * If `true`, uses parallax occlusion mapping to represent depth in the material instead of simple
   * offset mapping (see [heightmapEnabled]). This results in a more convincing depth effect, but is
   * much more expensive on the GPU. Only enable this on materials where it makes a significant visual
   * difference.
   */
  public final inline var heightmapDeepParallax: Boolean
    @JvmName("heightmapDeepParallaxProperty")
    get() = isHeightmapDeepParallaxEnabled()
    @JvmName("heightmapDeepParallaxProperty")
    set(`value`) {
      setHeightmapDeepParallax(value)
    }

  /**
   * The number of layers to use for parallax occlusion mapping when the camera is far away from the
   * material. Higher values result in a more convincing depth effect, especially in materials that
   * have steep height changes. Higher values have a significant cost on the GPU, so it should only be
   * increased on materials where it makes a significant visual difference.
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
   * The number of layers to use for parallax occlusion mapping when the camera is up close to the
   * material. Higher values result in a more convincing depth effect, especially in materials that
   * have steep height changes. Higher values have a significant cost on the GPU, so it should only be
   * increased on materials where it makes a significant visual difference.
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
   * If `true`, flips the mesh's tangent vectors when interpreting the height map. If the heightmap
   * effect looks strange when the camera moves (even with a reasonable [heightmapScale]), try setting
   * this to `true`.
   */
  public final inline var heightmapFlipTangent: Boolean
    @JvmName("heightmapFlipTangentProperty")
    get() = getHeightmapDeepParallaxFlipTangent()
    @JvmName("heightmapFlipTangentProperty")
    set(`value`) {
      setHeightmapDeepParallaxFlipTangent(value)
    }

  /**
   * If `true`, flips the mesh's binormal vectors when interpreting the height map. If the heightmap
   * effect looks strange when the camera moves (even with a reasonable [heightmapScale]), try setting
   * this to `true`.
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
   * For best results, the texture should be normalized (with [heightmapScale] reduced to
   * compensate). In [url=https://gimp.org]GIMP[/url], this can be done using **Colors > Auto >
   * Equalize**. If the texture only uses a small part of its available range, the parallax effect may
   * look strange, especially when the camera moves.
   * **Note:** To reduce memory usage and improve loading times, you may be able to use a
   * lower-resolution heightmap texture as most heightmaps are only comprised of low-frequency data.
   */
  public final inline var heightmapTexture: Texture2D?
    @JvmName("heightmapTextureProperty")
    get() = getTexture(BaseMaterial3D.TextureParam.TEXTURE_HEIGHTMAP)
    @JvmName("heightmapTextureProperty")
    set(`value`) {
      setTexture(BaseMaterial3D.TextureParam.TEXTURE_HEIGHTMAP, value)
    }

  /**
   * If `true`, interprets the height map texture as a depth map, with brighter values appearing to
   * be "lower" in altitude compared to darker values.
   * This can be enabled for compatibility with some materials authored for Godot 3.x. This is not
   * necessary if the Invert import option was used to invert the depth map in Godot 3.x, in which case
   * [heightmapFlipTexture] should remain `false`.
   */
  public final inline var heightmapFlipTexture: Boolean
    @JvmName("heightmapFlipTextureProperty")
    get() = getFlag(BaseMaterial3D.Flags.FLAG_INVERT_HEIGHTMAP)
    @JvmName("heightmapFlipTextureProperty")
    set(`value`) {
      setFlag(BaseMaterial3D.Flags.FLAG_INVERT_HEIGHTMAP, value)
    }

  /**
   * If `true`, subsurface scattering is enabled. Emulates light that penetrates an object's
   * surface, is scattered, and then emerges. Subsurface scattering quality is controlled by
   * [ProjectSettings.rendering/environment/subsurfaceScattering/subsurfaceScatteringQuality].
   */
  public final inline var subsurfScatterEnabled: Boolean
    @JvmName("subsurfScatterEnabledProperty")
    get() = getFeature(BaseMaterial3D.Feature.FEATURE_SUBSURFACE_SCATTERING)
    @JvmName("subsurfScatterEnabledProperty")
    set(`value`) {
      setFeature(BaseMaterial3D.Feature.FEATURE_SUBSURFACE_SCATTERING, value)
    }

  /**
   * The strength of the subsurface scattering effect. The depth of the effect is also controlled by
   * [ProjectSettings.rendering/environment/subsurfaceScattering/subsurfaceScatteringScale], which is
   * set globally.
   */
  public final inline var subsurfScatterStrength: Float
    @JvmName("subsurfScatterStrengthProperty")
    get() = getSubsurfaceScatteringStrength()
    @JvmName("subsurfScatterStrengthProperty")
    set(`value`) {
      setSubsurfaceScatteringStrength(value)
    }

  /**
   * If `true`, subsurface scattering will use a special mode optimized for the color and density of
   * human skin, such as boosting the intensity of the red channel in subsurface scattering.
   */
  public final inline var subsurfScatterSkinMode: Boolean
    @JvmName("subsurfScatterSkinModeProperty")
    get() = getFlag(BaseMaterial3D.Flags.FLAG_SUBSURFACE_MODE_SKIN)
    @JvmName("subsurfScatterSkinModeProperty")
    set(`value`) {
      setFlag(BaseMaterial3D.Flags.FLAG_SUBSURFACE_MODE_SKIN, value)
    }

  /**
   * Texture used to control the subsurface scattering strength. Stored in the red texture channel.
   * Multiplied by [subsurfScatterStrength].
   */
  public final inline var subsurfScatterTexture: Texture2D?
    @JvmName("subsurfScatterTextureProperty")
    get() = getTexture(BaseMaterial3D.TextureParam.TEXTURE_SUBSURFACE_SCATTERING)
    @JvmName("subsurfScatterTextureProperty")
    set(`value`) {
      setTexture(BaseMaterial3D.TextureParam.TEXTURE_SUBSURFACE_SCATTERING, value)
    }

  /**
   * If `true`, enables subsurface scattering transmittance. Only effective if
   * [subsurfScatterEnabled] is `true`. See also [backlightEnabled].
   */
  public final inline var subsurfScatterTransmittanceEnabled: Boolean
    @JvmName("subsurfScatterTransmittanceEnabledProperty")
    get() = getFeature(BaseMaterial3D.Feature.FEATURE_SUBSURFACE_TRANSMITTANCE)
    @JvmName("subsurfScatterTransmittanceEnabledProperty")
    set(`value`) {
      setFeature(BaseMaterial3D.Feature.FEATURE_SUBSURFACE_TRANSMITTANCE, value)
    }

  /**
   * The color to multiply the subsurface scattering transmittance effect with. Ignored if
   * [subsurfScatterSkinMode] is `true`.
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
   * The texture to use for multiplying the intensity of the subsurface scattering transmittance
   * intensity. See also [subsurfScatterTexture]. Ignored if [subsurfScatterSkinMode] is `true`.
   */
  public final inline var subsurfScatterTransmittanceTexture: Texture2D?
    @JvmName("subsurfScatterTransmittanceTextureProperty")
    get() = getTexture(BaseMaterial3D.TextureParam.TEXTURE_SUBSURFACE_TRANSMITTANCE)
    @JvmName("subsurfScatterTransmittanceTextureProperty")
    set(`value`) {
      setTexture(BaseMaterial3D.TextureParam.TEXTURE_SUBSURFACE_TRANSMITTANCE, value)
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
    get() = getFeature(BaseMaterial3D.Feature.FEATURE_BACKLIGHT)
    @JvmName("backlightEnabledProperty")
    set(`value`) {
      setFeature(BaseMaterial3D.Feature.FEATURE_BACKLIGHT, value)
    }

  /**
   * The color used by the backlight effect. Represents the light passing through an object.
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
    get() = getTexture(BaseMaterial3D.TextureParam.TEXTURE_BACKLIGHT)
    @JvmName("backlightTextureProperty")
    set(`value`) {
      setTexture(BaseMaterial3D.TextureParam.TEXTURE_BACKLIGHT, value)
    }

  /**
   * If `true`, the refraction effect is enabled. Distorts transparency based on light from behind
   * the object.
   */
  public final inline var refractionEnabled: Boolean
    @JvmName("refractionEnabledProperty")
    get() = getFeature(BaseMaterial3D.Feature.FEATURE_REFRACTION)
    @JvmName("refractionEnabledProperty")
    set(`value`) {
      setFeature(BaseMaterial3D.Feature.FEATURE_REFRACTION, value)
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
   * Texture that controls the strength of the refraction per-pixel. Multiplied by
   * [refractionScale].
   */
  public final inline var refractionTexture: Texture2D?
    @JvmName("refractionTextureProperty")
    get() = getTexture(BaseMaterial3D.TextureParam.TEXTURE_REFRACTION)
    @JvmName("refractionTextureProperty")
    set(`value`) {
      setTexture(BaseMaterial3D.TextureParam.TEXTURE_REFRACTION, value)
    }

  /**
   * Specifies the channel of the [refractionTexture] in which the refraction information is stored.
   * This is useful when you store the information for multiple effects in a single texture. For
   * example if you stored refraction in the red channel, roughness in the blue, and ambient occlusion
   * in the green you could reduce the number of textures you use.
   */
  public final inline var refractionTextureChannel: TextureChannel
    @JvmName("refractionTextureChannelProperty")
    get() = getRefractionTextureChannel()
    @JvmName("refractionTextureChannelProperty")
    set(`value`) {
      setRefractionTextureChannel(value)
    }

  /**
   * If `true`, enables the detail overlay. Detail is a second texture that gets mixed over the
   * surface of the object based on [detailMask] and [detailAlbedo]'s alpha channel. This can be used
   * to add variation to objects, or to blend between two different albedo/normal textures.
   */
  public final inline var detailEnabled: Boolean
    @JvmName("detailEnabledProperty")
    get() = getFeature(BaseMaterial3D.Feature.FEATURE_DETAIL)
    @JvmName("detailEnabledProperty")
    set(`value`) {
      setFeature(BaseMaterial3D.Feature.FEATURE_DETAIL, value)
    }

  /**
   * Texture used to specify how the detail textures get blended with the base textures.
   * [detailMask] can be used together with [detailAlbedo]'s alpha channel (if any).
   */
  public final inline var detailMask: Texture2D?
    @JvmName("detailMaskProperty")
    get() = getTexture(BaseMaterial3D.TextureParam.TEXTURE_DETAIL_MASK)
    @JvmName("detailMaskProperty")
    set(`value`) {
      setTexture(BaseMaterial3D.TextureParam.TEXTURE_DETAIL_MASK, value)
    }

  /**
   * Specifies how the [detailAlbedo] should blend with the current `ALBEDO`. See [BlendMode] for
   * options.
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
   * Texture that specifies the color of the detail overlay. [detailAlbedo]'s alpha channel is used
   * as a mask, even when the material is opaque. To use a dedicated texture as a mask, see
   * [detailMask].
   * **Note:** [detailAlbedo] is *not* modulated by [albedoColor].
   */
  public final inline var detailAlbedo: Texture2D?
    @JvmName("detailAlbedoProperty")
    get() = getTexture(BaseMaterial3D.TextureParam.TEXTURE_DETAIL_ALBEDO)
    @JvmName("detailAlbedoProperty")
    set(`value`) {
      setTexture(BaseMaterial3D.TextureParam.TEXTURE_DETAIL_ALBEDO, value)
    }

  /**
   * Texture that specifies the per-pixel normal of the detail overlay. The [detailNormal] texture
   * only uses the red and green channels; the blue and alpha channels are ignored. The normal read
   * from [detailNormal] is oriented around the surface normal provided by the [Mesh].
   * **Note:** Godot expects the normal map to use X+, Y+, and Z+ coordinates. See
   * [url=http://wiki.polycount.com/wiki/Normal_Map_Technical_Details#Common_Swizzle_Coordinates]this
   * page[/url] for a comparison of normal map coordinates expected by popular engines.
   */
  public final inline var detailNormal: Texture2D?
    @JvmName("detailNormalProperty")
    get() = getTexture(BaseMaterial3D.TextureParam.TEXTURE_DETAIL_NORMAL)
    @JvmName("detailNormalProperty")
    set(`value`) {
      setTexture(BaseMaterial3D.TextureParam.TEXTURE_DETAIL_NORMAL, value)
    }

  /**
   * How much to scale the `UV` coordinates. This is multiplied by `UV` in the vertex function. The
   * Z component is used when [uv1Triplanar] is enabled, but it is not used anywhere else.
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
   * How much to offset the `UV` coordinates. This amount will be added to `UV` in the vertex
   * function. This can be used to offset a texture. The Z component is used when [uv1Triplanar] is
   * enabled, but it is not used anywhere else.
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
   * If `true`, instead of using `UV` textures will use a triplanar texture lookup to determine how
   * to apply textures. Triplanar uses the orientation of the object's surface to blend between texture
   * coordinates. It reads from the source texture 3 times, once for each axis and then blends between
   * the results based on how closely the pixel aligns with each axis. This is often used for natural
   * features to get a realistic blend of materials. Because triplanar texturing requires many more
   * texture reads per-pixel it is much slower than normal UV texturing. Additionally, because it is
   * blending the texture between the three axes, it is unsuitable when you are trying to achieve crisp
   * texturing.
   */
  public final inline var uv1Triplanar: Boolean
    @JvmName("uv1TriplanarProperty")
    get() = getFlag(BaseMaterial3D.Flags.FLAG_UV1_USE_TRIPLANAR)
    @JvmName("uv1TriplanarProperty")
    set(`value`) {
      setFlag(BaseMaterial3D.Flags.FLAG_UV1_USE_TRIPLANAR, value)
    }

  /**
   * A lower number blends the texture more softly while a higher number blends the texture more
   * sharply.
   * **Note:** [uv1TriplanarSharpness] is clamped between `0.0` and `150.0` (inclusive) as values
   * outside that range can look broken depending on the mesh.
   */
  public final inline var uv1TriplanarSharpness: Float
    @JvmName("uv1TriplanarSharpnessProperty")
    get() = getUv1TriplanarBlendSharpness()
    @JvmName("uv1TriplanarSharpnessProperty")
    set(`value`) {
      setUv1TriplanarBlendSharpness(value)
    }

  /**
   * If `true`, triplanar mapping for `UV` is calculated in world space rather than object local
   * space. See also [uv1Triplanar].
   */
  public final inline var uv1WorldTriplanar: Boolean
    @JvmName("uv1WorldTriplanarProperty")
    get() = getFlag(BaseMaterial3D.Flags.FLAG_UV1_USE_WORLD_TRIPLANAR)
    @JvmName("uv1WorldTriplanarProperty")
    set(`value`) {
      setFlag(BaseMaterial3D.Flags.FLAG_UV1_USE_WORLD_TRIPLANAR, value)
    }

  /**
   * How much to scale the `UV2` coordinates. This is multiplied by `UV2` in the vertex function.
   * The Z component is used when [uv2Triplanar] is enabled, but it is not used anywhere else.
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
   * How much to offset the `UV2` coordinates. This amount will be added to `UV2` in the vertex
   * function. This can be used to offset a texture. The Z component is used when [uv2Triplanar] is
   * enabled, but it is not used anywhere else.
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
   * If `true`, instead of using `UV2` textures will use a triplanar texture lookup to determine how
   * to apply textures. Triplanar uses the orientation of the object's surface to blend between texture
   * coordinates. It reads from the source texture 3 times, once for each axis and then blends between
   * the results based on how closely the pixel aligns with each axis. This is often used for natural
   * features to get a realistic blend of materials. Because triplanar texturing requires many more
   * texture reads per-pixel it is much slower than normal UV texturing. Additionally, because it is
   * blending the texture between the three axes, it is unsuitable when you are trying to achieve crisp
   * texturing.
   */
  public final inline var uv2Triplanar: Boolean
    @JvmName("uv2TriplanarProperty")
    get() = getFlag(BaseMaterial3D.Flags.FLAG_UV2_USE_TRIPLANAR)
    @JvmName("uv2TriplanarProperty")
    set(`value`) {
      setFlag(BaseMaterial3D.Flags.FLAG_UV2_USE_TRIPLANAR, value)
    }

  /**
   * A lower number blends the texture more softly while a higher number blends the texture more
   * sharply.
   * **Note:** [uv2TriplanarSharpness] is clamped between `0.0` and `150.0` (inclusive) as values
   * outside that range can look broken depending on the mesh.
   */
  public final inline var uv2TriplanarSharpness: Float
    @JvmName("uv2TriplanarSharpnessProperty")
    get() = getUv2TriplanarBlendSharpness()
    @JvmName("uv2TriplanarSharpnessProperty")
    set(`value`) {
      setUv2TriplanarBlendSharpness(value)
    }

  /**
   * If `true`, triplanar mapping for `UV2` is calculated in world space rather than object local
   * space. See also [uv2Triplanar].
   */
  public final inline var uv2WorldTriplanar: Boolean
    @JvmName("uv2WorldTriplanarProperty")
    get() = getFlag(BaseMaterial3D.Flags.FLAG_UV2_USE_WORLD_TRIPLANAR)
    @JvmName("uv2WorldTriplanarProperty")
    set(`value`) {
      setFlag(BaseMaterial3D.Flags.FLAG_UV2_USE_WORLD_TRIPLANAR, value)
    }

  /**
   * Filter flags for the texture. See [TextureFilter] for options.
   * **Note:** [heightmapTexture] is always sampled with linear filtering, even if nearest-neighbor
   * filtering is selected here. This is to ensure the heightmap effect looks as intended. If you need
   * sharper height transitions between pixels, resize the heightmap texture in an image editor with
   * nearest-neighbor filtering.
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
    get() = getFlag(BaseMaterial3D.Flags.FLAG_USE_TEXTURE_REPEAT)
    @JvmName("textureRepeatProperty")
    set(`value`) {
      setFlag(BaseMaterial3D.Flags.FLAG_USE_TEXTURE_REPEAT, value)
    }

  /**
   * If `true`, the object receives no shadow that would otherwise be cast onto it.
   */
  public final inline var disableReceiveShadows: Boolean
    @JvmName("disableReceiveShadowsProperty")
    get() = getFlag(BaseMaterial3D.Flags.FLAG_DONT_RECEIVE_SHADOWS)
    @JvmName("disableReceiveShadowsProperty")
    set(`value`) {
      setFlag(BaseMaterial3D.Flags.FLAG_DONT_RECEIVE_SHADOWS, value)
    }

  /**
   * If `true`, enables the "shadow to opacity" render mode where lighting modifies the alpha so
   * shadowed areas are opaque and non-shadowed areas are transparent. Useful for overlaying shadows
   * onto a camera feed in AR.
   */
  public final inline var shadowToOpacity: Boolean
    @JvmName("shadowToOpacityProperty")
    get() = getFlag(BaseMaterial3D.Flags.FLAG_USE_SHADOW_TO_OPACITY)
    @JvmName("shadowToOpacityProperty")
    set(`value`) {
      setFlag(BaseMaterial3D.Flags.FLAG_USE_SHADOW_TO_OPACITY, value)
    }

  /**
   * Controls how the object faces the camera. See [BillboardMode].
   * **Note:** When billboarding is enabled and the material also casts shadows, billboards will
   * face **the** camera in the scene when rendering shadows. In scenes with multiple cameras, the
   * intended shadow cannot be determined and this will result in undefined behavior. See
   * [url=https://github.com/godotengine/godot/pull/72638]GitHub Pull Request #72638[/url] for details.
   * **Note:** Billboard mode is not suitable for VR because the left-right vector of the camera is
   * not horizontal when the screen is attached to your head instead of on the table. See
   * [url=https://github.com/godotengine/godot/issues/41567]GitHub issue #41567[/url] for details.
   */
  public final inline var billboardMode: BillboardMode
    @JvmName("billboardModeProperty")
    get() = getBillboardMode()
    @JvmName("billboardModeProperty")
    set(`value`) {
      setBillboardMode(value)
    }

  /**
   * If `true`, the shader will keep the scale set for the mesh. Otherwise, the scale is lost when
   * billboarding. Only applies when [billboardMode] is not [BILLBOARD_DISABLED].
   */
  public final inline var billboardKeepScale: Boolean
    @JvmName("billboardKeepScaleProperty")
    get() = getFlag(BaseMaterial3D.Flags.FLAG_BILLBOARD_KEEP_SCALE)
    @JvmName("billboardKeepScaleProperty")
    set(`value`) {
      setFlag(BaseMaterial3D.Flags.FLAG_BILLBOARD_KEEP_SCALE, value)
    }

  /**
   * The number of horizontal frames in the particle sprite sheet. Only enabled when using
   * [BILLBOARD_PARTICLES]. See [billboardMode].
   */
  public final inline var particlesAnimHFrames: Int
    @JvmName("particlesAnimHFramesProperty")
    get() = getParticlesAnimHFrames()
    @JvmName("particlesAnimHFramesProperty")
    set(`value`) {
      setParticlesAnimHFrames(value)
    }

  /**
   * The number of vertical frames in the particle sprite sheet. Only enabled when using
   * [BILLBOARD_PARTICLES]. See [billboardMode].
   */
  public final inline var particlesAnimVFrames: Int
    @JvmName("particlesAnimVFramesProperty")
    get() = getParticlesAnimVFrames()
    @JvmName("particlesAnimVFramesProperty")
    set(`value`) {
      setParticlesAnimVFrames(value)
    }

  /**
   * If `true`, particle animations are looped. Only enabled when using [BILLBOARD_PARTICLES]. See
   * [billboardMode].
   */
  public final inline var particlesAnimLoop: Boolean
    @JvmName("particlesAnimLoopProperty")
    get() = getParticlesAnimLoop()
    @JvmName("particlesAnimLoopProperty")
    set(`value`) {
      setParticlesAnimLoop(value)
    }

  /**
   * If `true`, enables the vertex grow setting. This can be used to create mesh-based outlines
   * using a second material pass and its [cullMode] set to [CULL_FRONT]. See also [growAmount].
   * **Note:** Vertex growth cannot create new vertices, which means that visible gaps may occur in
   * sharp corners. This can be alleviated by designing the mesh to use smooth normals exclusively
   * using [url=https://wiki.polycount.com/wiki/Face_weighted_normals]face weighted normals[/url] in
   * the 3D authoring software. In this case, grow will be able to join every outline together, just
   * like in the original mesh.
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
    get() = getFlag(BaseMaterial3D.Flags.FLAG_FIXED_SIZE)
    @JvmName("fixedSizeProperty")
    set(`value`) {
      setFlag(BaseMaterial3D.Flags.FLAG_FIXED_SIZE, value)
    }

  /**
   * If `true`, render point size can be changed.
   * **Note:** This is only effective for objects whose geometry is point-based rather than
   * triangle-based. See also [pointSize].
   */
  public final inline var usePointSize: Boolean
    @JvmName("usePointSizeProperty")
    get() = getFlag(BaseMaterial3D.Flags.FLAG_USE_POINT_SIZE)
    @JvmName("usePointSizeProperty")
    set(`value`) {
      setFlag(BaseMaterial3D.Flags.FLAG_USE_POINT_SIZE, value)
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
   * If `true`, enables parts of the shader required for [GPUParticles3D] trails to function. This
   * also requires using a mesh with appropriate skinning, such as [RibbonTrailMesh] or
   * [TubeTrailMesh]. Enabling this feature outside of materials used in [GPUParticles3D] meshes will
   * break material rendering.
   */
  public final inline var useParticleTrails: Boolean
    @JvmName("useParticleTrailsProperty")
    get() = getFlag(BaseMaterial3D.Flags.FLAG_PARTICLE_TRAILS_MODE)
    @JvmName("useParticleTrailsProperty")
    set(`value`) {
      setFlag(BaseMaterial3D.Flags.FLAG_PARTICLE_TRAILS_MODE, value)
    }

  /**
   * If `true`, the proximity fade effect is enabled. The proximity fade effect fades out each pixel
   * based on its distance to another object.
   */
  public final inline var proximityFadeEnabled: Boolean
    @JvmName("proximityFadeEnabledProperty")
    get() = isProximityFadeEnabled()
    @JvmName("proximityFadeEnabledProperty")
    set(`value`) {
      setProximityFadeEnabled(value)
    }

  /**
   * Distance over which the fade effect takes place. The larger the distance the longer it takes
   * for an object to fade.
   */
  public final inline var proximityFadeDistance: Float
    @JvmName("proximityFadeDistanceProperty")
    get() = getProximityFadeDistance()
    @JvmName("proximityFadeDistanceProperty")
    set(`value`) {
      setProximityFadeDistance(value)
    }

  /**
   * The width of the range around the shape between the minimum and maximum representable signed
   * distance.
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
   * Distance at which the object starts to become visible. If the object is less than this distance
   * away, it will be invisible.
   * **Note:** If [distanceFadeMinDistance] is greater than [distanceFadeMaxDistance], the behavior
   * will be reversed. The object will start to fade away at [distanceFadeMaxDistance] and will fully
   * disappear once it reaches [distanceFadeMinDistance].
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
   * **Note:** If [distanceFadeMaxDistance] is less than [distanceFadeMinDistance], the behavior
   * will be reversed. The object will start to fade away at [distanceFadeMaxDistance] and will fully
   * disappear once it reaches [distanceFadeMinDistance].
   */
  public final inline var distanceFadeMaxDistance: Float
    @JvmName("distanceFadeMaxDistanceProperty")
    get() = getDistanceFadeMaxDistance()
    @JvmName("distanceFadeMaxDistanceProperty")
    set(`value`) {
      setDistanceFadeMaxDistance(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_BASEMATERIAL3D_INDEX, scriptIndex)
  }

  /**
   * The material's base color.
   * **Note:** If [detailEnabled] is `true` and a [detailAlbedo] texture is specified, [albedoColor]
   * will *not* modulate the detail texture. This can be used to color partial areas of a material by
   * not specifying an albedo texture and using a transparent [detailAlbedo] texture instead.
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
   * val myCoreType = basematerial3d.albedoColor
   * //Your changes
   * basematerial3d.albedoColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun albedoColorMutate(block: Color.() -> Unit): Color = albedoColor.apply{
      block(this)
      albedoColor = this
  }


  /**
   * The emitted light's color. See [emissionEnabled].
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
   * val myCoreType = basematerial3d.emission
   * //Your changes
   * basematerial3d.emission = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun emissionMutate(block: Color.() -> Unit): Color = emission.apply{
      block(this)
      emission = this
  }


  /**
   * The color to multiply the subsurface scattering transmittance effect with. Ignored if
   * [subsurfScatterSkinMode] is `true`.
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
   * val myCoreType = basematerial3d.subsurfScatterTransmittanceColor
   * //Your changes
   * basematerial3d.subsurfScatterTransmittanceColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun subsurfScatterTransmittanceColorMutate(block: Color.() -> Unit): Color =
      subsurfScatterTransmittanceColor.apply{
      block(this)
      subsurfScatterTransmittanceColor = this
  }


  /**
   * The color used by the backlight effect. Represents the light passing through an object.
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
   * val myCoreType = basematerial3d.backlight
   * //Your changes
   * basematerial3d.backlight = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun backlightMutate(block: Color.() -> Unit): Color = backlight.apply{
      block(this)
      backlight = this
  }


  /**
   * How much to scale the `UV` coordinates. This is multiplied by `UV` in the vertex function. The
   * Z component is used when [uv1Triplanar] is enabled, but it is not used anywhere else.
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
   * val myCoreType = basematerial3d.uv1Scale
   * //Your changes
   * basematerial3d.uv1Scale = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun uv1ScaleMutate(block: Vector3.() -> Unit): Vector3 = uv1Scale.apply{
      block(this)
      uv1Scale = this
  }


  /**
   * How much to offset the `UV` coordinates. This amount will be added to `UV` in the vertex
   * function. This can be used to offset a texture. The Z component is used when [uv1Triplanar] is
   * enabled, but it is not used anywhere else.
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
   * val myCoreType = basematerial3d.uv1Offset
   * //Your changes
   * basematerial3d.uv1Offset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun uv1OffsetMutate(block: Vector3.() -> Unit): Vector3 = uv1Offset.apply{
      block(this)
      uv1Offset = this
  }


  /**
   * How much to scale the `UV2` coordinates. This is multiplied by `UV2` in the vertex function.
   * The Z component is used when [uv2Triplanar] is enabled, but it is not used anywhere else.
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
   * val myCoreType = basematerial3d.uv2Scale
   * //Your changes
   * basematerial3d.uv2Scale = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun uv2ScaleMutate(block: Vector3.() -> Unit): Vector3 = uv2Scale.apply{
      block(this)
      uv2Scale = this
  }


  /**
   * How much to offset the `UV2` coordinates. This amount will be added to `UV2` in the vertex
   * function. This can be used to offset a texture. The Z component is used when [uv2Triplanar] is
   * enabled, but it is not used anywhere else.
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
   * val myCoreType = basematerial3d.uv2Offset
   * //Your changes
   * basematerial3d.uv2Offset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun uv2OffsetMutate(block: Vector3.() -> Unit): Vector3 = uv2Offset.apply{
      block(this)
      uv2Offset = this
  }


  public final fun setAlbedo(albedo: Color): Unit {
    Internals.writeArguments(COLOR to albedo)
    Internals.callMethod(rawPtr, MethodBindings.setAlbedoPtr, NIL)
  }

  public final fun getAlbedo(): Color {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAlbedoPtr, COLOR)
    return (Internals.readReturnValue(COLOR) as Color)
  }

  public final fun setTransparency(transparency: Transparency): Unit {
    Internals.writeArguments(LONG to transparency.id)
    Internals.callMethod(rawPtr, MethodBindings.setTransparencyPtr, NIL)
  }

  public final fun getTransparency(): Transparency {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTransparencyPtr, LONG)
    return BaseMaterial3D.Transparency.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setAlphaAntialiasing(alphaAa: AlphaAntiAliasing): Unit {
    Internals.writeArguments(LONG to alphaAa.id)
    Internals.callMethod(rawPtr, MethodBindings.setAlphaAntialiasingPtr, NIL)
  }

  public final fun getAlphaAntialiasing(): AlphaAntiAliasing {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAlphaAntialiasingPtr, LONG)
    return BaseMaterial3D.AlphaAntiAliasing.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setAlphaAntialiasingEdge(edge: Float): Unit {
    Internals.writeArguments(DOUBLE to edge.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setAlphaAntialiasingEdgePtr, NIL)
  }

  public final fun getAlphaAntialiasingEdge(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAlphaAntialiasingEdgePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setShadingMode(shadingMode: ShadingMode): Unit {
    Internals.writeArguments(LONG to shadingMode.id)
    Internals.callMethod(rawPtr, MethodBindings.setShadingModePtr, NIL)
  }

  public final fun getShadingMode(): ShadingMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getShadingModePtr, LONG)
    return BaseMaterial3D.ShadingMode.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setSpecular(specular: Float): Unit {
    Internals.writeArguments(DOUBLE to specular.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setSpecularPtr, NIL)
  }

  public final fun getSpecular(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSpecularPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setMetallic(metallic: Float): Unit {
    Internals.writeArguments(DOUBLE to metallic.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setMetallicPtr, NIL)
  }

  public final fun getMetallic(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMetallicPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setRoughness(roughness: Float): Unit {
    Internals.writeArguments(DOUBLE to roughness.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setRoughnessPtr, NIL)
  }

  public final fun getRoughness(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRoughnessPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setEmission(emission: Color): Unit {
    Internals.writeArguments(COLOR to emission)
    Internals.callMethod(rawPtr, MethodBindings.setEmissionPtr, NIL)
  }

  public final fun getEmission(): Color {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEmissionPtr, COLOR)
    return (Internals.readReturnValue(COLOR) as Color)
  }

  public final fun setEmissionEnergyMultiplier(emissionEnergyMultiplier: Float): Unit {
    Internals.writeArguments(DOUBLE to emissionEnergyMultiplier.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setEmissionEnergyMultiplierPtr, NIL)
  }

  public final fun getEmissionEnergyMultiplier(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEmissionEnergyMultiplierPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setEmissionIntensity(emissionEnergyMultiplier: Float): Unit {
    Internals.writeArguments(DOUBLE to emissionEnergyMultiplier.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setEmissionIntensityPtr, NIL)
  }

  public final fun getEmissionIntensity(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEmissionIntensityPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setNormalScale(normalScale: Float): Unit {
    Internals.writeArguments(DOUBLE to normalScale.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setNormalScalePtr, NIL)
  }

  public final fun getNormalScale(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getNormalScalePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setRim(rim: Float): Unit {
    Internals.writeArguments(DOUBLE to rim.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setRimPtr, NIL)
  }

  public final fun getRim(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRimPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setRimTint(rimTint: Float): Unit {
    Internals.writeArguments(DOUBLE to rimTint.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setRimTintPtr, NIL)
  }

  public final fun getRimTint(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRimTintPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setClearcoat(clearcoat: Float): Unit {
    Internals.writeArguments(DOUBLE to clearcoat.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setClearcoatPtr, NIL)
  }

  public final fun getClearcoat(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getClearcoatPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setClearcoatRoughness(clearcoatRoughness: Float): Unit {
    Internals.writeArguments(DOUBLE to clearcoatRoughness.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setClearcoatRoughnessPtr, NIL)
  }

  public final fun getClearcoatRoughness(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getClearcoatRoughnessPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAnisotropy(anisotropy: Float): Unit {
    Internals.writeArguments(DOUBLE to anisotropy.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setAnisotropyPtr, NIL)
  }

  public final fun getAnisotropy(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAnisotropyPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setHeightmapScale(heightmapScale: Float): Unit {
    Internals.writeArguments(DOUBLE to heightmapScale.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setHeightmapScalePtr, NIL)
  }

  public final fun getHeightmapScale(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getHeightmapScalePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSubsurfaceScatteringStrength(strength: Float): Unit {
    Internals.writeArguments(DOUBLE to strength.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setSubsurfaceScatteringStrengthPtr, NIL)
  }

  public final fun getSubsurfaceScatteringStrength(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSubsurfaceScatteringStrengthPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setTransmittanceColor(color: Color): Unit {
    Internals.writeArguments(COLOR to color)
    Internals.callMethod(rawPtr, MethodBindings.setTransmittanceColorPtr, NIL)
  }

  public final fun getTransmittanceColor(): Color {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTransmittanceColorPtr, COLOR)
    return (Internals.readReturnValue(COLOR) as Color)
  }

  public final fun setTransmittanceDepth(depth: Float): Unit {
    Internals.writeArguments(DOUBLE to depth.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setTransmittanceDepthPtr, NIL)
  }

  public final fun getTransmittanceDepth(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTransmittanceDepthPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setTransmittanceBoost(boost: Float): Unit {
    Internals.writeArguments(DOUBLE to boost.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setTransmittanceBoostPtr, NIL)
  }

  public final fun getTransmittanceBoost(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTransmittanceBoostPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setBacklight(backlight: Color): Unit {
    Internals.writeArguments(COLOR to backlight)
    Internals.callMethod(rawPtr, MethodBindings.setBacklightPtr, NIL)
  }

  public final fun getBacklight(): Color {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBacklightPtr, COLOR)
    return (Internals.readReturnValue(COLOR) as Color)
  }

  public final fun setRefraction(refraction: Float): Unit {
    Internals.writeArguments(DOUBLE to refraction.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setRefractionPtr, NIL)
  }

  public final fun getRefraction(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRefractionPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setPointSize(pointSize: Float): Unit {
    Internals.writeArguments(DOUBLE to pointSize.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setPointSizePtr, NIL)
  }

  public final fun getPointSize(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPointSizePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDetailUv(detailUv: DetailUV): Unit {
    Internals.writeArguments(LONG to detailUv.id)
    Internals.callMethod(rawPtr, MethodBindings.setDetailUvPtr, NIL)
  }

  public final fun getDetailUv(): DetailUV {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDetailUvPtr, LONG)
    return BaseMaterial3D.DetailUV.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setBlendMode(blendMode: BlendMode): Unit {
    Internals.writeArguments(LONG to blendMode.id)
    Internals.callMethod(rawPtr, MethodBindings.setBlendModePtr, NIL)
  }

  public final fun getBlendMode(): BlendMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBlendModePtr, LONG)
    return BaseMaterial3D.BlendMode.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setDepthDrawMode(depthDrawMode: DepthDrawMode): Unit {
    Internals.writeArguments(LONG to depthDrawMode.id)
    Internals.callMethod(rawPtr, MethodBindings.setDepthDrawModePtr, NIL)
  }

  public final fun getDepthDrawMode(): DepthDrawMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDepthDrawModePtr, LONG)
    return BaseMaterial3D.DepthDrawMode.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setCullMode(cullMode: CullMode): Unit {
    Internals.writeArguments(LONG to cullMode.id)
    Internals.callMethod(rawPtr, MethodBindings.setCullModePtr, NIL)
  }

  public final fun getCullMode(): CullMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCullModePtr, LONG)
    return BaseMaterial3D.CullMode.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setDiffuseMode(diffuseMode: DiffuseMode): Unit {
    Internals.writeArguments(LONG to diffuseMode.id)
    Internals.callMethod(rawPtr, MethodBindings.setDiffuseModePtr, NIL)
  }

  public final fun getDiffuseMode(): DiffuseMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDiffuseModePtr, LONG)
    return BaseMaterial3D.DiffuseMode.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setSpecularMode(specularMode: SpecularMode): Unit {
    Internals.writeArguments(LONG to specularMode.id)
    Internals.callMethod(rawPtr, MethodBindings.setSpecularModePtr, NIL)
  }

  public final fun getSpecularMode(): SpecularMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSpecularModePtr, LONG)
    return BaseMaterial3D.SpecularMode.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * If `true`, enables the specified flag. Flags are optional behavior that can be turned on and
   * off. Only one flag can be enabled at a time with this function, the flag enumerators cannot be
   * bit-masked together to enable or disable multiple flags at once. Flags can also be enabled by
   * setting the corresponding member to `true`. See [Flags] enumerator for options.
   */
  public final fun setFlag(flag: Flags, enable: Boolean): Unit {
    Internals.writeArguments(LONG to flag.id, BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setFlagPtr, NIL)
  }

  /**
   * Returns `true`, if the specified flag is enabled. See [Flags] enumerator for options.
   */
  public final fun getFlag(flag: Flags): Boolean {
    Internals.writeArguments(LONG to flag.id)
    Internals.callMethod(rawPtr, MethodBindings.getFlagPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setTextureFilter(mode: TextureFilter): Unit {
    Internals.writeArguments(LONG to mode.id)
    Internals.callMethod(rawPtr, MethodBindings.setTextureFilterPtr, NIL)
  }

  public final fun getTextureFilter(): TextureFilter {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTextureFilterPtr, LONG)
    return BaseMaterial3D.TextureFilter.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * If `true`, enables the specified [Feature]. Many features that are available in
   * [BaseMaterial3D]s need to be enabled before use. This way the cost for using the feature is only
   * incurred when specified. Features can also be enabled by setting the corresponding member to
   * `true`.
   */
  public final fun setFeature(feature: Feature, enable: Boolean): Unit {
    Internals.writeArguments(LONG to feature.id, BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setFeaturePtr, NIL)
  }

  /**
   * Returns `true`, if the specified [Feature] is enabled.
   */
  public final fun getFeature(feature: Feature): Boolean {
    Internals.writeArguments(LONG to feature.id)
    Internals.callMethod(rawPtr, MethodBindings.getFeaturePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the texture for the slot specified by [param]. See [TextureParam] for available slots.
   */
  public final fun setTexture(`param`: TextureParam, texture: Texture2D?): Unit {
    Internals.writeArguments(LONG to param.id, OBJECT to texture)
    Internals.callMethod(rawPtr, MethodBindings.setTexturePtr, NIL)
  }

  /**
   * Returns the [Texture2D] associated with the specified [TextureParam].
   */
  public final fun getTexture(`param`: TextureParam): Texture2D? {
    Internals.writeArguments(LONG to param.id)
    Internals.callMethod(rawPtr, MethodBindings.getTexturePtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Texture2D?)
  }

  public final fun setDetailBlendMode(detailBlendMode: BlendMode): Unit {
    Internals.writeArguments(LONG to detailBlendMode.id)
    Internals.callMethod(rawPtr, MethodBindings.setDetailBlendModePtr, NIL)
  }

  public final fun getDetailBlendMode(): BlendMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDetailBlendModePtr, LONG)
    return BaseMaterial3D.BlendMode.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setUv1Scale(scale: Vector3): Unit {
    Internals.writeArguments(VECTOR3 to scale)
    Internals.callMethod(rawPtr, MethodBindings.setUv1ScalePtr, NIL)
  }

  public final fun getUv1Scale(): Vector3 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getUv1ScalePtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setUv1Offset(offset: Vector3): Unit {
    Internals.writeArguments(VECTOR3 to offset)
    Internals.callMethod(rawPtr, MethodBindings.setUv1OffsetPtr, NIL)
  }

  public final fun getUv1Offset(): Vector3 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getUv1OffsetPtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setUv1TriplanarBlendSharpness(sharpness: Float): Unit {
    Internals.writeArguments(DOUBLE to sharpness.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setUv1TriplanarBlendSharpnessPtr, NIL)
  }

  public final fun getUv1TriplanarBlendSharpness(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getUv1TriplanarBlendSharpnessPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setUv2Scale(scale: Vector3): Unit {
    Internals.writeArguments(VECTOR3 to scale)
    Internals.callMethod(rawPtr, MethodBindings.setUv2ScalePtr, NIL)
  }

  public final fun getUv2Scale(): Vector3 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getUv2ScalePtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setUv2Offset(offset: Vector3): Unit {
    Internals.writeArguments(VECTOR3 to offset)
    Internals.callMethod(rawPtr, MethodBindings.setUv2OffsetPtr, NIL)
  }

  public final fun getUv2Offset(): Vector3 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getUv2OffsetPtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setUv2TriplanarBlendSharpness(sharpness: Float): Unit {
    Internals.writeArguments(DOUBLE to sharpness.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setUv2TriplanarBlendSharpnessPtr, NIL)
  }

  public final fun getUv2TriplanarBlendSharpness(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getUv2TriplanarBlendSharpnessPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setBillboardMode(mode: BillboardMode): Unit {
    Internals.writeArguments(LONG to mode.id)
    Internals.callMethod(rawPtr, MethodBindings.setBillboardModePtr, NIL)
  }

  public final fun getBillboardMode(): BillboardMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBillboardModePtr, LONG)
    return BaseMaterial3D.BillboardMode.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setParticlesAnimHFrames(frames: Int): Unit {
    Internals.writeArguments(LONG to frames.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setParticlesAnimHFramesPtr, NIL)
  }

  public final fun getParticlesAnimHFrames(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getParticlesAnimHFramesPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setParticlesAnimVFrames(frames: Int): Unit {
    Internals.writeArguments(LONG to frames.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setParticlesAnimVFramesPtr, NIL)
  }

  public final fun getParticlesAnimVFrames(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getParticlesAnimVFramesPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setParticlesAnimLoop(loop: Boolean): Unit {
    Internals.writeArguments(BOOL to loop)
    Internals.callMethod(rawPtr, MethodBindings.setParticlesAnimLoopPtr, NIL)
  }

  public final fun getParticlesAnimLoop(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getParticlesAnimLoopPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setHeightmapDeepParallax(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setHeightmapDeepParallaxPtr, NIL)
  }

  public final fun isHeightmapDeepParallaxEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isHeightmapDeepParallaxEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setHeightmapDeepParallaxMinLayers(layer: Int): Unit {
    Internals.writeArguments(LONG to layer.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setHeightmapDeepParallaxMinLayersPtr, NIL)
  }

  public final fun getHeightmapDeepParallaxMinLayers(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getHeightmapDeepParallaxMinLayersPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setHeightmapDeepParallaxMaxLayers(layer: Int): Unit {
    Internals.writeArguments(LONG to layer.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setHeightmapDeepParallaxMaxLayersPtr, NIL)
  }

  public final fun getHeightmapDeepParallaxMaxLayers(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getHeightmapDeepParallaxMaxLayersPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setHeightmapDeepParallaxFlipTangent(flip: Boolean): Unit {
    Internals.writeArguments(BOOL to flip)
    Internals.callMethod(rawPtr, MethodBindings.setHeightmapDeepParallaxFlipTangentPtr, NIL)
  }

  public final fun getHeightmapDeepParallaxFlipTangent(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getHeightmapDeepParallaxFlipTangentPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setHeightmapDeepParallaxFlipBinormal(flip: Boolean): Unit {
    Internals.writeArguments(BOOL to flip)
    Internals.callMethod(rawPtr, MethodBindings.setHeightmapDeepParallaxFlipBinormalPtr, NIL)
  }

  public final fun getHeightmapDeepParallaxFlipBinormal(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getHeightmapDeepParallaxFlipBinormalPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setGrow(amount: Float): Unit {
    Internals.writeArguments(DOUBLE to amount.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setGrowPtr, NIL)
  }

  public final fun getGrow(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getGrowPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setEmissionOperator(`operator`: EmissionOperator): Unit {
    Internals.writeArguments(LONG to `operator`.id)
    Internals.callMethod(rawPtr, MethodBindings.setEmissionOperatorPtr, NIL)
  }

  public final fun getEmissionOperator(): EmissionOperator {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEmissionOperatorPtr, LONG)
    return BaseMaterial3D.EmissionOperator.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setAoLightAffect(amount: Float): Unit {
    Internals.writeArguments(DOUBLE to amount.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setAoLightAffectPtr, NIL)
  }

  public final fun getAoLightAffect(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAoLightAffectPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAlphaScissorThreshold(threshold: Float): Unit {
    Internals.writeArguments(DOUBLE to threshold.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setAlphaScissorThresholdPtr, NIL)
  }

  public final fun getAlphaScissorThreshold(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAlphaScissorThresholdPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAlphaHashScale(threshold: Float): Unit {
    Internals.writeArguments(DOUBLE to threshold.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setAlphaHashScalePtr, NIL)
  }

  public final fun getAlphaHashScale(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAlphaHashScalePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setGrowEnabled(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setGrowEnabledPtr, NIL)
  }

  public final fun isGrowEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isGrowEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setMetallicTextureChannel(channel: TextureChannel): Unit {
    Internals.writeArguments(LONG to channel.id)
    Internals.callMethod(rawPtr, MethodBindings.setMetallicTextureChannelPtr, NIL)
  }

  public final fun getMetallicTextureChannel(): TextureChannel {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMetallicTextureChannelPtr, LONG)
    return BaseMaterial3D.TextureChannel.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setRoughnessTextureChannel(channel: TextureChannel): Unit {
    Internals.writeArguments(LONG to channel.id)
    Internals.callMethod(rawPtr, MethodBindings.setRoughnessTextureChannelPtr, NIL)
  }

  public final fun getRoughnessTextureChannel(): TextureChannel {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRoughnessTextureChannelPtr, LONG)
    return BaseMaterial3D.TextureChannel.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setAoTextureChannel(channel: TextureChannel): Unit {
    Internals.writeArguments(LONG to channel.id)
    Internals.callMethod(rawPtr, MethodBindings.setAoTextureChannelPtr, NIL)
  }

  public final fun getAoTextureChannel(): TextureChannel {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAoTextureChannelPtr, LONG)
    return BaseMaterial3D.TextureChannel.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setRefractionTextureChannel(channel: TextureChannel): Unit {
    Internals.writeArguments(LONG to channel.id)
    Internals.callMethod(rawPtr, MethodBindings.setRefractionTextureChannelPtr, NIL)
  }

  public final fun getRefractionTextureChannel(): TextureChannel {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRefractionTextureChannelPtr, LONG)
    return BaseMaterial3D.TextureChannel.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setProximityFadeEnabled(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setProximityFadeEnabledPtr, NIL)
  }

  public final fun isProximityFadeEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isProximityFadeEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setProximityFadeDistance(distance: Float): Unit {
    Internals.writeArguments(DOUBLE to distance.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setProximityFadeDistancePtr, NIL)
  }

  public final fun getProximityFadeDistance(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getProximityFadeDistancePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setMsdfPixelRange(range: Float): Unit {
    Internals.writeArguments(DOUBLE to range.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setMsdfPixelRangePtr, NIL)
  }

  public final fun getMsdfPixelRange(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMsdfPixelRangePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setMsdfOutlineSize(size: Float): Unit {
    Internals.writeArguments(DOUBLE to size.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setMsdfOutlineSizePtr, NIL)
  }

  public final fun getMsdfOutlineSize(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMsdfOutlineSizePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDistanceFade(mode: DistanceFadeMode): Unit {
    Internals.writeArguments(LONG to mode.id)
    Internals.callMethod(rawPtr, MethodBindings.setDistanceFadePtr, NIL)
  }

  public final fun getDistanceFade(): DistanceFadeMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDistanceFadePtr, LONG)
    return BaseMaterial3D.DistanceFadeMode.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setDistanceFadeMaxDistance(distance: Float): Unit {
    Internals.writeArguments(DOUBLE to distance.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setDistanceFadeMaxDistancePtr, NIL)
  }

  public final fun getDistanceFadeMaxDistance(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDistanceFadeMaxDistancePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDistanceFadeMinDistance(distance: Float): Unit {
    Internals.writeArguments(DOUBLE to distance.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setDistanceFadeMinDistancePtr, NIL)
  }

  public final fun getDistanceFadeMinDistance(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDistanceFadeMinDistancePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public enum class TextureParam(
    id: Long,
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
     * Represents the size of the [TextureParam] enum.
     */
    TEXTURE_MAX(18),
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
     * The texture filter reads from the nearest pixel only. This makes the texture look pixelated
     * from up close, and grainy from a distance (due to mipmaps not being sampled).
     */
    TEXTURE_FILTER_NEAREST(0),
    /**
     * The texture filter blends between the nearest 4 pixels. This makes the texture look smooth
     * from up close, and grainy from a distance (due to mipmaps not being sampled).
     */
    TEXTURE_FILTER_LINEAR(1),
    /**
     * The texture filter reads from the nearest pixel and blends between the nearest 2 mipmaps (or
     * uses the nearest mipmap if
     * [ProjectSettings.rendering/textures/defaultFilters/useNearestMipmapFilter] is `true`). This
     * makes the texture look pixelated from up close, and smooth from a distance.
     */
    TEXTURE_FILTER_NEAREST_WITH_MIPMAPS(2),
    /**
     * The texture filter blends between the nearest 4 pixels and between the nearest 2 mipmaps (or
     * uses the nearest mipmap if
     * [ProjectSettings.rendering/textures/defaultFilters/useNearestMipmapFilter] is `true`). This
     * makes the texture look smooth from up close, and smooth from a distance.
     */
    TEXTURE_FILTER_LINEAR_WITH_MIPMAPS(3),
    /**
     * The texture filter reads from the nearest pixel and blends between 2 mipmaps (or uses the
     * nearest mipmap if [ProjectSettings.rendering/textures/defaultFilters/useNearestMipmapFilter] is
     * `true`) based on the angle between the surface and the camera view. This makes the texture look
     * pixelated from up close, and smooth from a distance. Anisotropic filtering improves texture
     * quality on surfaces that are almost in line with the camera, but is slightly slower. The
     * anisotropic filtering level can be changed by adjusting
     * [ProjectSettings.rendering/textures/defaultFilters/anisotropicFilteringLevel].
     */
    TEXTURE_FILTER_NEAREST_WITH_MIPMAPS_ANISOTROPIC(4),
    /**
     * The texture filter blends between the nearest 4 pixels and blends between 2 mipmaps (or uses
     * the nearest mipmap if [ProjectSettings.rendering/textures/defaultFilters/useNearestMipmapFilter]
     * is `true`) based on the angle between the surface and the camera view. This makes the texture
     * look smooth from up close, and smooth from a distance. Anisotropic filtering improves texture
     * quality on surfaces that are almost in line with the camera, but is slightly slower. The
     * anisotropic filtering level can be changed by adjusting
     * [ProjectSettings.rendering/textures/defaultFilters/anisotropicFilteringLevel].
     */
    TEXTURE_FILTER_LINEAR_WITH_MIPMAPS_ANISOTROPIC(5),
    /**
     * Represents the size of the [TextureFilter] enum.
     */
    TEXTURE_FILTER_MAX(6),
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
    TRANSPARENCY_DISABLED(0),
    /**
     * The material will use the texture's alpha values for transparency. This is the slowest to
     * render, and disables shadow casting.
     */
    TRANSPARENCY_ALPHA(1),
    /**
     * The material will cut off all values below a threshold, the rest will remain opaque. The
     * opaque portions will be rendered in the depth prepass. This is faster to render than alpha
     * blending, but slower than opaque rendering. This also supports casting shadows.
     */
    TRANSPARENCY_ALPHA_SCISSOR(2),
    /**
     * The material will cut off all values below a spatially-deterministic threshold, the rest will
     * remain opaque. This is faster to render than alpha blending, but slower than opaque rendering.
     * This also supports casting shadows. Alpha hashing is suited for hair rendering.
     */
    TRANSPARENCY_ALPHA_HASH(3),
    /**
     * The material will use the texture's alpha value for transparency, but will discard fragments
     * with an alpha of less than 0.99 during the depth prepass and fragments with an alpha less than
     * 0.1 during the shadow pass. This also supports casting shadows.
     */
    TRANSPARENCY_ALPHA_DEPTH_PRE_PASS(4),
    /**
     * Represents the size of the [Transparency] enum.
     */
    TRANSPARENCY_MAX(5),
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
     * The object will not receive shadows. This is the fastest to render, but it disables all
     * interactions with lights.
     */
    SHADING_MODE_UNSHADED(0),
    /**
     * The object will be shaded per pixel. Useful for realistic shading effects.
     */
    SHADING_MODE_PER_PIXEL(1),
    /**
     * The object will be shaded per vertex. Useful when you want cheaper shaders and do not care
     * about visual quality. Not implemented yet (this mode will act like [SHADING_MODE_PER_PIXEL]).
     */
    SHADING_MODE_PER_VERTEX(2),
    /**
     * Represents the size of the [ShadingMode] enum.
     */
    SHADING_MODE_MAX(3),
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
     * Represents the size of the [Feature] enum.
     */
    FEATURE_MAX(12),
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
     * Default blend mode. The color of the object is blended over the background based on the
     * object's alpha value.
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
    /**
     * The color of the object is added to the background and the alpha channel is used to mask out
     * the background. This is effectively a hybrid of the blend mix and add modes, useful for effects
     * like fire where you want the flame to add but the smoke to mix. By default, this works with
     * unshaded materials using premultiplied textures. For shaded materials, use the
     * `PREMUL_ALPHA_FACTOR` built-in so that lighting can be modulated as well.
     */
    BLEND_MODE_PREMULT_ALPHA(4),
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
    ALPHA_ANTIALIASING_OFF(0),
    /**
     * Enables AlphaToCoverage. Alpha values in the material are passed to the AntiAliasing sample
     * mask.
     */
    ALPHA_ANTIALIASING_ALPHA_TO_COVERAGE(1),
    /**
     * Enables AlphaToCoverage and forces all non-zero alpha values to `1`. Alpha values in the
     * material are passed to the AntiAliasing sample mask.
     */
    ALPHA_ANTIALIASING_ALPHA_TO_COVERAGE_AND_TO_ONE(2),
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
     * Default depth draw mode. Depth is drawn only for opaque objects during the opaque prepass (if
     * any) and during the opaque pass.
     */
    DEPTH_DRAW_OPAQUE_ONLY(0),
    /**
     * Objects will write to depth during the opaque and the transparent passes. Transparent objects
     * that are close to the camera may obscure other transparent objects behind them.
     * **Note:** This does not influence whether transparent objects are included in the depth
     * prepass or not. For that, see [Transparency].
     */
    DEPTH_DRAW_ALWAYS(1),
    /**
     * Objects will not write their depth to the depth buffer, even during the depth prepass (if
     * enabled).
     */
    DEPTH_DRAW_DISABLED(2),
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
     * Default cull mode. The back of the object is culled when not visible. Back face triangles
     * will be culled when facing the camera. This results in only the front side of triangles being
     * drawn. For closed-surface meshes, this means that only the exterior of the mesh will be visible.
     */
    CULL_BACK(0),
    /**
     * Front face triangles will be culled when facing the camera. This results in only the back
     * side of triangles being drawn. For closed-surface meshes, this means that the interior of the
     * mesh will be drawn instead of the exterior.
     */
    CULL_FRONT(1),
    /**
     * No face culling is performed; both the front face and back face will be visible.
     */
    CULL_DISABLED(2),
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
     * Disables the depth test, so this object is drawn on top of all others drawn before it. This
     * puts the object in the transparent draw pass where it is sorted based on distance to camera.
     * Objects drawn after it in the draw order may cover it. This also disables writing to depth.
     */
    FLAG_DISABLE_DEPTH_TEST(0),
    /**
     * Set `ALBEDO` to the per-vertex color specified in the mesh.
     */
    FLAG_ALBEDO_FROM_VERTEX_COLOR(1),
    /**
     * Vertex colors are considered to be stored in sRGB color space and are converted to linear
     * color space during rendering. See also [vertexColorIsSrgb].
     * **Note:** Only effective when using the Forward+ and Mobile rendering methods.
     */
    FLAG_SRGB_VERTEX_COLOR(2),
    /**
     * Uses point size to alter the size of primitive points. Also changes the albedo texture lookup
     * to use `POINT_COORD` instead of `UV`.
     */
    FLAG_USE_POINT_SIZE(3),
    /**
     * Object is scaled by depth so that it always appears the same size on screen.
     */
    FLAG_FIXED_SIZE(4),
    /**
     * Shader will keep the scale set for the mesh. Otherwise the scale is lost when billboarding.
     * Only applies when [billboardMode] is [BILLBOARD_ENABLED].
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
     * Forces the shader to convert albedo from sRGB space to linear space. See also
     * [albedoTextureForceSrgb].
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
     * Enables the texture to repeat when UV coordinates are outside the 0-1 range. If using one of
     * the linear filtering modes, this can result in artifacts at the edges of a texture when the
     * sampler filters across the edges of the texture.
     */
    FLAG_USE_TEXTURE_REPEAT(16),
    /**
     * Invert values read from a depth texture to convert them to height values (heightmap).
     */
    FLAG_INVERT_HEIGHTMAP(17),
    /**
     * Enables the skin mode for subsurface scattering which is used to improve the look of
     * subsurface scattering when used for human skin.
     */
    FLAG_SUBSURFACE_MODE_SKIN(18),
    /**
     * Enables parts of the shader required for [GPUParticles3D] trails to function. This also
     * requires using a mesh with appropriate skinning, such as [RibbonTrailMesh] or [TubeTrailMesh].
     * Enabling this feature outside of materials used in [GPUParticles3D] meshes will break material
     * rendering.
     */
    FLAG_PARTICLE_TRAILS_MODE(19),
    /**
     * Enables multichannel signed distance field rendering shader.
     */
    FLAG_ALBEDO_TEXTURE_MSDF(20),
    /**
     * Disables receiving depth-based or volumetric fog.
     */
    FLAG_DISABLE_FOG(21),
    /**
     * Represents the size of the [Flags] enum.
     */
    FLAG_MAX(22),
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
      public fun from(`value`: Long): DiffuseMode = entries.single { it.id == `value` }
    }
  }

  public enum class SpecularMode(
    id: Long,
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
     * No specular blob. This is slightly faster to render than other specular modes.
     */
    SPECULAR_DISABLED(2),
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
     * Used for particle systems when assigned to [GPUParticles3D] and [CPUParticles3D] nodes
     * (flipbook animation). Enables `particles_anim_*` properties.
     * The [ParticleProcessMaterial.animSpeedMin] or [CPUParticles3D.animSpeedMin] should also be
     * set to a value bigger than zero for the animation to play.
     */
    BILLBOARD_PARTICLES(3),
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
     * Used to read from the linear (non-perceptual) average of the red, green and blue channels of
     * a texture.
     */
    TEXTURE_CHANNEL_GRAYSCALE(4),
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
      public fun from(`value`: Long): EmissionOperator = entries.single { it.id == `value` }
    }
  }

  public enum class DistanceFadeMode(
    id: Long,
  ) {
    /**
     * Do not use distance fade.
     */
    DISTANCE_FADE_DISABLED(0),
    /**
     * Smoothly fades the object out based on each pixel's distance from the camera using the alpha
     * channel.
     */
    DISTANCE_FADE_PIXEL_ALPHA(1),
    /**
     * Smoothly fades the object out based on each pixel's distance from the camera using a
     * dithering approach. Dithering discards pixels based on a set pattern to smoothly fade without
     * enabling transparency. On certain hardware, this can be faster than [DISTANCE_FADE_PIXEL_ALPHA].
     */
    DISTANCE_FADE_PIXEL_DITHER(2),
    /**
     * Smoothly fades the object out based on the object's distance from the camera using a
     * dithering approach. Dithering discards pixels based on a set pattern to smoothly fade without
     * enabling transparency. On certain hardware, this can be faster than [DISTANCE_FADE_PIXEL_ALPHA]
     * and [DISTANCE_FADE_PIXEL_DITHER].
     */
    DISTANCE_FADE_OBJECT_DITHER(3),
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

  internal object MethodBindings {
    public val setAlbedoPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_albedo", 2920490490)

    public val getAlbedoPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_albedo", 3444240500)

    public val setTransparencyPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_transparency", 3435651667)

    public val getTransparencyPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_transparency", 990903061)

    public val setAlphaAntialiasingPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_alpha_antialiasing", 3212649852)

    public val getAlphaAntialiasingPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_alpha_antialiasing", 2889939400)

    public val setAlphaAntialiasingEdgePtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_alpha_antialiasing_edge", 373806689)

    public val getAlphaAntialiasingEdgePtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_alpha_antialiasing_edge", 1740695150)

    public val setShadingModePtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_shading_mode", 3368750322)

    public val getShadingModePtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_shading_mode", 2132070559)

    public val setSpecularPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_specular", 373806689)

    public val getSpecularPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_specular", 1740695150)

    public val setMetallicPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_metallic", 373806689)

    public val getMetallicPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_metallic", 1740695150)

    public val setRoughnessPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_roughness", 373806689)

    public val getRoughnessPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_roughness", 1740695150)

    public val setEmissionPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_emission", 2920490490)

    public val getEmissionPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_emission", 3444240500)

    public val setEmissionEnergyMultiplierPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_emission_energy_multiplier", 373806689)

    public val getEmissionEnergyMultiplierPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_emission_energy_multiplier", 1740695150)

    public val setEmissionIntensityPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_emission_intensity", 373806689)

    public val getEmissionIntensityPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_emission_intensity", 1740695150)

    public val setNormalScalePtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_normal_scale", 373806689)

    public val getNormalScalePtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_normal_scale", 1740695150)

    public val setRimPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_rim", 373806689)

    public val getRimPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_rim", 1740695150)

    public val setRimTintPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_rim_tint", 373806689)

    public val getRimTintPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_rim_tint", 1740695150)

    public val setClearcoatPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_clearcoat", 373806689)

    public val getClearcoatPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_clearcoat", 1740695150)

    public val setClearcoatRoughnessPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_clearcoat_roughness", 373806689)

    public val getClearcoatRoughnessPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_clearcoat_roughness", 1740695150)

    public val setAnisotropyPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_anisotropy", 373806689)

    public val getAnisotropyPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_anisotropy", 1740695150)

    public val setHeightmapScalePtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_heightmap_scale", 373806689)

    public val getHeightmapScalePtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_heightmap_scale", 1740695150)

    public val setSubsurfaceScatteringStrengthPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_subsurface_scattering_strength", 373806689)

    public val getSubsurfaceScatteringStrengthPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_subsurface_scattering_strength", 1740695150)

    public val setTransmittanceColorPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_transmittance_color", 2920490490)

    public val getTransmittanceColorPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_transmittance_color", 3444240500)

    public val setTransmittanceDepthPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_transmittance_depth", 373806689)

    public val getTransmittanceDepthPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_transmittance_depth", 1740695150)

    public val setTransmittanceBoostPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_transmittance_boost", 373806689)

    public val getTransmittanceBoostPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_transmittance_boost", 1740695150)

    public val setBacklightPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_backlight", 2920490490)

    public val getBacklightPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_backlight", 3444240500)

    public val setRefractionPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_refraction", 373806689)

    public val getRefractionPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_refraction", 1740695150)

    public val setPointSizePtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_point_size", 373806689)

    public val getPointSizePtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_point_size", 1740695150)

    public val setDetailUvPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_detail_uv", 456801921)

    public val getDetailUvPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_detail_uv", 2306920512)

    public val setBlendModePtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_blend_mode", 2830186259)

    public val getBlendModePtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_blend_mode", 4022690962)

    public val setDepthDrawModePtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_depth_draw_mode", 1456584748)

    public val getDepthDrawModePtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_depth_draw_mode", 2578197639)

    public val setCullModePtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_cull_mode", 2338909218)

    public val getCullModePtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_cull_mode", 1941499586)

    public val setDiffuseModePtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_diffuse_mode", 1045299638)

    public val getDiffuseModePtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_diffuse_mode", 3973617136)

    public val setSpecularModePtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_specular_mode", 584737147)

    public val getSpecularModePtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_specular_mode", 2569953298)

    public val setFlagPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_flag", 3070159527)

    public val getFlagPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_flag", 1286410065)

    public val setTextureFilterPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_texture_filter", 22904437)

    public val getTextureFilterPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_texture_filter", 3289213076)

    public val setFeaturePtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_feature", 2819288693)

    public val getFeaturePtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_feature", 1965241794)

    public val setTexturePtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_texture", 464208135)

    public val getTexturePtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_texture", 329605813)

    public val setDetailBlendModePtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_detail_blend_mode", 2830186259)

    public val getDetailBlendModePtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_detail_blend_mode", 4022690962)

    public val setUv1ScalePtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_uv1_scale", 3460891852)

    public val getUv1ScalePtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_uv1_scale", 3360562783)

    public val setUv1OffsetPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_uv1_offset", 3460891852)

    public val getUv1OffsetPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_uv1_offset", 3360562783)

    public val setUv1TriplanarBlendSharpnessPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_uv1_triplanar_blend_sharpness", 373806689)

    public val getUv1TriplanarBlendSharpnessPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_uv1_triplanar_blend_sharpness", 1740695150)

    public val setUv2ScalePtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_uv2_scale", 3460891852)

    public val getUv2ScalePtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_uv2_scale", 3360562783)

    public val setUv2OffsetPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_uv2_offset", 3460891852)

    public val getUv2OffsetPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_uv2_offset", 3360562783)

    public val setUv2TriplanarBlendSharpnessPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_uv2_triplanar_blend_sharpness", 373806689)

    public val getUv2TriplanarBlendSharpnessPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_uv2_triplanar_blend_sharpness", 1740695150)

    public val setBillboardModePtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_billboard_mode", 4202036497)

    public val getBillboardModePtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_billboard_mode", 1283840139)

    public val setParticlesAnimHFramesPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_particles_anim_h_frames", 1286410249)

    public val getParticlesAnimHFramesPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_particles_anim_h_frames", 3905245786)

    public val setParticlesAnimVFramesPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_particles_anim_v_frames", 1286410249)

    public val getParticlesAnimVFramesPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_particles_anim_v_frames", 3905245786)

    public val setParticlesAnimLoopPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_particles_anim_loop", 2586408642)

    public val getParticlesAnimLoopPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_particles_anim_loop", 36873697)

    public val setHeightmapDeepParallaxPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_heightmap_deep_parallax", 2586408642)

    public val isHeightmapDeepParallaxEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "is_heightmap_deep_parallax_enabled", 36873697)

    public val setHeightmapDeepParallaxMinLayersPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_heightmap_deep_parallax_min_layers", 1286410249)

    public val getHeightmapDeepParallaxMinLayersPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_heightmap_deep_parallax_min_layers", 3905245786)

    public val setHeightmapDeepParallaxMaxLayersPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_heightmap_deep_parallax_max_layers", 1286410249)

    public val getHeightmapDeepParallaxMaxLayersPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_heightmap_deep_parallax_max_layers", 3905245786)

    public val setHeightmapDeepParallaxFlipTangentPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_heightmap_deep_parallax_flip_tangent", 2586408642)

    public val getHeightmapDeepParallaxFlipTangentPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_heightmap_deep_parallax_flip_tangent", 36873697)

    public val setHeightmapDeepParallaxFlipBinormalPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_heightmap_deep_parallax_flip_binormal", 2586408642)

    public val getHeightmapDeepParallaxFlipBinormalPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_heightmap_deep_parallax_flip_binormal", 36873697)

    public val setGrowPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_grow", 373806689)

    public val getGrowPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_grow", 1740695150)

    public val setEmissionOperatorPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_emission_operator", 3825128922)

    public val getEmissionOperatorPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_emission_operator", 974205018)

    public val setAoLightAffectPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_ao_light_affect", 373806689)

    public val getAoLightAffectPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_ao_light_affect", 1740695150)

    public val setAlphaScissorThresholdPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_alpha_scissor_threshold", 373806689)

    public val getAlphaScissorThresholdPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_alpha_scissor_threshold", 1740695150)

    public val setAlphaHashScalePtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_alpha_hash_scale", 373806689)

    public val getAlphaHashScalePtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_alpha_hash_scale", 1740695150)

    public val setGrowEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_grow_enabled", 2586408642)

    public val isGrowEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "is_grow_enabled", 36873697)

    public val setMetallicTextureChannelPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_metallic_texture_channel", 744167988)

    public val getMetallicTextureChannelPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_metallic_texture_channel", 568133867)

    public val setRoughnessTextureChannelPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_roughness_texture_channel", 744167988)

    public val getRoughnessTextureChannelPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_roughness_texture_channel", 568133867)

    public val setAoTextureChannelPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_ao_texture_channel", 744167988)

    public val getAoTextureChannelPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_ao_texture_channel", 568133867)

    public val setRefractionTextureChannelPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_refraction_texture_channel", 744167988)

    public val getRefractionTextureChannelPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_refraction_texture_channel", 568133867)

    public val setProximityFadeEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_proximity_fade_enabled", 2586408642)

    public val isProximityFadeEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "is_proximity_fade_enabled", 36873697)

    public val setProximityFadeDistancePtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_proximity_fade_distance", 373806689)

    public val getProximityFadeDistancePtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_proximity_fade_distance", 1740695150)

    public val setMsdfPixelRangePtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_msdf_pixel_range", 373806689)

    public val getMsdfPixelRangePtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_msdf_pixel_range", 1740695150)

    public val setMsdfOutlineSizePtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_msdf_outline_size", 373806689)

    public val getMsdfOutlineSizePtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_msdf_outline_size", 1740695150)

    public val setDistanceFadePtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_distance_fade", 1379478617)

    public val getDistanceFadePtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_distance_fade", 2694575734)

    public val setDistanceFadeMaxDistancePtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_distance_fade_max_distance", 373806689)

    public val getDistanceFadeMaxDistancePtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_distance_fade_max_distance", 1740695150)

    public val setDistanceFadeMinDistancePtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "set_distance_fade_min_distance", 373806689)

    public val getDistanceFadeMinDistancePtr: VoidPtr =
        Internals.getMethodBindPtr("BaseMaterial3D", "get_distance_fade_min_distance", 1740695150)
  }
}
