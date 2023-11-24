// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.Signal4
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * Custom control for editing properties that can be added to the [godot.EditorInspector].
 *
 * A custom control for editing properties that can be added to the [godot.EditorInspector]. It is added via [godot.EditorInspectorPlugin].
 */
@GodotBaseType
public open class EditorProperty internal constructor() : Container() {
  /**
   * Do not emit this manually, use the [emitChanged] method instead.
   */
  public val propertyChanged: Signal4<StringName, Any?, StringName, Boolean> by signal("property",
      "value", "field", "changing")

  /**
   * Emit it if you want multiple properties modified at the same time. Do not use if added via [godot.EditorInspectorPlugin.ParseProperty].
   */
  public val multiplePropertiesChanged: Signal2<PackedStringArray, VariantArray<Any?>> by
      signal("properties", "value")

  /**
   * Emit it if you want to add this value as an animation key (check for keying being enabled first).
   */
  public val propertyKeyed: Signal1<StringName> by signal("property")

  /**
   * Emitted when a property was deleted. Used internally.
   */
  public val propertyDeleted: Signal1<StringName> by signal("property")

  /**
   * Emit it if you want to key a property with a single value.
   */
  public val propertyKeyedWithValue: Signal2<StringName, Any?> by signal("property", "value")

  /**
   * Emitted when a property was checked. Used internally.
   */
  public val propertyChecked: Signal2<StringName, Boolean> by signal("property", "checked")

  /**
   * Emit it if you want to mark (or unmark) the value of a property for being saved regardless of being equal to the default value.
   *
   * The default value is the one the property will get when the node is just instantiated and can come from an ancestor scene in the inheritance/instantiation chain, a script or a builtin class.
   */
  public val propertyPinned: Signal2<StringName, Boolean> by signal("property", "pinned")

  /**
   * Emitted when the revertability (i.e., whether it has a non-default value and thus is displayed with a revert icon) of a property has changed.
   */
  public val propertyCanRevertChanged: Signal2<StringName, Boolean> by signal("property",
      "canRevert")

  /**
   * If you want a sub-resource to be edited, emit this signal with the resource.
   */
  public val resourceSelected: Signal2<String, Resource> by signal("path", "resource")

  /**
   * Used by sub-inspectors. Emit it if what was selected was an Object ID.
   */
  public val objectIdSelected: Signal2<StringName, Long> by signal("property", "id")

  /**
   * Emitted when selected. Used internally.
   */
  public val selected: Signal2<String, Long> by signal("path", "focusableIdx")

  /**
   * Set this property to change the label (if you want to show one).
   */
  public var label: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLabelPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLabelPtr, NIL)
    }

  /**
   * Used by the inspector, set to `true` when the property is read-only.
   */
  public var readOnly: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isReadOnlyPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setReadOnlyPtr, NIL)
    }

  /**
   * Used by the inspector, set to `true` when the property is checkable.
   */
  public var checkable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCheckablePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCheckablePtr, NIL)
    }

  /**
   * Used by the inspector, set to `true` when the property is checked.
   */
  public var checked: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCheckedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCheckedPtr, NIL)
    }

  /**
   * Used by the inspector, set to `true` when the property is drawn with the editor theme's warning color. This is used for editable children's properties.
   */
  public var drawWarning: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDrawWarningPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDrawWarningPtr, NIL)
    }

  /**
   * Used by the inspector, set to `true` when the property can add keys for animation.
   */
  public var keying: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isKeyingPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setKeyingPtr, NIL)
    }

  /**
   * Used by the inspector, set to `true` when the property can be deleted by the user.
   */
  public var deletable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDeletablePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDeletablePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORPROPERTY, scriptIndex)
    return true
  }

  /**
   * When this virtual function is called, you must update your editor.
   */
  public open fun _updateProperty(): Unit {
  }

  /**
   * Called when the read-only status of the property is changed. It may be used to change custom controls into a read-only or modifiable state.
   */
  public open fun _setReadOnly(readOnly: Boolean): Unit {
  }

  /**
   * Gets the edited property. If your editor is for a single property (added via [godot.EditorInspectorPlugin.ParseProperty]), then this will return the property.
   */
  public fun getEditedProperty(): StringName {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getEditedPropertyPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  /**
   * Gets the edited object.
   */
  public fun getEditedObject(): Object? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getEditedObjectPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Object?)
  }

  /**
   * Forces refresh of the property display.
   */
  public fun updateProperty(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.updatePropertyPtr, NIL)
  }

  /**
   * If any of the controls added can gain keyboard focus, add it here. This ensures that focus will be restored if the inspector is refreshed.
   */
  public fun addFocusable(control: Control): Unit {
    TransferContext.writeArguments(OBJECT to control)
    TransferContext.callMethod(rawPtr, MethodBindings.addFocusablePtr, NIL)
  }

  /**
   * Puts the [editor] control below the property label. The control must be previously added using [godot.Node.addChild].
   */
  public fun setBottomEditor(editor: Control): Unit {
    TransferContext.writeArguments(OBJECT to editor)
    TransferContext.callMethod(rawPtr, MethodBindings.setBottomEditorPtr, NIL)
  }

  /**
   * If one or several properties have changed, this must be called. [field] is used in case your editor can modify fields separately (as an example, Vector3.x). The [changing] argument avoids the editor requesting this property to be refreshed (leave as `false` if unsure).
   */
  @JvmOverloads
  public fun emitChanged(
    `property`: StringName,
    `value`: Any?,
    `field`: StringName = StringName(""),
    changing: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to property, ANY to value, STRING_NAME to field, BOOL to changing)
    TransferContext.callMethod(rawPtr, MethodBindings.emitChangedPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val _updatePropertyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorProperty", "_update_property")

    public val _setReadOnlyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorProperty", "_set_read_only")

    public val setLabelPtr: VoidPtr = TypeManager.getMethodBindPtr("EditorProperty", "set_label")

    public val getLabelPtr: VoidPtr = TypeManager.getMethodBindPtr("EditorProperty", "get_label")

    public val setReadOnlyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorProperty", "set_read_only")

    public val isReadOnlyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorProperty", "is_read_only")

    public val setCheckablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorProperty", "set_checkable")

    public val isCheckablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorProperty", "is_checkable")

    public val setCheckedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorProperty", "set_checked")

    public val isCheckedPtr: VoidPtr = TypeManager.getMethodBindPtr("EditorProperty", "is_checked")

    public val setDrawWarningPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorProperty", "set_draw_warning")

    public val isDrawWarningPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorProperty", "is_draw_warning")

    public val setKeyingPtr: VoidPtr = TypeManager.getMethodBindPtr("EditorProperty", "set_keying")

    public val isKeyingPtr: VoidPtr = TypeManager.getMethodBindPtr("EditorProperty", "is_keying")

    public val setDeletablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorProperty", "set_deletable")

    public val isDeletablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorProperty", "is_deletable")

    public val getEditedPropertyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorProperty", "get_edited_property")

    public val getEditedObjectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorProperty", "get_edited_object")

    public val updatePropertyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorProperty", "update_property")

    public val addFocusablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorProperty", "add_focusable")

    public val setBottomEditorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorProperty", "set_bottom_editor")

    public val emitChangedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorProperty", "emit_changed")
  }
}
