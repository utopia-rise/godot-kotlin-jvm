// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_CONFIRMATIONDIALOG_INDEX: Int = 207

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
    Internals.callConstructor(this, ENGINE_CLASS_CONFIRMATIONDIALOG_INDEX, scriptIndex)
  }

  /**
   * Returns the cancel button.
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If
   * you wish to hide it or any of its children, use their [CanvasItem.visible] property.
   */
  public final fun getCancelButton(): Button? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCancelButtonPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Button?)
  }

  public final fun setCancelButtonText(text: String): Unit {
    Internals.writeArguments(STRING to text)
    Internals.callMethod(rawPtr, MethodBindings.setCancelButtonTextPtr, NIL)
  }

  public final fun getCancelButtonText(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCancelButtonTextPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  public companion object

  public object MethodBindings {
    internal val getCancelButtonPtr: VoidPtr =
        Internals.getMethodBindPtr("ConfirmationDialog", "get_cancel_button", 1856205918)

    internal val setCancelButtonTextPtr: VoidPtr =
        Internals.getMethodBindPtr("ConfirmationDialog", "set_cancel_button_text", 83702148)

    internal val getCancelButtonTextPtr: VoidPtr =
        Internals.getMethodBindPtr("ConfirmationDialog", "get_cancel_button_text", 201670096)
  }
}
