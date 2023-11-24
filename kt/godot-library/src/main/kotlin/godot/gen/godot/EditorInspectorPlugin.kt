// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedStringArray
import godot.core.TypeManager
import godot.core.VariantType
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * Plugin for adding custom property editors on the inspector.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/plugins/editor/inspector_plugins.html]($DOCS_URL/tutorials/plugins/editor/inspector_plugins.html)
 *
 * [godot.EditorInspectorPlugin] allows adding custom property editors to [godot.EditorInspector].
 *
 * When an object is edited, the [_canHandle] function is called and must return `true` if the object type is supported.
 *
 * If supported, the function [_parseBegin] will be called, allowing to place custom controls at the beginning of the class.
 *
 * Subsequently, the [_parseCategory] and [_parseProperty] are called for every category and property. They offer the ability to add custom controls to the inspector too.
 *
 * Finally, [_parseEnd] will be called.
 *
 * On each of these calls, the "add" functions can be called.
 *
 * To use [godot.EditorInspectorPlugin], register it using the [godot.EditorPlugin.addInspectorPlugin] method first.
 */
@GodotBaseType
public open class EditorInspectorPlugin internal constructor() : RefCounted() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORINSPECTORPLUGIN, scriptIndex)
    return true
  }

  /**
   * Returns `true` if this object can be handled by this plugin.
   */
  public open fun _canHandle(_object: Object): Boolean {
    throw NotImplementedError("_can_handle is not implemented for EditorInspectorPlugin")
  }

  /**
   * Called to allow adding controls at the beginning of the property list for [object].
   */
  public open fun _parseBegin(_object: Object): Unit {
  }

  /**
   * Called to allow adding controls at the beginning of a category in the property list for [object].
   */
  public open fun _parseCategory(_object: Object, category: String): Unit {
  }

  /**
   * Called to allow adding controls at the beginning of a group or a sub-group in the property list for [object].
   */
  public open fun _parseGroup(_object: Object, group: String): Unit {
  }

  /**
   * Called to allow adding property-specific editors to the property list for [object]. The added editor control must extend [godot.EditorProperty]. Returning `true` removes the built-in editor for this property, otherwise allows to insert a custom editor before the built-in one.
   */
  public open fun _parseProperty(
    _object: Object,
    type: VariantType,
    name: String,
    hintType: PropertyHint,
    hintString: String,
    usageFlags: PropertyUsageFlags,
    wide: Boolean,
  ): Boolean {
    throw NotImplementedError("_parse_property is not implemented for EditorInspectorPlugin")
  }

  /**
   * Called to allow adding controls at the end of the property list for [object].
   */
  public open fun _parseEnd(_object: Object): Unit {
  }

  /**
   * Adds a custom control, which is not necessarily a property editor.
   */
  public fun addCustomControl(control: Control): Unit {
    TransferContext.writeArguments(OBJECT to control)
    TransferContext.callMethod(rawPtr, MethodBindings.addCustomControlPtr, NIL)
  }

  /**
   * Adds a property editor for an individual property. The [editor] control must extend [godot.EditorProperty].
   */
  @JvmOverloads
  public fun addPropertyEditor(
    `property`: String,
    editor: Control,
    addToEnd: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(STRING to property, OBJECT to editor, BOOL to addToEnd)
    TransferContext.callMethod(rawPtr, MethodBindings.addPropertyEditorPtr, NIL)
  }

  /**
   * Adds an editor that allows modifying multiple properties. The [editor] control must extend [godot.EditorProperty].
   */
  public fun addPropertyEditorForMultipleProperties(
    label: String,
    properties: PackedStringArray,
    editor: Control,
  ): Unit {
    TransferContext.writeArguments(STRING to label, PACKED_STRING_ARRAY to properties, OBJECT to editor)
    TransferContext.callMethod(rawPtr, MethodBindings.addPropertyEditorForMultiplePropertiesPtr,
        NIL)
  }

  public companion object

  internal object MethodBindings {
    public val _canHandlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInspectorPlugin", "_can_handle")

    public val _parseBeginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInspectorPlugin", "_parse_begin")

    public val _parseCategoryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInspectorPlugin", "_parse_category")

    public val _parseGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInspectorPlugin", "_parse_group")

    public val _parsePropertyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInspectorPlugin", "_parse_property")

    public val _parseEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInspectorPlugin", "_parse_end")

    public val addCustomControlPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInspectorPlugin", "add_custom_control")

    public val addPropertyEditorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInspectorPlugin", "add_property_editor")

    public val addPropertyEditorForMultiplePropertiesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInspectorPlugin", "add_property_editor_for_multiple_properties")
  }
}
