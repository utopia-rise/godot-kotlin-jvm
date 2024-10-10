// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.NODE_PATH
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

private const val ENGINE_CLASS_SKELETONMODIFICATION2DLOOKAT_INDEX: Int = 590

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
    Internals.callConstructor(this, ENGINE_CLASS_SKELETONMODIFICATION2DLOOKAT_INDEX, scriptIndex)
  }

  public final fun setBone2dNode(bone2dNodepath: NodePath): Unit {
    Internals.writeArguments(NODE_PATH to bone2dNodepath)
    Internals.callMethod(rawPtr, MethodBindings.setBone2dNodePtr, NIL)
  }

  public final fun getBone2dNode(): NodePath {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBone2dNodePtr, NODE_PATH)
    return (Internals.readReturnValue(NODE_PATH) as NodePath)
  }

  public final fun setBoneIndex(boneIdx: Int): Unit {
    Internals.writeArguments(LONG to boneIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setBoneIndexPtr, NIL)
  }

  public final fun getBoneIndex(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBoneIndexPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
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

  /**
   * Sets the amount of additional rotation that is to be applied after executing the modification.
   * This allows for offsetting the results by the inputted rotation amount.
   */
  public final fun setAdditionalRotation(rotation: Float): Unit {
    Internals.writeArguments(DOUBLE to rotation.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setAdditionalRotationPtr, NIL)
  }

  /**
   * Returns the amount of additional rotation that is applied after the LookAt modification
   * executes.
   */
  public final fun getAdditionalRotation(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAdditionalRotationPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets whether this modification will use constraints or not. When `true`, constraints will be
   * applied when solving the LookAt modification.
   */
  public final fun setEnableConstraint(enableConstraint: Boolean): Unit {
    Internals.writeArguments(BOOL to enableConstraint)
    Internals.callMethod(rawPtr, MethodBindings.setEnableConstraintPtr, NIL)
  }

  /**
   * Returns `true` if the LookAt modification is using constraints.
   */
  public final fun getEnableConstraint(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEnableConstraintPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the constraint's minimum allowed angle.
   */
  public final fun setConstraintAngleMin(angleMin: Float): Unit {
    Internals.writeArguments(DOUBLE to angleMin.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setConstraintAngleMinPtr, NIL)
  }

  /**
   * Returns the constraint's minimum allowed angle.
   */
  public final fun getConstraintAngleMin(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getConstraintAngleMinPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the constraint's maximum allowed angle.
   */
  public final fun setConstraintAngleMax(angleMax: Float): Unit {
    Internals.writeArguments(DOUBLE to angleMax.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setConstraintAngleMaxPtr, NIL)
  }

  /**
   * Returns the constraint's maximum allowed angle.
   */
  public final fun getConstraintAngleMax(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getConstraintAngleMaxPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * When `true`, the modification will use an inverted joint constraint.
   * An inverted joint constraint only constraints the [Bone2D] to the angles *outside of* the
   * inputted minimum and maximum angles. For this reason, it is referred to as an inverted joint
   * constraint, as it constraints the joint to the outside of the inputted values.
   */
  public final fun setConstraintAngleInvert(invert: Boolean): Unit {
    Internals.writeArguments(BOOL to invert)
    Internals.callMethod(rawPtr, MethodBindings.setConstraintAngleInvertPtr, NIL)
  }

  /**
   * Returns whether the constraints to this modification are inverted or not.
   */
  public final fun getConstraintAngleInvert(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getConstraintAngleInvertPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setBone2dNodePtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DLookAt", "set_bone2d_node", 1348162250)

    public val getBone2dNodePtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DLookAt", "get_bone2d_node", 4075236667)

    public val setBoneIndexPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DLookAt", "set_bone_index", 1286410249)

    public val getBoneIndexPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DLookAt", "get_bone_index", 3905245786)

    public val setTargetNodePtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DLookAt", "set_target_node", 1348162250)

    public val getTargetNodePtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DLookAt", "get_target_node", 4075236667)

    public val setAdditionalRotationPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DLookAt", "set_additional_rotation", 373806689)

    public val getAdditionalRotationPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DLookAt", "get_additional_rotation", 1740695150)

    public val setEnableConstraintPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DLookAt", "set_enable_constraint", 2586408642)

    public val getEnableConstraintPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DLookAt", "get_enable_constraint", 36873697)

    public val setConstraintAngleMinPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DLookAt", "set_constraint_angle_min", 373806689)

    public val getConstraintAngleMinPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DLookAt", "get_constraint_angle_min", 1740695150)

    public val setConstraintAngleMaxPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DLookAt", "set_constraint_angle_max", 373806689)

    public val getConstraintAngleMaxPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DLookAt", "get_constraint_angle_max", 1740695150)

    public val setConstraintAngleInvertPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DLookAt", "set_constraint_angle_invert", 2586408642)

    public val getConstraintAngleInvertPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DLookAt", "get_constraint_angle_invert", 36873697)
  }
}
