// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.Error
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
public open class ScriptLanguageExtension : ScriptLanguage() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(578, scriptIndex)
  }

  public open fun _getName(): String {
    throw NotImplementedError("_getName is not implemented for ScriptLanguageExtension")
  }

  public open fun _init(): Unit {
    throw NotImplementedError("_init is not implemented for ScriptLanguageExtension")
  }

  public open fun _getType(): String {
    throw NotImplementedError("_getType is not implemented for ScriptLanguageExtension")
  }

  public open fun _getExtension(): String {
    throw NotImplementedError("_getExtension is not implemented for ScriptLanguageExtension")
  }

  public open fun _finish(): Unit {
    throw NotImplementedError("_finish is not implemented for ScriptLanguageExtension")
  }

  public open fun _getReservedWords(): PackedStringArray {
    throw NotImplementedError("_getReservedWords is not implemented for ScriptLanguageExtension")
  }

  public open fun _isControlFlowKeyword(keyword: String): Boolean {
    throw NotImplementedError("_isControlFlowKeyword is not implemented for ScriptLanguageExtension")
  }

  public open fun _getCommentDelimiters(): PackedStringArray {
    throw NotImplementedError("_getCommentDelimiters is not implemented for ScriptLanguageExtension")
  }

  public open fun _getDocCommentDelimiters(): PackedStringArray {
    throw NotImplementedError("_getDocCommentDelimiters is not implemented for ScriptLanguageExtension")
  }

  public open fun _getStringDelimiters(): PackedStringArray {
    throw NotImplementedError("_getStringDelimiters is not implemented for ScriptLanguageExtension")
  }

  public open fun _makeTemplate(
    template: String,
    className: String,
    baseClassName: String,
  ): Script? {
    throw NotImplementedError("_makeTemplate is not implemented for ScriptLanguageExtension")
  }

  public open fun _getBuiltInTemplates(`object`: StringName): VariantArray<Dictionary<Any?, Any?>> {
    throw NotImplementedError("_getBuiltInTemplates is not implemented for ScriptLanguageExtension")
  }

  public open fun _isUsingTemplates(): Boolean {
    throw NotImplementedError("_isUsingTemplates is not implemented for ScriptLanguageExtension")
  }

  public open fun _validate(
    script: String,
    path: String,
    validateFunctions: Boolean,
    validateErrors: Boolean,
    validateWarnings: Boolean,
    validateSafeLines: Boolean,
  ): Dictionary<Any?, Any?> {
    throw NotImplementedError("_validate is not implemented for ScriptLanguageExtension")
  }

  public open fun _validatePath(path: String): String {
    throw NotImplementedError("_validatePath is not implemented for ScriptLanguageExtension")
  }

  public open fun _createScript(): Object? {
    throw NotImplementedError("_createScript is not implemented for ScriptLanguageExtension")
  }

  public open fun _hasNamedClasses(): Boolean {
    throw NotImplementedError("_hasNamedClasses is not implemented for ScriptLanguageExtension")
  }

  public open fun _supportsBuiltinMode(): Boolean {
    throw NotImplementedError("_supportsBuiltinMode is not implemented for ScriptLanguageExtension")
  }

  public open fun _supportsDocumentation(): Boolean {
    throw NotImplementedError("_supportsDocumentation is not implemented for ScriptLanguageExtension")
  }

  public open fun _canInheritFromFile(): Boolean {
    throw NotImplementedError("_canInheritFromFile is not implemented for ScriptLanguageExtension")
  }

  /**
   * Returns the line where the function is defined in the code, or `-1` if the function is not
   * present.
   */
  public open fun _findFunction(function: String, code: String): Int {
    throw NotImplementedError("_findFunction is not implemented for ScriptLanguageExtension")
  }

  public open fun _makeFunction(
    className: String,
    functionName: String,
    functionArgs: PackedStringArray,
  ): String {
    throw NotImplementedError("_makeFunction is not implemented for ScriptLanguageExtension")
  }

  public open fun _canMakeFunction(): Boolean {
    throw NotImplementedError("_canMakeFunction is not implemented for ScriptLanguageExtension")
  }

  public open fun _openInExternalEditor(
    script: Script?,
    line: Int,
    column: Int,
  ): Error {
    throw NotImplementedError("_openInExternalEditor is not implemented for ScriptLanguageExtension")
  }

  public open fun _overridesExternalEditor(): Boolean {
    throw NotImplementedError("_overridesExternalEditor is not implemented for ScriptLanguageExtension")
  }

  public open fun _preferredFileNameCasing(): ScriptLanguage.ScriptNameCasing {
    throw NotImplementedError("_preferredFileNameCasing is not implemented for ScriptLanguageExtension")
  }

  public open fun _completeCode(
    code: String,
    path: String,
    owner: Object?,
  ): Dictionary<Any?, Any?> {
    throw NotImplementedError("_completeCode is not implemented for ScriptLanguageExtension")
  }

  public open fun _lookupCode(
    code: String,
    symbol: String,
    path: String,
    owner: Object?,
  ): Dictionary<Any?, Any?> {
    throw NotImplementedError("_lookupCode is not implemented for ScriptLanguageExtension")
  }

  public open fun _autoIndentCode(
    code: String,
    fromLine: Int,
    toLine: Int,
  ): String {
    throw NotImplementedError("_autoIndentCode is not implemented for ScriptLanguageExtension")
  }

  public open fun _addGlobalConstant(name: StringName, `value`: Any?): Unit {
    throw NotImplementedError("_addGlobalConstant is not implemented for ScriptLanguageExtension")
  }

  public open fun _addNamedGlobalConstant(name: StringName, `value`: Any?): Unit {
    throw NotImplementedError("_addNamedGlobalConstant is not implemented for ScriptLanguageExtension")
  }

  public open fun _removeNamedGlobalConstant(name: StringName): Unit {
    throw NotImplementedError("_removeNamedGlobalConstant is not implemented for ScriptLanguageExtension")
  }

  public open fun _threadEnter(): Unit {
    throw NotImplementedError("_threadEnter is not implemented for ScriptLanguageExtension")
  }

  public open fun _threadExit(): Unit {
    throw NotImplementedError("_threadExit is not implemented for ScriptLanguageExtension")
  }

  public open fun _debugGetError(): String {
    throw NotImplementedError("_debugGetError is not implemented for ScriptLanguageExtension")
  }

  public open fun _debugGetStackLevelCount(): Int {
    throw NotImplementedError("_debugGetStackLevelCount is not implemented for ScriptLanguageExtension")
  }

  public open fun _debugGetStackLevelLine(level: Int): Int {
    throw NotImplementedError("_debugGetStackLevelLine is not implemented for ScriptLanguageExtension")
  }

  public open fun _debugGetStackLevelFunction(level: Int): String {
    throw NotImplementedError("_debugGetStackLevelFunction is not implemented for ScriptLanguageExtension")
  }

  /**
   * Returns the source associated with a given debug stack position.
   */
  public open fun _debugGetStackLevelSource(level: Int): String {
    throw NotImplementedError("_debugGetStackLevelSource is not implemented for ScriptLanguageExtension")
  }

  public open fun _debugGetStackLevelLocals(
    level: Int,
    maxSubitems: Int,
    maxDepth: Int,
  ): Dictionary<Any?, Any?> {
    throw NotImplementedError("_debugGetStackLevelLocals is not implemented for ScriptLanguageExtension")
  }

  public open fun _debugGetStackLevelMembers(
    level: Int,
    maxSubitems: Int,
    maxDepth: Int,
  ): Dictionary<Any?, Any?> {
    throw NotImplementedError("_debugGetStackLevelMembers is not implemented for ScriptLanguageExtension")
  }

  public open fun _debugGetGlobals(maxSubitems: Int, maxDepth: Int): Dictionary<Any?, Any?> {
    throw NotImplementedError("_debugGetGlobals is not implemented for ScriptLanguageExtension")
  }

  public open fun _debugParseStackLevelExpression(
    level: Int,
    expression: String,
    maxSubitems: Int,
    maxDepth: Int,
  ): String {
    throw NotImplementedError("_debugParseStackLevelExpression is not implemented for ScriptLanguageExtension")
  }

  public open fun _debugGetCurrentStackInfo(): VariantArray<Dictionary<Any?, Any?>> {
    throw NotImplementedError("_debugGetCurrentStackInfo is not implemented for ScriptLanguageExtension")
  }

  public open fun _reloadAllScripts(): Unit {
    throw NotImplementedError("_reloadAllScripts is not implemented for ScriptLanguageExtension")
  }

  public open fun _reloadScripts(scripts: VariantArray<Any?>, softReload: Boolean): Unit {
    throw NotImplementedError("_reloadScripts is not implemented for ScriptLanguageExtension")
  }

  public open fun _reloadToolScript(script: Script?, softReload: Boolean): Unit {
    throw NotImplementedError("_reloadToolScript is not implemented for ScriptLanguageExtension")
  }

  public open fun _getRecognizedExtensions(): PackedStringArray {
    throw NotImplementedError("_getRecognizedExtensions is not implemented for ScriptLanguageExtension")
  }

  public open fun _getPublicFunctions(): VariantArray<Dictionary<Any?, Any?>> {
    throw NotImplementedError("_getPublicFunctions is not implemented for ScriptLanguageExtension")
  }

  public open fun _getPublicConstants(): Dictionary<Any?, Any?> {
    throw NotImplementedError("_getPublicConstants is not implemented for ScriptLanguageExtension")
  }

  public open fun _getPublicAnnotations(): VariantArray<Dictionary<Any?, Any?>> {
    throw NotImplementedError("_getPublicAnnotations is not implemented for ScriptLanguageExtension")
  }

  public open fun _profilingStart(): Unit {
    throw NotImplementedError("_profilingStart is not implemented for ScriptLanguageExtension")
  }

  public open fun _profilingStop(): Unit {
    throw NotImplementedError("_profilingStop is not implemented for ScriptLanguageExtension")
  }

  public open fun _profilingSetSaveNativeCalls(enable: Boolean): Unit {
    throw NotImplementedError("_profilingSetSaveNativeCalls is not implemented for ScriptLanguageExtension")
  }

  public open fun _frame(): Unit {
    throw NotImplementedError("_frame is not implemented for ScriptLanguageExtension")
  }

  public open fun _handlesGlobalClassType(type: String): Boolean {
    throw NotImplementedError("_handlesGlobalClassType is not implemented for ScriptLanguageExtension")
  }

  public open fun _getGlobalClassName(path: String): Dictionary<Any?, Any?> {
    throw NotImplementedError("_getGlobalClassName is not implemented for ScriptLanguageExtension")
  }

  public enum class LookupResultType(
    id: Long,
  ) {
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

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): LookupResultType = entries.single { it.id == `value` }
    }
  }

  public enum class CodeCompletionLocation(
    id: Long,
  ) {
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

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CodeCompletionLocation = entries.single { it.id == `value` }
    }
  }

  public enum class CodeCompletionKind(
    id: Long,
  ) {
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

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CodeCompletionKind = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings
}
