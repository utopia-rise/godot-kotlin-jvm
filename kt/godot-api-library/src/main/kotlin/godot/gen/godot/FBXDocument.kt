// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_FBXDOCUMENT_INDEX: Int = 220

/**
 * The FBXDocument handles FBX documents. It provides methods to append data from buffers or files,
 * generate scenes, and register/unregister document extensions.
 * When exporting FBX from Blender, use the "FBX Units Scale" option. The "FBX Units Scale" option
 * sets the correct scale factor and avoids manual adjustments when re-importing into Blender, such as
 * through glTF export.
 */
@GodotBaseType
public open class FBXDocument : GLTFDocument() {
  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINE_CLASS_FBXDOCUMENT_INDEX, scriptIndex)
  }

  public companion object

  internal object MethodBindings
}
