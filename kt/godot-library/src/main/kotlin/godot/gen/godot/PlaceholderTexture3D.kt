// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR3I
import godot.core.Vector3i
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * Placeholder class for a 3-dimensional texture.
 *
 * This class is used when loading a project that uses a [godot.Texture3D] subclass in 2 conditions:
 *
 * - When running the project exported in dedicated server mode, only the texture's dimensions are kept (as they may be relied upon for gameplay purposes or positioning of other elements). This allows reducing the exported PCK's size significantly.
 *
 * - When this subclass is missing due to using a different engine version or build (e.g. modules disabled).
 *
 * **Note:** This is not intended to be used as an actual texture for rendering. It is not guaranteed to work like one in shaders or materials (for example when calculating UV).
 */
@GodotBaseType
public open class PlaceholderTexture3D : Texture3D() {
  /**
   * The texture's size (in pixels).
   */
  public var size: Vector3i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PLACEHOLDERTEXTURE3D_GET_SIZE,
          VECTOR3I)
      return (TransferContext.readReturnValue(VECTOR3I, false) as Vector3i)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3I to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PLACEHOLDERTEXTURE3D_SET_SIZE,
          NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PLACEHOLDERTEXTURE3D, scriptIndex)
    return true
  }

  public companion object
}
