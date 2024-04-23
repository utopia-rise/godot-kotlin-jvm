// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Represents a MIDI message from a MIDI device, such as a musical keyboard.
 *
 * Tutorials:
 * [https://en.wikipedia.org/wiki/Piano_key_frequencies#List](https://en.wikipedia.org/wiki/Piano_key_frequencies#List)
 *
 * InputEventMIDI stores information about messages from [MIDI](https://en.wikipedia.org/wiki/MIDI) (Musical Instrument Digital Interface) devices. These may include musical keyboards, synthesizers, and drum machines.
 *
 * MIDI messages can be received over a 5-pin MIDI connector or over USB. If your device supports both be sure to check the settings in the device to see which output it is using.
 *
 * By default, Godot does not detect MIDI devices. You need to call [godot.OS.openMidiInputs], first. You can check which devices are detected with [godot.OS.getConnectedMidiInputs], and close the connection with [godot.OS.closeMidiInputs].
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * func _ready():
 *
 *     OS.open_midi_inputs()
 *
 *     print(OS.get_connected_midi_inputs())
 *
 *
 *
 * func _input(input_event):
 *
 *     if input_event is InputEventMIDI:
 *
 *         _print_midi_info(input_event)
 *
 *
 *
 * func _print_midi_info(midi_event):
 *
 *     print(midi_event)
 *
 *     print("Channel ", midi_event.channel)
 *
 *     print("Message ", midi_event.message)
 *
 *     print("Pitch ", midi_event.pitch)
 *
 *     print("Velocity ", midi_event.velocity)
 *
 *     print("Instrument ", midi_event.instrument)
 *
 *     print("Pressure ", midi_event.pressure)
 *
 *     print("Controller number: ", midi_event.controller_number)
 *
 *     print("Controller value: ", midi_event.controller_value)
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * public override void _Ready()
 *
 * {
 *
 *     OS.OpenMidiInputs();
 *
 *     GD.Print(OS.GetConnectedMidiInputs());
 *
 * }
 *
 *
 *
 * public override void _Input(InputEvent inputEvent)
 *
 * {
 *
 *     if (inputEvent is InputEventMidi midiEvent)
 *
 *     {
 *
 *         PrintMIDIInfo(midiEvent);
 *
 *     }
 *
 * }
 *
 *
 *
 * private void PrintMIDIInfo(InputEventMidi midiEvent)
 *
 * {
 *
 *     GD.Print(midiEvent);
 *
 *     GD.Print($"Channel {midiEvent.Channel}");
 *
 *     GD.Print($"Message {midiEvent.Message}");
 *
 *     GD.Print($"Pitch {midiEvent.Pitch}");
 *
 *     GD.Print($"Velocity {midiEvent.Velocity}");
 *
 *     GD.Print($"Instrument {midiEvent.Instrument}");
 *
 *     GD.Print($"Pressure {midiEvent.Pressure}");
 *
 *     GD.Print($"Controller number: {midiEvent.ControllerNumber}");
 *
 *     GD.Print($"Controller value: {midiEvent.ControllerValue}");
 *
 * }
 *
 * [/csharp]
 *
 * [/codeblocks]
 *
 * **Note:** Godot does not support MIDI output, so there is no way to emit MIDI messages from Godot. Only MIDI input is supported.
 */
@GodotBaseType
public open class InputEventMIDI : InputEvent() {
  /**
   * The MIDI channel of this message, ranging from `0` to `15`. MIDI channel `9` is reserved for percussion instruments.
   */
  public var channel: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getChannelPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setChannelPtr, NIL)
    }

  /**
   * Represents the type of MIDI message (see the [enum MIDIMessage] enum).
   *
   * For more information, see the [godot.MIDI message status byte list chart](https://www.midi.org/specifications-old/item/table-2-expanded-messages-list-status-bytes).
   */
  public var message: MIDIMessage
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMessagePtr, LONG)
      return MIDIMessage.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setMessagePtr, NIL)
    }

  /**
   * The pitch index number of this MIDI message. This value ranges from `0` to `127`.
   *
   * On a piano, the **middle C** is `60`, followed by a **C-sharp** (`61`), then a **D** (`62`), and so on. Each octave is split in offsets of 12. See the "MIDI note number" column of the [piano key frequency chart](https://en.wikipedia.org/wiki/Piano_key_frequencies) a full list.
   */
  public var pitch: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPitchPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setPitchPtr, NIL)
    }

  /**
   * The velocity of the MIDI message. This value ranges from `0` to `127`. For a musical keyboard, this corresponds to how quickly the key was pressed, and is rarely above `110` in practice.
   *
   * **Note:** Some MIDI devices may send a [MIDI_MESSAGE_NOTE_ON] message with `0` velocity and expect it to be treated the same as a [MIDI_MESSAGE_NOTE_OFF] message. If necessary, this can be handled with a few lines of code:
   *
   * ```
   * 			func _input(event):
   * 			    if event is InputEventMIDI:
   * 			        if event.message == MIDI_MESSAGE_NOTE_ON and event.velocity > 0:
   * 			            print("Note pressed!")
   * 			```
   */
  public var velocity: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVelocityPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setVelocityPtr, NIL)
    }

  /**
   * The instrument (also called *program* or *preset*) used on this MIDI message. This value ranges from `0` to `127`.
   *
   * To see what each value means, refer to the [godot.General MIDI's instrument list](https://en.wikipedia.org/wiki/General_MIDI#Program_change_events). Keep in mind that the list is off by 1 because it does not begin from 0. A value of `0` corresponds to the acoustic grand piano.
   */
  public var instrument: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getInstrumentPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setInstrumentPtr, NIL)
    }

  /**
   * The strength of the key being pressed. This value ranges from `0` to `127`.
   *
   * **Note:** For many devices, this value is always `0`. Other devices such as musical keyboards may simulate pressure by changing the [velocity], instead.
   */
  public var pressure: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPressurePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setPressurePtr, NIL)
    }

  /**
   * The unique number of the controller, if [message] is [MIDI_MESSAGE_CONTROL_CHANGE], otherwise this is `0`. This value can be used to identify sliders for volume, balance, and panning, as well as switches and pedals on the MIDI device. See the [godot.General MIDI specification](https://en.wikipedia.org/wiki/General_MIDI#Controller_events) for a small list.
   */
  public var controllerNumber: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getControllerNumberPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setControllerNumberPtr, NIL)
    }

  /**
   * The value applied to the controller. If [message] is [MIDI_MESSAGE_CONTROL_CHANGE], this value ranges from `0` to `127`, otherwise it is `0`. See also [controllerValue].
   */
  public var controllerValue: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getControllerValuePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setControllerValuePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_INPUTEVENTMIDI, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setChannelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMIDI", "set_channel")

    public val getChannelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMIDI", "get_channel")

    public val setMessagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMIDI", "set_message")

    public val getMessagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMIDI", "get_message")

    public val setPitchPtr: VoidPtr = TypeManager.getMethodBindPtr("InputEventMIDI", "set_pitch")

    public val getPitchPtr: VoidPtr = TypeManager.getMethodBindPtr("InputEventMIDI", "get_pitch")

    public val setVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMIDI", "set_velocity")

    public val getVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMIDI", "get_velocity")

    public val setInstrumentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMIDI", "set_instrument")

    public val getInstrumentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMIDI", "get_instrument")

    public val setPressurePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMIDI", "set_pressure")

    public val getPressurePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMIDI", "get_pressure")

    public val setControllerNumberPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMIDI", "set_controller_number")

    public val getControllerNumberPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMIDI", "get_controller_number")

    public val setControllerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMIDI", "set_controller_value")

    public val getControllerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventMIDI", "get_controller_value")
  }
}
