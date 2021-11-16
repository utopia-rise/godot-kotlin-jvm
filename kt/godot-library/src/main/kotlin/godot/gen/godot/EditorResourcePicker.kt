// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Godot editor's control for selecting [godot.Resource] type properties.
 *
 * This [godot.Control] node is used in the editor's Inspector dock to allow editing of [godot.Resource] type properties. It provides options for creating, loading, saving and converting resources. Can be used with [godot.EditorInspectorPlugin] to recreate the same behavior.
 *
 * **Note:** This [godot.Control] does not include any editor for the resource, as editing is controlled by the Inspector dock itself or sub-Inspectors.
 */
@GodotBaseType
public open class EditorResourcePicker : HBoxContainer() {
  /**
   * Emitted when the value of the edited resource was changed.
   */
  public val resourceChanged: Signal1<Resource> by signal("resource")

  /**
   * Emitted when the resource value was set and user clicked to edit it. When `edit` is `true`, the signal was caused by the context menu "Edit" option.
   */
  public val resourceSelected: Signal2<Resource, Boolean> by signal("resource", "edit")

  /**
   * The base type of allowed resource types. Can be a comma-separated list of several options.
   */
  public open var baseType: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_EDITORRESOURCEPICKER_GET_BASE_TYPE, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_EDITORRESOURCEPICKER_SET_BASE_TYPE, NIL)
    }

  /**
   * If `true`, the value can be selected and edited.
   */
  public open var editable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORRESOURCEPICKER_GET_EDITABLE,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORRESOURCEPICKER_SET_EDITABLE,
          NIL)
    }

  /**
   * The edited resource value.
   */
  public open var editedResource: Resource?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_EDITORRESOURCEPICKER_GET_EDITED_RESOURCE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Resource?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_EDITORRESOURCEPICKER_SET_EDITED_RESOURCE, NIL)
    }

  /**
   * If `true`, the main button with the resource preview works in the toggle mode. Use [setTogglePressed] to manually set the state.
   */
  public open var toggleMode: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_EDITORRESOURCEPICKER_GET_TOGGLE_MODE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_EDITORRESOURCEPICKER_SET_TOGGLE_MODE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_EDITORRESOURCEPICKER)
  }

  public open fun _buttonDraw(): Unit {
  }

  public open fun _buttonInput(arg0: InputEvent): Unit {
  }

  public open fun _editMenuCbk(arg0: Long): Unit {
  }

  public open fun _fileQuickSelected(): Unit {
  }

  public open fun _fileSelected(arg0: String): Unit {
  }

  public open fun _resourceSelected(): Unit {
  }

  public open fun _updateMenu(): Unit {
  }

  public open fun _updateResourcePreview(
    arg0: String,
    arg1: Texture,
    arg2: Texture,
    arg3: Long
  ): Unit {
  }

  /**
   *
   */
  public open fun canDropDataFw(
    position: Vector2,
    `data`: Any?,
    from: Control
  ): Boolean {
    TransferContext.writeArguments(VECTOR2 to position, ANY to data, OBJECT to from)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORRESOURCEPICKER_CAN_DROP_DATA_FW, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  public open fun dropDataFw(
    position: Vector2,
    `data`: Any?,
    from: Control
  ): Unit {
    TransferContext.writeArguments(VECTOR2 to position, ANY to data, OBJECT to from)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORRESOURCEPICKER_DROP_DATA_FW,
        NIL)
  }

  /**
   * Returns a list of all allowed types and subtypes corresponding to the [baseType]. If the [baseType] is empty, an empty list is returned.
   */
  public open fun getAllowedTypes(): PoolStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORRESOURCEPICKER_GET_ALLOWED_TYPES, POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   *
   */
  public open fun getDragDataFw(position: Vector2, from: Control): Any? {
    TransferContext.writeArguments(VECTOR2 to position, OBJECT to from)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORRESOURCEPICKER_GET_DRAG_DATA_FW, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * This virtual method can be implemented to handle context menu items not handled by default. See [setCreateOptions].
   */
  public open fun _handleMenuSelected(id: Long): Unit {
  }

  /**
   * This virtual method is called when updating the context menu of [godot.EditorResourcePicker]. Implement this method to override the "New ..." items with your own options. `menu_node` is a reference to the [godot.PopupMenu] node.
   *
   * **Note:** Implement [handleMenuSelected] to handle these custom items.
   */
  public open fun _setCreateOptions(menuNode: Object): Unit {
  }

  /**
   * Sets the toggle mode state for the main button. Works only if [toggleMode] is set to `true`.
   */
  public open fun setTogglePressed(pressed: Boolean): Unit {
    TransferContext.writeArguments(BOOL to pressed)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORRESOURCEPICKER_SET_TOGGLE_PRESSED, NIL)
  }
}
