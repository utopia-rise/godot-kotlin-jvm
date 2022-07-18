// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.Plane
import godot.core.TransferContext
import godot.core.VariantType.COLOR
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PLANE
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR3
import godot.core.Vector2
import godot.core.Vector3
import kotlin.Suppress
import kotlin.Unit

/**
 * Mesh optimized for creating geometry manually.
 *
 * Mesh optimized for creating geometry manually, similar to OpenGL1.x immediate mode.
 */
@GodotBaseType
public open class ImmediateMesh : Mesh() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_IMMEDIATEMESH)
  }

  /**
   * Begin a new surface.
   */
  public fun surfaceBegin(primitive: Mesh.PrimitiveType, material: Material? = null): Unit {
    TransferContext.writeArguments(LONG to primitive.id, OBJECT to material)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_IMMEDIATEMESH_SURFACE_BEGIN, NIL.ordinal)
  }

  /**
   * Set the color attribute that will be pushed with the next vertex.
   */
  public fun surfaceSetColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_IMMEDIATEMESH_SURFACE_SET_COLOR,
        NIL.ordinal)
  }

  /**
   * Set the normal attribute that will be pushed with the next vertex.
   */
  public fun surfaceSetNormal(normal: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to normal)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_IMMEDIATEMESH_SURFACE_SET_NORMAL,
        NIL.ordinal)
  }

  /**
   * Set the tangent attribute that will be pushed with the next vertex.
   */
  public fun surfaceSetTangent(tangent: Plane): Unit {
    TransferContext.writeArguments(PLANE to tangent)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_IMMEDIATEMESH_SURFACE_SET_TANGENT,
        NIL.ordinal)
  }

  /**
   * Set the UV attribute that will be pushed with the next vertex.
   */
  public fun surfaceSetUv(uv: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to uv)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_IMMEDIATEMESH_SURFACE_SET_UV,
        NIL.ordinal)
  }

  /**
   * Set the UV2 attribute that will be pushed with the next vertex.
   */
  public fun surfaceSetUv2(uv2: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to uv2)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_IMMEDIATEMESH_SURFACE_SET_UV2,
        NIL.ordinal)
  }

  /**
   * Add a 3D vertex using the current attributes previously set.
   */
  public fun surfaceAddVertex(vertex: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to vertex)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_IMMEDIATEMESH_SURFACE_ADD_VERTEX,
        NIL.ordinal)
  }

  /**
   * Add a 2D vertex using the current attributes previously set.
   */
  public fun surfaceAddVertex2d(vertex: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to vertex)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_IMMEDIATEMESH_SURFACE_ADD_VERTEX_2D,
        NIL.ordinal)
  }

  /**
   * End and commit current surface. Note that surface being created will not be visible until this function is called.
   */
  public fun surfaceEnd(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_IMMEDIATEMESH_SURFACE_END, NIL.ordinal)
  }

  /**
   * Clear all surfaces.
   */
  public fun clearSurfaces(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_IMMEDIATEMESH_CLEAR_SURFACES,
        NIL.ordinal)
  }

  public companion object
}
