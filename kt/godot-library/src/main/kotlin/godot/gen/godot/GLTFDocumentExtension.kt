// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.StringName
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING_NAME
import kotlin.Any
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class GLTFDocumentExtension : Resource() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_GLTFDOCUMENTEXTENSION)
  }

  public open fun getImportSettingKeys(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GLTFDOCUMENTEXTENSION_GET_IMPORT_SETTING_KEYS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  public open fun importPreflight(document: GLTFDocument): GodotError {
    TransferContext.writeArguments(OBJECT to document)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GLTFDOCUMENTEXTENSION_IMPORT_PREFLIGHT, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public open fun getImportSetting(key: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to key)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GLTFDOCUMENTEXTENSION_GET_IMPORT_SETTING, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  public open fun setImportSetting(key: StringName, `value`: Any): Unit {
    TransferContext.writeArguments(STRING_NAME to key, ANY to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GLTFDOCUMENTEXTENSION_SET_IMPORT_SETTING, NIL)
  }

  public open fun importPost(document: GLTFDocument, node: Node): GodotError {
    TransferContext.writeArguments(OBJECT to document, OBJECT to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFDOCUMENTEXTENSION_IMPORT_POST,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public open fun getExportSettingKeys(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GLTFDOCUMENTEXTENSION_GET_EXPORT_SETTING_KEYS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  public open fun getExportSetting(key: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to key)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GLTFDOCUMENTEXTENSION_GET_EXPORT_SETTING, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  public open fun setExportSetting(key: StringName, `value`: Any): Unit {
    TransferContext.writeArguments(STRING_NAME to key, ANY to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GLTFDOCUMENTEXTENSION_SET_EXPORT_SETTING, NIL)
  }

  public open fun exportPreflight(document: GLTFDocument, node: Node): GodotError {
    TransferContext.writeArguments(OBJECT to document, OBJECT to node)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GLTFDOCUMENTEXTENSION_EXPORT_PREFLIGHT, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public open fun exportPost(document: GLTFDocument): GodotError {
    TransferContext.writeArguments(OBJECT to document)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFDOCUMENTEXTENSION_EXPORT_POST,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public companion object
}
