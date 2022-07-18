// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

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
public open class EditorSpinSlider internal constructor() : Range() {
  /**
   *
   */
  public var label: String
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSPINSLIDER_GET_LABEL,
          STRING.ordinal)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSPINSLIDER_SET_LABEL,
          NIL.ordinal)
    }

  /**
   * The suffix to display after the value (in a faded color). This should generally be a plural word. You may have to use an abbreviation if the suffix is too long to be displayed.
   */
  public var suffix: String
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSPINSLIDER_GET_SUFFIX,
          STRING.ordinal)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSPINSLIDER_SET_SUFFIX,
          NIL.ordinal)
    }

  /**
   *
   */
  public var readOnly: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSPINSLIDER_IS_READ_ONLY,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSPINSLIDER_SET_READ_ONLY,
          NIL.ordinal)
    }

  /**
   *
   */
  public var flat: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSPINSLIDER_IS_FLAT, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSPINSLIDER_SET_FLAT, NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_EDITORSPINSLIDER)
  }

  public companion object
}
