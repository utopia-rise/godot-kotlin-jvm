// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * This node internally calls `emit_subparticle` shader method. It will emit a particle from the
 * configured sub-emitter and also allows to customize how its emitted. Requires a sub-emitter assigned
 * to the particles node with this shader.
 */
@GodotBaseType
public open class VisualShaderNodeParticleEmit : VisualShaderNode() {
  /**
   * Flags used to override the properties defined in the sub-emitter's process material.
   */
  public final inline var flags: EmitFlags
    @JvmName("flagsProperty")
    get() = getFlags()
    @JvmName("flagsProperty")
    set(`value`) {
      setFlags(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_VISUALSHADERNODEPARTICLEEMIT, scriptIndex)
  }

  public final fun setFlags(flags: EmitFlags): Unit {
    TransferContext.writeArguments(LONG to flags.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setFlagsPtr, NIL)
  }

  public final fun getFlags(): EmitFlags {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFlagsPtr, LONG)
    return VisualShaderNodeParticleEmit.EmitFlags.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class EmitFlags(
    id: Long,
  ) {
    /**
     * If enabled, the particle starts with the position defined by this node.
     */
    EMIT_FLAG_POSITION(1),
    /**
     * If enabled, the particle starts with the rotation and scale defined by this node.
     */
    EMIT_FLAG_ROT_SCALE(2),
    /**
     * If enabled,the particle starts with the velocity defined by this node.
     */
    EMIT_FLAG_VELOCITY(4),
    /**
     * If enabled, the particle starts with the color defined by this node.
     */
    EMIT_FLAG_COLOR(8),
    /**
     * If enabled, the particle starts with the `CUSTOM` data defined by this node.
     */
    EMIT_FLAG_CUSTOM(16),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): EmitFlags = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeParticleEmit", "set_flags", 3960756792)

    public val getFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeParticleEmit", "get_flags", 171277835)
  }
}
