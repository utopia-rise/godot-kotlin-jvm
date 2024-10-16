// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * This class allows for a RenderSceneBuffer implementation to be made in GDExtension.
 */
@GodotBaseType
public open class RenderSceneBuffersExtension : RenderSceneBuffers() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_RENDERSCENEBUFFERSEXTENSION, scriptIndex)
  }

  /**
   * Implement this in GDExtension to handle the (re)sizing of a viewport.
   */
  public open fun _configure(config: RenderSceneBuffersConfiguration?): Unit {
  }

  /**
   * Implement this in GDExtension to record a new FSR sharpness value.
   */
  public open fun _setFsrSharpness(fsrSharpness: Float): Unit {
  }

  /**
   * Implement this in GDExtension to change the texture mipmap bias.
   */
  public open fun _setTextureMipmapBias(textureMipmapBias: Float): Unit {
  }

  /**
   * Implement this in GDExtension to react to the debanding flag changing.
   */
  public open fun _setUseDebanding(useDebanding: Boolean): Unit {
  }

  public companion object

  internal object MethodBindings
}
