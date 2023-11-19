// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
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
      TransferContext.callMethod(rawPtr, MethodBindings.getActionSetsPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, true) as VariantArray<Any?>?)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setActionSetsPtr, NIL)
    }

  public var interactionProfiles: VariantArray<Any?>?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getInteractionProfilesPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, true) as VariantArray<Any?>?)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setInteractionProfilesPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_OPENXRACTIONMAP, scriptIndex)
    return true
  }

  public fun getActionSetCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getActionSetCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun findActionSet(name: String): OpenXRActionSet? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.findActionSetPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as OpenXRActionSet?)
  }

  public fun getActionSet(idx: Int): OpenXRActionSet? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getActionSetPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as OpenXRActionSet?)
  }

  public fun addActionSet(actionSet: OpenXRActionSet): Unit {
    TransferContext.writeArguments(OBJECT to actionSet)
    TransferContext.callMethod(rawPtr, MethodBindings.addActionSetPtr, NIL)
  }

  public fun removeActionSet(actionSet: OpenXRActionSet): Unit {
    TransferContext.writeArguments(OBJECT to actionSet)
    TransferContext.callMethod(rawPtr, MethodBindings.removeActionSetPtr, NIL)
  }

  public fun getInteractionProfileCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getInteractionProfileCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun findInteractionProfile(name: String): OpenXRInteractionProfile? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.findInteractionProfilePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as OpenXRInteractionProfile?)
  }

  public fun getInteractionProfile(idx: Int): OpenXRInteractionProfile? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getInteractionProfilePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as OpenXRInteractionProfile?)
  }

  public fun addInteractionProfile(interactionProfile: OpenXRInteractionProfile): Unit {
    TransferContext.writeArguments(OBJECT to interactionProfile)
    TransferContext.callMethod(rawPtr, MethodBindings.addInteractionProfilePtr, NIL)
  }

  public fun removeInteractionProfile(interactionProfile: OpenXRInteractionProfile): Unit {
    TransferContext.writeArguments(OBJECT to interactionProfile)
    TransferContext.callMethod(rawPtr, MethodBindings.removeInteractionProfilePtr, NIL)
  }

  public fun createDefaultActionSets(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.createDefaultActionSetsPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val setActionSetsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionMap", "set_action_sets")

    public val getActionSetsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionMap", "get_action_sets")

    public val getActionSetCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionMap", "get_action_set_count")

    public val findActionSetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionMap", "find_action_set")

    public val getActionSetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionMap", "get_action_set")

    public val addActionSetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionMap", "add_action_set")

    public val removeActionSetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionMap", "remove_action_set")

    public val setInteractionProfilesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionMap", "set_interaction_profiles")

    public val getInteractionProfilesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionMap", "get_interaction_profiles")

    public val getInteractionProfileCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionMap", "get_interaction_profile_count")

    public val findInteractionProfilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionMap", "find_interaction_profile")

    public val getInteractionProfilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionMap", "get_interaction_profile")

    public val addInteractionProfilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionMap", "add_interaction_profile")

    public val removeInteractionProfilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionMap", "remove_interaction_profile")

    public val createDefaultActionSetsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionMap", "create_default_action_sets")
  }
}
