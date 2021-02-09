// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.PoolVector2Array
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.POOL_VECTOR2_ARRAY
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
open class OccluderPolygon2D : Resource() {
  open var closed: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OCCLUDERPOLYGON2D_GET_CLOSED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OCCLUDERPOLYGON2D_SET_CLOSED, NIL)
    }

  open var cullMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OCCLUDERPOLYGON2D_GET_CULL_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OCCLUDERPOLYGON2D_SET_CULL_MODE,
          NIL)
    }

  open var polygon: PoolVector2Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OCCLUDERPOLYGON2D_GET_POLYGON,
          POOL_VECTOR2_ARRAY)
      return TransferContext.readReturnValue(POOL_VECTOR2_ARRAY, false) as PoolVector2Array
    }
    set(value) {
      TransferContext.writeArguments(POOL_VECTOR2_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OCCLUDERPOLYGON2D_SET_POLYGON,
          NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_OCCLUDERPOLYGON2D)

  enum class CullMode(
    id: Long
  ) {
    CULL_DISABLED(0),

    CULL_CLOCKWISE(1),

    CULL_COUNTER_CLOCKWISE(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val CULL_CLOCKWISE: Long = 1

    final const val CULL_COUNTER_CLOCKWISE: Long = 2

    final const val CULL_DISABLED: Long = 0
  }
}
