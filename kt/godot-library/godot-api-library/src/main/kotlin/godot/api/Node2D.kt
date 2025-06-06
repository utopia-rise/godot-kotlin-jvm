// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Transform2D
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.TRANSFORM2D
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
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
 *
 * **Note:** Since both [Node2D] and [Control] inherit from [CanvasItem], they share several
 * concepts from the class such as the [CanvasItem.zIndex] and [CanvasItem.visible] properties.
 */
@GodotBaseType
public open class Node2D : CanvasItem() {
  /**
   * Position, relative to the node's parent. See also [globalPosition].
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
  public final inline var position: Vector2
    @JvmName("positionProperty")
    get() = getPosition()
    @JvmName("positionProperty")
    set(`value`) {
      setPosition(value)
    }

  /**
   * Rotation in radians, relative to the node's parent. See also [globalRotation].
   *
   * **Note:** This property is edited in the inspector in degrees. If you want to use degrees in a
   * script, use [rotationDegrees].
   */
  public final inline var rotation: Float
    @JvmName("rotationProperty")
    get() = getRotation()
    @JvmName("rotationProperty")
    set(`value`) {
      setRotation(value)
    }

  /**
   * Helper property to access [rotation] in degrees instead of radians. See also
   * [globalRotationDegrees].
   */
  public final inline var rotationDegrees: Float
    @JvmName("rotationDegreesProperty")
    get() = getRotationDegrees()
    @JvmName("rotationDegreesProperty")
    set(`value`) {
      setRotationDegrees(value)
    }

  /**
   * The node's scale, relative to the node's parent. Unscaled value: `(1, 1)`. See also
   * [globalScale].
   *
   * **Note:** Negative X scales in 2D are not decomposable from the transformation matrix. Due to
   * the way scale is represented with transformation matrices in Godot, negative scales on the X axis
   * will be changed to negative scales on the Y axis and a rotation of 180 degrees when decomposed.
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
  public final inline var scale: Vector2
    @JvmName("scaleProperty")
    get() = getScale()
    @JvmName("scaleProperty")
    set(`value`) {
      setScale(value)
    }

  /**
   * If set to a non-zero value, slants the node in one direction or another. This can be used for
   * pseudo-3D effects. See also [globalSkew].
   *
   * **Note:** Skew is performed on the X axis only, and *between* rotation and scaling.
   *
   * **Note:** This property is edited in the inspector in degrees. If you want to use degrees in a
   * script, use `skew = deg_to_rad(value_in_degrees)`.
   */
  public final inline var skew: Float
    @JvmName("skewProperty")
    get() = getSkew()
    @JvmName("skewProperty")
    set(`value`) {
      setSkew(value)
    }

  /**
   * The node's [Transform2D], relative to the node's parent. See also [globalTransform].
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
  public final inline var transform: Transform2D
    @JvmName("transformProperty")
    get() = getTransform()
    @JvmName("transformProperty")
    set(`value`) {
      setTransform(value)
    }

  /**
   * Global position. See also [position].
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
  public final inline var globalPosition: Vector2
    @JvmName("globalPositionProperty")
    get() = getGlobalPosition()
    @JvmName("globalPositionProperty")
    set(`value`) {
      setGlobalPosition(value)
    }

  /**
   * Global rotation in radians. See also [rotation].
   */
  public final inline var globalRotation: Float
    @JvmName("globalRotationProperty")
    get() = getGlobalRotation()
    @JvmName("globalRotationProperty")
    set(`value`) {
      setGlobalRotation(value)
    }

  /**
   * Helper property to access [globalRotation] in degrees instead of radians. See also
   * [rotationDegrees].
   */
  public final inline var globalRotationDegrees: Float
    @JvmName("globalRotationDegreesProperty")
    get() = getGlobalRotationDegrees()
    @JvmName("globalRotationDegreesProperty")
    set(`value`) {
      setGlobalRotationDegrees(value)
    }

  /**
   * Global scale. See also [scale].
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
  public final inline var globalScale: Vector2
    @JvmName("globalScaleProperty")
    get() = getGlobalScale()
    @JvmName("globalScaleProperty")
    set(`value`) {
      setGlobalScale(value)
    }

  /**
   * Global skew in radians. See also [skew].
   */
  public final inline var globalSkew: Float
    @JvmName("globalSkewProperty")
    get() = getGlobalSkew()
    @JvmName("globalSkewProperty")
    set(`value`) {
      setGlobalSkew(value)
    }

  /**
   * Global [Transform2D]. See also [transform].
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
  public final inline var globalTransform: Transform2D
    @JvmName("globalTransformProperty")
    get() = getGlobalTransform()
    @JvmName("globalTransformProperty")
    set(`value`) {
      setGlobalTransform(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(395, scriptIndex)
  }

  /**
   * This is a helper function for [position] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = node2d.position
   * //Your changes
   * node2d.position = myCoreType
   * ``````
   *
   * Position, relative to the node's parent. See also [globalPosition].
   */
  @CoreTypeHelper
  public final fun positionMutate(block: Vector2.() -> Unit): Vector2 = position.apply {
     block(this)
     position = this
  }

  /**
   * This is a helper function for [scale] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = node2d.scale
   * //Your changes
   * node2d.scale = myCoreType
   * ``````
   *
   * The node's scale, relative to the node's parent. Unscaled value: `(1, 1)`. See also
   * [globalScale].
   *
   * **Note:** Negative X scales in 2D are not decomposable from the transformation matrix. Due to
   * the way scale is represented with transformation matrices in Godot, negative scales on the X axis
   * will be changed to negative scales on the Y axis and a rotation of 180 degrees when decomposed.
   */
  @CoreTypeHelper
  public final fun scaleMutate(block: Vector2.() -> Unit): Vector2 = scale.apply {
     block(this)
     scale = this
  }

  /**
   * This is a helper function for [transform] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = node2d.transform
   * //Your changes
   * node2d.transform = myCoreType
   * ``````
   *
   * The node's [Transform2D], relative to the node's parent. See also [globalTransform].
   */
  @CoreTypeHelper
  public final fun transformMutate(block: Transform2D.() -> Unit): Transform2D = transform.apply {
     block(this)
     transform = this
  }

  /**
   * This is a helper function for [globalPosition] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = node2d.globalPosition
   * //Your changes
   * node2d.globalPosition = myCoreType
   * ``````
   *
   * Global position. See also [position].
   */
  @CoreTypeHelper
  public final fun globalPositionMutate(block: Vector2.() -> Unit): Vector2 = globalPosition.apply {
     block(this)
     globalPosition = this
  }

  /**
   * This is a helper function for [globalScale] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = node2d.globalScale
   * //Your changes
   * node2d.globalScale = myCoreType
   * ``````
   *
   * Global scale. See also [scale].
   */
  @CoreTypeHelper
  public final fun globalScaleMutate(block: Vector2.() -> Unit): Vector2 = globalScale.apply {
     block(this)
     globalScale = this
  }

  /**
   * This is a helper function for [globalTransform] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = node2d.globalTransform
   * //Your changes
   * node2d.globalTransform = myCoreType
   * ``````
   *
   * Global [Transform2D]. See also [transform].
   */
  @CoreTypeHelper
  public final fun globalTransformMutate(block: Transform2D.() -> Unit): Transform2D =
      globalTransform.apply {
     block(this)
     globalTransform = this
  }

  public final fun setPosition(position: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(ptr, MethodBindings.setPositionPtr, NIL)
  }

  public final fun setRotation(radians: Float): Unit {
    TransferContext.writeArguments(DOUBLE to radians.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setRotationPtr, NIL)
  }

  public final fun setRotationDegrees(degrees: Float): Unit {
    TransferContext.writeArguments(DOUBLE to degrees.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setRotationDegreesPtr, NIL)
  }

  public final fun setSkew(radians: Float): Unit {
    TransferContext.writeArguments(DOUBLE to radians.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSkewPtr, NIL)
  }

  public final fun setScale(scale: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to scale)
    TransferContext.callMethod(ptr, MethodBindings.setScalePtr, NIL)
  }

  public final fun getPosition(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun getRotation(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRotationPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun getRotationDegrees(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRotationDegreesPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun getSkew(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSkewPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun getScale(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getScalePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Applies a rotation to the node, in radians, starting from its current rotation.
   */
  public final fun rotate(radians: Float): Unit {
    TransferContext.writeArguments(DOUBLE to radians.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.rotatePtr, NIL)
  }

  /**
   * Applies a local translation on the node's X axis based on the [Node.Process]'s [delta]. If
   * [scaled] is `false`, normalizes the movement.
   */
  @JvmOverloads
  public final fun moveLocalX(delta: Float, scaled: Boolean = false): Unit {
    TransferContext.writeArguments(DOUBLE to delta.toDouble(), BOOL to scaled)
    TransferContext.callMethod(ptr, MethodBindings.moveLocalXPtr, NIL)
  }

  /**
   * Applies a local translation on the node's Y axis based on the [Node.Process]'s [delta]. If
   * [scaled] is `false`, normalizes the movement.
   */
  @JvmOverloads
  public final fun moveLocalY(delta: Float, scaled: Boolean = false): Unit {
    TransferContext.writeArguments(DOUBLE to delta.toDouble(), BOOL to scaled)
    TransferContext.callMethod(ptr, MethodBindings.moveLocalYPtr, NIL)
  }

  /**
   * Translates the node by the given [offset] in local coordinates.
   */
  public final fun translate(offset: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to offset)
    TransferContext.callMethod(ptr, MethodBindings.translatePtr, NIL)
  }

  /**
   * Adds the [offset] vector to the node's global position.
   */
  public final fun globalTranslate(offset: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to offset)
    TransferContext.callMethod(ptr, MethodBindings.globalTranslatePtr, NIL)
  }

  /**
   * Multiplies the current scale by the [ratio] vector.
   */
  public final fun applyScale(ratio: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to ratio)
    TransferContext.callMethod(ptr, MethodBindings.applyScalePtr, NIL)
  }

  public final fun setGlobalPosition(position: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(ptr, MethodBindings.setGlobalPositionPtr, NIL)
  }

  public final fun getGlobalPosition(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGlobalPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setGlobalRotation(radians: Float): Unit {
    TransferContext.writeArguments(DOUBLE to radians.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setGlobalRotationPtr, NIL)
  }

  public final fun setGlobalRotationDegrees(degrees: Float): Unit {
    TransferContext.writeArguments(DOUBLE to degrees.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setGlobalRotationDegreesPtr, NIL)
  }

  public final fun getGlobalRotation(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGlobalRotationPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun getGlobalRotationDegrees(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGlobalRotationDegreesPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setGlobalSkew(radians: Float): Unit {
    TransferContext.writeArguments(DOUBLE to radians.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setGlobalSkewPtr, NIL)
  }

  public final fun getGlobalSkew(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGlobalSkewPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setGlobalScale(scale: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to scale)
    TransferContext.callMethod(ptr, MethodBindings.setGlobalScalePtr, NIL)
  }

  public final fun getGlobalScale(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGlobalScalePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setTransform(xform: Transform2D): Unit {
    TransferContext.writeArguments(TRANSFORM2D to xform)
    TransferContext.callMethod(ptr, MethodBindings.setTransformPtr, NIL)
  }

  public final fun setGlobalTransform(xform: Transform2D): Unit {
    TransferContext.writeArguments(TRANSFORM2D to xform)
    TransferContext.callMethod(ptr, MethodBindings.setGlobalTransformPtr, NIL)
  }

  /**
   * Rotates the node so that its local +X axis points towards the [point], which is expected to use
   * global coordinates.
   *
   * [point] should not be the same as the node's position, otherwise the node always looks to the
   * right.
   */
  public final fun lookAt(point: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to point)
    TransferContext.callMethod(ptr, MethodBindings.lookAtPtr, NIL)
  }

  /**
   * Returns the angle between the node and the [point] in radians.
   *
   * [url=https://raw.githubusercontent.com/godotengine/godot-docs/master/img/node2d_get_angle_to.png]Illustration
   * of the returned angle.[/url]
   */
  public final fun getAngleTo(point: Vector2): Float {
    TransferContext.writeArguments(VECTOR2 to point)
    TransferContext.callMethod(ptr, MethodBindings.getAngleToPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Transforms the provided global position into a position in local coordinate space. The output
   * will be local relative to the [Node2D] it is called on. e.g. It is appropriate for determining the
   * positions of child nodes, but it is not appropriate for determining its own position relative to
   * its parent.
   */
  public final fun toLocal(globalPoint: Vector2): Vector2 {
    TransferContext.writeArguments(VECTOR2 to globalPoint)
    TransferContext.callMethod(ptr, MethodBindings.toLocalPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Transforms the provided local position into a position in global coordinate space. The input is
   * expected to be local relative to the [Node2D] it is called on. e.g. Applying this method to the
   * positions of child nodes will correctly transform their positions into the global coordinate
   * space, but applying it to a node's own position will give an incorrect result, as it will
   * incorporate the node's own transformation into its global position.
   */
  public final fun toGlobal(localPoint: Vector2): Vector2 {
    TransferContext.writeArguments(VECTOR2 to localPoint)
    TransferContext.callMethod(ptr, MethodBindings.toGlobalPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns the [Transform2D] relative to this node's parent.
   */
  public final fun getRelativeTransformToParent(parent: Node?): Transform2D {
    TransferContext.writeArguments(OBJECT to parent)
    TransferContext.callMethod(ptr, MethodBindings.getRelativeTransformToParentPtr, TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D) as Transform2D)
  }

  public companion object

  public object MethodBindings {
    internal val setPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "set_position", 743155724)

    internal val setRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "set_rotation", 373806689)

    internal val setRotationDegreesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "set_rotation_degrees", 373806689)

    internal val setSkewPtr: VoidPtr = TypeManager.getMethodBindPtr("Node2D", "set_skew", 373806689)

    internal val setScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "set_scale", 743155724)

    internal val getPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "get_position", 3341600327)

    internal val getRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "get_rotation", 1740695150)

    internal val getRotationDegreesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "get_rotation_degrees", 1740695150)

    internal val getSkewPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "get_skew", 1740695150)

    internal val getScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "get_scale", 3341600327)

    internal val rotatePtr: VoidPtr = TypeManager.getMethodBindPtr("Node2D", "rotate", 373806689)

    internal val moveLocalXPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "move_local_x", 2087892650)

    internal val moveLocalYPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "move_local_y", 2087892650)

    internal val translatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "translate", 743155724)

    internal val globalTranslatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "global_translate", 743155724)

    internal val applyScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "apply_scale", 743155724)

    internal val setGlobalPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "set_global_position", 743155724)

    internal val getGlobalPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "get_global_position", 3341600327)

    internal val setGlobalRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "set_global_rotation", 373806689)

    internal val setGlobalRotationDegreesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "set_global_rotation_degrees", 373806689)

    internal val getGlobalRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "get_global_rotation", 1740695150)

    internal val getGlobalRotationDegreesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "get_global_rotation_degrees", 1740695150)

    internal val setGlobalSkewPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "set_global_skew", 373806689)

    internal val getGlobalSkewPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "get_global_skew", 1740695150)

    internal val setGlobalScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "set_global_scale", 743155724)

    internal val getGlobalScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "get_global_scale", 3341600327)

    internal val setTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "set_transform", 2761652528)

    internal val setGlobalTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "set_global_transform", 2761652528)

    internal val lookAtPtr: VoidPtr = TypeManager.getMethodBindPtr("Node2D", "look_at", 743155724)

    internal val getAngleToPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "get_angle_to", 2276447920)

    internal val toLocalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "to_local", 2656412154)

    internal val toGlobalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "to_global", 2656412154)

    internal val getRelativeTransformToParentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Node2D", "get_relative_transform_to_parent", 904556875)
  }
}
