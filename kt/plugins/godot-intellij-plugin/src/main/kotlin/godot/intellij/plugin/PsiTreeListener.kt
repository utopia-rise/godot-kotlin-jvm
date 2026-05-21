package godot.intellij.plugin

import com.intellij.ide.highlighter.JavaFileType
import com.intellij.lang.java.JavaLanguage
import com.intellij.openapi.Disposable
import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.application.ReadAction
import com.intellij.openapi.module.Module
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiClass
import com.intellij.psi.PsiFile
import com.intellij.psi.PsiManager
import com.intellij.psi.PsiTreeChangeAdapter
import com.intellij.psi.PsiTreeChangeEvent
import com.intellij.psi.search.FileTypeIndex
import com.intellij.psi.search.FilenameIndex
import com.intellij.psi.search.GlobalSearchScope
import com.intellij.util.concurrency.AppExecutorUtil
import godot.intellij.plugin.project.isInGodotRoot
import org.jetbrains.kotlin.idea.KotlinFileType
import org.jetbrains.kotlin.idea.KotlinLanguage
import org.jetbrains.kotlin.idea.base.util.module
import org.jetbrains.kotlin.psi.KtClass
import org.jetbrains.kotlin.psi.KtFile

class PsiTreeListener(
    private val registeredClassNameCacheProvider: (Module) -> RegisteredClassNameCache
) : Indexer {
    private fun setupListener(parentDisposable: Disposable, project: Project) {
        PsiManager
            .getInstance(project)
            .addPsiTreeChangeListener(
                object : PsiTreeChangeAdapter() {
                    override fun beforeChildRemoval(event: PsiTreeChangeEvent) {
                        val child = event.child
                        if (!child.isInGodotRoot()) return
                        when (child) {
                            // whole file removed
                            is KtFile if event.file == null -> psiFileRemoved(child)
                            // class in file removed (just annotation removed covered in [childrenChanged]
                            is KtClass -> psiFileChanged(child.containingFile)
                            is PsiClass -> psiFileChanged(child.containingFile)
                        }
                    }

                    override fun beforeChildrenChange(event: PsiTreeChangeEvent) {
                        val psiFile = event.file
                        if (psiFile == null || !psiFile.isInGodotRoot()) return
                        if (psiFile.isIndexedLanguageFile()) {
                            // remove class names (will be re registered in [childrenChanged])
                            // needed because [childrenChanged] gets triggered for each char typed. So for class name's a "new" class gets registered for each typed char
                            // no way to delete those obsolete class names again after [childrenChanged] as they simply don't exist anymore
                            psiFileRemoved(psiFile)
                        }
                    }

                    override fun childrenChanged(event: PsiTreeChangeEvent) {
                        val psiFile = event.file
                        if (psiFile == null || !psiFile.isInGodotRoot()) return
                        if (psiFile.isIndexedLanguageFile()) {
                            psiFileChanged(psiFile)
                        }
                    }
                },
                parentDisposable
            )
    }

    private fun psiFileRemoved(psiFile: PsiFile) {
        val module = psiFile.module ?: return
        registeredClassNameCacheProvider(module).psiFileRemoved(psiFile)
    }

    private fun psiFileChanged(psiFile: PsiFile) {
        val module = psiFile.module ?: return
        registeredClassNameCacheProvider(module).psiFileChanged(psiFile)
    }

    override fun initialIndex(parentDisposable: Disposable, project: Project) {
        setupListener(parentDisposable, project)

        ReadAction
            .nonBlocking<List<com.intellij.openapi.vfs.VirtualFile>> {
                val ktFiles = FileTypeIndex
                    .getFiles(KotlinFileType.INSTANCE, GlobalSearchScope.projectScope(project))
                    .toList()
                val javaFiles = FileTypeIndex
                    .getFiles(JavaFileType.INSTANCE, GlobalSearchScope.projectScope(project))
                    .toList()
                val scalaFiles = FilenameIndex
                    .getAllFilesByExt(project, "scala", GlobalSearchScope.projectScope(project))
                    .toList()

                buildList {
                    addAll(ktFiles)
                    addAll(javaFiles)
                    addAll(scalaFiles)
                }
            }
            .inSmartMode(project)
            .expireWith(parentDisposable)
            .submit(AppExecutorUtil.getAppExecutorService())
            .onSuccess { files ->
                files
                    .filter {
                        !project.isDisposed && it.isInGodotRoot(project)
                    }
                    .forEach { vFile ->
                        ApplicationManager.getApplication().runReadAction {
                            if (!project.isDisposed) {
                                PsiManager.getInstance(project).findFile(vFile)?.let { psiFile ->
                                    psiFileChanged(psiFile)
                                }
                            }
                        }
                    }
            }
    }

    private fun PsiFile.isIndexedLanguageFile(): Boolean {
        return language == KotlinLanguage.INSTANCE || language == JavaLanguage.INSTANCE || virtualFile.extension == "scala"
    }
}
