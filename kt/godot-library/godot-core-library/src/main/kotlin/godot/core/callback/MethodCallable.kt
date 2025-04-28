@file:Suppress("PackageDirectoryMismatch")

package godot.core

import godot.api.Object
import godot.common.interop.ObjectID
import godot.core.Callable
import godot.core.VariantCallable
import godot.core.StringName
import godot.core.VariantArray

class MethodCallable() : Callable {
    override fun unsafeBind(vararg args: Any?): Callable {
        TODO("Not yet implemented")
    }

    override fun unsafeBindV(args: VariantArray<Any?>): Callable {
        TODO("Not yet implemented")
    }

    override fun unsafeCall(vararg args: Any?): Any? {
        TODO("Not yet implemented")
    }

    override fun unsafeCallDeferred(vararg args: Any?) {
        TODO("Not yet implemented")
    }

    override fun unsafeCallV(args: VariantArray<Any?>): Any? {
        TODO("Not yet implemented")
    }

    override fun getBoundArguments(): VariantArray<Any?> {
        TODO("Not yet implemented")
    }

    override fun getBoundArgumentCount(): Int {
        TODO("Not yet implemented")
    }

    override fun getMethod(): StringName {
        TODO("Not yet implemented")
    }

    override fun getObject(): Object? {
        TODO("Not yet implemented")
    }

    override fun getObjectId(): ObjectID {
        TODO("Not yet implemented")
    }

    override fun isCustom(): Boolean {
        TODO("Not yet implemented")
    }

    override fun isNull(): Boolean {
        TODO("Not yet implemented")
    }

    override fun isStandard(): Boolean {
        TODO("Not yet implemented")
    }

    override fun isValid(): Boolean {
        TODO("Not yet implemented")
    }

    override fun rpc(vararg args: Any?) {
        TODO("Not yet implemented")
    }

    override fun rpcId(peerId: Long, vararg args: Any?) {
        TODO("Not yet implemented")
    }

    override fun unbind(argCount: Int): VariantCallable {
        TODO("Not yet implemented")
    }


    companion object {
        @JvmStatic
        @JvmName("create")
        operator fun invoke(target: Object, methodName: StringName) = MethodCallable(target, methodName)
    }
}
