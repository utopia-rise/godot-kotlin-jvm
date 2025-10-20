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
import godot.core.RID
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.LONG
import godot.core.VariantParser._RID
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmStatic

/**
 * Uniform set cache manager for Rendering Device based renderers. Provides a way to create a
 * uniform set and reuse it in subsequent calls for as long as the uniform set exists. Uniform set will
 * automatically be cleaned up when dependent objects are freed.
 */
@GodotBaseType
public open class UniformSetCacheRD : Object() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(722, scriptIndex)
  }

  public companion object {
    /**
     * Creates/returns a cached uniform set based on the provided uniforms for a given shader.
     */
    @JvmStatic
    public final fun getCache(
      shader: RID,
      `set`: Long,
      uniforms: VariantArray<RDUniform>,
    ): RID {
      TransferContext.writeArguments(_RID to shader, LONG to set, ARRAY to uniforms)
      TransferContext.callMethod(0, MethodBindings.getCachePtr, _RID)
      return (TransferContext.readReturnValue(_RID) as RID)
    }
  }

  public object MethodBindings {
    internal val getCachePtr: VoidPtr =
        TypeManager.getMethodBindPtr("UniformSetCacheRD", "get_cache", 658571723)
  }
}
