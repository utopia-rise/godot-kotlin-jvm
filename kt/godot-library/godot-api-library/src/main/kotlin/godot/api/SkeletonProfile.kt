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
import godot.core.Signal0
import godot.core.StringName
import godot.core.Transform3D
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING_NAME
import godot.core.VariantParser.TRANSFORM3D
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINECLASS_SKELETONPROFILE: Int = 596

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
  public val profileUpdated: Signal0 by Signal0

  /**
   * A bone name that will be used as the root bone in [AnimationTree]. This should be the bone of
   * the parent of hips that exists at the world origin.
   */
  public final inline var rootBone: StringName
    @JvmName("rootBoneProperty")
    get() = getRootBone()
    @JvmName("rootBoneProperty")
    set(`value`) {
      setRootBone(value)
    }

  /**
   * A bone name which will use model's height as the coefficient for normalization. For example,
   * [SkeletonProfileHumanoid] defines it as `Hips`.
   */
  public final inline var scaleBaseBone: StringName
    @JvmName("scaleBaseBoneProperty")
    get() = getScaleBaseBone()
    @JvmName("scaleBaseBoneProperty")
    set(`value`) {
      setScaleBaseBone(value)
    }

  /**
   * The amount of groups of bones in retargeting section's [BoneMap] editor. For example,
   * [SkeletonProfileHumanoid] has 4 groups.
   * This property exists to separate the bone list into several sections in the editor.
   */
  public final inline var groupSize: Int
    @JvmName("groupSizeProperty")
    get() = getGroupSize()
    @JvmName("groupSizeProperty")
    set(`value`) {
      setGroupSize(value)
    }

  /**
   * The amount of bones in retargeting section's [BoneMap] editor. For example,
   * [SkeletonProfileHumanoid] has 56 bones.
   * The size of elements in [BoneMap] updates when changing this property in it's assigned
   * [SkeletonProfile].
   */
  public final inline var boneSize: Int
    @JvmName("boneSizeProperty")
    get() = getBoneSize()
    @JvmName("boneSizeProperty")
    set(`value`) {
      setBoneSize(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_SKELETONPROFILE, scriptIndex)
  }

  public final fun setRootBone(boneName: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to boneName)
    TransferContext.callMethod(ptr, MethodBindings.setRootBonePtr, NIL)
  }

  public final fun getRootBone(): StringName {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRootBonePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  public final fun setScaleBaseBone(boneName: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to boneName)
    TransferContext.callMethod(ptr, MethodBindings.setScaleBaseBonePtr, NIL)
  }

  public final fun getScaleBaseBone(): StringName {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getScaleBaseBonePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  public final fun setGroupSize(size: Int): Unit {
    TransferContext.writeArguments(LONG to size.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setGroupSizePtr, NIL)
  }

  public final fun getGroupSize(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGroupSizePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the name of the group at [groupIdx] that will be the drawing group in the [BoneMap]
   * editor.
   */
  public final fun getGroupName(groupIdx: Int): StringName {
    TransferContext.writeArguments(LONG to groupIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getGroupNamePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  /**
   * Sets the name of the group at [groupIdx] that will be the drawing group in the [BoneMap]
   * editor.
   */
  public final fun setGroupName(groupIdx: Int, groupName: StringName): Unit {
    TransferContext.writeArguments(LONG to groupIdx.toLong(), STRING_NAME to groupName)
    TransferContext.callMethod(ptr, MethodBindings.setGroupNamePtr, NIL)
  }

  /**
   * Returns the texture of the group at [groupIdx] that will be the drawing group background image
   * in the [BoneMap] editor.
   */
  public final fun getTexture(groupIdx: Int): Texture2D? {
    TransferContext.writeArguments(LONG to groupIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getTexturePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  /**
   * Sets the texture of the group at [groupIdx] that will be the drawing group background image in
   * the [BoneMap] editor.
   */
  public final fun setTexture(groupIdx: Int, texture: Texture2D?): Unit {
    TransferContext.writeArguments(LONG to groupIdx.toLong(), OBJECT to texture)
    TransferContext.callMethod(ptr, MethodBindings.setTexturePtr, NIL)
  }

  public final fun setBoneSize(size: Int): Unit {
    TransferContext.writeArguments(LONG to size.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setBoneSizePtr, NIL)
  }

  public final fun getBoneSize(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBoneSizePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the bone index that matches [boneName] as its name.
   */
  public final fun findBone(boneName: StringName): Int {
    TransferContext.writeArguments(STRING_NAME to boneName)
    TransferContext.callMethod(ptr, MethodBindings.findBonePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the name of the bone at [boneIdx] that will be the key name in the [BoneMap].
   * In the retargeting process, the returned bone name is the bone name of the target skeleton.
   */
  public final fun getBoneName(boneIdx: Int): StringName {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getBoneNamePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  /**
   * Sets the name of the bone at [boneIdx] that will be the key name in the [BoneMap].
   * In the retargeting process, the setting bone name is the bone name of the target skeleton.
   */
  public final fun setBoneName(boneIdx: Int, boneName: StringName): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), STRING_NAME to boneName)
    TransferContext.callMethod(ptr, MethodBindings.setBoneNamePtr, NIL)
  }

  /**
   * Returns the name of the bone which is the parent to the bone at [boneIdx]. The result is empty
   * if the bone has no parent.
   */
  public final fun getBoneParent(boneIdx: Int): StringName {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getBoneParentPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  /**
   * Sets the bone with name [boneParent] as the parent of the bone at [boneIdx]. If an empty string
   * is passed, then the bone has no parent.
   */
  public final fun setBoneParent(boneIdx: Int, boneParent: StringName): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), STRING_NAME to boneParent)
    TransferContext.callMethod(ptr, MethodBindings.setBoneParentPtr, NIL)
  }

  /**
   * Returns the tail direction of the bone at [boneIdx].
   */
  public final fun getTailDirection(boneIdx: Int): TailDirection {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getTailDirectionPtr, LONG)
    return SkeletonProfile.TailDirection.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the tail direction of the bone at [boneIdx].
   * **Note:** This only specifies the method of calculation. The actual coordinates required should
   * be stored in an external skeleton, so the calculation itself needs to be done externally.
   */
  public final fun setTailDirection(boneIdx: Int, tailDirection: TailDirection): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), LONG to tailDirection.id)
    TransferContext.callMethod(ptr, MethodBindings.setTailDirectionPtr, NIL)
  }

  /**
   * Returns the name of the bone which is the tail of the bone at [boneIdx].
   */
  public final fun getBoneTail(boneIdx: Int): StringName {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getBoneTailPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  /**
   * Sets the bone with name [boneTail] as the tail of the bone at [boneIdx].
   */
  public final fun setBoneTail(boneIdx: Int, boneTail: StringName): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), STRING_NAME to boneTail)
    TransferContext.callMethod(ptr, MethodBindings.setBoneTailPtr, NIL)
  }

  /**
   * Returns the reference pose transform for bone [boneIdx].
   */
  public final fun getReferencePose(boneIdx: Int): Transform3D {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getReferencePosePtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D) as Transform3D)
  }

  /**
   * Sets the reference pose transform for bone [boneIdx].
   */
  public final fun setReferencePose(boneIdx: Int, boneName: Transform3D): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), TRANSFORM3D to boneName)
    TransferContext.callMethod(ptr, MethodBindings.setReferencePosePtr, NIL)
  }

  /**
   * Returns the offset of the bone at [boneIdx] that will be the button position in the [BoneMap]
   * editor.
   * This is the offset with origin at the top left corner of the square.
   */
  public final fun getHandleOffset(boneIdx: Int): Vector2 {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getHandleOffsetPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Sets the offset of the bone at [boneIdx] that will be the button position in the [BoneMap]
   * editor.
   * This is the offset with origin at the top left corner of the square.
   */
  public final fun setHandleOffset(boneIdx: Int, handleOffset: Vector2): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), VECTOR2 to handleOffset)
    TransferContext.callMethod(ptr, MethodBindings.setHandleOffsetPtr, NIL)
  }

  /**
   * Returns the group of the bone at [boneIdx].
   */
  public final fun getGroup(boneIdx: Int): StringName {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getGroupPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  /**
   * Sets the group of the bone at [boneIdx].
   */
  public final fun setGroup(boneIdx: Int, group: StringName): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), STRING_NAME to group)
    TransferContext.callMethod(ptr, MethodBindings.setGroupPtr, NIL)
  }

  /**
   * Returns whether the bone at [boneIdx] is required for retargeting.
   * This value is used by the bone map editor. If this method returns `true`, and no bone is
   * assigned, the handle color will be red on the bone map editor.
   */
  public final fun isRequired(boneIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isRequiredPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the required status for bone [boneIdx] to [required].
   */
  public final fun setRequired(boneIdx: Int, required: Boolean): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), BOOL to required)
    TransferContext.callMethod(ptr, MethodBindings.setRequiredPtr, NIL)
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

  public object MethodBindings {
    internal val setRootBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "set_root_bone", 3304788590)

    internal val getRootBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "get_root_bone", 2737447660)

    internal val setScaleBaseBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "set_scale_base_bone", 3304788590)

    internal val getScaleBaseBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "get_scale_base_bone", 2737447660)

    internal val setGroupSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "set_group_size", 1286410249)

    internal val getGroupSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "get_group_size", 2455072627)

    internal val getGroupNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "get_group_name", 659327637)

    internal val setGroupNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "set_group_name", 3780747571)

    internal val getTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "get_texture", 3536238170)

    internal val setTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "set_texture", 666127730)

    internal val setBoneSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "set_bone_size", 1286410249)

    internal val getBoneSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "get_bone_size", 2455072627)

    internal val findBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "find_bone", 2458036349)

    internal val getBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "get_bone_name", 659327637)

    internal val setBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "set_bone_name", 3780747571)

    internal val getBoneParentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "get_bone_parent", 659327637)

    internal val setBoneParentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "set_bone_parent", 3780747571)

    internal val getTailDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "get_tail_direction", 2675997574)

    internal val setTailDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "set_tail_direction", 1231951015)

    internal val getBoneTailPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "get_bone_tail", 659327637)

    internal val setBoneTailPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "set_bone_tail", 3780747571)

    internal val getReferencePosePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "get_reference_pose", 1965739696)

    internal val setReferencePosePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "set_reference_pose", 3616898986)

    internal val getHandleOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "get_handle_offset", 2299179447)

    internal val setHandleOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "set_handle_offset", 163021252)

    internal val getGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "get_group", 659327637)

    internal val setGroupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "set_group", 3780747571)

    internal val isRequiredPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "is_required", 1116898809)

    internal val setRequiredPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonProfile", "set_required", 300928843)
  }
}
