// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class ScriptLanguage internal constructor() : Object() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(580, scriptIndex)
  }

  public enum class ScriptNameCasing(
    id: Long,
  ) {
    AUTO(0),
    PASCAL_CASE(1),
    SNAKE_CASE(2),
    KEBAB_CASE(3),
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

  public object MethodBindings
}
