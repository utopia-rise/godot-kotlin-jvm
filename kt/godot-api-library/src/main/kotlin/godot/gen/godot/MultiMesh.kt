// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.AABB
import godot.core.Color
import godot.core.PackedFloat32Array
import godot.core.Transform2D
import godot.core.Transform3D
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_FLOAT_32_ARRAY
import godot.core.VariantParser.TRANSFORM2D
import godot.core.VariantParser.TRANSFORM3D
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_MULTIMESH_INDEX: Int = 378

/**
 * MultiMesh provides low-level mesh instancing. Drawing thousands of [MeshInstance3D] nodes can be
 * slow, since each object is submitted to the GPU then drawn individually.
 * MultiMesh is much faster as it can draw thousands of instances with a single draw call, resulting
 * in less API overhead.
 * As a drawback, if the instances are too far away from each other, performance may be reduced as
 * every single instance will always render (they are spatially indexed as one, for the whole object).
 * Since instances may have any behavior, the AABB used for visibility must be provided by the user.
 * **Note:** A MultiMesh is a single object, therefore the same maximum lights per object
 * restriction applies. This means, that once the maximum lights are consumed by one or more instances,
 * the rest of the MultiMesh instances will **not** receive any lighting.
 * **Note:** Blend Shapes will be ignored if used in a MultiMesh.
 */
@GodotBaseType
public open class MultiMesh : Resource() {
  /**
   * Format of transform used to transform mesh, either 2D or 3D.
   */
  public final inline var transformFormat: TransformFormat
    @JvmName("transformFormatProperty")
    get() = getTransformFormat()
    @JvmName("transformFormatProperty")
    set(`value`) {
      setTransformFormat(value)
    }

  /**
   * If `true`, the [MultiMesh] will use color data (see [setInstanceColor]). Can only be set when
   * [instanceCount] is `0` or less. This means that you need to call this method before setting the
   * instance count, or temporarily reset it to `0`.
   */
  public final inline var useColors: Boolean
    @JvmName("useColorsProperty")
    get() = isUsingColors()
    @JvmName("useColorsProperty")
    set(`value`) {
      setUseColors(value)
    }

  /**
   * If `true`, the [MultiMesh] will use custom data (see [setInstanceCustomData]). Can only be set
   * when [instanceCount] is `0` or less. This means that you need to call this method before setting
   * the instance count, or temporarily reset it to `0`.
   */
  public final inline var useCustomData: Boolean
    @JvmName("useCustomDataProperty")
    get() = isUsingCustomData()
    @JvmName("useCustomDataProperty")
    set(`value`) {
      setUseCustomData(value)
    }

  /**
   * Custom AABB for this MultiMesh resource. Setting this manually prevents costly runtime AABB
   * recalculations.
   */
  @CoreTypeLocalCopy
  public final inline var customAabb: AABB
    @JvmName("customAabbProperty")
    get() = getCustomAabb()
    @JvmName("customAabbProperty")
    set(`value`) {
      setCustomAabb(value)
    }

  /**
   * Number of instances that will get drawn. This clears and (re)sizes the buffers. Setting data
   * format or flags afterwards will have no effect.
   * By default, all instances are drawn but you can limit this with [visibleInstanceCount].
   */
  public final inline var instanceCount: Int
    @JvmName("instanceCountProperty")
    get() = getInstanceCount()
    @JvmName("instanceCountProperty")
    set(`value`) {
      setInstanceCount(value)
    }

  /**
   * Limits the number of instances drawn, -1 draws all instances. Changing this does not change the
   * sizes of the buffers.
   */
  public final inline var visibleInstanceCount: Int
    @JvmName("visibleInstanceCountProperty")
    get() = getVisibleInstanceCount()
    @JvmName("visibleInstanceCountProperty")
    set(`value`) {
      setVisibleInstanceCount(value)
    }

  /**
   * [Mesh] resource to be instanced.
   * The looks of the individual instances can be modified using [setInstanceColor] and
   * [setInstanceCustomData].
   */
  public final inline var mesh: Mesh?
    @JvmName("meshProperty")
    get() = getMesh()
    @JvmName("meshProperty")
    set(`value`) {
      setMesh(value)
    }

  public final inline var buffer: PackedFloat32Array
    @JvmName("bufferProperty")
    get() = getBuffer()
    @JvmName("bufferProperty")
    set(`value`) {
      setBuffer(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_MULTIMESH_INDEX, scriptIndex)
  }

  /**
   * Custom AABB for this MultiMesh resource. Setting this manually prevents costly runtime AABB
   * recalculations.
   *
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = multimesh.customAabb
   * //Your changes
   * multimesh.customAabb = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun customAabbMutate(block: AABB.() -> Unit): AABB = customAabb.apply{
      block(this)
      customAabb = this
  }


  public final fun setMesh(mesh: Mesh?): Unit {
    Internals.writeArguments(OBJECT to mesh)
    Internals.callMethod(rawPtr, MethodBindings.setMeshPtr, NIL)
  }

  public final fun getMesh(): Mesh? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMeshPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Mesh?)
  }

  public final fun setUseColors(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setUseColorsPtr, NIL)
  }

  public final fun isUsingColors(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isUsingColorsPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setUseCustomData(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setUseCustomDataPtr, NIL)
  }

  public final fun isUsingCustomData(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isUsingCustomDataPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setTransformFormat(format: TransformFormat): Unit {
    Internals.writeArguments(LONG to format.id)
    Internals.callMethod(rawPtr, MethodBindings.setTransformFormatPtr, NIL)
  }

  public final fun getTransformFormat(): TransformFormat {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTransformFormatPtr, LONG)
    return MultiMesh.TransformFormat.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setInstanceCount(count: Int): Unit {
    Internals.writeArguments(LONG to count.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setInstanceCountPtr, NIL)
  }

  public final fun getInstanceCount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getInstanceCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setVisibleInstanceCount(count: Int): Unit {
    Internals.writeArguments(LONG to count.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setVisibleInstanceCountPtr, NIL)
  }

  public final fun getVisibleInstanceCount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getVisibleInstanceCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the [Transform3D] for a specific instance.
   */
  public final fun setInstanceTransform(instance: Int, transform: Transform3D): Unit {
    Internals.writeArguments(LONG to instance.toLong(), TRANSFORM3D to transform)
    Internals.callMethod(rawPtr, MethodBindings.setInstanceTransformPtr, NIL)
  }

  /**
   * Sets the [Transform2D] for a specific instance.
   */
  public final fun setInstanceTransform2d(instance: Int, transform: Transform2D): Unit {
    Internals.writeArguments(LONG to instance.toLong(), TRANSFORM2D to transform)
    Internals.callMethod(rawPtr, MethodBindings.setInstanceTransform2dPtr, NIL)
  }

  /**
   * Returns the [Transform3D] of a specific instance.
   */
  public final fun getInstanceTransform(instance: Int): Transform3D {
    Internals.writeArguments(LONG to instance.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getInstanceTransformPtr, TRANSFORM3D)
    return (Internals.readReturnValue(TRANSFORM3D) as Transform3D)
  }

  /**
   * Returns the [Transform2D] of a specific instance.
   */
  public final fun getInstanceTransform2d(instance: Int): Transform2D {
    Internals.writeArguments(LONG to instance.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getInstanceTransform2dPtr, TRANSFORM2D)
    return (Internals.readReturnValue(TRANSFORM2D) as Transform2D)
  }

  /**
   * Sets the color of a specific instance by *multiplying* the mesh's existing vertex colors. This
   * allows for different color tinting per instance.
   * **Note:** Each component is stored in 32 bits in the Forward+ and Mobile rendering methods, but
   * is packed into 16 bits in the Compatibility rendering method.
   * For the color to take effect, ensure that [useColors] is `true` on the [MultiMesh] and
   * [BaseMaterial3D.vertexColorUseAsAlbedo] is `true` on the material. If you intend to set an
   * absolute color instead of tinting, make sure the material's albedo color is set to pure white
   * (`Color(1, 1, 1)`).
   */
  public final fun setInstanceColor(instance: Int, color: Color): Unit {
    Internals.writeArguments(LONG to instance.toLong(), COLOR to color)
    Internals.callMethod(rawPtr, MethodBindings.setInstanceColorPtr, NIL)
  }

  /**
   * Gets a specific instance's color multiplier.
   */
  public final fun getInstanceColor(instance: Int): Color {
    Internals.writeArguments(LONG to instance.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getInstanceColorPtr, COLOR)
    return (Internals.readReturnValue(COLOR) as Color)
  }

  /**
   * Sets custom data for a specific instance. [customData] is a [Color] type only to contain 4
   * floating-point numbers.
   * **Note:** Each number is stored in 32 bits in the Forward+ and Mobile rendering methods, but is
   * packed into 16 bits in the Compatibility rendering method.
   * For the custom data to be used, ensure that [useCustomData] is `true`.
   * This custom instance data has to be manually accessed in your custom shader using
   * `INSTANCE_CUSTOM`.
   */
  public final fun setInstanceCustomData(instance: Int, customData: Color): Unit {
    Internals.writeArguments(LONG to instance.toLong(), COLOR to customData)
    Internals.callMethod(rawPtr, MethodBindings.setInstanceCustomDataPtr, NIL)
  }

  /**
   * Returns the custom data that has been set for a specific instance.
   */
  public final fun getInstanceCustomData(instance: Int): Color {
    Internals.writeArguments(LONG to instance.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getInstanceCustomDataPtr, COLOR)
    return (Internals.readReturnValue(COLOR) as Color)
  }

  public final fun setCustomAabb(aabb: AABB): Unit {
    Internals.writeArguments(godot.core.VariantParser.AABB to aabb)
    Internals.callMethod(rawPtr, MethodBindings.setCustomAabbPtr, NIL)
  }

  public final fun getCustomAabb(): AABB {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCustomAabbPtr, godot.core.VariantParser.AABB)
    return (Internals.readReturnValue(godot.core.VariantParser.AABB) as AABB)
  }

  /**
   * Returns the visibility axis-aligned bounding box in local space.
   */
  public final fun getAabb(): AABB {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAabbPtr, godot.core.VariantParser.AABB)
    return (Internals.readReturnValue(godot.core.VariantParser.AABB) as AABB)
  }

  public final fun getBuffer(): PackedFloat32Array {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBufferPtr, PACKED_FLOAT_32_ARRAY)
    return (Internals.readReturnValue(PACKED_FLOAT_32_ARRAY) as PackedFloat32Array)
  }

  public final fun setBuffer(buffer: PackedFloat32Array): Unit {
    Internals.writeArguments(PACKED_FLOAT_32_ARRAY to buffer)
    Internals.callMethod(rawPtr, MethodBindings.setBufferPtr, NIL)
  }

  public enum class TransformFormat(
    id: Long,
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
      public fun from(`value`: Long): TransformFormat = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setMeshPtr: VoidPtr = Internals.getMethodBindPtr("MultiMesh", "set_mesh", 194775623)

    public val getMeshPtr: VoidPtr = Internals.getMethodBindPtr("MultiMesh", "get_mesh", 1808005922)

    public val setUseColorsPtr: VoidPtr =
        Internals.getMethodBindPtr("MultiMesh", "set_use_colors", 2586408642)

    public val isUsingColorsPtr: VoidPtr =
        Internals.getMethodBindPtr("MultiMesh", "is_using_colors", 36873697)

    public val setUseCustomDataPtr: VoidPtr =
        Internals.getMethodBindPtr("MultiMesh", "set_use_custom_data", 2586408642)

    public val isUsingCustomDataPtr: VoidPtr =
        Internals.getMethodBindPtr("MultiMesh", "is_using_custom_data", 36873697)

    public val setTransformFormatPtr: VoidPtr =
        Internals.getMethodBindPtr("MultiMesh", "set_transform_format", 2404750322)

    public val getTransformFormatPtr: VoidPtr =
        Internals.getMethodBindPtr("MultiMesh", "get_transform_format", 2444156481)

    public val setInstanceCountPtr: VoidPtr =
        Internals.getMethodBindPtr("MultiMesh", "set_instance_count", 1286410249)

    public val getInstanceCountPtr: VoidPtr =
        Internals.getMethodBindPtr("MultiMesh", "get_instance_count", 3905245786)

    public val setVisibleInstanceCountPtr: VoidPtr =
        Internals.getMethodBindPtr("MultiMesh", "set_visible_instance_count", 1286410249)

    public val getVisibleInstanceCountPtr: VoidPtr =
        Internals.getMethodBindPtr("MultiMesh", "get_visible_instance_count", 3905245786)

    public val setInstanceTransformPtr: VoidPtr =
        Internals.getMethodBindPtr("MultiMesh", "set_instance_transform", 3616898986)

    public val setInstanceTransform2dPtr: VoidPtr =
        Internals.getMethodBindPtr("MultiMesh", "set_instance_transform_2d", 30160968)

    public val getInstanceTransformPtr: VoidPtr =
        Internals.getMethodBindPtr("MultiMesh", "get_instance_transform", 1965739696)

    public val getInstanceTransform2dPtr: VoidPtr =
        Internals.getMethodBindPtr("MultiMesh", "get_instance_transform_2d", 3836996910)

    public val setInstanceColorPtr: VoidPtr =
        Internals.getMethodBindPtr("MultiMesh", "set_instance_color", 2878471219)

    public val getInstanceColorPtr: VoidPtr =
        Internals.getMethodBindPtr("MultiMesh", "get_instance_color", 3457211756)

    public val setInstanceCustomDataPtr: VoidPtr =
        Internals.getMethodBindPtr("MultiMesh", "set_instance_custom_data", 2878471219)

    public val getInstanceCustomDataPtr: VoidPtr =
        Internals.getMethodBindPtr("MultiMesh", "get_instance_custom_data", 3457211756)

    public val setCustomAabbPtr: VoidPtr =
        Internals.getMethodBindPtr("MultiMesh", "set_custom_aabb", 259215842)

    public val getCustomAabbPtr: VoidPtr =
        Internals.getMethodBindPtr("MultiMesh", "get_custom_aabb", 1068685055)

    public val getAabbPtr: VoidPtr = Internals.getMethodBindPtr("MultiMesh", "get_aabb", 1068685055)

    public val getBufferPtr: VoidPtr =
        Internals.getMethodBindPtr("MultiMesh", "get_buffer", 675695659)

    public val setBufferPtr: VoidPtr =
        Internals.getMethodBindPtr("MultiMesh", "set_buffer", 2899603908)
  }
}
