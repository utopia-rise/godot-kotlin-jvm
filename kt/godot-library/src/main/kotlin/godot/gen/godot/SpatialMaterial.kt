// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

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
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
open class SpatialMaterial : Material() {
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

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_SPATIALMATERIAL)

  open fun albedoColor(schedule: Color.() -> Unit): Color = albedoColor.apply{
      schedule(this)
      albedoColor = this
  }


  open fun emission(schedule: Color.() -> Unit): Color = emission.apply{
      schedule(this)
      emission = this
  }


  open fun transmission(schedule: Color.() -> Unit): Color = transmission.apply{
      schedule(this)
      transmission = this
  }


  open fun uv1Offset(schedule: Vector3.() -> Unit): Vector3 = uv1Offset.apply{
      schedule(this)
      uv1Offset = this
  }


  open fun uv1Scale(schedule: Vector3.() -> Unit): Vector3 = uv1Scale.apply{
      schedule(this)
      uv1Scale = this
  }


  open fun uv2Offset(schedule: Vector3.() -> Unit): Vector3 = uv2Offset.apply{
      schedule(this)
      uv2Offset = this
  }


  open fun uv2Scale(schedule: Vector3.() -> Unit): Vector3 = uv2Scale.apply{
      schedule(this)
      uv2Scale = this
  }


  enum class EmissionOperator(
    id: Long
  ) {
    EMISSION_OP_ADD(0),

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
    DIFFUSE_BURLEY(0),

    DIFFUSE_LAMBERT(1),

    DIFFUSE_LAMBERT_WRAP(2),

    DIFFUSE_OREN_NAYAR(3),

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
    SPECULAR_SCHLICK_GGX(0),

    SPECULAR_BLINN(1),

    SPECULAR_PHONG(2),

    SPECULAR_TOON(3),

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
    FEATURE_TRANSPARENT(0),

    FEATURE_EMISSION(1),

    FEATURE_NORMAL_MAPPING(2),

    FEATURE_RIM(3),

    FEATURE_CLEARCOAT(4),

    FEATURE_ANISOTROPY(5),

    FEATURE_AMBIENT_OCCLUSION(6),

    FEATURE_DEPTH_MAPPING(7),

    FEATURE_SUBSURACE_SCATTERING(8),

    FEATURE_TRANSMISSION(9),

    FEATURE_REFRACTION(10),

    FEATURE_DETAIL(11),

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
    FLAG_UNSHADED(0),

    FLAG_USE_VERTEX_LIGHTING(1),

    FLAG_DISABLE_DEPTH_TEST(2),

    FLAG_ALBEDO_FROM_VERTEX_COLOR(3),

    FLAG_SRGB_VERTEX_COLOR(4),

    FLAG_USE_POINT_SIZE(5),

    FLAG_FIXED_SIZE(6),

    FLAG_BILLBOARD_KEEP_SCALE(7),

    FLAG_UV1_USE_TRIPLANAR(8),

    FLAG_UV2_USE_TRIPLANAR(9),

    FLAG_TRIPLANAR_USE_WORLD(10),

    FLAG_AO_ON_UV2(11),

    FLAG_EMISSION_ON_UV2(12),

    FLAG_USE_ALPHA_SCISSOR(13),

    FLAG_ALBEDO_TEXTURE_FORCE_SRGB(14),

    FLAG_DONT_RECEIVE_SHADOWS(15),

    FLAG_ENSURE_CORRECT_NORMALS(16),

    FLAG_DISABLE_AMBIENT_LIGHT(17),

    FLAG_USE_SHADOW_TO_OPACITY(18),

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
    CULL_BACK(0),

    CULL_FRONT(1),

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
    DETAIL_UV_1(0),

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
    DISTANCE_FADE_DISABLED(0),

    DISTANCE_FADE_PIXEL_ALPHA(1),

    DISTANCE_FADE_PIXEL_DITHER(2),

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
    BILLBOARD_DISABLED(0),

    BILLBOARD_ENABLED(1),

    BILLBOARD_FIXED_Y(2),

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
    DEPTH_DRAW_OPAQUE_ONLY(0),

    DEPTH_DRAW_ALWAYS(1),

    DEPTH_DRAW_DISABLED(2),

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
    TEXTURE_CHANNEL_RED(0),

    TEXTURE_CHANNEL_GREEN(1),

    TEXTURE_CHANNEL_BLUE(2),

    TEXTURE_CHANNEL_ALPHA(3),

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
    BLEND_MODE_MIX(0),

    BLEND_MODE_ADD(1),

    BLEND_MODE_SUB(2),

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
    TEXTURE_ALBEDO(0),

    TEXTURE_METALLIC(1),

    TEXTURE_ROUGHNESS(2),

    TEXTURE_EMISSION(3),

    TEXTURE_NORMAL(4),

    TEXTURE_RIM(5),

    TEXTURE_CLEARCOAT(6),

    TEXTURE_FLOWMAP(7),

    TEXTURE_AMBIENT_OCCLUSION(8),

    TEXTURE_DEPTH(9),

    TEXTURE_SUBSURFACE_SCATTERING(10),

    TEXTURE_TRANSMISSION(11),

    TEXTURE_REFRACTION(12),

    TEXTURE_DETAIL_MASK(13),

    TEXTURE_DETAIL_ALBEDO(14),

    TEXTURE_DETAIL_NORMAL(15),

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
    final const val BILLBOARD_DISABLED: Long = 0

    final const val BILLBOARD_ENABLED: Long = 1

    final const val BILLBOARD_FIXED_Y: Long = 2

    final const val BILLBOARD_PARTICLES: Long = 3

    final const val BLEND_MODE_ADD: Long = 1

    final const val BLEND_MODE_MIX: Long = 0

    final const val BLEND_MODE_MUL: Long = 3

    final const val BLEND_MODE_SUB: Long = 2

    final const val CULL_BACK: Long = 0

    final const val CULL_DISABLED: Long = 2

    final const val CULL_FRONT: Long = 1

    final const val DEPTH_DRAW_ALPHA_OPAQUE_PREPASS: Long = 3

    final const val DEPTH_DRAW_ALWAYS: Long = 1

    final const val DEPTH_DRAW_DISABLED: Long = 2

    final const val DEPTH_DRAW_OPAQUE_ONLY: Long = 0

    final const val DETAIL_UV_1: Long = 0

    final const val DETAIL_UV_2: Long = 1

    final const val DIFFUSE_BURLEY: Long = 0

    final const val DIFFUSE_LAMBERT: Long = 1

    final const val DIFFUSE_LAMBERT_WRAP: Long = 2

    final const val DIFFUSE_OREN_NAYAR: Long = 3

    final const val DIFFUSE_TOON: Long = 4

    final const val DISTANCE_FADE_DISABLED: Long = 0

    final const val DISTANCE_FADE_OBJECT_DITHER: Long = 3

    final const val DISTANCE_FADE_PIXEL_ALPHA: Long = 1

    final const val DISTANCE_FADE_PIXEL_DITHER: Long = 2

    final const val EMISSION_OP_ADD: Long = 0

    final const val EMISSION_OP_MULTIPLY: Long = 1

    final const val FEATURE_AMBIENT_OCCLUSION: Long = 6

    final const val FEATURE_ANISOTROPY: Long = 5

    final const val FEATURE_CLEARCOAT: Long = 4

    final const val FEATURE_DEPTH_MAPPING: Long = 7

    final const val FEATURE_DETAIL: Long = 11

    final const val FEATURE_EMISSION: Long = 1

    final const val FEATURE_MAX: Long = 12

    final const val FEATURE_NORMAL_MAPPING: Long = 2

    final const val FEATURE_REFRACTION: Long = 10

    final const val FEATURE_RIM: Long = 3

    final const val FEATURE_SUBSURACE_SCATTERING: Long = 8

    final const val FEATURE_TRANSMISSION: Long = 9

    final const val FEATURE_TRANSPARENT: Long = 0

    final const val FLAG_ALBEDO_FROM_VERTEX_COLOR: Long = 3

    final const val FLAG_ALBEDO_TEXTURE_FORCE_SRGB: Long = 14

    final const val FLAG_AO_ON_UV2: Long = 11

    final const val FLAG_BILLBOARD_KEEP_SCALE: Long = 7

    final const val FLAG_DISABLE_AMBIENT_LIGHT: Long = 17

    final const val FLAG_DISABLE_DEPTH_TEST: Long = 2

    final const val FLAG_DONT_RECEIVE_SHADOWS: Long = 15

    final const val FLAG_EMISSION_ON_UV2: Long = 12

    final const val FLAG_ENSURE_CORRECT_NORMALS: Long = 16

    final const val FLAG_FIXED_SIZE: Long = 6

    final const val FLAG_MAX: Long = 19

    final const val FLAG_SRGB_VERTEX_COLOR: Long = 4

    final const val FLAG_TRIPLANAR_USE_WORLD: Long = 10

    final const val FLAG_UNSHADED: Long = 0

    final const val FLAG_USE_ALPHA_SCISSOR: Long = 13

    final const val FLAG_USE_POINT_SIZE: Long = 5

    final const val FLAG_USE_SHADOW_TO_OPACITY: Long = 18

    final const val FLAG_USE_VERTEX_LIGHTING: Long = 1

    final const val FLAG_UV1_USE_TRIPLANAR: Long = 8

    final const val FLAG_UV2_USE_TRIPLANAR: Long = 9

    final const val SPECULAR_BLINN: Long = 1

    final const val SPECULAR_DISABLED: Long = 4

    final const val SPECULAR_PHONG: Long = 2

    final const val SPECULAR_SCHLICK_GGX: Long = 0

    final const val SPECULAR_TOON: Long = 3

    final const val TEXTURE_ALBEDO: Long = 0

    final const val TEXTURE_AMBIENT_OCCLUSION: Long = 8

    final const val TEXTURE_CHANNEL_ALPHA: Long = 3

    final const val TEXTURE_CHANNEL_BLUE: Long = 2

    final const val TEXTURE_CHANNEL_GRAYSCALE: Long = 4

    final const val TEXTURE_CHANNEL_GREEN: Long = 1

    final const val TEXTURE_CHANNEL_RED: Long = 0

    final const val TEXTURE_CLEARCOAT: Long = 6

    final const val TEXTURE_DEPTH: Long = 9

    final const val TEXTURE_DETAIL_ALBEDO: Long = 14

    final const val TEXTURE_DETAIL_MASK: Long = 13

    final const val TEXTURE_DETAIL_NORMAL: Long = 15

    final const val TEXTURE_EMISSION: Long = 3

    final const val TEXTURE_FLOWMAP: Long = 7

    final const val TEXTURE_MAX: Long = 16

    final const val TEXTURE_METALLIC: Long = 1

    final const val TEXTURE_NORMAL: Long = 4

    final const val TEXTURE_REFRACTION: Long = 12

    final const val TEXTURE_RIM: Long = 5

    final const val TEXTURE_ROUGHNESS: Long = 2

    final const val TEXTURE_SUBSURFACE_SCATTERING: Long = 10

    final const val TEXTURE_TRANSMISSION: Long = 11
  }
}
