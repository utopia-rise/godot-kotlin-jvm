// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.PoolIntArray
import godot.core.PoolVector3Array
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_INT_ARRAY
import godot.core.VariantType.POOL_VECTOR3_ARRAY
import godot.core.VariantType.STRING
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

/**
 *
 */
@GodotBaseType
open class NavigationMesh : Resource() {
  open var agent_height: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_AGENT_HEIGHT,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_AGENT_HEIGHT,
          NIL)
    }

  open var agent_maxClimb: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_AGENT_MAX_CLIMB, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_AGENT_MAX_CLIMB, NIL)
    }

  open var agent_maxSlope: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_AGENT_MAX_SLOPE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_AGENT_MAX_SLOPE, NIL)
    }

  open var agent_radius: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_AGENT_RADIUS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_AGENT_RADIUS,
          NIL)
    }

  open var cell_height: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_CELL_HEIGHT,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_CELL_HEIGHT,
          NIL)
    }

  open var cell_size: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_CELL_SIZE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_CELL_SIZE, NIL)
    }

  open var detail_sampleDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_DETAIL_SAMPLE_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_DETAIL_SAMPLE_DISTANCE, NIL)
    }

  open var detail_sampleMaxError: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_DETAIL_SAMPLE_MAX_ERROR, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_DETAIL_SAMPLE_MAX_ERROR, NIL)
    }

  open var edge_maxError: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_EDGE_MAX_ERROR,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_EDGE_MAX_ERROR,
          NIL)
    }

  open var edge_maxLength: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_EDGE_MAX_LENGTH, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_EDGE_MAX_LENGTH, NIL)
    }

  open var filter_filterWalkableLowHeightSpans: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_FILTER_FILTER_WALKABLE_LOW_HEIGHT_SPANS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_FILTER_FILTER_WALKABLE_LOW_HEIGHT_SPANS, NIL)
    }

  open var filter_ledgeSpans: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_FILTER_LEDGE_SPANS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_FILTER_LEDGE_SPANS, NIL)
    }

  open var filter_lowHangingObstacles: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_FILTER_LOW_HANGING_OBSTACLES, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_FILTER_LOW_HANGING_OBSTACLES, NIL)
    }

  open var geometry_collisionMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_GEOMETRY_COLLISION_MASK, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_GEOMETRY_COLLISION_MASK, NIL)
    }

  open var geometry_parsedGeometryType: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_GEOMETRY_PARSED_GEOMETRY_TYPE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_GEOMETRY_PARSED_GEOMETRY_TYPE, NIL)
    }

  open var geometry_sourceGeometryMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_GEOMETRY_SOURCE_GEOMETRY_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_GEOMETRY_SOURCE_GEOMETRY_MODE, NIL)
    }

  open var geometry_sourceGroupName: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_GEOMETRY_SOURCE_GROUP_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_GEOMETRY_SOURCE_GROUP_NAME, NIL)
    }

  open var polygon_vertsPerPoly: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_POLYGON_VERTS_PER_POLY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_POLYGON_VERTS_PER_POLY, NIL)
    }

  open var region_mergeSize: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_REGION_MERGE_SIZE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_REGION_MERGE_SIZE, NIL)
    }

  open var region_minSize: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_REGION_MIN_SIZE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_REGION_MIN_SIZE, NIL)
    }

  open var samplePartitionType_samplePartitionType: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_SAMPLE_PARTITION_TYPE_SAMPLE_PARTITION_TYPE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_SAMPLE_PARTITION_TYPE_SAMPLE_PARTITION_TYPE,
          NIL)
    }

  open var vertices: PoolVector3Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_VERTICES,
          POOL_VECTOR3_ARRAY)
      return TransferContext.readReturnValue(POOL_VECTOR3_ARRAY, false) as PoolVector3Array
    }
    set(value) {
      TransferContext.writeArguments(POOL_VECTOR3_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_VERTICES, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_NAVIGATIONMESH)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }

  open fun _getPolygons(): VariantArray<Any?> {
    throw NotImplementedError("_get_polygons is not implemented for NavigationMesh")
  }

  open fun _setPolygons(polygons: VariantArray<Any?>) {
  }

  /**
   *
   */
  open fun addPolygon(polygon: PoolIntArray) {
    TransferContext.writeArguments(POOL_INT_ARRAY to polygon)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_ADD_POLYGON, NIL)
  }

  /**
   *
   */
  open fun clearPolygons() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_CLEAR_POLYGONS, NIL)
  }

  /**
   *
   */
  open fun createFromMesh(mesh: Mesh) {
    TransferContext.writeArguments(OBJECT to mesh)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_CREATE_FROM_MESH,
        NIL)
  }

  /**
   *
   */
  open fun getCollisionMaskBit(bit: Long): Boolean {
    TransferContext.writeArguments(LONG to bit)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_COLLISION_MASK_BIT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  open fun getPolygon(idx: Long): PoolIntArray {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_POLYGON,
        POOL_INT_ARRAY)
    return TransferContext.readReturnValue(POOL_INT_ARRAY, false) as PoolIntArray
  }

  /**
   *
   */
  open fun getPolygonCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_POLYGON_COUNT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  open fun setCollisionMaskBit(bit: Long, value: Boolean) {
    TransferContext.writeArguments(LONG to bit, BOOL to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_COLLISION_MASK_BIT, NIL)
  }

  companion object {
    /**
     *
     */
    final const val PARSED_GEOMETRY_BOTH: Long = 2

    /**
     *
     */
    final const val PARSED_GEOMETRY_MESH_INSTANCES: Long = 0

    /**
     *
     */
    final const val PARSED_GEOMETRY_STATIC_COLLIDERS: Long = 1

    /**
     *
     */
    final const val SAMPLE_PARTITION_LAYERS: Long = 2

    /**
     *
     */
    final const val SAMPLE_PARTITION_MONOTONE: Long = 1

    /**
     *
     */
    final const val SAMPLE_PARTITION_WATERSHED: Long = 0
  }
}
