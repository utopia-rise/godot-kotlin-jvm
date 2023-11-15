// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
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

  public fun registerTopLevelPath(
    displayName: String,
    openxrPath: String,
    openxrExtensionName: String,
  ): Unit {
    TransferContext.writeArguments(STRING to displayName, STRING to openxrPath, STRING to openxrExtensionName)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_OPENXRINTERACTIONPROFILEMETADATA_REGISTER_TOP_LEVEL_PATH, NIL)
  }

  public fun registerInteractionProfile(
    displayName: String,
    openxrPath: String,
    openxrExtensionName: String,
  ): Unit {
    TransferContext.writeArguments(STRING to displayName, STRING to openxrPath, STRING to openxrExtensionName)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_OPENXRINTERACTIONPROFILEMETADATA_REGISTER_INTERACTION_PROFILE, NIL)
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
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_OPENXRINTERACTIONPROFILEMETADATA_REGISTER_IO_PATH, NIL)
  }

  public companion object
}
