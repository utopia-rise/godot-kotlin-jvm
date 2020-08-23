package godot.jvm.runtime

import godot.core.KtClass
import godot.core.KtObject
import godot.runtime.ClassRegistry

class JvmClassRegistry : ClassRegistry() {
    val classes = mutableListOf<KtClass<*>>()

    override fun <T : KtObject> registerClass(cls: KtClass<T>) {
        classes.add(cls)
    }
}