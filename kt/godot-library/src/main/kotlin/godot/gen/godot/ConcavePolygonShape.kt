// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PoolVector3Array
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.POOL_VECTOR3_ARRAY
import kotlin.Suppress
import kotlin.Unit

/**
 * Concave polygon shape.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/675](https://godotengine.org/asset-library/asset/675)
 *
 * Concave polygon shape resource, which can be set into a [godot.PhysicsBody] or area. This shape is created by feeding a list of triangles.
 *
 * **Note:** When used for collision, [godot.ConcavePolygonShape] is intended to work with static [godot.PhysicsBody] nodes like [godot.StaticBody] and will not work with [godot.KinematicBody] or [godot.RigidBody] with a mode other than Static.
 *
 * **Warning:** Using this shape for an [godot.Area] (via a [godot.CollisionShape] node, created e.g. by using the *Create Trimesh Collision Sibling* option in the *Mesh* menu that appears when selecting a [godot.MeshInstance] node) may give unexpected results: when using Godot Physics, the area will only detect collisions with the triangle faces in the [godot.ConcavePolygonShape] (and not with any "inside" of the shape, for example), and when using Bullet Physics the area will not detect any collisions with the concave shape at all (this is a known bug).
 */
@GodotBaseType
public open class ConcavePolygonShape : Shape() {
  public open var `data`: PoolVector3Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONCAVEPOLYGONSHAPE_GET_DATA,
          POOL_VECTOR3_ARRAY)
      return TransferContext.readReturnValue(POOL_VECTOR3_ARRAY, false) as PoolVector3Array
    }
    set(`value`) {
      TransferContext.writeArguments(POOL_VECTOR3_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONCAVEPOLYGONSHAPE_SET_DATA, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_CONCAVEPOLYGONSHAPE)
  }
}
