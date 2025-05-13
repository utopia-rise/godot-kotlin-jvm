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
import godot.core.MethodStringName0
import godot.core.MethodStringName1
import godot.core.MethodStringName2
import godot.core.RID
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.VECTOR3
import godot.core.VariantParser._RID
import godot.core.Vector3
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holds collision data from the movement of a [PhysicsBody3D], usually from
 * [PhysicsBody3D.moveAndCollide]. When a [PhysicsBody3D] is moved, it stops if it detects a collision
 * with another body. If a collision is detected, a [KinematicCollision3D] object is returned.
 *
 * The collision data includes the colliding object, the remaining motion, and the collision
 * position. This data can be used to determine a custom response to the collision.
 */
@GodotBaseType
public open class KinematicCollision3D : RefCounted() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(326, scriptIndex)
  }

  /**
   * Returns the moving object's travel before collision.
   */
  public final fun getTravel(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTravelPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns the moving object's remaining movement vector.
   */
  public final fun getRemainder(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRemainderPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns the colliding body's length of overlap along the collision normal.
   */
  public final fun getDepth(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDepthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the number of detected collisions.
   */
  public final fun getCollisionCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCollisionCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the point of collision in global coordinates given a collision index (the deepest
   * collision by default).
   */
  @JvmOverloads
  public final fun getPosition(collisionIndex: Int = 0): Vector3 {
    TransferContext.writeArguments(LONG to collisionIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getPositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns the colliding body's shape's normal at the point of collision given a collision index
   * (the deepest collision by default).
   */
  @JvmOverloads
  public final fun getNormal(collisionIndex: Int = 0): Vector3 {
    TransferContext.writeArguments(LONG to collisionIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getNormalPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns the collision angle according to [upDirection], which is [Vector3.UP] by default. This
   * value is always positive.
   */
  @JvmOverloads
  public final fun getAngle(collisionIndex: Int = 0, upDirection: Vector3 = Vector3(0, 1, 0)):
      Float {
    TransferContext.writeArguments(LONG to collisionIndex.toLong(), VECTOR3 to upDirection)
    TransferContext.callMethod(ptr, MethodBindings.getAnglePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the moving object's colliding shape given a collision index (the deepest collision by
   * default).
   */
  @JvmOverloads
  public final fun getLocalShape(collisionIndex: Int = 0): Object? {
    TransferContext.writeArguments(LONG to collisionIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getLocalShapePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Object?)
  }

  /**
   * Returns the colliding body's attached [Object] given a collision index (the deepest collision
   * by default).
   */
  @JvmOverloads
  public final fun getCollider(collisionIndex: Int = 0): Object? {
    TransferContext.writeArguments(LONG to collisionIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getColliderPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Object?)
  }

  /**
   * Returns the unique instance ID of the colliding body's attached [Object] given a collision
   * index (the deepest collision by default). See [Object.getInstanceId].
   */
  @JvmOverloads
  public final fun getColliderId(collisionIndex: Int = 0): Long {
    TransferContext.writeArguments(LONG to collisionIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getColliderIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the colliding body's [RID] used by the [PhysicsServer3D] given a collision index (the
   * deepest collision by default).
   */
  @JvmOverloads
  public final fun getColliderRid(collisionIndex: Int = 0): RID {
    TransferContext.writeArguments(LONG to collisionIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getColliderRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Returns the colliding body's shape given a collision index (the deepest collision by default).
   */
  @JvmOverloads
  public final fun getColliderShape(collisionIndex: Int = 0): Object? {
    TransferContext.writeArguments(LONG to collisionIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getColliderShapePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Object?)
  }

  /**
   * Returns the colliding body's shape index given a collision index (the deepest collision by
   * default). See [CollisionObject3D].
   */
  @JvmOverloads
  public final fun getColliderShapeIndex(collisionIndex: Int = 0): Int {
    TransferContext.writeArguments(LONG to collisionIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getColliderShapeIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the colliding body's velocity given a collision index (the deepest collision by
   * default).
   */
  @JvmOverloads
  public final fun getColliderVelocity(collisionIndex: Int = 0): Vector3 {
    TransferContext.writeArguments(LONG to collisionIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getColliderVelocityPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public companion object {
    @JvmStatic
    public val getTravelName: MethodStringName0<KinematicCollision3D, Vector3> =
        MethodStringName0<KinematicCollision3D, Vector3>("get_travel")

    @JvmStatic
    public val getRemainderName: MethodStringName0<KinematicCollision3D, Vector3> =
        MethodStringName0<KinematicCollision3D, Vector3>("get_remainder")

    @JvmStatic
    public val getDepthName: MethodStringName0<KinematicCollision3D, Float> =
        MethodStringName0<KinematicCollision3D, Float>("get_depth")

    @JvmStatic
    public val getCollisionCountName: MethodStringName0<KinematicCollision3D, Int> =
        MethodStringName0<KinematicCollision3D, Int>("get_collision_count")

    @JvmStatic
    public val getPositionName: MethodStringName1<KinematicCollision3D, Vector3, Int> =
        MethodStringName1<KinematicCollision3D, Vector3, Int>("get_position")

    @JvmStatic
    public val getNormalName: MethodStringName1<KinematicCollision3D, Vector3, Int> =
        MethodStringName1<KinematicCollision3D, Vector3, Int>("get_normal")

    @JvmStatic
    public val getAngleName: MethodStringName2<KinematicCollision3D, Float, Int, Vector3> =
        MethodStringName2<KinematicCollision3D, Float, Int, Vector3>("get_angle")

    @JvmStatic
    public val getLocalShapeName: MethodStringName1<KinematicCollision3D, Object?, Int> =
        MethodStringName1<KinematicCollision3D, Object?, Int>("get_local_shape")

    @JvmStatic
    public val getColliderName: MethodStringName1<KinematicCollision3D, Object?, Int> =
        MethodStringName1<KinematicCollision3D, Object?, Int>("get_collider")

    @JvmStatic
    public val getColliderIdName: MethodStringName1<KinematicCollision3D, Long, Int> =
        MethodStringName1<KinematicCollision3D, Long, Int>("get_collider_id")

    @JvmStatic
    public val getColliderRidName: MethodStringName1<KinematicCollision3D, RID, Int> =
        MethodStringName1<KinematicCollision3D, RID, Int>("get_collider_rid")

    @JvmStatic
    public val getColliderShapeName: MethodStringName1<KinematicCollision3D, Object?, Int> =
        MethodStringName1<KinematicCollision3D, Object?, Int>("get_collider_shape")

    @JvmStatic
    public val getColliderShapeIndexName: MethodStringName1<KinematicCollision3D, Int, Int> =
        MethodStringName1<KinematicCollision3D, Int, Int>("get_collider_shape_index")

    @JvmStatic
    public val getColliderVelocityName: MethodStringName1<KinematicCollision3D, Vector3, Int> =
        MethodStringName1<KinematicCollision3D, Vector3, Int>("get_collider_velocity")
  }

  public object MethodBindings {
    internal val getTravelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision3D", "get_travel", 3360562783)

    internal val getRemainderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision3D", "get_remainder", 3360562783)

    internal val getDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision3D", "get_depth", 1740695150)

    internal val getCollisionCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision3D", "get_collision_count", 3905245786)

    internal val getPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision3D", "get_position", 1914908202)

    internal val getNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision3D", "get_normal", 1914908202)

    internal val getAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision3D", "get_angle", 1242741860)

    internal val getLocalShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision3D", "get_local_shape", 2639523548)

    internal val getColliderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision3D", "get_collider", 2639523548)

    internal val getColliderIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision3D", "get_collider_id", 1591665591)

    internal val getColliderRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision3D", "get_collider_rid", 1231817359)

    internal val getColliderShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision3D", "get_collider_shape", 2639523548)

    internal val getColliderShapeIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision3D", "get_collider_shape_index", 1591665591)

    internal val getColliderVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision3D", "get_collider_velocity", 1914908202)
  }
}
