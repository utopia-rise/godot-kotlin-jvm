// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedVector3Array
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_VECTOR3_ARRAY
import kotlin.Boolean
import kotlin.Suppress
import kotlin.Unit

/**
 * Concave polygon shape.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/675](https://godotengine.org/asset-library/asset/675)
 *
 * Concave polygon shape resource, which can be set into a [godot.PhysicsBody3D] or area. This shape is created by feeding a list of triangles.
 *
 * **Note:** When used for collision, [godot.ConcavePolygonShape3D] is intended to work with static [godot.PhysicsBody3D] nodes like [godot.StaticBody3D] and will not work with [godot.CharacterBody3D] or [godot.RigidDynamicBody3D] with a mode other than Static.
 */
@GodotBaseType
public open class ConcavePolygonShape3D : Shape3D() {
  public open var `data`: PackedVector3Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONCAVEPOLYGONSHAPE3D_GET_DATA,
          PACKED_VECTOR3_ARRAY)
      return TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_VECTOR3_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONCAVEPOLYGONSHAPE3D_SET_DATA,
          NIL)
    }

  /**
   * If set to `true`, collisions occur on both sides of the concave shape faces. Otherwise they occur only along the face normals.
   */
  public open var backfaceCollision: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CONCAVEPOLYGONSHAPE3D_GET_BACKFACE_COLLISION, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CONCAVEPOLYGONSHAPE3D_SET_BACKFACE_COLLISION, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_CONCAVEPOLYGONSHAPE3D)
  }

  public companion object
}
