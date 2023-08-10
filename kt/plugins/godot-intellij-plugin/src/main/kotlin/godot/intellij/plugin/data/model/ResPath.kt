package godot.intellij.plugin.data.model

import com.intellij.openapi.module.Module
import com.intellij.psi.PsiClass
import godot.intellij.plugin.data.cache.classname.RegisteredClassNameCacheProvider
import godot.intellij.plugin.extension.getGodotRoot
import godot.intellij.plugin.gradle.GodotKotlinJvmSettings
import godot.tools.common.constants.FileExtensions
import org.jetbrains.kotlin.idea.base.util.module
import org.jetbrains.kotlin.util.suffixIfNot
import java.io.File

@JvmInline
value class ResPath(private val path: String) {

    fun scriptClassFqName(module: Module): String? {
        val godotRoot = module.getGodotRoot() ?: return  null
        val registrationFileBaseDir = GodotKotlinJvmSettings[module]
            .registrationFileBaseDir
            .suffixIfNot("/")

        val registeredName = path
            .removePrefix("res://$registrationFileBaseDir")
            .replace("/", ".")
            .removeSuffix(FileExtensions.GodotKotlinJvm.registrationFile)

        return RegisteredClassNameCacheProvider
            .provide(godotRoot)
            .getContainersByName(registeredName)
            .firstOrNull()
            ?.fqName
    }

    val godotPath: String
        get() = path

    val relativeFilePath: String
        get() = path.removePrefix("res://")

    fun asFile(module: Module): File? = module.getGodotRoot()?.let { godotRoot -> File(godotRoot).resolve(relativeFilePath) }

    companion object {
        fun fromPsiClass(psiClass: PsiClass): ResPath? {
            return fromFqName(psiClass.qualifiedName ?: return null, psiClass.module)
        }

        fun fromFqName(fqName: String, module: Module?): ResPath {
            val isFqNameRegistrationEnabled = GodotKotlinJvmSettings[module].isFqNameRegistrationEnabled
            val isRegistrationFileHierarchyEnabled = GodotKotlinJvmSettings[module].isRegistrationFileHierarchyEnabled
            val registrationFileBaseDir = GodotKotlinJvmSettings[module].registrationFileBaseDir

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

                ResPath(path = "res://${path}/${name}.${FileExtensions.GodotKotlinJvm.registrationFile}")
            } else {
                val simpleName = fqName.substringAfterLast(".")
                ResPath(path = "res://${registrationFileBaseDir}/${simpleName}.${FileExtensions.GodotKotlinJvm.registrationFile}")
            }
        }
    }
}
