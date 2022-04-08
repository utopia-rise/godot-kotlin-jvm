// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public open class GPUParticlesCollisionSDF3D : GPUParticlesCollision3D() {
  /**
   *
   */
  public var extents: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLESCOLLISIONSDF3D_GET_EXTENTS, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLESCOLLISIONSDF3D_SET_EXTENTS, NIL)
    }

  /**
   *
   */
  public var resolution: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLESCOLLISIONSDF3D_GET_RESOLUTION, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLESCOLLISIONSDF3D_SET_RESOLUTION, NIL)
    }

  /**
   *
   */
  public var thickness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLESCOLLISIONSDF3D_GET_THICKNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLESCOLLISIONSDF3D_SET_THICKNESS, NIL)
    }

  /**
   *
   */
  public var texture: Texture3D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLESCOLLISIONSDF3D_GET_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture3D?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GPUPARTICLESCOLLISIONSDF3D_SET_TEXTURE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_GPUPARTICLESCOLLISIONSDF3D)
  }

  public enum class Resolution(
    id: Long
  ) {
    /**
     *
     */
    RESOLUTION_16(0),
    /**
     *
     */
    RESOLUTION_32(1),
    /**
     *
     */
    RESOLUTION_64(2),
    /**
     *
     */
    RESOLUTION_128(3),
    /**
     *
     */
    RESOLUTION_256(4),
    /**
     *
     */
    RESOLUTION_512(5),
    /**
     *
     */
    RESOLUTION_MAX(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
