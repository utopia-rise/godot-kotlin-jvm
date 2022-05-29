// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
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
 * Real-time global illumination (GI) probe.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/678](https://godotengine.org/asset-library/asset/678)
 *
 * [godot.GIProbe]s are used to provide high-quality real-time indirect light to scenes. They precompute the effect of objects that emit light and the effect of static geometry to simulate the behavior of complex light in real-time. [godot.GIProbe]s need to be baked before using, however, once baked, dynamic objects will receive light from them. Further, lights can be fully dynamic or baked.
 *
 * Having [godot.GIProbe]s in a scene can be expensive, the quality of the probe can be turned down in exchange for better performance in the [godot.ProjectSettings] using [godot.ProjectSettings.rendering/quality/voxelConeTracing/highQuality].
 *
 * **Procedural generation:** [godot.GIProbe] can be baked in an exported project, which makes it suitable for procedurally generated or user-built levels as long as all the geometry is generated in advance.
 *
 * **Performance:** [godot.GIProbe] is relatively demanding on the GPU and is not suited to low-end hardware such as integrated graphics (consider [godot.BakedLightmap] instead). To provide a fallback for low-end hardware, consider adding an option to disable [godot.GIProbe] in your project's options menus. A [godot.GIProbe] node can be disabled by hiding it.
 *
 * **Note:** Meshes should have sufficiently thick walls to avoid light leaks (avoid one-sided walls). For interior levels, enclose your level geometry in a sufficiently large box and bridge the loops to close the mesh. To further prevent light leaks, you can also strategically place temporary [godot.MeshInstance] nodes with [godot.GeometryInstance.useInBakedLight] enabled. These temporary nodes can then be hidden after baking the [godot.GIProbe] node.
 *
 * **Note:** Due to a renderer limitation, emissive [godot.ShaderMaterial]s cannot emit light when used in a [godot.GIProbe]. Only emissive [godot.SpatialMaterial]s can emit light in a [godot.GIProbe].
 */
@GodotBaseType
public open class GIProbe : VisualInstance() {
  /**
   * Offsets the lookup of the light contribution from the [godot.GIProbe]. This can be used to avoid self-shadowing, but may introduce light leaking at higher values. This and [normalBias] should be played around with to minimize self-shadowing and light leaking.
   *
   * **Note:** `bias` should usually be above 1.0 as that is the size of the voxels.
   */
  public open var bias: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GIPROBE_GET_BIAS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GIPROBE_SET_BIAS, NIL)
    }

  /**
   * *Deprecated.* This property has been deprecated due to known bugs and no longer has any effect when enabled.
   */
  public open var compress: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GIPROBE_GET_COMPRESS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GIPROBE_SET_COMPRESS, NIL)
    }

  /**
   * The [godot.GIProbeData] resource that holds the data for this [godot.GIProbe].
   */
  public open var `data`: GIProbeData?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GIPROBE_GET_DATA, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as GIProbeData?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GIPROBE_SET_DATA, NIL)
    }

  /**
   * The maximum brightness that the [godot.GIProbe] will recognize. Brightness will be scaled within this range.
   */
  public open var dynamicRange: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GIPROBE_GET_DYNAMIC_RANGE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GIPROBE_SET_DYNAMIC_RANGE, NIL)
    }

  /**
   * Energy multiplier. Makes the lighting contribution from the [godot.GIProbe] brighter.
   */
  public open var energy: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GIPROBE_GET_ENERGY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GIPROBE_SET_ENERGY, NIL)
    }

  /**
   * The size of the area covered by the [godot.GIProbe]. If you make the extents larger without increasing the subdivisions with [subdiv], the size of each cell will increase and result in lower detailed lighting.
   */
  public open var extents: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GIPROBE_GET_EXTENTS, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GIPROBE_SET_EXTENTS, NIL)
    }

  /**
   * If `true`, ignores the sky contribution when calculating lighting.
   */
  public open var interior: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GIPROBE_GET_INTERIOR, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GIPROBE_SET_INTERIOR, NIL)
    }

  /**
   * Offsets the lookup into the [godot.GIProbe] based on the object's normal direction. Can be used to reduce some self-shadowing artifacts.
   */
  public open var normalBias: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GIPROBE_GET_NORMAL_BIAS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GIPROBE_SET_NORMAL_BIAS, NIL)
    }

  /**
   * How much light propagates through the probe internally. A higher value allows light to spread further.
   */
  public open var propagation: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GIPROBE_GET_PROPAGATION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GIPROBE_SET_PROPAGATION, NIL)
    }

  /**
   * Number of times to subdivide the grid that the [godot.GIProbe] operates on. A higher number results in finer detail and thus higher visual quality, while lower numbers result in better performance.
   */
  public open var subdiv: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GIPROBE_GET_SUBDIV, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GIPROBE_SET_SUBDIV, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_GIPROBE)
  }

  @CoreTypeHelper
  public open fun extents(schedule: Vector3.() -> Unit): Vector3 = extents.apply{
      schedule(this)
      extents = this
  }


  /**
   * Bakes the effect from all [godot.GeometryInstance]s marked with [godot.GeometryInstance.useInBakedLight] and [godot.Light]s marked with either [godot.Light.BAKE_INDIRECT] or [godot.Light.BAKE_ALL]. If `create_visual_debug` is `true`, after baking the light, this will generate a [godot.MultiMesh] that has a cube representing each solid cell with each cube colored to the cell's albedo color. This can be used to visualize the [godot.GIProbe]'s data and debug any issues that may be occurring.
   *
   * **Note:** [bake] works from the editor and in exported projects. This makes it suitable for procedurally generated or user-built levels. Baking a [godot.GIProbe] generally takes from 5 to 20 seconds in most scenes. Reducing [subdiv] can speed up baking.
   *
   * **Note:** [godot.GeometryInstance]s and [godot.Light]s must be fully ready before [bake] is called. If you are procedurally creating those and some meshes or lights are missing from your baked [godot.GIProbe], use `call_deferred("bake")` instead of calling [bake] directly.
   */
  public open fun bake(fromNode: Node? = null, createVisualDebug: Boolean = false): Unit {
    TransferContext.writeArguments(OBJECT to fromNode, BOOL to createVisualDebug)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GIPROBE_BAKE, NIL)
  }

  /**
   * Calls [bake] with `create_visual_debug` enabled.
   */
  public open fun debugBake(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GIPROBE_DEBUG_BAKE, NIL)
  }

  public enum class Subdiv(
    id: Long
  ) {
    /**
     * Use 64 subdivisions. This is the lowest quality setting, but the fastest. Use it if you can, but especially use it on lower-end hardware.
     */
    SUBDIV_64(0),
    /**
     * Use 128 subdivisions. This is the default quality setting.
     */
    SUBDIV_128(1),
    /**
     * Use 256 subdivisions.
     */
    SUBDIV_256(2),
    /**
     * Use 512 subdivisions. This is the highest quality setting, but the slowest. On lower-end hardware, this could cause the GPU to stall.
     */
    SUBDIV_512(3),
    /**
     * Represents the size of the [enum Subdiv] enum.
     */
    SUBDIV_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * Use 128 subdivisions. This is the default quality setting.
     */
    public final const val SUBDIV_128: Long = 1

    /**
     * Use 256 subdivisions.
     */
    public final const val SUBDIV_256: Long = 2

    /**
     * Use 512 subdivisions. This is the highest quality setting, but the slowest. On lower-end hardware, this could cause the GPU to stall.
     */
    public final const val SUBDIV_512: Long = 3

    /**
     * Use 64 subdivisions. This is the lowest quality setting, but the fastest. Use it if you can, but especially use it on lower-end hardware.
     */
    public final const val SUBDIV_64: Long = 0

    /**
     * Represents the size of the [enum Subdiv] enum.
     */
    public final const val SUBDIV_MAX: Long = 4
  }
}
