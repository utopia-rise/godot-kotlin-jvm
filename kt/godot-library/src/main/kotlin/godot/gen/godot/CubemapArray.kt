// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Suppress
import kotlin.Unit

/**
 * A single composite texture resource which consists of multiple [godot.Cubemap]s.
 *
 * [godot.CubemapArray]s are made of an array of [godot.Cubemap]s. Accordingly, like [godot.Cubemap]s they are made of multiple textures the amount of which must be divisible by 6 (one image for each face of the cube). The primary benefit of [godot.CubemapArray]s is that they can be accessed in shader code using a single texture reference. In other words, you can pass multiple [godot.Cubemap]s into a shader using a single [godot.CubemapArray].
 *
 * Generally, [godot.CubemapArray]s provide a more efficient way for storing multiple [godot.Cubemap]s compared to storing multiple [godot.Cubemap]s themselves in an array.
 *
 * Internally, Godot uses [godot.CubemapArray]s for many effects including the [godot.Sky], if you set [godot.ProjectSettings.rendering/reflections/skyReflections/textureArrayReflections] to `true`.
 *
 * To create such a texture file yourself, reimport your image files using the Godot Editor import presets.
 *
 * **Note:** [godot.CubemapArray] is not supported in the OpenGL 3 rendering backend.
 */
@GodotBaseType
public open class CubemapArray : ImageTextureLayered() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_CUBEMAPARRAY)
  }

  public companion object
}
