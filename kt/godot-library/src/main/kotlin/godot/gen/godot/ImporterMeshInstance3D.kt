// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 *
 */
@GodotBaseType
public open class ImporterMeshInstance3D : Node3D() {
  /**
   *
   */
  public var mesh: ImporterMesh?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMPORTERMESHINSTANCE3D_GET_MESH,
          OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as ImporterMesh?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMPORTERMESHINSTANCE3D_SET_MESH,
          NIL)
    }

  /**
   *
   */
  public var skin: Skin?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMPORTERMESHINSTANCE3D_GET_SKIN,
          OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Skin?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMPORTERMESHINSTANCE3D_SET_SKIN,
          NIL)
    }

  /**
   *
   */
  public var skeletonPath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_IMPORTERMESHINSTANCE3D_GET_SKELETON_PATH, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_IMPORTERMESHINSTANCE3D_SET_SKELETON_PATH, NIL)
    }

  /**
   *
   */
  public var layerMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_IMPORTERMESHINSTANCE3D_GET_LAYER_MASK, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_IMPORTERMESHINSTANCE3D_SET_LAYER_MASK, NIL)
    }

  /**
   *
   */
  public var castShadow: GeometryInstance3D.ShadowCastingSetting
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_IMPORTERMESHINSTANCE3D_GET_CAST_SHADOWS_SETTING, LONG)
      return GeometryInstance3D.ShadowCastingSetting.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_IMPORTERMESHINSTANCE3D_SET_CAST_SHADOWS_SETTING, NIL)
    }

  /**
   *
   */
  public var visibilityRangeBegin: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_IMPORTERMESHINSTANCE3D_GET_VISIBILITY_RANGE_BEGIN, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_IMPORTERMESHINSTANCE3D_SET_VISIBILITY_RANGE_BEGIN, NIL)
    }

  /**
   *
   */
  public var visibilityRangeBeginMargin: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_IMPORTERMESHINSTANCE3D_GET_VISIBILITY_RANGE_BEGIN_MARGIN, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_IMPORTERMESHINSTANCE3D_SET_VISIBILITY_RANGE_BEGIN_MARGIN, NIL)
    }

  /**
   *
   */
  public var visibilityRangeEnd: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_IMPORTERMESHINSTANCE3D_GET_VISIBILITY_RANGE_END, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_IMPORTERMESHINSTANCE3D_SET_VISIBILITY_RANGE_END, NIL)
    }

  /**
   *
   */
  public var visibilityRangeEndMargin: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_IMPORTERMESHINSTANCE3D_GET_VISIBILITY_RANGE_END_MARGIN, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_IMPORTERMESHINSTANCE3D_SET_VISIBILITY_RANGE_END_MARGIN, NIL)
    }

  /**
   *
   */
  public var visibilityRangeFadeMode: GeometryInstance3D.VisibilityRangeFadeMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_IMPORTERMESHINSTANCE3D_GET_VISIBILITY_RANGE_FADE_MODE, LONG)
      return GeometryInstance3D.VisibilityRangeFadeMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_IMPORTERMESHINSTANCE3D_SET_VISIBILITY_RANGE_FADE_MODE, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_IMPORTERMESHINSTANCE3D, scriptIndex)
    return true
  }

  public companion object
}
