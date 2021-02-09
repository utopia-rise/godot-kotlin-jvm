// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.Dictionary
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.NIL
import godot.core.VariantType.POOL_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class EditorSettings : Resource() {
  val settingsChanged: Signal0 by signal()

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_EDITORSETTINGS)

  open fun addPropertyInfo(info: Dictionary<Any?, Any?>) {
    TransferContext.writeArguments(DICTIONARY to info)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSETTINGS_ADD_PROPERTY_INFO,
        NIL)
  }

  open fun erase(property: String) {
    TransferContext.writeArguments(STRING to property)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSETTINGS_ERASE, NIL)
  }

  open fun getFavorites(): PoolStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSETTINGS_GET_FAVORITES,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  open fun getProjectMetadata(
    section: String,
    key: String,
    default: Any? = null
  ): Any? {
    TransferContext.writeArguments(STRING to section, STRING to key, ANY to default)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSETTINGS_GET_PROJECT_METADATA,
        ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  open fun getProjectSettingsDir(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORSETTINGS_GET_PROJECT_SETTINGS_DIR, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getRecentDirs(): PoolStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSETTINGS_GET_RECENT_DIRS,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  open fun getSetting(name: String): Any? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSETTINGS_GET_SETTING, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  open fun getSettingsDir(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSETTINGS_GET_SETTINGS_DIR,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun hasSetting(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSETTINGS_HAS_SETTING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun propertyCanRevert(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSETTINGS_PROPERTY_CAN_REVERT,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun propertyGetRevert(name: String): Any? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSETTINGS_PROPERTY_GET_REVERT,
        ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  open fun setFavorites(dirs: PoolStringArray) {
    TransferContext.writeArguments(POOL_STRING_ARRAY to dirs)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSETTINGS_SET_FAVORITES, NIL)
  }

  open fun setInitialValue(
    name: String,
    value: Any,
    updateCurrent: Boolean
  ) {
    TransferContext.writeArguments(STRING to name, ANY to value, BOOL to updateCurrent)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSETTINGS_SET_INITIAL_VALUE,
        NIL)
  }

  open fun setProjectMetadata(
    section: String,
    key: String,
    data: Any
  ) {
    TransferContext.writeArguments(STRING to section, STRING to key, ANY to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSETTINGS_SET_PROJECT_METADATA,
        NIL)
  }

  open fun setRecentDirs(dirs: PoolStringArray) {
    TransferContext.writeArguments(POOL_STRING_ARRAY to dirs)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSETTINGS_SET_RECENT_DIRS, NIL)
  }

  open fun setSetting(name: String, value: Any) {
    TransferContext.writeArguments(STRING to name, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSETTINGS_SET_SETTING, NIL)
  }

  companion object {
    final const val NOTIFICATION_EDITOR_SETTINGS_CHANGED: Long = 10000
  }
}
