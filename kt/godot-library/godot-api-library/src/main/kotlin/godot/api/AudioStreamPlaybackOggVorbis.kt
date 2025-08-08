// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import kotlin.Float
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.Suppress

@GodotBaseType
public open class AudioStreamPlaybackOggVorbis : AudioStreamPlaybackResampled() {
  override fun new(scriptIndex: Int) {
    createNativeObject(89, scriptIndex)
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _getStreamSamplingRate(): Float {
    throw NotImplementedError("AudioStreamPlaybackOggVorbis::_getStreamSamplingRate can't be called from the JVM.")
  }

  public companion object

  public object MethodBindings
}
