// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public open class ScriptExtension : Script() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SCRIPTEXTENSION, scriptIndex)
    return true
  }

  /**
   *
   */
  public open fun _editorCanReloadFromFile(): Boolean {
    throw NotImplementedError("_editor_can_reload_from_file is not implemented for ScriptExtension")
  }

  /**
   *
   */
  public open fun _canInstantiate(): Boolean {
    throw NotImplementedError("_can_instantiate is not implemented for ScriptExtension")
  }

  /**
   *
   */
  public open fun _getBaseScript(): Script? {
    throw NotImplementedError("_get_base_script is not implemented for ScriptExtension")
  }

  /**
   *
   */
  public open fun _getGlobalName(): StringName {
    throw NotImplementedError("_get_global_name is not implemented for ScriptExtension")
  }

  /**
   *
   */
  public open fun _inheritsScript(script: Script): Boolean {
    throw NotImplementedError("_inherits_script is not implemented for ScriptExtension")
  }

  /**
   *
   */
  public open fun _getInstanceBaseType(): StringName {
    throw NotImplementedError("_get_instance_base_type is not implemented for ScriptExtension")
  }

  /**
   *
   */
  public open fun _instanceHas(_object: Object): Boolean {
    throw NotImplementedError("_instance_has is not implemented for ScriptExtension")
  }

  /**
   *
   */
  public open fun _hasSourceCode(): Boolean {
    throw NotImplementedError("_has_source_code is not implemented for ScriptExtension")
  }

  /**
   *
   */
  public open fun _getSourceCode(): String {
    throw NotImplementedError("_get_source_code is not implemented for ScriptExtension")
  }

  /**
   *
   */
  public open fun _setSourceCode(code: String): Unit {
  }

  /**
   *
   */
  public open fun _reload(keepState: Boolean): GodotError {
    throw NotImplementedError("_reload is not implemented for ScriptExtension")
  }

  /**
   *
   */
  public open fun _getDocumentation(): VariantArray<Dictionary<Any?, Any?>> {
    throw NotImplementedError("_get_documentation is not implemented for ScriptExtension")
  }

  /**
   *
   */
  public open fun _hasMethod(method: StringName): Boolean {
    throw NotImplementedError("_has_method is not implemented for ScriptExtension")
  }

  /**
   *
   */
  public open fun _getMethodInfo(method: StringName): Dictionary<Any?, Any?> {
    throw NotImplementedError("_get_method_info is not implemented for ScriptExtension")
  }

  /**
   *
   */
  public open fun _isTool(): Boolean {
    throw NotImplementedError("_is_tool is not implemented for ScriptExtension")
  }

  /**
   *
   */
  public open fun _isValid(): Boolean {
    throw NotImplementedError("_is_valid is not implemented for ScriptExtension")
  }

  /**
   *
   */
  public open fun _getLanguage(): ScriptLanguage? {
    throw NotImplementedError("_get_language is not implemented for ScriptExtension")
  }

  /**
   *
   */
  public open fun _hasScriptSignal(signal: StringName): Boolean {
    throw NotImplementedError("_has_script_signal is not implemented for ScriptExtension")
  }

  /**
   *
   */
  public open fun _getScriptSignalList(): VariantArray<Dictionary<Any?, Any?>> {
    throw NotImplementedError("_get_script_signal_list is not implemented for ScriptExtension")
  }

  /**
   *
   */
  public open fun _hasPropertyDefaultValue(`property`: StringName): Boolean {
    throw NotImplementedError("_has_property_default_value is not implemented for ScriptExtension")
  }

  /**
   *
   */
  public open fun _getPropertyDefaultValue(`property`: StringName): Any? {
    throw NotImplementedError("_get_property_default_value is not implemented for ScriptExtension")
  }

  /**
   *
   */
  public open fun _updateExports(): Unit {
  }

  /**
   *
   */
  public open fun _getScriptMethodList(): VariantArray<Dictionary<Any?, Any?>> {
    throw NotImplementedError("_get_script_method_list is not implemented for ScriptExtension")
  }

  /**
   *
   */
  public open fun _getScriptPropertyList(): VariantArray<Dictionary<Any?, Any?>> {
    throw NotImplementedError("_get_script_property_list is not implemented for ScriptExtension")
  }

  /**
   *
   */
  public open fun _getMemberLine(member: StringName): Int {
    throw NotImplementedError("_get_member_line is not implemented for ScriptExtension")
  }

  /**
   *
   */
  public open fun _getConstants(): Dictionary<Any?, Any?> {
    throw NotImplementedError("_get_constants is not implemented for ScriptExtension")
  }

  /**
   *
   */
  public open fun _getMembers(): VariantArray<StringName> {
    throw NotImplementedError("_get_members is not implemented for ScriptExtension")
  }

  /**
   *
   */
  public open fun _isPlaceholderFallbackEnabled(): Boolean {
    throw NotImplementedError("_is_placeholder_fallback_enabled is not implemented for ScriptExtension")
  }

  /**
   *
   */
  public open fun _getRpcConfig(): Any? {
    throw NotImplementedError("_get_rpc_config is not implemented for ScriptExtension")
  }

  public companion object

  internal object MethodBindings {
    public val _editorCanReloadFromFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptExtension", "_editor_can_reload_from_file")

    public val _placeholderErasedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptExtension", "_placeholder_erased")

    public val _canInstantiatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptExtension", "_can_instantiate")

    public val _getBaseScriptPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptExtension", "_get_base_script")

    public val _getGlobalNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptExtension", "_get_global_name")

    public val _inheritsScriptPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptExtension", "_inherits_script")

    public val _getInstanceBaseTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptExtension", "_get_instance_base_type")

    public val _instanceCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptExtension", "_instance_create")

    public val _placeholderInstanceCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptExtension", "_placeholder_instance_create")

    public val _instanceHasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptExtension", "_instance_has")

    public val _hasSourceCodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptExtension", "_has_source_code")

    public val _getSourceCodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptExtension", "_get_source_code")

    public val _setSourceCodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptExtension", "_set_source_code")

    public val _reloadPtr: VoidPtr = TypeManager.getMethodBindPtr("ScriptExtension", "_reload")

    public val _getDocumentationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptExtension", "_get_documentation")

    public val _hasMethodPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptExtension", "_has_method")

    public val _getMethodInfoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptExtension", "_get_method_info")

    public val _isToolPtr: VoidPtr = TypeManager.getMethodBindPtr("ScriptExtension", "_is_tool")

    public val _isValidPtr: VoidPtr = TypeManager.getMethodBindPtr("ScriptExtension", "_is_valid")

    public val _getLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptExtension", "_get_language")

    public val _hasScriptSignalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptExtension", "_has_script_signal")

    public val _getScriptSignalListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptExtension", "_get_script_signal_list")

    public val _hasPropertyDefaultValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptExtension", "_has_property_default_value")

    public val _getPropertyDefaultValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptExtension", "_get_property_default_value")

    public val _updateExportsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptExtension", "_update_exports")

    public val _getScriptMethodListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptExtension", "_get_script_method_list")

    public val _getScriptPropertyListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptExtension", "_get_script_property_list")

    public val _getMemberLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptExtension", "_get_member_line")

    public val _getConstantsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptExtension", "_get_constants")

    public val _getMembersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptExtension", "_get_members")

    public val _isPlaceholderFallbackEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptExtension", "_is_placeholder_fallback_enabled")

    public val _getRpcConfigPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptExtension", "_get_rpc_config")
  }
}
