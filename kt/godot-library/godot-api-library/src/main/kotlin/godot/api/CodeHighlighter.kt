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
import godot.addColorRegionPtr
import godot.addKeywordColorPtr
import godot.addMemberKeywordColorPtr
import godot.clearColorRegionsPtr
import godot.clearKeywordColorsPtr
import godot.clearMemberKeywordColorsPtr
import godot.common.interop.VoidPtr
import godot.core.Color
import godot.core.Dictionary
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DICTIONARY
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING
import godot.getColorRegionsPtr
import godot.getFunctionColorPtr
import godot.getKeywordColorPtr
import godot.getKeywordColorsPtr
import godot.getMemberKeywordColorPtr
import godot.getMemberKeywordColorsPtr
import godot.getMemberVariableColorPtr
import godot.getNumberColorPtr
import godot.getSymbolColorPtr
import godot.hasColorRegionPtr
import godot.hasKeywordColorPtr
import godot.hasMemberKeywordColorPtr
import godot.removeColorRegionPtr
import godot.removeKeywordColorPtr
import godot.removeMemberKeywordColorPtr
import godot.setColorRegionsPtr
import godot.setFunctionColorPtr
import godot.setKeywordColorsPtr
import godot.setMemberKeywordColorsPtr
import godot.setMemberVariableColorPtr
import godot.setNumberColorPtr
import godot.setSymbolColorPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

private const val ENGINECLASS_CODEHIGHLIGHTER: Int = 185

/**
 * By adjusting various properties of this resource, you can change the colors of strings, comments,
 * numbers, and other text patterns inside a [TextEdit] control.
 */
@GodotBaseType
public open class CodeHighlighter : SyntaxHighlighter() {
  /**
   * Sets the color for numbers.
   */
  @CoreTypeLocalCopy
  public final inline var numberColor: Color
    @JvmName("numberColorProperty")
    get() = getNumberColor()
    @JvmName("numberColorProperty")
    set(`value`) {
      setNumberColor(value)
    }

  /**
   * Sets the color for symbols.
   */
  @CoreTypeLocalCopy
  public final inline var symbolColor: Color
    @JvmName("symbolColorProperty")
    get() = getSymbolColor()
    @JvmName("symbolColorProperty")
    set(`value`) {
      setSymbolColor(value)
    }

  /**
   * Sets color for functions. A function is a non-keyword string followed by a '('.
   */
  @CoreTypeLocalCopy
  public final inline var functionColor: Color
    @JvmName("functionColorProperty")
    get() = getFunctionColor()
    @JvmName("functionColorProperty")
    set(`value`) {
      setFunctionColor(value)
    }

  /**
   * Sets color for member variables. A member variable is non-keyword, non-function string
   * proceeded with a '.'.
   */
  @CoreTypeLocalCopy
  public final inline var memberVariableColor: Color
    @JvmName("memberVariableColorProperty")
    get() = getMemberVariableColor()
    @JvmName("memberVariableColorProperty")
    set(`value`) {
      setMemberVariableColor(value)
    }

  /**
   * Sets the keyword colors. All existing keywords will be removed. The [Dictionary] key is the
   * keyword. The value is the keyword color.
   */
  public final inline var keywordColors: Dictionary<Any?, Any?>
    @JvmName("keywordColorsProperty")
    get() = getKeywordColors()
    @JvmName("keywordColorsProperty")
    set(`value`) {
      setKeywordColors(value)
    }

  /**
   * Sets the member keyword colors. All existing member keyword will be removed. The [Dictionary]
   * key is the member keyword. The value is the member keyword color.
   */
  public final inline var memberKeywordColors: Dictionary<Any?, Any?>
    @JvmName("memberKeywordColorsProperty")
    get() = getMemberKeywordColors()
    @JvmName("memberKeywordColorsProperty")
    set(`value`) {
      setMemberKeywordColors(value)
    }

  /**
   * Sets the color regions. All existing regions will be removed. The [Dictionary] key is the
   * region start and end key, separated by a space. The value is the region color.
   */
  public final inline var colorRegions: Dictionary<Any?, Any?>
    @JvmName("colorRegionsProperty")
    get() = getColorRegions()
    @JvmName("colorRegionsProperty")
    set(`value`) {
      setColorRegions(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_CODEHIGHLIGHTER, scriptIndex)
  }

  /**
   * Sets the color for numbers.
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
   * val myCoreType = codehighlighter.numberColor
   * //Your changes
   * codehighlighter.numberColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun numberColorMutate(block: Color.() -> Unit): Color = numberColor.apply{
      block(this)
      numberColor = this
  }


  /**
   * Sets the color for symbols.
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
   * val myCoreType = codehighlighter.symbolColor
   * //Your changes
   * codehighlighter.symbolColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun symbolColorMutate(block: Color.() -> Unit): Color = symbolColor.apply{
      block(this)
      symbolColor = this
  }


  /**
   * Sets color for functions. A function is a non-keyword string followed by a '('.
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
   * val myCoreType = codehighlighter.functionColor
   * //Your changes
   * codehighlighter.functionColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun functionColorMutate(block: Color.() -> Unit): Color = functionColor.apply{
      block(this)
      functionColor = this
  }


  /**
   * Sets color for member variables. A member variable is non-keyword, non-function string
   * proceeded with a '.'.
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
   * val myCoreType = codehighlighter.memberVariableColor
   * //Your changes
   * codehighlighter.memberVariableColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun memberVariableColorMutate(block: Color.() -> Unit): Color =
      memberVariableColor.apply{
      block(this)
      memberVariableColor = this
  }


  /**
   * Sets the color for a keyword.
   * The keyword cannot contain any symbols except '_'.
   */
  public final fun addKeywordColor(keyword: String, color: Color): Unit {
    TransferContext.writeArguments(STRING to keyword, COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.addKeywordColorPtr, NIL)
  }

  /**
   * Removes the keyword.
   */
  public final fun removeKeywordColor(keyword: String): Unit {
    TransferContext.writeArguments(STRING to keyword)
    TransferContext.callMethod(ptr, MethodBindings.removeKeywordColorPtr, NIL)
  }

  /**
   * Returns `true` if the keyword exists, else `false`.
   */
  public final fun hasKeywordColor(keyword: String): Boolean {
    TransferContext.writeArguments(STRING to keyword)
    TransferContext.callMethod(ptr, MethodBindings.hasKeywordColorPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the color for a keyword.
   */
  public final fun getKeywordColor(keyword: String): Color {
    TransferContext.writeArguments(STRING to keyword)
    TransferContext.callMethod(ptr, MethodBindings.getKeywordColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setKeywordColors(keywords: Dictionary<Any?, Any?>): Unit {
    TransferContext.writeArguments(DICTIONARY to keywords)
    TransferContext.callMethod(ptr, MethodBindings.setKeywordColorsPtr, NIL)
  }

  /**
   * Removes all keywords.
   */
  public final fun clearKeywordColors(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearKeywordColorsPtr, NIL)
  }

  public final fun getKeywordColors(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getKeywordColorsPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  /**
   * Sets the color for a member keyword.
   * The member keyword cannot contain any symbols except '_'.
   * It will not be highlighted if preceded by a '.'.
   */
  public final fun addMemberKeywordColor(memberKeyword: String, color: Color): Unit {
    TransferContext.writeArguments(STRING to memberKeyword, COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.addMemberKeywordColorPtr, NIL)
  }

  /**
   * Removes the member keyword.
   */
  public final fun removeMemberKeywordColor(memberKeyword: String): Unit {
    TransferContext.writeArguments(STRING to memberKeyword)
    TransferContext.callMethod(ptr, MethodBindings.removeMemberKeywordColorPtr, NIL)
  }

  /**
   * Returns `true` if the member keyword exists, else `false`.
   */
  public final fun hasMemberKeywordColor(memberKeyword: String): Boolean {
    TransferContext.writeArguments(STRING to memberKeyword)
    TransferContext.callMethod(ptr, MethodBindings.hasMemberKeywordColorPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the color for a member keyword.
   */
  public final fun getMemberKeywordColor(memberKeyword: String): Color {
    TransferContext.writeArguments(STRING to memberKeyword)
    TransferContext.callMethod(ptr, MethodBindings.getMemberKeywordColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setMemberKeywordColors(memberKeyword: Dictionary<Any?, Any?>): Unit {
    TransferContext.writeArguments(DICTIONARY to memberKeyword)
    TransferContext.callMethod(ptr, MethodBindings.setMemberKeywordColorsPtr, NIL)
  }

  /**
   * Removes all member keywords.
   */
  public final fun clearMemberKeywordColors(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearMemberKeywordColorsPtr, NIL)
  }

  public final fun getMemberKeywordColors(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMemberKeywordColorsPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  /**
   * Adds a color region (such as for comments or strings) from [startKey] to [endKey]. Both keys
   * should be symbols, and [startKey] must not be shared with other delimiters.
   * If [lineOnly] is `true` or [endKey] is an empty [String], the region does not carry over to the
   * next line.
   */
  @JvmOverloads
  public final fun addColorRegion(
    startKey: String,
    endKey: String,
    color: Color,
    lineOnly: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(STRING to startKey, STRING to endKey, COLOR to color, BOOL to lineOnly)
    TransferContext.callMethod(ptr, MethodBindings.addColorRegionPtr, NIL)
  }

  /**
   * Removes the color region that uses that start key.
   */
  public final fun removeColorRegion(startKey: String): Unit {
    TransferContext.writeArguments(STRING to startKey)
    TransferContext.callMethod(ptr, MethodBindings.removeColorRegionPtr, NIL)
  }

  /**
   * Returns `true` if the start key exists, else `false`.
   */
  public final fun hasColorRegion(startKey: String): Boolean {
    TransferContext.writeArguments(STRING to startKey)
    TransferContext.callMethod(ptr, MethodBindings.hasColorRegionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setColorRegions(colorRegions: Dictionary<Any?, Any?>): Unit {
    TransferContext.writeArguments(DICTIONARY to colorRegions)
    TransferContext.callMethod(ptr, MethodBindings.setColorRegionsPtr, NIL)
  }

  /**
   * Removes all color regions.
   */
  public final fun clearColorRegions(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearColorRegionsPtr, NIL)
  }

  public final fun getColorRegions(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getColorRegionsPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  public final fun setFunctionColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.setFunctionColorPtr, NIL)
  }

  public final fun getFunctionColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFunctionColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setNumberColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.setNumberColorPtr, NIL)
  }

  public final fun getNumberColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getNumberColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setSymbolColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.setSymbolColorPtr, NIL)
  }

  public final fun getSymbolColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSymbolColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setMemberVariableColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.setMemberVariableColorPtr, NIL)
  }

  public final fun getMemberVariableColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMemberVariableColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public companion object

  public object MethodBindings {
    internal val addKeywordColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "add_keyword_color", 1636512886)

    internal val removeKeywordColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "remove_keyword_color", 83702148)

    internal val hasKeywordColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "has_keyword_color", 3927539163)

    internal val getKeywordColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "get_keyword_color", 3855908743)

    internal val setKeywordColorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "set_keyword_colors", 4155329257)

    internal val clearKeywordColorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "clear_keyword_colors", 3218959716)

    internal val getKeywordColorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "get_keyword_colors", 3102165223)

    internal val addMemberKeywordColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "add_member_keyword_color", 1636512886)

    internal val removeMemberKeywordColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "remove_member_keyword_color", 83702148)

    internal val hasMemberKeywordColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "has_member_keyword_color", 3927539163)

    internal val getMemberKeywordColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "get_member_keyword_color", 3855908743)

    internal val setMemberKeywordColorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "set_member_keyword_colors", 4155329257)

    internal val clearMemberKeywordColorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "clear_member_keyword_colors", 3218959716)

    internal val getMemberKeywordColorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "get_member_keyword_colors", 3102165223)

    internal val addColorRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "add_color_region", 2924977451)

    internal val removeColorRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "remove_color_region", 83702148)

    internal val hasColorRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "has_color_region", 3927539163)

    internal val setColorRegionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "set_color_regions", 4155329257)

    internal val clearColorRegionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "clear_color_regions", 3218959716)

    internal val getColorRegionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "get_color_regions", 3102165223)

    internal val setFunctionColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "set_function_color", 2920490490)

    internal val getFunctionColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "get_function_color", 3444240500)

    internal val setNumberColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "set_number_color", 2920490490)

    internal val getNumberColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "get_number_color", 3444240500)

    internal val setSymbolColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "set_symbol_color", 2920490490)

    internal val getSymbolColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "get_symbol_color", 3444240500)

    internal val setMemberVariableColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "set_member_variable_color", 2920490490)

    internal val getMemberVariableColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "get_member_variable_color", 3444240500)
  }
}
