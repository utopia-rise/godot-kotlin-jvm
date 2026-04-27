package godot.intellij.plugin.data.model

import com.intellij.openapi.module.Module
import com.intellij.psi.PsiClass
import godot.intellij.plugin.extension.godotRoot
import godot.intellij.plugin.extension.registeredClassNameCache
import godot.intellij.plugin.gradle.GodotKotlinJvmSettings
import godot.tools.common.constants.FileExtensions
import org.jetbrains.kotlin.idea.base.util.module
import org.jetbrains.kotlin.util.suffixIfNot
import java.io.File

@JvmInline
value class ResPath(private val path: String) {

    fun scriptClassFqName(module: Module): String? {
        val registrationFileBaseDir = GodotKotlinJvmSettings[module]
            .registrationFileBaseDir
            .suffixIfNot("/")

        val registeredName = path
            .removePrefix("res://$registrationFileBaseDir")
            .replace("/", ".")
            .removeSuffix(FileExtensions.GodotKotlinJvm.registrationFile)

        return module
            .registeredClassNameCache
            .getContainersByName(registeredName)
            .firstOrNull()
            ?.fqName
    }

    val godotPath: String
        get() = path

    val relativeFilePath: String
        get() = path.removePrefix("res://")

    fun asFile(module: Module): File? = module.godotRoot?.godotRootDir?.resolve(relativeFilePath)

    companion object {
        fun fromPsiClass(psiClass: PsiClass): ResPath? {
            return scriptClassFqName(psiClass.qualifiedName ?: return null, psiClass.module)
        }

        fun scriptClassFqName(fqName: String, module: Module?): ResPath {
            val registeredNameMode = GodotKotlinJvmSettings[module].registeredNameMode
            val registrationFileLayoutMode = GodotKotlinJvmSettings[module].registrationFileLayoutMode
            val registrationFileBaseDir = GodotKotlinJvmSettings[module].registrationFileBaseDir
            val isHierarchicalLayout = registrationFileLayoutMode == "HIERARCHICAL"
            val registeredName = if (registeredNameMode == "FQ_NAME") {
                fqName
            } else {
                fqName.substringAfterLast(".")
            }

            val directory = if (isHierarchicalLayout && fqName.contains(".")) {
                "${registrationFileBaseDir}/${fqName.substringBeforeLast(".").replace(".", "/")}"
            } else {
                registrationFileBaseDir
            }

            return ResPath(path = "res://${directory}/${registeredName}.${FileExtensions.GodotKotlinJvm.registrationFile}")
        }
    }
}
