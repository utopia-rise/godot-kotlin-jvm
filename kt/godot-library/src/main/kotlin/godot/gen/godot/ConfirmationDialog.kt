// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.core.TypeManager
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.core.memory.TransferContext
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A dialog used for confirmation of actions. This window is similar to [AcceptDialog], but pressing
 * its Cancel button can have a different outcome from pressing the OK button. The order of the two
 * buttons varies depending on the host OS.
 * To get cancel action, you can use:
 *
 * gdscript:
 * ```gdscript
 * get_cancel_button().pressed.connect(_on_canceled)
 * ```
 * csharp:
 * ```csharp
 * GetCancelButton().Pressed += OnCanceled;
 * ```
 */
@GodotBaseType
public open class ConfirmationDialog : AcceptDialog() {
  /**
   * The text displayed by the cancel button (see [getCancelButton]).
   */
  public final inline var cancelButtonText: String
    @JvmName("cancelButtonTextProperty")
    get() = getCancelButtonText()
    @JvmName("cancelButtonTextProperty")
    set(`value`) {
      setCancelButtonText(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_CONFIRMATIONDIALOG, scriptIndex)
  }

  /**
   * Returns the cancel button.
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If
   * you wish to hide it or any of its children, use their [CanvasItem.visible] property.
   */
  public final fun getCancelButton(): Button? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCancelButtonPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Button?)
  }

  public final fun setCancelButtonText(text: String): Unit {
    TransferContext.writeArguments(STRING to text)
    TransferContext.callMethod(ptr, MethodBindings.setCancelButtonTextPtr, NIL)
  }

  public final fun getCancelButtonText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCancelButtonTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public companion object

  internal object MethodBindings {
    public val getCancelButtonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConfirmationDialog", "get_cancel_button", 1856205918)

    public val setCancelButtonTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConfirmationDialog", "set_cancel_button_text", 83702148)

    public val getCancelButtonTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConfirmationDialog", "get_cancel_button_text", 201670096)
  }
}
