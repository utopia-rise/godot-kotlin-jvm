// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
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
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEPARTICLEMESHEMITTER_GET_MESH, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Mesh?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEPARTICLEMESHEMITTER_SET_MESH, NIL)
    }

  /**
   * If `true`, the particles will emit from all surfaces of the mesh.
   */
  public var useAllSurfaces: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEPARTICLEMESHEMITTER_IS_USE_ALL_SURFACES, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEPARTICLEMESHEMITTER_SET_USE_ALL_SURFACES, NIL)
    }

  /**
   * Index of the surface that emits particles. [useAllSurfaces] must be `false` for this to take effect.
   */
  public var surfaceIndex: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEPARTICLEMESHEMITTER_GET_SURFACE_INDEX, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEPARTICLEMESHEMITTER_SET_SURFACE_INDEX, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODEPARTICLEMESHEMITTER, scriptIndex)
    return true
  }

  public companion object
}
