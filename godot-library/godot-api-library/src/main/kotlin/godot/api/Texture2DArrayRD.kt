// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import kotlin.Suppress
import kotlin.Unit

/**
 * This texture array class allows you to use a 2D array texture created directly on the
 * [RenderingDevice] as a texture for materials, meshes, etc.
 */
@GodotBaseType
public open class Texture2DArrayRD : TextureLayeredRD() {
  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(684, scriptPtr)
  }

  public companion object

  public object MethodBindings
}
