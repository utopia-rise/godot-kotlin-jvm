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

private const val ENGINE_CLASS_MISSINGNODE_INDEX: Int = 374

/**
 * This is an internal editor class intended for keeping data of nodes of unknown type (most likely
 * this type was supplied by an extension that is no longer loaded). It can't be manually instantiated
 * or placed in a scene.
 * **Warning:** Ignore missing nodes unless you know what you are doing. Existing properties on a
 * missing node can be freely modified in code, regardless of the type they are intended to be.
 */
@GodotBaseType
public open class MissingNode : Node() {
  /**
   * The name of the class this node was supposed to be (see [Object.getClass]).
   */
  public final inline var originalClass: String
    @JvmName("originalClassProperty")
    get() = getOriginalClass()
    @JvmName("originalClassProperty")
    set(`value`) {
      setOriginalClass(value)
    }

  /**
   * Returns the path of the scene this node was instance of originally.
   */
  public final inline var originalScene: String
    @JvmName("originalSceneProperty")
    get() = getOriginalScene()
    @JvmName("originalSceneProperty")
    set(`value`) {
      setOriginalScene(value)
    }

  /**
   * If `true`, allows new properties to be set along with existing ones. If `false`, only existing
   * properties' values can be set, and new properties cannot be added.
   */
  public final inline var recordingProperties: Boolean
    @JvmName("recordingPropertiesProperty")
    get() = isRecordingProperties()
    @JvmName("recordingPropertiesProperty")
    set(`value`) {
      setRecordingProperties(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_MISSINGNODE_INDEX, scriptIndex)
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

  public final fun setOriginalScene(name: String): Unit {
    Internals.writeArguments(STRING to name)
    Internals.callMethod(rawPtr, MethodBindings.setOriginalScenePtr, NIL)
  }

  public final fun getOriginalScene(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getOriginalScenePtr, STRING)
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
        Internals.getMethodBindPtr("MissingNode", "set_original_class", 83702148)

    public val getOriginalClassPtr: VoidPtr =
        Internals.getMethodBindPtr("MissingNode", "get_original_class", 201670096)

    public val setOriginalScenePtr: VoidPtr =
        Internals.getMethodBindPtr("MissingNode", "set_original_scene", 83702148)

    public val getOriginalScenePtr: VoidPtr =
        Internals.getMethodBindPtr("MissingNode", "get_original_scene", 201670096)

    public val setRecordingPropertiesPtr: VoidPtr =
        Internals.getMethodBindPtr("MissingNode", "set_recording_properties", 2586408642)

    public val isRecordingPropertiesPtr: VoidPtr =
        Internals.getMethodBindPtr("MissingNode", "is_recording_properties", 36873697)
  }
}
