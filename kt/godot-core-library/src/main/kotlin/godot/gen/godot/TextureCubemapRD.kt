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
 * This texture class allows you to use a cubemap texture created directly on the [RenderingDevice]
 * as a texture for materials, meshes, etc.
 */
@GodotBaseType
public open class TextureCubemapRD : TextureLayeredRD() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_TEXTURECUBEMAPRD, scriptIndex)
  }

  public companion object

  internal object MethodBindings
}
