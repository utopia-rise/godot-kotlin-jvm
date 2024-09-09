// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.AABB
import godot.core.RID
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType._RID
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 * The [VisualInstance3D] is used to connect a resource to a visual representation. All visual 3D
 * nodes inherit from the [VisualInstance3D]. In general, you should not access the [VisualInstance3D]
 * properties directly as they are accessed and managed by the nodes that inherit from
 * [VisualInstance3D]. [VisualInstance3D] is the node representation of the [RenderingServer] instance.
 */
@GodotBaseType
public open class VisualInstance3D : Node3D() {
  /**
   * The render layer(s) this [VisualInstance3D] is drawn on.
   * This object will only be visible for [Camera3D]s whose cull mask includes any of the render
   * layers this [VisualInstance3D] is set to.
   * For [Light3D]s, this can be used to control which [VisualInstance3D]s are affected by a
   * specific light. For [GPUParticles3D], this can be used to control which particles are effected by
   * a specific attractor. For [Decal]s, this can be used to control which [VisualInstance3D]s are
   * affected by a specific decal.
   * To adjust [layers] more easily using a script, use [getLayerMaskValue] and [setLayerMaskValue].
   * **Note:** [VoxelGI], SDFGI and [LightmapGI] will always take all layers into account to
   * determine what contributes to global illumination. If this is an issue, set
   * [GeometryInstance3D.giMode] to [GeometryInstance3D.GI_MODE_DISABLED] for meshes and
   * [Light3D.lightBakeMode] to [Light3D.BAKE_DISABLED] for lights to exclude them from global
   * illumination.
   */
  public var layers: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLayerMaskPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLayerMaskPtr, NIL)
    }

  /**
   * The amount by which the depth of this [VisualInstance3D] will be adjusted when sorting by
   * depth. Uses the same units as the engine (which are typically meters). Adjusting it to a higher
   * value will make the [VisualInstance3D] reliably draw on top of other [VisualInstance3D]s that are
   * otherwise positioned at the same spot. To ensure it always draws on top of other objects around it
   * (not positioned at the same spot), set the value to be greater than the distance between this
   * [VisualInstance3D] and the other nearby [VisualInstance3D]s.
   */
  public var sortingOffset: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSortingOffsetPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSortingOffsetPtr, NIL)
    }

  /**
   * If `true`, the object is sorted based on the [AABB] center. The object will be sorted based on
   * the global position otherwise.
   * The [AABB] center based sorting is generally more accurate for 3D models. The position based
   * sorting instead allows to better control the drawing order when working with [GPUParticles3D] and
   * [CPUParticles3D].
   */
  public var sortingUseAabbCenter: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSortingUseAabbCenterPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSortingUseAabbCenterPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_VISUALINSTANCE3D, scriptIndex)
  }

  public open fun _getAabb(): AABB {
    throw NotImplementedError("_get_aabb is not implemented for VisualInstance3D")
  }

  /**
   * Sets the resource that is instantiated by this [VisualInstance3D], which changes how the engine
   * handles the [VisualInstance3D] under the hood. Equivalent to [RenderingServer.instanceSetBase].
   */
  public fun setBase(base: RID): Unit {
    TransferContext.writeArguments(_RID to base)
    TransferContext.callMethod(rawPtr, MethodBindings.setBasePtr, NIL)
  }

  /**
   * Returns the RID of the resource associated with this [VisualInstance3D]. For example, if the
   * Node is a [MeshInstance3D], this will return the RID of the associated [Mesh].
   */
  public fun getBase(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBasePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns the RID of this instance. This RID is the same as the RID returned by
   * [RenderingServer.instanceCreate]. This RID is needed if you want to call [RenderingServer]
   * functions directly on this [VisualInstance3D].
   */
  public fun getInstance(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getInstancePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [layers], given a
   * [layerNumber] between 1 and 20.
   */
  public fun setLayerMaskValue(layerNumber: Int, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setLayerMaskValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [layers] is enabled, given a [layerNumber]
   * between 1 and 20.
   */
  public fun getLayerMaskValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLayerMaskValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the [AABB] (also known as the bounding box) for this [VisualInstance3D].
   */
  public fun getAabb(): AABB {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAabbPtr, godot.core.VariantType.AABB)
    return (TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB)
  }

  public companion object

  internal object MethodBindings {
    public val setBasePtr: VoidPtr = TypeManager.getMethodBindPtr("VisualInstance3D", "set_base")

    public val getBasePtr: VoidPtr = TypeManager.getMethodBindPtr("VisualInstance3D", "get_base")

    public val getInstancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualInstance3D", "get_instance")

    public val setLayerMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualInstance3D", "set_layer_mask")

    public val getLayerMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualInstance3D", "get_layer_mask")

    public val setLayerMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualInstance3D", "set_layer_mask_value")

    public val getLayerMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualInstance3D", "get_layer_mask_value")

    public val setSortingOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualInstance3D", "set_sorting_offset")

    public val getSortingOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualInstance3D", "get_sorting_offset")

    public val setSortingUseAabbCenterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualInstance3D", "set_sorting_use_aabb_center")

    public val isSortingUseAabbCenterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualInstance3D", "is_sorting_use_aabb_center")

    public val getAabbPtr: VoidPtr = TypeManager.getMethodBindPtr("VisualInstance3D", "get_aabb")
  }
}
