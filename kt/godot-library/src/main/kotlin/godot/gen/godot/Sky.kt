// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.util.VoidPtr
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
open class Sky : Resource() {
  open var radianceSize: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKY_GET_RADIANCE_SIZE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKY_SET_RADIANCE_SIZE, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_SKY)

  enum class RadianceSize(
    id: Long
  ) {
    RADIANCE_SIZE_32(0),

    RADIANCE_SIZE_64(1),

    RADIANCE_SIZE_128(2),

    RADIANCE_SIZE_256(3),

    RADIANCE_SIZE_512(4),

    RADIANCE_SIZE_1024(5),

    RADIANCE_SIZE_2048(6),

    RADIANCE_SIZE_MAX(7);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val RADIANCE_SIZE_1024: Long = 5

    final const val RADIANCE_SIZE_128: Long = 2

    final const val RADIANCE_SIZE_2048: Long = 6

    final const val RADIANCE_SIZE_256: Long = 3

    final const val RADIANCE_SIZE_32: Long = 0

    final const val RADIANCE_SIZE_512: Long = 4

    final const val RADIANCE_SIZE_64: Long = 1

    final const val RADIANCE_SIZE_MAX: Long = 7
  }
}
