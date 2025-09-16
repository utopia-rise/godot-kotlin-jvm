// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

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
import godot.core.VariantParser.OBJECT
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
 * This [SkeletonModifier3D] can be used to wiggle hair, cloth, and tails. This modifier behaves differently from [PhysicalBoneSimulator3D] as it attempts to return the original pose after modification.
 *
 * If you setup [setRootBone] and [setEndBone], it is treated as one bone chain. Note that it does not support a branched chain like Y-shaped chains.
 *
 * When a bone chain is created, an array is generated from the bones that exist in between and listed in the joint list.
 *
 * Several properties can be applied to each joint, such as [setJointStiffness], [setJointDrag], and [setJointGravity].
 *
 * For simplicity, you can set values to all joints at the same time by using a [Curve]. If you want to specify detailed values individually, set [setIndividualConfig] to `true`.
 *
 * For physical simulation, [SpringBoneSimulator3D] can have children as self-standing collisions that are not related to [PhysicsServer3D], see also [SpringBoneCollision3D].
 *
 * **Warning:** A scaled [SpringBoneSimulator3D] will likely not behave as expected. Make sure that the parent [Skeleton3D] and its bones are not scaled.
 */
@GodotBaseType
public open class SpringBoneSimulator3D : SkeletonModifier3D() {
  /**
   * The number of settings.
   */
  public final inline var settingCount: Int
    @JvmName("settingCountProperty")
    get() = getSettingCount()
    @JvmName("settingCountProperty")
    set(`value`) {
      setSettingCount(value)
    }

  override fun new(scriptIndex: Int) {
    createNativeObject(625, scriptIndex)
  }

  /**
   * Sets the root bone name of the bone chain.
   */
  public final fun setRootBoneName(index: Int, boneName: String) {
    TransferContext.writeArguments(LONG to index.toLong(), STRING to boneName)
    TransferContext.callMethod(ptr, MethodBindings.setRootBoneNamePtr, NIL)
  }

  /**
   * Returns the root bone name of the bone chain.
   */
  public final fun getRootBoneName(index: Int): String {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getRootBoneNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Sets the root bone index of the bone chain.
   */
  public final fun setRootBone(index: Int, bone: Int) {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to bone.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setRootBonePtr, NIL)
  }

  /**
   * Returns the root bone index of the bone chain.
   */
  public final fun getRootBone(index: Int): Int {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getRootBonePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the end bone name of the bone chain.
   *
   * **Note:** End bone must be the root bone or a child of the root bone. If they are the same, the tail must be extended by [setExtendEndBone] to jiggle the bone.
   */
  public final fun setEndBoneName(index: Int, boneName: String) {
    TransferContext.writeArguments(LONG to index.toLong(), STRING to boneName)
    TransferContext.callMethod(ptr, MethodBindings.setEndBoneNamePtr, NIL)
  }

  /**
   * Returns the end bone name of the bone chain.
   */
  public final fun getEndBoneName(index: Int): String {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getEndBoneNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Sets the end bone index of the bone chain.
   */
  public final fun setEndBone(index: Int, bone: Int) {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to bone.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setEndBonePtr, NIL)
  }

  /**
   * Returns the end bone index of the bone chain.
   */
  public final fun getEndBone(index: Int): Int {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getEndBonePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * If [enabled] is `true`, the end bone is extended to have the tail.
   *
   * The extended tail config is allocated to the last element in the joint list.
   *
   * In other words, if you set [enabled] is `false`, the config of last element in the joint list has no effect in the simulated result.
   */
  public final fun setExtendEndBone(index: Int, enabled: Boolean) {
    TransferContext.writeArguments(LONG to index.toLong(), BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setExtendEndBonePtr, NIL)
  }

  /**
   * Returns `true` if the end bone is extended to have the tail.
   */
  public final fun isEndBoneExtended(index: Int): Boolean {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isEndBoneExtendedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the end bone tail direction of the bone chain when [isEndBoneExtended] is `true`.
   */
  public final fun setEndBoneDirection(index: Int, boneDirection: BoneDirection) {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to boneDirection.id)
    TransferContext.callMethod(ptr, MethodBindings.setEndBoneDirectionPtr, NIL)
  }

  /**
   * Returns the end bone's tail direction of the bone chain when [isEndBoneExtended] is `true`.
   */
  public final fun getEndBoneDirection(index: Int): BoneDirection {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getEndBoneDirectionPtr, LONG)
    return BoneDirection.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the end bone tail length of the bone chain when [isEndBoneExtended] is `true`.
   */
  public final fun setEndBoneLength(index: Int, length: Float) {
    TransferContext.writeArguments(LONG to index.toLong(), DOUBLE to length.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setEndBoneLengthPtr, NIL)
  }

  /**
   * Returns the end bone's tail length of the bone chain when [isEndBoneExtended] is `true`.
   */
  public final fun getEndBoneLength(index: Int): Float {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getEndBoneLengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets what the center originates from in the bone chain.
   *
   * Bone movement is calculated based on the difference in relative distance between center and bone in the previous and next frames.
   *
   * For example, if the parent [Skeleton3D] is used as the center, the bones are considered to have not moved if the [Skeleton3D] moves in the world.
   *
   * In this case, only a change in the bone pose is considered to be a bone movement.
   */
  public final fun setCenterFrom(index: Int, centerFrom: CenterFrom) {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to centerFrom.id)
    TransferContext.callMethod(ptr, MethodBindings.setCenterFromPtr, NIL)
  }

  /**
   * Returns what the center originates from in the bone chain.
   */
  public final fun getCenterFrom(index: Int): CenterFrom {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getCenterFromPtr, LONG)
    return CenterFrom.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the center node path of the bone chain.
   */
  public final fun setCenterNode(index: Int, nodePath: NodePath) {
    TransferContext.writeArguments(LONG to index.toLong(), NODE_PATH to nodePath)
    TransferContext.callMethod(ptr, MethodBindings.setCenterNodePtr, NIL)
  }

  /**
   * Returns the center node path of the bone chain.
   */
  public final fun getCenterNode(index: Int): NodePath {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getCenterNodePtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH) as NodePath)
  }

  /**
   * Sets the center bone name of the bone chain.
   */
  public final fun setCenterBoneName(index: Int, boneName: String) {
    TransferContext.writeArguments(LONG to index.toLong(), STRING to boneName)
    TransferContext.callMethod(ptr, MethodBindings.setCenterBoneNamePtr, NIL)
  }

  /**
   * Returns the center bone name of the bone chain.
   */
  public final fun getCenterBoneName(index: Int): String {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getCenterBoneNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Sets the center bone index of the bone chain.
   */
  public final fun setCenterBone(index: Int, bone: Int) {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to bone.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setCenterBonePtr, NIL)
  }

  /**
   * Returns the center bone index of the bone chain.
   */
  public final fun getCenterBone(index: Int): Int {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getCenterBonePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the joint radius of the bone chain. It is used to move and slide with the [SpringBoneCollision3D] in the collision list.
   *
   * The value is scaled by [setRadiusDampingCurve] and cached in each joint setting in the joint list.
   */
  public final fun setRadius(index: Int, radius: Float) {
    TransferContext.writeArguments(LONG to index.toLong(), DOUBLE to radius.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setRadiusPtr, NIL)
  }

  /**
   * Returns the joint radius of the bone chain.
   */
  public final fun getRadius(index: Int): Float {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getRadiusPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the rotation axis of the bone chain. If sets a specific axis, it acts like a hinge joint.
   *
   * The value is cached in each joint setting in the joint list.
   *
   * **Note:** The rotation axis and the forward vector shouldn't be colinear to avoid unintended rotation since [SpringBoneSimulator3D] does not factor in twisting forces.
   */
  public final fun setRotationAxis(index: Int, axis: RotationAxis) {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to axis.id)
    TransferContext.callMethod(ptr, MethodBindings.setRotationAxisPtr, NIL)
  }

  /**
   * Returns the rotation axis of the bone chain.
   */
  public final fun getRotationAxis(index: Int): RotationAxis {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getRotationAxisPtr, LONG)
    return RotationAxis.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the joint radius damping curve of the bone chain.
   */
  public final fun setRadiusDampingCurve(index: Int, curve: Curve?) {
    TransferContext.writeArguments(LONG to index.toLong(), OBJECT to curve)
    TransferContext.callMethod(ptr, MethodBindings.setRadiusDampingCurvePtr, NIL)
  }

  /**
   * Returns the joint radius damping curve of the bone chain.
   */
  public final fun getRadiusDampingCurve(index: Int): Curve? {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getRadiusDampingCurvePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Curve?)
  }

  /**
   * Sets the stiffness force of the bone chain. The greater the value, the faster it recovers to its initial pose.
   *
   * If [stiffness] is `0`, the modified pose will not return to the original pose.
   *
   * The value is scaled by [setStiffnessDampingCurve] and cached in each joint setting in the joint list.
   */
  public final fun setStiffness(index: Int, stiffness: Float) {
    TransferContext.writeArguments(LONG to index.toLong(), DOUBLE to stiffness.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setStiffnessPtr, NIL)
  }

  /**
   * Returns the stiffness force of the bone chain.
   */
  public final fun getStiffness(index: Int): Float {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getStiffnessPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the stiffness force damping curve of the bone chain.
   */
  public final fun setStiffnessDampingCurve(index: Int, curve: Curve?) {
    TransferContext.writeArguments(LONG to index.toLong(), OBJECT to curve)
    TransferContext.callMethod(ptr, MethodBindings.setStiffnessDampingCurvePtr, NIL)
  }

  /**
   * Returns the stiffness force damping curve of the bone chain.
   */
  public final fun getStiffnessDampingCurve(index: Int): Curve? {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getStiffnessDampingCurvePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Curve?)
  }

  /**
   * Sets the drag force of the bone chain. The greater the value, the more suppressed the wiggling.
   *
   * The value is scaled by [setDragDampingCurve] and cached in each joint setting in the joint list.
   */
  public final fun setDrag(index: Int, drag: Float) {
    TransferContext.writeArguments(LONG to index.toLong(), DOUBLE to drag.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setDragPtr, NIL)
  }

  /**
   * Returns the drag force damping curve of the bone chain.
   */
  public final fun getDrag(index: Int): Float {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getDragPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the drag force damping curve of the bone chain.
   */
  public final fun setDragDampingCurve(index: Int, curve: Curve?) {
    TransferContext.writeArguments(LONG to index.toLong(), OBJECT to curve)
    TransferContext.callMethod(ptr, MethodBindings.setDragDampingCurvePtr, NIL)
  }

  /**
   * Returns the drag force damping curve of the bone chain.
   */
  public final fun getDragDampingCurve(index: Int): Curve? {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getDragDampingCurvePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Curve?)
  }

  /**
   * Sets the gravity amount of the bone chain. This value is not an acceleration, but a constant velocity of movement in [setGravityDirection].
   *
   * If [gravity] is not `0`, the modified pose will not return to the original pose since it is always affected by gravity.
   *
   * The value is scaled by [setGravityDampingCurve] and cached in each joint setting in the joint list.
   */
  public final fun setGravity(index: Int, gravity: Float) {
    TransferContext.writeArguments(LONG to index.toLong(), DOUBLE to gravity.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setGravityPtr, NIL)
  }

  /**
   * Returns the gravity amount of the bone chain.
   */
  public final fun getGravity(index: Int): Float {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getGravityPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the gravity amount damping curve of the bone chain.
   */
  public final fun setGravityDampingCurve(index: Int, curve: Curve?) {
    TransferContext.writeArguments(LONG to index.toLong(), OBJECT to curve)
    TransferContext.callMethod(ptr, MethodBindings.setGravityDampingCurvePtr, NIL)
  }

  /**
   * Returns the gravity amount damping curve of the bone chain.
   */
  public final fun getGravityDampingCurve(index: Int): Curve? {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getGravityDampingCurvePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Curve?)
  }

  /**
   * Sets the gravity direction of the bone chain. This value is internally normalized and then multiplied by [setGravity].
   *
   * The value is cached in each joint setting in the joint list.
   */
  public final fun setGravityDirection(index: Int, gravityDirection: Vector3) {
    TransferContext.writeArguments(LONG to index.toLong(), VECTOR3 to gravityDirection)
    TransferContext.callMethod(ptr, MethodBindings.setGravityDirectionPtr, NIL)
  }

  /**
   * Returns the gravity direction of the bone chain.
   */
  public final fun getGravityDirection(index: Int): Vector3 {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getGravityDirectionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setSettingCount(count: Int) {
    TransferContext.writeArguments(LONG to count.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setSettingCountPtr, NIL)
  }

  public final fun getSettingCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSettingCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Clears all settings.
   */
  public final fun clearSettings() {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearSettingsPtr, NIL)
  }

  /**
   * If [enabled] is `true`, the config can be edited individually for each joint.
   */
  public final fun setIndividualConfig(index: Int, enabled: Boolean) {
    TransferContext.writeArguments(LONG to index.toLong(), BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setIndividualConfigPtr, NIL)
  }

  /**
   * Returns `true` if the config can be edited individually for each joint.
   */
  public final fun isConfigIndividual(index: Int): Boolean {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isConfigIndividualPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the bone name at [joint] in the bone chain's joint list.
   */
  public final fun getJointBoneName(index: Int, joint: Int): String {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to joint.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getJointBoneNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the bone index at [joint] in the bone chain's joint list.
   */
  public final fun getJointBone(index: Int, joint: Int): Int {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to joint.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getJointBonePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the rotation axis at [joint] in the bone chain's joint list when [isConfigIndividual] is `true`.
   */
  public final fun setJointRotationAxis(
    index: Int,
    joint: Int,
    axis: RotationAxis,
  ) {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to joint.toLong(), LONG to axis.id)
    TransferContext.callMethod(ptr, MethodBindings.setJointRotationAxisPtr, NIL)
  }

  /**
   * Returns the rotation axis at [joint] in the bone chain's joint list.
   */
  public final fun getJointRotationAxis(index: Int, joint: Int): RotationAxis {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to joint.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getJointRotationAxisPtr, LONG)
    return RotationAxis.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the joint radius at [joint] in the bone chain's joint list when [isConfigIndividual] is `true`.
   */
  public final fun setJointRadius(
    index: Int,
    joint: Int,
    radius: Float,
  ) {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to joint.toLong(), DOUBLE to radius.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setJointRadiusPtr, NIL)
  }

  /**
   * Returns the radius at [joint] in the bone chain's joint list.
   */
  public final fun getJointRadius(index: Int, joint: Int): Float {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to joint.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getJointRadiusPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the stiffness force at [joint] in the bone chain's joint list when [isConfigIndividual] is `true`.
   */
  public final fun setJointStiffness(
    index: Int,
    joint: Int,
    stiffness: Float,
  ) {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to joint.toLong(), DOUBLE to stiffness.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setJointStiffnessPtr, NIL)
  }

  /**
   * Returns the stiffness force at [joint] in the bone chain's joint list.
   */
  public final fun getJointStiffness(index: Int, joint: Int): Float {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to joint.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getJointStiffnessPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the drag force at [joint] in the bone chain's joint list when [isConfigIndividual] is `true`.
   */
  public final fun setJointDrag(
    index: Int,
    joint: Int,
    drag: Float,
  ) {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to joint.toLong(), DOUBLE to drag.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setJointDragPtr, NIL)
  }

  /**
   * Returns the drag force at [joint] in the bone chain's joint list.
   */
  public final fun getJointDrag(index: Int, joint: Int): Float {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to joint.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getJointDragPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the gravity amount at [joint] in the bone chain's joint list when [isConfigIndividual] is `true`.
   */
  public final fun setJointGravity(
    index: Int,
    joint: Int,
    gravity: Float,
  ) {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to joint.toLong(), DOUBLE to gravity.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setJointGravityPtr, NIL)
  }

  /**
   * Returns the gravity amount at [joint] in the bone chain's joint list.
   */
  public final fun getJointGravity(index: Int, joint: Int): Float {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to joint.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getJointGravityPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the gravity direction at [joint] in the bone chain's joint list when [isConfigIndividual] is `true`.
   */
  public final fun setJointGravityDirection(
    index: Int,
    joint: Int,
    gravityDirection: Vector3,
  ) {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to joint.toLong(), VECTOR3 to gravityDirection)
    TransferContext.callMethod(ptr, MethodBindings.setJointGravityDirectionPtr, NIL)
  }

  /**
   * Returns the gravity direction at [joint] in the bone chain's joint list.
   */
  public final fun getJointGravityDirection(index: Int, joint: Int): Vector3 {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to joint.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getJointGravityDirectionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns the joint count of the bone chain's joint list.
   */
  public final fun getJointCount(index: Int): Int {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getJointCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * If sets [enabled] to `true`, the all child [SpringBoneCollision3D]s are collided and [setExcludeCollisionPath] is enabled as an exclusion list at [index] in the settings.
   *
   * If sets [enabled] to `false`, you need to manually register all valid collisions with [setCollisionPath].
   */
  public final fun setEnableAllChildCollisions(index: Int, enabled: Boolean) {
    TransferContext.writeArguments(LONG to index.toLong(), BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setEnableAllChildCollisionsPtr, NIL)
  }

  /**
   * Returns `true` if the all child [SpringBoneCollision3D]s are contained in the collision list at [index] in the settings.
   */
  public final fun areAllChildCollisionsEnabled(index: Int): Boolean {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.areAllChildCollisionsEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the node path of the [SpringBoneCollision3D] at [collision] in the bone chain's exclude collision list when [areAllChildCollisionsEnabled] is `true`.
   */
  public final fun setExcludeCollisionPath(
    index: Int,
    collision: Int,
    nodePath: NodePath,
  ) {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to collision.toLong(), NODE_PATH to nodePath)
    TransferContext.callMethod(ptr, MethodBindings.setExcludeCollisionPathPtr, NIL)
  }

  /**
   * Returns the node path of the [SpringBoneCollision3D] at [collision] in the bone chain's exclude collision list when [areAllChildCollisionsEnabled] is `true`.
   */
  public final fun getExcludeCollisionPath(index: Int, collision: Int): NodePath {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to collision.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getExcludeCollisionPathPtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH) as NodePath)
  }

  /**
   * Sets the number of exclude collisions in the exclude collision list at [index] in the settings when [areAllChildCollisionsEnabled] is `true`.
   */
  public final fun setExcludeCollisionCount(index: Int, count: Int) {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to count.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setExcludeCollisionCountPtr, NIL)
  }

  /**
   * Returns the exclude collision count of the bone chain's exclude collision list when [areAllChildCollisionsEnabled] is `true`.
   */
  public final fun getExcludeCollisionCount(index: Int): Int {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getExcludeCollisionCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Clears all exclude collisions from the collision list at [index] in the settings when [areAllChildCollisionsEnabled] is `true`.
   */
  public final fun clearExcludeCollisions(index: Int) {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.clearExcludeCollisionsPtr, NIL)
  }

  /**
   * Sets the node path of the [SpringBoneCollision3D] at [collision] in the bone chain's collision list when [areAllChildCollisionsEnabled] is `false`.
   */
  public final fun setCollisionPath(
    index: Int,
    collision: Int,
    nodePath: NodePath,
  ) {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to collision.toLong(), NODE_PATH to nodePath)
    TransferContext.callMethod(ptr, MethodBindings.setCollisionPathPtr, NIL)
  }

  /**
   * Returns the node path of the [SpringBoneCollision3D] at [collision] in the bone chain's collision list when [areAllChildCollisionsEnabled] is `false`.
   */
  public final fun getCollisionPath(index: Int, collision: Int): NodePath {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to collision.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getCollisionPathPtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH) as NodePath)
  }

  /**
   * Sets the number of collisions in the collision list at [index] in the settings when [areAllChildCollisionsEnabled] is `false`.
   */
  public final fun setCollisionCount(index: Int, count: Int) {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to count.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setCollisionCountPtr, NIL)
  }

  /**
   * Returns the collision count of the bone chain's collision list when [areAllChildCollisionsEnabled] is `false`.
   */
  public final fun getCollisionCount(index: Int): Int {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getCollisionCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Clears all collisions from the collision list at [index] in the settings when [areAllChildCollisionsEnabled] is `false`.
   */
  public final fun clearCollisions(index: Int) {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.clearCollisionsPtr, NIL)
  }

  /**
   * Resets a simulating state with respect to the current bone pose.
   *
   * It is useful to prevent the simulation result getting violent. For example, calling this immediately after a call to [AnimationPlayer.play] without a fading, or within the previous [signal SkeletonModifier3D.modification_processed] signal if it's condition changes significantly.
   */
  public final fun reset() {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.resetPtr, NIL)
  }

  /**
   * Sets the center node path of the bone chain.
   */
  public final fun setCenterNode(index: Int, nodePath: String): Unit = setCenterNode(index, nodePath.asCachedNodePath())

  /**
   * Sets the node path of the [SpringBoneCollision3D] at [collision] in the bone chain's exclude collision list when [areAllChildCollisionsEnabled] is `true`.
   */
  public final fun setExcludeCollisionPath(
    index: Int,
    collision: Int,
    nodePath: String,
  ): Unit = setExcludeCollisionPath(index, collision, nodePath.asCachedNodePath())

  /**
   * Sets the node path of the [SpringBoneCollision3D] at [collision] in the bone chain's collision list when [areAllChildCollisionsEnabled] is `false`.
   */
  public final fun setCollisionPath(
    index: Int,
    collision: Int,
    nodePath: String,
  ): Unit = setCollisionPath(index, collision, nodePath.asCachedNodePath())

  public enum class BoneDirection(
    id: Long,
  ) {
    /**
     * Enumerated value for the +X axis.
     */
    PLUS_X(0),
    /**
     * Enumerated value for the -X axis.
     */
    MINUS_X(1),
    /**
     * Enumerated value for the +Y axis.
     */
    PLUS_Y(2),
    /**
     * Enumerated value for the -Y axis.
     */
    MINUS_Y(3),
    /**
     * Enumerated value for the +Z axis.
     */
    PLUS_Z(4),
    /**
     * Enumerated value for the -Z axis.
     */
    MINUS_Z(5),
    /**
     * Enumerated value for the axis from a parent bone to the child bone.
     */
    FROM_PARENT(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): BoneDirection = entries.single { it.id == `value` }
    }
  }

  public enum class CenterFrom(
    id: Long,
  ) {
    /**
     * The world origin is defined as center.
     */
    WORLD_ORIGIN(0),
    /**
     * The [Node3D] specified by [setCenterNode] is defined as center.
     *
     * If [Node3D] is not found, the parent [Skeleton3D] is treated as center.
     */
    NODE(1),
    /**
     * The bone pose origin of the parent [Skeleton3D] specified by [setCenterBone] is defined as center.
     *
     * If [Node3D] is not found, the parent [Skeleton3D] is treated as center.
     */
    BONE(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CenterFrom = entries.single { it.id == `value` }
    }
  }

  public enum class RotationAxis(
    id: Long,
  ) {
    /**
     * Enumerated value for the rotation of the X axis.
     */
    X(0),
    /**
     * Enumerated value for the rotation of the Y axis.
     */
    Y(1),
    /**
     * Enumerated value for the rotation of the Z axis.
     */
    Z(2),
    /**
     * Enumerated value for the unconstrained rotation.
     */
    ALL(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): RotationAxis = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val setRootBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "set_root_bone_name", 501_894_301)

    internal val getRootBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "get_root_bone_name", 844_755_477)

    internal val setRootBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "set_root_bone", 3_937_882_851)

    internal val getRootBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "get_root_bone", 923_996_154)

    internal val setEndBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "set_end_bone_name", 501_894_301)

    internal val getEndBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "get_end_bone_name", 844_755_477)

    internal val setEndBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "set_end_bone", 3_937_882_851)

    internal val getEndBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "get_end_bone", 923_996_154)

    internal val setExtendEndBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "set_extend_end_bone", 300_928_843)

    internal val isEndBoneExtendedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "is_end_bone_extended", 1_116_898_809)

    internal val setEndBoneDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "set_end_bone_direction", 204_796_492)

    internal val getEndBoneDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "get_end_bone_direction", 2_438_315_700)

    internal val setEndBoneLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "set_end_bone_length", 1_602_489_585)

    internal val getEndBoneLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "get_end_bone_length", 2_339_986_948)

    internal val setCenterFromPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "set_center_from", 2_551_505_749)

    internal val getCenterFromPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "get_center_from", 2_721_930_813)

    internal val setCenterNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "set_center_node", 2_761_262_315)

    internal val getCenterNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "get_center_node", 408_788_394)

    internal val setCenterBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "set_center_bone_name", 501_894_301)

    internal val getCenterBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "get_center_bone_name", 844_755_477)

    internal val setCenterBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "set_center_bone", 3_937_882_851)

    internal val getCenterBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "get_center_bone", 923_996_154)

    internal val setRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "set_radius", 1_602_489_585)

    internal val getRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "get_radius", 2_339_986_948)

    internal val setRotationAxisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "set_rotation_axis", 3_534_169_209)

    internal val getRotationAxisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "get_rotation_axis", 748_837_671)

    internal val setRadiusDampingCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "set_radius_damping_curve", 1_447_180_063)

    internal val getRadiusDampingCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "get_radius_damping_curve", 747_537_754)

    internal val setStiffnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "set_stiffness", 1_602_489_585)

    internal val getStiffnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "get_stiffness", 2_339_986_948)

    internal val setStiffnessDampingCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "set_stiffness_damping_curve", 1_447_180_063)

    internal val getStiffnessDampingCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "get_stiffness_damping_curve", 747_537_754)

    internal val setDragPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "set_drag", 1_602_489_585)

    internal val getDragPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "get_drag", 2_339_986_948)

    internal val setDragDampingCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "set_drag_damping_curve", 1_447_180_063)

    internal val getDragDampingCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "get_drag_damping_curve", 747_537_754)

    internal val setGravityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "set_gravity", 1_602_489_585)

    internal val getGravityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "get_gravity", 2_339_986_948)

    internal val setGravityDampingCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "set_gravity_damping_curve", 1_447_180_063)

    internal val getGravityDampingCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "get_gravity_damping_curve", 747_537_754)

    internal val setGravityDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "set_gravity_direction", 1_530_502_735)

    internal val getGravityDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "get_gravity_direction", 711_720_468)

    internal val setSettingCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "set_setting_count", 1_286_410_249)

    internal val getSettingCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "get_setting_count", 3_905_245_786)

    internal val clearSettingsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "clear_settings", 3_218_959_716)

    internal val setIndividualConfigPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "set_individual_config", 300_928_843)

    internal val isConfigIndividualPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "is_config_individual", 1_116_898_809)

    internal val getJointBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "get_joint_bone_name", 1_391_810_591)

    internal val getJointBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "get_joint_bone", 3_175_239_445)

    internal val setJointRotationAxisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "set_joint_rotation_axis", 4_224_018_032)

    internal val getJointRotationAxisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "get_joint_rotation_axis", 2_488_679_199)

    internal val setJointRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "set_joint_radius", 3_506_521_499)

    internal val getJointRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "get_joint_radius", 3_085_491_603)

    internal val setJointStiffnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "set_joint_stiffness", 3_506_521_499)

    internal val getJointStiffnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "get_joint_stiffness", 3_085_491_603)

    internal val setJointDragPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "set_joint_drag", 3_506_521_499)

    internal val getJointDragPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "get_joint_drag", 3_085_491_603)

    internal val setJointGravityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "set_joint_gravity", 3_506_521_499)

    internal val getJointGravityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "get_joint_gravity", 3_085_491_603)

    internal val setJointGravityDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "set_joint_gravity_direction", 2_866_752_138)

    internal val getJointGravityDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "get_joint_gravity_direction", 1_592_972_041)

    internal val getJointCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "get_joint_count", 923_996_154)

    internal val setEnableAllChildCollisionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "set_enable_all_child_collisions", 300_928_843)

    internal val areAllChildCollisionsEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "are_all_child_collisions_enabled", 1_116_898_809)

    internal val setExcludeCollisionPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "set_exclude_collision_path", 132_481_804)

    internal val getExcludeCollisionPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "get_exclude_collision_path", 464_924_783)

    internal val setExcludeCollisionCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "set_exclude_collision_count", 3_937_882_851)

    internal val getExcludeCollisionCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "get_exclude_collision_count", 923_996_154)

    internal val clearExcludeCollisionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "clear_exclude_collisions", 1_286_410_249)

    internal val setCollisionPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "set_collision_path", 132_481_804)

    internal val getCollisionPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "get_collision_path", 464_924_783)

    internal val setCollisionCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "set_collision_count", 3_937_882_851)

    internal val getCollisionCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "get_collision_count", 923_996_154)

    internal val clearCollisionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "clear_collisions", 1_286_410_249)

    internal val resetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SpringBoneSimulator3D", "reset", 3_218_959_716)
  }
}
