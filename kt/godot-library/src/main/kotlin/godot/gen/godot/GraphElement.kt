// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.signal
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * A container that represents a basic element that can be placed inside a [godot.GraphEdit] control.
 *
 * [godot.GraphElement] allows to create custom elements for a [godot.GraphEdit] graph. By default such elements can be selected, resized, and repositioned, but they cannot be connected. For a graph element that allows for connections see [godot.GraphNode].
 */
@GodotBaseType
public open class GraphElement : Container() {
  /**
   * Emitted when the GraphElement is selected.
   */
  public val nodeSelected: Signal0 by signal()

  /**
   * Emitted when the GraphElement is deselected.
   */
  public val nodeDeselected: Signal0 by signal()

  /**
   * Emitted when displaying the GraphElement over other ones is requested. Happens on focusing (clicking into) the GraphElement.
   */
  public val raiseRequest: Signal0 by signal()

  /**
   * Emitted when removing the GraphElement is requested.
   */
  public val deleteRequest: Signal0 by signal()

  /**
   * Emitted when resizing the GraphElement is requested. Happens on dragging the resizer handle (see [resizable]).
   */
  public val resizeRequest: Signal1<Vector2> by signal("newMinsize")

  /**
   * Emitted when the GraphElement is dragged.
   */
  public val dragged: Signal2<Vector2, Vector2> by signal("from", "to")

  /**
   * Emitted when the GraphElement is moved.
   */
  public val positionOffsetChanged: Signal0 by signal()

  /**
   * The offset of the GraphElement, relative to the scroll offset of the [godot.GraphEdit].
   */
  @CoreTypeLocalCopy
  public var positionOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHELEMENT_GET_POSITION_OFFSET,
          VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHELEMENT_SET_POSITION_OFFSET,
          NIL)
    }

  /**
   * If `true`, the user can resize the GraphElement.
   *
   * **Note:** Dragging the handle will only emit the [resizeRequest] signal, the GraphElement needs to be resized manually.
   */
  public var resizable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHELEMENT_IS_RESIZABLE, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHELEMENT_SET_RESIZABLE, NIL)
    }

  /**
   * If `true`, the user can drag the GraphElement.
   */
  public var draggable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHELEMENT_IS_DRAGGABLE, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHELEMENT_SET_DRAGGABLE, NIL)
    }

  /**
   * If `true`, the user can select the GraphElement.
   */
  public var selectable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHELEMENT_IS_SELECTABLE, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHELEMENT_SET_SELECTABLE, NIL)
    }

  /**
   * If `true`, the GraphElement is selected.
   */
  public var selected: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHELEMENT_IS_SELECTED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHELEMENT_SET_SELECTED, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GRAPHELEMENT, scriptIndex)
    return true
  }

  /**
   * The offset of the GraphElement, relative to the scroll offset of the [godot.GraphEdit].
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
   * val myCoreType = graphelement.positionOffset
   * //Your changes
   * graphelement.positionOffset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun positionOffsetMutate(block: Vector2.() -> Unit): Vector2 = positionOffset.apply{
      block(this)
      positionOffset = this
  }


  public companion object
}
