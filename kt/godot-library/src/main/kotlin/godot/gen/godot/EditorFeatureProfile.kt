// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * An editor feature profile which can be used to disable specific features.
 *
 * An editor feature profile can be used to disable specific features of the Godot editor. When disabled, the features won't appear in the editor, which makes the editor less cluttered. This is useful in education settings to reduce confusion or when working in a team. For example, artists and level designers could use a feature profile that disables the script editor to avoid accidentally making changes to files they aren't supposed to edit.
 *
 * To manage editor feature profiles visually, use **Editor > Manage Feature Profiles...** at the top of the editor window.
 */
@GodotBaseType
public open class EditorFeatureProfile internal constructor() : RefCounted() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORFEATUREPROFILE, scriptIndex)
    return true
  }

  /**
   * If [disable] is `true`, disables the class specified by [className]. When disabled, the class won't appear in the Create New Node dialog.
   */
  public fun setDisableClass(className: StringName, disable: Boolean): Unit {
    TransferContext.writeArguments(STRING_NAME to className, BOOL to disable)
    TransferContext.callMethod(rawPtr, MethodBindings.setDisableClassPtr, NIL)
  }

  /**
   * Returns `true` if the class specified by [className] is disabled. When disabled, the class won't appear in the Create New Node dialog.
   */
  public fun isClassDisabled(className: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to className)
    TransferContext.callMethod(rawPtr, MethodBindings.isClassDisabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * If [disable] is `true`, disables editing for the class specified by [className]. When disabled, the class will still appear in the Create New Node dialog but the Inspector will be read-only when selecting a node that extends the class.
   */
  public fun setDisableClassEditor(className: StringName, disable: Boolean): Unit {
    TransferContext.writeArguments(STRING_NAME to className, BOOL to disable)
    TransferContext.callMethod(rawPtr, MethodBindings.setDisableClassEditorPtr, NIL)
  }

  /**
   * Returns `true` if editing for the class specified by [className] is disabled. When disabled, the class will still appear in the Create New Node dialog but the Inspector will be read-only when selecting a node that extends the class.
   */
  public fun isClassEditorDisabled(className: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to className)
    TransferContext.callMethod(rawPtr, MethodBindings.isClassEditorDisabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * If [disable] is `true`, disables editing for [property] in the class specified by [className]. When a property is disabled, it won't appear in the Inspector when selecting a node that extends the class specified by [className].
   */
  public fun setDisableClassProperty(
    className: StringName,
    `property`: StringName,
    disable: Boolean,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to className, STRING_NAME to property, BOOL to disable)
    TransferContext.callMethod(rawPtr, MethodBindings.setDisableClassPropertyPtr, NIL)
  }

  /**
   * Returns `true` if [property] is disabled in the class specified by [className]. When a property is disabled, it won't appear in the Inspector when selecting a node that extends the class specified by [className].
   */
  public fun isClassPropertyDisabled(className: StringName, `property`: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to className, STRING_NAME to property)
    TransferContext.callMethod(rawPtr, MethodBindings.isClassPropertyDisabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * If [disable] is `true`, disables the editor feature specified in [feature]. When a feature is disabled, it will disappear from the editor entirely.
   */
  public fun setDisableFeature(feature: Feature, disable: Boolean): Unit {
    TransferContext.writeArguments(LONG to feature.id, BOOL to disable)
    TransferContext.callMethod(rawPtr, MethodBindings.setDisableFeaturePtr, NIL)
  }

  /**
   * Returns `true` if the [feature] is disabled. When a feature is disabled, it will disappear from the editor entirely.
   */
  public fun isFeatureDisabled(feature: Feature): Boolean {
    TransferContext.writeArguments(LONG to feature.id)
    TransferContext.callMethod(rawPtr, MethodBindings.isFeatureDisabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the specified [feature]'s human-readable name.
   */
  public fun getFeatureName(feature: Feature): String {
    TransferContext.writeArguments(LONG to feature.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getFeatureNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Saves the editor feature profile to a file in JSON format. It can then be imported using the feature profile manager's **Import** button or the [loadFromFile] method.
   *
   * **Note:** Feature profiles created via the user interface are saved in the `feature_profiles` directory, as a file with the `.profile` extension. The editor configuration folder can be found by using [godot.EditorPaths.getConfigDir].
   */
  public fun saveToFile(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.saveToFilePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Loads an editor feature profile from a file. The file must follow the JSON format obtained by using the feature profile manager's **Export** button or the [saveToFile] method.
   *
   * **Note:** Feature profiles created via the user interface are loaded from the `feature_profiles` directory, as a file with the `.profile` extension. The editor configuration folder can be found by using [godot.EditorPaths.getConfigDir].
   */
  public fun loadFromFile(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.loadFromFilePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class Feature(
    id: Long,
  ) {
    /**
     * The 3D editor. If this feature is disabled, the 3D editor won't display but 3D nodes will still display in the Create New Node dialog.
     */
    FEATURE_3D(0),
    /**
     * The Script tab, which contains the script editor and class reference browser. If this feature is disabled, the Script tab won't display.
     */
    FEATURE_SCRIPT(1),
    /**
     * The AssetLib tab. If this feature is disabled, the AssetLib tab won't display.
     */
    FEATURE_ASSET_LIB(2),
    /**
     * Scene tree editing. If this feature is disabled, the Scene tree dock will still be visible but will be read-only.
     */
    FEATURE_SCENE_TREE(3),
    /**
     * The Node dock. If this feature is disabled, signals and groups won't be visible and modifiable from the editor.
     */
    FEATURE_NODE_DOCK(4),
    /**
     * The FileSystem dock. If this feature is disabled, the FileSystem dock won't be visible.
     */
    FEATURE_FILESYSTEM_DOCK(5),
    /**
     * The Import dock. If this feature is disabled, the Import dock won't be visible.
     */
    FEATURE_IMPORT_DOCK(6),
    /**
     * The History dock. If this feature is disabled, the History dock won't be visible.
     */
    FEATURE_HISTORY_DOCK(7),
    /**
     * Represents the size of the [enum Feature] enum.
     */
    FEATURE_MAX(8),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setDisableClassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFeatureProfile", "set_disable_class")

    public val isClassDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFeatureProfile", "is_class_disabled")

    public val setDisableClassEditorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFeatureProfile", "set_disable_class_editor")

    public val isClassEditorDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFeatureProfile", "is_class_editor_disabled")

    public val setDisableClassPropertyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFeatureProfile", "set_disable_class_property")

    public val isClassPropertyDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFeatureProfile", "is_class_property_disabled")

    public val setDisableFeaturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFeatureProfile", "set_disable_feature")

    public val isFeatureDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFeatureProfile", "is_feature_disabled")

    public val getFeatureNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFeatureProfile", "get_feature_name")

    public val saveToFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFeatureProfile", "save_to_file")

    public val loadFromFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorFeatureProfile", "load_from_file")
  }
}
