// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * Custom control to edit properties for adding into the inspector.
 * 
 * This control allows property editing for one or multiple properties into [godot.EditorInspector]. It is added via [godot.EditorInspectorPlugin].
 */
@GodotBaseType
open class EditorProperty : Container() {
  /**
   * Emit it if you want multiple properties modified at the same time. Do not use if added via [godot.EditorInspectorPlugin.parseProperty].
   */
  val multiplePropertiesChanged: Signal2<PoolStringArray, VariantArray<Any?>> by
      signal("properties", "value")

  /**
   * Used by sub-inspectors. Emit it if what was selected was an Object ID.
   */
  val objectIdSelected: Signal2<String, Long> by signal("property", "id")

  /**
   * Do not emit this manually, use the [emitChanged] method instead.
   */
  val propertyChanged: Signal2<String, Any> by signal("property", "value")

  /**
   * Emitted when a property was checked. Used internally.
   */
  val propertyChecked: Signal2<String, String> by signal("property", "bool")

  /**
   * Emit it if you want to add this value as an animation key (check for keying being enabled first).
   */
  val propertyKeyed: Signal1<String> by signal("property")

  /**
   * Emit it if you want to key a property with a single value.
   */
  val propertyKeyedWithValue: Signal2<String, Any> by signal("property", "value")

  /**
   * If you want a sub-resource to be edited, emit this signal with the resource.
   */
  val resourceSelected: Signal2<String, Resource> by signal("path", "resource")

  /**
   * Emitted when selected. Used internally.
   */
  val selected: Signal2<String, Long> by signal("path", "focusable_idx")

  /**
   * Used by the inspector, set to `true` when the property is checkable.
   */
  open var checkable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_GET_CHECKABLE,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_SET_CHECKABLE, NIL)
    }

  /**
   * Used by the inspector, set to `true` when the property is checked.
   */
  open var checked: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_GET_CHECKED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_SET_CHECKED, NIL)
    }

  /**
   * Used by the inspector, set to `true` when the property must draw with error color. This is used for editable children's properties.
   */
  open var drawRed: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_GET_DRAW_RED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_SET_DRAW_RED, NIL)
    }

  /**
   * Used by the inspector, set to `true` when the property can add keys for animation.
   */
  open var keying: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_GET_KEYING, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_SET_KEYING, NIL)
    }

  /**
   * Set this property to change the label (if you want to show one).
   */
  open var label: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_GET_LABEL, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_SET_LABEL, NIL)
    }

  /**
   * Used by the inspector, set to `true` when the property is read-only.
   */
  open var readOnly: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_GET_READ_ONLY,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_SET_READ_ONLY, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_EDITORPROPERTY)
  }

  open fun _focusableFocused(arg0: Long) {
  }

  override fun _guiInput(event: InputEvent) {
  }

  /**
   * If any of the controls added can gain keyboard focus, add it here. This ensures that focus will be restored if the inspector is refreshed.
   */
  open fun addFocusable(control: Control) {
    TransferContext.writeArguments(OBJECT to control)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_ADD_FOCUSABLE, NIL)
  }

  /**
   * If one or several properties have changed, this must be called. `field` is used in case your editor can modify fields separately (as an example, Vector3.x). The `changing` argument avoids the editor requesting this property to be refreshed (leave as `false` if unsure).
   */
  open fun emitChanged(
    property: String,
    value: Any?,
    field: String = "",
    changing: Boolean = false
  ) {
    TransferContext.writeArguments(STRING to property, ANY to value, STRING to field, BOOL to
        changing)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_EMIT_CHANGED, NIL)
  }

  /**
   * Gets the edited object.
   */
  open fun getEditedObject(): Object? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_GET_EDITED_OBJECT,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Object?
  }

  /**
   * Gets the edited property. If your editor is for a single property (added via [godot.EditorInspectorPlugin.parseProperty]), then this will return the property.
   */
  open fun getEditedProperty(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_GET_EDITED_PROPERTY,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Override if you want to allow a custom tooltip over your property.
   */
  open fun getTooltipText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_GET_TOOLTIP_TEXT,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Adds controls with this function if you want them on the bottom (below the label).
   */
  open fun setBottomEditor(editor: Control) {
    TransferContext.writeArguments(OBJECT to editor)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_SET_BOTTOM_EDITOR,
        NIL)
  }

  /**
   * When this virtual function is called, you must update your editor.
   */
  open fun _updateProperty() {
  }
}
