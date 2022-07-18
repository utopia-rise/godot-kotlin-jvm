// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

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
 * Node that projects a texture onto a [godot.MeshInstance3D].
 *
 * [godot.Decal]s are used to project a texture onto a [godot.Mesh] in the scene. Use Decals to add detail to a scene without affecting the underlying [godot.Mesh]. They are often used to add weathering to building, add dirt or mud to the ground, or add variety to props. Decals can be moved at any time, making them suitable for things like blob shadows or laser sight dots.
 *
 * They are made of an [AABB] and a group of [godot.Texture2D]s specifying [godot.core.Color], normal, ORM (ambient occlusion, roughness, metallic), and emission. Decals are projected within their [AABB] so altering the orientation of the Decal affects the direction in which they are projected. By default, Decals are projected down (i.e. from positive Y to negative Y).
 *
 * The [godot.Texture2D]s associated with the Decal are automatically stored in a texture atlas which is used for drawing the decals so all decals can be drawn at once. Godot uses clustered decals, meaning they are stored in cluster data and drawn when the mesh is drawn, they are not drawn as a post-processing effect after.
 *
 * **Note:** Decals cannot affect an underlying material's transparency, regardless of its transparency mode (alpha blend, alpha scissor, alpha hash, opaque pre-pass). This means translucent or transparent areas of a material will remain translucent or transparent even if an opaque decal is applied on them.
 */
@GodotBaseType
public open class Decal : VisualInstance3D() {
  /**
   * Sets the size of the [AABB] used by the decal. The AABB goes from `-extents` to `extents`.
   */
  public var extents: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_GET_EXTENTS, VECTOR3.ordinal)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_SET_EXTENTS, NIL.ordinal)
    }

  /**
   * Energy multiplier for the emission texture. This will make the decal emit light at a higher intensity.
   */
  public var emissionEnergy: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_GET_EMISSION_ENERGY,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_SET_EMISSION_ENERGY, NIL.ordinal)
    }

  /**
   * Changes the [godot.core.Color] of the Decal by multiplying it with this value.
   */
  public var modulate: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_GET_MODULATE, COLOR.ordinal)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_SET_MODULATE, NIL.ordinal)
    }

  /**
   * Blends the albedo [godot.core.Color] of the decal with albedo [godot.core.Color] of the underlying mesh.
   */
  public var albedoMix: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_GET_ALBEDO_MIX, DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_SET_ALBEDO_MIX, NIL.ordinal)
    }

  /**
   * Fades the Decal if the angle between the Decal's [AABB] and the target surface becomes too large. A value of `0` projects the Decal regardless of angle, a value of `1` limits the Decal to surfaces that are nearly perpendicular.
   */
  public var normalFade: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_GET_NORMAL_FADE, DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_SET_NORMAL_FADE, NIL.ordinal)
    }

  /**
   * Sets the curve over which the decal will fade as the surface gets further from the center of the [AABB]. Only positive values are valid (negative values will be clamped to `0.0`).
   */
  public var upperFade: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_GET_UPPER_FADE, DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_SET_UPPER_FADE, NIL.ordinal)
    }

  /**
   * Sets the curve over which the decal will fade as the surface gets further from the center of the [AABB]. Only positive values are valid (negative values will be clamped to `0.0`).
   */
  public var lowerFade: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_GET_LOWER_FADE, DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_SET_LOWER_FADE, NIL.ordinal)
    }

  /**
   * If `true`, decals will smoothly fade away when far from the active [godot.Camera3D] starting at [distanceFadeBegin]. The Decal will fade out over [distanceFadeLength], after which it will be culled and not sent to the shader at all. Use this to reduce the number of active Decals in a scene and thus improve performance.
   */
  public var distanceFadeEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_IS_DISTANCE_FADE_ENABLED,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_SET_ENABLE_DISTANCE_FADE,
          NIL.ordinal)
    }

  /**
   * Distance from the camera at which the Decal begins to fade away.
   */
  public var distanceFadeBegin: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_GET_DISTANCE_FADE_BEGIN,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_SET_DISTANCE_FADE_BEGIN,
          NIL.ordinal)
    }

  /**
   * Distance over which the Decal fades. The Decal becomes slowly more transparent over this distance and is completely invisible at the end.
   */
  public var distanceFadeLength: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_GET_DISTANCE_FADE_LENGTH,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_SET_DISTANCE_FADE_LENGTH,
          NIL.ordinal)
    }

  /**
   * Specifies which [godot.VisualInstance3D.layers] this decal will project on. By default, Decals affect all layers. This is used so you can specify which types of objects receive the Decal and which do not. This is especially useful so you can ensure that dynamic objects don't accidentally receive a Decal intended for the terrain under them.
   */
  public var cullMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_GET_CULL_MASK, LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_SET_CULL_MASK, NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_DECAL)
  }

  /**
   * Sets the [godot.Texture2D] associated with the specified [enum DecalTexture]. This is a convenience method, in most cases you should access the texture directly.
   *
   * For example, instead of `$Decal.set_texture(Decal.TEXTURE_ALBEDO, albedo_tex)`, use `$Decal.texture_albedo = albedo_tex`.
   *
   * One case where this is better than accessing the texture directly is when you want to copy one Decal's textures to another. For example:
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * for i in Decal.TEXTURE_MAX:
   *
   *     $NewDecal.set_texture(i, $OldDecal.get_texture(i))
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * for (int i = 0; i < (int)Decal.DecalTexture.Max; i++)
   *
   * {
   *
   *     GetNode<Decal>("NewDecal").SetTexture(i, GetNode<Decal>("OldDecal").GetTexture(i));
   *
   * }
   *
   * [/csharp]
   *
   * [/codeblocks]
   */
  public fun setTexture(type: Decal.DecalTexture, texture: Texture2D): Unit {
    TransferContext.writeArguments(LONG to type.id, OBJECT to texture)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_SET_TEXTURE, NIL.ordinal)
  }

  /**
   * Returns the [godot.Texture2D] associated with the specified [enum DecalTexture]. This is a convenience method, in most cases you should access the texture directly.
   *
   * For example, instead of `albedo_tex = $Decal.get_texture(Decal.TEXTURE_ALBEDO)`, use `albedo_tex = $Decal.texture_albedo`.
   *
   * One case where this is better than accessing the texture directly is when you want to copy one Decal's textures to another. For example:
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * for i in Decal.TEXTURE_MAX:
   *
   *     $NewDecal.set_texture(i, $OldDecal.get_texture(i))
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * for (int i = 0; i < (int)Decal.DecalTexture.Max; i++)
   *
   * {
   *
   *     GetNode<Decal>("NewDecal").SetTexture(i, GetNode<Decal>("OldDecal").GetTexture(i));
   *
   * }
   *
   * [/csharp]
   *
   * [/codeblocks]
   */
  public fun getTexture(type: Decal.DecalTexture): Texture2D? {
    TransferContext.writeArguments(LONG to type.id)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_DECAL_GET_TEXTURE, OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
  }

  public enum class DecalTexture(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
