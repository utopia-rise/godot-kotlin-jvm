// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A soft mesh physics body.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/physics/soft_body.html]($DOCS_URL/tutorials/physics/soft_body.html)
 *
 * A deformable physics body. Used to create elastic or deformable objects such as cloth, rubber, or other flexible materials.
 *
 * **Note:** There are many known bugs in [godot.SoftBody]. Therefore, it's not recommended to use them for things that can affect gameplay (such as a player character made entirely out of soft bodies).
 */
@GodotBaseType
public open class SoftBody : MeshInstance() {
  /**
   *
   */
  public open var areaAngularStiffness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SOFTBODY_GET_AREAANGULAR_STIFFNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SOFTBODY_SET_AREAANGULAR_STIFFNESS, NIL)
    }

  /**
   * The physics layers this SoftBody is in.
   *
   * Collidable objects can exist in any of 32 different layers. These layers work like a tagging system, and are not visual. A collidable can use these layers to select with which objects it can collide, using the collision_mask property.
   *
   * A contact is detected if object A is in any of the layers that object B scans, or object B is in any layer scanned by object A. See [godot.Collision layers and masks]($DOCS_URL/tutorials/physics/physics_introduction.html#collision-layers-and-masks) in the documentation for more information.
   */
  public open var collisionLayer: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SOFTBODY_GET_COLLISION_LAYER,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SOFTBODY_SET_COLLISION_LAYER, NIL)
    }

  /**
   * The physics layers this SoftBody scans for collisions. See [godot.Collision layers and masks]($DOCS_URL/tutorials/physics/physics_introduction.html#collision-layers-and-masks) in the documentation for more information.
   */
  public open var collisionMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SOFTBODY_GET_COLLISION_MASK, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SOFTBODY_SET_COLLISION_MASK, NIL)
    }

  /**
   *
   */
  public open var dampingCoefficient: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SOFTBODY_GET_DAMPING_COEFFICIENT,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SOFTBODY_SET_DAMPING_COEFFICIENT,
          NIL)
    }

  /**
   *
   */
  public open var dragCoefficient: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SOFTBODY_GET_DRAG_COEFFICIENT,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SOFTBODY_SET_DRAG_COEFFICIENT,
          NIL)
    }

  /**
   *
   */
  public open var linearStiffness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SOFTBODY_GET_LINEAR_STIFFNESS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SOFTBODY_SET_LINEAR_STIFFNESS,
          NIL)
    }

  /**
   * [godot.core.NodePath] to a [godot.CollisionObject] this SoftBody should avoid clipping.
   */
  public open var parentCollisionIgnore: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SOFTBODY_GET_PARENT_COLLISION_IGNORE, NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SOFTBODY_SET_PARENT_COLLISION_IGNORE, NIL)
    }

  /**
   * If `true`, the [godot.SoftBody] is simulated in physics. Can be set to `false` to pause the physics simulation.
   */
  public open var physicsEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SOFTBODY_GET_PHYSICS_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SOFTBODY_SET_PHYSICS_ENABLED, NIL)
    }

  /**
   *
   */
  public open var poseMatchingCoefficient: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SOFTBODY_GET_POSE_MATCHING_COEFFICIENT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SOFTBODY_SET_POSE_MATCHING_COEFFICIENT, NIL)
    }

  /**
   *
   */
  public open var pressureCoefficient: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SOFTBODY_GET_PRESSURE_COEFFICIENT,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SOFTBODY_SET_PRESSURE_COEFFICIENT,
          NIL)
    }

  /**
   * If `true`, the [godot.SoftBody] will respond to [godot.RayCast]s.
   */
  public open var rayPickable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SOFTBODY_GET_RAY_PICKABLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SOFTBODY_SET_RAY_PICKABLE, NIL)
    }

  /**
   * Increasing this value will improve the resulting simulation, but can affect performance. Use with care.
   */
  public open var simulationPrecision: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SOFTBODY_GET_SIMULATION_PRECISION,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SOFTBODY_SET_SIMULATION_PRECISION,
          NIL)
    }

  /**
   * The SoftBody's mass.
   */
  public open var totalMass: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SOFTBODY_GET_TOTAL_MASS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SOFTBODY_SET_TOTAL_MASS, NIL)
    }

  /**
   *
   */
  public open var volumeStiffness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SOFTBODY_GET_VOLUME_STIFFNESS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SOFTBODY_SET_VOLUME_STIFFNESS,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SOFTBODY)
  }

  public open fun _drawSoftMesh(): Unit {
  }

  /**
   * Adds a body to the list of bodies that this body can't collide with.
   */
  public open fun addCollisionExceptionWith(body: Node): Unit {
    TransferContext.writeArguments(OBJECT to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SOFTBODY_ADD_COLLISION_EXCEPTION_WITH, NIL)
  }

  /**
   * Returns an array of nodes that were added as collision exceptions for this body.
   */
  public open fun getCollisionExceptions(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SOFTBODY_GET_COLLISION_EXCEPTIONS,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns an individual bit on the collision mask.
   */
  public open fun getCollisionLayerBit(bit: Long): Boolean {
    TransferContext.writeArguments(LONG to bit)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SOFTBODY_GET_COLLISION_LAYER_BIT,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns an individual bit on the collision mask.
   */
  public open fun getCollisionMaskBit(bit: Long): Boolean {
    TransferContext.writeArguments(LONG to bit)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SOFTBODY_GET_COLLISION_MASK_BIT,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns local translation of a vertex in the surface array.
   */
  public open fun getPointTransform(pointIndex: Long): Vector3 {
    TransferContext.writeArguments(LONG to pointIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SOFTBODY_GET_POINT_TRANSFORM,
        VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns `true` if vertex is set to pinned.
   */
  public open fun isPointPinned(pointIndex: Long): Boolean {
    TransferContext.writeArguments(LONG to pointIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SOFTBODY_IS_POINT_PINNED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Removes a body from the list of bodies that this body can't collide with.
   */
  public open fun removeCollisionExceptionWith(body: Node): Unit {
    TransferContext.writeArguments(OBJECT to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SOFTBODY_REMOVE_COLLISION_EXCEPTION_WITH, NIL)
  }

  /**
   * Sets individual bits on the layer mask. Use this if you only need to change one layer's value.
   */
  public open fun setCollisionLayerBit(bit: Long, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to bit, BOOL to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SOFTBODY_SET_COLLISION_LAYER_BIT,
        NIL)
  }

  /**
   * Sets individual bits on the collision mask. Use this if you only need to change one layer's value.
   */
  public open fun setCollisionMaskBit(bit: Long, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to bit, BOOL to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SOFTBODY_SET_COLLISION_MASK_BIT,
        NIL)
  }

  /**
   * Sets the pinned state of a surface vertex. When set to `true`, the optional `attachment_path` can define a [godot.Spatial] the pinned vertex will be attached to.
   */
  public open fun setPointPinned(
    pointIndex: Long,
    pinned: Boolean,
    attachmentPath: NodePath = NodePath()
  ): Unit {
    TransferContext.writeArguments(LONG to pointIndex, BOOL to pinned, NODE_PATH to attachmentPath)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SOFTBODY_SET_POINT_PINNED, NIL)
  }
}
