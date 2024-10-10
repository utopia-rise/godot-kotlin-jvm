// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_VISUALSHADERNODEPARTICLEACCELERATOR_INDEX: Int = 672

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
    Internals.callConstructor(this, ENGINE_CLASS_VISUALSHADERNODEPARTICLEACCELERATOR_INDEX,
        scriptIndex)
  }

  public final fun setMode(mode: Mode): Unit {
    Internals.writeArguments(LONG to mode.id)
    Internals.callMethod(rawPtr, MethodBindings.setModePtr, NIL)
  }

  public final fun getMode(): Mode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getModePtr, LONG)
    return VisualShaderNodeParticleAccelerator.Mode.from(Internals.readReturnValue(LONG) as Long)
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
        Internals.getMethodBindPtr("VisualShaderNodeParticleAccelerator", "set_mode", 3457585749)

    public val getModePtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeParticleAccelerator", "get_mode", 2660365633)
  }
}
