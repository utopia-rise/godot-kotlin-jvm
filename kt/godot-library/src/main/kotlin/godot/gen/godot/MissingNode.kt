// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

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
  public var originalClass: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOriginalClassPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOriginalClassPtr, NIL)
    }

  /**
   * Returns the path of the scene this node was instance of originally.
   */
  public var originalScene: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOriginalScenePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOriginalScenePtr, NIL)
    }

  /**
   * If `true`, allows new properties to be set along with existing ones. If `false`, only existing
   * properties' values can be set, and new properties cannot be added.
   */
  public var recordingProperties: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isRecordingPropertiesPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRecordingPropertiesPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_MISSINGNODE, scriptIndex)
  }

  public companion object

  internal object MethodBindings {
    public val setOriginalClassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MissingNode", "set_original_class")

    public val getOriginalClassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MissingNode", "get_original_class")

    public val setOriginalScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MissingNode", "set_original_scene")

    public val getOriginalScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MissingNode", "get_original_scene")

    public val setRecordingPropertiesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MissingNode", "set_recording_properties")

    public val isRecordingPropertiesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MissingNode", "is_recording_properties")
  }
}
