// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Boolean
import kotlin.Double
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class AudioStreamOGGVorbis : AudioStream() {
  public open var packetSequence: Object?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMOGGVORBIS_GET_PACKET_SEQUENCE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Object?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMOGGVORBIS_SET_PACKET_SEQUENCE, NIL)
      return TransferContext.readReturnValue(NIL, true) as Unit?
    }

  public open var loop: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMOGGVORBIS_GET_LOOP,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMOGGVORBIS_SET_LOOP,
          NIL)
    }

  public open var loopOffset: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMOGGVORBIS_GET_LOOP_OFFSET, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMOGGVORBIS_SET_LOOP_OFFSET, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_AUDIOSTREAMOGGVORBIS)
  }

  public companion object
}
