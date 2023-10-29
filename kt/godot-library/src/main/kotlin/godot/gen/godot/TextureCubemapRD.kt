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
 * Texture for Cubemap that is bound to a texture created on the [godot.RenderingDevice].
 *
 * This texture class allows you to use a cubemap texture created directly on the [godot.RenderingDevice] as a texture for materials, meshes, etc.
 */
@GodotBaseType
public open class TextureCubemapRD : TextureLayeredRD() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TEXTURECUBEMAPRD, scriptIndex)
    return true
  }

  public companion object
}
