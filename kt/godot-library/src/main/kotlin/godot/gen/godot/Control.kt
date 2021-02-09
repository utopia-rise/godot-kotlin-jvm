// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.Control
import godot.annotation.GodotBaseType
import godot.core.Color
import godot.core.NodePath
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.UninitializedPropertyAccessException
import kotlin.Unit

@GodotBaseType
open class Control : CanvasItem() {
  val focusEntered: Signal0 by signal()

  val focusExited: Signal0 by signal()

  val guiInput: Signal1<InputEvent> by signal("event")

  val minimumSizeChanged: Signal0 by signal()

  val modalClosed: Signal0 by signal()

  val mouseEntered: Signal0 by signal()

  val mouseExited: Signal0 by signal()

  val resized: Signal0 by signal()

  val sizeFlagsChanged: Signal0 by signal()

  open val anchorBottom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_ANCHOR_BOTTOM, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  open val anchorLeft: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_ANCHOR_LEFT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  open val anchorRight: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_ANCHOR_RIGHT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  open val anchorTop: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_ANCHOR_TOP, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  open var focusMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_FOCUS_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_FOCUS_MODE, NIL)
    }

  open var focusNeighbourBottom: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CONTROL_GET_FOCUS_NEIGHBOUR_BOTTOM, NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(value) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CONTROL_SET_FOCUS_NEIGHBOUR_BOTTOM, NIL)
    }

  open var focusNeighbourLeft: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_FOCUS_NEIGHBOUR_LEFT,
          NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(value) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_FOCUS_NEIGHBOUR_LEFT,
          NIL)
    }

  open var focusNeighbourRight: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_FOCUS_NEIGHBOUR_RIGHT,
          NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(value) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_FOCUS_NEIGHBOUR_RIGHT,
          NIL)
    }

  open var focusNeighbourTop: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_FOCUS_NEIGHBOUR_TOP,
          NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(value) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_FOCUS_NEIGHBOUR_TOP,
          NIL)
    }

  open var focusNext: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_FOCUS_NEXT, NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(value) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_FOCUS_NEXT, NIL)
    }

  open var focusPrevious: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_FOCUS_PREVIOUS,
          NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(value) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_FOCUS_PREVIOUS, NIL)
    }

  open var growHorizontal: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_GROW_HORIZONTAL, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_GROW_HORIZONTAL, NIL)
    }

  open var growVertical: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_GROW_VERTICAL, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_GROW_VERTICAL, NIL)
    }

  open var hintTooltip: String
    get() {
      throw
          UninitializedPropertyAccessException("Cannot access property hintTooltip: has no getter")
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_HINT_TOOLTIP, NIL)
    }

  open var marginBottom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_MARGIN_BOTTOM, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_MARGIN_BOTTOM, NIL)
    }

  open var marginLeft: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_MARGIN_LEFT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_MARGIN_LEFT, NIL)
    }

  open var marginRight: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_MARGIN_RIGHT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_MARGIN_RIGHT, NIL)
    }

  open var marginTop: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_MARGIN_TOP, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_MARGIN_TOP, NIL)
    }

  open var mouseDefaultCursorShape: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CONTROL_GET_MOUSE_DEFAULT_CURSOR_SHAPE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CONTROL_SET_MOUSE_DEFAULT_CURSOR_SHAPE, NIL)
    }

  open var mouseFilter: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_MOUSE_FILTER, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_MOUSE_FILTER, NIL)
    }

  open var rectClipContent: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_RECT_CLIP_CONTENT,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_RECT_CLIP_CONTENT,
          NIL)
    }

  open val rectGlobalPosition: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_RECT_GLOBAL_POSITION,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  open var rectMinSize: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_RECT_MIN_SIZE,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_RECT_MIN_SIZE, NIL)
    }

  open var rectPivotOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_RECT_PIVOT_OFFSET,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_RECT_PIVOT_OFFSET,
          NIL)
    }

  open val rectPosition: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_RECT_POSITION,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  open var rectRotation: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_RECT_ROTATION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_RECT_ROTATION, NIL)
    }

  open var rectScale: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_RECT_SCALE, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_RECT_SCALE, NIL)
    }

  open val rectSize: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_RECT_SIZE, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }

  open var sizeFlagsHorizontal: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_SIZE_FLAGS_HORIZONTAL,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_SIZE_FLAGS_HORIZONTAL,
          NIL)
    }

  open var sizeFlagsStretchRatio: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CONTROL_GET_SIZE_FLAGS_STRETCH_RATIO, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CONTROL_SET_SIZE_FLAGS_STRETCH_RATIO, NIL)
    }

  open var sizeFlagsVertical: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_SIZE_FLAGS_VERTICAL,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_SIZE_FLAGS_VERTICAL,
          NIL)
    }

  open var theme: Theme?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_THEME, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Theme?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_THEME, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_CONTROL)

  open fun rectMinSize(schedule: Vector2.() -> Unit): Vector2 = rectMinSize.apply{
      schedule(this)
      rectMinSize = this
  }


  open fun rectPivotOffset(schedule: Vector2.() -> Unit): Vector2 = rectPivotOffset.apply{
      schedule(this)
      rectPivotOffset = this
  }


  open fun rectScale(schedule: Vector2.() -> Unit): Vector2 = rectScale.apply{
      schedule(this)
      rectScale = this
  }


  open fun _clips_input(): Boolean {
    throw NotImplementedError("_clips_input is not implemented for Control")
  }

  open fun _get_minimum_size(): Vector2 {
    throw NotImplementedError("_get_minimum_size is not implemented for Control")
  }

  open fun _get_tooltip(): String {
    throw NotImplementedError("_get_tooltip is not implemented for Control")
  }

  open fun _gui_input(event: InputEvent) {
  }

  open fun _make_custom_tooltip(forText: String): Object? {
    throw NotImplementedError("_make_custom_tooltip is not implemented for Control")
  }

  open fun _override_changed() {
  }

  open fun _set_anchor(margin: Long, anchor: Double) {
  }

  open fun _set_global_position(position: Vector2) {
  }

  open fun _set_position(margin: Vector2) {
  }

  open fun _set_size(size: Vector2) {
  }

  open fun _size_changed() {
  }

  open fun _theme_changed() {
  }

  open fun _update_minimum_size() {
  }

  open fun acceptEvent() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_ACCEPT_EVENT, NIL)
  }

  open fun addColorOverride(name: String, color: Color) {
    TransferContext.writeArguments(STRING to name, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_ADD_COLOR_OVERRIDE, NIL)
  }

  open fun addConstantOverride(name: String, constant: Long) {
    TransferContext.writeArguments(STRING to name, LONG to constant)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_ADD_CONSTANT_OVERRIDE, NIL)
  }

  open fun addFontOverride(name: String, font: Font) {
    TransferContext.writeArguments(STRING to name, OBJECT to font)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_ADD_FONT_OVERRIDE, NIL)
  }

  open fun addIconOverride(name: String, texture: Texture) {
    TransferContext.writeArguments(STRING to name, OBJECT to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_ADD_ICON_OVERRIDE, NIL)
  }

  open fun addShaderOverride(name: String, shader: Shader) {
    TransferContext.writeArguments(STRING to name, OBJECT to shader)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_ADD_SHADER_OVERRIDE, NIL)
  }

  open fun addStyleboxOverride(name: String, stylebox: StyleBox) {
    TransferContext.writeArguments(STRING to name, OBJECT to stylebox)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_ADD_STYLEBOX_OVERRIDE, NIL)
  }

  open fun can_drop_data(position: Vector2, data: Any): Boolean {
    throw NotImplementedError("can_drop_data is not implemented for Control")
  }

  open fun drop_data(position: Vector2, data: Any) {
  }

  open fun forceDrag(data: Any, preview: Control) {
    TransferContext.writeArguments(ANY to data, OBJECT to preview)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_FORCE_DRAG, NIL)
  }

  open fun getBegin(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_BEGIN, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  open fun getColor(name: String, type: String = ""): Color {
    TransferContext.writeArguments(STRING to name, STRING to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_COLOR, COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  open fun getCombinedMinimumSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_COMBINED_MINIMUM_SIZE,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  open fun getConstant(name: String, type: String = ""): Long {
    TransferContext.writeArguments(STRING to name, STRING to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_CONSTANT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getCursorShape(position: Vector2 = Vector2(0.0, 0.0)): Control.CursorShape {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_CURSOR_SHAPE, LONG)
    return Control.CursorShape.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun get_drag_data(position: Vector2): Any? {
    throw NotImplementedError("get_drag_data is not implemented for Control")
  }

  open fun getEnd(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_END, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  open fun getFocusOwner(): Control? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_FOCUS_OWNER, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Control?
  }

  open fun getFont(name: String, type: String = ""): Font? {
    TransferContext.writeArguments(STRING to name, STRING to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_FONT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Font?
  }

  open fun getGlobalRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_GLOBAL_RECT, RECT2)
    return TransferContext.readReturnValue(RECT2, false) as Rect2
  }

  open fun getIcon(name: String, type: String = ""): Texture? {
    TransferContext.writeArguments(STRING to name, STRING to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_ICON, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture?
  }

  open fun getMinimumSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_MINIMUM_SIZE, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  open fun getParentAreaSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_PARENT_AREA_SIZE,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  open fun getParentControl(): Control? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_PARENT_CONTROL, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Control?
  }

  open fun getRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_RECT, RECT2)
    return TransferContext.readReturnValue(RECT2, false) as Rect2
  }

  open fun getRotation(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_ROTATION, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  open fun getStylebox(name: String, type: String = ""): StyleBox? {
    TransferContext.writeArguments(STRING to name, STRING to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_STYLEBOX, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as StyleBox?
  }

  open fun getTooltip(atPosition: Vector2 = Vector2(0.0, 0.0)): String {
    TransferContext.writeArguments(VECTOR2 to atPosition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GET_TOOLTIP, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun grabClickFocus() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GRAB_CLICK_FOCUS, NIL)
  }

  open fun grabFocus() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_GRAB_FOCUS, NIL)
  }

  open fun hasColor(name: String, type: String = ""): Boolean {
    TransferContext.writeArguments(STRING to name, STRING to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_HAS_COLOR, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun hasColorOverride(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_HAS_COLOR_OVERRIDE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun hasConstant(name: String, type: String = ""): Boolean {
    TransferContext.writeArguments(STRING to name, STRING to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_HAS_CONSTANT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun hasConstantOverride(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_HAS_CONSTANT_OVERRIDE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun hasFocus(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_HAS_FOCUS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun hasFont(name: String, type: String = ""): Boolean {
    TransferContext.writeArguments(STRING to name, STRING to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_HAS_FONT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun hasFontOverride(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_HAS_FONT_OVERRIDE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun hasIcon(name: String, type: String = ""): Boolean {
    TransferContext.writeArguments(STRING to name, STRING to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_HAS_ICON, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun hasIconOverride(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_HAS_ICON_OVERRIDE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun has_point(point: Vector2): Boolean {
    throw NotImplementedError("has_point is not implemented for Control")
  }

  open fun hasShaderOverride(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_HAS_SHADER_OVERRIDE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun hasStylebox(name: String, type: String = ""): Boolean {
    TransferContext.writeArguments(STRING to name, STRING to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_HAS_STYLEBOX, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun hasStyleboxOverride(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_HAS_STYLEBOX_OVERRIDE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun minimumSizeChanged() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_MINIMUM_SIZE_CHANGED, NIL)
  }

  open fun releaseFocus() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_RELEASE_FOCUS, NIL)
  }

  open fun setAnchor(
    margin: Long,
    anchor: Double,
    keepMargin: Boolean = false,
    pushOppositeAnchor: Boolean = true
  ) {
    TransferContext.writeArguments(LONG to margin, DOUBLE to anchor, BOOL to keepMargin, BOOL to
        pushOppositeAnchor)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_ANCHOR, NIL)
  }

  open fun setAnchorAndMargin(
    margin: Long,
    anchor: Double,
    offset: Double,
    pushOppositeAnchor: Boolean = false
  ) {
    TransferContext.writeArguments(LONG to margin, DOUBLE to anchor, DOUBLE to offset, BOOL to
        pushOppositeAnchor)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_ANCHOR_AND_MARGIN, NIL)
  }

  open fun setAnchorsAndMarginsPreset(
    preset: Long,
    resizeMode: Long = 0,
    margin: Long = 0
  ) {
    TransferContext.writeArguments(LONG to preset, LONG to resizeMode, LONG to margin)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CONTROL_SET_ANCHORS_AND_MARGINS_PRESET, NIL)
  }

  open fun setAnchorsPreset(preset: Long, keepMargins: Boolean = false) {
    TransferContext.writeArguments(LONG to preset, BOOL to keepMargins)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_ANCHORS_PRESET, NIL)
  }

  open fun setBegin(position: Vector2) {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_BEGIN, NIL)
  }

  open fun setDragForwarding(target: Control) {
    TransferContext.writeArguments(OBJECT to target)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_DRAG_FORWARDING, NIL)
  }

  open fun setDragPreview(control: Control) {
    TransferContext.writeArguments(OBJECT to control)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_DRAG_PREVIEW, NIL)
  }

  open fun setEnd(position: Vector2) {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_END, NIL)
  }

  open fun setGlobalPosition(position: Vector2, keepMargins: Boolean = false) {
    TransferContext.writeArguments(VECTOR2 to position, BOOL to keepMargins)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_GLOBAL_POSITION, NIL)
  }

  open fun setMarginsPreset(
    preset: Long,
    resizeMode: Long = 0,
    margin: Long = 0
  ) {
    TransferContext.writeArguments(LONG to preset, LONG to resizeMode, LONG to margin)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_MARGINS_PRESET, NIL)
  }

  open fun setPosition(position: Vector2, keepMargins: Boolean = false) {
    TransferContext.writeArguments(VECTOR2 to position, BOOL to keepMargins)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_POSITION, NIL)
  }

  open fun setRotation(radians: Double) {
    TransferContext.writeArguments(DOUBLE to radians)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_ROTATION, NIL)
  }

  open fun setSize(size: Vector2, keepMargins: Boolean = false) {
    TransferContext.writeArguments(VECTOR2 to size, BOOL to keepMargins)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SET_SIZE, NIL)
  }

  open fun showModal(exclusive: Boolean = false) {
    TransferContext.writeArguments(BOOL to exclusive)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_SHOW_MODAL, NIL)
  }

  open fun warpMouse(toPosition: Vector2) {
    TransferContext.writeArguments(VECTOR2 to toPosition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONTROL_WARP_MOUSE, NIL)
  }

  enum class Anchor(
    id: Long
  ) {
    ANCHOR_BEGIN(0),

    ANCHOR_END(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class FocusMode(
    id: Long
  ) {
    FOCUS_NONE(0),

    FOCUS_CLICK(1),

    FOCUS_ALL(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class LayoutPresetMode(
    id: Long
  ) {
    PRESET_MODE_MINSIZE(0),

    PRESET_MODE_KEEP_WIDTH(1),

    PRESET_MODE_KEEP_HEIGHT(2),

    PRESET_MODE_KEEP_SIZE(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class MouseFilter(
    id: Long
  ) {
    MOUSE_FILTER_STOP(0),

    MOUSE_FILTER_PASS(1),

    MOUSE_FILTER_IGNORE(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class CursorShape(
    id: Long
  ) {
    CURSOR_ARROW(0),

    CURSOR_IBEAM(1),

    CURSOR_POINTING_HAND(2),

    CURSOR_CROSS(3),

    CURSOR_WAIT(4),

    CURSOR_BUSY(5),

    CURSOR_DRAG(6),

    CURSOR_CAN_DROP(7),

    CURSOR_FORBIDDEN(8),

    CURSOR_VSIZE(9),

    CURSOR_HSIZE(10),

    CURSOR_BDIAGSIZE(11),

    CURSOR_FDIAGSIZE(12),

    CURSOR_MOVE(13),

    CURSOR_VSPLIT(14),

    CURSOR_HSPLIT(15),

    CURSOR_HELP(16);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class GrowDirection(
    id: Long
  ) {
    GROW_DIRECTION_BEGIN(0),

    GROW_DIRECTION_END(1),

    GROW_DIRECTION_BOTH(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class SizeFlags(
    id: Long
  ) {
    SIZE_FILL(1),

    SIZE_EXPAND(2),

    SIZE_EXPAND_FILL(3),

    SIZE_SHRINK_CENTER(4),

    SIZE_SHRINK_END(8);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class LayoutPreset(
    id: Long
  ) {
    PRESET_TOP_LEFT(0),

    PRESET_TOP_RIGHT(1),

    PRESET_BOTTOM_LEFT(2),

    PRESET_BOTTOM_RIGHT(3),

    PRESET_CENTER_LEFT(4),

    PRESET_CENTER_TOP(5),

    PRESET_CENTER_RIGHT(6),

    PRESET_CENTER_BOTTOM(7),

    PRESET_CENTER(8),

    PRESET_LEFT_WIDE(9),

    PRESET_TOP_WIDE(10),

    PRESET_RIGHT_WIDE(11),

    PRESET_BOTTOM_WIDE(12),

    PRESET_VCENTER_WIDE(13),

    PRESET_HCENTER_WIDE(14),

    PRESET_WIDE(15);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val ANCHOR_BEGIN: Long = 0

    final const val ANCHOR_END: Long = 1

    final const val CURSOR_ARROW: Long = 0

    final const val CURSOR_BDIAGSIZE: Long = 11

    final const val CURSOR_BUSY: Long = 5

    final const val CURSOR_CAN_DROP: Long = 7

    final const val CURSOR_CROSS: Long = 3

    final const val CURSOR_DRAG: Long = 6

    final const val CURSOR_FDIAGSIZE: Long = 12

    final const val CURSOR_FORBIDDEN: Long = 8

    final const val CURSOR_HELP: Long = 16

    final const val CURSOR_HSIZE: Long = 10

    final const val CURSOR_HSPLIT: Long = 15

    final const val CURSOR_IBEAM: Long = 1

    final const val CURSOR_MOVE: Long = 13

    final const val CURSOR_POINTING_HAND: Long = 2

    final const val CURSOR_VSIZE: Long = 9

    final const val CURSOR_VSPLIT: Long = 14

    final const val CURSOR_WAIT: Long = 4

    final const val FOCUS_ALL: Long = 2

    final const val FOCUS_CLICK: Long = 1

    final const val FOCUS_NONE: Long = 0

    final const val GROW_DIRECTION_BEGIN: Long = 0

    final const val GROW_DIRECTION_BOTH: Long = 2

    final const val GROW_DIRECTION_END: Long = 1

    final const val MOUSE_FILTER_IGNORE: Long = 2

    final const val MOUSE_FILTER_PASS: Long = 1

    final const val MOUSE_FILTER_STOP: Long = 0

    final const val NOTIFICATION_FOCUS_ENTER: Long = 43

    final const val NOTIFICATION_FOCUS_EXIT: Long = 44

    final const val NOTIFICATION_MODAL_CLOSE: Long = 46

    final const val NOTIFICATION_MOUSE_ENTER: Long = 41

    final const val NOTIFICATION_MOUSE_EXIT: Long = 42

    final const val NOTIFICATION_RESIZED: Long = 40

    final const val NOTIFICATION_SCROLL_BEGIN: Long = 47

    final const val NOTIFICATION_SCROLL_END: Long = 48

    final const val NOTIFICATION_THEME_CHANGED: Long = 45

    final const val PRESET_BOTTOM_LEFT: Long = 2

    final const val PRESET_BOTTOM_RIGHT: Long = 3

    final const val PRESET_BOTTOM_WIDE: Long = 12

    final const val PRESET_CENTER: Long = 8

    final const val PRESET_CENTER_BOTTOM: Long = 7

    final const val PRESET_CENTER_LEFT: Long = 4

    final const val PRESET_CENTER_RIGHT: Long = 6

    final const val PRESET_CENTER_TOP: Long = 5

    final const val PRESET_HCENTER_WIDE: Long = 14

    final const val PRESET_LEFT_WIDE: Long = 9

    final const val PRESET_MODE_KEEP_HEIGHT: Long = 2

    final const val PRESET_MODE_KEEP_SIZE: Long = 3

    final const val PRESET_MODE_KEEP_WIDTH: Long = 1

    final const val PRESET_MODE_MINSIZE: Long = 0

    final const val PRESET_RIGHT_WIDE: Long = 11

    final const val PRESET_TOP_LEFT: Long = 0

    final const val PRESET_TOP_RIGHT: Long = 1

    final const val PRESET_TOP_WIDE: Long = 10

    final const val PRESET_VCENTER_WIDE: Long = 13

    final const val PRESET_WIDE: Long = 15

    final const val SIZE_EXPAND: Long = 2

    final const val SIZE_EXPAND_FILL: Long = 3

    final const val SIZE_FILL: Long = 1

    final const val SIZE_SHRINK_CENTER: Long = 4

    final const val SIZE_SHRINK_END: Long = 8
  }
}
