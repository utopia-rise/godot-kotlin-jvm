// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.Animation
import godot.annotation.GodotBaseType
import godot.core.NodePath
import godot.core.PoolIntArray
import godot.core.Quat
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
import godot.core.VariantType.POOL_INT_ARRAY
import godot.core.VariantType.QUAT
import godot.core.VariantType.STRING
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
import kotlin.String
import kotlin.Suppress

/**
 * Contains data used to animate everything in the engine.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/animation/index.html](https://docs.godotengine.org/en/latest/tutorials/animation/index.html)
 *
 * An Animation resource contains data used to animate everything in the engine. Animations are divided into tracks, and each track must be linked to a node. The state of that node can be changed through time, by adding timed keys (events) to the track.
 *
 * ```
 * 		# This creates an animation that makes the node "Enemy" move to the right by
 * 		# 100 pixels in 0.5 seconds.
 * 		var animation = Animation.new()
 * 		var track_index = animation.add_track(Animation.TYPE_VALUE)
 * 		animation.track_set_path(track_index, "Enemy:position:x")
 * 		animation.track_insert_key(track_index, 0.0, 0)
 * 		animation.track_insert_key(track_index, 0.5, 100)
 * 		```
 *
 * Animations are just data containers, and must be added to nodes such as an [godot.AnimationPlayer] or [godot.AnimationTreePlayer] to be played back. Animation tracks have different types, each with its own set of dedicated methods. Check [enum TrackType] to see available types.
 */
@GodotBaseType
open class Animation : Resource() {
  /**
   * Emitted when there's a change in the list of tracks, e.g. tracks are added, moved or have changed paths.
   */
  val tracksChanged: Signal0 by signal()

  /**
   * The total length of the animation (in seconds).
   *
   * **Note:** Length is not delimited by the last key, as this one may be before or after the end to ensure correct interpolation and looping.
   */
  open var length: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_GET_LENGTH, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_SET_LENGTH, NIL)
    }

  /**
   * A flag indicating that the animation must loop. This is uses for correct interpolation of animation cycles, and for hinting the player that it must restart the animation.
   */
  open var loop: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_GET_LOOP, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_SET_LOOP, NIL)
    }

  /**
   * The animation step value.
   */
  open var step: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_GET_STEP, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_SET_STEP, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_ANIMATION)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  /**
   * Adds a track to the Animation.
   */
  open fun addTrack(type: Long, atPosition: Long = -1): Long {
    TransferContext.writeArguments(LONG to type, LONG to atPosition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_ADD_TRACK, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the animation name at the key identified by `key_idx`. The `track_idx` must be the index of an Animation Track.
   */
  open fun animationTrackGetKeyAnimation(trackIdx: Long, keyIdx: Long): String {
    TransferContext.writeArguments(LONG to trackIdx, LONG to keyIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_ANIMATION_TRACK_GET_KEY_ANIMATION, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Inserts a key with value `animation` at the given `time` (in seconds). The `track_idx` must be the index of an Animation Track.
   */
  open fun animationTrackInsertKey(
    trackIdx: Long,
    time: Double,
    animation: String
  ): Long {
    TransferContext.writeArguments(LONG to trackIdx, DOUBLE to time, STRING to animation)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_ANIMATION_TRACK_INSERT_KEY, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the key identified by `key_idx` to value `animation`. The `track_idx` must be the index of an Animation Track.
   */
  open fun animationTrackSetKeyAnimation(
    trackIdx: Long,
    keyIdx: Long,
    animation: String
  ) {
    TransferContext.writeArguments(LONG to trackIdx, LONG to keyIdx, STRING to animation)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_ANIMATION_TRACK_SET_KEY_ANIMATION, NIL)
  }

  /**
   * Returns the end offset of the key identified by `key_idx`. The `track_idx` must be the index of an Audio Track.
   *
   * End offset is the number of seconds cut off at the ending of the audio stream.
   */
  open fun audioTrackGetKeyEndOffset(trackIdx: Long, keyIdx: Long): Double {
    TransferContext.writeArguments(LONG to trackIdx, LONG to keyIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_AUDIO_TRACK_GET_KEY_END_OFFSET, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the start offset of the key identified by `key_idx`. The `track_idx` must be the index of an Audio Track.
   *
   * Start offset is the number of seconds cut off at the beginning of the audio stream.
   */
  open fun audioTrackGetKeyStartOffset(trackIdx: Long, keyIdx: Long): Double {
    TransferContext.writeArguments(LONG to trackIdx, LONG to keyIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_AUDIO_TRACK_GET_KEY_START_OFFSET, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the audio stream of the key identified by `key_idx`. The `track_idx` must be the index of an Audio Track.
   */
  open fun audioTrackGetKeyStream(trackIdx: Long, keyIdx: Long): Resource? {
    TransferContext.writeArguments(LONG to trackIdx, LONG to keyIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_AUDIO_TRACK_GET_KEY_STREAM, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Resource?
  }

  /**
   * Inserts an Audio Track key at the given `time` in seconds. The `track_idx` must be the index of an Audio Track.
   *
   * `stream` is the [godot.AudioStream] resource to play. `start_offset` is the number of seconds cut off at the beginning of the audio stream, while `end_offset` is at the ending.
   */
  open fun audioTrackInsertKey(
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
   * Sets the end offset of the key identified by `key_idx` to value `offset`. The `track_idx` must be the index of an Audio Track.
   */
  open fun audioTrackSetKeyEndOffset(
    trackIdx: Long,
    keyIdx: Long,
    offset: Double
  ) {
    TransferContext.writeArguments(LONG to trackIdx, LONG to keyIdx, DOUBLE to offset)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_AUDIO_TRACK_SET_KEY_END_OFFSET, NIL)
  }

  /**
   * Sets the start offset of the key identified by `key_idx` to value `offset`. The `track_idx` must be the index of an Audio Track.
   */
  open fun audioTrackSetKeyStartOffset(
    trackIdx: Long,
    keyIdx: Long,
    offset: Double
  ) {
    TransferContext.writeArguments(LONG to trackIdx, LONG to keyIdx, DOUBLE to offset)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_AUDIO_TRACK_SET_KEY_START_OFFSET, NIL)
  }

  /**
   * Sets the stream of the key identified by `key_idx` to value `offset`. The `track_idx` must be the index of an Audio Track.
   */
  open fun audioTrackSetKeyStream(
    trackIdx: Long,
    keyIdx: Long,
    stream: Resource
  ) {
    TransferContext.writeArguments(LONG to trackIdx, LONG to keyIdx, OBJECT to stream)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_AUDIO_TRACK_SET_KEY_STREAM, NIL)
  }

  /**
   * Returns the in handle of the key identified by `key_idx`. The `track_idx` must be the index of a Bezier Track.
   */
  open fun bezierTrackGetKeyInHandle(trackIdx: Long, keyIdx: Long): Vector2 {
    TransferContext.writeArguments(LONG to trackIdx, LONG to keyIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_BEZIER_TRACK_GET_KEY_IN_HANDLE, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the out handle of the key identified by `key_idx`. The `track_idx` must be the index of a Bezier Track.
   */
  open fun bezierTrackGetKeyOutHandle(trackIdx: Long, keyIdx: Long): Vector2 {
    TransferContext.writeArguments(LONG to trackIdx, LONG to keyIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_BEZIER_TRACK_GET_KEY_OUT_HANDLE, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the value of the key identified by `key_idx`. The `track_idx` must be the index of a Bezier Track.
   */
  open fun bezierTrackGetKeyValue(trackIdx: Long, keyIdx: Long): Double {
    TransferContext.writeArguments(LONG to trackIdx, LONG to keyIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_BEZIER_TRACK_GET_KEY_VALUE, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Inserts a Bezier Track key at the given `time` in seconds. The `track_idx` must be the index of a Bezier Track.
   *
   * `in_handle` is the left-side weight of the added Bezier curve point, `out_handle` is the right-side one, while `value` is the actual value at this point.
   */
  open fun bezierTrackInsertKey(
    trackIdx: Long,
    time: Double,
    value: Double,
    inHandle: Vector2 = Vector2(0.0, 0.0),
    outHandle: Vector2 = Vector2(0.0, 0.0)
  ): Long {
    TransferContext.writeArguments(LONG to trackIdx, DOUBLE to time, DOUBLE to value, VECTOR2 to
        inHandle, VECTOR2 to outHandle)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_BEZIER_TRACK_INSERT_KEY,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the interpolated value at the given `time` (in seconds). The `track_idx` must be the index of a Bezier Track.
   */
  open fun bezierTrackInterpolate(trackIdx: Long, time: Double): Double {
    TransferContext.writeArguments(LONG to trackIdx, DOUBLE to time)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_BEZIER_TRACK_INTERPOLATE,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sets the in handle of the key identified by `key_idx` to value `in_handle`. The `track_idx` must be the index of a Bezier Track.
   */
  open fun bezierTrackSetKeyInHandle(
    trackIdx: Long,
    keyIdx: Long,
    inHandle: Vector2
  ) {
    TransferContext.writeArguments(LONG to trackIdx, LONG to keyIdx, VECTOR2 to inHandle)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_BEZIER_TRACK_SET_KEY_IN_HANDLE, NIL)
  }

  /**
   * Sets the out handle of the key identified by `key_idx` to value `out_handle`. The `track_idx` must be the index of a Bezier Track.
   */
  open fun bezierTrackSetKeyOutHandle(
    trackIdx: Long,
    keyIdx: Long,
    outHandle: Vector2
  ) {
    TransferContext.writeArguments(LONG to trackIdx, LONG to keyIdx, VECTOR2 to outHandle)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_BEZIER_TRACK_SET_KEY_OUT_HANDLE, NIL)
  }

  /**
   * Sets the value of the key identified by `key_idx` to the given value. The `track_idx` must be the index of a Bezier Track.
   */
  open fun bezierTrackSetKeyValue(
    trackIdx: Long,
    keyIdx: Long,
    value: Double
  ) {
    TransferContext.writeArguments(LONG to trackIdx, LONG to keyIdx, DOUBLE to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_BEZIER_TRACK_SET_KEY_VALUE, NIL)
  }

  /**
   * Clear the animation (clear all tracks and reset all).
   */
  open fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_CLEAR, NIL)
  }

  /**
   * Adds a new track that is a copy of the given track from `to_animation`.
   */
  open fun copyTrack(trackIdx: Long, toAnimation: Animation) {
    TransferContext.writeArguments(LONG to trackIdx, OBJECT to toAnimation)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_COPY_TRACK, NIL)
  }

  /**
   * Returns the index of the specified track. If the track is not found, return -1.
   */
  open fun findTrack(path: NodePath): Long {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_FIND_TRACK, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the amount of tracks in the animation.
   */
  open fun getTrackCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_GET_TRACK_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns all the key indices of a method track, given a position and delta time.
   */
  open fun methodTrackGetKeyIndices(
    trackIdx: Long,
    timeSec: Double,
    delta: Double
  ): PoolIntArray {
    TransferContext.writeArguments(LONG to trackIdx, DOUBLE to timeSec, DOUBLE to delta)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_METHOD_TRACK_GET_KEY_INDICES, POOL_INT_ARRAY)
    return TransferContext.readReturnValue(POOL_INT_ARRAY, false) as PoolIntArray
  }

  /**
   * Returns the method name of a method track.
   */
  open fun methodTrackGetName(trackIdx: Long, keyIdx: Long): String {
    TransferContext.writeArguments(LONG to trackIdx, LONG to keyIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_METHOD_TRACK_GET_NAME,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the arguments values to be called on a method track for a given key in a given track.
   */
  open fun methodTrackGetParams(trackIdx: Long, keyIdx: Long): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to trackIdx, LONG to keyIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_METHOD_TRACK_GET_PARAMS,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Removes a track by specifying the track index.
   */
  open fun removeTrack(trackIdx: Long) {
    TransferContext.writeArguments(LONG to trackIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_REMOVE_TRACK, NIL)
  }

  /**
   * Finds the key index by time in a given track. Optionally, only find it if the exact time is given.
   */
  open fun trackFindKey(
    trackIdx: Long,
    time: Double,
    exact: Boolean = false
  ): Long {
    TransferContext.writeArguments(LONG to trackIdx, DOUBLE to time, BOOL to exact)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_FIND_KEY, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns `true` if the track at `idx` wraps the interpolation loop. New tracks wrap the interpolation loop by default.
   */
  open fun trackGetInterpolationLoopWrap(trackIdx: Long): Boolean {
    TransferContext.writeArguments(LONG to trackIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_GET_INTERPOLATION_LOOP_WRAP, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the interpolation type of a given track.
   */
  open fun trackGetInterpolationType(trackIdx: Long): Animation.InterpolationType {
    TransferContext.writeArguments(LONG to trackIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_GET_INTERPOLATION_TYPE, LONG)
    return Animation.InterpolationType.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the amount of keys in a given track.
   */
  open fun trackGetKeyCount(trackIdx: Long): Long {
    TransferContext.writeArguments(LONG to trackIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_GET_KEY_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the time at which the key is located.
   */
  open fun trackGetKeyTime(trackIdx: Long, keyIdx: Long): Double {
    TransferContext.writeArguments(LONG to trackIdx, LONG to keyIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_GET_KEY_TIME,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the transition curve (easing) for a specific key (see the built-in math function [@GDScript.ease]).
   */
  open fun trackGetKeyTransition(trackIdx: Long, keyIdx: Long): Double {
    TransferContext.writeArguments(LONG to trackIdx, LONG to keyIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_GET_KEY_TRANSITION,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the value of a given key in a given track.
   */
  open fun trackGetKeyValue(trackIdx: Long, keyIdx: Long): Any? {
    TransferContext.writeArguments(LONG to trackIdx, LONG to keyIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_GET_KEY_VALUE, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Gets the path of a track. For more information on the path format, see [trackSetPath].
   */
  open fun trackGetPath(trackIdx: Long): NodePath {
    TransferContext.writeArguments(LONG to trackIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_GET_PATH, NODE_PATH)
    return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
  }

  /**
   * Gets the type of a track.
   */
  open fun trackGetType(trackIdx: Long): Animation.TrackType {
    TransferContext.writeArguments(LONG to trackIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_GET_TYPE, LONG)
    return Animation.TrackType.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Insert a generic key in a given track.
   */
  open fun trackInsertKey(
    trackIdx: Long,
    time: Double,
    key: Any?,
    transition: Double = 1.0
  ) {
    TransferContext.writeArguments(LONG to trackIdx, DOUBLE to time, ANY to key, DOUBLE to
        transition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_INSERT_KEY, NIL)
  }

  /**
   * Returns `true` if the track at index `idx` is enabled.
   */
  open fun trackIsEnabled(trackIdx: Long): Boolean {
    TransferContext.writeArguments(LONG to trackIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_IS_ENABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the given track is imported. Else, return `false`.
   */
  open fun trackIsImported(trackIdx: Long): Boolean {
    TransferContext.writeArguments(LONG to trackIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_IS_IMPORTED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Moves a track down.
   */
  open fun trackMoveDown(trackIdx: Long) {
    TransferContext.writeArguments(LONG to trackIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_MOVE_DOWN, NIL)
  }

  /**
   * Changes the index position of track `idx` to the one defined in `to_idx`.
   */
  open fun trackMoveTo(trackIdx: Long, toIdx: Long) {
    TransferContext.writeArguments(LONG to trackIdx, LONG to toIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_MOVE_TO, NIL)
  }

  /**
   * Moves a track up.
   */
  open fun trackMoveUp(trackIdx: Long) {
    TransferContext.writeArguments(LONG to trackIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_MOVE_UP, NIL)
  }

  /**
   * Removes a key by index in a given track.
   */
  open fun trackRemoveKey(trackIdx: Long, keyIdx: Long) {
    TransferContext.writeArguments(LONG to trackIdx, LONG to keyIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_REMOVE_KEY, NIL)
  }

  /**
   * Removes a key by position (seconds) in a given track.
   */
  open fun trackRemoveKeyAtPosition(trackIdx: Long, position: Double) {
    TransferContext.writeArguments(LONG to trackIdx, DOUBLE to position)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_REMOVE_KEY_AT_POSITION, NIL)
  }

  /**
   * Enables/disables the given track. Tracks are enabled by default.
   */
  open fun trackSetEnabled(trackIdx: Long, enabled: Boolean) {
    TransferContext.writeArguments(LONG to trackIdx, BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_SET_ENABLED, NIL)
  }

  /**
   * Sets the given track as imported or not.
   */
  open fun trackSetImported(trackIdx: Long, imported: Boolean) {
    TransferContext.writeArguments(LONG to trackIdx, BOOL to imported)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_SET_IMPORTED, NIL)
  }

  /**
   * If `true`, the track at `idx` wraps the interpolation loop.
   */
  open fun trackSetInterpolationLoopWrap(trackIdx: Long, interpolation: Boolean) {
    TransferContext.writeArguments(LONG to trackIdx, BOOL to interpolation)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_SET_INTERPOLATION_LOOP_WRAP, NIL)
  }

  /**
   * Sets the interpolation type of a given track.
   */
  open fun trackSetInterpolationType(trackIdx: Long, interpolation: Long) {
    TransferContext.writeArguments(LONG to trackIdx, LONG to interpolation)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_SET_INTERPOLATION_TYPE, NIL)
  }

  /**
   * Sets the time of an existing key.
   */
  open fun trackSetKeyTime(
    trackIdx: Long,
    keyIdx: Long,
    time: Double
  ) {
    TransferContext.writeArguments(LONG to trackIdx, LONG to keyIdx, DOUBLE to time)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_SET_KEY_TIME, NIL)
  }

  /**
   * Sets the transition curve (easing) for a specific key (see the built-in math function [@GDScript.ease]).
   */
  open fun trackSetKeyTransition(
    trackIdx: Long,
    keyIdx: Long,
    transition: Double
  ) {
    TransferContext.writeArguments(LONG to trackIdx, LONG to keyIdx, DOUBLE to transition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_SET_KEY_TRANSITION,
        NIL)
  }

  /**
   * Sets the value of an existing key.
   */
  open fun trackSetKeyValue(
    trackIdx: Long,
    key: Long,
    value: Any?
  ) {
    TransferContext.writeArguments(LONG to trackIdx, LONG to key, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_SET_KEY_VALUE, NIL)
  }

  /**
   * Sets the path of a track. Paths must be valid scene-tree paths to a node, and must be specified starting from the parent node of the node that will reproduce the animation. Tracks that control properties or bones must append their name after the path, separated by `":"`.
   *
   * For example, `"character/skeleton:ankle"` or `"character/mesh:transform/local"`.
   */
  open fun trackSetPath(trackIdx: Long, path: NodePath) {
    TransferContext.writeArguments(LONG to trackIdx, NODE_PATH to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_SET_PATH, NIL)
  }

  /**
   * Swaps the track `idx`'s index position with the track `with_idx`.
   */
  open fun trackSwap(trackIdx: Long, withIdx: Long) {
    TransferContext.writeArguments(LONG to trackIdx, LONG to withIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATION_TRACK_SWAP, NIL)
  }

  /**
   * Insert a transform key for a transform track.
   */
  open fun transformTrackInsertKey(
    trackIdx: Long,
    time: Double,
    location: Vector3,
    rotation: Quat,
    scale: Vector3
  ): Long {
    TransferContext.writeArguments(LONG to trackIdx, DOUBLE to time, VECTOR3 to location, QUAT to
        rotation, VECTOR3 to scale)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_TRANSFORM_TRACK_INSERT_KEY, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the interpolated value of a transform track at a given time (in seconds). An array consisting of 3 elements: position ([godot.core.Vector3]), rotation ([godot.core.Quat]) and scale ([godot.core.Vector3]).
   */
  open fun transformTrackInterpolate(trackIdx: Long, timeSec: Double): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to trackIdx, DOUBLE to timeSec)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_TRANSFORM_TRACK_INTERPOLATE, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns all the key indices of a value track, given a position and delta time.
   */
  open fun valueTrackGetKeyIndices(
    trackIdx: Long,
    timeSec: Double,
    delta: Double
  ): PoolIntArray {
    TransferContext.writeArguments(LONG to trackIdx, DOUBLE to timeSec, DOUBLE to delta)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_VALUE_TRACK_GET_KEY_INDICES, POOL_INT_ARRAY)
    return TransferContext.readReturnValue(POOL_INT_ARRAY, false) as PoolIntArray
  }

  /**
   * Returns the update mode of a value track.
   */
  open fun valueTrackGetUpdateMode(trackIdx: Long): Animation.UpdateMode {
    TransferContext.writeArguments(LONG to trackIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_VALUE_TRACK_GET_UPDATE_MODE, LONG)
    return Animation.UpdateMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Sets the update mode (see [enum UpdateMode]) of a value track.
   */
  open fun valueTrackSetUpdateMode(trackIdx: Long, mode: Long) {
    TransferContext.writeArguments(LONG to trackIdx, LONG to mode)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATION_VALUE_TRACK_SET_UPDATE_MODE, NIL)
  }

  enum class TrackType(
    id: Long
  ) {
    /**
     * Value tracks set values in node properties, but only those which can be Interpolated.
     */
    TYPE_VALUE(0),

    /**
     * Transform tracks are used to change node local transforms or skeleton pose bones. Transitions are interpolated.
     */
    TYPE_TRANSFORM(1),

    /**
     * Method tracks call functions with given arguments per key.
     */
    TYPE_METHOD(2),

    /**
     * Bezier tracks are used to interpolate a value using custom curves. They can also be used to animate sub-properties of vectors and colors (e.g. alpha value of a [godot.core.Color]).
     */
    TYPE_BEZIER(3),

    /**
     * Audio tracks are used to play an audio stream with either type of [godot.AudioStreamPlayer]. The stream can be trimmed and previewed in the animation.
     */
    TYPE_AUDIO(4),

    /**
     * Animation tracks play animations in other [godot.AnimationPlayer] nodes.
     */
    TYPE_ANIMATION(5);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class UpdateMode(
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
    UPDATE_CAPTURE(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class InterpolationType(
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
    INTERPOLATION_CUBIC(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     * Cubic interpolation.
     */
    final const val INTERPOLATION_CUBIC: Long = 2

    /**
     * Linear interpolation.
     */
    final const val INTERPOLATION_LINEAR: Long = 1

    /**
     * No interpolation (nearest value).
     */
    final const val INTERPOLATION_NEAREST: Long = 0

    /**
     * Animation tracks play animations in other [godot.AnimationPlayer] nodes.
     */
    final const val TYPE_ANIMATION: Long = 5

    /**
     * Audio tracks are used to play an audio stream with either type of [godot.AudioStreamPlayer]. The stream can be trimmed and previewed in the animation.
     */
    final const val TYPE_AUDIO: Long = 4

    /**
     * Bezier tracks are used to interpolate a value using custom curves. They can also be used to animate sub-properties of vectors and colors (e.g. alpha value of a [godot.core.Color]).
     */
    final const val TYPE_BEZIER: Long = 3

    /**
     * Method tracks call functions with given arguments per key.
     */
    final const val TYPE_METHOD: Long = 2

    /**
     * Transform tracks are used to change node local transforms or skeleton pose bones. Transitions are interpolated.
     */
    final const val TYPE_TRANSFORM: Long = 1

    /**
     * Value tracks set values in node properties, but only those which can be Interpolated.
     */
    final const val TYPE_VALUE: Long = 0

    /**
     * Same as linear interpolation, but also interpolates from the current value (i.e. dynamically at runtime) if the first key isn't at 0 seconds.
     */
    final const val UPDATE_CAPTURE: Long = 3

    /**
     * Update between keyframes.
     */
    final const val UPDATE_CONTINUOUS: Long = 0

    /**
     * Update at the keyframes and hold the value.
     */
    final const val UPDATE_DISCRETE: Long = 1

    /**
     * Update at the keyframes.
     */
    final const val UPDATE_TRIGGER: Long = 2
  }
}
