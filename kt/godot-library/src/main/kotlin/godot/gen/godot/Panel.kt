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
 * Provides an opaque background for [godot.Control] children.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/523](https://godotengine.org/asset-library/asset/523)
 *
 * Panel is a [godot.Control] that displays an opaque background. It's commonly used as a parent and container for other types of [godot.Control] nodes.
 */
@GodotBaseType
public open class Panel : Control() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PANEL, scriptIndex)
    return true
  }

  public companion object
}
