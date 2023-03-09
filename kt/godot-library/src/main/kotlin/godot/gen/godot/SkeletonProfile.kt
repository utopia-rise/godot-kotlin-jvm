// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.Transform3D
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.TRANSFORM3D
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Profile of a virtual skeleton used as a target for retargeting.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/assets_pipeline/retargeting_3d_skeletons.html]($DOCS_URL/tutorials/assets_pipeline/retargeting_3d_skeletons.html)
 *
 * This resource is used in [godot.EditorScenePostImport]. Some parameters are referring to bones in [godot.Skeleton3D], [godot.Skin], [godot.Animation], and some other nodes are rewritten based on the parameters of [godot.SkeletonProfile].
 *
 * **Note:** These parameters need to be set only when creating a custom profile. In [godot.SkeletonProfileHumanoid], they are defined internally as read-only values.
 */
@GodotBaseType
public open class SkeletonProfile : Resource() {
  /**
   * This signal is emitted when change the value in profile. This is used to update key name in the [godot.BoneMap] and to redraw the [godot.BoneMap] editor.
   *
   * **Note:** This signal is not connected directly to editor to simplify the reference, instead it is passed on to editor through the [godot.BoneMap].
   */
  public val profileUpdated: Signal0 by signal()

  /**
   * A bone name that will be used as the root bone in [godot.AnimationTree]. This should be the bone of the parent of hips that exists at the world origin.
   */
  public var rootBone: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONPROFILE_GET_ROOT_BONE,
          STRING_NAME)
      return TransferContext.readReturnValue(STRING_NAME, false) as StringName
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONPROFILE_SET_ROOT_BONE,
          NIL)
    }

  /**
   * A bone name which will use model's height as the coefficient for normalization. For example, [godot.SkeletonProfileHumanoid] defines it as `Hips`.
   */
  public var scaleBaseBone: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONPROFILE_GET_SCALE_BASE_BONE, STRING_NAME)
      return TransferContext.readReturnValue(STRING_NAME, false) as StringName
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONPROFILE_SET_SCALE_BASE_BONE, NIL)
    }

  /**
   * The amount of groups of bones in retargeting section's [godot.BoneMap] editor. For example, [godot.SkeletonProfileHumanoid] has 4 groups.
   *
   * This property exists to separate the bone list into several sections in the editor.
   */
  public var groupSize: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONPROFILE_GET_GROUP_SIZE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONPROFILE_SET_GROUP_SIZE,
          NIL)
    }

  /**
   * The amount of bones in retargeting section's [godot.BoneMap] editor. For example, [godot.SkeletonProfileHumanoid] has 56 bones.
   *
   * The size of elements in [godot.BoneMap] updates when changing this property in it's assigned [godot.SkeletonProfile].
   */
  public var boneSize: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONPROFILE_GET_BONE_SIZE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONPROFILE_SET_BONE_SIZE,
          NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SKELETONPROFILE, scriptIndex)
    return true
  }

  /**
   * Returns the name of the group at [groupIdx] that will be the drawing group in the [godot.BoneMap] editor.
   */
  public fun getGroupName(groupIdx: Long): StringName {
    TransferContext.writeArguments(LONG to groupIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONPROFILE_GET_GROUP_NAME,
        STRING_NAME)
    return TransferContext.readReturnValue(STRING_NAME, false) as StringName
  }

  /**
   * Sets the name of the group at [groupIdx] that will be the drawing group in the [godot.BoneMap] editor.
   */
  public fun setGroupName(groupIdx: Long, groupName: StringName): Unit {
    TransferContext.writeArguments(LONG to groupIdx, STRING_NAME to groupName)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONPROFILE_SET_GROUP_NAME, NIL)
  }

  /**
   * Returns the texture of the group at [groupIdx] that will be the drawing group background image in the [godot.BoneMap] editor.
   */
  public fun getTexture(groupIdx: Long): Texture2D? {
    TransferContext.writeArguments(LONG to groupIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONPROFILE_GET_TEXTURE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
  }

  /**
   * Sets the texture of the group at [groupIdx] that will be the drawing group background image in the [godot.BoneMap] editor.
   */
  public fun setTexture(groupIdx: Long, texture: Texture2D): Unit {
    TransferContext.writeArguments(LONG to groupIdx, OBJECT to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONPROFILE_SET_TEXTURE, NIL)
  }

  /**
   * Returns the bone index that matches [boneName] as its name.
   */
  public fun findBone(boneName: StringName): Long {
    TransferContext.writeArguments(STRING_NAME to boneName)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONPROFILE_FIND_BONE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the name of the bone at [boneIdx] that will be the key name in the [godot.BoneMap].
   *
   * In the retargeting process, the returned bone name is the bone name of the target skeleton.
   */
  public fun getBoneName(boneIdx: Long): StringName {
    TransferContext.writeArguments(LONG to boneIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONPROFILE_GET_BONE_NAME,
        STRING_NAME)
    return TransferContext.readReturnValue(STRING_NAME, false) as StringName
  }

  /**
   * Sets the name of the bone at [boneIdx] that will be the key name in the [godot.BoneMap].
   *
   * In the retargeting process, the setting bone name is the bone name of the target skeleton.
   */
  public fun setBoneName(boneIdx: Long, boneName: StringName): Unit {
    TransferContext.writeArguments(LONG to boneIdx, STRING_NAME to boneName)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONPROFILE_SET_BONE_NAME, NIL)
  }

  /**
   * Returns the name of the bone which is the parent to the bone at [boneIdx]. The result is empty if the bone has no parent.
   */
  public fun getBoneParent(boneIdx: Long): StringName {
    TransferContext.writeArguments(LONG to boneIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONPROFILE_GET_BONE_PARENT,
        STRING_NAME)
    return TransferContext.readReturnValue(STRING_NAME, false) as StringName
  }

  /**
   * Sets the bone with name [boneParent] as the parent of the bone at [boneIdx]. If an empty string is passed, then the bone has no parent.
   */
  public fun setBoneParent(boneIdx: Long, boneParent: StringName): Unit {
    TransferContext.writeArguments(LONG to boneIdx, STRING_NAME to boneParent)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONPROFILE_SET_BONE_PARENT,
        NIL)
  }

  /**
   * Returns the tail direction of the bone at [boneIdx].
   */
  public fun getTailDirection(boneIdx: Long): TailDirection {
    TransferContext.writeArguments(LONG to boneIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONPROFILE_GET_TAIL_DIRECTION,
        LONG)
    return SkeletonProfile.TailDirection.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Sets the tail direction of the bone at [boneIdx].
   *
   * **Note:** This only specifies the method of calculation. The actual coordinates required should be stored in an external skeleton, so the calculation itself needs to be done externally.
   */
  public fun setTailDirection(boneIdx: Long, tailDirection: TailDirection): Unit {
    TransferContext.writeArguments(LONG to boneIdx, LONG to tailDirection.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONPROFILE_SET_TAIL_DIRECTION,
        NIL)
  }

  /**
   * Returns the name of the bone which is the tail of the bone at [boneIdx].
   */
  public fun getBoneTail(boneIdx: Long): StringName {
    TransferContext.writeArguments(LONG to boneIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONPROFILE_GET_BONE_TAIL,
        STRING_NAME)
    return TransferContext.readReturnValue(STRING_NAME, false) as StringName
  }

  /**
   * Sets the bone with name [boneTail] as the tail of the bone at [boneIdx].
   */
  public fun setBoneTail(boneIdx: Long, boneTail: StringName): Unit {
    TransferContext.writeArguments(LONG to boneIdx, STRING_NAME to boneTail)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONPROFILE_SET_BONE_TAIL, NIL)
  }

  /**
   * Returns the reference pose transform for bone [boneIdx].
   */
  public fun getReferencePose(boneIdx: Long): Transform3D {
    TransferContext.writeArguments(LONG to boneIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONPROFILE_GET_REFERENCE_POSE,
        TRANSFORM3D)
    return TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D
  }

  /**
   * Sets the reference pose transform for bone [boneIdx].
   */
  public fun setReferencePose(boneIdx: Long, boneName: Transform3D): Unit {
    TransferContext.writeArguments(LONG to boneIdx, TRANSFORM3D to boneName)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONPROFILE_SET_REFERENCE_POSE,
        NIL)
  }

  /**
   * Returns the offset of the bone at [boneIdx] that will be the button position in the [godot.BoneMap] editor.
   *
   * This is the offset with origin at the top left corner of the square.
   */
  public fun getHandleOffset(boneIdx: Long): Vector2 {
    TransferContext.writeArguments(LONG to boneIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONPROFILE_GET_HANDLE_OFFSET,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Sets the offset of the bone at [boneIdx] that will be the button position in the [godot.BoneMap] editor.
   *
   * This is the offset with origin at the top left corner of the square.
   */
  public fun setHandleOffset(boneIdx: Long, handleOffset: Vector2): Unit {
    TransferContext.writeArguments(LONG to boneIdx, VECTOR2 to handleOffset)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONPROFILE_SET_HANDLE_OFFSET,
        NIL)
  }

  /**
   * Returns the group of the bone at [boneIdx].
   */
  public fun getGroup(boneIdx: Long): StringName {
    TransferContext.writeArguments(LONG to boneIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONPROFILE_GET_GROUP,
        STRING_NAME)
    return TransferContext.readReturnValue(STRING_NAME, false) as StringName
  }

  /**
   * Sets the group of the bone at [boneIdx].
   */
  public fun setGroup(boneIdx: Long, group: StringName): Unit {
    TransferContext.writeArguments(LONG to boneIdx, STRING_NAME to group)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONPROFILE_SET_GROUP, NIL)
  }

  public enum class TailDirection(
    id: Long,
  ) {
    /**
     * Direction to the average coordinates of bone children.
     */
    TAIL_DIRECTION_AVERAGE_CHILDREN(0),
    /**
     * Direction to the coordinates of specified bone child.
     */
    TAIL_DIRECTION_SPECIFIC_CHILD(1),
    /**
     * Direction is not calculated.
     */
    TAIL_DIRECTION_END(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
