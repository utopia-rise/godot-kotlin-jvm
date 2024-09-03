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
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Stores information about a mouse or a pen motion. This includes relative position, absolute
 * position, and velocity. See [Node.Input].
 * **Note:** By default, this event is only emitted once per frame rendered at most. If you need
 * more precise input reporting, set [Input.useAccumulatedInput] to `false` to make events emitted as
 * often as possible. If you use InputEventMouseMotion to draw lines, consider implementing
 * [url=https://en.wikipedia.org/wiki/Bresenham&#37;27s_line_algorithm]Bresenham's line algorithm[/url]
 * as well to avoid visible gaps in lines if the user is moving the mouse quickly.
 */
@GodotBaseType
public open class InputEventMouseMotion : InputEventMouse() {
  /**
   * Represents the angles of tilt of the pen. Positive X-coordinate value indicates a tilt to the
   * right. Positive Y-coordinate value indicates a tilt toward the user. Ranges from `-1.0` to `1.0`
   * for both axes.
   */
  @CoreTypeLocalCopy
  public final inline var tilt: Vector2
    @JvmName("tiltProperty")
    get() = getTilt()
    @JvmName("tiltProperty")
    set(`value`) {
      setTilt(value)
    }

  /**
   * Represents the pressure the user puts on the pen. Ranges from `0.0` to `1.0`.
   */
  public final inline var pressure: Float
    @JvmName("pressureProperty")
    get() = getPressure()
    @JvmName("pressureProperty")
    set(`value`) {
      setPressure(value)
    }

  /**
   * Returns `true` when using the eraser end of a stylus pen.
   * **Note:** This property is implemented on Linux, macOS and Windows.
   */
  public final inline var penInverted: Boolean
    @JvmName("penInvertedProperty")
    get() = getPenInverted()
    @JvmName("penInvertedProperty")
    set(`value`) {
      setPenInverted(value)
    }

  /**
   * The mouse position relative to the previous position (position at the last frame).
   * **Note:** Since [InputEventMouseMotion] is only emitted when the mouse moves, the last event
   * won't have a relative position of `Vector2(0, 0)` when the user stops moving the mouse.
   * **Note:** [relative] is automatically scaled according to the content scale factor, which is
   * defined by the project's stretch mode settings. This means mouse sensitivity will appear different
   * depending on resolution when using [relative] in a script that handles mouse aiming with the
   * [Input.MOUSE_MODE_CAPTURED] mouse mode. To avoid this, use [screenRelative] instead.
   */
  @CoreTypeLocalCopy
  public final inline var relative: Vector2
    @JvmName("relativeProperty")
    get() = getRelative()
    @JvmName("relativeProperty")
    set(`value`) {
      setRelative(value)
    }

  /**
   * The unscaled mouse position relative to the previous position in the coordinate system of the
   * screen (position at the last frame).
   * **Note:** Since [InputEventMouseMotion] is only emitted when the mouse moves, the last event
   * won't have a relative position of `Vector2(0, 0)` when the user stops moving the mouse. This
   * coordinate is *not* scaled according to the content scale factor or calls to
   * [InputEvent.xformedBy]. This should be preferred over [relative] for mouse aiming when using the
   * [Input.MOUSE_MODE_CAPTURED] mouse mode, regardless of the project's stretch mode.
   */
  @CoreTypeLocalCopy
  public final inline var screenRelative: Vector2
    @JvmName("screenRelativeProperty")
    get() = getScreenRelative()
    @JvmName("screenRelativeProperty")
    set(`value`) {
      setScreenRelative(value)
    }

  /**
   * The mouse velocity in pixels per second.
   * **Note:** [velocity] is automatically scaled according to the content scale factor, which is
   * defined by the project's stretch mode settings. This means mouse sensitivity will appear different
   * depending on resolution when using [velocity] in a script that handles mouse aiming with the
   * [Input.MOUSE_MODE_CAPTURED] mouse mode. To avoid this, use [screenVelocity] instead.
   */
  @CoreTypeLocalCopy
  public final inline var velocity: Vector2
    @JvmName("velocityProperty")
    get() = getVelocity()
    @JvmName("velocityProperty")
    set(`value`) {
      setVelocity(value)
    }

  /**
   * The unscaled mouse velocity in pixels per second in screen coordinates. This velocity is *not*
   * scaled according to the content scale factor or calls to [InputEvent.xformedBy]. This should be
   * preferred over [velocity] for mouse aiming when using the [Input.MOUSE_MODE_CAPTURED] mouse mode,
   * regardless of the project's stretch mode.
   */
  @CoreTypeLocalCopy
  public final inline var screenVelocity: Vector2
    @JvmName("screenVelocityProperty")
    get() = getScreenVelocity()
    @JvmName("screenVelocityProperty")
    set(`value`) {
      setScreenVelocity(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_INPUTEVENTMOUSEMOTION, scriptIndex)
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
   * val myCoreType = inputeventmousemotion.tilt
   * //Your changes
   * inputeventmousemotion.tilt = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun tiltMutate(block: Vector2.() -> Unit): Vector2 = tilt.apply{
      block(this)
      tilt = this
  }


  /**
   * The mouse position relative to the previous position (position at the last frame).
   * **Note:** Since [InputEventMouseMotion] is only emitted when the mouse moves, the last event
   * won't have a relative position of `Vector2(0, 0)` when the user stops moving the mouse.
   * **Note:** [relative] is automatically scaled according to the content scale factor, which is
   * defined by the project's stretch mode settings. This means mouse sensitivity will appear different
   * depending on resolution when using [relative] in a script that handles mouse aiming with the
   * [Input.MOUSE_MODE_CAPTURED] mouse mode. To avoid this, use [screenRelative] instead.
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
   * val myCoreType = inputeventmousemotion.relative
   * //Your changes
   * inputeventmousemotion.relative = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun relativeMutate(block: Vector2.() -> Unit): Vector2 = relative.apply{
      block(this)
      relative = this
  }


  /**
   * The unscaled mouse position relative to the previous position in the coordinate system of the
   * screen (position at the last frame).
   * **Note:** Since [InputEventMouseMotion] is only emitted when the mouse moves, the last event
   * won't have a relative position of `Vector2(0, 0)` when the user stops moving the mouse. This
   * coordinate is *not* scaled according to the content scale factor or calls to
   * [InputEvent.xformedBy]. This should be preferred over [relative] for mouse aiming when using the
   * [Input.MOUSE_MODE_CAPTURED] mouse mode, regardless of the project's stretch mode.
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
   * val myCoreType = inputeventmousemotion.screenRelative
   * //Your changes
   * inputeventmousemotion.screenRelative = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun screenRelativeMutate(block: Vector2.() -> Unit): Vector2 = screenRelative.apply{
      block(this)
      screenRelative = this
  }


  /**
   * The mouse velocity in pixels per second.
   * **Note:** [velocity] is automatically scaled according to the content scale factor, which is
   * defined by the project's stretch mode settings. This means mouse sensitivity will appear different
   * depending on resolution when using [velocity] in a script that handles mouse aiming with the
   * [Input.MOUSE_MODE_CAPTURED] mouse mode. To avoid this, use [screenVelocity] instead.
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
   * val myCoreType = inputeventmousemotion.velocity
   * //Your changes
   * inputeventmousemotion.velocity = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun velocityMutate(block: Vector2.() -> Unit): Vector2 = velocity.apply{
      block(this)
      velocity = this
  }


  /**
   * The unscaled mouse velocity in pixels per second in screen coordinates. This velocity is *not*
   * scaled according to the content scale factor or calls to [InputEvent.xformedBy]. This should be
   * preferred over [velocity] for mouse aiming when using the [Input.MOUSE_MODE_CAPTURED] mouse mode,
   * regardless of the project's stretch mode.
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
   * val myCoreType = inputeventmousemotion.screenVelocity
   * //Your changes
   * inputeventmousemotion.screenVelocity = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun screenVelocityMutate(block: Vector2.() -> Unit): Vector2 = screenVelocity.apply{
      block(this)
      screenVelocity = this
  }


  public final fun setTilt(tilt: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to tilt)
    TransferContext.callMethod(rawPtr, MethodBindings.setTiltPtr, NIL)
  }

  public final fun getTilt(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTiltPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setPressure(pressure: Float): Unit {
    TransferContext.writeArguments(DOUBLE to pressure.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setPressurePtr, NIL)
  }

  public final fun getPressure(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPressurePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setPenInverted(penInverted: Boolean): Unit {
    TransferContext.writeArguments(BOOL to penInverted)
    TransferContext.callMethod(rawPtr, MethodBindings.setPenInvertedPtr, NIL)
  }

  public final fun getPenInverted(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPenInvertedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setRelative(relative: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to relative)
    TransferContext.callMethod(rawPtr, MethodBindings.setRelativePtr, NIL)
  }

  public final fun getRelative(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRelativePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setScreenRelative(relative: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to relative)
    TransferContext.callMethod(rawPtr, MethodBindings.setScreenRelativePtr, NIL)
  }

  public final fun getScreenRelative(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getScreenRelativePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setVelocity(velocity: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to velocity)
    TransferContext.callMethod(rawPtr, MethodBindings.setVelocityPtr, NIL)
  }

  public final fun getVelocity(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVelocityPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setScreenVelocity(velocity: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to velocity)
    TransferContext.callMethod(rawPtr, MethodBindings.setScreenVelocityPtr, NIL)
  }

  public final fun getScreenVelocity(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getScreenVelocityPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public companion object

  internal object MethodBindings {
    public val setTiltPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouseMotion", "set_tilt", 743155724)

    public val getTiltPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouseMotion", "get_tilt", 3341600327)

    public val setPressurePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouseMotion", "set_pressure", 373806689)

    public val getPressurePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouseMotion", "get_pressure", 1740695150)

    public val setPenInvertedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouseMotion", "set_pen_inverted", 2586408642)

    public val getPenInvertedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouseMotion", "get_pen_inverted", 36873697)

    public val setRelativePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouseMotion", "set_relative", 743155724)

    public val getRelativePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouseMotion", "get_relative", 3341600327)

    public val setScreenRelativePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouseMotion", "set_screen_relative", 743155724)

    public val getScreenRelativePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouseMotion", "get_screen_relative", 3341600327)

    public val setVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouseMotion", "set_velocity", 743155724)

    public val getVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouseMotion", "get_velocity", 3341600327)

    public val setScreenVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouseMotion", "set_screen_velocity", 743155724)

    public val getScreenVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMouseMotion", "get_screen_velocity", 3341600327)
  }
}
