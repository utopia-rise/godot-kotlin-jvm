// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Provides occlusion culling for 3D nodes, which improves performance in closed areas.
 *
 * Occlusion culling can improve rendering performance in closed/semi-open areas by hiding geometry that is occluded by other objects.
 *
 * The occlusion culling system is mostly static. [godot.OccluderInstance3D]s can be moved or hidden at run-time, but doing so will trigger a background recomputation that can take several frames. It is recommended to only move [godot.OccluderInstance3D]s sporadically (e.g. for procedural generation purposes), rather than doing so every frame.
 *
 * The occlusion culling system works by rendering the occluders on the CPU in parallel using [godot.Embree](https://www.embree.org/), drawing the result to a low-resolution buffer then using this to cull 3D nodes individually. In the 3D editor, you can preview the occlusion culling buffer by choosing **Perspective > Debug Advanced... > Occlusion Culling Buffer** in the top-left corner of the 3D viewport. The occlusion culling buffer quality can be adjusted in the Project Settings.
 *
 * **Baking:** Select an [godot.OccluderInstance3D] node, then use the **Bake Occluders** button at the top of the 3D editor. Only opaque materials will be taken into account; transparent materials (alpha-blended or alpha-tested) will be ignored by the occluder generation.
 *
 * **Note:** Occlusion culling is only effective if [godot.ProjectSettings.rendering/occlusionCulling/useOcclusionCulling] is `true`. Enabling occlusion culling has a cost on the CPU. Only enable occlusion culling if you actually plan to use it. Large open scenes with few or no objects blocking the view will generally not benefit much from occlusion culling. Large open scenes generally benefit more from mesh LOD and visibility ranges ([godot.GeometryInstance3D.visibilityRangeBegin] and [godot.GeometryInstance3D.visibilityRangeEnd]) compared to occlusion culling.
 */
@GodotBaseType
public open class OccluderInstance3D : Node3D() {
  /**
   * The occluder resource for this [godot.OccluderInstance3D]. You can generate an occluder resource by selecting an [godot.OccluderInstance3D] node then using the **Bake Occluders** button at the top of the editor.
   *
   * You can also draw your own 2D occluder polygon by adding a new [godot.PolygonOccluder3D] resource to the [occluder] property in the Inspector.
   *
   * Alternatively, you can select a primitive occluder to use: [godot.QuadOccluder3D], [godot.BoxOccluder3D] or [godot.SphereOccluder3D].
   */
  public var occluder: Occluder3D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OCCLUDERINSTANCE3D_GET_OCCLUDER,
          OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Occluder3D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OCCLUDERINSTANCE3D_SET_OCCLUDER,
          NIL)
    }

  /**
   * The visual layers to account for when baking for occluders. Only [godot.MeshInstance3D]s whose [godot.VisualInstance3D.layers] match with this [bakeMask] will be included in the generated occluder mesh. By default, all objects with *opaque* materials are taken into account for the occluder baking.
   *
   * To improve performance and avoid artifacts, it is recommended to exclude dynamic objects, small objects and fixtures from the baking process by moving them to a separate visual layer and excluding this layer in [bakeMask].
   */
  public var bakeMask: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OCCLUDERINSTANCE3D_GET_BAKE_MASK,
          LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OCCLUDERINSTANCE3D_SET_BAKE_MASK,
          NIL)
    }

  /**
   * The simplification distance to use for simplifying the generated occluder polygon (in 3D units). Higher values result in a less detailed occluder mesh, which improves performance but reduces culling accuracy.
   *
   * The occluder geometry is rendered on the CPU, so it is important to keep its geometry as simple as possible. Since the buffer is rendered at a low resolution, less detailed occluder meshes generally still work well. The default value is fairly aggressive, so you may have to decrease it if you run into false negatives (objects being occluded even though they are visible by the camera). A value of `0.01` will act conservatively, and will keep geometry *perceptually* unaffected in the occlusion culling buffer. Depending on the scene, a value of `0.01` may still simplify the mesh noticeably compared to disabling simplification entirely.
   *
   * Setting this to `0.0` disables simplification entirely, but vertices in the exact same position will still be merged. The mesh will also be re-indexed to reduce both the number of vertices and indices.
   *
   * **Note:** This uses the [meshoptimizer](https://meshoptimizer.org/) library under the hood, similar to LOD generation.
   */
  public var bakeSimplificationDistance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_OCCLUDERINSTANCE3D_GET_BAKE_SIMPLIFICATION_DISTANCE, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_OCCLUDERINSTANCE3D_SET_BAKE_SIMPLIFICATION_DISTANCE, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_OCCLUDERINSTANCE3D, scriptIndex)
    return true
  }

  /**
   * Based on [value], enables or disables the specified layer in the [bakeMask], given a [layerNumber] between 1 and 32.
   */
  public fun setBakeMaskValue(layerNumber: Int, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_OCCLUDERINSTANCE3D_SET_BAKE_MASK_VALUE, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [bakeMask] is enabled, given a [layerNumber] between 1 and 32.
   */
  public fun getBakeMaskValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_OCCLUDERINSTANCE3D_GET_BAKE_MASK_VALUE, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public companion object
}
