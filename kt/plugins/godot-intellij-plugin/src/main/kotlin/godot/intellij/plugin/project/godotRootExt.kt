package godot.intellij.plugin.project

import com.intellij.openapi.project.Project
import com.intellij.openapi.util.Key
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.openapi.module.ModuleUtilCore
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import java.io.File

private const val godotProjectFileName = "project.godot"
private val godotRootCacheKey = Key<GodotRootCacheEntry>("godot.intellij.plugin.godotRootCache")


@JvmInline
value class GodotRoot(val godotRootDir: File)

private data class GodotRootCacheEntry(
    val filePath: String,
    val root: GodotRoot?
)

fun VirtualFile.isInGodotRoot(project: Project): Boolean = getGodotRoot(project) != null

fun VirtualFile.getGodotRoot(project: Project): GodotRoot? {
    return getCachedGodotRoot(path) {
        ModuleUtilCore.findModuleForFile(this, project)?.godotRoot ?: findGodotRootFromPath(path)
    }
}

fun PsiFile.isInGodotRoot(): Boolean = getGodotRoot() != null

fun PsiFile.getGodotRoot(): GodotRoot? {
    val file = virtualFile ?: return null
    return file.getCachedGodotRoot(file.path) {
        ModuleUtilCore.findModuleForFile(file, project)?.godotRoot ?: findGodotRootFromPath(file.path)
    }
}

fun PsiElement.isInGodotRoot(): Boolean = getGodotRoot() != null

fun PsiElement.getGodotRoot(): GodotRoot? {
    val file = containingFile?.virtualFile ?: return null
    return file.getCachedGodotRoot(file.path) {
        ModuleUtilCore.findModuleForPsiElement(this)?.godotRoot ?: findGodotRootFromPath(file.path)
    }
}

private inline fun VirtualFile.getCachedGodotRoot(
    currentPath: String,
    provider: () -> GodotRoot?
): GodotRoot? {
    val cachedEntry = getUserData(godotRootCacheKey)
    if (cachedEntry?.filePath == currentPath) {
        return cachedEntry.root
    }

    return provider().also { root ->
        putUserData(godotRootCacheKey, GodotRootCacheEntry(currentPath, root))
    }
}

private fun findGodotRootFromPath(path: String): GodotRoot? {
    var current: File? = File(path).takeIf { it.exists() }?.let { file ->
        if (file.isDirectory) file else file.parentFile
    }

    while (current != null) {
        if (File(current, godotProjectFileName).exists()) {
            return GodotRoot(current)
        }
        current = current.parentFile
    }

    return null
}
