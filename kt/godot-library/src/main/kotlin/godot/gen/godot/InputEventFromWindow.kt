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
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Abstract base class for [godot.Viewport]-based input events.
 *
 * InputEventFromWindow represents events specifically received by windows. This includes mouse events, keyboard events in focused windows or touch screen actions.
 */
@GodotBaseType
public open class InputEventFromWindow internal constructor() : InputEvent() {
  /**
   * The ID of a [godot.Window] that received this event.
   */
  public var windowId: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getWindowIdPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setWindowIdPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_INPUTEVENTFROMWINDOW, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setWindowIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventFromWindow", "set_window_id")

    public val getWindowIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventFromWindow", "get_window_id")
  }
}
