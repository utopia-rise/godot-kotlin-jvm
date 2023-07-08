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
 * A container that arranges its child controls vertically.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/676](https://godotengine.org/asset-library/asset/676)
 *
 * A variant of [godot.BoxContainer] that can only arrange its child controls vertically. Child controls are rearranged automatically when their minimum size changes.
 */
@GodotBaseType
public open class VBoxContainer : BoxContainer() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VBOXCONTAINER, scriptIndex)
    return true
  }

  public companion object
}
