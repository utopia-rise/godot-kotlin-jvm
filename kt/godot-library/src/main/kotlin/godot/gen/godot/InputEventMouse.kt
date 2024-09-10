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
import kotlin.jvm.JvmName

/**
 * Stores general information about mouse events.
 */
@GodotBaseType
public open class InputEventMouse internal constructor() : InputEventWithModifiers() {
  /**
   * The mouse button mask identifier, one of or a bitwise combination of the [MouseButton] button
   * masks.
   */
  public final inline var buttonMask: MouseButtonMask
    @JvmName("buttonMaskProperty")
    get() = getButtonMask()
    @JvmName("buttonMaskProperty")
    set(`value`) {
      setButtonMask(value)
    }

  /**
   * When received in [Node.Input] or [Node.UnhandledInput], returns the mouse's position in the
   * [Viewport] this [Node] is in using the coordinate system of this [Viewport].
   * When received in [Control.GuiInput], returns the mouse's position in the [Control] using the
   * local coordinate system of the [Control].
   */
  @CoreTypeLocalCopy
  public final inline var position: Vector2
    @JvmName("positionProperty")
    get() = getPosition()
    @JvmName("positionProperty")
    set(`value`) {
      setPosition(value)
    }

  /**
   * When received in [Node.Input] or [Node.UnhandledInput], returns the mouse's position in the
   * root [Viewport] using the coordinate system of the root [Viewport].
   * When received in [Control.GuiInput], returns the mouse's position in the [CanvasLayer] that the
   * [Control] is in using the coordinate system of the [CanvasLayer].
   */
  @CoreTypeLocalCopy
  public final inline var globalPosition: Vector2
    @JvmName("globalPositionProperty")
    get() = getGlobalPosition()
    @JvmName("globalPositionProperty")
    set(`value`) {
      setGlobalPosition(value)
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
  public final fun positionMutate(block: Vector2.() -> Unit): Vector2 = position.apply{
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
  public final fun globalPositionMutate(block: Vector2.() -> Unit): Vector2 = globalPosition.apply{
      block(this)
      globalPosition = this
  }


  public final fun setButtonMask(buttonMask: MouseButtonMask): Unit {
    TransferContext.writeArguments(LONG to buttonMask.flag)
    TransferContext.callMethod(rawPtr, MethodBindings.setButtonMaskPtr, NIL)
  }

  public final fun getButtonMask(): MouseButtonMask {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getButtonMaskPtr, LONG)
    return MouseButtonMaskValue(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setPosition(position: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.setPositionPtr, NIL)
  }

  public final fun getPosition(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public final fun setGlobalPosition(globalPosition: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to globalPosition)
    TransferContext.callMethod(rawPtr, MethodBindings.setGlobalPositionPtr, NIL)
  }

  public final fun getGlobalPosition(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getGlobalPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public companion object

  internal object MethodBindings {
    public val setButtonMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouse", "set_button_mask", 3950145251)

    public val getButtonMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouse", "get_button_mask", 2512161324)

    public val setPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouse", "set_position", 743155724)

    public val getPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouse", "get_position", 3341600327)

    public val setGlobalPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouse", "set_global_position", 743155724)

    public val getGlobalPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouse", "get_global_position", 3341600327)
  }
}
