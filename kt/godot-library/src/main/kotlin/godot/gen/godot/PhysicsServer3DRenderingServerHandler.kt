// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.AABB
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public open class PhysicsServer3DRenderingServerHandler : Object() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_PHYSICSSERVER3DRENDERINGSERVERHANDLER)
  }

  /**
   *
   */
  public open fun _setVertex(vertexId: Long, vertices: `const void*`): Unit {
  }

  /**
   *
   */
  public open fun _setNormal(vertexId: Long, normals: `const void*`): Unit {
  }

  /**
   *
   */
  public open fun _setAabb(aabb: AABB): Unit {
  }

  public companion object
}
