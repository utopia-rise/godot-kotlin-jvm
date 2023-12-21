// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.NodePath
import godot.core.PackedColorArray
import godot.core.PackedFloat32Array
import godot.core.PackedVector2Array
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_COLOR_ARRAY
import godot.core.VariantType.PACKED_FLOAT_32_ARRAY
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

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
  public var color: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setColorPtr, NIL)
    }

  /**
   * The offset applied to each vertex.
   */
  @CoreTypeLocalCopy
  public var offset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOffsetPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOffsetPtr, NIL)
    }

  /**
   * If `true`, polygon edges will be anti-aliased.
   */
  public var antialiased: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAntialiasedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAntialiasedPtr, NIL)
    }

  /**
   * The polygon's fill texture. Use [uv] to set texture coordinates.
   */
  public var texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTexturePtr, NIL)
    }

  /**
   * Amount to offset the polygon's [texture]. If set to `Vector2(0, 0)`, the texture's origin (its
   * top-left corner) will be placed at the polygon's position.
   */
  @CoreTypeLocalCopy
  public var textureOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextureOffsetPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextureOffsetPtr, NIL)
    }

  /**
   * Amount to multiply the [uv] coordinates when using [texture]. Larger values make the texture
   * smaller, and vice versa.
   */
  @CoreTypeLocalCopy
  public var textureScale: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextureScalePtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextureScalePtr, NIL)
    }

  /**
   * The texture's rotation in radians.
   */
  public var textureRotation: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextureRotationPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTextureRotationPtr, NIL)
    }

  /**
   * Path to a [Skeleton2D] node used for skeleton-based deformations of this polygon. If empty or
   * invalid, skeletal deformations will not be used.
   */
  public var skeleton: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSkeletonPtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSkeletonPtr, NIL)
    }

  /**
   * If `true`, the polygon will be inverted, containing the area outside the defined points and
   * extending to the [invertBorder].
   */
  public var invertEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getInvertEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setInvertEnabledPtr, NIL)
    }

  /**
   * Added padding applied to the bounding box when [invertEnabled] is set to `true`. Setting this
   * value too small may result in a "Bad Polygon" error.
   */
  public var invertBorder: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getInvertBorderPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setInvertBorderPtr, NIL)
    }

  /**
   * The polygon's list of vertices. The final point will be connected to the first.
   * **Note:** This returns a copy of the [PackedVector2Array] rather than a reference.
   */
  public var polygon: PackedVector2Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPolygonPtr, PACKED_VECTOR2_ARRAY)
      return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPolygonPtr, NIL)
    }

  /**
   * Texture coordinates for each vertex of the polygon. There should be one UV value per polygon
   * vertex. If there are fewer, undefined vertices will use `Vector2(0, 0)`.
   */
  public var uv: PackedVector2Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUvPtr, PACKED_VECTOR2_ARRAY)
      return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUvPtr, NIL)
    }

  /**
   * Color for each vertex. Colors are interpolated between vertices, resulting in smooth gradients.
   * There should be one per polygon vertex. If there are fewer, undefined vertices will use [color].
   */
  public var vertexColors: PackedColorArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVertexColorsPtr, PACKED_COLOR_ARRAY)
      return (TransferContext.readReturnValue(PACKED_COLOR_ARRAY, false) as PackedColorArray)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_COLOR_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVertexColorsPtr, NIL)
    }

  /**
   * The list of polygons, in case more than one is being represented. Every individual polygon is
   * stored as a [PackedInt32Array] where each [int] is an index to a point in [polygon]. If empty,
   * this property will be ignored, and the resulting single polygon will be composed of all points in
   * [polygon], using the order they are stored in.
   */
  public var polygons: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPolygonsPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPolygonsPtr, NIL)
    }

  /**
   * Number of internal vertices, used for UV mapping.
   */
  public var internalVertexCount: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getInternalVertexCountPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setInternalVertexCountPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_POLYGON2D, scriptIndex)
    return true
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
  public open fun colorMutate(block: Color.() -> Unit): Color = color.apply{
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
  public open fun offsetMutate(block: Vector2.() -> Unit): Vector2 = offset.apply{
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
  public open fun textureOffsetMutate(block: Vector2.() -> Unit): Vector2 = textureOffset.apply{
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
  public open fun textureScaleMutate(block: Vector2.() -> Unit): Vector2 = textureScale.apply{
      block(this)
      textureScale = this
  }


  /**
   * Adds a bone with the specified [path] and [weights].
   */
  public fun addBone(path: NodePath, weights: PackedFloat32Array): Unit {
    TransferContext.writeArguments(NODE_PATH to path, PACKED_FLOAT_32_ARRAY to weights)
    TransferContext.callMethod(rawPtr, MethodBindings.addBonePtr, NIL)
  }

  /**
   * Returns the number of bones in this [Polygon2D].
   */
  public fun getBoneCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBoneCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the path to the node associated with the specified bone.
   */
  public fun getBonePath(index: Int): NodePath {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBonePathPtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
  }

  /**
   * Returns the weight values of the specified bone.
   */
  public fun getBoneWeights(index: Int): PackedFloat32Array {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBoneWeightsPtr, PACKED_FLOAT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_FLOAT_32_ARRAY, false) as PackedFloat32Array)
  }

  /**
   * Removes the specified bone from this [Polygon2D].
   */
  public fun eraseBone(index: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.eraseBonePtr, NIL)
  }

  /**
   * Removes all bones from this [Polygon2D].
   */
  public fun clearBones(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearBonesPtr, NIL)
  }

  /**
   * Sets the path to the node associated with the specified bone.
   */
  public fun setBonePath(index: Int, path: NodePath): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), NODE_PATH to path)
    TransferContext.callMethod(rawPtr, MethodBindings.setBonePathPtr, NIL)
  }

  /**
   * Sets the weight values for the specified bone.
   */
  public fun setBoneWeights(index: Int, weights: PackedFloat32Array): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), PACKED_FLOAT_32_ARRAY to weights)
    TransferContext.callMethod(rawPtr, MethodBindings.setBoneWeightsPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val setPolygonPtr: VoidPtr = TypeManager.getMethodBindPtr("Polygon2D", "set_polygon")

    public val getPolygonPtr: VoidPtr = TypeManager.getMethodBindPtr("Polygon2D", "get_polygon")

    public val setUvPtr: VoidPtr = TypeManager.getMethodBindPtr("Polygon2D", "set_uv")

    public val getUvPtr: VoidPtr = TypeManager.getMethodBindPtr("Polygon2D", "get_uv")

    public val setColorPtr: VoidPtr = TypeManager.getMethodBindPtr("Polygon2D", "set_color")

    public val getColorPtr: VoidPtr = TypeManager.getMethodBindPtr("Polygon2D", "get_color")

    public val setPolygonsPtr: VoidPtr = TypeManager.getMethodBindPtr("Polygon2D", "set_polygons")

    public val getPolygonsPtr: VoidPtr = TypeManager.getMethodBindPtr("Polygon2D", "get_polygons")

    public val setVertexColorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "set_vertex_colors")

    public val getVertexColorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "get_vertex_colors")

    public val setTexturePtr: VoidPtr = TypeManager.getMethodBindPtr("Polygon2D", "set_texture")

    public val getTexturePtr: VoidPtr = TypeManager.getMethodBindPtr("Polygon2D", "get_texture")

    public val setTextureOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "set_texture_offset")

    public val getTextureOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "get_texture_offset")

    public val setTextureRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "set_texture_rotation")

    public val getTextureRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "get_texture_rotation")

    public val setTextureScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "set_texture_scale")

    public val getTextureScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "get_texture_scale")

    public val setInvertEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "set_invert_enabled")

    public val getInvertEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "get_invert_enabled")

    public val setAntialiasedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "set_antialiased")

    public val getAntialiasedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "get_antialiased")

    public val setInvertBorderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "set_invert_border")

    public val getInvertBorderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "get_invert_border")

    public val setOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("Polygon2D", "set_offset")

    public val getOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("Polygon2D", "get_offset")

    public val addBonePtr: VoidPtr = TypeManager.getMethodBindPtr("Polygon2D", "add_bone")

    public val getBoneCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "get_bone_count")

    public val getBonePathPtr: VoidPtr = TypeManager.getMethodBindPtr("Polygon2D", "get_bone_path")

    public val getBoneWeightsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "get_bone_weights")

    public val eraseBonePtr: VoidPtr = TypeManager.getMethodBindPtr("Polygon2D", "erase_bone")

    public val clearBonesPtr: VoidPtr = TypeManager.getMethodBindPtr("Polygon2D", "clear_bones")

    public val setBonePathPtr: VoidPtr = TypeManager.getMethodBindPtr("Polygon2D", "set_bone_path")

    public val setBoneWeightsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "set_bone_weights")

    public val setSkeletonPtr: VoidPtr = TypeManager.getMethodBindPtr("Polygon2D", "set_skeleton")

    public val getSkeletonPtr: VoidPtr = TypeManager.getMethodBindPtr("Polygon2D", "get_skeleton")

    public val setInternalVertexCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "set_internal_vertex_count")

    public val getInternalVertexCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Polygon2D", "get_internal_vertex_count")
  }
}
