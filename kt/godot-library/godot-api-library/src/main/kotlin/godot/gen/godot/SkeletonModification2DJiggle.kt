// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.NODE_PATH
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
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

private const val ENGINE_CLASS_SKELETONMODIFICATION2DJIGGLE_INDEX: Int = 589

/**
 * This modification moves a series of bones, typically called a bone chain, towards a target. What
 * makes this modification special is that it calculates the velocity and acceleration for each bone in
 * the bone chain, and runs a very light physics-like calculation using the inputted values. This
 * allows the bones to overshoot the target and "jiggle" around. It can be configured to act more like
 * a spring, or sway around like cloth might.
 * This modification is useful for adding additional motion to things like hair, the edges of
 * clothing, and more. It has several settings to that allow control over how the joint moves when the
 * target moves.
 * **Note:** The Jiggle modifier has `jiggle_joints`, which are the data objects that hold the data
 * for each joint in the Jiggle chain. This is different from than [Bone2D] nodes! Jiggle joints hold
 * the data needed for each [Bone2D] in the bone chain used by the Jiggle modification.
 */
@GodotBaseType
public open class SkeletonModification2DJiggle : SkeletonModification2D() {
  /**
   * The NodePath to the node that is the target for the Jiggle modification. This node is what the
   * Jiggle chain will attempt to rotate the bone chain to.
   */
  public final inline var targetNodepath: NodePath
    @JvmName("targetNodepathProperty")
    get() = getTargetNode()
    @JvmName("targetNodepathProperty")
    set(`value`) {
      setTargetNode(value)
    }

  /**
   * The amount of Jiggle joints in the Jiggle modification.
   */
  public final inline var jiggleDataChainLength: Int
    @JvmName("jiggleDataChainLengthProperty")
    get() = getJiggleDataChainLength()
    @JvmName("jiggleDataChainLengthProperty")
    set(`value`) {
      setJiggleDataChainLength(value)
    }

  /**
   * The default amount of stiffness assigned to the Jiggle joints, if they are not overridden.
   * Higher values act more like springs, quickly moving into the correct position.
   */
  public final inline var stiffness: Float
    @JvmName("stiffnessProperty")
    get() = getStiffness()
    @JvmName("stiffnessProperty")
    set(`value`) {
      setStiffness(value)
    }

  /**
   * The default amount of mass assigned to the Jiggle joints, if they are not overridden. Higher
   * values lead to faster movements and more overshooting.
   */
  public final inline var mass: Float
    @JvmName("massProperty")
    get() = getMass()
    @JvmName("massProperty")
    set(`value`) {
      setMass(value)
    }

  /**
   * The default amount of damping applied to the Jiggle joints, if they are not overridden. Higher
   * values lead to more of the calculated velocity being applied.
   */
  public final inline var damping: Float
    @JvmName("dampingProperty")
    get() = getDamping()
    @JvmName("dampingProperty")
    set(`value`) {
      setDamping(value)
    }

  /**
   * Whether the gravity vector, [gravity], should be applied to the Jiggle joints, assuming they
   * are not overriding the default settings.
   */
  public final inline var useGravity: Boolean
    @JvmName("useGravityProperty")
    get() = getUseGravity()
    @JvmName("useGravityProperty")
    set(`value`) {
      setUseGravity(value)
    }

  /**
   * The default amount of gravity applied to the Jiggle joints, if they are not overridden.
   */
  @CoreTypeLocalCopy
  public final inline var gravity: Vector2
    @JvmName("gravityProperty")
    get() = getGravity()
    @JvmName("gravityProperty")
    set(`value`) {
      setGravity(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_SKELETONMODIFICATION2DJIGGLE_INDEX, scriptIndex)
  }

  /**
   * The default amount of gravity applied to the Jiggle joints, if they are not overridden.
   *
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = skeletonmodification2djiggle.gravity
   * //Your changes
   * skeletonmodification2djiggle.gravity = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun gravityMutate(block: Vector2.() -> Unit): Vector2 = gravity.apply{
      block(this)
      gravity = this
  }


  public final fun setTargetNode(targetNodepath: NodePath): Unit {
    Internals.writeArguments(NODE_PATH to targetNodepath)
    Internals.callMethod(rawPtr, MethodBindings.setTargetNodePtr, NIL)
  }

  public final fun getTargetNode(): NodePath {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTargetNodePtr, NODE_PATH)
    return (Internals.readReturnValue(NODE_PATH) as NodePath)
  }

  public final fun setJiggleDataChainLength(length: Int): Unit {
    Internals.writeArguments(LONG to length.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setJiggleDataChainLengthPtr, NIL)
  }

  public final fun getJiggleDataChainLength(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getJiggleDataChainLengthPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setStiffness(stiffness: Float): Unit {
    Internals.writeArguments(DOUBLE to stiffness.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setStiffnessPtr, NIL)
  }

  public final fun getStiffness(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getStiffnessPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setMass(mass: Float): Unit {
    Internals.writeArguments(DOUBLE to mass.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setMassPtr, NIL)
  }

  public final fun getMass(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMassPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDamping(damping: Float): Unit {
    Internals.writeArguments(DOUBLE to damping.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setDampingPtr, NIL)
  }

  public final fun getDamping(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDampingPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setUseGravity(useGravity: Boolean): Unit {
    Internals.writeArguments(BOOL to useGravity)
    Internals.callMethod(rawPtr, MethodBindings.setUseGravityPtr, NIL)
  }

  public final fun getUseGravity(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getUseGravityPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setGravity(gravity: Vector2): Unit {
    Internals.writeArguments(VECTOR2 to gravity)
    Internals.callMethod(rawPtr, MethodBindings.setGravityPtr, NIL)
  }

  public final fun getGravity(): Vector2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getGravityPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * If `true`, the Jiggle modifier will take colliders into account, keeping them from entering
   * into these collision objects.
   */
  public final fun setUseColliders(useColliders: Boolean): Unit {
    Internals.writeArguments(BOOL to useColliders)
    Internals.callMethod(rawPtr, MethodBindings.setUseCollidersPtr, NIL)
  }

  /**
   * Returns whether the jiggle modifier is taking physics colliders into account when solving.
   */
  public final fun getUseColliders(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getUseCollidersPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the collision mask that the Jiggle modifier will use when reacting to colliders, if the
   * Jiggle modifier is set to take colliders into account.
   */
  public final fun setCollisionMask(collisionMask: Int): Unit {
    Internals.writeArguments(LONG to collisionMask.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setCollisionMaskPtr, NIL)
  }

  /**
   * Returns the collision mask used by the Jiggle modifier when collisions are enabled.
   */
  public final fun getCollisionMask(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCollisionMaskPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the [Bone2D] node assigned to the Jiggle joint at [jointIdx].
   */
  public final fun setJiggleJointBone2dNode(jointIdx: Int, bone2dNode: NodePath): Unit {
    Internals.writeArguments(LONG to jointIdx.toLong(), NODE_PATH to bone2dNode)
    Internals.callMethod(rawPtr, MethodBindings.setJiggleJointBone2dNodePtr, NIL)
  }

  /**
   * Returns the [Bone2D] node assigned to the Jiggle joint at [jointIdx].
   */
  public final fun getJiggleJointBone2dNode(jointIdx: Int): NodePath {
    Internals.writeArguments(LONG to jointIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getJiggleJointBone2dNodePtr, NODE_PATH)
    return (Internals.readReturnValue(NODE_PATH) as NodePath)
  }

  /**
   * Sets the bone index, [boneIdx], of the Jiggle joint at [jointIdx]. When possible, this will
   * also update the `bone2d_node` of the Jiggle joint based on data provided by the linked skeleton.
   */
  public final fun setJiggleJointBoneIndex(jointIdx: Int, boneIdx: Int): Unit {
    Internals.writeArguments(LONG to jointIdx.toLong(), LONG to boneIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setJiggleJointBoneIndexPtr, NIL)
  }

  /**
   * Returns the index of the [Bone2D] node assigned to the Jiggle joint at [jointIdx].
   */
  public final fun getJiggleJointBoneIndex(jointIdx: Int): Int {
    Internals.writeArguments(LONG to jointIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getJiggleJointBoneIndexPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets whether the Jiggle joint at [jointIdx] should override the default Jiggle joint settings.
   * Setting this to `true` will make the joint use its own settings rather than the default ones
   * attached to the modification.
   */
  public final fun setJiggleJointOverride(jointIdx: Int, `override`: Boolean): Unit {
    Internals.writeArguments(LONG to jointIdx.toLong(), BOOL to override)
    Internals.callMethod(rawPtr, MethodBindings.setJiggleJointOverridePtr, NIL)
  }

  /**
   * Returns a boolean that indicates whether the joint at [jointIdx] is overriding the default
   * Jiggle joint data defined in the modification.
   */
  public final fun getJiggleJointOverride(jointIdx: Int): Boolean {
    Internals.writeArguments(LONG to jointIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getJiggleJointOverridePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the of stiffness of the Jiggle joint at [jointIdx].
   */
  public final fun setJiggleJointStiffness(jointIdx: Int, stiffness: Float): Unit {
    Internals.writeArguments(LONG to jointIdx.toLong(), DOUBLE to stiffness.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setJiggleJointStiffnessPtr, NIL)
  }

  /**
   * Returns the stiffness of the Jiggle joint at [jointIdx].
   */
  public final fun getJiggleJointStiffness(jointIdx: Int): Float {
    Internals.writeArguments(LONG to jointIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getJiggleJointStiffnessPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the of mass of the Jiggle joint at [jointIdx].
   */
  public final fun setJiggleJointMass(jointIdx: Int, mass: Float): Unit {
    Internals.writeArguments(LONG to jointIdx.toLong(), DOUBLE to mass.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setJiggleJointMassPtr, NIL)
  }

  /**
   * Returns the amount of mass of the jiggle joint at [jointIdx].
   */
  public final fun getJiggleJointMass(jointIdx: Int): Float {
    Internals.writeArguments(LONG to jointIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getJiggleJointMassPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the amount of damping of the Jiggle joint at [jointIdx].
   */
  public final fun setJiggleJointDamping(jointIdx: Int, damping: Float): Unit {
    Internals.writeArguments(LONG to jointIdx.toLong(), DOUBLE to damping.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setJiggleJointDampingPtr, NIL)
  }

  /**
   * Returns the amount of damping of the Jiggle joint at [jointIdx].
   */
  public final fun getJiggleJointDamping(jointIdx: Int): Float {
    Internals.writeArguments(LONG to jointIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getJiggleJointDampingPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets whether the Jiggle joint at [jointIdx] should use gravity.
   */
  public final fun setJiggleJointUseGravity(jointIdx: Int, useGravity: Boolean): Unit {
    Internals.writeArguments(LONG to jointIdx.toLong(), BOOL to useGravity)
    Internals.callMethod(rawPtr, MethodBindings.setJiggleJointUseGravityPtr, NIL)
  }

  /**
   * Returns a boolean that indicates whether the joint at [jointIdx] is using gravity or not.
   */
  public final fun getJiggleJointUseGravity(jointIdx: Int): Boolean {
    Internals.writeArguments(LONG to jointIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getJiggleJointUseGravityPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the gravity vector of the Jiggle joint at [jointIdx].
   */
  public final fun setJiggleJointGravity(jointIdx: Int, gravity: Vector2): Unit {
    Internals.writeArguments(LONG to jointIdx.toLong(), VECTOR2 to gravity)
    Internals.callMethod(rawPtr, MethodBindings.setJiggleJointGravityPtr, NIL)
  }

  /**
   * Returns a [Vector2] representing the amount of gravity the Jiggle joint at [jointIdx] is
   * influenced by.
   */
  public final fun getJiggleJointGravity(jointIdx: Int): Vector2 {
    Internals.writeArguments(LONG to jointIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getJiggleJointGravityPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  public companion object

  public object MethodBindings {
    internal val setTargetNodePtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DJiggle", "set_target_node", 1348162250)

    internal val getTargetNodePtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DJiggle", "get_target_node", 4075236667)

    internal val setJiggleDataChainLengthPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DJiggle", "set_jiggle_data_chain_length", 1286410249)

    internal val getJiggleDataChainLengthPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DJiggle", "get_jiggle_data_chain_length", 2455072627)

    internal val setStiffnessPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DJiggle", "set_stiffness", 373806689)

    internal val getStiffnessPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DJiggle", "get_stiffness", 1740695150)

    internal val setMassPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DJiggle", "set_mass", 373806689)

    internal val getMassPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DJiggle", "get_mass", 1740695150)

    internal val setDampingPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DJiggle", "set_damping", 373806689)

    internal val getDampingPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DJiggle", "get_damping", 1740695150)

    internal val setUseGravityPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DJiggle", "set_use_gravity", 2586408642)

    internal val getUseGravityPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DJiggle", "get_use_gravity", 36873697)

    internal val setGravityPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DJiggle", "set_gravity", 743155724)

    internal val getGravityPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DJiggle", "get_gravity", 3341600327)

    internal val setUseCollidersPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DJiggle", "set_use_colliders", 2586408642)

    internal val getUseCollidersPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DJiggle", "get_use_colliders", 36873697)

    internal val setCollisionMaskPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DJiggle", "set_collision_mask", 1286410249)

    internal val getCollisionMaskPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DJiggle", "get_collision_mask", 3905245786)

    internal val setJiggleJointBone2dNodePtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DJiggle", "set_jiggle_joint_bone2d_node", 2761262315)

    internal val getJiggleJointBone2dNodePtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DJiggle", "get_jiggle_joint_bone2d_node", 408788394)

    internal val setJiggleJointBoneIndexPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DJiggle", "set_jiggle_joint_bone_index", 3937882851)

    internal val getJiggleJointBoneIndexPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DJiggle", "get_jiggle_joint_bone_index", 923996154)

    internal val setJiggleJointOverridePtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DJiggle", "set_jiggle_joint_override", 300928843)

    internal val getJiggleJointOverridePtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DJiggle", "get_jiggle_joint_override", 1116898809)

    internal val setJiggleJointStiffnessPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DJiggle", "set_jiggle_joint_stiffness", 1602489585)

    internal val getJiggleJointStiffnessPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DJiggle", "get_jiggle_joint_stiffness", 2339986948)

    internal val setJiggleJointMassPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DJiggle", "set_jiggle_joint_mass", 1602489585)

    internal val getJiggleJointMassPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DJiggle", "get_jiggle_joint_mass", 2339986948)

    internal val setJiggleJointDampingPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DJiggle", "set_jiggle_joint_damping", 1602489585)

    internal val getJiggleJointDampingPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DJiggle", "get_jiggle_joint_damping", 2339986948)

    internal val setJiggleJointUseGravityPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DJiggle", "set_jiggle_joint_use_gravity", 300928843)

    internal val getJiggleJointUseGravityPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DJiggle", "get_jiggle_joint_use_gravity", 1116898809)

    internal val setJiggleJointGravityPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DJiggle", "set_jiggle_joint_gravity", 163021252)

    internal val getJiggleJointGravityPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DJiggle", "get_jiggle_joint_gravity", 2299179447)
  }
}
