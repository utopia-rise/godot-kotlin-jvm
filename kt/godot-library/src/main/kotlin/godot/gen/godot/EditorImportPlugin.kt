// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.Dictionary
import godot.core.TransferContext
import godot.core.VariantArray
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class EditorImportPlugin : ResourceImporter() {
  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_EDITORIMPORTPLUGIN)

  open fun _getImportOptions(preset: Long): VariantArray<Any?> {
    throw NotImplementedError("get_import_options is not implemented for EditorImportPlugin")
  }

  open fun _getImportOrder(): Long {
    throw NotImplementedError("get_import_order is not implemented for EditorImportPlugin")
  }

  open fun _getImporterName(): String {
    throw NotImplementedError("get_importer_name is not implemented for EditorImportPlugin")
  }

  open fun _getOptionVisibility(option: String, options: Dictionary<Any?, Any?>): Boolean {
    throw NotImplementedError("get_option_visibility is not implemented for EditorImportPlugin")
  }

  open fun _getPresetCount(): Long {
    throw NotImplementedError("get_preset_count is not implemented for EditorImportPlugin")
  }

  open fun _getPresetName(preset: Long): String {
    throw NotImplementedError("get_preset_name is not implemented for EditorImportPlugin")
  }

  open fun _getPriority(): Double {
    throw NotImplementedError("get_priority is not implemented for EditorImportPlugin")
  }

  open fun _getRecognizedExtensions(): VariantArray<Any?> {
    throw NotImplementedError("get_recognized_extensions is not implemented for EditorImportPlugin")
  }

  open fun _getResourceType(): String {
    throw NotImplementedError("get_resource_type is not implemented for EditorImportPlugin")
  }

  open fun _getSaveExtension(): String {
    throw NotImplementedError("get_save_extension is not implemented for EditorImportPlugin")
  }

  open fun _getVisibleName(): String {
    throw NotImplementedError("get_visible_name is not implemented for EditorImportPlugin")
  }

  open fun _import(
    sourceFile: String,
    savePath: String,
    options: Dictionary<Any?, Any?>,
    platformVariants: VariantArray<Any?>,
    genFiles: VariantArray<Any?>
  ): Long {
    throw NotImplementedError("import is not implemented for EditorImportPlugin")
  }
}
