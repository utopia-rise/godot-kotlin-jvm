// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedVector2Array
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * Container for parsed source geometry data used in navigation mesh baking.
 *
 * Container for parsed source geometry data used in navigation mesh baking.
 */
@GodotBaseType
public open class NavigationMeshSourceGeometryData2D : Resource() {
  public var traversableOutlines: VariantArray<PackedVector2Array>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESHSOURCEGEOMETRYDATA2D_GET_TRAVERSABLE_OUTLINES,
          ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<PackedVector2Array>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESHSOURCEGEOMETRYDATA2D_SET_TRAVERSABLE_OUTLINES, NIL)
    }

  public var obstructionOutlines: VariantArray<PackedVector2Array>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESHSOURCEGEOMETRYDATA2D_GET_OBSTRUCTION_OUTLINES,
          ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<PackedVector2Array>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESHSOURCEGEOMETRYDATA2D_SET_OBSTRUCTION_OUTLINES, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_NAVIGATIONMESHSOURCEGEOMETRYDATA2D, scriptIndex)
    return true
  }

  /**
   * Clears the internal data.
   */
  public fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESHSOURCEGEOMETRYDATA2D_CLEAR, NIL)
  }

  /**
   * Returns `true` when parsed source geometry data exists.
   */
  public fun hasData(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESHSOURCEGEOMETRYDATA2D_HAS_DATA, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Adds the outline points of a shape as traversable area.
   */
  public fun addTraversableOutline(shapeOutline: PackedVector2Array): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to shapeOutline)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESHSOURCEGEOMETRYDATA2D_ADD_TRAVERSABLE_OUTLINE, NIL)
  }

  /**
   * Adds the outline points of a shape as obstructed area.
   */
  public fun addObstructionOutline(shapeOutline: PackedVector2Array): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to shapeOutline)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESHSOURCEGEOMETRYDATA2D_ADD_OBSTRUCTION_OUTLINE, NIL)
  }

  public companion object
}
