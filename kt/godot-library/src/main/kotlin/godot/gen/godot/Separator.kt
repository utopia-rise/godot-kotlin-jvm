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
 * Base class for separators.
 *
 * Separator is a [godot.Control] used for separating other controls. It's purely a visual decoration. Horizontal ([godot.HSeparator]) and Vertical ([godot.VSeparator]) versions are available.
 */
@GodotBaseType
public open class Separator internal constructor() : Control() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SEPARATOR, scriptIndex)
    return true
  }

  public companion object
}
