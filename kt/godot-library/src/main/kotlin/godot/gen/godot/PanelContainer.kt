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
 * A container that keeps its child controls within the area of a [godot.StyleBox].
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/520](https://godotengine.org/asset-library/asset/520)
 *
 * A container that keeps its child controls within the area of a [godot.StyleBox]. Useful for giving controls an outline.
 */
@GodotBaseType
public open class PanelContainer : Container() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PANELCONTAINER, scriptIndex)
    return true
  }

  public companion object
}
