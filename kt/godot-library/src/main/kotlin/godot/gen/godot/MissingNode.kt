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

/**
 * An internal editor class intended for keeping the data of unrecognized nodes.
 *
 * This is an internal editor class intended for keeping data of nodes of unknown type (most likely this type was supplied by an extension that is no longer loaded). It can't be manually instantiated or placed in the scene. Ignore it if you don't know what it is.
 */
@GodotBaseType
public open class MissingNode : Node() {
  /**
   * Returns the name of the type this node was originally.
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
   *
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

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_MISSINGNODE, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setOriginalClassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MissingNode", "set_original_class")

    public val getOriginalClassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MissingNode", "get_original_class")

    public val setRecordingPropertiesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MissingNode", "set_recording_properties")

    public val isRecordingPropertiesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MissingNode", "is_recording_properties")
  }
}
