// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

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
  public val fallbackChanged: Signal0 by signal()

  public override fun new(scriptIndex: Int): Unit {
    getSingleton(ENGINECLASS_THEMEDB)
  }

  /**
   * Returns a reference to the default engine [Theme]. This theme resource is responsible for the
   * out-of-the-box look of [Control] nodes and cannot be overridden.
   */
  public final fun getDefaultTheme(): Theme? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDefaultThemePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Theme?)
  }

  /**
   * Returns a reference to the custom project [Theme]. This theme resources allows to override the
   * default engine theme for every control node in the project.
   * To set the project theme, see [ProjectSettings.gui/theme/custom].
   */
  public final fun getProjectTheme(): Theme? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getProjectThemePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Theme?)
  }

  public final fun setFallbackBaseScale(baseScale: Float): Unit {
    TransferContext.writeArguments(DOUBLE to baseScale.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setFallbackBaseScalePtr, NIL)
  }

  public final fun getFallbackBaseScale(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFallbackBaseScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setFallbackFont(font: Font?): Unit {
    TransferContext.writeArguments(OBJECT to font)
    TransferContext.callMethod(rawPtr, MethodBindings.setFallbackFontPtr, NIL)
  }

  public final fun getFallbackFont(): Font? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFallbackFontPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Font?)
  }

  public final fun setFallbackFontSize(fontSize: Int): Unit {
    TransferContext.writeArguments(LONG to fontSize.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setFallbackFontSizePtr, NIL)
  }

  public final fun getFallbackFontSize(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFallbackFontSizePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setFallbackIcon(icon: Texture2D?): Unit {
    TransferContext.writeArguments(OBJECT to icon)
    TransferContext.callMethod(rawPtr, MethodBindings.setFallbackIconPtr, NIL)
  }

  public final fun getFallbackIcon(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFallbackIconPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  public final fun setFallbackStylebox(stylebox: StyleBox?): Unit {
    TransferContext.writeArguments(OBJECT to stylebox)
    TransferContext.callMethod(rawPtr, MethodBindings.setFallbackStyleboxPtr, NIL)
  }

  public final fun getFallbackStylebox(): StyleBox? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFallbackStyleboxPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as StyleBox?)
  }

  internal object MethodBindings {
    public val getDefaultThemePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ThemeDB", "get_default_theme", 754276358)

    public val getProjectThemePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ThemeDB", "get_project_theme", 754276358)

    public val setFallbackBaseScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ThemeDB", "set_fallback_base_scale", 373806689)

    public val getFallbackBaseScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ThemeDB", "get_fallback_base_scale", 191475506)

    public val setFallbackFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ThemeDB", "set_fallback_font", 1262170328)

    public val getFallbackFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ThemeDB", "get_fallback_font", 3656929885)

    public val setFallbackFontSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ThemeDB", "set_fallback_font_size", 1286410249)

    public val getFallbackFontSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ThemeDB", "get_fallback_font_size", 2455072627)

    public val setFallbackIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ThemeDB", "set_fallback_icon", 4051416890)

    public val getFallbackIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ThemeDB", "get_fallback_icon", 255860311)

    public val setFallbackStyleboxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ThemeDB", "set_fallback_stylebox", 2797200388)

    public val getFallbackStyleboxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ThemeDB", "get_fallback_stylebox", 496040854)
  }
}
