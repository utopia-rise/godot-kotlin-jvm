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

@GodotBaseType
public open class OpenXRInteractionProfileMetadata : Object() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_OPENXRINTERACTIONPROFILEMETADATA, scriptIndex)
    return true
  }

  public fun registerProfileRename(oldName: String, newName: String): Unit {
    TransferContext.writeArguments(STRING to oldName, STRING to newName)
    TransferContext.callMethod(rawPtr, MethodBindings.registerProfileRenamePtr, NIL)
  }

  public fun registerTopLevelPath(
    displayName: String,
    openxrPath: String,
    openxrExtensionName: String,
  ): Unit {
    TransferContext.writeArguments(STRING to displayName, STRING to openxrPath, STRING to openxrExtensionName)
    TransferContext.callMethod(rawPtr, MethodBindings.registerTopLevelPathPtr, NIL)
  }

  public fun registerInteractionProfile(
    displayName: String,
    openxrPath: String,
    openxrExtensionName: String,
  ): Unit {
    TransferContext.writeArguments(STRING to displayName, STRING to openxrPath, STRING to openxrExtensionName)
    TransferContext.callMethod(rawPtr, MethodBindings.registerInteractionProfilePtr, NIL)
  }

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
