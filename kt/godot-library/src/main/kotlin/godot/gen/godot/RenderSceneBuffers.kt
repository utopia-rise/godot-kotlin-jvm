// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * Abstract scene buffers object, created for each viewport for which 3D rendering is done.
 *
 * Abstract scene buffers object, created for each viewport for which 3D rendering is done. It manages any additional buffers used during rendering and will discard buffers when the viewport is resized.
 *
 * **Note:** this is an internal rendering server object only exposed for GDExtension plugins.
 */
@GodotBaseType
public open class RenderSceneBuffers internal constructor() : RefCounted() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RENDERSCENEBUFFERS, scriptIndex)
    return true
  }

  /**
   * This method is called by the rendering server when the associated viewports configuration is changed. It will discard the old buffers and recreate the internal buffers used.
   */
  public fun configure(config: RenderSceneBuffersConfiguration): Unit {
    TransferContext.writeArguments(OBJECT to config)
    TransferContext.callMethod(rawPtr, MethodBindings.configurePtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val configurePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneBuffers", "configure")
  }
}
