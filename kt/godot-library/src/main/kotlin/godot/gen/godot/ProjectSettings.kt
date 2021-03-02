// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
object ProjectSettings : Object() {
  override fun __new(): VoidPtr = TransferContext.getSingleton(ENGINESINGLETON_PROJECTSETTINGS)

  override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  fun addPropertyInfo(hint: Dictionary<Any?, Any?>) {
    TransferContext.writeArguments(DICTIONARY to hint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROJECTSETTINGS_ADD_PROPERTY_INFO,
        NIL)
  }

  fun clear(name: String) {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROJECTSETTINGS_CLEAR, NIL)
  }

  fun getOrder(name: String): Long {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROJECTSETTINGS_GET_ORDER, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  fun getSetting(name: String): Any? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROJECTSETTINGS_GET_SETTING, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  fun globalizePath(path: String): String {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROJECTSETTINGS_GLOBALIZE_PATH,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  fun hasSetting(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROJECTSETTINGS_HAS_SETTING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun loadResourcePack(pack: String, replaceFiles: Boolean = true): Boolean {
    TransferContext.writeArguments(STRING to pack, BOOL to replaceFiles)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROJECTSETTINGS_LOAD_RESOURCE_PACK,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun localizePath(path: String): String {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROJECTSETTINGS_LOCALIZE_PATH,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  fun propertyCanRevert(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROJECTSETTINGS_PROPERTY_CAN_REVERT,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  fun propertyGetRevert(name: String): Any? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROJECTSETTINGS_PROPERTY_GET_REVERT,
        ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  fun save(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROJECTSETTINGS_SAVE, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  fun saveCustom(file: String): GodotError {
    TransferContext.writeArguments(STRING to file)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROJECTSETTINGS_SAVE_CUSTOM, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  fun setInitialValue(name: String, value: Any?) {
    TransferContext.writeArguments(STRING to name, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROJECTSETTINGS_SET_INITIAL_VALUE,
        NIL)
  }

  fun setOrder(name: String, position: Long) {
    TransferContext.writeArguments(STRING to name, LONG to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROJECTSETTINGS_SET_ORDER, NIL)
  }

  fun setSetting(name: String, value: Any?) {
    TransferContext.writeArguments(STRING to name, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROJECTSETTINGS_SET_SETTING, NIL)
  }
}
