// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * An engine singleton providing access to static [godot.Theme] information, such as default and project theme, and fallback values.
 *
 * This engine singleton provides access to static information about [godot.Theme] resources used by the engine and by your projects. You can fetch the default engine theme, as well as your project configured theme.
 *
 * [godot.ThemeDB] also contains fallback values for theme properties.
 */
@GodotBaseType
public object ThemeDB : Object() {
  /**
   * Emitted when one of the fallback values had been changed. Use it to refresh the look of controls that may rely on the fallback theme items.
   */
  public val fallbackChanged: Signal0 by signal()

  public override fun new(scriptIndex: Int): Boolean {
    rawPtr = TransferContext.getSingleton(ENGINECLASS_THEMEDB)
    return false
  }

  /**
   * Returns a reference to the default engine [godot.Theme]. This theme resource is responsible for the out-of-the-box look of [godot.Control] nodes and cannot be overridden.
   */
  public fun getDefaultTheme(): Theme? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEMEDB_GET_DEFAULT_THEME, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Theme?
  }

  /**
   * Returns a reference to the custom project [godot.Theme]. This theme resources allows to override the default engine theme for every control node in the project.
   *
   * To set the project theme, see [godot.ProjectSettings.gui/theme/custom].
   */
  public fun getProjectTheme(): Theme? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEMEDB_GET_PROJECT_THEME, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Theme?
  }

  public fun setFallbackBaseScale(baseScale: Double): Unit {
    TransferContext.writeArguments(DOUBLE to baseScale)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEMEDB_SET_FALLBACK_BASE_SCALE,
        NIL)
  }

  public fun getFallbackBaseScale(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEMEDB_GET_FALLBACK_BASE_SCALE,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  public fun setFallbackFont(font: Font): Unit {
    TransferContext.writeArguments(OBJECT to font)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEMEDB_SET_FALLBACK_FONT, NIL)
  }

  public fun getFallbackFont(): Font? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEMEDB_GET_FALLBACK_FONT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Font?
  }

  public fun setFallbackFontSize(fontSize: Long): Unit {
    TransferContext.writeArguments(LONG to fontSize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEMEDB_SET_FALLBACK_FONT_SIZE, NIL)
  }

  public fun getFallbackFontSize(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEMEDB_GET_FALLBACK_FONT_SIZE,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public fun setFallbackIcon(icon: Texture2D): Unit {
    TransferContext.writeArguments(OBJECT to icon)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEMEDB_SET_FALLBACK_ICON, NIL)
  }

  public fun getFallbackIcon(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEMEDB_GET_FALLBACK_ICON, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
  }

  public fun setFallbackStylebox(stylebox: StyleBox): Unit {
    TransferContext.writeArguments(OBJECT to stylebox)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEMEDB_SET_FALLBACK_STYLEBOX, NIL)
  }

  public fun getFallbackStylebox(): StyleBox? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_THEMEDB_GET_FALLBACK_STYLEBOX,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as StyleBox?
  }
}
