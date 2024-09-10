// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * This node applies weights from a [XRFaceTracker] to a mesh with supporting face blend shapes.
 * The
 * [url=https://docs.vrcft.io/docs/tutorial-avatars/tutorial-avatars-extras/unified-blendshapes]Unified
 * Expressions[/url] blend shapes are supported, as well as ARKit and SRanipal blend shapes.
 * The node attempts to identify blend shapes based on name matching. Blend shapes should match the
 * names listed in the
 * [url=https://docs.vrcft.io/docs/tutorial-avatars/tutorial-avatars-extras/compatibility/overview]Unified
 * Expressions Compatibility[/url] chart.
 */
@GodotBaseType
public open class XRFaceModifier3D : Node3D() {
  /**
   * The [XRFaceTracker] path.
   */
  public var faceTracker: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFaceTrackerPtr, STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFaceTrackerPtr, NIL)
    }

  /**
   * The [NodePath] of the face [MeshInstance3D].
   */
  public var target: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTargetPtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTargetPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_XRFACEMODIFIER3D, scriptIndex)
  }

  public companion object

  internal object MethodBindings {
    public val setFaceTrackerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRFaceModifier3D", "set_face_tracker", 3304788590)

    public val getFaceTrackerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRFaceModifier3D", "get_face_tracker", 2002593661)

    public val setTargetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRFaceModifier3D", "set_target", 1348162250)

    public val getTargetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRFaceModifier3D", "get_target", 4075236667)
  }
}
