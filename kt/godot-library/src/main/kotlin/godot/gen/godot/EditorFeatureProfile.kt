// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
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
public open class EditorFeatureProfile : Reference() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_EDITORFEATUREPROFILE)
  }

  /**
   * Returns the specified `feature`'s human-readable name.
   */
  public open fun getFeatureName(feature: Long): String {
    TransferContext.writeArguments(LONG to feature)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFEATUREPROFILE_GET_FEATURE_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns `true` if the class specified by `class_name` is disabled. When disabled, the class won't appear in the Create New Node dialog.
   */
  public open fun isClassDisabled(className: String): Boolean {
    TransferContext.writeArguments(STRING to className)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFEATUREPROFILE_IS_CLASS_DISABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if editing for the class specified by `class_name` is disabled. When disabled, the class will still appear in the Create New Node dialog but the inspector will be read-only when selecting a node that extends the class.
   */
  public open fun isClassEditorDisabled(className: String): Boolean {
    TransferContext.writeArguments(STRING to className)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFEATUREPROFILE_IS_CLASS_EDITOR_DISABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if `property` is disabled in the class specified by `class_name`. When a property is disabled, it won't appear in the inspector when selecting a node that extends the class specified by `class_name`.
   */
  public open fun isClassPropertyDisabled(className: String, `property`: String): Boolean {
    TransferContext.writeArguments(STRING to className, STRING to property)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFEATUREPROFILE_IS_CLASS_PROPERTY_DISABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the `feature` is disabled. When a feature is disabled, it will disappear from the editor entirely.
   */
  public open fun isFeatureDisabled(feature: Long): Boolean {
    TransferContext.writeArguments(LONG to feature)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFEATUREPROFILE_IS_FEATURE_DISABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Loads an editor feature profile from a file. The file must follow the JSON format obtained by using the feature profile manager's **Export** button or the [saveToFile] method.
   */
  public open fun loadFromFile(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFEATUREPROFILE_LOAD_FROM_FILE,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Saves the editor feature profile to a file in JSON format. It can then be imported using the feature profile manager's **Import** button or the [loadFromFile] method.
   */
  public open fun saveToFile(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFEATUREPROFILE_SAVE_TO_FILE,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * If `disable` is `true`, disables the class specified by `class_name`. When disabled, the class won't appear in the Create New Node dialog.
   */
  public open fun setDisableClass(className: String, disable: Boolean): Unit {
    TransferContext.writeArguments(STRING to className, BOOL to disable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFEATUREPROFILE_SET_DISABLE_CLASS, NIL)
  }

  /**
   * If `disable` is `true`, disables editing for the class specified by `class_name`. When disabled, the class will still appear in the Create New Node dialog but the inspector will be read-only when selecting a node that extends the class.
   */
  public open fun setDisableClassEditor(className: String, disable: Boolean): Unit {
    TransferContext.writeArguments(STRING to className, BOOL to disable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFEATUREPROFILE_SET_DISABLE_CLASS_EDITOR, NIL)
  }

  /**
   * If `disable` is `true`, disables editing for `property` in the class specified by `class_name`. When a property is disabled, it won't appear in the inspector when selecting a node that extends the class specified by `class_name`.
   */
  public open fun setDisableClassProperty(
    className: String,
    `property`: String,
    disable: Boolean
  ): Unit {
    TransferContext.writeArguments(STRING to className, STRING to property, BOOL to disable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFEATUREPROFILE_SET_DISABLE_CLASS_PROPERTY, NIL)
  }

  /**
   * If `disable` is `true`, disables the editor feature specified in `feature`. When a feature is disabled, it will disappear from the editor entirely.
   */
  public open fun setDisableFeature(feature: Long, disable: Boolean): Unit {
    TransferContext.writeArguments(LONG to feature, BOOL to disable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFEATUREPROFILE_SET_DISABLE_FEATURE, NIL)
  }

  public enum class Feature(
    id: Long
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
     * Represents the size of the [enum Feature] enum.
     */
    FEATURE_MAX(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * The 3D editor. If this feature is disabled, the 3D editor won't display but 3D nodes will still display in the Create New Node dialog.
     */
    public final const val FEATURE_3D: Long = 0

    /**
     * The AssetLib tab. If this feature is disabled, the AssetLib tab won't display.
     */
    public final const val FEATURE_ASSET_LIB: Long = 2

    /**
     * The FileSystem dock. If this feature is disabled, the FileSystem dock won't be visible.
     */
    public final const val FEATURE_FILESYSTEM_DOCK: Long = 5

    /**
     * The Import dock. If this feature is disabled, the Import dock won't be visible.
     */
    public final const val FEATURE_IMPORT_DOCK: Long = 6

    /**
     * Represents the size of the [enum Feature] enum.
     */
    public final const val FEATURE_MAX: Long = 7

    /**
     * The Node dock. If this feature is disabled, signals and groups won't be visible and modifiable from the editor.
     */
    public final const val FEATURE_NODE_DOCK: Long = 4

    /**
     * Scene tree editing. If this feature is disabled, the Scene tree dock will still be visible but will be read-only.
     */
    public final const val FEATURE_SCENE_TREE: Long = 3

    /**
     * The Script tab, which contains the script editor and class reference browser. If this feature is disabled, the Script tab won't display.
     */
    public final const val FEATURE_SCRIPT: Long = 1
  }
}
