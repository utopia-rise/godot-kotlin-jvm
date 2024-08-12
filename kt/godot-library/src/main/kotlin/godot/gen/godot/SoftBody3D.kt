// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.RID
import godot.core.TypeManager
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
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * A deformable 3D physics mesh. Used to create elastic or deformable objects such as cloth, rubber,
 * or other flexible materials.
 * Additionally, [SoftBody3D] is subject to wind forces defined in [Area3D] (see
 * [Area3D.windSourcePath], [Area3D.windForceMagnitude], and [Area3D.windAttenuationFactor]).
 * **Note:** There are many known bugs in [SoftBody3D]. Therefore, it's not recommended to use them
 * for things that can affect gameplay (such as trampolines).
 */
@GodotBaseType
public open class SoftBody3D : MeshInstance3D() {
  /**
   * The physics layers this SoftBody3D **is in**. Collision objects can exist in one or more of 32
   * different layers. See also [collisionMask].
   * **Note:** Object A can detect a contact with object B only if object B is in any of the layers
   * that object A scans. See
   * [url=$DOCS_URL/tutorials/physics/physics_introduction.html#collision-layers-and-masks]Collision
   * layers and masks[/url] in the documentation for more information.
   */
  public var collisionLayer: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCollisionLayerPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCollisionLayerPtr, NIL)
    }

  /**
   * The physics layers this SoftBody3D **scans**. Collision objects can scan one or more of 32
   * different layers. See also [collisionLayer].
   * **Note:** Object A can detect a contact with object B only if object B is in any of the layers
   * that object A scans. See
   * [url=$DOCS_URL/tutorials/physics/physics_introduction.html#collision-layers-and-masks]Collision
   * layers and masks[/url] in the documentation for more information.
   */
  public var collisionMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCollisionMaskPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCollisionMaskPtr, NIL)
    }

  /**
   * [NodePath] to a [CollisionObject3D] this SoftBody3D should avoid clipping.
   */
  public var parentCollisionIgnore: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getParentCollisionIgnorePtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setParentCollisionIgnorePtr, NIL)
    }

  /**
   * Increasing this value will improve the resulting simulation, but can affect performance. Use
   * with care.
   */
  public var simulationPrecision: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSimulationPrecisionPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setSimulationPrecisionPtr, NIL)
    }

  /**
   * The SoftBody3D's mass.
   */
  public var totalMass: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTotalMassPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTotalMassPtr, NIL)
    }

  /**
   * Higher values will result in a stiffer body, while lower values will increase the body's
   * ability to bend. The value can be between `0.0` and `1.0` (inclusive).
   */
  public var linearStiffness: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLinearStiffnessPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setLinearStiffnessPtr, NIL)
    }

  /**
   * The pressure coefficient of this soft body. Simulate pressure build-up from inside this body.
   * Higher values increase the strength of this effect.
   */
  public var pressureCoefficient: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPressureCoefficientPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setPressureCoefficientPtr, NIL)
    }

  /**
   * The body's damping coefficient. Higher values will slow down the body more noticeably when
   * forces are applied.
   */
  public var dampingCoefficient: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDampingCoefficientPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDampingCoefficientPtr, NIL)
    }

  /**
   * The body's drag coefficient. Higher values increase this body's air resistance.
   * **Note:** This value is currently unused by Godot's default physics implementation.
   */
  public var dragCoefficient: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDragCoefficientPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDragCoefficientPtr, NIL)
    }

  /**
   * If `true`, the [SoftBody3D] will respond to [RayCast3D]s.
   */
  public var rayPickable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isRayPickablePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRayPickablePtr, NIL)
    }

  /**
   * Defines the behavior in physics when [Node.processMode] is set to [Node.PROCESS_MODE_DISABLED].
   * See [DisableMode] for more details about the different modes.
   */
  public var disableMode: DisableMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDisableModePtr, LONG)
      return SoftBody3D.DisableMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setDisableModePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SOFTBODY3D, scriptIndex)
    return true
  }

  /**
   * Returns the internal [RID] used by the [PhysicsServer3D] for this body.
   */
  public fun getPhysicsRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPhysicsRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [collisionMask], given a
   * [layerNumber] between 1 and 32.
   */
  public fun setCollisionMaskValue(layerNumber: Int, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setCollisionMaskValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [collisionMask] is enabled, given a
   * [layerNumber] between 1 and 32.
   */
  public fun getCollisionMaskValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCollisionMaskValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [collisionLayer], given a
   * [layerNumber] between 1 and 32.
   */
  public fun setCollisionLayerValue(layerNumber: Int, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setCollisionLayerValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [collisionLayer] is enabled, given a
   * [layerNumber] between 1 and 32.
   */
  public fun getCollisionLayerValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCollisionLayerValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns an array of nodes that were added as collision exceptions for this body.
   */
  public fun getCollisionExceptions(): VariantArray<PhysicsBody3D> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCollisionExceptionsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<PhysicsBody3D>)
  }

  /**
   * Adds a body to the list of bodies that this body can't collide with.
   */
  public fun addCollisionExceptionWith(body: Node): Unit {
    TransferContext.writeArguments(OBJECT to body)
    TransferContext.callMethod(rawPtr, MethodBindings.addCollisionExceptionWithPtr, NIL)
  }

  /**
   * Removes a body from the list of bodies that this body can't collide with.
   */
  public fun removeCollisionExceptionWith(body: Node): Unit {
    TransferContext.writeArguments(OBJECT to body)
    TransferContext.callMethod(rawPtr, MethodBindings.removeCollisionExceptionWithPtr, NIL)
  }

  /**
   * Returns local translation of a vertex in the surface array.
   */
  public fun getPointTransform(pointIndex: Int): Vector3 {
    TransferContext.writeArguments(LONG to pointIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPointTransformPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Sets the pinned state of a surface vertex. When set to `true`, the optional [attachmentPath]
   * can define a [Node3D] the pinned vertex will be attached to.
   */
  @JvmOverloads
  public fun setPointPinned(
    pointIndex: Int,
    pinned: Boolean,
    attachmentPath: NodePath = NodePath(""),
  ): Unit {
    TransferContext.writeArguments(LONG to pointIndex.toLong(), BOOL to pinned, NODE_PATH to attachmentPath)
    TransferContext.callMethod(rawPtr, MethodBindings.setPointPinnedPtr, NIL)
  }

  /**
   * Returns `true` if vertex is set to pinned.
   */
  public fun isPointPinned(pointIndex: Int): Boolean {
    TransferContext.writeArguments(LONG to pointIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isPointPinnedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public enum class DisableMode(
    id: Long,
  ) {
    /**
     * When [Node.processMode] is set to [Node.PROCESS_MODE_DISABLED], remove from the physics
     * simulation to stop all physics interactions with this [SoftBody3D].
     * Automatically re-added to the physics simulation when the [Node] is processed again.
     */
    DISABLE_MODE_REMOVE(0),
    /**
     * When [Node.processMode] is set to [Node.PROCESS_MODE_DISABLED], do not affect the physics
     * simulation.
     */
    DISABLE_MODE_KEEP_ACTIVE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val getPhysicsRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "get_physics_rid")

    public val setCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "set_collision_mask")

    public val getCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "get_collision_mask")

    public val setCollisionLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "set_collision_layer")

    public val getCollisionLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "get_collision_layer")

    public val setCollisionMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "set_collision_mask_value")

    public val getCollisionMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "get_collision_mask_value")

    public val setCollisionLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "set_collision_layer_value")

    public val getCollisionLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "get_collision_layer_value")

    public val setParentCollisionIgnorePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "set_parent_collision_ignore")

    public val getParentCollisionIgnorePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "get_parent_collision_ignore")

    public val setDisableModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "set_disable_mode")

    public val getDisableModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "get_disable_mode")

    public val getCollisionExceptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "get_collision_exceptions")

    public val addCollisionExceptionWithPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "add_collision_exception_with")

    public val removeCollisionExceptionWithPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "remove_collision_exception_with")

    public val setSimulationPrecisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "set_simulation_precision")

    public val getSimulationPrecisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "get_simulation_precision")

    public val setTotalMassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "set_total_mass")

    public val getTotalMassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "get_total_mass")

    public val setLinearStiffnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "set_linear_stiffness")

    public val getLinearStiffnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "get_linear_stiffness")

    public val setPressureCoefficientPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "set_pressure_coefficient")

    public val getPressureCoefficientPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "get_pressure_coefficient")

    public val setDampingCoefficientPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "set_damping_coefficient")

    public val getDampingCoefficientPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "get_damping_coefficient")

    public val setDragCoefficientPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "set_drag_coefficient")

    public val getDragCoefficientPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "get_drag_coefficient")

    public val getPointTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "get_point_transform")

    public val setPointPinnedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "set_point_pinned")

    public val isPointPinnedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "is_point_pinned")

    public val setRayPickablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "set_ray_pickable")

    public val isRayPickablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "is_ray_pickable")
  }
}
