// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.NodePath
import godot.core.PoolColorArray
import godot.core.PoolRealArray
import godot.core.PoolVector2Array
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_COLOR_ARRAY
import godot.core.VariantType.POOL_REAL_ARRAY
import godot.core.VariantType.POOL_VECTOR2_ARRAY
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 * A 2D polygon.
 *
 * A Polygon2D is defined by a set of points. Each point is connected to the next, with the final point being connected to the first, resulting in a closed polygon. Polygon2Ds can be filled with color (solid or gradient) or filled with a given texture.
 *
 * **Note:** By default, Godot can only draw up to 4,096 polygon points at a time. To increase this limit, open the Project Settings and increase [godot.ProjectSettings.rendering/limits/buffers/canvasPolygonBufferSizeKb] and [godot.ProjectSettings.rendering/limits/buffers/canvasPolygonIndexBufferSizeKb].
 */
@GodotBaseType
public open class Polygon2D : Node2D() {
  /**
   * If `true`, polygon edges will be anti-aliased.
   */
  public open var antialiased: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_GET_ANTIALIASED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_SET_ANTIALIASED, NIL)
    }

  /**
   * The polygon's fill color. If `texture` is defined, it will be multiplied by this color. It will also be the default color for vertices not set in `vertex_colors`.
   */
  public open var color: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_GET_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_SET_COLOR, NIL)
    }

  /**
   *
   */
  public open var internalVertexCount: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_POLYGON2D_GET_INTERNAL_VERTEX_COUNT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_POLYGON2D_SET_INTERNAL_VERTEX_COUNT, NIL)
    }

  /**
   * Added padding applied to the bounding box when using `invert`. Setting this value too small may result in a "Bad Polygon" error.
   */
  public open var invertBorder: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_GET_INVERT_BORDER,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_SET_INVERT_BORDER, NIL)
    }

  /**
   * If `true`, polygon will be inverted, containing the area outside the defined points and extending to the `invert_border`.
   */
  public open var invertEnable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_GET_INVERT_ENABLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_SET_INVERT_ENABLE, NIL)
    }

  /**
   * The offset applied to each vertex.
   */
  public open var offset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_GET_OFFSET, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_SET_OFFSET, NIL)
    }

  /**
   * The polygon's list of vertices. The final point will be connected to the first.
   *
   * **Note:** This returns a copy of the [godot.core.PoolVector2Array] rather than a reference.
   */
  public open var polygon: PoolVector2Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_GET_POLYGON,
          POOL_VECTOR2_ARRAY)
      return TransferContext.readReturnValue(POOL_VECTOR2_ARRAY, false) as PoolVector2Array
    }
    set(`value`) {
      TransferContext.writeArguments(POOL_VECTOR2_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_SET_POLYGON, NIL)
    }

  /**
   *
   */
  public open var polygons: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_GET_POLYGONS, ARRAY)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_SET_POLYGONS, NIL)
    }

  /**
   *
   */
  public open var skeleton: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_GET_SKELETON, NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_SET_SKELETON, NIL)
    }

  /**
   * The polygon's fill texture. Use `uv` to set texture coordinates.
   */
  public open var texture: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_GET_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_SET_TEXTURE, NIL)
    }

  /**
   * Amount to offset the polygon's `texture`. If `(0, 0)` the texture's origin (its top-left corner) will be placed at the polygon's `position`.
   */
  public open var textureOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_GET_TEXTURE_OFFSET,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_SET_TEXTURE_OFFSET, NIL)
    }

  /**
   * The texture's rotation in radians.
   */
  public open var textureRotation: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_GET_TEXTURE_ROTATION,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_SET_TEXTURE_ROTATION,
          NIL)
    }

  /**
   * The texture's rotation in degrees.
   */
  public open var textureRotationDegrees: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_POLYGON2D_GET_TEXTURE_ROTATION_DEGREES, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_POLYGON2D_SET_TEXTURE_ROTATION_DEGREES, NIL)
    }

  /**
   * Amount to multiply the `uv` coordinates when using a `texture`. Larger values make the texture smaller, and vice versa.
   */
  public open var textureScale: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_GET_TEXTURE_SCALE,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_SET_TEXTURE_SCALE, NIL)
    }

  /**
   * Texture coordinates for each vertex of the polygon. There should be one `uv` per polygon vertex. If there are fewer, undefined vertices will use `(0, 0)`.
   */
  public open var uv: PoolVector2Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_GET_UV,
          POOL_VECTOR2_ARRAY)
      return TransferContext.readReturnValue(POOL_VECTOR2_ARRAY, false) as PoolVector2Array
    }
    set(`value`) {
      TransferContext.writeArguments(POOL_VECTOR2_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_SET_UV, NIL)
    }

  /**
   * Color for each vertex. Colors are interpolated between vertices, resulting in smooth gradients. There should be one per polygon vertex. If there are fewer, undefined vertices will use `color`.
   */
  public open var vertexColors: PoolColorArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_GET_VERTEX_COLORS,
          POOL_COLOR_ARRAY)
      return TransferContext.readReturnValue(POOL_COLOR_ARRAY, false) as PoolColorArray
    }
    set(`value`) {
      TransferContext.writeArguments(POOL_COLOR_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_SET_VERTEX_COLORS, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_POLYGON2D)
  }

  @CoreTypeHelper
  public open fun color(schedule: Color.() -> Unit): Color = color.apply{
      schedule(this)
      color = this
  }


  @CoreTypeHelper
  public open fun offset(schedule: Vector2.() -> Unit): Vector2 = offset.apply{
      schedule(this)
      offset = this
  }


  @CoreTypeHelper
  public open fun textureOffset(schedule: Vector2.() -> Unit): Vector2 = textureOffset.apply{
      schedule(this)
      textureOffset = this
  }


  @CoreTypeHelper
  public open fun textureScale(schedule: Vector2.() -> Unit): Vector2 = textureScale.apply{
      schedule(this)
      textureScale = this
  }


  public open fun _getBones(): VariantArray<Any?> {
    throw NotImplementedError("_get_bones is not implemented for Polygon2D")
  }

  public open fun _setBones(bones: VariantArray<Any?>): Unit {
  }

  public open fun _skeletonBoneSetupChanged(): Unit {
  }

  /**
   * Adds a bone with the specified `path` and `weights`.
   */
  public open fun addBone(path: NodePath, weights: PoolRealArray): Unit {
    TransferContext.writeArguments(NODE_PATH to path, POOL_REAL_ARRAY to weights)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_ADD_BONE, NIL)
  }

  /**
   * Removes all bones from this [godot.Polygon2D].
   */
  public open fun clearBones(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_CLEAR_BONES, NIL)
  }

  /**
   * Removes the specified bone from this [godot.Polygon2D].
   */
  public open fun eraseBone(index: Long): Unit {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_ERASE_BONE, NIL)
  }

  /**
   * Returns the number of bones in this [godot.Polygon2D].
   */
  public open fun getBoneCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_GET_BONE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the path to the node associated with the specified bone.
   */
  public open fun getBonePath(index: Long): NodePath {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_GET_BONE_PATH, NODE_PATH)
    return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
  }

  /**
   * Returns the height values of the specified bone.
   */
  public open fun getBoneWeights(index: Long): PoolRealArray {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_GET_BONE_WEIGHTS,
        POOL_REAL_ARRAY)
    return TransferContext.readReturnValue(POOL_REAL_ARRAY, false) as PoolRealArray
  }

  /**
   * Sets the path to the node associated with the specified bone.
   */
  public open fun setBonePath(index: Long, path: NodePath): Unit {
    TransferContext.writeArguments(LONG to index, NODE_PATH to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_SET_BONE_PATH, NIL)
  }

  /**
   * Sets the weight values for the specified bone.
   */
  public open fun setBoneWeights(index: Long, weights: PoolRealArray): Unit {
    TransferContext.writeArguments(LONG to index, POOL_REAL_ARRAY to weights)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_SET_BONE_WEIGHTS, NIL)
  }
}
