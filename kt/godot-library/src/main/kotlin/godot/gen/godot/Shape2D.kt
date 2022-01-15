// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.RID
import godot.core.TransferContext
import godot.core.Transform2D
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.VECTOR2
import godot.core.VariantType._RID
import godot.core.Vector2
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Suppress
import kotlin.Unit

/**
 * Base class for all 2D shapes.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/physics/physics_introduction.html]($DOCS_URL/tutorials/physics/physics_introduction.html)
 *
 * Base class for all 2D shapes. All 2D shape types inherit from this.
 */
@GodotBaseType
public open class Shape2D : Resource() {
  /**
   * The shape's custom solver bias.
   */
  public open var customSolverBias: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPE2D_GET_CUSTOM_SOLVER_BIAS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPE2D_SET_CUSTOM_SOLVER_BIAS,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SHAPE2D)
  }

  /**
   * Returns `true` if this shape is colliding with another.
   *
   * This method needs the transformation matrix for this shape (`local_xform`), the shape to check collisions with (`with_shape`), and the transformation matrix of that shape (`shape_xform`).
   */
  public open fun collide(
    localXform: Transform2D,
    withShape: Shape2D,
    shapeXform: Transform2D
  ): Boolean {
    TransferContext.writeArguments(TRANSFORM2D to localXform, OBJECT to withShape, TRANSFORM2D to
        shapeXform)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPE2D_COLLIDE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns a list of the points where this shape touches another. If there are no collisions the list is empty.
   *
   * This method needs the transformation matrix for this shape (`local_xform`), the shape to check collisions with (`with_shape`), and the transformation matrix of that shape (`shape_xform`).
   */
  public open fun collideAndGetContacts(
    localXform: Transform2D,
    withShape: Shape2D,
    shapeXform: Transform2D
  ): VariantArray<Any?> {
    TransferContext.writeArguments(TRANSFORM2D to localXform, OBJECT to withShape, TRANSFORM2D to
        shapeXform)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPE2D_COLLIDE_AND_GET_CONTACTS,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns whether this shape would collide with another, if a given movement was applied.
   *
   * This method needs the transformation matrix for this shape (`local_xform`), the movement to test on this shape (`local_motion`), the shape to check collisions with (`with_shape`), the transformation matrix of that shape (`shape_xform`), and the movement to test onto the other object (`shape_motion`).
   */
  public open fun collideWithMotion(
    localXform: Transform2D,
    localMotion: Vector2,
    withShape: Shape2D,
    shapeXform: Transform2D,
    shapeMotion: Vector2
  ): Boolean {
    TransferContext.writeArguments(TRANSFORM2D to localXform, VECTOR2 to localMotion, OBJECT to
        withShape, TRANSFORM2D to shapeXform, VECTOR2 to shapeMotion)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPE2D_COLLIDE_WITH_MOTION, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns a list of the points where this shape would touch another, if a given movement was applied. If there are no collisions the list is empty.
   *
   * This method needs the transformation matrix for this shape (`local_xform`), the movement to test on this shape (`local_motion`), the shape to check collisions with (`with_shape`), the transformation matrix of that shape (`shape_xform`), and the movement to test onto the other object (`shape_motion`).
   */
  public open fun collideWithMotionAndGetContacts(
    localXform: Transform2D,
    localMotion: Vector2,
    withShape: Shape2D,
    shapeXform: Transform2D,
    shapeMotion: Vector2
  ): VariantArray<Any?> {
    TransferContext.writeArguments(TRANSFORM2D to localXform, VECTOR2 to localMotion, OBJECT to
        withShape, TRANSFORM2D to shapeXform, VECTOR2 to shapeMotion)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SHAPE2D_COLLIDE_WITH_MOTION_AND_GET_CONTACTS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Draws a solid shape onto a [godot.CanvasItem] with the [godot.VisualServer] API filled with the specified `color`. The exact drawing method is specific for each shape and cannot be configured.
   */
  public open fun draw(canvasItem: RID, color: Color): Unit {
    TransferContext.writeArguments(_RID to canvasItem, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPE2D_DRAW, NIL)
  }
}
