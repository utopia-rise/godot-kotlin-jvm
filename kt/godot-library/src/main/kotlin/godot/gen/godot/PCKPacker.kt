// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.GodotError
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.STRING
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class PCKPacker : Reference() {
  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_PCKPACKER)

  open fun addFile(pckPath: String, sourcePath: String): GodotError {
    TransferContext.writeArguments(STRING to pckPath, STRING to sourcePath)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PCKPACKER_ADD_FILE, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun flush(verbose: Boolean = false): GodotError {
    TransferContext.writeArguments(BOOL to verbose)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PCKPACKER_FLUSH, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun pckStart(pckName: String, alignment: Long = 0): GodotError {
    TransferContext.writeArguments(STRING to pckName, LONG to alignment)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PCKPACKER_PCK_START, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }
}
