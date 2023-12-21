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
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Particle accelerator can be used in "process" step of particle shader. It will accelerate the
 * particles. Connect it to the Velocity output port.
 */
@GodotBaseType
public open class VisualShaderNodeParticleAccelerator : VisualShaderNode() {
  /**
   * Defines in what manner the particles will be accelerated.
   */
  public var mode: Mode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getModePtr, LONG)
      return VisualShaderNodeParticleAccelerator.Mode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setModePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODEPARTICLEACCELERATOR, scriptIndex)
    return true
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeParticleAccelerator", "set_mode")

    public val getModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeParticleAccelerator", "get_mode")
  }
}
