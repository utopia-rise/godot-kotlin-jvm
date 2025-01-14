// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * This is a helper spatial node for our camera; note that, if stereoscopic rendering is applicable
 * (VR-HMD), most of the camera properties are ignored, as the HMD information overrides them. The only
 * properties that can be trusted are the near and far planes.
 * The position and orientation of this node is automatically updated by the XR Server to represent
 * the location of the HMD if such tracking is available and can thus be used by game logic. Note that,
 * in contrast to the XR Controller, the render thread has access to the most up-to-date tracking data
 * of the HMD and the location of the XRCamera3D can lag a few milliseconds behind what is used for
 * rendering as a result.
 */
@GodotBaseType
public open class XRCamera3D : Camera3D() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_XRCAMERA3D, scriptIndex)
  }

  public companion object

  internal object MethodBindings
}
