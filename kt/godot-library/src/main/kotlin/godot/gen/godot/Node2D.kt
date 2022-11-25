// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.Transform2D
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A 2D game object, inherited by all 2D-related nodes. Has a position, rotation, scale, and Z index.
 *
 * Tutorials:
 * [https://github.com/godotengine/godot-demo-projects/tree/master/2d](https://github.com/godotengine/godot-demo-projects/tree/master/2d)
 *
 * A 2D game object, with a transform (position, rotation, and scale). All 2D nodes, including physics objects and sprites, inherit from Node2D. Use Node2D as a parent node to move, scale and rotate children in a 2D project. Also gives control of the node's render order.
 */
@GodotBaseType
public open class Node2D : CanvasItem() {
  /**
   * Position, relative to the node's parent.
   */
  public var position: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_GET_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_SET_POSITION, NIL)
    }

  /**
   * Rotation in radians, relative to the node's parent.
   */
  public var rotation: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_GET_ROTATION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_SET_ROTATION, NIL)
    }

  /**
   * The node's scale. Unscaled value: `(1, 1)`.
   *
   * **Note:** Negative X scales in 2D are not decomposable from the transformation matrix. Due to the way scale is represented with transformation matrices in Godot, negative scales on the X axis will be changed to negative scales on the Y axis and a rotation of 180 degrees when decomposed.
   */
  public var scale: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_GET_SCALE, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_SET_SCALE, NIL)
    }

  /**
   * Slants the node.
   *
   * **Note:** Skew is X axis only.
   */
  public var skew: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_GET_SKEW, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_SET_SKEW, NIL)
    }

  /**
   * Local [godot.core.Transform2D].
   */
  public var transform: Transform2D
    @JvmName("getTransform_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.getTransform()
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM2D to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_SET_TRANSFORM, NIL)
    }

  /**
   * Global position.
   */
  public var globalPosition: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_GET_GLOBAL_POSITION,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_SET_GLOBAL_POSITION, NIL)
    }

  /**
   * Global rotation in radians.
   */
  public var globalRotation: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_GET_GLOBAL_ROTATION,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_SET_GLOBAL_ROTATION, NIL)
    }

  /**
   * Global scale.
   */
  public var globalScale: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_GET_GLOBAL_SCALE, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_SET_GLOBAL_SCALE, NIL)
    }

  /**
   * Global [godot.core.Transform2D].
   */
  public var globalTransform: Transform2D
    @JvmName("getGlobalTransform_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.getGlobalTransform()
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM2D to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_SET_GLOBAL_TRANSFORM, NIL)
    }

  /**
   * Z index. Controls the order in which the nodes render. A node with a higher Z index will display in front of others. Must be between [godot.RenderingServer.CANVAS_ITEM_Z_MIN] and [godot.RenderingServer.CANVAS_ITEM_Z_MAX] (inclusive).
   */
  public var zIndex: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_GET_Z_INDEX, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_SET_Z_INDEX, NIL)
    }

  /**
   * If `true`, the node's Z index is relative to its parent's Z index. If this node's Z index is 2 and its parent's effective Z index is 3, then this node's effective Z index will be 2 + 3 = 5.
   */
  public var zAsRelative: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_IS_Z_RELATIVE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_SET_Z_AS_RELATIVE, NIL)
    }

  /**
   * If `true`, child nodes with the lowest Y position are drawn before those with a higher Y position. If `false`, Y-sorting is disabled. Y-sorting only affects children that inherit from [godot.CanvasItem].
   *
   * You can nest nodes with Y-sorting. Child Y-sorted nodes are sorted in the same space as the parent Y-sort. This feature allows you to organize a scene better or divide it into multiple ones without changing your scene tree.
   */
  public var ySortEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_IS_Y_SORT_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_SET_Y_SORT_ENABLED, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_NODE2D)
  }

  /**
   * Applies a rotation to the node, in radians, starting from its current rotation.
   */
  public fun rotate(radians: Double): Unit {
    TransferContext.writeArguments(DOUBLE to radians)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_ROTATE, NIL)
  }

  /**
   * Applies a local translation on the node's X axis based on the [godot.Node.Process]'s [delta]. If [scaled] is `false`, normalizes the movement.
   */
  public fun moveLocalX(delta: Double, scaled: Boolean = false): Unit {
    TransferContext.writeArguments(DOUBLE to delta, BOOL to scaled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_MOVE_LOCAL_X, NIL)
  }

  /**
   * Applies a local translation on the node's Y axis based on the [godot.Node.Process]'s [delta]. If [scaled] is `false`, normalizes the movement.
   */
  public fun moveLocalY(delta: Double, scaled: Boolean = false): Unit {
    TransferContext.writeArguments(DOUBLE to delta, BOOL to scaled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_MOVE_LOCAL_Y, NIL)
  }

  /**
   * Translates the node by the given [offset] in local coordinates.
   */
  public fun translate(offset: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to offset)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_TRANSLATE, NIL)
  }

  /**
   * Adds the [offset] vector to the node's global position.
   */
  public fun globalTranslate(offset: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to offset)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_GLOBAL_TRANSLATE, NIL)
  }

  /**
   * Multiplies the current scale by the [ratio] vector.
   */
  public fun applyScale(ratio: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to ratio)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_APPLY_SCALE, NIL)
  }

  /**
   * Rotates the node so it points towards the [point], which is expected to use global coordinates.
   */
  public fun lookAt(point: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to point)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_LOOK_AT, NIL)
  }

  /**
   * Returns the angle between the node and the [point] in radians.
   *
   * [godot.Illustration of the returned angle.](https://raw.githubusercontent.com/godotengine/godot-docs/master/img/node2d_get_angle_to.png)
   */
  public fun getAngleTo(point: Vector2): Double {
    TransferContext.writeArguments(VECTOR2 to point)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_GET_ANGLE_TO, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Transforms the provided global position into a position in local coordinate space. The output will be local relative to the [godot.Node2D] it is called on. e.g. It is appropriate for determining the positions of child nodes, but it is not appropriate for determining its own position relative to its parent.
   */
  public fun toLocal(globalPoint: Vector2): Vector2 {
    TransferContext.writeArguments(VECTOR2 to globalPoint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_TO_LOCAL, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Transforms the provided local position into a position in global coordinate space. The input is expected to be local relative to the [godot.Node2D] it is called on. e.g. Applying this method to the positions of child nodes will correctly transform their positions into the global coordinate space, but applying it to a node's own position will give an incorrect result, as it will incorporate the node's own transformation into its global position.
   */
  public fun toGlobal(localPoint: Vector2): Vector2 {
    TransferContext.writeArguments(VECTOR2 to localPoint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_TO_GLOBAL, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the [godot.core.Transform2D] relative to this node's parent.
   */
  public fun getRelativeTransformToParent(parent: Node): Transform2D {
    TransferContext.writeArguments(OBJECT to parent)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NODE2D_GET_RELATIVE_TRANSFORM_TO_PARENT, TRANSFORM2D)
    return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
  }

  public companion object
}
