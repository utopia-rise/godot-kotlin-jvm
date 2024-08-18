// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
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
 * This is the CSG base class that provides CSG operation support to the various CSG nodes in Godot.
 * **Note:** CSG nodes are intended to be used for level prototyping. Creating CSG nodes has a
 * significant CPU cost compared to creating a [MeshInstance3D] with a [PrimitiveMesh]. Moving a CSG
 * node within another CSG node also has a significant CPU cost, so it should be avoided during
 * gameplay.
 */
@GodotBaseType
public open class CSGShape3D internal constructor() : GeometryInstance3D() {
  /**
   * The operation that is performed on this shape. This is ignored for the first CSG child node as
   * the operation is between this node and the previous child of this nodes parent.
   */
  public var operation: Operation
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOperationPtr, LONG)
      return CSGShape3D.Operation.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setOperationPtr, NIL)
    }

  /**
   * Snap makes the mesh vertices snap to a given distance so that the faces of two meshes can be
   * perfectly aligned. A lower value results in greater precision but may be harder to adjust. The
   * top-level CSG shape's snap value is used for the entire CSG tree.
   */
  public var snap: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSnapPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSnapPtr, NIL)
    }

  /**
   * Calculate tangents for the CSG shape which allows the use of normal maps. This is only applied
   * on the root shape, this setting is ignored on any child.
   */
  public var calculateTangents: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCalculatingTangentsPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCalculateTangentsPtr, NIL)
    }

  /**
   * Adds a collision shape to the physics engine for our CSG shape. This will always act like a
   * static body. Note that the collision shape is still active even if the CSG shape itself is hidden.
   * See also [collisionMask] and [collisionPriority].
   */
  public var useCollision: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUsingCollisionPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseCollisionPtr, NIL)
    }

  /**
   * The physics layers this area is in.
   * Collidable objects can exist in any of 32 different layers. These layers work like a tagging
   * system, and are not visual. A collidable can use these layers to select with which objects it can
   * collide, using the collision_mask property.
   * A contact is detected if object A is in any of the layers that object B scans, or object B is
   * in any layer scanned by object A. See
   * [url=$DOCS_URL/tutorials/physics/physics_introduction.html#collision-layers-and-masks]Collision
   * layers and masks[/url] in the documentation for more information.
   */
  public var collisionLayer: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCollisionLayerPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCollisionLayerPtr, NIL)
    }

  /**
   * The physics layers this CSG shape scans for collisions. Only effective if [useCollision] is
   * `true`. See
   * [url=$DOCS_URL/tutorials/physics/physics_introduction.html#collision-layers-and-masks]Collision
   * layers and masks[/url] in the documentation for more information.
   */
  public var collisionMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCollisionMaskPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCollisionMaskPtr, NIL)
    }

  /**
   * The priority used to solve colliding when occurring penetration. Only effective if
   * [useCollision] is `true`. The higher the priority is, the lower the penetration into the object
   * will be. This can for example be used to prevent the player from breaking through the boundaries
   * of a level.
   */
  public var collisionPriority: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCollisionPriorityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setCollisionPriorityPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_CSGSHAPE3D, scriptIndex)
  }

  /**
   * Returns `true` if this is a root shape and is thus the object that is rendered.
   */
  public fun isRootShape(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isRootShapePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [collisionMask], given a
   * [layerNumber] between 1 and 32.
   */
  public fun setCollisionMaskValue(layerNumber: Int, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setCollisionMaskValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [collisionMask] is enabled, given a
   * [layerNumber] between 1 and 32.
   */
  public fun getCollisionMaskValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCollisionMaskValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [collisionLayer], given a
   * [layerNumber] between 1 and 32.
   */
  public fun setCollisionLayerValue(layerNumber: Int, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setCollisionLayerValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [collisionLayer] is enabled, given a
   * [layerNumber] between 1 and 32.
   */
  public fun getCollisionLayerValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCollisionLayerValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns an [Array] with two elements, the first is the [Transform3D] of this node and the
   * second is the root [Mesh] of this node. Only works when this node is the root shape.
   */
  public fun getMeshes(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMeshesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  public enum class Operation(
    id: Long,
  ) {
    /**
     * Geometry of both primitives is merged, intersecting geometry is removed.
     */
    OPERATION_UNION(0),
    /**
     * Only intersecting geometry remains, the rest is removed.
     */
    OPERATION_INTERSECTION(1),
    /**
     * The second shape is subtracted from the first, leaving a dent with its shape.
     */
    OPERATION_SUBTRACTION(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val isRootShapePtr: VoidPtr = TypeManager.getMethodBindPtr("CSGShape3D", "is_root_shape")

    public val setOperationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGShape3D", "set_operation")

    public val getOperationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGShape3D", "get_operation")

    public val setSnapPtr: VoidPtr = TypeManager.getMethodBindPtr("CSGShape3D", "set_snap")

    public val getSnapPtr: VoidPtr = TypeManager.getMethodBindPtr("CSGShape3D", "get_snap")

    public val setUseCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGShape3D", "set_use_collision")

    public val isUsingCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGShape3D", "is_using_collision")

    public val setCollisionLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGShape3D", "set_collision_layer")

    public val getCollisionLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGShape3D", "get_collision_layer")

    public val setCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGShape3D", "set_collision_mask")

    public val getCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGShape3D", "get_collision_mask")

    public val setCollisionMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGShape3D", "set_collision_mask_value")

    public val getCollisionMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGShape3D", "get_collision_mask_value")

    public val setCollisionLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGShape3D", "set_collision_layer_value")

    public val getCollisionLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGShape3D", "get_collision_layer_value")

    public val setCollisionPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGShape3D", "set_collision_priority")

    public val getCollisionPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGShape3D", "get_collision_priority")

    public val setCalculateTangentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGShape3D", "set_calculate_tangents")

    public val isCalculatingTangentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGShape3D", "is_calculating_tangents")

    public val getMeshesPtr: VoidPtr = TypeManager.getMethodBindPtr("CSGShape3D", "get_meshes")
  }
}
