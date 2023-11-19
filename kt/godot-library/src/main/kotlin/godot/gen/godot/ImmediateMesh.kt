// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.Plane
import godot.core.TypeManager
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
import godot.util.VoidPtr
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
    TransferContext.callMethod(rawPtr, MethodBindings.surfaceBeginPtr, NIL)
  }

  /**
   * Set the color attribute that will be pushed with the next vertex.
   */
  public fun surfaceSetColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.surfaceSetColorPtr, NIL)
  }

  /**
   * Set the normal attribute that will be pushed with the next vertex.
   */
  public fun surfaceSetNormal(normal: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to normal)
    TransferContext.callMethod(rawPtr, MethodBindings.surfaceSetNormalPtr, NIL)
  }

  /**
   * Set the tangent attribute that will be pushed with the next vertex.
   */
  public fun surfaceSetTangent(tangent: Plane): Unit {
    TransferContext.writeArguments(PLANE to tangent)
    TransferContext.callMethod(rawPtr, MethodBindings.surfaceSetTangentPtr, NIL)
  }

  /**
   * Set the UV attribute that will be pushed with the next vertex.
   */
  public fun surfaceSetUv(uv: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to uv)
    TransferContext.callMethod(rawPtr, MethodBindings.surfaceSetUvPtr, NIL)
  }

  /**
   * Set the UV2 attribute that will be pushed with the next vertex.
   */
  public fun surfaceSetUv2(uv2: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to uv2)
    TransferContext.callMethod(rawPtr, MethodBindings.surfaceSetUv2Ptr, NIL)
  }

  /**
   * Add a 3D vertex using the current attributes previously set.
   */
  public fun surfaceAddVertex(vertex: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to vertex)
    TransferContext.callMethod(rawPtr, MethodBindings.surfaceAddVertexPtr, NIL)
  }

  /**
   * Add a 2D vertex using the current attributes previously set.
   */
  public fun surfaceAddVertex2d(vertex: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to vertex)
    TransferContext.callMethod(rawPtr, MethodBindings.surfaceAddVertex2dPtr, NIL)
  }

  /**
   * End and commit current surface. Note that surface being created will not be visible until this function is called.
   */
  public fun surfaceEnd(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.surfaceEndPtr, NIL)
  }

  /**
   * Clear all surfaces.
   */
  public fun clearSurfaces(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearSurfacesPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val surfaceBeginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImmediateMesh", "surface_begin")

    public val surfaceSetColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImmediateMesh", "surface_set_color")

    public val surfaceSetNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImmediateMesh", "surface_set_normal")

    public val surfaceSetTangentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImmediateMesh", "surface_set_tangent")

    public val surfaceSetUvPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImmediateMesh", "surface_set_uv")

    public val surfaceSetUv2Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("ImmediateMesh", "surface_set_uv2")

    public val surfaceAddVertexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImmediateMesh", "surface_add_vertex")

    public val surfaceAddVertex2dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImmediateMesh", "surface_add_vertex_2d")

    public val surfaceEndPtr: VoidPtr = TypeManager.getMethodBindPtr("ImmediateMesh", "surface_end")

    public val clearSurfacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImmediateMesh", "clear_surfaces")
  }
}
