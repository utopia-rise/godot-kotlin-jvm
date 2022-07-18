// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedByteArray
import godot.core.TransferContext
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.PACKED_BYTE_ARRAY
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

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
 *     var key = "supersecret".to_utf8()
 *
 *     var err = ctx.start(HashingContext.HASH_SHA256, key)
 *
 *     assert(err == OK)
 *
 *     var msg1 = "this is ".to_utf8()
 *
 *     var msg2 = "super duper secret".to_utf8()
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
 * using System;
 *
 * using System.Diagnostics;
 *
 *
 *
 * public class CryptoNode : Node
 *
 * {
 *
 *     private HMACContext ctx = new HMACContext();
 *
 *     public override void _Ready()
 *
 *     {
 *
 *         PackedByteArray key = String("supersecret").to_utf8();
 *
 *         Error err = ctx.Start(HashingContext.HASH_SHA256, key);
 *
 *         GD.Assert(err == OK);
 *
 *         PackedByteArray msg1 = String("this is ").to_utf8();
 *
 *         PackedByteArray msg2 = String("super duper secret").to_utf8();
 *
 *         err = ctx.Update(msg1);
 *
 *         GD.Assert(err == OK);
 *
 *         err = ctx.Update(msg2);
 *
 *         GD.Assert(err == OK);
 *
 *         PackedByteArray hmac = ctx.Finish();
 *
 *         GD.Print(hmac.HexEncode());
 *
 *     }
 *
 * }
 *
 *
 *
 * [/csharp]
 *
 * [/codeblocks]
 */
@GodotBaseType
public open class HMACContext : RefCounted() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_HMACCONTEXT)
  }

  /**
   * Initializes the HMACContext. This method cannot be called again on the same HMACContext until [finish] has been called.
   */
  public fun start(hashType: HashingContext.HashType, key: PackedByteArray): GodotError {
    TransferContext.writeArguments(LONG to hashType.id, PACKED_BYTE_ARRAY to key)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_HMACCONTEXT_START, LONG.ordinal)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Updates the message to be HMACed. This can be called multiple times before [finish] is called to append `data` to the message, but cannot be called until [start] has been called.
   */
  public fun update(`data`: PackedByteArray): GodotError {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to data)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_HMACCONTEXT_UPDATE, LONG.ordinal)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the resulting HMAC. If the HMAC failed, an empty [godot.PackedByteArray] is returned.
   */
  public fun finish(): PackedByteArray {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_HMACCONTEXT_FINISH,
        PACKED_BYTE_ARRAY.ordinal)
    return TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray
  }

  public companion object
}
