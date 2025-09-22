// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * Abstract scene buffers object, created for each viewport for which 3D rendering is done. It
 * manages any additional buffers used during rendering and will discard buffers when the viewport is
 * resized.
 *
 * **Note:** This is an internal rendering server object, do not instantiate this from script.
 */
@GodotBaseType
public open class RenderSceneBuffers internal constructor() : RefCounted() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(559, scriptIndex)
  }

  /**
   * This method is called by the rendering server when the associated viewport's configuration is
   * changed. It will discard the old buffers and recreate the internal buffers used.
   */
  public final fun configure(config: RenderSceneBuffersConfiguration?): Unit {
    TransferContext.writeArguments(OBJECT to config)
    TransferContext.callMethod(ptr, MethodBindings.configurePtr, NIL)
  }

  public companion object

  public object MethodBindings {
    internal val configurePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RenderSceneBuffers", "configure", 3072623270)
  }
}
