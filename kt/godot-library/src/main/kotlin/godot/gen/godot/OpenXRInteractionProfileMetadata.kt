// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * This class allows OpenXR core and extensions to register metadata relating to supported
 * interaction devices such as controllers, trackers, haptic devices, etc. It is primarily used by the
 * action map editor and to sanitize any action map by removing extension-dependent entries when
 * applicable.
 */
@GodotBaseType
public open class OpenXRInteractionProfileMetadata : Object() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_OPENXRINTERACTIONPROFILEMETADATA, scriptIndex)
    return true
  }

  /**
   * Allows for renaming old interaction profile paths to new paths to maintain backwards
   * compatibility with older action maps.
   */
  public fun registerProfileRename(oldName: String, newName: String): Unit {
    TransferContext.writeArguments(STRING to oldName, STRING to newName)
    TransferContext.callMethod(rawPtr, MethodBindings.registerProfileRenamePtr, NIL)
  }

  /**
   * Registers a top level path to which profiles can be bound. For instance `/user/hand/left`
   * refers to the bind point for the player's left hand. Extensions can register additional top level
   * paths, for instance a haptic vest extension might register `/user/body/vest`.
   * [param display_name] is the name shown to the user. [param openxr_path] is the top level path
   * being registered. [param openxr_extension_name] is optional and ensures the top level path is only
   * used if the specified extension is available/enabled.
   * When a top level path ends up being bound by OpenXR, a [XRPositionalTracker] is instantiated to
   * manage the state of the device.
   */
  public fun registerTopLevelPath(
    displayName: String,
    openxrPath: String,
    openxrExtensionName: String,
  ): Unit {
    TransferContext.writeArguments(STRING to displayName, STRING to openxrPath, STRING to openxrExtensionName)
    TransferContext.callMethod(rawPtr, MethodBindings.registerTopLevelPathPtr, NIL)
  }

  /**
   * Registers an interaction profile using its OpenXR designation (e.g.
   * `/interaction_profiles/khr/simple_controller` is the profile for OpenXR's simple controller
   * profile).
   * [param display_name] is the description shown to the user. [param openxr_path] is the
   * interaction profile path being registered. [param openxr_extension_name] optionally restricts this
   * profile to the given extension being enabled/available. If the extension is not available, the
   * profile and all related entries used in an action map are filtered out.
   */
  public fun registerInteractionProfile(
    displayName: String,
    openxrPath: String,
    openxrExtensionName: String,
  ): Unit {
    TransferContext.writeArguments(STRING to displayName, STRING to openxrPath, STRING to openxrExtensionName)
    TransferContext.callMethod(rawPtr, MethodBindings.registerInteractionProfilePtr, NIL)
  }

  /**
   * Registers an input/output path for the given [param interaction_profile]. The profile should
   * previously have been registered using [registerInteractionProfile]. [param display_name] is the
   * description shown to the user. [param toplevel_path] specifies the bind path this input/output can
   * be bound to (e.g. `/user/hand/left` or `/user/hand/right`). [param openxr_path] is the action
   * input/output being registered (e.g. `/user/hand/left/input/aim/pose`). [param
   * openxr_extension_name] restricts this input/output to an enabled/available extension, this doesn't
   * need to repeat the extension on the profile but relates to overlapping extension (e.g.
   * `XR_EXT_palm_pose` that introduces `…/input/palm_ext/pose` input paths). [param action_type]
   * defines the type of input or output provided by OpenXR.
   */
  public fun registerIoPath(
    interactionProfile: String,
    displayName: String,
    toplevelPath: String,
    openxrPath: String,
    openxrExtensionName: String,
    actionType: OpenXRAction.ActionType,
  ): Unit {
    TransferContext.writeArguments(STRING to interactionProfile, STRING to displayName, STRING to toplevelPath, STRING to openxrPath, STRING to openxrExtensionName, LONG to actionType.id)
    TransferContext.callMethod(rawPtr, MethodBindings.registerIoPathPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val registerProfileRenamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRInteractionProfileMetadata", "register_profile_rename")

    public val registerTopLevelPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRInteractionProfileMetadata", "register_top_level_path")

    public val registerInteractionProfilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRInteractionProfileMetadata", "register_interaction_profile")

    public val registerIoPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRInteractionProfileMetadata", "register_io_path")
  }
}
