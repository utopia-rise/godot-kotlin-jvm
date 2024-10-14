// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.core.NodePath
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantParser.NIL
import godot.core.VariantParser.NODE_PATH
import godot.core.VariantParser.STRING_NAME
import godot.core.memory.TransferContext
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
  public final inline var faceTracker: StringName
    @JvmName("faceTrackerProperty")
    get() = getFaceTracker()
    @JvmName("faceTrackerProperty")
    set(`value`) {
      setFaceTracker(value)
    }

  /**
   * The [NodePath] of the face [MeshInstance3D].
   */
  public final inline var target: NodePath
    @JvmName("targetProperty")
    get() = getTarget()
    @JvmName("targetProperty")
    set(`value`) {
      setTarget(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_XRFACEMODIFIER3D, scriptIndex)
  }

  public final fun setFaceTracker(trackerName: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to trackerName)
    TransferContext.callMethod(ptr, MethodBindings.setFaceTrackerPtr, NIL)
  }

  public final fun getFaceTracker(): StringName {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFaceTrackerPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  public final fun setTarget(target: NodePath): Unit {
    TransferContext.writeArguments(NODE_PATH to target)
    TransferContext.callMethod(ptr, MethodBindings.setTargetPtr, NIL)
  }

  public final fun getTarget(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTargetPtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH) as NodePath)
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
