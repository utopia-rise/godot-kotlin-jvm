// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * This class contains a dictionary that uses a list of bone names in [SkeletonProfile] as key
 * names.
 * By assigning the actual [Skeleton3D] bone name as the key value, it maps the [Skeleton3D] to the
 * [SkeletonProfile].
 */
@GodotBaseType
public open class BoneMap : Resource() {
  /**
   * This signal is emitted when change the key value in the [BoneMap]. This is used to validate
   * mapping and to update [BoneMap] editor.
   */
  public val boneMapUpdated: Signal0 by signal()

  /**
   * This signal is emitted when change the value in profile or change the reference of profile.
   * This is used to update key names in the [BoneMap] and to redraw the [BoneMap] editor.
   */
  public val profileUpdated: Signal0 by signal()

  /**
   * A [SkeletonProfile] of the mapping target. Key names in the [BoneMap] are synchronized with it.
   */
  public var profile: SkeletonProfile?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getProfilePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as SkeletonProfile?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setProfilePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_BONEMAP, scriptIndex)
  }

  /**
   * Returns a skeleton bone name is mapped to [profileBoneName].
   * In the retargeting process, the returned bone name is the bone name of the source skeleton.
   */
  public fun getSkeletonBoneName(profileBoneName: StringName): StringName {
    TransferContext.writeArguments(STRING_NAME to profileBoneName)
    TransferContext.callMethod(rawPtr, MethodBindings.getSkeletonBoneNamePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  /**
   * Maps a skeleton bone name to [profileBoneName].
   * In the retargeting process, the setting bone name is the bone name of the source skeleton.
   */
  public fun setSkeletonBoneName(profileBoneName: StringName, skeletonBoneName: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to profileBoneName, STRING_NAME to skeletonBoneName)
    TransferContext.callMethod(rawPtr, MethodBindings.setSkeletonBoneNamePtr, NIL)
  }

  /**
   * Returns a profile bone name having [skeletonBoneName]. If not found, an empty [StringName] will
   * be returned.
   * In the retargeting process, the returned bone name is the bone name of the target skeleton.
   */
  public fun findProfileBoneName(skeletonBoneName: StringName): StringName {
    TransferContext.writeArguments(STRING_NAME to skeletonBoneName)
    TransferContext.callMethod(rawPtr, MethodBindings.findProfileBoneNamePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  public companion object

  internal object MethodBindings {
    public val getProfilePtr: VoidPtr = TypeManager.getMethodBindPtr("BoneMap", "get_profile")

    public val setProfilePtr: VoidPtr = TypeManager.getMethodBindPtr("BoneMap", "set_profile")

    public val getSkeletonBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneMap", "get_skeleton_bone_name")

    public val setSkeletonBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneMap", "set_skeleton_bone_name")

    public val findProfileBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneMap", "find_profile_bone_name")
  }
}
