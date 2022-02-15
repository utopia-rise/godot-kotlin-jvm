// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.Animation
import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.PackedInt32Array
import godot.core.Quaternion
import godot.core.StringName
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.QUATERNION
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR3
import godot.core.Vector2
import godot.core.Vector3
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Contains data used to animate everything in the engine.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/animation/index.html]($DOCS_URL/tutorials/animation/index.html)
 *
 * An Animation resource contains data used to animate everything in the engine. Animations are divided into tracks, and each track must be linked to a node. The state of that node can be changed through time, by adding timed keys (events) to the track.
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
 */
@GodotBaseType
public open class Animation : Resource() {
  /**
   * Emitted when there's a change in the list of tracks, e.g. tracks are added, moved or have changed paths.
   */
  public val tracksChanged: Signal0 by signal()

  /**
   * The total length of the animation (in seconds).
   *
   * **Note:** Length is not delimited by the last key, as this one may be before or after the end to ensure correct interpolation and looping.
   */
  public open var length: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_GET_LENGTH, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_SET_LENGTH, NIL)
    }

  /**
   * Determines the behavior of both ends of the animation timeline during animation playback. This is used for correct interpolation of animation cycles, and for hinting the player that it must restart the animation.
   */
  public open var loopMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_GET_LOOP_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_SET_LOOP_MODE, NIL)
    }

  /**
   * The animation step value.
   */
  public open var step: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_GET_STEP, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_SET_STEP, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_ANIMATION)
  }

  /**
   * Adds a track to the Animation.
   */
  public open fun addTrack(type: Animation.TrackType, atPosition: Long = -1): Long {
    TransferContext.writeArguments(LONG to type.id, LONG to atPosition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_ADD_TRACK, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Removes a track by specifying the track index.
   */
  public open fun removeTrack(trackIdx: Long): Unit {
    TransferContext.writeArguments(LONG to trackIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_REMOVE_TRACK, NIL)
  }

  /**
   * Returns the amount of tracks in the animation.
   */
  public open fun getTrackCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_GET_TRACK_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Gets the type of a track.
   */
  public open fun trackGetType(trackIdx: Long): Animation.TrackType {
    TransferContext.writeArguments(LONG to trackIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_GET_TYPE, LONG)
    return Animation.TrackType.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Gets the path of a track. For more information on the path format, see [trackSetPath].
   */
  public open fun trackGetPath(trackIdx: Long): NodePath {
    TransferContext.writeArguments(LONG to trackIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_GET_PATH, NODE_PATH)
    return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
  }

  /**
   * Sets the path of a track. Paths must be valid scene-tree paths to a node and must be specified starting from the parent node of the node that will reproduce the animation. Tracks that control properties or bones must append their name after the path, separated by `":"`.
   *
   * For example, `"character/skeleton:ankle"` or `"character/mesh:transform/local"`.
   */
  public open fun trackSetPath(trackIdx: Long, path: NodePath): Unit {
    TransferContext.writeArguments(LONG to trackIdx, NODE_PATH to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_SET_PATH, NIL)
  }

  /**
   * Returns the index of the specified track. If the track is not found, return -1.
   */
  public open fun findTrack(path: NodePath, type: Animation.TrackType): Long {
    TransferContext.writeArguments(NODE_PATH to path, LONG to type.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_FIND_TRACK, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Moves a track up.
   */
  public open fun trackMoveUp(trackIdx: Long): Unit {
    TransferContext.writeArguments(LONG to trackIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_MOVE_UP, NIL)
  }

  /**
   * Moves a track down.
   */
  public open fun trackMoveDown(trackIdx: Long): Unit {
    TransferContext.writeArguments(LONG to trackIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_MOVE_DOWN, NIL)
  }

  /**
   * Changes the index position of track `idx` to the one defined in `to_idx`.
   */
  public open fun trackMoveTo(trackIdx: Long, toIdx: Long): Unit {
    TransferContext.writeArguments(LONG to trackIdx, LONG to toIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_MOVE_TO, NIL)
  }

  /**
   * Swaps the track `idx`'s index position with the track `with_idx`.
   */
  public open fun trackSwap(trackIdx: Long, withIdx: Long): Unit {
    TransferContext.writeArguments(LONG to trackIdx, LONG to withIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_SWAP, NIL)
  }

  /**
   * Sets the given track as imported or not.
   */
  public open fun trackSetImported(trackIdx: Long, imported: Boolean): Unit {
    TransferContext.writeArguments(LONG to trackIdx, BOOL to imported)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_SET_IMPORTED, NIL)
  }

  /**
   * Returns `true` if the given track is imported. Else, return `false`.
   */
  public open fun trackIsImported(trackIdx: Long): Boolean {
    TransferContext.writeArguments(LONG to trackIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_IS_IMPORTED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Enables/disables the given track. Tracks are enabled by default.
   */
  public open fun trackSetEnabled(trackIdx: Long, enabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to trackIdx, BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_SET_ENABLED, NIL)
  }

  /**
   * Returns `true` if the track at index `idx` is enabled.
   */
  public open fun trackIsEnabled(trackIdx: Long): Boolean {
    TransferContext.writeArguments(LONG to trackIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_IS_ENABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  public open fun positionTrackInsertKey(
    trackIdx: Long,
    time: Double,
    position: Vector3
  ): Long {
    TransferContext.writeArguments(LONG to trackIdx, DOUBLE to time, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_POSITION_TRACK_INSERT_KEY,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public open fun rotationTrackInsertKey(
    trackIdx: Long,
    time: Double,
    rotation: Quaternion
  ): Long {
    TransferContext.writeArguments(LONG to trackIdx, DOUBLE to time, QUATERNION to rotation)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_ROTATION_TRACK_INSERT_KEY,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public open fun scaleTrackInsertKey(
    trackIdx: Long,
    time: Double,
    scale: Vector3
  ): Long {
    TransferContext.writeArguments(LONG to trackIdx, DOUBLE to time, VECTOR3 to scale)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_SCALE_TRACK_INSERT_KEY,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public open fun blendShapeTrackInsertKey(
    trackIdx: Long,
    time: Double,
    amount: Double
  ): Long {
    TransferContext.writeArguments(LONG to trackIdx, DOUBLE to time, DOUBLE to amount)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_BLEND_SHAPE_TRACK_INSERT_KEY, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Insert a generic key in a given track.
   */
  public open fun trackInsertKey(
    trackIdx: Long,
    time: Double,
    key: Any,
    transition: Double = 1.0
  ): Unit {
    TransferContext.writeArguments(LONG to trackIdx, DOUBLE to time, ANY to key, DOUBLE to
        transition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_INSERT_KEY, NIL)
  }

  /**
   * Removes a key by index in a given track.
   */
  public open fun trackRemoveKey(trackIdx: Long, keyIdx: Long): Unit {
    TransferContext.writeArguments(LONG to trackIdx, LONG to keyIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_REMOVE_KEY, NIL)
  }

  /**
   * Removes a key at `time` in a given track.
   */
  public open fun trackRemoveKeyAtTime(trackIdx: Long, time: Double): Unit {
    TransferContext.writeArguments(LONG to trackIdx, DOUBLE to time)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_REMOVE_KEY_AT_TIME,
        NIL)
  }

  /**
   * Sets the value of an existing key.
   */
  public open fun trackSetKeyValue(
    trackIdx: Long,
    key: Long,
    `value`: Any
  ): Unit {
    TransferContext.writeArguments(LONG to trackIdx, LONG to key, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_SET_KEY_VALUE, NIL)
  }

  /**
   * Sets the transition curve (easing) for a specific key (see the built-in math function [@GlobalScope.ease]).
   */
  public open fun trackSetKeyTransition(
    trackIdx: Long,
    keyIdx: Long,
    transition: Double
  ): Unit {
    TransferContext.writeArguments(LONG to trackIdx, LONG to keyIdx, DOUBLE to transition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_SET_KEY_TRANSITION,
        NIL)
  }

  /**
   * Sets the time of an existing key.
   */
  public open fun trackSetKeyTime(
    trackIdx: Long,
    keyIdx: Long,
    time: Double
  ): Unit {
    TransferContext.writeArguments(LONG to trackIdx, LONG to keyIdx, DOUBLE to time)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_SET_KEY_TIME, NIL)
  }

  /**
   * Returns the transition curve (easing) for a specific key (see the built-in math function [@GlobalScope.ease]).
   */
  public open fun trackGetKeyTransition(trackIdx: Long, keyIdx: Long): Double {
    TransferContext.writeArguments(LONG to trackIdx, LONG to keyIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_GET_KEY_TRANSITION,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the amount of keys in a given track.
   */
  public open fun trackGetKeyCount(trackIdx: Long): Long {
    TransferContext.writeArguments(LONG to trackIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_GET_KEY_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the value of a given key in a given track.
   */
  public open fun trackGetKeyValue(trackIdx: Long, keyIdx: Long): Any? {
    TransferContext.writeArguments(LONG to trackIdx, LONG to keyIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_GET_KEY_VALUE, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns the time at which the key is located.
   */
  public open fun trackGetKeyTime(trackIdx: Long, keyIdx: Long): Double {
    TransferContext.writeArguments(LONG to trackIdx, LONG to keyIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_GET_KEY_TIME,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Finds the key index by time in a given track. Optionally, only find it if the exact time is given.
   */
  public open fun trackFindKey(
    trackIdx: Long,
    time: Double,
    exact: Boolean = false
  ): Long {
    TransferContext.writeArguments(LONG to trackIdx, DOUBLE to time, BOOL to exact)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_FIND_KEY, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the interpolation type of a given track.
   */
  public open fun trackSetInterpolationType(trackIdx: Long,
      interpolation: Animation.InterpolationType): Unit {
    TransferContext.writeArguments(LONG to trackIdx, LONG to interpolation.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_SET_INTERPOLATION_TYPE, NIL)
  }

  /**
   * Returns the interpolation type of a given track.
   */
  public open fun trackGetInterpolationType(trackIdx: Long): Animation.InterpolationType {
    TransferContext.writeArguments(LONG to trackIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_GET_INTERPOLATION_TYPE, LONG)
    return Animation.InterpolationType.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * If `true`, the track at `idx` wraps the interpolation loop.
   */
  public open fun trackSetInterpolationLoopWrap(trackIdx: Long, interpolation: Boolean): Unit {
    TransferContext.writeArguments(LONG to trackIdx, BOOL to interpolation)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_SET_INTERPOLATION_LOOP_WRAP, NIL)
  }

  /**
   * Returns `true` if the track at `idx` wraps the interpolation loop. New tracks wrap the interpolation loop by default.
   */
  public open fun trackGetInterpolationLoopWrap(trackIdx: Long): Boolean {
    TransferContext.writeArguments(LONG to trackIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_GET_INTERPOLATION_LOOP_WRAP, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  public open fun trackIsCompressed(trackIdx: Long): Boolean {
    TransferContext.writeArguments(LONG to trackIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_IS_COMPRESSED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the update mode (see [enum UpdateMode]) of a value track.
   */
  public open fun valueTrackSetUpdateMode(trackIdx: Long, mode: Animation.UpdateMode): Unit {
    TransferContext.writeArguments(LONG to trackIdx, LONG to mode.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_VALUE_TRACK_SET_UPDATE_MODE, NIL)
  }

  /**
   * Returns the update mode of a value track.
   */
  public open fun valueTrackGetUpdateMode(trackIdx: Long): Animation.UpdateMode {
    TransferContext.writeArguments(LONG to trackIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_VALUE_TRACK_GET_UPDATE_MODE, LONG)
    return Animation.UpdateMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns all the key indices of a value track, given a position and delta time.
   */
  public open fun valueTrackGetKeyIndices(
    trackIdx: Long,
    timeSec: Double,
    delta: Double
  ): PackedInt32Array {
    TransferContext.writeArguments(LONG to trackIdx, DOUBLE to timeSec, DOUBLE to delta)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_VALUE_TRACK_GET_KEY_INDICES, PACKED_INT_32_ARRAY)
    return TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array
  }

  /**
   * Returns the interpolated value at the given time (in seconds). The `track_idx` must be the index of a value track.
   */
  public open fun valueTrackInterpolate(trackIdx: Long, timeSec: Double): Any? {
    TransferContext.writeArguments(LONG to trackIdx, DOUBLE to timeSec)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_VALUE_TRACK_INTERPOLATE,
        ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns all the key indices of a method track, given a position and delta time.
   */
  public open fun methodTrackGetKeyIndices(
    trackIdx: Long,
    timeSec: Double,
    delta: Double
  ): PackedInt32Array {
    TransferContext.writeArguments(LONG to trackIdx, DOUBLE to timeSec, DOUBLE to delta)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_METHOD_TRACK_GET_KEY_INDICES, PACKED_INT_32_ARRAY)
    return TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array
  }

  /**
   * Returns the method name of a method track.
   */
  public open fun methodTrackGetName(trackIdx: Long, keyIdx: Long): StringName {
    TransferContext.writeArguments(LONG to trackIdx, LONG to keyIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_METHOD_TRACK_GET_NAME,
        STRING_NAME)
    return TransferContext.readReturnValue(STRING_NAME, false) as StringName
  }

  /**
   * Returns the arguments values to be called on a method track for a given key in a given track.
   */
  public open fun methodTrackGetParams(trackIdx: Long, keyIdx: Long): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to trackIdx, LONG to keyIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_METHOD_TRACK_GET_PARAMS,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Inserts a Bezier Track key at the given `time` in seconds. The `track_idx` must be the index of a Bezier Track.
   *
   * `in_handle` is the left-side weight of the added Bezier curve point, `out_handle` is the right-side one, while `value` is the actual value at this point.
   */
  public open fun bezierTrackInsertKey(
    trackIdx: Long,
    time: Double,
    `value`: Double,
    inHandle: Vector2 = Vector2(0.0, 0.0),
    outHandle: Vector2 = Vector2(0.0, 0.0),
    handleMode: Animation.HandleMode = HandleMode.HANDLE_MODE_BALANCED
  ): Long {
    TransferContext.writeArguments(LONG to trackIdx, DOUBLE to time, DOUBLE to value, VECTOR2 to
        inHandle, VECTOR2 to outHandle, LONG to handleMode.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_BEZIER_TRACK_INSERT_KEY,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the value of the key identified by `key_idx` to the given value. The `track_idx` must be the index of a Bezier Track.
   */
  public open fun bezierTrackSetKeyValue(
    trackIdx: Long,
    keyIdx: Long,
    `value`: Double
  ): Unit {
    TransferContext.writeArguments(LONG to trackIdx, LONG to keyIdx, DOUBLE to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_BEZIER_TRACK_SET_KEY_VALUE, NIL)
  }

  /**
   * Sets the in handle of the key identified by `key_idx` to value `in_handle`. The `track_idx` must be the index of a Bezier Track.
   */
  public open fun bezierTrackSetKeyInHandle(
    trackIdx: Long,
    keyIdx: Long,
    inHandle: Vector2,
    balancedValueTimeRatio: Double = 1.0
  ): Unit {
    TransferContext.writeArguments(LONG to trackIdx, LONG to keyIdx, VECTOR2 to inHandle, DOUBLE to
        balancedValueTimeRatio)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_BEZIER_TRACK_SET_KEY_IN_HANDLE, NIL)
  }

  /**
   * Sets the out handle of the key identified by `key_idx` to value `out_handle`. The `track_idx` must be the index of a Bezier Track.
   */
  public open fun bezierTrackSetKeyOutHandle(
    trackIdx: Long,
    keyIdx: Long,
    outHandle: Vector2,
    balancedValueTimeRatio: Double = 1.0
  ): Unit {
    TransferContext.writeArguments(LONG to trackIdx, LONG to keyIdx, VECTOR2 to outHandle, DOUBLE to
        balancedValueTimeRatio)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_BEZIER_TRACK_SET_KEY_OUT_HANDLE, NIL)
  }

  /**
   * Returns the value of the key identified by `key_idx`. The `track_idx` must be the index of a Bezier Track.
   */
  public open fun bezierTrackGetKeyValue(trackIdx: Long, keyIdx: Long): Double {
    TransferContext.writeArguments(LONG to trackIdx, LONG to keyIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_BEZIER_TRACK_GET_KEY_VALUE, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the in handle of the key identified by `key_idx`. The `track_idx` must be the index of a Bezier Track.
   */
  public open fun bezierTrackGetKeyInHandle(trackIdx: Long, keyIdx: Long): Vector2 {
    TransferContext.writeArguments(LONG to trackIdx, LONG to keyIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_BEZIER_TRACK_GET_KEY_IN_HANDLE, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the out handle of the key identified by `key_idx`. The `track_idx` must be the index of a Bezier Track.
   */
  public open fun bezierTrackGetKeyOutHandle(trackIdx: Long, keyIdx: Long): Vector2 {
    TransferContext.writeArguments(LONG to trackIdx, LONG to keyIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_BEZIER_TRACK_GET_KEY_OUT_HANDLE, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the interpolated value at the given `time` (in seconds). The `track_idx` must be the index of a Bezier Track.
   */
  public open fun bezierTrackInterpolate(trackIdx: Long, time: Double): Double {
    TransferContext.writeArguments(LONG to trackIdx, DOUBLE to time)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_BEZIER_TRACK_INTERPOLATE,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Inserts an Audio Track key at the given `time` in seconds. The `track_idx` must be the index of an Audio Track.
   *
   * `stream` is the [godot.AudioStream] resource to play. `start_offset` is the number of seconds cut off at the beginning of the audio stream, while `end_offset` is at the ending.
   */
  public open fun audioTrackInsertKey(
    trackIdx: Long,
    time: Double,
    stream: Resource,
    startOffset: Double = 0.0,
    endOffset: Double = 0.0
  ): Long {
    TransferContext.writeArguments(LONG to trackIdx, DOUBLE to time, OBJECT to stream, DOUBLE to
        startOffset, DOUBLE to endOffset)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_AUDIO_TRACK_INSERT_KEY,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the stream of the key identified by `key_idx` to value `stream`. The `track_idx` must be the index of an Audio Track.
   */
  public open fun audioTrackSetKeyStream(
    trackIdx: Long,
    keyIdx: Long,
    stream: Resource
  ): Unit {
    TransferContext.writeArguments(LONG to trackIdx, LONG to keyIdx, OBJECT to stream)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_AUDIO_TRACK_SET_KEY_STREAM, NIL)
  }

  /**
   * Sets the start offset of the key identified by `key_idx` to value `offset`. The `track_idx` must be the index of an Audio Track.
   */
  public open fun audioTrackSetKeyStartOffset(
    trackIdx: Long,
    keyIdx: Long,
    offset: Double
  ): Unit {
    TransferContext.writeArguments(LONG to trackIdx, LONG to keyIdx, DOUBLE to offset)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_AUDIO_TRACK_SET_KEY_START_OFFSET, NIL)
  }

  /**
   * Sets the end offset of the key identified by `key_idx` to value `offset`. The `track_idx` must be the index of an Audio Track.
   */
  public open fun audioTrackSetKeyEndOffset(
    trackIdx: Long,
    keyIdx: Long,
    offset: Double
  ): Unit {
    TransferContext.writeArguments(LONG to trackIdx, LONG to keyIdx, DOUBLE to offset)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_AUDIO_TRACK_SET_KEY_END_OFFSET, NIL)
  }

  /**
   * Returns the audio stream of the key identified by `key_idx`. The `track_idx` must be the index of an Audio Track.
   */
  public open fun audioTrackGetKeyStream(trackIdx: Long, keyIdx: Long): Resource? {
    TransferContext.writeArguments(LONG to trackIdx, LONG to keyIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_AUDIO_TRACK_GET_KEY_STREAM, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Resource?
  }

  /**
   * Returns the start offset of the key identified by `key_idx`. The `track_idx` must be the index of an Audio Track.
   *
   * Start offset is the number of seconds cut off at the beginning of the audio stream.
   */
  public open fun audioTrackGetKeyStartOffset(trackIdx: Long, keyIdx: Long): Double {
    TransferContext.writeArguments(LONG to trackIdx, LONG to keyIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_AUDIO_TRACK_GET_KEY_START_OFFSET, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the end offset of the key identified by `key_idx`. The `track_idx` must be the index of an Audio Track.
   *
   * End offset is the number of seconds cut off at the ending of the audio stream.
   */
  public open fun audioTrackGetKeyEndOffset(trackIdx: Long, keyIdx: Long): Double {
    TransferContext.writeArguments(LONG to trackIdx, LONG to keyIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_AUDIO_TRACK_GET_KEY_END_OFFSET, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Changes the handle mode of the keyframe at the given `index`. See [enum HandleMode] for possible values. The `track_idx` must be the index of a Bezier Track.
   */
  public open fun bezierTrackSetKeyHandleMode(
    trackIdx: Long,
    keyIdx: Long,
    keyHandleMode: Animation.HandleMode,
    balancedValueTimeRatio: Double = 1.0
  ): Unit {
    TransferContext.writeArguments(LONG to trackIdx, LONG to keyIdx, LONG to keyHandleMode.id,
        DOUBLE to balancedValueTimeRatio)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_BEZIER_TRACK_SET_KEY_HANDLE_MODE, NIL)
  }

  /**
   * Returns the handle mode of the key identified by `index`. See [enum HandleMode] for possible values. The `track_idx` must be the index of a Bezier Track.
   */
  public open fun bezierTrackGetKeyHandleMode(trackIdx: Long, keyIdx: Long): Long {
    TransferContext.writeArguments(LONG to trackIdx, LONG to keyIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_BEZIER_TRACK_GET_KEY_HANDLE_MODE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Inserts a key with value `animation` at the given `time` (in seconds). The `track_idx` must be the index of an Animation Track.
   */
  public open fun animationTrackInsertKey(
    trackIdx: Long,
    time: Double,
    animation: StringName
  ): Long {
    TransferContext.writeArguments(LONG to trackIdx, DOUBLE to time, STRING_NAME to animation)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_ANIMATION_TRACK_INSERT_KEY, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the key identified by `key_idx` to value `animation`. The `track_idx` must be the index of an Animation Track.
   */
  public open fun animationTrackSetKeyAnimation(
    trackIdx: Long,
    keyIdx: Long,
    animation: StringName
  ): Unit {
    TransferContext.writeArguments(LONG to trackIdx, LONG to keyIdx, STRING_NAME to animation)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_ANIMATION_TRACK_SET_KEY_ANIMATION, NIL)
  }

  /**
   * Returns the animation name at the key identified by `key_idx`. The `track_idx` must be the index of an Animation Track.
   */
  public open fun animationTrackGetKeyAnimation(trackIdx: Long, keyIdx: Long): StringName {
    TransferContext.writeArguments(LONG to trackIdx, LONG to keyIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_ANIMATION_TRACK_GET_KEY_ANIMATION, STRING_NAME)
    return TransferContext.readReturnValue(STRING_NAME, false) as StringName
  }

  /**
   * Clear the animation (clear all tracks and reset all).
   */
  public open fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_CLEAR, NIL)
  }

  /**
   * Adds a new track that is a copy of the given track from `to_animation`.
   */
  public open fun copyTrack(trackIdx: Long, toAnimation: Animation): Unit {
    TransferContext.writeArguments(LONG to trackIdx, OBJECT to toAnimation)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_COPY_TRACK, NIL)
  }

  /**
   *
   */
  public open fun compress(
    pageSize: Long = 8192,
    fps: Long = 120,
    splitTolerance: Double = 4.0
  ): Unit {
    TransferContext.writeArguments(LONG to pageSize, LONG to fps, DOUBLE to splitTolerance)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_COMPRESS, NIL)
  }

  public enum class LoopMode(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class TrackType(
    id: Long
  ) {
    /**
     * Value tracks set values in node properties, but only those which can be Interpolated.
     */
    TYPE_VALUE(0),
    /**
     *
     */
    TYPE_POSITION_3D(1),
    /**
     *
     */
    TYPE_ROTATION_3D(2),
    /**
     *
     */
    TYPE_SCALE_3D(3),
    /**
     *
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class UpdateMode(
    id: Long
  ) {
    /**
     * Update between keyframes.
     */
    UPDATE_CONTINUOUS(0),
    /**
     * Update at the keyframes and hold the value.
     */
    UPDATE_DISCRETE(1),
    /**
     * Update at the keyframes.
     */
    UPDATE_TRIGGER(2),
    /**
     * Same as linear interpolation, but also interpolates from the current value (i.e. dynamically at runtime) if the first key isn't at 0 seconds.
     */
    UPDATE_CAPTURE(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class HandleMode(
    id: Long
  ) {
    /**
     * Assigning the free handle mode to a Bezier Track's keyframe allows you to edit the keyframe's left and right handles independently from one another.
     */
    HANDLE_MODE_FREE(0),
    /**
     * Assigning the balanced handle mode to a Bezier Track's keyframe makes it so the two handles of the keyframe always stay aligned when changing either the keyframe's left or right handle.
     */
    HANDLE_MODE_BALANCED(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class InterpolationType(
    id: Long
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
     * Cubic interpolation.
     */
    INTERPOLATION_CUBIC(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
