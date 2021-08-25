// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_STRING_ARRAY
import godot.core.VariantType.STRING
import kotlin.Boolean
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Plugin for adding custom property editors on inspector.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/3.3/tutorials/plugins/editor/inspector_plugins.html](https://docs.godotengine.org/en/3.3/tutorials/plugins/editor/inspector_plugins.html)
 *
 * These plugins allow adding custom property editors to [godot.EditorInspector].
 *
 * Plugins are registered via [godot.EditorPlugin.addInspectorPlugin].
 *
 * When an object is edited, the [canHandle] function is called and must return `true` if the object type is supported.
 *
 * If supported, the function [parseBegin] will be called, allowing to place custom controls at the beginning of the class.
 *
 * Subsequently, the [parseCategory] and [parseProperty] are called for every category and property. They offer the ability to add custom controls to the inspector too.
 *
 * Finally, [parseEnd] will be called.
 *
 * On each of these calls, the "add" functions can be called.
 */
@GodotBaseType
public open class EditorInspectorPlugin : Reference() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_EDITORINSPECTORPLUGIN)
  }

  /**
   * Adds a custom control, which is not necessarily a property editor.
   */
  public open fun addCustomControl(control: Control): Unit {
    TransferContext.writeArguments(OBJECT to control)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORINSPECTORPLUGIN_ADD_CUSTOM_CONTROL, NIL)
  }

  /**
   * Adds a property editor for an individual property. The `editor` control must extend [godot.EditorProperty].
   */
  public open fun addPropertyEditor(`property`: String, editor: Control): Unit {
    TransferContext.writeArguments(STRING to property, OBJECT to editor)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORINSPECTORPLUGIN_ADD_PROPERTY_EDITOR, NIL)
  }

  /**
   * Adds an editor that allows modifying multiple properties. The `editor` control must extend [godot.EditorProperty].
   */
  public open fun addPropertyEditorForMultipleProperties(
    label: String,
    properties: PoolStringArray,
    editor: Control
  ): Unit {
    TransferContext.writeArguments(STRING to label, POOL_STRING_ARRAY to properties, OBJECT to
        editor)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORINSPECTORPLUGIN_ADD_PROPERTY_EDITOR_FOR_MULTIPLE_PROPERTIES,
        NIL)
  }

  /**
   * Returns `true` if this object can be handled by this plugin.
   */
  public open fun _canHandle(_object: Object): Boolean {
    throw NotImplementedError("can_handle is not implemented for EditorInspectorPlugin")
  }

  /**
   * Called to allow adding controls at the beginning of the list.
   */
  public open fun _parseBegin(_object: Object): Unit {
  }

  /**
   * Called to allow adding controls at the beginning of the category.
   */
  public open fun _parseCategory(_object: Object, category: String): Unit {
  }

  /**
   * Called to allow adding controls at the end of the list.
   */
  public open fun _parseEnd(): Unit {
  }

  /**
   * Called to allow adding property specific editors to the inspector. Usually these inherit [godot.EditorProperty]. Returning `true` removes the built-in editor for this property, otherwise allows to insert a custom editor before the built-in one.
   */
  public open fun _parseProperty(
    _object: Object,
    type: Long,
    path: String,
    hint: Long,
    hintText: String,
    usage: Long
  ): Boolean {
    throw NotImplementedError("parse_property is not implemented for EditorInspectorPlugin")
  }
}
