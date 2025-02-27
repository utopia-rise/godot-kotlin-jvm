package godot.annotation.processor.visitor

import com.google.devtools.ksp.KspExperimental
import com.google.devtools.ksp.getAnnotationsByType
import com.google.devtools.ksp.symbol.KSClassDeclaration
import com.google.devtools.ksp.symbol.KSVisitorVoid
import godot.annotation.RegisteredClassMetadata
import godot.annotation.processor.ext.hasCompilationErrors
import godot.entrygenerator.model.RegisteredClassMetadataContainer

/**
 * Collects [RegisteredClassMetadata] annotations for registration file generation by the main compilation of the project
 */
internal class MetadataAnnotationVisitor: KSVisitorVoid() {
    private val _registeredClassMetadataContainers: MutableList<RegisteredClassMetadataContainer> = mutableListOf()
    val registeredClassMetadataContainers: List<RegisteredClassMetadataContainer> = _registeredClassMetadataContainers

    @OptIn(KspExperimental::class)
    override fun visitClassDeclaration(classDeclaration: KSClassDeclaration, data: Unit) {
        if (!classDeclaration.hasCompilationErrors()) {
            classDeclaration
                .getAnnotationsByType(RegisteredClassMetadata::class)
                .firstOrNull()
                ?.let { annotation ->
                    _registeredClassMetadataContainers.add(
                        RegisteredClassMetadataContainer(
                            registeredName = annotation.registeredName,
                            baseType = annotation.baseType,
                            fqName = annotation.fqName,
                            compilationTimeRelativeRegistrationFilePath = annotation.compilationTimeRelativeRegistrationFilePath,
                            projectName = annotation.projectName,
                            superTypes = annotation.superTypes,
                            signals = annotation.signals,
                            properties = annotation.properties,
                            functions = annotation.functions,
                            isRegistrationFileHierarchyEnabled = annotation.isRegistrationFileHierarchyEnabled
                        )
                    )
                }
        }
    }
}
