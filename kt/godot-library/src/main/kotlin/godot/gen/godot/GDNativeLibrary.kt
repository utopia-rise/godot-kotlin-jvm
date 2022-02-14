// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedStringArray
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class GDNativeLibrary : Resource() {
  public open var configFile: ConfigFile?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GDNATIVELIBRARY_GET_CONFIG_FILE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as ConfigFile?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GDNATIVELIBRARY_SET_CONFIG_FILE,
          NIL)
      return TransferContext.readReturnValue(NIL, true) as Unit?
    }

  public open var loadOnce: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GDNATIVELIBRARY_GET_LOAD_ONCE,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GDNATIVELIBRARY_SET_LOAD_ONCE,
          NIL)
    }

  public open var singleton: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GDNATIVELIBRARY_GET_SINGLETON,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GDNATIVELIBRARY_SET_SINGLETON,
          NIL)
    }

  public open var symbolPrefix: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GDNATIVELIBRARY_GET_SYMBOL_PREFIX,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GDNATIVELIBRARY_SET_SYMBOL_PREFIX,
          NIL)
    }

  public open var reloadable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GDNATIVELIBRARY_GET_RELOADABLE,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GDNATIVELIBRARY_SET_RELOADABLE,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_GDNATIVELIBRARY)
  }

  public open fun getCurrentLibraryPath(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GDNATIVELIBRARY_GET_CURRENT_LIBRARY_PATH, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  public open fun getCurrentDependencies(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GDNATIVELIBRARY_GET_CURRENT_DEPENDENCIES, PACKED_STRING_ARRAY)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  public companion object
}
