// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.Quaternion
import godot.core.StringName
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.QUATERNION
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR3
import godot.core.Vector2
import godot.core.Vector3
import godot.core.memory.TransferContext
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * Holds data that can be used to animate anything in the engine.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/animation/index.html]($DOCS_URL/tutorials/animation/index.html)
 *
 * This resource holds data that can be used to animate anything in the engine. Animations are divided into tracks and each track must be linked to a node. The state of that node can be changed through time, by adding timed keys (events) to the track.
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * # This creates an animation that makes the node "Enemy" move to the right by
 *
 * # 100 pixels in 0.5 seconds.
 *
 * var animation = Animation.new()
 *
 * var track_index = animation.add_track(Animation.TYPE_VALUE)
 *
 * animation.track_set_path(track_index, "Enemy:position:x")
 *
 * animation.track_insert_key(track_index, 0.0, 0)
 *
 * animation.track_insert_key(track_index, 0.5, 100)
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * // This creates an animation that makes the node "Enemy" move to the right by
 *
 * // 100 pixels in 0.5 seconds.
 *
 * var animation = new Animation();
 *
 * int trackIndex = animation.AddTrack(Animation.TrackType.Value);
 *
 * animation.TrackSetPath(trackIndex, "Enemy:position:x");
 *
 * animation.TrackInsertKey(trackIndex, 0.0f, 0);
 *
 * animation.TrackInsertKey(trackIndex, 0.5f, 100);
 *
 * [/csharp]
 *
 * [/codeblocks]
 *
 * Animations are just data containers, and must be added to nodes such as an [godot.AnimationPlayer] to be played back. Animation tracks have different types, each with its own set of dedicated methods. Check [enum TrackType] to see available types.
 *
 * **Note:** For 3D position/rotation/scale, using the dedicated [godot.TYPE_POSITION_3D], [godot.TYPE_ROTATION_3D] and [godot.TYPE_SCALE_3D] track types instead of [TYPE_VALUE] is recommended for performance reasons.
 */
@GodotBaseType
public open class Animation : Resource() {
  /**
   * The total length of the animation (in seconds).
   *
   * **Note:** Length is not delimited by the last key, as this one may be before or after the end to ensure correct interpolation and looping.
   */
  public var length: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_GET_LENGTH, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_SET_LENGTH, NIL)
    }

  /**
   * Determines the behavior of both ends of the animation timeline during animation playback. This is used for correct interpolation of animation cycles, and for hinting the player that it must restart the animation.
   */
  public var loopMode: LoopMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_GET_LOOP_MODE, LONG)
      return Animation.LoopMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_SET_LOOP_MODE, NIL)
    }

  /**
   * The animation step value.
   */
  public var step: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_GET_STEP, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_SET_STEP, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ANIMATION, scriptIndex)
    return true
  }

  /**
   * Adds a track to the Animation.
   */
  @JvmOverloads
  public fun addTrack(type: TrackType, atPosition: Int = -1): Int {
    TransferContext.writeArguments(LONG to type.id, LONG to atPosition.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_ADD_TRACK, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Removes a track by specifying the track index.
   */
  public fun removeTrack(trackIdx: Int): Unit {
    TransferContext.writeArguments(LONG to trackIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_REMOVE_TRACK, NIL)
  }

  /**
   * Returns the amount of tracks in the animation.
   */
  public fun getTrackCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_GET_TRACK_COUNT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Gets the type of a track.
   */
  public fun trackGetType(trackIdx: Int): TrackType {
    TransferContext.writeArguments(LONG to trackIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_GET_TYPE, LONG)
    return Animation.TrackType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Gets the path of a track. For more information on the path format, see [trackSetPath].
   */
  public fun trackGetPath(trackIdx: Int): NodePath {
    TransferContext.writeArguments(LONG to trackIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_GET_PATH, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
  }

  /**
   * Sets the path of a track. Paths must be valid scene-tree paths to a node and must be specified starting from the parent node of the node that will reproduce the animation. Tracks that control properties or bones must append their name after the path, separated by `":"`.
   *
   * For example, `"character/skeleton:ankle"` or `"character/mesh:transform/local"`.
   */
  public fun trackSetPath(trackIdx: Int, path: NodePath): Unit {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), NODE_PATH to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_SET_PATH, NIL)
  }

  /**
   * Returns the index of the specified track. If the track is not found, return -1.
   */
  public fun findTrack(path: NodePath, type: TrackType): Int {
    TransferContext.writeArguments(NODE_PATH to path, LONG to type.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_FIND_TRACK, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Moves a track up.
   */
  public fun trackMoveUp(trackIdx: Int): Unit {
    TransferContext.writeArguments(LONG to trackIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_MOVE_UP, NIL)
  }

  /**
   * Moves a track down.
   */
  public fun trackMoveDown(trackIdx: Int): Unit {
    TransferContext.writeArguments(LONG to trackIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_MOVE_DOWN, NIL)
  }

  /**
   * Changes the index position of track [trackIdx] to the one defined in [toIdx].
   */
  public fun trackMoveTo(trackIdx: Int, toIdx: Int): Unit {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to toIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_MOVE_TO, NIL)
  }

  /**
   * Swaps the track [trackIdx]'s index position with the track [withIdx].
   */
  public fun trackSwap(trackIdx: Int, withIdx: Int): Unit {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to withIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_SWAP, NIL)
  }

  /**
   * Sets the given track as imported or not.
   */
  public fun trackSetImported(trackIdx: Int, imported: Boolean): Unit {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), BOOL to imported)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_SET_IMPORTED, NIL)
  }

  /**
   * Returns `true` if the given track is imported. Else, return `false`.
   */
  public fun trackIsImported(trackIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to trackIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_IS_IMPORTED, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Enables/disables the given track. Tracks are enabled by default.
   */
  public fun trackSetEnabled(trackIdx: Int, enabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_SET_ENABLED, NIL)
  }

  /**
   * Returns `true` if the track at index [trackIdx] is enabled.
   */
  public fun trackIsEnabled(trackIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to trackIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_IS_ENABLED, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Inserts a key in a given 3D position track. Returns the key index.
   */
  public fun positionTrackInsertKey(
    trackIdx: Int,
    time: Double,
    position: Vector3,
  ): Int {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), DOUBLE to time, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_POSITION_TRACK_INSERT_KEY,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Inserts a key in a given 3D rotation track. Returns the key index.
   */
  public fun rotationTrackInsertKey(
    trackIdx: Int,
    time: Double,
    rotation: Quaternion,
  ): Int {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), DOUBLE to time, QUATERNION to rotation)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_ROTATION_TRACK_INSERT_KEY,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Inserts a key in a given 3D scale track. Returns the key index.
   */
  public fun scaleTrackInsertKey(
    trackIdx: Int,
    time: Double,
    scale: Vector3,
  ): Int {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), DOUBLE to time, VECTOR3 to scale)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_SCALE_TRACK_INSERT_KEY,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Inserts a key in a given blend shape track. Returns the key index.
   */
  public fun blendShapeTrackInsertKey(
    trackIdx: Int,
    time: Double,
    amount: Float,
  ): Int {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), DOUBLE to time, DOUBLE to amount.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_BLEND_SHAPE_TRACK_INSERT_KEY, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the interpolated position value at the given time (in seconds). The [trackIdx] must be the index of a 3D position track.
   */
  public fun positionTrackInterpolate(trackIdx: Int, timeSec: Double): Vector3 {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), DOUBLE to timeSec)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_POSITION_TRACK_INTERPOLATE, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Returns the interpolated rotation value at the given time (in seconds). The [trackIdx] must be the index of a 3D rotation track.
   */
  public fun rotationTrackInterpolate(trackIdx: Int, timeSec: Double): Quaternion {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), DOUBLE to timeSec)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_ROTATION_TRACK_INTERPOLATE, QUATERNION)
    return (TransferContext.readReturnValue(QUATERNION, false) as Quaternion)
  }

  /**
   * Returns the interpolated scale value at the given time (in seconds). The [trackIdx] must be the index of a 3D scale track.
   */
  public fun scaleTrackInterpolate(trackIdx: Int, timeSec: Double): Vector3 {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), DOUBLE to timeSec)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_SCALE_TRACK_INTERPOLATE,
        VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Returns the interpolated blend shape value at the given time (in seconds). The [trackIdx] must be the index of a blend shape track.
   */
  public fun blendShapeTrackInterpolate(trackIdx: Int, timeSec: Double): Float {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), DOUBLE to timeSec)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_BLEND_SHAPE_TRACK_INTERPOLATE, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Inserts a generic key in a given track. Returns the key index.
   */
  @JvmOverloads
  public fun trackInsertKey(
    trackIdx: Int,
    time: Double,
    key: Any?,
    transition: Float = 1.0f,
  ): Int {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), DOUBLE to time, ANY to key, DOUBLE to transition.toDouble())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_INSERT_KEY, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Removes a key by index in a given track.
   */
  public fun trackRemoveKey(trackIdx: Int, keyIdx: Int): Unit {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_REMOVE_KEY, NIL)
  }

  /**
   * Removes a key at [time] in a given track.
   */
  public fun trackRemoveKeyAtTime(trackIdx: Int, time: Double): Unit {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), DOUBLE to time)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_REMOVE_KEY_AT_TIME,
        NIL)
  }

  /**
   * Sets the value of an existing key.
   */
  public fun trackSetKeyValue(
    trackIdx: Int,
    key: Int,
    `value`: Any?,
  ): Unit {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to key.toLong(), ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_SET_KEY_VALUE, NIL)
  }

  /**
   * Sets the transition curve (easing) for a specific key (see the built-in math function [@GlobalScope.ease]).
   */
  public fun trackSetKeyTransition(
    trackIdx: Int,
    keyIdx: Int,
    transition: Float,
  ): Unit {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong(), DOUBLE to transition.toDouble())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_SET_KEY_TRANSITION,
        NIL)
  }

  /**
   * Sets the time of an existing key.
   */
  public fun trackSetKeyTime(
    trackIdx: Int,
    keyIdx: Int,
    time: Double,
  ): Unit {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong(), DOUBLE to time)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_SET_KEY_TIME, NIL)
  }

  /**
   * Returns the transition curve (easing) for a specific key (see the built-in math function [@GlobalScope.ease]).
   */
  public fun trackGetKeyTransition(trackIdx: Int, keyIdx: Int): Float {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_GET_KEY_TRANSITION,
        DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the number of keys in a given track.
   */
  public fun trackGetKeyCount(trackIdx: Int): Int {
    TransferContext.writeArguments(LONG to trackIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_GET_KEY_COUNT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the value of a given key in a given track.
   */
  public fun trackGetKeyValue(trackIdx: Int, keyIdx: Int): Any? {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_GET_KEY_VALUE, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Returns the time at which the key is located.
   */
  public fun trackGetKeyTime(trackIdx: Int, keyIdx: Int): Double {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_GET_KEY_TIME,
        DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  /**
   * Finds the key index by time in a given track. Optionally, only find it if the approx/exact time is given.
   */
  @JvmOverloads
  public fun trackFindKey(
    trackIdx: Int,
    time: Double,
    findMode: FindMode = Animation.FindMode.FIND_MODE_NEAREST,
  ): Int {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), DOUBLE to time, LONG to findMode.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_FIND_KEY, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the interpolation type of a given track.
   */
  public fun trackSetInterpolationType(trackIdx: Int, interpolation: InterpolationType): Unit {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to interpolation.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_SET_INTERPOLATION_TYPE, NIL)
  }

  /**
   * Returns the interpolation type of a given track.
   */
  public fun trackGetInterpolationType(trackIdx: Int): InterpolationType {
    TransferContext.writeArguments(LONG to trackIdx.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_GET_INTERPOLATION_TYPE, LONG)
    return Animation.InterpolationType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * If `true`, the track at [trackIdx] wraps the interpolation loop.
   */
  public fun trackSetInterpolationLoopWrap(trackIdx: Int, interpolation: Boolean): Unit {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), BOOL to interpolation)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_SET_INTERPOLATION_LOOP_WRAP, NIL)
  }

  /**
   * Returns `true` if the track at [trackIdx] wraps the interpolation loop. New tracks wrap the interpolation loop by default.
   */
  public fun trackGetInterpolationLoopWrap(trackIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to trackIdx.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_GET_INTERPOLATION_LOOP_WRAP, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if the track is compressed, `false` otherwise. See also [compress].
   */
  public fun trackIsCompressed(trackIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to trackIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_IS_COMPRESSED, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the update mode (see [enum UpdateMode]) of a value track.
   */
  public fun valueTrackSetUpdateMode(trackIdx: Int, mode: UpdateMode): Unit {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to mode.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_VALUE_TRACK_SET_UPDATE_MODE, NIL)
  }

  /**
   * Returns the update mode of a value track.
   */
  public fun valueTrackGetUpdateMode(trackIdx: Int): UpdateMode {
    TransferContext.writeArguments(LONG to trackIdx.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_VALUE_TRACK_GET_UPDATE_MODE, LONG)
    return Animation.UpdateMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the interpolated value at the given time (in seconds). The [trackIdx] must be the index of a value track.
   */
  public fun valueTrackInterpolate(trackIdx: Int, timeSec: Double): Any? {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), DOUBLE to timeSec)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_VALUE_TRACK_INTERPOLATE,
        ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Returns the method name of a method track.
   */
  public fun methodTrackGetName(trackIdx: Int, keyIdx: Int): StringName {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_METHOD_TRACK_GET_NAME,
        STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  /**
   * Returns the arguments values to be called on a method track for a given key in a given track.
   */
  public fun methodTrackGetParams(trackIdx: Int, keyIdx: Int): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_METHOD_TRACK_GET_PARAMS,
        ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  /**
   * Inserts a Bezier Track key at the given [time] in seconds. The [trackIdx] must be the index of a Bezier Track.
   *
   * [inHandle] is the left-side weight of the added Bezier curve point, [outHandle] is the right-side one, while [value] is the actual value at this point.
   */
  @JvmOverloads
  public fun bezierTrackInsertKey(
    trackIdx: Int,
    time: Double,
    `value`: Float,
    inHandle: Vector2 = Vector2(0, 0),
    outHandle: Vector2 = Vector2(0, 0),
  ): Int {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), DOUBLE to time, DOUBLE to value.toDouble(), VECTOR2 to inHandle, VECTOR2 to outHandle)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_BEZIER_TRACK_INSERT_KEY,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the value of the key identified by [keyIdx] to the given value. The [trackIdx] must be the index of a Bezier Track.
   */
  public fun bezierTrackSetKeyValue(
    trackIdx: Int,
    keyIdx: Int,
    `value`: Float,
  ): Unit {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong(), DOUBLE to value.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_BEZIER_TRACK_SET_KEY_VALUE, NIL)
  }

  /**
   * Sets the in handle of the key identified by [keyIdx] to value [inHandle]. The [trackIdx] must be the index of a Bezier Track.
   */
  @JvmOverloads
  public fun bezierTrackSetKeyInHandle(
    trackIdx: Int,
    keyIdx: Int,
    inHandle: Vector2,
    balancedValueTimeRatio: Float = 1.0f,
  ): Unit {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong(), VECTOR2 to inHandle, DOUBLE to balancedValueTimeRatio.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_BEZIER_TRACK_SET_KEY_IN_HANDLE, NIL)
  }

  /**
   * Sets the out handle of the key identified by [keyIdx] to value [outHandle]. The [trackIdx] must be the index of a Bezier Track.
   */
  @JvmOverloads
  public fun bezierTrackSetKeyOutHandle(
    trackIdx: Int,
    keyIdx: Int,
    outHandle: Vector2,
    balancedValueTimeRatio: Float = 1.0f,
  ): Unit {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong(), VECTOR2 to outHandle, DOUBLE to balancedValueTimeRatio.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_BEZIER_TRACK_SET_KEY_OUT_HANDLE, NIL)
  }

  /**
   * Returns the value of the key identified by [keyIdx]. The [trackIdx] must be the index of a Bezier Track.
   */
  public fun bezierTrackGetKeyValue(trackIdx: Int, keyIdx: Int): Float {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_BEZIER_TRACK_GET_KEY_VALUE, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the in handle of the key identified by [keyIdx]. The [trackIdx] must be the index of a Bezier Track.
   */
  public fun bezierTrackGetKeyInHandle(trackIdx: Int, keyIdx: Int): Vector2 {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_BEZIER_TRACK_GET_KEY_IN_HANDLE, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns the out handle of the key identified by [keyIdx]. The [trackIdx] must be the index of a Bezier Track.
   */
  public fun bezierTrackGetKeyOutHandle(trackIdx: Int, keyIdx: Int): Vector2 {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_BEZIER_TRACK_GET_KEY_OUT_HANDLE, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns the interpolated value at the given [time] (in seconds). The [trackIdx] must be the index of a Bezier Track.
   */
  public fun bezierTrackInterpolate(trackIdx: Int, time: Double): Float {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), DOUBLE to time)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_BEZIER_TRACK_INTERPOLATE,
        DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Inserts an Audio Track key at the given [time] in seconds. The [trackIdx] must be the index of an Audio Track.
   *
   * [stream] is the [godot.AudioStream] resource to play. [startOffset] is the number of seconds cut off at the beginning of the audio stream, while [endOffset] is at the ending.
   */
  @JvmOverloads
  public fun audioTrackInsertKey(
    trackIdx: Int,
    time: Double,
    stream: Resource,
    startOffset: Float = 0.0f,
    endOffset: Float = 0.0f,
  ): Int {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), DOUBLE to time, OBJECT to stream, DOUBLE to startOffset.toDouble(), DOUBLE to endOffset.toDouble())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_AUDIO_TRACK_INSERT_KEY,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the stream of the key identified by [keyIdx] to value [stream]. The [trackIdx] must be the index of an Audio Track.
   */
  public fun audioTrackSetKeyStream(
    trackIdx: Int,
    keyIdx: Int,
    stream: Resource,
  ): Unit {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong(), OBJECT to stream)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_AUDIO_TRACK_SET_KEY_STREAM, NIL)
  }

  /**
   * Sets the start offset of the key identified by [keyIdx] to value [offset]. The [trackIdx] must be the index of an Audio Track.
   */
  public fun audioTrackSetKeyStartOffset(
    trackIdx: Int,
    keyIdx: Int,
    offset: Float,
  ): Unit {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong(), DOUBLE to offset.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_AUDIO_TRACK_SET_KEY_START_OFFSET, NIL)
  }

  /**
   * Sets the end offset of the key identified by [keyIdx] to value [offset]. The [trackIdx] must be the index of an Audio Track.
   */
  public fun audioTrackSetKeyEndOffset(
    trackIdx: Int,
    keyIdx: Int,
    offset: Float,
  ): Unit {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong(), DOUBLE to offset.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_AUDIO_TRACK_SET_KEY_END_OFFSET, NIL)
  }

  /**
   * Returns the audio stream of the key identified by [keyIdx]. The [trackIdx] must be the index of an Audio Track.
   */
  public fun audioTrackGetKeyStream(trackIdx: Int, keyIdx: Int): Resource? {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_AUDIO_TRACK_GET_KEY_STREAM, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Resource?)
  }

  /**
   * Returns the start offset of the key identified by [keyIdx]. The [trackIdx] must be the index of an Audio Track.
   *
   * Start offset is the number of seconds cut off at the beginning of the audio stream.
   */
  public fun audioTrackGetKeyStartOffset(trackIdx: Int, keyIdx: Int): Float {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_AUDIO_TRACK_GET_KEY_START_OFFSET, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the end offset of the key identified by [keyIdx]. The [trackIdx] must be the index of an Audio Track.
   *
   * End offset is the number of seconds cut off at the ending of the audio stream.
   */
  public fun audioTrackGetKeyEndOffset(trackIdx: Int, keyIdx: Int): Float {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_AUDIO_TRACK_GET_KEY_END_OFFSET, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Sets whether the track will be blended with other animations. If `true`, the audio playback volume changes depending on the blend value.
   */
  public fun audioTrackSetUseBlend(trackIdx: Int, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_AUDIO_TRACK_SET_USE_BLEND,
        NIL)
  }

  /**
   * Returns `true` if the track at [trackIdx] will be blended with other animations.
   */
  public fun audioTrackIsUseBlend(trackIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to trackIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_AUDIO_TRACK_IS_USE_BLEND,
        BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Inserts a key with value [animation] at the given [time] (in seconds). The [trackIdx] must be the index of an Animation Track.
   */
  public fun animationTrackInsertKey(
    trackIdx: Int,
    time: Double,
    animation: StringName,
  ): Int {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), DOUBLE to time, STRING_NAME to animation)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_ANIMATION_TRACK_INSERT_KEY, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the key identified by [keyIdx] to value [animation]. The [trackIdx] must be the index of an Animation Track.
   */
  public fun animationTrackSetKeyAnimation(
    trackIdx: Int,
    keyIdx: Int,
    animation: StringName,
  ): Unit {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong(), STRING_NAME to animation)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_ANIMATION_TRACK_SET_KEY_ANIMATION, NIL)
  }

  /**
   * Returns the animation name at the key identified by [keyIdx]. The [trackIdx] must be the index of an Animation Track.
   */
  public fun animationTrackGetKeyAnimation(trackIdx: Int, keyIdx: Int): StringName {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_ANIMATION_TRACK_GET_KEY_ANIMATION, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  /**
   * Clear the animation (clear all tracks and reset all).
   */
  public fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_CLEAR, NIL)
  }

  /**
   * Adds a new track to [toAnimation] that is a copy of the given track from this animation.
   */
  public fun copyTrack(trackIdx: Int, toAnimation: Animation): Unit {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), OBJECT to toAnimation)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_COPY_TRACK, NIL)
  }

  /**
   * Compress the animation and all its tracks in-place. This will make [trackIsCompressed] return `true` once called on this [godot.Animation]. Compressed tracks require less memory to be played, and are designed to be used for complex 3D animations (such as cutscenes) imported from external 3D software. Compression is lossy, but the difference is usually not noticeable in real world conditions.
   *
   * **Note:** Compressed tracks have various limitations (such as not being editable from the editor), so only use compressed animations if you actually need them.
   */
  @JvmOverloads
  public fun compress(
    pageSize: Long = 8192,
    fps: Long = 120,
    splitTolerance: Float = 4.0f,
  ): Unit {
    TransferContext.writeArguments(LONG to pageSize, LONG to fps, DOUBLE to splitTolerance.toDouble())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_COMPRESS, NIL)
  }

  public enum class TrackType(
    id: Long,
  ) {
    /**
     * Value tracks set values in node properties, but only those which can be interpolated. For 3D position/rotation/scale, using the dedicated [godot.TYPE_POSITION_3D], [godot.TYPE_ROTATION_3D] and [godot.TYPE_SCALE_3D] track types instead of [TYPE_VALUE] is recommended for performance reasons.
     */
    TYPE_VALUE(0),
    /**
     * 3D position track (values are stored in [godot.core.Vector3]s).
     */
    TYPE_POSITION_3D(1),
    /**
     * 3D rotation track (values are stored in [godot.Quaternion]s).
     */
    TYPE_ROTATION_3D(2),
    /**
     * 3D scale track (values are stored in [godot.core.Vector3]s).
     */
    TYPE_SCALE_3D(3),
    /**
     * Blend shape track.
     */
    TYPE_BLEND_SHAPE(4),
    /**
     * Method tracks call functions with given arguments per key.
     */
    TYPE_METHOD(5),
    /**
     * Bezier tracks are used to interpolate a value using custom curves. They can also be used to animate sub-properties of vectors and colors (e.g. alpha value of a [godot.core.Color]).
     */
    TYPE_BEZIER(6),
    /**
     * Audio tracks are used to play an audio stream with either type of [godot.AudioStreamPlayer]. The stream can be trimmed and previewed in the animation.
     */
    TYPE_AUDIO(7),
    /**
     * Animation tracks play animations in other [godot.AnimationPlayer] nodes.
     */
    TYPE_ANIMATION(8),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class InterpolationType(
    id: Long,
  ) {
    /**
     * No interpolation (nearest value).
     */
    INTERPOLATION_NEAREST(0),
    /**
     * Linear interpolation.
     */
    INTERPOLATION_LINEAR(1),
    /**
     * Cubic interpolation. This looks smoother than linear interpolation, but is more expensive to interpolate. Stick to [INTERPOLATION_LINEAR] for complex 3D animations imported from external software, even if it requires using a higher animation framerate in return.
     */
    INTERPOLATION_CUBIC(2),
    /**
     * Linear interpolation with shortest path rotation.
     *
     * **Note:** The result value is always normalized and may not match the key value.
     */
    INTERPOLATION_LINEAR_ANGLE(3),
    /**
     * Cubic interpolation with shortest path rotation.
     *
     * **Note:** The result value is always normalized and may not match the key value.
     */
    INTERPOLATION_CUBIC_ANGLE(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class UpdateMode(
    id: Long,
  ) {
    /**
     * Update between keyframes and hold the value.
     */
    UPDATE_CONTINUOUS(0),
    /**
     * Update at the keyframes.
     */
    UPDATE_DISCRETE(1),
    /**
     * Same as linear interpolation, but also interpolates from the current value (i.e. dynamically at runtime) if the first key isn't at 0 seconds.
     */
    UPDATE_CAPTURE(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class LoopMode(
    id: Long,
  ) {
    /**
     * At both ends of the animation, the animation will stop playing.
     */
    LOOP_NONE(0),
    /**
     * At both ends of the animation, the animation will be repeated without changing the playback direction.
     */
    LOOP_LINEAR(1),
    /**
     * Repeats playback and reverse playback at both ends of the animation.
     */
    LOOP_PINGPONG(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class LoopedFlag(
    id: Long,
  ) {
    /**
     * This flag indicates that the animation proceeds without any looping.
     */
    LOOPED_FLAG_NONE(0),
    /**
     * This flag indicates that the animation has reached the end of the animation and just after loop processed.
     */
    LOOPED_FLAG_END(1),
    /**
     * This flag indicates that the animation has reached the start of the animation and just after loop processed.
     */
    LOOPED_FLAG_START(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class FindMode(
    id: Long,
  ) {
    /**
     * Finds the nearest time key.
     */
    FIND_MODE_NEAREST(0),
    /**
     * Finds only the key with approximating the time.
     */
    FIND_MODE_APPROX(1),
    /**
     * Finds only the key with matching the time.
     */
    FIND_MODE_EXACT(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object
}
