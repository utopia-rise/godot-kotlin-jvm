// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.util.Internals
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_SCRIPTLANGUAGE_INDEX: Int = 565

@GodotBaseType
public open class ScriptLanguage internal constructor() : Object() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_SCRIPTLANGUAGE_INDEX, scriptIndex)
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
