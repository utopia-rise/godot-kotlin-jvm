// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.TransferContext
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Double
import kotlin.Suppress
import kotlin.Unit

/**
 * [godot.Material] used with a [godot.FogVolume] to draw things with the volumetric fog effect.
 *
 * A [godot.Material] resource that can be used by [godot.FogVolume]s to draw volumetric effects.
 */
@GodotBaseType
public open class FogMaterial : Material() {
  /**
   * Sets the density of the [godot.FogVolume]. Denser objects are more opaque, but may suffer from under-sampling artifacts that look like stripes.
   */
  public open var density: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FOGMATERIAL_GET_DENSITY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FOGMATERIAL_SET_DENSITY, NIL)
    }

  /**
   * Sets the single-scattering [godot.core.Color] of the [godot.FogVolume]. Internally [albedo] is converted into single-scattering which is additively blended with other [godot.FogVolume]s and the [godot.Environment.volumetricFogAlbedo].
   */
  public open var albedo: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FOGMATERIAL_GET_ALBEDO, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FOGMATERIAL_SET_ALBEDO, NIL)
    }

  /**
   * Sets the [godot.core.Color] of the light emitted by the [godot.FogVolume]. Emitted light will not cast light or shadows on other objects, but can be useful for modulating the [godot.core.Color] of the [godot.FogVolume] independently from light sources.
   */
  public open var emission: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FOGMATERIAL_GET_EMISSION, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FOGMATERIAL_SET_EMISSION, NIL)
    }

  /**
   * Sets the rate by which the height-based fog decreases in density as height increases in world space. A high falloff will result in a sharp transition, while a low falloff will result in a smoother transition. A value of `0` results in uniform-density fog. The height threshold is determined by the height of the associated [godot.FogVolume].
   */
  public open var heightFalloff: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FOGMATERIAL_GET_HEIGHT_FALLOFF,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FOGMATERIAL_SET_HEIGHT_FALLOFF,
          NIL)
    }

  /**
   * Sets the hardness of the edges of the [godot.FogVolume]. A higher number will result in softer edges while a lower number will result in harder edges.
   */
  public open var edgeFade: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FOGMATERIAL_GET_EDGE_FADE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FOGMATERIAL_SET_EDGE_FADE, NIL)
    }

  /**
   * Sets a 3D texture that is used to scale the [density] of the [godot.FogVolume].
   */
  public open var densityTexture: Texture3D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FOGMATERIAL_GET_DENSITY_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture3D?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FOGMATERIAL_SET_DENSITY_TEXTURE,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_FOGMATERIAL)
  }

  public companion object
}
