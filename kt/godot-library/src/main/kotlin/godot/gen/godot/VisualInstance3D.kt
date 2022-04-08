// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.AABB
import godot.core.RID
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType._RID
import kotlin.Boolean
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 * Parent of all visual 3D nodes.
 *
 * The [godot.VisualInstance3D] is used to connect a resource to a visual representation. All visual 3D nodes inherit from the [godot.VisualInstance3D]. In general, you should not access the [godot.VisualInstance3D] properties directly as they are accessed and managed by the nodes that inherit from [godot.VisualInstance3D]. [godot.VisualInstance3D] is the node representation of the [godot.RenderingServer] instance.
 */
@GodotBaseType
public open class VisualInstance3D : Node3D() {
  /**
   * The render layer(s) this [godot.VisualInstance3D] is drawn on.
   *
   * This object will only be visible for [godot.Camera3D]s whose cull mask includes the render object this [godot.VisualInstance3D] is set to.
   */
  public var layers: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALINSTANCE3D_GET_LAYER_MASK,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALINSTANCE3D_SET_LAYER_MASK,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISUALINSTANCE3D)
  }

  /**
   *
   */
  public open fun _getAabb(): AABB {
    throw NotImplementedError("_get_aabb is not implemented for VisualInstance3D")
  }

  /**
   * Sets the resource that is instantiated by this [godot.VisualInstance3D], which changes how the engine handles the [godot.VisualInstance3D] under the hood. Equivalent to [godot.RenderingServer.instanceSetBase].
   */
  public fun setBase(base: RID): Unit {
    TransferContext.writeArguments(_RID to base)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALINSTANCE3D_SET_BASE, NIL)
  }

  /**
   * Returns the RID of the resource associated with this [godot.VisualInstance3D]. For example, if the Node is a [godot.MeshInstance3D], this will return the RID of the associated [godot.Mesh].
   */
  public fun getBase(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALINSTANCE3D_GET_BASE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the RID of this instance. This RID is the same as the RID returned by [godot.RenderingServer.instanceCreate]. This RID is needed if you want to call [godot.RenderingServer] functions directly on this [godot.VisualInstance3D].
   */
  public fun getInstance(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALINSTANCE3D_GET_INSTANCE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Based on `value`, enables or disables the specified layer in the [layers], given a `layer_number` between 1 and 20.
   */
  public fun setLayerMaskValue(layerNumber: Long, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber, BOOL to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALINSTANCE3D_SET_LAYER_MASK_VALUE, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [layers] is enabled, given a `layer_number` between 1 and 20.
   */
  public fun getLayerMaskValue(layerNumber: Long): Boolean {
    TransferContext.writeArguments(LONG to layerNumber)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALINSTANCE3D_GET_LAYER_MASK_VALUE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the transformed [AABB] (also known as the bounding box) for this [godot.VisualInstance3D].
   *
   * Transformed in this case means the [AABB] plus the position, rotation, and scale of the [godot.Node3D]'s [godot.Transform3D]. See also [getAabb].
   */
  public fun getTransformedAabb(): AABB {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALINSTANCE3D_GET_TRANSFORMED_AABB, godot.core.VariantType.AABB)
    return TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB
  }

  /**
   * Returns the [AABB] (also known as the bounding box) for this [godot.VisualInstance3D]. See also [getTransformedAabb].
   */
  public fun getAabb(): AABB {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALINSTANCE3D_GET_AABB,
        godot.core.VariantType.AABB)
    return TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB
  }

  public companion object
}
