// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Signal0
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmStatic

private const val ENGINE_CLASS_THEMEDB_INDEX: Int = 25

/**
 * This singleton provides access to static information about [Theme] resources used by the engine
 * and by your projects. You can fetch the default engine theme, as well as your project configured
 * theme.
 * [ThemeDB] also contains fallback values for theme properties.
 */
@GodotBaseType
public object ThemeDB : Object() {
  /**
   * Emitted when one of the fallback values had been changed. Use it to refresh the look of
   * controls that may rely on the fallback theme items.
   */
  @JvmStatic
  public val fallbackChanged: Signal0 by Signal0

  public override fun new(scriptIndex: Int): Unit {
    Internals.getSingleton(this, ENGINE_CLASS_THEMEDB_INDEX)
  }

  /**
   * Returns a reference to the default engine [Theme]. This theme resource is responsible for the
   * out-of-the-box look of [Control] nodes and cannot be overridden.
   */
  @JvmStatic
  public final fun getDefaultTheme(): Theme? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDefaultThemePtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Theme?)
  }

  /**
   * Returns a reference to the custom project [Theme]. This theme resources allows to override the
   * default engine theme for every control node in the project.
   * To set the project theme, see [ProjectSettings.gui/theme/custom].
   */
  @JvmStatic
  public final fun getProjectTheme(): Theme? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getProjectThemePtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Theme?)
  }

  @JvmStatic
  public final fun setFallbackBaseScale(baseScale: Float): Unit {
    Internals.writeArguments(DOUBLE to baseScale.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setFallbackBaseScalePtr, NIL)
  }

  @JvmStatic
  public final fun getFallbackBaseScale(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFallbackBaseScalePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  @JvmStatic
  public final fun setFallbackFont(font: Font?): Unit {
    Internals.writeArguments(OBJECT to font)
    Internals.callMethod(rawPtr, MethodBindings.setFallbackFontPtr, NIL)
  }

  @JvmStatic
  public final fun getFallbackFont(): Font? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFallbackFontPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Font?)
  }

  @JvmStatic
  public final fun setFallbackFontSize(fontSize: Int): Unit {
    Internals.writeArguments(LONG to fontSize.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setFallbackFontSizePtr, NIL)
  }

  @JvmStatic
  public final fun getFallbackFontSize(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFallbackFontSizePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  @JvmStatic
  public final fun setFallbackIcon(icon: Texture2D?): Unit {
    Internals.writeArguments(OBJECT to icon)
    Internals.callMethod(rawPtr, MethodBindings.setFallbackIconPtr, NIL)
  }

  @JvmStatic
  public final fun getFallbackIcon(): Texture2D? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFallbackIconPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Texture2D?)
  }

  @JvmStatic
  public final fun setFallbackStylebox(stylebox: StyleBox?): Unit {
    Internals.writeArguments(OBJECT to stylebox)
    Internals.callMethod(rawPtr, MethodBindings.setFallbackStyleboxPtr, NIL)
  }

  @JvmStatic
  public final fun getFallbackStylebox(): StyleBox? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFallbackStyleboxPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as StyleBox?)
  }

  internal object MethodBindings {
    public val getDefaultThemePtr: VoidPtr =
        Internals.getMethodBindPtr("ThemeDB", "get_default_theme", 754276358)

    public val getProjectThemePtr: VoidPtr =
        Internals.getMethodBindPtr("ThemeDB", "get_project_theme", 754276358)

    public val setFallbackBaseScalePtr: VoidPtr =
        Internals.getMethodBindPtr("ThemeDB", "set_fallback_base_scale", 373806689)

    public val getFallbackBaseScalePtr: VoidPtr =
        Internals.getMethodBindPtr("ThemeDB", "get_fallback_base_scale", 191475506)

    public val setFallbackFontPtr: VoidPtr =
        Internals.getMethodBindPtr("ThemeDB", "set_fallback_font", 1262170328)

    public val getFallbackFontPtr: VoidPtr =
        Internals.getMethodBindPtr("ThemeDB", "get_fallback_font", 3656929885)

    public val setFallbackFontSizePtr: VoidPtr =
        Internals.getMethodBindPtr("ThemeDB", "set_fallback_font_size", 1286410249)

    public val getFallbackFontSizePtr: VoidPtr =
        Internals.getMethodBindPtr("ThemeDB", "get_fallback_font_size", 2455072627)

    public val setFallbackIconPtr: VoidPtr =
        Internals.getMethodBindPtr("ThemeDB", "set_fallback_icon", 4051416890)

    public val getFallbackIconPtr: VoidPtr =
        Internals.getMethodBindPtr("ThemeDB", "get_fallback_icon", 255860311)

    public val setFallbackStyleboxPtr: VoidPtr =
        Internals.getMethodBindPtr("ThemeDB", "set_fallback_stylebox", 2797200388)

    public val getFallbackStyleboxPtr: VoidPtr =
        Internals.getMethodBindPtr("ThemeDB", "get_fallback_stylebox", 496040854)
  }
}
