// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Suppress
import kotlin.Unit

/**
 * A wrapper class for web native JavaScript objects.
 *
 * JavaScriptObject is used to interact with JavaScript objects retrieved or created via [godot.JavaScriptBridge.getInterface], [godot.JavaScriptBridge.createObject], or [godot.JavaScriptBridge.createCallback].
 *
 * **Example:**
 *
 * ```
 * 		extends Node
 *
 * 		var _my_js_callback = JavaScriptBridge.create_callback(self, "myCallback") # This reference must be kept
 * 		var console = JavaScriptBridge.get_interface("console")
 *
 * 		func _init():
 * 		    var buf = JavaScriptBridge.create_object("ArrayBuffer", 10) # new ArrayBuffer(10)
 * 		    print(buf) # prints [godot.JavaScriptObject:OBJECT_ID]
 * 		    var uint8arr = JavaScriptBridge.create_object("Uint8Array", buf) # new Uint8Array(buf)
 * 		    uint8arr[1] = 255
 * 		    prints(uint8arr[1], uint8arr.byteLength) # prints 255 10
 * 		    console.log(uint8arr) # prints in browser console "Uint8Array(10) [ 0, 255, 0, 0, 0, 0, 0, 0, 0, 0 ]"
 *
 * 		    # Equivalent of JavaScriptBridge: Array.from(uint8arr).forEach(myCallback)
 * 		    JavaScriptBridge.get_interface("Array").from(uint8arr).forEach(_my_js_callback)
 *
 * 		func myCallback(args):
 * 		    # Will be called with the parameters passed to the "forEach" callback
 * 		    # [0, 0, [godot.JavaScriptObject:1173]]
 * 		    # [255, 1, [godot.JavaScriptObject:1173]]
 * 		    # ...
 * 		    # [0, 9, [godot.JavaScriptObject:1180]]
 * 		    print(args)
 * 		```
 *
 * **Note:** Only available in the Web platform.
 */
@GodotBaseType
public open class JavaScriptObject internal constructor() : RefCounted() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_JAVASCRIPTOBJECT)
  }

  public companion object
}
