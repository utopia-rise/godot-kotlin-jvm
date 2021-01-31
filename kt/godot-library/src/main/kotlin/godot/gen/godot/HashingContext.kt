// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.GodotError
import godot.core.PoolByteArray
import godot.core.TransferContext
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.POOL_BYTE_ARRAY
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
open class HashingContext : Reference() {
  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_HASHINGCONTEXT)

  open fun finish(): PoolByteArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HASHINGCONTEXT_FINISH,
        POOL_BYTE_ARRAY)
    return TransferContext.readReturnValue(POOL_BYTE_ARRAY, false) as PoolByteArray
  }

  open fun start(type: Long): GodotError {
    TransferContext.writeArguments(LONG to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HASHINGCONTEXT_START, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun update(chunk: PoolByteArray): GodotError {
    TransferContext.writeArguments(POOL_BYTE_ARRAY to chunk)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HASHINGCONTEXT_UPDATE, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  enum class HashType(
    id: Long
  ) {
    HASH_MD5(0),

    HASH_SHA1(1),

    HASH_SHA256(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val HASH_MD5: Long = 0

    final const val HASH_SHA1: Long = 1

    final const val HASH_SHA256: Long = 2
  }
}
