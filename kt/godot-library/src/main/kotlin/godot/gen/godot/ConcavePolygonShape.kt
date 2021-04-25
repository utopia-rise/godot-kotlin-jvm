// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.PoolVector3Array
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.POOL_VECTOR3_ARRAY
import kotlin.Suppress

/**
 * Concave polygon shape.
 *
 * Concave polygon shape resource, which can be set into a [godot.PhysicsBody] or area. This shape is created by feeding a list of triangles.
 *
 * Note: when used for collision, [godot.ConcavePolygonShape] is intended to work with static [godot.PhysicsBody] nodes like [godot.StaticBody] and will not work with [godot.KinematicBody] or [godot.RigidBody] with a mode other than Static.
 */
@GodotBaseType
open class ConcavePolygonShape : Shape() {
  open var data: PoolVector3Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONCAVEPOLYGONSHAPE_GET_DATA,
          POOL_VECTOR3_ARRAY)
      return TransferContext.readReturnValue(POOL_VECTOR3_ARRAY, false) as PoolVector3Array
    }
    set(value) {
      TransferContext.writeArguments(POOL_VECTOR3_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONCAVEPOLYGONSHAPE_SET_DATA, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_CONCAVEPOLYGONSHAPE)
  }
}
