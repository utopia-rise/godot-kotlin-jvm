// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress

/**
 * A 3D capsule shape used for physics collision.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/675](https://godotengine.org/asset-library/asset/675)
 *
 * A 3D capsule shape, intended for use in physics. Usually used to provide a shape for a [godot.CollisionShape3D].
 *
 * **Performance:** [godot.CapsuleShape3D] is fast to check collisions against. It is faster than [godot.CylinderShape3D], but slower than [godot.SphereShape3D] and [godot.BoxShape3D].
 */
@GodotBaseType
public open class CapsuleShape3D : Shape3D() {
  /**
   * The capsule's radius.
   */
  public var radius: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAPSULESHAPE3D_GET_RADIUS, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAPSULESHAPE3D_SET_RADIUS, NIL)
    }

  /**
   * The capsule's height.
   */
  public var height: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAPSULESHAPE3D_GET_HEIGHT, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAPSULESHAPE3D_SET_HEIGHT, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CAPSULESHAPE3D, scriptIndex)
    return true
  }

  public companion object
}
