// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.MouseButtonMaskValue
import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Stores general information about mouse events.
 */
@GodotBaseType
public open class InputEventMouse internal constructor() : InputEventWithModifiers() {
  /**
   * The mouse button mask identifier, one of or a bitwise combination of the [MouseButton] button
   * masks.
   */
  public var buttonMask: MouseButtonMask
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getButtonMaskPtr, LONG)
      return MouseButtonMaskValue(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.flag)
      TransferContext.callMethod(rawPtr, MethodBindings.setButtonMaskPtr, NIL)
    }

  /**
   * When received in [Node.Input] or [Node.UnhandledInput], returns the mouse's position in the
   * [Viewport] this [Node] is in using the coordinate system of this [Viewport].
   * When received in [Control.GuiInput], returns the mouse's position in the [Control] using the
   * local coordinate system of the [Control].
   */
  @CoreTypeLocalCopy
  public var position: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPositionPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPositionPtr, NIL)
    }

  /**
   * When received in [Node.Input] or [Node.UnhandledInput], returns the mouse's position in the
   * root [Viewport] using the coordinate system of the root [Viewport].
   * When received in [Control.GuiInput], returns the mouse's position in the [CanvasLayer] that the
   * [Control] is in using the coordinate system of the [CanvasLayer].
   */
  @CoreTypeLocalCopy
  public var globalPosition: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGlobalPositionPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGlobalPositionPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_INPUTEVENTMOUSE, scriptIndex)
  }

  /**
   * When received in [Node.Input] or [Node.UnhandledInput], returns the mouse's position in the
   * [Viewport] this [Node] is in using the coordinate system of this [Viewport].
   * When received in [Control.GuiInput], returns the mouse's position in the [Control] using the
   * local coordinate system of the [Control].
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = inputeventmouse.position
   * //Your changes
   * inputeventmouse.position = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun positionMutate(block: Vector2.() -> Unit): Vector2 = position.apply{
      block(this)
      position = this
  }


  /**
   * When received in [Node.Input] or [Node.UnhandledInput], returns the mouse's position in the
   * root [Viewport] using the coordinate system of the root [Viewport].
   * When received in [Control.GuiInput], returns the mouse's position in the [CanvasLayer] that the
   * [Control] is in using the coordinate system of the [CanvasLayer].
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = inputeventmouse.globalPosition
   * //Your changes
   * inputeventmouse.globalPosition = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun globalPositionMutate(block: Vector2.() -> Unit): Vector2 = globalPosition.apply{
      block(this)
      globalPosition = this
  }


  public companion object

  internal object MethodBindings {
    public val setButtonMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouse", "set_button_mask")

    public val getButtonMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouse", "get_button_mask")

    public val setPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouse", "set_position")

    public val getPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouse", "get_position")

    public val setGlobalPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouse", "set_global_position")

    public val getGlobalPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouse", "get_global_position")
  }
}
