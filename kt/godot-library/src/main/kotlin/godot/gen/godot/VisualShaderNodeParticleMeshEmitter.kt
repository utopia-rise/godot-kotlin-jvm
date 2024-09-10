// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
    callConstructor(ENGINECLASS_VISUALSHADERNODEPARTICLEMESHEMITTER, scriptIndex)
  }

  public final fun setMesh(mesh: Mesh?): Unit {
    TransferContext.writeArguments(OBJECT to mesh)
    TransferContext.callMethod(rawPtr, MethodBindings.setMeshPtr, NIL)
  }

  public final fun getMesh(): Mesh? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMeshPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Mesh?)
  }

  public final fun setUseAllSurfaces(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setUseAllSurfacesPtr, NIL)
  }

  public final fun isUseAllSurfaces(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isUseAllSurfacesPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public final fun setSurfaceIndex(surfaceIndex: Int): Unit {
    TransferContext.writeArguments(LONG to surfaceIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setSurfaceIndexPtr, NIL)
  }

  public final fun getSurfaceIndex(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSurfaceIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public companion object

  internal object MethodBindings {
    public val setMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeParticleMeshEmitter", "set_mesh", 194775623)

    public val getMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeParticleMeshEmitter", "get_mesh", 1808005922)

    public val setUseAllSurfacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeParticleMeshEmitter", "set_use_all_surfaces", 2586408642)

    public val isUseAllSurfacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeParticleMeshEmitter", "is_use_all_surfaces", 36873697)

    public val setSurfaceIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeParticleMeshEmitter", "set_surface_index", 1286410249)

    public val getSurfaceIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeParticleMeshEmitter", "get_surface_index", 3905245786)
  }
}
