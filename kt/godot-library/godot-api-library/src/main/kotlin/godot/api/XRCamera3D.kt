// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import kotlin.Suppress
import kotlin.Unit

/**
 * A camera node which automatically positions itself based on XR tracking data.
 *
 * In contrast to [XRController3D], the render thread has access to more up-to-date tracking data,
 * and the location of the [XRCamera3D] node can lag a few milliseconds behind what is used for
 * rendering.
 *
 * **Note:** If [Viewport.useXr] is `true`, most of the camera properties are overridden by the
 * active [XRInterface]. The only properties that can be trusted are the near and far planes.
 */
@GodotBaseType
public open class XRCamera3D : Camera3D() {
  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(939, scriptPtr)
  }

  public companion object

  public object MethodBindings
}
