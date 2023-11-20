// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * Base class for [godot.AnimationNode]s with more than two input ports that must be synchronized.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/animation/animation_tree.html]($DOCS_URL/tutorials/animation/animation_tree.html)
 *
 * An animation node used to combine, mix, or blend two or more animations together while keeping them synchronized within an [godot.AnimationTree].
 */
@GodotBaseType
public open class AnimationNodeSync : AnimationNode() {
  /**
   * If `false`, the blended animations' frame are stopped when the blend value is `0`.
   *
   * If `true`, forcing the blended animations to advance frame.
   */
  public var sync: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUsingSyncPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseSyncPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ANIMATIONNODESYNC, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setUseSyncPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeSync", "set_use_sync")

    public val isUsingSyncPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeSync", "is_using_sync")
  }
}
