// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_VISUALSHADERNODEPARTICLEMESHEMITTER_INDEX: Int = 676

/**
 * [VisualShaderNodeParticleEmitter] that makes the particles emitted in a shape of the assigned
 * [mesh]. It will emit from the mesh's surfaces, either all or only the specified one.
 */
@GodotBaseType
public open class VisualShaderNodeParticleMeshEmitter : VisualShaderNodeParticleEmitter() {
  /**
   * The [Mesh] that defines emission shape.
   */
  public final inline var mesh: Mesh?
    @JvmName("meshProperty")
    get() = getMesh()
    @JvmName("meshProperty")
    set(`value`) {
      setMesh(value)
    }

  /**
   * If `true`, the particles will emit from all surfaces of the mesh.
   */
  public final inline var useAllSurfaces: Boolean
    @JvmName("useAllSurfacesProperty")
    get() = isUseAllSurfaces()
    @JvmName("useAllSurfacesProperty")
    set(`value`) {
      setUseAllSurfaces(value)
    }

  /**
   * Index of the surface that emits particles. [useAllSurfaces] must be `false` for this to take
   * effect.
   */
  public final inline var surfaceIndex: Int
    @JvmName("surfaceIndexProperty")
    get() = getSurfaceIndex()
    @JvmName("surfaceIndexProperty")
    set(`value`) {
      setSurfaceIndex(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_VISUALSHADERNODEPARTICLEMESHEMITTER_INDEX,
        scriptIndex)
  }

  public final fun setMesh(mesh: Mesh?): Unit {
    Internals.writeArguments(OBJECT to mesh)
    Internals.callMethod(rawPtr, MethodBindings.setMeshPtr, NIL)
  }

  public final fun getMesh(): Mesh? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMeshPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Mesh?)
  }

  public final fun setUseAllSurfaces(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setUseAllSurfacesPtr, NIL)
  }

  public final fun isUseAllSurfaces(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isUseAllSurfacesPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setSurfaceIndex(surfaceIndex: Int): Unit {
    Internals.writeArguments(LONG to surfaceIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setSurfaceIndexPtr, NIL)
  }

  public final fun getSurfaceIndex(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSurfaceIndexPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public companion object

  internal object MethodBindings {
    public val setMeshPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeParticleMeshEmitter", "set_mesh", 194775623)

    public val getMeshPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeParticleMeshEmitter", "get_mesh", 1808005922)

    public val setUseAllSurfacesPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeParticleMeshEmitter", "set_use_all_surfaces", 2586408642)

    public val isUseAllSurfacesPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeParticleMeshEmitter", "is_use_all_surfaces", 36873697)

    public val setSurfaceIndexPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeParticleMeshEmitter", "set_surface_index", 1286410249)

    public val getSurfaceIndexPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeParticleMeshEmitter", "get_surface_index", 3905245786)
  }
}
