// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import kotlin.Any
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * OpenXR uses an action system similar to Godots Input map system to bind inputs and outputs on
 * various types of XR controllers to named actions. OpenXR specifies more detail on these inputs and
 * outputs than Godot supports.
 *
 * Another important distinction is that OpenXR offers no control over these bindings. The bindings
 * we register are suggestions, it is up to the XR runtime to offer users the ability to change these
 * bindings. This allows the XR runtime to fill in the gaps if new hardware becomes available.
 *
 * The action map therefore needs to be loaded at startup and can't be changed afterwards. This
 * resource is a container for the entire action map.
 */
@GodotBaseType
public open class OpenXRActionMap : Resource() {
  /**
   * Collection of [OpenXRActionSet]s that are part of this action map.
   */
  public final inline var actionSets: VariantArray<Any?>
    @JvmName("actionSetsProperty")
    get() = getActionSets()
    @JvmName("actionSetsProperty")
    set(`value`) {
      setActionSets(value)
    }

  /**
   * Collection of [OpenXRInteractionProfile]s that are part of this action map.
   */
  public final inline var interactionProfiles: VariantArray<Any?>
    @JvmName("interactionProfilesProperty")
    get() = getInteractionProfiles()
    @JvmName("interactionProfilesProperty")
    set(`value`) {
      setInteractionProfiles(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(422, scriptIndex)
  }

  public final fun setActionSets(actionSets: VariantArray<Any?>): Unit {
    TransferContext.writeArguments(ARRAY to actionSets)
    TransferContext.callMethod(ptr, MethodBindings.setActionSetsPtr, NIL)
  }

  public final fun getActionSets(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getActionSetsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  /**
   * Retrieve the number of actions sets in our action map.
   */
  public final fun getActionSetCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getActionSetCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Retrieve an action set by name.
   */
  public final fun findActionSet(name: String): OpenXRActionSet? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(ptr, MethodBindings.findActionSetPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as OpenXRActionSet?)
  }

  /**
   * Retrieve the action set at this index.
   */
  public final fun getActionSet(idx: Int): OpenXRActionSet? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getActionSetPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as OpenXRActionSet?)
  }

  /**
   * Add an action set.
   */
  public final fun addActionSet(actionSet: OpenXRActionSet?): Unit {
    TransferContext.writeArguments(OBJECT to actionSet)
    TransferContext.callMethod(ptr, MethodBindings.addActionSetPtr, NIL)
  }

  /**
   * Remove an action set.
   */
  public final fun removeActionSet(actionSet: OpenXRActionSet?): Unit {
    TransferContext.writeArguments(OBJECT to actionSet)
    TransferContext.callMethod(ptr, MethodBindings.removeActionSetPtr, NIL)
  }

  public final fun setInteractionProfiles(interactionProfiles: VariantArray<Any?>): Unit {
    TransferContext.writeArguments(ARRAY to interactionProfiles)
    TransferContext.callMethod(ptr, MethodBindings.setInteractionProfilesPtr, NIL)
  }

  public final fun getInteractionProfiles(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getInteractionProfilesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  /**
   * Retrieve the number of interaction profiles in our action map.
   */
  public final fun getInteractionProfileCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getInteractionProfileCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Find an interaction profile by its name (path).
   */
  public final fun findInteractionProfile(name: String): OpenXRInteractionProfile? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(ptr, MethodBindings.findInteractionProfilePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as OpenXRInteractionProfile?)
  }

  /**
   * Get the interaction profile at this index.
   */
  public final fun getInteractionProfile(idx: Int): OpenXRInteractionProfile? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getInteractionProfilePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as OpenXRInteractionProfile?)
  }

  /**
   * Add an interaction profile.
   */
  public final fun addInteractionProfile(interactionProfile: OpenXRInteractionProfile?): Unit {
    TransferContext.writeArguments(OBJECT to interactionProfile)
    TransferContext.callMethod(ptr, MethodBindings.addInteractionProfilePtr, NIL)
  }

  /**
   * Remove an interaction profile.
   */
  public final fun removeInteractionProfile(interactionProfile: OpenXRInteractionProfile?): Unit {
    TransferContext.writeArguments(OBJECT to interactionProfile)
    TransferContext.callMethod(ptr, MethodBindings.removeInteractionProfilePtr, NIL)
  }

  /**
   * Setup this action set with our default actions.
   */
  public final fun createDefaultActionSets(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.createDefaultActionSetsPtr, NIL)
  }

  public companion object

  public object MethodBindings {
    internal val setActionSetsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionMap", "set_action_sets", 381264803)

    internal val getActionSetsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionMap", "get_action_sets", 3995934104)

    internal val getActionSetCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionMap", "get_action_set_count", 3905245786)

    internal val findActionSetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionMap", "find_action_set", 1888809267)

    internal val getActionSetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionMap", "get_action_set", 1789580336)

    internal val addActionSetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionMap", "add_action_set", 2093310581)

    internal val removeActionSetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionMap", "remove_action_set", 2093310581)

    internal val setInteractionProfilesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionMap", "set_interaction_profiles", 381264803)

    internal val getInteractionProfilesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionMap", "get_interaction_profiles", 3995934104)

    internal val getInteractionProfileCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionMap", "get_interaction_profile_count", 3905245786)

    internal val findInteractionProfilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionMap", "find_interaction_profile", 3095875538)

    internal val getInteractionProfilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionMap", "get_interaction_profile", 2546151210)

    internal val addInteractionProfilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionMap", "add_interaction_profile", 2697953512)

    internal val removeInteractionProfilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionMap", "remove_interaction_profile", 2697953512)

    internal val createDefaultActionSetsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionMap", "create_default_action_sets", 3218959716)
  }
}
