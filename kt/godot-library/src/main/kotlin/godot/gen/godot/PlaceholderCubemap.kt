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
 * A [godot.Cubemap] without image data.
 *
 * This class replaces a [godot.Cubemap] or a [godot.Cubemap]-derived class in 2 conditions:
 *
 * - In dedicated server mode, where the image data shouldn't affect game logic. This allows reducing the exported PCK's size significantly.
 *
 * - When the [godot.Cubemap]-derived class is missing, for example when using a different engine version.
 *
 * **Note:** This class is not intended for rendering or for use in shaders. Operations like calculating UV are not guaranteed to work.
 */
@GodotBaseType
public open class PlaceholderCubemap : PlaceholderTextureLayered() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PLACEHOLDERCUBEMAP, scriptIndex)
    return true
  }

  public companion object
}
