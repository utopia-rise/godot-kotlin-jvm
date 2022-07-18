// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.NodePath
import godot.core.PackedColorArray
import godot.core.PackedFloat32Array
import godot.core.PackedVector2Array
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
import godot.core.VariantType.PACKED_COLOR_ARRAY
import godot.core.VariantType.PACKED_FLOAT_32_ARRAY
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A 2D polygon.
 *
 * A Polygon2D is defined by a set of points. Each point is connected to the next, with the final point being connected to the first, resulting in a closed polygon. Polygon2Ds can be filled with color (solid or gradient) or filled with a given texture.
 */
@GodotBaseType
public open class Polygon2D : Node2D() {
  /**
   * The polygon's fill color. If `texture` is defined, it will be multiplied by this color. It will also be the default color for vertices not set in `vertex_colors`.
   */
  public var color: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_GET_COLOR, COLOR.ordinal)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_SET_COLOR, NIL.ordinal)
    }

  /**
   * The offset applied to each vertex.
   */
  public var offset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_GET_OFFSET, VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_SET_OFFSET, NIL.ordinal)
    }

  /**
   * If `true`, polygon edges will be anti-aliased.
   */
  public var antialiased: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_GET_ANTIALIASED,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_SET_ANTIALIASED, NIL.ordinal)
    }

  /**
   * The polygon's fill texture. Use `uv` to set texture coordinates.
   */
  public var texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_GET_TEXTURE, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_SET_TEXTURE, NIL.ordinal)
    }

  /**
   * Amount to offset the polygon's `texture`. If `(0, 0)` the texture's origin (its top-left corner) will be placed at the polygon's `position`.
   */
  public var textureOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_GET_TEXTURE_OFFSET,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_SET_TEXTURE_OFFSET,
          NIL.ordinal)
    }

  /**
   * Amount to multiply the `uv` coordinates when using a `texture`. Larger values make the texture smaller, and vice versa.
   */
  public var textureScale: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_GET_TEXTURE_SCALE,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_SET_TEXTURE_SCALE,
          NIL.ordinal)
    }

  /**
   * The texture's rotation in radians.
   */
  public var textureRotation: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_GET_TEXTURE_ROTATION,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_SET_TEXTURE_ROTATION,
          NIL.ordinal)
    }

  /**
   *
   */
  public var skeleton: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_GET_SKELETON,
          NODE_PATH.ordinal)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_SET_SKELETON, NIL.ordinal)
    }

  /**
   * If `true`, polygon will be inverted, containing the area outside the defined points and extending to the `invert_border`.
   */
  public var invertEnable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_GET_INVERT, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_SET_INVERT, NIL.ordinal)
    }

  /**
   * Added padding applied to the bounding box when using `invert`. Setting this value too small may result in a "Bad Polygon" error.
   */
  public var invertBorder: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_GET_INVERT_BORDER,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_SET_INVERT_BORDER,
          NIL.ordinal)
    }

  /**
   * The polygon's list of vertices. The final point will be connected to the first.
   *
   * **Note:** This returns a copy of the [godot.PackedVector2Array] rather than a reference.
   */
  public var polygon: PackedVector2Array
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_GET_POLYGON,
          PACKED_VECTOR2_ARRAY.ordinal)
      return TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_SET_POLYGON, NIL.ordinal)
    }

  /**
   * Texture coordinates for each vertex of the polygon. There should be one `uv` per polygon vertex. If there are fewer, undefined vertices will use `(0, 0)`.
   */
  public var uv: PackedVector2Array
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_GET_UV,
          PACKED_VECTOR2_ARRAY.ordinal)
      return TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_SET_UV, NIL.ordinal)
    }

  /**
   * Color for each vertex. Colors are interpolated between vertices, resulting in smooth gradients. There should be one per polygon vertex. If there are fewer, undefined vertices will use `color`.
   */
  public var vertexColors: PackedColorArray
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_GET_VERTEX_COLORS,
          PACKED_COLOR_ARRAY.ordinal)
      return TransferContext.readReturnValue(PACKED_COLOR_ARRAY, false) as PackedColorArray
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_COLOR_ARRAY to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_SET_VERTEX_COLORS,
          NIL.ordinal)
    }

  /**
   *
   */
  public var polygons: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_GET_POLYGONS, ARRAY.ordinal)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_SET_POLYGONS, NIL.ordinal)
    }

  /**
   *
   */
  public var internalVertexCount: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_GET_INTERNAL_VERTEX_COUNT,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_SET_INTERNAL_VERTEX_COUNT,
          NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_POLYGON2D)
  }

  /**
   * Adds a bone with the specified `path` and `weights`.
   */
  public fun addBone(path: NodePath, weights: PackedFloat32Array): Unit {
    TransferContext.writeArguments(NODE_PATH to path, PACKED_FLOAT_32_ARRAY to weights)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_ADD_BONE, NIL.ordinal)
  }

  /**
   * Returns the number of bones in this [godot.Polygon2D].
   */
  public fun getBoneCount(): Long {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_GET_BONE_COUNT, LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the path to the node associated with the specified bone.
   */
  public fun getBonePath(index: Long): NodePath {
    TransferContext.writeArguments(LONG to index)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_GET_BONE_PATH,
        NODE_PATH.ordinal)
    return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
  }

  /**
   * Returns the height values of the specified bone.
   */
  public fun getBoneWeights(index: Long): PackedFloat32Array {
    TransferContext.writeArguments(LONG to index)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_GET_BONE_WEIGHTS,
        PACKED_FLOAT_32_ARRAY.ordinal)
    return TransferContext.readReturnValue(PACKED_FLOAT_32_ARRAY, false) as PackedFloat32Array
  }

  /**
   * Removes the specified bone from this [godot.Polygon2D].
   */
  public fun eraseBone(index: Long): Unit {
    TransferContext.writeArguments(LONG to index)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_ERASE_BONE, NIL.ordinal)
  }

  /**
   * Removes all bones from this [godot.Polygon2D].
   */
  public fun clearBones(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_CLEAR_BONES, NIL.ordinal)
  }

  /**
   * Sets the path to the node associated with the specified bone.
   */
  public fun setBonePath(index: Long, path: NodePath): Unit {
    TransferContext.writeArguments(LONG to index, NODE_PATH to path)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_SET_BONE_PATH, NIL.ordinal)
  }

  /**
   * Sets the weight values for the specified bone.
   */
  public fun setBoneWeights(index: Long, weights: PackedFloat32Array): Unit {
    TransferContext.writeArguments(LONG to index, PACKED_FLOAT_32_ARRAY to weights)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_POLYGON2D_SET_BONE_WEIGHTS, NIL.ordinal)
  }

  public companion object
}
