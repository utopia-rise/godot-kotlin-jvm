// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_INPUTEVENTFROMWINDOW_INDEX: Int = 315

/**
 * InputEventFromWindow represents events specifically received by windows. This includes mouse
 * events, keyboard events in focused windows or touch screen actions.
 */
@GodotBaseType
public open class InputEventFromWindow internal constructor() : InputEvent() {
  /**
   * The ID of a [Window] that received this event.
   */
  public final inline var windowId: Long
    @JvmName("windowIdProperty")
    get() = getWindowId()
    @JvmName("windowIdProperty")
    set(`value`) {
      setWindowId(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_INPUTEVENTFROMWINDOW_INDEX, scriptIndex)
  }

  public final fun setWindowId(id: Long): Unit {
    Internals.writeArguments(LONG to id)
    Internals.callMethod(rawPtr, MethodBindings.setWindowIdPtr, NIL)
  }

  public final fun getWindowId(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getWindowIdPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  public companion object

  public object MethodBindings {
    internal val setWindowIdPtr: VoidPtr =
        Internals.getMethodBindPtr("InputEventFromWindow", "set_window_id", 1286410249)

    internal val getWindowIdPtr: VoidPtr =
        Internals.getMethodBindPtr("InputEventFromWindow", "get_window_id", 3905245786)
  }
}
