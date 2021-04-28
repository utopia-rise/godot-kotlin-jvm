// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.Color
import godot.core.Plane
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PLANE
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR3
import godot.core.Vector2
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress

/**
 * Draws simple geometry from code.
 *
 * Draws simple geometry from code. Uses a drawing mode similar to OpenGL 1.x.
 *
 * See also [godot.ArrayMesh], [godot.MeshDataTool] and [godot.SurfaceTool] for procedural geometry generation.
 *
 * **Note:** ImmediateGeometry3D is best suited to small amounts of mesh data that change every frame. It will be slow when handling large amounts of mesh data. If mesh data doesn't change often, use [godot.ArrayMesh], [godot.MeshDataTool] or [godot.SurfaceTool] instead.
 *
 * **Note:** Godot uses clockwise [winding order](https://learnopengl.com/Advanced-OpenGL/Face-culling) for front faces of triangle primitive modes.
 *
 * **Note:** In case of missing points when handling large amounts of mesh data, try increasing its buffer size limit under [godot.ProjectSettings.rendering/limits/buffers/immediateBufferSizeKb].
 */
@GodotBaseType
open class ImmediateGeometry : GeometryInstance() {
  override fun __new() {
    callConstructor(ENGINECLASS_IMMEDIATEGEOMETRY)
  }

  /**
   * Simple helper to draw an UV sphere with given latitude, longitude and radius.
   */
  open fun addSphere(
    lats: Long,
    lons: Long,
    radius: Double,
    addUv: Boolean = true
  ) {
    TransferContext.writeArguments(LONG to lats, LONG to lons, DOUBLE to radius, BOOL to addUv)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMMEDIATEGEOMETRY_ADD_SPHERE, NIL)
  }

  /**
   * Adds a vertex in local coordinate space with the currently set color/uv/etc.
   */
  open fun addVertex(position: Vector3) {
    TransferContext.writeArguments(VECTOR3 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMMEDIATEGEOMETRY_ADD_VERTEX, NIL)
  }

  /**
   * Begin drawing (and optionally pass a texture override). When done call [end]. For more information on how this works, search for `glBegin()` and `glEnd()` references.
   *
   * For the type of primitive, see the [enum Mesh.PrimitiveType] enum.
   */
  open fun begin(primitive: Long, texture: Texture? = null) {
    TransferContext.writeArguments(LONG to primitive, OBJECT to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMMEDIATEGEOMETRY_BEGIN, NIL)
  }

  /**
   * Clears everything that was drawn using begin/end.
   */
  open fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMMEDIATEGEOMETRY_CLEAR, NIL)
  }

  /**
   * Ends a drawing context and displays the results.
   */
  open fun end() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMMEDIATEGEOMETRY_END, NIL)
  }

  /**
   * The current drawing color.
   */
  open fun setColor(color: Color) {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMMEDIATEGEOMETRY_SET_COLOR, NIL)
  }

  /**
   * The next vertex's normal.
   */
  open fun setNormal(normal: Vector3) {
    TransferContext.writeArguments(VECTOR3 to normal)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMMEDIATEGEOMETRY_SET_NORMAL, NIL)
  }

  /**
   * The next vertex's tangent (and binormal facing).
   */
  open fun setTangent(tangent: Plane) {
    TransferContext.writeArguments(PLANE to tangent)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMMEDIATEGEOMETRY_SET_TANGENT, NIL)
  }

  /**
   * The next vertex's UV.
   */
  open fun setUv(uv: Vector2) {
    TransferContext.writeArguments(VECTOR2 to uv)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMMEDIATEGEOMETRY_SET_UV, NIL)
  }

  /**
   * The next vertex's second layer UV.
   */
  open fun setUv2(uv: Vector2) {
    TransferContext.writeArguments(VECTOR2 to uv)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMMEDIATEGEOMETRY_SET_UV2, NIL)
  }
}
