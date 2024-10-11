// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_GPUPARTICLESCOLLISIONSPHERE3D_INDEX: Int = 278

/**
 * A sphere-shaped 3D particle collision shape affecting [GPUParticles3D] nodes.
 * Particle collision shapes work in real-time and can be moved, rotated and scaled during gameplay.
 * Unlike attractors, non-uniform scaling of collision shapes is *not* supported.
 * **Note:** [ParticleProcessMaterial.collisionMode] must be
 * [ParticleProcessMaterial.COLLISION_RIGID] or [ParticleProcessMaterial.COLLISION_HIDE_ON_CONTACT] on
 * the [GPUParticles3D]'s process material for collision to work.
 * **Note:** Particle collision only affects [GPUParticles3D], not [CPUParticles3D].
 */
@GodotBaseType
public open class GPUParticlesCollisionSphere3D : GPUParticlesCollision3D() {
  /**
   * The collision sphere's radius in 3D units.
   */
  public final inline var radius: Float
    @JvmName("radiusProperty")
    get() = getRadius()
    @JvmName("radiusProperty")
    set(`value`) {
      setRadius(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_GPUPARTICLESCOLLISIONSPHERE3D_INDEX, scriptIndex)
  }

  public final fun setRadius(radius: Float): Unit {
    Internals.writeArguments(DOUBLE to radius.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setRadiusPtr, NIL)
  }

  public final fun getRadius(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRadiusPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object

  public object MethodBindings {
    internal val setRadiusPtr: VoidPtr =
        Internals.getMethodBindPtr("GPUParticlesCollisionSphere3D", "set_radius", 373806689)

    internal val getRadiusPtr: VoidPtr =
        Internals.getMethodBindPtr("GPUParticlesCollisionSphere3D", "get_radius", 1740695150)
  }
}
