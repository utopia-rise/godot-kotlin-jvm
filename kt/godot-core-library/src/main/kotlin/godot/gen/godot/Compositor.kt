// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.internal.reflection.TypeManager
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.NIL
import godot.internal.memory.TransferContext
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * The compositor resource stores attributes used to customize how a [Viewport] is rendered.
 */
@GodotBaseType
public open class Compositor : Resource() {
  /**
   * The custom [CompositorEffect]s that are applied during rendering of viewports using this
   * compositor.
   */
  public final inline var compositorEffects: VariantArray<CompositorEffect>
    @JvmName("compositorEffectsProperty")
    get() = getCompositorEffects()
    @JvmName("compositorEffectsProperty")
    set(`value`) {
      setCompositorEffects(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_COMPOSITOR, scriptIndex)
  }

  public final fun setCompositorEffects(compositorEffects: VariantArray<CompositorEffect>): Unit {
    TransferContext.writeArguments(ARRAY to compositorEffects)
    TransferContext.callMethod(ptr, MethodBindings.setCompositorEffectsPtr, NIL)
  }

  public final fun getCompositorEffects(): VariantArray<CompositorEffect> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCompositorEffectsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<CompositorEffect>)
  }

  public companion object

  internal object MethodBindings {
    public val setCompositorEffectsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Compositor", "set_compositor_effects", 381264803)

    public val getCompositorEffectsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Compositor", "get_compositor_effects", 3995934104)
  }
}
