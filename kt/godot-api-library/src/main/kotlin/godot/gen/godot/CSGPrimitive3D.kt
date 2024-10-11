// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_CSGPRIMITIVE3D_INDEX: Int = 156

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
    Internals.callConstructor(this, ENGINE_CLASS_CSGPRIMITIVE3D_INDEX, scriptIndex)
  }

  public final fun setFlipFaces(flipFaces: Boolean): Unit {
    Internals.writeArguments(BOOL to flipFaces)
    Internals.callMethod(rawPtr, MethodBindings.setFlipFacesPtr, NIL)
  }

  public final fun getFlipFaces(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFlipFacesPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  public object MethodBindings {
    internal val setFlipFacesPtr: VoidPtr =
        Internals.getMethodBindPtr("CSGPrimitive3D", "set_flip_faces", 2586408642)

    internal val getFlipFacesPtr: VoidPtr =
        Internals.getMethodBindPtr("CSGPrimitive3D", "get_flip_faces", 2240911060)
  }
}
