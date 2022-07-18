// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.AABB
import godot.core.Color
import godot.core.PackedFloat32Array
import godot.core.TransferContext
import godot.core.Transform2D
import godot.core.Transform3D
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_FLOAT_32_ARRAY
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.TRANSFORM3D
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Provides high-performance mesh instancing.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/performance/using_multimesh.html]($DOCS_URL/tutorials/performance/using_multimesh.html)
 *
 * MultiMesh provides low-level mesh instancing. Drawing thousands of [godot.MeshInstance3D] nodes can be slow, since each object is submitted to the GPU then drawn individually.
 *
 * MultiMesh is much faster as it can draw thousands of instances with a single draw call, resulting in less API overhead.
 *
 * As a drawback, if the instances are too far away from each other, performance may be reduced as every single instance will always render (they are spatially indexed as one, for the whole object).
 *
 * Since instances may have any behavior, the AABB used for visibility must be provided by the user.
 */
@GodotBaseType
public open class MultiMesh : Resource() {
  /**
   * Format of transform used to transform mesh, either 2D or 3D.
   */
  public var transformFormat: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_GET_TRANSFORM_FORMAT,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_SET_TRANSFORM_FORMAT,
          NIL.ordinal)
    }

  /**
   * If `true`, the [godot.MultiMesh] will use color data (see [colorArray]).
   */
  public var useColors: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_IS_USING_COLORS,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_SET_USE_COLORS, NIL.ordinal)
    }

  /**
   * If `true`, the [godot.MultiMesh] will use custom data (see [customDataArray]).
   */
  public var useCustomData: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_IS_USING_CUSTOM_DATA,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_SET_USE_CUSTOM_DATA,
          NIL.ordinal)
    }

  /**
   * Number of instances that will get drawn. This clears and (re)sizes the buffers. By default, all instances are drawn but you can limit this with [visibleInstanceCount].
   */
  public var instanceCount: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_GET_INSTANCE_COUNT,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_SET_INSTANCE_COUNT,
          NIL.ordinal)
    }

  /**
   * Limits the number of instances drawn, -1 draws all instances. Changing this does not change the sizes of the buffers.
   */
  public var visibleInstanceCount: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_GET_VISIBLE_INSTANCE_COUNT,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_SET_VISIBLE_INSTANCE_COUNT,
          NIL.ordinal)
    }

  /**
   * Mesh to be drawn.
   */
  public var mesh: Mesh?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_GET_MESH, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as Mesh?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_SET_MESH, NIL.ordinal)
    }

  /**
   *
   */
  public var buffer: PackedFloat32Array
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_GET_BUFFER,
          PACKED_FLOAT_32_ARRAY.ordinal)
      return TransferContext.readReturnValue(PACKED_FLOAT_32_ARRAY, false) as PackedFloat32Array
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_FLOAT_32_ARRAY to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_SET_BUFFER, NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_MULTIMESH)
  }

  /**
   * Sets the [godot.Transform3D] for a specific instance.
   */
  public fun setInstanceTransform(instance: Long, transform: Transform3D): Unit {
    TransferContext.writeArguments(LONG to instance, TRANSFORM3D to transform)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_SET_INSTANCE_TRANSFORM,
        NIL.ordinal)
  }

  /**
   * Sets the [godot.core.Transform2D] for a specific instance.
   */
  public fun setInstanceTransform2d(instance: Long, transform: Transform2D): Unit {
    TransferContext.writeArguments(LONG to instance, TRANSFORM2D to transform)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_SET_INSTANCE_TRANSFORM_2D,
        NIL.ordinal)
  }

  /**
   * Returns the [godot.Transform3D] of a specific instance.
   */
  public fun getInstanceTransform(instance: Long): Transform3D {
    TransferContext.writeArguments(LONG to instance)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_GET_INSTANCE_TRANSFORM,
        TRANSFORM3D.ordinal)
    return TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D
  }

  /**
   * Returns the [godot.core.Transform2D] of a specific instance.
   */
  public fun getInstanceTransform2d(instance: Long): Transform2D {
    TransferContext.writeArguments(LONG to instance)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_GET_INSTANCE_TRANSFORM_2D,
        TRANSFORM2D.ordinal)
    return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
  }

  /**
   * Sets the color of a specific instance by *multiplying* the mesh's existing vertex colors.
   *
   * For the color to take effect, ensure that [useColors] is `true` on the [godot.MultiMesh] and [godot.BaseMaterial3D.vertexColorUseAsAlbedo] is `true` on the material.
   */
  public fun setInstanceColor(instance: Long, color: Color): Unit {
    TransferContext.writeArguments(LONG to instance, COLOR to color)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_SET_INSTANCE_COLOR,
        NIL.ordinal)
  }

  /**
   * Gets a specific instance's color.
   */
  public fun getInstanceColor(instance: Long): Color {
    TransferContext.writeArguments(LONG to instance)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_GET_INSTANCE_COLOR,
        COLOR.ordinal)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Sets custom data for a specific instance. Although [godot.core.Color] is used, it is just a container for 4 floating point numbers.
   *
   * For the custom data to be used, ensure that [useCustomData] is `true`.
   */
  public fun setInstanceCustomData(instance: Long, customData: Color): Unit {
    TransferContext.writeArguments(LONG to instance, COLOR to customData)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_SET_INSTANCE_CUSTOM_DATA,
        NIL.ordinal)
  }

  /**
   * Returns the custom data that has been set for a specific instance.
   */
  public fun getInstanceCustomData(instance: Long): Color {
    TransferContext.writeArguments(LONG to instance)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_GET_INSTANCE_CUSTOM_DATA,
        COLOR.ordinal)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Returns the visibility axis-aligned bounding box in local space. See also [godot.VisualInstance3D.getTransformedAabb].
   */
  public fun getAabb(): AABB {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_GET_AABB,
        godot.core.VariantType.AABB.ordinal)
    return TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB
  }

  public enum class TransformFormat(
    id: Long
  ) {
    /**
     * Use this when using 2D transforms.
     */
    TRANSFORM_2D(0),
    /**
     * Use this when using 3D transforms.
     */
    TRANSFORM_3D(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
