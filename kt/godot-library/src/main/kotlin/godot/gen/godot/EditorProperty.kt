// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
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
import kotlin.Unit

/**
 * Custom control to edit properties for adding into the inspector.
 *
 * This control allows property editing for one or multiple properties into [godot.EditorInspector]. It is added via [godot.EditorInspectorPlugin].
 */
@GodotBaseType
public open class EditorProperty : Container() {
  /**
   * Emit it if you want multiple properties modified at the same time. Do not use if added via [godot.EditorInspectorPlugin.parseProperty].
   */
  public val multiplePropertiesChanged: Signal2<PoolStringArray, VariantArray<Any?>> by
      signal("properties", "value")

  /**
   * Used by sub-inspectors. Emit it if what was selected was an Object ID.
   */
  public val objectIdSelected: Signal2<String, Long> by signal("property", "id")

  /**
   * Do not emit this manually, use the [emitChanged] method instead.
   */
  public val propertyChanged: Signal2<String, Any> by signal("property", "value")

  /**
   * Emitted when a property was checked. Used internally.
   */
  public val propertyChecked: Signal2<String, Boolean> by signal("property", "checked")

  /**
   * Emit it if you want to add this value as an animation key (check for keying being enabled first).
   */
  public val propertyKeyed: Signal1<String> by signal("property")

  /**
   * Emit it if you want to key a property with a single value.
   */
  public val propertyKeyedWithValue: Signal2<String, Any> by signal("property", "value")

  /**
   * Emit it if you want to mark (or unmark) the value of a property for being saved regardless of being equal to the default value.
   *
   * The default value is the one the property will get when the node is just instantiated and can come from an ancestor scene in the inheritance/instancing chain, a script or a builtin class.
   */
  public val propertyPinned: Signal2<String, Boolean> by signal("property", "pinned")

  /**
   * If you want a sub-resource to be edited, emit this signal with the resource.
   */
  public val resourceSelected: Signal2<String, Resource> by signal("path", "resource")

  /**
   * Emitted when selected. Used internally.
   */
  public val selected: Signal2<String, Long> by signal("path", "focusable_idx")

  /**
   * Used by the inspector, set to `true` when the property is checkable.
   */
  public open var checkable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_GET_CHECKABLE,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_SET_CHECKABLE, NIL)
    }

  /**
   * Used by the inspector, set to `true` when the property is checked.
   */
  public open var checked: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_GET_CHECKED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_SET_CHECKED, NIL)
    }

  /**
   * Used by the inspector, set to `true` when the property is drawn with the editor theme's warning color. This is used for editable children's properties.
   */
  public open var drawRed: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_GET_DRAW_RED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_SET_DRAW_RED, NIL)
    }

  /**
   * Used by the inspector, set to `true` when the property can add keys for animation.
   */
  public open var keying: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_GET_KEYING, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_SET_KEYING, NIL)
    }

  /**
   * Set this property to change the label (if you want to show one).
   */
  public open var label: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_GET_LABEL, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_SET_LABEL, NIL)
    }

  /**
   * Used by the inspector, set to `true` when the property is read-only.
   */
  public open var readOnly: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_GET_READ_ONLY,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_SET_READ_ONLY, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_EDITORPROPERTY)
  }

  public open fun _focusableFocused(arg0: Long): Unit {
  }

  public override fun _guiInput(event: InputEvent): Unit {
  }

  public open fun _menuOption(option: Long): Unit {
  }

  public open fun _unhandledKeyInput(arg0: InputEvent): Unit {
  }

  public open fun _updateRevertAndPinStatus(): Unit {
  }

  /**
   * If any of the controls added can gain keyboard focus, add it here. This ensures that focus will be restored if the inspector is refreshed.
   */
  public open fun addFocusable(control: Control): Unit {
    TransferContext.writeArguments(OBJECT to control)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_ADD_FOCUSABLE, NIL)
  }

  /**
   * If one or several properties have changed, this must be called. `field` is used in case your editor can modify fields separately (as an example, Vector3.x). The `changing` argument avoids the editor requesting this property to be refreshed (leave as `false` if unsure).
   */
  public open fun emitChanged(
    `property`: String,
    `value`: Any?,
    `field`: String = "",
    changing: Boolean = false
  ): Unit {
    TransferContext.writeArguments(STRING to property, ANY to value, STRING to field, BOOL to
        changing)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_EMIT_CHANGED, NIL)
  }

  /**
   * Gets the edited object.
   */
  public open fun getEditedObject(): Object? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_GET_EDITED_OBJECT,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Object?
  }

  /**
   * Gets the edited property. If your editor is for a single property (added via [godot.EditorInspectorPlugin.parseProperty]), then this will return the property.
   */
  public open fun getEditedProperty(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_GET_EDITED_PROPERTY,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Must be implemented to provide a custom tooltip to the property editor.
   */
  public open fun getTooltipText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_GET_TOOLTIP_TEXT,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Puts the `editor` control below the property label. The control must be previously added using [godot.Node.addChild].
   */
  public open fun setBottomEditor(editor: Control): Unit {
    TransferContext.writeArguments(OBJECT to editor)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPROPERTY_SET_BOTTOM_EDITOR,
        NIL)
  }

  /**
   * When this virtual function is called, you must update your editor.
   */
  public open fun _updateProperty(): Unit {
  }
}
