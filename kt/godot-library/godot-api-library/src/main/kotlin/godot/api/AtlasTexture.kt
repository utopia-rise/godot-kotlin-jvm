// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Rect2
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.RECT2
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
    createNativeObject(78, scriptIndex)
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
    TransferContext.writeArguments(OBJECT to atlas)
    TransferContext.callMethod(ptr, MethodBindings.setAtlasPtr, NIL)
  }

  public final fun getAtlas(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAtlasPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  public final fun setRegion(region: Rect2): Unit {
    TransferContext.writeArguments(RECT2 to region)
    TransferContext.callMethod(ptr, MethodBindings.setRegionPtr, NIL)
  }

  public final fun getRegion(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRegionPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2) as Rect2)
  }

  public final fun setMargin(margin: Rect2): Unit {
    TransferContext.writeArguments(RECT2 to margin)
    TransferContext.callMethod(ptr, MethodBindings.setMarginPtr, NIL)
  }

  public final fun getMargin(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMarginPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2) as Rect2)
  }

  public final fun setFilterClip(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setFilterClipPtr, NIL)
  }

  public final fun hasFilterClip(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.hasFilterClipPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  public object MethodBindings {
    internal val setAtlasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AtlasTexture", "set_atlas", 4051416890)

    internal val getAtlasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AtlasTexture", "get_atlas", 3635182373)

    internal val setRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AtlasTexture", "set_region", 2046264180)

    internal val getRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AtlasTexture", "get_region", 1639390495)

    internal val setMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AtlasTexture", "set_margin", 2046264180)

    internal val getMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AtlasTexture", "get_margin", 1639390495)

    internal val setFilterClipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AtlasTexture", "set_filter_clip", 2586408642)

    internal val hasFilterClipPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AtlasTexture", "has_filter_clip", 36873697)
  }
}
