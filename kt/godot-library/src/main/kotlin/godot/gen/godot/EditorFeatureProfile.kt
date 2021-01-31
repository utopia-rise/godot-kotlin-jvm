// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.GodotError
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class EditorFeatureProfile : Reference() {
  override fun __new(): VoidPtr =
      TransferContext.invokeConstructor(ENGINECLASS_EDITORFEATUREPROFILE)

  open fun getFeatureName(feature: Long): String {
    TransferContext.writeArguments(LONG to feature)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFEATUREPROFILE_GET_FEATURE_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun isClassDisabled(className: String): Boolean {
    TransferContext.writeArguments(STRING to className)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFEATUREPROFILE_IS_CLASS_DISABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isClassEditorDisabled(className: String): Boolean {
    TransferContext.writeArguments(STRING to className)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFEATUREPROFILE_IS_CLASS_EDITOR_DISABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isClassPropertyDisabled(className: String, property: String): Boolean {
    TransferContext.writeArguments(STRING to className, STRING to property)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFEATUREPROFILE_IS_CLASS_PROPERTY_DISABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isFeatureDisabled(feature: Long): Boolean {
    TransferContext.writeArguments(LONG to feature)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFEATUREPROFILE_IS_FEATURE_DISABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun loadFromFile(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFEATUREPROFILE_LOAD_FROM_FILE,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun saveToFile(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFEATUREPROFILE_SAVE_TO_FILE,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun setDisableClass(className: String, disable: Boolean) {
    TransferContext.writeArguments(STRING to className, BOOL to disable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFEATUREPROFILE_SET_DISABLE_CLASS, NIL)
  }

  open fun setDisableClassEditor(className: String, disable: Boolean) {
    TransferContext.writeArguments(STRING to className, BOOL to disable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFEATUREPROFILE_SET_DISABLE_CLASS_EDITOR, NIL)
  }

  open fun setDisableClassProperty(
    className: String,
    property: String,
    disable: Boolean
  ) {
    TransferContext.writeArguments(STRING to className, STRING to property, BOOL to disable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFEATUREPROFILE_SET_DISABLE_CLASS_PROPERTY, NIL)
  }

  open fun setDisableFeature(feature: Long, disable: Boolean) {
    TransferContext.writeArguments(LONG to feature, BOOL to disable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORFEATUREPROFILE_SET_DISABLE_FEATURE, NIL)
  }

  enum class Feature(
    id: Long
  ) {
    FEATURE_3D(0),

    FEATURE_SCRIPT(1),

    FEATURE_ASSET_LIB(2),

    FEATURE_SCENE_TREE(3),

    FEATURE_IMPORT_DOCK(4),

    FEATURE_NODE_DOCK(5),

    FEATURE_FILESYSTEM_DOCK(6),

    FEATURE_MAX(7);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val FEATURE_3D: Long = 0

    final const val FEATURE_ASSET_LIB: Long = 2

    final const val FEATURE_FILESYSTEM_DOCK: Long = 6

    final const val FEATURE_IMPORT_DOCK: Long = 4

    final const val FEATURE_MAX: Long = 7

    final const val FEATURE_NODE_DOCK: Long = 5

    final const val FEATURE_SCENE_TREE: Long = 3

    final const val FEATURE_SCRIPT: Long = 1
  }
}
