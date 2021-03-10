// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
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

/**
 * A 2D game object, inherited by all 2D-related nodes. Has a position, rotation, scale, and Z index.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/2d/custom_drawing_in_2d.html](https://docs.godotengine.org/en/latest/tutorials/2d/custom_drawing_in_2d.html)
 *
 * A 2D game object, with a transform (position, rotation, and scale). All 2D nodes, including physics objects and sprites, inherit from Node2D. Use Node2D as a parent node to move, scale and rotate children in a 2D project. Also gives control of the node's render order.
 */
@GodotBaseType
open class Node2D : CanvasItem() {
  /**
   * Global position.
   */
  open var globalPosition: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_GET_GLOBAL_POSITION,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_SET_GLOBAL_POSITION, NIL)
    }

  /**
   * Global rotation in radians.
   */
  open var globalRotation: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_GET_GLOBAL_ROTATION,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_SET_GLOBAL_ROTATION, NIL)
    }

  /**
   * Global rotation in degrees.
   */
  open var globalRotationDegrees: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NODE2D_GET_GLOBAL_ROTATION_DEGREES, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NODE2D_SET_GLOBAL_ROTATION_DEGREES, NIL)
    }

  /**
   * Global scale.
   */
  open var globalScale: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_GET_GLOBAL_SCALE, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_SET_GLOBAL_SCALE, NIL)
    }

  /**
   * Global [godot.core.Transform2D].
   */
  open var globalTransform: Transform2D
    get() = super.getCanvasItemGlobalTransform()
    set(value) {
      TransferContext.writeArguments(TRANSFORM2D to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_SET_GLOBAL_TRANSFORM, NIL)
    }

  /**
   * Position, relative to the node's parent.
   */
  open var position: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_GET_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_SET_POSITION, NIL)
    }

  /**
   * Rotation in radians, relative to the node's parent.
   */
  open var rotation: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_GET_ROTATION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_SET_ROTATION, NIL)
    }

  /**
   * Rotation in degrees, relative to the node's parent.
   */
  open var rotationDegrees: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_GET_ROTATION_DEGREES,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_SET_ROTATION_DEGREES, NIL)
    }

  /**
   * The node's scale. Unscaled value: `(1, 1)`.
   */
  open var scale: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_GET_SCALE, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_SET_SCALE, NIL)
    }

  open var skew: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_GET_SKEW, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_SET_SKEW, NIL)
    }

  open var skewDegrees: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_GET_SKEW_DEGREES, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_SET_SKEW_DEGREES, NIL)
    }

  /**
   * Local [godot.core.Transform2D].
   */
  open var transform: Transform2D
    get() = super.getCanvasItemTransform()
    set(value) {
      TransferContext.writeArguments(TRANSFORM2D to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_SET_TRANSFORM, NIL)
    }

  /**
   * If `true`, the node's Z index is relative to its parent's Z index. If this node's Z index is 2 and its parent's effective Z index is 3, then this node's effective Z index will be 2 + 3 = 5.
   */
  open var zAsRelative: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_GET_Z_AS_RELATIVE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_SET_Z_AS_RELATIVE, NIL)
    }

  /**
   * Z index. Controls the order in which the nodes render. A node with a higher Z index will display in front of others.
   */
  open var zIndex: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_GET_Z_INDEX, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_SET_Z_INDEX, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_NODE2D)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }

  open fun globalPosition(schedule: Vector2.() -> Unit): Vector2 = globalPosition.apply{
      schedule(this)
      globalPosition = this
  }


  open fun globalScale(schedule: Vector2.() -> Unit): Vector2 = globalScale.apply{
      schedule(this)
      globalScale = this
  }


  open fun globalTransform(schedule: Transform2D.() -> Unit): Transform2D = globalTransform.apply{
      schedule(this)
      globalTransform = this
  }


  open fun position(schedule: Vector2.() -> Unit): Vector2 = position.apply{
      schedule(this)
      position = this
  }


  open fun scale(schedule: Vector2.() -> Unit): Vector2 = scale.apply{
      schedule(this)
      scale = this
  }


  open fun transform(schedule: Transform2D.() -> Unit): Transform2D = transform.apply{
      schedule(this)
      transform = this
  }


  /**
   * Multiplies the current scale by the `ratio` vector.
   */
  open fun applyScale(ratio: Vector2) {
    TransferContext.writeArguments(VECTOR2 to ratio)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_APPLY_SCALE, NIL)
  }

  /**
   * Returns the angle between the node and the `point` in radians.
   */
  open fun getAngleTo(point: Vector2): Double {
    TransferContext.writeArguments(VECTOR2 to point)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_GET_ANGLE_TO, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the [godot.core.Transform2D] relative to this node's parent.
   */
  open fun getRelativeTransformToParent(parent: Node): Transform2D {
    TransferContext.writeArguments(OBJECT to parent)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NODE2D_GET_RELATIVE_TRANSFORM_TO_PARENT, TRANSFORM2D)
    return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
  }

  /**
   * Adds the `offset` vector to the node's global position.
   */
  open fun globalTranslate(offset: Vector2) {
    TransferContext.writeArguments(VECTOR2 to offset)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_GLOBAL_TRANSLATE, NIL)
  }

  /**
   * Rotates the node so it points towards the `point`, which is expected to use global coordinates.
   */
  open fun lookAt(point: Vector2) {
    TransferContext.writeArguments(VECTOR2 to point)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_LOOK_AT, NIL)
  }

  /**
   * Applies a local translation on the node's X axis based on the [godot.Node.Process]'s `delta`. If `scaled` is `false`, normalizes the movement.
   */
  open fun moveLocalX(delta: Double, scaled: Boolean = false) {
    TransferContext.writeArguments(DOUBLE to delta, BOOL to scaled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_MOVE_LOCAL_X, NIL)
  }

  /**
   * Applies a local translation on the node's Y axis based on the [godot.Node.Process]'s `delta`. If `scaled` is `false`, normalizes the movement.
   */
  open fun moveLocalY(delta: Double, scaled: Boolean = false) {
    TransferContext.writeArguments(DOUBLE to delta, BOOL to scaled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_MOVE_LOCAL_Y, NIL)
  }

  /**
   * Applies a rotation to the node, in radians, starting from its current rotation.
   */
  open fun rotate(radians: Double) {
    TransferContext.writeArguments(DOUBLE to radians)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_ROTATE, NIL)
  }

  /**
   * Transforms the provided local position into a position in global coordinate space. The input is expected to be local relative to the [godot.Node2D] it is called on. e.g. Applying this method to the positions of child nodes will correctly transform their positions into the global coordinate space, but applying it to a node's own position will give an incorrect result, as it will incorporate the node's own transformation into its global position.
   */
  open fun toGlobal(localPoint: Vector2): Vector2 {
    TransferContext.writeArguments(VECTOR2 to localPoint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_TO_GLOBAL, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Transforms the provided global position into a position in local coordinate space. The output will be local relative to the [godot.Node2D] it is called on. e.g. It is appropriate for determining the positions of child nodes, but it is not appropriate for determining its own position relative to its parent.
   */
  open fun toLocal(globalPoint: Vector2): Vector2 {
    TransferContext.writeArguments(VECTOR2 to globalPoint)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_TO_LOCAL, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Translates the node by the given `offset` in local coordinates.
   */
  open fun translate(offset: Vector2) {
    TransferContext.writeArguments(VECTOR2 to offset)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NODE2D_TRANSLATE, NIL)
  }
}
