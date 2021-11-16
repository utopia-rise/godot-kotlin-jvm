// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

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
 * The [godot.VisualInstance] is used to connect a resource to a visual representation. All visual 3D nodes inherit from the [godot.VisualInstance]. In general, you should not access the [godot.VisualInstance] properties directly as they are accessed and managed by the nodes that inherit from [godot.VisualInstance]. [godot.VisualInstance] is the node representation of the [godot.VisualServer] instance.
 */
@GodotBaseType
public open class VisualInstance : CullInstance() {
  /**
   * The render layer(s) this [godot.VisualInstance] is drawn on.
   *
   * This object will only be visible for [godot.Camera]s whose cull mask includes the render object this [godot.VisualInstance] is set to.
   */
  public open var layers: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALINSTANCE_GET_LAYERS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALINSTANCE_SET_LAYERS, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISUALINSTANCE)
  }

  public open fun _getVisualInstanceRid(): RID {
    throw NotImplementedError("_get_visual_instance_rid is not implemented for VisualInstance")
  }

  /**
   * Returns the [AABB] (also known as the bounding box) for this [godot.VisualInstance]. See also [getTransformedAabb].
   */
  public open fun getAabb(): AABB {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALINSTANCE_GET_AABB,
        godot.core.VariantType.AABB)
    return TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB
  }

  /**
   * Returns the RID of the resource associated with this [godot.VisualInstance]. For example, if the Node is a [godot.MeshInstance], this will return the RID of the associated [godot.Mesh].
   */
  public open fun getBase(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALINSTANCE_GET_BASE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the RID of this instance. This RID is the same as the RID returned by [godot.VisualServer.instanceCreate]. This RID is needed if you want to call [godot.VisualServer] functions directly on this [godot.VisualInstance].
   */
  public open fun getInstance(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALINSTANCE_GET_INSTANCE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns `true` when the specified layer is enabled in [layers] and `false` otherwise.
   */
  public open fun getLayerMaskBit(layer: Long): Boolean {
    TransferContext.writeArguments(LONG to layer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALINSTANCE_GET_LAYER_MASK_BIT,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the transformed [AABB] (also known as the bounding box) for this [godot.VisualInstance].
   *
   * Transformed in this case means the [AABB] plus the position, rotation, and scale of the [godot.Spatial]'s [godot.core.Transform]. See also [getAabb].
   */
  public open fun getTransformedAabb(): AABB {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALINSTANCE_GET_TRANSFORMED_AABB,
        godot.core.VariantType.AABB)
    return TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB
  }

  /**
   * Sets the resource that is instantiated by this [godot.VisualInstance], which changes how the engine handles the [godot.VisualInstance] under the hood. Equivalent to [godot.VisualServer.instanceSetBase].
   */
  public open fun setBase(base: RID): Unit {
    TransferContext.writeArguments(_RID to base)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALINSTANCE_SET_BASE, NIL)
  }

  /**
   * Enables a particular layer in [layers].
   */
  public open fun setLayerMaskBit(layer: Long, enabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to layer, BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALINSTANCE_SET_LAYER_MASK_BIT,
        NIL)
  }
}
