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
import godot.core.Signal1
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * This is the default binding modifier editor used in the OpenXR action map.
 */
@GodotBaseType
public open class OpenXRBindingModifierEditor : PanelContainer() {
  /**
   * Signal emitted when the user presses the delete binding modifier button for this modifier.
   */
  public val bindingModifierRemoved: Signal1<Object> by Signal1

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(417, scriptIndex)
  }

  /**
   * Returns the [OpenXRBindingModifier] currently being edited.
   */
  public final fun getBindingModifier(): OpenXRBindingModifier? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBindingModifierPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as OpenXRBindingModifier?)
  }

  /**
   * Setup this editor for the provided [actionMap] and [bindingModifier].
   */
  public final fun setup(actionMap: OpenXRActionMap?, bindingModifier: OpenXRBindingModifier?):
      Unit {
    TransferContext.writeArguments(OBJECT to actionMap, OBJECT to bindingModifier)
    TransferContext.callMethod(ptr, MethodBindings.setupPtr, NIL)
  }

  public companion object

  public object MethodBindings {
    internal val getBindingModifierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRBindingModifierEditor", "get_binding_modifier", 2930765082)

    internal val setupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRBindingModifierEditor", "setup", 1284787389)
  }
}
