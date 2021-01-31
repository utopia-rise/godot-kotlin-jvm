// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
open class CubeMap : Resource() {
  open var flags: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CUBEMAP_GET_FLAGS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CUBEMAP_SET_FLAGS, NIL)
    }

  open var lossyStorageQuality: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CUBEMAP_GET_LOSSY_STORAGE_QUALITY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CUBEMAP_SET_LOSSY_STORAGE_QUALITY,
          NIL)
    }

  open var storageMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CUBEMAP_GET_STORAGE_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CUBEMAP_SET_STORAGE_MODE, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_CUBEMAP)

  open fun getHeight(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CUBEMAP_GET_HEIGHT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getSide(side: Long): Image? {
    TransferContext.writeArguments(LONG to side)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CUBEMAP_GET_SIDE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Image?
  }

  open fun getWidth(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CUBEMAP_GET_WIDTH, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun setSide(side: Long, image: Image) {
    TransferContext.writeArguments(LONG to side, OBJECT to image)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CUBEMAP_SET_SIDE, NIL)
  }

  enum class Flags(
    id: Long
  ) {
    FLAG_MIPMAPS(1),

    FLAG_REPEAT(2),

    FLAG_FILTER(4),

    FLAGS_DEFAULT(7);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Side(
    id: Long
  ) {
    SIDE_LEFT(0),

    SIDE_RIGHT(1),

    SIDE_BOTTOM(2),

    SIDE_TOP(3),

    SIDE_FRONT(4),

    SIDE_BACK(5);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Storage(
    id: Long
  ) {
    STORAGE_RAW(0),

    STORAGE_COMPRESS_LOSSY(1),

    STORAGE_COMPRESS_LOSSLESS(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val FLAGS_DEFAULT: Long = 7

    final const val FLAG_FILTER: Long = 4

    final const val FLAG_MIPMAPS: Long = 1

    final const val FLAG_REPEAT: Long = 2

    final const val SIDE_BACK: Long = 5

    final const val SIDE_BOTTOM: Long = 2

    final const val SIDE_FRONT: Long = 4

    final const val SIDE_LEFT: Long = 0

    final const val SIDE_RIGHT: Long = 1

    final const val SIDE_TOP: Long = 3

    final const val STORAGE_COMPRESS_LOSSLESS: Long = 2

    final const val STORAGE_COMPRESS_LOSSY: Long = 1

    final const val STORAGE_RAW: Long = 0
  }
}
