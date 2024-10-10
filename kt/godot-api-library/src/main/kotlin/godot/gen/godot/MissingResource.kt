// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_MISSINGRESOURCE_INDEX: Int = 375

/**
 * This is an internal editor class intended for keeping data of resources of unknown type (most
 * likely this type was supplied by an extension that is no longer loaded). It can't be manually
 * instantiated or placed in a scene.
 * **Warning:** Ignore missing resources unless you know what you are doing. Existing properties on
 * a missing resource can be freely modified in code, regardless of the type they are intended to be.
 */
@GodotBaseType
public open class MissingResource : Resource() {
  /**
   * The name of the class this resource was supposed to be (see [Object.getClass]).
   */
  public final inline var originalClass: String
    @JvmName("originalClassProperty")
    get() = getOriginalClass()
    @JvmName("originalClassProperty")
    set(`value`) {
      setOriginalClass(value)
    }

  /**
   * If set to `true`, allows new properties to be added on top of the existing ones with
   * [Object.set].
   */
  public final inline var recordingProperties: Boolean
    @JvmName("recordingPropertiesProperty")
    get() = isRecordingProperties()
    @JvmName("recordingPropertiesProperty")
    set(`value`) {
      setRecordingProperties(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_MISSINGRESOURCE_INDEX, scriptIndex)
  }

  public final fun setOriginalClass(name: String): Unit {
    Internals.writeArguments(STRING to name)
    Internals.callMethod(rawPtr, MethodBindings.setOriginalClassPtr, NIL)
  }

  public final fun getOriginalClass(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getOriginalClassPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  public final fun setRecordingProperties(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setRecordingPropertiesPtr, NIL)
  }

  public final fun isRecordingProperties(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isRecordingPropertiesPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setOriginalClassPtr: VoidPtr =
        Internals.getMethodBindPtr("MissingResource", "set_original_class", 83702148)

    public val getOriginalClassPtr: VoidPtr =
        Internals.getMethodBindPtr("MissingResource", "get_original_class", 201670096)

    public val setRecordingPropertiesPtr: VoidPtr =
        Internals.getMethodBindPtr("MissingResource", "set_recording_properties", 2586408642)

    public val isRecordingPropertiesPtr: VoidPtr =
        Internals.getMethodBindPtr("MissingResource", "is_recording_properties", 36873697)
  }
}
