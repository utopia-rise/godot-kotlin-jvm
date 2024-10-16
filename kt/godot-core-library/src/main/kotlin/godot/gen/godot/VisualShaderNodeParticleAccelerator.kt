// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.MemoryManager
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
 * Particle accelerator can be used in "process" step of particle shader. It will accelerate the
 * particles. Connect it to the Velocity output port.
 */
@GodotBaseType
public open class VisualShaderNodeParticleAccelerator : VisualShaderNode() {
  /**
   * Defines in what manner the particles will be accelerated.
   */
  public final inline var mode: Mode
    @JvmName("modeProperty")
    get() = getMode()
    @JvmName("modeProperty")
    set(`value`) {
      setMode(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    MemoryManager.createNativeObject(ENGINECLASS_VISUALSHADERNODEPARTICLEACCELERATOR, this,
        scriptIndex)
  }

  public final fun setMode(mode: Mode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setModePtr, NIL)
  }

  public final fun getMode(): Mode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getModePtr, LONG)
    return VisualShaderNodeParticleAccelerator.Mode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class Mode(
    id: Long,
  ) {
    /**
     * The particles will be accelerated based on their velocity.
     */
    MODE_LINEAR(0),
    /**
     * The particles will be accelerated towards or away from the center.
     */
    MODE_RADIAL(1),
    /**
     * The particles will be accelerated tangentially to the radius vector from center to their
     * position.
     */
    MODE_TANGENTIAL(2),
    /**
     * Represents the size of the [Mode] enum.
     */
    MODE_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Mode = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeParticleAccelerator", "set_mode", 3457585749)

    public val getModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeParticleAccelerator", "get_mode", 2660365633)
  }
}
