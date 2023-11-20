// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.AABB
import godot.core.PackedByteArray
import godot.core.PackedInt32Array
import godot.core.Transform3D
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.TRANSFORM3D
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * Contains baked voxel global illumination data for use in a [godot.VoxelGI] node.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/678](https://godotengine.org/asset-library/asset/678)
 *
 * [godot.VoxelGIData] contains baked voxel global illumination for use in a [godot.VoxelGI] node. [godot.VoxelGIData] also offers several properties to adjust the final appearance of the global illumination. These properties can be adjusted at run-time without having to bake the [godot.VoxelGI] node again.
 *
 * **Note:** To prevent text-based scene files (`.tscn`) from growing too much and becoming slow to load and save, always save [godot.VoxelGIData] to an external binary resource file (`.res`) instead of embedding it within the scene. This can be done by clicking the dropdown arrow next to the [godot.VoxelGIData] resource, choosing **Edit**, clicking the floppy disk icon at the top of the Inspector then choosing **Save As...**.
 */
@GodotBaseType
public open class VoxelGIData : Resource() {
  /**
   * The dynamic range to use (`1.0` represents a low dynamic range scene brightness). Higher values can be used to provide brighter indirect lighting, at the cost of more visible color banding in dark areas (both in indirect lighting and reflections). To avoid color banding, it's recommended to use the lowest value that does not result in visible light clipping.
   */
  public var dynamicRange: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDynamicRangePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDynamicRangePtr, NIL)
    }

  /**
   * The energy of the indirect lighting and reflections produced by the [godot.VoxelGI] node. Higher values result in brighter indirect lighting. If indirect lighting looks too flat, try decreasing [propagation] while increasing [energy] at the same time. See also [useTwoBounces] which influences the indirect lighting's effective brightness.
   */
  public var energy: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEnergyPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setEnergyPtr, NIL)
    }

  /**
   * The normal bias to use for indirect lighting and reflections. Higher values reduce self-reflections visible in non-rough materials, at the cost of more visible light leaking and flatter-looking indirect lighting. To prioritize hiding self-reflections over lighting quality, set [bias] to `0.0` and [normalBias] to a value between `1.0` and `2.0`.
   */
  public var bias: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBiasPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setBiasPtr, NIL)
    }

  /**
   * The normal bias to use for indirect lighting and reflections. Higher values reduce self-reflections visible in non-rough materials, at the cost of more visible light leaking and flatter-looking indirect lighting. See also [bias]. To prioritize hiding self-reflections over lighting quality, set [bias] to `0.0` and [normalBias] to a value between `1.0` and `2.0`.
   */
  public var normalBias: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getNormalBiasPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setNormalBiasPtr, NIL)
    }

  /**
   * The multiplier to use when light bounces off a surface. Higher values result in brighter indirect lighting. If indirect lighting looks too flat, try decreasing [propagation] while increasing [energy] at the same time. See also [useTwoBounces] which influences the indirect lighting's effective brightness.
   */
  public var propagation: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPropagationPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setPropagationPtr, NIL)
    }

  /**
   * If `true`, performs two bounces of indirect lighting instead of one. This makes indirect lighting look more natural and brighter at a small performance cost. The second bounce is also visible in reflections. If the scene appears too bright after enabling [useTwoBounces], adjust [propagation] and [energy].
   */
  public var useTwoBounces: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUsingTwoBouncesPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseTwoBouncesPtr, NIL)
    }

  /**
   * If `true`, [godot.Environment] lighting is ignored by the [godot.VoxelGI] node. If `false`, [godot.Environment] lighting is taken into account by the [godot.VoxelGI] node. [godot.Environment] lighting updates in real-time, which means it can be changed without having to bake the [godot.VoxelGI] node again.
   */
  public var interior: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isInteriorPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setInteriorPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VOXELGIDATA, scriptIndex)
    return true
  }

  /**
   *
   */
  public fun allocate(
    toCellXform: Transform3D,
    aabb: AABB,
    octreeSize: Vector3,
    octreeCells: PackedByteArray,
    dataCells: PackedByteArray,
    distanceField: PackedByteArray,
    levelCounts: PackedInt32Array,
  ): Unit {
    TransferContext.writeArguments(TRANSFORM3D to toCellXform, godot.core.VariantType.AABB to aabb, VECTOR3 to octreeSize, PACKED_BYTE_ARRAY to octreeCells, PACKED_BYTE_ARRAY to dataCells, PACKED_BYTE_ARRAY to distanceField, PACKED_INT_32_ARRAY to levelCounts)
    TransferContext.callMethod(rawPtr, MethodBindings.allocatePtr, NIL)
  }

  /**
   * Returns the bounds of the baked voxel data as an [AABB], which should match [godot.VoxelGI.size] after being baked (which only contains the size as a [godot.core.Vector3]).
   *
   * **Note:** If the size was modified without baking the VoxelGI data, then the value of [getBounds] and [godot.VoxelGI.size] will not match.
   */
  public fun getBounds(): AABB {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBoundsPtr, godot.core.VariantType.AABB)
    return (TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB)
  }

  /**
   *
   */
  public fun getOctreeSize(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOctreeSizePtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   *
   */
  public fun getToCellXform(): Transform3D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getToCellXformPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  /**
   *
   */
  public fun getOctreeCells(): PackedByteArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOctreeCellsPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
  }

  /**
   *
   */
  public fun getDataCells(): PackedByteArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDataCellsPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
  }

  /**
   *
   */
  public fun getLevelCounts(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLevelCountsPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  public companion object

  internal object MethodBindings {
    public val allocatePtr: VoidPtr = TypeManager.getMethodBindPtr("VoxelGIData", "allocate")

    public val getBoundsPtr: VoidPtr = TypeManager.getMethodBindPtr("VoxelGIData", "get_bounds")

    public val getOctreeSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGIData", "get_octree_size")

    public val getToCellXformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGIData", "get_to_cell_xform")

    public val getOctreeCellsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGIData", "get_octree_cells")

    public val getDataCellsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGIData", "get_data_cells")

    public val getLevelCountsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGIData", "get_level_counts")

    public val setDynamicRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGIData", "set_dynamic_range")

    public val getDynamicRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGIData", "get_dynamic_range")

    public val setEnergyPtr: VoidPtr = TypeManager.getMethodBindPtr("VoxelGIData", "set_energy")

    public val getEnergyPtr: VoidPtr = TypeManager.getMethodBindPtr("VoxelGIData", "get_energy")

    public val setBiasPtr: VoidPtr = TypeManager.getMethodBindPtr("VoxelGIData", "set_bias")

    public val getBiasPtr: VoidPtr = TypeManager.getMethodBindPtr("VoxelGIData", "get_bias")

    public val setNormalBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGIData", "set_normal_bias")

    public val getNormalBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGIData", "get_normal_bias")

    public val setPropagationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGIData", "set_propagation")

    public val getPropagationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGIData", "get_propagation")

    public val setInteriorPtr: VoidPtr = TypeManager.getMethodBindPtr("VoxelGIData", "set_interior")

    public val isInteriorPtr: VoidPtr = TypeManager.getMethodBindPtr("VoxelGIData", "is_interior")

    public val setUseTwoBouncesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGIData", "set_use_two_bounces")

    public val isUsingTwoBouncesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGIData", "is_using_two_bounces")
  }
}
