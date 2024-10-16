// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Occlusion culling can improve rendering performance in closed/semi-open areas by hiding geometry
 * that is occluded by other objects.
 * The occlusion culling system is mostly static. [OccluderInstance3D]s can be moved or hidden at
 * run-time, but doing so will trigger a background recomputation that can take several frames. It is
 * recommended to only move [OccluderInstance3D]s sporadically (e.g. for procedural generation
 * purposes), rather than doing so every frame.
 * The occlusion culling system works by rendering the occluders on the CPU in parallel using
 * [url=https://www.embree.org/]Embree[/url], drawing the result to a low-resolution buffer then using
 * this to cull 3D nodes individually. In the 3D editor, you can preview the occlusion culling buffer
 * by choosing **Perspective > Debug Advanced... > Occlusion Culling Buffer** in the top-left corner of
 * the 3D viewport. The occlusion culling buffer quality can be adjusted in the Project Settings.
 * **Baking:** Select an [OccluderInstance3D] node, then use the **Bake Occluders** button at the
 * top of the 3D editor. Only opaque materials will be taken into account; transparent materials
 * (alpha-blended or alpha-tested) will be ignored by the occluder generation.
 * **Note:** Occlusion culling is only effective if
 * [ProjectSettings.rendering/occlusionCulling/useOcclusionCulling] is `true`. Enabling occlusion
 * culling has a cost on the CPU. Only enable occlusion culling if you actually plan to use it. Large
 * open scenes with few or no objects blocking the view will generally not benefit much from occlusion
 * culling. Large open scenes generally benefit more from mesh LOD and visibility ranges
 * ([GeometryInstance3D.visibilityRangeBegin] and [GeometryInstance3D.visibilityRangeEnd]) compared to
 * occlusion culling.
 * **Note:** Due to memory constraints, occlusion culling is not supported by default in Web export
 * templates. It can be enabled by compiling custom Web export templates with
 * `module_raycast_enabled=yes`.
 */
@GodotBaseType
public open class OccluderInstance3D : VisualInstance3D() {
  /**
   * The occluder resource for this [OccluderInstance3D]. You can generate an occluder resource by
   * selecting an [OccluderInstance3D] node then using the **Bake Occluders** button at the top of the
   * editor.
   * You can also draw your own 2D occluder polygon by adding a new [PolygonOccluder3D] resource to
   * the [occluder] property in the Inspector.
   * Alternatively, you can select a primitive occluder to use: [QuadOccluder3D], [BoxOccluder3D] or
   * [SphereOccluder3D].
   */
  public final inline var occluder: Occluder3D?
    @JvmName("occluderProperty")
    get() = getOccluder()
    @JvmName("occluderProperty")
    set(`value`) {
      setOccluder(value)
    }

  /**
   * The visual layers to account for when baking for occluders. Only [MeshInstance3D]s whose
   * [VisualInstance3D.layers] match with this [bakeMask] will be included in the generated occluder
   * mesh. By default, all objects with *opaque* materials are taken into account for the occluder
   * baking.
   * To improve performance and avoid artifacts, it is recommended to exclude dynamic objects, small
   * objects and fixtures from the baking process by moving them to a separate visual layer and
   * excluding this layer in [bakeMask].
   */
  public final inline var bakeMask: Long
    @JvmName("bakeMaskProperty")
    get() = getBakeMask()
    @JvmName("bakeMaskProperty")
    set(`value`) {
      setBakeMask(value)
    }

  /**
   * The simplification distance to use for simplifying the generated occluder polygon (in 3D
   * units). Higher values result in a less detailed occluder mesh, which improves performance but
   * reduces culling accuracy.
   * The occluder geometry is rendered on the CPU, so it is important to keep its geometry as simple
   * as possible. Since the buffer is rendered at a low resolution, less detailed occluder meshes
   * generally still work well. The default value is fairly aggressive, so you may have to decrease it
   * if you run into false negatives (objects being occluded even though they are visible by the
   * camera). A value of `0.01` will act conservatively, and will keep geometry *perceptually*
   * unaffected in the occlusion culling buffer. Depending on the scene, a value of `0.01` may still
   * simplify the mesh noticeably compared to disabling simplification entirely.
   * Setting this to `0.0` disables simplification entirely, but vertices in the exact same position
   * will still be merged. The mesh will also be re-indexed to reduce both the number of vertices and
   * indices.
   * **Note:** This uses the [url=https://meshoptimizer.org/]meshoptimizer[/url] library under the
   * hood, similar to LOD generation.
   */
  public final inline var bakeSimplificationDistance: Float
    @JvmName("bakeSimplificationDistanceProperty")
    get() = getBakeSimplificationDistance()
    @JvmName("bakeSimplificationDistanceProperty")
    set(`value`) {
      setBakeSimplificationDistance(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_OCCLUDERINSTANCE3D, scriptIndex)
  }

  public final fun setBakeMask(mask: Long): Unit {
    TransferContext.writeArguments(LONG to mask)
    TransferContext.callMethod(ptr, MethodBindings.setBakeMaskPtr, NIL)
  }

  public final fun getBakeMask(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBakeMaskPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [bakeMask], given a
   * [layerNumber] between 1 and 32.
   */
  public final fun setBakeMaskValue(layerNumber: Int, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(ptr, MethodBindings.setBakeMaskValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [bakeMask] is enabled, given a [layerNumber]
   * between 1 and 32.
   */
  public final fun getBakeMaskValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getBakeMaskValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setBakeSimplificationDistance(simplificationDistance: Float): Unit {
    TransferContext.writeArguments(DOUBLE to simplificationDistance.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setBakeSimplificationDistancePtr, NIL)
  }

  public final fun getBakeSimplificationDistance(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBakeSimplificationDistancePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setOccluder(occluder: Occluder3D?): Unit {
    TransferContext.writeArguments(OBJECT to occluder)
    TransferContext.callMethod(ptr, MethodBindings.setOccluderPtr, NIL)
  }

  public final fun getOccluder(): Occluder3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOccluderPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Occluder3D?)
  }

  public companion object

  internal object MethodBindings {
    public val setBakeMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OccluderInstance3D", "set_bake_mask", 1286410249)

    public val getBakeMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OccluderInstance3D", "get_bake_mask", 3905245786)

    public val setBakeMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OccluderInstance3D", "set_bake_mask_value", 300928843)

    public val getBakeMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OccluderInstance3D", "get_bake_mask_value", 1116898809)

    public val setBakeSimplificationDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OccluderInstance3D", "set_bake_simplification_distance", 373806689)

    public val getBakeSimplificationDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OccluderInstance3D", "get_bake_simplification_distance", 1740695150)

    public val setOccluderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OccluderInstance3D", "set_occluder", 1664878165)

    public val getOccluderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OccluderInstance3D", "get_occluder", 1696836198)
  }
}
