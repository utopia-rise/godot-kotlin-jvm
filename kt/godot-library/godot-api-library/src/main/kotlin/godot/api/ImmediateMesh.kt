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
import godot.core.Color
import godot.core.Plane
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PLANE
import godot.core.VariantParser.VECTOR2
import godot.core.VariantParser.VECTOR3
import godot.core.Vector2
import godot.core.Vector3
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * A mesh type optimized for creating geometry manually, similar to OpenGL 1.x immediate mode.
 * Here's a sample on how to generate a triangular face:
 *
 * gdscript:
 * ```gdscript
 * var mesh = ImmediateMesh.new()
 * mesh.surface_begin(Mesh.PRIMITIVE_TRIANGLES)
 * mesh.surface_add_vertex(Vector3.LEFT)
 * mesh.surface_add_vertex(Vector3.FORWARD)
 * mesh.surface_add_vertex(Vector3.ZERO)
 * mesh.surface_end()
 * ```
 * csharp:
 * ```csharp
 * var mesh = new ImmediateMesh();
 * mesh.SurfaceBegin(Mesh.PrimitiveType.Triangles);
 * mesh.SurfaceAddVertex(Vector3.Left);
 * mesh.SurfaceAddVertex(Vector3.Forward);
 * mesh.SurfaceAddVertex(Vector3.Zero);
 * mesh.SurfaceEnd();
 * ```
 *
 * **Note:** Generating complex geometries with [ImmediateMesh] is highly inefficient. Instead, it
 * is designed to generate simple geometry that changes often.
 */
@GodotBaseType
public open class ImmediateMesh : Mesh() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(314, scriptIndex)
  }

  /**
   * Begin a new surface.
   */
  @JvmOverloads
  public final fun surfaceBegin(primitive: Mesh.PrimitiveType, material: Material? = null): Unit {
    TransferContext.writeArguments(LONG to primitive.id, OBJECT to material)
    TransferContext.callMethod(ptr, MethodBindings.surfaceBeginPtr, NIL)
  }

  /**
   * Set the color attribute that will be pushed with the next vertex.
   */
  public final fun surfaceSetColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.surfaceSetColorPtr, NIL)
  }

  /**
   * Set the normal attribute that will be pushed with the next vertex.
   */
  public final fun surfaceSetNormal(normal: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to normal)
    TransferContext.callMethod(ptr, MethodBindings.surfaceSetNormalPtr, NIL)
  }

  /**
   * Set the tangent attribute that will be pushed with the next vertex.
   */
  public final fun surfaceSetTangent(tangent: Plane): Unit {
    TransferContext.writeArguments(PLANE to tangent)
    TransferContext.callMethod(ptr, MethodBindings.surfaceSetTangentPtr, NIL)
  }

  /**
   * Set the UV attribute that will be pushed with the next vertex.
   */
  public final fun surfaceSetUv(uv: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to uv)
    TransferContext.callMethod(ptr, MethodBindings.surfaceSetUvPtr, NIL)
  }

  /**
   * Set the UV2 attribute that will be pushed with the next vertex.
   */
  public final fun surfaceSetUv2(uv2: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to uv2)
    TransferContext.callMethod(ptr, MethodBindings.surfaceSetUv2Ptr, NIL)
  }

  /**
   * Add a 3D vertex using the current attributes previously set.
   */
  public final fun surfaceAddVertex(vertex: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to vertex)
    TransferContext.callMethod(ptr, MethodBindings.surfaceAddVertexPtr, NIL)
  }

  /**
   * Add a 2D vertex using the current attributes previously set.
   */
  public final fun surfaceAddVertex2d(vertex: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to vertex)
    TransferContext.callMethod(ptr, MethodBindings.surfaceAddVertex2dPtr, NIL)
  }

  /**
   * End and commit current surface. Note that surface being created will not be visible until this
   * function is called.
   */
  public final fun surfaceEnd(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.surfaceEndPtr, NIL)
  }

  /**
   * Clear all surfaces.
   */
  public final fun clearSurfaces(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearSurfacesPtr, NIL)
  }

  public companion object

  public object MethodBindings {
    internal val surfaceBeginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImmediateMesh", "surface_begin", 2794442543)

    internal val surfaceSetColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImmediateMesh", "surface_set_color", 2920490490)

    internal val surfaceSetNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImmediateMesh", "surface_set_normal", 3460891852)

    internal val surfaceSetTangentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImmediateMesh", "surface_set_tangent", 3505987427)

    internal val surfaceSetUvPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImmediateMesh", "surface_set_uv", 743155724)

    internal val surfaceSetUv2Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("ImmediateMesh", "surface_set_uv2", 743155724)

    internal val surfaceAddVertexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImmediateMesh", "surface_add_vertex", 3460891852)

    internal val surfaceAddVertex2dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImmediateMesh", "surface_add_vertex_2d", 743155724)

    internal val surfaceEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImmediateMesh", "surface_end", 3218959716)

    internal val clearSurfacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImmediateMesh", "clear_surfaces", 3218959716)
  }
}
