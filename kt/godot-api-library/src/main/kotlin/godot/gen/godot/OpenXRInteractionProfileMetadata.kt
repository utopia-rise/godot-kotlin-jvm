// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_OPENXRINTERACTIONPROFILEMETADATA_INDEX: Int = 391

/**
 * This class allows OpenXR core and extensions to register metadata relating to supported
 * interaction devices such as controllers, trackers, haptic devices, etc. It is primarily used by the
 * action map editor and to sanitize any action map by removing extension-dependent entries when
 * applicable.
 */
@GodotBaseType
public open class OpenXRInteractionProfileMetadata : Object() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_OPENXRINTERACTIONPROFILEMETADATA_INDEX,
        scriptIndex)
  }

  /**
   * Allows for renaming old interaction profile paths to new paths to maintain backwards
   * compatibility with older action maps.
   */
  public final fun registerProfileRename(oldName: String, newName: String): Unit {
    Internals.writeArguments(STRING to oldName, STRING to newName)
    Internals.callMethod(rawPtr, MethodBindings.registerProfileRenamePtr, NIL)
  }

  /**
   * Registers a top level path to which profiles can be bound. For instance `/user/hand/left`
   * refers to the bind point for the player's left hand. Extensions can register additional top level
   * paths, for instance a haptic vest extension might register `/user/body/vest`.
   * [displayName] is the name shown to the user. [openxrPath] is the top level path being
   * registered. [openxrExtensionName] is optional and ensures the top level path is only used if the
   * specified extension is available/enabled.
   * When a top level path ends up being bound by OpenXR, a [XRPositionalTracker] is instantiated to
   * manage the state of the device.
   */
  public final fun registerTopLevelPath(
    displayName: String,
    openxrPath: String,
    openxrExtensionName: String,
  ): Unit {
    Internals.writeArguments(STRING to displayName, STRING to openxrPath, STRING to openxrExtensionName)
    Internals.callMethod(rawPtr, MethodBindings.registerTopLevelPathPtr, NIL)
  }

  /**
   * Registers an interaction profile using its OpenXR designation (e.g.
   * `/interaction_profiles/khr/simple_controller` is the profile for OpenXR's simple controller
   * profile).
   * [displayName] is the description shown to the user. [openxrPath] is the interaction profile
   * path being registered. [openxrExtensionName] optionally restricts this profile to the given
   * extension being enabled/available. If the extension is not available, the profile and all related
   * entries used in an action map are filtered out.
   */
  public final fun registerInteractionProfile(
    displayName: String,
    openxrPath: String,
    openxrExtensionName: String,
  ): Unit {
    Internals.writeArguments(STRING to displayName, STRING to openxrPath, STRING to openxrExtensionName)
    Internals.callMethod(rawPtr, MethodBindings.registerInteractionProfilePtr, NIL)
  }

  /**
   * Registers an input/output path for the given [interactionProfile]. The profile should
   * previously have been registered using [registerInteractionProfile]. [displayName] is the
   * description shown to the user. [toplevelPath] specifies the bind path this input/output can be
   * bound to (e.g. `/user/hand/left` or `/user/hand/right`). [openxrPath] is the action input/output
   * being registered (e.g. `/user/hand/left/input/aim/pose`). [openxrExtensionName] restricts this
   * input/output to an enabled/available extension, this doesn't need to repeat the extension on the
   * profile but relates to overlapping extension (e.g. `XR_EXT_palm_pose` that introduces
   * `…/input/palm_ext/pose` input paths). [actionType] defines the type of input or output provided by
   * OpenXR.
   */
  public final fun registerIoPath(
    interactionProfile: String,
    displayName: String,
    toplevelPath: String,
    openxrPath: String,
    openxrExtensionName: String,
    actionType: OpenXRAction.ActionType,
  ): Unit {
    Internals.writeArguments(STRING to interactionProfile, STRING to displayName, STRING to toplevelPath, STRING to openxrPath, STRING to openxrExtensionName, LONG to actionType.id)
    Internals.callMethod(rawPtr, MethodBindings.registerIoPathPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val registerProfileRenamePtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRInteractionProfileMetadata", "register_profile_rename", 3186203200)

    public val registerTopLevelPathPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRInteractionProfileMetadata", "register_top_level_path", 254767734)

    public val registerInteractionProfilePtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRInteractionProfileMetadata", "register_interaction_profile", 254767734)

    public val registerIoPathPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRInteractionProfileMetadata", "register_io_path", 3443511926)
  }
}
