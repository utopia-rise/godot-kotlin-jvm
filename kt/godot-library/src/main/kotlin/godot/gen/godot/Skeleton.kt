// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.RID
import godot.core.TransferContext
import godot.core.Transform
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.TRANSFORM
import godot.core.VariantType._RID
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class Skeleton : Spatial() {
  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_SKELETON)

  open fun addBone(name: String) {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON_ADD_BONE, NIL)
  }

  open fun bindChildNodeToBone(boneIdx: Long, node: Node) {
    TransferContext.writeArguments(LONG to boneIdx, OBJECT to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON_BIND_CHILD_NODE_TO_BONE,
        NIL)
  }

  open fun clearBones() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON_CLEAR_BONES, NIL)
  }

  open fun clearBonesGlobalPoseOverride() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETON_CLEAR_BONES_GLOBAL_POSE_OVERRIDE, NIL)
  }

  open fun findBone(name: String): Long {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON_FIND_BONE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getBoneCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON_GET_BONE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getBoneCustomPose(boneIdx: Long): Transform {
    TransferContext.writeArguments(LONG to boneIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON_GET_BONE_CUSTOM_POSE,
        TRANSFORM)
    return TransferContext.readReturnValue(TRANSFORM, false) as Transform
  }

  open fun getBoneGlobalPose(boneIdx: Long): Transform {
    TransferContext.writeArguments(LONG to boneIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON_GET_BONE_GLOBAL_POSE,
        TRANSFORM)
    return TransferContext.readReturnValue(TRANSFORM, false) as Transform
  }

  open fun getBoneName(boneIdx: Long): String {
    TransferContext.writeArguments(LONG to boneIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON_GET_BONE_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getBoneParent(boneIdx: Long): Long {
    TransferContext.writeArguments(LONG to boneIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON_GET_BONE_PARENT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getBonePose(boneIdx: Long): Transform {
    TransferContext.writeArguments(LONG to boneIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON_GET_BONE_POSE, TRANSFORM)
    return TransferContext.readReturnValue(TRANSFORM, false) as Transform
  }

  open fun getBoneRest(boneIdx: Long): Transform {
    TransferContext.writeArguments(LONG to boneIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON_GET_BONE_REST, TRANSFORM)
    return TransferContext.readReturnValue(TRANSFORM, false) as Transform
  }

  open fun getBoundChildNodesToBone(boneIdx: Long): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to boneIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETON_GET_BOUND_CHILD_NODES_TO_BONE, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  open fun isBoneRestDisabled(boneIdx: Long): Boolean {
    TransferContext.writeArguments(LONG to boneIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON_IS_BONE_REST_DISABLED,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun localizeRests() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON_LOCALIZE_RESTS, NIL)
  }

  open fun physicalBonesAddCollisionException(exception: RID) {
    TransferContext.writeArguments(_RID to exception)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETON_PHYSICAL_BONES_ADD_COLLISION_EXCEPTION, NIL)
  }

  open fun physicalBonesRemoveCollisionException(exception: RID) {
    TransferContext.writeArguments(_RID to exception)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETON_PHYSICAL_BONES_REMOVE_COLLISION_EXCEPTION, NIL)
  }

  open fun physicalBonesStartSimulation(bones: VariantArray<Any?> = VariantArray()) {
    TransferContext.writeArguments(ARRAY to bones)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETON_PHYSICAL_BONES_START_SIMULATION, NIL)
  }

  open fun physicalBonesStopSimulation() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETON_PHYSICAL_BONES_STOP_SIMULATION, NIL)
  }

  open fun registerSkin(skin: Skin): SkinReference? {
    TransferContext.writeArguments(OBJECT to skin)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON_REGISTER_SKIN, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as SkinReference?
  }

  open fun setBoneCustomPose(boneIdx: Long, customPose: Transform) {
    TransferContext.writeArguments(LONG to boneIdx, TRANSFORM to customPose)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON_SET_BONE_CUSTOM_POSE, NIL)
  }

  open fun setBoneDisableRest(boneIdx: Long, disable: Boolean) {
    TransferContext.writeArguments(LONG to boneIdx, BOOL to disable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON_SET_BONE_DISABLE_REST, NIL)
  }

  open fun setBoneGlobalPoseOverride(
    boneIdx: Long,
    pose: Transform,
    amount: Double,
    persistent: Boolean = false
  ) {
    TransferContext.writeArguments(LONG to boneIdx, TRANSFORM to pose, DOUBLE to amount, BOOL to
        persistent)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETON_SET_BONE_GLOBAL_POSE_OVERRIDE, NIL)
  }

  open fun setBoneParent(boneIdx: Long, parentIdx: Long) {
    TransferContext.writeArguments(LONG to boneIdx, LONG to parentIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON_SET_BONE_PARENT, NIL)
  }

  open fun setBonePose(boneIdx: Long, pose: Transform) {
    TransferContext.writeArguments(LONG to boneIdx, TRANSFORM to pose)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON_SET_BONE_POSE, NIL)
  }

  open fun setBoneRest(boneIdx: Long, rest: Transform) {
    TransferContext.writeArguments(LONG to boneIdx, TRANSFORM to rest)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON_SET_BONE_REST, NIL)
  }

  open fun unbindChildNodeFromBone(boneIdx: Long, node: Node) {
    TransferContext.writeArguments(LONG to boneIdx, OBJECT to node)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETON_UNBIND_CHILD_NODE_FROM_BONE, NIL)
  }

  open fun unparentBoneAndRest(boneIdx: Long) {
    TransferContext.writeArguments(LONG to boneIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON_UNPARENT_BONE_AND_REST,
        NIL)
  }

  companion object {
    final const val NOTIFICATION_UPDATE_SKELETON: Long = 50
  }
}
