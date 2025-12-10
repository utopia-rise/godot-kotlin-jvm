// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.AABB
import godot.core.PackedByteArray
import godot.core.PackedInt32Array
import godot.core.Transform3D
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_BYTE_ARRAY
import godot.core.VariantParser.PACKED_INT_32_ARRAY
import godot.core.VariantParser.TRANSFORM3D
import godot.core.VariantParser.VECTOR3
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * [VoxelGIData] contains baked voxel global illumination for use in a [VoxelGI] node. [VoxelGIData]
 * also offers several properties to adjust the final appearance of the global illumination. These
 * properties can be adjusted at run-time without having to bake the [VoxelGI] node again.
 *
 * **Note:** To prevent text-based scene files (`.tscn`) from growing too much and becoming slow to
 * load and save, always save [VoxelGIData] to an external binary resource file (`.res`) instead of
 * embedding it within the scene. This can be done by clicking the dropdown arrow next to the
 * [VoxelGIData] resource, choosing **Edit**, clicking the floppy disk icon at the top of the Inspector
 * then choosing **Save As...**.
 */
@GodotBaseType
public open class VoxelGIData : Resource() {
  /**
   * The dynamic range to use (`1.0` represents a low dynamic range scene brightness). Higher values
   * can be used to provide brighter indirect lighting, at the cost of more visible color banding in
   * dark areas (both in indirect lighting and reflections). To avoid color banding, it's recommended
   * to use the lowest value that does not result in visible light clipping.
   */
  public final inline var dynamicRange: Float
    @JvmName("dynamicRangeProperty")
    get() = getDynamicRange()
    @JvmName("dynamicRangeProperty")
    set(`value`) {
      setDynamicRange(value)
    }

  /**
   * The energy of the indirect lighting and reflections produced by the [VoxelGI] node. Higher
   * values result in brighter indirect lighting. If indirect lighting looks too flat, try decreasing
   * [propagation] while increasing [energy] at the same time. See also [useTwoBounces] which
   * influences the indirect lighting's effective brightness.
   */
  public final inline var energy: Float
    @JvmName("energyProperty")
    get() = getEnergy()
    @JvmName("energyProperty")
    set(`value`) {
      setEnergy(value)
    }

  /**
   * The normal bias to use for indirect lighting and reflections. Higher values reduce
   * self-reflections visible in non-rough materials, at the cost of more visible light leaking and
   * flatter-looking indirect lighting. To prioritize hiding self-reflections over lighting quality,
   * set [bias] to `0.0` and [normalBias] to a value between `1.0` and `2.0`.
   */
  public final inline var bias: Float
    @JvmName("biasProperty")
    get() = getBias()
    @JvmName("biasProperty")
    set(`value`) {
      setBias(value)
    }

  /**
   * The normal bias to use for indirect lighting and reflections. Higher values reduce
   * self-reflections visible in non-rough materials, at the cost of more visible light leaking and
   * flatter-looking indirect lighting. See also [bias]. To prioritize hiding self-reflections over
   * lighting quality, set [bias] to `0.0` and [normalBias] to a value between `1.0` and `2.0`.
   */
  public final inline var normalBias: Float
    @JvmName("normalBiasProperty")
    get() = getNormalBias()
    @JvmName("normalBiasProperty")
    set(`value`) {
      setNormalBias(value)
    }

  /**
   * The multiplier to use when light bounces off a surface. Higher values result in brighter
   * indirect lighting. If indirect lighting looks too flat, try decreasing [propagation] while
   * increasing [energy] at the same time. See also [useTwoBounces] which influences the indirect
   * lighting's effective brightness.
   */
  public final inline var propagation: Float
    @JvmName("propagationProperty")
    get() = getPropagation()
    @JvmName("propagationProperty")
    set(`value`) {
      setPropagation(value)
    }

  /**
   * If `true`, performs two bounces of indirect lighting instead of one. This makes indirect
   * lighting look more natural and brighter at a small performance cost. The second bounce is also
   * visible in reflections. If the scene appears too bright after enabling [useTwoBounces], adjust
   * [propagation] and [energy].
   */
  public final inline var useTwoBounces: Boolean
    @JvmName("useTwoBouncesProperty")
    get() = isUsingTwoBounces()
    @JvmName("useTwoBouncesProperty")
    set(`value`) {
      setUseTwoBounces(value)
    }

  /**
   * If `true`, [Environment] lighting is ignored by the [VoxelGI] node. If `false`, [Environment]
   * lighting is taken into account by the [VoxelGI] node. [Environment] lighting updates in real-time,
   * which means it can be changed without having to bake the [VoxelGI] node again.
   */
  public final inline var interior: Boolean
    @JvmName("interiorProperty")
    get() = isInterior()
    @JvmName("interiorProperty")
    set(`value`) {
      setInterior(value)
    }

  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(856, scriptPtr)
  }

  public final fun allocate(
    toCellXform: Transform3D,
    aabb: AABB,
    octreeSize: Vector3,
    octreeCells: PackedByteArray,
    dataCells: PackedByteArray,
    distanceField: PackedByteArray,
    levelCounts: PackedInt32Array,
  ): Unit {
    TransferContext.writeArguments(TRANSFORM3D to toCellXform, godot.core.VariantParser.AABB to aabb, VECTOR3 to octreeSize, PACKED_BYTE_ARRAY to octreeCells, PACKED_BYTE_ARRAY to dataCells, PACKED_BYTE_ARRAY to distanceField, PACKED_INT_32_ARRAY to levelCounts)
    TransferContext.callMethod(ptr, MethodBindings.allocatePtr, NIL)
  }

  /**
   * Returns the bounds of the baked voxel data as an [AABB], which should match [VoxelGI.size]
   * after being baked (which only contains the size as a [Vector3]).
   *
   * **Note:** If the size was modified without baking the VoxelGI data, then the value of
   * [getBounds] and [VoxelGI.size] will not match.
   */
  public final fun getBounds(): AABB {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBoundsPtr, godot.core.VariantParser.AABB)
    return (TransferContext.readReturnValue(godot.core.VariantParser.AABB) as AABB)
  }

  public final fun getOctreeSize(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOctreeSizePtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun getToCellXform(): Transform3D {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getToCellXformPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D) as Transform3D)
  }

  public final fun getOctreeCells(): PackedByteArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOctreeCellsPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY) as PackedByteArray)
  }

  public final fun getDataCells(): PackedByteArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDataCellsPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY) as PackedByteArray)
  }

  public final fun getLevelCounts(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLevelCountsPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  public final fun setDynamicRange(dynamicRange: Float): Unit {
    TransferContext.writeArguments(DOUBLE to dynamicRange.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setDynamicRangePtr, NIL)
  }

  public final fun getDynamicRange(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDynamicRangePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setEnergy(energy: Float): Unit {
    TransferContext.writeArguments(DOUBLE to energy.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setEnergyPtr, NIL)
  }

  public final fun getEnergy(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEnergyPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setBias(bias: Float): Unit {
    TransferContext.writeArguments(DOUBLE to bias.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setBiasPtr, NIL)
  }

  public final fun getBias(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBiasPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setNormalBias(bias: Float): Unit {
    TransferContext.writeArguments(DOUBLE to bias.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setNormalBiasPtr, NIL)
  }

  public final fun getNormalBias(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getNormalBiasPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setPropagation(propagation: Float): Unit {
    TransferContext.writeArguments(DOUBLE to propagation.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setPropagationPtr, NIL)
  }

  public final fun getPropagation(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPropagationPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setInterior(interior: Boolean): Unit {
    TransferContext.writeArguments(BOOL to interior)
    TransferContext.callMethod(ptr, MethodBindings.setInteriorPtr, NIL)
  }

  public final fun isInterior(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isInteriorPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setUseTwoBounces(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setUseTwoBouncesPtr, NIL)
  }

  public final fun isUsingTwoBounces(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isUsingTwoBouncesPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  public object MethodBindings {
    internal val allocatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGIData", "allocate", 4041601946)

    internal val getBoundsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGIData", "get_bounds", 1068685055)

    internal val getOctreeSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGIData", "get_octree_size", 3360562783)

    internal val getToCellXformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGIData", "get_to_cell_xform", 3229777777)

    internal val getOctreeCellsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGIData", "get_octree_cells", 2362200018)

    internal val getDataCellsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGIData", "get_data_cells", 2362200018)

    internal val getLevelCountsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGIData", "get_level_counts", 1930428628)

    internal val setDynamicRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGIData", "set_dynamic_range", 373806689)

    internal val getDynamicRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGIData", "get_dynamic_range", 1740695150)

    internal val setEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGIData", "set_energy", 373806689)

    internal val getEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGIData", "get_energy", 1740695150)

    internal val setBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGIData", "set_bias", 373806689)

    internal val getBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGIData", "get_bias", 1740695150)

    internal val setNormalBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGIData", "set_normal_bias", 373806689)

    internal val getNormalBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGIData", "get_normal_bias", 1740695150)

    internal val setPropagationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGIData", "set_propagation", 373806689)

    internal val getPropagationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGIData", "get_propagation", 1740695150)

    internal val setInteriorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGIData", "set_interior", 2586408642)

    internal val isInteriorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGIData", "is_interior", 36873697)

    internal val setUseTwoBouncesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGIData", "set_use_two_bounces", 2586408642)

    internal val isUsingTwoBouncesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VoxelGIData", "is_using_two_bounces", 36873697)
  }
}
