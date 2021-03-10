// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_STRING_ARRAY
import godot.core.VariantType.STRING
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class GDNativeLibrary : Resource() {
  open var configFile: ConfigFile?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GDNATIVELIBRARY_GET_CONFIG_FILE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as ConfigFile?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GDNATIVELIBRARY_SET_CONFIG_FILE,
          NIL)
    }

  open var loadOnce: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GDNATIVELIBRARY_GET_LOAD_ONCE,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GDNATIVELIBRARY_SET_LOAD_ONCE,
          NIL)
    }

  open var reloadable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GDNATIVELIBRARY_GET_RELOADABLE,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GDNATIVELIBRARY_SET_RELOADABLE,
          NIL)
    }

  open var singleton: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GDNATIVELIBRARY_GET_SINGLETON,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GDNATIVELIBRARY_SET_SINGLETON,
          NIL)
    }

  open var symbolPrefix: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GDNATIVELIBRARY_GET_SYMBOL_PREFIX,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GDNATIVELIBRARY_SET_SYMBOL_PREFIX,
          NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_GDNATIVELIBRARY)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }

  open fun getCurrentDependencies(): PoolStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GDNATIVELIBRARY_GET_CURRENT_DEPENDENCIES, POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  open fun getCurrentLibraryPath(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GDNATIVELIBRARY_GET_CURRENT_LIBRARY_PATH, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }
}
