// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.GodotError
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
object ResourceSaver : Object() {
  final const val FLAG_BUNDLE_RESOURCES: Long = 2

  final const val FLAG_CHANGE_PATH: Long = 4

  final const val FLAG_COMPRESS: Long = 32

  final const val FLAG_OMIT_EDITOR_PROPERTIES: Long = 8

  final const val FLAG_RELATIVE_PATHS: Long = 1

  final const val FLAG_REPLACE_SUBRESOURCE_PATHS: Long = 64

  final const val FLAG_SAVE_BIG_ENDIAN: Long = 16

  override fun __new(): VoidPtr = TransferContext.getSingleton(ENGINECLASS__RESOURCESAVER)

  override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  fun getRecognizedExtensions(type: Resource): PoolStringArray {
    TransferContext.writeArguments(OBJECT to type)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS__RESOURCESAVER_GET_RECOGNIZED_EXTENSIONS, POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  fun save(
    path: String,
    resource: Resource,
    flags: Long = 0
  ): GodotError {
    TransferContext.writeArguments(STRING to path, OBJECT to resource, LONG to flags)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__RESOURCESAVER_SAVE, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  enum class SaverFlags(
    id: Long
  ) {
    FLAG_RELATIVE_PATHS(1),

    FLAG_BUNDLE_RESOURCES(2),

    FLAG_CHANGE_PATH(4),

    FLAG_OMIT_EDITOR_PROPERTIES(8),

    FLAG_SAVE_BIG_ENDIAN(16),

    FLAG_COMPRESS(32),

    FLAG_REPLACE_SUBRESOURCE_PATHS(64);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }
}
