// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
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
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
open class Mesh : Resource() {
  open var lightmapSizeHint: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_GET_LIGHTMAP_SIZE_HINT,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_SET_LIGHTMAP_SIZE_HINT, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_MESH)

  open fun lightmapSizeHint(schedule: Vector2.() -> Unit): Vector2 = lightmapSizeHint.apply{
      schedule(this)
      lightmapSizeHint = this
  }


  open fun createConvexShape(): Shape? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_CREATE_CONVEX_SHAPE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Shape?
  }

  open fun createOutline(margin: Double): Mesh? {
    TransferContext.writeArguments(DOUBLE to margin)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_CREATE_OUTLINE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Mesh?
  }

  open fun createTrimeshShape(): Shape? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_CREATE_TRIMESH_SHAPE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Shape?
  }

  open fun generateTriangleMesh(): TriangleMesh? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_GENERATE_TRIANGLE_MESH, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as TriangleMesh?
  }

  open fun getAabb(): AABB {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_GET_AABB,
        godot.core.VariantType.AABB)
    return TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB
  }

  open fun getFaces(): PoolVector3Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_GET_FACES, POOL_VECTOR3_ARRAY)
    return TransferContext.readReturnValue(POOL_VECTOR3_ARRAY, false) as PoolVector3Array
  }

  open fun getSurfaceCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_GET_SURFACE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun surfaceGetArrays(surfIdx: Long): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to surfIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_SURFACE_GET_ARRAYS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  open fun surfaceGetBlendShapeArrays(surfIdx: Long): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to surfIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_SURFACE_GET_BLEND_SHAPE_ARRAYS,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  open fun surfaceGetMaterial(surfIdx: Long): Material? {
    TransferContext.writeArguments(LONG to surfIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_SURFACE_GET_MATERIAL, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Material?
  }

  open fun surfaceSetMaterial(surfIdx: Long, material: Material) {
    TransferContext.writeArguments(LONG to surfIdx, OBJECT to material)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_SURFACE_SET_MATERIAL, NIL)
  }

  enum class BlendShapeMode(
    id: Long
  ) {
    BLEND_SHAPE_MODE_NORMALIZED(0),

    BLEND_SHAPE_MODE_RELATIVE(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class PrimitiveType(
    id: Long
  ) {
    PRIMITIVE_POINTS(0),

    PRIMITIVE_LINES(1),

    PRIMITIVE_LINE_STRIP(2),

    PRIMITIVE_LINE_LOOP(3),

    PRIMITIVE_TRIANGLES(4),

    PRIMITIVE_TRIANGLE_STRIP(5),

    PRIMITIVE_TRIANGLE_FAN(6);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ArrayFormat(
    id: Long
  ) {
    ARRAY_FORMAT_VERTEX(1),

    ARRAY_FORMAT_NORMAL(2),

    ARRAY_FORMAT_TANGENT(4),

    ARRAY_FORMAT_COLOR(8),

    ARRAY_COMPRESS_BASE(9),

    ARRAY_FORMAT_TEX_UV(16),

    ARRAY_FORMAT_TEX_UV2(32),

    ARRAY_FORMAT_BONES(64),

    ARRAY_FORMAT_WEIGHTS(128),

    ARRAY_FORMAT_INDEX(256),

    ARRAY_COMPRESS_VERTEX(512),

    ARRAY_COMPRESS_NORMAL(1024),

    ARRAY_COMPRESS_TANGENT(2048),

    ARRAY_COMPRESS_COLOR(4096),

    ARRAY_COMPRESS_TEX_UV(8192),

    ARRAY_COMPRESS_TEX_UV2(16384),

    ARRAY_COMPRESS_BONES(32768),

    ARRAY_COMPRESS_WEIGHTS(65536),

    ARRAY_COMPRESS_DEFAULT(97280),

    ARRAY_COMPRESS_INDEX(131072),

    ARRAY_FLAG_USE_2D_VERTICES(262144),

    ARRAY_FLAG_USE_16_BIT_BONES(524288);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ArrayType(
    id: Long
  ) {
    ARRAY_VERTEX(0),

    ARRAY_NORMAL(1),

    ARRAY_TANGENT(2),

    ARRAY_COLOR(3),

    ARRAY_TEX_UV(4),

    ARRAY_TEX_UV2(5),

    ARRAY_BONES(6),

    ARRAY_WEIGHTS(7),

    ARRAY_INDEX(8),

    ARRAY_MAX(9);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val ARRAY_BONES: Long = 6

    final const val ARRAY_COLOR: Long = 3

    final const val ARRAY_COMPRESS_BASE: Long = 9

    final const val ARRAY_COMPRESS_BONES: Long = 32768

    final const val ARRAY_COMPRESS_COLOR: Long = 4096

    final const val ARRAY_COMPRESS_DEFAULT: Long = 97280

    final const val ARRAY_COMPRESS_INDEX: Long = 131072

    final const val ARRAY_COMPRESS_NORMAL: Long = 1024

    final const val ARRAY_COMPRESS_TANGENT: Long = 2048

    final const val ARRAY_COMPRESS_TEX_UV: Long = 8192

    final const val ARRAY_COMPRESS_TEX_UV2: Long = 16384

    final const val ARRAY_COMPRESS_VERTEX: Long = 512

    final const val ARRAY_COMPRESS_WEIGHTS: Long = 65536

    final const val ARRAY_FLAG_USE_16_BIT_BONES: Long = 524288

    final const val ARRAY_FLAG_USE_2D_VERTICES: Long = 262144

    final const val ARRAY_FORMAT_BONES: Long = 64

    final const val ARRAY_FORMAT_COLOR: Long = 8

    final const val ARRAY_FORMAT_INDEX: Long = 256

    final const val ARRAY_FORMAT_NORMAL: Long = 2

    final const val ARRAY_FORMAT_TANGENT: Long = 4

    final const val ARRAY_FORMAT_TEX_UV: Long = 16

    final const val ARRAY_FORMAT_TEX_UV2: Long = 32

    final const val ARRAY_FORMAT_VERTEX: Long = 1

    final const val ARRAY_FORMAT_WEIGHTS: Long = 128

    final const val ARRAY_INDEX: Long = 8

    final const val ARRAY_MAX: Long = 9

    final const val ARRAY_NORMAL: Long = 1

    final const val ARRAY_TANGENT: Long = 2

    final const val ARRAY_TEX_UV: Long = 4

    final const val ARRAY_TEX_UV2: Long = 5

    final const val ARRAY_VERTEX: Long = 0

    final const val ARRAY_WEIGHTS: Long = 7

    final const val BLEND_SHAPE_MODE_NORMALIZED: Long = 0

    final const val BLEND_SHAPE_MODE_RELATIVE: Long = 1

    final const val PRIMITIVE_LINES: Long = 1

    final const val PRIMITIVE_LINE_LOOP: Long = 3

    final const val PRIMITIVE_LINE_STRIP: Long = 2

    final const val PRIMITIVE_POINTS: Long = 0

    final const val PRIMITIVE_TRIANGLES: Long = 4

    final const val PRIMITIVE_TRIANGLE_FAN: Long = 6

    final const val PRIMITIVE_TRIANGLE_STRIP: Long = 5
  }
}
