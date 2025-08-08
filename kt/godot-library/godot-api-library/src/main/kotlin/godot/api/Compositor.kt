// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.NIL
import kotlin.Int
import kotlin.Suppress
import kotlin.jvm.JvmName

/**
 * The compositor resource stores attributes used to customize how a [Viewport] is rendered.
 */
@GodotBaseType
public open class Compositor : Resource() {
  /**
   * The custom [CompositorEffect]s that are applied during rendering of viewports using this compositor.
   */
  public final inline var compositorEffects: VariantArray<CompositorEffect>
    @JvmName("compositorEffectsProperty")
    get() = getCompositorEffects()
    @JvmName("compositorEffectsProperty")
    set(`value`) {
      setCompositorEffects(value)
    }

  override fun new(scriptIndex: Int) {
    createNativeObject(164, scriptIndex)
  }

  public final fun setCompositorEffects(compositorEffects: VariantArray<CompositorEffect>) {
    TransferContext.writeArguments(ARRAY to compositorEffects)
    TransferContext.callMethod(ptr, MethodBindings.setCompositorEffectsPtr, NIL)
  }

  public final fun getCompositorEffects(): VariantArray<CompositorEffect> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCompositorEffectsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<CompositorEffect>)
  }

  public companion object

  public object MethodBindings {
    internal val setCompositorEffectsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Compositor", "set_compositor_effects", 381_264_803)

    internal val getCompositorEffectsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Compositor", "get_compositor_effects", 3_995_934_104)
  }
}
