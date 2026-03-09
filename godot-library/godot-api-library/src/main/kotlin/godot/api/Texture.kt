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
 * [Texture] is the base class for all texture types. Common texture types are [Texture2D] and
 * [ImageTexture]. See also [Image].
 */
@GodotBaseType
public open class Texture : Resource() {
  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(681, scriptPtr)
  }

  public companion object

  public object MethodBindings
}
