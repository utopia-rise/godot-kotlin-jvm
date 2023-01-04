// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * Bone map for retargeting.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/assets_pipeline/retargeting_3d_skeletons.html]($DOCS_URL/tutorials/assets_pipeline/retargeting_3d_skeletons.html)
 *
 * This class contains a hashmap that uses a list of bone names in [godot.SkeletonProfile] as key names.
 *
 * By assigning the actual [godot.Skeleton3D] bone name as the key value, it maps the [godot.Skeleton3D] to the [godot.SkeletonProfile].
 */
@GodotBaseType
public open class BoneMap : Resource() {
  /**
   * This signal is emitted when change the key value in the [godot.BoneMap]. This is used to validate mapping and to update [godot.BoneMap] editor.
   */
  public val boneMapUpdated: Signal0 by signal()

  /**
   * This signal is emitted when change the value in profile or change the reference of profile. This is used to update key names in the [godot.BoneMap] and to redraw the [godot.BoneMap] editor.
   */
  public val profileUpdated: Signal0 by signal()

  /**
   * A [godot.SkeletonProfile] of the mapping target. Key names in the [godot.BoneMap] are synchronized with it.
   */
  public var profile: SkeletonProfile?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BONEMAP_GET_PROFILE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as SkeletonProfile?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BONEMAP_SET_PROFILE, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_BONEMAP, scriptIndex)
    return true
  }

  /**
   * Returns a skeleton bone name is mapped to [profileBoneName].
   *
   * In the retargeting process, the returned bone name is the bone name of the source skeleton.
   */
  public fun getSkeletonBoneName(profileBoneName: StringName): StringName {
    TransferContext.writeArguments(STRING_NAME to profileBoneName)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BONEMAP_GET_SKELETON_BONE_NAME,
        STRING_NAME)
    return TransferContext.readReturnValue(STRING_NAME, false) as StringName
  }

  /**
   * Maps a skeleton bone name to [profileBoneName].
   *
   * In the retargeting process, the setting bone name is the bone name of the source skeleton.
   */
  public fun setSkeletonBoneName(profileBoneName: StringName, skeletonBoneName: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to profileBoneName, STRING_NAME to skeletonBoneName)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BONEMAP_SET_SKELETON_BONE_NAME, NIL)
  }

  /**
   * Returns a profile bone name having [skeletonBoneName]. If not found, an empty [godot.StringName] will be returned.
   *
   * In the retargeting process, the returned bone name is the bone name of the target skeleton.
   */
  public fun findProfileBoneName(skeletonBoneName: StringName): StringName {
    TransferContext.writeArguments(STRING_NAME to skeletonBoneName)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BONEMAP_FIND_PROFILE_BONE_NAME,
        STRING_NAME)
    return TransferContext.readReturnValue(STRING_NAME, false) as StringName
  }

  public companion object
}
