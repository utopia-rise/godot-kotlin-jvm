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
import godot.core.VariantType.ARRAY
import godot.core.VariantType.LONG
import godot.core.VariantType._RID
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Uniform set cache manager for Rendering Device based renderers. Provides a way to create a
 * uniform set and reuse it in subsequent calls for as long as the uniform set exists. Uniform set will
 * automatically be cleaned up when dependent objects are freed.
 */
@GodotBaseType
public open class UniformSetCacheRD : Object() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_UNIFORMSETCACHERD, scriptIndex)
    return true
  }

  public companion object {
    /**
     * Creates/returns a cached uniform set based on the provided uniforms for a given shader.
     */
    public fun getCache(
      shader: RID,
      `set`: Long,
      uniforms: VariantArray<RDUniform>,
    ): RID {
      TransferContext.writeArguments(_RID to shader, LONG to set, ARRAY to uniforms)
      TransferContext.callMethod(0, MethodBindings.getCachePtr, _RID)
      return (TransferContext.readReturnValue(_RID, false) as RID)
    }
  }

  internal object MethodBindings {
    public val getCachePtr: VoidPtr = TypeManager.getMethodBindPtr("UniformSetCacheRD", "get_cache")
  }
}
