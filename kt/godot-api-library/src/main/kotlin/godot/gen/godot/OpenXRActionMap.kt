// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_OPENXRACTIONMAP_INDEX: Int = 382

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
    Internals.callConstructor(this, ENGINE_CLASS_OPENXRACTIONMAP_INDEX, scriptIndex)
  }

  public final fun setActionSets(actionSets: VariantArray<Any?>): Unit {
    Internals.writeArguments(ARRAY to actionSets)
    Internals.callMethod(rawPtr, MethodBindings.setActionSetsPtr, NIL)
  }

  public final fun getActionSets(): VariantArray<Any?> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getActionSetsPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  /**
   * Retrieve the number of actions sets in our action map.
   */
  public final fun getActionSetCount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getActionSetCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Retrieve an action set by name.
   */
  public final fun findActionSet(name: String): OpenXRActionSet? {
    Internals.writeArguments(STRING to name)
    Internals.callMethod(rawPtr, MethodBindings.findActionSetPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as OpenXRActionSet?)
  }

  /**
   * Retrieve the action set at this index.
   */
  public final fun getActionSet(idx: Int): OpenXRActionSet? {
    Internals.writeArguments(LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getActionSetPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as OpenXRActionSet?)
  }

  /**
   * Add an action set.
   */
  public final fun addActionSet(actionSet: OpenXRActionSet?): Unit {
    Internals.writeArguments(OBJECT to actionSet)
    Internals.callMethod(rawPtr, MethodBindings.addActionSetPtr, NIL)
  }

  /**
   * Remove an action set.
   */
  public final fun removeActionSet(actionSet: OpenXRActionSet?): Unit {
    Internals.writeArguments(OBJECT to actionSet)
    Internals.callMethod(rawPtr, MethodBindings.removeActionSetPtr, NIL)
  }

  public final fun setInteractionProfiles(interactionProfiles: VariantArray<Any?>): Unit {
    Internals.writeArguments(ARRAY to interactionProfiles)
    Internals.callMethod(rawPtr, MethodBindings.setInteractionProfilesPtr, NIL)
  }

  public final fun getInteractionProfiles(): VariantArray<Any?> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getInteractionProfilesPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  /**
   * Retrieve the number of interaction profiles in our action map.
   */
  public final fun getInteractionProfileCount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getInteractionProfileCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Find an interaction profile by its name (path).
   */
  public final fun findInteractionProfile(name: String): OpenXRInteractionProfile? {
    Internals.writeArguments(STRING to name)
    Internals.callMethod(rawPtr, MethodBindings.findInteractionProfilePtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as OpenXRInteractionProfile?)
  }

  /**
   * Get the interaction profile at this index.
   */
  public final fun getInteractionProfile(idx: Int): OpenXRInteractionProfile? {
    Internals.writeArguments(LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getInteractionProfilePtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as OpenXRInteractionProfile?)
  }

  /**
   * Add an interaction profile.
   */
  public final fun addInteractionProfile(interactionProfile: OpenXRInteractionProfile?): Unit {
    Internals.writeArguments(OBJECT to interactionProfile)
    Internals.callMethod(rawPtr, MethodBindings.addInteractionProfilePtr, NIL)
  }

  /**
   * Remove an interaction profile.
   */
  public final fun removeInteractionProfile(interactionProfile: OpenXRInteractionProfile?): Unit {
    Internals.writeArguments(OBJECT to interactionProfile)
    Internals.callMethod(rawPtr, MethodBindings.removeInteractionProfilePtr, NIL)
  }

  /**
   * Setup this action set with our default actions.
   */
  public final fun createDefaultActionSets(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.createDefaultActionSetsPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val setActionSetsPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRActionMap", "set_action_sets", 381264803)

    public val getActionSetsPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRActionMap", "get_action_sets", 3995934104)

    public val getActionSetCountPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRActionMap", "get_action_set_count", 3905245786)

    public val findActionSetPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRActionMap", "find_action_set", 1888809267)

    public val getActionSetPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRActionMap", "get_action_set", 1789580336)

    public val addActionSetPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRActionMap", "add_action_set", 2093310581)

    public val removeActionSetPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRActionMap", "remove_action_set", 2093310581)

    public val setInteractionProfilesPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRActionMap", "set_interaction_profiles", 381264803)

    public val getInteractionProfilesPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRActionMap", "get_interaction_profiles", 3995934104)

    public val getInteractionProfileCountPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRActionMap", "get_interaction_profile_count", 3905245786)

    public val findInteractionProfilePtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRActionMap", "find_interaction_profile", 3095875538)

    public val getInteractionProfilePtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRActionMap", "get_interaction_profile", 2546151210)

    public val addInteractionProfilePtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRActionMap", "add_interaction_profile", 2697953512)

    public val removeInteractionProfilePtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRActionMap", "remove_interaction_profile", 2697953512)

    public val createDefaultActionSetsPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRActionMap", "create_default_action_sets", 3218959716)
  }
}
