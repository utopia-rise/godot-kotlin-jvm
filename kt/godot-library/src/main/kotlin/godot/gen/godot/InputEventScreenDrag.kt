// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Stores information about screen drag events. See [Node.Input].
 */
@GodotBaseType
public open class InputEventScreenDrag : InputEventFromWindow() {
  /**
   * The drag event index in the case of a multi-drag event.
   */
  public var index: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getIndexPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setIndexPtr, NIL)
    }

  /**
   * Represents the angles of tilt of the pen. Positive X-coordinate value indicates a tilt to the
   * right. Positive Y-coordinate value indicates a tilt toward the user. Ranges from `-1.0` to `1.0`
   * for both axes.
   */
  @CoreTypeLocalCopy
  public var tilt: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTiltPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTiltPtr, NIL)
    }

  /**
   * Represents the pressure the user puts on the pen. Ranges from `0.0` to `1.0`.
   */
  public var pressure: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPressurePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setPressurePtr, NIL)
    }

  /**
   * Returns `true` when using the eraser end of a stylus pen.
   */
  public var penInverted: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPenInvertedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPenInvertedPtr, NIL)
    }

  /**
   * The drag position in the viewport the node is in, using the coordinate system of this viewport.
   */
  @CoreTypeLocalCopy
  public var position: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPositionPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPositionPtr, NIL)
    }

  /**
   * The drag position relative to the previous position (position at the last frame).
   * **Note:** [relative] is automatically scaled according to the content scale factor, which is
   * defined by the project's stretch mode settings. This means touch sensitivity will appear different
   * depending on resolution when using [relative] in a script that handles touch aiming. To avoid
   * this, use [screenRelative] instead.
   */
  @CoreTypeLocalCopy
  public var relative: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRelativePtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRelativePtr, NIL)
    }

  /**
   * The unscaled drag position relative to the previous position in screen coordinates (position at
   * the last frame). This position is *not* scaled according to the content scale factor or calls to
   * [InputEvent.xformedBy]. This should be preferred over [relative] for touch aiming regardless of
   * the project's stretch mode.
   */
  @CoreTypeLocalCopy
  public var screenRelative: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getScreenRelativePtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setScreenRelativePtr, NIL)
    }

  /**
   * The drag velocity.
   * **Note:** [velocity] is automatically scaled according to the content scale factor, which is
   * defined by the project's stretch mode settings. This means touch sensitivity will appear different
   * depending on resolution when using [velocity] in a script that handles touch aiming. To avoid
   * this, use [screenVelocity] instead.
   */
  @CoreTypeLocalCopy
  public var velocity: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVelocityPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVelocityPtr, NIL)
    }

  /**
   * The unscaled drag velocity in pixels per second in screen coordinates. This velocity is *not*
   * scaled according to the content scale factor or calls to [InputEvent.xformedBy]. This should be
   * preferred over [velocity] for touch aiming regardless of the project's stretch mode.
   */
  @CoreTypeLocalCopy
  public var screenVelocity: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getScreenVelocityPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setScreenVelocityPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_INPUTEVENTSCREENDRAG, scriptIndex)
  }

  /**
   * Represents the angles of tilt of the pen. Positive X-coordinate value indicates a tilt to the
   * right. Positive Y-coordinate value indicates a tilt toward the user. Ranges from `-1.0` to `1.0`
   * for both axes.
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = inputeventscreendrag.tilt
   * //Your changes
   * inputeventscreendrag.tilt = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun tiltMutate(block: Vector2.() -> Unit): Vector2 = tilt.apply{
      block(this)
      tilt = this
  }


  /**
   * The drag position in the viewport the node is in, using the coordinate system of this viewport.
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = inputeventscreendrag.position
   * //Your changes
   * inputeventscreendrag.position = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun positionMutate(block: Vector2.() -> Unit): Vector2 = position.apply{
      block(this)
      position = this
  }


  /**
   * The drag position relative to the previous position (position at the last frame).
   * **Note:** [relative] is automatically scaled according to the content scale factor, which is
   * defined by the project's stretch mode settings. This means touch sensitivity will appear different
   * depending on resolution when using [relative] in a script that handles touch aiming. To avoid
   * this, use [screenRelative] instead.
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = inputeventscreendrag.relative
   * //Your changes
   * inputeventscreendrag.relative = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun relativeMutate(block: Vector2.() -> Unit): Vector2 = relative.apply{
      block(this)
      relative = this
  }


  /**
   * The unscaled drag position relative to the previous position in screen coordinates (position at
   * the last frame). This position is *not* scaled according to the content scale factor or calls to
   * [InputEvent.xformedBy]. This should be preferred over [relative] for touch aiming regardless of
   * the project's stretch mode.
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = inputeventscreendrag.screenRelative
   * //Your changes
   * inputeventscreendrag.screenRelative = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun screenRelativeMutate(block: Vector2.() -> Unit): Vector2 = screenRelative.apply{
      block(this)
      screenRelative = this
  }


  /**
   * The drag velocity.
   * **Note:** [velocity] is automatically scaled according to the content scale factor, which is
   * defined by the project's stretch mode settings. This means touch sensitivity will appear different
   * depending on resolution when using [velocity] in a script that handles touch aiming. To avoid
   * this, use [screenVelocity] instead.
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = inputeventscreendrag.velocity
   * //Your changes
   * inputeventscreendrag.velocity = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun velocityMutate(block: Vector2.() -> Unit): Vector2 = velocity.apply{
      block(this)
      velocity = this
  }


  /**
   * The unscaled drag velocity in pixels per second in screen coordinates. This velocity is *not*
   * scaled according to the content scale factor or calls to [InputEvent.xformedBy]. This should be
   * preferred over [velocity] for touch aiming regardless of the project's stretch mode.
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = inputeventscreendrag.screenVelocity
   * //Your changes
   * inputeventscreendrag.screenVelocity = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun screenVelocityMutate(block: Vector2.() -> Unit): Vector2 = screenVelocity.apply{
      block(this)
      screenVelocity = this
  }


  public companion object

  internal object MethodBindings {
    public val setIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventScreenDrag", "set_index", 1286410249)

    public val getIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventScreenDrag", "get_index", 3905245786)

    public val setTiltPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventScreenDrag", "set_tilt", 743155724)

    public val getTiltPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventScreenDrag", "get_tilt", 3341600327)

    public val setPressurePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventScreenDrag", "set_pressure", 373806689)

    public val getPressurePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventScreenDrag", "get_pressure", 1740695150)

    public val setPenInvertedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventScreenDrag", "set_pen_inverted", 2586408642)

    public val getPenInvertedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventScreenDrag", "get_pen_inverted", 36873697)

    public val setPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventScreenDrag", "set_position", 743155724)

    public val getPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventScreenDrag", "get_position", 3341600327)

    public val setRelativePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventScreenDrag", "set_relative", 743155724)

    public val getRelativePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventScreenDrag", "get_relative", 3341600327)

    public val setScreenRelativePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventScreenDrag", "set_screen_relative", 743155724)

    public val getScreenRelativePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventScreenDrag", "get_screen_relative", 3341600327)

    public val setVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventScreenDrag", "set_velocity", 743155724)

    public val getVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventScreenDrag", "get_velocity", 3341600327)

    public val setScreenVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventScreenDrag", "set_screen_velocity", 743155724)

    public val getScreenVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventScreenDrag", "get_screen_velocity", 3341600327)
  }
}
