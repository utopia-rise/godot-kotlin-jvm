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
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress

@GodotBaseType
object ResourceLoader : Object() {
  override fun __new(): VoidPtr = TransferContext.getSingleton(ENGINECLASS__RESOURCELOADER)

  override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  fun exists(path: String, typeHint: String = ""): Boolean {
    TransferContext.writeArguments(STRING to path, STRING to typeHint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__RESOURCELOADER_EXISTS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun getDependencies(path: String): PoolStringArray {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__RESOURCELOADER_GET_DEPENDENCIES,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  fun getRecognizedExtensionsForType(type: String): PoolStringArray {
    TransferContext.writeArguments(STRING to type)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS__RESOURCELOADER_GET_RECOGNIZED_EXTENSIONS_FOR_TYPE,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  fun has(path: String): Boolean {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__RESOURCELOADER_HAS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun hasCached(path: String): Boolean {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__RESOURCELOADER_HAS_CACHED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun load(
    path: String,
    typeHint: String = "",
    noCache: Boolean = false
  ): Resource? {
    TransferContext.writeArguments(STRING to path, STRING to typeHint, BOOL to noCache)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__RESOURCELOADER_LOAD, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Resource?
  }

  fun loadInteractive(path: String, typeHint: String = ""): ResourceInteractiveLoader? {
    TransferContext.writeArguments(STRING to path, STRING to typeHint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__RESOURCELOADER_LOAD_INTERACTIVE,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as ResourceInteractiveLoader?
  }

  fun setAbortOnMissingResources(abort: Boolean) {
    TransferContext.writeArguments(BOOL to abort)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS__RESOURCELOADER_SET_ABORT_ON_MISSING_RESOURCES, NIL)
  }
}
