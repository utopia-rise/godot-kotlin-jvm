package godot.intellij.plugin.extension

import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import godot.intellij.plugin.data.model.GodotRoot
import org.jetbrains.kotlin.idea.util.projectStructure.getModule
import org.jetbrains.kotlin.idea.util.projectStructure.module

fun VirtualFile.isInGodotRoot(project: Project): Boolean = getModule(project)?.godotRoot != null
fun VirtualFile.getGodotRoot(project: Project): GodotRoot? = getModule(project)?.godotRoot
fun PsiFile.isInGodotRoot(): Boolean = module?.godotRoot != null
fun PsiFile.getGodotRoot(): GodotRoot? = module?.godotRoot
fun PsiElement.isInGodotRoot(): Boolean = module?.godotRoot != null
fun PsiElement.getGodotRoot(): GodotRoot? = module?.godotRoot
