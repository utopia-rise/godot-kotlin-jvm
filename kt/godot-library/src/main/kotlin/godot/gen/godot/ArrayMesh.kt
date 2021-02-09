// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.Mesh
import godot.annotation.GodotBaseType
import godot.core.AABB
import godot.core.GodotError
import godot.core.PoolByteArray
import godot.core.TransferContext
import godot.core.Transform
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.POOL_BYTE_ARRAY
import godot.core.VariantType.STRING
import godot.core.VariantType.TRANSFORM
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
open class ArrayMesh : Mesh() {
  open var blendShapeMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_GET_BLEND_SHAPE_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_SET_BLEND_SHAPE_MODE,
          NIL)
    }

  open var customAabb: AABB
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_GET_CUSTOM_AABB,
          godot.core.VariantType.AABB)
      return TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB
    }
    set(value) {
      TransferContext.writeArguments(godot.core.VariantType.AABB to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_SET_CUSTOM_AABB, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_ARRAYMESH)

  open fun customAabb(schedule: AABB.() -> Unit): AABB = customAabb.apply{
      schedule(this)
      customAabb = this
  }


  open fun addBlendShape(name: String) {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_ADD_BLEND_SHAPE, NIL)
  }

  open fun addSurfaceFromArrays(
    primitive: Long,
    arrays: VariantArray<Any?>,
    blendShapes: VariantArray<Any?> = VariantArray(),
    compressFlags: Long = 97280
  ) {
    TransferContext.writeArguments(LONG to primitive, ARRAY to arrays, ARRAY to blendShapes, LONG to
        compressFlags)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_ADD_SURFACE_FROM_ARRAYS,
        NIL)
  }

  open fun clearBlendShapes() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_CLEAR_BLEND_SHAPES, NIL)
  }

  open fun getBlendShapeCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_GET_BLEND_SHAPE_COUNT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getBlendShapeName(index: Long): String {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_GET_BLEND_SHAPE_NAME,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun lightmapUnwrap(transform: Transform, texelSize: Double): GodotError {
    TransferContext.writeArguments(TRANSFORM to transform, DOUBLE to texelSize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_LIGHTMAP_UNWRAP, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun regenNormalmaps() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_REGEN_NORMALMAPS, NIL)
  }

  open fun surfaceFindByName(name: String): Long {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_SURFACE_FIND_BY_NAME,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun surfaceGetArrayIndexLen(surfIdx: Long): Long {
    TransferContext.writeArguments(LONG to surfIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ARRAYMESH_SURFACE_GET_ARRAY_INDEX_LEN, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun surfaceGetArrayLen(surfIdx: Long): Long {
    TransferContext.writeArguments(LONG to surfIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_SURFACE_GET_ARRAY_LEN,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun surfaceGetFormat(surfIdx: Long): Long {
    TransferContext.writeArguments(LONG to surfIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_SURFACE_GET_FORMAT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun surfaceGetName(surfIdx: Long): String {
    TransferContext.writeArguments(LONG to surfIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_SURFACE_GET_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun surfaceGetPrimitiveType(surfIdx: Long): Mesh.PrimitiveType {
    TransferContext.writeArguments(LONG to surfIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ARRAYMESH_SURFACE_GET_PRIMITIVE_TYPE, LONG)
    return Mesh.PrimitiveType.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun surfaceRemove(surfIdx: Long) {
    TransferContext.writeArguments(LONG to surfIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_SURFACE_REMOVE, NIL)
  }

  open fun surfaceSetName(surfIdx: Long, name: String) {
    TransferContext.writeArguments(LONG to surfIdx, STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_SURFACE_SET_NAME, NIL)
  }

  open fun surfaceUpdateRegion(
    surfIdx: Long,
    offset: Long,
    data: PoolByteArray
  ) {
    TransferContext.writeArguments(LONG to surfIdx, LONG to offset, POOL_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARRAYMESH_SURFACE_UPDATE_REGION,
        NIL)
  }

  enum class ArrayFormat(
    id: Long
  ) {
    ARRAY_FORMAT_VERTEX(1),

    ARRAY_FORMAT_NORMAL(2),

    ARRAY_FORMAT_TANGENT(4),

    ARRAY_FORMAT_COLOR(8),

    ARRAY_FORMAT_TEX_UV(16),

    ARRAY_FORMAT_TEX_UV2(32),

    ARRAY_FORMAT_BONES(64),

    ARRAY_FORMAT_WEIGHTS(128),

    ARRAY_FORMAT_INDEX(256);

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

    final const val ARRAY_WEIGHTS_SIZE: Long = 4

    final const val NO_INDEX_ARRAY: Long = -1
  }
}
