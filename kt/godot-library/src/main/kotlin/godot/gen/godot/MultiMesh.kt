// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.AABB
import godot.core.Color
import godot.core.PoolColorArray
import godot.core.PoolRealArray
import godot.core.PoolVector2Array
import godot.core.PoolVector3Array
import godot.core.TransferContext
import godot.core.Transform
import godot.core.Transform2D
import godot.core.VariantType.COLOR
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_REAL_ARRAY
import godot.core.VariantType.TRANSFORM
import godot.core.VariantType.TRANSFORM2D
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress

/**
 * Provides high-performance mesh instancing.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/3d/vertex_animation/animating_thousands_of_fish.html](https://docs.godotengine.org/en/latest/tutorials/3d/vertex_animation/animating_thousands_of_fish.html)
 * [https://docs.godotengine.org/en/latest/tutorials/optimization/using_multimesh.html](https://docs.godotengine.org/en/latest/tutorials/optimization/using_multimesh.html)
 *
 * MultiMesh provides low-level mesh instancing. Drawing thousands of [godot.MeshInstance] nodes can be slow, since each object is submitted to the GPU then drawn individually.
 *
 * MultiMesh is much faster as it can draw thousands of instances with a single draw call, resulting in less API overhead.
 *
 * As a drawback, if the instances are too far away of each other, performance may be reduced as every single instance will always rendered (they are spatially indexed as one, for the whole object).
 *
 * Since instances may have any behavior, the AABB used for visibility must be provided by the user.
 */
@GodotBaseType
open class MultiMesh : Resource() {
  /**
   * Format of colors in color array that gets passed to shader.
   */
  open var colorFormat: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_GET_COLOR_FORMAT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_SET_COLOR_FORMAT, NIL)
    }

  /**
   * Format of custom data in custom data array that gets passed to shader.
   */
  open var customDataFormat: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_GET_CUSTOM_DATA_FORMAT,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_SET_CUSTOM_DATA_FORMAT,
          NIL)
    }

  /**
   * Number of instances that will get drawn. This clears and (re)sizes the buffers. By default, all instances are drawn but you can limit this with [visibleInstanceCount].
   */
  open var instanceCount: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_GET_INSTANCE_COUNT,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_SET_INSTANCE_COUNT, NIL)
    }

  /**
   * Mesh to be drawn.
   */
  open var mesh: Mesh?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_GET_MESH, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Mesh?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_SET_MESH, NIL)
    }

  /**
   * Format of transform used to transform mesh, either 2D or 3D.
   */
  open var transformFormat: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_GET_TRANSFORM_FORMAT,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_SET_TRANSFORM_FORMAT,
          NIL)
    }

  /**
   * Limits the number of instances drawn, -1 draws all instances. Changing this does not change the sizes of the buffers.
   */
  open var visibleInstanceCount: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIMESH_GET_VISIBLE_INSTANCE_COUNT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIMESH_SET_VISIBLE_INSTANCE_COUNT, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_MULTIMESH)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun _getColorArray(): PoolColorArray {
    throw NotImplementedError("_get_color_array is not implemented for MultiMesh")
  }

  open fun _getCustomDataArray(): PoolColorArray {
    throw NotImplementedError("_get_custom_data_array is not implemented for MultiMesh")
  }

  open fun _getTransform2dArray(): PoolVector2Array {
    throw NotImplementedError("_get_transform_2d_array is not implemented for MultiMesh")
  }

  open fun _getTransformArray(): PoolVector3Array {
    throw NotImplementedError("_get_transform_array is not implemented for MultiMesh")
  }

  open fun _setColorArray(arg0: PoolColorArray) {
  }

  open fun _setCustomDataArray(arg0: PoolColorArray) {
  }

  open fun _setTransform2dArray(arg0: PoolVector2Array) {
  }

  open fun _setTransformArray(arg0: PoolVector3Array) {
  }

  /**
   * Returns the visibility axis-aligned bounding box in local space. See also [godot.VisualInstance.getTransformedAabb].
   */
  open fun getAabb(): AABB {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_GET_AABB,
        godot.core.VariantType.AABB)
    return TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB
  }

  /**
   * Gets a specific instance's color.
   */
  open fun getInstanceColor(instance: Long): Color {
    TransferContext.writeArguments(LONG to instance)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_GET_INSTANCE_COLOR, COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Returns the custom data that has been set for a specific instance.
   */
  open fun getInstanceCustomData(instance: Long): Color {
    TransferContext.writeArguments(LONG to instance)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_GET_INSTANCE_CUSTOM_DATA,
        COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Returns the [godot.core.Transform] of a specific instance.
   */
  open fun getInstanceTransform(instance: Long): Transform {
    TransferContext.writeArguments(LONG to instance)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_GET_INSTANCE_TRANSFORM,
        TRANSFORM)
    return TransferContext.readReturnValue(TRANSFORM, false) as Transform
  }

  /**
   * Returns the [godot.core.Transform2D] of a specific instance.
   */
  open fun getInstanceTransform2d(instance: Long): Transform2D {
    TransferContext.writeArguments(LONG to instance)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_GET_INSTANCE_TRANSFORM_2D,
        TRANSFORM2D)
    return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
  }

  /**
   * Sets all data related to the instances in one go. This is especially useful when loading the data from disk or preparing the data from GDNative.
   *
   * All data is packed in one large float array. An array may look like this: Transform for instance 1, color data for instance 1, custom data for instance 1, transform for instance 2, color data for instance 2, etc...
   *
   * [godot.core.Transform] is stored as 12 floats, [godot.core.Transform2D] is stored as 8 floats, `COLOR_8BIT` / `CUSTOM_DATA_8BIT` is stored as 1 float (4 bytes as is) and `COLOR_FLOAT` / `CUSTOM_DATA_FLOAT` is stored as 4 floats.
   */
  open fun setAsBulkArray(array: PoolRealArray) {
    TransferContext.writeArguments(POOL_REAL_ARRAY to array)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_SET_AS_BULK_ARRAY, NIL)
  }

  /**
   * Sets the color of a specific instance.
   *
   * For the color to take effect, ensure that [colorFormat] is non-`null` on the [godot.MultiMesh] and [godot.SpatialMaterial.vertexColorUseAsAlbedo] is `true` on the material.
   */
  open fun setInstanceColor(instance: Long, color: Color) {
    TransferContext.writeArguments(LONG to instance, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_SET_INSTANCE_COLOR, NIL)
  }

  /**
   * Sets custom data for a specific instance. Although [godot.core.Color] is used, it is just a container for 4 floating point numbers. The format of the number can change depending on the [enum CustomDataFormat] used.
   */
  open fun setInstanceCustomData(instance: Long, customData: Color) {
    TransferContext.writeArguments(LONG to instance, COLOR to customData)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_SET_INSTANCE_CUSTOM_DATA,
        NIL)
  }

  /**
   * Sets the [godot.core.Transform] for a specific instance.
   */
  open fun setInstanceTransform(instance: Long, transform: Transform) {
    TransferContext.writeArguments(LONG to instance, TRANSFORM to transform)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_SET_INSTANCE_TRANSFORM,
        NIL)
  }

  /**
   * Sets the [godot.core.Transform2D] for a specific instance.
   */
  open fun setInstanceTransform2d(instance: Long, transform: Transform2D) {
    TransferContext.writeArguments(LONG to instance, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_SET_INSTANCE_TRANSFORM_2D,
        NIL)
  }

  enum class TransformFormat(
    id: Long
  ) {
    /**
     * Use this when using 2D transforms.
     */
    TRANSFORM_2D(0),

    /**
     * Use this when using 3D transforms.
     */
    TRANSFORM_3D(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class CustomDataFormat(
    id: Long
  ) {
    /**
     * Use when you are not using per-instance custom data.
     */
    CUSTOM_DATA_NONE(0),

    /**
     * Compress custom_data into 8 bits when passing to shader. This uses less memory and can be faster, but loses precision and range. Floats packed into 8 bits can only represent values between 0 and 1, numbers outside that range will be clamped.
     */
    CUSTOM_DATA_8BIT(1),

    /**
     * The [godot.core.Color] passed into [setInstanceCustomData] will use 4 floats. Use this for highest precision.
     */
    CUSTOM_DATA_FLOAT(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ColorFormat(
    id: Long
  ) {
    /**
     * Use when you are not using per-instance [godot.core.Color]s.
     */
    COLOR_NONE(0),

    /**
     * Compress [godot.core.Color] data into 8 bits when passing to shader. This uses less memory and can be faster, but the [godot.core.Color] loses precision.
     */
    COLOR_8BIT(1),

    /**
     * The [godot.core.Color] passed into [setInstanceColor] will use 4 floats. Use this for highest precision [godot.core.Color].
     */
    COLOR_FLOAT(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     * Compress [godot.core.Color] data into 8 bits when passing to shader. This uses less memory and can be faster, but the [godot.core.Color] loses precision.
     */
    final const val COLOR_8BIT: Long = 1

    /**
     * The [godot.core.Color] passed into [setInstanceColor] will use 4 floats. Use this for highest precision [godot.core.Color].
     */
    final const val COLOR_FLOAT: Long = 2

    /**
     * Use when you are not using per-instance [godot.core.Color]s.
     */
    final const val COLOR_NONE: Long = 0

    /**
     * Compress custom_data into 8 bits when passing to shader. This uses less memory and can be faster, but loses precision and range. Floats packed into 8 bits can only represent values between 0 and 1, numbers outside that range will be clamped.
     */
    final const val CUSTOM_DATA_8BIT: Long = 1

    /**
     * The [godot.core.Color] passed into [setInstanceCustomData] will use 4 floats. Use this for highest precision.
     */
    final const val CUSTOM_DATA_FLOAT: Long = 2

    /**
     * Use when you are not using per-instance custom data.
     */
    final const val CUSTOM_DATA_NONE: Long = 0

    /**
     * Use this when using 2D transforms.
     */
    final const val TRANSFORM_2D: Long = 0

    /**
     * Use this when using 3D transforms.
     */
    final const val TRANSFORM_3D: Long = 1
  }
}
