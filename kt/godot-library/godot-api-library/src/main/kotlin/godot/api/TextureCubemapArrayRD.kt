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
 * This texture class allows you to use a cubemap array texture created directly on the
 * [RenderingDevice] as a texture for materials, meshes, etc.
 */
@GodotBaseType
public open class TextureCubemapArrayRD : TextureLayeredRD() {
  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(689, scriptPtr)
  }

  public companion object

  public object MethodBindings
}
