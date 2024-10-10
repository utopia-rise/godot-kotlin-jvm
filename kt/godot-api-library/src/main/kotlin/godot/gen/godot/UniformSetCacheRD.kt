// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.LONG
import godot.core.VariantParser._RID
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_UNIFORMSETCACHERD_INDEX: Int = 685

/**
 * Uniform set cache manager for Rendering Device based renderers. Provides a way to create a
 * uniform set and reuse it in subsequent calls for as long as the uniform set exists. Uniform set will
 * automatically be cleaned up when dependent objects are freed.
 */
@GodotBaseType
public open class UniformSetCacheRD : Object() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_UNIFORMSETCACHERD_INDEX, scriptIndex)
  }

  public companion object {
    /**
     * Creates/returns a cached uniform set based on the provided uniforms for a given shader.
     */
    public final fun getCache(
      shader: RID,
      `set`: Long,
      uniforms: VariantArray<RDUniform>,
    ): RID {
      Internals.writeArguments(_RID to shader, LONG to set, ARRAY to uniforms)
      Internals.callMethod(0, MethodBindings.getCachePtr, _RID)
      return (Internals.readReturnValue(_RID) as RID)
    }
  }

  internal object MethodBindings {
    public val getCachePtr: VoidPtr =
        Internals.getMethodBindPtr("UniformSetCacheRD", "get_cache", 658571723)
  }
}
