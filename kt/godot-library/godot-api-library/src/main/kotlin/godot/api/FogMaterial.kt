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
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A [Material] resource that can be used by [FogVolume]s to draw volumetric effects.
 *
 * If you need more advanced effects, use a custom [url=$DOCS_URL/tutorials/shaders/shader_reference/fog_shader.html]fog shader[/url].
 */
@GodotBaseType
public open class FogMaterial : Material() {
  /**
   * The density of the [FogVolume]. Denser objects are more opaque, but may suffer from under-sampling artifacts that look like stripes. Negative values can be used to subtract fog from other [FogVolume]s or global volumetric fog.
   *
   * **Note:** Due to limited precision, [density] values between `-0.001` and `0.001` (exclusive) act like `0.0`. This does not apply to [Environment.volumetricFogDensity].
   */
  public final inline var density: Float
    @JvmName("densityProperty")
    get() = getDensity()
    @JvmName("densityProperty")
    set(`value`) {
      setDensity(value)
    }

  /**
   * The single-scattering [Color] of the [FogVolume]. Internally, [albedo] is converted into single-scattering, which is additively blended with other [FogVolume]s and the [Environment.volumetricFogAlbedo].
   *
   * **Warning:**
   * Be careful when trying to modify a local [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again afterward.
   */
  @CoreTypeLocalCopy
  public final inline var albedo: Color
    @JvmName("albedoProperty")
    get() = getAlbedo()
    @JvmName("albedoProperty")
    set(`value`) {
      setAlbedo(value)
    }

  /**
   * The [Color] of the light emitted by the [FogVolume]. Emitted light will not cast light or shadows on other objects, but can be useful for modulating the [Color] of the [FogVolume] independently from light sources.
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
   * The rate by which the height-based fog decreases in density as height increases in world space. A high falloff will result in a sharp transition, while a low falloff will result in a smoother transition. A value of `0.0` results in uniform-density fog. The height threshold is determined by the height of the associated [FogVolume].
   */
  public final inline var heightFalloff: Float
    @JvmName("heightFalloffProperty")
    get() = getHeightFalloff()
    @JvmName("heightFalloffProperty")
    set(`value`) {
      setHeightFalloff(value)
    }

  /**
   * The hardness of the edges of the [FogVolume]. A higher value will result in softer edges, while a lower value will result in harder edges.
   */
  public final inline var edgeFade: Float
    @JvmName("edgeFadeProperty")
    get() = getEdgeFade()
    @JvmName("edgeFadeProperty")
    set(`value`) {
      setEdgeFade(value)
    }

  /**
   * The 3D texture that is used to scale the [density] of the [FogVolume]. This can be used to vary fog density within the [FogVolume] with any kind of static pattern. For animated effects, consider using a custom [url=$DOCS_URL/tutorials/shaders/shader_reference/fog_shader.html]fog shader[/url].
   */
  public final inline var densityTexture: Texture3D?
    @JvmName("densityTextureProperty")
    get() = getDensityTexture()
    @JvmName("densityTextureProperty")
    set(`value`) {
      setDensityTexture(value)
    }

  override fun new(scriptIndex: Int) {
    createNativeObject(215, scriptIndex)
  }

  /**
   * This is a helper function for [albedo] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = fogmaterial.albedo
   * //Your changes
   * fogmaterial.albedo = myCoreType
   * ``````
   *
   * The single-scattering [Color] of the [FogVolume]. Internally, [albedo] is converted into single-scattering, which is additively blended with other [FogVolume]s and the [Environment.volumetricFogAlbedo].
   */
  @CoreTypeHelper
  public final fun albedoMutate(block: Color.() -> Unit): Color = albedo.apply {
     block(this)
     albedo = this
  }

  /**
   * This is a helper function for [emission] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = fogmaterial.emission
   * //Your changes
   * fogmaterial.emission = myCoreType
   * ``````
   *
   * The [Color] of the light emitted by the [FogVolume]. Emitted light will not cast light or shadows on other objects, but can be useful for modulating the [Color] of the [FogVolume] independently from light sources.
   */
  @CoreTypeHelper
  public final fun emissionMutate(block: Color.() -> Unit): Color = emission.apply {
     block(this)
     emission = this
  }

  public final fun setDensity(density: Float) {
    TransferContext.writeArguments(DOUBLE to density.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setDensityPtr, NIL)
  }

  public final fun getDensity(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDensityPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
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

  public final fun setEmission(emission: Color) {
    TransferContext.writeArguments(COLOR to emission)
    TransferContext.callMethod(ptr, MethodBindings.setEmissionPtr, NIL)
  }

  public final fun getEmission(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEmissionPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setHeightFalloff(heightFalloff: Float) {
    TransferContext.writeArguments(DOUBLE to heightFalloff.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setHeightFalloffPtr, NIL)
  }

  public final fun getHeightFalloff(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getHeightFalloffPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setEdgeFade(edgeFade: Float) {
    TransferContext.writeArguments(DOUBLE to edgeFade.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setEdgeFadePtr, NIL)
  }

  public final fun getEdgeFade(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEdgeFadePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDensityTexture(densityTexture: Texture3D?) {
    TransferContext.writeArguments(OBJECT to densityTexture)
    TransferContext.callMethod(ptr, MethodBindings.setDensityTexturePtr, NIL)
  }

  public final fun getDensityTexture(): Texture3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDensityTexturePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture3D?)
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _getShaderRid(): RID {
    throw NotImplementedError("FogMaterial::_getShaderRid can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _getShaderMode(): Shader.Mode {
    throw NotImplementedError("FogMaterial::_getShaderMode can't be called from the JVM.")
  }

  public companion object

  public object MethodBindings {
    internal val setDensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FogMaterial", "set_density", 373_806_689)

    internal val getDensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FogMaterial", "get_density", 1_740_695_150)

    internal val setAlbedoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FogMaterial", "set_albedo", 2_920_490_490)

    internal val getAlbedoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FogMaterial", "get_albedo", 3_444_240_500)

    internal val setEmissionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FogMaterial", "set_emission", 2_920_490_490)

    internal val getEmissionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FogMaterial", "get_emission", 3_444_240_500)

    internal val setHeightFalloffPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FogMaterial", "set_height_falloff", 373_806_689)

    internal val getHeightFalloffPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FogMaterial", "get_height_falloff", 1_740_695_150)

    internal val setEdgeFadePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FogMaterial", "set_edge_fade", 373_806_689)

    internal val getEdgeFadePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FogMaterial", "get_edge_fade", 1_740_695_150)

    internal val setDensityTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FogMaterial", "set_density_texture", 1_188_404_210)

    internal val getDensityTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FogMaterial", "get_density_texture", 373_985_333)
  }
}
