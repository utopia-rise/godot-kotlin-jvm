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
import godot.core.PackedFloat32Array
import godot.core.PackedFloat64Array
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.PACKED_FLOAT_32_ARRAY
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmStatic

/**
 * [AnimationNodeExtension] exposes the APIs of [AnimationRootNode] to allow users to extend it from
 * GDScript, C#, or C++. This class is not meant to be used directly, but to be extended by other
 * classes. It is used to create custom nodes for the [AnimationTree] system.
 */
@GodotBaseType
public open class AnimationNodeExtension : AnimationNode() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(24, scriptIndex)
  }

  /**
   * A version of the [AnimationNode.Process] method that is meant to be overridden by custom nodes.
   * It returns a [PackedFloat32Array] with the processed animation data.
   * The [PackedFloat64Array] parameter contains the playback information, containing the following
   * values encoded as floating point numbers (in order): playback time and delta, start and end times,
   * whether a seek was requested (encoded as a float greater than `0`), whether the seek request was
   * externally requested (encoded as a float greater than `0`), the current [Animation.LoopedFlag]
   * (encoded as a float), and the current blend weight.
   * The function must return a [PackedFloat32Array] of the node's time info, containing the
   * following values (in order): animation length, time position, delta, [Animation.LoopMode] (encoded
   * as a float), whether the animation is about to end (encoded as a float greater than `0`) and
   * whether the animation is infinite (encoded as a float greater than `0`). All values must be
   * included in the returned array.
   */
  public open fun _processAnimationNode(playbackInfo: PackedFloat64Array, testOnly: Boolean):
      PackedFloat32Array {
    throw NotImplementedError("_processAnimationNode is not implemented for AnimationNodeExtension")
  }

  public companion object {
    /**
     * Returns `true` if the animation for the given [nodeInfo] is looping.
     */
    @JvmStatic
    public final fun isLooping(nodeInfo: PackedFloat32Array): Boolean {
      TransferContext.writeArguments(PACKED_FLOAT_32_ARRAY to nodeInfo)
      TransferContext.callMethod(0, MethodBindings.isLoopingPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL) as Boolean)
    }

    /**
     * Returns the animation's remaining time for the given node info. For looping animations, it
     * will only return the remaining time if [breakLoop] is `true`, a large integer value will be
     * returned otherwise.
     */
    @JvmStatic
    public final fun getRemainingTime(nodeInfo: PackedFloat32Array, breakLoop: Boolean): Double {
      TransferContext.writeArguments(PACKED_FLOAT_32_ARRAY to nodeInfo, BOOL to breakLoop)
      TransferContext.callMethod(0, MethodBindings.getRemainingTimePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE) as Double)
    }
  }

  public object MethodBindings {
    internal val isLoopingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeExtension", "is_looping", 2035584311)

    internal val getRemainingTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeExtension", "get_remaining_time", 2851904656)
  }
}
