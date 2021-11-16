// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PoolByteArray
import godot.core.TransferContext
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.POOL_BYTE_ARRAY
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Used to create an HMAC for a message using a key.
 *
 * The HMACContext class is useful for advanced HMAC use cases, such as streaming the message as it supports creating the message over time rather than providing it all at once.
 *
 * ```
 * 	extends Node
 * 	var ctx = HMACContext.new()
 *
 * 	func _ready():
 * 	    var key = "supersecret".to_utf8()
 * 	    var err = ctx.start(HashingContext.HASH_SHA256, key)
 * 	    assert(err == OK)
 * 	    var msg1 = "this is ".to_utf8()
 * 	    var msg2 = "vewy vewy secret".to_utf8()
 * 	    err = ctx.update(msg1)
 * 	    assert(err == OK)
 * 	    err = ctx.update(msg2)
 * 	    assert(err == OK)
 * 	    var hmac = ctx.finish()
 * 	    print(hmac.hex_encode())
 * 	```
 *
 * And in C# we can use the following.
 *
 * ```
 * 	using Godot;
 * 	using System;
 * 	using System.Diagnostics;
 *
 * 	public class CryptoNode : Node
 * 	{
 * 	    private HMACContext ctx = new HMACContext();
 * 	    public override void _Ready()
 * 	    {
 * 	        PoolByteArray key = String("supersecret").to_utf8();
 * 	        Error err = ctx.Start(HashingContext.HASH_SHA256, key);
 * 	        GD.Assert(err == OK);
 * 	        PoolByteArray msg1 = String("this is ").to_utf8();
 * 	        PoolByteArray msg2 = String("vewy vew secret").to_utf8();
 * 	        err = ctx.Update(msg1);
 * 	        GD.Assert(err == OK);
 * 	        err = ctx.Update(msg2);
 * 	        GD.Assert(err == OK);
 * 	        PoolByteArray hmac = ctx.Finish();
 * 	        GD.Print(hmac.HexEncode());
 * 	    }
 * 	}
 * 	```
 *
 * **Note:** Not available in HTML5 exports.
 */
@GodotBaseType
public open class HMACContext : Reference() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_HMACCONTEXT)
  }

  /**
   * Returns the resulting HMAC. If the HMAC failed, an empty [godot.core.PoolByteArray] is returned.
   */
  public open fun finish(): PoolByteArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HMACCONTEXT_FINISH, POOL_BYTE_ARRAY)
    return TransferContext.readReturnValue(POOL_BYTE_ARRAY, false) as PoolByteArray
  }

  /**
   * Initializes the HMACContext. This method cannot be called again on the same HMACContext until [finish] has been called.
   */
  public open fun start(hashType: Long, key: PoolByteArray): GodotError {
    TransferContext.writeArguments(LONG to hashType, POOL_BYTE_ARRAY to key)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HMACCONTEXT_START, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Updates the message to be HMACed. This can be called multiple times before [finish] is called to append `data` to the message, but cannot be called until [start] has been called.
   */
  public open fun update(`data`: PoolByteArray): GodotError {
    TransferContext.writeArguments(POOL_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_HMACCONTEXT_UPDATE, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }
}
