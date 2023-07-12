// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * Abstract base class for separators.
 *
 * Abstract base class for separators, used for separating other controls. [godot.Separator]s are purely visual and normally drawn as a [godot.StyleBoxLine].
 */
@GodotBaseType
public open class Separator internal constructor() : Control() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SEPARATOR, scriptIndex)
    return true
  }

  public companion object
}
