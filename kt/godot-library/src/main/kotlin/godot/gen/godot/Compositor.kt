// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * The compositor resource stores attributes used to customize how a [Viewport] is rendered.
 */
@GodotBaseType
public open class Compositor : Resource() {
  /**
   * The custom [CompositorEffect]s that are applied during rendering of viewports using this
   * compositor.
   */
  public var compositorEffects: VariantArray<CompositorEffect>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCompositorEffectsPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<CompositorEffect>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCompositorEffectsPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_COMPOSITOR, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setCompositorEffectsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Compositor", "set_compositor_effects")

    public val getCompositorEffectsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Compositor", "get_compositor_effects")
  }
}
