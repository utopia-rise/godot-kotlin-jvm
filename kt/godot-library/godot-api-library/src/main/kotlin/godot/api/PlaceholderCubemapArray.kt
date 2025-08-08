// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import kotlin.Int
import kotlin.Suppress

/**
 * This class replaces a [CubemapArray] or a [CubemapArray]-derived class in 2 conditions:
 *
 * - In dedicated server mode, where the image data shouldn't affect game logic. This allows reducing the exported PCK's size significantly.
 *
 * - When the [CubemapArray]-derived class is missing, for example when using a different engine version.
 *
 * **Note:** This class is not intended for rendering or for use in shaders. Operations like calculating UV are not guaranteed to work.
 */
@GodotBaseType
public open class PlaceholderCubemapArray : PlaceholderTextureLayered() {
  override fun new(scriptIndex: Int) {
    createNativeObject(488, scriptIndex)
  }

  public companion object

  public object MethodBindings
}
