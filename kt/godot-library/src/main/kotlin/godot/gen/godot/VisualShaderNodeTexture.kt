// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.util.VoidPtr
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
open class VisualShaderNodeTexture : VisualShaderNode() {
  open var source: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETEXTURE_GET_SOURCE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETEXTURE_SET_SOURCE, NIL)
    }

  open var texture: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETEXTURE_GET_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETEXTURE_SET_TEXTURE, NIL)
    }

  open var textureType: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETEXTURE_GET_TEXTURE_TYPE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETEXTURE_SET_TEXTURE_TYPE, NIL)
    }

  override fun __new(): VoidPtr =
      TransferContext.invokeConstructor(ENGINECLASS_VISUALSHADERNODETEXTURE)

  enum class TextureType(
    id: Long
  ) {
    TYPE_DATA(0),

    TYPE_COLOR(1),

    TYPE_NORMALMAP(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Source(
    id: Long
  ) {
    SOURCE_TEXTURE(0),

    SOURCE_SCREEN(1),

    SOURCE_2D_TEXTURE(2),

    SOURCE_2D_NORMAL(3),

    SOURCE_DEPTH(4),

    SOURCE_PORT(5);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val SOURCE_2D_NORMAL: Long = 3

    final const val SOURCE_2D_TEXTURE: Long = 2

    final const val SOURCE_DEPTH: Long = 4

    final const val SOURCE_PORT: Long = 5

    final const val SOURCE_SCREEN: Long = 1

    final const val SOURCE_TEXTURE: Long = 0

    final const val TYPE_COLOR: Long = 1

    final const val TYPE_DATA: Long = 0

    final const val TYPE_NORMALMAP: Long = 2
  }
}
