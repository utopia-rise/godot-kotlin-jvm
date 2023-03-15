package godot.intellij.plugin.extension

import com.intellij.openapi.module.Module
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import org.jetbrains.kotlin.idea.base.util.isGradleModule
import org.jetbrains.kotlin.idea.core.util.toVirtualFile
import org.jetbrains.kotlin.idea.util.projectStructure.getModule
import org.jetbrains.kotlin.idea.util.projectStructure.module
import org.jetbrains.plugins.gradle.util.GradleUtil
import java.io.File

typealias GodotRoot = String

fun Module?.getGodotRoot(): GodotRoot? {
    return if (this != null && !isDisposed && this.isGradleModule) {
        @Suppress("UnstableApiUsage")
        GradleUtil.findGradleModuleData(this)?.data?.let { moduleData ->
            File(moduleData.linkedExternalProjectPath).toVirtualFile()?.findChild("project.godot")?.path
        }
    } else null
}

fun VirtualFile.isInGodotRoot(project: Project): Boolean = getModule(project).getGodotRoot() != null
fun VirtualFile.getGodotRoot(project: Project): GodotRoot? = getModule(project).getGodotRoot()
fun PsiFile.isInGodotRoot(): Boolean = module.getGodotRoot() != null
fun PsiFile.getGodotRoot(): GodotRoot? = module.getGodotRoot()
fun PsiElement.isInGodotRoot(): Boolean = module.getGodotRoot() != null
fun PsiElement.getGodotRoot(): GodotRoot? = module.getGodotRoot()
