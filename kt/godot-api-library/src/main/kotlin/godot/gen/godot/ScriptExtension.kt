// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.StringName
import godot.core.VariantArray
import godot.util.Internals
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_SCRIPTEXTENSION_INDEX: Int = 564

@GodotBaseType
public open class ScriptExtension : Script() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_SCRIPTEXTENSION_INDEX, scriptIndex)
  }

  public open fun _editorCanReloadFromFile(): Boolean {
    throw NotImplementedError("_editor_can_reload_from_file is not implemented for ScriptExtension")
  }

  public open fun _canInstantiate(): Boolean {
    throw NotImplementedError("_can_instantiate is not implemented for ScriptExtension")
  }

  public open fun _getBaseScript(): Script? {
    throw NotImplementedError("_get_base_script is not implemented for ScriptExtension")
  }

  public open fun _getGlobalName(): StringName {
    throw NotImplementedError("_get_global_name is not implemented for ScriptExtension")
  }

  public open fun _inheritsScript(script: Script?): Boolean {
    throw NotImplementedError("_inherits_script is not implemented for ScriptExtension")
  }

  public open fun _getInstanceBaseType(): StringName {
    throw NotImplementedError("_get_instance_base_type is not implemented for ScriptExtension")
  }

  public open fun _instanceHas(`object`: Object?): Boolean {
    throw NotImplementedError("_instance_has is not implemented for ScriptExtension")
  }

  public open fun _hasSourceCode(): Boolean {
    throw NotImplementedError("_has_source_code is not implemented for ScriptExtension")
  }

  public open fun _getSourceCode(): String {
    throw NotImplementedError("_get_source_code is not implemented for ScriptExtension")
  }

  public open fun _setSourceCode(code: String): Unit {
  }

  public open fun _reload(keepState: Boolean): Error {
    throw NotImplementedError("_reload is not implemented for ScriptExtension")
  }

  public open fun _getDocumentation(): VariantArray<Dictionary<Any?, Any?>> {
    throw NotImplementedError("_get_documentation is not implemented for ScriptExtension")
  }

  public open fun _getClassIconPath(): String {
    throw NotImplementedError("_get_class_icon_path is not implemented for ScriptExtension")
  }

  public open fun _hasMethod(method: StringName): Boolean {
    throw NotImplementedError("_has_method is not implemented for ScriptExtension")
  }

  public open fun _hasStaticMethod(method: StringName): Boolean {
    throw NotImplementedError("_has_static_method is not implemented for ScriptExtension")
  }

  /**
   * Return the expected argument count for the given [method], or `null` if it can't be determined
   * (which will then fall back to the default behavior).
   */
  public open fun _getScriptMethodArgumentCount(method: StringName): Any? {
    throw NotImplementedError("_get_script_method_argument_count is not implemented for ScriptExtension")
  }

  public open fun _getMethodInfo(method: StringName): Dictionary<Any?, Any?> {
    throw NotImplementedError("_get_method_info is not implemented for ScriptExtension")
  }

  public open fun _isTool(): Boolean {
    throw NotImplementedError("_is_tool is not implemented for ScriptExtension")
  }

  public open fun _isValid(): Boolean {
    throw NotImplementedError("_is_valid is not implemented for ScriptExtension")
  }

  /**
   * Returns `true` if the script is an abstract script. An abstract script does not have a
   * constructor and cannot be instantiated.
   */
  public open fun _isAbstract(): Boolean {
    throw NotImplementedError("_is_abstract is not implemented for ScriptExtension")
  }

  public open fun _getLanguage(): ScriptLanguage? {
    throw NotImplementedError("_get_language is not implemented for ScriptExtension")
  }

  public open fun _hasScriptSignal(signal: StringName): Boolean {
    throw NotImplementedError("_has_script_signal is not implemented for ScriptExtension")
  }

  public open fun _getScriptSignalList(): VariantArray<Dictionary<Any?, Any?>> {
    throw NotImplementedError("_get_script_signal_list is not implemented for ScriptExtension")
  }

  public open fun _hasPropertyDefaultValue(`property`: StringName): Boolean {
    throw NotImplementedError("_has_property_default_value is not implemented for ScriptExtension")
  }

  public open fun _getPropertyDefaultValue(`property`: StringName): Any? {
    throw NotImplementedError("_get_property_default_value is not implemented for ScriptExtension")
  }

  public open fun _updateExports(): Unit {
  }

  public open fun _getScriptMethodList(): VariantArray<Dictionary<Any?, Any?>> {
    throw NotImplementedError("_get_script_method_list is not implemented for ScriptExtension")
  }

  public open fun _getScriptPropertyList(): VariantArray<Dictionary<Any?, Any?>> {
    throw NotImplementedError("_get_script_property_list is not implemented for ScriptExtension")
  }

  public open fun _getMemberLine(member: StringName): Int {
    throw NotImplementedError("_get_member_line is not implemented for ScriptExtension")
  }

  public open fun _getConstants(): Dictionary<Any?, Any?> {
    throw NotImplementedError("_get_constants is not implemented for ScriptExtension")
  }

  public open fun _getMembers(): VariantArray<StringName> {
    throw NotImplementedError("_get_members is not implemented for ScriptExtension")
  }

  public open fun _isPlaceholderFallbackEnabled(): Boolean {
    throw NotImplementedError("_is_placeholder_fallback_enabled is not implemented for ScriptExtension")
  }

  public open fun _getRpcConfig(): Any? {
    throw NotImplementedError("_get_rpc_config is not implemented for ScriptExtension")
  }

  public companion object

  public object MethodBindings
}
