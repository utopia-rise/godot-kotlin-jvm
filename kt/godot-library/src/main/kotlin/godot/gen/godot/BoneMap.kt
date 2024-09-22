// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Signal0
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
  public val boneMapUpdated: Signal0 by Signal0

  /**
   * This signal is emitted when change the value in profile or change the reference of profile.
   * This is used to update key names in the [BoneMap] and to redraw the [BoneMap] editor.
   */
  public val profileUpdated: Signal0 by Signal0

  /**
   * A [SkeletonProfile] of the mapping target. Key names in the [BoneMap] are synchronized with it.
   */
  public final inline var profile: SkeletonProfile?
    @JvmName("profileProperty")
    get() = getProfile()
    @JvmName("profileProperty")
    set(`value`) {
      setProfile(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_BONEMAP, scriptIndex)
  }

  public final fun getProfile(): SkeletonProfile? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getProfilePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as SkeletonProfile?)
  }

  public final fun setProfile(profile: SkeletonProfile?): Unit {
    TransferContext.writeArguments(OBJECT to profile)
    TransferContext.callMethod(rawPtr, MethodBindings.setProfilePtr, NIL)
  }

  /**
   * Returns a skeleton bone name is mapped to [profileBoneName].
   * In the retargeting process, the returned bone name is the bone name of the source skeleton.
   */
  public final fun getSkeletonBoneName(profileBoneName: StringName): StringName {
    TransferContext.writeArguments(STRING_NAME to profileBoneName)
    TransferContext.callMethod(rawPtr, MethodBindings.getSkeletonBoneNamePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  /**
   * Maps a skeleton bone name to [profileBoneName].
   * In the retargeting process, the setting bone name is the bone name of the source skeleton.
   */
  public final fun setSkeletonBoneName(profileBoneName: StringName, skeletonBoneName: StringName):
      Unit {
    TransferContext.writeArguments(STRING_NAME to profileBoneName, STRING_NAME to skeletonBoneName)
    TransferContext.callMethod(rawPtr, MethodBindings.setSkeletonBoneNamePtr, NIL)
  }

  /**
   * Returns a profile bone name having [skeletonBoneName]. If not found, an empty [StringName] will
   * be returned.
   * In the retargeting process, the returned bone name is the bone name of the target skeleton.
   */
  public final fun findProfileBoneName(skeletonBoneName: StringName): StringName {
    TransferContext.writeArguments(STRING_NAME to skeletonBoneName)
    TransferContext.callMethod(rawPtr, MethodBindings.findProfileBoneNamePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  public companion object

  internal object MethodBindings {
    public val getProfilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneMap", "get_profile", 4291782652)

    public val setProfilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneMap", "set_profile", 3870374136)

    public val getSkeletonBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneMap", "get_skeleton_bone_name", 1965194235)

    public val setSkeletonBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneMap", "set_skeleton_bone_name", 3740211285)

    public val findProfileBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneMap", "find_profile_bone_name", 1965194235)
  }
}
