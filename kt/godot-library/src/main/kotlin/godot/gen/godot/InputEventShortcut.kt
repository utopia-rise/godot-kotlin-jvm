// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public open class InputEventShortcut : InputEvent() {
  /**
   *
   */
  public var shortcut: Shortcut?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTSHORTCUT_GET_SHORTCUT,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Shortcut?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTSHORTCUT_SET_SHORTCUT,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_INPUTEVENTSHORTCUT)
  }

  public companion object
}
