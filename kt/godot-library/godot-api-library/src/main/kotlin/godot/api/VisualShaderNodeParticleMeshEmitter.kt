// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
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

  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(794, scriptPtr)
  }

  public final fun setMesh(mesh: Mesh?): Unit {
    TransferContext.writeArguments(OBJECT to mesh)
    TransferContext.callMethod(ptr, MethodBindings.setMeshPtr, NIL)
  }

  public final fun getMesh(): Mesh? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMeshPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Mesh?)
  }

  public final fun setUseAllSurfaces(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setUseAllSurfacesPtr, NIL)
  }

  public final fun isUseAllSurfaces(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isUseAllSurfacesPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setSurfaceIndex(surfaceIndex: Int): Unit {
    TransferContext.writeArguments(LONG to surfaceIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setSurfaceIndexPtr, NIL)
  }

  public final fun getSurfaceIndex(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSurfaceIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public companion object

  public object MethodBindings {
    internal val setMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeParticleMeshEmitter", "set_mesh", 194775623)

    internal val getMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeParticleMeshEmitter", "get_mesh", 1808005922)

    internal val setUseAllSurfacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeParticleMeshEmitter", "set_use_all_surfaces", 2586408642)

    internal val isUseAllSurfacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeParticleMeshEmitter", "is_use_all_surfaces", 36873697)

    internal val setSurfaceIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeParticleMeshEmitter", "set_surface_index", 1286410249)

    internal val getSurfaceIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeParticleMeshEmitter", "get_surface_index", 3905245786)
  }
}
