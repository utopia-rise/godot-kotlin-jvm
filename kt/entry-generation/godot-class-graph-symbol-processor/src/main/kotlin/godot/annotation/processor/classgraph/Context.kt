package godot.annotation.processor.classgraph

import godot.entrygenerator.model.Clazz
import godot.entrygenerator.model.Type
import io.github.classgraph.ClassInfo
import io.github.classgraph.ScanResult

//TODO: remove when contextual arguments are availables
object Context {
    lateinit var scanResult: ScanResult
        private set

    // The same class is reached repeatedly when different registered classes share supertypes or interfaces.
    val mappedClazzByFqName = mutableMapOf<String, Clazz>()
    // The same generic type shape is revisited from multiple fields, parameters, return types, and supertypes.
    val mappedTypeByKey = mutableMapOf<TypeCacheKey, Type>()
    // The same enum type can appear in many annotation arguments while mapping annotations across multiple classes.
    val enumValueNamesByClass = mutableMapOf<String, List<String>>()
    // The same class hierarchy is checked for inherited method signatures once per candidate method unless memoized.
    val hierarchyMethodSignaturesByClass = mutableMapOf<String, Set<String>>()
    // The same annotation meta-chain is reused whenever a property annotation implies export/visibility through other annotations.
    val annotationChainByAnnotationName = mutableMapOf<String, Set<io.github.classgraph.AnnotationInfo>>()

    fun reset(scanResult: ScanResult) {
        this.scanResult = scanResult
        mappedClazzByFqName.clear()
        mappedTypeByKey.clear()
        enumValueNamesByClass.clear()
        hierarchyMethodSignaturesByClass.clear()
        annotationChainByAnnotationName.clear()
    }

    fun getClassInfoOrNull(fqName: String): ClassInfo? = scanResult.getClassInfo(fqName)
}

data class TypeCacheKey(
    val fqName: String,
    val typeArgumentDescriptors: List<String>
)
