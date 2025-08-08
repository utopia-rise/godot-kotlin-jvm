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
import godot.core.NodePath
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.NODE_PATH
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
  public final inline var boneIndex: Int
    @JvmName("boneIndexProperty")
    get() = getBoneIndex()
    @JvmName("boneIndexProperty")
    set(`value`) {
      setBoneIndex(value)
    }

  /**
   * The [Bone2D] node that the modification will operate on.
   */
  public final inline var bone2dNode: NodePath
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
  public final inline var targetNodepath: NodePath
    @JvmName("targetNodepathProperty")
    get() = getTargetNode()
    @JvmName("targetNodepathProperty")
    set(`value`) {
      setTargetNode(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(600, scriptIndex)
  }

  public final fun setBone2dNode(bone2dNodepath: NodePath): Unit {
    TransferContext.writeArguments(NODE_PATH to bone2dNodepath)
    TransferContext.callMethod(ptr, MethodBindings.setBone2dNodePtr, NIL)
  }

  public final fun getBone2dNode(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBone2dNodePtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH) as NodePath)
  }

  public final fun setBoneIndex(boneIdx: Int): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setBoneIndexPtr, NIL)
  }

  public final fun getBoneIndex(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBoneIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setTargetNode(targetNodepath: NodePath): Unit {
    TransferContext.writeArguments(NODE_PATH to targetNodepath)
    TransferContext.callMethod(ptr, MethodBindings.setTargetNodePtr, NIL)
  }

  public final fun getTargetNode(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTargetNodePtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH) as NodePath)
  }

  /**
   * Sets the amount of additional rotation that is to be applied after executing the modification.
   * This allows for offsetting the results by the inputted rotation amount.
   */
  public final fun setAdditionalRotation(rotation: Float): Unit {
    TransferContext.writeArguments(DOUBLE to rotation.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setAdditionalRotationPtr, NIL)
  }

  /**
   * Returns the amount of additional rotation that is applied after the LookAt modification
   * executes.
   */
  public final fun getAdditionalRotation(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAdditionalRotationPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets whether this modification will use constraints or not. When `true`, constraints will be
   * applied when solving the LookAt modification.
   */
  public final fun setEnableConstraint(enableConstraint: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enableConstraint)
    TransferContext.callMethod(ptr, MethodBindings.setEnableConstraintPtr, NIL)
  }

  /**
   * Returns `true` if the LookAt modification is using constraints.
   */
  public final fun getEnableConstraint(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEnableConstraintPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the constraint's minimum allowed angle.
   */
  public final fun setConstraintAngleMin(angleMin: Float): Unit {
    TransferContext.writeArguments(DOUBLE to angleMin.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setConstraintAngleMinPtr, NIL)
  }

  /**
   * Returns the constraint's minimum allowed angle.
   */
  public final fun getConstraintAngleMin(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getConstraintAngleMinPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the constraint's maximum allowed angle.
   */
  public final fun setConstraintAngleMax(angleMax: Float): Unit {
    TransferContext.writeArguments(DOUBLE to angleMax.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setConstraintAngleMaxPtr, NIL)
  }

  /**
   * Returns the constraint's maximum allowed angle.
   */
  public final fun getConstraintAngleMax(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getConstraintAngleMaxPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * When `true`, the modification will use an inverted joint constraint.
   *
   * An inverted joint constraint only constraints the [Bone2D] to the angles *outside of* the
   * inputted minimum and maximum angles. For this reason, it is referred to as an inverted joint
   * constraint, as it constraints the joint to the outside of the inputted values.
   */
  public final fun setConstraintAngleInvert(invert: Boolean): Unit {
    TransferContext.writeArguments(BOOL to invert)
    TransferContext.callMethod(ptr, MethodBindings.setConstraintAngleInvertPtr, NIL)
  }

  /**
   * Returns whether the constraints to this modification are inverted or not.
   */
  public final fun getConstraintAngleInvert(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getConstraintAngleInvertPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setBone2dNode(bone2dNodepath: String): Unit =
      setBone2dNode(bone2dNodepath.asCachedNodePath())

  public final fun setTargetNode(targetNodepath: String): Unit =
      setTargetNode(targetNodepath.asCachedNodePath())

  public companion object

  public object MethodBindings {
    internal val setBone2dNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DLookAt", "set_bone2d_node", 1348162250)

    internal val getBone2dNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DLookAt", "get_bone2d_node", 4075236667)

    internal val setBoneIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DLookAt", "set_bone_index", 1286410249)

    internal val getBoneIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DLookAt", "get_bone_index", 3905245786)

    internal val setTargetNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DLookAt", "set_target_node", 1348162250)

    internal val getTargetNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DLookAt", "get_target_node", 4075236667)

    internal val setAdditionalRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DLookAt", "set_additional_rotation", 373806689)

    internal val getAdditionalRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DLookAt", "get_additional_rotation", 1740695150)

    internal val setEnableConstraintPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DLookAt", "set_enable_constraint", 2586408642)

    internal val getEnableConstraintPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DLookAt", "get_enable_constraint", 36873697)

    internal val setConstraintAngleMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DLookAt", "set_constraint_angle_min", 373806689)

    internal val getConstraintAngleMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DLookAt", "get_constraint_angle_min", 1740695150)

    internal val setConstraintAngleMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DLookAt", "set_constraint_angle_max", 373806689)

    internal val getConstraintAngleMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DLookAt", "get_constraint_angle_max", 1740695150)

    internal val setConstraintAngleInvertPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DLookAt", "set_constraint_angle_invert", 2586408642)

    internal val getConstraintAngleInvertPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DLookAt", "get_constraint_angle_invert", 36873697)
  }
}
