// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedStringArray
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.NotImplementedError
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
   * Emitted when the resource value was set and user clicked to edit it. When [inspect] is `true`, the signal was caused by the context menu "Edit" or "Inspect" option.
   */
  public val resourceSelected: Signal2<Resource, Boolean> by signal("resource", "inspect")

  /**
   * Emitted when the value of the edited resource was changed.
   */
  public val resourceChanged: Signal1<Resource> by signal("resource")

  /**
   * The base type of allowed resource types. Can be a comma-separated list of several options.
   */
  public var baseType: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBaseTypePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBaseTypePtr, NIL)
    }

  /**
   * The edited resource value.
   */
  public var editedResource: Resource?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEditedResourcePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Resource?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEditedResourcePtr, NIL)
    }

  /**
   * If `true`, the value can be selected and edited.
   */
  public var editable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isEditablePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEditablePtr, NIL)
    }

  /**
   * If `true`, the main button with the resource preview works in the toggle mode. Use [setTogglePressed] to manually set the state.
   */
  public var toggleMode: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isToggleModePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setToggleModePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORRESOURCEPICKER, scriptIndex)
    return true
  }

  /**
   * This virtual method is called when updating the context menu of [godot.EditorResourcePicker]. Implement this method to override the "New ..." items with your own options. [menuNode] is a reference to the [godot.PopupMenu] node.
   *
   * **Note:** Implement [_handleMenuSelected] to handle these custom items.
   */
  public open fun _setCreateOptions(menuNode: Object): Unit {
  }

  /**
   * This virtual method can be implemented to handle context menu items not handled by default. See [_setCreateOptions].
   */
  public open fun _handleMenuSelected(id: Int): Boolean {
    throw NotImplementedError("_handle_menu_selected is not implemented for EditorResourcePicker")
  }

  /**
   * Returns a list of all allowed types and subtypes corresponding to the [baseType]. If the [baseType] is empty, an empty list is returned.
   */
  public fun getAllowedTypes(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAllowedTypesPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Sets the toggle mode state for the main button. Works only if [toggleMode] is set to `true`.
   */
  public fun setTogglePressed(pressed: Boolean): Unit {
    TransferContext.writeArguments(BOOL to pressed)
    TransferContext.callMethod(rawPtr, MethodBindings.setTogglePressedPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val _setCreateOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorResourcePicker", "_set_create_options")

    public val _handleMenuSelectedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorResourcePicker", "_handle_menu_selected")

    public val setBaseTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorResourcePicker", "set_base_type")

    public val getBaseTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorResourcePicker", "get_base_type")

    public val getAllowedTypesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorResourcePicker", "get_allowed_types")

    public val setEditedResourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorResourcePicker", "set_edited_resource")

    public val getEditedResourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorResourcePicker", "get_edited_resource")

    public val setToggleModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorResourcePicker", "set_toggle_mode")

    public val isToggleModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorResourcePicker", "is_toggle_mode")

    public val setTogglePressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorResourcePicker", "set_toggle_pressed")

    public val setEditablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorResourcePicker", "set_editable")

    public val isEditablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorResourcePicker", "is_editable")
  }
}
