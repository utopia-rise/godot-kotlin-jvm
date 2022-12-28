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
import godot.core.Transform2D
import godot.core.Transform3D
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_FLOAT_32_ARRAY
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.TRANSFORM3D
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Provides high-performance drawing of a mesh multiple times using GPU instancing.
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
 *
 * **Note:** A MultiMesh is a single object, therefore the same maximum lights per object restriction applies. This means, that once the maximum lights are consumed by one or more instances, the rest of the MultiMesh instances will **not** receive any lighting.
 *
 * **Note:** Blend Shapes will be ignored if used in a MultiMesh.
 */
@GodotBaseType
public open class MultiMesh : Resource() {
  /**
   * Format of transform used to transform mesh, either 2D or 3D.
   */
  public var transformFormat: MultiMesh.TransformFormat
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_GET_TRANSFORM_FORMAT,
          LONG)
      return MultiMesh.TransformFormat.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_SET_TRANSFORM_FORMAT,
          NIL)
    }

  /**
   * If `true`, the [godot.MultiMesh] will use color data (see [setInstanceColor]). Can only be set when [instanceCount] is `0` or less. This means that you need to call this method before setting the instance count, or temporarily reset it to `0`.
   */
  public var useColors: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_IS_USING_COLORS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_SET_USE_COLORS, NIL)
    }

  /**
   * If `true`, the [godot.MultiMesh] will use custom data (see [setInstanceCustomData]). Can only be set when [instanceCount] is `0` or less. This means that you need to call this method before setting the instance count, or temporarily reset it to `0`.
   */
  public var useCustomData: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_IS_USING_CUSTOM_DATA,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_SET_USE_CUSTOM_DATA,
          NIL)
    }

  /**
   * Number of instances that will get drawn. This clears and (re)sizes the buffers. Setting data format or flags afterwards will have no effect.
   *
   * By default, all instances are drawn but you can limit this with [visibleInstanceCount].
   */
  public var instanceCount: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_GET_INSTANCE_COUNT,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_SET_INSTANCE_COUNT, NIL)
    }

  /**
   * Limits the number of instances drawn, -1 draws all instances. Changing this does not change the sizes of the buffers.
   */
  public var visibleInstanceCount: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIMESH_GET_VISIBLE_INSTANCE_COUNT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIMESH_SET_VISIBLE_INSTANCE_COUNT, NIL)
    }

  /**
   * [godot.Mesh] resource to be instanced.
   *
   * The looks of the individual instances can be modified using [setInstanceColor] and [setInstanceCustomData].
   */
  public var mesh: Mesh?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_GET_MESH, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Mesh?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_SET_MESH, NIL)
    }

  /**
   *
   */
  public var buffer: PackedFloat32Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_GET_BUFFER,
          PACKED_FLOAT_32_ARRAY)
      return TransferContext.readReturnValue(PACKED_FLOAT_32_ARRAY, false) as PackedFloat32Array
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_FLOAT_32_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_SET_BUFFER, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_MULTIMESH, scriptIndex)
    return true
  }

  /**
   * Sets the [godot.Transform3D] for a specific instance.
   */
  public fun setInstanceTransform(instance: Long, transform: Transform3D): Unit {
    TransferContext.writeArguments(LONG to instance, TRANSFORM3D to transform)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_SET_INSTANCE_TRANSFORM,
        NIL)
  }

  /**
   * Sets the [godot.core.Transform2D] for a specific instance.
   */
  public fun setInstanceTransform2d(instance: Long, transform: Transform2D): Unit {
    TransferContext.writeArguments(LONG to instance, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_SET_INSTANCE_TRANSFORM_2D,
        NIL)
  }

  /**
   * Returns the [godot.Transform3D] of a specific instance.
   */
  public fun getInstanceTransform(instance: Long): Transform3D {
    TransferContext.writeArguments(LONG to instance)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_GET_INSTANCE_TRANSFORM,
        TRANSFORM3D)
    return TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D
  }

  /**
   * Returns the [godot.core.Transform2D] of a specific instance.
   */
  public fun getInstanceTransform2d(instance: Long): Transform2D {
    TransferContext.writeArguments(LONG to instance)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_GET_INSTANCE_TRANSFORM_2D,
        TRANSFORM2D)
    return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
  }

  /**
   * Sets the color of a specific instance by *multiplying* the mesh's existing vertex colors. This allows for different color tinting per instance.
   *
   * For the color to take effect, ensure that [useColors] is `true` on the [godot.MultiMesh] and [godot.BaseMaterial3D.vertexColorUseAsAlbedo] is `true` on the material. If you intend to set an absolute color instead of tinting, make sure the material's albedo color is set to pure white (`Color(1, 1, 1)`).
   */
  public fun setInstanceColor(instance: Long, color: Color): Unit {
    TransferContext.writeArguments(LONG to instance, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_SET_INSTANCE_COLOR, NIL)
  }

  /**
   * Gets a specific instance's color multiplier.
   */
  public fun getInstanceColor(instance: Long): Color {
    TransferContext.writeArguments(LONG to instance)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_GET_INSTANCE_COLOR, COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Sets custom data for a specific instance. Although [godot.core.Color] is used, it is just a container for 4 floating point numbers.
   *
   * For the custom data to be used, ensure that [useCustomData] is `true`.
   *
   * This custom instance data has to be manually accessed in your custom shader using `INSTANCE_CUSTOM`.
   */
  public fun setInstanceCustomData(instance: Long, customData: Color): Unit {
    TransferContext.writeArguments(LONG to instance, COLOR to customData)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_SET_INSTANCE_CUSTOM_DATA,
        NIL)
  }

  /**
   * Returns the custom data that has been set for a specific instance.
   */
  public fun getInstanceCustomData(instance: Long): Color {
    TransferContext.writeArguments(LONG to instance)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_GET_INSTANCE_CUSTOM_DATA,
        COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Returns the visibility axis-aligned bounding box in local space.
   */
  public fun getAabb(): AABB {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_GET_AABB,
        godot.core.VariantType.AABB)
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
