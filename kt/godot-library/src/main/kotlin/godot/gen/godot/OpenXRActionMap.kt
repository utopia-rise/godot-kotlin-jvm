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
import kotlin.Unit

@GodotBaseType
public open class OpenXRActionMap : Resource() {
  public var actionSets: VariantArray<Any?>?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENXRACTIONMAP_GET_ACTION_SETS,
          ARRAY)
      return (TransferContext.readReturnValue(ARRAY, true) as VariantArray<Any?>?)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENXRACTIONMAP_SET_ACTION_SETS,
          NIL)
    }

  public var interactionProfiles: VariantArray<Any?>?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_OPENXRACTIONMAP_GET_INTERACTION_PROFILES, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, true) as VariantArray<Any?>?)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_OPENXRACTIONMAP_SET_INTERACTION_PROFILES, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_OPENXRACTIONMAP, scriptIndex)
    return true
  }

  public fun getActionSetCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_OPENXRACTIONMAP_GET_ACTION_SET_COUNT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun findActionSet(name: String): OpenXRActionSet? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENXRACTIONMAP_FIND_ACTION_SET,
        OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as OpenXRActionSet?)
  }

  public fun getActionSet(idx: Int): OpenXRActionSet? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OPENXRACTIONMAP_GET_ACTION_SET,
        OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as OpenXRActionSet?)
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

  public fun getInteractionProfileCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_OPENXRACTIONMAP_GET_INTERACTION_PROFILE_COUNT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun findInteractionProfile(name: String): OpenXRInteractionProfile? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_OPENXRACTIONMAP_FIND_INTERACTION_PROFILE, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as OpenXRInteractionProfile?)
  }

  public fun getInteractionProfile(idx: Int): OpenXRInteractionProfile? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_OPENXRACTIONMAP_GET_INTERACTION_PROFILE, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as OpenXRInteractionProfile?)
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
