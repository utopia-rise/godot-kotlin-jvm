// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Real-time global illumination (GI) probe.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/678](https://godotengine.org/asset-library/asset/678)
 *
 * [godot.VoxelGI]s are used to provide high-quality real-time indirect light and reflections to scenes. They precompute the effect of objects that emit light and the effect of static geometry to simulate the behavior of complex light in real-time. [godot.VoxelGI]s need to be baked before having a visible effect. However, once baked, dynamic objects will receive light from them. Furthermore, lights can be fully dynamic or baked.
 *
 * **Procedural generation:** [godot.VoxelGI] can be baked in an exported project, which makes it suitable for procedurally generated or user-built levels as long as all the geometry is generated in advance. For games where geometry is generated at any time during gameplay, SDFGI is more suitable (see [godot.Environment.sdfgiEnabled]).
 *
 * **Performance:** [godot.VoxelGI] is relatively demanding on the GPU and is not suited to low-end hardware such as integrated graphics (consider [godot.LightmapGI] instead). To improve performance, adjust [godot.ProjectSettings.rendering/globalIllumination/voxelGi/quality] and enable [godot.ProjectSettings.rendering/globalIllumination/gi/useHalfResolution] in the Project Settings. To provide a fallback for low-end hardware, consider adding an option to disable [godot.VoxelGI] in your project's options menus. A [godot.VoxelGI] node can be disabled by hiding it.
 *
 * **Note:** Meshes should have sufficiently thick walls to avoid light leaks (avoid one-sided walls). For interior levels, enclose your level geometry in a sufficiently large box and bridge the loops to close the mesh. To further prevent light leaks, you can also strategically place temporary [godot.MeshInstance3D] nodes with their [godot.GeometryInstance3D.giMode] set to [godot.GeometryInstance3D.GI_MODE_STATIC]. These temporary nodes can then be hidden after baking the [godot.VoxelGI] node.
 */
@GodotBaseType
public open class VoxelGI : VisualInstance3D() {
  /**
   * Number of times to subdivide the grid that the [godot.VoxelGI] operates on. A higher number results in finer detail and thus higher visual quality, while lower numbers result in better performance.
   */
  public open var subdiv: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VOXELGI_GET_SUBDIV, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VOXELGI_SET_SUBDIV, NIL)
    }

  /**
   * The size of the area covered by the [godot.VoxelGI]. If you make the extents larger without increasing the subdivisions with [subdiv], the size of each cell will increase and result in lower detailed lighting.
   */
  public open var extents: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VOXELGI_GET_EXTENTS, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VOXELGI_SET_EXTENTS, NIL)
    }

  /**
   * The [godot.VoxelGIData] resource that holds the data for this [godot.VoxelGI].
   */
  public open var `data`: VoxelGIData?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VOXELGI_GET_DATA, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as VoxelGIData?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VOXELGI_SET_DATA, NIL)
      return TransferContext.readReturnValue(NIL, true) as Unit?
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VOXELGI)
  }

  /**
   * Bakes the effect from all [godot.GeometryInstance3D]s marked with [godot.GeometryInstance3D.GI_MODE_STATIC] and [godot.Light3D]s marked with either [godot.Light3D.BAKE_STATIC] or [godot.Light3D.BAKE_DYNAMIC]. If `create_visual_debug` is `true`, after baking the light, this will generate a [godot.MultiMesh] that has a cube representing each solid cell with each cube colored to the cell's albedo color. This can be used to visualize the [godot.VoxelGI]'s data and debug any issues that may be occurring.
   *
   * **Note:** [bake] works from the editor and in exported projects. This makes it suitable for procedurally generated or user-built levels. Baking a [godot.VoxelGI] node generally takes from 5 to 20 seconds in most scenes. Reducing [subdiv] can speed up baking.
   */
  public open fun bake(fromNode: Node? = null, createVisualDebug: Boolean = false): Unit {
    TransferContext.writeArguments(OBJECT to fromNode, BOOL to createVisualDebug)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VOXELGI_BAKE, NIL)
  }

  /**
   * Calls [bake] with `create_visual_debug` enabled.
   */
  public open fun debugBake(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VOXELGI_DEBUG_BAKE, NIL)
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

  public companion object
}
