package godot.entrygenerator.generator

import org.jetbrains.kotlin.descriptors.ClassDescriptor
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe
import java.io.File

object GdnsGenerator {

    fun generateGdnsFiles(
        outputPath: String,
        gdnLibFile: String,
        cleanGeneratedGdnsFiles: Boolean,
        classes: Set<ClassDescriptor>
    ) {
        val existingGdnsFiles = File(outputPath)
            .listFiles()
            ?.filter { it.extension == "gdns" }
            ?: emptyList()

        val classNames = classes.map { clazz -> clazz.name.asString() }

        if (cleanGeneratedGdnsFiles) {
            val obsoleteGdnsFiles = existingGdnsFiles
                .filter { !classNames.contains(it.name) }
            obsoleteGdnsFiles.forEach {
                it.delete()
            }
        }

        classes.forEach {
            val fqName = it.fqNameSafe.asString()

            File(getGdnsFilePath(outputPath, fqName).replaceAfterLast("/", "")).mkdirs()
            File(getGdnsFilePath(outputPath, fqName))
                .writeText(getGdnsFileContent(gdnLibFile, fqName))
        }
    }

    private fun getGdnsFileContent(gdnLibFile: String, classFqName: String): String {
        return """
            [gd_resource type="NativeScript" load_steps=2 format=2]

            [ext_resource path="res://$gdnLibFile" type="GDNativeLibrary" id=1]

            [resource]
            resource_name = "$classFqName"
            class_name = "$classFqName"
            library = ExtResource( 1 )
        """.trimIndent()
    }

    private fun getGdnsFilePath(outputPath: String, classFqName: String): String {
        return "$outputPath/${classFqName.replace(".", "/")}.gdns"
    }
}
