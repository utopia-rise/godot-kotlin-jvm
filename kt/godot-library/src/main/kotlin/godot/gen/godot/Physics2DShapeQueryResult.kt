// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.RID
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.core.VariantType._RID
import kotlin.Long
import kotlin.Suppress

/**
 * Result of a 2D shape query in [godot.Physics2DServer].
 *
 * The result of a 2D shape query in [godot.Physics2DServer]. See also [godot.Physics2DShapeQueryParameters].
 */
@GodotBaseType
open class Physics2DShapeQueryResult : Reference() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_PHYSICS2DSHAPEQUERYRESULT)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }

  /**
   * Returns the number of objects that intersected with the shape.
   */
  open fun getResultCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSHAPEQUERYRESULT_GET_RESULT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the [godot.Object] that intersected with the shape at index `idx`.
   */
  open fun getResultObject(idx: Long): Object? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSHAPEQUERYRESULT_GET_RESULT_OBJECT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Object?
  }

  /**
   * Returns the instance ID of the [godot.Object] that intersected with the shape at index `idx`.
   */
  open fun getResultObjectId(idx: Long): Long {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSHAPEQUERYRESULT_GET_RESULT_OBJECT_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the child index of the object's [godot.Shape] that intersected with the shape at index `idx`.
   */
  open fun getResultObjectShape(idx: Long): Long {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSHAPEQUERYRESULT_GET_RESULT_OBJECT_SHAPE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the [RID] of the object that intersected with the shape at index `idx`.
   */
  open fun getResultRid(idx: Long): RID {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSHAPEQUERYRESULT_GET_RESULT_RID, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }
}
