// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * Base class for all texture types.
 *
 * [godot.Texture] is the base class for all texture types. Common texture types are [godot.Texture2D] and [godot.ImageTexture]. See also [godot.Image].
 */
@GodotBaseType
public open class Texture : Resource() {
  public override fun __new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_TEXTURE, scriptIndex)
  }

  public companion object
}
