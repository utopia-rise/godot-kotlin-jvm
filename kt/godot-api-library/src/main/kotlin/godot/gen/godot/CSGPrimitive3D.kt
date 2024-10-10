// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Parent class for various CSG primitives. It contains code and functionality that is common
 * between them. It cannot be used directly. Instead use one of the various classes that inherit from
 * it.
 * **Note:** CSG nodes are intended to be used for level prototyping. Creating CSG nodes has a
 * significant CPU cost compared to creating a [MeshInstance3D] with a [PrimitiveMesh]. Moving a CSG
 * node within another CSG node also has a significant CPU cost, so it should be avoided during
 * gameplay.
 */
@GodotBaseType
public open class CSGPrimitive3D internal constructor() : CSGShape3D() {
  /**
   * If set, the order of the vertices in each triangle are reversed resulting in the backside of
   * the mesh being drawn.
   */
  public final inline var flipFaces: Boolean
    @JvmName("flipFacesProperty")
    get() = getFlipFaces()
    @JvmName("flipFacesProperty")
    set(`value`) {
      setFlipFaces(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_CSGPRIMITIVE3D, scriptIndex)
  }

  public final fun setFlipFaces(flipFaces: Boolean): Unit {
    TransferContext.writeArguments(BOOL to flipFaces)
    TransferContext.callMethod(rawPtr, MethodBindings.setFlipFacesPtr, NIL)
  }

  public final fun getFlipFaces(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFlipFacesPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setFlipFacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPrimitive3D", "set_flip_faces", 2586408642)

    public val getFlipFacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CSGPrimitive3D", "get_flip_faces", 2240911060)
  }
}
