// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
package godot

import kotlin.Long

public enum class MIDIMessage(
  id: Long,
) {
  /**
   * Enum value which doesn't correspond to any MIDI message. This is used to initialize [enum
   * MIDIMessage] properties with a generic state.
   */
  MIDI_MESSAGE_NONE(0),
  /**
   * MIDI note OFF message. Not all MIDI devices send this event; some send [constant
   * MIDI_MESSAGE_NOTE_ON] with zero velocity instead. See the documentation of [InputEventMIDI] for
   * information of how to use MIDI inputs.
   */
  MIDI_MESSAGE_NOTE_OFF(8),
  /**
   * MIDI note ON message. Some MIDI devices send this event with velocity zero instead of [constant
   * MIDI_MESSAGE_NOTE_OFF], but implementations vary. See the documentation of [InputEventMIDI] for
   * information of how to use MIDI inputs.
   */
  MIDI_MESSAGE_NOTE_ON(9),
  /**
   * MIDI aftertouch message. This message is most often sent by pressing down on the key after it
   * "bottoms out".
   */
  MIDI_MESSAGE_AFTERTOUCH(10),
  /**
   * MIDI control change message. This message is sent when a controller value changes. Controllers
   * include devices such as pedals and levers.
   */
  MIDI_MESSAGE_CONTROL_CHANGE(11),
  /**
   * MIDI program change message. This message sent when the program patch number changes.
   */
  MIDI_MESSAGE_PROGRAM_CHANGE(12),
  /**
   * MIDI channel pressure message. This message is most often sent by pressing down on the key
   * after it "bottoms out". This message is different from polyphonic after-touch as it indicates the
   * highest pressure across all keys.
   */
  MIDI_MESSAGE_CHANNEL_PRESSURE(13),
  /**
   * MIDI pitch bend message. This message is sent to indicate a change in the pitch bender (wheel
   * or lever, typically).
   */
  MIDI_MESSAGE_PITCH_BEND(14),
  /**
   * MIDI system exclusive message. This has behavior exclusive to the device you're receiving input
   * from. Getting this data is not implemented in Godot.
   */
  MIDI_MESSAGE_SYSTEM_EXCLUSIVE(240),
  /**
   * MIDI quarter frame message. Contains timing information that is used to synchronize MIDI
   * devices. Getting this data is not implemented in Godot.
   */
  MIDI_MESSAGE_QUARTER_FRAME(241),
  /**
   * MIDI song position pointer message. Gives the number of 16th notes since the start of the song.
   * Getting this data is not implemented in Godot.
   */
  MIDI_MESSAGE_SONG_POSITION_POINTER(242),
  /**
   * MIDI song select message. Specifies which sequence or song is to be played. Getting this data
   * is not implemented in Godot.
   */
  MIDI_MESSAGE_SONG_SELECT(243),
  /**
   * MIDI tune request message. Upon receiving a tune request, all analog synthesizers should tune
   * their oscillators.
   */
  MIDI_MESSAGE_TUNE_REQUEST(246),
  /**
   * MIDI timing clock message. Sent 24 times per quarter note when synchronization is required.
   */
  MIDI_MESSAGE_TIMING_CLOCK(248),
  /**
   * MIDI start message. Start the current sequence playing. This message will be followed with
   * Timing Clocks.
   */
  MIDI_MESSAGE_START(250),
  /**
   * MIDI continue message. Continue at the point the sequence was stopped.
   */
  MIDI_MESSAGE_CONTINUE(251),
  /**
   * MIDI stop message. Stop the current sequence.
   */
  MIDI_MESSAGE_STOP(252),
  /**
   * MIDI active sensing message. This message is intended to be sent repeatedly to tell the
   * receiver that a connection is alive.
   */
  MIDI_MESSAGE_ACTIVE_SENSING(254),
  /**
   * MIDI system reset message. Reset all receivers in the system to power-up status. It should not
   * be sent on power-up itself.
   */
  MIDI_MESSAGE_SYSTEM_RESET(255),
  ;

  public val id: Long
  init {
    this.id = id
  }

  public companion object {
    public fun from(`value`: Long) = entries.single { it.id == `value` }
  }
}
