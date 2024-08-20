// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmInline

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
  public var bodyTracker: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBodyTrackerPtr, STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBodyTrackerPtr, NIL)
    }

  /**
   * Specifies the body parts to update.
   */
  public var bodyUpdate: BodyUpdate
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBodyUpdatePtr, LONG)
      return BodyUpdateValue(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.flag)
      TransferContext.callMethod(rawPtr, MethodBindings.setBodyUpdatePtr, NIL)
    }

  /**
   * Specifies the type of updates to perform on the bones.
   */
  public var boneUpdate: BoneUpdate
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBoneUpdatePtr, LONG)
      return XRBodyModifier3D.BoneUpdate.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setBoneUpdatePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_XRBODYMODIFIER3D, scriptIndex)
    return true
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setBodyTrackerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRBodyModifier3D", "set_body_tracker")

    public val getBodyTrackerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRBodyModifier3D", "get_body_tracker")

    public val setBodyUpdatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRBodyModifier3D", "set_body_update")

    public val getBodyUpdatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRBodyModifier3D", "get_body_update")

    public val setBoneUpdatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRBodyModifier3D", "set_bone_update")

    public val getBoneUpdatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRBodyModifier3D", "get_bone_update")
  }
}

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
