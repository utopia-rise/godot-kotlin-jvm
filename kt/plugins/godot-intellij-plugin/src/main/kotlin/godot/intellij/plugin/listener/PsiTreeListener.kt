package godot.intellij.plugin.listener

import com.intellij.ide.highlighter.JavaFileType
import com.intellij.lang.java.JavaLanguage
import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.project.DumbService
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiClass
import com.intellij.psi.PsiDirectory
import com.intellij.psi.PsiFile
import com.intellij.psi.PsiManager
import com.intellij.psi.PsiPackage
import com.intellij.psi.PsiTreeChangeEvent
import com.intellij.psi.search.FileTypeIndex
import com.intellij.psi.search.GlobalSearchScope
import godot.intellij.plugin.ProjectDisposable
import godot.intellij.plugin.data.cache.classname.RegisteredClassNameCacheProvider
import godot.intellij.plugin.data.model.REGISTER_CLASS_ANNOTATION
import godot.intellij.plugin.data.model.ResPath
import godot.intellij.plugin.extension.getGodotRoot
import godot.intellij.plugin.extension.isInGodotRoot
import godot.intellij.plugin.refactor.SceneAction
import godot.intellij.plugin.wrapper.PsiTreeChangeListenerKt
import org.jetbrains.kotlin.idea.KotlinFileType
import org.jetbrains.kotlin.idea.KotlinLanguage
import org.jetbrains.kotlin.idea.base.util.module
import org.jetbrains.kotlin.idea.core.getPackage
import org.jetbrains.kotlin.j2k.getContainingClass
import org.jetbrains.kotlin.psi.KtClass
import org.jetbrains.kotlin.psi.KtFile

class PsiTreeListener(private val project: Project) : ProjectDisposable {

    init {
        DumbService.getInstance(project).runWhenSmart {
            setupListener()
            ApplicationManager.getApplication().executeOnPooledThread {
                // needs to run in background initially to avoid:
                // java.lang.Throwable: Slow operations are prohibited on EDT. See SlowOperations.assertSlowOperationsAreAllowed javadoc.
                initialIndexing()
            }
        }
    }

    private fun setupListener() {
        PsiManager
            .getInstance(project)
            .addPsiTreeChangeListener(
                object : PsiTreeChangeListenerKt {
                    override fun beforeChildRemoval(event: PsiTreeChangeEvent) {
                        val child = event.child
                        if (!child.isInGodotRoot()) return
                        when {
                            // whole file removed
                            child is KtFile && event.file == null -> psiFileRemoved(child)
                            // class in file removed (just annotation removed covered in [childrenChanged]
                            child is KtClass -> psiFileChanged(child.containingFile)
                            child is PsiClass -> psiFileChanged(child.containingFile)
                        }
                    }

                    override fun beforeChildrenChange(event: PsiTreeChangeEvent) {
                        val psiFile = event.file
                        if (psiFile == null || !psiFile.isInGodotRoot()) return
                        if (psiFile.language == KotlinLanguage.INSTANCE || psiFile.language == JavaLanguage.INSTANCE) {
                            // remove class names (will be re registered in [childrenChanged])
                            // needed because [childrenChanged] gets triggered for each char typed. So for class name's a "new" class gets registered for each typed char
                            // no way to delete those obsolete class names again after [childrenChanged] as they simply don't exist anymore
                            psiFileRemoved(psiFile)
                        }
                    }

                    override fun childrenChanged(event: PsiTreeChangeEvent) {
                        val psiFile = event.file
                        if (psiFile == null || !psiFile.isInGodotRoot()) return
                        if (psiFile.language == KotlinLanguage.INSTANCE || psiFile.language == JavaLanguage.INSTANCE) {
                            psiFileChanged(psiFile)
                        }
                    }

                    override fun beforeChildMovement(event: PsiTreeChangeEvent) {
                        val containingFile: PsiFile = event.child.containingFile ?: return
                        val oldParentPackage: PsiPackage = (event.oldParent as? PsiDirectory)?.getPackage() ?: return
                        val newParentPackage: PsiPackage = (event.newParent as? PsiDirectory)?.getPackage() ?: return

                        if (!containingFile.isInGodotRoot()) return

                        val containingClasses: List<PsiClass> = when(containingFile) {
                            is KtFile -> containingFile.classes.toList()
                            else -> containingFile.getContainingClass()?.let { clazz -> listOf(clazz) } ?: emptyList()
                        }

                        containingClasses
                            .filter { clazz -> clazz.annotations.any { annotation -> annotation.qualifiedName == REGISTER_CLASS_ANNOTATION } }
                            .forEach { registeredClass ->
                                val module = containingFile.module ?: return@forEach
                                val simpleName = registeredClass.qualifiedName?.substringAfterLast(".") ?: return@forEach
                                val oldFqName = "${oldParentPackage.qualifiedName}.${simpleName}"
                                val newFqName = "${newParentPackage.qualifiedName}.${simpleName}"

                                val oldResPath = ResPath.fromFqName(oldFqName, registeredClass.module)
                                val newResPath = ResPath.fromFqName(newFqName, registeredClass.module)

                                if (oldResPath != newResPath) {
                                    SceneAction.scriptMoved(
                                        module = module,
                                        oldResPath = oldResPath,
                                        newResPath = newResPath
                                    )
                                }
                            }
                    }
                },
                this
            )
    }

    private fun initialIndexing() {
        ApplicationManager.getApplication().runReadAction {
            val ktFiles = FileTypeIndex
                .getFiles(KotlinFileType.INSTANCE, GlobalSearchScope.allScope(project))
                .toList()
            val javaFiles = FileTypeIndex
                .getFiles(JavaFileType.INSTANCE, GlobalSearchScope.allScope(project))
                .toList()

            val files = listOf(
                *ktFiles.toTypedArray(),
                *javaFiles.toTypedArray()
            )

            ApplicationManager.getApplication().executeOnPooledThread {
                files
                    .filter { it.isInGodotRoot(project) }
                    .forEach { vFile ->
                        ApplicationManager.getApplication().runReadAction {
                            PsiManager.getInstance(project).findFile(vFile)?.let { psiFile ->
                                psiFileChanged(psiFile)
                            }
                        }
                    }
            }
        }
    }

    private fun psiFileRemoved(psiFile: PsiFile) {
        val godotRoot = psiFile.getGodotRoot() ?: return
        RegisteredClassNameCacheProvider.provide(godotRoot).psiFileRemoved(psiFile)
    }

    private fun psiFileChanged(psiFile: PsiFile) {
        val godotRoot = psiFile.getGodotRoot() ?: return
        RegisteredClassNameCacheProvider.provide(godotRoot).psiFileChanged(psiFile)
    }

    override fun dispose(project: Project) {
        RegisteredClassNameCacheProvider.disposeForProject(project)
    }
}
