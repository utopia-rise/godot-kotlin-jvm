// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.NIL
import kotlin.Any
import kotlin.Suppress
import kotlin.Unit

/**
 * Convex polygon shape for 3D physics.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/675](https://godotengine.org/asset-library/asset/675)
 *
 * Convex polygon shape resource, which can be added to a [godot.PhysicsBody3D] or area.
 */
@GodotBaseType
public open class ConvexPolygonShape3D : Shape3D() {
  /**
   * The list of 3D points forming the convex polygon shape.
   */
  public open var points: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONVEXPOLYGONSHAPE3D_GET_POINTS,
          ARRAY)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONVEXPOLYGONSHAPE3D_SET_POINTS,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_CONVEXPOLYGONSHAPE3D)
  }

  public companion object
}
