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
import godot.core.StringName
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING_NAME
import godot.core.asCachedStringName
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

public infix fun Long.or(other: XRBodyModifier3D.BodyUpdate): Long = this.or(other.flag)

public infix fun Long.xor(other: XRBodyModifier3D.BodyUpdate): Long = this.xor(other.flag)

public infix fun Long.and(other: XRBodyModifier3D.BodyUpdate): Long = this.and(other.flag)

/**
 * This node uses body tracking data from an [XRBodyTracker] to pose the skeleton of a body mesh.
 *
 * Positioning of the body is performed by creating an [XRNode3D] ancestor of the body mesh driven
 * by the same [XRBodyTracker].
 *
 * The body tracking position-data is scaled by [Skeleton3D.motionScale] when applied to the
 * skeleton, which can be used to adjust the tracked body to match the scale of the body model.
 */
@GodotBaseType
public open class XRBodyModifier3D : SkeletonModifier3D() {
  /**
   * The name of the [XRBodyTracker] registered with [XRServer] to obtain the body tracking data
   * from.
   */
  public final inline var bodyTracker: StringName
    @JvmName("bodyTrackerProperty")
    get() = getBodyTracker()
    @JvmName("bodyTrackerProperty")
    set(`value`) {
      setBodyTracker(value)
    }

  /**
   * Specifies the body parts to update.
   */
  public final inline var bodyUpdate: BodyUpdate
    @JvmName("bodyUpdateProperty")
    get() = getBodyUpdate()
    @JvmName("bodyUpdateProperty")
    set(`value`) {
      setBodyUpdate(value)
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
    createNativeObject(862, scriptIndex)
  }

  public final fun setBodyTracker(trackerName: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to trackerName)
    TransferContext.callMethod(ptr, MethodBindings.setBodyTrackerPtr, NIL)
  }

  public final fun getBodyTracker(): StringName {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBodyTrackerPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  public final fun setBodyUpdate(bodyUpdate: BodyUpdate): Unit {
    TransferContext.writeArguments(LONG to bodyUpdate.flag)
    TransferContext.callMethod(ptr, MethodBindings.setBodyUpdatePtr, NIL)
  }

  public final fun getBodyUpdate(): BodyUpdate {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBodyUpdatePtr, LONG)
    return BodyUpdate(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setBoneUpdate(boneUpdate: BoneUpdate): Unit {
    TransferContext.writeArguments(LONG to boneUpdate.id)
    TransferContext.callMethod(ptr, MethodBindings.setBoneUpdatePtr, NIL)
  }

  public final fun getBoneUpdate(): BoneUpdate {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBoneUpdatePtr, LONG)
    return XRBodyModifier3D.BoneUpdate.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setBodyTracker(trackerName: String) =
      setBodyTracker(trackerName.asCachedStringName())

  @JvmInline
  public value class BodyUpdate(
    public val flag: Long,
  ) {
    public infix fun or(other: BodyUpdate): BodyUpdate = BodyUpdate(flag.or(other.flag))

    public infix fun or(other: Long): BodyUpdate = BodyUpdate(flag.or(other))

    public infix fun xor(other: BodyUpdate): BodyUpdate = BodyUpdate(flag.xor(other.flag))

    public infix fun xor(other: Long): BodyUpdate = BodyUpdate(flag.xor(other))

    public infix fun and(other: BodyUpdate): BodyUpdate = BodyUpdate(flag.and(other.flag))

    public infix fun and(other: Long): BodyUpdate = BodyUpdate(flag.and(other))

    public fun unaryPlus(): BodyUpdate = BodyUpdate(flag.unaryPlus())

    public fun unaryMinus(): BodyUpdate = BodyUpdate(flag.unaryMinus())

    public fun inv(): BodyUpdate = BodyUpdate(flag.inv())

    public infix fun shl(bits: Int): BodyUpdate = BodyUpdate(flag shl bits)

    public infix fun shr(bits: Int): BodyUpdate = BodyUpdate(flag shr bits)

    public infix fun ushr(bits: Int): BodyUpdate = BodyUpdate(flag ushr bits)

    public companion object {
      /**
       * The skeleton's upper body joints are updated.
       */
      public val UPPER_BODY: BodyUpdate = BodyUpdate(1)

      /**
       * The skeleton's lower body joints are updated.
       */
      public val LOWER_BODY: BodyUpdate = BodyUpdate(2)

      /**
       * The skeleton's hand joints are updated.
       */
      public val HANDS: BodyUpdate = BodyUpdate(4)
    }
  }

  public enum class BoneUpdate(
    id: Long,
  ) {
    /**
     * The skeleton's bones are fully updated (both position and rotation) to match the tracked
     * bones.
     */
    FULL(0),
    /**
     * The skeleton's bones are only rotated to align with the tracked bones, preserving bone
     * length.
     */
    ROTATION_ONLY(1),
    /**
     * Represents the size of the [BoneUpdate] enum.
     */
    MAX(2),
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
    internal val setBodyTrackerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRBodyModifier3D", "set_body_tracker", 3304788590)

    internal val getBodyTrackerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRBodyModifier3D", "get_body_tracker", 2002593661)

    internal val setBodyUpdatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRBodyModifier3D", "set_body_update", 2211199417)

    internal val getBodyUpdatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRBodyModifier3D", "get_body_update", 2642335328)

    internal val setBoneUpdatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRBodyModifier3D", "set_bone_update", 3356796943)

    internal val getBoneUpdatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRBodyModifier3D", "get_bone_update", 1309305964)
  }
}
