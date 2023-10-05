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
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
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
   * The material's transparency mode. Some transparency modes will disable shadow casting. Any transparency mode other than [TRANSPARENCY_DISABLED] has a greater performance impact compared to opaque rendering. See also [blendMode].
   */
  public var transparency: Transparency
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_TRANSPARENCY,
          LONG)
      return BaseMaterial3D.Transparency.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_TRANSPARENCY,
          NIL)
    }

  /**
   * Threshold at which the alpha scissor will discard values. Higher values will result in more pixels being discarded. If the material becomes too opaque at a distance, try increasing [alphaScissorThreshold]. If the material disappears at a distance, try decreasing [alphaScissorThreshold].
   */
  public var alphaScissorThreshold: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_ALPHA_SCISSOR_THRESHOLD, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_ALPHA_SCISSOR_THRESHOLD, NIL)
    }

  /**
   * The hashing scale for Alpha Hash. Recommended values between `0` and `2`.
   */
  public var alphaHashScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_ALPHA_HASH_SCALE, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_ALPHA_HASH_SCALE, NIL)
    }

  /**
   * The type of alpha antialiasing to apply. See [enum AlphaAntiAliasing].
   */
  public var alphaAntialiasingMode: AlphaAntiAliasing
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_ALPHA_ANTIALIASING, LONG)
      return BaseMaterial3D.AlphaAntiAliasing.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_ALPHA_ANTIALIASING, NIL)
    }

  /**
   * Threshold at which antialiasing will be applied on the alpha channel.
   */
  public var alphaAntialiasingEdge: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_ALPHA_ANTIALIASING_EDGE, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_ALPHA_ANTIALIASING_EDGE, NIL)
    }

  /**
   * The material's blend mode.
   *
   * **Note:** Values other than `Mix` force the object into the transparent pipeline. See [enum BlendMode].
   */
  public var blendMode: BlendMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_BLEND_MODE,
          LONG)
      return BaseMaterial3D.BlendMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_BLEND_MODE,
          NIL)
    }

  /**
   * Determines which side of the triangle to cull depending on whether the triangle faces towards or away from the camera. See [enum CullMode].
   */
  public var cullMode: CullMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_CULL_MODE,
          LONG)
      return BaseMaterial3D.CullMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_CULL_MODE, NIL)
    }

  /**
   * Determines when depth rendering takes place. See [enum DepthDrawMode]. See also [transparency].
   */
  public var depthDrawMode: DepthDrawMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_DEPTH_DRAW_MODE, LONG)
      return BaseMaterial3D.DepthDrawMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_DEPTH_DRAW_MODE, NIL)
    }

  /**
   * If `true`, depth testing is disabled and the object will be drawn in render order.
   */
  public var noDepthTest: Boolean
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_FLAG, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_FLAG, NIL)
    }

  /**
   * Sets whether the shading takes place, per-pixel, per-vertex or unshaded. Per-vertex lighting is faster, making it the best choice for mobile applications, however it looks considerably worse than per-pixel. Unshaded rendering is the fastest, but disables all interactions with lights.
   *
   * **Note:** Setting the shading mode vertex shading currently has no effect, as vertex shading is not implemented yet.
   */
  public var shadingMode: ShadingMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_SHADING_MODE,
          LONG)
      return BaseMaterial3D.ShadingMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_SHADING_MODE,
          NIL)
    }

  /**
   * The algorithm used for diffuse light scattering. See [enum DiffuseMode].
   */
  public var diffuseMode: DiffuseMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_DIFFUSE_MODE,
          LONG)
      return BaseMaterial3D.DiffuseMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_DIFFUSE_MODE,
          NIL)
    }

  /**
   * The method for rendering the specular blob. See [enum SpecularMode].
   *
   * **Note:** [specularMode] only applies to the specular blob. It does not affect specular reflections from the sky, screen-space reflections, [godot.VoxelGI], SDFGI or [godot.ReflectionProbe]s. To disable reflections from these sources as well, set [metallicSpecular] to `0.0` instead.
   */
  public var specularMode: SpecularMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_SPECULAR_MODE,
          LONG)
      return BaseMaterial3D.SpecularMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_SPECULAR_MODE,
          NIL)
    }

  /**
   * If `true`, the object receives no ambient light.
   */
  public var disableAmbientLight: Boolean
    get() {
      TransferContext.writeArguments(LONG to 14L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_FLAG, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 14L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_FLAG, NIL)
    }

  /**
   * If `true`, the vertex color is used as albedo color.
   */
  public var vertexColorUseAsAlbedo: Boolean
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_FLAG, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_FLAG, NIL)
    }

  /**
   * If `true`, vertex colors are considered to be stored in sRGB color space and are converted to linear color space during rendering. If `false`, vertex colors are considered to be stored in linear color space and are rendered as-is. See also [albedoTextureForceSrgb].
   *
   * **Note:** Only effective when using the Forward+ and Mobile rendering methods, not Compatibility.
   */
  public var vertexColorIsSrgb: Boolean
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_FLAG, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_FLAG, NIL)
    }

  /**
   * The material's base color.
   *
   * **Note:** If [detailEnabled] is `true` and a [detailAlbedo] texture is specified, [albedoColor] will *not* modulate the detail texture. This can be used to color partial areas of a material by not specifying an albedo texture and using a transparent [detailAlbedo] texture instead.
   */
  @CoreTypeLocalCopy
  public var albedoColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_ALBEDO, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_ALBEDO, NIL)
    }

  /**
   * Texture to multiply by [albedoColor]. Used for basic texturing of objects.
   *
   * If the texture appears unexpectedly too dark or too bright, check [albedoTextureForceSrgb].
   */
  public var albedoTexture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_TEXTURE,
          OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_TEXTURE, NIL)
    }

  /**
   * If `true`, forces a conversion of the [albedoTexture] from sRGB color space to linear color space. See also [vertexColorIsSrgb].
   *
   * This should only be enabled when needed (typically when using a [godot.ViewportTexture] as [albedoTexture]). If [albedoTextureForceSrgb] is `true` when it shouldn't be, the texture will appear to be too dark. If [albedoTextureForceSrgb] is `false` when it shouldn't be, the texture will appear to be too bright.
   */
  public var albedoTextureForceSrgb: Boolean
    get() {
      TransferContext.writeArguments(LONG to 12L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_FLAG, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 12L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_FLAG, NIL)
    }

  /**
   * Enables multichannel signed distance field rendering shader. Use [msdfPixelRange] and [msdfOutlineSize] to configure MSDF parameters.
   */
  public var albedoTextureMsdf: Boolean
    get() {
      TransferContext.writeArguments(LONG to 20L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_FLAG, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 20L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_FLAG, NIL)
    }

  /**
   * The Occlusion/Roughness/Metallic texture to use. This is a more efficient replacement of [aoTexture], [roughnessTexture] and [metallicTexture] in [godot.ORMMaterial3D]. Ambient occlusion is stored in the red channel. Roughness map is stored in the green channel. Metallic map is stored in the blue channel. The alpha channel is ignored.
   */
  public var ormTexture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 17L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_TEXTURE,
          OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 17L, OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_TEXTURE, NIL)
    }

  /**
   * A high value makes the material appear more like a metal. Non-metals use their albedo as the diffuse color and add diffuse to the specular reflection. With non-metals, the reflection appears on top of the albedo color. Metals use their albedo as a multiplier to the specular reflection and set the diffuse color to black resulting in a tinted reflection. Materials work better when fully metal or fully non-metal, values between `0` and `1` should only be used for blending between metal and non-metal sections. To alter the amount of reflection use [roughness].
   */
  public var metallic: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_METALLIC,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_METALLIC, NIL)
    }

  /**
   * Adjusts the strength of specular reflections. Specular reflections are composed of scene reflections and the specular lobe which is the bright spot that is reflected from light sources. When set to `0.0`, no specular reflections will be visible. This differs from the [SPECULAR_DISABLED] [enum SpecularMode] as [SPECULAR_DISABLED] only applies to the specular lobe from the light source.
   *
   * **Note:** Unlike [metallic], this is not energy-conserving, so it should be left at `0.5` in most cases. See also [roughness].
   */
  public var metallicSpecular: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_SPECULAR,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_SPECULAR, NIL)
    }

  /**
   * Texture used to specify metallic for an object. This is multiplied by [metallic].
   */
  public var metallicTexture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_TEXTURE,
          OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_TEXTURE, NIL)
    }

  /**
   * Specifies the channel of the [metallicTexture] in which the metallic information is stored. This is useful when you store the information for multiple effects in a single texture. For example if you stored metallic in the red channel, roughness in the blue, and ambient occlusion in the green you could reduce the number of textures you use.
   */
  public var metallicTextureChannel: TextureChannel
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_METALLIC_TEXTURE_CHANNEL, LONG)
      return BaseMaterial3D.TextureChannel.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_METALLIC_TEXTURE_CHANNEL, NIL)
    }

  /**
   * Surface reflection. A value of `0` represents a perfect mirror while a value of `1` completely blurs the reflection. See also [metallic].
   */
  public var roughness: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_ROUGHNESS,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_ROUGHNESS, NIL)
    }

  /**
   * Texture used to control the roughness per-pixel. Multiplied by [roughness].
   */
  public var roughnessTexture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_TEXTURE,
          OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_TEXTURE, NIL)
    }

  /**
   * Specifies the channel of the [roughnessTexture] in which the roughness information is stored. This is useful when you store the information for multiple effects in a single texture. For example if you stored metallic in the red channel, roughness in the blue, and ambient occlusion in the green you could reduce the number of textures you use.
   */
  public var roughnessTextureChannel: TextureChannel
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_ROUGHNESS_TEXTURE_CHANNEL, LONG)
      return BaseMaterial3D.TextureChannel.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_ROUGHNESS_TEXTURE_CHANNEL, NIL)
    }

  /**
   * If `true`, the body emits light. Emitting light makes the object appear brighter. The object can also cast light on other objects if a [godot.VoxelGI], SDFGI, or [godot.LightmapGI] is used and this object is used in baked lighting.
   */
  public var emissionEnabled: Boolean
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_FEATURE, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_FEATURE, NIL)
    }

  /**
   * The emitted light's color. See [emissionEnabled].
   */
  @CoreTypeLocalCopy
  public var emission: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_EMISSION,
          COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_EMISSION, NIL)
    }

  /**
   * Multiplier for emitted light. See [emissionEnabled].
   */
  public var emissionEnergyMultiplier: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_EMISSION_ENERGY_MULTIPLIER, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_EMISSION_ENERGY_MULTIPLIER, NIL)
    }

  /**
   * Luminance of emitted light, measured in nits (candela per square meter). Only available when [godot.ProjectSettings.rendering/lightsAndShadows/usePhysicalLightUnits] is enabled. The default is roughly equivalent to an indoor lightbulb.
   */
  public var emissionIntensity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_EMISSION_INTENSITY, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_EMISSION_INTENSITY, NIL)
    }

  /**
   * Sets how [emission] interacts with [emissionTexture]. Can either add or multiply. See [enum EmissionOperator] for options.
   */
  public var emissionOperator: EmissionOperator
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_EMISSION_OPERATOR, LONG)
      return BaseMaterial3D.EmissionOperator.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_EMISSION_OPERATOR, NIL)
    }

  /**
   * Use `UV2` to read from the [emissionTexture].
   */
  public var emissionOnUv2: Boolean
    get() {
      TransferContext.writeArguments(LONG to 11L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_FLAG, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 11L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_FLAG, NIL)
    }

  /**
   * Texture that specifies how much surface emits light at a given point.
   */
  public var emissionTexture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_TEXTURE,
          OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_TEXTURE, NIL)
    }

  /**
   * If `true`, normal mapping is enabled. This has a slight performance cost, especially on mobile GPUs.
   */
  public var normalEnabled: Boolean
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_FEATURE, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_FEATURE, NIL)
    }

  /**
   * The strength of the normal map's effect.
   */
  public var normalScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_NORMAL_SCALE,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_NORMAL_SCALE,
          NIL)
    }

  /**
   * Texture used to specify the normal at a given pixel. The [normalTexture] only uses the red and green channels; the blue and alpha channels are ignored. The normal read from [normalTexture] is oriented around the surface normal provided by the [godot.Mesh].
   *
   * **Note:** The mesh must have both normals and tangents defined in its vertex data. Otherwise, the normal map won't render correctly and will only appear to darken the whole surface. If creating geometry with [godot.SurfaceTool], you can use [godot.SurfaceTool.generateNormals] and [godot.SurfaceTool.generateTangents] to automatically generate normals and tangents respectively.
   *
   * **Note:** Godot expects the normal map to use X+, Y+, and Z+ coordinates. See [this page](http://wiki.polycount.com/wiki/Normal_Map_Technical_Details#Common_Swizzle_Coordinates) for a comparison of normal map coordinates expected by popular engines.
   *
   * **Note:** If [detailEnabled] is `true`, the [detailAlbedo] texture is drawn *below* the [normalTexture]. To display a normal map *above* the [detailAlbedo] texture, use [detailNormal] instead.
   */
  public var normalTexture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 4L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_TEXTURE,
          OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 4L, OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_TEXTURE, NIL)
    }

  /**
   * If `true`, rim effect is enabled. Rim lighting increases the brightness at glancing angles on an object.
   *
   * **Note:** Rim lighting is not visible if the material's [shadingMode] is [SHADING_MODE_UNSHADED].
   */
  public var rimEnabled: Boolean
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_FEATURE, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_FEATURE, NIL)
    }

  /**
   * Sets the strength of the rim lighting effect.
   */
  public var rim: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_RIM, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_RIM, NIL)
    }

  /**
   * The amount of to blend light and albedo color when rendering rim effect. If `0` the light color is used, while `1` means albedo color is used. An intermediate value generally works best.
   */
  public var rimTint: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_RIM_TINT,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_RIM_TINT, NIL)
    }

  /**
   * Texture used to set the strength of the rim lighting effect per-pixel. Multiplied by [rim].
   */
  public var rimTexture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 5L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_TEXTURE,
          OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 5L, OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_TEXTURE, NIL)
    }

  /**
   * If `true`, clearcoat rendering is enabled. Adds a secondary transparent pass to the lighting calculation resulting in an added specular blob. This makes materials appear as if they have a clear layer on them that can be either glossy or rough.
   *
   * **Note:** Clearcoat rendering is not visible if the material's [shadingMode] is [SHADING_MODE_UNSHADED].
   */
  public var clearcoatEnabled: Boolean
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_FEATURE, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_FEATURE, NIL)
    }

  /**
   * Sets the strength of the clearcoat effect. Setting to `0` looks the same as disabling the clearcoat effect.
   */
  public var clearcoat: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_CLEARCOAT,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_CLEARCOAT, NIL)
    }

  /**
   * Sets the roughness of the clearcoat pass. A higher value results in a rougher clearcoat while a lower value results in a smoother clearcoat.
   */
  public var clearcoatRoughness: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_CLEARCOAT_ROUGHNESS, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_CLEARCOAT_ROUGHNESS, NIL)
    }

  /**
   * Texture that defines the strength of the clearcoat effect and the glossiness of the clearcoat. Strength is specified in the red channel while glossiness is specified in the green channel.
   */
  public var clearcoatTexture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 6L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_TEXTURE,
          OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 6L, OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_TEXTURE, NIL)
    }

  /**
   * If `true`, anisotropy is enabled. Anisotropy changes the shape of the specular blob and aligns it to tangent space. This is useful for brushed aluminium and hair reflections.
   *
   * **Note:** Mesh tangents are needed for anisotropy to work. If the mesh does not contain tangents, the anisotropy effect will appear broken.
   *
   * **Note:** Material anisotropy should not to be confused with anisotropic texture filtering, which can be enabled by setting [textureFilter] to [TEXTURE_FILTER_LINEAR_WITH_MIPMAPS_ANISOTROPIC].
   */
  public var anisotropyEnabled: Boolean
    get() {
      TransferContext.writeArguments(LONG to 4L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_FEATURE, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 4L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_FEATURE, NIL)
    }

  /**
   * The strength of the anisotropy effect. This is multiplied by [anisotropyFlowmap]'s alpha channel if a texture is defined there and the texture contains an alpha channel.
   */
  public var anisotropy: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_ANISOTROPY,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_ANISOTROPY,
          NIL)
    }

  /**
   * Texture that offsets the tangent map for anisotropy calculations and optionally controls the anisotropy effect (if an alpha channel is present). The flowmap texture is expected to be a derivative map, with the red channel representing distortion on the X axis and green channel representing distortion on the Y axis. Values below 0.5 will result in negative distortion, whereas values above 0.5 will result in positive distortion.
   *
   * If present, the texture's alpha channel will be used to multiply the strength of the [anisotropy] effect. Fully opaque pixels will keep the anisotropy effect's original strength while fully transparent pixels will disable the anisotropy effect entirely. The flowmap texture's blue channel is ignored.
   */
  public var anisotropyFlowmap: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 7L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_TEXTURE,
          OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 7L, OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_TEXTURE, NIL)
    }

  /**
   * If `true`, ambient occlusion is enabled. Ambient occlusion darkens areas based on the [aoTexture].
   */
  public var aoEnabled: Boolean
    get() {
      TransferContext.writeArguments(LONG to 5L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_FEATURE, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 5L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_FEATURE, NIL)
    }

  /**
   * Amount that ambient occlusion affects lighting from lights. If `0`, ambient occlusion only affects ambient light. If `1`, ambient occlusion affects lights just as much as it affects ambient light. This can be used to impact the strength of the ambient occlusion effect, but typically looks unrealistic.
   */
  public var aoLightAffect: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_AO_LIGHT_AFFECT, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_AO_LIGHT_AFFECT, NIL)
    }

  /**
   * Texture that defines the amount of ambient occlusion for a given point on the object.
   */
  public var aoTexture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 8L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_TEXTURE,
          OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 8L, OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_TEXTURE, NIL)
    }

  /**
   * If `true`, use `UV2` coordinates to look up from the [aoTexture].
   */
  public var aoOnUv2: Boolean
    get() {
      TransferContext.writeArguments(LONG to 10L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_FLAG, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 10L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_FLAG, NIL)
    }

  /**
   * Specifies the channel of the [aoTexture] in which the ambient occlusion information is stored. This is useful when you store the information for multiple effects in a single texture. For example if you stored metallic in the red channel, roughness in the blue, and ambient occlusion in the green you could reduce the number of textures you use.
   */
  public var aoTextureChannel: TextureChannel
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_AO_TEXTURE_CHANNEL, LONG)
      return BaseMaterial3D.TextureChannel.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_AO_TEXTURE_CHANNEL, NIL)
    }

  /**
   * If `true`, height mapping is enabled (also called "parallax mapping" or "depth mapping"). See also [normalEnabled]. Height mapping is a demanding feature on the GPU, so it should only be used on materials where it makes a significant visual difference.
   *
   * **Note:** Height mapping is not supported if triplanar mapping is used on the same material. The value of [heightmapEnabled] will be ignored if [uv1Triplanar] is enabled.
   */
  public var heightmapEnabled: Boolean
    get() {
      TransferContext.writeArguments(LONG to 6L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_FEATURE, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 6L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_FEATURE, NIL)
    }

  /**
   * The heightmap scale to use for the parallax effect (see [heightmapEnabled]). The default value is tuned so that the highest point (value = 255) appears to be 5 cm higher than the lowest point (value = 0). Higher values result in a deeper appearance, but may result in artifacts appearing when looking at the material from oblique angles, especially when the camera moves. Negative values can be used to invert the parallax effect, but this is different from inverting the texture using [heightmapFlipTexture] as the material will also appear to be "closer" to the camera. In most cases, [heightmapScale] should be kept to a positive value.
   *
   * **Note:** If the height map effect looks strange regardless of this value, try adjusting [heightmapFlipBinormal] and [heightmapFlipTangent]. See also [heightmapTexture] for recommendations on authoring heightmap textures, as the way the heightmap texture is authored affects how [heightmapScale] behaves.
   */
  public var heightmapScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_HEIGHTMAP_SCALE, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_HEIGHTMAP_SCALE, NIL)
    }

  /**
   * If `true`, uses parallax occlusion mapping to represent depth in the material instead of simple offset mapping (see [heightmapEnabled]). This results in a more convincing depth effect, but is much more expensive on the GPU. Only enable this on materials where it makes a significant visual difference.
   */
  public var heightmapDeepParallax: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_IS_HEIGHTMAP_DEEP_PARALLAX_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_HEIGHTMAP_DEEP_PARALLAX, NIL)
    }

  /**
   * The number of layers to use for parallax occlusion mapping when the camera is far away from the material. Higher values result in a more convincing depth effect, especially in materials that have steep height changes. Higher values have a significant cost on the GPU, so it should only be increased on materials where it makes a significant visual difference.
   *
   * **Note:** Only effective if [heightmapDeepParallax] is `true`.
   */
  public var heightmapMinLayers: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_HEIGHTMAP_DEEP_PARALLAX_MIN_LAYERS, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_HEIGHTMAP_DEEP_PARALLAX_MIN_LAYERS, NIL)
    }

  /**
   * The number of layers to use for parallax occlusion mapping when the camera is up close to the material. Higher values result in a more convincing depth effect, especially in materials that have steep height changes. Higher values have a significant cost on the GPU, so it should only be increased on materials where it makes a significant visual difference.
   *
   * **Note:** Only effective if [heightmapDeepParallax] is `true`.
   */
  public var heightmapMaxLayers: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_HEIGHTMAP_DEEP_PARALLAX_MAX_LAYERS, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_HEIGHTMAP_DEEP_PARALLAX_MAX_LAYERS, NIL)
    }

  /**
   * If `true`, flips the mesh's tangent vectors when interpreting the height map. If the heightmap effect looks strange when the camera moves (even with a reasonable [heightmapScale]), try setting this to `true`.
   */
  public var heightmapFlipTangent: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_HEIGHTMAP_DEEP_PARALLAX_FLIP_TANGENT, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_HEIGHTMAP_DEEP_PARALLAX_FLIP_TANGENT, NIL)
    }

  /**
   * If `true`, flips the mesh's binormal vectors when interpreting the height map. If the heightmap effect looks strange when the camera moves (even with a reasonable [heightmapScale]), try setting this to `true`.
   */
  public var heightmapFlipBinormal: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_HEIGHTMAP_DEEP_PARALLAX_FLIP_BINORMAL, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_HEIGHTMAP_DEEP_PARALLAX_FLIP_BINORMAL, NIL)
    }

  /**
   * The texture to use as a height map. See also [heightmapEnabled].
   *
   * For best results, the texture should be normalized (with [heightmapScale] reduced to compensate). In [GIMP](https://gimp.org), this can be done using **Colors > Auto > Equalize**. If the texture only uses a small part of its available range, the parallax effect may look strange, especially when the camera moves.
   *
   * **Note:** To reduce memory usage and improve loading times, you may be able to use a lower-resolution heightmap texture as most heightmaps are only comprised of low-frequency data.
   */
  public var heightmapTexture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 9L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_TEXTURE,
          OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 9L, OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_TEXTURE, NIL)
    }

  /**
   * If `true`, interprets the height map texture as a depth map, with brighter values appearing to be "lower" in altitude compared to darker values.
   *
   * This can be enabled for compatibility with some materials authored for Godot 3.x. This is not necessary if the Invert import option was used to invert the depth map in Godot 3.x, in which case [heightmapFlipTexture] should remain `false`.
   */
  public var heightmapFlipTexture: Boolean
    get() {
      TransferContext.writeArguments(LONG to 17L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_FLAG, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 17L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_FLAG, NIL)
    }

  /**
   * If `true`, subsurface scattering is enabled. Emulates light that penetrates an object's surface, is scattered, and then emerges. Subsurface scattering quality is controlled by [godot.ProjectSettings.rendering/environment/subsurfaceScattering/subsurfaceScatteringQuality].
   */
  public var subsurfScatterEnabled: Boolean
    get() {
      TransferContext.writeArguments(LONG to 7L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_FEATURE, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 7L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_FEATURE, NIL)
    }

  /**
   * The strength of the subsurface scattering effect. The depth of the effect is also controlled by [godot.ProjectSettings.rendering/environment/subsurfaceScattering/subsurfaceScatteringScale], which is set globally.
   */
  public var subsurfScatterStrength: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_SUBSURFACE_SCATTERING_STRENGTH, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_SUBSURFACE_SCATTERING_STRENGTH, NIL)
    }

  /**
   * If `true`, subsurface scattering will use a special mode optimized for the color and density of human skin, such as boosting the intensity of the red channel in subsurface scattering.
   */
  public var subsurfScatterSkinMode: Boolean
    get() {
      TransferContext.writeArguments(LONG to 18L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_FLAG, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 18L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_FLAG, NIL)
    }

  /**
   * Texture used to control the subsurface scattering strength. Stored in the red texture channel. Multiplied by [subsurfScatterStrength].
   */
  public var subsurfScatterTexture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 10L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_TEXTURE,
          OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 10L, OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_TEXTURE, NIL)
    }

  /**
   * If `true`, enables subsurface scattering transmittance. Only effective if [subsurfScatterEnabled] is `true`. See also [backlightEnabled].
   */
  public var subsurfScatterTransmittanceEnabled: Boolean
    get() {
      TransferContext.writeArguments(LONG to 8L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_FEATURE, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 8L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_FEATURE, NIL)
    }

  /**
   * The color to multiply the subsurface scattering transmittance effect with. Ignored if [subsurfScatterSkinMode] is `true`.
   */
  @CoreTypeLocalCopy
  public var subsurfScatterTransmittanceColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_TRANSMITTANCE_COLOR, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_TRANSMITTANCE_COLOR, NIL)
    }

  /**
   * The texture to use for multiplying the intensity of the subsurface scattering transmitteance intensity. See also [subsurfScatterTexture]. Ignored if [subsurfScatterSkinMode] is `true`.
   */
  public var subsurfScatterTransmittanceTexture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 11L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_TEXTURE,
          OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 11L, OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_TEXTURE, NIL)
    }

  /**
   * The depth of the subsurface scattering transmittance effect.
   */
  public var subsurfScatterTransmittanceDepth: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_TRANSMITTANCE_DEPTH, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_TRANSMITTANCE_DEPTH, NIL)
    }

  /**
   * The intensity of the subsurface scattering transmittance effect.
   */
  public var subsurfScatterTransmittanceBoost: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_TRANSMITTANCE_BOOST, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_TRANSMITTANCE_BOOST, NIL)
    }

  /**
   * If `true`, the backlight effect is enabled. See also [subsurfScatterTransmittanceEnabled].
   */
  public var backlightEnabled: Boolean
    get() {
      TransferContext.writeArguments(LONG to 9L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_FEATURE, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 9L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_FEATURE, NIL)
    }

  /**
   * The color used by the backlight effect. Represents the light passing through an object.
   */
  @CoreTypeLocalCopy
  public var backlight: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_BACKLIGHT,
          COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_BACKLIGHT, NIL)
    }

  /**
   * Texture used to control the backlight effect per-pixel. Added to [backlight].
   */
  public var backlightTexture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 12L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_TEXTURE,
          OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 12L, OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_TEXTURE, NIL)
    }

  /**
   * If `true`, the refraction effect is enabled. Distorts transparency based on light from behind the object.
   */
  public var refractionEnabled: Boolean
    get() {
      TransferContext.writeArguments(LONG to 10L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_FEATURE, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 10L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_FEATURE, NIL)
    }

  /**
   * The strength of the refraction effect.
   */
  public var refractionScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_REFRACTION,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_REFRACTION,
          NIL)
    }

  /**
   * Texture that controls the strength of the refraction per-pixel. Multiplied by [refractionScale].
   */
  public var refractionTexture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 13L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_TEXTURE,
          OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 13L, OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_TEXTURE, NIL)
    }

  /**
   * Specifies the channel of the [refractionTexture] in which the refraction information is stored. This is useful when you store the information for multiple effects in a single texture. For example if you stored refraction in the red channel, roughness in the blue, and ambient occlusion in the green you could reduce the number of textures you use.
   */
  public var refractionTextureChannel: TextureChannel
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_REFRACTION_TEXTURE_CHANNEL, LONG)
      return BaseMaterial3D.TextureChannel.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_REFRACTION_TEXTURE_CHANNEL, NIL)
    }

  /**
   * If `true`, enables the detail overlay. Detail is a second texture that gets mixed over the surface of the object based on [detailMask] and [detailAlbedo]'s alpha channel. This can be used to add variation to objects, or to blend between two different albedo/normal textures.
   */
  public var detailEnabled: Boolean
    get() {
      TransferContext.writeArguments(LONG to 11L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_FEATURE, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 11L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_FEATURE, NIL)
    }

  /**
   * Texture used to specify how the detail textures get blended with the base textures. [detailMask] can be used together with [detailAlbedo]'s alpha channel (if any).
   */
  public var detailMask: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 14L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_TEXTURE,
          OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 14L, OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_TEXTURE, NIL)
    }

  /**
   * Specifies how the [detailAlbedo] should blend with the current `ALBEDO`. See [enum BlendMode] for options.
   */
  public var detailBlendMode: BlendMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_DETAIL_BLEND_MODE, LONG)
      return BaseMaterial3D.BlendMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_DETAIL_BLEND_MODE, NIL)
    }

  /**
   * Specifies whether to use `UV` or `UV2` for the detail layer. See [enum DetailUV] for options.
   */
  public var detailUvLayer: DetailUV
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_DETAIL_UV,
          LONG)
      return BaseMaterial3D.DetailUV.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_DETAIL_UV, NIL)
    }

  /**
   * Texture that specifies the color of the detail overlay. [detailAlbedo]'s alpha channel is used as a mask, even when the material is opaque. To use a dedicated texture as a mask, see [detailMask].
   *
   * **Note:** [detailAlbedo] is *not* modulated by [albedoColor].
   */
  public var detailAlbedo: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 15L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_TEXTURE,
          OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 15L, OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_TEXTURE, NIL)
    }

  /**
   * Texture that specifies the per-pixel normal of the detail overlay. The [detailNormal] texture only uses the red and green channels; the blue and alpha channels are ignored. The normal read from [detailNormal] is oriented around the surface normal provided by the [godot.Mesh].
   *
   * **Note:** Godot expects the normal map to use X+, Y+, and Z+ coordinates. See [this page](http://wiki.polycount.com/wiki/Normal_Map_Technical_Details#Common_Swizzle_Coordinates) for a comparison of normal map coordinates expected by popular engines.
   */
  public var detailNormal: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 16L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_TEXTURE,
          OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 16L, OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_TEXTURE, NIL)
    }

  /**
   * How much to scale the `UV` coordinates. This is multiplied by `UV` in the vertex function. The Z component is used when [uv1Triplanar] is enabled, but it is not used anywhere else.
   */
  @CoreTypeLocalCopy
  public var uv1Scale: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_UV1_SCALE,
          VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_UV1_SCALE, NIL)
    }

  /**
   * How much to offset the `UV` coordinates. This amount will be added to `UV` in the vertex function. This can be used to offset a texture. The Z component is used when [uv1Triplanar] is enabled, but it is not used anywhere else.
   */
  @CoreTypeLocalCopy
  public var uv1Offset: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_UV1_OFFSET,
          VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_UV1_OFFSET,
          NIL)
    }

  /**
   * If `true`, instead of using `UV` textures will use a triplanar texture lookup to determine how to apply textures. Triplanar uses the orientation of the object's surface to blend between texture coordinates. It reads from the source texture 3 times, once for each axis and then blends between the results based on how closely the pixel aligns with each axis. This is often used for natural features to get a realistic blend of materials. Because triplanar texturing requires many more texture reads per-pixel it is much slower than normal UV texturing. Additionally, because it is blending the texture between the three axes, it is unsuitable when you are trying to achieve crisp texturing.
   */
  public var uv1Triplanar: Boolean
    get() {
      TransferContext.writeArguments(LONG to 6L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_FLAG, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 6L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_FLAG, NIL)
    }

  /**
   * A lower number blends the texture more softly while a higher number blends the texture more sharply.
   *
   * **Note:** [uv1TriplanarSharpness] is clamped between `0.0` and `150.0` (inclusive) as values outside that range can look broken depending on the mesh.
   */
  public var uv1TriplanarSharpness: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_UV1_TRIPLANAR_BLEND_SHARPNESS, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_UV1_TRIPLANAR_BLEND_SHARPNESS, NIL)
    }

  /**
   * If `true`, triplanar mapping for `UV` is calculated in world space rather than object local space. See also [uv1Triplanar].
   */
  public var uv1WorldTriplanar: Boolean
    get() {
      TransferContext.writeArguments(LONG to 8L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_FLAG, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 8L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_FLAG, NIL)
    }

  /**
   * How much to scale the `UV2` coordinates. This is multiplied by `UV2` in the vertex function. The Z component is used when [uv2Triplanar] is enabled, but it is not used anywhere else.
   */
  @CoreTypeLocalCopy
  public var uv2Scale: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_UV2_SCALE,
          VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_UV2_SCALE, NIL)
    }

  /**
   * How much to offset the `UV2` coordinates. This amount will be added to `UV2` in the vertex function. This can be used to offset a texture. The Z component is used when [uv2Triplanar] is enabled, but it is not used anywhere else.
   */
  @CoreTypeLocalCopy
  public var uv2Offset: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_UV2_OFFSET,
          VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_UV2_OFFSET,
          NIL)
    }

  /**
   * If `true`, instead of using `UV2` textures will use a triplanar texture lookup to determine how to apply textures. Triplanar uses the orientation of the object's surface to blend between texture coordinates. It reads from the source texture 3 times, once for each axis and then blends between the results based on how closely the pixel aligns with each axis. This is often used for natural features to get a realistic blend of materials. Because triplanar texturing requires many more texture reads per-pixel it is much slower than normal UV texturing. Additionally, because it is blending the texture between the three axes, it is unsuitable when you are trying to achieve crisp texturing.
   */
  public var uv2Triplanar: Boolean
    get() {
      TransferContext.writeArguments(LONG to 7L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_FLAG, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 7L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_FLAG, NIL)
    }

  /**
   * A lower number blends the texture more softly while a higher number blends the texture more sharply.
   *
   * **Note:** [uv2TriplanarSharpness] is clamped between `0.0` and `150.0` (inclusive) as values outside that range can look broken depending on the mesh.
   */
  public var uv2TriplanarSharpness: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_UV2_TRIPLANAR_BLEND_SHARPNESS, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_UV2_TRIPLANAR_BLEND_SHARPNESS, NIL)
    }

  /**
   * If `true`, triplanar mapping for `UV2` is calculated in world space rather than object local space. See also [uv2Triplanar].
   */
  public var uv2WorldTriplanar: Boolean
    get() {
      TransferContext.writeArguments(LONG to 9L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_FLAG, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 9L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_FLAG, NIL)
    }

  /**
   * Filter flags for the texture. See [enum TextureFilter] for options.
   *
   * **Note:** [heightmapTexture] is always sampled with linear filtering, even if nearest-neighbor filtering is selected here. This is to ensure the heightmap effect looks as intended. If you need sharper height transitions between pixels, resize the heightmap texture in an image editor with nearest-neighbor filtering.
   */
  public var textureFilter: TextureFilter
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_TEXTURE_FILTER,
          LONG)
      return BaseMaterial3D.TextureFilter.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_TEXTURE_FILTER,
          NIL)
    }

  /**
   * Repeat flags for the texture. See [enum TextureFilter] for options.
   */
  public var textureRepeat: Boolean
    get() {
      TransferContext.writeArguments(LONG to 16L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_FLAG, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 16L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_FLAG, NIL)
    }

  /**
   * If `true`, the object receives no shadow that would otherwise be cast onto it.
   */
  public var disableReceiveShadows: Boolean
    get() {
      TransferContext.writeArguments(LONG to 13L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_FLAG, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 13L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_FLAG, NIL)
    }

  /**
   * If `true`, enables the "shadow to opacity" render mode where lighting modifies the alpha so shadowed areas are opaque and non-shadowed areas are transparent. Useful for overlaying shadows onto a camera feed in AR.
   */
  public var shadowToOpacity: Boolean
    get() {
      TransferContext.writeArguments(LONG to 15L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_FLAG, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 15L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_FLAG, NIL)
    }

  /**
   * Controls how the object faces the camera. See [enum BillboardMode].
   *
   * **Note:** Billboard mode is not suitable for VR because the left-right vector of the camera is not horizontal when the screen is attached to your head instead of on the table. See [godot.GitHub issue #41567](https://github.com/godotengine/godot/issues/41567) for details.
   */
  public var billboardMode: BillboardMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_BILLBOARD_MODE,
          LONG)
      return BaseMaterial3D.BillboardMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_BILLBOARD_MODE,
          NIL)
    }

  /**
   * If `true`, the shader will keep the scale set for the mesh. Otherwise, the scale is lost when billboarding. Only applies when [billboardMode] is not [BILLBOARD_DISABLED].
   */
  public var billboardKeepScale: Boolean
    get() {
      TransferContext.writeArguments(LONG to 5L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_FLAG, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 5L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_FLAG, NIL)
    }

  /**
   * The number of horizontal frames in the particle sprite sheet. Only enabled when using [BILLBOARD_PARTICLES]. See [billboardMode].
   */
  public var particlesAnimHFrames: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_PARTICLES_ANIM_H_FRAMES, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_PARTICLES_ANIM_H_FRAMES, NIL)
    }

  /**
   * The number of vertical frames in the particle sprite sheet. Only enabled when using [BILLBOARD_PARTICLES]. See [billboardMode].
   */
  public var particlesAnimVFrames: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_PARTICLES_ANIM_V_FRAMES, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_PARTICLES_ANIM_V_FRAMES, NIL)
    }

  /**
   * If `true`, particle animations are looped. Only enabled when using [BILLBOARD_PARTICLES]. See [billboardMode].
   */
  public var particlesAnimLoop: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_PARTICLES_ANIM_LOOP, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_PARTICLES_ANIM_LOOP, NIL)
    }

  /**
   * If `true`, enables the vertex grow setting. This can be used to create mesh-based outlines using a second material pass and its [cullMode] set to [CULL_FRONT]. See also [growAmount].
   *
   * **Note:** Vertex growth cannot create new vertices, which means that visible gaps may occur in sharp corners. This can be alleviated by designing the mesh to use smooth normals exclusively using [face weighted normals](https://wiki.polycount.com/wiki/Face_weighted_normals) in the 3D authoring software. In this case, grow will be able to join every outline together, just like in the original mesh.
   */
  public var grow: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_IS_GROW_ENABLED,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_GROW_ENABLED,
          NIL)
    }

  /**
   * Grows object vertices in the direction of their normals. Only effective if [grow] is `true`.
   */
  public var growAmount: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_GROW, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_GROW, NIL)
    }

  /**
   * If `true`, the object is rendered at the same size regardless of distance.
   */
  public var fixedSize: Boolean
    get() {
      TransferContext.writeArguments(LONG to 4L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_FLAG, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 4L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_FLAG, NIL)
    }

  /**
   * If `true`, render point size can be changed.
   *
   * **Note:** This is only effective for objects whose geometry is point-based rather than triangle-based. See also [pointSize].
   */
  public var usePointSize: Boolean
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_FLAG, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_FLAG, NIL)
    }

  /**
   * The point size in pixels. See [usePointSize].
   */
  public var pointSize: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_POINT_SIZE,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_POINT_SIZE,
          NIL)
    }

  /**
   * If `true`, enables parts of the shader required for [godot.GPUParticles3D] trails to function. This also requires using a mesh with appropriate skinning, such as [godot.RibbonTrailMesh] or [godot.TubeTrailMesh]. Enabling this feature outside of materials used in [godot.GPUParticles3D] meshes will break material rendering.
   */
  public var useParticleTrails: Boolean
    get() {
      TransferContext.writeArguments(LONG to 19L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_FLAG, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 19L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_FLAG, NIL)
    }

  /**
   * If `true`, the proximity fade effect is enabled. The proximity fade effect fades out each pixel based on its distance to another object.
   */
  public var proximityFadeEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_IS_PROXIMITY_FADE_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_PROXIMITY_FADE_ENABLED, NIL)
    }

  /**
   * Distance over which the fade effect takes place. The larger the distance the longer it takes for an object to fade.
   */
  public var proximityFadeDistance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_PROXIMITY_FADE_DISTANCE, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_PROXIMITY_FADE_DISTANCE, NIL)
    }

  /**
   * The width of the range around the shape between the minimum and maximum representable signed distance.
   */
  public var msdfPixelRange: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_MSDF_PIXEL_RANGE, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_MSDF_PIXEL_RANGE, NIL)
    }

  /**
   * The width of the shape outine.
   */
  public var msdfOutlineSize: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_MSDF_OUTLINE_SIZE, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_MSDF_OUTLINE_SIZE, NIL)
    }

  /**
   * Specifies which type of fade to use. Can be any of the [enum DistanceFadeMode]s.
   */
  public var distanceFadeMode: DistanceFadeMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_DISTANCE_FADE,
          LONG)
      return BaseMaterial3D.DistanceFadeMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_DISTANCE_FADE,
          NIL)
    }

  /**
   * Distance at which the object starts to become visible. If the object is less than this distance away, it will be invisible.
   *
   * **Note:** If `distance_fade_min_distance` is greater than `distance_fade_max_distance`, the behavior will be reversed. The object will start to fade away at `distance_fade_max_distance` and will fully disappear once it reaches `distance_fade_min_distance`.
   */
  public var distanceFadeMinDistance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_DISTANCE_FADE_MIN_DISTANCE, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_DISTANCE_FADE_MIN_DISTANCE, NIL)
    }

  /**
   * Distance at which the object appears fully opaque.
   *
   * **Note:** If `distance_fade_max_distance` is less than `distance_fade_min_distance`, the behavior will be reversed. The object will start to fade away at `distance_fade_max_distance` and will fully disappear once it reaches `distance_fade_min_distance`.
   */
  public var distanceFadeMaxDistance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_GET_DISTANCE_FADE_MAX_DISTANCE, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BASEMATERIAL3D_SET_DISTANCE_FADE_MAX_DISTANCE, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_BASEMATERIAL3D, scriptIndex)
    return true
  }

  /**
   * The material's base color.
   *
   * **Note:** If [detailEnabled] is `true` and a [detailAlbedo] texture is specified, [albedoColor] will *not* modulate the detail texture. This can be used to color partial areas of a material by not specifying an albedo texture and using a transparent [detailAlbedo] texture instead.
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
  public open fun albedoColorMutate(block: Color.() -> Unit): Color = albedoColor.apply{
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
  public open fun emissionMutate(block: Color.() -> Unit): Color = emission.apply{
      block(this)
      emission = this
  }


  /**
   * The color to multiply the subsurface scattering transmittance effect with. Ignored if [subsurfScatterSkinMode] is `true`.
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
  public open fun subsurfScatterTransmittanceColorMutate(block: Color.() -> Unit): Color =
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
  public open fun backlightMutate(block: Color.() -> Unit): Color = backlight.apply{
      block(this)
      backlight = this
  }


  /**
   * How much to scale the `UV` coordinates. This is multiplied by `UV` in the vertex function. The Z component is used when [uv1Triplanar] is enabled, but it is not used anywhere else.
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
  public open fun uv1ScaleMutate(block: Vector3.() -> Unit): Vector3 = uv1Scale.apply{
      block(this)
      uv1Scale = this
  }


  /**
   * How much to offset the `UV` coordinates. This amount will be added to `UV` in the vertex function. This can be used to offset a texture. The Z component is used when [uv1Triplanar] is enabled, but it is not used anywhere else.
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
  public open fun uv1OffsetMutate(block: Vector3.() -> Unit): Vector3 = uv1Offset.apply{
      block(this)
      uv1Offset = this
  }


  /**
   * How much to scale the `UV2` coordinates. This is multiplied by `UV2` in the vertex function. The Z component is used when [uv2Triplanar] is enabled, but it is not used anywhere else.
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
  public open fun uv2ScaleMutate(block: Vector3.() -> Unit): Vector3 = uv2Scale.apply{
      block(this)
      uv2Scale = this
  }


  /**
   * How much to offset the `UV2` coordinates. This amount will be added to `UV2` in the vertex function. This can be used to offset a texture. The Z component is used when [uv2Triplanar] is enabled, but it is not used anywhere else.
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
  public open fun uv2OffsetMutate(block: Vector3.() -> Unit): Vector3 = uv2Offset.apply{
      block(this)
      uv2Offset = this
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
     * Represents the size of the [enum TextureParam] enum.
     */
    TEXTURE_MAX(18),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class TextureFilter(
    id: Long,
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
     * The texture filter reads from the nearest pixel, but selects a mipmap based on the angle between the surface and the camera view. This reduces artifacts on surfaces that are almost in line with the camera. The anisotropic filtering level can be changed by adjusting [godot.ProjectSettings.rendering/textures/defaultFilters/anisotropicFilteringLevel].
     */
    TEXTURE_FILTER_NEAREST_WITH_MIPMAPS_ANISOTROPIC(4),
    /**
     * The texture filter blends between the nearest 4 pixels and selects a mipmap based on the angle between the surface and the camera view. This reduces artifacts on surfaces that are almost in line with the camera. This is the slowest of the filtering options, but results in the highest quality texturing. The anisotropic filtering level can be changed by adjusting [godot.ProjectSettings.rendering/textures/defaultFilters/anisotropicFilteringLevel].
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
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
     * The material will use the texture's alpha values for transparency. This is the slowest to render, and disables shadow casting.
     */
    TRANSPARENCY_ALPHA(1),
    /**
     * The material will cut off all values below a threshold, the rest will remain opaque. The opaque portions will be rendered in the depth prepass. This is faster to render than alpha blending, but slower than opaque rendering. This also supports casting shadows.
     */
    TRANSPARENCY_ALPHA_SCISSOR(2),
    /**
     * The material will cut off all values below a spatially-deterministic threshold, the rest will remain opaque. This is faster to render than alpha blending, but slower than opaque rendering. This also supports casting shadows. Alpha hashing is suited for hair rendering.
     */
    TRANSPARENCY_ALPHA_HASH(3),
    /**
     * The material will use the texture's alpha value for transparency, but will discard fragments with an alpha of less than 0.99 during the depth prepass and fragments with an alpha less than 0.1 during the shadow pass. This also supports casting shadows.
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class ShadingMode(
    id: Long,
  ) {
    /**
     * The object will not receive shadows. This is the fastest to render, but it disables all interactions with lights.
     */
    SHADING_MODE_UNSHADED(0),
    /**
     * The object will be shaded per pixel. Useful for realistic shading effects.
     */
    SHADING_MODE_PER_PIXEL(1),
    /**
     * The object will be shaded per vertex. Useful when you want cheaper shaders and do not care about visual quality. Not implemented yet (this mode will act like [SHADING_MODE_PER_PIXEL]).
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
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
     * Represents the size of the [enum Feature] enum.
     */
    FEATURE_MAX(12),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class BlendMode(
    id: Long,
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class DepthDrawMode(
    id: Long,
  ) {
    /**
     * Default depth draw mode. Depth is drawn only for opaque objects during the opaque prepass (if any) and during the opaque pass.
     */
    DEPTH_DRAW_OPAQUE_ONLY(0),
    /**
     * Objects will write to depth during the opaque and the transparent passes. Transparent objects that are close to the camera may obscure other transparent objects behind them.
     *
     * **Note:** This does not influence whether transparent objects are included in the depth prepass or not. For that, see [enum Transparency].
     */
    DEPTH_DRAW_ALWAYS(1),
    /**
     * Objects will not write their depth to the depth buffer, even during the depth prepass (if enabled).
     */
    DEPTH_DRAW_DISABLED(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class CullMode(
    id: Long,
  ) {
    /**
     * Default cull mode. The back of the object is culled when not visible. Back face triangles will be culled when facing the camera. This results in only the front side of triangles being drawn. For closed-surface meshes, this means that only the exterior of the mesh will be visible.
     */
    CULL_BACK(0),
    /**
     * Front face triangles will be culled when facing the camera. This results in only the back side of triangles being drawn. For closed-surface meshes, this means that the interior of the mesh will be drawn instead of the exterior.
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class Flags(
    id: Long,
  ) {
    /**
     * Disables the depth test, so this object is drawn on top of all others drawn before it. This puts the object in the transparent draw pass where it is sorted based on distance to camera. Objects drawn after it in the draw order may cover it. This also disables writing to depth.
     */
    FLAG_DISABLE_DEPTH_TEST(0),
    /**
     * Set `ALBEDO` to the per-vertex color specified in the mesh.
     */
    FLAG_ALBEDO_FROM_VERTEX_COLOR(1),
    /**
     * Vertex colors are considered to be stored in sRGB color space and are converted to linear color space during rendering. See also [vertexColorIsSrgb].
     *
     * **Note:** Only effective when using the Forward+ and Mobile rendering methods.
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
     * Forces the shader to convert albedo from sRGB space to linear space. See also [albedoTextureForceSrgb].
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
     * Enables parts of the shader required for [godot.GPUParticles3D] trails to function. This also requires using a mesh with appropriate skinning, such as [godot.RibbonTrailMesh] or [godot.TubeTrailMesh]. Enabling this feature outside of materials used in [godot.GPUParticles3D] meshes will break material rendering.
     */
    FLAG_PARTICLE_TRAILS_MODE(19),
    /**
     * Enables multichannel signed distance field rendering shader.
     */
    FLAG_ALBEDO_TEXTURE_MSDF(20),
    /**
     * Represents the size of the [enum Flags] enum.
     */
    FLAG_MAX(21),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
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
     * Used for particle systems when assigned to [godot.GPUParticles3D] and [godot.CPUParticles3D] nodes. Enables `particles_anim_*` properties.
     *
     * The [godot.ParticleProcessMaterial.animSpeedMin] or [godot.CPUParticles3D.animSpeedMin] should also be set to a value bigger than zero for the animation to play.
     */
    BILLBOARD_PARTICLES(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
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
     * Used to read from the linear (non-perceptual) average of the red, green and blue channels of a texture.
     */
    TEXTURE_CHANNEL_GRAYSCALE(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
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
     * Smoothly fades the object out based on each pixel's distance from the camera using the alpha channel.
     */
    DISTANCE_FADE_PIXEL_ALPHA(1),
    /**
     * Smoothly fades the object out based on each pixel's distance from the camera using a dithering approach. Dithering discards pixels based on a set pattern to smoothly fade without enabling transparency. On certain hardware, this can be faster than [DISTANCE_FADE_PIXEL_ALPHA].
     */
    DISTANCE_FADE_PIXEL_DITHER(2),
    /**
     * Smoothly fades the object out based on the object's distance from the camera using a dithering approach. Dithering discards pixels based on a set pattern to smoothly fade without enabling transparency. On certain hardware, this can be faster than [DISTANCE_FADE_PIXEL_ALPHA] and [DISTANCE_FADE_PIXEL_DITHER].
     */
    DISTANCE_FADE_OBJECT_DITHER(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object
}
