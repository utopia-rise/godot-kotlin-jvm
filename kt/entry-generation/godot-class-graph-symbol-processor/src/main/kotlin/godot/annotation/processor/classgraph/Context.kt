package godot.annotation.processor.classgraph

import godot.entrygenerator.model.Clazz
import godot.entrygenerator.model.Type
import io.github.classgraph.ScanResult

//TODO: remove when contextual arguments are availables
object Context {
    lateinit var scanResult: ScanResult
        private set

    val mappedClazzByFqName = mutableMapOf<String, Clazz>()
    val mappedTypeByKey = mutableMapOf<TypeCacheKey, Type>()
    val enumValueNamesByClass = mutableMapOf<String, List<String>>()
    val hierarchyMethodSignaturesByClass = mutableMapOf<String, Set<String>>()

    fun reset(scanResult: ScanResult) {
        this.scanResult = scanResult
        mappedClazzByFqName.clear()
        mappedTypeByKey.clear()
        enumValueNamesByClass.clear()
        hierarchyMethodSignaturesByClass.clear()
    }
}

data class TypeCacheKey(
    val fqName: String,
    val typeArgumentDescriptors: List<String>
)
