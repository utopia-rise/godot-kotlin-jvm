// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.Image
import godot.annotation.GodotBaseType
import godot.core.Dictionary
import godot.core.TransferContext
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress

@GodotBaseType
open class TextureLayered : Resource() {
  open var flags: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURELAYERED_GET_FLAGS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURELAYERED_SET_FLAGS, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_TEXTURELAYERED)

  open fun _getData(): Dictionary<Any?, Any?> {
    throw NotImplementedError("_get_data is not implemented for TextureLayered")
  }

  open fun _setData(data: Dictionary<Any?, Any?>) {
  }

  open fun create(
    width: Long,
    height: Long,
    depth: Long,
    format: Long,
    flags: Long = 4
  ) {
    TransferContext.writeArguments(LONG to width, LONG to height, LONG to depth, LONG to format,
        LONG to flags)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURELAYERED_CREATE, NIL)
  }

  open fun getDepth(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURELAYERED_GET_DEPTH, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getFormat(): Image.Format {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURELAYERED_GET_FORMAT, LONG)
    return Image.Format.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun getHeight(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURELAYERED_GET_HEIGHT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getLayerData(layer: Long): Image? {
    TransferContext.writeArguments(LONG to layer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURELAYERED_GET_LAYER_DATA,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Image?
  }

  open fun getWidth(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURELAYERED_GET_WIDTH, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun setDataPartial(
    image: Image,
    xOffset: Long,
    yOffset: Long,
    layer: Long,
    mipmap: Long = 0
  ) {
    TransferContext.writeArguments(OBJECT to image, LONG to xOffset, LONG to yOffset, LONG to layer,
        LONG to mipmap)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURELAYERED_SET_DATA_PARTIAL,
        NIL)
  }

  open fun setLayerData(image: Image, layer: Long) {
    TransferContext.writeArguments(OBJECT to image, LONG to layer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURELAYERED_SET_LAYER_DATA, NIL)
  }

  enum class Flags(
    id: Long
  ) {
    FLAG_MIPMAPS(1),

    FLAG_REPEAT(2),

    FLAG_FILTER(4),

    FLAGS_DEFAULT(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val FLAGS_DEFAULT: Long = 4

    final const val FLAG_FILTER: Long = 4

    final const val FLAG_MIPMAPS: Long = 1

    final const val FLAG_REPEAT: Long = 2
  }
}
