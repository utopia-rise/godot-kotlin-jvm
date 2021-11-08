// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Godot editor's control for editing numeric values.
 *
 * This [godot.Control] node is used in the editor's Inspector dock to allow editing of numeric values. Can be used with [godot.EditorInspectorPlugin] to recreate the same behavior.
 */
@GodotBaseType
public open class EditorSpinSlider : Range() {
  /**
   *
   */
  public open var flat: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSPINSLIDER_GET_FLAT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSPINSLIDER_SET_FLAT, NIL)
    }

  /**
   *
   */
  public open var label: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSPINSLIDER_GET_LABEL,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSPINSLIDER_SET_LABEL, NIL)
    }

  /**
   *
   */
  public open var readOnly: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSPINSLIDER_GET_READ_ONLY,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSPINSLIDER_SET_READ_ONLY,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_EDITORSPINSLIDER)
  }

  public open fun _grabberGuiInput(arg0: InputEvent): Unit {
  }

  public open fun _grabberMouseEntered(): Unit {
  }

  public open fun _grabberMouseExited(): Unit {
  }

  public override fun _guiInput(event: InputEvent): Unit {
  }

  public open fun _valueFocusExited(): Unit {
  }

  public open fun _valueInputClosed(): Unit {
  }

  public open fun _valueInputEntered(arg0: String): Unit {
  }

  public open fun _valueInputGuiInput(event: InputEvent): Unit {
  }
}
