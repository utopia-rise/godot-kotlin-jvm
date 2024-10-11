// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING_NAME
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_XRHANDMODIFIER3D_INDEX: Int = 844

/**
 * This node uses hand tracking data from an [XRHandTracker] to pose the skeleton of a hand mesh.
 * Positioning of hands is performed by creating an [XRNode3D] ancestor of the hand mesh driven by
 * the same [XRHandTracker].
 * The hand tracking position-data is scaled by [Skeleton3D.motionScale] when applied to the
 * skeleton, which can be used to adjust the tracked hand to match the scale of the hand model.
 */
@GodotBaseType
public open class XRHandModifier3D : SkeletonModifier3D() {
  /**
   * The name of the [XRHandTracker] registered with [XRServer] to obtain the hand tracking data
   * from.
   */
  public final inline var handTracker: StringName
    @JvmName("handTrackerProperty")
    get() = getHandTracker()
    @JvmName("handTrackerProperty")
    set(`value`) {
      setHandTracker(value)
    }

  /**
   * Specifies the type of updates to perform on the bones.
   */
  public final inline var boneUpdate: BoneUpdate
    @JvmName("boneUpdateProperty")
    get() = getBoneUpdate()
    @JvmName("boneUpdateProperty")
    set(`value`) {
      setBoneUpdate(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_XRHANDMODIFIER3D_INDEX, scriptIndex)
  }

  public final fun setHandTracker(trackerName: StringName): Unit {
    Internals.writeArguments(STRING_NAME to trackerName)
    Internals.callMethod(rawPtr, MethodBindings.setHandTrackerPtr, NIL)
  }

  public final fun getHandTracker(): StringName {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getHandTrackerPtr, STRING_NAME)
    return (Internals.readReturnValue(STRING_NAME) as StringName)
  }

  public final fun setBoneUpdate(boneUpdate: BoneUpdate): Unit {
    Internals.writeArguments(LONG to boneUpdate.id)
    Internals.callMethod(rawPtr, MethodBindings.setBoneUpdatePtr, NIL)
  }

  public final fun getBoneUpdate(): BoneUpdate {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBoneUpdatePtr, LONG)
    return XRHandModifier3D.BoneUpdate.from(Internals.readReturnValue(LONG) as Long)
  }

  public enum class BoneUpdate(
    id: Long,
  ) {
    /**
     * The skeleton's bones are fully updated (both position and rotation) to match the tracked
     * bones.
     */
    BONE_UPDATE_FULL(0),
    /**
     * The skeleton's bones are only rotated to align with the tracked bones, preserving bone
     * length.
     */
    BONE_UPDATE_ROTATION_ONLY(1),
    /**
     * Represents the size of the [BoneUpdate] enum.
     */
    BONE_UPDATE_MAX(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): BoneUpdate = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val setHandTrackerPtr: VoidPtr =
        Internals.getMethodBindPtr("XRHandModifier3D", "set_hand_tracker", 3304788590)

    internal val getHandTrackerPtr: VoidPtr =
        Internals.getMethodBindPtr("XRHandModifier3D", "get_hand_tracker", 2002593661)

    internal val setBoneUpdatePtr: VoidPtr =
        Internals.getMethodBindPtr("XRHandModifier3D", "set_bone_update", 3635701455)

    internal val getBoneUpdatePtr: VoidPtr =
        Internals.getMethodBindPtr("XRHandModifier3D", "get_bone_update", 2873665691)
  }
}
