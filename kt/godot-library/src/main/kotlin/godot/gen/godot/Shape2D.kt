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
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.VariantType.RECT2
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.VECTOR2
import godot.core.VariantType._RID
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

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
  public var customSolverBias: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCustomSolverBiasPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setCustomSolverBiasPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SHAPE2D, scriptIndex)
    return true
  }

  /**
   * Returns `true` if this shape is colliding with another.
   * This method needs the transformation matrix for this shape ([localXform]), the shape to check
   * collisions with ([withShape]), and the transformation matrix of that shape ([shapeXform]).
   */
  public fun collide(
    localXform: Transform2D,
    withShape: Shape2D,
    shapeXform: Transform2D,
  ): Boolean {
    TransferContext.writeArguments(TRANSFORM2D to localXform, OBJECT to withShape, TRANSFORM2D to shapeXform)
    TransferContext.callMethod(rawPtr, MethodBindings.collidePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns whether this shape would collide with another, if a given movement was applied.
   * This method needs the transformation matrix for this shape ([localXform]), the movement to test
   * on this shape ([localMotion]), the shape to check collisions with ([withShape]), the
   * transformation matrix of that shape ([shapeXform]), and the movement to test onto the other object
   * ([shapeMotion]).
   */
  public fun collideWithMotion(
    localXform: Transform2D,
    localMotion: Vector2,
    withShape: Shape2D,
    shapeXform: Transform2D,
    shapeMotion: Vector2,
  ): Boolean {
    TransferContext.writeArguments(TRANSFORM2D to localXform, VECTOR2 to localMotion, OBJECT to withShape, TRANSFORM2D to shapeXform, VECTOR2 to shapeMotion)
    TransferContext.callMethod(rawPtr, MethodBindings.collideWithMotionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
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
  public fun collideAndGetContacts(
    localXform: Transform2D,
    withShape: Shape2D,
    shapeXform: Transform2D,
  ): PackedVector2Array {
    TransferContext.writeArguments(TRANSFORM2D to localXform, OBJECT to withShape, TRANSFORM2D to shapeXform)
    TransferContext.callMethod(rawPtr, MethodBindings.collideAndGetContactsPtr,
        PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
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
  public fun collideWithMotionAndGetContacts(
    localXform: Transform2D,
    localMotion: Vector2,
    withShape: Shape2D,
    shapeXform: Transform2D,
    shapeMotion: Vector2,
  ): PackedVector2Array {
    TransferContext.writeArguments(TRANSFORM2D to localXform, VECTOR2 to localMotion, OBJECT to withShape, TRANSFORM2D to shapeXform, VECTOR2 to shapeMotion)
    TransferContext.callMethod(rawPtr, MethodBindings.collideWithMotionAndGetContactsPtr,
        PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
  }

  /**
   * Draws a solid shape onto a [CanvasItem] with the [RenderingServer] API filled with the
   * specified [color]. The exact drawing method is specific for each shape and cannot be configured.
   */
  public fun draw(canvasItem: RID, color: Color): Unit {
    TransferContext.writeArguments(_RID to canvasItem, COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.drawPtr, NIL)
  }

  /**
   * Returns a [Rect2] representing the shapes boundary.
   */
  public fun getRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2, false) as Rect2)
  }

  public companion object

  internal object MethodBindings {
    public val setCustomSolverBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Shape2D", "set_custom_solver_bias")

    public val getCustomSolverBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Shape2D", "get_custom_solver_bias")

    public val collidePtr: VoidPtr = TypeManager.getMethodBindPtr("Shape2D", "collide")

    public val collideWithMotionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Shape2D", "collide_with_motion")

    public val collideAndGetContactsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Shape2D", "collide_and_get_contacts")

    public val collideWithMotionAndGetContactsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Shape2D", "collide_with_motion_and_get_contacts")

    public val drawPtr: VoidPtr = TypeManager.getMethodBindPtr("Shape2D", "draw")

    public val getRectPtr: VoidPtr = TypeManager.getMethodBindPtr("Shape2D", "get_rect")
  }
}
