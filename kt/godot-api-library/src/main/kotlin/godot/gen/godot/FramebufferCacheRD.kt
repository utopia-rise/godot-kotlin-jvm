// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.LONG
import godot.core.VariantParser._RID
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_FRAMEBUFFERCACHERD_INDEX: Int = 229

/**
 * Framebuffer cache manager for Rendering Device based renderers. Provides a way to create a
 * framebuffer and reuse it in subsequent calls for as long as the used textures exists. Framebuffers
 * will automatically be cleaned up when dependent objects are freed.
 */
@GodotBaseType
public open class FramebufferCacheRD : Object() {
  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINE_CLASS_FRAMEBUFFERCACHERD_INDEX, scriptIndex)
  }

  public companion object {
    /**
     * Creates, or obtains a cached, framebuffer. [textures] lists textures accessed. [passes]
     * defines the subpasses and texture allocation, if left empty a single pass is created and
     * textures are allocated depending on their usage flags. [views] defines the number of views used
     * when rendering.
     */
    public final fun getCacheMultipass(
      textures: VariantArray<RID>,
      passes: VariantArray<RDFramebufferPass>,
      views: Long,
    ): RID {
      TransferContext.writeArguments(ARRAY to textures, ARRAY to passes, LONG to views)
      TransferContext.callMethod(0, MethodBindings.getCacheMultipassPtr, _RID)
      return (TransferContext.readReturnValue(_RID) as RID)
    }
  }

  internal object MethodBindings {
    public val getCacheMultipassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FramebufferCacheRD", "get_cache_multipass", 3437881813)
  }
}
