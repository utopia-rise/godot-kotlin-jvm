// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class OpenXRInteractionProfile : Resource() {
  public var interactionProfilePath: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_OPENXRINTERACTIONPROFILE_GET_INTERACTION_PROFILE_PATH, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_OPENXRINTERACTIONPROFILE_SET_INTERACTION_PROFILE_PATH, NIL)
    }

  public var bindings: VariantArray<Any?>?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_OPENXRINTERACTIONPROFILE_GET_BINDINGS, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, true) as VariantArray<Any?>?)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_OPENXRINTERACTIONPROFILE_SET_BINDINGS, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_OPENXRINTERACTIONPROFILE, scriptIndex)
    return true
  }

  public fun getBindingCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_OPENXRINTERACTIONPROFILE_GET_BINDING_COUNT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getBinding(index: Int): OpenXRIPBinding? {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_OPENXRINTERACTIONPROFILE_GET_BINDING, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as OpenXRIPBinding?)
  }

  public companion object
}
