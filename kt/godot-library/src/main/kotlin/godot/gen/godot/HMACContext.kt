// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedByteArray
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * Used to create an HMAC for a message using a key.
 *
 * The HMACContext class is useful for advanced HMAC use cases, such as streaming the message as it supports creating the message over time rather than providing it all at once.
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * extends Node
 *
 * var ctx = HMACContext.new()
 *
 *
 *
 * func _ready():
 *
 *     var key = "supersecret".to_utf8_buffer()
 *
 *     var err = ctx.start(HashingContext.HASH_SHA256, key)
 *
 *     assert(err == OK)
 *
 *     var msg1 = "this is ".to_utf8_buffer()
 *
 *     var msg2 = "super duper secret".to_utf8_buffer()
 *
 *     err = ctx.update(msg1)
 *
 *     assert(err == OK)
 *
 *     err = ctx.update(msg2)
 *
 *     assert(err == OK)
 *
 *     var hmac = ctx.finish()
 *
 *     print(hmac.hex_encode())
 *
 *
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * using Godot;
 *
 * using System.Diagnostics;
 *
 *
 *
 * public partial class MyNode : Node
 *
 * {
 *
 *     private HmacContext _ctx = new HmacContext();
 *
 *
 *
 *     public override void _Ready()
 *
 *     {
 *
 *         byte[] key = "supersecret".ToUtf8Buffer();
 *
 *         Error err = _ctx.Start(HashingContext.HashType.Sha256, key);
 *
 *         Debug.Assert(err == Error.Ok);
 *
 *         byte[] msg1 = "this is ".ToUtf8Buffer();
 *
 *         byte[] msg2 = "super duper secret".ToUtf8Buffer();
 *
 *         err = _ctx.Update(msg1);
 *
 *         Debug.Assert(err == Error.Ok);
 *
 *         err = _ctx.Update(msg2);
 *
 *         Debug.Assert(err == Error.Ok);
 *
 *         byte[] hmac = _ctx.Finish();
 *
 *         GD.Print(hmac.HexEncode());
 *
 *     }
 *
 * }
 *
 * [/csharp]
 *
 * [/codeblocks]
 */
@GodotBaseType
public open class HMACContext : RefCounted() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_HMACCONTEXT, scriptIndex)
    return true
  }

  /**
   * Initializes the HMACContext. This method cannot be called again on the same HMACContext until [finish] has been called.
   */
  public fun start(hashType: HashingContext.HashType, key: PackedByteArray): GodotError {
    TransferContext.writeArguments(LONG to hashType.id, PACKED_BYTE_ARRAY to key)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HMACCONTEXT_START, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Updates the message to be HMACed. This can be called multiple times before [finish] is called to append [data] to the message, but cannot be called until [start] has been called.
   */
  public fun update(`data`: PackedByteArray): GodotError {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HMACCONTEXT_UPDATE, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the resulting HMAC. If the HMAC failed, an empty [godot.PackedByteArray] is returned.
   */
  public fun finish(): PackedByteArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HMACCONTEXT_FINISH,
        PACKED_BYTE_ARRAY)
    return TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray
  }

  public companion object
}
