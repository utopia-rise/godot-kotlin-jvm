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
import godot.core.VariantParser.OBJECT
import godot.createPlaceholderPtr
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

private const val ENGINECLASS_CUBEMAP: Int = 214

/**
 * A cubemap is made of 6 textures organized in layers. They are typically used for faking
 * reflections in 3D rendering (see [ReflectionProbe]). It can be used to make an object look as if
 * it's reflecting its surroundings. This usually delivers much better performance than other
 * reflection methods.
 * This resource is typically used as a uniform in custom shaders. Few core Godot methods make use
 * of [Cubemap] resources.
 * To create such a texture file yourself, reimport your image files using the Godot Editor import
 * presets.
 * **Note:** Godot doesn't support using cubemaps in a [PanoramaSkyMaterial]. You can use
 * [url=https://danilw.github.io/GLSL-howto/cubemap_to_panorama_js/cubemap_to_panorama.html]this
 * tool[/url] to convert a cubemap to an equirectangular sky map.
 */
@GodotBaseType
public open class Cubemap : ImageTextureLayered() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_CUBEMAP, scriptIndex)
  }

  /**
   * Creates a placeholder version of this resource ([PlaceholderCubemap]).
   */
  public final fun createPlaceholder(): Resource? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.createPlaceholderPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Resource?)
  }

  public companion object

  public object MethodBindings {
    internal val createPlaceholderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Cubemap", "create_placeholder", 121922552)
  }
}
