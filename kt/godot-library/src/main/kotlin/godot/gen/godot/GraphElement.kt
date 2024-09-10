// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * [GraphElement] allows to create custom elements for a [GraphEdit] graph. By default such elements
 * can be selected, resized, and repositioned, but they cannot be connected. For a graph element that
 * allows for connections see [GraphNode].
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
   * Emitted when displaying the GraphElement over other ones is requested. Happens on focusing
   * (clicking into) the GraphElement.
   */
  public val raiseRequest: Signal0 by signal()

  /**
   * Emitted when removing the GraphElement is requested.
   */
  public val deleteRequest: Signal0 by signal()

  /**
   * Emitted when resizing the GraphElement is requested. Happens on dragging the resizer handle
   * (see [resizable]).
   */
  public val resizeRequest: Signal1<Vector2> by signal("newSize")

  /**
   * Emitted when releasing the mouse button after dragging the resizer handle (see [resizable]).
   */
  public val resizeEnd: Signal1<Vector2> by signal("newSize")

  /**
   * Emitted when the GraphElement is dragged.
   */
  public val dragged: Signal2<Vector2, Vector2> by signal("from", "to")

  /**
   * Emitted when the GraphElement is moved.
   */
  public val positionOffsetChanged: Signal0 by signal()

  /**
   * The offset of the GraphElement, relative to the scroll offset of the [GraphEdit].
   */
  @CoreTypeLocalCopy
  public final inline var positionOffset: Vector2
    @JvmName("positionOffsetProperty")
    get() = getPositionOffset()
    @JvmName("positionOffsetProperty")
    set(`value`) {
      setPositionOffset(value)
    }

  /**
   * If `true`, the user can resize the GraphElement.
   * **Note:** Dragging the handle will only emit the [signal resize_request] and [signal
   * resize_end] signals, the GraphElement needs to be resized manually.
   */
  public final inline var resizable: Boolean
    @JvmName("resizableProperty")
    get() = isResizable()
    @JvmName("resizableProperty")
    set(`value`) {
      setResizable(value)
    }

  /**
   * If `true`, the user can drag the GraphElement.
   */
  public final inline var draggable: Boolean
    @JvmName("draggableProperty")
    get() = isDraggable()
    @JvmName("draggableProperty")
    set(`value`) {
      setDraggable(value)
    }

  /**
   * If `true`, the user can select the GraphElement.
   */
  public final inline var selectable: Boolean
    @JvmName("selectableProperty")
    get() = isSelectable()
    @JvmName("selectableProperty")
    set(`value`) {
      setSelectable(value)
    }

  /**
   * If `true`, the GraphElement is selected.
   */
  public final inline var selected: Boolean
    @JvmName("selectedProperty")
    get() = isSelected()
    @JvmName("selectedProperty")
    set(`value`) {
      setSelected(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_GRAPHELEMENT, scriptIndex)
  }

  /**
   * The offset of the GraphElement, relative to the scroll offset of the [GraphEdit].
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
  public final fun positionOffsetMutate(block: Vector2.() -> Unit): Vector2 = positionOffset.apply{
      block(this)
      positionOffset = this
  }


  public final fun setResizable(resizable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to resizable)
    TransferContext.callMethod(rawPtr, MethodBindings.setResizablePtr, NIL)
  }

  public final fun isResizable(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isResizablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public final fun setDraggable(draggable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to draggable)
    TransferContext.callMethod(rawPtr, MethodBindings.setDraggablePtr, NIL)
  }

  public final fun isDraggable(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isDraggablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public final fun setSelectable(selectable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to selectable)
    TransferContext.callMethod(rawPtr, MethodBindings.setSelectablePtr, NIL)
  }

  public final fun isSelectable(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isSelectablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public final fun setSelected(selected: Boolean): Unit {
    TransferContext.writeArguments(BOOL to selected)
    TransferContext.callMethod(rawPtr, MethodBindings.setSelectedPtr, NIL)
  }

  public final fun isSelected(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isSelectedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public final fun setPositionOffset(offset: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to offset)
    TransferContext.callMethod(rawPtr, MethodBindings.setPositionOffsetPtr, NIL)
  }

  public final fun getPositionOffset(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPositionOffsetPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public companion object

  internal object MethodBindings {
    public val setResizablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphElement", "set_resizable", 2586408642)

    public val isResizablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphElement", "is_resizable", 36873697)

    public val setDraggablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphElement", "set_draggable", 2586408642)

    public val isDraggablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphElement", "is_draggable", 2240911060)

    public val setSelectablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphElement", "set_selectable", 2586408642)

    public val isSelectablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphElement", "is_selectable", 2240911060)

    public val setSelectedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphElement", "set_selected", 2586408642)

    public val isSelectedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphElement", "is_selected", 2240911060)

    public val setPositionOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphElement", "set_position_offset", 743155724)

    public val getPositionOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphElement", "get_position_offset", 3341600327)
  }
}
