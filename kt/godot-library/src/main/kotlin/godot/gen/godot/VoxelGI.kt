// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * [VoxelGI]s are used to provide high-quality real-time indirect light and reflections to scenes.
 * They precompute the effect of objects that emit light and the effect of static geometry to simulate
 * the behavior of complex light in real-time. [VoxelGI]s need to be baked before having a visible
 * effect. However, once baked, dynamic objects will receive light from them. Furthermore, lights can
 * be fully dynamic or baked.
 * **Note:** [VoxelGI] is only supported in the Forward+ rendering method, not Mobile or
 * Compatibility.
 * **Procedural generation:** [VoxelGI] can be baked in an exported project, which makes it suitable
 * for procedurally generated or user-built levels as long as all the geometry is generated in advance.
 * For games where geometry is generated at any time during gameplay, SDFGI is more suitable (see
 * [Environment.sdfgiEnabled]).
 * **Performance:** [VoxelGI] is relatively demanding on the GPU and is not suited to low-end
 * hardware such as integrated graphics (consider [LightmapGI] instead). To improve performance, adjust
 * [ProjectSettings.rendering/globalIllumination/voxelGi/quality] and enable
 * [ProjectSettings.rendering/globalIllumination/gi/useHalfResolution] in the Project Settings. To
 * provide a fallback for low-end hardware, consider adding an option to disable [VoxelGI] in your
 * project's options menus. A [VoxelGI] node can be disabled by hiding it.
 * **Note:** Meshes should have sufficiently thick walls to avoid light leaks (avoid one-sided
 * walls). For interior levels, enclose your level geometry in a sufficiently large box and bridge the
 * loops to close the mesh. To further prevent light leaks, you can also strategically place temporary
 * [MeshInstance3D] nodes with their [GeometryInstance3D.giMode] set to
 * [GeometryInstance3D.GI_MODE_STATIC]. These temporary nodes can then be hidden after baking the
 * [VoxelGI] node.
 */
@GodotBaseType
public open class VoxelGI : VisualInstance3D() {
  /**
   * Number of times to subdivide the grid that the [VoxelGI] operates on. A higher number results
   * in finer detail and thus higher visual quality, while lower numbers result in better performance.
   */
  public var subdiv: Subdiv
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSubdivPtr, LONG)
      return VoxelGI.Subdiv.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setSubdivPtr, NIL)
    }

  /**
   * The size of the area covered by the [VoxelGI]. If you make the size larger without increasing
   * the subdivisions with [subdiv], the size of each cell will increase and result in lower detailed
   * lighting.
   * **Note:** Size is clamped to 1.0 unit or more on each axis.
   */
  @CoreTypeLocalCopy
  public var size: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSizePtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSizePtr, NIL)
    }

  /**
   * The [CameraAttributes] resource that specifies exposure levels to bake at. Auto-exposure and
   * non exposure properties will be ignored. Exposure settings should be used to reduce the dynamic
   * range present when baking. If exposure is too high, the [VoxelGI] will have banding artifacts or
   * may have over-exposure artifacts.
   */
  public var cameraAttributes: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCameraAttributesPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Material?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCameraAttributesPtr, NIL)
    }

  /**
   * The [VoxelGIData] resource that holds the data for this [VoxelGI].
   */
  public var `data`: VoxelGIData?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getProbeDataPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as VoxelGIData?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setProbeDataPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_VOXELGI, scriptIndex)
  }

  /**
   * The size of the area covered by the [VoxelGI]. If you make the size larger without increasing
   * the subdivisions with [subdiv], the size of each cell will increase and result in lower detailed
   * lighting.
   * **Note:** Size is clamped to 1.0 unit or more on each axis.
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
   * val myCoreType = voxelgi.size
   * //Your changes
   * voxelgi.size = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun sizeMutate(block: Vector3.() -> Unit): Vector3 = size.apply{
      block(this)
      size = this
  }


  /**
   * Bakes the effect from all [GeometryInstance3D]s marked with [GeometryInstance3D.GI_MODE_STATIC]
   * and [Light3D]s marked with either [Light3D.BAKE_STATIC] or [Light3D.BAKE_DYNAMIC]. If
   * [createVisualDebug] is `true`, after baking the light, this will generate a [MultiMesh] that has a
   * cube representing each solid cell with each cube colored to the cell's albedo color. This can be
   * used to visualize the [VoxelGI]'s data and debug any issues that may be occurring.
   * **Note:** [bake] works from the editor and in exported projects. This makes it suitable for
   * procedurally generated or user-built levels. Baking a [VoxelGI] node generally takes from 5 to 20
   * seconds in most scenes. Reducing [subdiv] can speed up baking.
   * **Note:** [GeometryInstance3D]s and [Light3D]s must be fully ready before [bake] is called. If
   * you are procedurally creating those and some meshes or lights are missing from your baked
   * [VoxelGI], use `call_deferred("bake")` instead of calling [bake] directly.
   */
  @JvmOverloads
  public fun bake(fromNode: Node? = null, createVisualDebug: Boolean = false): Unit {
    TransferContext.writeArguments(OBJECT to fromNode, BOOL to createVisualDebug)
    TransferContext.callMethod(rawPtr, MethodBindings.bakePtr, NIL)
  }

  /**
   * Calls [bake] with `create_visual_debug` enabled.
   */
  public fun debugBake(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.debugBakePtr, NIL)
  }

  public enum class Subdiv(
    id: Long,
  ) {
    /**
     * Use 64 subdivisions. This is the lowest quality setting, but the fastest. Use it if you can,
     * but especially use it on lower-end hardware.
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
     * Use 512 subdivisions. This is the highest quality setting, but the slowest. On lower-end
     * hardware, this could cause the GPU to stall.
     */
    SUBDIV_512(3),
    /**
     * Represents the size of the [Subdiv] enum.
     */
    SUBDIV_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Subdiv = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setProbeDataPtr: VoidPtr = TypeManager.getMethodBindPtr("VoxelGI", "set_probe_data")

    public val getProbeDataPtr: VoidPtr = TypeManager.getMethodBindPtr("VoxelGI", "get_probe_data")

    public val setSubdivPtr: VoidPtr = TypeManager.getMethodBindPtr("VoxelGI", "set_subdiv")

    public val getSubdivPtr: VoidPtr = TypeManager.getMethodBindPtr("VoxelGI", "get_subdiv")

    public val setSizePtr: VoidPtr = TypeManager.getMethodBindPtr("VoxelGI", "set_size")

    public val getSizePtr: VoidPtr = TypeManager.getMethodBindPtr("VoxelGI", "get_size")

    public val setCameraAttributesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGI", "set_camera_attributes")

    public val getCameraAttributesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGI", "get_camera_attributes")

    public val bakePtr: VoidPtr = TypeManager.getMethodBindPtr("VoxelGI", "bake")

    public val debugBakePtr: VoidPtr = TypeManager.getMethodBindPtr("VoxelGI", "debug_bake")
  }
}
