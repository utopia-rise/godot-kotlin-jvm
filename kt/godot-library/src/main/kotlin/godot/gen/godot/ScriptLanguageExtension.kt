// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.GodotError
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

/**
 *
 */
@GodotBaseType
public open class ScriptLanguageExtension : ScriptLanguage() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SCRIPTLANGUAGEEXTENSION, scriptIndex)
    return true
  }

  /**
   *
   */
  public open fun _getName(): String {
    throw NotImplementedError("_get_name is not implemented for ScriptLanguageExtension")
  }

  /**
   *
   */
  public open fun _init(): Unit {
  }

  /**
   *
   */
  public open fun _getType(): String {
    throw NotImplementedError("_get_type is not implemented for ScriptLanguageExtension")
  }

  /**
   *
   */
  public open fun _getExtension(): String {
    throw NotImplementedError("_get_extension is not implemented for ScriptLanguageExtension")
  }

  /**
   *
   */
  public open fun _finish(): Unit {
  }

  /**
   *
   */
  public open fun _getReservedWords(): PackedStringArray {
    throw NotImplementedError("_get_reserved_words is not implemented for ScriptLanguageExtension")
  }

  /**
   *
   */
  public open fun _isControlFlowKeyword(keyword: String): Boolean {
    throw NotImplementedError("_is_control_flow_keyword is not implemented for ScriptLanguageExtension")
  }

  /**
   *
   */
  public open fun _getCommentDelimiters(): PackedStringArray {
    throw NotImplementedError("_get_comment_delimiters is not implemented for ScriptLanguageExtension")
  }

  /**
   *
   */
  public open fun _getStringDelimiters(): PackedStringArray {
    throw NotImplementedError("_get_string_delimiters is not implemented for ScriptLanguageExtension")
  }

  /**
   *
   */
  public open fun _makeTemplate(
    template: String,
    className: String,
    baseClassName: String,
  ): Script? {
    throw NotImplementedError("_make_template is not implemented for ScriptLanguageExtension")
  }

  /**
   *
   */
  public open fun _getBuiltInTemplates(_object: StringName): VariantArray<Dictionary<Any?, Any?>> {
    throw NotImplementedError("_get_built_in_templates is not implemented for ScriptLanguageExtension")
  }

  /**
   *
   */
  public open fun _isUsingTemplates(): Boolean {
    throw NotImplementedError("_is_using_templates is not implemented for ScriptLanguageExtension")
  }

  /**
   *
   */
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

  /**
   *
   */
  public open fun _validatePath(path: String): String {
    throw NotImplementedError("_validate_path is not implemented for ScriptLanguageExtension")
  }

  /**
   *
   */
  public open fun _createScript(): Object? {
    throw NotImplementedError("_create_script is not implemented for ScriptLanguageExtension")
  }

  /**
   *
   */
  public open fun _hasNamedClasses(): Boolean {
    throw NotImplementedError("_has_named_classes is not implemented for ScriptLanguageExtension")
  }

  /**
   *
   */
  public open fun _supportsBuiltinMode(): Boolean {
    throw NotImplementedError("_supports_builtin_mode is not implemented for ScriptLanguageExtension")
  }

  /**
   *
   */
  public open fun _supportsDocumentation(): Boolean {
    throw NotImplementedError("_supports_documentation is not implemented for ScriptLanguageExtension")
  }

  /**
   *
   */
  public open fun _canInheritFromFile(): Boolean {
    throw NotImplementedError("_can_inherit_from_file is not implemented for ScriptLanguageExtension")
  }

  /**
   *
   */
  public open fun _findFunction(className: String, functionName: String): Int {
    throw NotImplementedError("_find_function is not implemented for ScriptLanguageExtension")
  }

  /**
   *
   */
  public open fun _makeFunction(
    className: String,
    functionName: String,
    functionArgs: PackedStringArray,
  ): String {
    throw NotImplementedError("_make_function is not implemented for ScriptLanguageExtension")
  }

  /**
   *
   */
  public open fun _openInExternalEditor(
    script: Script,
    line: Int,
    column: Int,
  ): GodotError {
    throw NotImplementedError("_open_in_external_editor is not implemented for ScriptLanguageExtension")
  }

  /**
   *
   */
  public open fun _overridesExternalEditor(): Boolean {
    throw NotImplementedError("_overrides_external_editor is not implemented for ScriptLanguageExtension")
  }

  /**
   *
   */
  public open fun _completeCode(
    code: String,
    path: String,
    owner: Object,
  ): Dictionary<Any?, Any?> {
    throw NotImplementedError("_complete_code is not implemented for ScriptLanguageExtension")
  }

  /**
   *
   */
  public open fun _lookupCode(
    code: String,
    symbol: String,
    path: String,
    owner: Object,
  ): Dictionary<Any?, Any?> {
    throw NotImplementedError("_lookup_code is not implemented for ScriptLanguageExtension")
  }

  /**
   *
   */
  public open fun _autoIndentCode(
    code: String,
    fromLine: Int,
    toLine: Int,
  ): String {
    throw NotImplementedError("_auto_indent_code is not implemented for ScriptLanguageExtension")
  }

  /**
   *
   */
  public open fun _addGlobalConstant(name: StringName, `value`: Any): Unit {
  }

  /**
   *
   */
  public open fun _addNamedGlobalConstant(name: StringName, `value`: Any): Unit {
  }

  /**
   *
   */
  public open fun _removeNamedGlobalConstant(name: StringName): Unit {
  }

  /**
   *
   */
  public open fun _threadEnter(): Unit {
  }

  /**
   *
   */
  public open fun _threadExit(): Unit {
  }

  /**
   *
   */
  public open fun _debugGetError(): String {
    throw NotImplementedError("_debug_get_error is not implemented for ScriptLanguageExtension")
  }

  /**
   *
   */
  public open fun _debugGetStackLevelCount(): Int {
    throw NotImplementedError("_debug_get_stack_level_count is not implemented for ScriptLanguageExtension")
  }

  /**
   *
   */
  public open fun _debugGetStackLevelLine(level: Int): Int {
    throw NotImplementedError("_debug_get_stack_level_line is not implemented for ScriptLanguageExtension")
  }

  /**
   *
   */
  public open fun _debugGetStackLevelFunction(level: Int): String {
    throw NotImplementedError("_debug_get_stack_level_function is not implemented for ScriptLanguageExtension")
  }

  /**
   *
   */
  public open fun _debugGetStackLevelLocals(
    level: Int,
    maxSubitems: Int,
    maxDepth: Int,
  ): Dictionary<Any?, Any?> {
    throw NotImplementedError("_debug_get_stack_level_locals is not implemented for ScriptLanguageExtension")
  }

  /**
   *
   */
  public open fun _debugGetStackLevelMembers(
    level: Int,
    maxSubitems: Int,
    maxDepth: Int,
  ): Dictionary<Any?, Any?> {
    throw NotImplementedError("_debug_get_stack_level_members is not implemented for ScriptLanguageExtension")
  }

  /**
   *
   */
  public open fun _debugGetGlobals(maxSubitems: Int, maxDepth: Int): Dictionary<Any?, Any?> {
    throw NotImplementedError("_debug_get_globals is not implemented for ScriptLanguageExtension")
  }

  /**
   *
   */
  public open fun _debugParseStackLevelExpression(
    level: Int,
    expression: String,
    maxSubitems: Int,
    maxDepth: Int,
  ): String {
    throw NotImplementedError("_debug_parse_stack_level_expression is not implemented for ScriptLanguageExtension")
  }

  /**
   *
   */
  public open fun _debugGetCurrentStackInfo(): VariantArray<Dictionary<Any?, Any?>> {
    throw NotImplementedError("_debug_get_current_stack_info is not implemented for ScriptLanguageExtension")
  }

  /**
   *
   */
  public open fun _reloadAllScripts(): Unit {
  }

  /**
   *
   */
  public open fun _reloadToolScript(script: Script, softReload: Boolean): Unit {
  }

  /**
   *
   */
  public open fun _getRecognizedExtensions(): PackedStringArray {
    throw NotImplementedError("_get_recognized_extensions is not implemented for ScriptLanguageExtension")
  }

  /**
   *
   */
  public open fun _getPublicFunctions(): VariantArray<Dictionary<Any?, Any?>> {
    throw NotImplementedError("_get_public_functions is not implemented for ScriptLanguageExtension")
  }

  /**
   *
   */
  public open fun _getPublicConstants(): Dictionary<Any?, Any?> {
    throw NotImplementedError("_get_public_constants is not implemented for ScriptLanguageExtension")
  }

  /**
   *
   */
  public open fun _getPublicAnnotations(): VariantArray<Dictionary<Any?, Any?>> {
    throw NotImplementedError("_get_public_annotations is not implemented for ScriptLanguageExtension")
  }

  /**
   *
   */
  public open fun _profilingStart(): Unit {
  }

  /**
   *
   */
  public open fun _profilingStop(): Unit {
  }

  /**
   *
   */
  public open fun _frame(): Unit {
  }

  /**
   *
   */
  public open fun _handlesGlobalClassType(type: String): Boolean {
    throw NotImplementedError("_handles_global_class_type is not implemented for ScriptLanguageExtension")
  }

  /**
   *
   */
  public open fun _getGlobalClassName(path: String): Dictionary<Any?, Any?> {
    throw NotImplementedError("_get_global_class_name is not implemented for ScriptLanguageExtension")
  }

  public enum class LookupResultType(
    id: Long,
  ) {
    /**
     *
     */
    LOOKUP_RESULT_SCRIPT_LOCATION(0),
    /**
     *
     */
    LOOKUP_RESULT_CLASS(1),
    /**
     *
     */
    LOOKUP_RESULT_CLASS_CONSTANT(2),
    /**
     *
     */
    LOOKUP_RESULT_CLASS_PROPERTY(3),
    /**
     *
     */
    LOOKUP_RESULT_CLASS_METHOD(4),
    /**
     *
     */
    LOOKUP_RESULT_CLASS_SIGNAL(5),
    /**
     *
     */
    LOOKUP_RESULT_CLASS_ENUM(6),
    /**
     *
     */
    LOOKUP_RESULT_CLASS_TBD_GLOBALSCOPE(7),
    /**
     *
     */
    LOOKUP_RESULT_CLASS_ANNOTATION(8),
    /**
     *
     */
    LOOKUP_RESULT_MAX(9),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class CodeCompletionLocation(
    id: Long,
  ) {
    /**
     * The option is local to the location of the code completion query - e.g. a local variable. Subsequent value of location represent options from the outer class, the exact value represent how far they are (in terms of inner classes).
     */
    LOCATION_LOCAL(0),
    /**
     * The option is from the containing class or a parent class, relative to the location of the code completion query. Perform a bitwise OR with the class depth (e.g. 0 for the local class, 1 for the parent, 2 for the grandparent, etc) to store the depth of an option in the class or a parent class.
     */
    LOCATION_PARENT_MASK(256),
    /**
     * The option is from user code which is not local and not in a derived class (e.g. Autoload Singletons).
     */
    LOCATION_OTHER_USER_CODE(512),
    /**
     * The option is from other engine code, not covered by the other enum constants - e.g. built-in classes.
     */
    LOCATION_OTHER(1024),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class CodeCompletionKind(
    id: Long,
  ) {
    /**
     *
     */
    CODE_COMPLETION_KIND_CLASS(0),
    /**
     *
     */
    CODE_COMPLETION_KIND_FUNCTION(1),
    /**
     *
     */
    CODE_COMPLETION_KIND_SIGNAL(2),
    /**
     *
     */
    CODE_COMPLETION_KIND_VARIABLE(3),
    /**
     *
     */
    CODE_COMPLETION_KIND_MEMBER(4),
    /**
     *
     */
    CODE_COMPLETION_KIND_ENUM(5),
    /**
     *
     */
    CODE_COMPLETION_KIND_CONSTANT(6),
    /**
     *
     */
    CODE_COMPLETION_KIND_NODE_PATH(7),
    /**
     *
     */
    CODE_COMPLETION_KIND_FILE_PATH(8),
    /**
     *
     */
    CODE_COMPLETION_KIND_PLAIN_TEXT(9),
    /**
     *
     */
    CODE_COMPLETION_KIND_MAX(10),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object
}
