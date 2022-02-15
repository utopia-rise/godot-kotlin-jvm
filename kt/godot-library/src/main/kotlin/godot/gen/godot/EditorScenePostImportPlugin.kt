// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import kotlin.Any
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Plugin to control and modifying the process of importing a scene.
 *
 * This plugin type exists to modify the process of importing scenes, allowing to change the content as well as add importer options at every stage of the process.
 */
@GodotBaseType
public open class EditorScenePostImportPlugin : RefCounted() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_EDITORSCENEPOSTIMPORTPLUGIN)
  }

  /**
   * Override to add internal import options. These will appear in the 3D scene import dialog. Add options via [addImportOption] and [addImportOptionAdvanced].
   */
  public open fun _getInternalImportOptions(category: Long): Unit {
  }

  /**
   * Return true or false whether a given option should be visible. Return null to ignore.
   */
  public open fun _getInternalOptionVisibility(category: Long, option: String): Any? {
    throw
        NotImplementedError("_get_internal_option_visibility is not implemented for EditorScenePostImportPlugin")
  }

  /**
   * Return true whether updating the 3D view of the import dialog needs to be updated if an option has changed.
   */
  public open fun _getInternalOptionUpdateViewRequired(category: Long, option: String): Any? {
    throw
        NotImplementedError("_get_internal_option_update_view_required is not implemented for EditorScenePostImportPlugin")
  }

  /**
   * Process a specific node or resource for a given category.
   */
  public open fun _internalProcess(
    category: Long,
    baseNode: Node,
    node: Node,
    resource: Resource
  ): Unit {
  }

  /**
   * Override to add general import options. These will appear in the main import dock on the editor. Add options via [addImportOption] and [addImportOptionAdvanced].
   */
  public open fun _getImportOptions(path: String): Unit {
  }

  /**
   * Return true or false whether a given option should be visible. Return null to ignore.
   */
  public open fun _getOptionVisibility(path: String, option: String): Any? {
    throw
        NotImplementedError("_get_option_visibility is not implemented for EditorScenePostImportPlugin")
  }

  /**
   * Pre Process the scene. This function is called right after the scene format loader loaded the scene and no changes have been made.
   */
  public open fun _preProcess(scene: Node): Unit {
  }

  /**
   * Post process the scene. This function is called after the final scene has been configured.
   */
  public open fun _postProcess(scene: Node): Unit {
  }

  /**
   * Query the value of an option. This function can only be called from those querying visibility, or processing.
   */
  public open fun getOptionValue(name: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORSCENEPOSTIMPORTPLUGIN_GET_OPTION_VALUE, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Add a specific import option (name and default value only). This function can only be called from [_getImportOptions] and [_getInternalImportOptions].
   */
  public open fun addImportOption(name: String, `value`: Any): Unit {
    TransferContext.writeArguments(STRING to name, ANY to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORSCENEPOSTIMPORTPLUGIN_ADD_IMPORT_OPTION, NIL)
  }

  /**
   * Add a specific import option. This function can only be called from [_getImportOptions] and [_getInternalImportOptions].
   */
  public open fun addImportOptionAdvanced(
    type: Variant.Type,
    name: String,
    defaultValue: Any,
    hint: PropertyHint = PropertyHint.PROPERTY_HINT_NONE,
    hintString: String = "",
    usageFlags: Long = 7
  ): Unit {
    TransferContext.writeArguments(LONG to type.id, STRING to name, ANY to defaultValue, LONG to
        hint.id, STRING to hintString, LONG to usageFlags)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORSCENEPOSTIMPORTPLUGIN_ADD_IMPORT_OPTION_ADVANCED, NIL)
  }

  public enum class InternalImportCategory(
    id: Long
  ) {
    /**
     *
     */
    INTERNAL_IMPORT_CATEGORY_NODE(0),
    /**
     *
     */
    INTERNAL_IMPORT_CATEGORY_MESH_3D_NODE(1),
    /**
     *
     */
    INTERNAL_IMPORT_CATEGORY_MESH(2),
    /**
     *
     */
    INTERNAL_IMPORT_CATEGORY_MATERIAL(3),
    /**
     *
     */
    INTERNAL_IMPORT_CATEGORY_ANIMATION(4),
    /**
     *
     */
    INTERNAL_IMPORT_CATEGORY_ANIMATION_NODE(5),
    /**
     *
     */
    INTERNAL_IMPORT_CATEGORY_MAX(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
