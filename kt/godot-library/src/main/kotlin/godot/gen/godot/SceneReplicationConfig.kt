// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class SceneReplicationConfig : Resource() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SCENEREPLICATIONCONFIG, scriptIndex)
    return true
  }

  public fun getProperties(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SCENEREPLICATIONCONFIG_GET_PROPERTIES, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  public fun addProperty(path: NodePath, index: Long = -1): Unit {
    TransferContext.writeArguments(NODE_PATH to path, LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCENEREPLICATIONCONFIG_ADD_PROPERTY,
        NIL)
  }

  public fun removeProperty(path: NodePath): Unit {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SCENEREPLICATIONCONFIG_REMOVE_PROPERTY, NIL)
  }

  public fun propertyGetIndex(path: NodePath): Long {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SCENEREPLICATIONCONFIG_PROPERTY_GET_INDEX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public fun propertyGetSpawn(path: NodePath): Boolean {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SCENEREPLICATIONCONFIG_PROPERTY_GET_SPAWN, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public fun propertySetSpawn(path: NodePath, enabled: Boolean): Unit {
    TransferContext.writeArguments(NODE_PATH to path, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SCENEREPLICATIONCONFIG_PROPERTY_SET_SPAWN, NIL)
  }

  public fun propertyGetSync(path: NodePath): Boolean {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SCENEREPLICATIONCONFIG_PROPERTY_GET_SYNC, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public fun propertySetSync(path: NodePath, enabled: Boolean): Unit {
    TransferContext.writeArguments(NODE_PATH to path, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SCENEREPLICATIONCONFIG_PROPERTY_SET_SYNC, NIL)
  }

  public companion object
}
