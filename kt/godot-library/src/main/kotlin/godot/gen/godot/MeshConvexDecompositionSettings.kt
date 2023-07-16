// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class MeshConvexDecompositionSettings : RefCounted() {
  public var maxConcavity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_GET_MAX_CONCAVITY, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_SET_MAX_CONCAVITY, NIL)
    }

  public var symmetryPlanesClippingBias: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_GET_SYMMETRY_PLANES_CLIPPING_BIAS,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_SET_SYMMETRY_PLANES_CLIPPING_BIAS,
          NIL)
    }

  public var revolutionAxesClippingBias: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_GET_REVOLUTION_AXES_CLIPPING_BIAS,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_SET_REVOLUTION_AXES_CLIPPING_BIAS,
          NIL)
    }

  public var minVolumePerConvexHull: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_GET_MIN_VOLUME_PER_CONVEX_HULL,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_SET_MIN_VOLUME_PER_CONVEX_HULL,
          NIL)
    }

  public var resolution: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_GET_RESOLUTION, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_SET_RESOLUTION, NIL)
    }

  public var maxNumVerticesPerConvexHull: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_GET_MAX_NUM_VERTICES_PER_CONVEX_HULL,
          LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_SET_MAX_NUM_VERTICES_PER_CONVEX_HULL,
          NIL)
    }

  public var planeDownsampling: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_GET_PLANE_DOWNSAMPLING, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_SET_PLANE_DOWNSAMPLING, NIL)
    }

  public var convexHullDownsampling: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_GET_CONVEX_HULL_DOWNSAMPLING,
          LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_SET_CONVEX_HULL_DOWNSAMPLING,
          NIL)
    }

  public var normalizeMesh: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_GET_NORMALIZE_MESH, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_SET_NORMALIZE_MESH, NIL)
    }

  public var mode: Mode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_GET_MODE, LONG)
      return MeshConvexDecompositionSettings.Mode.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_SET_MODE, NIL)
    }

  public var convexHullApproximation: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_GET_CONVEX_HULL_APPROXIMATION,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_SET_CONVEX_HULL_APPROXIMATION,
          NIL)
    }

  public var maxConvexHulls: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_GET_MAX_CONVEX_HULLS, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_SET_MAX_CONVEX_HULLS, NIL)
    }

  public var projectHullVertices: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_GET_PROJECT_HULL_VERTICES, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS_SET_PROJECT_HULL_VERTICES, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_MESHCONVEXDECOMPOSITIONSETTINGS, scriptIndex)
    return true
  }

  public enum class Mode(
    id: Long,
  ) {
    CONVEX_DECOMPOSITION_MODE_VOXEL(0),
    CONVEX_DECOMPOSITION_MODE_TETRAHEDRON(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
