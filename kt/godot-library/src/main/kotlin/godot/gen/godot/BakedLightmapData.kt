// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.CoreTypeHelper
import godot.annotation.GodotBaseType
import godot.core.AABB
import godot.core.NodePath
import godot.core.PoolByteArray
import godot.core.TransferContext
import godot.core.Transform
import godot.core.VariantArray
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_BYTE_ARRAY
import godot.core.VariantType.TRANSFORM
import kotlin.Any
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
open class BakedLightmapData : Resource() {
  /**
   *
   */
  open var bounds: AABB
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAPDATA_GET_BOUNDS,
          godot.core.VariantType.AABB)
      return TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB
    }
    set(value) {
      TransferContext.writeArguments(godot.core.VariantType.AABB to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAPDATA_SET_BOUNDS, NIL)
    }

  /**
   *
   */
  open var cellSpaceTransform: Transform
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAPDATA_GET_CELL_SPACE_TRANSFORM, TRANSFORM)
      return TransferContext.readReturnValue(TRANSFORM, false) as Transform
    }
    set(value) {
      TransferContext.writeArguments(TRANSFORM to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAPDATA_SET_CELL_SPACE_TRANSFORM, NIL)
    }

  /**
   *
   */
  open var cellSubdiv: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAPDATA_GET_CELL_SUBDIV,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAPDATA_SET_CELL_SUBDIV,
          NIL)
    }

  /**
   * Global energy multiplier for baked and dynamic capture objects.
   */
  open var energy: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAPDATA_GET_ENERGY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAPDATA_SET_ENERGY, NIL)
    }

  /**
   *
   */
  open var octree: PoolByteArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAPDATA_GET_OCTREE,
          POOL_BYTE_ARRAY)
      return TransferContext.readReturnValue(POOL_BYTE_ARRAY, false) as PoolByteArray
    }
    set(value) {
      TransferContext.writeArguments(POOL_BYTE_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAPDATA_SET_OCTREE, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_BAKEDLIGHTMAPDATA)
  }

  @CoreTypeHelper
  open fun bounds(schedule: AABB.() -> Unit): AABB = bounds.apply{
      schedule(this)
      bounds = this
  }


  @CoreTypeHelper
  open fun cellSpaceTransform(schedule: Transform.() -> Unit): Transform = cellSpaceTransform.apply{
      schedule(this)
      cellSpaceTransform = this
  }


  open fun _getUserData(): VariantArray<Any?> {
    throw NotImplementedError("_get_user_data is not implemented for BakedLightmapData")
  }

  open fun _setUserData(data: VariantArray<Any?>) {
  }

  /**
   *
   */
  open fun addUser(
    path: NodePath,
    lightmap: Texture,
    instance: Long
  ) {
    TransferContext.writeArguments(NODE_PATH to path, OBJECT to lightmap, LONG to instance)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAPDATA_ADD_USER, NIL)
  }

  /**
   *
   */
  open fun clearUsers() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAPDATA_CLEAR_USERS, NIL)
  }

  /**
   *
   */
  open fun getUserCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAPDATA_GET_USER_COUNT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  open fun getUserLightmap(userIdx: Long): Texture? {
    TransferContext.writeArguments(LONG to userIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAPDATA_GET_USER_LIGHTMAP,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture?
  }

  /**
   *
   */
  open fun getUserPath(userIdx: Long): NodePath {
    TransferContext.writeArguments(LONG to userIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BAKEDLIGHTMAPDATA_GET_USER_PATH,
        NODE_PATH)
    return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
  }
}
