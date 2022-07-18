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
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class OpenXRActionMap : Resource() {
  public var actionSets: OpenXRActionSet?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENXRACTIONMAP_GET_ACTION_SETS,
          OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as OpenXRActionSet?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENXRACTIONMAP_SET_ACTION_SETS,
          NIL.ordinal)
    }

  public var interactionProfiles: OpenXRInteractionProfile?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_OPENXRACTIONMAP_GET_INTERACTION_PROFILES, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as OpenXRInteractionProfile?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_OPENXRACTIONMAP_SET_INTERACTION_PROFILES, NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_OPENXRACTIONMAP)
  }

  public fun addActionSet(actionSet: OpenXRActionSet): Unit {
    TransferContext.writeArguments(OBJECT to actionSet)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENXRACTIONMAP_ADD_ACTION_SET,
        NIL.ordinal)
  }

  public fun removeActionSet(actionSet: OpenXRActionSet): Unit {
    TransferContext.writeArguments(OBJECT to actionSet)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENXRACTIONMAP_REMOVE_ACTION_SET,
        NIL.ordinal)
  }

  public fun addInteractionProfile(interactionProfile: OpenXRInteractionProfile): Unit {
    TransferContext.writeArguments(OBJECT to interactionProfile)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENXRACTIONMAP_ADD_INTERACTION_PROFILE,
        NIL.ordinal)
  }

  public fun removeInteractionProfile(interactionProfile: OpenXRInteractionProfile): Unit {
    TransferContext.writeArguments(OBJECT to interactionProfile)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_OPENXRACTIONMAP_REMOVE_INTERACTION_PROFILE, NIL.ordinal)
  }

  public fun createDefaultActionSets(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_OPENXRACTIONMAP_CREATE_DEFAULT_ACTION_SETS, NIL.ordinal)
  }

  public companion object
}
