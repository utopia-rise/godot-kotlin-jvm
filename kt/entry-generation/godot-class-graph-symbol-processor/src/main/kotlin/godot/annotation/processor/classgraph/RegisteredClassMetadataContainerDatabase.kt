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

    fun populateDependencies(scanResult: ScanResult) {
        dependenciesContainers = scanResult
            .getClassesWithAnyAnnotation(RegisteredClassMetadata::class.java)
            .map { classInfo ->
                val annotation = classInfo.getAnnotationInfo(RegisteredClassMetadata::class.java)
                val fqdn = annotation.getParameterValue<String>("fqName")
                fqdn to RegisteredClassMetadataContainer(
                    registeredName = annotation.getParameterValue("registeredName"),
                    baseType = annotation.getParameterValue("baseType"),
                    fqName = fqdn,
                    relativeSourcePath = "TODO", //TODO: delete this when no more source path in engine
                    compilationTimeRelativeRegistrationFilePath = annotation.getParameterValue("compilationTimeRelativeRegistrationFilePath"),
                    projectName = annotation.getParameterValue("projectName"),
                    superTypes = annotation.getParameterValue("superTypes"),
                    signals = annotation.getParameterValue("signals"),
                    properties = annotation.getParameterValue("properties"),
                    functions = annotation.getParameterValue("functions")
                )
            }
            .filter { it.second.projectName != "godot-kotlin-tests" } //TODO: remove this line when classgraph generation is ready
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
                    it.relativeSourcePath,
                    it.provideRegistrationFilePathForInitialGeneration(
                        settings.isRegistrationFileHierarchyEnabled,
                        settings.projectName,
                        settings.projectName,
                        settings.registrationBaseDirPathRelativeToProjectDir
                    ),
                    settings.projectName,
                    it.supertypes.joinToString(",") { type -> type.fqName },
                    it.signals.joinToString(",") { signal -> signal.fqName },
                    it.properties.joinToString(",") { property -> property.fqName },
                    it.functions.joinToString(",") { function -> function.fqName }
                )
            }
    }

    fun dependenciesContainsFqdn(fqdn: String): Boolean = dependenciesContainers.containsKey(fqdn)

    val dependenciesSize: Int
        get() = dependenciesContainers.size

    fun list() = dependenciesContainers.values.union(currentProjectContainers).toList()
}
