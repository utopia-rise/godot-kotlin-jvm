// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Rect2
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.RECT2
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_ATLASTEXTURE_INDEX: Int = 78

/**
 * [Texture2D] resource that draws only part of its [atlas] texture, as defined by the [region]. An
 * additional [margin] can also be set, which is useful for small adjustments.
 * Multiple [AtlasTexture] resources can be cropped from the same [atlas]. Packing many smaller
 * textures into a singular large texture helps to optimize video memory costs and render calls.
 * **Note:** [AtlasTexture] cannot be used in an [AnimatedTexture], and may not tile properly in
 * nodes such as [TextureRect], when inside other [AtlasTexture] resources.
 */
@GodotBaseType
public open class AtlasTexture : Texture2D() {
  /**
   * The texture that contains the atlas. Can be any type inheriting from [Texture2D], including
   * another [AtlasTexture].
   */
  public final inline var atlas: Texture2D?
    @JvmName("atlasProperty")
    get() = getAtlas()
    @JvmName("atlasProperty")
    set(`value`) {
      setAtlas(value)
    }

  /**
   * The region used to draw the [atlas]. If either dimension of the region's size is `0`, the value
   * from [atlas] size will be used for that axis instead.
   */
  @CoreTypeLocalCopy
  public final inline var region: Rect2
    @JvmName("regionProperty")
    get() = getRegion()
    @JvmName("regionProperty")
    set(`value`) {
      setRegion(value)
    }

  /**
   * The margin around the [region]. Useful for small adjustments. If the [Rect2.size] of this
   * property ("w" and "h" in the editor) is set, the drawn texture is resized to fit within the
   * margin.
   */
  @CoreTypeLocalCopy
  public final inline var margin: Rect2
    @JvmName("marginProperty")
    get() = getMargin()
    @JvmName("marginProperty")
    set(`value`) {
      setMargin(value)
    }

  /**
   * If `true`, the area outside of the [region] is clipped to avoid bleeding of the surrounding
   * texture pixels.
   */
  public final inline var filterClip: Boolean
    @JvmName("filterClipProperty")
    get() = hasFilterClip()
    @JvmName("filterClipProperty")
    set(`value`) {
      setFilterClip(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_ATLASTEXTURE_INDEX, scriptIndex)
  }

  /**
   * The region used to draw the [atlas]. If either dimension of the region's size is `0`, the value
   * from [atlas] size will be used for that axis instead.
   *
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = atlastexture.region
   * //Your changes
   * atlastexture.region = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun regionMutate(block: Rect2.() -> Unit): Rect2 = region.apply{
      block(this)
      region = this
  }


  /**
   * The margin around the [region]. Useful for small adjustments. If the [Rect2.size] of this
   * property ("w" and "h" in the editor) is set, the drawn texture is resized to fit within the
   * margin.
   *
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = atlastexture.margin
   * //Your changes
   * atlastexture.margin = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun marginMutate(block: Rect2.() -> Unit): Rect2 = margin.apply{
      block(this)
      margin = this
  }


  public final fun setAtlas(atlas: Texture2D?): Unit {
    Internals.writeArguments(OBJECT to atlas)
    Internals.callMethod(rawPtr, MethodBindings.setAtlasPtr, NIL)
  }

  public final fun getAtlas(): Texture2D? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAtlasPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Texture2D?)
  }

  public final fun setRegion(region: Rect2): Unit {
    Internals.writeArguments(RECT2 to region)
    Internals.callMethod(rawPtr, MethodBindings.setRegionPtr, NIL)
  }

  public final fun getRegion(): Rect2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRegionPtr, RECT2)
    return (Internals.readReturnValue(RECT2) as Rect2)
  }

  public final fun setMargin(margin: Rect2): Unit {
    Internals.writeArguments(RECT2 to margin)
    Internals.callMethod(rawPtr, MethodBindings.setMarginPtr, NIL)
  }

  public final fun getMargin(): Rect2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMarginPtr, RECT2)
    return (Internals.readReturnValue(RECT2) as Rect2)
  }

  public final fun setFilterClip(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setFilterClipPtr, NIL)
  }

  public final fun hasFilterClip(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.hasFilterClipPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  public object MethodBindings {
    internal val setAtlasPtr: VoidPtr =
        Internals.getMethodBindPtr("AtlasTexture", "set_atlas", 4051416890)

    internal val getAtlasPtr: VoidPtr =
        Internals.getMethodBindPtr("AtlasTexture", "get_atlas", 3635182373)

    internal val setRegionPtr: VoidPtr =
        Internals.getMethodBindPtr("AtlasTexture", "set_region", 2046264180)

    internal val getRegionPtr: VoidPtr =
        Internals.getMethodBindPtr("AtlasTexture", "get_region", 1639390495)

    internal val setMarginPtr: VoidPtr =
        Internals.getMethodBindPtr("AtlasTexture", "set_margin", 2046264180)

    internal val getMarginPtr: VoidPtr =
        Internals.getMethodBindPtr("AtlasTexture", "get_margin", 1639390495)

    internal val setFilterClipPtr: VoidPtr =
        Internals.getMethodBindPtr("AtlasTexture", "set_filter_clip", 2586408642)

    internal val hasFilterClipPtr: VoidPtr =
        Internals.getMethodBindPtr("AtlasTexture", "has_filter_clip", 36873697)
  }
}
