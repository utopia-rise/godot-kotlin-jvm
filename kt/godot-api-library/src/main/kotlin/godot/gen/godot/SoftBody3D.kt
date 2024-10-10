// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
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
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

private const val ENGINE_CLASS_SOFTBODY3D_INDEX: Int = 603

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
   * See [DisableMode] for more details about the different modes.
   */
  public final inline var disableMode: DisableMode
    @JvmName("disableModeProperty")
    get() = getDisableMode()
    @JvmName("disableModeProperty")
    set(`value`) {
      setDisableMode(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_SOFTBODY3D_INDEX, scriptIndex)
  }

  /**
   * Returns the internal [RID] used by the [PhysicsServer3D] for this body.
   */
  public final fun getPhysicsRid(): RID {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPhysicsRidPtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  public final fun setCollisionMask(collisionMask: Long): Unit {
    Internals.writeArguments(LONG to collisionMask)
    Internals.callMethod(rawPtr, MethodBindings.setCollisionMaskPtr, NIL)
  }

  public final fun getCollisionMask(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCollisionMaskPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  public final fun setCollisionLayer(collisionLayer: Long): Unit {
    Internals.writeArguments(LONG to collisionLayer)
    Internals.callMethod(rawPtr, MethodBindings.setCollisionLayerPtr, NIL)
  }

  public final fun getCollisionLayer(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCollisionLayerPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [collisionMask], given a
   * [layerNumber] between 1 and 32.
   */
  public final fun setCollisionMaskValue(layerNumber: Int, `value`: Boolean): Unit {
    Internals.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    Internals.callMethod(rawPtr, MethodBindings.setCollisionMaskValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [collisionMask] is enabled, given a
   * [layerNumber] between 1 and 32.
   */
  public final fun getCollisionMaskValue(layerNumber: Int): Boolean {
    Internals.writeArguments(LONG to layerNumber.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getCollisionMaskValuePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [collisionLayer], given a
   * [layerNumber] between 1 and 32.
   */
  public final fun setCollisionLayerValue(layerNumber: Int, `value`: Boolean): Unit {
    Internals.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    Internals.callMethod(rawPtr, MethodBindings.setCollisionLayerValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [collisionLayer] is enabled, given a
   * [layerNumber] between 1 and 32.
   */
  public final fun getCollisionLayerValue(layerNumber: Int): Boolean {
    Internals.writeArguments(LONG to layerNumber.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getCollisionLayerValuePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setParentCollisionIgnore(parentCollisionIgnore: NodePath): Unit {
    Internals.writeArguments(NODE_PATH to parentCollisionIgnore)
    Internals.callMethod(rawPtr, MethodBindings.setParentCollisionIgnorePtr, NIL)
  }

  public final fun getParentCollisionIgnore(): NodePath {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getParentCollisionIgnorePtr, NODE_PATH)
    return (Internals.readReturnValue(NODE_PATH) as NodePath)
  }

  public final fun setDisableMode(mode: DisableMode): Unit {
    Internals.writeArguments(LONG to mode.id)
    Internals.callMethod(rawPtr, MethodBindings.setDisableModePtr, NIL)
  }

  public final fun getDisableMode(): DisableMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDisableModePtr, LONG)
    return SoftBody3D.DisableMode.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Returns an array of nodes that were added as collision exceptions for this body.
   */
  public final fun getCollisionExceptions(): VariantArray<PhysicsBody3D> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCollisionExceptionsPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<PhysicsBody3D>)
  }

  /**
   * Adds a body to the list of bodies that this body can't collide with.
   */
  public final fun addCollisionExceptionWith(body: Node?): Unit {
    Internals.writeArguments(OBJECT to body)
    Internals.callMethod(rawPtr, MethodBindings.addCollisionExceptionWithPtr, NIL)
  }

  /**
   * Removes a body from the list of bodies that this body can't collide with.
   */
  public final fun removeCollisionExceptionWith(body: Node?): Unit {
    Internals.writeArguments(OBJECT to body)
    Internals.callMethod(rawPtr, MethodBindings.removeCollisionExceptionWithPtr, NIL)
  }

  public final fun setSimulationPrecision(simulationPrecision: Int): Unit {
    Internals.writeArguments(LONG to simulationPrecision.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setSimulationPrecisionPtr, NIL)
  }

  public final fun getSimulationPrecision(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSimulationPrecisionPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setTotalMass(mass: Float): Unit {
    Internals.writeArguments(DOUBLE to mass.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setTotalMassPtr, NIL)
  }

  public final fun getTotalMass(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTotalMassPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setLinearStiffness(linearStiffness: Float): Unit {
    Internals.writeArguments(DOUBLE to linearStiffness.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setLinearStiffnessPtr, NIL)
  }

  public final fun getLinearStiffness(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLinearStiffnessPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setPressureCoefficient(pressureCoefficient: Float): Unit {
    Internals.writeArguments(DOUBLE to pressureCoefficient.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setPressureCoefficientPtr, NIL)
  }

  public final fun getPressureCoefficient(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPressureCoefficientPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDampingCoefficient(dampingCoefficient: Float): Unit {
    Internals.writeArguments(DOUBLE to dampingCoefficient.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setDampingCoefficientPtr, NIL)
  }

  public final fun getDampingCoefficient(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDampingCoefficientPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDragCoefficient(dragCoefficient: Float): Unit {
    Internals.writeArguments(DOUBLE to dragCoefficient.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setDragCoefficientPtr, NIL)
  }

  public final fun getDragCoefficient(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDragCoefficientPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns local translation of a vertex in the surface array.
   */
  public final fun getPointTransform(pointIndex: Int): Vector3 {
    Internals.writeArguments(LONG to pointIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getPointTransformPtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
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
  ): Unit {
    Internals.writeArguments(LONG to pointIndex.toLong(), BOOL to pinned, NODE_PATH to attachmentPath)
    Internals.callMethod(rawPtr, MethodBindings.setPointPinnedPtr, NIL)
  }

  /**
   * Returns `true` if vertex is set to pinned.
   */
  public final fun isPointPinned(pointIndex: Int): Boolean {
    Internals.writeArguments(LONG to pointIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.isPointPinnedPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setRayPickable(rayPickable: Boolean): Unit {
    Internals.writeArguments(BOOL to rayPickable)
    Internals.callMethod(rawPtr, MethodBindings.setRayPickablePtr, NIL)
  }

  public final fun isRayPickable(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isRayPickablePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
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
      public fun from(`value`: Long): DisableMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val getPhysicsRidPtr: VoidPtr =
        Internals.getMethodBindPtr("SoftBody3D", "get_physics_rid", 2944877500)

    public val setCollisionMaskPtr: VoidPtr =
        Internals.getMethodBindPtr("SoftBody3D", "set_collision_mask", 1286410249)

    public val getCollisionMaskPtr: VoidPtr =
        Internals.getMethodBindPtr("SoftBody3D", "get_collision_mask", 3905245786)

    public val setCollisionLayerPtr: VoidPtr =
        Internals.getMethodBindPtr("SoftBody3D", "set_collision_layer", 1286410249)

    public val getCollisionLayerPtr: VoidPtr =
        Internals.getMethodBindPtr("SoftBody3D", "get_collision_layer", 3905245786)

    public val setCollisionMaskValuePtr: VoidPtr =
        Internals.getMethodBindPtr("SoftBody3D", "set_collision_mask_value", 300928843)

    public val getCollisionMaskValuePtr: VoidPtr =
        Internals.getMethodBindPtr("SoftBody3D", "get_collision_mask_value", 1116898809)

    public val setCollisionLayerValuePtr: VoidPtr =
        Internals.getMethodBindPtr("SoftBody3D", "set_collision_layer_value", 300928843)

    public val getCollisionLayerValuePtr: VoidPtr =
        Internals.getMethodBindPtr("SoftBody3D", "get_collision_layer_value", 1116898809)

    public val setParentCollisionIgnorePtr: VoidPtr =
        Internals.getMethodBindPtr("SoftBody3D", "set_parent_collision_ignore", 1348162250)

    public val getParentCollisionIgnorePtr: VoidPtr =
        Internals.getMethodBindPtr("SoftBody3D", "get_parent_collision_ignore", 4075236667)

    public val setDisableModePtr: VoidPtr =
        Internals.getMethodBindPtr("SoftBody3D", "set_disable_mode", 1104158384)

    public val getDisableModePtr: VoidPtr =
        Internals.getMethodBindPtr("SoftBody3D", "get_disable_mode", 4135042476)

    public val getCollisionExceptionsPtr: VoidPtr =
        Internals.getMethodBindPtr("SoftBody3D", "get_collision_exceptions", 2915620761)

    public val addCollisionExceptionWithPtr: VoidPtr =
        Internals.getMethodBindPtr("SoftBody3D", "add_collision_exception_with", 1078189570)

    public val removeCollisionExceptionWithPtr: VoidPtr =
        Internals.getMethodBindPtr("SoftBody3D", "remove_collision_exception_with", 1078189570)

    public val setSimulationPrecisionPtr: VoidPtr =
        Internals.getMethodBindPtr("SoftBody3D", "set_simulation_precision", 1286410249)

    public val getSimulationPrecisionPtr: VoidPtr =
        Internals.getMethodBindPtr("SoftBody3D", "get_simulation_precision", 2455072627)

    public val setTotalMassPtr: VoidPtr =
        Internals.getMethodBindPtr("SoftBody3D", "set_total_mass", 373806689)

    public val getTotalMassPtr: VoidPtr =
        Internals.getMethodBindPtr("SoftBody3D", "get_total_mass", 191475506)

    public val setLinearStiffnessPtr: VoidPtr =
        Internals.getMethodBindPtr("SoftBody3D", "set_linear_stiffness", 373806689)

    public val getLinearStiffnessPtr: VoidPtr =
        Internals.getMethodBindPtr("SoftBody3D", "get_linear_stiffness", 191475506)

    public val setPressureCoefficientPtr: VoidPtr =
        Internals.getMethodBindPtr("SoftBody3D", "set_pressure_coefficient", 373806689)

    public val getPressureCoefficientPtr: VoidPtr =
        Internals.getMethodBindPtr("SoftBody3D", "get_pressure_coefficient", 191475506)

    public val setDampingCoefficientPtr: VoidPtr =
        Internals.getMethodBindPtr("SoftBody3D", "set_damping_coefficient", 373806689)

    public val getDampingCoefficientPtr: VoidPtr =
        Internals.getMethodBindPtr("SoftBody3D", "get_damping_coefficient", 191475506)

    public val setDragCoefficientPtr: VoidPtr =
        Internals.getMethodBindPtr("SoftBody3D", "set_drag_coefficient", 373806689)

    public val getDragCoefficientPtr: VoidPtr =
        Internals.getMethodBindPtr("SoftBody3D", "get_drag_coefficient", 191475506)

    public val getPointTransformPtr: VoidPtr =
        Internals.getMethodBindPtr("SoftBody3D", "get_point_transform", 871989493)

    public val setPointPinnedPtr: VoidPtr =
        Internals.getMethodBindPtr("SoftBody3D", "set_point_pinned", 3814935226)

    public val isPointPinnedPtr: VoidPtr =
        Internals.getMethodBindPtr("SoftBody3D", "is_point_pinned", 1116898809)

    public val setRayPickablePtr: VoidPtr =
        Internals.getMethodBindPtr("SoftBody3D", "set_ray_pickable", 2586408642)

    public val isRayPickablePtr: VoidPtr =
        Internals.getMethodBindPtr("SoftBody3D", "is_ray_pickable", 36873697)
  }
}
