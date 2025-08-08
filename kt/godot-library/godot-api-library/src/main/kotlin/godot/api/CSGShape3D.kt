// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.GodotEnum
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
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
 * This is the CSG base class that provides CSG operation support to the various CSG nodes in Godot.
 *
 * **Performance:** CSG nodes are only intended for prototyping as they have a significant CPU
 * performance cost.
 *
 * Consider baking final CSG operation results into static geometry that replaces the CSG nodes.
 *
 * Individual CSG root node results can be baked to nodes with static resources with the editor menu
 * that appears when a CSG root node is selected.
 *
 * Individual CSG root nodes can also be baked to static resources with scripts by calling
 * [bakeStaticMesh] for the visual mesh or [bakeCollisionShape] for the physics collision.
 *
 * Entire scenes of CSG nodes can be baked to static geometry and exported with the editor gltf
 * scene exporter.
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
   * This property does nothing.
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
   *
   * Collidable objects can exist in any of 32 different layers. These layers work like a tagging
   * system, and are not visual. A collidable can use these layers to select with which objects it can
   * collide, using the collision_mask property.
   *
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
    createNativeObject(123, scriptIndex)
  }

  /**
   * Returns `true` if this is a root shape and is thus the object that is rendered.
   */
  public final fun isRootShape(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isRootShapePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setOperation(operation: Operation): Unit {
    TransferContext.writeArguments(LONG to operation.id)
    TransferContext.callMethod(ptr, MethodBindings.setOperationPtr, NIL)
  }

  public final fun getOperation(): Operation {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOperationPtr, LONG)
    return Operation.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setSnap(snap: Float): Unit {
    TransferContext.writeArguments(DOUBLE to snap.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSnapPtr, NIL)
  }

  public final fun getSnap(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSnapPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setUseCollision(operation: Boolean): Unit {
    TransferContext.writeArguments(BOOL to operation)
    TransferContext.callMethod(ptr, MethodBindings.setUseCollisionPtr, NIL)
  }

  public final fun isUsingCollision(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isUsingCollisionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCollisionLayer(layer: Long): Unit {
    TransferContext.writeArguments(LONG to layer)
    TransferContext.callMethod(ptr, MethodBindings.setCollisionLayerPtr, NIL)
  }

  public final fun getCollisionLayer(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCollisionLayerPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setCollisionMask(mask: Long): Unit {
    TransferContext.writeArguments(LONG to mask)
    TransferContext.callMethod(ptr, MethodBindings.setCollisionMaskPtr, NIL)
  }

  public final fun getCollisionMask(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCollisionMaskPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [collisionMask], given a
   * [layerNumber] between 1 and 32.
   */
  public final fun setCollisionMaskValue(layerNumber: Int, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(ptr, MethodBindings.setCollisionMaskValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [collisionMask] is enabled, given a
   * [layerNumber] between 1 and 32.
   */
  public final fun getCollisionMaskValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getCollisionMaskValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [collisionLayer], given a
   * [layerNumber] between 1 and 32.
   */
  public final fun setCollisionLayerValue(layerNumber: Int, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(ptr, MethodBindings.setCollisionLayerValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [collisionLayer] is enabled, given a
   * [layerNumber] between 1 and 32.
   */
  public final fun getCollisionLayerValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getCollisionLayerValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCollisionPriority(priority: Float): Unit {
    TransferContext.writeArguments(DOUBLE to priority.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setCollisionPriorityPtr, NIL)
  }

  public final fun getCollisionPriority(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCollisionPriorityPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setCalculateTangents(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setCalculateTangentsPtr, NIL)
  }

  public final fun isCalculatingTangents(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isCalculatingTangentsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns an [Array] with two elements, the first is the [Transform3D] of this node and the
   * second is the root [Mesh] of this node. Only works when this node is the root shape.
   */
  public final fun getMeshes(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMeshesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  /**
   * Returns a baked static [ArrayMesh] of this node's CSG operation result. Materials from involved
   * CSG nodes are added as extra mesh surfaces. Returns an empty mesh if the node is not a CSG root
   * node or has no valid geometry.
   */
  public final fun bakeStaticMesh(): ArrayMesh? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.bakeStaticMeshPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as ArrayMesh?)
  }

  /**
   * Returns a baked physics [ConcavePolygonShape3D] of this node's CSG operation result. Returns an
   * empty shape if the node is not a CSG root node or has no valid geometry.
   *
   * **Performance:** If the CSG operation results in a very detailed geometry with many faces
   * physics performance will be very slow. Concave shapes should in general only be used for static
   * level geometry and not with dynamic objects that are moving.
   */
  public final fun bakeCollisionShape(): ConcavePolygonShape3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.bakeCollisionShapePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as ConcavePolygonShape3D?)
  }

  public enum class Operation(
    id: Long,
  ) : GodotEnum {
    /**
     * Geometry of both primitives is merged, intersecting geometry is removed.
     */
    UNION(0),
    /**
     * Only intersecting geometry remains, the rest is removed.
     */
    INTERSECTION(1),
    /**
     * The second shape is subtracted from the first, leaving a dent with its shape.
     */
    SUBTRACTION(2),
    ;

    public override val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Operation = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val isRootShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGShape3D", "is_root_shape", 36873697)

    internal val setOperationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGShape3D", "set_operation", 811425055)

    internal val getOperationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGShape3D", "get_operation", 2662425879)

    internal val setSnapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGShape3D", "set_snap", 373806689)

    internal val getSnapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGShape3D", "get_snap", 1740695150)

    internal val setUseCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGShape3D", "set_use_collision", 2586408642)

    internal val isUsingCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGShape3D", "is_using_collision", 36873697)

    internal val setCollisionLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGShape3D", "set_collision_layer", 1286410249)

    internal val getCollisionLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGShape3D", "get_collision_layer", 3905245786)

    internal val setCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGShape3D", "set_collision_mask", 1286410249)

    internal val getCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGShape3D", "get_collision_mask", 3905245786)

    internal val setCollisionMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGShape3D", "set_collision_mask_value", 300928843)

    internal val getCollisionMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGShape3D", "get_collision_mask_value", 1116898809)

    internal val setCollisionLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGShape3D", "set_collision_layer_value", 300928843)

    internal val getCollisionLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGShape3D", "get_collision_layer_value", 1116898809)

    internal val setCollisionPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGShape3D", "set_collision_priority", 373806689)

    internal val getCollisionPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGShape3D", "get_collision_priority", 1740695150)

    internal val setCalculateTangentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGShape3D", "set_calculate_tangents", 2586408642)

    internal val isCalculatingTangentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGShape3D", "is_calculating_tangents", 36873697)

    internal val getMeshesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGShape3D", "get_meshes", 3995934104)

    internal val bakeStaticMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGShape3D", "bake_static_mesh", 1605880883)

    internal val bakeCollisionShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGShape3D", "bake_collision_shape", 36102322)
  }
}
