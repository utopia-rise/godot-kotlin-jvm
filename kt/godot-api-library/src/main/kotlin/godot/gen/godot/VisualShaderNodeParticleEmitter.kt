// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.NIL
import godot.util.Internals
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
    Internals.callConstructor(this, ENGINE_CLASS_VISUALSHADERNODEPARTICLEEMITTER_INDEX, scriptIndex)
  }

  public final fun setMode2d(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setMode2dPtr, NIL)
  }

  public final fun isMode2d(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isMode2dPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setMode2dPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeParticleEmitter", "set_mode_2d", 2586408642)

    public val isMode2dPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeParticleEmitter", "is_mode_2d", 36873697)
  }
}
