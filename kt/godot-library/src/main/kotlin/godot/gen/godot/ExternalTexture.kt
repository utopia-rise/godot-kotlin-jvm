// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Enable OpenGL ES external texture extension.
 * 
 * Enable support for the OpenGL ES external texture extension as defined by [godot.OES_EGL_image_external](https://www.khronos.org/registry/OpenGL/extensions/OES/OES_EGL_image_external.txt).
 *
 * **Note:** This is only supported for Android platforms.
 */
@GodotBaseType
open class ExternalTexture : Texture() {
  /**
   * External texture size.
   */
  open var size: Vector2
    get() = super.getTextureSize()
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EXTERNALTEXTURE_SET_SIZE, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_EXTERNALTEXTURE)
  }

  open fun size(schedule: Vector2.() -> Unit): Vector2 = size.apply{
      schedule(this)
      size = this
  }


  /**
   * Returns the external texture name.
   */
  open fun getExternalTextureId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EXTERNALTEXTURE_GET_EXTERNAL_TEXTURE_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }
}
