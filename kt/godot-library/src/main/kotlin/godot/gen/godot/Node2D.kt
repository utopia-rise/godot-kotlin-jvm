// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Transform2D
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

/**
 * A 2D game object, with a transform (position, rotation, and scale). All 2D nodes, including
 * physics objects and sprites, inherit from Node2D. Use Node2D as a parent node to move, scale and
 * rotate children in a 2D project. Also gives control of the node's render order.
 */
@GodotBaseType
public open class Node2D : CanvasItem() {
  /**
   * Position, relative to the node's parent.
   */
  @CoreTypeLocalCopy
  public var position: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPositionPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPositionPtr, NIL)
    }

  /**
   * Rotation in radians, relative to the node's parent.
   * **Note:** This property is edited in the inspector in degrees. If you want to use degrees in a
   * script, use [rotationDegrees].
   */
  public var rotation: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRotationPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRotationPtr, NIL)
    }

  /**
   * Helper property to access [rotation] in degrees instead of radians.
   */
  public var rotationDegrees: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRotationDegreesPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRotationDegreesPtr, NIL)
    }

  /**
   * The node's scale. Unscaled value: `(1, 1)`.
   * **Note:** Negative X scales in 2D are not decomposable from the transformation matrix. Due to
   * the way scale is represented with transformation matrices in Godot, negative scales on the X axis
   * will be changed to negative scales on the Y axis and a rotation of 180 degrees when decomposed.
   */
  @CoreTypeLocalCopy
  public var scale: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getScalePtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setScalePtr, NIL)
    }

  /**
   * Slants the node.
   * **Note:** Skew is X axis only.
   */
  public var skew: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSkewPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSkewPtr, NIL)
    }

  /**
   * Local [Transform2D].
   */
  @CoreTypeLocalCopy
  public var transform: Transform2D
    @JvmName("getTransform_prop")
    get() = super.getTransform()
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM2D to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTransformPtr, NIL)
    }

  /**
   * Global position.
   */
  @CoreTypeLocalCopy
  public var globalPosition: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGlobalPositionPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGlobalPositionPtr, NIL)
    }

  /**
   * Global rotation in radians.
   */
  public var globalRotation: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGlobalRotationPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setGlobalRotationPtr, NIL)
    }

  /**
   * Helper property to access [globalRotation] in degrees instead of radians.
   */
  public var globalRotationDegrees: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGlobalRotationDegreesPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setGlobalRotationDegreesPtr, NIL)
    }

  /**
   * Global scale.
   */
  @CoreTypeLocalCopy
  public var globalScale: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGlobalScalePtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGlobalScalePtr, NIL)
    }

  /**
   * Global skew in radians.
   */
  public var globalSkew: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGlobalSkewPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setGlobalSkewPtr, NIL)
    }

  /**
   * Global [Transform2D].
   */
  @CoreTypeLocalCopy
  public var globalTransform: Transform2D
    @JvmName("getGlobalTransform_prop")
    get() = super.getGlobalTransform()
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM2D to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGlobalTransformPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_NODE2D, scriptIndex)
  }

  /**
   * Position, relative to the node's parent.
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
   * val myCoreType = node2d.position
   * //Your changes
   * node2d.position = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun positionMutate(block: Vector2.() -> Unit): Vector2 = position.apply{
      block(this)
      position = this
  }


  /**
   * The node's scale. Unscaled value: `(1, 1)`.
   * **Note:** Negative X scales in 2D are not decomposable from the transformation matrix. Due to
   * the way scale is represented with transformation matrices in Godot, negative scales on the X axis
   * will be changed to negative scales on the Y axis and a rotation of 180 degrees when decomposed.
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
   * val myCoreType = node2d.scale
   * //Your changes
   * node2d.scale = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun scaleMutate(block: Vector2.() -> Unit): Vector2 = scale.apply{
      block(this)
      scale = this
  }


  /**
   * Local [Transform2D].
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
   * val myCoreType = node2d.transform
   * //Your changes
   * node2d.transform = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun transformMutate(block: Transform2D.() -> Unit): Transform2D = transform.apply{
      block(this)
      transform = this
  }


  /**
   * Global position.
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
   * val myCoreType = node2d.globalPosition
   * //Your changes
   * node2d.globalPosition = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun globalPositionMutate(block: Vector2.() -> Unit): Vector2 = globalPosition.apply{
      block(this)
      globalPosition = this
  }


  /**
   * Global scale.
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
   * val myCoreType = node2d.globalScale
   * //Your changes
   * node2d.globalScale = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun globalScaleMutate(block: Vector2.() -> Unit): Vector2 = globalScale.apply{
      block(this)
      globalScale = this
  }


  /**
   * Global [Transform2D].
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
   * val myCoreType = node2d.globalTransform
   * //Your changes
   * node2d.globalTransform = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun globalTransformMutate(block: Transform2D.() -> Unit): Transform2D =
      globalTransform.apply{
      block(this)
      globalTransform = this
  }


  /**
   * Applies a rotation to the node, in radians, starting from its current rotation.
   */
  public fun rotate(radians: Float): Unit {
    TransferContext.writeArguments(DOUBLE to radians.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.rotatePtr, NIL)
  }

  /**
   * Applies a local translation on the node's X axis based on the [Node.Process]'s [delta]. If
   * [scaled] is `false`, normalizes the movement.
   */
  @JvmOverloads
  public fun moveLocalX(delta: Float, scaled: Boolean = false): Unit {
    TransferContext.writeArguments(DOUBLE to delta.toDouble(), BOOL to scaled)
    TransferContext.callMethod(rawPtr, MethodBindings.moveLocalXPtr, NIL)
  }

  /**
   * Applies a local translation on the node's Y axis based on the [Node.Process]'s [delta]. If
   * [scaled] is `false`, normalizes the movement.
   */
  @JvmOverloads
  public fun moveLocalY(delta: Float, scaled: Boolean = false): Unit {
    TransferContext.writeArguments(DOUBLE to delta.toDouble(), BOOL to scaled)
    TransferContext.callMethod(rawPtr, MethodBindings.moveLocalYPtr, NIL)
  }

  /**
   * Translates the node by the given [offset] in local coordinates.
   */
  public fun translate(offset: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to offset)
    TransferContext.callMethod(rawPtr, MethodBindings.translatePtr, NIL)
  }

  /**
   * Adds the [offset] vector to the node's global position.
   */
  public fun globalTranslate(offset: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to offset)
    TransferContext.callMethod(rawPtr, MethodBindings.globalTranslatePtr, NIL)
  }

  /**
   * Multiplies the current scale by the [ratio] vector.
   */
  public fun applyScale(ratio: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to ratio)
    TransferContext.callMethod(rawPtr, MethodBindings.applyScalePtr, NIL)
  }

  /**
   * Rotates the node so that its local +X axis points towards the [point], which is expected to use
   * global coordinates.
   * [point] should not be the same as the node's position, otherwise the node always looks to the
   * right.
   */
  public fun lookAt(point: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to point)
    TransferContext.callMethod(rawPtr, MethodBindings.lookAtPtr, NIL)
  }

  /**
   * Returns the angle between the node and the [point] in radians.
   * [url=https://raw.githubusercontent.com/godotengine/godot-docs/master/img/node2d_get_angle_to.png]Illustration
   * of the returned angle.[/url]
   */
  public fun getAngleTo(point: Vector2): Float {
    TransferContext.writeArguments(VECTOR2 to point)
    TransferContext.callMethod(rawPtr, MethodBindings.getAngleToPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Transforms the provided global position into a position in local coordinate space. The output
   * will be local relative to the [Node2D] it is called on. e.g. It is appropriate for determining the
   * positions of child nodes, but it is not appropriate for determining its own position relative to
   * its parent.
   */
  public fun toLocal(globalPoint: Vector2): Vector2 {
    TransferContext.writeArguments(VECTOR2 to globalPoint)
    TransferContext.callMethod(rawPtr, MethodBindings.toLocalPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Transforms the provided local position into a position in global coordinate space. The input is
   * expected to be local relative to the [Node2D] it is called on. e.g. Applying this method to the
   * positions of child nodes will correctly transform their positions into the global coordinate
   * space, but applying it to a node's own position will give an incorrect result, as it will
   * incorporate the node's own transformation into its global position.
   */
  public fun toGlobal(localPoint: Vector2): Vector2 {
    TransferContext.writeArguments(VECTOR2 to localPoint)
    TransferContext.callMethod(rawPtr, MethodBindings.toGlobalPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns the [Transform2D] relative to this node's parent.
   */
  public fun getRelativeTransformToParent(parent: Node): Transform2D {
    TransferContext.writeArguments(OBJECT to parent)
    TransferContext.callMethod(rawPtr, MethodBindings.getRelativeTransformToParentPtr, TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
  }

  public companion object

  internal object MethodBindings {
    public val setPositionPtr: VoidPtr = TypeManager.getMethodBindPtr("Node2D", "set_position")

    public val setRotationPtr: VoidPtr = TypeManager.getMethodBindPtr("Node2D", "set_rotation")

    public val setRotationDegreesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "set_rotation_degrees")

    public val setSkewPtr: VoidPtr = TypeManager.getMethodBindPtr("Node2D", "set_skew")

    public val setScalePtr: VoidPtr = TypeManager.getMethodBindPtr("Node2D", "set_scale")

    public val getPositionPtr: VoidPtr = TypeManager.getMethodBindPtr("Node2D", "get_position")

    public val getRotationPtr: VoidPtr = TypeManager.getMethodBindPtr("Node2D", "get_rotation")

    public val getRotationDegreesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "get_rotation_degrees")

    public val getSkewPtr: VoidPtr = TypeManager.getMethodBindPtr("Node2D", "get_skew")

    public val getScalePtr: VoidPtr = TypeManager.getMethodBindPtr("Node2D", "get_scale")

    public val rotatePtr: VoidPtr = TypeManager.getMethodBindPtr("Node2D", "rotate")

    public val moveLocalXPtr: VoidPtr = TypeManager.getMethodBindPtr("Node2D", "move_local_x")

    public val moveLocalYPtr: VoidPtr = TypeManager.getMethodBindPtr("Node2D", "move_local_y")

    public val translatePtr: VoidPtr = TypeManager.getMethodBindPtr("Node2D", "translate")

    public val globalTranslatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "global_translate")

    public val applyScalePtr: VoidPtr = TypeManager.getMethodBindPtr("Node2D", "apply_scale")

    public val setGlobalPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "set_global_position")

    public val getGlobalPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "get_global_position")

    public val setGlobalRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "set_global_rotation")

    public val setGlobalRotationDegreesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "set_global_rotation_degrees")

    public val getGlobalRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "get_global_rotation")

    public val getGlobalRotationDegreesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "get_global_rotation_degrees")

    public val setGlobalSkewPtr: VoidPtr = TypeManager.getMethodBindPtr("Node2D", "set_global_skew")

    public val getGlobalSkewPtr: VoidPtr = TypeManager.getMethodBindPtr("Node2D", "get_global_skew")

    public val setGlobalScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "set_global_scale")

    public val getGlobalScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "get_global_scale")

    public val setTransformPtr: VoidPtr = TypeManager.getMethodBindPtr("Node2D", "set_transform")

    public val setGlobalTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "set_global_transform")

    public val lookAtPtr: VoidPtr = TypeManager.getMethodBindPtr("Node2D", "look_at")

    public val getAngleToPtr: VoidPtr = TypeManager.getMethodBindPtr("Node2D", "get_angle_to")

    public val toLocalPtr: VoidPtr = TypeManager.getMethodBindPtr("Node2D", "to_local")

    public val toGlobalPtr: VoidPtr = TypeManager.getMethodBindPtr("Node2D", "to_global")

    public val getRelativeTransformToParentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "get_relative_transform_to_parent")
  }
}
