// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.MemoryManager
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Color
import godot.core.NodePath
import godot.core.PackedColorArray
import godot.core.PackedFloat32Array
import godot.core.PackedVector2Array
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.NODE_PATH
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_COLOR_ARRAY
import godot.core.VariantParser.PACKED_FLOAT_32_ARRAY
import godot.core.VariantParser.PACKED_VECTOR2_ARRAY
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A Polygon2D is defined by a set of points. Each point is connected to the next, with the final
 * point being connected to the first, resulting in a closed polygon. Polygon2Ds can be filled with
 * color (solid or gradient) or filled with a given texture.
 */
@GodotBaseType
public open class Polygon2D : Node2D() {
  /**
   * The polygon's fill color. If [texture] is set, it will be multiplied by this color. It will
   * also be the default color for vertices not set in [vertexColors].
   */
  @CoreTypeLocalCopy
  public final inline var color: Color
    @JvmName("colorProperty")
    get() = getColor()
    @JvmName("colorProperty")
    set(`value`) {
      setColor(value)
    }

  /**
   * The offset applied to each vertex.
   */
  @CoreTypeLocalCopy
  public final inline var offset: Vector2
    @JvmName("offsetProperty")
    get() = getOffset()
    @JvmName("offsetProperty")
    set(`value`) {
      setOffset(value)
    }

  /**
   * If `true`, polygon edges will be anti-aliased.
   */
  public final inline var antialiased: Boolean
    @JvmName("antialiasedProperty")
    get() = getAntialiased()
    @JvmName("antialiasedProperty")
    set(`value`) {
      setAntialiased(value)
    }

  /**
   * The polygon's fill texture. Use [uv] to set texture coordinates.
   */
  public final inline var texture: Texture2D?
    @JvmName("textureProperty")
    get() = getTexture()
    @JvmName("textureProperty")
    set(`value`) {
      setTexture(value)
    }

  /**
   * Amount to offset the polygon's [texture]. If set to `Vector2(0, 0)`, the texture's origin (its
   * top-left corner) will be placed at the polygon's position.
   */
  @CoreTypeLocalCopy
  public final inline var textureOffset: Vector2
    @JvmName("textureOffsetProperty")
    get() = getTextureOffset()
    @JvmName("textureOffsetProperty")
    set(`value`) {
      setTextureOffset(value)
    }

  /**
   * Amount to multiply the [uv] coordinates when using [texture]. Larger values make the texture
   * smaller, and vice versa.
   */
  @CoreTypeLocalCopy
  public final inline var textureScale: Vector2
    @JvmName("textureScaleProperty")
    get() = getTextureScale()
    @JvmName("textureScaleProperty")
    set(`value`) {
      setTextureScale(value)
    }

  /**
   * The texture's rotation in radians.
   */
  public final inline var textureRotation: Float
    @JvmName("textureRotationProperty")
    get() = getTextureRotation()
    @JvmName("textureRotationProperty")
    set(`value`) {
      setTextureRotation(value)
    }

  /**
   * Path to a [Skeleton2D] node used for skeleton-based deformations of this polygon. If empty or
   * invalid, skeletal deformations will not be used.
   */
  public final inline var skeleton: NodePath
    @JvmName("skeletonProperty")
    get() = getSkeleton()
    @JvmName("skeletonProperty")
    set(`value`) {
      setSkeleton(value)
    }

  /**
   * If `true`, the polygon will be inverted, containing the area outside the defined points and
   * extending to the [invertBorder].
   */
  public final inline var invertEnabled: Boolean
    @JvmName("invertEnabledProperty")
    get() = getInvertEnabled()
    @JvmName("invertEnabledProperty")
    set(`value`) {
      setInvertEnabled(value)
    }

  /**
   * Added padding applied to the bounding box when [invertEnabled] is set to `true`. Setting this
   * value too small may result in a "Bad Polygon" error.
   */
  public final inline var invertBorder: Float
    @JvmName("invertBorderProperty")
    get() = getInvertBorder()
    @JvmName("invertBorderProperty")
    set(`value`) {
      setInvertBorder(value)
    }

  /**
   * The polygon's list of vertices. The final point will be connected to the first.
   */
  public final inline var polygon: PackedVector2Array
    @JvmName("polygonProperty")
    get() = getPolygon()
    @JvmName("polygonProperty")
    set(`value`) {
      setPolygon(value)
    }

  /**
   * Texture coordinates for each vertex of the polygon. There should be one UV value per polygon
   * vertex. If there are fewer, undefined vertices will use `Vector2(0, 0)`.
   */
  public final inline var uv: PackedVector2Array
    @JvmName("uvProperty")
    get() = getUv()
    @JvmName("uvProperty")
    set(`value`) {
      setUv(value)
    }

  /**
   * Color for each vertex. Colors are interpolated between vertices, resulting in smooth gradients.
   * There should be one per polygon vertex. If there are fewer, undefined vertices will use [color].
   */
  public final inline var vertexColors: PackedColorArray
    @JvmName("vertexColorsProperty")
    get() = getVertexColors()
    @JvmName("vertexColorsProperty")
    set(`value`) {
      setVertexColors(value)
    }

  /**
   * The list of polygons, in case more than one is being represented. Every individual polygon is
   * stored as a [PackedInt32Array] where each [int] is an index to a point in [polygon]. If empty,
   * this property will be ignored, and the resulting single polygon will be composed of all points in
   * [polygon], using the order they are stored in.
   */
  public final inline var polygons: VariantArray<Any?>
    @JvmName("polygonsProperty")
    get() = getPolygons()
    @JvmName("polygonsProperty")
    set(`value`) {
      setPolygons(value)
    }

  /**
   * Number of internal vertices, used for UV mapping.
   */
  public final inline var internalVertexCount: Int
    @JvmName("internalVertexCountProperty")
    get() = getInternalVertexCount()
    @JvmName("internalVertexCountProperty")
    set(`value`) {
      setInternalVertexCount(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    MemoryManager.createNativeObject(ENGINECLASS_POLYGON2D, this, scriptIndex)
  }

  /**
   * The polygon's fill color. If [texture] is set, it will be multiplied by this color. It will
   * also be the default color for vertices not set in [vertexColors].
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
   * val myCoreType = polygon2d.color
   * //Your changes
   * polygon2d.color = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun colorMutate(block: Color.() -> Unit): Color = color.apply{
      block(this)
      color = this
  }


  /**
   * The offset applied to each vertex.
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
   * val myCoreType = polygon2d.offset
   * //Your changes
   * polygon2d.offset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun offsetMutate(block: Vector2.() -> Unit): Vector2 = offset.apply{
      block(this)
      offset = this
  }


  /**
   * Amount to offset the polygon's [texture]. If set to `Vector2(0, 0)`, the texture's origin (its
   * top-left corner) will be placed at the polygon's position.
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
   * val myCoreType = polygon2d.textureOffset
   * //Your changes
   * polygon2d.textureOffset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun textureOffsetMutate(block: Vector2.() -> Unit): Vector2 = textureOffset.apply{
      block(this)
      textureOffset = this
  }


  /**
   * Amount to multiply the [uv] coordinates when using [texture]. Larger values make the texture
   * smaller, and vice versa.
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
   * val myCoreType = polygon2d.textureScale
   * //Your changes
   * polygon2d.textureScale = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun textureScaleMutate(block: Vector2.() -> Unit): Vector2 = textureScale.apply{
      block(this)
      textureScale = this
  }


  public final fun setPolygon(polygon: PackedVector2Array): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to polygon)
    TransferContext.callMethod(ptr, MethodBindings.setPolygonPtr, NIL)
  }

  public final fun getPolygon(): PackedVector2Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPolygonPtr, PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY) as PackedVector2Array)
  }

  public final fun setUv(uv: PackedVector2Array): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to uv)
    TransferContext.callMethod(ptr, MethodBindings.setUvPtr, NIL)
  }

  public final fun getUv(): PackedVector2Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getUvPtr, PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY) as PackedVector2Array)
  }

  public final fun setColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.setColorPtr, NIL)
  }

  public final fun getColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setPolygons(polygons: VariantArray<Any?>): Unit {
    TransferContext.writeArguments(ARRAY to polygons)
    TransferContext.callMethod(ptr, MethodBindings.setPolygonsPtr, NIL)
  }

  public final fun getPolygons(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPolygonsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  public final fun setVertexColors(vertexColors: PackedColorArray): Unit {
    TransferContext.writeArguments(PACKED_COLOR_ARRAY to vertexColors)
    TransferContext.callMethod(ptr, MethodBindings.setVertexColorsPtr, NIL)
  }

  public final fun getVertexColors(): PackedColorArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVertexColorsPtr, PACKED_COLOR_ARRAY)
    return (TransferContext.readReturnValue(PACKED_COLOR_ARRAY) as PackedColorArray)
  }

  public final fun setTexture(texture: Texture2D?): Unit {
    TransferContext.writeArguments(OBJECT to texture)
    TransferContext.callMethod(ptr, MethodBindings.setTexturePtr, NIL)
  }

  public final fun getTexture(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTexturePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  public final fun setTextureOffset(textureOffset: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to textureOffset)
    TransferContext.callMethod(ptr, MethodBindings.setTextureOffsetPtr, NIL)
  }

  public final fun getTextureOffset(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTextureOffsetPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setTextureRotation(textureRotation: Float): Unit {
    TransferContext.writeArguments(DOUBLE to textureRotation.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setTextureRotationPtr, NIL)
  }

  public final fun getTextureRotation(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTextureRotationPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setTextureScale(textureScale: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to textureScale)
    TransferContext.callMethod(ptr, MethodBindings.setTextureScalePtr, NIL)
  }

  public final fun getTextureScale(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTextureScalePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setInvertEnabled(invert: Boolean): Unit {
    TransferContext.writeArguments(BOOL to invert)
    TransferContext.callMethod(ptr, MethodBindings.setInvertEnabledPtr, NIL)
  }

  public final fun getInvertEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getInvertEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setAntialiased(antialiased: Boolean): Unit {
    TransferContext.writeArguments(BOOL to antialiased)
    TransferContext.callMethod(ptr, MethodBindings.setAntialiasedPtr, NIL)
  }

  public final fun getAntialiased(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAntialiasedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setInvertBorder(invertBorder: Float): Unit {
    TransferContext.writeArguments(DOUBLE to invertBorder.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setInvertBorderPtr, NIL)
  }

  public final fun getInvertBorder(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getInvertBorderPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setOffset(offset: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to offset)
    TransferContext.callMethod(ptr, MethodBindings.setOffsetPtr, NIL)
  }

  public final fun getOffset(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOffsetPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Adds a bone with the specified [path] and [weights].
   */
  public final fun addBone(path: NodePath, weights: PackedFloat32Array): Unit {
    TransferContext.writeArguments(NODE_PATH to path, PACKED_FLOAT_32_ARRAY to weights)
    TransferContext.callMethod(ptr, MethodBindings.addBonePtr, NIL)
  }

  /**
   * Returns the number of bones in this [Polygon2D].
   */
  public final fun getBoneCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBoneCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the path to the node associated with the specified bone.
   */
  public final fun getBonePath(index: Int): NodePath {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getBonePathPtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH) as NodePath)
  }

  /**
   * Returns the weight values of the specified bone.
   */
  public final fun getBoneWeights(index: Int): PackedFloat32Array {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getBoneWeightsPtr, PACKED_FLOAT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_FLOAT_32_ARRAY) as PackedFloat32Array)
  }

  /**
   * Removes the specified bone from this [Polygon2D].
   */
  public final fun eraseBone(index: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.eraseBonePtr, NIL)
  }

  /**
   * Removes all bones from this [Polygon2D].
   */
  public final fun clearBones(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearBonesPtr, NIL)
  }

  /**
   * Sets the path to the node associated with the specified bone.
   */
  public final fun setBonePath(index: Int, path: NodePath): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), NODE_PATH to path)
    TransferContext.callMethod(ptr, MethodBindings.setBonePathPtr, NIL)
  }

  /**
   * Sets the weight values for the specified bone.
   */
  public final fun setBoneWeights(index: Int, weights: PackedFloat32Array): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), PACKED_FLOAT_32_ARRAY to weights)
    TransferContext.callMethod(ptr, MethodBindings.setBoneWeightsPtr, NIL)
  }

  public final fun setSkeleton(skeleton: NodePath): Unit {
    TransferContext.writeArguments(NODE_PATH to skeleton)
    TransferContext.callMethod(ptr, MethodBindings.setSkeletonPtr, NIL)
  }

  public final fun getSkeleton(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSkeletonPtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH) as NodePath)
  }

  public final fun setInternalVertexCount(internalVertexCount: Int): Unit {
    TransferContext.writeArguments(LONG to internalVertexCount.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setInternalVertexCountPtr, NIL)
  }

  public final fun getInternalVertexCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getInternalVertexCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public companion object

  internal object MethodBindings {
    public val setPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "set_polygon", 1509147220)

    public val getPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "get_polygon", 2961356807)

    public val setUvPtr: VoidPtr = TypeManager.getMethodBindPtr("Polygon2D", "set_uv", 1509147220)

    public val getUvPtr: VoidPtr = TypeManager.getMethodBindPtr("Polygon2D", "get_uv", 2961356807)

    public val setColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "set_color", 2920490490)

    public val getColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "get_color", 3444240500)

    public val setPolygonsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "set_polygons", 381264803)

    public val getPolygonsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "get_polygons", 3995934104)

    public val setVertexColorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "set_vertex_colors", 3546319833)

    public val getVertexColorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "get_vertex_colors", 1392750486)

    public val setTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "set_texture", 4051416890)

    public val getTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "get_texture", 3635182373)

    public val setTextureOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "set_texture_offset", 743155724)

    public val getTextureOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "get_texture_offset", 3341600327)

    public val setTextureRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "set_texture_rotation", 373806689)

    public val getTextureRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "get_texture_rotation", 1740695150)

    public val setTextureScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "set_texture_scale", 743155724)

    public val getTextureScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "get_texture_scale", 3341600327)

    public val setInvertEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "set_invert_enabled", 2586408642)

    public val getInvertEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "get_invert_enabled", 36873697)

    public val setAntialiasedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "set_antialiased", 2586408642)

    public val getAntialiasedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "get_antialiased", 36873697)

    public val setInvertBorderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "set_invert_border", 373806689)

    public val getInvertBorderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "get_invert_border", 1740695150)

    public val setOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "set_offset", 743155724)

    public val getOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "get_offset", 3341600327)

    public val addBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "add_bone", 703042815)

    public val getBoneCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "get_bone_count", 3905245786)

    public val getBonePathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "get_bone_path", 408788394)

    public val getBoneWeightsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "get_bone_weights", 1542882410)

    public val eraseBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "erase_bone", 1286410249)

    public val clearBonesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "clear_bones", 3218959716)

    public val setBonePathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "set_bone_path", 2761262315)

    public val setBoneWeightsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "set_bone_weights", 1345852415)

    public val setSkeletonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "set_skeleton", 1348162250)

    public val getSkeletonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "get_skeleton", 4075236667)

    public val setInternalVertexCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "set_internal_vertex_count", 1286410249)

    public val getInternalVertexCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "get_internal_vertex_count", 3905245786)
  }
}
