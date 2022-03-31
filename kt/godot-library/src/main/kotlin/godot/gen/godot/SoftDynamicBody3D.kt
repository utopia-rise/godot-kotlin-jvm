// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.RID
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
import godot.core.VariantType._RID
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
 * **Note:** There are many known bugs in [godot.SoftDynamicBody3D]. Therefore, it's not recommended to use them for things that can affect gameplay (such as a player character made entirely out of soft bodies).
 */
@GodotBaseType
public open class SoftDynamicBody3D : MeshInstance3D() {
  /**
   * The physics layers this SoftDynamicBody3D **is in**. Collision objects can exist in one or more of 32 different layers. See also [collisionMask].
   *
   * **Note:** Object A can detect a contact with object B only if object B is in any of the layers that object A scans. See [godot.Collision layers and masks]($DOCS_URL/tutorials/physics/physics_introduction.html#collision-layers-and-masks) in the documentation for more information.
   */
  public open var collisionLayer: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SOFTDYNAMICBODY3D_GET_COLLISION_LAYER, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SOFTDYNAMICBODY3D_SET_COLLISION_LAYER, NIL)
    }

  /**
   * The physics layers this SoftDynamicBody3D **scans**. Collision objects can scan one or more of 32 different layers. See also [collisionLayer].
   *
   * **Note:** Object A can detect a contact with object B only if object B is in any of the layers that object A scans. See [godot.Collision layers and masks]($DOCS_URL/tutorials/physics/physics_introduction.html#collision-layers-and-masks) in the documentation for more information.
   */
  public open var collisionMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SOFTDYNAMICBODY3D_GET_COLLISION_MASK, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SOFTDYNAMICBODY3D_SET_COLLISION_MASK, NIL)
    }

  /**
   * [godot.core.NodePath] to a [godot.CollisionObject3D] this SoftDynamicBody3D should avoid clipping.
   */
  public open var parentCollisionIgnore: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SOFTDYNAMICBODY3D_GET_PARENT_COLLISION_IGNORE, NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SOFTDYNAMICBODY3D_SET_PARENT_COLLISION_IGNORE, NIL)
    }

  /**
   * Increasing this value will improve the resulting simulation, but can affect performance. Use with care.
   */
  public open var simulationPrecision: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SOFTDYNAMICBODY3D_GET_SIMULATION_PRECISION, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SOFTDYNAMICBODY3D_SET_SIMULATION_PRECISION, NIL)
    }

  /**
   * The SoftDynamicBody3D's mass.
   */
  public open var totalMass: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SOFTDYNAMICBODY3D_GET_TOTAL_MASS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SOFTDYNAMICBODY3D_SET_TOTAL_MASS,
          NIL)
    }

  /**
   *
   */
  public open var linearStiffness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SOFTDYNAMICBODY3D_GET_LINEAR_STIFFNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SOFTDYNAMICBODY3D_SET_LINEAR_STIFFNESS, NIL)
    }

  /**
   *
   */
  public open var pressureCoefficient: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SOFTDYNAMICBODY3D_GET_PRESSURE_COEFFICIENT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SOFTDYNAMICBODY3D_SET_PRESSURE_COEFFICIENT, NIL)
    }

  /**
   *
   */
  public open var dampingCoefficient: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SOFTDYNAMICBODY3D_GET_DAMPING_COEFFICIENT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SOFTDYNAMICBODY3D_SET_DAMPING_COEFFICIENT, NIL)
    }

  /**
   *
   */
  public open var dragCoefficient: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SOFTDYNAMICBODY3D_GET_DRAG_COEFFICIENT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SOFTDYNAMICBODY3D_SET_DRAG_COEFFICIENT, NIL)
    }

  /**
   * If `true`, the [godot.SoftDynamicBody3D] will respond to [godot.RayCast3D]s.
   */
  public open var rayPickable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SOFTDYNAMICBODY3D_IS_RAY_PICKABLE,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SOFTDYNAMICBODY3D_SET_RAY_PICKABLE, NIL)
    }

  /**
   * Defines the behavior in physics when [godot.Node.processMode] is set to [godot.Node.PROCESS_MODE_DISABLED]. See [enum DisableMode] for more details about the different modes.
   */
  public open var disableMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SOFTDYNAMICBODY3D_GET_DISABLE_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SOFTDYNAMICBODY3D_SET_DISABLE_MODE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SOFTDYNAMICBODY3D)
  }

  /**
   *
   */
  public open fun getPhysicsRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SOFTDYNAMICBODY3D_GET_PHYSICS_RID,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Based on `value`, enables or disables the specified layer in the [collisionMask], given a `layer_number` between 1 and 32.
   */
  public open fun setCollisionMaskValue(layerNumber: Long, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber, BOOL to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SOFTDYNAMICBODY3D_SET_COLLISION_MASK_VALUE, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [collisionMask] is enabled, given a `layer_number` between 1 and 32.
   */
  public open fun getCollisionMaskValue(layerNumber: Long): Boolean {
    TransferContext.writeArguments(LONG to layerNumber)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SOFTDYNAMICBODY3D_GET_COLLISION_MASK_VALUE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Based on `value`, enables or disables the specified layer in the [collisionLayer], given a `layer_number` between 1 and 32.
   */
  public open fun setCollisionLayerValue(layerNumber: Long, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber, BOOL to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SOFTDYNAMICBODY3D_SET_COLLISION_LAYER_VALUE, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [collisionLayer] is enabled, given a `layer_number` between 1 and 32.
   */
  public open fun getCollisionLayerValue(layerNumber: Long): Boolean {
    TransferContext.writeArguments(LONG to layerNumber)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SOFTDYNAMICBODY3D_GET_COLLISION_LAYER_VALUE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns an array of nodes that were added as collision exceptions for this body.
   */
  public open fun getCollisionExceptions(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SOFTDYNAMICBODY3D_GET_COLLISION_EXCEPTIONS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Adds a body to the list of bodies that this body can't collide with.
   */
  public open fun addCollisionExceptionWith(body: Node): Unit {
    TransferContext.writeArguments(OBJECT to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SOFTDYNAMICBODY3D_ADD_COLLISION_EXCEPTION_WITH, NIL)
  }

  /**
   * Removes a body from the list of bodies that this body can't collide with.
   */
  public open fun removeCollisionExceptionWith(body: Node): Unit {
    TransferContext.writeArguments(OBJECT to body)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SOFTDYNAMICBODY3D_REMOVE_COLLISION_EXCEPTION_WITH, NIL)
  }

  /**
   * Returns local translation of a vertex in the surface array.
   */
  public open fun getPointTransform(pointIndex: Long): Vector3 {
    TransferContext.writeArguments(LONG to pointIndex)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SOFTDYNAMICBODY3D_GET_POINT_TRANSFORM, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Sets the pinned state of a surface vertex. When set to `true`, the optional `attachment_path` can define a [godot.Node3D] the pinned vertex will be attached to.
   */
  public open fun setPointPinned(
    pointIndex: Long,
    pinned: Boolean,
    attachmentPath: NodePath = NodePath("NodePath("")")
  ): Unit {
    TransferContext.writeArguments(LONG to pointIndex, BOOL to pinned, NODE_PATH to attachmentPath)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SOFTDYNAMICBODY3D_SET_POINT_PINNED,
        NIL)
  }

  /**
   * Returns `true` if vertex is set to pinned.
   */
  public open fun isPointPinned(pointIndex: Long): Boolean {
    TransferContext.writeArguments(LONG to pointIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SOFTDYNAMICBODY3D_IS_POINT_PINNED,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public enum class DisableMode(
    id: Long
  ) {
    /**
     * When [godot.Node.processMode] is set to [godot.Node.PROCESS_MODE_DISABLED], remove from the physics simulation to stop all physics interactions with this [godot.SoftDynamicBody3D].
     *
     * Automatically re-added to the physics simulation when the [godot.Node] is processed again.
     */
    DISABLE_MODE_REMOVE(0),
    /**
     * When [godot.Node.processMode] is set to [godot.Node.PROCESS_MODE_DISABLED], do not affect the physics simulation.
     */
    DISABLE_MODE_KEEP_ACTIVE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
