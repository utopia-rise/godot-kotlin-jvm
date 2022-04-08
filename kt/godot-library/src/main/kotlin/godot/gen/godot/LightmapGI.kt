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
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Computes and stores baked lightmaps for fast global illumination.
 *
 * The [godot.LightmapGI] node is used to compute and store baked lightmaps. Lightmaps are used to provide high-quality indirect lighting with very little light leaking. [godot.LightmapGI] can also provide rough reflections using spherical harmonics if [directional] is enabled. Dynamic objects can receive indirect lighting thanks to *light probes*, which can be automatically placed by setting [generateProbesSubdiv]. Additional lightmap probes can also be added by creating [godot.LightmapProbe] nodes. The downside is that lightmaps are fully static and cannot be baked in an exported project. Baking a [godot.LightmapGI] node is also slower compared to [godot.VoxelGI].
 *
 * **Procedural generation:** Lightmap baking functionality is only available in the editor. This means [godot.LightmapGI] is not suited to procedurally generated or user-built levels. For procedurally generated or user-built levels, use [godot.VoxelGI] or SDFGI instead (see [godot.Environment.sdfgiEnabled]).
 *
 * **Performance:** [godot.LightmapGI] provides the best possible run-time performance for global illumination. It is suitable for low-end hardware including integrated graphics and mobile devices.
 */
@GodotBaseType
public open class LightmapGI : VisualInstance3D() {
  /**
   *
   */
  public var quality: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_GET_BAKE_QUALITY, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_SET_BAKE_QUALITY, NIL)
    }

  /**
   *
   */
  public var bounces: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_GET_BOUNCES, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_SET_BOUNCES, NIL)
    }

  /**
   *
   */
  public var directional: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_IS_DIRECTIONAL, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_SET_DIRECTIONAL, NIL)
    }

  /**
   *
   */
  public var interior: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_IS_INTERIOR, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_SET_INTERIOR, NIL)
    }

  /**
   *
   */
  public var useDenoiser: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_IS_USING_DENOISER,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_SET_USE_DENOISER, NIL)
    }

  /**
   *
   */
  public var bias: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_GET_BIAS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_SET_BIAS, NIL)
    }

  /**
   *
   */
  public var maxTextureSize: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_GET_MAX_TEXTURE_SIZE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_SET_MAX_TEXTURE_SIZE,
          NIL)
    }

  /**
   *
   */
  public var environmentMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_GET_ENVIRONMENT_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_SET_ENVIRONMENT_MODE,
          NIL)
    }

  /**
   *
   */
  public var environmentCustomSky: Sky?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_GET_ENVIRONMENT_CUSTOM_SKY, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Sky?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_SET_ENVIRONMENT_CUSTOM_SKY, NIL)
    }

  /**
   *
   */
  public var environmentCustomColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_GET_ENVIRONMENT_CUSTOM_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_SET_ENVIRONMENT_CUSTOM_COLOR, NIL)
    }

  /**
   *
   */
  public var environmentCustomEnergy: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_GET_ENVIRONMENT_CUSTOM_ENERGY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_SET_ENVIRONMENT_CUSTOM_ENERGY, NIL)
    }

  /**
   *
   */
  public var generateProbesSubdiv: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_GET_GENERATE_PROBES,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_SET_GENERATE_PROBES,
          NIL)
    }

  /**
   *
   */
  public var lightData: LightmapGIData?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_GET_LIGHT_DATA, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as LightmapGIData?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHTMAPGI_SET_LIGHT_DATA, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_LIGHTMAPGI)
  }

  public enum class BakeQuality(
    id: Long
  ) {
    /**
     *
     */
    BAKE_QUALITY_LOW(0),
    /**
     *
     */
    BAKE_QUALITY_MEDIUM(1),
    /**
     *
     */
    BAKE_QUALITY_HIGH(2),
    /**
     *
     */
    BAKE_QUALITY_ULTRA(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class BakeError(
    id: Long
  ) {
    /**
     *
     */
    BAKE_ERROR_OK(0),
    /**
     *
     */
    BAKE_ERROR_NO_LIGHTMAPPER(1),
    /**
     *
     */
    BAKE_ERROR_NO_SAVE_PATH(2),
    /**
     *
     */
    BAKE_ERROR_NO_MESHES(3),
    /**
     *
     */
    BAKE_ERROR_MESHES_INVALID(4),
    /**
     *
     */
    BAKE_ERROR_CANT_CREATE_IMAGE(5),
    /**
     *
     */
    BAKE_ERROR_USER_ABORTED(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class GenerateProbes(
    id: Long
  ) {
    /**
     *
     */
    GENERATE_PROBES_DISABLED(0),
    /**
     *
     */
    GENERATE_PROBES_SUBDIV_4(1),
    /**
     *
     */
    GENERATE_PROBES_SUBDIV_8(2),
    /**
     *
     */
    GENERATE_PROBES_SUBDIV_16(3),
    /**
     *
     */
    GENERATE_PROBES_SUBDIV_32(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class EnvironmentMode(
    id: Long
  ) {
    /**
     *
     */
    ENVIRONMENT_MODE_DISABLED(0),
    /**
     *
     */
    ENVIRONMENT_MODE_SCENE(1),
    /**
     *
     */
    ENVIRONMENT_MODE_CUSTOM_SKY(2),
    /**
     *
     */
    ENVIRONMENT_MODE_CUSTOM_COLOR(3),
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
