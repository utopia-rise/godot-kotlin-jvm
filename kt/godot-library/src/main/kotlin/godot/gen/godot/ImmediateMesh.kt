// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.Plane
import godot.core.VariantType.COLOR
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PLANE
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR3
import godot.core.Vector2
import godot.core.Vector3
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * Mesh optimized for creating geometry manually.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/3d/procedural_geometry/immediatemesh.html]($DOCS_URL/tutorials/3d/procedural_geometry/immediatemesh.html)
 *
 * A mesh type optimized for creating geometry manually, similar to OpenGL 1.x immediate mode.
 *
 * Here's a sample on how to generate a triangular face:
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * var mesh = ImmediateMesh.new()
 *
 * mesh.surface_begin(Mesh.PRIMITIVE_TRIANGLES)
 *
 * mesh.surface_add_vertex(Vector3.LEFT)
 *
 * mesh.surface_add_vertex(Vector3.FORWARD)
 *
 * mesh.surface_add_vertex(Vector3.ZERO)
 *
 * mesh.surface_end()
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * var mesh = new ImmediateMesh();
 *
 * mesh.SurfaceBegin(Mesh.PrimitiveType.Triangles);
 *
 * mesh.SurfaceAddVertex(Vector3.Left);
 *
 * mesh.SurfaceAddVertex(Vector3.Forward);
 *
 * mesh.SurfaceAddVertex(Vector3.Zero);
 *
 * mesh.SurfaceEnd();
 *
 * [/csharp]
 *
 * [/codeblocks]
 *
 * **Note:** Generating complex geometries with [godot.ImmediateMesh] is highly inefficient. Instead, it is designed to generate simple geometry that changes often.
 */
@GodotBaseType
public open class ImmediateMesh : Mesh() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_IMMEDIATEMESH, scriptIndex)
    return true
  }

  /**
   * Begin a new surface.
   */
  @JvmOverloads
  public fun surfaceBegin(primitive: Mesh.PrimitiveType, material: Material? = null): Unit {
    TransferContext.writeArguments(LONG to primitive.id, OBJECT to material)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMMEDIATEMESH_SURFACE_BEGIN, NIL)
  }

  /**
   * Set the color attribute that will be pushed with the next vertex.
   */
  public fun surfaceSetColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMMEDIATEMESH_SURFACE_SET_COLOR,
        NIL)
  }

  /**
   * Set the normal attribute that will be pushed with the next vertex.
   */
  public fun surfaceSetNormal(normal: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to normal)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMMEDIATEMESH_SURFACE_SET_NORMAL,
        NIL)
  }

  /**
   * Set the tangent attribute that will be pushed with the next vertex.
   */
  public fun surfaceSetTangent(tangent: Plane): Unit {
    TransferContext.writeArguments(PLANE to tangent)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMMEDIATEMESH_SURFACE_SET_TANGENT,
        NIL)
  }

  /**
   * Set the UV attribute that will be pushed with the next vertex.
   */
  public fun surfaceSetUv(uv: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to uv)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMMEDIATEMESH_SURFACE_SET_UV, NIL)
  }

  /**
   * Set the UV2 attribute that will be pushed with the next vertex.
   */
  public fun surfaceSetUv2(uv2: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to uv2)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMMEDIATEMESH_SURFACE_SET_UV2, NIL)
  }

  /**
   * Add a 3D vertex using the current attributes previously set.
   */
  public fun surfaceAddVertex(vertex: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to vertex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMMEDIATEMESH_SURFACE_ADD_VERTEX,
        NIL)
  }

  /**
   * Add a 2D vertex using the current attributes previously set.
   */
  public fun surfaceAddVertex2d(vertex: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to vertex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMMEDIATEMESH_SURFACE_ADD_VERTEX_2D,
        NIL)
  }

  /**
   * End and commit current surface. Note that surface being created will not be visible until this function is called.
   */
  public fun surfaceEnd(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMMEDIATEMESH_SURFACE_END, NIL)
  }

  /**
   * Clear all surfaces.
   */
  public fun clearSurfaces(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMMEDIATEMESH_CLEAR_SURFACES, NIL)
  }

  public companion object
}
