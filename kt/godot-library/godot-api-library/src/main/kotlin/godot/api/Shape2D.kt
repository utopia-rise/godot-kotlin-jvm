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
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Abstract base class for all 2D shapes, intended for use in physics.
 *
 * **Performance:** Primitive shapes, especially [CircleShape2D], are fast to check collisions
 * against. [ConvexPolygonShape2D] is slower, and [ConcavePolygonShape2D] is the slowest.
 */
@GodotBaseType
public open class Shape2D internal constructor() : Resource() {
  /**
   * The shape's custom solver bias. Defines how much bodies react to enforce contact separation
   * when this shape is involved.
   *
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
    createNativeObject(605, scriptIndex)
  }

  public final fun setCustomSolverBias(bias: Float): Unit {
    TransferContext.writeArguments(DOUBLE to bias.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setCustomSolverBiasPtr, NIL)
  }

  public final fun getCustomSolverBias(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCustomSolverBiasPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns `true` if this shape is colliding with another.
   *
   * This method needs the transformation matrix for this shape ([localXform]), the shape to check
   * collisions with ([withShape]), and the transformation matrix of that shape ([shapeXform]).
   */
  public final fun collide(
    localXform: Transform2D,
    withShape: Shape2D?,
    shapeXform: Transform2D,
  ): Boolean {
    TransferContext.writeArguments(TRANSFORM2D to localXform, OBJECT to withShape, TRANSFORM2D to shapeXform)
    TransferContext.callMethod(ptr, MethodBindings.collidePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns whether this shape would collide with another, if a given movement was applied.
   *
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
    TransferContext.writeArguments(TRANSFORM2D to localXform, VECTOR2 to localMotion, OBJECT to withShape, TRANSFORM2D to shapeXform, VECTOR2 to shapeMotion)
    TransferContext.callMethod(ptr, MethodBindings.collideWithMotionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns a list of contact point pairs where this shape touches another.
   *
   * If there are no collisions, the returned list is empty. Otherwise, the returned list contains
   * contact points arranged in pairs, with entries alternating between points on the boundary of this
   * shape and points on the boundary of [withShape].
   *
   * A collision pair A, B can be used to calculate the collision normal with `(B -
   * A).normalized()`, and the collision depth with `(B - A).length()`. This information is typically
   * used to separate shapes, particularly in collision solvers.
   *
   * This method needs the transformation matrix for this shape ([localXform]), the shape to check
   * collisions with ([withShape]), and the transformation matrix of that shape ([shapeXform]).
   */
  public final fun collideAndGetContacts(
    localXform: Transform2D,
    withShape: Shape2D?,
    shapeXform: Transform2D,
  ): PackedVector2Array {
    TransferContext.writeArguments(TRANSFORM2D to localXform, OBJECT to withShape, TRANSFORM2D to shapeXform)
    TransferContext.callMethod(ptr, MethodBindings.collideAndGetContactsPtr, PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY) as PackedVector2Array)
  }

  /**
   * Returns a list of contact point pairs where this shape would touch another, if a given movement
   * was applied.
   *
   * If there would be no collisions, the returned list is empty. Otherwise, the returned list
   * contains contact points arranged in pairs, with entries alternating between points on the boundary
   * of this shape and points on the boundary of [withShape].
   *
   * A collision pair A, B can be used to calculate the collision normal with `(B -
   * A).normalized()`, and the collision depth with `(B - A).length()`. This information is typically
   * used to separate shapes, particularly in collision solvers.
   *
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
    TransferContext.writeArguments(TRANSFORM2D to localXform, VECTOR2 to localMotion, OBJECT to withShape, TRANSFORM2D to shapeXform, VECTOR2 to shapeMotion)
    TransferContext.callMethod(ptr, MethodBindings.collideWithMotionAndGetContactsPtr,
        PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY) as PackedVector2Array)
  }

  /**
   * Draws a solid shape onto a [CanvasItem] with the [RenderingServer] API filled with the
   * specified [color]. The exact drawing method is specific for each shape and cannot be configured.
   */
  public final fun draw(canvasItem: RID, color: Color): Unit {
    TransferContext.writeArguments(_RID to canvasItem, COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.drawPtr, NIL)
  }

  /**
   * Returns a [Rect2] representing the shapes boundary.
   */
  public final fun getRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2) as Rect2)
  }

  public companion object

  public object MethodBindings {
    internal val setCustomSolverBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Shape2D", "set_custom_solver_bias", 373806689)

    internal val getCustomSolverBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Shape2D", "get_custom_solver_bias", 1740695150)

    internal val collidePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Shape2D", "collide", 3709843132)

    internal val collideWithMotionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Shape2D", "collide_with_motion", 2869556801)

    internal val collideAndGetContactsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Shape2D", "collide_and_get_contacts", 3056932662)

    internal val collideWithMotionAndGetContactsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Shape2D", "collide_with_motion_and_get_contacts", 3620351573)

    internal val drawPtr: VoidPtr = TypeManager.getMethodBindPtr("Shape2D", "draw", 2948539648)

    internal val getRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Shape2D", "get_rect", 1639390495)
  }
}
