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
import godot.core.TypeManager
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
import godot.util.VoidPtr
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
 * # 100 pixels in 2.0 seconds.
 *
 * var animation = Animation.new()
 *
 * var track_index = animation.add_track(Animation.TYPE_VALUE)
 *
 * animation.track_set_path(track_index, "Enemy:position:x")
 *
 * animation.track_insert_key(track_index, 0.0, 0)
 *
 * animation.track_insert_key(track_index, 2.0, 100)
 *
 * animation.length = 2.0
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * // This creates an animation that makes the node "Enemy" move to the right by
 *
 * // 100 pixels in 2.0 seconds.
 *
 * var animation = new Animation();
 *
 * int trackIndex = animation.AddTrack(Animation.TrackType.Value);
 *
 * animation.TrackSetPath(trackIndex, "Enemy:position:x");
 *
 * animation.TrackInsertKey(trackIndex, 0.0f, 0);
 *
 * animation.TrackInsertKey(trackIndex, 2.0f, 100);
 *
 * animation.Length = 2.0f;
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
      TransferContext.callMethod(rawPtr, MethodBindings.getLengthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setLengthPtr, NIL)
    }

  /**
   * Determines the behavior of both ends of the animation timeline during animation playback. This is used for correct interpolation of animation cycles, and for hinting the player that it must restart the animation.
   */
  public var loopMode: LoopMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLoopModePtr, LONG)
      return Animation.LoopMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setLoopModePtr, NIL)
    }

  /**
   * The animation step value.
   */
  public var step: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStepPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setStepPtr, NIL)
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
    TransferContext.callMethod(rawPtr, MethodBindings.addTrackPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Removes a track by specifying the track index.
   */
  public fun removeTrack(trackIdx: Int): Unit {
    TransferContext.writeArguments(LONG to trackIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeTrackPtr, NIL)
  }

  /**
   * Returns the amount of tracks in the animation.
   */
  public fun getTrackCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTrackCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Gets the type of a track.
   */
  public fun trackGetType(trackIdx: Int): TrackType {
    TransferContext.writeArguments(LONG to trackIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.trackGetTypePtr, LONG)
    return Animation.TrackType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Gets the path of a track. For more information on the path format, see [trackSetPath].
   */
  public fun trackGetPath(trackIdx: Int): NodePath {
    TransferContext.writeArguments(LONG to trackIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.trackGetPathPtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
  }

  /**
   * Sets the path of a track. Paths must be valid scene-tree paths to a node and must be specified starting from the parent node of the node that will reproduce the animation. Tracks that control properties or bones must append their name after the path, separated by `":"`.
   *
   * For example, `"character/skeleton:ankle"` or `"character/mesh:transform/local"`.
   */
  public fun trackSetPath(trackIdx: Int, path: NodePath): Unit {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), NODE_PATH to path)
    TransferContext.callMethod(rawPtr, MethodBindings.trackSetPathPtr, NIL)
  }

  /**
   * Returns the index of the specified track. If the track is not found, return -1.
   */
  public fun findTrack(path: NodePath, type: TrackType): Int {
    TransferContext.writeArguments(NODE_PATH to path, LONG to type.id)
    TransferContext.callMethod(rawPtr, MethodBindings.findTrackPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Moves a track up.
   */
  public fun trackMoveUp(trackIdx: Int): Unit {
    TransferContext.writeArguments(LONG to trackIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.trackMoveUpPtr, NIL)
  }

  /**
   * Moves a track down.
   */
  public fun trackMoveDown(trackIdx: Int): Unit {
    TransferContext.writeArguments(LONG to trackIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.trackMoveDownPtr, NIL)
  }

  /**
   * Changes the index position of track [trackIdx] to the one defined in [toIdx].
   */
  public fun trackMoveTo(trackIdx: Int, toIdx: Int): Unit {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to toIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.trackMoveToPtr, NIL)
  }

  /**
   * Swaps the track [trackIdx]'s index position with the track [withIdx].
   */
  public fun trackSwap(trackIdx: Int, withIdx: Int): Unit {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to withIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.trackSwapPtr, NIL)
  }

  /**
   * Sets the given track as imported or not.
   */
  public fun trackSetImported(trackIdx: Int, imported: Boolean): Unit {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), BOOL to imported)
    TransferContext.callMethod(rawPtr, MethodBindings.trackSetImportedPtr, NIL)
  }

  /**
   * Returns `true` if the given track is imported. Else, return `false`.
   */
  public fun trackIsImported(trackIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to trackIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.trackIsImportedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Enables/disables the given track. Tracks are enabled by default.
   */
  public fun trackSetEnabled(trackIdx: Int, enabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.trackSetEnabledPtr, NIL)
  }

  /**
   * Returns `true` if the track at index [trackIdx] is enabled.
   */
  public fun trackIsEnabled(trackIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to trackIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.trackIsEnabledPtr, BOOL)
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
    TransferContext.callMethod(rawPtr, MethodBindings.positionTrackInsertKeyPtr, LONG)
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
    TransferContext.callMethod(rawPtr, MethodBindings.rotationTrackInsertKeyPtr, LONG)
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
    TransferContext.callMethod(rawPtr, MethodBindings.scaleTrackInsertKeyPtr, LONG)
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
    TransferContext.callMethod(rawPtr, MethodBindings.blendShapeTrackInsertKeyPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the interpolated position value at the given time (in seconds). The [trackIdx] must be the index of a 3D position track.
   */
  public fun positionTrackInterpolate(trackIdx: Int, timeSec: Double): Vector3 {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), DOUBLE to timeSec)
    TransferContext.callMethod(rawPtr, MethodBindings.positionTrackInterpolatePtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Returns the interpolated rotation value at the given time (in seconds). The [trackIdx] must be the index of a 3D rotation track.
   */
  public fun rotationTrackInterpolate(trackIdx: Int, timeSec: Double): Quaternion {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), DOUBLE to timeSec)
    TransferContext.callMethod(rawPtr, MethodBindings.rotationTrackInterpolatePtr, QUATERNION)
    return (TransferContext.readReturnValue(QUATERNION, false) as Quaternion)
  }

  /**
   * Returns the interpolated scale value at the given time (in seconds). The [trackIdx] must be the index of a 3D scale track.
   */
  public fun scaleTrackInterpolate(trackIdx: Int, timeSec: Double): Vector3 {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), DOUBLE to timeSec)
    TransferContext.callMethod(rawPtr, MethodBindings.scaleTrackInterpolatePtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Returns the interpolated blend shape value at the given time (in seconds). The [trackIdx] must be the index of a blend shape track.
   */
  public fun blendShapeTrackInterpolate(trackIdx: Int, timeSec: Double): Float {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), DOUBLE to timeSec)
    TransferContext.callMethod(rawPtr, MethodBindings.blendShapeTrackInterpolatePtr, DOUBLE)
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
    TransferContext.callMethod(rawPtr, MethodBindings.trackInsertKeyPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Removes a key by index in a given track.
   */
  public fun trackRemoveKey(trackIdx: Int, keyIdx: Int): Unit {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.trackRemoveKeyPtr, NIL)
  }

  /**
   * Removes a key at [time] in a given track.
   */
  public fun trackRemoveKeyAtTime(trackIdx: Int, time: Double): Unit {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), DOUBLE to time)
    TransferContext.callMethod(rawPtr, MethodBindings.trackRemoveKeyAtTimePtr, NIL)
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
    TransferContext.callMethod(rawPtr, MethodBindings.trackSetKeyValuePtr, NIL)
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
    TransferContext.callMethod(rawPtr, MethodBindings.trackSetKeyTransitionPtr, NIL)
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
    TransferContext.callMethod(rawPtr, MethodBindings.trackSetKeyTimePtr, NIL)
  }

  /**
   * Returns the transition curve (easing) for a specific key (see the built-in math function [@GlobalScope.ease]).
   */
  public fun trackGetKeyTransition(trackIdx: Int, keyIdx: Int): Float {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.trackGetKeyTransitionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the number of keys in a given track.
   */
  public fun trackGetKeyCount(trackIdx: Int): Int {
    TransferContext.writeArguments(LONG to trackIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.trackGetKeyCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the value of a given key in a given track.
   */
  public fun trackGetKeyValue(trackIdx: Int, keyIdx: Int): Any? {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.trackGetKeyValuePtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Returns the time at which the key is located.
   */
  public fun trackGetKeyTime(trackIdx: Int, keyIdx: Int): Double {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.trackGetKeyTimePtr, DOUBLE)
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
    TransferContext.callMethod(rawPtr, MethodBindings.trackFindKeyPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the interpolation type of a given track.
   */
  public fun trackSetInterpolationType(trackIdx: Int, interpolation: InterpolationType): Unit {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to interpolation.id)
    TransferContext.callMethod(rawPtr, MethodBindings.trackSetInterpolationTypePtr, NIL)
  }

  /**
   * Returns the interpolation type of a given track.
   */
  public fun trackGetInterpolationType(trackIdx: Int): InterpolationType {
    TransferContext.writeArguments(LONG to trackIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.trackGetInterpolationTypePtr, LONG)
    return Animation.InterpolationType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * If `true`, the track at [trackIdx] wraps the interpolation loop.
   */
  public fun trackSetInterpolationLoopWrap(trackIdx: Int, interpolation: Boolean): Unit {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), BOOL to interpolation)
    TransferContext.callMethod(rawPtr, MethodBindings.trackSetInterpolationLoopWrapPtr, NIL)
  }

  /**
   * Returns `true` if the track at [trackIdx] wraps the interpolation loop. New tracks wrap the interpolation loop by default.
   */
  public fun trackGetInterpolationLoopWrap(trackIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to trackIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.trackGetInterpolationLoopWrapPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if the track is compressed, `false` otherwise. See also [compress].
   */
  public fun trackIsCompressed(trackIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to trackIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.trackIsCompressedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the update mode (see [enum UpdateMode]) of a value track.
   */
  public fun valueTrackSetUpdateMode(trackIdx: Int, mode: UpdateMode): Unit {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.valueTrackSetUpdateModePtr, NIL)
  }

  /**
   * Returns the update mode of a value track.
   */
  public fun valueTrackGetUpdateMode(trackIdx: Int): UpdateMode {
    TransferContext.writeArguments(LONG to trackIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.valueTrackGetUpdateModePtr, LONG)
    return Animation.UpdateMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the interpolated value at the given time (in seconds). The [trackIdx] must be the index of a value track.
   */
  public fun valueTrackInterpolate(trackIdx: Int, timeSec: Double): Any? {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), DOUBLE to timeSec)
    TransferContext.callMethod(rawPtr, MethodBindings.valueTrackInterpolatePtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Returns the method name of a method track.
   */
  public fun methodTrackGetName(trackIdx: Int, keyIdx: Int): StringName {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.methodTrackGetNamePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  /**
   * Returns the arguments values to be called on a method track for a given key in a given track.
   */
  public fun methodTrackGetParams(trackIdx: Int, keyIdx: Int): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.methodTrackGetParamsPtr, ARRAY)
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
    TransferContext.callMethod(rawPtr, MethodBindings.bezierTrackInsertKeyPtr, LONG)
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
    TransferContext.callMethod(rawPtr, MethodBindings.bezierTrackSetKeyValuePtr, NIL)
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
    TransferContext.callMethod(rawPtr, MethodBindings.bezierTrackSetKeyInHandlePtr, NIL)
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
    TransferContext.callMethod(rawPtr, MethodBindings.bezierTrackSetKeyOutHandlePtr, NIL)
  }

  /**
   * Returns the value of the key identified by [keyIdx]. The [trackIdx] must be the index of a Bezier Track.
   */
  public fun bezierTrackGetKeyValue(trackIdx: Int, keyIdx: Int): Float {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.bezierTrackGetKeyValuePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the in handle of the key identified by [keyIdx]. The [trackIdx] must be the index of a Bezier Track.
   */
  public fun bezierTrackGetKeyInHandle(trackIdx: Int, keyIdx: Int): Vector2 {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.bezierTrackGetKeyInHandlePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns the out handle of the key identified by [keyIdx]. The [trackIdx] must be the index of a Bezier Track.
   */
  public fun bezierTrackGetKeyOutHandle(trackIdx: Int, keyIdx: Int): Vector2 {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.bezierTrackGetKeyOutHandlePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns the interpolated value at the given [time] (in seconds). The [trackIdx] must be the index of a Bezier Track.
   */
  public fun bezierTrackInterpolate(trackIdx: Int, time: Double): Float {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), DOUBLE to time)
    TransferContext.callMethod(rawPtr, MethodBindings.bezierTrackInterpolatePtr, DOUBLE)
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
    TransferContext.callMethod(rawPtr, MethodBindings.audioTrackInsertKeyPtr, LONG)
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
    TransferContext.callMethod(rawPtr, MethodBindings.audioTrackSetKeyStreamPtr, NIL)
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
    TransferContext.callMethod(rawPtr, MethodBindings.audioTrackSetKeyStartOffsetPtr, NIL)
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
    TransferContext.callMethod(rawPtr, MethodBindings.audioTrackSetKeyEndOffsetPtr, NIL)
  }

  /**
   * Returns the audio stream of the key identified by [keyIdx]. The [trackIdx] must be the index of an Audio Track.
   */
  public fun audioTrackGetKeyStream(trackIdx: Int, keyIdx: Int): Resource? {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.audioTrackGetKeyStreamPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Resource?)
  }

  /**
   * Returns the start offset of the key identified by [keyIdx]. The [trackIdx] must be the index of an Audio Track.
   *
   * Start offset is the number of seconds cut off at the beginning of the audio stream.
   */
  public fun audioTrackGetKeyStartOffset(trackIdx: Int, keyIdx: Int): Float {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.audioTrackGetKeyStartOffsetPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the end offset of the key identified by [keyIdx]. The [trackIdx] must be the index of an Audio Track.
   *
   * End offset is the number of seconds cut off at the ending of the audio stream.
   */
  public fun audioTrackGetKeyEndOffset(trackIdx: Int, keyIdx: Int): Float {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.audioTrackGetKeyEndOffsetPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Sets whether the track will be blended with other animations. If `true`, the audio playback volume changes depending on the blend value.
   */
  public fun audioTrackSetUseBlend(trackIdx: Int, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.audioTrackSetUseBlendPtr, NIL)
  }

  /**
   * Returns `true` if the track at [trackIdx] will be blended with other animations.
   */
  public fun audioTrackIsUseBlend(trackIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to trackIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.audioTrackIsUseBlendPtr, BOOL)
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
    TransferContext.callMethod(rawPtr, MethodBindings.animationTrackInsertKeyPtr, LONG)
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
    TransferContext.callMethod(rawPtr, MethodBindings.animationTrackSetKeyAnimationPtr, NIL)
  }

  /**
   * Returns the animation name at the key identified by [keyIdx]. The [trackIdx] must be the index of an Animation Track.
   */
  public fun animationTrackGetKeyAnimation(trackIdx: Int, keyIdx: Int): StringName {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), LONG to keyIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.animationTrackGetKeyAnimationPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  /**
   * Clear the animation (clear all tracks and reset all).
   */
  public fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  /**
   * Adds a new track to [toAnimation] that is a copy of the given track from this animation.
   */
  public fun copyTrack(trackIdx: Int, toAnimation: Animation): Unit {
    TransferContext.writeArguments(LONG to trackIdx.toLong(), OBJECT to toAnimation)
    TransferContext.callMethod(rawPtr, MethodBindings.copyTrackPtr, NIL)
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
    TransferContext.callMethod(rawPtr, MethodBindings.compressPtr, NIL)
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

  internal object MethodBindings {
    public val addTrackPtr: VoidPtr = TypeManager.getMethodBindPtr("Animation", "add_track")

    public val removeTrackPtr: VoidPtr = TypeManager.getMethodBindPtr("Animation", "remove_track")

    public val getTrackCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "get_track_count")

    public val trackGetTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "track_get_type")

    public val trackGetPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "track_get_path")

    public val trackSetPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "track_set_path")

    public val findTrackPtr: VoidPtr = TypeManager.getMethodBindPtr("Animation", "find_track")

    public val trackMoveUpPtr: VoidPtr = TypeManager.getMethodBindPtr("Animation", "track_move_up")

    public val trackMoveDownPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "track_move_down")

    public val trackMoveToPtr: VoidPtr = TypeManager.getMethodBindPtr("Animation", "track_move_to")

    public val trackSwapPtr: VoidPtr = TypeManager.getMethodBindPtr("Animation", "track_swap")

    public val trackSetImportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "track_set_imported")

    public val trackIsImportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "track_is_imported")

    public val trackSetEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "track_set_enabled")

    public val trackIsEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "track_is_enabled")

    public val positionTrackInsertKeyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "position_track_insert_key")

    public val rotationTrackInsertKeyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "rotation_track_insert_key")

    public val scaleTrackInsertKeyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "scale_track_insert_key")

    public val blendShapeTrackInsertKeyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "blend_shape_track_insert_key")

    public val positionTrackInterpolatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "position_track_interpolate")

    public val rotationTrackInterpolatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "rotation_track_interpolate")

    public val scaleTrackInterpolatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "scale_track_interpolate")

    public val blendShapeTrackInterpolatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "blend_shape_track_interpolate")

    public val trackInsertKeyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "track_insert_key")

    public val trackRemoveKeyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "track_remove_key")

    public val trackRemoveKeyAtTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "track_remove_key_at_time")

    public val trackSetKeyValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "track_set_key_value")

    public val trackSetKeyTransitionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "track_set_key_transition")

    public val trackSetKeyTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "track_set_key_time")

    public val trackGetKeyTransitionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "track_get_key_transition")

    public val trackGetKeyCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "track_get_key_count")

    public val trackGetKeyValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "track_get_key_value")

    public val trackGetKeyTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "track_get_key_time")

    public val trackFindKeyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "track_find_key")

    public val trackSetInterpolationTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "track_set_interpolation_type")

    public val trackGetInterpolationTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "track_get_interpolation_type")

    public val trackSetInterpolationLoopWrapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "track_set_interpolation_loop_wrap")

    public val trackGetInterpolationLoopWrapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "track_get_interpolation_loop_wrap")

    public val trackIsCompressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "track_is_compressed")

    public val valueTrackSetUpdateModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "value_track_set_update_mode")

    public val valueTrackGetUpdateModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "value_track_get_update_mode")

    public val valueTrackInterpolatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "value_track_interpolate")

    public val methodTrackGetNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "method_track_get_name")

    public val methodTrackGetParamsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "method_track_get_params")

    public val bezierTrackInsertKeyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "bezier_track_insert_key")

    public val bezierTrackSetKeyValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "bezier_track_set_key_value")

    public val bezierTrackSetKeyInHandlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "bezier_track_set_key_in_handle")

    public val bezierTrackSetKeyOutHandlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "bezier_track_set_key_out_handle")

    public val bezierTrackGetKeyValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "bezier_track_get_key_value")

    public val bezierTrackGetKeyInHandlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "bezier_track_get_key_in_handle")

    public val bezierTrackGetKeyOutHandlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "bezier_track_get_key_out_handle")

    public val bezierTrackInterpolatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "bezier_track_interpolate")

    public val audioTrackInsertKeyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "audio_track_insert_key")

    public val audioTrackSetKeyStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "audio_track_set_key_stream")

    public val audioTrackSetKeyStartOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "audio_track_set_key_start_offset")

    public val audioTrackSetKeyEndOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "audio_track_set_key_end_offset")

    public val audioTrackGetKeyStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "audio_track_get_key_stream")

    public val audioTrackGetKeyStartOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "audio_track_get_key_start_offset")

    public val audioTrackGetKeyEndOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "audio_track_get_key_end_offset")

    public val audioTrackSetUseBlendPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "audio_track_set_use_blend")

    public val audioTrackIsUseBlendPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "audio_track_is_use_blend")

    public val animationTrackInsertKeyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "animation_track_insert_key")

    public val animationTrackSetKeyAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "animation_track_set_key_animation")

    public val animationTrackGetKeyAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Animation", "animation_track_get_key_animation")

    public val setLengthPtr: VoidPtr = TypeManager.getMethodBindPtr("Animation", "set_length")

    public val getLengthPtr: VoidPtr = TypeManager.getMethodBindPtr("Animation", "get_length")

    public val setLoopModePtr: VoidPtr = TypeManager.getMethodBindPtr("Animation", "set_loop_mode")

    public val getLoopModePtr: VoidPtr = TypeManager.getMethodBindPtr("Animation", "get_loop_mode")

    public val setStepPtr: VoidPtr = TypeManager.getMethodBindPtr("Animation", "set_step")

    public val getStepPtr: VoidPtr = TypeManager.getMethodBindPtr("Animation", "get_step")

    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("Animation", "clear")

    public val copyTrackPtr: VoidPtr = TypeManager.getMethodBindPtr("Animation", "copy_track")

    public val compressPtr: VoidPtr = TypeManager.getMethodBindPtr("Animation", "compress")
  }
}
