package godot.annotation.processor.visitor

import com.google.devtools.ksp.KspExperimental
import com.google.devtools.ksp.getAnnotationsByType
import com.google.devtools.ksp.symbol.KSClassDeclaration
import com.google.devtools.ksp.symbol.KSVisitorVoid
import godot.annotation.RegisteredClassMetadata
import godot.entrygenerator.model.RegisteredClassMetadataContainer

class MetadataAnnotationVisitor(
    private val registeredClassMetadataContainers: MutableList<RegisteredClassMetadataContainer>,
): KSVisitorVoid() {
    @OptIn(KspExperimental::class)
    override fun visitClassDeclaration(classDeclaration: KSClassDeclaration, data: Unit) {
        classDeclaration
            .getAnnotationsByType(RegisteredClassMetadata::class)
            .firstOrNull()
            ?.let { annotation ->
                registeredClassMetadataContainers.add(
                    RegisteredClassMetadataContainer(
                        registeredName = annotation.registeredName,
                        baseType = annotation.baseType,
                        fqName = annotation.fqName,
                        resPath = annotation.resPath,
                        superTypes = annotation.superTypes,
                        signals = annotation.signals,
                        properties = annotation.properties,
                        functions = annotation.functions,
                    )
                )
            }
    }
}
