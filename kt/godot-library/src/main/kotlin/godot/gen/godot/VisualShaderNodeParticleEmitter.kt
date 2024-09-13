// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Particle emitter nodes can be used in "start" step of particle shaders and they define the
 * starting position of the particles. Connect them to the Position output port.
 */
@GodotBaseType
public open class VisualShaderNodeParticleEmitter internal constructor() : VisualShaderNode() {
  /**
   * If `true`, the result of this emitter is projected to 2D space. By default it is `false` and
   * meant for use in 3D space.
   */
  public final inline var mode2d: Boolean
    @JvmName("mode2dProperty")
    get() = isMode2d()
    @JvmName("mode2dProperty")
    set(`value`) {
      setMode2d(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_VISUALSHADERNODEPARTICLEEMITTER, scriptIndex)
  }

  public final fun setMode2d(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setMode2dPtr, NIL)
  }

  public final fun isMode2d(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isMode2dPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setMode2dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeParticleEmitter", "set_mode_2d", 2586408642)

    public val isMode2dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeParticleEmitter", "is_mode_2d", 36873697)
  }
}
