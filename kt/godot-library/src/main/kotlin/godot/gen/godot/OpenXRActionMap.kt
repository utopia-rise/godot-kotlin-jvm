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
 * Another important distinction is that OpenXR offers no control over these bindings. The bindings
 * we register are suggestions, it is up to the XR runtime to offer users the ability to change these
 * bindings. This allows the XR runtime to fill in the gaps if new hardware becomes available.
 * The action map therefore needs to be loaded at startup and can't be changed afterwards. This
 * resource is a container for the entire action map.
 */
@GodotBaseType
public open class OpenXRActionMap : Resource() {
  /**
   * Collection of [OpenXRActionSet]s that are part of this action map.
   */
  public var actionSets: VariantArray<Any?>
    @JvmName("actionSetsProperty")
    get() = getActionSets()
    @JvmName("actionSetsProperty")
    set(`value`) {
      setActionSets(value)
    }

  /**
   * Collection of [OpenXRInteractionProfile]s that are part of this action map.
   */
  public var interactionProfiles: VariantArray<Any?>
    @JvmName("interactionProfilesProperty")
    get() = getInteractionProfiles()
    @JvmName("interactionProfilesProperty")
    set(`value`) {
      setInteractionProfiles(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_OPENXRACTIONMAP, scriptIndex)
  }

  public fun setActionSets(actionSets: VariantArray<Any?>): Unit {
    TransferContext.writeArguments(ARRAY to actionSets)
    TransferContext.callMethod(rawPtr, MethodBindings.setActionSetsPtr, NIL)
  }

  public fun getActionSets(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getActionSetsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  /**
   * Retrieve the number of actions sets in our action map.
   */
  public fun getActionSetCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getActionSetCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Retrieve an action set by name.
   */
  public fun findActionSet(name: String): OpenXRActionSet? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.findActionSetPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as OpenXRActionSet?)
  }

  /**
   * Retrieve the action set at this index.
   */
  public fun getActionSet(idx: Int): OpenXRActionSet? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getActionSetPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as OpenXRActionSet?)
  }

  /**
   * Add an action set.
   */
  public fun addActionSet(actionSet: OpenXRActionSet?): Unit {
    TransferContext.writeArguments(OBJECT to actionSet)
    TransferContext.callMethod(rawPtr, MethodBindings.addActionSetPtr, NIL)
  }

  /**
   * Remove an action set.
   */
  public fun removeActionSet(actionSet: OpenXRActionSet?): Unit {
    TransferContext.writeArguments(OBJECT to actionSet)
    TransferContext.callMethod(rawPtr, MethodBindings.removeActionSetPtr, NIL)
  }

  public fun setInteractionProfiles(interactionProfiles: VariantArray<Any?>): Unit {
    TransferContext.writeArguments(ARRAY to interactionProfiles)
    TransferContext.callMethod(rawPtr, MethodBindings.setInteractionProfilesPtr, NIL)
  }

  public fun getInteractionProfiles(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getInteractionProfilesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  /**
   * Retrieve the number of interaction profiles in our action map.
   */
  public fun getInteractionProfileCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getInteractionProfileCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Find an interaction profile by its name (path).
   */
  public fun findInteractionProfile(name: String): OpenXRInteractionProfile? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.findInteractionProfilePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as OpenXRInteractionProfile?)
  }

  /**
   * Get the interaction profile at this index.
   */
  public fun getInteractionProfile(idx: Int): OpenXRInteractionProfile? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getInteractionProfilePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as OpenXRInteractionProfile?)
  }

  /**
   * Add an interaction profile.
   */
  public fun addInteractionProfile(interactionProfile: OpenXRInteractionProfile?): Unit {
    TransferContext.writeArguments(OBJECT to interactionProfile)
    TransferContext.callMethod(rawPtr, MethodBindings.addInteractionProfilePtr, NIL)
  }

  /**
   * Remove an interaction profile.
   */
  public fun removeInteractionProfile(interactionProfile: OpenXRInteractionProfile?): Unit {
    TransferContext.writeArguments(OBJECT to interactionProfile)
    TransferContext.callMethod(rawPtr, MethodBindings.removeInteractionProfilePtr, NIL)
  }

  /**
   * Setup this action set with our default actions.
   */
  public fun createDefaultActionSets(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.createDefaultActionSetsPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val setActionSetsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionMap", "set_action_sets", 381264803)

    public val getActionSetsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionMap", "get_action_sets", 3995934104)

    public val getActionSetCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionMap", "get_action_set_count", 3905245786)

    public val findActionSetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionMap", "find_action_set", 1888809267)

    public val getActionSetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionMap", "get_action_set", 1789580336)

    public val addActionSetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionMap", "add_action_set", 2093310581)

    public val removeActionSetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionMap", "remove_action_set", 2093310581)

    public val setInteractionProfilesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionMap", "set_interaction_profiles", 381264803)

    public val getInteractionProfilesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionMap", "get_interaction_profiles", 3995934104)

    public val getInteractionProfileCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionMap", "get_interaction_profile_count", 3905245786)

    public val findInteractionProfilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionMap", "find_interaction_profile", 3095875538)

    public val getInteractionProfilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionMap", "get_interaction_profile", 2546151210)

    public val addInteractionProfilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionMap", "add_interaction_profile", 2697953512)

    public val removeInteractionProfilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionMap", "remove_interaction_profile", 2697953512)

    public val createDefaultActionSetsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionMap", "create_default_action_sets", 3218959716)
  }
}
