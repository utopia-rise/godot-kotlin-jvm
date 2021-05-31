// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.AABB
import godot.core.PoolVector3Array
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_VECTOR3_ARRAY
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Any
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A [godot.Resource] that contains vertex array-based geometry.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/678](https://godotengine.org/asset-library/asset/678)
 *
 * Mesh is a type of [godot.Resource] that contains vertex array-based geometry, divided in *surfaces*. Each surface contains a completely separate array and a material used to draw it. Design wise, a mesh with multiple surfaces is preferred to a single surface, because objects created in 3D editing software commonly contain multiple materials.
 */
@GodotBaseType
public open class Mesh : Resource() {
  /**
   * Sets a hint to be used for lightmap resolution in [godot.BakedLightmap]. Overrides [godot.BakedLightmap.defaultTexelsPerUnit].
   */
  public open var lightmapSizeHint: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_GET_LIGHTMAP_SIZE_HINT,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_SET_LIGHTMAP_SIZE_HINT, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_MESH)
  }

  @CoreTypeHelper
  public open fun lightmapSizeHint(schedule: Vector2.() -> Unit): Vector2 = lightmapSizeHint.apply{
      schedule(this)
      lightmapSizeHint = this
  }


  /**
   * Calculate a [godot.ConvexPolygonShape] from the mesh.
   */
  public open fun createConvexShape(): Shape? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_CREATE_CONVEX_SHAPE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Shape?
  }

  /**
   * Calculate an outline mesh at a defined offset (margin) from the original mesh.
   *
   * **Note:** This method typically returns the vertices in reverse order (e.g. clockwise to counterclockwise).
   */
  public open fun createOutline(margin: Double): Mesh? {
    TransferContext.writeArguments(DOUBLE to margin)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_CREATE_OUTLINE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Mesh?
  }

  /**
   * Calculate a [godot.ConcavePolygonShape] from the mesh.
   */
  public open fun createTrimeshShape(): Shape? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_CREATE_TRIMESH_SHAPE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Shape?
  }

  /**
   * Generate a [godot.TriangleMesh] from the mesh.
   */
  public open fun generateTriangleMesh(): TriangleMesh? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_GENERATE_TRIANGLE_MESH, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as TriangleMesh?
  }

  /**
   * Returns the smallest [AABB] enclosing this mesh in local space. Not affected by `custom_aabb`. See also [godot.VisualInstance.getTransformedAabb].
   *
   * **Note:** This is only implemented for [godot.ArrayMesh] and [godot.PrimitiveMesh].
   */
  public open fun getAabb(): AABB {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_GET_AABB,
        godot.core.VariantType.AABB)
    return TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB
  }

  /**
   * Returns all the vertices that make up the faces of the mesh. Each three vertices represent one triangle.
   */
  public open fun getFaces(): PoolVector3Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_GET_FACES, POOL_VECTOR3_ARRAY)
    return TransferContext.readReturnValue(POOL_VECTOR3_ARRAY, false) as PoolVector3Array
  }

  /**
   * Returns the amount of surfaces that the [godot.Mesh] holds.
   */
  public open fun getSurfaceCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_GET_SURFACE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the arrays for the vertices, normals, uvs, etc. that make up the requested surface (see [godot.ArrayMesh.addSurfaceFromArrays]).
   */
  public open fun surfaceGetArrays(surfIdx: Long): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to surfIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_SURFACE_GET_ARRAYS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns the blend shape arrays for the requested surface.
   */
  public open fun surfaceGetBlendShapeArrays(surfIdx: Long): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to surfIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_SURFACE_GET_BLEND_SHAPE_ARRAYS,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns a [godot.Material] in a given surface. Surface is rendered using this material.
   */
  public open fun surfaceGetMaterial(surfIdx: Long): Material? {
    TransferContext.writeArguments(LONG to surfIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_SURFACE_GET_MATERIAL, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Material?
  }

  /**
   * Sets a [godot.Material] for a given surface. Surface will be rendered using this material.
   */
  public open fun surfaceSetMaterial(surfIdx: Long, material: Material): Unit {
    TransferContext.writeArguments(LONG to surfIdx, OBJECT to material)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_SURFACE_SET_MATERIAL, NIL)
  }

  public enum class BlendShapeMode(
    id: Long
  ) {
    /**
     * Blend shapes are normalized.
     */
    BLEND_SHAPE_MODE_NORMALIZED(0),
    /**
     * Blend shapes are relative to base weight.
     */
    BLEND_SHAPE_MODE_RELATIVE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class PrimitiveType(
    id: Long
  ) {
    /**
     * Render array as points (one vertex equals one point).
     */
    PRIMITIVE_POINTS(0),
    /**
     * Render array as lines (every two vertices a line is created).
     */
    PRIMITIVE_LINES(1),
    /**
     * Render array as line strip.
     */
    PRIMITIVE_LINE_STRIP(2),
    /**
     * Render array as line loop (like line strip, but closed).
     */
    PRIMITIVE_LINE_LOOP(3),
    /**
     * Render array as triangles (every three vertices a triangle is created).
     */
    PRIMITIVE_TRIANGLES(4),
    /**
     * Render array as triangle strips.
     */
    PRIMITIVE_TRIANGLE_STRIP(5),
    /**
     * Render array as triangle fans.
     */
    PRIMITIVE_TRIANGLE_FAN(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ArrayFormat(
    id: Long
  ) {
    /**
     * Mesh array contains vertices. All meshes require a vertex array so this should always be present.
     */
    ARRAY_FORMAT_VERTEX(1),
    /**
     * Mesh array contains normals.
     */
    ARRAY_FORMAT_NORMAL(2),
    /**
     * Mesh array contains tangents.
     */
    ARRAY_FORMAT_TANGENT(4),
    /**
     * Mesh array contains colors.
     */
    ARRAY_FORMAT_COLOR(8),
    /**
     * Used internally to calculate other `ARRAY_COMPRESS_*` enum values. Do not use.
     */
    ARRAY_COMPRESS_BASE(9),
    /**
     * Mesh array contains UVs.
     */
    ARRAY_FORMAT_TEX_UV(16),
    /**
     * Mesh array contains second UV.
     */
    ARRAY_FORMAT_TEX_UV2(32),
    /**
     * Mesh array contains bones.
     */
    ARRAY_FORMAT_BONES(64),
    /**
     * Mesh array contains bone weights.
     */
    ARRAY_FORMAT_WEIGHTS(128),
    /**
     * Mesh array uses indices.
     */
    ARRAY_FORMAT_INDEX(256),
    /**
     * Flag used to mark a compressed (half float) vertex array.
     */
    ARRAY_COMPRESS_VERTEX(512),
    /**
     * Flag used to mark a compressed (half float) normal array.
     */
    ARRAY_COMPRESS_NORMAL(1024),
    /**
     * Flag used to mark a compressed (half float) tangent array.
     */
    ARRAY_COMPRESS_TANGENT(2048),
    /**
     * Flag used to mark a compressed (half float) color array.
     */
    ARRAY_COMPRESS_COLOR(4096),
    /**
     * Flag used to mark a compressed (half float) UV coordinates array.
     */
    ARRAY_COMPRESS_TEX_UV(8192),
    /**
     * Flag used to mark a compressed (half float) UV coordinates array for the second UV coordinates.
     */
    ARRAY_COMPRESS_TEX_UV2(16384),
    /**
     * Flag used to mark a compressed bone array.
     */
    ARRAY_COMPRESS_BONES(32768),
    /**
     * Flag used to mark a compressed (half float) weight array.
     */
    ARRAY_COMPRESS_WEIGHTS(65536),
    /**
     * Used to set flags [ARRAY_COMPRESS_VERTEX], [ARRAY_COMPRESS_NORMAL], [ARRAY_COMPRESS_TANGENT], [ARRAY_COMPRESS_COLOR], [ARRAY_COMPRESS_TEX_UV], [godot.ARRAY_COMPRESS_TEX_UV2] and [ARRAY_COMPRESS_WEIGHTS] quickly.
     */
    ARRAY_COMPRESS_DEFAULT(97280),
    /**
     * Flag used to mark a compressed index array.
     */
    ARRAY_COMPRESS_INDEX(131072),
    /**
     * Flag used to mark that the array contains 2D vertices.
     */
    ARRAY_FLAG_USE_2D_VERTICES(262144),
    /**
     * Flag used to mark that the array uses 16-bit bones instead of 8-bit.
     */
    ARRAY_FLAG_USE_16_BIT_BONES(524288),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ArrayType(
    id: Long
  ) {
    /**
     * Array of vertices.
     */
    ARRAY_VERTEX(0),
    /**
     * Array of normals.
     */
    ARRAY_NORMAL(1),
    /**
     * Array of tangents as an array of floats, 4 floats per tangent.
     */
    ARRAY_TANGENT(2),
    /**
     * Array of colors.
     */
    ARRAY_COLOR(3),
    /**
     * Array of UV coordinates.
     */
    ARRAY_TEX_UV(4),
    /**
     * Array of second set of UV coordinates.
     */
    ARRAY_TEX_UV2(5),
    /**
     * Array of bone data.
     */
    ARRAY_BONES(6),
    /**
     * Array of weights.
     */
    ARRAY_WEIGHTS(7),
    /**
     * Array of indices.
     */
    ARRAY_INDEX(8),
    /**
     * Represents the size of the [enum ArrayType] enum.
     */
    ARRAY_MAX(9),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * Array of bone data.
     */
    public final const val ARRAY_BONES: Long = 6

    /**
     * Array of colors.
     */
    public final const val ARRAY_COLOR: Long = 3

    /**
     * Used internally to calculate other `ARRAY_COMPRESS_*` enum values. Do not use.
     */
    public final const val ARRAY_COMPRESS_BASE: Long = 9

    /**
     * Flag used to mark a compressed bone array.
     */
    public final const val ARRAY_COMPRESS_BONES: Long = 32768

    /**
     * Flag used to mark a compressed (half float) color array.
     */
    public final const val ARRAY_COMPRESS_COLOR: Long = 4096

    /**
     * Used to set flags [ARRAY_COMPRESS_VERTEX], [ARRAY_COMPRESS_NORMAL], [ARRAY_COMPRESS_TANGENT], [ARRAY_COMPRESS_COLOR], [ARRAY_COMPRESS_TEX_UV], [godot.ARRAY_COMPRESS_TEX_UV2] and [ARRAY_COMPRESS_WEIGHTS] quickly.
     */
    public final const val ARRAY_COMPRESS_DEFAULT: Long = 97280

    /**
     * Flag used to mark a compressed index array.
     */
    public final const val ARRAY_COMPRESS_INDEX: Long = 131072

    /**
     * Flag used to mark a compressed (half float) normal array.
     */
    public final const val ARRAY_COMPRESS_NORMAL: Long = 1024

    /**
     * Flag used to mark a compressed (half float) tangent array.
     */
    public final const val ARRAY_COMPRESS_TANGENT: Long = 2048

    /**
     * Flag used to mark a compressed (half float) UV coordinates array.
     */
    public final const val ARRAY_COMPRESS_TEX_UV: Long = 8192

    /**
     * Flag used to mark a compressed (half float) UV coordinates array for the second UV coordinates.
     */
    public final const val ARRAY_COMPRESS_TEX_UV2: Long = 16384

    /**
     * Flag used to mark a compressed (half float) vertex array.
     */
    public final const val ARRAY_COMPRESS_VERTEX: Long = 512

    /**
     * Flag used to mark a compressed (half float) weight array.
     */
    public final const val ARRAY_COMPRESS_WEIGHTS: Long = 65536

    /**
     * Flag used to mark that the array uses 16-bit bones instead of 8-bit.
     */
    public final const val ARRAY_FLAG_USE_16_BIT_BONES: Long = 524288

    /**
     * Flag used to mark that the array contains 2D vertices.
     */
    public final const val ARRAY_FLAG_USE_2D_VERTICES: Long = 262144

    /**
     * Mesh array contains bones.
     */
    public final const val ARRAY_FORMAT_BONES: Long = 64

    /**
     * Mesh array contains colors.
     */
    public final const val ARRAY_FORMAT_COLOR: Long = 8

    /**
     * Mesh array uses indices.
     */
    public final const val ARRAY_FORMAT_INDEX: Long = 256

    /**
     * Mesh array contains normals.
     */
    public final const val ARRAY_FORMAT_NORMAL: Long = 2

    /**
     * Mesh array contains tangents.
     */
    public final const val ARRAY_FORMAT_TANGENT: Long = 4

    /**
     * Mesh array contains UVs.
     */
    public final const val ARRAY_FORMAT_TEX_UV: Long = 16

    /**
     * Mesh array contains second UV.
     */
    public final const val ARRAY_FORMAT_TEX_UV2: Long = 32

    /**
     * Mesh array contains vertices. All meshes require a vertex array so this should always be present.
     */
    public final const val ARRAY_FORMAT_VERTEX: Long = 1

    /**
     * Mesh array contains bone weights.
     */
    public final const val ARRAY_FORMAT_WEIGHTS: Long = 128

    /**
     * Array of indices.
     */
    public final const val ARRAY_INDEX: Long = 8

    /**
     * Represents the size of the [enum ArrayType] enum.
     */
    public final const val ARRAY_MAX: Long = 9

    /**
     * Array of normals.
     */
    public final const val ARRAY_NORMAL: Long = 1

    /**
     * Array of tangents as an array of floats, 4 floats per tangent.
     */
    public final const val ARRAY_TANGENT: Long = 2

    /**
     * Array of UV coordinates.
     */
    public final const val ARRAY_TEX_UV: Long = 4

    /**
     * Array of second set of UV coordinates.
     */
    public final const val ARRAY_TEX_UV2: Long = 5

    /**
     * Array of vertices.
     */
    public final const val ARRAY_VERTEX: Long = 0

    /**
     * Array of weights.
     */
    public final const val ARRAY_WEIGHTS: Long = 7

    /**
     * Blend shapes are normalized.
     */
    public final const val BLEND_SHAPE_MODE_NORMALIZED: Long = 0

    /**
     * Blend shapes are relative to base weight.
     */
    public final const val BLEND_SHAPE_MODE_RELATIVE: Long = 1

    /**
     * Render array as lines (every two vertices a line is created).
     */
    public final const val PRIMITIVE_LINES: Long = 1

    /**
     * Render array as line loop (like line strip, but closed).
     */
    public final const val PRIMITIVE_LINE_LOOP: Long = 3

    /**
     * Render array as line strip.
     */
    public final const val PRIMITIVE_LINE_STRIP: Long = 2

    /**
     * Render array as points (one vertex equals one point).
     */
    public final const val PRIMITIVE_POINTS: Long = 0

    /**
     * Render array as triangles (every three vertices a triangle is created).
     */
    public final const val PRIMITIVE_TRIANGLES: Long = 4

    /**
     * Render array as triangle fans.
     */
    public final const val PRIMITIVE_TRIANGLE_FAN: Long = 6

    /**
     * Render array as triangle strips.
     */
    public final const val PRIMITIVE_TRIANGLE_STRIP: Long = 5
  }
}
