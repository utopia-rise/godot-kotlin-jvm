// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Signal0
import godot.core.Signal1
import godot.core.Signal2
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.NIL
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
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
  public val nodeSelected: Signal0 by Signal0

  /**
   * Emitted when the GraphElement is deselected.
   */
  public val nodeDeselected: Signal0 by Signal0

  /**
   * Emitted when displaying the GraphElement over other ones is requested. Happens on focusing
   * (clicking into) the GraphElement.
   */
  public val raiseRequest: Signal0 by Signal0

  /**
   * Emitted when removing the GraphElement is requested.
   */
  public val deleteRequest: Signal0 by Signal0

  /**
   * Emitted when resizing the GraphElement is requested. Happens on dragging the resizer handle
   * (see [resizable]).
   */
  public val resizeRequest: Signal1<Vector2> by Signal1

  /**
   * Emitted when releasing the mouse button after dragging the resizer handle (see [resizable]).
   */
  public val resizeEnd: Signal1<Vector2> by Signal1

  /**
   * Emitted when the GraphElement is dragged.
   */
  public val dragged: Signal2<Vector2, Vector2> by Signal2

  /**
   * Emitted when the GraphElement is moved.
   */
  public val positionOffsetChanged: Signal0 by Signal0

  /**
   * The offset of the GraphElement, relative to the scroll offset of the [GraphEdit].
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
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
   *
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
    createNativeObject(263, scriptIndex)
  }

  /**
   * This is a helper function for [positionOffset] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = graphelement.positionOffset
   * //Your changes
   * graphelement.positionOffset = myCoreType
   * ``````
   *
   * The offset of the GraphElement, relative to the scroll offset of the [GraphEdit].
   */
  @CoreTypeHelper
  public final fun positionOffsetMutate(block: Vector2.() -> Unit): Vector2 = positionOffset.apply {
     block(this)
     positionOffset = this
  }

  public final fun setResizable(resizable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to resizable)
    TransferContext.callMethod(ptr, MethodBindings.setResizablePtr, NIL)
  }

  public final fun isResizable(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isResizablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDraggable(draggable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to draggable)
    TransferContext.callMethod(ptr, MethodBindings.setDraggablePtr, NIL)
  }

  public final fun isDraggable(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isDraggablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setSelectable(selectable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to selectable)
    TransferContext.callMethod(ptr, MethodBindings.setSelectablePtr, NIL)
  }

  public final fun isSelectable(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isSelectablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setSelected(selected: Boolean): Unit {
    TransferContext.writeArguments(BOOL to selected)
    TransferContext.callMethod(ptr, MethodBindings.setSelectedPtr, NIL)
  }

  public final fun isSelected(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isSelectedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setPositionOffset(offset: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to offset)
    TransferContext.callMethod(ptr, MethodBindings.setPositionOffsetPtr, NIL)
  }

  public final fun getPositionOffset(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPositionOffsetPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public companion object

  public object MethodBindings {
    internal val setResizablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphElement", "set_resizable", 2586408642)

    internal val isResizablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphElement", "is_resizable", 36873697)

    internal val setDraggablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphElement", "set_draggable", 2586408642)

    internal val isDraggablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphElement", "is_draggable", 2240911060)

    internal val setSelectablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphElement", "set_selectable", 2586408642)

    internal val isSelectablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphElement", "is_selectable", 2240911060)

    internal val setSelectedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphElement", "set_selected", 2586408642)

    internal val isSelectedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphElement", "is_selected", 2240911060)

    internal val setPositionOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphElement", "set_position_offset", 743155724)

    internal val getPositionOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphElement", "get_position_offset", 3341600327)
  }
}
