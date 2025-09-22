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
import godot.core.NodePath
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.NODE_PATH
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.core.asCachedNodePath
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
   * Whether the [BoneAttachment3D] node will override the bone pose of the bone it is attached to.
   * When set to `true`, the [BoneAttachment3D] node can change the pose of the bone. When set to
   * `false`, the [BoneAttachment3D] will always be set to the bone's transform.
   *
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

  /**
   * Whether the [BoneAttachment3D] node will use an external [Skeleton3D] node rather than
   * attempting to use its parent node as the [Skeleton3D]. When set to `true`, the [BoneAttachment3D]
   * node will use the external [Skeleton3D] node set in [externalSkeleton].
   */
  public final inline var useExternalSkeleton: Boolean
    @JvmName("useExternalSkeletonProperty")
    get() = getUseExternalSkeleton()
    @JvmName("useExternalSkeletonProperty")
    set(`value`) {
      setUseExternalSkeleton(value)
    }

  /**
   * The [NodePath] to the external [Skeleton3D] node.
   */
  public final inline var externalSkeleton: NodePath
    @JvmName("externalSkeletonProperty")
    get() = getExternalSkeleton()
    @JvmName("externalSkeletonProperty")
    set(`value`) {
      setExternalSkeleton(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(109, scriptIndex)
  }

  /**
   * Returns the parent or external [Skeleton3D] node if it exists, otherwise returns `null`.
   */
  public final fun getSkeleton(): Skeleton3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSkeletonPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Skeleton3D?)
  }

  public final fun setBoneName(boneName: String): Unit {
    TransferContext.writeArguments(STRING to boneName)
    TransferContext.callMethod(ptr, MethodBindings.setBoneNamePtr, NIL)
  }

  public final fun getBoneName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBoneNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setBoneIdx(boneIdx: Int): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setBoneIdxPtr, NIL)
  }

  public final fun getBoneIdx(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBoneIdxPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * A function that is called automatically when the [Skeleton3D] is updated. This function is
   * where the [BoneAttachment3D] node updates its position so it is correctly bound when it is *not*
   * set to override the bone pose.
   */
  public final fun onSkeletonUpdate(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.onSkeletonUpdatePtr, NIL)
  }

  public final fun setOverridePose(overridePose: Boolean): Unit {
    TransferContext.writeArguments(BOOL to overridePose)
    TransferContext.callMethod(ptr, MethodBindings.setOverridePosePtr, NIL)
  }

  public final fun getOverridePose(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOverridePosePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setUseExternalSkeleton(useExternalSkeleton: Boolean): Unit {
    TransferContext.writeArguments(BOOL to useExternalSkeleton)
    TransferContext.callMethod(ptr, MethodBindings.setUseExternalSkeletonPtr, NIL)
  }

  public final fun getUseExternalSkeleton(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getUseExternalSkeletonPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setExternalSkeleton(externalSkeleton: NodePath): Unit {
    TransferContext.writeArguments(NODE_PATH to externalSkeleton)
    TransferContext.callMethod(ptr, MethodBindings.setExternalSkeletonPtr, NIL)
  }

  public final fun getExternalSkeleton(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getExternalSkeletonPtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH) as NodePath)
  }

  public final fun setExternalSkeleton(externalSkeleton: String) =
      setExternalSkeleton(externalSkeleton.asCachedNodePath())

  public companion object

  public object MethodBindings {
    internal val getSkeletonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneAttachment3D", "get_skeleton", 1814733083)

    internal val setBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneAttachment3D", "set_bone_name", 83702148)

    internal val getBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneAttachment3D", "get_bone_name", 201670096)

    internal val setBoneIdxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneAttachment3D", "set_bone_idx", 1286410249)

    internal val getBoneIdxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneAttachment3D", "get_bone_idx", 3905245786)

    internal val onSkeletonUpdatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneAttachment3D", "on_skeleton_update", 3218959716)

    internal val setOverridePosePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneAttachment3D", "set_override_pose", 2586408642)

    internal val getOverridePosePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneAttachment3D", "get_override_pose", 36873697)

    internal val setUseExternalSkeletonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneAttachment3D", "set_use_external_skeleton", 2586408642)

    internal val getUseExternalSkeletonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneAttachment3D", "get_use_external_skeleton", 36873697)

    internal val setExternalSkeletonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneAttachment3D", "set_external_skeleton", 1348162250)

    internal val getExternalSkeletonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneAttachment3D", "get_external_skeleton", 4075236667)
  }
}
