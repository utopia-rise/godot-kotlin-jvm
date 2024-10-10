// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.PackedVector2Array
import godot.core.RID
import godot.core.Rect2
import godot.core.Transform2D
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_VECTOR2_ARRAY
import godot.core.VariantParser.RECT2
import godot.core.VariantParser.TRANSFORM2D
import godot.core.VariantParser.VECTOR2
import godot.core.VariantParser._RID
import godot.core.Vector2
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Abstract base class for all 2D shapes, intended for use in physics.
 * **Performance:** Primitive shapes, especially [CircleShape2D], are fast to check collisions
 * against. [ConvexPolygonShape2D] is slower, and [ConcavePolygonShape2D] is the slowest.
 */
@GodotBaseType
public open class Shape2D internal constructor() : Resource() {
  /**
   * The shape's custom solver bias. Defines how much bodies react to enforce contact separation
   * when this shape is involved.
   * When set to `0`, the default value from [ProjectSettings.physics/2d/solver/defaultContactBias]
   * is used.
   */
  public final inline var customSolverBias: Float
    @JvmName("customSolverBiasProperty")
    get() = getCustomSolverBias()
    @JvmName("customSolverBiasProperty")
    set(`value`) {
      setCustomSolverBias(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_SHAPE2D_INDEX, scriptIndex)
  }

  public final fun setCustomSolverBias(bias: Float): Unit {
    Internals.writeArguments(DOUBLE to bias.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setCustomSolverBiasPtr, NIL)
  }

  public final fun getCustomSolverBias(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCustomSolverBiasPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns `true` if this shape is colliding with another.
   * This method needs the transformation matrix for this shape ([localXform]), the shape to check
   * collisions with ([withShape]), and the transformation matrix of that shape ([shapeXform]).
   */
  public final fun collide(
    localXform: Transform2D,
    withShape: Shape2D?,
    shapeXform: Transform2D,
  ): Boolean {
    Internals.writeArguments(TRANSFORM2D to localXform, OBJECT to withShape, TRANSFORM2D to shapeXform)
    Internals.callMethod(rawPtr, MethodBindings.collidePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns whether this shape would collide with another, if a given movement was applied.
   * This method needs the transformation matrix for this shape ([localXform]), the movement to test
   * on this shape ([localMotion]), the shape to check collisions with ([withShape]), the
   * transformation matrix of that shape ([shapeXform]), and the movement to test onto the other object
   * ([shapeMotion]).
   */
  public final fun collideWithMotion(
    localXform: Transform2D,
    localMotion: Vector2,
    withShape: Shape2D?,
    shapeXform: Transform2D,
    shapeMotion: Vector2,
  ): Boolean {
    Internals.writeArguments(TRANSFORM2D to localXform, VECTOR2 to localMotion, OBJECT to withShape, TRANSFORM2D to shapeXform, VECTOR2 to shapeMotion)
    Internals.callMethod(rawPtr, MethodBindings.collideWithMotionPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns a list of contact point pairs where this shape touches another.
   * If there are no collisions, the returned list is empty. Otherwise, the returned list contains
   * contact points arranged in pairs, with entries alternating between points on the boundary of this
   * shape and points on the boundary of [withShape].
   * A collision pair A, B can be used to calculate the collision normal with `(B -
   * A).normalized()`, and the collision depth with `(B - A).length()`. This information is typically
   * used to separate shapes, particularly in collision solvers.
   * This method needs the transformation matrix for this shape ([localXform]), the shape to check
   * collisions with ([withShape]), and the transformation matrix of that shape ([shapeXform]).
   */
  public final fun collideAndGetContacts(
    localXform: Transform2D,
    withShape: Shape2D?,
    shapeXform: Transform2D,
  ): PackedVector2Array {
    Internals.writeArguments(TRANSFORM2D to localXform, OBJECT to withShape, TRANSFORM2D to shapeXform)
    Internals.callMethod(rawPtr, MethodBindings.collideAndGetContactsPtr, PACKED_VECTOR2_ARRAY)
    return (Internals.readReturnValue(PACKED_VECTOR2_ARRAY) as PackedVector2Array)
  }

  /**
   * Returns a list of contact point pairs where this shape would touch another, if a given movement
   * was applied.
   * If there would be no collisions, the returned list is empty. Otherwise, the returned list
   * contains contact points arranged in pairs, with entries alternating between points on the boundary
   * of this shape and points on the boundary of [withShape].
   * A collision pair A, B can be used to calculate the collision normal with `(B -
   * A).normalized()`, and the collision depth with `(B - A).length()`. This information is typically
   * used to separate shapes, particularly in collision solvers.
   * This method needs the transformation matrix for this shape ([localXform]), the movement to test
   * on this shape ([localMotion]), the shape to check collisions with ([withShape]), the
   * transformation matrix of that shape ([shapeXform]), and the movement to test onto the other object
   * ([shapeMotion]).
   */
  public final fun collideWithMotionAndGetContacts(
    localXform: Transform2D,
    localMotion: Vector2,
    withShape: Shape2D?,
    shapeXform: Transform2D,
    shapeMotion: Vector2,
  ): PackedVector2Array {
    Internals.writeArguments(TRANSFORM2D to localXform, VECTOR2 to localMotion, OBJECT to withShape, TRANSFORM2D to shapeXform, VECTOR2 to shapeMotion)
    Internals.callMethod(rawPtr, MethodBindings.collideWithMotionAndGetContactsPtr,
        PACKED_VECTOR2_ARRAY)
    return (Internals.readReturnValue(PACKED_VECTOR2_ARRAY) as PackedVector2Array)
  }

  /**
   * Draws a solid shape onto a [CanvasItem] with the [RenderingServer] API filled with the
   * specified [color]. The exact drawing method is specific for each shape and cannot be configured.
   */
  public final fun draw(canvasItem: RID, color: Color): Unit {
    Internals.writeArguments(_RID to canvasItem, COLOR to color)
    Internals.callMethod(rawPtr, MethodBindings.drawPtr, NIL)
  }

  /**
   * Returns a [Rect2] representing the shapes boundary.
   */
  public final fun getRect(): Rect2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRectPtr, RECT2)
    return (Internals.readReturnValue(RECT2) as Rect2)
  }

  public companion object

  internal object MethodBindings {
    public val setCustomSolverBiasPtr: VoidPtr =
        Internals.getMethodBindPtr("Shape2D", "set_custom_solver_bias", 373806689)

    public val getCustomSolverBiasPtr: VoidPtr =
        Internals.getMethodBindPtr("Shape2D", "get_custom_solver_bias", 1740695150)

    public val collidePtr: VoidPtr = Internals.getMethodBindPtr("Shape2D", "collide", 3709843132)

    public val collideWithMotionPtr: VoidPtr =
        Internals.getMethodBindPtr("Shape2D", "collide_with_motion", 2869556801)

    public val collideAndGetContactsPtr: VoidPtr =
        Internals.getMethodBindPtr("Shape2D", "collide_and_get_contacts", 3056932662)

    public val collideWithMotionAndGetContactsPtr: VoidPtr =
        Internals.getMethodBindPtr("Shape2D", "collide_with_motion_and_get_contacts", 3620351573)

    public val drawPtr: VoidPtr = Internals.getMethodBindPtr("Shape2D", "draw", 2948539648)

    public val getRectPtr: VoidPtr = Internals.getMethodBindPtr("Shape2D", "get_rect", 1639390495)
  }
}
