// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.util.VoidPtr
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
open class ExternalTexture : Texture() {
  open var size: Vector2
    get() = super.getTextureSize()
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EXTERNALTEXTURE_SET_SIZE, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_EXTERNALTEXTURE)

  open fun size(schedule: Vector2.() -> Unit): Vector2 = size.apply{
      schedule(this)
      size = this
  }


  open fun getExternalTextureId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EXTERNALTEXTURE_GET_EXTERNAL_TEXTURE_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }
}
