// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 * This class allows for a RenderSceneBuffer implementation to be made in GDExtension.
 */
@GodotBaseType
public open class RenderSceneBuffersExtension : RenderSceneBuffers() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(560, scriptIndex)
  }

  /**
   * Implement this in GDExtension to handle the (re)sizing of a viewport.
   */
  public open fun _configure(config: RenderSceneBuffersConfiguration?): Unit {
    throw NotImplementedError("RenderSceneBuffersExtension::_configure is not implemented.")
  }

  /**
   * Implement this in GDExtension to record a new FSR sharpness value.
   */
  public open fun _setFsrSharpness(fsrSharpness: Float): Unit {
    throw NotImplementedError("RenderSceneBuffersExtension::_setFsrSharpness is not implemented.")
  }

  /**
   * Implement this in GDExtension to change the texture mipmap bias.
   */
  public open fun _setTextureMipmapBias(textureMipmapBias: Float): Unit {
    throw NotImplementedError("RenderSceneBuffersExtension::_setTextureMipmapBias is not implemented.")
  }

  /**
   * Implement this in GDExtension to change the anisotropic filtering level.
   */
  public open fun _setAnisotropicFilteringLevel(anisotropicFilteringLevel: Int): Unit {
    throw NotImplementedError("RenderSceneBuffersExtension::_setAnisotropicFilteringLevel is not implemented.")
  }

  /**
   * Implement this in GDExtension to react to the debanding flag changing.
   */
  public open fun _setUseDebanding(useDebanding: Boolean): Unit {
    throw NotImplementedError("RenderSceneBuffersExtension::_setUseDebanding is not implemented.")
  }

  public companion object

  public object MethodBindings
}
