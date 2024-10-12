// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
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
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_SKELETONPROFILE_INDEX: Int = 596

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
    Internals.callConstructor(this, ENGINE_CLASS_SKELETONPROFILE_INDEX, scriptIndex)
  }

  public final fun setRootBone(boneName: StringName): Unit {
    Internals.writeArguments(STRING_NAME to boneName)
    Internals.callMethod(rawPtr, MethodBindings.setRootBonePtr, NIL)
  }

  public final fun getRootBone(): StringName {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRootBonePtr, STRING_NAME)
    return (Internals.readReturnValue(STRING_NAME) as StringName)
  }

  public final fun setScaleBaseBone(boneName: StringName): Unit {
    Internals.writeArguments(STRING_NAME to boneName)
    Internals.callMethod(rawPtr, MethodBindings.setScaleBaseBonePtr, NIL)
  }

  public final fun getScaleBaseBone(): StringName {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getScaleBaseBonePtr, STRING_NAME)
    return (Internals.readReturnValue(STRING_NAME) as StringName)
  }

  public final fun setGroupSize(size: Int): Unit {
    Internals.writeArguments(LONG to size.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setGroupSizePtr, NIL)
  }

  public final fun getGroupSize(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getGroupSizePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the name of the group at [groupIdx] that will be the drawing group in the [BoneMap]
   * editor.
   */
  public final fun getGroupName(groupIdx: Int): StringName {
    Internals.writeArguments(LONG to groupIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getGroupNamePtr, STRING_NAME)
    return (Internals.readReturnValue(STRING_NAME) as StringName)
  }

  /**
   * Sets the name of the group at [groupIdx] that will be the drawing group in the [BoneMap]
   * editor.
   */
  public final fun setGroupName(groupIdx: Int, groupName: StringName): Unit {
    Internals.writeArguments(LONG to groupIdx.toLong(), STRING_NAME to groupName)
    Internals.callMethod(rawPtr, MethodBindings.setGroupNamePtr, NIL)
  }

  /**
   * Returns the texture of the group at [groupIdx] that will be the drawing group background image
   * in the [BoneMap] editor.
   */
  public final fun getTexture(groupIdx: Int): Texture2D? {
    Internals.writeArguments(LONG to groupIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getTexturePtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Texture2D?)
  }

  /**
   * Sets the texture of the group at [groupIdx] that will be the drawing group background image in
   * the [BoneMap] editor.
   */
  public final fun setTexture(groupIdx: Int, texture: Texture2D?): Unit {
    Internals.writeArguments(LONG to groupIdx.toLong(), OBJECT to texture)
    Internals.callMethod(rawPtr, MethodBindings.setTexturePtr, NIL)
  }

  public final fun setBoneSize(size: Int): Unit {
    Internals.writeArguments(LONG to size.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setBoneSizePtr, NIL)
  }

  public final fun getBoneSize(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBoneSizePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the bone index that matches [boneName] as its name.
   */
  public final fun findBone(boneName: StringName): Int {
    Internals.writeArguments(STRING_NAME to boneName)
    Internals.callMethod(rawPtr, MethodBindings.findBonePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the name of the bone at [boneIdx] that will be the key name in the [BoneMap].
   * In the retargeting process, the returned bone name is the bone name of the target skeleton.
   */
  public final fun getBoneName(boneIdx: Int): StringName {
    Internals.writeArguments(LONG to boneIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getBoneNamePtr, STRING_NAME)
    return (Internals.readReturnValue(STRING_NAME) as StringName)
  }

  /**
   * Sets the name of the bone at [boneIdx] that will be the key name in the [BoneMap].
   * In the retargeting process, the setting bone name is the bone name of the target skeleton.
   */
  public final fun setBoneName(boneIdx: Int, boneName: StringName): Unit {
    Internals.writeArguments(LONG to boneIdx.toLong(), STRING_NAME to boneName)
    Internals.callMethod(rawPtr, MethodBindings.setBoneNamePtr, NIL)
  }

  /**
   * Returns the name of the bone which is the parent to the bone at [boneIdx]. The result is empty
   * if the bone has no parent.
   */
  public final fun getBoneParent(boneIdx: Int): StringName {
    Internals.writeArguments(LONG to boneIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getBoneParentPtr, STRING_NAME)
    return (Internals.readReturnValue(STRING_NAME) as StringName)
  }

  /**
   * Sets the bone with name [boneParent] as the parent of the bone at [boneIdx]. If an empty string
   * is passed, then the bone has no parent.
   */
  public final fun setBoneParent(boneIdx: Int, boneParent: StringName): Unit {
    Internals.writeArguments(LONG to boneIdx.toLong(), STRING_NAME to boneParent)
    Internals.callMethod(rawPtr, MethodBindings.setBoneParentPtr, NIL)
  }

  /**
   * Returns the tail direction of the bone at [boneIdx].
   */
  public final fun getTailDirection(boneIdx: Int): TailDirection {
    Internals.writeArguments(LONG to boneIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getTailDirectionPtr, LONG)
    return SkeletonProfile.TailDirection.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the tail direction of the bone at [boneIdx].
   * **Note:** This only specifies the method of calculation. The actual coordinates required should
   * be stored in an external skeleton, so the calculation itself needs to be done externally.
   */
  public final fun setTailDirection(boneIdx: Int, tailDirection: TailDirection): Unit {
    Internals.writeArguments(LONG to boneIdx.toLong(), LONG to tailDirection.id)
    Internals.callMethod(rawPtr, MethodBindings.setTailDirectionPtr, NIL)
  }

  /**
   * Returns the name of the bone which is the tail of the bone at [boneIdx].
   */
  public final fun getBoneTail(boneIdx: Int): StringName {
    Internals.writeArguments(LONG to boneIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getBoneTailPtr, STRING_NAME)
    return (Internals.readReturnValue(STRING_NAME) as StringName)
  }

  /**
   * Sets the bone with name [boneTail] as the tail of the bone at [boneIdx].
   */
  public final fun setBoneTail(boneIdx: Int, boneTail: StringName): Unit {
    Internals.writeArguments(LONG to boneIdx.toLong(), STRING_NAME to boneTail)
    Internals.callMethod(rawPtr, MethodBindings.setBoneTailPtr, NIL)
  }

  /**
   * Returns the reference pose transform for bone [boneIdx].
   */
  public final fun getReferencePose(boneIdx: Int): Transform3D {
    Internals.writeArguments(LONG to boneIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getReferencePosePtr, TRANSFORM3D)
    return (Internals.readReturnValue(TRANSFORM3D) as Transform3D)
  }

  /**
   * Sets the reference pose transform for bone [boneIdx].
   */
  public final fun setReferencePose(boneIdx: Int, boneName: Transform3D): Unit {
    Internals.writeArguments(LONG to boneIdx.toLong(), TRANSFORM3D to boneName)
    Internals.callMethod(rawPtr, MethodBindings.setReferencePosePtr, NIL)
  }

  /**
   * Returns the offset of the bone at [boneIdx] that will be the button position in the [BoneMap]
   * editor.
   * This is the offset with origin at the top left corner of the square.
   */
  public final fun getHandleOffset(boneIdx: Int): Vector2 {
    Internals.writeArguments(LONG to boneIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getHandleOffsetPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Sets the offset of the bone at [boneIdx] that will be the button position in the [BoneMap]
   * editor.
   * This is the offset with origin at the top left corner of the square.
   */
  public final fun setHandleOffset(boneIdx: Int, handleOffset: Vector2): Unit {
    Internals.writeArguments(LONG to boneIdx.toLong(), VECTOR2 to handleOffset)
    Internals.callMethod(rawPtr, MethodBindings.setHandleOffsetPtr, NIL)
  }

  /**
   * Returns the group of the bone at [boneIdx].
   */
  public final fun getGroup(boneIdx: Int): StringName {
    Internals.writeArguments(LONG to boneIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getGroupPtr, STRING_NAME)
    return (Internals.readReturnValue(STRING_NAME) as StringName)
  }

  /**
   * Sets the group of the bone at [boneIdx].
   */
  public final fun setGroup(boneIdx: Int, group: StringName): Unit {
    Internals.writeArguments(LONG to boneIdx.toLong(), STRING_NAME to group)
    Internals.callMethod(rawPtr, MethodBindings.setGroupPtr, NIL)
  }

  /**
   * Returns whether the bone at [boneIdx] is required for retargeting.
   * This value is used by the bone map editor. If this method returns `true`, and no bone is
   * assigned, the handle color will be red on the bone map editor.
   */
  public final fun isRequired(boneIdx: Int): Boolean {
    Internals.writeArguments(LONG to boneIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.isRequiredPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the required status for bone [boneIdx] to [required].
   */
  public final fun setRequired(boneIdx: Int, required: Boolean): Unit {
    Internals.writeArguments(LONG to boneIdx.toLong(), BOOL to required)
    Internals.callMethod(rawPtr, MethodBindings.setRequiredPtr, NIL)
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
        Internals.getMethodBindPtr("SkeletonProfile", "set_root_bone", 3304788590)

    internal val getRootBonePtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonProfile", "get_root_bone", 2737447660)

    internal val setScaleBaseBonePtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonProfile", "set_scale_base_bone", 3304788590)

    internal val getScaleBaseBonePtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonProfile", "get_scale_base_bone", 2737447660)

    internal val setGroupSizePtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonProfile", "set_group_size", 1286410249)

    internal val getGroupSizePtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonProfile", "get_group_size", 2455072627)

    internal val getGroupNamePtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonProfile", "get_group_name", 659327637)

    internal val setGroupNamePtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonProfile", "set_group_name", 3780747571)

    internal val getTexturePtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonProfile", "get_texture", 3536238170)

    internal val setTexturePtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonProfile", "set_texture", 666127730)

    internal val setBoneSizePtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonProfile", "set_bone_size", 1286410249)

    internal val getBoneSizePtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonProfile", "get_bone_size", 2455072627)

    internal val findBonePtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonProfile", "find_bone", 2458036349)

    internal val getBoneNamePtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonProfile", "get_bone_name", 659327637)

    internal val setBoneNamePtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonProfile", "set_bone_name", 3780747571)

    internal val getBoneParentPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonProfile", "get_bone_parent", 659327637)

    internal val setBoneParentPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonProfile", "set_bone_parent", 3780747571)

    internal val getTailDirectionPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonProfile", "get_tail_direction", 2675997574)

    internal val setTailDirectionPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonProfile", "set_tail_direction", 1231951015)

    internal val getBoneTailPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonProfile", "get_bone_tail", 659327637)

    internal val setBoneTailPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonProfile", "set_bone_tail", 3780747571)

    internal val getReferencePosePtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonProfile", "get_reference_pose", 1965739696)

    internal val setReferencePosePtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonProfile", "set_reference_pose", 3616898986)

    internal val getHandleOffsetPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonProfile", "get_handle_offset", 2299179447)

    internal val setHandleOffsetPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonProfile", "set_handle_offset", 163021252)

    internal val getGroupPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonProfile", "get_group", 659327637)

    internal val setGroupPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonProfile", "set_group", 3780747571)

    internal val isRequiredPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonProfile", "is_required", 1116898809)

    internal val setRequiredPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonProfile", "set_required", 300928843)
  }
}
