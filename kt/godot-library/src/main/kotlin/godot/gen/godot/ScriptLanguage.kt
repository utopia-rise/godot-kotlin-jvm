// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class ScriptLanguage internal constructor() : Object() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SCRIPTLANGUAGE, scriptIndex)
    return true
  }

  public enum class ScriptNameCasing(
    id: Long,
  ) {
    SCRIPT_NAME_CASING_AUTO(0),
    SCRIPT_NAME_CASING_PASCAL_CASE(1),
    SCRIPT_NAME_CASING_SNAKE_CASE(2),
    SCRIPT_NAME_CASING_KEBAB_CASE(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ScriptNameCasing = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings
}
