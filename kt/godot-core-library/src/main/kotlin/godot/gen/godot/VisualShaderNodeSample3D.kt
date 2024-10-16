// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A virtual class, use the descendants instead.
 */
@GodotBaseType
public open class VisualShaderNodeSample3D internal constructor() : VisualShaderNode() {
  /**
   * An input source type.
   */
  public final inline var source: Source
    @JvmName("sourceProperty")
    get() = getSource()
    @JvmName("sourceProperty")
    set(`value`) {
      setSource(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_VISUALSHADERNODESAMPLE3D, scriptIndex)
  }

  public final fun setSource(`value`: Source): Unit {
    TransferContext.writeArguments(LONG to value.id)
    TransferContext.callMethod(ptr, MethodBindings.setSourcePtr, NIL)
  }

  public final fun getSource(): Source {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSourcePtr, LONG)
    return VisualShaderNodeSample3D.Source.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class Source(
    id: Long,
  ) {
    /**
     * Creates internal uniform and provides a way to assign it within node.
     */
    SOURCE_TEXTURE(0),
    /**
     * Use the uniform texture from sampler port.
     */
    SOURCE_PORT(1),
    /**
     * Represents the size of the [Source] enum.
     */
    SOURCE_MAX(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Source = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setSourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeSample3D", "set_source", 3315130991)

    public val getSourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeSample3D", "get_source", 1079494121)
  }
}
