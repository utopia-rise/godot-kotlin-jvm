// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.StringName
import godot.core.VariantParser.NIL
import godot.core.VariantParser.NODE_PATH
import godot.core.VariantParser.STRING_NAME
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_XRFACEMODIFIER3D_INDEX: Int = 755

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
    Internals.callConstructor(this, ENGINE_CLASS_XRFACEMODIFIER3D_INDEX, scriptIndex)
  }

  public final fun setFaceTracker(trackerName: StringName): Unit {
    Internals.writeArguments(STRING_NAME to trackerName)
    Internals.callMethod(rawPtr, MethodBindings.setFaceTrackerPtr, NIL)
  }

  public final fun getFaceTracker(): StringName {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFaceTrackerPtr, STRING_NAME)
    return (Internals.readReturnValue(STRING_NAME) as StringName)
  }

  public final fun setTarget(target: NodePath): Unit {
    Internals.writeArguments(NODE_PATH to target)
    Internals.callMethod(rawPtr, MethodBindings.setTargetPtr, NIL)
  }

  public final fun getTarget(): NodePath {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTargetPtr, NODE_PATH)
    return (Internals.readReturnValue(NODE_PATH) as NodePath)
  }

  public companion object

  internal object MethodBindings {
    public val setFaceTrackerPtr: VoidPtr =
        Internals.getMethodBindPtr("XRFaceModifier3D", "set_face_tracker", 3304788590)

    public val getFaceTrackerPtr: VoidPtr =
        Internals.getMethodBindPtr("XRFaceModifier3D", "get_face_tracker", 2002593661)

    public val setTargetPtr: VoidPtr =
        Internals.getMethodBindPtr("XRFaceModifier3D", "set_target", 1348162250)

    public val getTargetPtr: VoidPtr =
        Internals.getMethodBindPtr("XRFaceModifier3D", "get_target", 4075236667)
  }
}
