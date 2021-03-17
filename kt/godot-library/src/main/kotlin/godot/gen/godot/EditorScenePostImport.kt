// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.STRING
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class EditorScenePostImport : Reference() {
  override fun __new() {
    callConstructor(ENGINECLASS_EDITORSCENEPOSTIMPORT)
  }

  open fun getSourceFile(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORSCENEPOSTIMPORT_GET_SOURCE_FILE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getSourceFolder(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORSCENEPOSTIMPORT_GET_SOURCE_FOLDER, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun _postImport(scene: Object): Object? {
    throw NotImplementedError("post_import is not implemented for EditorScenePostImport")
  }
}
