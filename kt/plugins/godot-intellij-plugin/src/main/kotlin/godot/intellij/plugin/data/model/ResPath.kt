package godot.intellij.plugin.data.model

import com.intellij.openapi.module.Module
import com.intellij.psi.PsiClass
import godot.intellij.plugin.extension.godotRoot
import godot.intellij.plugin.extension.registeredClassNameCache
import godot.intellij.plugin.gradle.GodotJvmSettings
import godot.tools.common.constants.FileExtensions
import org.jetbrains.kotlin.idea.base.util.module
import org.jetbrains.kotlin.util.suffixIfNot
import java.io.File

@JvmInline
value class ResPath(private val path: String) {

    fun scriptClassFqName(module: Module): String? {
        val registrationFileBaseDir = GodotJvmSettings[module]
            .registrationFileBaseDir
            .suffixIfNot("/")

        val registeredName = path
            .removePrefix("res://$registrationFileBaseDir")
            .replace("/", ".")
            .removeSuffix(FileExtensions.GodotJvm.registrationFile)

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
            val isFqNameRegistrationEnabled = GodotJvmSettings[module].isFqNameRegistrationEnabled
            val isRegistrationFileHierarchyEnabled = GodotJvmSettings[module].isRegistrationFileHierarchyEnabled
            val registrationFileBaseDir = GodotJvmSettings[module].registrationFileBaseDir

            return if (isFqNameRegistrationEnabled || isRegistrationFileHierarchyEnabled) {
                val path = if (isRegistrationFileHierarchyEnabled) {
                    "${registrationFileBaseDir}/${fqName.substringBeforeLast(".").replace(".", "/")}"
                } else {
                    registrationFileBaseDir
                }

                val name = if (isFqNameRegistrationEnabled) {
                    fqName
                } else {
                    fqName.substringAfterLast(".")
                }

                ResPath(path = "res://${path}/${name}.${FileExtensions.GodotJvm.registrationFile}")
            } else {
                val simpleName = fqName.substringAfterLast(".")
                ResPath(path = "res://${registrationFileBaseDir}/${simpleName}.${FileExtensions.GodotJvm.registrationFile}")
            }
        }
    }
}
