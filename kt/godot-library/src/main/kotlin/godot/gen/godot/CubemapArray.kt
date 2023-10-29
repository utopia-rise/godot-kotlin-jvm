// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * An array of [godot.Cubemap]s, stored together and with a single reference.
 *
 * [godot.CubemapArray]s are made of an array of [godot.Cubemap]s. Like [godot.Cubemap]s, they are made of multiple textures, the amount of which must be divisible by 6 (one for each face of the cube). The primary benefit of [godot.CubemapArray]s is that they can be accessed in shader code using a single texture reference. In other words, you can pass multiple [godot.Cubemap]s into a shader using a single [godot.CubemapArray].
 *
 * Moreover, [godot.Cubemap]s are allocated in adjacent cache regions on the GPU. This makes [godot.CubemapArray]s the most efficient way to store multiple [godot.Cubemap]s.
 *
 * Internally, Godot uses [godot.CubemapArray]s for many effects, including the [godot.Sky] if you set [godot.ProjectSettings.rendering/reflections/skyReflections/textureArrayReflections] to `true`.
 *
 * To create such a texture file yourself, reimport your image files using the import presets of the File System dock.
 *
 * **Note:** [godot.CubemapArray] is not supported in the OpenGL 3 rendering backend.
 */
@GodotBaseType
public open class CubemapArray : ImageTextureLayered() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CUBEMAPARRAY, scriptIndex)
    return true
  }

  /**
   * Creates a placeholder version of this resource ([godot.PlaceholderCubemapArray]).
   */
  public fun createPlaceholder(): Resource? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CUBEMAPARRAY_CREATE_PLACEHOLDER,
        OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Resource?)
  }

  public companion object
}
