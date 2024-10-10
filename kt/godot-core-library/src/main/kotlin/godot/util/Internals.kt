package godot.util

import godot.core.KtObject
import godot.core.TypeManager
import godot.core.VariantConverter
import godot.core.memory.MemoryManager
import godot.core.memory.TransferContext

object Internals {

    fun callConstructor(obj: KtObject, classIndex: Int, scriptIndex: Int) = obj.callConstructor(classIndex, scriptIndex)

    fun getSingleton(obj: KtObject, classIndex: Int) = obj.getSingleton(classIndex)

    fun writeArguments(vararg values: Pair<VariantConverter, Any?>) {
        TransferContext.writeArguments(*values)
    }

    fun callMethod(ptr: VoidPtr, methodPtr: VoidPtr, expectedReturnType: VariantConverter) {
        TransferContext.callMethod(
            ptr,
            methodPtr,
            expectedReturnType
        )
    }

    fun readReturnValue(type: VariantConverter) = TransferContext.readReturnValue(type)

    fun getMethodBindPtr(className: String, methodName: String, hash: Long): VoidPtr {
        return TypeManager.getMethodBindPtr(className, methodName, hash)
    }

    fun isInstanceValid(ktObject: KtObject) = MemoryManager.isInstanceValid(ktObject)

    fun querySync(){
        MemoryManager.querySync()
    }

    fun registerCallback(callback: () -> Unit){
        MemoryManager.registerCallback(callback)
    }
}
