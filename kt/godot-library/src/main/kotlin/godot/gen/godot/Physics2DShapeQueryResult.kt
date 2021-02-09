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
import godot.util.VoidPtr
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
open class Physics2DShapeQueryResult : Reference() {
  override fun __new(): VoidPtr =
      TransferContext.invokeConstructor(ENGINECLASS_PHYSICS2DSHAPEQUERYRESULT)

  open fun getResultCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSHAPEQUERYRESULT_GET_RESULT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getResultObject(idx: Long): Object? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSHAPEQUERYRESULT_GET_RESULT_OBJECT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Object?
  }

  open fun getResultObjectId(idx: Long): Long {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSHAPEQUERYRESULT_GET_RESULT_OBJECT_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getResultObjectShape(idx: Long): Long {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSHAPEQUERYRESULT_GET_RESULT_OBJECT_SHAPE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getResultRid(idx: Long): RID {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICS2DSHAPEQUERYRESULT_GET_RESULT_RID, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }
}
