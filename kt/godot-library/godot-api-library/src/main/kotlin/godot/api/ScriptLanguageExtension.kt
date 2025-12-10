// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.core.Dictionary
import godot.core.Error
import godot.core.GodotEnum
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.VariantArray
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public abstract class ScriptLanguageExtension : ScriptLanguage() {
  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(592, scriptPtr)
  }

  public abstract fun _getName(): String

  public abstract fun _init(): Unit

  public abstract fun _getType(): String

  public abstract fun _getExtension(): String

  public abstract fun _finish(): Unit

  public abstract fun _getReservedWords(): PackedStringArray

  public abstract fun _isControlFlowKeyword(keyword: String): Boolean

  public abstract fun _getCommentDelimiters(): PackedStringArray

  public open fun _getDocCommentDelimiters(): PackedStringArray {
    throw NotImplementedError("ScriptLanguageExtension::_getDocCommentDelimiters is not implemented.")
  }

  public abstract fun _getStringDelimiters(): PackedStringArray

  public abstract fun _makeTemplate(
    template: String,
    className: String,
    baseClassName: String,
  ): Script?

  public abstract fun _getBuiltInTemplates(`object`: StringName):
      VariantArray<Dictionary<Any?, Any?>>

  public abstract fun _isUsingTemplates(): Boolean

  public abstract fun _validate(
    script: String,
    path: String,
    validateFunctions: Boolean,
    validateErrors: Boolean,
    validateWarnings: Boolean,
    validateSafeLines: Boolean,
  ): Dictionary<Any?, Any?>

  public abstract fun _validatePath(path: String): String

  public abstract fun _createScript(): Object?

  public abstract fun _hasNamedClasses(): Boolean

  public abstract fun _supportsBuiltinMode(): Boolean

  public abstract fun _supportsDocumentation(): Boolean

  public abstract fun _canInheritFromFile(): Boolean

  /**
   * Returns the line where the function is defined in the code, or `-1` if the function is not
   * present.
   */
  public abstract fun _findFunction(function: String, code: String): Int

  public abstract fun _makeFunction(
    className: String,
    functionName: String,
    functionArgs: PackedStringArray,
  ): String

  public abstract fun _canMakeFunction(): Boolean

  public abstract fun _openInExternalEditor(
    script: Script?,
    line: Int,
    column: Int,
  ): Error

  public abstract fun _overridesExternalEditor(): Boolean

  public open fun _preferredFileNameCasing(): ScriptLanguage.ScriptNameCasing {
    throw NotImplementedError("ScriptLanguageExtension::_preferredFileNameCasing is not implemented.")
  }

  public abstract fun _completeCode(
    code: String,
    path: String,
    owner: Object?,
  ): Dictionary<Any?, Any?>

  public abstract fun _lookupCode(
    code: String,
    symbol: String,
    path: String,
    owner: Object?,
  ): Dictionary<Any?, Any?>

  public abstract fun _autoIndentCode(
    code: String,
    fromLine: Int,
    toLine: Int,
  ): String

  public abstract fun _addGlobalConstant(name: StringName, `value`: Any?): Unit

  public abstract fun _addNamedGlobalConstant(name: StringName, `value`: Any?): Unit

  public abstract fun _removeNamedGlobalConstant(name: StringName): Unit

  public abstract fun _threadEnter(): Unit

  public abstract fun _threadExit(): Unit

  public abstract fun _debugGetError(): String

  public abstract fun _debugGetStackLevelCount(): Int

  public abstract fun _debugGetStackLevelLine(level: Int): Int

  public abstract fun _debugGetStackLevelFunction(level: Int): String

  /**
   * Returns the source associated with a given debug stack position.
   */
  public abstract fun _debugGetStackLevelSource(level: Int): String

  public abstract fun _debugGetStackLevelLocals(
    level: Int,
    maxSubitems: Int,
    maxDepth: Int,
  ): Dictionary<Any?, Any?>

  public abstract fun _debugGetStackLevelMembers(
    level: Int,
    maxSubitems: Int,
    maxDepth: Int,
  ): Dictionary<Any?, Any?>

  public abstract fun _debugGetGlobals(maxSubitems: Int, maxDepth: Int): Dictionary<Any?, Any?>

  public abstract fun _debugParseStackLevelExpression(
    level: Int,
    expression: String,
    maxSubitems: Int,
    maxDepth: Int,
  ): String

  public abstract fun _debugGetCurrentStackInfo(): VariantArray<Dictionary<Any?, Any?>>

  public abstract fun _reloadAllScripts(): Unit

  public abstract fun _reloadScripts(scripts: VariantArray<Any?>, softReload: Boolean): Unit

  public abstract fun _reloadToolScript(script: Script?, softReload: Boolean): Unit

  public abstract fun _getRecognizedExtensions(): PackedStringArray

  public abstract fun _getPublicFunctions(): VariantArray<Dictionary<Any?, Any?>>

  public abstract fun _getPublicConstants(): Dictionary<Any?, Any?>

  public abstract fun _getPublicAnnotations(): VariantArray<Dictionary<Any?, Any?>>

  public abstract fun _profilingStart(): Unit

  public abstract fun _profilingStop(): Unit

  public abstract fun _profilingSetSaveNativeCalls(enable: Boolean): Unit

  public abstract fun _frame(): Unit

  public abstract fun _handlesGlobalClassType(type: String): Boolean

  public abstract fun _getGlobalClassName(path: String): Dictionary<Any?, Any?>

  public enum class LookupResultType(
    `value`: Long,
  ) : GodotEnum {
    SCRIPT_LOCATION(0),
    CLASS(1),
    CLASS_CONSTANT(2),
    CLASS_PROPERTY(3),
    CLASS_METHOD(4),
    CLASS_SIGNAL(5),
    CLASS_ENUM(6),
    CLASS_TBD_GLOBALSCOPE(7),
    CLASS_ANNOTATION(8),
    LOCAL_CONSTANT(9),
    LOCAL_VARIABLE(10),
    MAX(11),
    ;

    public override val `value`: Long
    init {
      this.`value` = `value`
    }

    public companion object {
      public fun from(`value`: Long): LookupResultType = entries.single { it.`value` == `value` }
    }
  }

  public enum class CodeCompletionLocation(
    `value`: Long,
  ) : GodotEnum {
    /**
     * The option is local to the location of the code completion query - e.g. a local variable.
     * Subsequent value of location represent options from the outer class, the exact value represent
     * how far they are (in terms of inner classes).
     */
    LOCATION_LOCAL(0),
    /**
     * The option is from the containing class or a parent class, relative to the location of the
     * code completion query. Perform a bitwise OR with the class depth (e.g. `0` for the local class,
     * `1` for the parent, `2` for the grandparent, etc.) to store the depth of an option in the class
     * or a parent class.
     */
    LOCATION_PARENT_MASK(256),
    /**
     * The option is from user code which is not local and not in a derived class (e.g. Autoload
     * Singletons).
     */
    LOCATION_OTHER_USER_CODE(512),
    /**
     * The option is from other engine code, not covered by the other enum constants - e.g. built-in
     * classes.
     */
    LOCATION_OTHER(1024),
    ;

    public override val `value`: Long
    init {
      this.`value` = `value`
    }

    public companion object {
      public fun from(`value`: Long): CodeCompletionLocation =
          entries.single { it.`value` == `value` }
    }
  }

  public enum class CodeCompletionKind(
    `value`: Long,
  ) : GodotEnum {
    CLASS(0),
    FUNCTION(1),
    SIGNAL(2),
    VARIABLE(3),
    MEMBER(4),
    ENUM(5),
    CONSTANT(6),
    NODE_PATH(7),
    FILE_PATH(8),
    PLAIN_TEXT(9),
    MAX(10),
    ;

    public override val `value`: Long
    init {
      this.`value` = `value`
    }

    public companion object {
      public fun from(`value`: Long): CodeCompletionKind = entries.single { it.`value` == `value` }
    }
  }

  public companion object

  public object MethodBindings
}
