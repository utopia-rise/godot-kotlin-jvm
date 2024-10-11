// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedVector2Array
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_VECTOR2_ARRAY
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_COLLISIONPOLYGON2D_INDEX: Int = 188

/**
 * A node that provides a polygon shape to a [CollisionObject2D] parent and allows to edit it. The
 * polygon can be concave or convex. This can give a detection shape to an [Area2D], turn
 * [PhysicsBody2D] into a solid object, or give a hollow shape to a [StaticBody2D].
 * **Warning:** A non-uniformly scaled [CollisionShape2D] will likely not behave as expected. Make
 * sure to keep its scale the same on all axes and adjust its shape resource instead.
 */
@GodotBaseType
public open class CollisionPolygon2D : Node2D() {
  /**
   * Collision build mode. Use one of the [BuildMode] constants.
   */
  public final inline var buildMode: BuildMode
    @JvmName("buildModeProperty")
    get() = getBuildMode()
    @JvmName("buildModeProperty")
    set(`value`) {
      setBuildMode(value)
    }

  /**
   * The polygon's list of vertices. Each point will be connected to the next, and the final point
   * will be connected to the first.
   * **Note:** The returned vertices are in the local coordinate space of the given
   * [CollisionPolygon2D].
   */
  public final inline var polygon: PackedVector2Array
    @JvmName("polygonProperty")
    get() = getPolygon()
    @JvmName("polygonProperty")
    set(`value`) {
      setPolygon(value)
    }

  /**
   * If `true`, no collisions will be detected.
   */
  public final inline var disabled: Boolean
    @JvmName("disabledProperty")
    get() = isDisabled()
    @JvmName("disabledProperty")
    set(`value`) {
      setDisabled(value)
    }

  /**
   * If `true`, only edges that face up, relative to [CollisionPolygon2D]'s rotation, will collide
   * with other objects.
   * **Note:** This property has no effect if this [CollisionPolygon2D] is a child of an [Area2D]
   * node.
   */
  public final inline var oneWayCollision: Boolean
    @JvmName("oneWayCollisionProperty")
    get() = isOneWayCollisionEnabled()
    @JvmName("oneWayCollisionProperty")
    set(`value`) {
      setOneWayCollision(value)
    }

  /**
   * The margin used for one-way collision (in pixels). Higher values will make the shape thicker,
   * and work better for colliders that enter the polygon at a high velocity.
   */
  public final inline var oneWayCollisionMargin: Float
    @JvmName("oneWayCollisionMarginProperty")
    get() = getOneWayCollisionMargin()
    @JvmName("oneWayCollisionMarginProperty")
    set(`value`) {
      setOneWayCollisionMargin(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_COLLISIONPOLYGON2D_INDEX, scriptIndex)
  }

  public final fun setPolygon(polygon: PackedVector2Array): Unit {
    Internals.writeArguments(PACKED_VECTOR2_ARRAY to polygon)
    Internals.callMethod(rawPtr, MethodBindings.setPolygonPtr, NIL)
  }

  public final fun getPolygon(): PackedVector2Array {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPolygonPtr, PACKED_VECTOR2_ARRAY)
    return (Internals.readReturnValue(PACKED_VECTOR2_ARRAY) as PackedVector2Array)
  }

  public final fun setBuildMode(buildMode: BuildMode): Unit {
    Internals.writeArguments(LONG to buildMode.id)
    Internals.callMethod(rawPtr, MethodBindings.setBuildModePtr, NIL)
  }

  public final fun getBuildMode(): BuildMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBuildModePtr, LONG)
    return CollisionPolygon2D.BuildMode.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setDisabled(disabled: Boolean): Unit {
    Internals.writeArguments(BOOL to disabled)
    Internals.callMethod(rawPtr, MethodBindings.setDisabledPtr, NIL)
  }

  public final fun isDisabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isDisabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setOneWayCollision(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setOneWayCollisionPtr, NIL)
  }

  public final fun isOneWayCollisionEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isOneWayCollisionEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setOneWayCollisionMargin(margin: Float): Unit {
    Internals.writeArguments(DOUBLE to margin.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setOneWayCollisionMarginPtr, NIL)
  }

  public final fun getOneWayCollisionMargin(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getOneWayCollisionMarginPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public enum class BuildMode(
    id: Long,
  ) {
    /**
     * Collisions will include the polygon and its contained area. In this mode the node has the
     * same effect as several [ConvexPolygonShape2D] nodes, one for each convex shape in the convex
     * decomposition of the polygon (but without the overhead of multiple nodes).
     */
    BUILD_SOLIDS(0),
    /**
     * Collisions will only include the polygon edges. In this mode the node has the same effect as
     * a single [ConcavePolygonShape2D] made of segments, with the restriction that each segment (after
     * the first one) starts where the previous one ends, and the last one ends where the first one
     * starts (forming a closed but hollow polygon).
     */
    BUILD_SEGMENTS(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): BuildMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val setPolygonPtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionPolygon2D", "set_polygon", 1509147220)

    internal val getPolygonPtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionPolygon2D", "get_polygon", 2961356807)

    internal val setBuildModePtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionPolygon2D", "set_build_mode", 2780803135)

    internal val getBuildModePtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionPolygon2D", "get_build_mode", 3044948800)

    internal val setDisabledPtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionPolygon2D", "set_disabled", 2586408642)

    internal val isDisabledPtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionPolygon2D", "is_disabled", 36873697)

    internal val setOneWayCollisionPtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionPolygon2D", "set_one_way_collision", 2586408642)

    internal val isOneWayCollisionEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionPolygon2D", "is_one_way_collision_enabled", 36873697)

    internal val setOneWayCollisionMarginPtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionPolygon2D", "set_one_way_collision_margin", 373806689)

    internal val getOneWayCollisionMarginPtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionPolygon2D", "get_one_way_collision_margin", 1740695150)
  }
}
