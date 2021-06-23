package godot.entrygenerator.checks

import godot.entrygenerator.model.SourceFile
import godot.entrygenerator.utils.Logger
import java.io.File

class PackageSameAsFileNameCheck(
    private val projectDir: String,
    private val srcDirs: List<String>,
    logger: Logger,
    sourceFiles: List<SourceFile>
) : BaseCheck(logger, sourceFiles) {
    override fun execute() {
        sourceFiles.forEach { sourceFile ->
            sourceFile.registeredClasses.forEach { registeredClass ->
                val sourceDirOfClass = srcDirs
                    .filter { registeredClass.resPath.contains(it.removePrefix(projectDir)) }
                    .maxByOrNull { it.length }
                    ?: throw IllegalStateException("Cannot resolve sourceDir of class ${registeredClass.fqName} with projectDir: $projectDir and srcDirs: $srcDirs")

                val targetPackage = sourceFile
                    .absolutePath
                    .removePrefix(sourceDirOfClass)
                    .replace("/", ".")
                    .replace(File.separator, ".")
                    .removePrefix(".")
                    .substringBeforeLast(".") //removeFileExtensions
                    .replace(registeredClass.name, "")
                    .removeSuffix(".")

                if (targetPackage != registeredClass.containingPackage) {
                    logger.error("The package path of RegisteredClass ${registeredClass.fqName} does not match the file location ${sourceFile.absolutePath}")
                }
            }
        }
    }
}
