package godot.annotation.processor.classgraph

import godot.entrygenerator.model.Clazz
import godot.entrygenerator.model.Type
import io.github.classgraph.ScanResult

//TODO: remove when contextual arguments are availables
object Context {
    lateinit var scanResult: ScanResult
        private set

    val mappedClazzByFqName = mutableMapOf<String, Clazz>()
    val mappedTypeByKey = mutableMapOf<String, Type>()
    val enumValueNamesByClass = mutableMapOf<String, List<String>>()
    val superMethodSignaturesByClass = mutableMapOf<String, Set<String>>()

    fun reset(scanResult: ScanResult) {
        this.scanResult = scanResult
        mappedClazzByFqName.clear()
        mappedTypeByKey.clear()
        enumValueNamesByClass.clear()
        superMethodSignaturesByClass.clear()
    }
}
