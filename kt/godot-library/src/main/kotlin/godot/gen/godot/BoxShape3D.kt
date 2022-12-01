// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * Box shape resource for 3D collisions.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/125](https://godotengine.org/asset-library/asset/125)
 *
 * 3D box shape to be added as a *direct* child of a [godot.PhysicsBody3D] or [godot.Area3D] using a [godot.CollisionShape3D] node.
 *
 * **Performance:** Being a primitive collision shape, [godot.BoxShape3D] is fast to check collisions against (though not as fast as [godot.SphereShape3D]).
 */
@GodotBaseType
public open class BoxShape3D : Shape3D() {
  /**
   * The box's width, height and depth.
   */
  public var size: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BOXSHAPE3D_GET_SIZE, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BOXSHAPE3D_SET_SIZE, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_BOXSHAPE3D, scriptIndex)
    return true
  }

  public companion object
}
