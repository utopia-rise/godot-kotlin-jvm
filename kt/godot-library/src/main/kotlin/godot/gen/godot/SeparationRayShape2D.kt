// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress

/**
 * A 2D ray shape used for physics collision that tries to separate itself from any collider.
 *
 * A 2D ray shape, intended for use in physics. Usually used to provide a shape for a [godot.CollisionShape2D]. When a [godot.SeparationRayShape2D] collides with an object, it tries to separate itself from it by moving its endpoint to the collision point. It can for example be used for spears falling from the sky.
 */
@GodotBaseType
public open class SeparationRayShape2D : Shape2D() {
  /**
   * The ray's length.
   */
  public var length: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SEPARATIONRAYSHAPE2D_GET_LENGTH,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SEPARATIONRAYSHAPE2D_SET_LENGTH,
          NIL)
    }

  /**
   * If `false` (default), the shape always separates and returns a normal along its own direction.
   *
   * If `true`, the shape can return the correct normal and separate in any direction, allowing sliding motion on slopes.
   */
  public var slideOnSlope: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SEPARATIONRAYSHAPE2D_GET_SLIDE_ON_SLOPE, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SEPARATIONRAYSHAPE2D_SET_SLIDE_ON_SLOPE, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SEPARATIONRAYSHAPE2D, scriptIndex)
    return true
  }

  public companion object
}
