// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * An infinite plane collision that interacts with [SpringBoneSimulator3D]. It is an infinite size
 * XZ plane, and the +Y direction is treated as normal.
 */
@GodotBaseType
public open class SpringBoneCollisionPlane3D : SpringBoneCollision3D() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(640, scriptIndex)
  }

  public companion object

  public object MethodBindings
}
