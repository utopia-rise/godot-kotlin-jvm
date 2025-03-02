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
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * This is a base class for interaction profile editors used by the OpenXR action map editor. It can
 * be used to create bespoke editors for specific interaction profiles.
 */
@GodotBaseType
public open class OpenXRInteractionProfileEditorBase internal constructor() : HBoxContainer() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(447, scriptIndex)
  }

  /**
   * Setup this editor for the provided [actionMap] and [interactionProfile].
   */
  public final fun setup(actionMap: OpenXRActionMap?,
      interactionProfile: OpenXRInteractionProfile?): Unit {
    TransferContext.writeArguments(OBJECT to actionMap, OBJECT to interactionProfile)
    TransferContext.callMethod(ptr, MethodBindings.setupPtr, NIL)
  }

  public companion object

  public object MethodBindings {
    internal val setupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRInteractionProfileEditorBase", "setup", 421962938)
  }
}
