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
 * Panel container type.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/520](https://godotengine.org/asset-library/asset/520)
 *
 * Panel container type. This container fits controls inside of the delimited area of a stylebox. It's useful for giving controls an outline.
 */
@GodotBaseType
public open class PanelContainer : Container() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PANELCONTAINER, scriptIndex)
    return true
  }

  public companion object
}
