// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * This [SkeletonModification2D] rotates a bone to look a target. This is extremely helpful for
 * moving character's head to look at the player, rotating a turret to look at a target, or any other
 * case where you want to make a bone rotate towards something quickly and easily.
 */
@GodotBaseType
public open class SkeletonModification2DLookAt : SkeletonModification2D() {
  /**
   * The index of the [Bone2D] node that the modification will operate on.
   */
  public var boneIndex: Int
    @JvmName("boneIndexProperty")
    get() = getBoneIndex()
    @JvmName("boneIndexProperty")
    set(`value`) {
      setBoneIndex(value)
    }

  /**
   * The [Bone2D] node that the modification will operate on.
   */
  public var bone2dNode: NodePath
    @JvmName("bone2dNodeProperty")
    get() = getBone2dNode()
    @JvmName("bone2dNodeProperty")
    set(`value`) {
      setBone2dNode(value)
    }

  /**
   * The NodePath to the node that is the target for the LookAt modification. This node is what the
   * modification will rotate the [Bone2D] to.
   */
  public var targetNodepath: NodePath
    @JvmName("targetNodepathProperty")
    get() = getTargetNode()
    @JvmName("targetNodepathProperty")
    set(`value`) {
      setTargetNode(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_SKELETONMODIFICATION2DLOOKAT, scriptIndex)
  }

  public fun setBone2dNode(bone2dNodepath: NodePath): Unit {
    TransferContext.writeArguments(NODE_PATH to bone2dNodepath)
    TransferContext.callMethod(rawPtr, MethodBindings.setBone2dNodePtr, NIL)
  }

  public fun getBone2dNode(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBone2dNodePtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
  }

  public fun setBoneIndex(boneIdx: Int): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setBoneIndexPtr, NIL)
  }

  public fun getBoneIndex(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBoneIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setTargetNode(targetNodepath: NodePath): Unit {
    TransferContext.writeArguments(NODE_PATH to targetNodepath)
    TransferContext.callMethod(rawPtr, MethodBindings.setTargetNodePtr, NIL)
  }

  public fun getTargetNode(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTargetNodePtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
  }

  /**
   * Sets the amount of additional rotation that is to be applied after executing the modification.
   * This allows for offsetting the results by the inputted rotation amount.
   */
  public fun setAdditionalRotation(rotation: Float): Unit {
    TransferContext.writeArguments(DOUBLE to rotation.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setAdditionalRotationPtr, NIL)
  }

  /**
   * Returns the amount of additional rotation that is applied after the LookAt modification
   * executes.
   */
  public fun getAdditionalRotation(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAdditionalRotationPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Sets whether this modification will use constraints or not. When `true`, constraints will be
   * applied when solving the LookAt modification.
   */
  public fun setEnableConstraint(enableConstraint: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enableConstraint)
    TransferContext.callMethod(rawPtr, MethodBindings.setEnableConstraintPtr, NIL)
  }

  /**
   * Returns `true` if the LookAt modification is using constraints.
   */
  public fun getEnableConstraint(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getEnableConstraintPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the constraint's minimum allowed angle.
   */
  public fun setConstraintAngleMin(angleMin: Float): Unit {
    TransferContext.writeArguments(DOUBLE to angleMin.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setConstraintAngleMinPtr, NIL)
  }

  /**
   * Returns the constraint's minimum allowed angle.
   */
  public fun getConstraintAngleMin(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getConstraintAngleMinPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Sets the constraint's maximum allowed angle.
   */
  public fun setConstraintAngleMax(angleMax: Float): Unit {
    TransferContext.writeArguments(DOUBLE to angleMax.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setConstraintAngleMaxPtr, NIL)
  }

  /**
   * Returns the constraint's maximum allowed angle.
   */
  public fun getConstraintAngleMax(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getConstraintAngleMaxPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * When `true`, the modification will use an inverted joint constraint.
   * An inverted joint constraint only constraints the [Bone2D] to the angles *outside of* the
   * inputted minimum and maximum angles. For this reason, it is referred to as an inverted joint
   * constraint, as it constraints the joint to the outside of the inputted values.
   */
  public fun setConstraintAngleInvert(invert: Boolean): Unit {
    TransferContext.writeArguments(BOOL to invert)
    TransferContext.callMethod(rawPtr, MethodBindings.setConstraintAngleInvertPtr, NIL)
  }

  /**
   * Returns whether the constraints to this modification are inverted or not.
   */
  public fun getConstraintAngleInvert(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getConstraintAngleInvertPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setBone2dNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DLookAt", "set_bone2d_node", 1348162250)

    public val getBone2dNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DLookAt", "get_bone2d_node", 4075236667)

    public val setBoneIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DLookAt", "set_bone_index", 1286410249)

    public val getBoneIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DLookAt", "get_bone_index", 3905245786)

    public val setTargetNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DLookAt", "set_target_node", 1348162250)

    public val getTargetNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DLookAt", "get_target_node", 4075236667)

    public val setAdditionalRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DLookAt", "set_additional_rotation", 373806689)

    public val getAdditionalRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DLookAt", "get_additional_rotation", 1740695150)

    public val setEnableConstraintPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DLookAt", "set_enable_constraint", 2586408642)

    public val getEnableConstraintPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DLookAt", "get_enable_constraint", 36873697)

    public val setConstraintAngleMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DLookAt", "set_constraint_angle_min", 373806689)

    public val getConstraintAngleMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DLookAt", "get_constraint_angle_min", 1740695150)

    public val setConstraintAngleMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DLookAt", "set_constraint_angle_max", 373806689)

    public val getConstraintAngleMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DLookAt", "get_constraint_angle_max", 1740695150)

    public val setConstraintAngleInvertPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DLookAt", "set_constraint_angle_invert", 2586408642)

    public val getConstraintAngleInvertPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DLookAt", "get_constraint_angle_invert", 36873697)
  }
}
