// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.AABB
import godot.core.Color
import godot.core.Dictionary
import godot.core.Plane
import godot.core.StringName
import godot.core.VariantArray
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PLANE
import godot.core.VariantParser.VECTOR2
import godot.core.VariantParser.VECTOR3
import godot.core.Vector2
import godot.core.Vector3
import kotlin.Any
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

/**
 * A mesh type optimized for creating geometry manually, similar to OpenGL 1.x immediate mode.
 *
 * Here's a sample on how to generate a triangular face:
 *
 * ```gdscript
 * //gdscript
 * var mesh = ImmediateMesh.new()
 * mesh.surface_begin(Mesh.PRIMITIVE_TRIANGLES)
 * mesh.surface_add_vertex(Vector3.LEFT)
 * mesh.surface_add_vertex(Vector3.FORWARD)
 * mesh.surface_add_vertex(Vector3.ZERO)
 * mesh.surface_end()
 * ```
 *
 * ```csharp
 * //csharp
 * var mesh = new ImmediateMesh();
 * mesh.SurfaceBegin(Mesh.PrimitiveType.Triangles);
 * mesh.SurfaceAddVertex(Vector3.Left);
 * mesh.SurfaceAddVertex(Vector3.Forward);
 * mesh.SurfaceAddVertex(Vector3.Zero);
 * mesh.SurfaceEnd();
 * ```
 *
 * **Note:** Generating complex geometries with [ImmediateMesh] is highly inefficient. Instead, it is designed to generate simple geometry that changes often.
 */
@GodotBaseType
public open class ImmediateMesh : Mesh() {
  override fun new(scriptIndex: Int) {
    createNativeObject(288, scriptIndex)
  }

  /**
   * Begin a new surface.
   */
  @JvmOverloads
  public final fun surfaceBegin(primitive: Mesh.PrimitiveType, material: Material? = null) {
    TransferContext.writeArguments(LONG to primitive.id, OBJECT to material)
    TransferContext.callMethod(ptr, MethodBindings.surfaceBeginPtr, NIL)
  }

  /**
   * Set the color attribute that will be pushed with the next vertex.
   */
  public final fun surfaceSetColor(color: Color) {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.surfaceSetColorPtr, NIL)
  }

  /**
   * Set the normal attribute that will be pushed with the next vertex.
   */
  public final fun surfaceSetNormal(normal: Vector3) {
    TransferContext.writeArguments(VECTOR3 to normal)
    TransferContext.callMethod(ptr, MethodBindings.surfaceSetNormalPtr, NIL)
  }

  /**
   * Set the tangent attribute that will be pushed with the next vertex.
   */
  public final fun surfaceSetTangent(tangent: Plane) {
    TransferContext.writeArguments(PLANE to tangent)
    TransferContext.callMethod(ptr, MethodBindings.surfaceSetTangentPtr, NIL)
  }

  /**
   * Set the UV attribute that will be pushed with the next vertex.
   */
  public final fun surfaceSetUv(uv: Vector2) {
    TransferContext.writeArguments(VECTOR2 to uv)
    TransferContext.callMethod(ptr, MethodBindings.surfaceSetUvPtr, NIL)
  }

  /**
   * Set the UV2 attribute that will be pushed with the next vertex.
   */
  public final fun surfaceSetUv2(uv2: Vector2) {
    TransferContext.writeArguments(VECTOR2 to uv2)
    TransferContext.callMethod(ptr, MethodBindings.surfaceSetUv2Ptr, NIL)
  }

  /**
   * Add a 3D vertex using the current attributes previously set.
   */
  public final fun surfaceAddVertex(vertex: Vector3) {
    TransferContext.writeArguments(VECTOR3 to vertex)
    TransferContext.callMethod(ptr, MethodBindings.surfaceAddVertexPtr, NIL)
  }

  /**
   * Add a 2D vertex using the current attributes previously set.
   */
  public final fun surfaceAddVertex2d(vertex: Vector2) {
    TransferContext.writeArguments(VECTOR2 to vertex)
    TransferContext.callMethod(ptr, MethodBindings.surfaceAddVertex2dPtr, NIL)
  }

  /**
   * End and commit current surface. Note that surface being created will not be visible until this function is called.
   */
  public final fun surfaceEnd() {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.surfaceEndPtr, NIL)
  }

  /**
   * Clear all surfaces.
   */
  public final fun clearSurfaces() {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearSurfacesPtr, NIL)
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _getSurfaceCount(): Int {
    throw NotImplementedError("ImmediateMesh::_getSurfaceCount can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _surfaceGetArrayLen(index: Int): Int {
    throw NotImplementedError("ImmediateMesh::_surfaceGetArrayLen can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _surfaceGetArrayIndexLen(index: Int): Int {
    throw NotImplementedError("ImmediateMesh::_surfaceGetArrayIndexLen can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _surfaceGetArrays(index: Int): VariantArray<Any?> {
    throw NotImplementedError("ImmediateMesh::_surfaceGetArrays can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _surfaceGetBlendShapeArrays(index: Int): VariantArray<VariantArray<Any?>> {
    throw NotImplementedError("ImmediateMesh::_surfaceGetBlendShapeArrays can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _surfaceGetLods(index: Int): Dictionary<Any?, Any?> {
    throw NotImplementedError("ImmediateMesh::_surfaceGetLods can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _surfaceGetFormat(index: Int): Long {
    throw NotImplementedError("ImmediateMesh::_surfaceGetFormat can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _surfaceGetPrimitiveType(index: Int): Long {
    throw NotImplementedError("ImmediateMesh::_surfaceGetPrimitiveType can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _surfaceSetMaterial(index: Int, material: Material?): Unit {
    throw NotImplementedError("ImmediateMesh::_surfaceSetMaterial can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _surfaceGetMaterial(index: Int): Material? {
    throw NotImplementedError("ImmediateMesh::_surfaceGetMaterial can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _getBlendShapeCount(): Int {
    throw NotImplementedError("ImmediateMesh::_getBlendShapeCount can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _getBlendShapeName(index: Int): StringName {
    throw NotImplementedError("ImmediateMesh::_getBlendShapeName can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _setBlendShapeName(index: Int, name: StringName): Unit {
    throw NotImplementedError("ImmediateMesh::_setBlendShapeName can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _getAabb(): AABB {
    throw NotImplementedError("ImmediateMesh::_getAabb can't be called from the JVM.")
  }

  public companion object

  public object MethodBindings {
    internal val surfaceBeginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImmediateMesh", "surface_begin", 2_794_442_543)

    internal val surfaceSetColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImmediateMesh", "surface_set_color", 2_920_490_490)

    internal val surfaceSetNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImmediateMesh", "surface_set_normal", 3_460_891_852)

    internal val surfaceSetTangentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImmediateMesh", "surface_set_tangent", 3_505_987_427)

    internal val surfaceSetUvPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImmediateMesh", "surface_set_uv", 743_155_724)

    internal val surfaceSetUv2Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("ImmediateMesh", "surface_set_uv2", 743_155_724)

    internal val surfaceAddVertexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImmediateMesh", "surface_add_vertex", 3_460_891_852)

    internal val surfaceAddVertex2dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImmediateMesh", "surface_add_vertex_2d", 743_155_724)

    internal val surfaceEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImmediateMesh", "surface_end", 3_218_959_716)

    internal val clearSurfacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ImmediateMesh", "clear_surfaces", 3_218_959_716)
  }
}
