// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.GodotEnum
import godot.core.NodePath
import godot.core.RID
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.NODE_PATH
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.VECTOR3
import godot.core.VariantParser._RID
import godot.core.Vector3
import godot.core.asCachedNodePath
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

/**
 * A deformable 3D physics mesh. Used to create elastic or deformable objects such as cloth, rubber,
 * or other flexible materials.
 *
 * Additionally, [SoftBody3D] is subject to wind forces defined in [Area3D] (see
 * [Area3D.windSourcePath], [Area3D.windForceMagnitude], and [Area3D.windAttenuationFactor]).
 *
 * **Note:** It's recommended to use Jolt Physics when using [SoftBody3D] instead of the default
 * GodotPhysics3D, as Jolt Physics' soft body implementation is faster and more reliable. You can
 * switch the physics engine using the [ProjectSettings.physics/3d/physicsEngine] project setting.
 */
@GodotBaseType
public open class SoftBody3D : MeshInstance3D() {
  /**
   * The physics layers this SoftBody3D **is in**. Collision objects can exist in one or more of 32
   * different layers. See also [collisionMask].
   *
   * **Note:** Object A can detect a contact with object B only if object B is in any of the layers
   * that object A scans. See
   * [url=$DOCS_URL/tutorials/physics/physics_introduction.html#collision-layers-and-masks]Collision
   * layers and masks[/url] in the documentation for more information.
   */
  public final inline var collisionLayer: Long
    @JvmName("collisionLayerProperty")
    get() = getCollisionLayer()
    @JvmName("collisionLayerProperty")
    set(`value`) {
      setCollisionLayer(value)
    }

  /**
   * The physics layers this SoftBody3D **scans**. Collision objects can scan one or more of 32
   * different layers. See also [collisionLayer].
   *
   * **Note:** Object A can detect a contact with object B only if object B is in any of the layers
   * that object A scans. See
   * [url=$DOCS_URL/tutorials/physics/physics_introduction.html#collision-layers-and-masks]Collision
   * layers and masks[/url] in the documentation for more information.
   */
  public final inline var collisionMask: Long
    @JvmName("collisionMaskProperty")
    get() = getCollisionMask()
    @JvmName("collisionMaskProperty")
    set(`value`) {
      setCollisionMask(value)
    }

  /**
   * [NodePath] to a [CollisionObject3D] this SoftBody3D should avoid clipping.
   */
  public final inline var parentCollisionIgnore: NodePath
    @JvmName("parentCollisionIgnoreProperty")
    get() = getParentCollisionIgnore()
    @JvmName("parentCollisionIgnoreProperty")
    set(`value`) {
      setParentCollisionIgnore(value)
    }

  /**
   * Increasing this value will improve the resulting simulation, but can affect performance. Use
   * with care.
   */
  public final inline var simulationPrecision: Int
    @JvmName("simulationPrecisionProperty")
    get() = getSimulationPrecision()
    @JvmName("simulationPrecisionProperty")
    set(`value`) {
      setSimulationPrecision(value)
    }

  /**
   * The SoftBody3D's mass.
   */
  public final inline var totalMass: Float
    @JvmName("totalMassProperty")
    get() = getTotalMass()
    @JvmName("totalMassProperty")
    set(`value`) {
      setTotalMass(value)
    }

  /**
   * Higher values will result in a stiffer body, while lower values will increase the body's
   * ability to bend. The value can be between `0.0` and `1.0` (inclusive).
   */
  public final inline var linearStiffness: Float
    @JvmName("linearStiffnessProperty")
    get() = getLinearStiffness()
    @JvmName("linearStiffnessProperty")
    set(`value`) {
      setLinearStiffness(value)
    }

  /**
   * Scales the rest lengths of [SoftBody3D]'s edge constraints. Positive values shrink the mesh,
   * while negative values expand it. For example, a value of `0.1` shortens the edges of the mesh by
   * 10&#37;, while `-0.1` expands the edges by 10&#37;.
   *
   * **Note:** [shrinkingFactor] is best used on surface meshes with pinned points.
   */
  public final inline var shrinkingFactor: Float
    @JvmName("shrinkingFactorProperty")
    get() = getShrinkingFactor()
    @JvmName("shrinkingFactorProperty")
    set(`value`) {
      setShrinkingFactor(value)
    }

  /**
   * The pressure coefficient of this soft body. Simulate pressure build-up from inside this body.
   * Higher values increase the strength of this effect.
   */
  public final inline var pressureCoefficient: Float
    @JvmName("pressureCoefficientProperty")
    get() = getPressureCoefficient()
    @JvmName("pressureCoefficientProperty")
    set(`value`) {
      setPressureCoefficient(value)
    }

  /**
   * The body's damping coefficient. Higher values will slow down the body more noticeably when
   * forces are applied.
   */
  public final inline var dampingCoefficient: Float
    @JvmName("dampingCoefficientProperty")
    get() = getDampingCoefficient()
    @JvmName("dampingCoefficientProperty")
    set(`value`) {
      setDampingCoefficient(value)
    }

  /**
   * The body's drag coefficient. Higher values increase this body's air resistance.
   *
   * **Note:** This value is currently unused by Godot's default physics implementation.
   */
  public final inline var dragCoefficient: Float
    @JvmName("dragCoefficientProperty")
    get() = getDragCoefficient()
    @JvmName("dragCoefficientProperty")
    set(`value`) {
      setDragCoefficient(value)
    }

  /**
   * If `true`, the [SoftBody3D] will respond to [RayCast3D]s.
   */
  public final inline var rayPickable: Boolean
    @JvmName("rayPickableProperty")
    get() = isRayPickable()
    @JvmName("rayPickableProperty")
    set(`value`) {
      setRayPickable(value)
    }

  /**
   * Defines the behavior in physics when [Node.processMode] is set to [Node.PROCESS_MODE_DISABLED].
   */
  public final inline var disableMode: DisableMode
    @JvmName("disableModeProperty")
    get() = getDisableMode()
    @JvmName("disableModeProperty")
    set(`value`) {
      setDisableMode(value)
    }

  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(630, scriptPtr)
  }

  /**
   * Returns the internal [RID] used by the [PhysicsServer3D] for this body.
   */
  public final fun getPhysicsRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPhysicsRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  public final fun setCollisionMask(collisionMask: Long): Unit {
    TransferContext.writeArguments(LONG to collisionMask)
    TransferContext.callMethod(ptr, MethodBindings.setCollisionMaskPtr, NIL)
  }

  public final fun getCollisionMask(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCollisionMaskPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setCollisionLayer(collisionLayer: Long): Unit {
    TransferContext.writeArguments(LONG to collisionLayer)
    TransferContext.callMethod(ptr, MethodBindings.setCollisionLayerPtr, NIL)
  }

  public final fun getCollisionLayer(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCollisionLayerPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [collisionMask], given a
   * [layerNumber] between 1 and 32.
   */
  public final fun setCollisionMaskValue(layerNumber: Int, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(ptr, MethodBindings.setCollisionMaskValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [collisionMask] is enabled, given a
   * [layerNumber] between 1 and 32.
   */
  public final fun getCollisionMaskValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getCollisionMaskValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [collisionLayer], given a
   * [layerNumber] between 1 and 32.
   */
  public final fun setCollisionLayerValue(layerNumber: Int, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(ptr, MethodBindings.setCollisionLayerValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [collisionLayer] is enabled, given a
   * [layerNumber] between 1 and 32.
   */
  public final fun getCollisionLayerValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getCollisionLayerValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setParentCollisionIgnore(parentCollisionIgnore: NodePath): Unit {
    TransferContext.writeArguments(NODE_PATH to parentCollisionIgnore)
    TransferContext.callMethod(ptr, MethodBindings.setParentCollisionIgnorePtr, NIL)
  }

  public final fun getParentCollisionIgnore(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getParentCollisionIgnorePtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH) as NodePath)
  }

  public final fun setDisableMode(mode: DisableMode): Unit {
    TransferContext.writeArguments(LONG to mode.value)
    TransferContext.callMethod(ptr, MethodBindings.setDisableModePtr, NIL)
  }

  public final fun getDisableMode(): DisableMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDisableModePtr, LONG)
    return DisableMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns an array of nodes that were added as collision exceptions for this body.
   */
  public final fun getCollisionExceptions(): VariantArray<PhysicsBody3D> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCollisionExceptionsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<PhysicsBody3D>)
  }

  /**
   * Adds a body to the list of bodies that this body can't collide with.
   */
  public final fun addCollisionExceptionWith(body: Node?): Unit {
    TransferContext.writeArguments(OBJECT to body)
    TransferContext.callMethod(ptr, MethodBindings.addCollisionExceptionWithPtr, NIL)
  }

  /**
   * Removes a body from the list of bodies that this body can't collide with.
   */
  public final fun removeCollisionExceptionWith(body: Node?): Unit {
    TransferContext.writeArguments(OBJECT to body)
    TransferContext.callMethod(ptr, MethodBindings.removeCollisionExceptionWithPtr, NIL)
  }

  public final fun setSimulationPrecision(simulationPrecision: Int): Unit {
    TransferContext.writeArguments(LONG to simulationPrecision.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setSimulationPrecisionPtr, NIL)
  }

  public final fun getSimulationPrecision(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSimulationPrecisionPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setTotalMass(mass: Float): Unit {
    TransferContext.writeArguments(DOUBLE to mass.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setTotalMassPtr, NIL)
  }

  public final fun getTotalMass(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTotalMassPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setLinearStiffness(linearStiffness: Float): Unit {
    TransferContext.writeArguments(DOUBLE to linearStiffness.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setLinearStiffnessPtr, NIL)
  }

  public final fun getLinearStiffness(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLinearStiffnessPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setShrinkingFactor(shrinkingFactor: Float): Unit {
    TransferContext.writeArguments(DOUBLE to shrinkingFactor.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setShrinkingFactorPtr, NIL)
  }

  public final fun getShrinkingFactor(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getShrinkingFactorPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setPressureCoefficient(pressureCoefficient: Float): Unit {
    TransferContext.writeArguments(DOUBLE to pressureCoefficient.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setPressureCoefficientPtr, NIL)
  }

  public final fun getPressureCoefficient(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPressureCoefficientPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDampingCoefficient(dampingCoefficient: Float): Unit {
    TransferContext.writeArguments(DOUBLE to dampingCoefficient.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setDampingCoefficientPtr, NIL)
  }

  public final fun getDampingCoefficient(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDampingCoefficientPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDragCoefficient(dragCoefficient: Float): Unit {
    TransferContext.writeArguments(DOUBLE to dragCoefficient.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setDragCoefficientPtr, NIL)
  }

  public final fun getDragCoefficient(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDragCoefficientPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns local translation of a vertex in the surface array.
   */
  public final fun getPointTransform(pointIndex: Int): Vector3 {
    TransferContext.writeArguments(LONG to pointIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getPointTransformPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Applies an impulse to a point.
   *
   * An impulse is time-independent! Applying an impulse every frame would result in a
   * framerate-dependent force. For this reason, it should only be used when simulating one-time
   * impacts (use the "_force" functions otherwise).
   */
  public final fun applyImpulse(pointIndex: Int, impulse: Vector3): Unit {
    TransferContext.writeArguments(LONG to pointIndex.toLong(), VECTOR3 to impulse)
    TransferContext.callMethod(ptr, MethodBindings.applyImpulsePtr, NIL)
  }

  /**
   * Applies a force to a point. A force is time dependent and meant to be applied every physics
   * update.
   */
  public final fun applyForce(pointIndex: Int, force: Vector3): Unit {
    TransferContext.writeArguments(LONG to pointIndex.toLong(), VECTOR3 to force)
    TransferContext.callMethod(ptr, MethodBindings.applyForcePtr, NIL)
  }

  /**
   * Distributes and applies an impulse to all points.
   *
   * An impulse is time-independent! Applying an impulse every frame would result in a
   * framerate-dependent force. For this reason, it should only be used when simulating one-time
   * impacts (use the "_force" functions otherwise).
   */
  public final fun applyCentralImpulse(impulse: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to impulse)
    TransferContext.callMethod(ptr, MethodBindings.applyCentralImpulsePtr, NIL)
  }

  /**
   * Distributes and applies a force to all points. A force is time dependent and meant to be
   * applied every physics update.
   */
  public final fun applyCentralForce(force: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to force)
    TransferContext.callMethod(ptr, MethodBindings.applyCentralForcePtr, NIL)
  }

  /**
   * Sets the pinned state of a surface vertex. When set to `true`, the optional [attachmentPath]
   * can define a [Node3D] the pinned vertex will be attached to.
   */
  @JvmOverloads
  public final fun setPointPinned(
    pointIndex: Int,
    pinned: Boolean,
    attachmentPath: NodePath = NodePath(""),
    insertAt: Int = -1,
  ): Unit {
    TransferContext.writeArguments(LONG to pointIndex.toLong(), BOOL to pinned, NODE_PATH to attachmentPath, LONG to insertAt.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setPointPinnedPtr, NIL)
  }

  /**
   * Returns `true` if vertex is set to pinned.
   */
  public final fun isPointPinned(pointIndex: Int): Boolean {
    TransferContext.writeArguments(LONG to pointIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isPointPinnedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setRayPickable(rayPickable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to rayPickable)
    TransferContext.callMethod(ptr, MethodBindings.setRayPickablePtr, NIL)
  }

  public final fun isRayPickable(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isRayPickablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setParentCollisionIgnore(parentCollisionIgnore: String) =
      setParentCollisionIgnore(parentCollisionIgnore.asCachedNodePath())

  /**
   * Sets the pinned state of a surface vertex. When set to `true`, the optional [attachmentPath]
   * can define a [Node3D] the pinned vertex will be attached to.
   */
  @JvmOverloads
  public final fun setPointPinned(
    pointIndex: Int,
    pinned: Boolean,
    attachmentPath: String,
    insertAt: Int = -1,
  ) = setPointPinned(pointIndex, pinned, attachmentPath.asCachedNodePath(), insertAt)

  public enum class DisableMode(
    `value`: Long,
  ) : GodotEnum {
    /**
     * When [Node.processMode] is set to [Node.PROCESS_MODE_DISABLED], remove from the physics
     * simulation to stop all physics interactions with this [SoftBody3D].
     *
     * Automatically re-added to the physics simulation when the [Node] is processed again.
     */
    REMOVE(0),
    /**
     * When [Node.processMode] is set to [Node.PROCESS_MODE_DISABLED], do not affect the physics
     * simulation.
     */
    KEEP_ACTIVE(1),
    ;

    public override val `value`: Long
    init {
      this.`value` = `value`
    }

    public companion object {
      public fun from(`value`: Long): DisableMode = entries.single { it.`value` == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val getPhysicsRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "get_physics_rid", 2944877500)

    internal val setCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "set_collision_mask", 1286410249)

    internal val getCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "get_collision_mask", 3905245786)

    internal val setCollisionLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "set_collision_layer", 1286410249)

    internal val getCollisionLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "get_collision_layer", 3905245786)

    internal val setCollisionMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "set_collision_mask_value", 300928843)

    internal val getCollisionMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "get_collision_mask_value", 1116898809)

    internal val setCollisionLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "set_collision_layer_value", 300928843)

    internal val getCollisionLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "get_collision_layer_value", 1116898809)

    internal val setParentCollisionIgnorePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "set_parent_collision_ignore", 1348162250)

    internal val getParentCollisionIgnorePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "get_parent_collision_ignore", 4075236667)

    internal val setDisableModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "set_disable_mode", 1104158384)

    internal val getDisableModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "get_disable_mode", 4135042476)

    internal val getCollisionExceptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "get_collision_exceptions", 2915620761)

    internal val addCollisionExceptionWithPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "add_collision_exception_with", 1078189570)

    internal val removeCollisionExceptionWithPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "remove_collision_exception_with", 1078189570)

    internal val setSimulationPrecisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "set_simulation_precision", 1286410249)

    internal val getSimulationPrecisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "get_simulation_precision", 2455072627)

    internal val setTotalMassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "set_total_mass", 373806689)

    internal val getTotalMassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "get_total_mass", 191475506)

    internal val setLinearStiffnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "set_linear_stiffness", 373806689)

    internal val getLinearStiffnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "get_linear_stiffness", 191475506)

    internal val setShrinkingFactorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "set_shrinking_factor", 373806689)

    internal val getShrinkingFactorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "get_shrinking_factor", 191475506)

    internal val setPressureCoefficientPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "set_pressure_coefficient", 373806689)

    internal val getPressureCoefficientPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "get_pressure_coefficient", 191475506)

    internal val setDampingCoefficientPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "set_damping_coefficient", 373806689)

    internal val getDampingCoefficientPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "get_damping_coefficient", 191475506)

    internal val setDragCoefficientPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "set_drag_coefficient", 373806689)

    internal val getDragCoefficientPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "get_drag_coefficient", 191475506)

    internal val getPointTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "get_point_transform", 871989493)

    internal val applyImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "apply_impulse", 1530502735)

    internal val applyForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "apply_force", 1530502735)

    internal val applyCentralImpulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "apply_central_impulse", 3460891852)

    internal val applyCentralForcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "apply_central_force", 3460891852)

    internal val setPointPinnedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "set_point_pinned", 528784402)

    internal val isPointPinnedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "is_point_pinned", 1116898809)

    internal val setRayPickablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "set_ray_pickable", 2586408642)

    internal val isRayPickablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SoftBody3D", "is_ray_pickable", 36873697)
  }
}
