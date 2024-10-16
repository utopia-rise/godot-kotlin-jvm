// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.MemoryManager
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.NIL
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * An animation node used to combine, mix, or blend two or more animations together while keeping
 * them synchronized within an [AnimationTree].
 */
@GodotBaseType
public open class AnimationNodeSync : AnimationNode() {
  /**
   * If `false`, the blended animations' frame are stopped when the blend value is `0`.
   * If `true`, forcing the blended animations to advance frame.
   */
  public final inline var sync: Boolean
    @JvmName("syncProperty")
    get() = isUsingSync()
    @JvmName("syncProperty")
    set(`value`) {
      setUseSync(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    MemoryManager.createNativeObject(ENGINECLASS_ANIMATIONNODESYNC, this, scriptIndex)
  }

  public final fun setUseSync(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setUseSyncPtr, NIL)
  }

  public final fun isUsingSync(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isUsingSyncPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setUseSyncPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeSync", "set_use_sync", 2586408642)

    public val isUsingSyncPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeSync", "is_using_sync", 36873697)
  }
}
