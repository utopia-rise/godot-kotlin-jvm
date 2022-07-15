// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Generate an [godot.PrimitiveMesh] from the text.
 *
 * Generate an [godot.PrimitiveMesh] from the text.
 *
 * TextMesh can be generated only when using dynamic fonts with vector glyph contours. Bitmap fonts (including bitmap data in the TrueType/OpenType containers, like color emoji fonts) are not supported.
 *
 * The UV layout is arranged in 4 horizontal strips, top to bottom: 40% of the height for the front face, 40% for the back face, 10% for the outer edges and 10% for the inner edges.
 */
@GodotBaseType
public open class TextMesh : PrimitiveMesh() {
  /**
   * Step (in pixels) used to approximate Bézier curves.
   */
  public open var curveStep: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTMESH_GET_CURVE_STEP, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTMESH_SET_CURVE_STEP, NIL)
    }

  /**
   * Depths of the mesh, if set to `0.0` only front surface, is generated, and UV layout is changed to use full texture for the front face only.
   */
  public open var depth: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTMESH_GET_DEPTH, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTMESH_SET_DEPTH, NIL)
    }

  /**
   * [godot.Font] used for the [godot.TextMesh]'s text.
   */
  public open var font: Font?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTMESH_GET_FONT, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Font?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTMESH_SET_FONT, NIL)
    }

  /**
   * Controls the text's horizontal alignment. Supports left, center and right. Set it to one of the [enum Align] constants.
   */
  public open var horizontalAlignment: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTMESH_GET_HORIZONTAL_ALIGNMENT,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTMESH_SET_HORIZONTAL_ALIGNMENT,
          NIL)
    }

  /**
   * The size of one pixel's width on the text to scale it in 3D.
   */
  public open var pixelSize: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTMESH_GET_PIXEL_SIZE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTMESH_SET_PIXEL_SIZE, NIL)
    }

  /**
   * The text to generate mesh from.
   */
  public open var text: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTMESH_GET_TEXT, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTMESH_SET_TEXT, NIL)
    }

  /**
   * If `true`, all the text displays as UPPERCASE.
   */
  public open var uppercase: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTMESH_GET_UPPERCASE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTMESH_SET_UPPERCASE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_TEXTMESH)
  }

  public open fun _fontChanged(): Unit {
  }

  public enum class Align(
    id: Long
  ) {
    /**
     * Align rows to the left (default).
     */
    ALIGN_LEFT(0),
    /**
     * Align rows centered.
     */
    ALIGN_CENTER(1),
    /**
     * Align rows to the right.
     */
    ALIGN_RIGHT(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * Align rows centered.
     */
    public final const val ALIGN_CENTER: Long = 1

    /**
     * Align rows to the left (default).
     */
    public final const val ALIGN_LEFT: Long = 0

    /**
     * Align rows to the right.
     */
    public final const val ALIGN_RIGHT: Long = 2
  }
}
