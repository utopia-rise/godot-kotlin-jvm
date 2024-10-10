// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_CSGSHAPE3D_INDEX: Int = 157

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
  public final inline var operation: Operation
    @JvmName("operationProperty")
    get() = getOperation()
    @JvmName("operationProperty")
    set(`value`) {
      setOperation(value)
    }

  /**
   * Snap makes the mesh vertices snap to a given distance so that the faces of two meshes can be
   * perfectly aligned. A lower value results in greater precision but may be harder to adjust. The
   * top-level CSG shape's snap value is used for the entire CSG tree.
   */
  public final inline var snap: Float
    @JvmName("snapProperty")
    get() = getSnap()
    @JvmName("snapProperty")
    set(`value`) {
      setSnap(value)
    }

  /**
   * Calculate tangents for the CSG shape which allows the use of normal maps. This is only applied
   * on the root shape, this setting is ignored on any child.
   */
  public final inline var calculateTangents: Boolean
    @JvmName("calculateTangentsProperty")
    get() = isCalculatingTangents()
    @JvmName("calculateTangentsProperty")
    set(`value`) {
      setCalculateTangents(value)
    }

  /**
   * Adds a collision shape to the physics engine for our CSG shape. This will always act like a
   * static body. Note that the collision shape is still active even if the CSG shape itself is hidden.
   * See also [collisionMask] and [collisionPriority].
   */
  public final inline var useCollision: Boolean
    @JvmName("useCollisionProperty")
    get() = isUsingCollision()
    @JvmName("useCollisionProperty")
    set(`value`) {
      setUseCollision(value)
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
  public final inline var collisionLayer: Long
    @JvmName("collisionLayerProperty")
    get() = getCollisionLayer()
    @JvmName("collisionLayerProperty")
    set(`value`) {
      setCollisionLayer(value)
    }

  /**
   * The physics layers this CSG shape scans for collisions. Only effective if [useCollision] is
   * `true`. See
   * [url=$DOCS_URL/tutorials/physics/physics_introduction.html#collision-layers-and-masks]Collision
   * layers and masks[/url] in the documentation for more information.
   */
  public final inline var collisionMask: Long
    @JvmName("collisionMaskProperty")
    get() = getCollisionMask()
    @JvmName("collisionMaskProperty")
    set(`value`) {
      setCollisionMask(value)
    }

  /**
   * The priority used to solve colliding when occurring penetration. Only effective if
   * [useCollision] is `true`. The higher the priority is, the lower the penetration into the object
   * will be. This can for example be used to prevent the player from breaking through the boundaries
   * of a level.
   */
  public final inline var collisionPriority: Float
    @JvmName("collisionPriorityProperty")
    get() = getCollisionPriority()
    @JvmName("collisionPriorityProperty")
    set(`value`) {
      setCollisionPriority(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_CSGSHAPE3D_INDEX, scriptIndex)
  }

  /**
   * Returns `true` if this is a root shape and is thus the object that is rendered.
   */
  public final fun isRootShape(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isRootShapePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setOperation(operation: Operation): Unit {
    Internals.writeArguments(LONG to operation.id)
    Internals.callMethod(rawPtr, MethodBindings.setOperationPtr, NIL)
  }

  public final fun getOperation(): Operation {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getOperationPtr, LONG)
    return CSGShape3D.Operation.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setSnap(snap: Float): Unit {
    Internals.writeArguments(DOUBLE to snap.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setSnapPtr, NIL)
  }

  public final fun getSnap(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSnapPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setUseCollision(operation: Boolean): Unit {
    Internals.writeArguments(BOOL to operation)
    Internals.callMethod(rawPtr, MethodBindings.setUseCollisionPtr, NIL)
  }

  public final fun isUsingCollision(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isUsingCollisionPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCollisionLayer(layer: Long): Unit {
    Internals.writeArguments(LONG to layer)
    Internals.callMethod(rawPtr, MethodBindings.setCollisionLayerPtr, NIL)
  }

  public final fun getCollisionLayer(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCollisionLayerPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  public final fun setCollisionMask(mask: Long): Unit {
    Internals.writeArguments(LONG to mask)
    Internals.callMethod(rawPtr, MethodBindings.setCollisionMaskPtr, NIL)
  }

  public final fun getCollisionMask(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCollisionMaskPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [collisionMask], given a
   * [layerNumber] between 1 and 32.
   */
  public final fun setCollisionMaskValue(layerNumber: Int, `value`: Boolean): Unit {
    Internals.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    Internals.callMethod(rawPtr, MethodBindings.setCollisionMaskValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [collisionMask] is enabled, given a
   * [layerNumber] between 1 and 32.
   */
  public final fun getCollisionMaskValue(layerNumber: Int): Boolean {
    Internals.writeArguments(LONG to layerNumber.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getCollisionMaskValuePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [collisionLayer], given a
   * [layerNumber] between 1 and 32.
   */
  public final fun setCollisionLayerValue(layerNumber: Int, `value`: Boolean): Unit {
    Internals.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    Internals.callMethod(rawPtr, MethodBindings.setCollisionLayerValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [collisionLayer] is enabled, given a
   * [layerNumber] between 1 and 32.
   */
  public final fun getCollisionLayerValue(layerNumber: Int): Boolean {
    Internals.writeArguments(LONG to layerNumber.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getCollisionLayerValuePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCollisionPriority(priority: Float): Unit {
    Internals.writeArguments(DOUBLE to priority.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setCollisionPriorityPtr, NIL)
  }

  public final fun getCollisionPriority(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCollisionPriorityPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setCalculateTangents(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setCalculateTangentsPtr, NIL)
  }

  public final fun isCalculatingTangents(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isCalculatingTangentsPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns an [Array] with two elements, the first is the [Transform3D] of this node and the
   * second is the root [Mesh] of this node. Only works when this node is the root shape.
   */
  public final fun getMeshes(): VariantArray<Any?> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMeshesPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<Any?>)
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
      public fun from(`value`: Long): Operation = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val isRootShapePtr: VoidPtr =
        Internals.getMethodBindPtr("CSGShape3D", "is_root_shape", 36873697)

    public val setOperationPtr: VoidPtr =
        Internals.getMethodBindPtr("CSGShape3D", "set_operation", 811425055)

    public val getOperationPtr: VoidPtr =
        Internals.getMethodBindPtr("CSGShape3D", "get_operation", 2662425879)

    public val setSnapPtr: VoidPtr = Internals.getMethodBindPtr("CSGShape3D", "set_snap", 373806689)

    public val getSnapPtr: VoidPtr =
        Internals.getMethodBindPtr("CSGShape3D", "get_snap", 1740695150)

    public val setUseCollisionPtr: VoidPtr =
        Internals.getMethodBindPtr("CSGShape3D", "set_use_collision", 2586408642)

    public val isUsingCollisionPtr: VoidPtr =
        Internals.getMethodBindPtr("CSGShape3D", "is_using_collision", 36873697)

    public val setCollisionLayerPtr: VoidPtr =
        Internals.getMethodBindPtr("CSGShape3D", "set_collision_layer", 1286410249)

    public val getCollisionLayerPtr: VoidPtr =
        Internals.getMethodBindPtr("CSGShape3D", "get_collision_layer", 3905245786)

    public val setCollisionMaskPtr: VoidPtr =
        Internals.getMethodBindPtr("CSGShape3D", "set_collision_mask", 1286410249)

    public val getCollisionMaskPtr: VoidPtr =
        Internals.getMethodBindPtr("CSGShape3D", "get_collision_mask", 3905245786)

    public val setCollisionMaskValuePtr: VoidPtr =
        Internals.getMethodBindPtr("CSGShape3D", "set_collision_mask_value", 300928843)

    public val getCollisionMaskValuePtr: VoidPtr =
        Internals.getMethodBindPtr("CSGShape3D", "get_collision_mask_value", 1116898809)

    public val setCollisionLayerValuePtr: VoidPtr =
        Internals.getMethodBindPtr("CSGShape3D", "set_collision_layer_value", 300928843)

    public val getCollisionLayerValuePtr: VoidPtr =
        Internals.getMethodBindPtr("CSGShape3D", "get_collision_layer_value", 1116898809)

    public val setCollisionPriorityPtr: VoidPtr =
        Internals.getMethodBindPtr("CSGShape3D", "set_collision_priority", 373806689)

    public val getCollisionPriorityPtr: VoidPtr =
        Internals.getMethodBindPtr("CSGShape3D", "get_collision_priority", 1740695150)

    public val setCalculateTangentsPtr: VoidPtr =
        Internals.getMethodBindPtr("CSGShape3D", "set_calculate_tangents", 2586408642)

    public val isCalculatingTangentsPtr: VoidPtr =
        Internals.getMethodBindPtr("CSGShape3D", "is_calculating_tangents", 36873697)

    public val getMeshesPtr: VoidPtr =
        Internals.getMethodBindPtr("CSGShape3D", "get_meshes", 3995934104)
  }
}
