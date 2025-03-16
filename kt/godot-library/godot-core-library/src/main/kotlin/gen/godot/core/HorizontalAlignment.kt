// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.core

import kotlin.Long
import kotlin.Suppress

public enum class HorizontalAlignment(
  id: Long,
) {
  /**
   * Horizontal left alignment, usually for text-derived classes.
   */
  LEFT(0),
  /**
   * Horizontal center alignment, usually for text-derived classes.
   */
  CENTER(1),
  /**
   * Horizontal right alignment, usually for text-derived classes.
   */
  RIGHT(2),
  /**
   * Expand row to fit width, usually for text-derived classes.
   */
  FILL(3),
  ;

  public val id: Long
  init {
    this.id = id
  }

  public companion object {
    public fun from(`value`: Long): HorizontalAlignment = entries.single { it.id == `value` }
  }
}
