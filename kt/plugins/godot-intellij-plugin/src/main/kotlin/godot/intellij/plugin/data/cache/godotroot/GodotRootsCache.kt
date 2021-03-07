package godot.intellij.plugin.data.cache.godotroot

import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile

typealias GodotRoot = String

/**
 * Caches Godot roots
 *
 * A Godot root is a folder in which a `project.godot` file resides.
 *
 * Folders containing said file are considered godot project roots. All child files and folders (recursive) are
 * considered to belong to this project. Nested godot projects are not supported. If nesting is encountered, the
 * nearest match is returned when the godot root is obtained which is not necessarily the correct project.
 *
 * [com.intellij.openapi.module.Module] cannot be used to define which module is a godot project and which not as
 * intellij modules do not correspond to Java/Kotlin modules and tscn files and kotlin source file do not resolve to the
 * same module even if they reside "physically" in the same module. Hence this class exists to provide a way to resolve
 * to which godot project, if any, a element belongs.
 */
object GodotRootsCache {
    private val godotRootPaths = mutableMapOf<Project, MutableSet<GodotRoot>>()

    private fun getGodotRootPaths(project: Project): MutableSet<GodotRoot> {
        return godotRootPaths[project] ?: run {
            godotRootPaths[project] = mutableSetOf()
            godotRootPaths[project]!!
        }
    }

    fun addGodotRoot(project: Project, path: String) = getGodotRootPaths(project).add(path)
    fun removeGodotRoot(project: Project, path: String) = getGodotRootPaths(project).add(path)
    fun isPathInGodotRoot(project: Project, path: String) = getGodotRootPaths(project).any { path.startsWith(it) }

    /**
     * **Note:** Nested godot projects are not supported. If nesting is encountered, the
     * nearest match is returned when the godot root is obtained which is not necessarily the correct project. The
     * nearest match being the `project.godot` file which is the nearest to the [path] (in other words the longest path
     * length).
     *
     * @param path path for which to find the godot root
     * @return the first godot root matching the path
     */
    fun getGodotRootForPath(project: Project, path: String): GodotRoot? = getGodotRootPaths(project)
        .filter { path.startsWith(it) }
        .maxByOrNull { it.length }
}

fun VirtualFile.isInGodotRoot(project: Project): Boolean = GodotRootsCache.isPathInGodotRoot(project, path)
fun VirtualFile.getGodotRoot(project: Project): GodotRoot? = GodotRootsCache.getGodotRootForPath(project, path)
fun PsiFile.isInGodotRoot(): Boolean = virtualFile.isInGodotRoot(project)
fun PsiFile.getGodotRoot(): GodotRoot? = virtualFile.getGodotRoot(project)
fun PsiElement.isInGodotRoot(): Boolean = containingFile.isInGodotRoot()
fun PsiElement.getGodotRoot(): GodotRoot? = containingFile.getGodotRoot()
