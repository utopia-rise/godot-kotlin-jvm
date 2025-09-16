// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Signal0
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmName
import kotlin.jvm.JvmStatic

/**
 * This singleton provides access to static information about [Theme] resources used by the engine and by your projects. You can fetch the default engine theme, as well as your project configured theme.
 *
 * [ThemeDB] also contains fallback values for theme properties.
 */
@GodotBaseType
public object ThemeDB : Object() {
  /**
   * Emitted when one of the fallback values had been changed. Use it to refresh the look of controls that may rely on the fallback theme items.
   */
  @JvmStatic
  public val fallbackChanged: Signal0 by Signal0

  /**
   * The fallback base scale factor of every [Control] node and [Theme] resource. Used when no other value is available to the control.
   *
   * See also [Theme.defaultBaseScale].
   */
  @JvmStatic
  public final inline var fallbackBaseScale: Float
    @JvmName("fallbackBaseScaleProperty")
    get() = getFallbackBaseScale()
    @JvmName("fallbackBaseScaleProperty")
    set(`value`) {
      setFallbackBaseScale(value)
    }

  /**
   * The fallback font of every [Control] node and [Theme] resource. Used when no other value is available to the control.
   *
   * See also [Theme.defaultFont].
   */
  @JvmStatic
  public final inline var fallbackFont: Font?
    @JvmName("fallbackFontProperty")
    get() = getFallbackFont()
    @JvmName("fallbackFontProperty")
    set(`value`) {
      setFallbackFont(value)
    }

  /**
   * The fallback font size of every [Control] node and [Theme] resource. Used when no other value is available to the control.
   *
   * See also [Theme.defaultFontSize].
   */
  @JvmStatic
  public final inline var fallbackFontSize: Int
    @JvmName("fallbackFontSizeProperty")
    get() = getFallbackFontSize()
    @JvmName("fallbackFontSizeProperty")
    set(`value`) {
      setFallbackFontSize(value)
    }

  /**
   * The fallback icon of every [Control] node and [Theme] resource. Used when no other value is available to the control.
   */
  @JvmStatic
  public final inline var fallbackIcon: Texture2D?
    @JvmName("fallbackIconProperty")
    get() = getFallbackIcon()
    @JvmName("fallbackIconProperty")
    set(`value`) {
      setFallbackIcon(value)
    }

  /**
   * The fallback stylebox of every [Control] node and [Theme] resource. Used when no other value is available to the control.
   */
  @JvmStatic
  public final inline var fallbackStylebox: StyleBox?
    @JvmName("fallbackStyleboxProperty")
    get() = getFallbackStylebox()
    @JvmName("fallbackStyleboxProperty")
    set(`value`) {
      setFallbackStylebox(value)
    }

  override fun new(scriptIndex: Int) {
    getSingleton(31)
  }

  /**
   * Returns a reference to the default engine [Theme]. This theme resource is responsible for the out-of-the-box look of [Control] nodes and cannot be overridden.
   */
  @JvmStatic
  public final fun getDefaultTheme(): Theme? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDefaultThemePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Theme?)
  }

  /**
   * Returns a reference to the custom project [Theme]. This theme resources allows to override the default engine theme for every control node in the project.
   *
   * To set the project theme, see [ProjectSettings.gui/theme/custom].
   */
  @JvmStatic
  public final fun getProjectTheme(): Theme? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getProjectThemePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Theme?)
  }

  @JvmStatic
  public final fun setFallbackBaseScale(baseScale: Float) {
    TransferContext.writeArguments(DOUBLE to baseScale.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setFallbackBaseScalePtr, NIL)
  }

  @JvmStatic
  public final fun getFallbackBaseScale(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFallbackBaseScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  @JvmStatic
  public final fun setFallbackFont(font: Font?) {
    TransferContext.writeArguments(OBJECT to font)
    TransferContext.callMethod(ptr, MethodBindings.setFallbackFontPtr, NIL)
  }

  @JvmStatic
  public final fun getFallbackFont(): Font? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFallbackFontPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Font?)
  }

  @JvmStatic
  public final fun setFallbackFontSize(fontSize: Int) {
    TransferContext.writeArguments(LONG to fontSize.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setFallbackFontSizePtr, NIL)
  }

  @JvmStatic
  public final fun getFallbackFontSize(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFallbackFontSizePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  @JvmStatic
  public final fun setFallbackIcon(icon: Texture2D?) {
    TransferContext.writeArguments(OBJECT to icon)
    TransferContext.callMethod(ptr, MethodBindings.setFallbackIconPtr, NIL)
  }

  @JvmStatic
  public final fun getFallbackIcon(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFallbackIconPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  @JvmStatic
  public final fun setFallbackStylebox(stylebox: StyleBox?) {
    TransferContext.writeArguments(OBJECT to stylebox)
    TransferContext.callMethod(ptr, MethodBindings.setFallbackStyleboxPtr, NIL)
  }

  @JvmStatic
  public final fun getFallbackStylebox(): StyleBox? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFallbackStyleboxPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as StyleBox?)
  }

  public object MethodBindings {
    internal val getDefaultThemePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ThemeDB", "get_default_theme", 754_276_358)

    internal val getProjectThemePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ThemeDB", "get_project_theme", 754_276_358)

    internal val setFallbackBaseScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ThemeDB", "set_fallback_base_scale", 373_806_689)

    internal val getFallbackBaseScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ThemeDB", "get_fallback_base_scale", 191_475_506)

    internal val setFallbackFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ThemeDB", "set_fallback_font", 1_262_170_328)

    internal val getFallbackFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ThemeDB", "get_fallback_font", 3_656_929_885)

    internal val setFallbackFontSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ThemeDB", "set_fallback_font_size", 1_286_410_249)

    internal val getFallbackFontSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ThemeDB", "get_fallback_font_size", 2_455_072_627)

    internal val setFallbackIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ThemeDB", "set_fallback_icon", 4_051_416_890)

    internal val getFallbackIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ThemeDB", "get_fallback_icon", 255_860_311)

    internal val setFallbackStyleboxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ThemeDB", "set_fallback_stylebox", 2_797_200_388)

    internal val getFallbackStyleboxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ThemeDB", "get_fallback_stylebox", 496_040_854)
  }
}
