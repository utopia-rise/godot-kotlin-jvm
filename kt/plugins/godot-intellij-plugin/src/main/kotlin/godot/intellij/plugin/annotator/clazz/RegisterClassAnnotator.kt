package godot.intellij.plugin.annotator.clazz

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.psi.PsiElement
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.data.cache.classname.RegisteredClassNameCacheProvider
import godot.intellij.plugin.data.model.REGISTER_CLASS_ANNOTATION
import godot.intellij.plugin.data.model.REGISTER_FUNCTION_ANNOTATION
import godot.intellij.plugin.data.model.REGISTER_PROPERTY_ANNOTATION
import godot.intellij.plugin.data.model.REGISTER_SIGNAL_ANNOTATION
import godot.intellij.plugin.extension.anyFunctionHasAnnotation
import godot.intellij.plugin.extension.anyPropertyHasAnnotation
import godot.intellij.plugin.extension.getRegisteredClassName
import godot.intellij.plugin.extension.registerProblem
import godot.intellij.plugin.quickfix.ClassAlreadyRegisteredQuickFix
import godot.intellij.plugin.quickfix.ClassNotRegisteredQuickFix
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.idea.util.module
import org.jetbrains.kotlin.idea.util.sourceRoots
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.psi.KtClass
import org.jetbrains.kotlin.psi.KtPackageDirective
import org.jetbrains.kotlin.psi.allConstructors
import java.io.File

private const val MAX_CONSTRUCTOR_ARGS = 5

class RegisterClassAnnotator : Annotator {
    private val classNotRegisteredQuickFix by lazy { ClassNotRegisteredQuickFix() }

    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        when (element) {
            is KtClass -> {
                if (element.findAnnotation(FqName(REGISTER_CLASS_ANNOTATION)) == null) {
                    val errorLocation = element.nameIdentifier ?: element.navigationElement
                    if (element.anyPropertyHasAnnotation(REGISTER_PROPERTY_ANNOTATION)) {
                        holder.registerProblem(
                            GodotPluginBundle.message("problem.class.notRegistered.properties"),
                            errorLocation,
                            classNotRegisteredQuickFix
                        )
                    }
                    if (element.anyPropertyHasAnnotation(REGISTER_SIGNAL_ANNOTATION)) {
                        holder.registerProblem(
                            GodotPluginBundle.message("problem.class.notRegistered.signals"),
                            errorLocation,
                            classNotRegisteredQuickFix
                        )
                    }
                    if (element.anyFunctionHasAnnotation(REGISTER_FUNCTION_ANNOTATION)) {
                        holder.registerProblem(
                            GodotPluginBundle.message("problem.class.notRegistered.functions"),
                            errorLocation,
                            classNotRegisteredQuickFix
                        )
                    }
                } else {
                    checkConstructorParameterCount(element, holder)
                    checkRegisteredClassName(element, holder)
                    checkOneRegisteredClassPerFile(element, holder)
                    checkFileName(element, holder)
                }
            }
            is KtPackageDirective -> {
                val isAnyContainingClassRegistered = element
                    .containingKtFile
                    .classes
                    .any { ktClass ->
                        ktClass
                            .annotations
                            .mapNotNull { it.qualifiedName }
                            .any { annotationFqName -> annotationFqName == REGISTER_CLASS_ANNOTATION }
                    }

                if (isAnyContainingClassRegistered) {
                    checkPackagePath(element, holder)
                }
            }
        }
    }

    private fun checkConstructorParameterCount(ktClass: KtClass, holder: AnnotationHolder) {
        ktClass.allConstructors.forEach { ktConstructor ->
            if (ktConstructor.valueParameters.size > MAX_CONSTRUCTOR_ARGS) {
                holder.registerProblem(
                    GodotPluginBundle.message("problem.class.constructor.toManyParams"),
                    ktConstructor.valueParameterList?.psiOrParent ?: ktConstructor.nameIdentifier
                    ?: ktConstructor.navigationElement
                )
            }
        }
    }

    private fun checkRegisteredClassName(ktClass: KtClass, holder: AnnotationHolder) {
        val (fqName, registeredName) = ktClass.getRegisteredClassName() ?: return
        val fqNames = RegisteredClassNameCacheProvider.provide(ktClass.project)
            .getContainersByName(registeredName)
            .map { container -> container.fqName }

        if (fqNames.size > 1 || (fqNames.size == 1 && !fqNames.contains(fqName))) {
            val registerClassAnnotation = ktClass.findAnnotation(FqName(REGISTER_CLASS_ANNOTATION))
            val psiElement = if (registerClassAnnotation == null) {
                ktClass.nameIdentifier ?: ktClass.navigationElement
            } else {
                val valueArgumentList = registerClassAnnotation.valueArgumentList
                if (valueArgumentList != null) {
                    valueArgumentList.arguments.firstOrNull { argument ->
                        argument.getArgumentName()?.asName?.asString() == "className"
                    } ?: valueArgumentList.arguments.first()
                } else {
                    registerClassAnnotation
                }
            }
            holder.registerProblem(
                GodotPluginBundle.message("problem.class.nameAlreadyRegistered"),
                psiElement,
                ClassAlreadyRegisteredQuickFix(registeredName)
            )
        }
    }

    private fun checkOneRegisteredClassPerFile(ktClass: KtClass, holder: AnnotationHolder) {
        val containingFileContainsMoreRegisteredClasses = ktClass
            .containingKtFile
            .classes
            .filter { ktClass ->
                ktClass
                    .annotations
                    .firstOrNull { annotation -> annotation.qualifiedName == REGISTER_CLASS_ANNOTATION } != null
            }
            .size > 1

        if (containingFileContainsMoreRegisteredClasses) {
            holder.registerProblem(
                GodotPluginBundle.message("problem.class.moreThanOneRegisteredClass"),
                ktClass.identifyingElement ?: ktClass
            )
        }
    }

    private fun checkFileName(ktClass: KtClass, holder: AnnotationHolder) {
        if (ktClass.containingKtFile.virtualFile.name.removeSuffix(".kt") != ktClass.name) {
            holder.registerProblem(
                GodotPluginBundle.message("problem.class.wrongFileName"),
                ktClass.identifyingElement ?: ktClass
                // no quick fix needed -> already one present from the kotlin plugin
            )
        }
    }

    private fun checkPackagePath(ktPackageDirective: KtPackageDirective, holder: AnnotationHolder) {
        var containingFilePath = ktPackageDirective.containingKtFile.virtualFile.path
        val srcDirs = ktPackageDirective.module?.sourceRoots?.map { it.path } ?: return
        srcDirs.forEach { srcDir ->
            containingFilePath = containingFilePath.removePrefix(srcDir)
        }
        containingFilePath =
            containingFilePath.substringBeforeLast(File.separator).removePrefix(File.separator).removeSuffix(".kt")
        val packagePath = ktPackageDirective.fqName.asString().replace(".", File.separator)

        if (packagePath != containingFilePath) {
            holder.registerProblem(
                GodotPluginBundle.message("problem.class.wrongPackagePath"),
                ktPackageDirective
                // no quick fix needed -> already one present from the kotlin plugin
            )
        }
    }
}
