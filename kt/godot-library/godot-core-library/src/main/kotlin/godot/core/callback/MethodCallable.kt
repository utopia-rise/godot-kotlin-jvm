@file:Suppress("PackageDirectoryMismatch")

package godot.core

import godot.api.Object
import godot.common.interop.ObjectID
import godot.core.Callable
import godot.core.Callable.Bridge
import godot.core.VariantCallable
import godot.core.StringName
import godot.core.VariantArray
import godot.internal.memory.MemoryManager
import kotlin.collections.addAll

class MethodCallable(
    private val target: Object,
    private val methodName: StringName,
) : Callable {
    protected val boundArgs = mutableListOf<Any?>()

    override fun getBoundArguments() = boundArgs
    override fun getBoundArgumentCount() = boundArgs.size
    override fun getMethod() = methodName
    override fun getObject() = target
    override fun getObjectId() = target.objectID
    override fun isCustom() = false
    override fun isNull() = false
    override fun isStandard() = true
    override fun isValid() = MemoryManager.isInstanceValid(target) && target.hasMethod(methodName)
    override fun rpc(vararg args: Any?) = toVariantCallable().rpc(args)
    override fun rpcId(peerId: Long, vararg args: Any?) = toVariantCallable().rpcId(peerId, args)
    override fun unbind(argCount: Int) = toVariantCallable().unbind(argCount)
    override fun unsafeBind(vararg args: Any?) = apply { boundArgs.addAll(args) }
    override fun unsafeCall(vararg args: Any?) = target.call(methodName, args.toList() + boundArgs)
    override fun unsafeCallDeferred(vararg args: Any?) {
        target.callDeferred(methodName, args.toList() + boundArgs)
    }


    fun toVariantCallable(): VariantCallable {
        return VariantCallable(target, methodName).also {
            if (boundArgs.isNotEmpty()) {
                it.unsafeBind(boundArgs)
            }
        }
    }

    companion object {
        @JvmStatic
        @JvmName("create")
        operator fun invoke(target: Object, methodName: StringName) = MethodCallable(target, methodName)
    }
}
