// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
open class AudioEffectRecord : AudioEffect() {
  open var format: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTRECORD_GET_FORMAT,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTRECORD_SET_FORMAT, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_AUDIOEFFECTRECORD)

  open fun getRecording(): AudioStreamSample? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTRECORD_GET_RECORDING,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as AudioStreamSample?
  }

  open fun isRecordingActive(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTRECORD_IS_RECORDING_ACTIVE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun setRecordingActive(record: Boolean) {
    TransferContext.writeArguments(BOOL to record)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTRECORD_SET_RECORDING_ACTIVE, NIL)
  }
}
