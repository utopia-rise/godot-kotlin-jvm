// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_COMPOSITOR_INDEX: Int = 182

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
    Internals.callConstructor(this, ENGINE_CLASS_COMPOSITOR_INDEX, scriptIndex)
  }

  public final fun setCompositorEffects(compositorEffects: VariantArray<CompositorEffect>): Unit {
    Internals.writeArguments(ARRAY to compositorEffects)
    Internals.callMethod(rawPtr, MethodBindings.setCompositorEffectsPtr, NIL)
  }

  public final fun getCompositorEffects(): VariantArray<CompositorEffect> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCompositorEffectsPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<CompositorEffect>)
  }

  public companion object

  internal object MethodBindings {
    public val setCompositorEffectsPtr: VoidPtr =
        Internals.getMethodBindPtr("Compositor", "set_compositor_effects", 381264803)

    public val getCompositorEffectsPtr: VoidPtr =
        Internals.getMethodBindPtr("Compositor", "get_compositor_effects", 3995934104)
  }
}
