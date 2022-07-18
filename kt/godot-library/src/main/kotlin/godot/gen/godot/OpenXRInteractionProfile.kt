// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class OpenXRInteractionProfile : Resource() {
  public var interactionProfilePath: String
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_OPENXRINTERACTIONPROFILE_GET_INTERACTION_PROFILE_PATH,
          STRING.ordinal)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_OPENXRINTERACTIONPROFILE_SET_INTERACTION_PROFILE_PATH,
          NIL.ordinal)
    }

  public var bindings: OpenXRIPBinding?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENXRINTERACTIONPROFILE_GET_BINDINGS,
          OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as OpenXRIPBinding?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENXRINTERACTIONPROFILE_SET_BINDINGS,
          NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_OPENXRINTERACTIONPROFILE)
  }

  public companion object
}
