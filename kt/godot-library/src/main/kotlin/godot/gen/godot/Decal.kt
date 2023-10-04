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
 * Node that projects a texture onto a [godot.MeshInstance3D].
 *
 * [godot.Decal]s are used to project a texture onto a [godot.Mesh] in the scene. Use Decals to add detail to a scene without affecting the underlying [godot.Mesh]. They are often used to add weathering to building, add dirt or mud to the ground, or add variety to props. Decals can be moved at any time, making them suitable for things like blob shadows or laser sight dots.
 *
 * They are made of an [AABB] and a group of [godot.Texture2D]s specifying [godot.core.Color], normal, ORM (ambient occlusion, roughness, metallic), and emission. Decals are projected within their [AABB] so altering the orientation of the Decal affects the direction in which they are projected. By default, Decals are projected down (i.e. from positive Y to negative Y).
 *
 * The [godot.Texture2D]s associated with the Decal are automatically stored in a texture atlas which is used for drawing the decals so all decals can be drawn at once. Godot uses clustered decals, meaning they are stored in cluster data and drawn when the mesh is drawn, they are not drawn as a post-processing effect after.
 *
 * **Note:** Decals cannot affect an underlying material's transparency, regardless of its transparency mode (alpha blend, alpha scissor, alpha hash, opaque pre-pass). This means translucent or transparent areas of a material will remain translucent or transparent even if an opaque decal is applied on them.
 *
 * **Note:** Decals are only supported in the Forward+ and Mobile rendering methods, not Compatibility. When using the Mobile rendering method, only 8 decals can be displayed on each mesh resource. Attempting to display more than 8 decals on a single mesh resource will result in decals flickering in and out as the camera moves.
 *
 * **Note:** When using the Mobile rendering method, decals will only correctly affect meshes whose visibility AABB intersects with the decal's AABB. If using a shader to deform the mesh in a way that makes it go outside its AABB, [godot.GeometryInstance3D.extraCullMargin] must be increased on the mesh. Otherwise, the decal may not be visible on the mesh.
 */
@GodotBaseType
public open class Decal : VisualInstance3D() {
  /**
   * Sets the size of the [AABB] used by the decal. All dimensions must be set to a value greater than zero (they will be clamped to `0.001` if this is not the case). The AABB goes from `-size/2` to `size/2`.
   *
   * **Note:** To improve culling efficiency of "hard surface" decals, set their [upperFade] and [lowerFade] to `0.0` and set the Y component of the [size] as low as possible. This will reduce the decals' AABB size without affecting their appearance.
   */
  @CoreTypeLocalCopy
  public var size: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_GET_SIZE, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_SET_SIZE, NIL)
    }

  /**
   * [godot.Texture2D] with the base [godot.core.Color] of the Decal. Either this or the [textureEmission] must be set for the Decal to be visible. Use the alpha channel like a mask to smoothly blend the edges of the decal with the underlying object.
   *
   * **Note:** Unlike [godot.BaseMaterial3D] whose filter mode can be adjusted on a per-material basis, the filter mode for [godot.Decal] textures is set globally with [godot.ProjectSettings.rendering/textures/decals/filter].
   */
  public var textureAlbedo: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 0)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_GET_TEXTURE, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0, OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_SET_TEXTURE, NIL)
    }

  /**
   * [godot.Texture2D] with the per-pixel normal map for the decal. Use this to add extra detail to decals.
   *
   * **Note:** Unlike [godot.BaseMaterial3D] whose filter mode can be adjusted on a per-material basis, the filter mode for [godot.Decal] textures is set globally with [godot.ProjectSettings.rendering/textures/decals/filter].
   *
   * **Note:** Setting this texture alone will not result in a visible decal, as [textureAlbedo] must also be set. To create a normal-only decal, load an albedo texture into [textureAlbedo] and set [albedoMix] to `0.0`. The albedo texture's alpha channel will be used to determine where the underlying surface's normal map should be overridden (and its intensity).
   */
  public var textureNormal: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 1)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_GET_TEXTURE, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1, OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_SET_TEXTURE, NIL)
    }

  /**
   * [godot.Texture2D] storing ambient occlusion, roughness, and metallic for the decal. Use this to add extra detail to decals.
   *
   * **Note:** Unlike [godot.BaseMaterial3D] whose filter mode can be adjusted on a per-material basis, the filter mode for [godot.Decal] textures is set globally with [godot.ProjectSettings.rendering/textures/decals/filter].
   *
   * **Note:** Setting this texture alone will not result in a visible decal, as [textureAlbedo] must also be set. To create an ORM-only decal, load an albedo texture into [textureAlbedo] and set [albedoMix] to `0.0`. The albedo texture's alpha channel will be used to determine where the underlying surface's ORM map should be overridden (and its intensity).
   */
  public var textureOrm: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 2)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_GET_TEXTURE, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2, OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_SET_TEXTURE, NIL)
    }

  /**
   * [godot.Texture2D] with the emission [godot.core.Color] of the Decal. Either this or the [textureAlbedo] must be set for the Decal to be visible. Use the alpha channel like a mask to smoothly blend the edges of the decal with the underlying object.
   *
   * **Note:** Unlike [godot.BaseMaterial3D] whose filter mode can be adjusted on a per-material basis, the filter mode for [godot.Decal] textures is set globally with [godot.ProjectSettings.rendering/textures/decals/filter].
   */
  public var textureEmission: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 3)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_GET_TEXTURE, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3, OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_SET_TEXTURE, NIL)
    }

  /**
   * Energy multiplier for the emission texture. This will make the decal emit light at a higher or lower intensity, independently of the albedo color. See also [modulate].
   */
  public var emissionEnergy: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_GET_EMISSION_ENERGY, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_SET_EMISSION_ENERGY, NIL)
    }

  /**
   * Changes the [godot.core.Color] of the Decal by multiplying the albedo and emission colors with this value. The alpha component is only taken into account when multiplying the albedo color, not the emission color. See also [emissionEnergy] and [albedoMix] to change the emission and albedo intensity independently of each other.
   */
  @CoreTypeLocalCopy
  public var modulate: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_GET_MODULATE, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_SET_MODULATE, NIL)
    }

  /**
   * Blends the albedo [godot.core.Color] of the decal with albedo [godot.core.Color] of the underlying mesh. This can be set to `0.0` to create a decal that only affects normal or ORM. In this case, an albedo texture is still required as its alpha channel will determine where the normal and ORM will be overridden. See also [modulate].
   */
  public var albedoMix: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_GET_ALBEDO_MIX, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_SET_ALBEDO_MIX, NIL)
    }

  /**
   * Fades the Decal if the angle between the Decal's [AABB] and the target surface becomes too large. A value of `0` projects the Decal regardless of angle, a value of `1` limits the Decal to surfaces that are nearly perpendicular.
   *
   * **Note:** Setting [normalFade] to a value greater than `0.0` has a small performance cost due to the added normal angle computations.
   */
  public var normalFade: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_GET_NORMAL_FADE, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_SET_NORMAL_FADE, NIL)
    }

  /**
   * Sets the curve over which the decal will fade as the surface gets further from the center of the [AABB]. Only positive values are valid (negative values will be clamped to `0.0`). See also [lowerFade].
   */
  public var upperFade: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_GET_UPPER_FADE, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_SET_UPPER_FADE, NIL)
    }

  /**
   * Sets the curve over which the decal will fade as the surface gets further from the center of the [AABB]. Only positive values are valid (negative values will be clamped to `0.0`). See also [upperFade].
   */
  public var lowerFade: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_GET_LOWER_FADE, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_SET_LOWER_FADE, NIL)
    }

  /**
   * If `true`, decals will smoothly fade away when far from the active [godot.Camera3D] starting at [distanceFadeBegin]. The Decal will fade out over [distanceFadeBegin] + [distanceFadeLength], after which it will be culled and not sent to the shader at all. Use this to reduce the number of active Decals in a scene and thus improve performance.
   */
  public var distanceFadeEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_IS_DISTANCE_FADE_ENABLED,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_SET_ENABLE_DISTANCE_FADE,
          NIL)
    }

  /**
   * The distance from the camera at which the Decal begins to fade away (in 3D units).
   */
  public var distanceFadeBegin: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_GET_DISTANCE_FADE_BEGIN,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_SET_DISTANCE_FADE_BEGIN,
          NIL)
    }

  /**
   * The distance over which the Decal fades (in 3D units). The Decal becomes slowly more transparent over this distance and is completely invisible at the end. Higher values result in a smoother fade-out transition, which is more suited when the camera moves fast.
   */
  public var distanceFadeLength: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_GET_DISTANCE_FADE_LENGTH,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_SET_DISTANCE_FADE_LENGTH,
          NIL)
    }

  /**
   * Specifies which [godot.VisualInstance3D.layers] this decal will project on. By default, Decals affect all layers. This is used so you can specify which types of objects receive the Decal and which do not. This is especially useful so you can ensure that dynamic objects don't accidentally receive a Decal intended for the terrain under them.
   */
  public var cullMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_GET_CULL_MASK, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_SET_CULL_MASK, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_DECAL, scriptIndex)
    return true
  }

  /**
   * Sets the size of the [AABB] used by the decal. All dimensions must be set to a value greater than zero (they will be clamped to `0.001` if this is not the case). The AABB goes from `-size/2` to `size/2`.
   *
   * **Note:** To improve culling efficiency of "hard surface" decals, set their [upperFade] and [lowerFade] to `0.0` and set the Y component of the [size] as low as possible. This will reduce the decals' AABB size without affecting their appearance.
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
   * val myCoreType = decal.size
   * //Your changes
   * decal.size = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun sizeMutate(block: Vector3.() -> Unit): Vector3 = size.apply{
      block(this)
      size = this
  }


  /**
   * Changes the [godot.core.Color] of the Decal by multiplying the albedo and emission colors with this value. The alpha component is only taken into account when multiplying the albedo color, not the emission color. See also [emissionEnergy] and [albedoMix] to change the emission and albedo intensity independently of each other.
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
   * val myCoreType = decal.modulate
   * //Your changes
   * decal.modulate = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun modulateMutate(block: Color.() -> Unit): Color = modulate.apply{
      block(this)
      modulate = this
  }


  public enum class DecalTexture(
    id: Long,
  ) {
    /**
     * [godot.Texture2D] corresponding to [textureAlbedo].
     */
    TEXTURE_ALBEDO(0),
    /**
     * [godot.Texture2D] corresponding to [textureNormal].
     */
    TEXTURE_NORMAL(1),
    /**
     * [godot.Texture2D] corresponding to [textureOrm].
     */
    TEXTURE_ORM(2),
    /**
     * [godot.Texture2D] corresponding to [textureEmission].
     */
    TEXTURE_EMISSION(3),
    /**
     * Max size of [enum DecalTexture] enum.
     */
    TEXTURE_MAX(4),
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
