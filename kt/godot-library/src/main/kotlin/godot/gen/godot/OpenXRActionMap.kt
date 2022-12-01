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
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class OpenXRActionMap : Resource() {
  public var actionSets: OpenXRActionSet?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENXRACTIONMAP_GET_ACTION_SETS,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as OpenXRActionSet?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENXRACTIONMAP_SET_ACTION_SETS,
          NIL)
    }

  public var interactionProfiles: OpenXRInteractionProfile?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_OPENXRACTIONMAP_GET_INTERACTION_PROFILES, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as OpenXRInteractionProfile?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_OPENXRACTIONMAP_SET_INTERACTION_PROFILES, NIL)
    }

  public override fun __new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_OPENXRACTIONMAP, scriptIndex)
  }

  public fun addActionSet(actionSet: OpenXRActionSet): Unit {
    TransferContext.writeArguments(OBJECT to actionSet)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENXRACTIONMAP_ADD_ACTION_SET, NIL)
  }

  public fun removeActionSet(actionSet: OpenXRActionSet): Unit {
    TransferContext.writeArguments(OBJECT to actionSet)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENXRACTIONMAP_REMOVE_ACTION_SET,
        NIL)
  }

  public fun addInteractionProfile(interactionProfile: OpenXRInteractionProfile): Unit {
    TransferContext.writeArguments(OBJECT to interactionProfile)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_OPENXRACTIONMAP_ADD_INTERACTION_PROFILE, NIL)
  }

  public fun removeInteractionProfile(interactionProfile: OpenXRInteractionProfile): Unit {
    TransferContext.writeArguments(OBJECT to interactionProfile)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_OPENXRACTIONMAP_REMOVE_INTERACTION_PROFILE, NIL)
  }

  public fun createDefaultActionSets(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_OPENXRACTIONMAP_CREATE_DEFAULT_ACTION_SETS, NIL)
  }

  public companion object
}
