// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.Shader
import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class Shader : Resource() {
  open var code: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHADER_GET_CODE, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHADER_SET_CODE, NIL)
    }

  open var customDefines: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHADER_GET_CUSTOM_DEFINES, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHADER_SET_CUSTOM_DEFINES, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_SHADER)

  open fun getDefaultTextureParam(param: String): Texture? {
    TransferContext.writeArguments(STRING to param)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHADER_GET_DEFAULT_TEXTURE_PARAM,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture?
  }

  open fun getMode(): Shader.Mode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHADER_GET_MODE, LONG)
    return Shader.Mode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun hasParam(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHADER_HAS_PARAM, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun setDefaultTextureParam(param: String, texture: Texture) {
    TransferContext.writeArguments(STRING to param, OBJECT to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHADER_SET_DEFAULT_TEXTURE_PARAM,
        NIL)
  }

  enum class Mode(
    id: Long
  ) {
    MODE_SPATIAL(0),

    MODE_CANVAS_ITEM(1),

    MODE_PARTICLES(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val MODE_CANVAS_ITEM: Long = 1

    final const val MODE_PARTICLES: Long = 2

    final const val MODE_SPATIAL: Long = 0
  }
}
