// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.Dictionary
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

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
    callConstructor(ENGINECLASS_CODEHIGHLIGHTER, scriptIndex)
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
    TransferContext.callMethod(rawPtr, MethodBindings.addKeywordColorPtr, NIL)
  }

  /**
   * Removes the keyword.
   */
  public final fun removeKeywordColor(keyword: String): Unit {
    TransferContext.writeArguments(STRING to keyword)
    TransferContext.callMethod(rawPtr, MethodBindings.removeKeywordColorPtr, NIL)
  }

  /**
   * Returns `true` if the keyword exists, else `false`.
   */
  public final fun hasKeywordColor(keyword: String): Boolean {
    TransferContext.writeArguments(STRING to keyword)
    TransferContext.callMethod(rawPtr, MethodBindings.hasKeywordColorPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the color for a keyword.
   */
  public final fun getKeywordColor(keyword: String): Color {
    TransferContext.writeArguments(STRING to keyword)
    TransferContext.callMethod(rawPtr, MethodBindings.getKeywordColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setKeywordColors(keywords: Dictionary<Any?, Any?>): Unit {
    TransferContext.writeArguments(DICTIONARY to keywords)
    TransferContext.callMethod(rawPtr, MethodBindings.setKeywordColorsPtr, NIL)
  }

  /**
   * Removes all keywords.
   */
  public final fun clearKeywordColors(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearKeywordColorsPtr, NIL)
  }

  public final fun getKeywordColors(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getKeywordColorsPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  /**
   * Sets the color for a member keyword.
   * The member keyword cannot contain any symbols except '_'.
   * It will not be highlighted if preceded by a '.'.
   */
  public final fun addMemberKeywordColor(memberKeyword: String, color: Color): Unit {
    TransferContext.writeArguments(STRING to memberKeyword, COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.addMemberKeywordColorPtr, NIL)
  }

  /**
   * Removes the member keyword.
   */
  public final fun removeMemberKeywordColor(memberKeyword: String): Unit {
    TransferContext.writeArguments(STRING to memberKeyword)
    TransferContext.callMethod(rawPtr, MethodBindings.removeMemberKeywordColorPtr, NIL)
  }

  /**
   * Returns `true` if the member keyword exists, else `false`.
   */
  public final fun hasMemberKeywordColor(memberKeyword: String): Boolean {
    TransferContext.writeArguments(STRING to memberKeyword)
    TransferContext.callMethod(rawPtr, MethodBindings.hasMemberKeywordColorPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the color for a member keyword.
   */
  public final fun getMemberKeywordColor(memberKeyword: String): Color {
    TransferContext.writeArguments(STRING to memberKeyword)
    TransferContext.callMethod(rawPtr, MethodBindings.getMemberKeywordColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setMemberKeywordColors(memberKeyword: Dictionary<Any?, Any?>): Unit {
    TransferContext.writeArguments(DICTIONARY to memberKeyword)
    TransferContext.callMethod(rawPtr, MethodBindings.setMemberKeywordColorsPtr, NIL)
  }

  /**
   * Removes all member keywords.
   */
  public final fun clearMemberKeywordColors(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearMemberKeywordColorsPtr, NIL)
  }

  public final fun getMemberKeywordColors(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMemberKeywordColorsPtr, DICTIONARY)
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
    TransferContext.callMethod(rawPtr, MethodBindings.addColorRegionPtr, NIL)
  }

  /**
   * Removes the color region that uses that start key.
   */
  public final fun removeColorRegion(startKey: String): Unit {
    TransferContext.writeArguments(STRING to startKey)
    TransferContext.callMethod(rawPtr, MethodBindings.removeColorRegionPtr, NIL)
  }

  /**
   * Returns `true` if the start key exists, else `false`.
   */
  public final fun hasColorRegion(startKey: String): Boolean {
    TransferContext.writeArguments(STRING to startKey)
    TransferContext.callMethod(rawPtr, MethodBindings.hasColorRegionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setColorRegions(colorRegions: Dictionary<Any?, Any?>): Unit {
    TransferContext.writeArguments(DICTIONARY to colorRegions)
    TransferContext.callMethod(rawPtr, MethodBindings.setColorRegionsPtr, NIL)
  }

  /**
   * Removes all color regions.
   */
  public final fun clearColorRegions(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearColorRegionsPtr, NIL)
  }

  public final fun getColorRegions(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getColorRegionsPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  public final fun setFunctionColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.setFunctionColorPtr, NIL)
  }

  public final fun getFunctionColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFunctionColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setNumberColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.setNumberColorPtr, NIL)
  }

  public final fun getNumberColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNumberColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setSymbolColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.setSymbolColorPtr, NIL)
  }

  public final fun getSymbolColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSymbolColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setMemberVariableColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.setMemberVariableColorPtr, NIL)
  }

  public final fun getMemberVariableColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMemberVariableColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public companion object

  internal object MethodBindings {
    public val addKeywordColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "add_keyword_color", 1636512886)

    public val removeKeywordColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "remove_keyword_color", 83702148)

    public val hasKeywordColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "has_keyword_color", 3927539163)

    public val getKeywordColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "get_keyword_color", 3855908743)

    public val setKeywordColorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "set_keyword_colors", 4155329257)

    public val clearKeywordColorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "clear_keyword_colors", 3218959716)

    public val getKeywordColorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "get_keyword_colors", 3102165223)

    public val addMemberKeywordColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "add_member_keyword_color", 1636512886)

    public val removeMemberKeywordColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "remove_member_keyword_color", 83702148)

    public val hasMemberKeywordColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "has_member_keyword_color", 3927539163)

    public val getMemberKeywordColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "get_member_keyword_color", 3855908743)

    public val setMemberKeywordColorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "set_member_keyword_colors", 4155329257)

    public val clearMemberKeywordColorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "clear_member_keyword_colors", 3218959716)

    public val getMemberKeywordColorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "get_member_keyword_colors", 3102165223)

    public val addColorRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "add_color_region", 2924977451)

    public val removeColorRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "remove_color_region", 83702148)

    public val hasColorRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "has_color_region", 3927539163)

    public val setColorRegionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "set_color_regions", 4155329257)

    public val clearColorRegionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "clear_color_regions", 3218959716)

    public val getColorRegionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "get_color_regions", 3102165223)

    public val setFunctionColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "set_function_color", 2920490490)

    public val getFunctionColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "get_function_color", 3444240500)

    public val setNumberColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "set_number_color", 2920490490)

    public val getNumberColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "get_number_color", 3444240500)

    public val setSymbolColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "set_symbol_color", 2920490490)

    public val getSymbolColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "get_symbol_color", 3444240500)

    public val setMemberVariableColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "set_member_variable_color", 2920490490)

    public val getMemberVariableColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CodeHighlighter", "get_member_variable_color", 3444240500)
  }
}
