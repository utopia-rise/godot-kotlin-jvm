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
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_XRBODYMODIFIER3D_INDEX: Int = 750

public infix fun Long.or(other: godot.XRBodyModifier3D.BodyUpdate): Long = this.or(other.flag)

public infix fun Long.xor(other: godot.XRBodyModifier3D.BodyUpdate): Long = this.xor(other.flag)

public infix fun Long.and(other: godot.XRBodyModifier3D.BodyUpdate): Long = this.and(other.flag)

public operator fun Long.plus(other: godot.XRBodyModifier3D.BodyUpdate): Long =
    this.plus(other.flag)

public operator fun Long.minus(other: godot.XRBodyModifier3D.BodyUpdate): Long =
    this.minus(other.flag)

public operator fun Long.times(other: godot.XRBodyModifier3D.BodyUpdate): Long =
    this.times(other.flag)

public operator fun Long.div(other: godot.XRBodyModifier3D.BodyUpdate): Long = this.div(other.flag)

public operator fun Long.rem(other: godot.XRBodyModifier3D.BodyUpdate): Long = this.rem(other.flag)

/**
 * This node uses body tracking data from an [XRBodyTracker] to pose the skeleton of a body mesh.
 * Positioning of the body is performed by creating an [XRNode3D] ancestor of the body mesh driven
 * by the same [XRBodyTracker].
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
    Internals.callConstructor(this, ENGINE_CLASS_XRBODYMODIFIER3D_INDEX, scriptIndex)
  }

  public final fun setBodyTracker(trackerName: StringName): Unit {
    Internals.writeArguments(STRING_NAME to trackerName)
    Internals.callMethod(rawPtr, MethodBindings.setBodyTrackerPtr, NIL)
  }

  public final fun getBodyTracker(): StringName {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBodyTrackerPtr, STRING_NAME)
    return (Internals.readReturnValue(STRING_NAME) as StringName)
  }

  public final fun setBodyUpdate(bodyUpdate: BodyUpdate): Unit {
    Internals.writeArguments(LONG to bodyUpdate.flag)
    Internals.callMethod(rawPtr, MethodBindings.setBodyUpdatePtr, NIL)
  }

  public final fun getBodyUpdate(): BodyUpdate {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBodyUpdatePtr, LONG)
    return BodyUpdateValue(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setBoneUpdate(boneUpdate: BoneUpdate): Unit {
    Internals.writeArguments(LONG to boneUpdate.id)
    Internals.callMethod(rawPtr, MethodBindings.setBoneUpdatePtr, NIL)
  }

  public final fun getBoneUpdate(): BoneUpdate {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBoneUpdatePtr, LONG)
    return XRBodyModifier3D.BoneUpdate.from(Internals.readReturnValue(LONG) as Long)
  }

  public sealed interface BodyUpdate {
    public val flag: Long

    public infix fun or(other: BodyUpdate): BodyUpdate = BodyUpdateValue(flag.or(other.flag))

    public infix fun or(other: Long): BodyUpdate = BodyUpdateValue(flag.or(other))

    public infix fun xor(other: BodyUpdate): BodyUpdate = BodyUpdateValue(flag.xor(other.flag))

    public infix fun xor(other: Long): BodyUpdate = BodyUpdateValue(flag.xor(other))

    public infix fun and(other: BodyUpdate): BodyUpdate = BodyUpdateValue(flag.and(other.flag))

    public infix fun and(other: Long): BodyUpdate = BodyUpdateValue(flag.and(other))

    public operator fun plus(other: BodyUpdate): BodyUpdate = BodyUpdateValue(flag.plus(other.flag))

    public operator fun plus(other: Long): BodyUpdate = BodyUpdateValue(flag.plus(other))

    public operator fun minus(other: BodyUpdate): BodyUpdate =
        BodyUpdateValue(flag.minus(other.flag))

    public operator fun minus(other: Long): BodyUpdate = BodyUpdateValue(flag.minus(other))

    public operator fun times(other: BodyUpdate): BodyUpdate =
        BodyUpdateValue(flag.times(other.flag))

    public operator fun times(other: Long): BodyUpdate = BodyUpdateValue(flag.times(other))

    public operator fun div(other: BodyUpdate): BodyUpdate = BodyUpdateValue(flag.div(other.flag))

    public operator fun div(other: Long): BodyUpdate = BodyUpdateValue(flag.div(other))

    public operator fun rem(other: BodyUpdate): BodyUpdate = BodyUpdateValue(flag.rem(other.flag))

    public operator fun rem(other: Long): BodyUpdate = BodyUpdateValue(flag.rem(other))

    public fun unaryPlus(): BodyUpdate = BodyUpdateValue(flag.unaryPlus())

    public fun unaryMinus(): BodyUpdate = BodyUpdateValue(flag.unaryMinus())

    public fun inv(): BodyUpdate = BodyUpdateValue(flag.inv())

    public infix fun shl(bits: Int): BodyUpdate = BodyUpdateValue(flag shl bits)

    public infix fun shr(bits: Int): BodyUpdate = BodyUpdateValue(flag shr bits)

    public infix fun ushr(bits: Int): BodyUpdate = BodyUpdateValue(flag ushr bits)

    public companion object {
      public val BODY_UPDATE_UPPER_BODY: BodyUpdate = BodyUpdateValue(1)

      public val BODY_UPDATE_LOWER_BODY: BodyUpdate = BodyUpdateValue(2)

      public val BODY_UPDATE_HANDS: BodyUpdate = BodyUpdateValue(4)
    }
  }

  @JvmInline
  internal value class BodyUpdateValue internal constructor(
    public override val flag: Long,
  ) : BodyUpdate

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

  internal object MethodBindings {
    public val setBodyTrackerPtr: VoidPtr =
        Internals.getMethodBindPtr("XRBodyModifier3D", "set_body_tracker", 3304788590)

    public val getBodyTrackerPtr: VoidPtr =
        Internals.getMethodBindPtr("XRBodyModifier3D", "get_body_tracker", 2002593661)

    public val setBodyUpdatePtr: VoidPtr =
        Internals.getMethodBindPtr("XRBodyModifier3D", "set_body_update", 2211199417)

    public val getBodyUpdatePtr: VoidPtr =
        Internals.getMethodBindPtr("XRBodyModifier3D", "get_body_update", 2642335328)

    public val setBoneUpdatePtr: VoidPtr =
        Internals.getMethodBindPtr("XRBodyModifier3D", "set_bone_update", 3356796943)

    public val getBoneUpdatePtr: VoidPtr =
        Internals.getMethodBindPtr("XRBodyModifier3D", "get_bone_update", 1309305964)
  }
}
