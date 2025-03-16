// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
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
import godot.core.VariantParser.STRING
import godot.core.VariantParser.VECTOR3
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

/**
 * This [SkeletonModifier3D] rotates a bone to look at a target. This is helpful for moving a
 * character's head to look at the player, rotating a turret to look at a target, or any other case
 * where you want to make a bone rotate towards something quickly and easily.
 * When applying multiple [LookAtModifier3D]s, the [LookAtModifier3D] assigned to the parent bone
 * must be put above the [LookAtModifier3D] assigned to the child bone in the list in order for the
 * child bone results to be correct.
 */
@GodotBaseType
public open class LookAtModifier3D : SkeletonModifier3D() {
  /**
   * The [NodePath] to the node that is the target for the look at modification. This node is what
   * the modification will rotate the bone to.
   */
  public final inline var targetNode: NodePath
    @JvmName("targetNodeProperty")
    get() = getTargetNode()
    @JvmName("targetNodeProperty")
    set(`value`) {
      setTargetNode(value)
    }

  /**
   * The bone name of the [Skeleton3D] that the modification will operate on.
   */
  public final inline var boneName: String
    @JvmName("boneNameProperty")
    get() = getBoneName()
    @JvmName("boneNameProperty")
    set(`value`) {
      setBoneName(value)
    }

  /**
   * Index of the [boneName] in the parent [Skeleton3D].
   */
  public final inline var bone: Int
    @JvmName("boneProperty")
    get() = getBone()
    @JvmName("boneProperty")
    set(`value`) {
      setBone(value)
    }

  /**
   * The forward axis of the bone. This [SkeletonModifier3D] modifies the bone so that this axis
   * points toward the [targetNode].
   */
  public final inline var forwardAxis: SkeletonModifier3D.BoneAxis
    @JvmName("forwardAxisProperty")
    get() = getForwardAxis()
    @JvmName("forwardAxisProperty")
    set(`value`) {
      setForwardAxis(value)
    }

  /**
   * The axis of the first rotation. This [SkeletonModifier3D] works by compositing the rotation by
   * Euler angles to prevent to rotate the [forwardAxis].
   */
  public final inline var primaryRotationAxis: Vector3.Axis
    @JvmName("primaryRotationAxisProperty")
    get() = getPrimaryRotationAxis()
    @JvmName("primaryRotationAxisProperty")
    set(`value`) {
      setPrimaryRotationAxis(value)
    }

  /**
   * If `true`, provides rotation by two axes.
   */
  public final inline var useSecondaryRotation: Boolean
    @JvmName("useSecondaryRotationProperty")
    get() = isUsingSecondaryRotation()
    @JvmName("useSecondaryRotationProperty")
    set(`value`) {
      setUseSecondaryRotation(value)
    }

  /**
   * This value determines from what origin is retrieved for use in the calculation of the forward
   * vector.
   */
  public final inline var originFrom: OriginFrom
    @JvmName("originFromProperty")
    get() = getOriginFrom()
    @JvmName("originFromProperty")
    set(`value`) {
      setOriginFrom(value)
    }

  /**
   * If [originFrom] is [ORIGIN_FROM_SPECIFIC_BONE], the bone global pose position specified for
   * this is used as origin.
   */
  public final inline var originBoneName: String
    @JvmName("originBoneNameProperty")
    get() = getOriginBoneName()
    @JvmName("originBoneNameProperty")
    set(`value`) {
      setOriginBoneName(value)
    }

  /**
   * Index of the [originBoneName] in the parent [Skeleton3D].
   */
  public final inline var originBone: Int
    @JvmName("originBoneProperty")
    get() = getOriginBone()
    @JvmName("originBoneProperty")
    set(`value`) {
      setOriginBone(value)
    }

  /**
   * If [originFrom] is [ORIGIN_FROM_EXTERNAL_NODE], the global position of the [Node3D] specified
   * for this is used as origin.
   */
  public final inline var originExternalNode: NodePath
    @JvmName("originExternalNodeProperty")
    get() = getOriginExternalNode()
    @JvmName("originExternalNodeProperty")
    set(`value`) {
      setOriginExternalNode(value)
    }

  /**
   * The offset of the bone pose origin. Matching the origins by offset is useful for cases where
   * multiple bones must always face the same direction, such as the eyes.
   * **Note:** This value indicates the local position of the object set in [originFrom].
   */
  @CoreTypeLocalCopy
  public final inline var originOffset: Vector3
    @JvmName("originOffsetProperty")
    get() = getOriginOffset()
    @JvmName("originOffsetProperty")
    set(`value`) {
      setOriginOffset(value)
    }

  /**
   * If the target passes through too close to the origin than this value, time-based interpolation
   * is used even if the target is within the angular limitations, to prevent the angular velocity from
   * becoming too high.
   */
  public final inline var originSafeMargin: Float
    @JvmName("originSafeMarginProperty")
    get() = getOriginSafeMargin()
    @JvmName("originSafeMarginProperty")
    set(`value`) {
      setOriginSafeMargin(value)
    }

  /**
   * The duration of the time-based interpolation. Interpolation is triggered at the following
   * cases:
   * - When the target node is changed
   * - When an axis is flipped due to angle limitation
   * **Note:** The flipping occurs when the target is outside the angle limitation and the
   * internally computed secondary rotation axis of the forward vector is flipped. Visually, it occurs
   * when the target is outside the angle limitation and crosses the plane of the [forwardAxis] and
   * [primaryRotationAxis].
   */
  public final inline var duration: Float
    @JvmName("durationProperty")
    get() = getDuration()
    @JvmName("durationProperty")
    set(`value`) {
      setDuration(value)
    }

  /**
   * The transition type of the time-based interpolation. See also [Tween.TransitionType].
   */
  public final inline var transitionType: Tween.TransitionType
    @JvmName("transitionTypeProperty")
    get() = getTransitionType()
    @JvmName("transitionTypeProperty")
    set(`value`) {
      setTransitionType(value)
    }

  /**
   * The ease type of the time-based interpolation. See also [Tween.EaseType].
   */
  public final inline var easeType: Tween.EaseType
    @JvmName("easeTypeProperty")
    get() = getEaseType()
    @JvmName("easeTypeProperty")
    set(`value`) {
      setEaseType(value)
    }

  /**
   * If `true`, limits the degree of rotation. This helps prevent the character's neck from rotating
   * 360 degrees.
   * **Note:** As with [AnimationTree] blending, interpolation is provided that favors
   * [Skeleton3D.getBoneRest]. This means that interpolation does not select the shortest path in some
   * cases.
   * **Note:** Some [transitionType] may exceed the limitations (e.g. `Back`, `Elastic`, and
   * `Spring`). If interpolation occurs while overshooting the limitations, the result might possibly
   * not respect the bone rest.
   */
  public final inline var useAngleLimitation: Boolean
    @JvmName("useAngleLimitationProperty")
    get() = isUsingAngleLimitation()
    @JvmName("useAngleLimitationProperty")
    set(`value`) {
      setUseAngleLimitation(value)
    }

  /**
   * If `true`, the limitations are spread from the bone symmetrically.
   * If `false`, the limitation can be specified separately for each side of the bone rest.
   */
  public final inline var symmetryLimitation: Boolean
    @JvmName("symmetryLimitationProperty")
    get() = isLimitationSymmetry()
    @JvmName("symmetryLimitationProperty")
    set(`value`) {
      setSymmetryLimitation(value)
    }

  /**
   * The limit angle of the primary rotation when [symmetryLimitation] is `true`.
   */
  public final inline var primaryLimitAngle: Float
    @JvmName("primaryLimitAngleProperty")
    get() = getPrimaryLimitAngle()
    @JvmName("primaryLimitAngleProperty")
    set(`value`) {
      setPrimaryLimitAngle(value)
    }

  /**
   * The threshold to start damping for [primaryLimitAngle]. It provides non-linear (b-spline)
   * interpolation, let it feel more resistance the more it rotate to the edge limit. This is useful
   * for simulating the limits of human motion.
   * If `1.0`, no damping is performed. If `0.0`, damping is always performed.
   */
  public final inline var primaryDampThreshold: Float
    @JvmName("primaryDampThresholdProperty")
    get() = getPrimaryDampThreshold()
    @JvmName("primaryDampThresholdProperty")
    set(`value`) {
      setPrimaryDampThreshold(value)
    }

  /**
   * The limit angle of positive side of the primary rotation when [symmetryLimitation] is `false`.
   */
  public final inline var primaryPositiveLimitAngle: Float
    @JvmName("primaryPositiveLimitAngleProperty")
    get() = getPrimaryPositiveLimitAngle()
    @JvmName("primaryPositiveLimitAngleProperty")
    set(`value`) {
      setPrimaryPositiveLimitAngle(value)
    }

  /**
   * The threshold to start damping for [primaryPositiveLimitAngle].
   */
  public final inline var primaryPositiveDampThreshold: Float
    @JvmName("primaryPositiveDampThresholdProperty")
    get() = getPrimaryPositiveDampThreshold()
    @JvmName("primaryPositiveDampThresholdProperty")
    set(`value`) {
      setPrimaryPositiveDampThreshold(value)
    }

  /**
   * The limit angle of negative side of the primary rotation when [symmetryLimitation] is `false`.
   */
  public final inline var primaryNegativeLimitAngle: Float
    @JvmName("primaryNegativeLimitAngleProperty")
    get() = getPrimaryNegativeLimitAngle()
    @JvmName("primaryNegativeLimitAngleProperty")
    set(`value`) {
      setPrimaryNegativeLimitAngle(value)
    }

  /**
   * The threshold to start damping for [primaryNegativeLimitAngle].
   */
  public final inline var primaryNegativeDampThreshold: Float
    @JvmName("primaryNegativeDampThresholdProperty")
    get() = getPrimaryNegativeDampThreshold()
    @JvmName("primaryNegativeDampThresholdProperty")
    set(`value`) {
      setPrimaryNegativeDampThreshold(value)
    }

  /**
   * The limit angle of the secondary rotation when [symmetryLimitation] is `true`.
   */
  public final inline var secondaryLimitAngle: Float
    @JvmName("secondaryLimitAngleProperty")
    get() = getSecondaryLimitAngle()
    @JvmName("secondaryLimitAngleProperty")
    set(`value`) {
      setSecondaryLimitAngle(value)
    }

  /**
   * The threshold to start damping for [secondaryLimitAngle].
   */
  public final inline var secondaryDampThreshold: Float
    @JvmName("secondaryDampThresholdProperty")
    get() = getSecondaryDampThreshold()
    @JvmName("secondaryDampThresholdProperty")
    set(`value`) {
      setSecondaryDampThreshold(value)
    }

  /**
   * The limit angle of positive side of the secondary rotation when [symmetryLimitation] is
   * `false`.
   */
  public final inline var secondaryPositiveLimitAngle: Float
    @JvmName("secondaryPositiveLimitAngleProperty")
    get() = getSecondaryPositiveLimitAngle()
    @JvmName("secondaryPositiveLimitAngleProperty")
    set(`value`) {
      setSecondaryPositiveLimitAngle(value)
    }

  /**
   * The threshold to start damping for [secondaryPositiveLimitAngle].
   */
  public final inline var secondaryPositiveDampThreshold: Float
    @JvmName("secondaryPositiveDampThresholdProperty")
    get() = getSecondaryPositiveDampThreshold()
    @JvmName("secondaryPositiveDampThresholdProperty")
    set(`value`) {
      setSecondaryPositiveDampThreshold(value)
    }

  /**
   * The limit angle of negative side of the secondary rotation when [symmetryLimitation] is
   * `false`.
   */
  public final inline var secondaryNegativeLimitAngle: Float
    @JvmName("secondaryNegativeLimitAngleProperty")
    get() = getSecondaryNegativeLimitAngle()
    @JvmName("secondaryNegativeLimitAngleProperty")
    set(`value`) {
      setSecondaryNegativeLimitAngle(value)
    }

  /**
   * The threshold to start damping for [secondaryNegativeLimitAngle].
   */
  public final inline var secondaryNegativeDampThreshold: Float
    @JvmName("secondaryNegativeDampThresholdProperty")
    get() = getSecondaryNegativeDampThreshold()
    @JvmName("secondaryNegativeDampThresholdProperty")
    set(`value`) {
      setSecondaryNegativeDampThreshold(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(342, scriptIndex)
  }

  /**
   * The offset of the bone pose origin. Matching the origins by offset is useful for cases where
   * multiple bones must always face the same direction, such as the eyes.
   * **Note:** This value indicates the local position of the object set in [originFrom].
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
   * val myCoreType = lookatmodifier3d.originOffset
   * //Your changes
   * lookatmodifier3d.originOffset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun originOffsetMutate(block: Vector3.() -> Unit): Vector3 = originOffset.apply{
      block(this)
      originOffset = this
  }


  public final fun setTargetNode(targetNode: NodePath): Unit {
    TransferContext.writeArguments(NODE_PATH to targetNode)
    TransferContext.callMethod(ptr, MethodBindings.setTargetNodePtr, NIL)
  }

  public final fun getTargetNode(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTargetNodePtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH) as NodePath)
  }

  public final fun setBoneName(boneName: String): Unit {
    TransferContext.writeArguments(STRING to boneName)
    TransferContext.callMethod(ptr, MethodBindings.setBoneNamePtr, NIL)
  }

  public final fun getBoneName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBoneNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setBone(bone: Int): Unit {
    TransferContext.writeArguments(LONG to bone.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setBonePtr, NIL)
  }

  public final fun getBone(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBonePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setForwardAxis(forwardAxis: SkeletonModifier3D.BoneAxis): Unit {
    TransferContext.writeArguments(LONG to forwardAxis.id)
    TransferContext.callMethod(ptr, MethodBindings.setForwardAxisPtr, NIL)
  }

  public final fun getForwardAxis(): SkeletonModifier3D.BoneAxis {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getForwardAxisPtr, LONG)
    return SkeletonModifier3D.BoneAxis.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setPrimaryRotationAxis(axis: Vector3.Axis): Unit {
    TransferContext.writeArguments(LONG to axis.id)
    TransferContext.callMethod(ptr, MethodBindings.setPrimaryRotationAxisPtr, NIL)
  }

  public final fun getPrimaryRotationAxis(): Vector3.Axis {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPrimaryRotationAxisPtr, LONG)
    return Vector3.Axis.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setUseSecondaryRotation(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setUseSecondaryRotationPtr, NIL)
  }

  public final fun isUsingSecondaryRotation(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isUsingSecondaryRotationPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setOriginSafeMargin(margin: Float): Unit {
    TransferContext.writeArguments(DOUBLE to margin.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setOriginSafeMarginPtr, NIL)
  }

  public final fun getOriginSafeMargin(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOriginSafeMarginPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setOriginFrom(originFrom: OriginFrom): Unit {
    TransferContext.writeArguments(LONG to originFrom.id)
    TransferContext.callMethod(ptr, MethodBindings.setOriginFromPtr, NIL)
  }

  public final fun getOriginFrom(): OriginFrom {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOriginFromPtr, LONG)
    return LookAtModifier3D.OriginFrom.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setOriginBoneName(boneName: String): Unit {
    TransferContext.writeArguments(STRING to boneName)
    TransferContext.callMethod(ptr, MethodBindings.setOriginBoneNamePtr, NIL)
  }

  public final fun getOriginBoneName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOriginBoneNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setOriginBone(bone: Int): Unit {
    TransferContext.writeArguments(LONG to bone.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setOriginBonePtr, NIL)
  }

  public final fun getOriginBone(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOriginBonePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setOriginExternalNode(externalNode: NodePath): Unit {
    TransferContext.writeArguments(NODE_PATH to externalNode)
    TransferContext.callMethod(ptr, MethodBindings.setOriginExternalNodePtr, NIL)
  }

  public final fun getOriginExternalNode(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOriginExternalNodePtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH) as NodePath)
  }

  public final fun setOriginOffset(offset: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to offset)
    TransferContext.callMethod(ptr, MethodBindings.setOriginOffsetPtr, NIL)
  }

  public final fun getOriginOffset(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOriginOffsetPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setDuration(duration: Float): Unit {
    TransferContext.writeArguments(DOUBLE to duration.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setDurationPtr, NIL)
  }

  public final fun getDuration(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDurationPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setTransitionType(transitionType: Tween.TransitionType): Unit {
    TransferContext.writeArguments(LONG to transitionType.id)
    TransferContext.callMethod(ptr, MethodBindings.setTransitionTypePtr, NIL)
  }

  public final fun getTransitionType(): Tween.TransitionType {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTransitionTypePtr, LONG)
    return Tween.TransitionType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setEaseType(easeType: Tween.EaseType): Unit {
    TransferContext.writeArguments(LONG to easeType.id)
    TransferContext.callMethod(ptr, MethodBindings.setEaseTypePtr, NIL)
  }

  public final fun getEaseType(): Tween.EaseType {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEaseTypePtr, LONG)
    return Tween.EaseType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setUseAngleLimitation(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setUseAngleLimitationPtr, NIL)
  }

  public final fun isUsingAngleLimitation(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isUsingAngleLimitationPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setSymmetryLimitation(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setSymmetryLimitationPtr, NIL)
  }

  public final fun isLimitationSymmetry(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isLimitationSymmetryPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setPrimaryLimitAngle(angle: Float): Unit {
    TransferContext.writeArguments(DOUBLE to angle.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setPrimaryLimitAnglePtr, NIL)
  }

  public final fun getPrimaryLimitAngle(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPrimaryLimitAnglePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setPrimaryDampThreshold(power: Float): Unit {
    TransferContext.writeArguments(DOUBLE to power.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setPrimaryDampThresholdPtr, NIL)
  }

  public final fun getPrimaryDampThreshold(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPrimaryDampThresholdPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setPrimaryPositiveLimitAngle(angle: Float): Unit {
    TransferContext.writeArguments(DOUBLE to angle.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setPrimaryPositiveLimitAnglePtr, NIL)
  }

  public final fun getPrimaryPositiveLimitAngle(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPrimaryPositiveLimitAnglePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setPrimaryPositiveDampThreshold(power: Float): Unit {
    TransferContext.writeArguments(DOUBLE to power.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setPrimaryPositiveDampThresholdPtr, NIL)
  }

  public final fun getPrimaryPositiveDampThreshold(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPrimaryPositiveDampThresholdPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setPrimaryNegativeLimitAngle(angle: Float): Unit {
    TransferContext.writeArguments(DOUBLE to angle.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setPrimaryNegativeLimitAnglePtr, NIL)
  }

  public final fun getPrimaryNegativeLimitAngle(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPrimaryNegativeLimitAnglePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setPrimaryNegativeDampThreshold(power: Float): Unit {
    TransferContext.writeArguments(DOUBLE to power.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setPrimaryNegativeDampThresholdPtr, NIL)
  }

  public final fun getPrimaryNegativeDampThreshold(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPrimaryNegativeDampThresholdPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSecondaryLimitAngle(angle: Float): Unit {
    TransferContext.writeArguments(DOUBLE to angle.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSecondaryLimitAnglePtr, NIL)
  }

  public final fun getSecondaryLimitAngle(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSecondaryLimitAnglePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSecondaryDampThreshold(power: Float): Unit {
    TransferContext.writeArguments(DOUBLE to power.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSecondaryDampThresholdPtr, NIL)
  }

  public final fun getSecondaryDampThreshold(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSecondaryDampThresholdPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSecondaryPositiveLimitAngle(angle: Float): Unit {
    TransferContext.writeArguments(DOUBLE to angle.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSecondaryPositiveLimitAnglePtr, NIL)
  }

  public final fun getSecondaryPositiveLimitAngle(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSecondaryPositiveLimitAnglePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSecondaryPositiveDampThreshold(power: Float): Unit {
    TransferContext.writeArguments(DOUBLE to power.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSecondaryPositiveDampThresholdPtr, NIL)
  }

  public final fun getSecondaryPositiveDampThreshold(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSecondaryPositiveDampThresholdPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSecondaryNegativeLimitAngle(angle: Float): Unit {
    TransferContext.writeArguments(DOUBLE to angle.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSecondaryNegativeLimitAnglePtr, NIL)
  }

  public final fun getSecondaryNegativeLimitAngle(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSecondaryNegativeLimitAnglePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSecondaryNegativeDampThreshold(power: Float): Unit {
    TransferContext.writeArguments(DOUBLE to power.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSecondaryNegativeDampThresholdPtr, NIL)
  }

  public final fun getSecondaryNegativeDampThreshold(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSecondaryNegativeDampThresholdPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the remaining seconds of the time-based interpolation.
   */
  public final fun getInterpolationRemaining(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getInterpolationRemainingPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns whether the time-based interpolation is running or not. If `true`, it is equivalent to
   * [getInterpolationRemaining] being `0`.
   * This is useful to determine whether a [LookAtModifier3D] can be removed safely.
   */
  public final fun isInterpolating(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isInterpolatingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns whether the target is within the angle limitations. It is useful for unsetting the
   * [targetNode] when the target is outside of the angle limitations.
   * **Note:** The value is updated after [SkeletonModifier3D.ProcessModification]. To retrieve this
   * value correctly, we recommend using the signal [signal SkeletonModifier3D.modification_processed].
   */
  public final fun isTargetWithinLimitation(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isTargetWithinLimitationPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setTargetNode(targetNode: String) = setTargetNode(targetNode.asCachedNodePath())

  public final fun setOriginExternalNode(externalNode: String) =
      setOriginExternalNode(externalNode.asCachedNodePath())

  public enum class OriginFrom(
    id: Long,
  ) {
    /**
     * The bone rest position of the bone specified in [bone] is used as origin.
     */
    ORIGIN_FROM_SELF(0),
    /**
     * The bone global pose position of the bone specified in [originBone] is used as origin.
     * **Note:** It is recommended that you select only the parent bone unless you are familiar with
     * the bone processing process. The specified bone pose at the time the [LookAtModifier3D] is
     * processed is used as a reference. In other words, if you specify a child bone and the
     * [LookAtModifier3D] causes the child bone to move, the rendered result and direction will not
     * match.
     */
    ORIGIN_FROM_SPECIFIC_BONE(1),
    /**
     * The global position of the [Node3D] specified in [originExternalNode] is used as origin.
     * **Note:** Same as [ORIGIN_FROM_SPECIFIC_BONE], when specifying a [BoneAttachment3D] with a
     * child bone assigned, the rendered result and direction will not match.
     */
    ORIGIN_FROM_EXTERNAL_NODE(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): OriginFrom = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val setTargetNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "set_target_node", 1348162250)

    internal val getTargetNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "get_target_node", 4075236667)

    internal val setBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "set_bone_name", 83702148)

    internal val getBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "get_bone_name", 201670096)

    internal val setBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "set_bone", 1286410249)

    internal val getBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "get_bone", 3905245786)

    internal val setForwardAxisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "set_forward_axis", 3199955933)

    internal val getForwardAxisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "get_forward_axis", 4076020284)

    internal val setPrimaryRotationAxisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "set_primary_rotation_axis", 1144690656)

    internal val getPrimaryRotationAxisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "get_primary_rotation_axis", 3050976882)

    internal val setUseSecondaryRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "set_use_secondary_rotation", 2586408642)

    internal val isUsingSecondaryRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "is_using_secondary_rotation", 36873697)

    internal val setOriginSafeMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "set_origin_safe_margin", 373806689)

    internal val getOriginSafeMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "get_origin_safe_margin", 1740695150)

    internal val setOriginFromPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "set_origin_from", 4254695669)

    internal val getOriginFromPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "get_origin_from", 4057166297)

    internal val setOriginBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "set_origin_bone_name", 83702148)

    internal val getOriginBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "get_origin_bone_name", 201670096)

    internal val setOriginBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "set_origin_bone", 1286410249)

    internal val getOriginBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "get_origin_bone", 3905245786)

    internal val setOriginExternalNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "set_origin_external_node", 1348162250)

    internal val getOriginExternalNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "get_origin_external_node", 4075236667)

    internal val setOriginOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "set_origin_offset", 3460891852)

    internal val getOriginOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "get_origin_offset", 3360562783)

    internal val setDurationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "set_duration", 373806689)

    internal val getDurationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "get_duration", 1740695150)

    internal val setTransitionTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "set_transition_type", 1058637742)

    internal val getTransitionTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "get_transition_type", 3842314528)

    internal val setEaseTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "set_ease_type", 1208105857)

    internal val getEaseTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "get_ease_type", 631880200)

    internal val setUseAngleLimitationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "set_use_angle_limitation", 2586408642)

    internal val isUsingAngleLimitationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "is_using_angle_limitation", 36873697)

    internal val setSymmetryLimitationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "set_symmetry_limitation", 2586408642)

    internal val isLimitationSymmetryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "is_limitation_symmetry", 36873697)

    internal val setPrimaryLimitAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "set_primary_limit_angle", 373806689)

    internal val getPrimaryLimitAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "get_primary_limit_angle", 1740695150)

    internal val setPrimaryDampThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "set_primary_damp_threshold", 373806689)

    internal val getPrimaryDampThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "get_primary_damp_threshold", 1740695150)

    internal val setPrimaryPositiveLimitAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "set_primary_positive_limit_angle", 373806689)

    internal val getPrimaryPositiveLimitAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "get_primary_positive_limit_angle", 1740695150)

    internal val setPrimaryPositiveDampThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "set_primary_positive_damp_threshold", 373806689)

    internal val getPrimaryPositiveDampThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "get_primary_positive_damp_threshold", 1740695150)

    internal val setPrimaryNegativeLimitAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "set_primary_negative_limit_angle", 373806689)

    internal val getPrimaryNegativeLimitAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "get_primary_negative_limit_angle", 1740695150)

    internal val setPrimaryNegativeDampThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "set_primary_negative_damp_threshold", 373806689)

    internal val getPrimaryNegativeDampThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "get_primary_negative_damp_threshold", 1740695150)

    internal val setSecondaryLimitAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "set_secondary_limit_angle", 373806689)

    internal val getSecondaryLimitAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "get_secondary_limit_angle", 1740695150)

    internal val setSecondaryDampThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "set_secondary_damp_threshold", 373806689)

    internal val getSecondaryDampThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "get_secondary_damp_threshold", 1740695150)

    internal val setSecondaryPositiveLimitAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "set_secondary_positive_limit_angle", 373806689)

    internal val getSecondaryPositiveLimitAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "get_secondary_positive_limit_angle", 1740695150)

    internal val setSecondaryPositiveDampThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "set_secondary_positive_damp_threshold", 373806689)

    internal val getSecondaryPositiveDampThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "get_secondary_positive_damp_threshold", 1740695150)

    internal val setSecondaryNegativeLimitAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "set_secondary_negative_limit_angle", 373806689)

    internal val getSecondaryNegativeLimitAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "get_secondary_negative_limit_angle", 1740695150)

    internal val setSecondaryNegativeDampThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "set_secondary_negative_damp_threshold", 373806689)

    internal val getSecondaryNegativeDampThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "get_secondary_negative_damp_threshold", 1740695150)

    internal val getInterpolationRemainingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "get_interpolation_remaining", 1740695150)

    internal val isInterpolatingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "is_interpolating", 36873697)

    internal val isTargetWithinLimitationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LookAtModifier3D", "is_target_within_limitation", 36873697)
  }
}
