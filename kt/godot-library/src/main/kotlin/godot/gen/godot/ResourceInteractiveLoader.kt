// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.GodotError
import godot.core.TransferContext
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
open class ResourceInteractiveLoader : Reference() {
  override fun __new(): VoidPtr =
      TransferContext.invokeConstructor(ENGINECLASS_RESOURCEINTERACTIVELOADER)

  open fun getResource(): Resource? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RESOURCEINTERACTIVELOADER_GET_RESOURCE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Resource?
  }

  open fun getStage(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCEINTERACTIVELOADER_GET_STAGE,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getStageCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RESOURCEINTERACTIVELOADER_GET_STAGE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun poll(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCEINTERACTIVELOADER_POLL,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun wait(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCEINTERACTIVELOADER_WAIT,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }
}
