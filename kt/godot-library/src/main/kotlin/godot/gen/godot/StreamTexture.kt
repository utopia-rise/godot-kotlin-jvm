// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.GodotError
import godot.core.TransferContext
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.STRING
import godot.util.VoidPtr
import kotlin.Int
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class StreamTexture : Texture() {
  open val loadPath: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMTEXTURE_GET_LOAD_PATH,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_STREAMTEXTURE)

  open fun load(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMTEXTURE_LOAD, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }
}
