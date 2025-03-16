// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.core

import kotlin.Long
import kotlin.Suppress

public enum class ClockDirection(
  id: Long,
) {
  /**
   * Clockwise rotation. Used by some methods (e.g. [Image.rotate90]).
   */
  CLOCKWISE(0),
  /**
   * Counter-clockwise rotation. Used by some methods (e.g. [Image.rotate90]).
   */
  COUNTERCLOCKWISE(1),
  ;

  public val id: Long
  init {
    this.id = id
  }

  public companion object {
    public fun from(`value`: Long): ClockDirection = entries.single { it.id == `value` }
  }
}
