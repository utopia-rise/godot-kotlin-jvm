// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class AudioStreamPlaylist : AudioStream() {
  /**
   * If `true`, the playlist will shuffle each time playback starts and each time it loops.
   */
  public var shuffle: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getShufflePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShufflePtr, NIL)
    }

  /**
   * If `true`, the playlist will loop, otherwise the playlist will end when the last stream is
   * finished.
   */
  public var loop: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.hasLoopPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLoopPtr, NIL)
    }

  /**
   * Fade time used when a stream ends, when going to the next one. Streams are expected to have an
   * extra bit of audio after the end to help with fading.
   */
  public var fadeTime: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFadeTimePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFadeTimePtr, NIL)
    }

  /**
   * Amount of streams in the playlist.
   */
  public var streamCount: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStreamCountPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setStreamCountPtr, NIL)
    }

  public var stream0: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream1: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream2: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream3: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream4: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 4L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 4L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream5: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 5L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 5L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream6: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 6L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 6L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream7: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 7L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 7L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream8: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 8L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 8L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream9: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 9L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 9L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream10: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 10L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 10L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream11: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 11L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 11L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream12: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 12L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 12L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream13: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 13L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 13L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream14: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 14L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 14L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream15: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 15L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 15L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream16: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 16L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 16L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream17: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 17L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 17L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream18: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 18L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 18L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream19: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 19L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 19L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream20: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 20L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 20L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream21: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 21L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 21L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream22: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 22L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 22L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream23: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 23L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 23L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream24: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 24L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 24L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream25: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 25L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 25L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream26: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 26L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 26L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream27: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 27L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 27L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream28: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 28L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 28L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream29: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 29L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 29L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream30: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 30L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 30L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream31: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 31L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 31L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream32: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 32L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 32L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream33: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 33L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 33L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream34: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 34L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 34L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream35: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 35L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 35L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream36: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 36L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 36L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream37: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 37L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 37L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream38: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 38L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 38L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream39: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 39L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 39L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream40: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 40L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 40L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream41: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 41L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 41L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream42: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 42L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 42L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream43: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 43L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 43L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream44: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 44L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 44L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream45: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 45L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 45L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream46: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 46L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 46L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream47: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 47L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 47L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream48: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 48L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 48L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream49: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 49L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 49L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream50: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 50L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 50L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream51: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 51L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 51L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream52: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 52L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 52L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream53: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 53L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 53L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream54: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 54L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 54L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream55: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 55L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 55L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream56: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 56L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 56L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream57: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 57L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 57L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream58: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 58L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 58L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream59: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 59L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 59L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream60: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 60L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 60L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream61: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 61L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 61L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream62: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 62L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 62L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public var stream63: AudioStream?
    get() {
      TransferContext.writeArguments(LONG to 63L)
      TransferContext.callMethod(rawPtr, MethodBindings.getListStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 63L, OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setListStreamPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_AUDIOSTREAMPLAYLIST, scriptIndex)
  }

  /**
   * Returns the BPM of the playlist, which can vary depending on the clip being played.
   */
  public fun getBpm(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBpmPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  public companion object {
    /**
     * Maximum amount of streams supported in the playlist.
     */
    public final const val MAX_STREAMS: Long = 64
  }

  internal object MethodBindings {
    public val setStreamCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlaylist", "set_stream_count", 1286410249)

    public val getStreamCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlaylist", "get_stream_count", 3905245786)

    public val getBpmPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlaylist", "get_bpm", 1740695150)

    public val setListStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlaylist", "set_list_stream", 111075094)

    public val getListStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlaylist", "get_list_stream", 2739380747)

    public val setShufflePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlaylist", "set_shuffle", 2586408642)

    public val getShufflePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlaylist", "get_shuffle", 36873697)

    public val setFadeTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlaylist", "set_fade_time", 373806689)

    public val getFadeTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlaylist", "get_fade_time", 1740695150)

    public val setLoopPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlaylist", "set_loop", 2586408642)

    public val hasLoopPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlaylist", "has_loop", 36873697)
  }
}
