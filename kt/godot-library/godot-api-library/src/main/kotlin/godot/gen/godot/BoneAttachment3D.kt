// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.NODE_PATH
import godot.core.VariantParser.STRING
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_BONEATTACHMENT3D_INDEX: Int = 141

/**
 * This node selects a bone in a [Skeleton3D] and attaches to it. This means that the
 * [BoneAttachment3D] node will either dynamically copy or override the 3D transform of the selected
 * bone.
 */
@GodotBaseType
public open class BoneAttachment3D : Node3D() {
  /**
   * The name of the attached bone.
   */
  public final inline var boneName: String
    @JvmName("boneNameProperty")
    get() = getBoneName()
    @JvmName("boneNameProperty")
    set(`value`) {
      setBoneName(value)
    }

  /**
   * The index of the attached bone.
   */
  public final inline var boneIdx: Int
    @JvmName("boneIdxProperty")
    get() = getBoneIdx()
    @JvmName("boneIdxProperty")
    set(`value`) {
      setBoneIdx(value)
    }

  /**
   * Whether the BoneAttachment3D node will override the bone pose of the bone it is attached to.
   * When set to `true`, the BoneAttachment3D node can change the pose of the bone. When set to
   * `false`, the BoneAttachment3D will always be set to the bone's transform.
   * **Note:** This override performs interruptively in the skeleton update process using signals
   * due to the old design. It may cause unintended behavior when used at the same time with
   * [SkeletonModifier3D].
   */
  public final inline var overridePose: Boolean
    @JvmName("overridePoseProperty")
    get() = getOverridePose()
    @JvmName("overridePoseProperty")
    set(`value`) {
      setOverridePose(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_BONEATTACHMENT3D_INDEX, scriptIndex)
  }

  public final fun setBoneName(boneName: String): Unit {
    Internals.writeArguments(STRING to boneName)
    Internals.callMethod(rawPtr, MethodBindings.setBoneNamePtr, NIL)
  }

  public final fun getBoneName(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBoneNamePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  public final fun setBoneIdx(boneIdx: Int): Unit {
    Internals.writeArguments(LONG to boneIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setBoneIdxPtr, NIL)
  }

  public final fun getBoneIdx(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBoneIdxPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * A function that is called automatically when the [Skeleton3D] is updated. This function is
   * where the [BoneAttachment3D] node updates its position so it is correctly bound when it is *not*
   * set to override the bone pose.
   */
  public final fun onSkeletonUpdate(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.onSkeletonUpdatePtr, NIL)
  }

  public final fun setOverridePose(overridePose: Boolean): Unit {
    Internals.writeArguments(BOOL to overridePose)
    Internals.callMethod(rawPtr, MethodBindings.setOverridePosePtr, NIL)
  }

  public final fun getOverridePose(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getOverridePosePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets whether the BoneAttachment3D node will use an external [Skeleton3D] node rather than
   * attempting to use its parent node as the [Skeleton3D]. When set to `true`, the BoneAttachment3D
   * node will use the external [Skeleton3D] node set in [setExternalSkeleton].
   */
  public final fun setUseExternalSkeleton(useExternalSkeleton: Boolean): Unit {
    Internals.writeArguments(BOOL to useExternalSkeleton)
    Internals.callMethod(rawPtr, MethodBindings.setUseExternalSkeletonPtr, NIL)
  }

  /**
   * Returns whether the BoneAttachment3D node is using an external [Skeleton3D] rather than
   * attempting to use its parent node as the [Skeleton3D].
   */
  public final fun getUseExternalSkeleton(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getUseExternalSkeletonPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the [NodePath] to the external skeleton that the BoneAttachment3D node should use. See
   * [setUseExternalSkeleton] to enable the external [Skeleton3D] node.
   */
  public final fun setExternalSkeleton(externalSkeleton: NodePath): Unit {
    Internals.writeArguments(NODE_PATH to externalSkeleton)
    Internals.callMethod(rawPtr, MethodBindings.setExternalSkeletonPtr, NIL)
  }

  /**
   * Returns the [NodePath] to the external [Skeleton3D] node, if one has been set.
   */
  public final fun getExternalSkeleton(): NodePath {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getExternalSkeletonPtr, NODE_PATH)
    return (Internals.readReturnValue(NODE_PATH) as NodePath)
  }

  public companion object

  public object MethodBindings {
    internal val setBoneNamePtr: VoidPtr =
        Internals.getMethodBindPtr("BoneAttachment3D", "set_bone_name", 83702148)

    internal val getBoneNamePtr: VoidPtr =
        Internals.getMethodBindPtr("BoneAttachment3D", "get_bone_name", 201670096)

    internal val setBoneIdxPtr: VoidPtr =
        Internals.getMethodBindPtr("BoneAttachment3D", "set_bone_idx", 1286410249)

    internal val getBoneIdxPtr: VoidPtr =
        Internals.getMethodBindPtr("BoneAttachment3D", "get_bone_idx", 3905245786)

    internal val onSkeletonUpdatePtr: VoidPtr =
        Internals.getMethodBindPtr("BoneAttachment3D", "on_skeleton_update", 3218959716)

    internal val setOverridePosePtr: VoidPtr =
        Internals.getMethodBindPtr("BoneAttachment3D", "set_override_pose", 2586408642)

    internal val getOverridePosePtr: VoidPtr =
        Internals.getMethodBindPtr("BoneAttachment3D", "get_override_pose", 36873697)

    internal val setUseExternalSkeletonPtr: VoidPtr =
        Internals.getMethodBindPtr("BoneAttachment3D", "set_use_external_skeleton", 2586408642)

    internal val getUseExternalSkeletonPtr: VoidPtr =
        Internals.getMethodBindPtr("BoneAttachment3D", "get_use_external_skeleton", 36873697)

    internal val setExternalSkeletonPtr: VoidPtr =
        Internals.getMethodBindPtr("BoneAttachment3D", "set_external_skeleton", 1348162250)

    internal val getExternalSkeletonPtr: VoidPtr =
        Internals.getMethodBindPtr("BoneAttachment3D", "get_external_skeleton", 4075236667)
  }
}
