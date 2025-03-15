// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.core

import kotlin.Long
import kotlin.Suppress

public enum class PropertyHint(
  id: Long,
) {
  /**
   * The property has no hint for the editor.
   */
  PROPERTY_HINT_NONE(0),
  /**
   * Hints that an [int] or [float] property should be within a range specified via the hint string
   * `"min,max"` or `"min,max,step"`. The hint string can optionally include `"or_greater"` and/or
   * `"or_less"` to allow manual input going respectively above the max or below the min values.
   * **Example:** `"-360,360,1,or_greater,or_less"`.
   * Additionally, other keywords can be included: `"exp"` for exponential range editing,
   * `"radians_as_degrees"` for editing radian angles in degrees (the range values are also in
   * degrees), `"degrees"` to hint at an angle and `"hide_slider"` to hide the slider.
   */
  PROPERTY_HINT_RANGE(1),
  /**
   * Hints that an [int] or [String] property is an enumerated value to pick in a list specified via
   * a hint string.
   * The hint string is a comma separated list of names such as `"Hello,Something,Else"`.
   * Whitespaces are **not** removed from either end of a name. For integer properties, the first name
   * in the list has value 0, the next 1, and so on. Explicit values can also be specified by appending
   * `:integer` to the name, e.g. `"Zero,One,Three:3,Four,Six:6"`.
   */
  PROPERTY_HINT_ENUM(2),
  /**
   * Hints that a [String] property can be an enumerated value to pick in a list specified via a
   * hint string such as `"Hello,Something,Else"`.
   * Unlike [PROPERTY_HINT_ENUM], a property with this hint still accepts arbitrary values and can
   * be empty. The list of values serves to suggest possible values.
   */
  PROPERTY_HINT_ENUM_SUGGESTION(3),
  /**
   * Hints that a [float] property should be edited via an exponential easing function. The hint
   * string can include `"attenuation"` to flip the curve horizontally and/or `"positive_only"` to
   * exclude in/out easing and limit values to be greater than or equal to zero.
   */
  PROPERTY_HINT_EXP_EASING(4),
  /**
   * Hints that a vector property should allow its components to be linked. For example, this allows
   * [Vector2.x] and [Vector2.y] to be edited together.
   */
  PROPERTY_HINT_LINK(5),
  /**
   * Hints that an [int] property is a bitmask with named bit flags.
   * The hint string is a comma separated list of names such as `"Bit0,Bit1,Bit2,Bit3"`. Whitespaces
   * are **not** removed from either end of a name. The first name in the list has value 1, the next 2,
   * then 4, 8, 16 and so on. Explicit values can also be specified by appending `:integer` to the
   * name, e.g. `"A:4,B:8,C:16"`. You can also combine several flags (`"A:4,B:8,AB:12,C:16"`).
   * **Note:** A flag value must be at least `1` and at most `2 ** 32 - 1`.
   * **Note:** Unlike [PROPERTY_HINT_ENUM], the previous explicit value is not taken into account.
   * For the hint `"A:16,B,C"`, A is 16, B is 2, C is 4.
   */
  PROPERTY_HINT_FLAGS(6),
  /**
   * Hints that an [int] property is a bitmask using the optionally named 2D render layers.
   */
  PROPERTY_HINT_LAYERS_2D_RENDER(7),
  /**
   * Hints that an [int] property is a bitmask using the optionally named 2D physics layers.
   */
  PROPERTY_HINT_LAYERS_2D_PHYSICS(8),
  /**
   * Hints that an [int] property is a bitmask using the optionally named 2D navigation layers.
   */
  PROPERTY_HINT_LAYERS_2D_NAVIGATION(9),
  /**
   * Hints that an [int] property is a bitmask using the optionally named 3D render layers.
   */
  PROPERTY_HINT_LAYERS_3D_RENDER(10),
  /**
   * Hints that an [int] property is a bitmask using the optionally named 3D physics layers.
   */
  PROPERTY_HINT_LAYERS_3D_PHYSICS(11),
  /**
   * Hints that an [int] property is a bitmask using the optionally named 3D navigation layers.
   */
  PROPERTY_HINT_LAYERS_3D_NAVIGATION(12),
  /**
   * Hints that an integer property is a bitmask using the optionally named avoidance layers.
   */
  PROPERTY_HINT_LAYERS_AVOIDANCE(37),
  /**
   * Hints that a [String] property is a path to a file. Editing it will show a file dialog for
   * picking the path. The hint string can be a set of filters with wildcards like `"*.png,*.jpg"`.
   */
  PROPERTY_HINT_FILE(13),
  /**
   * Hints that a [String] property is a path to a directory. Editing it will show a file dialog for
   * picking the path.
   */
  PROPERTY_HINT_DIR(14),
  /**
   * Hints that a [String] property is an absolute path to a file outside the project folder.
   * Editing it will show a file dialog for picking the path. The hint string can be a set of filters
   * with wildcards, like `"*.png,*.jpg"`.
   */
  PROPERTY_HINT_GLOBAL_FILE(15),
  /**
   * Hints that a [String] property is an absolute path to a directory outside the project folder.
   * Editing it will show a file dialog for picking the path.
   */
  PROPERTY_HINT_GLOBAL_DIR(16),
  /**
   * Hints that a property is an instance of a [Resource]-derived type, optionally specified via the
   * hint string (e.g. `"Texture2D"`). Editing it will show a popup menu of valid resource types to
   * instantiate.
   */
  PROPERTY_HINT_RESOURCE_TYPE(17),
  /**
   * Hints that a [String] property is text with line breaks. Editing it will show a text input
   * field where line breaks can be typed.
   */
  PROPERTY_HINT_MULTILINE_TEXT(18),
  /**
   * Hints that a [String] property is an [Expression].
   */
  PROPERTY_HINT_EXPRESSION(19),
  /**
   * Hints that a [String] property should show a placeholder text on its input field, if empty. The
   * hint string is the placeholder text to use.
   */
  PROPERTY_HINT_PLACEHOLDER_TEXT(20),
  /**
   * Hints that a [Color] property should be edited without affecting its transparency ([Color.a] is
   * not editable).
   */
  PROPERTY_HINT_COLOR_NO_ALPHA(21),
  /**
   * Hints that the property's value is an object encoded as object ID, with its type specified in
   * the hint string. Used by the debugger.
   */
  PROPERTY_HINT_OBJECT_ID(22),
  /**
   * If a property is [String], hints that the property represents a particular type (class). This
   * allows to select a type from the create dialog. The property will store the selected type as a
   * string.
   * If a property is [Array], hints the editor how to show elements. The `hint_string` must encode
   * nested types using `":"` and `"/"`.
   *
   * gdscript:
   * ```gdscript
   * # Array of elem_type.
   * hint_string = "&#37;d:" &#37; [elem_type]
   * hint_string = "&#37;d/&#37;d:&#37;s" &#37; [elem_type, elem_hint, elem_hint_string]
   * # Two-dimensional array of elem_type (array of arrays of elem_type).
   * hint_string = "&#37;d:&#37;d:" &#37; [TYPE_ARRAY, elem_type]
   * hint_string = "&#37;d:&#37;d/&#37;d:&#37;s" &#37; [TYPE_ARRAY, elem_type, elem_hint,
   * elem_hint_string]
   * # Three-dimensional array of elem_type (array of arrays of arrays of elem_type).
   * hint_string = "&#37;d:&#37;d:&#37;d:" &#37; [TYPE_ARRAY, TYPE_ARRAY, elem_type]
   * hint_string = "&#37;d:&#37;d:&#37;d/&#37;d:&#37;s" &#37; [TYPE_ARRAY, TYPE_ARRAY, elem_type,
   * elem_hint, elem_hint_string]
   * ```
   * csharp:
   * ```csharp
   * // Array of elemType.
   * hintString = $"{elemType:D}:";
   * hintString = $"{elemType:}/{elemHint:D}:{elemHintString}";
   * // Two-dimensional array of elemType (array of arrays of elemType).
   * hintString = $"{Variant.Type.Array:D}:{elemType:D}:";
   * hintString = $"{Variant.Type.Array:D}:{elemType:D}/{elemHint:D}:{elemHintString}";
   * // Three-dimensional array of elemType (array of arrays of arrays of elemType).
   * hintString = $"{Variant.Type.Array:D}:{Variant.Type.Array:D}:{elemType:D}:";
   * hintString =
   * $"{Variant.Type.Array:D}:{Variant.Type.Array:D}:{elemType:D}/{elemHint:D}:{elemHintString}";
   * ```
   *
   * **Examples:**
   *
   * gdscript:
   * ```gdscript
   * hint_string = "&#37;d:" &#37; [TYPE_INT] # Array of integers.
   * hint_string = "&#37;d/&#37;d:1,10,1" &#37; [TYPE_INT, PROPERTY_HINT_RANGE] # Array of integers
   * (in range from 1 to 10).
   * hint_string = "&#37;d/&#37;d:Zero,One,Two" &#37; [TYPE_INT, PROPERTY_HINT_ENUM] # Array of
   * integers (an enum).
   * hint_string = "&#37;d/&#37;d:Zero,One,Three:3,Six:6" &#37; [TYPE_INT, PROPERTY_HINT_ENUM] #
   * Array of integers (an enum).
   * hint_string = "&#37;d/&#37;d:*.png" &#37; [TYPE_STRING, PROPERTY_HINT_FILE] # Array of strings
   * (file paths).
   * hint_string = "&#37;d/&#37;d:Texture2D" &#37; [TYPE_OBJECT, PROPERTY_HINT_RESOURCE_TYPE] #
   * Array of textures.
   *
   * hint_string = "&#37;d:&#37;d:" &#37; [TYPE_ARRAY, TYPE_FLOAT] # Two-dimensional array of
   * floats.
   * hint_string = "&#37;d:&#37;d/&#37;d:" &#37; [TYPE_ARRAY, TYPE_STRING,
   * PROPERTY_HINT_MULTILINE_TEXT] # Two-dimensional array of multiline strings.
   * hint_string = "&#37;d:&#37;d/&#37;d:-1,1,0.1" &#37; [TYPE_ARRAY, TYPE_FLOAT,
   * PROPERTY_HINT_RANGE] # Two-dimensional array of floats (in range from -1 to 1).
   * hint_string = "&#37;d:&#37;d/&#37;d:Texture2D" &#37; [TYPE_ARRAY, TYPE_OBJECT,
   * PROPERTY_HINT_RESOURCE_TYPE] # Two-dimensional array of textures.
   * ```
   * csharp:
   * ```csharp
   * hintString = $"{Variant.Type.Int:D}/{PropertyHint.Range:D}:1,10,1"; // Array of integers (in
   * range from 1 to 10).
   * hintString = $"{Variant.Type.Int:D}/{PropertyHint.Enum:D}:Zero,One,Two"; // Array of integers
   * (an enum).
   * hintString = $"{Variant.Type.Int:D}/{PropertyHint.Enum:D}:Zero,One,Three:3,Six:6"; // Array of
   * integers (an enum).
   * hintString = $"{Variant.Type.String:D}/{PropertyHint.File:D}:*.png"; // Array of strings (file
   * paths).
   * hintString = $"{Variant.Type.Object:D}/{PropertyHint.ResourceType:D}:Texture2D"; // Array of
   * textures.
   *
   * hintString = $"{Variant.Type.Array:D}:{Variant.Type.Float:D}:"; // Two-dimensional array of
   * floats.
   * hintString = $"{Variant.Type.Array:D}:{Variant.Type.String:D}/{PropertyHint.MultilineText:D}:";
   * // Two-dimensional array of multiline strings.
   * hintString = $"{Variant.Type.Array:D}:{Variant.Type.Float:D}/{PropertyHint.Range:D}:-1,1,0.1";
   * // Two-dimensional array of floats (in range from -1 to 1).
   * hintString =
   * $"{Variant.Type.Array:D}:{Variant.Type.Object:D}/{PropertyHint.ResourceType:D}:Texture2D"; //
   * Two-dimensional array of textures.
   * ```
   *
   * **Note:** The trailing colon is required for properly detecting built-in types.
   */
  PROPERTY_HINT_TYPE_STRING(23),
  PROPERTY_HINT_NODE_PATH_TO_EDITED_NODE(24),
  /**
   * Hints that an object is too big to be sent via the debugger.
   */
  PROPERTY_HINT_OBJECT_TOO_BIG(25),
  /**
   * Hints that the hint string specifies valid node types for property of type [NodePath].
   */
  PROPERTY_HINT_NODE_PATH_VALID_TYPES(26),
  /**
   * Hints that a [String] property is a path to a file. Editing it will show a file dialog for
   * picking the path for the file to be saved at. The dialog has access to the project's directory.
   * The hint string can be a set of filters with wildcards like `"*.png,*.jpg"`. See also
   * [FileDialog.filters].
   */
  PROPERTY_HINT_SAVE_FILE(27),
  /**
   * Hints that a [String] property is a path to a file. Editing it will show a file dialog for
   * picking the path for the file to be saved at. The dialog has access to the entire filesystem. The
   * hint string can be a set of filters with wildcards like `"*.png,*.jpg"`. See also
   * [FileDialog.filters].
   */
  PROPERTY_HINT_GLOBAL_SAVE_FILE(28),
  PROPERTY_HINT_INT_IS_OBJECTID(29),
  /**
   * Hints that an [int] property is a pointer. Used by GDExtension.
   */
  PROPERTY_HINT_INT_IS_POINTER(30),
  /**
   * Hints that a property is an [Array] with the stored type specified in the hint string.
   */
  PROPERTY_HINT_ARRAY_TYPE(31),
  /**
   * Hints that a property is a [Dictionary] with the stored types specified in the hint string.
   */
  PROPERTY_HINT_DICTIONARY_TYPE(38),
  /**
   * Hints that a string property is a locale code. Editing it will show a locale dialog for picking
   * language and country.
   */
  PROPERTY_HINT_LOCALE_ID(32),
  /**
   * Hints that a dictionary property is string translation map. Dictionary keys are locale codes
   * and, values are translated strings.
   */
  PROPERTY_HINT_LOCALIZABLE_STRING(33),
  /**
   * Hints that a property is an instance of a [Node]-derived type, optionally specified via the
   * hint string (e.g. `"Node2D"`). Editing it will show a dialog for picking a node from the scene.
   */
  PROPERTY_HINT_NODE_TYPE(34),
  /**
   * Hints that a quaternion property should disable the temporary euler editor.
   */
  PROPERTY_HINT_HIDE_QUATERNION_EDIT(35),
  /**
   * Hints that a string property is a password, and every character is replaced with the secret
   * character.
   */
  PROPERTY_HINT_PASSWORD(36),
  /**
   * Hints that a [Callable] property should be displayed as a clickable button. When the button is
   * pressed, the callable is called. The hint string specifies the button text and optionally an icon
   * from the `"EditorIcons"` theme type.
   * [codeblock lang=text]
   * "Click me!" - A button with the text "Click me!" and the default "Callable" icon.
   * "Click me!,ColorRect" - A button with the text "Click me!" and the "ColorRect" icon.
   * [/codeblock]
   * **Note:** A [Callable] cannot be properly serialized and stored in a file, so it is recommended
   * to use [PROPERTY_USAGE_EDITOR] instead of [PROPERTY_USAGE_DEFAULT].
   */
  PROPERTY_HINT_TOOL_BUTTON(39),
  /**
   * Hints that a property will be changed on its own after setting, such as
   * [AudioStreamPlayer.playing] or [GPUParticles3D.emitting].
   */
  PROPERTY_HINT_ONESHOT(40),
  /**
   * Represents the size of the [PropertyHint] enum.
   */
  PROPERTY_HINT_MAX(42),
  ;

  public val id: Long
  init {
    this.id = id
  }

  public companion object {
    public fun from(`value`: Long): PropertyHint = entries.single { it.id == `value` }
  }
}
