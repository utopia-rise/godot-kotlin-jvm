// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.core

import kotlin.Long
import kotlin.Suppress

public enum class Corner(
  id: Long,
) {
  /**
   * Top-left corner.
   */
  CORNER_TOP_LEFT(0),
  /**
   * Top-right corner.
   */
  CORNER_TOP_RIGHT(1),
  /**
   * Bottom-right corner.
   */
  CORNER_BOTTOM_RIGHT(2),
  /**
   * Bottom-left corner.
   */
  CORNER_BOTTOM_LEFT(3),
  ;

  public val id: Long
  init {
    this.id = id
  }

  public companion object {
    public fun from(`value`: Long): Corner = entries.single { it.id == `value` }
  }
}
