// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * The [Sky] class uses a [Material] to render a 3D environment's background and the light it emits
 * by updating the reflection/radiance cubemaps.
 */
@GodotBaseType
public open class Sky : Resource() {
  /**
   * [Material] used to draw the background. Can be [PanoramaSkyMaterial], [ProceduralSkyMaterial],
   * [PhysicalSkyMaterial], or even a [ShaderMaterial] if you want to use your own custom shader.
   */
  public final inline var skyMaterial: Material?
    @JvmName("skyMaterialProperty")
    get() = getMaterial()
    @JvmName("skyMaterialProperty")
    set(`value`) {
      setMaterial(value)
    }

  /**
   * Sets the method for generating the radiance map from the sky. The radiance map is a cubemap
   * with increasingly blurry versions of the sky corresponding to different levels of roughness.
   * Radiance maps can be expensive to calculate. See [ProcessMode] for options.
   */
  public final inline var processMode: ProcessMode
    @JvmName("processModeProperty")
    get() = getProcessMode()
    @JvmName("processModeProperty")
    set(`value`) {
      setProcessMode(value)
    }

  /**
   * The [Sky]'s radiance map size. The higher the radiance map size, the more detailed the lighting
   * from the [Sky] will be.
   * See [RadianceSize] constants for values.
   * **Note:** Some hardware will have trouble with higher radiance sizes, especially
   * [RADIANCE_SIZE_512] and above. Only use such high values on high-end hardware.
   */
  public final inline var radianceSize: RadianceSize
    @JvmName("radianceSizeProperty")
    get() = getRadianceSize()
    @JvmName("radianceSizeProperty")
    set(`value`) {
      setRadianceSize(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_SKY, scriptIndex)
  }

  public final fun setRadianceSize(size: RadianceSize): Unit {
    TransferContext.writeArguments(LONG to size.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setRadianceSizePtr, NIL)
  }

  public final fun getRadianceSize(): RadianceSize {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRadianceSizePtr, LONG)
    return Sky.RadianceSize.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setProcessMode(mode: ProcessMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setProcessModePtr, NIL)
  }

  public final fun getProcessMode(): ProcessMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getProcessModePtr, LONG)
    return Sky.ProcessMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setMaterial(material: Material?): Unit {
    TransferContext.writeArguments(OBJECT to material)
    TransferContext.callMethod(rawPtr, MethodBindings.setMaterialPtr, NIL)
  }

  public final fun getMaterial(): Material? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMaterialPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Material?)
  }

  public enum class RadianceSize(
    id: Long,
  ) {
    /**
     * Radiance texture size is 32×32 pixels.
     */
    RADIANCE_SIZE_32(0),
    /**
     * Radiance texture size is 64×64 pixels.
     */
    RADIANCE_SIZE_64(1),
    /**
     * Radiance texture size is 128×128 pixels.
     */
    RADIANCE_SIZE_128(2),
    /**
     * Radiance texture size is 256×256 pixels.
     */
    RADIANCE_SIZE_256(3),
    /**
     * Radiance texture size is 512×512 pixels.
     */
    RADIANCE_SIZE_512(4),
    /**
     * Radiance texture size is 1024×1024 pixels.
     */
    RADIANCE_SIZE_1024(5),
    /**
     * Radiance texture size is 2048×2048 pixels.
     */
    RADIANCE_SIZE_2048(6),
    /**
     * Represents the size of the [RadianceSize] enum.
     */
    RADIANCE_SIZE_MAX(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): RadianceSize = entries.single { it.id == `value` }
    }
  }

  public enum class ProcessMode(
    id: Long,
  ) {
    /**
     * Automatically selects the appropriate process mode based on your sky shader. If your shader
     * uses `TIME` or `POSITION`, this will use [PROCESS_MODE_REALTIME]. If your shader uses any of the
     * `LIGHT_*` variables or any custom uniforms, this uses [PROCESS_MODE_INCREMENTAL]. Otherwise,
     * this defaults to [PROCESS_MODE_QUALITY].
     */
    PROCESS_MODE_AUTOMATIC(0),
    /**
     * Uses high quality importance sampling to process the radiance map. In general, this results
     * in much higher quality than [PROCESS_MODE_REALTIME] but takes much longer to generate. This
     * should not be used if you plan on changing the sky at runtime. If you are finding that the
     * reflection is not blurry enough and is showing sparkles or fireflies, try increasing
     * [ProjectSettings.rendering/reflections/skyReflections/ggxSamples].
     */
    PROCESS_MODE_QUALITY(1),
    /**
     * Uses the same high quality importance sampling to process the radiance map as
     * [PROCESS_MODE_QUALITY], but updates over several frames. The number of frames is determined by
     * [ProjectSettings.rendering/reflections/skyReflections/roughnessLayers]. Use this when you need
     * highest quality radiance maps, but have a sky that updates slowly.
     */
    PROCESS_MODE_INCREMENTAL(2),
    /**
     * Uses the fast filtering algorithm to process the radiance map. In general this results in
     * lower quality, but substantially faster run times. If you need better quality, but still need to
     * update the sky every frame, consider turning on
     * [ProjectSettings.rendering/reflections/skyReflections/fastFilterHighQuality].
     * **Note:** The fast filtering algorithm is limited to 256×256 cubemaps, so [radianceSize] must
     * be set to [RADIANCE_SIZE_256]. Otherwise, a warning is printed and the overridden radiance size
     * is ignored.
     */
    PROCESS_MODE_REALTIME(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ProcessMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setRadianceSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Sky", "set_radiance_size", 1512957179)

    public val getRadianceSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Sky", "get_radiance_size", 2708733976)

    public val setProcessModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Sky", "set_process_mode", 875986769)

    public val getProcessModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Sky", "get_process_mode", 731245043)

    public val setMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Sky", "set_material", 2757459619)

    public val getMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Sky", "get_material", 5934680)
  }
}
