// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.Suppress

/**
 * The base [Resource] for every audio effect. In the editor, an audio effect can be added to the current bus layout through the Audio panel. At run-time, it is also possible to manipulate audio effects through [AudioServer.addBusEffect], [AudioServer.removeBusEffect], and [AudioServer.getBusEffect].
 *
 * When applied on a bus, an audio effect creates a corresponding [AudioEffectInstance]. The instance is directly responsible for manipulating the sound, based on the original audio effect's properties.
 */
@GodotBaseType
public open class AudioEffect : Resource() {
  override fun new(scriptIndex: Int) {
    createNativeObject(45, scriptIndex)
  }

  /**
   * Override this method to customize the [AudioEffectInstance] created when this effect is applied on a bus in the editor's Audio panel, or through [AudioServer.addBusEffect].
   *
   * ```
   * extends AudioEffect
   *
   * @export var strength = 4.0
   *
   * func _instantiate():
   *     var effect = CustomAudioEffectInstance.new()
   *     effect.base = self
   *
   *     return effect
   * ```
   *
   * **Note:** It is recommended to keep a reference to the original [AudioEffect] in the new instance. Depending on the implementation this allows the effect instance to listen for changes at run-time and be modified accordingly.
   */
  public open fun _instantiate(): AudioEffectInstance? {
    throw NotImplementedError("_instantiate is not implemented for AudioEffect")
  }

  public companion object

  public object MethodBindings
}
