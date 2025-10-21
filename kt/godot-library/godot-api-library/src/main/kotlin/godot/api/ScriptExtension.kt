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
public abstract class ScriptExtension : Script() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(590, scriptIndex)
  }

  public abstract fun _editorCanReloadFromFile(): Boolean

  public abstract fun _canInstantiate(): Boolean

  public abstract fun _getBaseScript(): Script?

  public abstract fun _getGlobalName(): StringName

  public abstract fun _inheritsScript(script: Script?): Boolean

  public abstract fun _getInstanceBaseType(): StringName

  public abstract fun _instanceHas(`object`: Object?): Boolean

  public abstract fun _hasSourceCode(): Boolean

  public abstract fun _getSourceCode(): String

  public abstract fun _setSourceCode(code: String): Unit

  public abstract fun _reload(keepState: Boolean): Error

  public abstract fun _getDocClassName(): StringName

  public abstract fun _getDocumentation(): VariantArray<Dictionary<Any?, Any?>>

  public open fun _getClassIconPath(): String {
    throw NotImplementedError("ScriptExtension::_getClassIconPath is not implemented.")
  }

  public abstract fun _hasMethod(method: StringName): Boolean

  public abstract fun _hasStaticMethod(method: StringName): Boolean

  /**
   * Return the expected argument count for the given [method], or `null` if it can't be determined
   * (which will then fall back to the default behavior).
   */
  public open fun _getScriptMethodArgumentCount(method: StringName): Any? {
    throw NotImplementedError("ScriptExtension::_getScriptMethodArgumentCount is not implemented.")
  }

  public abstract fun _getMethodInfo(method: StringName): Dictionary<Any?, Any?>

  public abstract fun _isTool(): Boolean

  public abstract fun _isValid(): Boolean

  /**
   * Returns `true` if the script is an abstract script. Abstract scripts cannot be instantiated
   * directly, instead other scripts should inherit them. Abstract scripts will be either unselectable
   * or hidden in the Create New Node dialog (unselectable if there are non-abstract classes inheriting
   * it, otherwise hidden).
   */
  public open fun _isAbstract(): Boolean {
    throw NotImplementedError("ScriptExtension::_isAbstract is not implemented.")
  }

  public abstract fun _getLanguage(): ScriptLanguage?

  public abstract fun _hasScriptSignal(signal: StringName): Boolean

  public abstract fun _getScriptSignalList(): VariantArray<Dictionary<Any?, Any?>>

  public abstract fun _hasPropertyDefaultValue(`property`: StringName): Boolean

  public abstract fun _getPropertyDefaultValue(`property`: StringName): Any?

  public abstract fun _updateExports(): Unit

  public abstract fun _getScriptMethodList(): VariantArray<Dictionary<Any?, Any?>>

  public abstract fun _getScriptPropertyList(): VariantArray<Dictionary<Any?, Any?>>

  public abstract fun _getMemberLine(member: StringName): Int

  public abstract fun _getConstants(): Dictionary<Any?, Any?>

  public abstract fun _getMembers(): VariantArray<StringName>

  public abstract fun _isPlaceholderFallbackEnabled(): Boolean

  public abstract fun _getRpcConfig(): Any?

  public companion object

  public object MethodBindings
}
