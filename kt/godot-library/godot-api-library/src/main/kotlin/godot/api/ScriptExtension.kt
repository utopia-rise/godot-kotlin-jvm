// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.Error
import godot.core.StringName
import godot.core.VariantArray
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class ScriptExtension : Script() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(582, scriptIndex)
  }

  public open fun _editorCanReloadFromFile(): Boolean {
    throw NotImplementedError("_editorCanReloadFromFile is not implemented for ScriptExtension")
  }

  public open fun _canInstantiate(): Boolean {
    throw NotImplementedError("_canInstantiate is not implemented for ScriptExtension")
  }

  public open fun _getBaseScript(): Script? {
    throw NotImplementedError("_getBaseScript is not implemented for ScriptExtension")
  }

  public open fun _getGlobalName(): StringName {
    throw NotImplementedError("_getGlobalName is not implemented for ScriptExtension")
  }

  public open fun _inheritsScript(script: Script?): Boolean {
    throw NotImplementedError("_inheritsScript is not implemented for ScriptExtension")
  }

  public open fun _getInstanceBaseType(): StringName {
    throw NotImplementedError("_getInstanceBaseType is not implemented for ScriptExtension")
  }

  public open fun _instanceHas(`object`: Object?): Boolean {
    throw NotImplementedError("_instanceHas is not implemented for ScriptExtension")
  }

  public open fun _hasSourceCode(): Boolean {
    throw NotImplementedError("_hasSourceCode is not implemented for ScriptExtension")
  }

  public open fun _getSourceCode(): String {
    throw NotImplementedError("_getSourceCode is not implemented for ScriptExtension")
  }

  public open fun _setSourceCode(code: String): Unit {
  }

  public open fun _reload(keepState: Boolean): Error {
    throw NotImplementedError("_reload is not implemented for ScriptExtension")
  }

  public open fun _getDocClassName(): StringName {
    throw NotImplementedError("_get_doc_class_name is not implemented for ScriptExtension")
  }

  public open fun _getDocumentation(): VariantArray<Dictionary<Any?, Any?>> {
    throw NotImplementedError("_getDocumentation is not implemented for ScriptExtension")
  }

  public open fun _getClassIconPath(): String {
    throw NotImplementedError("_getClassIconPath is not implemented for ScriptExtension")
  }

  public open fun _hasMethod(method: StringName): Boolean {
    throw NotImplementedError("_hasMethod is not implemented for ScriptExtension")
  }

  public open fun _hasStaticMethod(method: StringName): Boolean {
    throw NotImplementedError("_hasStaticMethod is not implemented for ScriptExtension")
  }

  /**
   * Return the expected argument count for the given [method], or `null` if it can't be determined
   * (which will then fall back to the default behavior).
   */
  public open fun _getScriptMethodArgumentCount(method: StringName): Any? {
    throw NotImplementedError("_getScriptMethodArgumentCount is not implemented for ScriptExtension")
  }

  public open fun _getMethodInfo(method: StringName): Dictionary<Any?, Any?> {
    throw NotImplementedError("_getMethodInfo is not implemented for ScriptExtension")
  }

  public open fun _isTool(): Boolean {
    throw NotImplementedError("_isTool is not implemented for ScriptExtension")
  }

  public open fun _isValid(): Boolean {
    throw NotImplementedError("_isValid is not implemented for ScriptExtension")
  }

  /**
   * Returns `true` if the script is an abstract script. An abstract script does not have a
   * constructor and cannot be instantiated.
   */
  public open fun _isAbstract(): Boolean {
    throw NotImplementedError("_isAbstract is not implemented for ScriptExtension")
  }

  public open fun _getLanguage(): ScriptLanguage? {
    throw NotImplementedError("_getLanguage is not implemented for ScriptExtension")
  }

  public open fun _hasScriptSignal(signal: StringName): Boolean {
    throw NotImplementedError("_hasScriptSignal is not implemented for ScriptExtension")
  }

  public open fun _getScriptSignalList(): VariantArray<Dictionary<Any?, Any?>> {
    throw NotImplementedError("_getScriptSignalList is not implemented for ScriptExtension")
  }

  public open fun _hasPropertyDefaultValue(`property`: StringName): Boolean {
    throw NotImplementedError("_hasPropertyDefaultValue is not implemented for ScriptExtension")
  }

  public open fun _getPropertyDefaultValue(`property`: StringName): Any? {
    throw NotImplementedError("_getPropertyDefaultValue is not implemented for ScriptExtension")
  }

  public open fun _updateExports(): Unit {
  }

  public open fun _getScriptMethodList(): VariantArray<Dictionary<Any?, Any?>> {
    throw NotImplementedError("_getScriptMethodList is not implemented for ScriptExtension")
  }

  public open fun _getScriptPropertyList(): VariantArray<Dictionary<Any?, Any?>> {
    throw NotImplementedError("_getScriptPropertyList is not implemented for ScriptExtension")
  }

  public open fun _getMemberLine(member: StringName): Int {
    throw NotImplementedError("_getMemberLine is not implemented for ScriptExtension")
  }

  public open fun _getConstants(): Dictionary<Any?, Any?> {
    throw NotImplementedError("_getConstants is not implemented for ScriptExtension")
  }

  public open fun _getMembers(): VariantArray<StringName> {
    throw NotImplementedError("_getMembers is not implemented for ScriptExtension")
  }

  public open fun _isPlaceholderFallbackEnabled(): Boolean {
    throw NotImplementedError("_isPlaceholderFallbackEnabled is not implemented for ScriptExtension")
  }

  public open fun _getRpcConfig(): Any? {
    throw NotImplementedError("_getRpcConfig is not implemented for ScriptExtension")
  }

  public companion object

  public object MethodBindings
}
