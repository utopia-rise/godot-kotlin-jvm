// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.GodotError
import godot.core.PoolByteArray
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.POOL_BYTE_ARRAY
import godot.core.VariantType.POOL_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class ConfigFile : Reference() {
  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_CONFIGFILE)

  open fun eraseSection(section: String) {
    TransferContext.writeArguments(STRING to section)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIGFILE_ERASE_SECTION, NIL)
  }

  open fun eraseSectionKey(section: String, key: String) {
    TransferContext.writeArguments(STRING to section, STRING to key)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIGFILE_ERASE_SECTION_KEY, NIL)
  }

  open fun getSectionKeys(section: String): PoolStringArray {
    TransferContext.writeArguments(STRING to section)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIGFILE_GET_SECTION_KEYS,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  open fun getSections(): PoolStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIGFILE_GET_SECTIONS,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  open fun getValue(
    section: String,
    key: String,
    default: Any? = null
  ): Any? {
    TransferContext.writeArguments(STRING to section, STRING to key, ANY to default)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIGFILE_GET_VALUE, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  open fun hasSection(section: String): Boolean {
    TransferContext.writeArguments(STRING to section)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIGFILE_HAS_SECTION, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun hasSectionKey(section: String, key: String): Boolean {
    TransferContext.writeArguments(STRING to section, STRING to key)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIGFILE_HAS_SECTION_KEY, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun load(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIGFILE_LOAD, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun loadEncrypted(path: String, key: PoolByteArray): GodotError {
    TransferContext.writeArguments(STRING to path, POOL_BYTE_ARRAY to key)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIGFILE_LOAD_ENCRYPTED, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun loadEncryptedPass(path: String, password: String): GodotError {
    TransferContext.writeArguments(STRING to path, STRING to password)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIGFILE_LOAD_ENCRYPTED_PASS,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun parse(data: String): GodotError {
    TransferContext.writeArguments(STRING to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIGFILE_PARSE, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun save(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIGFILE_SAVE, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun saveEncrypted(path: String, key: PoolByteArray): GodotError {
    TransferContext.writeArguments(STRING to path, POOL_BYTE_ARRAY to key)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIGFILE_SAVE_ENCRYPTED, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun saveEncryptedPass(path: String, password: String): GodotError {
    TransferContext.writeArguments(STRING to path, STRING to password)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIGFILE_SAVE_ENCRYPTED_PASS,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun setValue(
    section: String,
    key: String,
    value: Any?
  ) {
    TransferContext.writeArguments(STRING to section, STRING to key, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONFIGFILE_SET_VALUE, NIL)
  }
}
