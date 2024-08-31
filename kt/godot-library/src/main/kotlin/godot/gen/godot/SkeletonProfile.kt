// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.Transform3D
import godot.core.TypeManager
import godot.core.VariantType.BOOL
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
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * This resource is used in [EditorScenePostImport]. Some parameters are referring to bones in
 * [Skeleton3D], [Skin], [Animation], and some other nodes are rewritten based on the parameters of
 * [SkeletonProfile].
 * **Note:** These parameters need to be set only when creating a custom profile. In
 * [SkeletonProfileHumanoid], they are defined internally as read-only values.
 */
@GodotBaseType
public open class SkeletonProfile : Resource() {
  /**
   * This signal is emitted when change the value in profile. This is used to update key name in the
   * [BoneMap] and to redraw the [BoneMap] editor.
   * **Note:** This signal is not connected directly to editor to simplify the reference, instead it
   * is passed on to editor through the [BoneMap].
   */
  public val profileUpdated: Signal0 by signal()

  /**
   * A bone name that will be used as the root bone in [AnimationTree]. This should be the bone of
   * the parent of hips that exists at the world origin.
   */
  public var rootBone: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRootBonePtr, STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRootBonePtr, NIL)
    }

  /**
   * A bone name which will use model's height as the coefficient for normalization. For example,
   * [SkeletonProfileHumanoid] defines it as `Hips`.
   */
  public var scaleBaseBone: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getScaleBaseBonePtr, STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setScaleBaseBonePtr, NIL)
    }

  /**
   * The amount of groups of bones in retargeting section's [BoneMap] editor. For example,
   * [SkeletonProfileHumanoid] has 4 groups.
   * This property exists to separate the bone list into several sections in the editor.
   */
  public var groupSize: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGroupSizePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setGroupSizePtr, NIL)
    }

  /**
   * The amount of bones in retargeting section's [BoneMap] editor. For example,
   * [SkeletonProfileHumanoid] has 56 bones.
   * The size of elements in [BoneMap] updates when changing this property in it's assigned
   * [SkeletonProfile].
   */
  public var boneSize: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBoneSizePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setBoneSizePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_SKELETONPROFILE, scriptIndex)
  }

  /**
   * Returns the name of the group at [groupIdx] that will be the drawing group in the [BoneMap]
   * editor.
   */
  public fun getGroupName(groupIdx: Int): StringName {
    TransferContext.writeArguments(LONG to groupIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getGroupNamePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  /**
   * Sets the name of the group at [groupIdx] that will be the drawing group in the [BoneMap]
   * editor.
   */
  public fun setGroupName(groupIdx: Int, groupName: StringName): Unit {
    TransferContext.writeArguments(LONG to groupIdx.toLong(), STRING_NAME to groupName)
    TransferContext.callMethod(rawPtr, MethodBindings.setGroupNamePtr, NIL)
  }

  /**
   * Returns the texture of the group at [groupIdx] that will be the drawing group background image
   * in the [BoneMap] editor.
   */
  public fun getTexture(groupIdx: Int): Texture2D? {
    TransferContext.writeArguments(LONG to groupIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTexturePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
  }

  /**
   * Sets the texture of the group at [groupIdx] that will be the drawing group background image in
   * the [BoneMap] editor.
   */
  public fun setTexture(groupIdx: Int, texture: Texture2D): Unit {
    TransferContext.writeArguments(LONG to groupIdx.toLong(), OBJECT to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.setTexturePtr, NIL)
  }

  /**
   * Returns the bone index that matches [boneName] as its name.
   */
  public fun findBone(boneName: StringName): Int {
    TransferContext.writeArguments(STRING_NAME to boneName)
    TransferContext.callMethod(rawPtr, MethodBindings.findBonePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the name of the bone at [boneIdx] that will be the key name in the [BoneMap].
   * In the retargeting process, the returned bone name is the bone name of the target skeleton.
   */
  public fun getBoneName(boneIdx: Int): StringName {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBoneNamePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  /**
   * Sets the name of the bone at [boneIdx] that will be the key name in the [BoneMap].
   * In the retargeting process, the setting bone name is the bone name of the target skeleton.
   */
  public fun setBoneName(boneIdx: Int, boneName: StringName): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), STRING_NAME to boneName)
    TransferContext.callMethod(rawPtr, MethodBindings.setBoneNamePtr, NIL)
  }

  /**
   * Returns the name of the bone which is the parent to the bone at [boneIdx]. The result is empty
   * if the bone has no parent.
   */
  public fun getBoneParent(boneIdx: Int): StringName {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBoneParentPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  /**
   * Sets the bone with name [boneParent] as the parent of the bone at [boneIdx]. If an empty string
   * is passed, then the bone has no parent.
   */
  public fun setBoneParent(boneIdx: Int, boneParent: StringName): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), STRING_NAME to boneParent)
    TransferContext.callMethod(rawPtr, MethodBindings.setBoneParentPtr, NIL)
  }

  /**
   * Returns the tail direction of the bone at [boneIdx].
   */
  public fun getTailDirection(boneIdx: Int): TailDirection {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTailDirectionPtr, LONG)
    return SkeletonProfile.TailDirection.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the tail direction of the bone at [boneIdx].
   * **Note:** This only specifies the method of calculation. The actual coordinates required should
   * be stored in an external skeleton, so the calculation itself needs to be done externally.
   */
  public fun setTailDirection(boneIdx: Int, tailDirection: TailDirection): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), LONG to tailDirection.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setTailDirectionPtr, NIL)
  }

  /**
   * Returns the name of the bone which is the tail of the bone at [boneIdx].
   */
  public fun getBoneTail(boneIdx: Int): StringName {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBoneTailPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  /**
   * Sets the bone with name [boneTail] as the tail of the bone at [boneIdx].
   */
  public fun setBoneTail(boneIdx: Int, boneTail: StringName): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), STRING_NAME to boneTail)
    TransferContext.callMethod(rawPtr, MethodBindings.setBoneTailPtr, NIL)
  }

  /**
   * Returns the reference pose transform for bone [boneIdx].
   */
  public fun getReferencePose(boneIdx: Int): Transform3D {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getReferencePosePtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  /**
   * Sets the reference pose transform for bone [boneIdx].
   */
  public fun setReferencePose(boneIdx: Int, boneName: Transform3D): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), TRANSFORM3D to boneName)
    TransferContext.callMethod(rawPtr, MethodBindings.setReferencePosePtr, NIL)
  }

  /**
   * Returns the offset of the bone at [boneIdx] that will be the button position in the [BoneMap]
   * editor.
   * This is the offset with origin at the top left corner of the square.
   */
  public fun getHandleOffset(boneIdx: Int): Vector2 {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getHandleOffsetPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Sets the offset of the bone at [boneIdx] that will be the button position in the [BoneMap]
   * editor.
   * This is the offset with origin at the top left corner of the square.
   */
  public fun setHandleOffset(boneIdx: Int, handleOffset: Vector2): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), VECTOR2 to handleOffset)
    TransferContext.callMethod(rawPtr, MethodBindings.setHandleOffsetPtr, NIL)
  }

  /**
   * Returns the group of the bone at [boneIdx].
   */
  public fun getGroup(boneIdx: Int): StringName {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getGroupPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  /**
   * Sets the group of the bone at [boneIdx].
   */
  public fun setGroup(boneIdx: Int, group: StringName): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), STRING_NAME to group)
    TransferContext.callMethod(rawPtr, MethodBindings.setGroupPtr, NIL)
  }

  /**
   * Returns whether the bone at [boneIdx] is required for retargeting.
   * This value is used by the bone map editor. If this method returns `true`, and no bone is
   * assigned, the handle color will be red on the bone map editor.
   */
  public fun isRequired(boneIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isRequiredPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the required status for bone [boneIdx] to [required].
   */
  public fun setRequired(boneIdx: Int, required: Boolean): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), BOOL to required)
    TransferContext.callMethod(rawPtr, MethodBindings.setRequiredPtr, NIL)
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
      public fun from(`value`: Long): TailDirection = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setRootBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "set_root_bone")

    public val getRootBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "get_root_bone")

    public val setScaleBaseBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "set_scale_base_bone")

    public val getScaleBaseBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "get_scale_base_bone")

    public val setGroupSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "set_group_size")

    public val getGroupSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "get_group_size")

    public val getGroupNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "get_group_name")

    public val setGroupNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "set_group_name")

    public val getTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "get_texture")

    public val setTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "set_texture")

    public val setBoneSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "set_bone_size")

    public val getBoneSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "get_bone_size")

    public val findBonePtr: VoidPtr = TypeManager.getMethodBindPtr("SkeletonProfile", "find_bone")

    public val getBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "get_bone_name")

    public val setBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "set_bone_name")

    public val getBoneParentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "get_bone_parent")

    public val setBoneParentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "set_bone_parent")

    public val getTailDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "get_tail_direction")

    public val setTailDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "set_tail_direction")

    public val getBoneTailPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "get_bone_tail")

    public val setBoneTailPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "set_bone_tail")

    public val getReferencePosePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "get_reference_pose")

    public val setReferencePosePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "set_reference_pose")

    public val getHandleOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "get_handle_offset")

    public val setHandleOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "set_handle_offset")

    public val getGroupPtr: VoidPtr = TypeManager.getMethodBindPtr("SkeletonProfile", "get_group")

    public val setGroupPtr: VoidPtr = TypeManager.getMethodBindPtr("SkeletonProfile", "set_group")

    public val isRequiredPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "is_required")

    public val setRequiredPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "set_required")
  }
}
