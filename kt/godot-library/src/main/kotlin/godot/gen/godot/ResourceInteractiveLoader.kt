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
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Interactive [godot.Resource] loader.
 *
 * Interactive [godot.Resource] loader. This object is returned by [godot.ResourceLoader] when performing an interactive load. It allows loading resources with high granularity, which makes it mainly useful for displaying loading bars or percentages.
 */
@GodotBaseType
open class ResourceInteractiveLoader : Reference() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_RESOURCEINTERACTIVELOADER)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }

  /**
   * Returns the loaded resource if the load operation completed successfully, `null` otherwise.
   */
  open fun getResource(): Resource? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RESOURCEINTERACTIVELOADER_GET_RESOURCE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Resource?
  }

  /**
   * Returns the load stage. The total amount of stages can be queried with [getStageCount].
   */
  open fun getStage(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCEINTERACTIVELOADER_GET_STAGE,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the total amount of stages (calls to [poll]) needed to completely load this resource.
   */
  open fun getStageCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RESOURCEINTERACTIVELOADER_GET_STAGE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Polls the loading operation, i.e. loads a data chunk up to the next stage.
   *
   * Returns [OK] if the poll is successful but the load operation has not finished yet (intermediate stage). This means [poll] will have to be called again until the last stage is completed.
   *
   * Returns [ERR_FILE_EOF] if the load operation has completed successfully. The loaded resource can be obtained by calling [getResource].
   *
   * Returns another [enum Error] code if the poll has failed.
   */
  open fun poll(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCEINTERACTIVELOADER_POLL,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Polls the loading operation successively until the resource is completely loaded or a [poll] fails.
   *
   * Returns [ERR_FILE_EOF] if the load operation has completed successfully. The loaded resource can be obtained by calling [getResource].
   *
   * Returns another [enum Error] code if a poll has failed, aborting the operation.
   */
  open fun wait(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCEINTERACTIVELOADER_WAIT,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }
}
