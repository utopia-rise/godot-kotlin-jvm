package godot.intellij.plugin.listener

import com.intellij.openapi.project.DumbService
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiDirectory
import com.intellij.psi.PsiFile
import com.intellij.psi.PsiManager
import com.intellij.psi.PsiTreeChangeEvent
import com.intellij.psi.impl.file.PsiJavaDirectoryImpl
import com.intellij.psi.search.FileTypeIndex
import com.intellij.psi.search.GlobalSearchScope
import com.intellij.util.indexing.FileBasedIndex
import godot.intellij.plugin.ProjectDisposable
import godot.intellij.plugin.data.cache.classname.RegisteredClassNameCacheProvider
import godot.intellij.plugin.extension.getGodotRoot
import godot.intellij.plugin.extension.isInGodotRoot
import godot.intellij.plugin.refactor.SceneAction
import godot.intellij.plugin.wrapper.PsiTreeChangeListenerKt
import org.jetbrains.kotlin.idea.KotlinFileType
import org.jetbrains.kotlin.idea.KotlinLanguage
import org.jetbrains.kotlin.idea.refactoring.fqName.getKotlinFqName
import org.jetbrains.kotlin.psi.KtClass
import org.jetbrains.kotlin.psi.KtFile

class KtPsiTreeListener(private val project: Project) : ProjectDisposable {

    init {
        DumbService.getInstance(project).runWhenSmart {
            setupListener()
            initialIndexing()
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
                        }
                    }

                    override fun beforeChildrenChange(event: PsiTreeChangeEvent) {
                        val psiFile = event.file
                        if (psiFile == null || !psiFile.isInGodotRoot()) return
                        if (psiFile.language == KotlinLanguage.INSTANCE) {
                            // remove class names (will be re registered in [childrenChanged])
                            // needed because [childrenChanged] gets triggered for each char typed. So for class name's a "new" class gets registered for each typed char
                            // no way to delete those obsolete class names again after [childrenChanged] as they simply don't exist anymore
                            psiFileRemoved(psiFile)
                        }
                    }

                    override fun childrenChanged(event: PsiTreeChangeEvent) {
                        val psiFile = event.file
                        if (psiFile == null || !psiFile.isInGodotRoot()) return
                        if (psiFile.language == KotlinLanguage.INSTANCE) {
                            psiFileChanged(psiFile)
                        }
                    }

                    override fun beforeChildMovement(event: PsiTreeChangeEvent) {
                        val containingFile: PsiFile = event.child.containingFile ?: return
                        if (!containingFile.isInGodotRoot()) return

                        if (containingFile.language == KotlinLanguage.INSTANCE && containingFile is KtFile) {
                            val isAnyClassRegisteredInFile = containingFile
                                .classes
                                .any { ktClass ->
                                    ktClass
                                        .annotations
                                        .any { ktAnnotation -> ktAnnotation.qualifiedName == "godot.annotation.RegisterClass" }
                                }
                            if (isAnyClassRegisteredInFile) {
                                SceneAction.scriptMoved(
                                    project = project,
                                    oldPath = (event.oldParent as? PsiDirectory)?.virtualFile?.path ?: return,
                                    newPath = (event.newParent as? PsiDirectory)?.virtualFile?.path ?: return,
                                    fqNames = (event.child.containingFile as? KtFile)
                                        ?.classes
                                        ?.mapNotNull { it.getKotlinFqName()?.asString() }
                                        ?: return
                                )
                            }
                        }
                    }
                },
                this
            )
    }

    private fun initialIndexing() {
        @Suppress("UnstableApiUsage")
        FileBasedIndex
            .getInstance()
            .getContainingFiles(
                FileTypeIndex.NAME,
                KotlinFileType.INSTANCE,
                GlobalSearchScope.projectScope(project)
            )
            .forEach { vFile ->
                if (!vFile.isInGodotRoot(project)) return
                PsiManager.getInstance(project).findFile(vFile)?.let { psiFile ->
                    psiFileChanged(psiFile)
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
