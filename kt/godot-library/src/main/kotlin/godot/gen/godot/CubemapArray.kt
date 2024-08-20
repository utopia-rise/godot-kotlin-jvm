// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * [CubemapArray]s are made of an array of [Cubemap]s. Like [Cubemap]s, they are made of multiple
 * textures, the amount of which must be divisible by 6 (one for each face of the cube).
 * The primary benefit of [CubemapArray]s is that they can be accessed in shader code using a single
 * texture reference. In other words, you can pass multiple [Cubemap]s into a shader using a single
 * [CubemapArray]. [Cubemap]s are allocated in adjacent cache regions on the GPU, which makes
 * [CubemapArray]s the most efficient way to store multiple [Cubemap]s.
 * **Note:** Godot uses [CubemapArray]s internally for many effects, including the [Sky] if you set
 * [ProjectSettings.rendering/reflections/skyReflections/textureArrayReflections] to `true`. To create
 * such a texture file yourself, reimport your image files using the import presets of the File System
 * dock.
 * **Note:** [CubemapArray] is not supported in the OpenGL 3 rendering backend.
 */
@GodotBaseType
public open class CubemapArray : ImageTextureLayered() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CUBEMAPARRAY, scriptIndex)
    return true
  }

  /**
   * Creates a placeholder version of this resource ([PlaceholderCubemapArray]).
   */
  public fun createPlaceholder(): Resource? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.createPlaceholderPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Resource?)
  }

  public companion object

  internal object MethodBindings {
    public val createPlaceholderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CubemapArray", "create_placeholder")
  }
}
