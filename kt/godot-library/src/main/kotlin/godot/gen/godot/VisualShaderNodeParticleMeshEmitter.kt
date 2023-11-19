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

/**
 * A visual shader node that makes particles emitted in a shape defined by a [godot.Mesh].
 *
 * [godot.VisualShaderNodeParticleEmitter] that makes the particles emitted in a shape of the assigned [mesh]. It will emit from the mesh's surfaces, either all or only the specified one.
 */
@GodotBaseType
public open class VisualShaderNodeParticleMeshEmitter : VisualShaderNodeParticleEmitter() {
  /**
   * The [godot.Mesh] that defines emission shape.
   */
  public var mesh: Mesh?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMeshPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Mesh?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMeshPtr, NIL)
    }

  /**
   * If `true`, the particles will emit from all surfaces of the mesh.
   */
  public var useAllSurfaces: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUseAllSurfacesPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseAllSurfacesPtr, NIL)
    }

  /**
   * Index of the surface that emits particles. [useAllSurfaces] must be `false` for this to take effect.
   */
  public var surfaceIndex: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSurfaceIndexPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setSurfaceIndexPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODEPARTICLEMESHEMITTER, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeParticleMeshEmitter", "set_mesh")

    public val getMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeParticleMeshEmitter", "get_mesh")

    public val setUseAllSurfacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeParticleMeshEmitter", "set_use_all_surfaces")

    public val isUseAllSurfacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeParticleMeshEmitter", "is_use_all_surfaces")

    public val setSurfaceIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeParticleMeshEmitter", "set_surface_index")

    public val getSurfaceIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeParticleMeshEmitter", "get_surface_index")
  }
}
