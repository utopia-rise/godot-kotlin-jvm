package godot.annotation.processor.classgraph

import godot.annotation.RegisteredClassMetadata
import godot.annotation.processor.classgraph.extensions.getParameterValue
import godot.entrygenerator.ext.provideRegistrationFilePathForInitialGeneration
import godot.entrygenerator.ext.shouldGenerateGdjFile
import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.model.RegisteredClassMetadataContainer
import io.github.classgraph.ScanResult

object RegisteredClassMetadataContainerDatabase {
    private lateinit var dependenciesContainers: Map<String, RegisteredClassMetadataContainer>
    private lateinit var currentProjectContainers: List<RegisteredClassMetadataContainer>

    fun populateDependencies(scanResult: ScanResult, settings: Settings) {
        dependenciesContainers = scanResult
            .getClassesWithAnyAnnotation(RegisteredClassMetadata::class.java)
            .map { classInfo ->
                val annotation = classInfo.getAnnotationInfo(RegisteredClassMetadata::class.java)
                val fqName = annotation.getParameterValue<String>("fqName")
                fqName to RegisteredClassMetadataContainer(
                    registeredName = annotation.getParameterValue("registeredName"),
                    baseType = annotation.getParameterValue("baseType"),
                    fqName = fqName,
                    compilationTimeRelativeRegistrationFilePath = annotation.getParameterValue("compilationTimeRelativeRegistrationFilePath"),
                    projectName = annotation.getParameterValue("projectName"),
                    superTypes = annotation.getParameterValue("superTypes"),
                    signals = annotation.getParameterValue("signals"),
                    properties = annotation.getParameterValue("properties"),
                    functions = annotation.getParameterValue("functions"),
                    isRegistrationFileHierarchyEnabled = settings.isRegistrationFileHierarchyEnabled
                )
            }
            .toMap()
    }

    fun populateCurrentProject(registeredClasses: List<RegisteredClass>, settings: Settings) {
        currentProjectContainers = registeredClasses
            .filter { it.shouldGenerateGdjFile }
            .map {
                RegisteredClassMetadataContainer(
                    it.registeredName,
                    it.godotBaseClass,
                    it.fqName,
                    it.provideRegistrationFilePathForInitialGeneration(
                        listOf(),
                        settings.isRegistrationFileHierarchyEnabled,
                        settings.projectName,
                        settings.projectName,
                        settings.registrationBaseDirPathRelativeToProjectDir
                    ),
                    settings.projectName,
                    it.supertypes.joinToString(",") { type -> type.fqName },
                    it.signals.joinToString(",") { signal -> signal.fqName },
                    it.properties.joinToString(",") { property -> property.fqName },
                    it.functions.joinToString(",") { function -> function.fqName },
                    settings.isRegistrationFileHierarchyEnabled
                )
            }
    }

    fun dependenciesContainsFqName(fqName: String): Boolean = dependenciesContainers.containsKey(fqName)

    val dependenciesSize: Int
        get() = dependenciesContainers.size

    fun list() = dependenciesContainers.values.union(currentProjectContainers).toList()
}
